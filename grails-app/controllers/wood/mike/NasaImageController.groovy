package wood.mike

class NasaImageController {

    def nasaImageService

    def index() {
        [nasaImage: nasaImageService.fetch()]
    }
}
