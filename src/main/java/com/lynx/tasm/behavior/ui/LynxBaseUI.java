package com.lynx.tasm.behavior.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.animation.p1218b.C26575c;
import com.lynx.tasm.animation.p1219c.C26585a;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxPropGroup;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.ui.scroll.AbstractC26813b;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import com.lynx.tasm.behavior.ui.utils.BorderStyle;
import com.lynx.tasm.behavior.ui.utils.C26830c;
import com.lynx.tasm.behavior.ui.utils.C26833f;
import com.lynx.tasm.behavior.ui.utils.C26836h;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26546b;
import com.lynx.tasm.utils.C26955i;
import com.lynx.tasm.utils.C26960n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class LynxBaseUI implements AbstractC26623a, AbstractC26757c {

    /* renamed from: s */
    public static final int[] f66194s = {8, 0, 2, 1, 3, 4, 5};

    /* renamed from: A */
    public int f66195A;

    /* renamed from: B */
    public int f66196B;

    /* renamed from: C */
    public int f66197C;

    /* renamed from: D */
    protected int f66198D;

    /* renamed from: E */
    protected int f66199E;

    /* renamed from: F */
    protected int f66200F;

    /* renamed from: G */
    protected int f66201G;

    /* renamed from: H */
    public int f66202H;

    /* renamed from: I */
    public int f66203I;

    /* renamed from: J */
    public int f66204J;

    /* renamed from: K */
    public int f66205K;

    /* renamed from: L */
    protected float f66206L;

    /* renamed from: M */
    protected int f66207M;

    /* renamed from: N */
    protected boolean f66208N;

    /* renamed from: O */
    protected boolean f66209O;

    /* renamed from: P */
    protected List<C26836h> f66210P;

    /* renamed from: Q */
    protected C26833f f66211Q;

    /* renamed from: R */
    protected boolean f66212R;

    /* renamed from: S */
    protected Sticky f66213S;

    /* renamed from: T */
    protected float f66214T;

    /* renamed from: U */
    protected int f66215U;

    /* renamed from: V */
    protected C26741a f66216V;

    /* renamed from: W */
    protected Bitmap.Config f66217W;

    /* renamed from: X */
    protected int f66218X;

    /* renamed from: Y */
    protected int f66219Y;

    /* renamed from: Z */
    private float f66220Z;

    /* renamed from: a */
    private final JavaOnlyMap f66221a;
    private String aa;

    /* renamed from: b */
    private String f66222b;

    /* renamed from: c */
    private String f66223c;

    /* renamed from: d */
    private String f66224d;

    /* renamed from: e */
    private int f66225e;

    /* renamed from: f */
    private String f66226f;

    /* renamed from: g */
    private String f66227g;

    /* renamed from: h */
    private String f66228h;

    /* renamed from: i */
    private boolean f66229i;

    /* renamed from: j */
    private Rect f66230j;

    /* renamed from: k */
    private int f66231k;

    /* renamed from: l */
    private int f66232l;

    /* renamed from: m */
    private int f66233m;

    /* renamed from: n */
    private int f66234n;

    /* renamed from: o */
    private boolean f66235o;

    /* renamed from: p */
    private boolean f66236p;

    /* renamed from: q */
    private boolean f66237q;

    /* renamed from: r */
    private float f66238r;

    /* renamed from: t */
    protected AbstractC26684l f66239t;

    /* renamed from: u */
    protected Object f66240u;

    /* renamed from: v */
    protected AbstractC26757c f66241v;

    /* renamed from: w */
    protected final List<LynxBaseUI> f66242w;

    /* renamed from: x */
    protected C26830c f66243x;

    /* renamed from: y */
    public Map<String, C26545a> f66244y;

    /* renamed from: z */
    public int f66245z;

    /* renamed from: G */
    public float mo94924G() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: H */
    public float mo94925H() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: I */
    public float mo94926I() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public long mo94944a(float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        return 0;
    }

    /* renamed from: a */
    public ViewGroup.LayoutParams mo53895a(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* renamed from: a */
    public void mo94947a(float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i5, int i6, int i7, int i8) {
    }

    /* renamed from: a */
    public void mo94948a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    /* renamed from: a */
    public void mo94949a(int i, long j, long j2, int i2, int i3, float f, float f2, float f3, float f4, int i4) {
    }

    /* renamed from: a */
    public void mo94951a(int i, float[] fArr, int[] iArr, int[] iArr2) {
    }

    /* renamed from: a */
    public void mo94952a(int i, String[] strArr, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2) {
    }

    /* renamed from: a */
    public void mo94953a(long j) {
    }

    /* renamed from: a */
    public void mo94954a(ReadableMap readableMap) {
    }

    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
    }

    /* renamed from: a */
    public void mo94958a(Object obj) {
    }

    /* renamed from: a */
    public void mo94959a(String str, long j, long j2, int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: a */
    public void mo53295a(boolean z, boolean z2) {
    }

    /* renamed from: a */
    public void mo94962a(float[] fArr, int[] iArr) {
    }

    /* renamed from: a */
    public void mo94964a(int[] iArr, float[] fArr) {
    }

    /* renamed from: a */
    public void mo94965a(int[] iArr, float[] fArr, String str) {
    }

    public int ab() {
        return 0;
    }

    public int ac() {
        return 0;
    }

    public void ai() {
    }

    public C26585a aj() {
        return null;
    }

    public boolean ak() {
        return false;
    }

    public C26575c al() {
        return null;
    }

    public void am() {
    }

    /* access modifiers changed from: protected */
    public float ao() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float ap() {
        return 1.0f;
    }

    public int as() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void at() {
    }

    /* renamed from: b */
    public void mo53592b() {
    }

    /* renamed from: b */
    public void mo94990b(float[] fArr) {
    }

    public boolean needCustomLayout() {
        return false;
    }

    @LynxProp(name = "caret-color")
    public void setCaretColor(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: v */
    public void mo95040v() {
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: w */
    public void mo95041w() {
    }

    /* renamed from: y */
    public boolean mo95043y() {
        return true;
    }

    /* renamed from: z */
    public void mo95044z() {
    }

    /* renamed from: A */
    public C26830c mo94918A() {
        return this.f66243x;
    }

    /* renamed from: B */
    public String mo94919B() {
        return this.f66226f;
    }

    /* renamed from: C */
    public AbstractC26757c mo94920C() {
        return this.f66241v;
    }

    /* renamed from: D */
    public List<LynxBaseUI> mo94921D() {
        return this.f66242w;
    }

    /* renamed from: F */
    public JavaOnlyMap mo94923F() {
        return this.f66221a;
    }

    /* renamed from: J */
    public boolean mo94927J() {
        return this.f66236p;
    }

    /* renamed from: M */
    public int mo94930M() {
        return this.f66207M;
    }

    /* renamed from: O */
    public CharSequence mo94932O() {
        return this.aa;
    }

    /* renamed from: P */
    public String mo94933P() {
        return this.f66222b;
    }

    /* renamed from: Q */
    public String mo94934Q() {
        return this.f66223c;
    }

    /* renamed from: R */
    public String mo94935R() {
        return this.f66224d;
    }

    /* renamed from: S */
    public Rect mo94936S() {
        return this.f66230j;
    }

    /* renamed from: T */
    public int mo94937T() {
        return this.f66233m;
    }

    /* renamed from: U */
    public int mo94938U() {
        return this.f66234n;
    }

    public void U_() {
        mo95041w();
    }

    /* renamed from: V */
    public int mo94939V() {
        return this.f66232l;
    }

    /* renamed from: W */
    public int mo94940W() {
        return this.f66231k;
    }

    /* renamed from: X */
    public int mo94941X() {
        return this.f66198D;
    }

    /* renamed from: Y */
    public int mo94942Y() {
        return this.f66199E;
    }

    /* renamed from: Z */
    public int mo94943Z() {
        return this.f66200F;
    }

    public int aa() {
        return this.f66201G;
    }

    public float ad() {
        return this.f66206L;
    }

    public List<C26836h> ae() {
        return this.f66210P;
    }

    public boolean af() {
        return this.f66229i;
    }

    public String ag() {
        return this.f66228h;
    }

    public boolean au() {
        return this.f66212R;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: m */
    public boolean mo53309m() {
        return this.f66208N;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: q */
    public int mo94576q() {
        return this.f66225e;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: s */
    public Map<String, C26545a> mo94578s() {
        return this.f66244y;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: t */
    public boolean mo94579t() {
        return this.f66209O;
    }

    /* renamed from: u */
    public AbstractC26684l mo95039u() {
        return this.f66239t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94957a(C26830c cVar) {
        this.f66243x = cVar;
    }

    /* renamed from: a */
    public void mo94950a(int i, String str) {
        this.f66225e = i;
        this.f66226f = str;
    }

    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        this.f66244y = map;
    }

    /* renamed from: a */
    public void mo94956a(AbstractC26757c cVar) {
        this.f66241v = cVar;
    }

    /* renamed from: a */
    public void mo94955a(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        int i;
        if (lynxBaseUI2 == null) {
            i = this.f66242w.size();
        } else {
            i = this.f66242w.indexOf(lynxBaseUI2);
        }
        if (this instanceof LynxFlattenUI) {
            this.f66242w.add(i, lynxBaseUI);
            lynxBaseUI.mo94956a((AbstractC26757c) this);
            return;
        }
        ((UIGroup) this).mo33940a(lynxBaseUI, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94960a(short s, int i) {
        int i2 = this.f66207M;
        this.f66207M = i == 0 ? i2 | s : i2 & (~s);
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof UIShadowProxy) {
            ((UIShadowProxy) cVar).mo94960a(s, i);
        }
    }

    /* renamed from: a */
    public void mo94961a(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            this.f66213S = null;
            return;
        }
        Sticky sticky = new Sticky();
        this.f66213S = sticky;
        sticky.left = fArr[0];
        this.f66213S.top = fArr[1];
        this.f66213S.right = fArr[2];
        this.f66213S.bottom = fArr[3];
        Sticky sticky2 = this.f66213S;
        sticky2.f66247b = BitmapDescriptorFactory.HUE_RED;
        sticky2.f66246a = BitmapDescriptorFactory.HUE_RED;
        LynxBaseUI ar = ar();
        if (ar instanceof AbstractC26813b) {
            ((AbstractC26813b) ar).ak_();
        }
    }

    /* renamed from: a */
    public void mo94963a(int[] iArr, float f, int i, int i2, int i3, int i4) {
        for (int i5 : iArr) {
            if (i5 == 0) {
                mo94987b(f);
            } else if (i5 == 1) {
                setOverflowX(i);
            } else if (i5 == 2) {
                setOverflowY(i2);
            } else if (i5 == 3) {
                mo95002h(i3);
            } else if (i5 == 4) {
                setCSSPosition(i4);
            }
        }
    }

    /* renamed from: K */
    public void mo94928K() {
        U_();
        ai();
    }

    public void T_() {
        this.f66243x.mo95541g();
    }

    public void an() {
        this.f66243x.mo95540f();
    }

    /* renamed from: x */
    public void mo95042x() {
        AbstractC26684l lVar = this.f66239t;
        if (lVar != null) {
            lVar.mo94664a(this);
        }
    }

    /* renamed from: e */
    private boolean mo53301e() {
        if (Build.VERSION.SDK_INT != 25 || !mo53305i()) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.p1221a.AbstractC26623a
    /* renamed from: r */
    public AbstractC26623a mo94577r() {
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof AbstractC26623a) {
            return (AbstractC26623a) cVar;
        }
        return null;
    }

    /* renamed from: h */
    private static boolean mo53304h() {
        String str = Build.BRAND;
        if (str != null && str.toLowerCase(Locale.ENGLISH).indexOf("meizu") > -1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean mo53305i() {
        if (!mo53304h() || TextUtils.isEmpty(Build.DEVICE)) {
            return false;
        }
        return Build.DEVICE.contains("15");
    }

    /* renamed from: E */
    public LynxUI mo94922E() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.f66241v) {
            if (lynxBaseUI instanceof LynxUI) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo53258a() {
        this.f66243x.mo95522a((float) this.f66196B, (float) this.f66195A, (float) this.f66197C, (float) this.f66245z);
        mo95040v();
    }

    public void ah() {
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            lynxBaseUI.ah();
        }
    }

    public LynxBaseUI ar() {
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof UIShadowProxy) {
            return (LynxBaseUI) ((UIShadowProxy) cVar).mo94920C();
        }
        return (LynxBaseUI) cVar;
    }

    /* renamed from: j */
    public void mo53306j() {
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            lynxBaseUI.mo53306j();
        }
    }

    /* renamed from: k */
    private void mo53307k() {
        Map<String, C26545a> map = this.f66244y;
        if (map != null && map.containsKey("layoutchange")) {
            mo95039u().mo94687i().mo94075a(new C26546b(mo94576q(), "layoutchange", mo53300d()));
        }
    }

    /* renamed from: d */
    private JavaOnlyMap mo53300d() {
        Rect L = mo94929L();
        float f = mo95039u().mo94672b().density;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("id", mo94934Q());
        javaOnlyMap.putMap("dataset", new JavaOnlyMap());
        javaOnlyMap.putDouble("left", (double) (((float) L.left) / f));
        javaOnlyMap.putDouble("top", (double) (((float) L.top) / f));
        javaOnlyMap.putDouble("right", (double) (((float) L.right) / f));
        javaOnlyMap.putDouble("bottom", (double) (((float) L.bottom) / f));
        javaOnlyMap.putDouble("width", (double) (((float) L.width()) / f));
        javaOnlyMap.putDouble("height", (double) (((float) L.height()) / f));
        return javaOnlyMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public Rect mo94931N() {
        int i;
        if (mo94930M() == 3) {
            return null;
        }
        int T = mo94937T();
        int U = mo94938U();
        DisplayMetrics b = mo95039u().mo94672b();
        int i2 = 0;
        if ((mo94930M() & 1) != 0) {
            i = 0 - b.widthPixels;
            T += b.widthPixels * 2;
        } else {
            i = 0;
        }
        if ((mo94930M() & 2) != 0) {
            i2 = 0 - b.heightPixels;
            U += b.heightPixels * 2;
        }
        return new Rect(i, i2, T + i, U + i2);
    }

    /* access modifiers changed from: protected */
    public Rect aq() {
        float W = ((float) mo94940W()) + (((float) mo94937T()) / 2.0f);
        float V = ((float) mo94939V()) + (((float) mo94938U()) / 2.0f);
        float T = ((float) mo94937T()) * ao();
        float U = ((float) mo94938U()) * ap();
        float G = (W - (T / 2.0f)) + mo94924G();
        float H = (V - (U / 2.0f)) + mo94925H();
        return new Rect((int) G, (int) H, (int) (G + T), (int) (H + U));
    }

    /* renamed from: L */
    public Rect mo94929L() {
        int i;
        ViewGroup d = this.f66239t.mo94692n().mo53300d();
        int i2 = 0;
        if (d == null) {
            return new Rect(0, 0, mo94937T() + 0, mo94938U() + 0);
        }
        if (this instanceof LynxUI) {
            T t = ((LynxUI) this).f66253Z;
            Rect rect = new Rect();
            View rootView = t.getRootView();
            if (d.getRootView() != rootView && (rootView instanceof ViewGroup)) {
                d = (ViewGroup) rootView;
            }
            try {
                d.offsetDescendantRectToMyCoords(t, rect);
                rect.offset(t.getScrollX(), t.getScrollY());
            } catch (IllegalArgumentException unused) {
            }
            int i3 = rect.top;
            i2 = rect.left;
            i = i3;
        } else if (this instanceof LynxFlattenUI) {
            AbstractC26757c cVar = this.f66241v;
            if (cVar == null || cVar == this.f66239t.mo94692n()) {
                i2 = this.f66231k;
                i = this.f66232l;
            } else {
                i = 0;
                LynxBaseUI lynxBaseUI = this;
                while ((lynxBaseUI instanceof LynxFlattenUI) && lynxBaseUI != this.f66239t.mo94692n()) {
                    i2 += lynxBaseUI.mo94940W();
                    i += lynxBaseUI.mo94939V();
                    lynxBaseUI = lynxBaseUI.ar();
                }
                if (lynxBaseUI != null) {
                    Rect L = lynxBaseUI.mo94929L();
                    i2 += L.left;
                    i += L.top;
                }
            }
        } else {
            i = 0;
        }
        return new Rect(i2, i, mo94937T() + i2, mo94938U() + i);
    }

    @LynxProp(defaultFloat = 1.0f, name = "position")
    public final void setCSSPosition(int i) {
        this.f66218X = i;
    }

    @LynxProp(name = "enable-scroll-monitor")
    public void setEnableScrollMonitor(boolean z) {
        this.f66229i = z;
    }

    @LynxProp(name = "idSelector")
    public void setIdSelector(String str) {
        this.f66223c = str;
    }

    @LynxProp(defaultInt = 0, name = HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    public void setLynxDirection(int i) {
        this.f66219Y = i;
    }

    @LynxProp(name = "name")
    public void setName(String str) {
        this.f66222b = str;
    }

    @LynxProp(name = "react-ref")
    public void setRefIdSelector(String str) {
        this.f66224d = str;
    }

    @LynxProp(name = "scroll-monitor-tag")
    public void setScrollMonitorTag(String str) {
        this.f66228h = str;
    }

    @LynxProp(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.f66227g = str;
    }

    @LynxProp(defaultBoolean = true, name = "user-interaction-enabled")
    public void setUserInteractionEnabled(boolean z) {
        this.f66212R = z;
    }

    public class Sticky extends RectF {

        /* renamed from: a */
        float f66246a;

        /* renamed from: b */
        float f66247b;

        public Sticky() {
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.LynxBaseUI$a */
    private class C26741a implements Drawable.Callback {
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private C26741a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            LynxBaseUI.this.mo95041w();
        }
    }

    protected LynxBaseUI(AbstractC26684l lVar) {
        this(lVar, null);
    }

    /* renamed from: b */
    public void mo53593b(C26697s sVar) {
        mo94994c(sVar);
        mo94928K();
    }

    /* renamed from: d */
    public void mo94997d(int i) {
        this.f66231k = i;
        mo53258a();
    }

    /* renamed from: e */
    public void mo94999e(int i) {
        this.f66232l = i;
        mo53258a();
    }

    /* renamed from: f */
    public void mo95000f(int i) {
        this.f66233m = i;
        mo53258a();
    }

    /* renamed from: g */
    public void mo95001g(int i) {
        this.f66234n = i;
        mo53258a();
    }

    @LynxProp(name = "accessibility-label")
    public void setAccessibilityLabel(String str) {
        if (str == null) {
            str = "";
        }
        this.aa = str;
    }

    @LynxProp(name = "background-clip")
    public void setBackgroundClip(ReadableArray readableArray) {
        this.f66243x.mo95539e(readableArray);
    }

    @LynxProp(defaultInt = 1, name = "overflow")
    public void setOverflow(int i) {
        mo94960a((short) 3, i);
    }

    @LynxProp(defaultInt = 1, name = "overflow-x")
    public void setOverflowX(int i) {
        mo94960a((short) 1, i);
    }

    @LynxProp(defaultInt = 1, name = "overflow-y")
    public void setOverflowY(int i) {
        mo94960a((short) 2, i);
    }

    /* renamed from: a */
    public void mo94946a(float f) {
        this.f66214T = f;
    }

    /* renamed from: b */
    public void mo94987b(float f) {
        if (this instanceof LynxUI) {
            ((LynxUI) this).setAlpha(f);
        }
        mo95041w();
    }

    /* renamed from: c */
    public void mo94994c(C26697s sVar) {
        this.f66221a.merge(sVar.f66083a);
        PropsUpdater.m97605a(this, sVar);
    }

    /* renamed from: d */
    public void mo94998d(C26697s sVar) {
        mo53259a(sVar);
        U_();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo95002h(int i) {
        if (this instanceof LynxUI) {
            ((LynxUI) this).setVisibility(i);
        }
        mo95041w();
    }

    @LynxProp(name = "background-image")
    public void setBackgroundImage(String str) {
        this.f66243x.mo95532b(str);
        mo95041w();
    }

    @LynxProp(name = "background-origin")
    public void setBackgroundOrigin(ReadableArray readableArray) {
        this.f66243x.mo95534c(readableArray);
        mo95041w();
    }

    @LynxProp(name = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        this.f66243x.mo95530a(readableArray);
        mo95041w();
    }

    @LynxProp(name = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        this.f66243x.mo95537d(readableArray);
        mo95041w();
    }

    @LynxProp(name = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        this.f66243x.mo95531b(readableArray);
        mo95041w();
    }

    @LynxProp(name = "box-shadow")
    public void setBoxShadow(ReadableArray readableArray) {
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof UIShadowProxy) {
            ((UIShadowProxy) cVar).setBoxShadow(readableArray);
        }
    }

    @LynxProp(name = "focusable")
    public void setFocusable(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f66208N = z;
    }

    @LynxProp(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            this.f66206L = f;
            this.f66243x.mo95521a(f);
        }
    }

    @LynxProp(name = "ignore-focus")
    public void setIgnoreFocus(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f66209O = z;
    }

    @LynxProp(defaultInt = -16777216, name = "outline-color")
    public void setOutlineColor(int i) {
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof UIShadowProxy) {
            ((UIShadowProxy) cVar).setOutlineColor(i);
        }
    }

    @LynxProp(defaultInt = -1, name = "outline-style")
    public void setOutlineStyle(int i) {
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof UIShadowProxy) {
            ((UIShadowProxy) cVar).mo95140a(BorderStyle.parse(i));
        }
    }

    @LynxProp(defaultInt = 0, name = "outline-width")
    public void setOutlineWidth(float f) {
        AbstractC26757c cVar = this.f66241v;
        if (cVar instanceof UIShadowProxy) {
            ((UIShadowProxy) cVar).setOutlineWidth(f);
        }
    }

    /* renamed from: c */
    public void mo94995c(LynxBaseUI lynxBaseUI) {
        if (this instanceof LynxFlattenUI) {
            this.f66242w.remove(lynxBaseUI);
            lynxBaseUI.mo94956a((AbstractC26757c) null);
            return;
        }
        ((UIGroup) this).mo33939a(lynxBaseUI);
    }

    @LynxProp(name = "background")
    public void setBackGround(String str) {
        this.f66243x.mo95535c(str);
        this.f66215U = this.f66243x.mo95536d();
        mo95041w();
    }

    @LynxProp(name = "clip-radius")
    public void setClipToRadius(String str) {
        if (str == null || (!str.equalsIgnoreCase("true") && !str.equalsIgnoreCase("yes"))) {
            this.f66236p = false;
        } else {
            this.f66236p = true;
        }
    }

    public void setTransform(ReadableArray readableArray) {
        this.f66210P = C26836h.m97577a(readableArray);
        if (mo94920C() instanceof UIShadowProxy) {
            ((UIShadowProxy) mo94920C()).mo53305i();
        }
    }

    public void setTransformOrigin(ReadableArray readableArray) {
        this.f66211Q = C26833f.f66643a;
        if (readableArray != null) {
            C26833f a = C26833f.m97538a(readableArray);
            this.f66211Q = a;
            if (a == null) {
                LLog.m96429e("LynxBaseUI", "transform params error.");
                this.f66211Q = C26833f.f66643a;
            }
        }
    }

    /* renamed from: a */
    private float mo67411a(String str) {
        UIBody n = this.f66239t.mo94692n();
        return C26960n.m97978a(str, n.ad(), ad(), (float) n.mo94937T(), (float) n.mo94938U(), 1.0E21f, this.f66239t.mo94672b());
    }

    @LynxProp(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.f66215U = i;
        if (aj() == null || !aj().mo94458a(64)) {
            this.f66243x.mo95523a(i);
            mo95041w();
            return;
        }
        aj().mo94460a(this, 64, Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo53261b(LynxBaseUI lynxBaseUI) {
        LynxUI E;
        if (this.f66242w.remove(lynxBaseUI)) {
            if ((lynxBaseUI instanceof LynxUI) && (E = mo94922E()) != null) {
                E.ab.remove(lynxBaseUI);
            }
            lynxBaseUI.mo94956a((AbstractC26757c) null);
            this.f66237q = false;
        }
    }

    @LynxUIMethod
    public void scrollIntoView(ReadableMap readableMap) {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        if (readableMap != null && (hashMap = (HashMap) readableMap.toHashMap().get("scrollIntoViewOptions")) != null) {
            if (hashMap.containsKey("behavior")) {
                str = (String) hashMap.get("behavior");
            } else {
                str = "auto";
            }
            if (hashMap.containsKey("block")) {
                str2 = (String) hashMap.get("block");
            } else {
                str2 = "start";
            }
            if (hashMap.containsKey("inline")) {
                str3 = (String) hashMap.get("inline");
            } else {
                str3 = "nearest";
            }
            LynxBaseUI lynxBaseUI = this;
            while (lynxBaseUI.mo94920C() != null && (lynxBaseUI.mo94920C() instanceof LynxBaseUI)) {
                if (lynxBaseUI instanceof AbsLynxUIScroll) {
                    ((AbsLynxUIScroll) lynxBaseUI).mo95337a(this, str.equals("smooth"), str2, str3);
                    return;
                }
                lynxBaseUI = (LynxBaseUI) lynxBaseUI.mo94920C();
            }
        }
    }

    @LynxProp(name = "image-config")
    public void setImageConfig(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.f66217W = null;
            return;
        }
        if (str.equalsIgnoreCase("ALPHA_8")) {
            this.f66217W = Bitmap.Config.ALPHA_8;
        } else if (str.equalsIgnoreCase("RGB_565")) {
            if (!mo53301e()) {
                this.f66217W = Bitmap.Config.RGB_565;
            } else {
                LLog.m96427d("LynxBaseUI setImageConfig warn: ", "RGB_565 can't be set on Meizu15");
                this.f66217W = null;
            }
        } else if (str.equalsIgnoreCase("ARGB_8888")) {
            this.f66217W = Bitmap.Config.ARGB_8888;
        } else if (str.equalsIgnoreCase("RGBA_F16")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f66217W = Bitmap.Config.RGBA_F16;
            } else {
                LLog.m96427d("LynxBaseUI setImageConfig warn: ", "RGBA_F16 requires build version >= VERSION_CODES.O");
                this.f66217W = null;
            }
        } else if (!str.equalsIgnoreCase("HARDWARE")) {
            this.f66217W = null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f66217W = Bitmap.Config.HARDWARE;
        } else {
            this.f66217W = null;
            LLog.m96427d("LynxBaseUI setImageConfig warn: ", "HARDWARE requires build version >= VERSION_CODES.O");
        }
        C26830c cVar = this.f66243x;
        if (cVar != null) {
            cVar.mo95528a(this.f66217W);
        }
    }

    @LynxPropGroup(customType = "Color", names = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"})
    public void setBorderColor(int i, Integer num) {
        m96897a(f66194s[i + 1], num);
    }

    @LynxPropGroup(names = {"border-width", "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        this.f66243x.mo95524a(f66194s[i], (float) i2);
    }

    @LynxUIMethod
    public void boundingClientRect(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, mo53300d());
    }

    @LynxPropGroup(defaultInt = -1, names = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"})
    public void setBorderStyle(int i, int i2) {
        Integer num;
        C26830c cVar = this.f66243x;
        int i3 = f66194s[i];
        if (i2 == -1) {
            num = null;
        } else {
            num = Integer.valueOf(i2);
        }
        cVar.mo95526a(i3, num.intValue());
    }

    /* renamed from: c */
    public boolean mo94996c(float f, float f2) {
        float ab = ((f + ((float) ab())) - ((float) mo94940W())) - mo94924G();
        float ac = ((f2 + ((float) ac())) - ((float) mo94939V())) - mo94925H();
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            if (lynxBaseUI.mo94991b(ab, ac)) {
                return true;
            }
        }
        return false;
    }

    protected LynxBaseUI(AbstractC26684l lVar, Object obj) {
        this.f66242w = new ArrayList();
        this.f66221a = new JavaOnlyMap();
        this.f66235o = false;
        this.f66207M = 0;
        this.f66236p = false;
        this.f66208N = false;
        this.f66209O = false;
        this.f66212R = true;
        this.f66213S = null;
        this.f66214T = -1.0f;
        this.f66215U = 0;
        this.f66237q = false;
        this.f66238r = BitmapDescriptorFactory.HUE_RED;
        this.f66220Z = BitmapDescriptorFactory.HUE_RED;
        this.f66216V = new C26741a();
        this.f66217W = null;
        this.f66218X = 1;
        this.f66219Y = 0;
        this.f66239t = lVar;
        this.f66240u = obj;
        C26830c cVar = new C26830c(lVar);
        this.f66243x = cVar;
        cVar.mo95529a(this.f66216V);
        float a = C26955i.m97952a(14.0f);
        this.f66206L = a;
        this.f66243x.mo95521a(a);
        mo95044z();
    }

    /* renamed from: a */
    private void m96897a(int i, Integer num) {
        float f;
        float f2 = 1.0E21f;
        if (num == null) {
            f = 1.0E21f;
        } else {
            f = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f2 = (float) (num.intValue() >>> 24);
        }
        this.f66243x.mo95525a(i, f, f2);
    }

    /* renamed from: a */
    public AbstractC26623a mo94945a(float f, float f2) {
        UIGroup uIGroup = null;
        for (int size = this.f66242w.size() - 1; size >= 0; size--) {
            LynxBaseUI lynxBaseUI = this.f66242w.get(size);
            if (lynxBaseUI instanceof UIShadowProxy) {
                lynxBaseUI = ((UIShadowProxy) lynxBaseUI).mo53300d();
            }
            if (lynxBaseUI.au() && lynxBaseUI.mo95043y() && lynxBaseUI.mo94991b(f, f2) && (uIGroup == null || uIGroup.as() < lynxBaseUI.as() || (uIGroup.as() == lynxBaseUI.as() && uIGroup.mo94926I() < lynxBaseUI.mo94926I()))) {
                uIGroup = lynxBaseUI;
            }
        }
        if (uIGroup == null) {
            return this;
        }
        if (!uIGroup.needCustomLayout() || !(uIGroup instanceof UIGroup)) {
            return uIGroup.mo94945a(((f + ((float) uIGroup.ab())) - ((float) uIGroup.mo94940W())) - uIGroup.mo94924G(), ((f2 + ((float) uIGroup.ac())) - ((float) uIGroup.mo94939V())) - uIGroup.mo94925H());
        }
        UIGroup uIGroup2 = uIGroup;
        return uIGroup2.mo95121a(f - ((float) uIGroup.mo94940W()), f2 - ((float) uIGroup.mo94939V()), uIGroup2);
    }

    /* renamed from: b */
    public void mo53262b(LynxBaseUI lynxBaseUI, int i) {
        this.f66242w.add(i, lynxBaseUI);
        lynxBaseUI.mo94956a((AbstractC26757c) this);
    }

    @LynxPropGroup(defaultFloat = BitmapDescriptorFactory.HUE_RED, names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, String str) {
        String[] strArr;
        int i2 = 0;
        this.f66235o = false;
        if (i == 0) {
            BorderRadius.C26826a[] aVarArr = new BorderRadius.C26826a[4];
            for (int i3 = 0; i3 < 4; i3++) {
                aVarArr[i3] = new BorderRadius.C26826a();
            }
            if (str != null) {
                this.f66235o = true;
                String[] split = str.split("/");
                if (split.length > 0) {
                    String[] split2 = split[0].trim().split("\\s+");
                    if (split.length > 1) {
                        strArr = split[1].trim().split("\\s+");
                    } else {
                        strArr = null;
                    }
                    for (int i4 = 0; i4 < 4; i4++) {
                        BorderRadius.C26826a aVar = aVarArr[i4];
                        if (split2.length > i4) {
                            aVar.f66624a = mo67411a(split2[i4]);
                            aVar.f66626c = BorderRadius.m97489a(split2[i4]);
                        } else if (i4 > 0) {
                            int i5 = i4 > 1 ? i4 - 2 : 0;
                            aVar.f66624a = aVarArr[i5].f66624a;
                            aVar.f66626c = aVarArr[i5].f66626c;
                        }
                        if (strArr == null) {
                            aVar.f66625b = aVar.f66624a;
                            aVar.f66627d = aVar.f66626c;
                        } else if (strArr.length > i4) {
                            aVar.f66625b = mo67411a(strArr[i4]);
                            aVar.f66627d = BorderRadius.m97489a(strArr[i4]);
                        } else if (i4 > 0) {
                            int i6 = i4 > 1 ? i4 - 2 : 0;
                            aVar.f66625b = aVarArr[i6].f66625b;
                            aVar.f66627d = aVarArr[i6].f66627d;
                        }
                    }
                }
            }
            while (i2 < 4) {
                int i7 = i2 + 1;
                this.f66243x.mo95527a(i7, aVarArr[i2]);
                i2 = i7;
            }
            return;
        }
        BorderRadius.C26826a aVar2 = new BorderRadius.C26826a();
        if (str != null) {
            this.f66235o = true;
            String[] split3 = str.split("\\s+");
            int length = split3.length;
            if (length > 0) {
                aVar2.f66624a = mo67411a(split3[0]);
                aVar2.f66626c = BorderRadius.m97489a(split3[0]);
            }
            if (length > 1) {
                aVar2.f66625b = mo67411a(split3[1]);
                aVar2.f66627d = BorderRadius.m97489a(split3[1]);
            } else {
                aVar2.f66625b = aVar2.f66624a;
                aVar2.f66627d = aVar2.f66626c;
            }
        }
        this.f66243x.mo95527a(i, aVar2);
    }

    /* renamed from: b */
    public boolean mo94991b(float f, float f2) {
        boolean z;
        Rect aq = aq();
        boolean z2 = false;
        if (((float) aq.left) >= f || ((float) aq.right) <= f || ((float) aq.top) >= f2 || ((float) aq.bottom) <= f2) {
            z = false;
        } else {
            z = true;
        }
        if (mo94936S() != null && z) {
            Rect S = mo94936S();
            if (((float) S.left) < f && ((float) S.right) > f && ((float) S.top) < f2 && ((float) S.bottom) > f2) {
                z2 = true;
            }
            z = z2;
        }
        if (z || mo94930M() == 0) {
            return z;
        }
        if (mo94930M() == 1) {
            if (((float) aq.top) >= f2 || ((float) aq.bottom) <= f2) {
                return z;
            }
        } else if (mo94930M() == 2 && (((float) aq.left) >= f || ((float) aq.right) <= f)) {
            return z;
        }
        return mo94996c(f, f2);
    }

    /* renamed from: b */
    public boolean mo94992b(int i, int i2) {
        if (this.f66213S == null) {
            return false;
        }
        float W = (float) (mo94940W() - i);
        float V = (float) (mo94939V() - i2);
        if (W < this.f66213S.left) {
            Sticky sticky = this.f66213S;
            sticky.f66246a = sticky.left - W;
        } else {
            int T = ar().mo94937T();
            float T2 = ((float) mo94937T()) + W;
            float f = (float) T;
            if (this.f66213S.right + T2 > f) {
                Sticky sticky2 = this.f66213S;
                sticky2.f66246a = Math.max((f - T2) - sticky2.right, this.f66213S.left - W);
            } else {
                this.f66213S.f66246a = BitmapDescriptorFactory.HUE_RED;
            }
        }
        if (V < this.f66213S.top) {
            Sticky sticky3 = this.f66213S;
            sticky3.f66247b = sticky3.top - V;
            return true;
        }
        int U = ar().mo94938U();
        float U2 = ((float) mo94938U()) + V;
        float f2 = (float) U;
        if (this.f66213S.bottom + U2 > f2) {
            Sticky sticky4 = this.f66213S;
            sticky4.f66247b = Math.max((f2 - U2) - sticky4.bottom, this.f66213S.top - V);
            return true;
        }
        this.f66213S.f66247b = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    /* renamed from: b */
    public void mo94988b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f66231k = i;
        this.f66232l = i2;
        this.f66233m = i3;
        this.f66234n = i4;
        this.f66245z = i5;
        this.f66195A = i7;
        this.f66197C = i8;
        this.f66196B = i6;
        mo53258a();
        mo53307k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo94989b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.f66231k = i;
        this.f66232l = i2;
        this.f66233m = i3;
        this.f66234n = i4;
        this.f66245z = i5;
        this.f66195A = i7;
        this.f66197C = i8;
        this.f66196B = i6;
        this.f66198D = i9;
        this.f66199E = i10;
        this.f66200F = i11;
        this.f66201G = i12;
        this.f66202H = i14;
        this.f66205K = i16;
        this.f66203I = i13;
        this.f66204J = i15;
        this.f66230j = rect;
    }

    /* renamed from: a */
    public void mo53590a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        mo94989b(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        mo53258a();
        mo53307k();
    }
}
