package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class MGetBlockRequest implements Serializable {
    public List<String> blockIDs;
    public String locale;
    public String tenantID;
    public String userID;
}
