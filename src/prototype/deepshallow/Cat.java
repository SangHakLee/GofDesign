package prototype.deepshallow;

public class Cat implements Cloneable {
	// 고양이 관리 프로젝트
	
	private String name;
	private Age age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Cat copy() throws CloneNotSupportedException{
		
		Cat ret = (Cat)this.clone();
		return ret;
	}
	
	
}
