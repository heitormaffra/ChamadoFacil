package br.maffra.chamadoFacil

class Client {
	
	String clientName
	String enchargePerson
	String contactEmail

    static constraints = {
		contactEmail email: true
    }
}
