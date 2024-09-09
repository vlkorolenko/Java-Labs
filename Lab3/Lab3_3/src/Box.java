public class Box<T>{
    private T item;

    public void put(T item){
        this.item = item;
        System.out.println("Предмет поміщено в коробку: "+ item);
    }

    public T get(){
        System.out.println("Предмет вилучено з коробки: "+ item);
        return item;
    }
}
