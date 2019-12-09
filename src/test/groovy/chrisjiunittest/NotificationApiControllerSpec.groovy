package chrisjiunittest

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class NotificationApiControllerSpec extends Specification implements ControllerUnitTest<NotificationApiController> {

    void "test something"() {
        setup:
        // whether or not this is the right thing to do
        // depends on some other factors, but this is
        // an example of one approach...
        controller.countService = Mock(CountService) {
            getCount() >> [count: 2]
        }

        when:
        controller.getCount()

        then:
        response.json == [count: 2]
    }
}
