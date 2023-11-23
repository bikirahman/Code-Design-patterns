class Singleton{
	public static Singleton singleton;

	private Singleton(){

	}

	public static Singleton getSingleton(){
		synchronized(Singleton.class){
				if(singleton==null){
				singleton = new Singleton();
			}
		}
		return singleton;
	}

	public static void getData(){
		System.out.println("Testing data new");
	}
}