package com.bytedance.ee.bear.util.keyboard;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.ee.bear.util.keyboard.DialogKHP;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 T2\u00020\u0001:\u0001TB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0002J\b\u00101\u001a\u00020\u0018H\u0002J\b\u00102\u001a\u00020\u0018H\u0002J\b\u00103\u001a\u00020-H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u00020\u000fH$J\b\u00109\u001a\u00020-H\u0016J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u000fH\u0002J\b\u0010<\u001a\u00020\u0018H\u0016J\u000e\u0010=\u001a\u00020\u00182\u0006\u00105\u001a\u000206J\b\u0010>\u001a\u00020\u0018H\u0016J\b\u0010?\u001a\u00020-H\u0002J\u0006\u0010@\u001a\u00020-J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0018H\u0016J\u0010\u0010D\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016J\u0010\u0010E\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0002J\u0018\u0010F\u001a\u00020-2\u0006\u0010G\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0002J\u0012\u0010H\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010I\u001a\u00020-2\u0006\u00100\u001a\u00020\u0018H\u0002J\u0017\u0010J\u001a\u00020-2\b\u0010K\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010LJ\u0010\u0010M\u001a\u00020-2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020\u000fH\u0002J\u0006\u0010R\u001a\u00020-J\b\u0010S\u001a\u00020-H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8DX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u000e\u0010%\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/BaseKeyboardHeightProvider;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "dialogKHP", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP;", "dialogKHPObserver", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP$KeyboardHeightObserver;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "heightHandler", "Ljava/lang/Runnable;", "mActivity", "mContentView", "Landroid/view/View;", "getMContentView", "()Landroid/view/View;", "setMContentView", "(Landroid/view/View;)V", "mDelayedDuration", "", "Ljava/lang/Long;", "mKeyboardBottom", "", "mKeyboardHeight", "mObserverList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "mPopupView", "Landroid/widget/LinearLayout;", "mPopupWindow", "Landroid/widget/PopupWindow;", "getMPopupWindow", "()Landroid/widget/PopupWindow;", "mPopupWindow$delegate", "Lkotlin/Lazy;", "mPopupWindowHeight", "mScreenOrientation", "getMScreenOrientation", "()I", "mVisibleKeyboardHeight", "tag", "", "addKeyboardHeightObserver", "", "observer", "calculateKeyboardHeight", "orientation", "calculateKeyboardHeightLandscape", "calculateKeyboardHeightPortrait", "close", "createLinearLayout", "context", "Landroid/content/Context;", "createPopupWindow", "contentView", "dismissDialog", "getBottomOnScreen", "view", "getKeyboardTop", "getMinKeyboardHeight", "getVisibleKeyboardHeight", "handleHeightChanged", "init", "isKeyboardShowing", "", "keyBoardRawHeight", "keyBoardRawHeightWithOrientation", "loadKeyboardHeight", "notifyKeyboardHeightChanged", "height", "removeKeyboardHeightObserver", "saveKeyboardHeight", "setDelayedDuration", "delayedDuration", "(Ljava/lang/Long;)V", "setDialogWindow", "window", "Landroid/view/Window;", "showPopupWindow", "v", "start", "tryInitContentView", "Companion", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.q.a.a */
public abstract class BaseKeyboardHeightProvider implements AbstractC10550f {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f28288a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseKeyboardHeightProvider.class), "mPopupWindow", "getMPopupWindow()Landroid/widget/PopupWindow;"))};

    /* renamed from: i */
    public static final Companion f28289i = new Companion(null);

    /* renamed from: b */
    public final Activity f28290b;

    /* renamed from: c */
    public LinearLayout f28291c;

    /* renamed from: d */
    public final Runnable f28292d = new RunnableC10541c(this);

    /* renamed from: e */
    public int f28293e;

    /* renamed from: f */
    public int f28294f;

    /* renamed from: g */
    public Long f28295g;

    /* renamed from: h */
    public final String f28296h = ("KeyboardHeightPro#" + Integer.toHexString(hashCode()));

    /* renamed from: j */
    private View f28297j;

    /* renamed from: k */
    private final Lazy f28298k = LazyKt.lazy(new C10543e(this));

    /* renamed from: l */
    private final CopyOnWriteArrayList<AbstractC10549e> f28299l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f28300m;

    /* renamed from: n */
    private int f28301n = C13749l.m55748b();

    /* renamed from: o */
    private int f28302o;

    /* renamed from: p */
    private DialogKHP f28303p;

    /* renamed from: q */
    private final DialogKHP.KeyboardHeightObserver f28304q = new C10540b(this);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract PopupWindow mo39922a(Context context, View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final PopupWindow mo39927b() {
        Lazy lazy = this.f28298k;
        KProperty kProperty = f28288a[0];
        return (PopupWindow) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/BaseKeyboardHeightProvider$Companion;", "", "()V", "DEBOUNCE_DELAY_MILLIS", "", "LANDSCAPE_PREFER_KEY", "", "MIN_KEYBOARD_HEIGHT", "", "PORTRAIT_PREFER_KEY", "PREFER_NAME", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo39921a() {
        return this.f28297j;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: h */
    public int mo39934h() {
        return this.f28294f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.a$c */
    static final class RunnableC10541c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardHeightProvider f28306a;

        RunnableC10541c(BaseKeyboardHeightProvider aVar) {
            this.f28306a = aVar;
        }

        public final void run() {
            this.f28306a.mo39938l();
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: i */
    public boolean mo39935i() {
        if (this.f28294f > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: j */
    public int mo39936j() {
        return mo39919a(1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/PopupWindow;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.a$e */
    static final class C10543e extends Lambda implements Function0<PopupWindow> {
        final /* synthetic */ BaseKeyboardHeightProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10543e(BaseKeyboardHeightProvider aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PopupWindow invoke() {
            BaseKeyboardHeightProvider aVar = this.this$0;
            return aVar.mo39922a(aVar.f28290b, BaseKeyboardHeightProvider.m43641a(this.this$0));
        }
    }

    /* renamed from: n */
    private final int m43649n() {
        View view = this.f28297j;
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        LinearLayout linearLayout = this.f28291c;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        linearLayout.getWindowVisibleDisplayFrame(rect);
        return m43644b(view) - rect.bottom;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: k */
    public int mo39937k() {
        int[] iArr = new int[2];
        LinearLayout linearLayout = this.f28291c;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        linearLayout.getLocationOnScreen(iArr);
        return iArr[1] + linearLayout.getHeight();
    }

    /* renamed from: l */
    public final void mo39938l() {
        if (mo39935i()) {
            this.f28302o = this.f28294f;
            m43646c(mo39929c());
        }
        m43642a(this.f28294f, mo39929c());
    }

    /* renamed from: m */
    private final void m43648m() {
        if (this.f28297j == null) {
            View findViewById = this.f28290b.findViewById(16908290);
            this.f28297j = findViewById;
            if (findViewById == null) {
                C13606d.m55245a(this.f28296h, new RuntimeException("Cannot find view of android.R.id.content!"));
                return;
            }
            if (findViewById != null && findViewById.isAttachedToWindow()) {
                mo39931e();
            }
            View view = this.f28297j;
            if (view != null) {
                view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC10544f(this));
            }
        }
    }

    /* renamed from: c */
    public final int mo39929c() {
        Resources resources = this.f28290b.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "mActivity.resources");
        return resources.getConfiguration().orientation;
    }

    /* renamed from: d */
    public final void mo39930d() {
        this.f28291c = m43645b(this.f28290b);
        this.f28300m = new ViewTreeObserver$OnGlobalLayoutListenerC10542d(this);
        m43648m();
    }

    /* renamed from: e */
    public final void mo39931e() {
        C13479a.m54772d(this.f28296h, "start");
        View view = this.f28297j;
        if (view != null) {
            m43643a(view);
        }
        LinearLayout linearLayout = this.f28291c;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f28300m;
        if (onGlobalLayoutListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalLayoutListener");
        }
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: f */
    public void mo39932f() {
        C13479a.m54772d(this.f28296h, "close");
        this.f28299l.clear();
        LinearLayout linearLayout = this.f28291c;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        linearLayout.removeCallbacks(this.f28292d);
        LinearLayout linearLayout2 = this.f28291c;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        ViewTreeObserver viewTreeObserver = linearLayout2.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f28300m;
        if (onGlobalLayoutListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalLayoutListener");
        }
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: g */
    public void mo39933g() {
        if (Build.VERSION.SDK_INT >= 28) {
            DialogKHP bVar = this.f28303p;
            if (bVar != null) {
                bVar.mo39950b(this.f28304q);
            }
            DialogKHP bVar2 = this.f28303p;
            if (bVar2 != null) {
                bVar2.mo39947a(true);
            }
            this.f28303p = null;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f28300m;
            if (onGlobalLayoutListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalLayoutListener");
            }
            onGlobalLayoutListener.onGlobalLayout();
        }
    }

    /* renamed from: o */
    private final int m43650o() {
        View view = this.f28297j;
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        LinearLayout linearLayout = this.f28291c;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        linearLayout.getWindowVisibleDisplayFrame(rect);
        double d = (double) rect.bottom;
        LinearLayout linearLayout2 = this.f28291c;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        if (d > 0.8d * ((double) C13749l.m55762f(linearLayout2.getContext()))) {
            this.f28301n = rect.bottom;
        }
        return m43644b(view) - rect.bottom;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.a$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC10542d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardHeightProvider f28307a;

        ViewTreeObserver$OnGlobalLayoutListenerC10542d(BaseKeyboardHeightProvider aVar) {
            this.f28307a = aVar;
        }

        public final void onGlobalLayout() {
            String str = this.f28307a.f28296h;
            C13479a.m54772d(str, " mPopupView height  ::  " + BaseKeyboardHeightProvider.m43641a(this.f28307a).getHeight());
            if (this.f28307a.f28293e == 0 && BaseKeyboardHeightProvider.m43641a(this.f28307a).getHeight() > 0) {
                BaseKeyboardHeightProvider aVar = this.f28307a;
                aVar.f28293e = BaseKeyboardHeightProvider.m43641a(aVar).getHeight();
            }
            BaseKeyboardHeightProvider aVar2 = this.f28307a;
            int b = aVar2.mo39926b(aVar2.mo39929c());
            if (BaseKeyboardHeightProvider.m43641a(this.f28307a).getHeight() != this.f28307a.f28293e || b <= 0) {
                String str2 = this.f28307a.f28296h;
                C13479a.m54772d(str2, " keyboardHeight  ::  " + b + ", " + "mVisibleKeyboardHeight  ::  " + this.f28307a.f28294f + ", " + "mDelayedDuration  ::  " + this.f28307a.f28295g);
                BaseKeyboardHeightProvider aVar3 = this.f28307a;
                if (b < aVar3.mo39920a(aVar3.f28290b)) {
                    b = 0;
                }
                if (b != this.f28307a.f28294f) {
                    this.f28307a.f28294f = b;
                    BaseKeyboardHeightProvider.m43641a(this.f28307a).removeCallbacks(this.f28307a.f28292d);
                    Long l = this.f28307a.f28295g;
                    if (l != null) {
                        BaseKeyboardHeightProvider.m43641a(this.f28307a).postDelayed(this.f28307a.f28292d, l.longValue());
                        return;
                    }
                    if (this.f28307a.f28294f > 0) {
                        int i = this.f28307a.f28294f;
                        BaseKeyboardHeightProvider aVar4 = this.f28307a;
                        if (i < aVar4.mo39919a(aVar4.mo39929c())) {
                            String str3 = this.f28307a.f28296h;
                            StringBuilder sb = new StringBuilder();
                            sb.append("layout change slow: ");
                            sb.append(this.f28307a.f28294f);
                            sb.append(", ");
                            BaseKeyboardHeightProvider aVar5 = this.f28307a;
                            sb.append(aVar5.mo39919a(aVar5.mo39929c()));
                            C13479a.m54775e(str3, sb.toString());
                            BaseKeyboardHeightProvider.m43641a(this.f28307a).postDelayed(this.f28307a.f28292d, 200);
                            return;
                        }
                    }
                    this.f28307a.mo39938l();
                    return;
                }
                return;
            }
            String str4 = this.f28307a.f28296h;
            C13479a.m54775e(str4, "keyboardHeight Not eligible！！" + b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/util/keyboard/BaseKeyboardHeightProvider$dialogKHPObserver$1", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP$KeyboardHeightObserver;", "onKeyboardHeightChanged", "", "khp", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP;", "keyboardHeight", "", "orientation", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.a$b */
    public static final class C10540b implements DialogKHP.KeyboardHeightObserver {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardHeightProvider f28305a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10540b(BaseKeyboardHeightProvider aVar) {
            this.f28305a = aVar;
        }

        @Override // com.bytedance.ee.bear.util.keyboard.DialogKHP.KeyboardHeightObserver
        /* renamed from: a */
        public void mo39939a(DialogKHP bVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(bVar, "khp");
            this.f28305a.f28294f = i;
            this.f28305a.mo39938l();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/util/keyboard/BaseKeyboardHeightProvider$tryInitContentView$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.a$f */
    public static final class View$OnAttachStateChangeListenerC10544f implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ BaseKeyboardHeightProvider f28308a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC10544f(BaseKeyboardHeightProvider aVar) {
            this.f28308a = aVar;
        }

        public void onViewAttachedToWindow(View view) {
            this.f28308a.mo39931e();
        }

        public void onViewDetachedFromWindow(View view) {
            this.f28308a.mo39932f();
            View a = this.f28308a.mo39921a();
            if (a != null) {
                a.removeOnAttachStateChangeListener(this);
            }
            C10552g.m43724e(this.f28308a.f28290b);
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: b */
    public void mo39928b(AbstractC10549e eVar) {
        this.f28299l.remove(eVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m43641a(BaseKeyboardHeightProvider aVar) {
        LinearLayout linearLayout = aVar.f28291c;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupView");
        }
        return linearLayout;
    }

    /* renamed from: b */
    private final int m43644b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1] + view.getHeight();
    }

    /* renamed from: c */
    private final void m43646c(int i) {
        String str;
        SharedPreferences sharedPreferences = this.f28290b.getSharedPreferences("keyboard_height_provider", 0);
        if (i != 2) {
            str = "portrait_keyboard_height";
        } else {
            str = "landscape_keyboard_height";
        }
        sharedPreferences.edit().putInt(str, this.f28302o).apply();
    }

    /* renamed from: d */
    private final int m43647d(int i) {
        String str;
        SharedPreferences sharedPreferences = this.f28290b.getSharedPreferences("keyboard_height_provider", 0);
        if (i != 2) {
            str = "portrait_keyboard_height";
        } else {
            str = "landscape_keyboard_height";
        }
        return sharedPreferences.getInt(str, 0);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: a */
    public int mo39919a(int i) {
        int i2 = this.f28302o;
        if (i2 > 0) {
            return i2;
        }
        int d = m43647d(i);
        if (d > 0) {
            return d;
        }
        if (i != 2) {
            return C13749l.m55737a(250.0f);
        }
        return C13749l.m55737a(200.0f);
    }

    /* renamed from: b */
    public final int mo39926b(int i) {
        if (i != 2) {
            return m43650o();
        }
        return m43649n();
    }

    /* renamed from: b */
    private final LinearLayout m43645b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(context.getResources().getColor(17170445));
        return linearLayout;
    }

    public BaseKeyboardHeightProvider(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f28290b = activity;
    }

    /* renamed from: a */
    private final void m43643a(View view) {
        if (!mo39927b().isShowing()) {
            mo39927b().setBackgroundDrawable(new ColorDrawable(0));
            try {
                mo39927b().showAtLocation(view, 0, 0, 0);
            } catch (Throwable th) {
                C13606d.m55245a(this.f28296h, th);
            }
        }
    }

    /* renamed from: a */
    public final int mo39920a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (HardKeyboardUtils.m43694a(context)) {
            return 100;
        }
        return LocationRequest.PRIORITY_INDOOR;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: a */
    public void mo39923a(Window window) {
        Intrinsics.checkParameterIsNotNull(window, "window");
        if (Build.VERSION.SDK_INT >= 28) {
            DialogKHP a = DialogKHP.f28310f.mo39957a(window);
            this.f28303p = a;
            if (a != null) {
                a.mo39946a(this.f28304q);
            }
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: a */
    public void mo39924a(AbstractC10549e eVar) {
        if (!this.f28299l.contains(eVar)) {
            this.f28299l.add(eVar);
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f
    /* renamed from: a */
    public void mo39925a(Long l) {
        this.f28295g = l;
    }

    /* renamed from: a */
    private final void m43642a(int i, int i2) {
        String str = this.f28296h;
        C13479a.m54764b(str, "keyboard height provider notify: " + i + ", " + i2);
        Iterator<AbstractC10549e> it = this.f28299l.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "mObserverList.iterator()");
        while (it.hasNext()) {
            AbstractC10549e next = it.next();
            if (next != null) {
                next.onKeyboardHeightChanged(this, i, i2);
            }
        }
    }
}
