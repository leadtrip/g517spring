package wood.mike.nasa

import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Value

class StandardNasaImageFetcher implements NasaImageFetcher{

    def apiKey

    @Value('${nasa.api}')
    def api

    @Override
    def fetch() {
        new JsonSlurper().parse( "${api}?api_key=${apiKey}".toURL() )
    }
}
