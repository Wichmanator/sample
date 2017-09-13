import org.wichmanator.sample.FunkyMonkeyController
import spock.lang.Specification

class FunkyMonkeyControllerSpec extends Specification {
    def "My controller test" () {
        given:
            def controller = new FunkyMonkeyController()
            String returnValue = controller.salutation()
        expect:
            'Hello, Funky Code Monkey'.equals(returnValue)
    }
}
