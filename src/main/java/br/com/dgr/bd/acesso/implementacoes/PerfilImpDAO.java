package br.com.dgr.bd.acesso.implementacoes;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.dgr.bd.acesso.interfaces.PerfilDAO;
import br.com.dgr.bd.entidades.Perfil;

public class PerfilImpDAO implements PerfilDAO {


	private EntityManager getEntity(){
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		
		factory = Persistence.createEntityManagerFactory("telefonia_pu");
		
		entityManager = factory.createEntityManager();
		

		return entityManager;
	}

	@SuppressWarnings("unchecked")
	@Produces
	public List<Perfil> retornaTodosPerfis() throws Exception {
		List<Perfil> perfis = new ArrayList<Perfil>(); 	
		String hql = new String("SELECT p FROM Perfil p");    

		Query query = getEntity().createQuery(hql.toString());

		perfis = query.getResultList();

		return perfis;
	}

	public void alterarPerfil(Perfil perfil) throws Exception {
		EntityManager entityManager = getEntity();
		entityManager.getTransaction().begin();
		perfil = entityManager.merge(perfil);
		entityManager.getTransaction().commit();		
	}


}
