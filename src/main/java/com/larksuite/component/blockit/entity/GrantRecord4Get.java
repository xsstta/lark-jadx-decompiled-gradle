package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.Map;

public class GrantRecord4Get implements Serializable {
    public String avatarUrl;
    public String id;
    public Map<String, String> name;
    public Map<String, String> subName;
    public GrantRecordType type;
}
