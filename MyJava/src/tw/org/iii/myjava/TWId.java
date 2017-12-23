package tw.org.iii.myjava;

public class TWId {
	private String id;
	
	public TWId() {
		this((int)(Math.random()*2)==0?true:false,
				(int)(Math.random()*26));
	}
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}
	public TWId(int area) {
		this((int)(Math.random()*2)==0?true:false , area);
	}
	public TWId(boolean isMale, int area) {
		
		
	}
	
//	public TWId(String id) {
//		this.id = id;
//	}
	
	public String getId() {
		return id;
	}
	
	public boolean isMale() {
		return true;
	}
	
	public String getArea() {
		return "台中市";
	}
	
}
