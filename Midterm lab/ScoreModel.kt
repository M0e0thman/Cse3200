class ScoreModel {
    private var score: Int = 0

    fun incrementScore() {
        score++
    }

    fun getScore(): Int {
        return score
    }
}

#### Controller (ScoreController.kt):
```kotlin
class ScoreController(private val scoreModel: ScoreModel) {
    fun incrementScore() {
        scoreModel.incrementScore()
    }

    fun getScore(): Int {
        return scoreModel.getScore()
    }
}
