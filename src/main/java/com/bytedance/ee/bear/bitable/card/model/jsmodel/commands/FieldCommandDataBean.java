package com.bytedance.ee.bear.bitable.card.model.jsmodel.commands;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandDataBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "id", "", "name", ShareHitPoint.f121869d, "", "property", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getProperty", "()Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;", "setProperty", "(Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldPropertyBean;)Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/FieldCommandDataBean;", "equals", "", "other", "", "hashCode", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FieldCommandDataBean implements NonProguard {
    private String id;
    private String name;
    private FieldPropertyBean property;
    private Integer type;

    public FieldCommandDataBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FieldCommandDataBean copy$default(FieldCommandDataBean fieldCommandDataBean, String str, String str2, Integer num, FieldPropertyBean fieldPropertyBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldCommandDataBean.id;
        }
        if ((i & 2) != 0) {
            str2 = fieldCommandDataBean.name;
        }
        if ((i & 4) != 0) {
            num = fieldCommandDataBean.type;
        }
        if ((i & 8) != 0) {
            fieldPropertyBean = fieldCommandDataBean.property;
        }
        return fieldCommandDataBean.copy(str, str2, num, fieldPropertyBean);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.type;
    }

    public final FieldPropertyBean component4() {
        return this.property;
    }

    public final FieldCommandDataBean copy(String str, String str2, Integer num, FieldPropertyBean fieldPropertyBean) {
        return new FieldCommandDataBean(str, str2, num, fieldPropertyBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldCommandDataBean)) {
            return false;
        }
        FieldCommandDataBean fieldCommandDataBean = (FieldCommandDataBean) obj;
        return Intrinsics.areEqual(this.id, fieldCommandDataBean.id) && Intrinsics.areEqual(this.name, fieldCommandDataBean.name) && Intrinsics.areEqual(this.type, fieldCommandDataBean.type) && Intrinsics.areEqual(this.property, fieldCommandDataBean.property);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.type;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        FieldPropertyBean fieldPropertyBean = this.property;
        if (fieldPropertyBean != null) {
            i = fieldPropertyBean.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FieldCommandDataBean(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", property=" + this.property + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final FieldPropertyBean getProperty() {
        return this.property;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setProperty(FieldPropertyBean fieldPropertyBean) {
        this.property = fieldPropertyBean;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public FieldCommandDataBean(String str, String str2, Integer num, FieldPropertyBean fieldPropertyBean) {
        this.id = str;
        this.name = str2;
        this.type = num;
        this.property = fieldPropertyBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FieldCommandDataBean(String str, String str2, Integer num, FieldPropertyBean fieldPropertyBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : fieldPropertyBean);
    }
}
