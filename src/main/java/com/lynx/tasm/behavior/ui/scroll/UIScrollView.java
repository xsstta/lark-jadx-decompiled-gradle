package com.lynx.tasm.behavior.ui.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.scroll.C26806a;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import com.lynx.tasm.p1216a.C26552h;
import com.lynx.tasm.utils.C26955i;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.Map;

public class UIScrollView extends AbsLynxUIScroll<C26806a> implements C26806a.AbstractC26811a, AbstractC26813b {

    /* renamed from: a */
    public boolean f66510a;

    /* renamed from: b */
    public boolean f66511b;

    /* renamed from: c */
    private boolean f66512c;

    /* renamed from: d */
    private boolean f66513d;

    /* renamed from: e */
    private boolean f66514e;

    /* renamed from: f */
    private boolean f66515f;

    /* renamed from: g */
    private boolean f66516g;

    /* renamed from: h */
    private boolean f66517h;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: M */
    public int mo94930M() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: N */
    public Rect mo94931N() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
    public void b_(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
    /* renamed from: c */
    public void mo95357c() {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
    /* renamed from: d */
    public void mo53300d() {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setLowerThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setUpperThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbstractC26813b
    public void ak_() {
        this.f66511b = true;
        mo53305i();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int ab() {
        return ((C26806a) this.f66253Z).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int ac() {
        return ((C26806a) this.f66253Z).getScrollY();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: h */
    public View mo53304h() {
        C26806a aVar = (C26806a) av();
        if (aVar == null) {
            return null;
        }
        return aVar.getLinearLayout();
    }

    /* renamed from: k */
    private void m97320k() {
        if (this.f66512c) {
            ((C26806a) this.f66253Z).setOrientation(1);
        } else {
            ((C26806a) this.f66253Z).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        int i = this.f66245z + this.f66203I;
        int i2 = this.f66195A + this.f66204J;
        ((C26806a) this.f66253Z).setPadding(i, this.f66196B + this.f66202H, i2, this.f66197C + this.f66205K);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
    public void al_() {
        if (this.f66516g) {
            mo95353a(ab(), ac(), ab(), ac(), "scrollend");
        }
    }

    /* renamed from: i */
    public void mo53305i() {
        int ab = ab();
        int ac = ac();
        for (int i = 0; i < this.f66242w.size(); i++) {
            ((LynxBaseUI) this.f66242w.get(i)).mo94992b(ab, ac);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: w */
    public void mo95041w() {
        ((C26806a) this.f66253Z).getLinearLayout().invalidate();
        ((C26806a) this.f66253Z).invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void ah() {
        boolean z;
        if (((C26806a) this.f66253Z).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int T = mo94937T();
        int U = mo94938U();
        for (int i = 0; i < aF(); i++) {
            LynxBaseUI a = mo95122a(i);
            if (z) {
                T = Math.max(T, a.mo94937T() + a.mo94940W() + a.mo94943Z());
            } else {
                U = Math.max(U, a.mo94938U() + a.mo94939V() + a.aa());
            }
        }
        if (!(((C26806a) this.f66253Z).getContentWidth() == T && ((C26806a) this.f66253Z).getContentHeight() == U)) {
            m97319d((float) T, (float) U);
        }
        ((C26806a) this.f66253Z).mo95362a(T, U);
        super.ah();
    }

    public UIScrollView(AbstractC26684l lVar) {
        super(lVar);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollTap(boolean z) {
        this.f66510a = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public void mo95339a(boolean z) {
        this.f66512c = z;
        m97320k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26806a mo33942b(Context context) {
        C26806a aVar = new C26806a(context);
        aVar.setOnScrollListener(new C26806a.AbstractC26811a() {
            /* class com.lynx.tasm.behavior.ui.scroll.UIScrollView.C268051 */

            @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
            public void al_() {
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
            /* renamed from: d */
            public void mo53300d() {
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
            /* renamed from: c */
            public void mo95357c() {
                if (UIScrollView.this.f66511b) {
                    UIScrollView.this.mo53305i();
                }
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
            public void b_(int i) {
                if (!UIScrollView.this.f66510a) {
                    if (i != 0) {
                        UIScrollView.this.mo95042x();
                    }
                } else if (i == 1) {
                    UIScrollView.this.mo95042x();
                }
            }

            @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
            /* renamed from: a */
            public void mo95352a(int i, int i2, int i3, int i4) {
                if (UIScrollView.this.f66511b) {
                    UIScrollView.this.mo53305i();
                }
            }
        });
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /* renamed from: b */
    public void mo95340b(boolean z) {
        this.f66512c = !z;
        m97320k();
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setEnableScroll(boolean z) {
        if (this.f66253Z != null) {
            ((C26806a) this.f66253Z).setEnableScroll(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollBarEnable(boolean z) {
        try {
            ((C26806a) this.f66253Z).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            LLog.m96429e("UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollLeft(int i) {
        ((C26806a) av()).mo95364a((int) C26955i.m97952a((float) i), ((C26806a) av()).getRealScrollY(), false);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public void setScrollTop(int i) {
        ((C26806a) av()).mo95364a(((C26806a) av()).getRealScrollX(), (int) C26955i.m97952a((float) i), false);
    }

    @LynxUIMethod
    public void scrollTo(ReadableMap readableMap) {
        double d = readableMap.getDouble("offset") * ((double) DisplayMetricsHolder.m97898a().density);
        boolean z = readableMap.getBoolean("smooth", false);
        if (this.f66512c) {
            ((C26806a) this.f66253Z).mo95364a(0, (int) d, z);
        } else {
            ((C26806a) this.f66253Z).mo95364a((int) d, 0, z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        if (map != null) {
            this.f66513d = false;
            this.f66514e = false;
            this.f66515f = false;
            this.f66516g = false;
            if (map.containsKey("scrolltolower")) {
                this.f66514e = true;
            }
            if (map.containsKey("scrolltoupper")) {
                this.f66513d = true;
            }
            if (map.containsKey("scroll")) {
                this.f66515f = true;
            }
            if (map.containsKey("scrollend")) {
                this.f66516g = true;
            }
            if (map.containsKey("contentsizechanged")) {
                this.f66517h = true;
            }
            if (this.f66514e || this.f66513d || this.f66515f || this.f66516g) {
                ((C26806a) this.f66253Z).setOnScrollListener(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo95124a(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        super.mo95124a(lynxFlattenUI, canvas);
    }

    /* renamed from: d */
    private void m97319d(float f, float f2) {
        if (this.f66517h && DisplayMetricsHolder.m97898a() != null) {
            C26547c cVar = new C26547c(mo94576q(), "contentsizechanged");
            cVar.mo94347a("scrollWidth", Float.valueOf(f / DisplayMetricsHolder.m97898a().density));
            cVar.mo94347a("scrollHeight", Float.valueOf(f2 / DisplayMetricsHolder.m97898a().density));
            if (mo95039u() != null) {
                mo95039u().mo94687i().mo94075a(cVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public void mo95337a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
        mo95338a(lynxBaseUI, z, str, str2, 0);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.C26806a.AbstractC26811a
    /* renamed from: a */
    public void mo95352a(int i, int i2, int i3, int i4) {
        View childAt;
        if (i == i3 && i == 0) {
            if (i2 != 0) {
                View childAt2 = ((C26806a) this.f66253Z).getChildAt(0);
                if (childAt2 != null && childAt2.getMeasuredHeight() == ac() + ((C26806a) this.f66253Z).getMeasuredHeight()) {
                    if (this.f66514e) {
                        mo95353a(i, i2, i3, i4, "scrolltolower");
                        return;
                    }
                    return;
                }
            } else if (this.f66513d) {
                mo95353a(i, i2, i3, i4, "scrolltoupper");
                return;
            } else {
                return;
            }
        } else if (i2 == i4 && i2 == 0) {
            if (i == 0 || (i > 0 && i3 == 0)) {
                if (this.f66513d) {
                    mo95353a(i, i2, i3, i4, "scrolltoupper");
                    return;
                }
                return;
            } else if (((C26806a) this.f66253Z).getHScrollView() != null && (childAt = ((C26806a) this.f66253Z).getHScrollView().getChildAt(0)) != null && i == childAt.getMeasuredWidth() - ((C26806a) this.f66253Z).getMeasuredWidth() && this.f66514e) {
                mo95353a(i, i2, i3, i4, "scrolltolower");
                return;
            }
        }
        if (this.f66515f) {
            mo95353a(i, i2, i3, i4, "scroll");
        }
    }

    /* renamed from: a */
    public void mo95353a(int i, int i2, int i3, int i4, String str) {
        C26552h a = C26552h.m96260a(mo94576q(), str);
        a.mo94356a(i, i2, ((C26806a) this.f66253Z).getContentHeight(), ((C26806a) this.f66253Z).getContentWidth(), i - i3, i2 - i4);
        if (mo95039u() != null) {
            mo95039u().mo94687i().mo94075a(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[LOOP:0: B:13:0x0043->B:14:0x0045, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1 A[LOOP:1: B:27:0x00af->B:28:0x00b1, LOOP_END] */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95338a(com.lynx.tasm.behavior.ui.LynxBaseUI r6, boolean r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.UIScrollView.mo95338a(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }
}
