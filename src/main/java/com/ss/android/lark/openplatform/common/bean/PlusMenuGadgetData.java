package com.ss.android.lark.openplatform.common.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PlusMenuGadgetData implements Serializable {
    @SerializedName("authorizedAppList")
    private List<C48826a> authorizedAppList;
    @SerializedName("groupAppList")
    private List<String> groupAppList;
    @SerializedName("minUpdateInterval")
    private long minUpdateInterval;
    @SerializedName("p2pAppList")
    private List<String> p2pAppList;

    public long getMinUpdateInterval() {
        return this.minUpdateInterval;
    }

    public List<C48826a> getAuthorizedAppList() {
        List<C48826a> list = this.authorizedAppList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public List<String> getGroupAppList() {
        List<String> list = this.groupAppList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public List<String> getP2pAppList() {
        List<String> list = this.p2pAppList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public void setAuthorizedAppList(List<C48826a> list) {
        this.authorizedAppList = list;
    }

    public void setGroupAppList(List<String> list) {
        this.groupAppList = list;
    }

    public void setMinUpdateInterval(long j) {
        this.minUpdateInterval = j;
    }

    public void setP2pAppList(List<String> list) {
        this.p2pAppList = list;
    }
}
