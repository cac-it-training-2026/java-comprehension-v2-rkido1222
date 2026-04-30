package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();

		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> member = new ArrayList<>();
		member.add(member1);
		member.add(member2);
		MemberManager.showAllMembers(member);

		try {
			consoleReader.inputNumber();
			consoleReader.inputString();
		} catch (IOException | NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return;

		}

		MemberManager.updatePassword(member, member1.getId(), member1.getPassword());
		MemberManager.updatePassword(member, member2.getId(), member2.getPassword());

		MemberManager.showAllMembers(member);
	}

}
