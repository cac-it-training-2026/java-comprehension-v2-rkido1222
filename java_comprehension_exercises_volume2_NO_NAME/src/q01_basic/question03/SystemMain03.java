package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member miura = new Member();

		Member miura2 = new Member("Miura Manabu", 28, 2);

		System.out.println("---SHOW DATA(NULL)---");
		miura.showMember();

		System.out.println("---SHOW DATA(Miura)---");
		miura2.showMember();

	}

}
