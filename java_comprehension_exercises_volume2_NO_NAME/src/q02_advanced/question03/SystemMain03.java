package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader consoleReader = new ConsoleReader();
		MemberStorage memberStorage = new MemberStorage();

		loginService = new LoginService(memberStorage);
		Member member = null;

		while (!isLogin) {
			try {
				int id = consoleReader.inputNumber();
				String pass = consoleReader.inputString();
				member = loginService.doLogin(id, pass);
				if (member == null) {
					System.out.println("IDまたはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました。");
					System.out.println("ログインユーザ情報を表示します。");

					isLogin = true;
				}
			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				System.out.println("不正な入力です。再度入力してください。");
				//isLogin = false;
				//e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();

			}

		}

		member.showMember();

	}
}
