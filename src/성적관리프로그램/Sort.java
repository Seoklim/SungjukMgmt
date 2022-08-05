
public class Sort {
	private Student[] array;
	private int count;
	
	public Sort(Student[] array, int count) {
		this.array = array;
		this.count = count;
	}
	
	public void bubbleSort() {
		for(int i = 0; i < count-1; i++) {
			for(int j = 0; j < count-1 ; j++) {
				if(this.array[j].getTot() < this.array[j+1].getTot()) {
					this.swap(this.array[j], this.array[j+1]);
				}
			}
		}
	}
	
	public void selectionSort() {
		for(int i = 0; i < count-1; i++) {
			for(int j = i +1; j < count; j++) {
				if(this.array[i].getTot() < this.array[j].getTot()) {
					this.swap(this.array[j], this.array[j]);
				}
			}
		}
	}
	
	private void swap(Student front, Student back) {
		Student temp = front;
		front = back;
		back = temp;
	}
	
}
