package com.ss.android.lark.tangram.base.style;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u00017Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\b\u00102\u001a\u00020\u0000H\u0016J\u0013\u00103\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020\nH\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001c¨\u00068"}, d2 = {"Lcom/ss/android/lark/tangram/base/style/TCStyle;", "Ljava/io/Serializable;", "width", "Lcom/ss/android/lark/tangram/base/style/Value;", "height", "minWidth", "minHeight", "maxWidth", "maxHeight", "growWeight", "", "shrinkWeight", "scaleWidth", "scaleHeight", "(Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;IILcom/ss/android/lark/tangram/base/style/Value;Lcom/ss/android/lark/tangram/base/style/Value;)V", "aspectRatio", "", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getGrowWeight", "()I", "setGrowWeight", "(I)V", "getHeight", "()Lcom/ss/android/lark/tangram/base/style/Value;", "setHeight", "(Lcom/ss/android/lark/tangram/base/style/Value;)V", "isDataChange", "", "()Z", "setDataChange", "(Z)V", "getMaxHeight", "setMaxHeight", "getMaxWidth", "setMaxWidth", "getMinHeight", "setMinHeight", "getMinWidth", "setMinWidth", "getScaleHeight", "setScaleHeight", "getScaleWidth", "setScaleWidth", "getShrinkWeight", "setShrinkWeight", "getWidth", "setWidth", "clone", "equals", "other", "", "hashCode", "Builder", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
public class TCStyle implements Serializable {
    private float aspectRatio;
    private int growWeight;
    private Value height;
    private boolean isDataChange;
    private Value maxHeight;
    private Value maxWidth;
    private Value minHeight;
    private Value minWidth;
    private Value scaleHeight;
    private Value scaleWidth;
    private int shrinkWeight;
    private Value width;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0016J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e¨\u0006)"}, d2 = {"Lcom/ss/android/lark/tangram/base/style/TCStyle$Builder;", "", "()V", "growWeight", "", "getGrowWeight", "()I", "setGrowWeight", "(I)V", "height", "Lcom/ss/android/lark/tangram/base/style/Value;", "getHeight", "()Lcom/ss/android/lark/tangram/base/style/Value;", "setHeight", "(Lcom/ss/android/lark/tangram/base/style/Value;)V", "maxHeight", "getMaxHeight", "setMaxHeight", "maxWidth", "getMaxWidth", "setMaxWidth", "minHeight", "getMinHeight", "setMinHeight", "minWidth", "getMinWidth", "setMinWidth", "scaleHeight", "getScaleHeight", "setScaleHeight", "scaleWidth", "getScaleWidth", "setScaleWidth", "shrinkWeight", "getShrinkWeight", "setShrinkWeight", "width", "getWidth", "setWidth", "build", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.style.TCStyle$a */
    public static class Builder {

        /* renamed from: a */
        private Value f136665a = Value.Companion.mo188866a();

        /* renamed from: b */
        private Value f136666b = Value.Companion.mo188866a();

        /* renamed from: c */
        private Value f136667c = Value.Companion.mo188866a();

        /* renamed from: d */
        private Value f136668d = Value.Companion.mo188866a();

        /* renamed from: e */
        private Value f136669e = Value.Companion.mo188866a();

        /* renamed from: f */
        private Value f136670f = Value.Companion.mo188866a();

        /* renamed from: g */
        private Value f136671g = Value.Companion.mo188866a();

        /* renamed from: h */
        private Value f136672h = Value.Companion.mo188866a();

        /* renamed from: i */
        private int f136673i;

        /* renamed from: j */
        private int f136674j;

        /* renamed from: b */
        public final Value mo188847b() {
            return this.f136665a;
        }

        /* renamed from: c */
        public final Value mo188848c() {
            return this.f136666b;
        }

        /* renamed from: d */
        public final Value mo188849d() {
            return this.f136669e;
        }

        /* renamed from: e */
        public final Value mo188850e() {
            return this.f136670f;
        }

        /* renamed from: f */
        public final Value mo188851f() {
            return this.f136671g;
        }

        /* renamed from: g */
        public final Value mo188852g() {
            return this.f136672h;
        }

        /* renamed from: h */
        public final int mo188853h() {
            return this.f136673i;
        }

        /* renamed from: i */
        public final int mo188854i() {
            return this.f136674j;
        }
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public int getGrowWeight() {
        return this.growWeight;
    }

    public Value getHeight() {
        return this.height;
    }

    public Value getMaxHeight() {
        return this.maxHeight;
    }

    public Value getMaxWidth() {
        return this.maxWidth;
    }

    public Value getMinHeight() {
        return this.minHeight;
    }

    public Value getMinWidth() {
        return this.minWidth;
    }

    public Value getScaleHeight() {
        return this.scaleHeight;
    }

    public Value getScaleWidth() {
        return this.scaleWidth;
    }

    public int getShrinkWeight() {
        return this.shrinkWeight;
    }

    public Value getWidth() {
        return this.width;
    }

    public final boolean isDataChange() {
        return this.isDataChange;
    }

    @Override // java.lang.Object
    public TCStyle clone() {
        TCStyle tCStyle = new TCStyle(getWidth(), getHeight(), getMinWidth(), getMinHeight(), getMaxWidth(), getMaxHeight(), getGrowWeight(), getShrinkWeight(), getScaleWidth(), getScaleHeight());
        tCStyle.setAspectRatio(getAspectRatio());
        return tCStyle;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Value width2 = getWidth();
        int i6 = 0;
        if (width2 != null) {
            i = width2.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        Value height2 = getHeight();
        if (height2 != null) {
            i2 = height2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        Value minWidth2 = getMinWidth();
        if (minWidth2 != null) {
            i3 = minWidth2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        Value minHeight2 = getMinHeight();
        if (minHeight2 != null) {
            i4 = minHeight2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        Value maxWidth2 = getMaxWidth();
        if (maxWidth2 != null) {
            i5 = maxWidth2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        Value maxHeight2 = getMaxHeight();
        if (maxHeight2 != null) {
            i6 = maxHeight2.hashCode();
        }
        return ((((((((i11 + i6) * 31) + getGrowWeight()) * 31) + getShrinkWeight()) * 31) + Float.floatToIntBits(getAspectRatio())) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.isDataChange);
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setDataChange(boolean z) {
        this.isDataChange = z;
    }

    public void setGrowWeight(int i) {
        this.growWeight = i;
    }

    public void setHeight(Value value) {
        this.height = value;
    }

    public void setMaxHeight(Value value) {
        this.maxHeight = value;
    }

    public void setMaxWidth(Value value) {
        this.maxWidth = value;
    }

    public void setMinHeight(Value value) {
        this.minHeight = value;
    }

    public void setMinWidth(Value value) {
        this.minWidth = value;
    }

    public void setShrinkWeight(int i) {
        this.shrinkWeight = i;
    }

    public void setWidth(Value value) {
        this.width = value;
    }

    public void setScaleHeight(Value value) {
        Intrinsics.checkParameterIsNotNull(value, "<set-?>");
        this.scaleHeight = value;
    }

    public void setScaleWidth(Value value) {
        Intrinsics.checkParameterIsNotNull(value, "<set-?>");
        this.scaleWidth = value;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            TCStyle tCStyle = (TCStyle) obj;
            if (!(!Intrinsics.areEqual(getWidth(), tCStyle.getWidth())) && !(!Intrinsics.areEqual(getHeight(), tCStyle.getHeight())) && !(!Intrinsics.areEqual(getMinWidth(), tCStyle.getMinWidth())) && !(!Intrinsics.areEqual(getMinHeight(), tCStyle.getMinHeight())) && !(!Intrinsics.areEqual(getMaxWidth(), tCStyle.getMaxWidth())) && !(!Intrinsics.areEqual(getMaxHeight(), tCStyle.getMaxHeight())) && getGrowWeight() == tCStyle.getGrowWeight() && getShrinkWeight() == tCStyle.getShrinkWeight() && getAspectRatio() == tCStyle.getAspectRatio() && this.isDataChange == tCStyle.isDataChange) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.tangram.base.style.TCStyle");
    }

    public TCStyle(Value value, Value value2, Value value3, Value value4, Value value5, Value value6, int i, int i2, Value value7, Value value8) {
        Intrinsics.checkParameterIsNotNull(value7, "scaleWidth");
        Intrinsics.checkParameterIsNotNull(value8, "scaleHeight");
        this.width = value;
        this.height = value2;
        this.minWidth = value3;
        this.minHeight = value4;
        this.maxWidth = value5;
        this.maxHeight = value6;
        this.growWeight = i;
        this.shrinkWeight = i2;
        this.scaleWidth = value7;
        this.scaleHeight = value8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TCStyle(com.ss.android.lark.tangram.base.style.Value r14, com.ss.android.lark.tangram.base.style.Value r15, com.ss.android.lark.tangram.base.style.Value r16, com.ss.android.lark.tangram.base.style.Value r17, com.ss.android.lark.tangram.base.style.Value r18, com.ss.android.lark.tangram.base.style.Value r19, int r20, int r21, com.ss.android.lark.tangram.base.style.Value r22, com.ss.android.lark.tangram.base.style.Value r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.tangram.base.style.TCStyle.<init>(com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, int, int, com.ss.android.lark.tangram.base.style.Value, com.ss.android.lark.tangram.base.style.Value, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
