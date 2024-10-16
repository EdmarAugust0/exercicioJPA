/**
 * 
 */
/**
 * 
 */
module ExercicioJPA {
	requires java.persistence;
	requires junit;
	
	opens br.com.edmar.domain to org.hibernate.orm.core;
}