package wood.mike.nasa

import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Value

class TestNasaImageFetcher implements NasaImageFetcher{

    @Value('${nasa.testUrl}')
    String testUrl

    @Value('${nasa.apiKey}')
    def apiKey

    @Override
    def fetch() {
        new JsonSlurper().parse( "${testUrl}&api_key=${apiKey}".toURL() )
    }
}
