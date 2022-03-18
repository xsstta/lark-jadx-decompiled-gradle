package com.ss.android.lark.keyboard.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "activity", "Landroid/app/Activity;", "lastHeightMeasureSpec", "lastSystemKeyboardAction", "observers", "", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "orientation", "orientationChanged", "", "rect", "Landroid/graphics/Rect;", "screenHeight", "getScreenHeight", "()I", "setScreenHeight", "(I)V", "addSysKeyboardObserver", "", "observer", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setActivity", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SysKeyBoardObserveFrameLayout extends FrameLayout {

    /* renamed from: c */
    public static final Companion f104790c = new Companion(null);

    /* renamed from: a */
    public boolean f104791a;

    /* renamed from: b */
    public int f104792b;

    /* renamed from: d */
    private int f104793d;

    /* renamed from: e */
    private Activity f104794e;

    /* renamed from: f */
    private final Rect f104795f;

    /* renamed from: g */
    private int f104796g;

    /* renamed from: h */
    private int f104797h;

    /* renamed from: i */
    private final List<KeyBoardObserveFrameLayout.IOnKeyBoardListener> f104798i;

    public SysKeyBoardObserveFrameLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public SysKeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SysKeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout$Companion;", "", "()V", "SYSTEM_KEYBOARD_HIDE", "", "SYSTEM_KEYBOARD_SHOW", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getScreenHeight() {
        return this.f104796g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout$onConfigurationChanged$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC41102b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ SysKeyBoardObserveFrameLayout f104799a;

        /* renamed from: b */
        final /* synthetic */ Configuration f104800b;

        public void onGlobalLayout() {
            Log.m165379d("SysKeyBoardObserveFrameLayoutNew", "configuration changed");
            this.f104799a.f104791a = true;
            this.f104799a.f104792b = this.f104800b.orientation;
            this.f104799a.requestLayout();
            this.f104799a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC41102b(SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout, Configuration configuration) {
            this.f104799a = sysKeyBoardObserveFrameLayout;
            this.f104800b = configuration;
        }
    }

    public final void setScreenHeight(int i) {
        this.f104796g = i;
    }

    public final void setActivity(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f104794e = activity;
    }

    /* renamed from: a */
    public final void mo148228a(KeyBoardObserveFrameLayout.IOnKeyBoardListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "observer");
        this.f104798i.add(cVar);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC41102b(this, configuration));
    }

    /* renamed from: a */
    private final int m162985a(Context context) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        int i = resources.getDisplayMetrics().heightPixels;
        Log.m165389i("SysKeyBoardObserveFrameLayoutNew", "init var screenHeight = " + i + " ,context = " + context);
        return i;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        if (this.f104792b == -1) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            this.f104792b = resources.getConfiguration().orientation;
        }
        boolean z2 = false;
        if (this.f104791a) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            int a = m162985a(context2);
            if (a != this.f104796g) {
                Log.m165379d("SysKeyBoardObserveFrameLayoutNew", "configuration change screen height = " + a);
                this.f104796g = a;
                this.f104797h = View.MeasureSpec.makeMeasureSpec(a, Integer.MIN_VALUE);
                this.f104791a = false;
            }
        }
        int size = View.MeasureSpec.getSize(this.f104797h);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 1;
        if (Math.abs(size - size2) > this.f104796g / 6) {
            z = true;
        } else {
            z = false;
        }
        this.f104797h = i2;
        Log.m165379d("SysKeyBoardObserveFrameLayoutNew", "View height has changed , last height is " + size + " , new height is " + size2);
        if (!z || this.f104794e == null || this.f104798i.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        Activity activity = this.f104794e;
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "requireNotNull(activity).window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "requireNotNull(activity).window.decorView");
            this.f104795f.set(0, 0, 0, 0);
            decorView.getWindowVisibleDisplayFrame(this.f104795f);
            int height = this.f104796g - this.f104795f.height();
            if (height > this.f104796g / 6) {
                z2 = true;
            }
            Log.m165379d("SysKeyBoardObserveFrameLayoutNew", "height difference is " + height + " , system keyboard is shown ? " + z2);
            if (z2) {
                i3 = 2;
            }
            if (i3 != this.f104793d) {
                Log.m165379d("SysKeyBoardObserveFrameLayoutNew", "now notify observer , system keyboard is shown ? " + z2);
                if (z2) {
                    Iterator<T> it = this.f104798i.iterator();
                    while (it.hasNext()) {
                        it.next().mo129627a(height);
                    }
                } else {
                    Iterator<T> it2 = this.f104798i.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo129626a();
                    }
                }
                this.f104793d = i3;
            }
            super.onMeasure(i, i2);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SysKeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f104795f = new Rect();
        SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout = this;
        this.f104796g = sysKeyBoardObserveFrameLayout.m162985a(context);
        this.f104797h = View.MeasureSpec.makeMeasureSpec(sysKeyBoardObserveFrameLayout.f104796g, Integer.MIN_VALUE);
        this.f104792b = -1;
        this.f104798i = new ArrayList();
        setTag(SysKeyBoardObserveFrameLayout.class);
        if (context instanceof Activity) {
            this.f104794e = (Activity) context;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SysKeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
