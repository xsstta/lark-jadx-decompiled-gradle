package com.bytedance.ee.bear.drive.biz.permission.model;

import java.io.Serializable;

public class ThirdPartyAttachmentPermission implements Serializable {
    private int copy;
    private int edit;
    private int export;
    private int view;

    public int getCopy() {
        return this.copy;
    }

    public int getEdit() {
        return this.edit;
    }

    public int getExport() {
        return this.export;
    }

    public int getView() {
        return this.view;
    }

    public String toString() {
        return "ThirdPartyAttachmentPermission{edit=" + this.edit + ", view=" + this.view + ", export=" + this.export + ", copy=" + this.copy + '}';
    }

    public void setCopy(int i) {
        this.copy = i;
    }

    public void setEdit(int i) {
        this.edit = i;
    }

    public void setExport(int i) {
        this.export = i;
    }

    public void setView(int i) {
        this.view = i;
    }
}
