data class Question(val id: Int, val text: String, val options: List<String>)

class QuestionModel {
    private val questions = mutableListOf<Question>()

    fun addQuestion(question: Question) {
        questions.add(question)
    }

    fun getQuestions(): List<Question> {
        return questions
    }
}

#### Controller (QuestionController.kt):
```kotlin
class QuestionController(private val questionModel: QuestionModel) {
    fun addQuestion(id: Int, text: String, options: List<String>) {
        val question = Question(id, text, options)
        questionModel.addQuestion(question)
    }

    fun getQuestions(): List<Question> {
        return questionModel.getQuestions()
    }
}
