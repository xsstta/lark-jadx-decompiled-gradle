package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabListGrootCellPayload implements Serializable {
    private List<String> calDeleteHistoryIds;
    private List<VCTabListItem> calInsertTopItems;
    private List<VCTabListItem> calUpdateItems;
    private List<String> deleteHistoryIds;
    private List<String> enterpriseDeleteHistoryIds;
    private List<VCTabListItem> enterpriseInsertTopItems;
    private List<VCTabListItem> enterpriseUpdateItems;
    private List<VCTabListItem> insertTopItems;
    private List<VCTabListItem> updateItems;

    public List<String> getCalDeleteHistoryIds() {
        return this.calDeleteHistoryIds;
    }

    public List<VCTabListItem> getCalInsertTopItems() {
        return this.calInsertTopItems;
    }

    public List<VCTabListItem> getCalUpdateItems() {
        return this.calUpdateItems;
    }

    public List<String> getDeleteHistoryIds() {
        return this.deleteHistoryIds;
    }

    public List<String> getEnterpriseDeleteHistoryIds() {
        return this.enterpriseDeleteHistoryIds;
    }

    public List<VCTabListItem> getEnterpriseInsertTopItems() {
        return this.enterpriseInsertTopItems;
    }

    public List<VCTabListItem> getEnterpriseUpdateItems() {
        return this.enterpriseUpdateItems;
    }

    public List<VCTabListItem> getInsertTopItems() {
        return this.insertTopItems;
    }

    public List<VCTabListItem> getUpdateItems() {
        return this.updateItems;
    }

    public String toString() {
        return "VCTabListGrootCellPayload{insertTopItems=" + this.insertTopItems + ", updateItems=" + this.updateItems + ", deleteHistoryIds=" + this.deleteHistoryIds + ", calInsertTopItems=" + this.calInsertTopItems + ", calUpdateItems=" + this.calUpdateItems + ", calDeleteHistoryIds=" + this.calDeleteHistoryIds + ", enterpriseInsertTopItems=" + this.enterpriseInsertTopItems + ", enterpriseUpdateItems=" + this.enterpriseUpdateItems + ", enterpriseDeleteHistoryIds=" + this.enterpriseDeleteHistoryIds + '}';
    }

    public void setCalDeleteHistoryIds(List<String> list) {
        this.calDeleteHistoryIds = list;
    }

    public void setCalInsertTopItems(List<VCTabListItem> list) {
        this.calInsertTopItems = list;
    }

    public void setCalUpdateItems(List<VCTabListItem> list) {
        this.calUpdateItems = list;
    }

    public void setDeleteHistoryIds(List<String> list) {
        this.deleteHistoryIds = list;
    }

    public void setEnterpriseDeleteHistoryIds(List<String> list) {
        this.enterpriseDeleteHistoryIds = list;
    }

    public void setEnterpriseInsertTopItems(List<VCTabListItem> list) {
        this.enterpriseInsertTopItems = list;
    }

    public void setEnterpriseUpdateItems(List<VCTabListItem> list) {
        this.enterpriseUpdateItems = list;
    }

    public void setInsertTopItems(List<VCTabListItem> list) {
        this.insertTopItems = list;
    }

    public void setUpdateItems(List<VCTabListItem> list) {
        this.updateItems = list;
    }
}
