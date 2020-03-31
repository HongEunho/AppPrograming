package kr.ac.sejong.java1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue<E> implements Queue<E>{
	Integer[] data = new Integer[0];
	private int front;
	private int rear;
	private int size;
	private Object[] queueArr; 
	
	public MyQueue(int queueSize)
	{
		this.front=-1;
		this.rear=-1;
		this.size=queueSize;
		queueArr=new Object[queueSize];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		if(rear==front)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(rear==this.size-1)
			return true;
		else
			return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(E e) {
		if(isFull())
		{
			System.out.println("Queue is Full");
			return false;
		}
		else
		{
			queueArr[++rear]=e;
			return true;
		}
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E poll() {
		if(isEmpty())
		{
			System.out.println("Que is Empty");
		}
		else
		{
			E temp = queueArr[front];
			
			return temp;
		}
			
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
