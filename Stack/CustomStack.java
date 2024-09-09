public class CustomStack {
    int top=0;

    int size;
    int[] arr;
    public CustomStack(int n){
        this.size=n;
        arr=new int[size];
    }


    public void push(int data){
        arr[top]=data;
        top++;
    }

    public int pop(){
        int data=arr[top-1];
        arr[top-1]=0;
        top--;
        return data;
    }
    public int peek(){
        return arr[top-1];
    }
    public boolean isEmpty(){
        if(top==0)
            return true;
        return false;
    }
    public void display(){
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}
