package chapter03;

public class Point {

	private int x;
	private int y;
	private String color;

	// Source -> Generate toSTring() -> 선택해 주면 아래처럼 쉽게 만들수 있다.
	//color가 추가 될 경우에는 위에것을 반복하고 클릭하면 자동으로 변경해준다.
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", color=" + color + "]";
	}


	public boolean equals2(Object obj) {
		if( this==obj){ //같은 레퍼런스를 가리키면 비교할 필요 없으므로 true 해줌.
			return true;
		}
		
		if( this.getClass() !=obj.getClass()){
			return false;
		}
		Point other=(Point)obj;
		//위 if문을 안써주면 오류 날수 있으므로 안전하게  
		if(this.x!=other.getX()){
			return false;
		}
		if(this.y!=other.getY()){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	//해시코드를 내용기반으로 해시코드를 만들어줌. 그전에는 주소기반 override를 해줘서 . 
	//HashSet은 내용으로 구분...? 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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

}
