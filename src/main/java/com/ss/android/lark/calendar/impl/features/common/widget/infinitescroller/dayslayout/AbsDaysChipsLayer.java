package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysChipsLayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLayerDay", "getMLayerDay", "()I", "setMLayerDay", "(I)V", "clearLayerDay", "", "clearView", "getLayerDay", "isNotLayerDay", "", "setLayerDay", "day", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class AbsDaysChipsLayer extends FrameLayout {

    /* renamed from: a */
    private int f79039a;

    public AbsDaysChipsLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbsDaysChipsLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final void mo113310b() {
        this.f79039a = -1;
    }

    /* renamed from: c */
    public abstract void mo113311c();

    public final int getLayerDay() {
        return this.f79039a;
    }

    /* access modifiers changed from: protected */
    public final int getMLayerDay() {
        return this.f79039a;
    }

    /* renamed from: a */
    public final boolean mo113309a() {
        if (this.f79039a == -1) {
            return true;
        }
        return false;
    }

    public void setLayerDay(int i) {
        this.f79039a = i;
    }

    /* access modifiers changed from: protected */
    public final void setMLayerDay(int i) {
        this.f79039a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsDaysChipsLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79039a = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbsDaysChipsLayer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
