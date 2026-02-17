public class StreamingService extends Service implements PremiumFeature {

    private boolean premium;


    public StreamingService(String serviceName, int serviceId){
        super(serviceName, serviceId);
        this.premium = false;
    }


    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal

        if (!isActive()) {
            System.out.println(getServiceName() + " is inactive. Cannot stream now.");
            return;
        }

        if (premium) {
            System.out.println("Streaming in PREMIUM quality from " + getServiceName() + "!");
        } else {
            System.out.println("Streaming in standard quality from " + getServiceName() + ".");
        }

    }

    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println(getServiceName() + " upgraded to PREMIUM.");
    }
}