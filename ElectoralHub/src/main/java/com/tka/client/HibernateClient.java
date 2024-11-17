package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.controller.HibernateController;
import com.tka.entity.Candidate;

public class HibernateClient {

	public static void main(String[] args) {

		HibernateController hc = new HibernateController();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to Election Portal");
			System.out.println("---------------------------");
			System.out.println();

			System.out.println("Enter Your Choice");
			System.out.println("1. Get Candidate by ID");
			System.out.println("2. Insert new Candidate");
			System.out.println("3. Update Candidate");
			System.out.println("4. Insert or Update Candidate");
			System.out.println("5. Delete Candidate");
			System.out.println("6. Get All Candidate");
			System.out.println("7. Get Candidate by Attribute");
			System.out.println();
			System.out.println("Enter Your Choice ");

			int c = sc.nextInt();
			switch (c) {
			case 1:

				System.out.println(hc.getCandidates());
				break;
			case 2:
				System.out.println("Candidate Added Successfully with ID " + hc.saveCandidate());
				System.out.println("---------------------------");
				break;

			case 3:
				hc.updateCandidate();
				System.out.println("Candidate Updated Successfully !!!");
				System.out.println("---------------------------");
				break;

			case 4:
				System.out.println(hc.saveorUpdateCandidate());
				break;

			case 5:
				hc.deleteCandidate();
				System.out.println("Candidate Deleted Successfully !!!");
				System.out.println("---------------------------");
				break;

			case 6:
				List<Candidate> obj = hc.getallCandidates();
				for (Candidate candidate : obj) {
					System.out.println(candidate);
				}
			case 7:
				System.out.println("Enter Attribute");
				System.out.println("1. Get Candidate by Id");
				System.out.println("2. Get Candidate by Name");
				System.out.println("3. Get Candidate by State Name");
				System.out.println("4. Get Candidate by Party Name");
				System.out.println("5. Male Candidates");
				System.out.println("6. Female Candiates");
				int key = sc.nextInt();
				switch (key) {
				case 1:
					System.out.println("Enter Id of the Candiate");
					int id = sc.nextInt();
					List<Candidate> obj1 = hc.getallCandidatesbyId(id);
					for (Candidate candidate : obj1) {
						System.out.println(candidate);
					}

					break;
				case 2:
					System.out.println("Enter Name of the Candiate");
					String str = sc.next();
					List<Candidate> obj2 = hc.getallCandidatesByName(str);
					for (Candidate candidate : obj2) {
						System.out.println(candidate);
					}

					break;
				case 3:
					System.out.println("Enter State of the Candiate");
					String str1 = sc.next();
					List<Candidate> obj3 = hc.getallCandidatesByState(str1);
					for (Candidate candidate : obj3) {
						System.out.println(candidate);
					}

					break;
				case 4:
					System.out.println("Enter Party Name of the Candiate");
					String str2 = sc.next();
					List<Candidate> obj4 = hc.getallCandidatesByParty(str2);
					for (Candidate candidate : obj4) {
						System.out.println(candidate);
					}

					break;

				case 5:

					List<Candidate> obj5 = hc.getallMaleCandidates();
					for (Candidate candidate : obj5) {
						System.out.println(candidate);
					}

					break;

				case 6:

					List<Candidate> obj6 = hc.getallFemaleCandidates();
					for (Candidate candidate : obj6) {
						System.out.println(candidate);
					}

					break;
				default:
					break;
				}

				break;
			default:
				break;
			}

		}
	}

}
