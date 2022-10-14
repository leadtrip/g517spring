package g517spring

import grails.gorm.transactions.Transactional

/*
 A standard grails service that calls a non-grails service
 */
@Transactional
class MyGrailsExcelImporterService {

    def myExcelImporter
    def excelImportService

    def importSomething() {
        println "excelImportService in standard grails service is ${excelImportService.toString()}"
        myExcelImporter.importSomething()
    }
}
