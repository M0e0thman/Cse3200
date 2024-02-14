class UserModel {
    private var userId: String = ""

    fun setUserId(userId: String) {
        this.userId = userId
    }

    fun getUserId(): String {
        return userId
    }
}

#### Controller (UserController.kt):
```kotlin
class UserController(private val userModel: UserModel) {
    fun setUserId(userId: String) {
        userModel.setUserId(userId)
    }

    fun getUserId(): String {
        return userModel.getUserId()
    }
}
