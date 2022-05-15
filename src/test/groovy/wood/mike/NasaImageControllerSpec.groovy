package wood.mike

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import wood.mike.nasa.NasaImageFetcher
import wood.mike.nasa.TestNasaImageFetcher

class NasaImageControllerSpec extends Specification implements ControllerUnitTest<NasaImageController> {

    def nasaImageService = Mock(NasaImageFetcher)

    def setup() {
        controller.nasaImageService = nasaImageService
    }

    def cleanup() {
    }

    void "test index"() {
        when:
            controller.index()
        then:
            1 * nasaImageService.fetch()
    }
}
