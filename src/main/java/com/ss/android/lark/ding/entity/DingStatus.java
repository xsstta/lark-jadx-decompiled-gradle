package com.ss.android.lark.ding.entity;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DingStatus implements AbstractC26248b<DingStatus>, Serializable {
    private Map<String, String> chatterNameMap = new HashMap();
    private List<String> confirmedChatterIds = new ArrayList();
    private List<String> invisibleChatterIds = new ArrayList();
    private String messageId;
    private List<String> unconfirmedChatterIds = new ArrayList();

    public Map<String, String> getChatterNameMap() {
        return this.chatterNameMap;
    }

    public List<String> getConfirmedChatterIds() {
        return this.confirmedChatterIds;
    }

    public List<String> getInvisibleChatterIds() {
        return this.invisibleChatterIds;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public List<String> getUnconfirmedChatterIds() {
        return this.unconfirmedChatterIds;
    }

    public String toString() {
        return "DingStatus{confirmedChatterIds=" + this.confirmedChatterIds + ", unconfirmedChatterIds=" + this.unconfirmedChatterIds + '}';
    }

    public void setChatterNameMap(Map<String, String> map) {
        this.chatterNameMap = map;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public boolean isItemSame(DingStatus dingStatus) {
        return equals(dingStatus);
    }

    public void setConfirmedChatterIds(List<String> list) {
        this.confirmedChatterIds.clear();
        if (list != null) {
            this.confirmedChatterIds.addAll(list);
        }
    }

    public void setInvisibleChatterIds(List<String> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.invisibleChatterIds.addAll(list);
        }
    }

    public void setUnconfirmedChatterIds(List<String> list) {
        this.unconfirmedChatterIds.clear();
        if (list != null) {
            this.unconfirmedChatterIds.addAll(list);
        }
    }

    public boolean isContentSame(DingStatus dingStatus) {
        List<String> confirmedChatterIds2 = dingStatus.getConfirmedChatterIds();
        if (this.confirmedChatterIds.size() == confirmedChatterIds2.size() && this.confirmedChatterIds.containsAll(confirmedChatterIds2)) {
            List<String> unconfirmedChatterIds2 = dingStatus.getUnconfirmedChatterIds();
            if (this.unconfirmedChatterIds.size() == unconfirmedChatterIds2.size() && this.unconfirmedChatterIds.containsAll(unconfirmedChatterIds2)) {
                Map<String, String> map = dingStatus.chatterNameMap;
                if (this.chatterNameMap.size() != map.size() || !this.chatterNameMap.keySet().containsAll(map.keySet()) || !this.chatterNameMap.values().containsAll(map.values())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
