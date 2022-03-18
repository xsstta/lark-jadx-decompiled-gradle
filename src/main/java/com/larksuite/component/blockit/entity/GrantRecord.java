package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.Map;

public class GrantRecord implements Serializable {
    public String avatarUrl;
    public String grantRecordId;
    public GrantRecordType grantRecordType;
    public Map<String, String> name;
    public Role role;
    public Map<String, String> subName;
}
