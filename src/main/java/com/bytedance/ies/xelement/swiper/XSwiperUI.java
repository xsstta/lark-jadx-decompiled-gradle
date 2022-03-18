package com.bytedance.ies.xelement.swiper;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.swiper.ViewPager;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.AbstractC26757c;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import com.lynx.tasm.utils.C26960n;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.List;
import java.util.Map;

public class XSwiperUI extends UISimpleView<SwiperView> {

    /* renamed from: a */
    static final int f38484a = Color.argb(255, 255, 255, 255);

    /* renamed from: b */
    static final int f38485b = Color.argb(89, 255, 255, 255);
    private ViewPager.AbstractC14547c ad;
    private ViewPager.AbstractC14547c ae;

    /* renamed from: c */
    public boolean f38486c;

    /* renamed from: d */
    public int f38487d;

    /* renamed from: e */
    public boolean f38488e;

    /* renamed from: f */
    public boolean f38489f;

    /* renamed from: g */
    public boolean f38490g;

    /* renamed from: h */
    public boolean f38491h;

    /* renamed from: i */
    public boolean f38492i;

    /* renamed from: j */
    public boolean f38493j;

    /* renamed from: k */
    public final Handler f38494k;

    /* renamed from: l */
    public final List<View> f38495l;

    /* renamed from: m */
    public Runnable f38496m;

    /* renamed from: n */
    private String f38497n;

    /* renamed from: o */
    private int f38498o;

    /* renamed from: p */
    private int f38499p;

    /* renamed from: q */
    private int f38500q;

    /* renamed from: r */
    private int f38501r;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void T_() {
        super.T_();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: b */
    public void mo53592b() {
        super.mo53592b();
    }

    /* renamed from: d */
    private void m58867d() {
        ((SwiperView) av()).mo53545a().mo53559a(new AbstractC14555a() {
            /* class com.bytedance.ies.xelement.swiper.XSwiperUI.C145524 */

            @Override // com.bytedance.ies.xelement.swiper.AbstractC14555a
            /* renamed from: a */
            public void mo53613a(ViewGroup viewGroup, int i, View view) {
            }

            @Override // com.bytedance.ies.xelement.swiper.AbstractC14555a
            /* renamed from: a */
            public int mo53611a() {
                return XSwiperUI.this.f38495l.size();
            }

            @Override // com.bytedance.ies.xelement.swiper.AbstractC14555a
            /* renamed from: a */
            public View mo53612a(ViewGroup viewGroup, int i) {
                return XSwiperUI.this.f38495l.get(i);
            }
        });
    }

    @LynxProp(defaultInt = 5000, name = "interval")
    public void setInterval(int i) {
        this.f38487d = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public void mo53593b(C26697s sVar) {
        super.mo53593b(sVar);
    }

    @LynxProp(defaultBoolean = false, name = "circular")
    public void setCircular(boolean z) {
        ((SwiperView) av()).mo53545a().mo53565b(z);
    }

    @LynxProp(defaultBoolean = false, name = "indicator-dots")
    public void setIndicator(boolean z) {
        ((SwiperView) av()).mo53547a(z);
    }

    @LynxProp(defaultBoolean = false, name = "touchable")
    public void setTouchable(boolean z) {
        ((SwiperView) av()).mo53545a().mo53560a(z);
    }

    /* renamed from: a */
    private boolean m58866a(ViewPager viewPager) {
        int T = mo94937T();
        int i = this.f38500q;
        int i2 = this.f38501r;
        int i3 = this.f38499p;
        int i4 = (((T - i) - i2) - i3) - i3;
        if (i < 0 || i2 < 0 || i4 <= 0) {
            return true;
        }
        viewPager.mo53569d(i + i3);
        viewPager.mo53567c(i4);
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: b */
    public void mo53261b(LynxBaseUI lynxBaseUI) {
        mo33939a(lynxBaseUI);
    }

    @LynxProp(defaultBoolean = false, name = "autoplay")
    public void setAutoPlay(boolean z) {
        this.f38486c = z;
        this.f38494k.removeCallbacks(this.f38496m);
        if (this.f38486c) {
            this.f38494k.postDelayed(this.f38496m, (long) this.f38487d);
        }
    }

    @LynxProp(defaultInt = 0, name = "current")
    public void setCurrentIndex(final int i) {
        final ViewPager a = ((SwiperView) av()).mo53545a();
        if (a.getChildCount() < 1) {
            a.post(new Runnable() {
                /* class com.bytedance.ies.xelement.swiper.XSwiperUI.RunnableC145535 */

                public void run() {
                    a.mo53555a(i, XSwiperUI.this.f38488e);
                }
            });
        } else {
            a.mo53555a(i, this.f38488e);
        }
    }

    @LynxProp(name = "indicator-active-color")
    public void setIndicatorActiveColor(String str) {
        int i;
        try {
            i = ColorUtils.m97896a(str);
        } catch (Exception unused) {
            i = f38484a;
        }
        ((SwiperView) av()).mo53546a(i);
    }

    @LynxProp(name = "indicator-color")
    public void setIndicatorColor(String str) {
        int i;
        try {
            i = ColorUtils.m97896a(str);
        } catch (Exception unused) {
            i = f38485b;
        }
        ((SwiperView) av()).mo53549b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SwiperView mo33942b(Context context) {
        final SwiperView swiperView = new SwiperView(context);
        swiperView.mo53545a().mo53556a(new ViewPager.AbstractC14546b() {
            /* class com.bytedance.ies.xelement.swiper.XSwiperUI.C145491 */

            @Override // com.bytedance.ies.xelement.swiper.ViewPager.AbstractC14546b
            /* renamed from: a */
            public void mo53579a(int i, int i2) {
                ((SwiperView) XSwiperUI.this.av()).mo53551c(i2);
                if (XSwiperUI.this.f38489f) {
                    C26547c cVar = new C26547c(XSwiperUI.this.mo94576q(), "change");
                    cVar.mo94347a("current", Integer.valueOf(i2));
                    XSwiperUI.this.mo95039u().mo94687i().mo94075a(cVar);
                }
            }
        });
        swiperView.mo53545a().mo53558a(new ViewPager.AbstractC14548d() {
            /* class com.bytedance.ies.xelement.swiper.XSwiperUI.C145502 */

            /* renamed from: b */
            boolean f38503b;

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.ies.xelement.swiper.ViewPager.AbstractC14548d
            /* renamed from: c */
            public void mo53586c() {
                this.f38503b = true;
                if (XSwiperUI.this.f38491h) {
                    C26547c cVar = new C26547c(XSwiperUI.this.mo94576q(), "scrollstart");
                    cVar.mo94347a("current", Integer.valueOf(swiperView.mo53545a().mo53552a()));
                    XSwiperUI.this.mo95039u().mo94687i().mo94075a(cVar);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.ies.xelement.swiper.ViewPager.AbstractC14548d
            /* renamed from: d */
            public void mo53587d() {
                this.f38503b = false;
                if (XSwiperUI.this.f38492i) {
                    C26547c cVar = new C26547c(XSwiperUI.this.mo94576q(), "scrollend");
                    cVar.mo94347a("current", Integer.valueOf(swiperView.mo53545a().mo53552a()));
                    XSwiperUI.this.mo95039u().mo94687i().mo94075a(cVar);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.ies.xelement.swiper.ViewPager.AbstractC14548d
            /* renamed from: b */
            public void mo53585b(float f) {
                if (this.f38503b && XSwiperUI.this.f38493j) {
                    XSwiperUI.this.mo95039u().mo94687i().mo94075a(new C26547c(XSwiperUI.this.mo94576q(), "transition"));
                }
            }
        });
        swiperView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ies.xelement.swiper.XSwiperUI.View$OnAttachStateChangeListenerC145513 */

            public void onViewDetachedFromWindow(View view) {
                XSwiperUI.this.f38490g = false;
                XSwiperUI.this.f38494k.removeCallbacks(XSwiperUI.this.f38496m);
            }

            public void onViewAttachedToWindow(View view) {
                XSwiperUI.this.f38490g = true;
                if (XSwiperUI.this.f38486c) {
                    XSwiperUI.this.f38494k.removeCallbacks(XSwiperUI.this.f38496m);
                    XSwiperUI.this.f38494k.postDelayed(XSwiperUI.this.f38496m, (long) XSwiperUI.this.f38487d);
                }
            }
        });
        return swiperView;
    }

    @LynxProp(name = "current-item-id")
    public void setCurrentItemId(final String str) {
        if (str != null) {
            final ViewPager a = ((SwiperView) av()).mo53545a();
            if (a.getChildCount() < 1) {
                a.post(new Runnable() {
                    /* class com.bytedance.ies.xelement.swiper.XSwiperUI.RunnableC145546 */

                    public void run() {
                        XSwiperUI.this.mo53591a(str, a);
                    }
                });
            } else {
                mo53591a(str, a);
            }
        }
    }

    @LynxProp(defaultInt = ParticipantRepo.f117150c, name = "duration")
    public void setDuration(int i) {
        this.f38498o = i;
        if (this.f38488e) {
            ((SwiperView) av()).mo53545a().mo53554a(i);
        } else {
            ((SwiperView) av()).mo53545a().mo53554a(0);
        }
    }

    @LynxProp(name = "next-margin")
    public void setNextMargin(AbstractC26517a aVar) {
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            if (e.endsWith("px") || e.endsWith("rpx")) {
                int a = (int) C26960n.m97975a(e, -1.0f);
                if (a >= 0) {
                    this.f38501r = a;
                } else {
                    this.f38501r = -1;
                }
                setMode(this.f38497n);
            }
        }
    }

    @LynxProp(name = "page-margin")
    public void setPageMargin(AbstractC26517a aVar) {
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            if (e.endsWith("px") || e.endsWith("rpx")) {
                int a = (int) C26960n.m97975a(e, 10.0f);
                if (a > 0) {
                    this.f38499p = a;
                } else {
                    this.f38499p = 0;
                }
                ((SwiperView) av()).mo53545a().mo53564b(this.f38499p);
                setMode(this.f38497n);
            }
        }
    }

    @LynxProp(name = "previous-margin")
    public void setPreviousMargin(AbstractC26517a aVar) {
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            if (e.endsWith("px") || e.endsWith("rpx")) {
                int a = (int) C26960n.m97975a(e, -1.0f);
                if (a >= 0) {
                    this.f38500q = a;
                } else {
                    this.f38500q = -1;
                }
                setMode(this.f38497n);
            }
        }
    }

    @LynxProp(defaultBoolean = true, name = "smooth-scroll")
    public void setSmoothScroll(boolean z) {
        this.f38488e = z;
        if (z) {
            ((SwiperView) av()).mo53545a().mo53554a(this.f38498o);
        } else {
            ((SwiperView) av()).mo53545a().mo53554a(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33939a(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.remove(lynxBaseUI);
            this.f38495l.remove(((LynxUI) lynxBaseUI).av());
            m58867d();
            ((SwiperView) av()).mo53550c();
        }
    }

    @LynxProp(name = "mode")
    public void setMode(String str) {
        ViewPager a = ((SwiperView) av()).mo53545a();
        if ("normal".equals(str)) {
            this.f38497n = "normal";
            a.mo53557a((ViewPager.AbstractC14547c) null);
            a.mo53569d(0);
            a.mo53553a(1.0f);
        }
        if ("carousel".equals(str)) {
            this.f38497n = "carousel";
            a.mo53557a((ViewPager.AbstractC14547c) null);
            a.mo53569d(0);
            a.mo53553a(0.8f);
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 94431515:
                if (str.equals("carry")) {
                    c = 0;
                    break;
                }
                break;
            case 1720139793:
                if (str.equals("flat-coverflow")) {
                    c = 1;
                    break;
                }
                break;
            case 1980277093:
                if (str.equals("coverflow")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f38497n = "carry";
                a.mo53557a(this.ae);
                if (m58866a(a)) {
                    a.mo53569d(0);
                    a.mo53553a(1.0f);
                    return;
                }
                return;
            case 1:
                this.f38497n = "flat-coverflow";
                a.mo53557a((ViewPager.AbstractC14547c) null);
                if (m58866a(a)) {
                    a.mo53569d((int) ((((float) mo94937T()) * 0.4f) / 2.0f));
                    a.mo53553a(0.6f);
                    return;
                }
                return;
            case 2:
                this.f38497n = "coverflow";
                a.mo53557a(this.ad);
                if (m58866a(a)) {
                    a.mo53569d((int) ((((float) mo94937T()) * 0.4f) / 2.0f));
                    a.mo53553a(0.6f);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        if (map != null) {
            this.f38489f = map.containsKey("change");
            this.f38491h = map.containsKey("scrollstart");
            this.f38492i = map.containsKey("scrollend");
            this.f38493j = map.containsKey("transition");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public void mo53262b(LynxBaseUI lynxBaseUI, int i) {
        mo33940a(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.add(i, lynxBaseUI);
            lynxBaseUI.mo94956a((AbstractC26757c) this);
            this.f38495l.add(i, ((LynxUI) lynxBaseUI).av());
            m58867d();
            ((SwiperView) av()).mo53548b();
        }
    }

    /* renamed from: a */
    public void mo53591a(String str, ViewPager viewPager) {
        for (int i = 0; i < this.f66242w.size(); i++) {
            if (str.equals(((LynxBaseUI) this.f66242w.get(i)).mo94933P())) {
                viewPager.mo53555a(i, this.f38488e);
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53590a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.mo53590a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        this.f38495l.clear();
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            this.f38495l.add(((LynxUI) lynxBaseUI).av());
        }
        m58867d();
        setMode(this.f38497n);
    }
}
