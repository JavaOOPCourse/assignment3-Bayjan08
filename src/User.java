public abstract class User {
    String name;
    int id;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    public abstract void manageService(Service s);

    public abstract void useService(Service s);

}