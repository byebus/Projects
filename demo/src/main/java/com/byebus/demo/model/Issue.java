package com.byebus.demo.model;

public class Issue {
    private Integer issue_id ;
    private String issue_name;
    private String description;
    private String status;

    /**
     * @return the issue_id
     */
    public Integer getIssue_id() {
        return issue_id;
    }

    /**
     * @param issue_id the issue_id to set
     */
    public void setIssue_id(Integer issue_id) {
        this.issue_id = issue_id;
    }

    /**
     * @return the issue_name
     */
    public String getIssue_name() {
        return issue_name;
    }

    /**
     * @param issue_name the issue_name to set
     */
    public void setIssue_name(String issue_name) {
        this.issue_name = issue_name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }




}
