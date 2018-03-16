package com.fus05375.model;

public class Product {

    private String jobName;
    private String jobCategory;
    private String jobDescription;
    private double jobSalary;
    private String jobCondition;
    private String jobStatus;
    private String jobManufacturer;
    private double noOfCandidates;


    public double getNoOfCandidates() {
        return noOfCandidates;
    }

    public void setNoOfCandidates(double noOfCandidates) {
        this.noOfCandidates = noOfCandidates;
    }



    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public double getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(double jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getJobCondition() {
        return jobCondition;
    }

    public void setJobCondition(String jobCondition) {
        this.jobCondition = jobCondition;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobManufacturer() {
        return jobManufacturer;
    }

    public void setJobManufacturer(String jobManufacturer) {
        this.jobManufacturer = jobManufacturer;
    }
}
