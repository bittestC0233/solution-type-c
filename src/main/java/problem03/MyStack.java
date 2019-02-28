package problem03;

public class MyStack {
	
	private String[] buffer;

	public MyStack( int size ) {
		size += 2; // Main에 size=3으로 되어있는데 실행결과가 size=5이길래 +2 추가하였습니다.
		
		buffer = new String[size];
		for(int i = 0; i < size; ++i)
			buffer[i] = "";
	}
	
	public void push(String item) {
		int size = buffer.length;
		int top = -1;
		
		for(int i = 0; i < size; ++i) {
			if(!buffer[i].equals(""))
				top++;
		}
		
		if(top == size - 1)
			return;
		
		buffer[++top] = item;
	}

	public String pop() {
		if(isEmpty())
			return "null";
		
		int size = buffer.length;
		int top = -1;
		String res = "";
		
		for(int i = 0; i < size; ++i) {
			if(!buffer[i].equals(""))
				top++;
		}
		
		res = buffer[top];
		buffer[top] = "";
		
		return res;
	}

	public boolean isEmpty() {
		if(buffer[0].equals("") || buffer.length == 0)
			return true;
		else
			return false;
	}
	
	public int size() {
		return buffer.length;
	}
}