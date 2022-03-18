package com.bytedance.ee.bear.bitable.card.model.jsmodel.commands;

import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/SetFieldAttrBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "tableId", "", "viewId", "fieldId", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandDataBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandDataBean;)V", "cmd", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandType;", "getCmd", "()Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandType;", "getData", "()Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandDataBean;", "setData", "(Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandDataBean;)V", "getFieldId", "()Ljava/lang/String;", "setFieldId", "(Ljava/lang/String;)V", "getTableId", "setTableId", "getViewId", "setViewId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SetFieldAttrBean implements NonProguard {
    private final FieldCommandType cmd;
    private FieldCommandDataBean data;
    private String fieldId;
    private String tableId;
    private String viewId;

    public SetFieldAttrBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SetFieldAttrBean copy$default(SetFieldAttrBean setFieldAttrBean, String str, String str2, String str3, FieldCommandDataBean fieldCommandDataBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setFieldAttrBean.tableId;
        }
        if ((i & 2) != 0) {
            str2 = setFieldAttrBean.viewId;
        }
        if ((i & 4) != 0) {
            str3 = setFieldAttrBean.fieldId;
        }
        if ((i & 8) != 0) {
            fieldCommandDataBean = setFieldAttrBean.data;
        }
        return setFieldAttrBean.copy(str, str2, str3, fieldCommandDataBean);
    }

    public final String component1() {
        return this.tableId;
    }

    public final String component2() {
        return this.viewId;
    }

    public final String component3() {
        return this.fieldId;
    }

    public final FieldCommandDataBean component4() {
        return this.data;
    }

    public final SetFieldAttrBean copy(String str, String str2, String str3, FieldCommandDataBean fieldCommandDataBean) {
        return new SetFieldAttrBean(str, str2, str3, fieldCommandDataBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetFieldAttrBean)) {
            return false;
        }
        SetFieldAttrBean setFieldAttrBean = (SetFieldAttrBean) obj;
        return Intrinsics.areEqual(this.tableId, setFieldAttrBean.tableId) && Intrinsics.areEqual(this.viewId, setFieldAttrBean.viewId) && Intrinsics.areEqual(this.fieldId, setFieldAttrBean.fieldId) && Intrinsics.areEqual(this.data, setFieldAttrBean.data);
    }

    public int hashCode() {
        String str = this.tableId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.viewId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fieldId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        FieldCommandDataBean fieldCommandDataBean = this.data;
        if (fieldCommandDataBean != null) {
            i = fieldCommandDataBean.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "SetFieldAttrBean(tableId=" + this.tableId + ", viewId=" + this.viewId + ", fieldId=" + this.fieldId + ", data=" + this.data + ")";
    }

    public final FieldCommandType getCmd() {
        return this.cmd;
    }

    public final FieldCommandDataBean getData() {
        return this.data;
    }

    public final String getFieldId() {
        return this.fieldId;
    }

    public final String getTableId() {
        return this.tableId;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public final void setData(FieldCommandDataBean fieldCommandDataBean) {
        this.data = fieldCommandDataBean;
    }

    public final void setFieldId(String str) {
        this.fieldId = str;
    }

    public final void setTableId(String str) {
        this.tableId = str;
    }

    public final void setViewId(String str) {
        this.viewId = str;
    }

    public SetFieldAttrBean(String str, String str2, String str3, FieldCommandDataBean fieldCommandDataBean) {
        this.tableId = str;
        this.viewId = str2;
        this.fieldId = str3;
        this.data = fieldCommandDataBean;
        this.cmd = FieldCommandType.SET_FIELD_ATTR;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetFieldAttrBean(String str, String str2, String str3, FieldCommandDataBean fieldCommandDataBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : fieldCommandDataBean);
    }
}
