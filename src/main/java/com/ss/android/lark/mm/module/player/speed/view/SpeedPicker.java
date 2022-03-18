package com.ss.android.lark.mm.module.player.speed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\nH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/view/SpeedPicker;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/mm/module/player/speed/view/OnSpeedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "speed", "setSpeed", "(F)V", "toolBarListener", "Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;", "getLayoutRes", "init", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onSpeed", "pick", "playerListener", "sp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SpeedPicker extends LinearLayout implements OnSpeedListener {

    /* renamed from: a */
    private SpeedPickerDialog.ISpeedPickerDepend f117540a;

    /* renamed from: b */
    private float f117541b;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.mm_view_speed_picker;
    }

    /* renamed from: a */
    private final void m184918a() {
        LayoutInflater.from(getContext()).inflate(getLayoutRes(), this);
    }

    @Override // com.ss.android.lark.mm.module.player.speed.view.OnSpeedListener
    /* renamed from: a */
    public void mo164118a(float f) {
        SpeedPickerDialog.ISpeedPickerDepend aVar = this.f117540a;
        if (aVar != null) {
            aVar.mo164090a(f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeedPicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void setSpeed(float f) {
        this.f117541b = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                SpeedItem speedItem = (SpeedItem) childAt;
                if (Math.abs(f - speedItem.getSpeed()) < 0.1f) {
                    speedItem.mo164114a(true, false);
                    return;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.player.speed.view.SpeedItem");
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 2) {
            View childAt = getChildAt((int) (motionEvent.getX() / ((float) (getMeasuredWidth() / getChildCount()))));
            if (!(childAt instanceof SpeedItem)) {
                childAt = null;
            }
            SpeedItem speedItem = (SpeedItem) childAt;
            if (speedItem != null) {
                speedItem.mo164114a(true, true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo164119a(SpeedPickerDialog.ISpeedPickerDepend aVar, float f) {
        Intrinsics.checkParameterIsNotNull(aVar, "playerListener");
        this.f117540a = aVar;
        setSpeed(f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeedPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeedPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeedPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117541b = 1.0f;
        m184918a();
    }
}
