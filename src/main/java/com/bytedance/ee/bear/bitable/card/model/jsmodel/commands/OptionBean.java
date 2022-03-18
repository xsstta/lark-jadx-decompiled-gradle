package com.bytedance.ee.bear.bitable.card.model.jsmodel.commands;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "id", "", "name", "color", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/commands/OptionBean;", "equals", "", "other", "", "hashCode", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OptionBean implements NonProguard {
    private Integer color;
    private String id;
    private String name;

    public OptionBean() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OptionBean copy$default(OptionBean optionBean, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionBean.id;
        }
        if ((i & 2) != 0) {
            str2 = optionBean.name;
        }
        if ((i & 4) != 0) {
            num = optionBean.color;
        }
        return optionBean.copy(str, str2, num);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.color;
    }

    public final OptionBean copy(String str, String str2, Integer num) {
        return new OptionBean(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionBean)) {
            return false;
        }
        OptionBean optionBean = (OptionBean) obj;
        return Intrinsics.areEqual(this.id, optionBean.id) && Intrinsics.areEqual(this.name, optionBean.name) && Intrinsics.areEqual(this.color, optionBean.color);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.color;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "OptionBean(id=" + this.id + ", name=" + this.name + ", color=" + this.color + ")";
    }

    public final Integer getColor() {
        return this.color;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setColor(Integer num) {
        this.color = num;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public OptionBean(String str, String str2, Integer num) {
        this.id = str;
        this.name = str2;
        this.color = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OptionBean(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
