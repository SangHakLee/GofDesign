package prototype.deepshallow;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main");
		
		Cat navi = new Cat();
		navi.setName("나비");
		navi.setAge(new Age(2012, 3));
		
//		Cat yo = navi; // 깊은
		Cat yo = navi.copy(); // 얕은
		yo.setName("요");
		yo.getAge().setYear(2013);
		yo.getAge().setValue(2);
//		yo.setAge(new Age(2014, 1));
		
		System.out.println(navi.getName());
		System.out.println(navi.getAge().getYear());
		
		System.out.println(yo.getName());
		System.out.println(yo.getAge().getYear());
	}
}
