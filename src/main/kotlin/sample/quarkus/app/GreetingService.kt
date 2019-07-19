package sample.quarkus.app

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
open class GreetingService {

    fun greeting(name: String): String {
        return "hello $name"
    }
}