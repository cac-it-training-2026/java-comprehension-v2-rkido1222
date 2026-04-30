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
		int id;
		String pass;

		try {
			id = consoleReader.inputNumber();
			pass = consoleReader.inputString();
		} catch (IOException | NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return;

		}

		MemberManager.updatePassword(member, id, pass);

		MemberManager.showAllMembers(member);
	}

}
