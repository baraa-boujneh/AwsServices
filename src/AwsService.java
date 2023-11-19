public  class  AwsService {
    private String ServiceName;
    public AwsService(String ServiceName){
        this.ServiceName=ServiceName;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }
    public String getServiceDescription(){
        return null;
    }

    public String toString() {
        return "AwsService{" +
                "ServiceName='" + getServiceName() + '\'' +
                '}';
    }
}
