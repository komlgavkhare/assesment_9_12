package assesment_9_12;

public class Callby_value {
	 int data=20;
	 void change(Callby_value call) {
		 call.data=call.data+20;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callby_value call =new Callby_value();
		System.out.println("before change: "+call.data);
		call.change(call);
		System.out.println("after change: "+call.data);
	}

}
