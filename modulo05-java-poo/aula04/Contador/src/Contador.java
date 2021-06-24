public class Contador {
    private Integer count = 0;

    public Contador(){

    }

    public Contador(Integer count){
        this.count = count;
    }

    public Contador(Contador c){
        this.count = this.getCount();
    }

    public Integer incrementaCount(){
        return ++this.count;
    }

    public Integer decrementaCount(){
        return --this.count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "count=" + count +
                '}';
    }
}
