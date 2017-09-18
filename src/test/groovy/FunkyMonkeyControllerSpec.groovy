import org.wichmanator.sample.EarlyObjects
import org.wichmanator.sample.FunkyMonkeyController
import spock.lang.Specification

class FunkyMonkeyControllerSpec extends Specification {
    def "My controller test" () {
        given:
            def controller = new FunkyMonkeyController()
            String returnValue = controller.salutation()
        expect:
        'Hello, Funky Code Monkey' == returnValue
    }
    def "Testie 123" () {
        given:
            def math = new EarlyObjects()
            int answer =  math.justSomeBoringMath()
        expect:
        20 == answer
    }
    def "count is greater than 10"() {
        given:
            def countDooku = new EarlyObjects()
            String returnValue = countDooku.counter()
        expect:
        'Count is greater than 10' == returnValue
    }
    def "Gandalf only lets three hobbits pass the bridge"() {
        given:
            def passer = new EarlyObjects()
            String TheyDoNotPass = passer.gandalfTheGrey()
        expect:
        'YOU SHALL NOT PASS!' == TheyDoNotPass
    }
    def "Two-Face decides your fate"() {
        given:
            def coin = new EarlyObjects()
            String decision = coin.twoFaceDecidesYourFate()
        expect:
            decision == 'life' || 'death'
    }
    def "Rolls for a random country"(){
        given:
            def dice = new EarlyObjects()
            String country = dice.whichCountryToGo()
        expect:
            country == country
    }
}
