package com.bytedance.ee.bear.util.keyboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020\fJ\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u00020\u0010H\u0002J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0010H\u0002J\u0012\u00103\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0012H\u0007J\u0006\u00104\u001a\u00020\u0012J\u0006\u00105\u001a\u00020\u0012J\b\u00106\u001a\u00020$H\u0002J\u0010\u00107\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012H\u0002J\u0018\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012H\u0002J\u0010\u0010:\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0012H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020\u0010H\u0002J\u0006\u0010>\u001a\u00020$R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/DialogKHP;", "", "window", "Landroid/view/Window;", "(Landroid/view/Window;)V", "TAG", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "heightHandler", "Ljava/lang/Runnable;", "isKeyboardShowing", "", "()Z", "isStarted", "mContentView", "Landroid/view/View;", "mKeyboardBottom", "", "mKeyboardHeight", "mObserverList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP$KeyboardHeightObserver;", "mPopupView", "Landroid/widget/LinearLayout;", "mPopupWindow", "Landroid/widget/PopupWindow;", "mScreenOrientation", "getMScreenOrientation", "()I", "mVisibleKeyboardHeight", "getMVisibleKeyboardHeight", "setMVisibleKeyboardHeight", "(I)V", "mWindow", "addKeyboardHeightObserver", "", "observer", "calculateKeyboardHeight", "orientation", "calculateKeyboardHeightLandscape", "calculateKeyboardHeightPortrait", "close", "deleteSelf", "createLinearLayout", "context", "Landroid/content/Context;", "createPopupWindow", "contentView", "getBottomOnScreen", "view", "getKeyBoardHeight", "getKeyboardTop", "getVisibleKeyboardHeight", "handleHeightChanged", "loadKeyboardHeight", "notifyKeyboardHeightChanged", "height", "removeKeyboardHeightObserver", "saveKeyboardHeight", "showPopupWindow", "v", "start", "Companion", "KeyboardHeightObserver", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.q.a.b */
public final class DialogKHP {

    /* renamed from: e */
    public static final SparseArray<DialogKHP> f28309e = new SparseArray<>();

    /* renamed from: f */
    public static final Companion f28310f = new Companion(null);

    /* renamed from: a */
    public final Window f28311a;

    /* renamed from: b */
    public final View f28312b;

    /* renamed from: c */
    public final LinearLayout f28313c;

    /* renamed from: d */
    public final Runnable f28314d;

    /* renamed from: g */
    private final PopupWindow f28315g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<KeyboardHeightObserver> f28316h;

    /* renamed from: i */
    private final ViewTreeObserver.OnGlobalLayoutListener f28317i;

    /* renamed from: j */
    private int f28318j;

    /* renamed from: k */
    private int f28319k;

    /* renamed from: l */
    private int f28320l;

    /* renamed from: m */
    private String f28321m;

    /* renamed from: n */
    private boolean f28322n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/DialogKHP$KeyboardHeightObserver;", "", "onKeyboardHeightChanged", "", "khp", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP;", "keyboardHeight", "", "orientation", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.b$b */
    public interface KeyboardHeightObserver {
        /* renamed from: a */
        void mo39939a(DialogKHP bVar, int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/DialogKHP$Companion;", "", "()V", "DEBOUNCE_DELAY_MILLIS", "", "DEFAULT_LANDSCAPE_KEYBOARD_HEIGHT_DIP", "", "DEFAULT_PORTRAIT_KEYBOARD_HEIGHT_DIP", "LANDSCAPE_PREFER_KEY", "", "MIN_KEYBOARD_HEIGHT", "PORTRAIT_PREFER_KEY", "PREFER_NAME", "instancePool", "Landroid/util/SparseArray;", "Lcom/bytedance/ee/bear/util/keyboard/DialogKHP;", "getInstance", "window", "Landroid/view/Window;", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DialogKHP mo39957a(Window window) {
            Intrinsics.checkParameterIsNotNull(window, "window");
            DialogKHP bVar = DialogKHP.f28309e.get(window.hashCode());
            if (bVar != null) {
                return bVar;
            }
            DialogKHP bVar2 = new DialogKHP(window, null);
            DialogKHP.f28309e.put(window.hashCode(), bVar2);
            return bVar2;
        }
    }

    /* renamed from: b */
    public final int mo39948b() {
        return this.f28319k;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.q.a.b$c */
    static final class RunnableC10547c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogKHP f28325a;

        RunnableC10547c(DialogKHP bVar) {
            this.f28325a = bVar;
        }

        public final void run() {
            this.f28325a.mo39953e();
        }
    }

    /* renamed from: c */
    public final boolean mo39951c() {
        if (this.f28319k > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final int m43679f() {
        Rect rect = new Rect();
        this.f28313c.getWindowVisibleDisplayFrame(rect);
        return m43677b(this.f28312b) - rect.bottom;
    }

    /* renamed from: d */
    public final void mo39952d() {
        if (!this.f28322n) {
            this.f28322n = true;
            C13479a.m54772d(this.f28321m, "start");
            m43675a(this.f28312b);
            this.f28313c.getViewTreeObserver().addOnGlobalLayoutListener(this.f28317i);
        }
    }

    /* renamed from: e */
    public final void mo39953e() {
        if (mo39951c()) {
            this.f28320l = this.f28319k;
            m43678c(mo39944a());
        }
        m43674a(this.f28319k, mo39944a());
    }

    /* renamed from: g */
    private final int m43680g() {
        Rect rect = new Rect();
        this.f28313c.getWindowVisibleDisplayFrame(rect);
        if (((double) rect.bottom) > ((double) C13749l.m55762f(this.f28313c.getContext())) * 0.8d) {
            this.f28318j = rect.bottom;
        }
        return m43677b(this.f28312b) - rect.bottom;
    }

    /* renamed from: a */
    public final int mo39944a() {
        Context context = this.f28311a.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mWindow.context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "mWindow.context.resources");
        return resources.getConfiguration().orientation;
    }

    /* renamed from: a */
    public final void mo39945a(int i) {
        this.f28319k = i;
    }

    /* renamed from: b */
    public final void mo39950b(KeyboardHeightObserver bVar) {
        this.f28316h.remove(bVar);
    }

    /* renamed from: b */
    private final int m43677b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1] + view.getHeight();
    }

    /* renamed from: b */
    public final int mo39949b(int i) {
        if (i != 2) {
            return m43680g();
        }
        return m43679f();
    }

    /* renamed from: a */
    private final LinearLayout m43672a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(context.getResources().getColor(17170445));
        return linearLayout;
    }

    /* renamed from: c */
    private final void m43678c(int i) {
        String str;
        SharedPreferences sharedPreferences = this.f28311a.getContext().getSharedPreferences("keyboard_height_provider", 0);
        if (i != 2) {
            str = "portrait_keyboard_height";
        } else {
            str = "landscape_keyboard_height";
        }
        sharedPreferences.edit().putInt(str, this.f28320l).apply();
    }

    private DialogKHP(Window window) {
        this.f28311a = window;
        this.f28316h = new CopyOnWriteArrayList<>();
        this.f28314d = new RunnableC10547c(this);
        this.f28318j = C13749l.m55748b();
        this.f28321m = "KeyboardHeightPro#" + Integer.toHexString(hashCode());
        View findViewById = window.findViewById(16908290);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mWindow.findViewById(android.R.id.content)");
        this.f28312b = findViewById;
        Context context = window.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mWindow.context");
        LinearLayout a = m43672a(context);
        this.f28313c = a;
        Context context2 = window.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "mWindow.context");
        this.f28315g = m43673a(context2, a);
        this.f28317i = new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.bytedance.ee.bear.util.keyboard.DialogKHP.ViewTreeObserver$OnGlobalLayoutListenerC105451 */

            /* renamed from: a */
            final /* synthetic */ DialogKHP f28323a;

            {
                this.f28323a = r1;
            }

            public final void onGlobalLayout() {
                DialogKHP bVar = this.f28323a;
                int b = bVar.mo39949b(bVar.mo39944a());
                if (b < 300) {
                    b = 0;
                }
                if (b != this.f28323a.mo39948b()) {
                    this.f28323a.mo39945a(b);
                    this.f28323a.f28313c.removeCallbacks(this.f28323a.f28314d);
                    this.f28323a.f28313c.postDelayed(this.f28323a.f28314d, 100);
                }
            }
        };
        if (findViewById.isAttachedToWindow()) {
            mo39952d();
        }
        findViewById.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.bytedance.ee.bear.util.keyboard.DialogKHP.View$OnAttachStateChangeListenerC105462 */

            /* renamed from: a */
            final /* synthetic */ DialogKHP f28324a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f28324a = r1;
            }

            public void onViewAttachedToWindow(View view) {
                this.f28324a.mo39952d();
            }

            public void onViewDetachedFromWindow(View view) {
                DialogKHP.m43676a(this.f28324a, false, 1, null);
                this.f28324a.f28312b.removeOnAttachStateChangeListener(this);
                DialogKHP.f28309e.delete(this.f28324a.f28311a.hashCode());
            }
        });
    }

    /* renamed from: a */
    private final void m43675a(View view) {
        if (!this.f28315g.isShowing()) {
            this.f28315g.setBackgroundDrawable(new ColorDrawable(0));
            this.f28315g.showAtLocation(view, 0, 0, 0);
        }
    }

    /* renamed from: a */
    public final void mo39946a(KeyboardHeightObserver bVar) {
        if (!this.f28316h.contains(bVar)) {
            this.f28316h.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo39947a(boolean z) {
        C13479a.m54772d(this.f28321m, "close");
        this.f28316h.clear();
        this.f28313c.removeCallbacks(this.f28314d);
        this.f28313c.getViewTreeObserver().removeOnGlobalLayoutListener(this.f28317i);
        this.f28315g.dismiss();
        if (z) {
            f28309e.delete(this.f28311a.hashCode());
        }
    }

    public /* synthetic */ DialogKHP(Window window, DefaultConstructorMarker defaultConstructorMarker) {
        this(window);
    }

    /* renamed from: a */
    private final PopupWindow m43673a(Context context, View view) {
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setContentView(view);
        popupWindow.setSoftInputMode(21);
        popupWindow.setInputMethodMode(1);
        popupWindow.setWidth(50);
        popupWindow.setHeight(-1);
        return popupWindow;
    }

    /* renamed from: a */
    private final void m43674a(int i, int i2) {
        Iterator<KeyboardHeightObserver> it = this.f28316h.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "mObserverList.iterator()");
        while (it.hasNext()) {
            KeyboardHeightObserver next = it.next();
            if (next != null) {
                next.mo39939a(this, i, i2);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m43676a(DialogKHP bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.mo39947a(z);
    }
}
