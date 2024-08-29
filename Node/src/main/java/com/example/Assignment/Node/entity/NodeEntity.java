package com.example.Assignment.Node.entity;


import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;



@Entity
@Table(name = "nodes")
public class NodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nodeId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9_\\- ]*$")
    private String nodeName;

    private String description;

    private String memo;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9_\\- ]*$")
    private String nodeType;

    private String parentNodeGroupName;

    private String parentNodeGroupId;

    private String parentNoder;

    // Getters and setters

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getParentNodeGroupName() {
        return parentNodeGroupName;
    }

    public void setParentNodeGroupName(String parentNodeGroupName) {
        this.parentNodeGroupName = parentNodeGroupName;
    }

    public String getParentNodeGroupId() {
        return parentNodeGroupId;
    }

    public void setParentNodeGroupId(String parentNodeGroupId) {
        this.parentNodeGroupId = parentNodeGroupId;
    }

    public String getParentNoder() {
        return parentNoder;
    }

    public void setParentNoder(String parentNoder) {
        this.parentNoder = parentNoder;
    }
}

