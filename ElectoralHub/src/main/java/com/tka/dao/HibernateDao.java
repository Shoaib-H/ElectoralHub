package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.tka.entity.Candidate;
import com.tka.util.HibernateUtility;

public class HibernateDao {

	public Candidate getCandidate() {

		Session session = HibernateUtility.getSession().openSession();
		Candidate obj = session.get(Candidate.class, 1);
		return obj;
	}

	public int SaveCandidate() {

		Session session = HibernateUtility.getSession().openSession();
		Transaction tx = session.beginTransaction();

		Candidate candidate = new Candidate(7, "ADV. PRADEEP ROHIDAS ", "RSS", "MH", 20, "Male");
		int idval = (int) session.save(candidate);
		tx.commit();
		return idval;

	}

	public int UpdateCandidate() {
		Session session = HibernateUtility.getSession().openSession();
		Transaction tx = session.beginTransaction();

		Candidate candidate = new Candidate(7, "Shoaib", "NCP", "MH", 20, "Male");
		session.update(candidate);
		tx.commit();
		return 0;
	}

	public int saveorUpdateCandidate() {
		Session session = HibernateUtility.getSession().openSession();
		Transaction tx = session.beginTransaction();

		Candidate candidate = new Candidate(7, "Shoaib", "NCP", "MH", 20, "Male");
		candidate.setEid(27);
		session.saveOrUpdate(candidate);
		tx.commit();
		return 0;
	}

	public int deleteCandidate() {
		Session session = HibernateUtility.getSession().openSession();
		Transaction tx = session.beginTransaction();

		Candidate candidate = new Candidate();
		candidate.setEid(7);
		session.delete(candidate);
		tx.commit();
		return 0;
	}

	public List<Candidate> getallCandidates() {
		String query = "from Candidate";
		Session session = HibernateUtility.getSession().openSession();
		@SuppressWarnings("unchecked")
		Query<Candidate> query2 = session.createQuery(query);
		List<Candidate> list = query2.list();
		return list;
	}

}
