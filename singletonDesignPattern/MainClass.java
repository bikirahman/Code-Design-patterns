class MainClass{
	public static void main(String[] args) {
		Singleton ss = Singleton.getSingleton();
		System.out.println(ss);
		ss.getData();
	}
}