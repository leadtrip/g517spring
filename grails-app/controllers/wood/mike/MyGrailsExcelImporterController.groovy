package wood.mike

class MyGrailsExcelImporterController {

    def myGrailsExcelImporterService

    def index() {
        myGrailsExcelImporterService.importSomething()
        render 'done'
    }
}
