package datastructures;

public class DynamicArray<String> {
    private Object[] data;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity){
        this.capacity=initialCapacity;
        this.size=0;
        this.data = new Object[initialCapacity];

    }

    public String get(int index){
        return (String)data[index];
    }

    public void set(int index, String value){
        data[index]=value;
    }

    public void insert(int index, String value){
        //check size
        if(this.size==capacity)
            resize();

        for(int i = size; i>index; i--){
            data[i]=data[i-1];
        }
        data[index]=value;
        size++;
    }

    public void delete(int index){
        for(int i=index; i<size;i++){
            data[i]=data[i+1];
        }
        data[size-1]=null;
        size--;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean contains (String value){
        boolean contains=false;
        for(int i=0;i<size;i++){
            if(((String)data[i]).equals(value)){
                contains=true;
                break;
            }
        }

        return contains;
    }

    private void resize(){
        Object[] temp = new Object[capacity*2];
        for(int i=0; i<capacity;i++){
            temp[i]=data[i];
        }

        capacity=capacity*2;
        data = temp;
    }

    public int size (){
        return size;
    }

    public void print(){
        for(int i=0; i<size; i++){
            System.out.println(data[i]);
        }
    }

    public void add(String value){
        if(size==capacity){
            resize();
        }

        data[size]=value;
        size++;
    }

}
