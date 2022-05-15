package wood.mike

class NasaImageController {

    def nasaImageService      // not a standard grails service, see resources.groovy

    def index() {
        [nasaImage: nasaImageService.fetch()]
    }
}
