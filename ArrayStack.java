public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    
    public int size(){
        
        return size;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(Object e) throws StackOverflowException{
        if(size == data.length){
            throw new StackOverflowException();
        }
        else{
            data[size] = e;
            size++;
        }
    }
    
    public Object pop() throws StackUnderflowException{
        Object p = 0;
        if(size == 0){
            throw new StackUnderflowException();
        }
        else{
            p = data[size - 1];
            data[size - 1] = null;
            size--;
        }
        return p;
    }
    
    public Object peek() throws StackUnderflowException{
        if(size == 0){
            throw new StackUnderflowException();
            
        }
            return data[size - 1];
        
    }
    
    public String toString(){
        String s = "";
        if(size == 0){
            return "the array is empty";
        }
        
        for(int i = size - 1; i >= 0 ; i--){
            s += data[i]+" ";
        }
        
        return "[ " + s + " ]";
    }
    
    public Object[] toArray(){
        Object a[] = new Object[size];
        int j = 0;
        for(int i = size - 1; i >= 0; i--){
            a[j] = data[i];
            j++;
        }
        return a;
    }
    
    public int search(Object e){
        int pos = 0;
        for(int i = size - 1; i >= 0; i--){
            if(e == data[i]){
                return pos;
            }
            else{
                pos++;
            }
        }
        return -100;
    }
}