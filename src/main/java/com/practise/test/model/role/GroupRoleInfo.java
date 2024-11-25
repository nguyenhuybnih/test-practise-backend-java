package com.practise.test.model.role;

public class GroupRoleInfo {
    private String name;
    private String displayName;

    public GroupRoleInfo() {
    }

    public GroupRoleInfo(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
