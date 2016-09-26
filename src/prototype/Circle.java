package prototype;

public class Circle extends Shape {
	private int x, y, r;
	
	public Circle(int x, int y, int r) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	// 이 부분이 그리기 도구의 복사하기 부분.
	// 같은 내용의 circle을 복사한다.
	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		
		// 새로운 요구 사항 복사후 1칸 이동
		circle.x = x + 1;
		circle.y = y + 1;
		
		return circle;
	}
}
