public class CloudStorageService extends Service implements PremiumFeature, Billable {

    public boolean premium;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }


    @Override
    public void performService() {

        if (!isActive()) {
            System.out.println(getServiceName() + " is inactive. Cannot access cloud.");
            return;
        }
        System.out.println("Accessing cloud storage: " + getServiceName() + (premium ? " (PREMIUM)" : ""));

    }

    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println(getServiceName() + " cloud storage upgraded to PREMIUM (more space/features).");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for cloud storage: " + getServiceName() + (premium ? " (premium plan)" : " (basic plan)"));
    }
}