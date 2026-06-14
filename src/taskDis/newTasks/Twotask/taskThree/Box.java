package taskDis.newTasks.Twotask.taskThree;

public class Box <K,T extends Food>{
    private K key;
    private T obj;

    public Box(K key, T obj){
        this.key = key;
        this.obj = obj;
    }


    public T getObj(){
        return this.obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
