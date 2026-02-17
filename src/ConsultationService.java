public class ConsultationService extends Service implements Billable {

    public ConsultationService(String serviceName, int serviceId){
        super(serviceName, serviceId);
    }


    @Override
    public void performService() {

        if (!isActive()) {
            System.out.println(getServiceName() + " is inactive. Cannot start consultation.");
            return;
        }
        System.out.println("Starting online consultation via " + getServiceName() + ".");

    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for consultation service: " + getServiceName());
    }
}