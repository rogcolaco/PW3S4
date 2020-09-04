package org.eletronicOrganizer.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.eletronicOrganizer.model.Commitment;
import org.springframework.stereotype.Repository;

@Repository
public class CommitmentRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void addCommitment(Commitment commitment) {
		manager.persist(commitment);
	}

}
