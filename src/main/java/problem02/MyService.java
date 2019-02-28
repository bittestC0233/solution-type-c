package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후";
	}

	public void service(String state) {
		String result = "";
		
		if(state.equals("낮")) {
			result = day();
		} else if(state.equals("오후")) {
			result = afternoon();
		} else if(state.equals("밤")) {
			result = night();
		}
		
		System.out.println(result + "서비스시작 ");
	}
}
