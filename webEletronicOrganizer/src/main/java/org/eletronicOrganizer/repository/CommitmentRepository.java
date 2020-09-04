package org.eletronicOrganizer.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.eletronicOrganizer.model.Commitment;
import org.eletronicOrganizer.model.Contact;
import org.springframework.stereotype.Repository;

@Repository
public class CommitmentRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void addCommitment(Commitment commitment) {
		manager.persist(commitment);
	}
	
	public void update(Commitment commitment) {
		manager.merge(commitment);
	}
	
	public List<Commitment> readAll(String login){
		List<Commitment> commitments = new ArrayList();
		TypedQuery<Commitment> query = manager.createQuery("select c from Commitment c", Commitment.class);
		for (Commitment c : query.getResultList()) {
			if (c.getId_user().contentEquals(login)) {
				commitments.add(c);
			}
		}
		return commitments;
	}
	
	public Commitment find(int id) {
		return manager.find(Commitment.class, id);
	}
	
	public void removeCommitment(Commitment commitment) {
		manager.remove(commitment);
	}

}
