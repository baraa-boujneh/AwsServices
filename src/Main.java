// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class Main {
    public static HashMap<String, AwsService> compute_service;
    public static HashMap<String, AwsService> storage_services;
    public static HashMap<String, AwsService> security_services;
    public static HashMap<String, AwsService> cost_management_services;
    public static HashMap<String, AwsService> networking_services;
    public static HashMap<String, AwsService> management_services;
    public static HashMap<String, AwsService> database_services;

    public static AwsService find_element_category(String key) throws Exception {

        if (compute_service.containsKey(key))
            return compute_service.get(key);
        else if (storage_services.containsKey(key))
            return storage_services.get(key);
        else if (security_services.containsKey(key))
            return security_services.get(key);
        else if (cost_management_services.containsKey(key))
            return cost_management_services.get(key);
        else if (networking_services.containsKey(key))
            return networking_services.get(key);
        else if (management_services.containsKey(key))
            return management_services.get(key);
        else if (database_services.containsKey(key))
            return database_services.get(key);
        else
            throw new Exception();
    }

    private static void display_result(HashMap<String, List<AwsService>> Output) {
        Iterator<Map.Entry<String, List<AwsService>>> iterator = Output.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<AwsService>> entry = iterator.next();
            String key = entry.getKey();
            List<AwsService> list_services = entry.getValue();
            System.out.println( key);
            for (AwsService a: list_services)
            System.out.println( "Service : "+a.getServiceName()+ " || Description : "+a.getServiceDescription());

        }
    }



    public static void main(String[] args) {

        AwsService cs1 = new ComputeService("Amazon EC2", "Amazon EC2 prime offers resizable virtual servers on-demand, providing scalable compute capacity in the cloud");
        AwsService cs2 = new ComputeService("Aws lambda", "AWS Lambda lets you run code without provisioning or managing servers.");
        AwsService cs3 = new ComputeService("AWS elastic Beanstalk", "AWS Elastic Beanstalk is an easy-to-use service for deploying and scaling web applications and services.");
        AwsService cs4 = new ComputeService("Amazon EC2 Auto Scaling", "Amazon EC2 Auto Scaling automatically adjusts the number of Amazon EC2 instances in a scale group.");
        AwsService cs5 = new ComputeService("Amazon ECS", "Amazon Elastic Container Service (Amazon ECS) is a fully managed container orchestration service.");
        AwsService cs6 = new ComputeService("Amazon EKS", "Amazon Elastic Kubernetes Service (Amazon EKS) is a managed Kubernetes service.");
        AwsService cs7 = new ComputeService("Amazon ECR", "Amazon Elastic Container Registry (Amazon ECR) is a fully managed container registry service.");
        AwsService cs8 = new ComputeService("AWS Fargate", "AWS Fargate is a serverless compute engine for containers.");

        compute_service = new HashMap<>();
        compute_service.put(cs1.getServiceName().toLowerCase(), cs1);
        compute_service.put(cs2.getServiceName().toLowerCase(), cs2);
        compute_service.put(cs3.getServiceName().toLowerCase(), cs3);
        compute_service.put(cs4.getServiceName().toLowerCase(), cs4);
        compute_service.put(cs5.getServiceName().toLowerCase(), cs5);
        compute_service.put(cs6.getServiceName().toLowerCase(), cs6);
        compute_service.put(cs7.getServiceName().toLowerCase(), cs7);
        compute_service.put(cs8.getServiceName().toLowerCase(), cs8);


        AwsService ss1 = new SecurityServices("AWS IAM", "AWS Identity and Access Management (IAM) enables you to manage access to AWS services and resources securely.");
        AwsService ss2 = new SecurityServices("Amazon Cognito", "Amazon Cognito provides authentication, authorization, and user management for your web and mobile apps.");
        AwsService ss3 = new SecurityServices("AWS Shield", "AWS Shield provides protection against DDoS attacks.");
        AwsService ss4 = new SecurityServices("AWS Artifact", "AWS Artifact provides access to compliance reports and other documents.");
        AwsService ss5 = new SecurityServices("AWS KMS", "AWS Key Management Service (KMS) is a managed encryption service.");

        security_services = new HashMap<>();
        security_services.put(ss1.getServiceName().toLowerCase(), ss1);
        security_services.put(ss2.getServiceName().toLowerCase(), ss2);
        security_services.put(ss3.getServiceName().toLowerCase(), ss3);
        security_services.put(ss4.getServiceName().toLowerCase(), ss4);
        security_services.put(ss5.getServiceName().toLowerCase(), ss5);

        AwsService sts1 = new StorageServices("Amazon S3", "Amazon Simple Storage Service (Amazon S3) is an object storage service that offers scalability, data availability, security, and performance.");
        AwsService sts2 = new StorageServices("Amazon S3 Glacier", "Amazon S3 Glacier is a secure, durable, and extremely low-cost storage service for data archiving and backup.");
        AwsService sts3 = new StorageServices("Amazon EFS", "Amazon Elastic File System (Amazon EFS) provides scalable file storage for use with Amazon EC2 instances.");
        AwsService sts4 = new StorageServices("Amazon EBS", "Amazon Elastic Block Store (Amazon EBS) provides block-level storage volumes for use with Amazon EC2 instances.");
        storage_services = new HashMap<>();
        storage_services.put(sts1.getServiceName().toLowerCase(), sts1);
        storage_services.put(sts2.getServiceName().toLowerCase(), sts2);
        storage_services.put(sts3.getServiceName().toLowerCase(), sts3);
        storage_services.put(sts4.getServiceName().toLowerCase(), sts4);


        AwsService db1 = new DatabaseServices("Amazon RDS", "Amazon Relational Database Service (Amazon RDS) is a managed relational database service.");
        AwsService db2 = new DatabaseServices("Amazon DynamoDB", "Amazon DynamoDB is a managed NoSQL database service.");
        AwsService db3 = new DatabaseServices("Amazon Redshift", "Amazon Redshift is a fast, fully managed data warehouse service.");
        AwsService db4 = new DatabaseServices("Amazon Aurora", "Amazon Aurora is a MySQL and PostgreSQL-compatible relational database built for the cloud, that combines the performance and availability of high-end commercial databases with the simplicity and cost-effectiveness of open source databases.");

        database_services = new HashMap<>();
        database_services.put(db1.getServiceName().toLowerCase(), db1);
        database_services.put(db2.getServiceName().toLowerCase(), db2);
        database_services.put(db3.getServiceName().toLowerCase(), db3);
        database_services.put(db4.getServiceName().toLowerCase(), db4);

        AwsService ns1 = new NetworkingServices("Amazon VPC", "Amazon Virtual Private Cloud (Amazon VPC) enables you to launch Amazon Web Services (AWS) resources into a virtual network.");
        AwsService ns2 = new NetworkingServices("Amazon Route 53", "Amazon Route 53 is a scalable domain name system (DNS) web service designed to provide highly reliable and cost-effective domain registration, DNS routing, and health checking of resources within your environment.");
        AwsService ns3 = new NetworkingServices("Amazon CloudFront", "Amazon CloudFront is a fast content delivery network (CDN) service that securely delivers data, videos, applications, and APIs to customers globally.");
        AwsService ns4 = new NetworkingServices("Elastic Load Balancing", "Elastic Load Balancing automatically distributes incoming application traffic across multiple targets, such as EC2 instances, containers, and IP addresses, in one or more Availability Zones.");

         networking_services = new HashMap<>();
        networking_services.put(ns1.getServiceName().toLowerCase(), ns1);
        networking_services.put(ns2.getServiceName().toLowerCase(), ns2);
        networking_services.put(ns3.getServiceName().toLowerCase(), ns3);
        networking_services.put(ns4.getServiceName().toLowerCase(), ns4);
        AwsService ms1 = new ManagementServices("AWS Trusted Advisor", "AWS Trusted Advisor provides recommendations for optimizing your AWS resources.");
        AwsService ms2 = new ManagementServices("AWS CloudWatch", "Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the applications you run on the cloud platform.");
        AwsService ms3 = new ManagementServices("AWS CloudTrail", "AWS CloudTrail records AWS API calls for your account and delivers log files to your Amazon S3 bucket.");
        AwsService ms4 = new ManagementServices("AWS Well-Architected Tool", "AWS Well-Architected Tool helps you review the state of your workloads and compares them to the latest AWS architectural best practices.");
        AwsService ms5 = new ManagementServices("AWS Auto Scaling", "AWS Auto Scaling monitors your applications and automatically adjusts capacity to maintain steady, predictable performance at the lowest possible cost.");
        AwsService ms6 = new ManagementServices("AWS Command Line Interface", "The AWS Command Line Interface (CLI) is a unified tool to manage your AWS services.");
        AwsService ms7 = new ManagementServices("AWS Config", "AWS Config is a service that enables you to assess, audit, and evaluate the configurations of your AWS resources.");
        AwsService ms8 = new ManagementServices("AWS Management Console", "The AWS Management Console provides an intuitive web-based interface for managing AWS services.");
        AwsService ms9 = new ManagementServices("AWS Organizations", "AWS Organizations helps you centrally govern your environment as you grow and scale your workloads on AWS.");
         management_services = new HashMap<>();
        management_services.put(ms1.getServiceName().toLowerCase(), ms1);
        management_services.put(ms2.getServiceName().toLowerCase(), ms2);
        management_services.put(ms3.getServiceName().toLowerCase(), ms3);
        management_services.put(ms4.getServiceName().toLowerCase(), ms4);
        management_services.put(ms5.getServiceName().toLowerCase(), ms5);
        management_services.put(ms6.getServiceName().toLowerCase(), ms6);
        management_services.put(ms7.getServiceName().toLowerCase() , ms7);
        management_services.put(ms8.getServiceName().toLowerCase(), ms8);
        management_services.put(ms9.getServiceName().toLowerCase(), ms9);

        AwsService cms1 = new CostManagementServices("AWS Cost & Usage Report", "AWS Cost & Usage Report provides comprehensive cost and usage information for your AWS account.");
        AwsService cms2 = new CostManagementServices("AWS Budgets", "AWS Budgets allows you to set custom cost and usage budgets for your account.");
        AwsService cms3 = new CostManagementServices("AWS Cost Explorer", "AWS Cost Explorer allows you to visualize and understand your AWS spending patterns.");

        cost_management_services = new HashMap<>();
        cost_management_services.put(cms1.getServiceName().toLowerCase(), cms1);
        cost_management_services.put(cms2.getServiceName().toLowerCase(), cms2);
        cost_management_services.put(cms3.getServiceName().toLowerCase(), cms3);
        HashMap<String, List<AwsService>> Output_result = new HashMap<>();
        try {


        List<String> Input = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("please enter your services (enter done to stop) :");
        while (true) {
            String input = s.nextLine();
            if (input.equalsIgnoreCase("done"))
                break;
            Input.add(input);
        }


        int i = 0;
        String current_Category = null;

        while (i < Input.size()) {
            AwsService element = find_element_category(Input.get(i).toLowerCase());
            String element_Category = element.getClass().getName();
            if (current_Category == null) {

                current_Category = element_Category;
                Output_result.put(current_Category, new ArrayList<AwsService>());
                Output_result.get(current_Category).add(element);
                i++;
                continue;
            }

            if (!element_Category.equalsIgnoreCase(current_Category)) {
                for (int j = i + 1; j < Input.size(); j++) {

                    AwsService next_element = find_element_category(Input.get(j).toLowerCase());
                    String next_elemnt_Category = next_element.getClass().getName();

                    if (next_elemnt_Category.equalsIgnoreCase(current_Category)) {
                        Output_result.get(current_Category).add(next_element);
                        Collections.swap(Input, i, j);
                        i++;
                    }
                }
                current_Category = null;
                continue;


            } else
                Output_result.get(current_Category).add(element);


            i++;


        }
        }
            catch (Exception e){
            System.out.println("please verify your inputs there is an invalid AWS service among them ");
            }

finally {
            display_result(Output_result);
        }

    }
}
