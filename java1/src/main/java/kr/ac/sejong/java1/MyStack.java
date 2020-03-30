package kr.ac.sejong.java1;

public class MyStack {
	//데이터 추상화
	//크기가 고정
	String[] data = new String[0];
	
	//기능성 2가지
	//쌓는다. push
	//data에 item이  [1,2]->[1,2,3]
	public void push(String item) {
		//n->n+1개짜리 배열을 생성해서, item을 넣고, 새로운 배열을 myStack의 data로
		//새로운 배열을 만든다.
		String[] newData = new String[data.length+1];
		//기존의 데이터를 복사
		for(int i=0;i<data.length;i++) {
			newData[i]=data[i];
		}
		newData[newData.length-1]=item;
		data=newData;
	}
	
	//위에서 가져온다. pop
	//[1,2,3] ->[1,2]
	public String pop() {
		if(data.length==0)
			return null;
		String[] newData = new String[data.length-1];
		String last = data[data.length-1];
		for(int i=0;i<data.length-1;i++) {
			newData[i]=data[i];
		}
		data = newData;
		return last;
	}
}
