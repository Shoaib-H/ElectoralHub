package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.HibernateDao;
import com.tka.entity.Candidate;

public class HibernateService {

	public Object getCandidates() {
		HibernateDao hd = new HibernateDao();
		Object Obj = hd.getCandidate();
		return Obj;
	}

	public int SaveCandidates() {
		HibernateDao hd = new HibernateDao();
		int obj = hd.SaveCandidate();
		return obj;
	}

	public int updateCandidate() {
		HibernateDao hd = new HibernateDao();
		int obj = hd.UpdateCandidate();
		return obj;
	}

	public int saveorUpdateCandidate() {
		HibernateDao hd = new HibernateDao();
		int obj = hd.saveorUpdateCandidate();
		return obj;
	}

	public int deleteCandidate() {
		HibernateDao hd = new HibernateDao();
		int obj = hd.deleteCandidate();
		return obj;
	}

	public List<Candidate> getallCandidates() {

		HibernateDao hd = new HibernateDao();
		List<Candidate> obj = hd.getallCandidates();
		return obj;
	}

	public List<Candidate> getallCandidatesbyId(int id) {

		HibernateDao hd = new HibernateDao();
		List<Candidate> list = hd.getallCandidates();
		List<Candidate> list1 = new ArrayList<Candidate>();
		for (Candidate candidate : list) {
			if (candidate.getEid() == id) {
				list1.add(candidate);

			}
		}
		return list1;
	}

	public List<Candidate> getallCandidatesByName(String str) {

		HibernateDao hd = new HibernateDao();
		List<Candidate> list = hd.getallCandidates();
		List<Candidate> list1 = new ArrayList<Candidate>();
		for (Candidate candidate : list) {
			if (candidate.getName().equals(str)) {
				list1.add(candidate);

			}
		}
		return list1;
	}

	public List<Candidate> getallCandidatesByState(String str) {

		HibernateDao hd = new HibernateDao();
		List<Candidate> list = hd.getallCandidates();
		List<Candidate> list1 = new ArrayList<Candidate>();
		for (Candidate candidate : list) {
			if (candidate.getStnm().equals(str)) {
				list1.add(candidate);

			}
		}
		return list1;
	}

	public List<Candidate> getallCandidatesByParty(String str) {

		HibernateDao hd = new HibernateDao();
		List<Candidate> list = hd.getallCandidates();
		List<Candidate> list1 = new ArrayList<Candidate>();
		for (Candidate candidate : list) {
			if (candidate.getPnm().equals(str)) {
				list1.add(candidate);

			}
		}
		return list1;
	}

	public List<Candidate> getallMaleCandidates() {

		HibernateDao hd = new HibernateDao();
		List<Candidate> list = hd.getallCandidates();
		List<Candidate> list1 = new ArrayList<Candidate>();
		for (Candidate candidate : list) {
			if (candidate.getGender().equals("Male")) {
				list1.add(candidate);

			}
		}
		return list1;
	}

	public List<Candidate> getallFemaleCandidates() {

		HibernateDao hd = new HibernateDao();
		List<Candidate> list = hd.getallCandidates();
		List<Candidate> list1 = new ArrayList<Candidate>();
		for (Candidate candidate : list) {
			if (candidate.getGender().equals("Female")) {
				list1.add(candidate);

			}
		}
		return list1;
	}

}
