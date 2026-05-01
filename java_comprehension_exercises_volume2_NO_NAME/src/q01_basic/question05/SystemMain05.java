package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する

		NonMember nonMember = new NonMember("Sato Kensuke");

		members[0] = nonMember;

		Member member = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[1] = member;

		System.out.println("---SHOW ALL MEMBERS---");
		MemberManager.showAllMembers(members);

		nonMember.buyItem();
		member.buyItem();

	}

}
