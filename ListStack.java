public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
    // The number of items on the stack
    public int size(){
        return size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(Object e) throws StackOverflowException{
        top = new Node(e, top);
        size++;
    }

    public Object pop() throws StackUnderflowException{
        if(size == 0){
            throw new StackUnderflowException();
        }
        Node temp = top;
        top = top.next;
        size--;
        temp.next = null;
        
        return temp.val;
    }

    public Object peek() throws StackUnderflowException{
        if(size == 0){
            throw new StackUnderflowException();  
        }
        return top.val;
    }

    public String toString(){
        String s = "";
        if(size == 0){
            return "the array is empty";
        }
        for(Node i = top; i != null; i = i.next){
            s += i.val+" ";
        }
        return "[ " + s + " ]";
    }

    public Object[] toArray(){
        Object a[] = new Object[size];
        Node i = top;
        
        for(int j = 0; j < size; j++){
            a[j] = i.val;
            i = i.next;
        }
        return a;
    }

    public int search(Object e){
        Node i = top;
        for(int j = 0; i != null; i=i.next, j++){
            if(e == i.val){
                return j;
            }
        }
        return -1;
    }

}