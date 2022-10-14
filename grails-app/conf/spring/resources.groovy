import grails.util.Environment
import org.grails.plugins.excelimport.ExcelImportService
import wood.mike.nasa.MyExcelImporter
import wood.mike.nasa.StandardNasaImageFetcher
import wood.mike.nasa.TestNasaImageFetcher

// Place your Spring DSL code here
beans = {
    switch(Environment.current) {
        case Environment.PRODUCTION:
        case Environment.DEVELOPMENT:
            nasaImageService(StandardNasaImageFetcher) {
                apiKey = grailsApplication.config.nasa.apiKey   // no real need to do this here, could've used @Value like other properties, just proving a point
            }
            break

        case Environment.TEST:
            nasaImageService(TestNasaImageFetcher)
        break
    }

    myExcelImporter(wood.mike.nasa.MyExcelImporter) {               // this is stupid but configuring a non-grails service in src/groovy with a plugin service
        excelImportService = ref('excelImportService')
    }
}
