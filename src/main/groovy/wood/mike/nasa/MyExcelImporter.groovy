package wood.mike.nasa

/**
 * A non-grails service wired up with a service from a grails plugin
 */
class MyExcelImporter {

    def excelImportService      // this service comes from the excel import plugin, wired up in resources.groovy

    def importSomething() {
        println "excelImportService is ${excelImportService.toString()}"
    }
}
