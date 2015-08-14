import java.text.MessageFormat;
import java.util.Iterator;
import java.util.TreeSet;

class A implements Comparable<A>{
	public int id;
	public String a;
	
	@Override
	public int compareTo(A o) {
		if( this.id > o.id) return 1;
		else if(this.id < o.id) return -1;
		else return 0;
	}
	
	public A(String a, int id) {
		this.id = id;
		this.a = a;
	}
}

public class Run {
	public static void main(String... args) {
		TreeSet<A> set = new TreeSet<A>();
		
		set.add( new A("xxx",5) );
		set.add( new A("bbbx",3) );
		set.add( new A("aaax",4) );
		
		System.out.println(set.size());
		
		/*for (int i=0;i<set.size();i++){
			System.out.println(set.);
		}*/
		
		Iterator<A> iter = set.iterator();
		while(iter.hasNext()) {
			A a = iter.next();
			//System.out.println("1:"+a.id+"| 2:"+a.a);
			System.out.println(MessageFormat.format("|{0}:{1}|", a.id, a.a));
		}
	}
}
