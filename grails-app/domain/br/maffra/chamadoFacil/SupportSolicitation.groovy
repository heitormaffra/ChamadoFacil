package br.maffra.chamadoFacil

class SupportSolicitation {
	
	
	Date solicitationDate
	Date attendanceDate	
	User attendentUser
	SupportStatus status
	Client client
	Project project
	String description
	String telephone
	int extensionNumber
	int priority
	String errorMessage
	String stepByStep
	File errorEvidence
	

    static constraints = {
		solicitationDate format: "dd/MM/yyyy"
		attendanceDate format: "dd/MM/yyyy"
		attendentUser nullable: false
		project nullable:false
		priority range: 1..8
		     
    }
}
