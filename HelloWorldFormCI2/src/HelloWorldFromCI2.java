//import java.util.Date;
//import java.util.Calendar;
import java.util.*;

// genclass
class MyGen<T> {
	public void getThree(T g){
		System.out.println(g);
		System.out.println(g);
		System.out.println(g);
	}
}

// absclass
abstract class SuperUser {
	// Class Field
	// sfint
	private static int memberCount = 0;
	
	// sfString
	private static int organizationName;
	
	// sfdouble
	private static double averageAge;
	
	
	// Instance Field
	// fint
	private int age;
	
	// ftring
	private String name;
	
	// fdouble
	private double height;
	private double weight;
	
	
	
	// generate constructor: Alt + C
	protected SuperUser(int age, String name, double height, double weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	

	
	// generate Getter and Setter: Alt + G
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}




	public abstract void greeting();
}


class SubUser extends SuperUser {
	
	private int asset;
	
	// スーパークラスのコンストラクタを呼び出してコンストラクタを生成
	SubUser(int age, String name, double height, double weight, int asset) {
		super(age, name, height, weight);
		this.asset = asset;
	}

	@Override
	public void greeting() {
	}
	
	// mvoid
	public void mVoid(String arg) {
		System.out.println("This is " + arg + " does not return any data");
	}
	
	
	// mString
	public String mString(String arg) {
		
		return "This is " + arg + "returns Stirng";
	}
	
	
	// mint
	public int mInt(int arg) {
		
		return arg + 10;
	}
	
	
	// mdouble
	public double mDouble(double arg) {
		
		return arg + 1.0;
	}
	
	
	// mboolean
	public boolean mBoolean(int a) {
		
		return 1 < a;
	}
	
}



public class HelloWorldFromCI2 {
	
	public static void main(String[] args) {
		
		// vboolean
		boolean vBoolean = 1 < 2;
		
		
		// vchar
		char vChar = 'a';
		
		
		// vdouble
		double vDouble = 1.0;
		
		
		// aint
		int[] aint1;
		aint1 = new int[3];
		
		aint1[0] = 1;
		aint1[1] = 2;
		aint1[2] = 3;
		
		
		// aint
		int[] aint2;
		aint2 = new int[] {1, 2, 3};
		
		
		// aint
		int[] aint3 = {0, 1, 2,};
		
		
		// Intnew
		Integer IntNew = new Integer(1);
		
		// Intvar
		Integer IntVar = 1;
		
		
		// intvar
		int intvar = 1;
		
		
		// strarray
		String[] StrArray = { "0", "1", "2", };
		
		
		// strvar
		String StrVar = "value";
		
		
		// datnew
		Date datNew = new Date();
		
		// calGetInstance
		Calendar cal = Calendar.getInstance();
		
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		System.out.println("今日は" + month + "月" + day + "日です" );
		
		
		// genvar
		MyGen<Integer> i = new MyGen<>();

		i.getThree(32);
		
		// public static methods
		smVoid("class method");
		System.out.println(smString("class method"));
		System.out.println("This is class method returns int data. 1 + 10 = " + smInt(1));
		System.out.println("This is class method returns double data. 1.0 + 1.1 = " + smDouble(1.1));
		System.out.println("This is class method returns boolean data. '1 < 10' is "+ smBoolean(1));
		System.out.println("This is class method returns boolean data. '100 < 10' is "+ smBoolean(100));
		
		// Instance Method
		SubUser me = new SubUser(29, "Ryu", 1.8, 99.9, 1000 );
		me.mVoid("Instance Method");
		System.out.println(me.mString("Instance Method"));
		System.out.println("1 + 10 = " + me.mInt(1));
		System.out.println("1.1 + 1.0 = " + me.mDouble(1.1));
		System.out.println("1 < 3 = " + me.mBoolean(3));
		System.out.println("1 < 0 = " + me.mBoolean(0));
		
		Scanner s = new Scanner(System.in);
	}
	
	// smvoid
	public static void smVoid(String arg) {
		System.out.println("This is " + arg + " does not return any data");
	}
	
	
	// smString
	public static String smString(String arg) {
		
		return "This is " + arg + "returns String data";
	}
	
	
	// smint
	public static int smInt(int arg) {
		return arg + 10;
	}
	
	
	// smdouble
	public static double smDouble(double arg) {
		
		return arg + 1.0;
	}

	
	// smboolean
	public static boolean smBoolean(int a) {
		
		return a < 10;
	}
	
	
}




