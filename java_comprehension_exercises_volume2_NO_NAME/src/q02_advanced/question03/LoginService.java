package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TOO ここから処理を記述
	public LoginService(MemberStorage memberStorage) {

		this.memberStorage = memberStorage;

	}

	public Member doLogin(int id, String password) {
		List<Member> members = memberStorage.getMembers();
		Member loginMember = null;

		for (Member member : members) {
			if (member.getId() == id && member.getPassword().equals(password)) {
				loginMember = member;
				break;
			}

		}
		return loginMember;
	}
}
