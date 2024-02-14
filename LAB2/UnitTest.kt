import org.junit.Test
import kotlin.test.assertEquals

class AllTests {

    // Questions/Next-Questions MVC Tests
    @Test
    fun testQuestionsMVC() {
        testQuestionModel()
        testQuestionController()
    }

    private fun testQuestionModel() {
        val questionModel = QuestionModel()
        questionModel.addQuestion(Question(1, "What is 2+2?", listOf("3", "4", "5")))
        assertEquals(1, questionModel.getQuestions().size)
        assertEquals("What is 2+2?", questionModel.getQuestions()[0].text)
    }

    private fun testQuestionController() {
        val questionModel = QuestionModel()
        val questionController = QuestionController(questionModel)
        questionController.addQuestion(1, "What is 2+2?", listOf("3", "4", "5"))
        assertEquals(1, questionModel.getQuestions().size)
        assertEquals("What is 2+2?", questionController.getQuestions()[0].text)
    }

    // Score/Score-Increments MVC Tests
    @Test
    fun testScoreMVC() {
        testScoreModel()
        testScoreController()
    }

    private fun testScoreModel() {
        val scoreModel = ScoreModel()
        scoreModel.incrementScore()
        assertEquals(1, scoreModel.getScore())
    }

    private fun testScoreController() {
        val scoreModel = ScoreModel()
        val scoreController = ScoreController(scoreModel)
        scoreController.incrementScore()
        assertEquals(1, scoreController.getScore())
    }

    // User-Identity/Set-Get-User-ID MVC Tests
    @Test
    fun testUserMVC() {
        testUserModel()
        testUserController()
    }

    private fun testUserModel() {
        val userModel = UserModel()
        userModel.setUserId("user123")
        assertEquals("user123", userModel.getUserId())
    }

    private fun testUserController() {
        val userModel = UserModel()
        val userController = UserController(userModel)
        userController.setUserId("user456")
        assertEquals("user456", userController.getUserId())
    }
}
