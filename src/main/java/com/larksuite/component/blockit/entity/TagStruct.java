package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class TagStruct implements Serializable {
    public boolean hasAdded;
    public String id;
    public String name;
    public List<GrantRecord> owners;
    public int permissionType;
    public boolean subscribed;
    public String teamworkerCount;
    public boolean unavailable;
}
