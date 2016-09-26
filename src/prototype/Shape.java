package prototype;

public class Shape implements Cloneable {
	
	// Cloneable 을 받아서 복사 가능하게 만든다.
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
