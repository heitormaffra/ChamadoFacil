package br.maffra.chamadoFacil

class User {
	
	String login
	String password
	String email
	Date insertDate

    static constraints = {
		login size: 5..15, blank: false, unique: true
		password size: 5..15, blank: false, password: true 
		email email: true, blank: false
    }
}
