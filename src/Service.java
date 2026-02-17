public abstract class Service {

    // TODO: declare private fields
    private String serviceName;
    private int serviceId;
    private boolean isActive;


    public Service(String serviceName, int serviceId){
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }


    // TODO: activateService()
    public void activateService() {
        isActive = true;
        System.out.println("Service activated: " + serviceName + " (id=" + serviceId + ")");
    }


    // TODO: deactivateService()
    public void deactivateService() {
        isActive = false;
        System.out.println("Service deactivated: " + serviceName + " (id=" + serviceId + ")");
    }


    public String getServiceName() { return serviceName; }

    public boolean isActive() { return isActive; }


    public abstract void performService();

}