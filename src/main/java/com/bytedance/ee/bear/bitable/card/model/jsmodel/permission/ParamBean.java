package com.bytedance.ee.bear.bitable.card.model.jsmodel.permission;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/ParamBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "tableId", "", "viewId", "recordId", "fieldId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFieldId", "()Ljava/lang/String;", "setFieldId", "(Ljava/lang/String;)V", "getRecordId", "setRecordId", "getTableId", "setTableId", "getViewId", "setViewId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ParamBean implements NonProguard {
    private String fieldId;
    private String recordId;
    private String tableId;
    private String viewId;

    public ParamBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ParamBean copy$default(ParamBean paramBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paramBean.tableId;
        }
        if ((i & 2) != 0) {
            str2 = paramBean.viewId;
        }
        if ((i & 4) != 0) {
            str3 = paramBean.recordId;
        }
        if ((i & 8) != 0) {
            str4 = paramBean.fieldId;
        }
        return paramBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.tableId;
    }

    public final String component2() {
        return this.viewId;
    }

    public final String component3() {
        return this.recordId;
    }

    public final String component4() {
        return this.fieldId;
    }

    public final ParamBean copy(String str, String str2, String str3, String str4) {
        return new ParamBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamBean)) {
            return false;
        }
        ParamBean paramBean = (ParamBean) obj;
        return Intrinsics.areEqual(this.tableId, paramBean.tableId) && Intrinsics.areEqual(this.viewId, paramBean.viewId) && Intrinsics.areEqual(this.recordId, paramBean.recordId) && Intrinsics.areEqual(this.fieldId, paramBean.fieldId);
    }

    public int hashCode() {
        String str = this.tableId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.viewId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.recordId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fieldId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ParamBean(tableId=" + this.tableId + ", viewId=" + this.viewId + ", recordId=" + this.recordId + ", fieldId=" + this.fieldId + ")";
    }

    public final String getFieldId() {
        return this.fieldId;
    }

    public final String getRecordId() {
        return this.recordId;
    }

    public final String getTableId() {
        return this.tableId;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public final void setFieldId(String str) {
        this.fieldId = str;
    }

    public final void setRecordId(String str) {
        this.recordId = str;
    }

    public final void setTableId(String str) {
        this.tableId = str;
    }

    public final void setViewId(String str) {
        this.viewId = str;
    }

    public ParamBean(String str, String str2, String str3, String str4) {
        this.tableId = str;
        this.viewId = str2;
        this.recordId = str3;
        this.fieldId = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParamBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
