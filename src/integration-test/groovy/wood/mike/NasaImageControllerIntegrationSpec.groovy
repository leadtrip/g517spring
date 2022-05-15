package wood.mike

import grails.testing.mixin.integration.Integration
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

@Integration
class NasaImageControllerIntegrationSpec extends Specification implements ControllerUnitTest<NasaImageController>{

    def nasaImageService        // this is the TestNasaImageFetcher wired up in resources.groovy

    void setup() {
        controller.nasaImageService = nasaImageService
    }

    void "test index" () {
        when:
            def res = controller.index()
        then:
            res.nasaImage.title == 'First Horizon-Scale Image of a Black Hole'  // we use a fixed image in test environment
    }
}
