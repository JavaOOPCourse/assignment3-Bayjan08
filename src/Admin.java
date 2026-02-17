public class Admin extends User {

    public Admin(String name, int id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        if(s.isActive()){
            System.out.println("Admin " + name + " deactivates service: " + s.getServiceName());
            s.deactivateService();
        }
        else {
            System.out.println("Admin " + name + " activates service: " + s.getServiceName());
            s.activateService();
        }

    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin " + name + " is using service: " + s.getServiceName());
        s.performService();
    }
}