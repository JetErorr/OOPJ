public class StrStack{
    String[] stk;
    int top, size;
    StrStack(int size){
        this.size = size;
        stk = new String[size];
        top = -1;
    }

    void push(String value){
        if(top==size-1){
            System.out.println("Stack is Full.!");
        }else{
            top++;
            stk[top]=value;
        }
    }
    String pop(){
        if(top==-1){
            System.out.println("Stack is Empty.!");
        }else{
            String temp = stk[top]; 
            top--;
            return temp;
        }
    }
}