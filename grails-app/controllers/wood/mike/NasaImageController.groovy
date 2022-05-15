package wood.mike

class NasaImageController {

    def nasaImageService

    def index() {
        withFormat {
            html {
                [nasaImage: nasaImageService.fetch()]
            }
        }
    }
}
