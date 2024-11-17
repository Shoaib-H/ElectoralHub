package com.tka.controller;

import java.util.List;

import com.tka.entity.Candidate;
import com.tka.service.HibernateService;

public class HibernateController {

	public Object getCandidates() {

		HibernateService hs = new HibernateService();
		Object obj = hs.getCandidates();
		return obj;

	}

	public int saveCandidate() {
		HibernateService hs = new HibernateService();
		int obj = hs.SaveCandidates();
		return obj;

	}

	public int updateCandidate() {
		HibernateService hs = new HibernateService();
		int obj = hs.updateCandidate();
		return obj;
	}

	public int saveorUpdateCandidate() {
		HibernateService hs = new HibernateService();
		int obj = hs.saveorUpdateCandidate();
		return obj;
	}

	public int deleteCandidate() {
		HibernateService hs = new HibernateService();
		int obj = hs.deleteCandidate();
		return obj;
	}

	public List<Candidate> getallCandidates() {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallCandidates();
		return obj;
	}

	public List<Candidate> getallCandidatesbyId(int id) {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallCandidatesbyId(id);
		return obj;
	}

	public List<Candidate> getallCandidatesByName(String str) {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallCandidatesByName(str);
		return obj;
	}

	public List<Candidate> getallCandidatesByState(String str) {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallCandidatesByState(str);
		return obj;
	}

	public List<Candidate> getallCandidatesByParty(String str) {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallCandidatesByParty(str);
		return obj;
	}

	public List<Candidate> getallMaleCandidates() {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallMaleCandidates();
		return obj;
	}

	public List<Candidate> getallFemaleCandidates() {
		HibernateService hs = new HibernateService();
		List<Candidate> obj = hs.getallFemaleCandidates();
		return obj;
	}

}
