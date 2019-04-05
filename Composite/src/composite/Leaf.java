package composite;

public class Leaf implements Component {
	
	String chapterName;

	public Leaf(String chapterName) {
		this.chapterName = chapterName;
	}
	
	@Override
	public void Print() {
		System.out.println(chapterName);
	}

}
