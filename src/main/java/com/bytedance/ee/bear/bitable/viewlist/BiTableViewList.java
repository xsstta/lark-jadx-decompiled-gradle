package com.bytedance.ee.bear.bitable.viewlist;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewList;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "editable", "", "getEditable", "()Ljava/lang/Boolean;", "setEditable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "tableId", "", "getTableId", "()Ljava/lang/String;", "setTableId", "(Ljava/lang/String;)V", "views", "", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewItem;", "getViews", "()Ljava/util/List;", "setViews", "(Ljava/util/List;)V", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BiTableViewList implements NonProguard {
    private Boolean editable;
    private String tableId;
    private List<BiTableViewItem> views;

    public final Boolean getEditable() {
        return this.editable;
    }

    public final String getTableId() {
        return this.tableId;
    }

    public final List<BiTableViewItem> getViews() {
        return this.views;
    }

    public String toString() {
        return "BiTableViewList(tableId=" + this.tableId + ", views=" + this.views + ')';
    }

    public final void setEditable(Boolean bool) {
        this.editable = bool;
    }

    public final void setTableId(String str) {
        this.tableId = str;
    }

    public final void setViews(List<BiTableViewItem> list) {
        this.views = list;
    }
}
