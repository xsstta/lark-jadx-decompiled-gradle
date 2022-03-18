package com.bytedance.ee.bear.bitable.card.model.jsmodel.common;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "id", "", "color", "textColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getId", "setId", "getTextColor", "setTextColor", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ColorBean implements NonProguard {
    private String color;
    private String id;
    private String textColor;

    public ColorBean() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ColorBean copy$default(ColorBean colorBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colorBean.id;
        }
        if ((i & 2) != 0) {
            str2 = colorBean.color;
        }
        if ((i & 4) != 0) {
            str3 = colorBean.textColor;
        }
        return colorBean.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.color;
    }

    public final String component3() {
        return this.textColor;
    }

    public final ColorBean copy(String str, String str2, String str3) {
        return new ColorBean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorBean)) {
            return false;
        }
        ColorBean colorBean = (ColorBean) obj;
        return Intrinsics.areEqual(this.id, colorBean.id) && Intrinsics.areEqual(this.color, colorBean.color) && Intrinsics.areEqual(this.textColor, colorBean.textColor);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ColorBean(id=" + this.id + ", color=" + this.color + ", textColor=" + this.textColor + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public ColorBean(String str, String str2, String str3) {
        this.id = str;
        this.color = str2;
        this.textColor = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColorBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
