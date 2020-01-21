interface MU{
	void fiyc();
	void syc();
	void tyc();
	void foyc();
}

class C1 implements MU {
	public void fiyc(){System.out.println("1st year C1 will do it");}
	public void syc(){System.out.println("2nd year C1 will do it");}
	public void tyc(){System.out.println("3rd year C1 will do it");}
	public void foyc(){System.out.println("4th year C1 will do it\n");}
}

class C2 implements MU {
	public void fiyc(){System.out.println("1st year C2 will do it");}
	public void syc(){System.out.println("2nd year C2 will do it");}
	public void tyc(){System.out.println("3rd year C2 will do it");}
	public void foyc(){System.out.println("4th year C2 will do it");}
}

class P4{
	public static void main(String[] args) {
		MU obj = new C1();
		obj.fiyc();
		obj.syc();
		obj.tyc();
		obj.foyc();

		obj = new C2();
		obj.fiyc();
		obj.syc();
		obj.tyc();
		obj.foyc();
	}
}