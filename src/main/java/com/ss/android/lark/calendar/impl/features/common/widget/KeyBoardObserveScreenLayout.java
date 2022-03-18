package com.ss.android.lark.calendar.impl.features.common.widget;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\b\u0010\u0015\u001a\u00020\u0013H\u0014J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/KeyBoardObserveScreenLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "lastBottom", "lastSystemKeyboardAction", "observers", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/KeyBoardObserveScreenLayout$IOnKeyBoardListener;", "screenHeight", "screenLocation", "", "addSysKeyboardObserver", "", "observer", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "IOnKeyBoardListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyBoardObserveScreenLayout extends FrameLayout {

    /* renamed from: a */
    public static final Companion f78727a = new Companion(null);

    /* renamed from: b */
    private int f78728b;

    /* renamed from: c */
    private final int[] f78729c;

    /* renamed from: d */
    private final int f78730d;

    /* renamed from: e */
    private int f78731e;

    /* renamed from: f */
    private final List<IOnKeyBoardListener> f78732f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/KeyBoardObserveScreenLayout$IOnKeyBoardListener;", "", "onKeyBoardHide", "", "onKeyBoardShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.KeyBoardObserveScreenLayout$b */
    public interface IOnKeyBoardListener {
        /* renamed from: a */
        void mo112863a();

        /* renamed from: b */
        void mo112864b();
    }

    public KeyBoardObserveScreenLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public KeyBoardObserveScreenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public KeyBoardObserveScreenLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/KeyBoardObserveScreenLayout$Companion;", "", "()V", "SYSTEM_KEYBOARD_HIDE", "", "SYSTEM_KEYBOARD_SHOW", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.KeyBoardObserveScreenLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78732f.clear();
    }

    /* renamed from: a */
    public final void mo112860a(IOnKeyBoardListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "observer");
        this.f78732f.add(bVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        getLocationOnScreen(this.f78729c);
        int i3 = 1;
        int size = View.MeasureSpec.getSize(i2) + this.f78729c[1];
        int i4 = this.f78730d / 10;
        boolean z2 = false;
        if (Math.abs(this.f78731e - size) > i4) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f78732f.isEmpty()) {
            if (Math.abs(this.f78730d - size) < i4) {
                z2 = true;
            }
            if (!z2) {
                i3 = 2;
            }
            if (i3 != this.f78728b) {
                if (z2) {
                    Iterator<T> it = this.f78732f.iterator();
                    while (it.hasNext()) {
                        it.next().mo112864b();
                    }
                } else {
                    Iterator<T> it2 = this.f78732f.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo112863a();
                    }
                }
                this.f78728b = i3;
            }
            this.f78731e = size;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyBoardObserveScreenLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78729c = new int[2];
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Point point = new Point();
            ((WindowManager) systemService).getDefaultDisplay().getSize(point);
            int max = Math.max(point.y, point.x);
            this.f78730d = max;
            this.f78731e = max;
            this.f78732f = new ArrayList();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyBoardObserveScreenLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
