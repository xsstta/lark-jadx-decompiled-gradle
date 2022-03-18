package com.bytedance.ee.bear.bitable.card.model.jsmodel.common;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorListResult;", "Lcom/bytedance/ee/util/io/NonProguard;", "ColorList", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "([Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;)V", "getColorList", "()[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "setColorList", "[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "component1", "copy", "([Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;)Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorListResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ColorListResult implements NonProguard {
    private ColorBean[] ColorList;

    public ColorListResult() {
        this(null, 1, null);
    }

    public static /* synthetic */ ColorListResult copy$default(ColorListResult colorListResult, ColorBean[] colorBeanArr, int i, Object obj) {
        if ((i & 1) != 0) {
            colorBeanArr = colorListResult.ColorList;
        }
        return colorListResult.copy(colorBeanArr);
    }

    public final ColorBean[] component1() {
        return this.ColorList;
    }

    public final ColorListResult copy(ColorBean[] colorBeanArr) {
        return new ColorListResult(colorBeanArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ColorListResult) && Intrinsics.areEqual(this.ColorList, ((ColorListResult) obj).ColorList);
        }
        return true;
    }

    public int hashCode() {
        ColorBean[] colorBeanArr = this.ColorList;
        if (colorBeanArr != null) {
            return Arrays.hashCode(colorBeanArr);
        }
        return 0;
    }

    public String toString() {
        return "ColorListResult(ColorList=" + Arrays.toString(this.ColorList) + ")";
    }

    public final ColorBean[] getColorList() {
        return this.ColorList;
    }

    public final void setColorList(ColorBean[] colorBeanArr) {
        this.ColorList = colorBeanArr;
    }

    public ColorListResult(ColorBean[] colorBeanArr) {
        this.ColorList = colorBeanArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColorListResult(ColorBean[] colorBeanArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : colorBeanArr);
    }
}
