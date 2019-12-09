package chrisjiunittest

import grails.converters.JSON

class NotificationApiController {

    def countService

    def getCount() {
        def results = countService.getCount()

        render results as JSON
    }
}
