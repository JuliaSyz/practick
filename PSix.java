class Student{
    private int id;
    private String name;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
   
    public String getName(){
        return name;
    }
     public void setName(String name){
        this.name=name;
    }
    public void setID(int id){
        this.id=id;
    }
    public int getID(){
      return id;
    }
     public String toString(){
        return name+" "+id;
}
   
}


 class QuickSort {

    public void quickSort(Student[] array, int low, int high) {//0 4
        if (array.length == 0)
            return;

        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = array[middle].getID();
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getID() < opora) {
                i++;
            }

            while (array[j].getID() > opora) {
                j--;
            }

            if (i <= j) {
                Student s=array[i];
                array[i]=array[j];
                array[j]=s;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}

public class Main
{
	public static void main(String[] args) {
	    
		Student[] iDNumber= new Student[4];
	    iDNumber[0] = new Student("S0",45);
	    iDNumber[1] = new Student("S1",90);
	    iDNumber[2] = new Student("S2",20);
	    iDNumber[3] = new Student("S3",49);
	
		 QuickSort q= new QuickSort();
		 q.quickSort(iDNumber, 0, 3);
		 for(int i=0; i<5; i++){
		     System.out.println(iDNumber[i].toString());
		 }
	}
}