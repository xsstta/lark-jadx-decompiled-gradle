package com.ss.android.lark.keyboard.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.p2074c.C40680e;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 /2\u00020\u0001:\u0003/01B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J0\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0018\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0011J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "enableNewObserverFrameLayout", "", "hasLayout", "heightChangedListener", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnHeightChangedListener;", "keyBoardListener", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "mActivity", "Landroid/app/Activity;", "orientation", "orientationChanged", "preHeight", "preMeasureHeight", "rect", "Landroid/graphics/Rect;", "screenHeight", "getScreenHeight", "()I", "setScreenHeight", "(I)V", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setActivity", "activity", "setHeightChangedListener", "listener", "setKeyBoardListener", "Companion", "IOnHeightChangedListener", "IOnKeyBoardListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyBoardObserveFrameLayout extends FrameLayout {

    /* renamed from: a */
    public static final Companion f103282a = new Companion(null);

    /* renamed from: b */
    private int f103283b;

    /* renamed from: c */
    private final Rect f103284c;

    /* renamed from: d */
    private int f103285d;

    /* renamed from: e */
    private int f103286e;

    /* renamed from: f */
    private final boolean f103287f;

    /* renamed from: g */
    private int f103288g;

    /* renamed from: h */
    private boolean f103289h;

    /* renamed from: i */
    private boolean f103290i;

    /* renamed from: j */
    private Activity f103291j;

    /* renamed from: k */
    private IOnHeightChangedListener f103292k;

    /* renamed from: l */
    private IOnKeyBoardListener f103293l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnHeightChangedListener;", "", "onLayoutHeightChanged", "", "height", "", "onMeasureHeightChanged", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout$b */
    public interface IOnHeightChangedListener {
        /* renamed from: a */
        void mo146853a(int i);

        /* renamed from: b */
        void mo146854b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "", "onKeyBoardHide", "", "onKeyBoardShow", "heightDiff", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout$c */
    public interface IOnKeyBoardListener {
        /* renamed from: a */
        void mo129626a();

        /* renamed from: a */
        void mo129627a(int i);
    }

    public KeyBoardObserveFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public KeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$Companion;", "", "()V", "LOG_TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getScreenHeight() {
        return this.f103283b;
    }

    public final void setScreenHeight(int i) {
        this.f103283b = i;
    }

    public final void setHeightChangedListener(IOnHeightChangedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f103292k = bVar;
    }

    public final void setKeyBoardListener(IOnKeyBoardListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f103293l = cVar;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != this.f103288g) {
            Log.m165379d("KeyBoardObserveFrameLayout", "configuration changed");
            this.f103289h = true;
            this.f103288g = configuration.orientation;
        }
    }

    /* renamed from: a */
    private final int m160762a(Context context) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        int i = resources.getDisplayMetrics().heightPixels;
        Log.m165389i("KeyBoardObserveFrameLayout", "init var screenHeight = " + i + " ,context = " + context);
        return i;
    }

    public final void setActivity(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f103291j = activity;
        Point point = new Point();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getSize(point);
            int max = Math.max(point.x, point.y);
            Log.m165389i("KeyBoardObserveFrameLayout", "setActivity width = " + point.x + " , height = " + point.y + ", activity = " + activity);
            this.f103283b = Math.max(this.f103283b, max);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Window window;
        View decorView;
        if (this.f103288g == -1) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            this.f103288g = resources.getConfiguration().orientation;
        }
        this.f103284c.bottom = 0;
        Activity activity = this.f103291j;
        if (!(activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.getWindowVisibleDisplayFrame(this.f103284c);
        }
        if (this.f103289h) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            int a = m160762a(context2);
            if (a != this.f103283b) {
                Log.m165379d("KeyBoardObserveFrameLayout", "configuration change screen height = " + a);
                this.f103283b = a;
                this.f103289h = false;
            }
        }
        if (DesktopUtil.m144301a(getContext())) {
            this.f103283b = DeviceUtils.getScreenHeight(getContext());
        }
        int i3 = this.f103283b - this.f103284c.bottom;
        boolean a2 = C40680e.m160789a(i3, this.f103283b);
        int size = View.MeasureSpec.getSize(i2);
        if (this.f103290i) {
            if (a2) {
                IOnKeyBoardListener cVar = this.f103293l;
                if (cVar != null) {
                    cVar.mo129627a(i3);
                }
            } else {
                IOnKeyBoardListener cVar2 = this.f103293l;
                if (cVar2 != null) {
                    cVar2.mo129626a();
                }
            }
            Log.m165379d("KeyBoardObserveFrameLayout", "onMeasure(), isKeyBoardShow = " + a2 + " , sysKeyboardHeight=" + i3 + ", screenHeight=" + this.f103283b);
        }
        super.onMeasure(i, i2);
        if (!this.f103287f && size > 0 && a2) {
            setMeasuredDimension(getMeasuredWidth(), 0);
        }
        if (this.f103286e != getMeasuredHeight()) {
            this.f103286e = getMeasuredHeight();
            IOnHeightChangedListener bVar = this.f103292k;
            if (bVar != null) {
                bVar.mo146854b(getMeasuredHeight());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f103284c = new Rect();
        this.f103285d = -1;
        this.f103286e = -1;
        this.f103287f = C40682g.m160850a().mo133171a("messenger.keyboard.enable_new_observe_view");
        this.f103288g = -1;
        this.f103283b = m160762a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f103290i = true;
        Log.m165379d("KeyBoardObserveFrameLayout", "KeyBoardObserveFrameLayout onLayout height = " + getHeight());
        if (this.f103285d != getMeasuredHeight()) {
            int measuredHeight = getMeasuredHeight();
            this.f103285d = measuredHeight;
            IOnHeightChangedListener bVar = this.f103292k;
            if (bVar != null) {
                bVar.mo146853a(measuredHeight);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyBoardObserveFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
