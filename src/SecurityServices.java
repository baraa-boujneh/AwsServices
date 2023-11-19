public class SecurityServices extends AwsService {
    private String ServiceName;
    private String ServiceDescription;
    public SecurityServices(String ServiceName, String serviceDescription){
        super(ServiceName);
        this.ServiceDescription = serviceDescription;
    }
    @Override
    public String getServiceDescription() {
        return ServiceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        ServiceDescription = serviceDescription;
    }

    @Override
    public String toString() {
        return "AwsService{" +
                "ServiceName='" + getServiceName() + '\'' +
                "ServiceDescription='"+getServiceDescription() + '\'' +
                '}';
    }


}