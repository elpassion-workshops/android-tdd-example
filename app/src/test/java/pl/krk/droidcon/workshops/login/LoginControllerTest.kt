package pl.krk.droidcon.workshops.login

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class LoginControllerTest {

    @Test
    fun shouldCallApiWithProvidedEmail() {
        val api = mock<Login.Api>()
        LoginController(api).onLogin("email@test.pl")
        verify(api).login("email@test.pl")
    }
}

class LoginController(private val api: Login.Api) {
    fun onLogin(email: String) {
        api.login("email@test.pl")
    }
}

interface Login {
    interface Api {
        fun login(s: String)
    }
}
