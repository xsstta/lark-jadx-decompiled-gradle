package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.AbstractC26757c;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import com.lynx.tasm.utils.C26955i;
import com.lynx.tasm.utils.C26960n;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0007H\u0007J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0007H\u0007J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0010H\u0007J\u001e\u0010(\u001a\u00020\u00132\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\tH\u0007J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\tH\u0007J\u0010\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020#H\u0007J\u0010\u00102\u001a\u00020\u00132\u0006\u00101\u001a\u00020#H\u0007J\u0010\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0007H\u0007J\u0010\u00105\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020#H\u0007J\u0010\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u0010H\u0007J\u0010\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0010H\u0007J\u0010\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0010H\u0007J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020#H\u0007J\u0010\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\tH\u0007J\u0010\u0010B\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0010H\u0007J\u0010\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\tH\u0007J\u0010\u0010E\u001a\u00020\u00132\u0006\u0010F\u001a\u00020GH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/bytedance/ies/xelement/banner/LynxSwiperView;", "Lcom/lynx/tasm/behavior/ui/view/UISimpleView;", "Lcom/bytedance/ies/xelement/banner/Banner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCurrentPosition", "", "mEnableChangeEvent", "", "mEnableScrollEnd", "mEnableScrollStart", "mEnableTransitionEvent", "createView", "dynamicToPxValue", "itemWidth", "Lcom/lynx/react/bridge/Dynamic;", "enableAutoPlayFix", "insertChild", "", "child", "Lcom/lynx/tasm/behavior/ui/LynxBaseUI;", "index", "insertChildV2", "needCustomLayout", "onLayoutUpdated", "removeChild", "removeChildV2", "setAutoPlay", "autoplay", "setCircular", "circular", "setCurrentIndex", "setCurrentItemId", "id", "", "setDuration", "duration", "setEndMargin", "margin", "setEvents", "events", "", "Lcom/lynx/tasm/event/EventsListener;", "setHideShadow", "hideShadow", "setIndicator", "enable", "setIndicatorActiveColor", "color", "setIndicatorColor", "setInterval", "interval", "setItemWidth", "setMode", "mode", "setNextMargin", "nextMarginValue", "setPageMargin", "pageMargin", "setPreviousMargin", "previousMarginValue", "setShadowColor", "shadowColor", "setSmoothScroll", "smoothScroll", "setStartMargin", "setTouchable", "touchable", "updateAttributes", "attrs", "Lcom/lynx/tasm/behavior/StylesDiffMap;", "Companion", "x-element-swiper_newelement"}, mo238835k = 1, mv = {1, 1, 16})
public class LynxSwiperView extends UISimpleView<Banner> {

    /* renamed from: f */
    public static final Companion f38159f = new Companion(null);

    /* renamed from: a */
    public boolean f38160a;

    /* renamed from: b */
    public boolean f38161b;

    /* renamed from: c */
    public boolean f38162c;

    /* renamed from: d */
    public boolean f38163d;

    /* renamed from: e */
    public int f38164e;

    public boolean R_() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xelement/banner/LynxSwiperView$Companion;", "", "()V", "BIND_CHANGE", "", "BIND_SCROLL_END", "BIND_SCROLL_START", "BIND_TRANSITION", "x-element-swiper_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.banner.LynxSwiperView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        int i = this.f66245z + this.f66203I;
        int i2 = this.f66195A + this.f66204J;
        ((Banner) this.f66253Z).setPadding(i, this.f66196B + this.f66202H, i2, this.f66197C + this.f66205K);
        ((Banner) this.f66253Z).mo53241m(mo94937T());
        ((Banner) this.f66253Z).mo53219a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/bytedance/ies/xelement/banner/LynxSwiperView$createView$1$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "x-element-swiper_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.banner.LynxSwiperView$b */
    public static final class C14462b implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxSwiperView f38165a;

        C14462b(LynxSwiperView lynxSwiperView) {
            this.f38165a = lynxSwiperView;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.f38165a.f38164e = i;
            if (this.f38165a.f38160a) {
                AbstractC26684l u = this.f38165a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i2 = u.mo94687i();
                C26547c cVar = new C26547c(this.f38165a.mo94576q(), "change");
                cVar.mo94347a("current", Integer.valueOf(i));
                i2.mo94075a(cVar);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f38165a.mo95042x();
            }
            if (this.f38165a.f38162c && i == 1) {
                AbstractC26684l u = this.f38165a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i2 = u.mo94687i();
                C26547c cVar = new C26547c(this.f38165a.mo94576q(), "scrollstart");
                cVar.mo94347a("current", Integer.valueOf(this.f38165a.f38164e));
                i2.mo94075a(cVar);
            }
            if (this.f38165a.f38163d && i == 0) {
                AbstractC26684l u2 = this.f38165a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u2, "lynxContext");
                EventEmitter i3 = u2.mo94687i();
                C26547c cVar2 = new C26547c(this.f38165a.mo94576q(), "scrollend");
                cVar2.mo94347a("current", Integer.valueOf(this.f38165a.f38164e));
                i3.mo94075a(cVar2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (this.f38165a.f38161b) {
                AbstractC26684l u = this.f38165a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i3 = u.mo94687i();
                C26547c cVar = new C26547c(this.f38165a.mo94576q(), "transition");
                cVar.mo94347a("current", Integer.valueOf(i));
                cVar.mo94347a("positionOffset", Float.valueOf(f));
                cVar.mo94347a("dx", Float.valueOf(C26955i.m97954c((float) i2)));
                i3.mo94075a(cVar);
            }
        }
    }

    @LynxProp(defaultBoolean = false, name = "circular")
    public final void setCircular(boolean z) {
        ((Banner) this.f66253Z).mo53218a(z);
    }

    @LynxProp(defaultInt = 0, name = "current")
    public final void setCurrentIndex(int i) {
        ((Banner) this.f66253Z).mo53227d(i);
    }

    @LynxProp(defaultInt = ParticipantRepo.f117150c, name = "duration")
    public final void setDuration(int i) {
        ((Banner) this.f66253Z).mo53231e(i);
    }

    @LynxProp(defaultBoolean = true, name = "hideshadow")
    public final void setHideShadow(boolean z) {
        ((Banner) this.f66253Z).mo53221b(z);
    }

    @LynxProp(defaultInt = 5000, name = "interval")
    public final void setInterval(int i) {
        ((Banner) this.f66253Z).mo53233f(i);
    }

    @LynxProp(defaultBoolean = true, name = "smooth-scroll")
    public final void setSmoothScroll(boolean z) {
        ((Banner) this.f66253Z).mo53234f(z);
    }

    @LynxProp(defaultBoolean = false, name = "touchable")
    public final void setTouchable(boolean z) {
        ((Banner) this.f66253Z).mo53232e(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxSwiperView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: b */
    public void mo53261b(LynxBaseUI lynxBaseUI) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        mo33939a(lynxBaseUI);
    }

    @LynxProp(name = "mode")
    public final void setMode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mode");
        ((Banner) this.f66253Z).mo53217a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Banner mo33942b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Log.d("Django", "createView");
        Banner banner = new Banner(context);
        banner.setOnPageChangeListener(new C14462b(this));
        return banner;
    }

    @LynxProp(defaultBoolean = false, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((Banner) this.f66253Z).mo53225c(z);
        if (R_() && z) {
            ((Banner) this.f66253Z).mo53222b();
        }
    }

    @LynxProp(name = "end-margin")
    public final void setEndMargin(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "margin");
        ((Banner) this.f66253Z).mo53240l(mo53256a(aVar));
    }

    @LynxProp(defaultBoolean = false, name = "indicator-dots")
    public final void setIndicator(boolean z) {
        Log.d("Django", "indicator-dots:" + z);
        ((Banner) this.f66253Z).mo53228d(z);
    }

    @LynxProp(name = "indicator-active-color")
    public final void setIndicatorActiveColor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "color");
        try {
            ((Banner) this.f66253Z).mo53215a(ColorUtils.m97896a(str));
        } catch (Exception unused) {
        }
    }

    @LynxProp(name = "indicator-color")
    public final void setIndicatorColor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "color");
        try {
            ((Banner) this.f66253Z).mo53220b(ColorUtils.m97896a(str));
        } catch (Exception unused) {
        }
    }

    @LynxProp(name = "item-width")
    public final void setItemWidth(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "itemWidth");
        ((Banner) this.f66253Z).mo53238j(mo53256a(aVar));
    }

    @LynxProp(name = "shadow-color")
    public final void setShadowColor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shadowColor");
        try {
            ((Banner) this.f66253Z).mo53224c(ColorUtils.m97896a(str));
        } catch (Exception unused) {
        }
    }

    @LynxProp(name = "start-margin")
    public final void setStartMargin(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "margin");
        ((Banner) this.f66253Z).mo53239k(mo53256a(aVar));
    }

    /* renamed from: a */
    public final int mo53256a(AbstractC26517a aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "itemWidth");
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            Intrinsics.checkExpressionValueIsNotNull(e, "itemWidthStrValue");
            Integer num = null;
            if (StringsKt.endsWith$default(e, "px", false, 2, (Object) null) || StringsKt.endsWith$default(e, "rpx", false, 2, (Object) null)) {
                Integer valueOf = Integer.valueOf((int) C26960n.m97975a(e, 10.0f));
                int intValue = valueOf.intValue();
                if (intValue < 0 || intValue > DisplayMetricsHolder.m97898a().widthPixels) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    num = valueOf;
                }
                if (num != null) {
                    return num.intValue();
                }
            }
        }
        return 0;
    }

    @LynxProp(name = "current-item-id")
    public final void setCurrentItemId(String str) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, "id");
        List list = this.f66242w;
        Intrinsics.checkExpressionValueIsNotNull(list, "mChildren");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
            Intrinsics.checkExpressionValueIsNotNull(lynxBaseUI, "it");
            if (Intrinsics.areEqual(lynxBaseUI.mo94933P(), str)) {
                break;
            }
        }
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) obj;
        if (lynxBaseUI2 != null) {
            ((Banner) this.f66253Z).mo53227d(this.f66242w.indexOf(lynxBaseUI2));
        }
    }

    @LynxProp(name = "next-margin")
    public final void setNextMargin(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "nextMarginValue");
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            Intrinsics.checkExpressionValueIsNotNull(e, "nextMarginStrValue");
            boolean z = false;
            Integer num = null;
            if (StringsKt.endsWith$default(e, "px", false, 2, (Object) null) || StringsKt.endsWith$default(e, "rpx", false, 2, (Object) null)) {
                Integer valueOf = Integer.valueOf((int) C26960n.m97975a(e, -1.0f));
                int intValue = valueOf.intValue();
                if (intValue >= 0 && intValue <= DisplayMetricsHolder.m97898a().widthPixels) {
                    z = true;
                }
                if (z) {
                    num = valueOf;
                }
                if (num != null) {
                    ((Banner) this.f66253Z).mo53237i(num.intValue());
                }
            }
        }
    }

    @LynxProp(name = "page-margin")
    public final void setPageMargin(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "pageMargin");
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            Intrinsics.checkExpressionValueIsNotNull(e, "pageMarginStrValue");
            boolean z = false;
            Integer num = null;
            if (StringsKt.endsWith$default(e, "px", false, 2, (Object) null) || StringsKt.endsWith$default(e, "rpx", false, 2, (Object) null)) {
                Integer valueOf = Integer.valueOf((int) C26960n.m97975a(e, 10.0f));
                int intValue = valueOf.intValue();
                if (intValue >= 0 && intValue <= DisplayMetricsHolder.m97898a().widthPixels) {
                    z = true;
                }
                if (z) {
                    num = valueOf;
                }
                if (num != null) {
                    ((Banner) this.f66253Z).mo53235g(num.intValue());
                }
            }
        }
    }

    @LynxProp(name = "previous-margin")
    public final void setPreviousMargin(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "previousMarginValue");
        if (aVar.mo94071g() == ReadableType.String) {
            String e = aVar.mo94069e();
            Intrinsics.checkExpressionValueIsNotNull(e, "previousMarginStrValue");
            boolean z = false;
            Integer num = null;
            if (StringsKt.endsWith$default(e, "px", false, 2, (Object) null) || StringsKt.endsWith$default(e, "rpx", false, 2, (Object) null)) {
                Integer valueOf = Integer.valueOf((int) C26960n.m97975a(e, -1.0f));
                int intValue = valueOf.intValue();
                if (intValue >= 0 && intValue <= DisplayMetricsHolder.m97898a().widthPixels) {
                    z = true;
                }
                if (z) {
                    num = valueOf;
                }
                if (num != null) {
                    ((Banner) this.f66253Z).mo53236h(num.intValue());
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33939a(LynxBaseUI lynxBaseUI) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.remove(lynxBaseUI);
            ((Banner) this.f66253Z).mo53223b((LynxUI) lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "attrs");
        ReadableMap readableMap = sVar.f66083a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey != null) {
                try {
                    switch (nextKey.hashCode()) {
                        case -1992012396:
                            if (nextKey.equals("duration")) {
                                setDuration(readableMap.getInt(nextKey, ParticipantRepo.f117150c));
                                break;
                            } else {
                                continue;
                            }
                        case -1597449863:
                            if (nextKey.equals("start-margin")) {
                                AbstractC26517a dynamic = readableMap.getDynamic(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(dynamic, "props.getDynamic(name)");
                                setStartMargin(dynamic);
                                break;
                            } else {
                                continue;
                            }
                        case -1596393144:
                            if (nextKey.equals("indicator-dots")) {
                                setIndicator(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case -1498085729:
                            if (nextKey.equals("circular")) {
                                setCircular(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case -1235498272:
                            if (nextKey.equals("end-margin")) {
                                AbstractC26517a dynamic2 = readableMap.getDynamic(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(dynamic2, "props.getDynamic(name)");
                                setEndMargin(dynamic2);
                                break;
                            } else {
                                continue;
                            }
                        case -1029251878:
                            if (nextKey.equals("indicator-active-color")) {
                                String string = readableMap.getString(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(string, "props.getString(name)");
                                setIndicatorActiveColor(string);
                                break;
                            } else {
                                continue;
                            }
                        case -111166008:
                            if (nextKey.equals("next-margin")) {
                                AbstractC26517a dynamic3 = readableMap.getDynamic(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(dynamic3, "props.getDynamic(name)");
                                setNextMargin(dynamic3);
                                break;
                            } else {
                                continue;
                            }
                        case 3357091:
                            if (nextKey.equals("mode")) {
                                String string2 = readableMap.getString(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(string2, "props.getString(name)");
                                setMode(string2);
                                break;
                            } else {
                                continue;
                            }
                        case 24002884:
                            if (nextKey.equals("previous-margin")) {
                                AbstractC26517a dynamic4 = readableMap.getDynamic(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(dynamic4, "props.getDynamic(name)");
                                setPreviousMargin(dynamic4);
                                break;
                            } else {
                                continue;
                            }
                        case 364166425:
                            if (nextKey.equals("touchable")) {
                                setTouchable(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case 570418373:
                            if (nextKey.equals("interval")) {
                                setInterval(readableMap.getInt(nextKey, 5000));
                                break;
                            } else {
                                continue;
                            }
                        case 914875020:
                            if (nextKey.equals("item-width")) {
                                AbstractC26517a dynamic5 = readableMap.getDynamic(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(dynamic5, "props.getDynamic(name)");
                                setItemWidth(dynamic5);
                                break;
                            } else {
                                continue;
                            }
                        case 1126940025:
                            if (nextKey.equals("current")) {
                                setCurrentIndex(readableMap.getInt(nextKey, 0));
                                break;
                            } else {
                                continue;
                            }
                        case 1127093697:
                            if (nextKey.equals("current-item-id")) {
                                String string3 = readableMap.getString(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(string3, "props.getString(name)");
                                setCurrentItemId(string3);
                                break;
                            } else {
                                continue;
                            }
                        case 1255595234:
                            if (nextKey.equals("hideshadow")) {
                                setHideShadow(readableMap.getBoolean(nextKey, true));
                                break;
                            } else {
                                continue;
                            }
                        case 1439562083:
                            if (nextKey.equals("autoplay")) {
                                setAutoPlay(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case 1599847372:
                            if (nextKey.equals("smooth-scroll")) {
                                setSmoothScroll(readableMap.getBoolean(nextKey, true));
                                break;
                            } else {
                                continue;
                            }
                        case 1616798838:
                            if (nextKey.equals("shadow-color")) {
                                String string4 = readableMap.getString(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(string4, "props.getString(name)");
                                setShadowColor(string4);
                                break;
                            } else {
                                continue;
                            }
                        case 1665556140:
                            if (nextKey.equals("page-margin")) {
                                AbstractC26517a dynamic6 = readableMap.getDynamic(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(dynamic6, "props.getDynamic(name)");
                                setPageMargin(dynamic6);
                                break;
                            } else {
                                continue;
                            }
                        case 2050488869:
                            if (nextKey.equals("indicator-color")) {
                                String string5 = readableMap.getString(nextKey);
                                Intrinsics.checkExpressionValueIsNotNull(string5, "props.getString(name)");
                                setIndicatorColor(string5);
                                break;
                            } else {
                                continue;
                            }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("setProperty error: " + nextKey + '\n' + e);
                }
            }
        }
        super.mo53259a(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        Log.d("Django", "events: " + map);
        if (map != null) {
            this.f38160a = map.containsKey("change");
            this.f38161b = map.containsKey("transition");
            this.f38162c = map.containsKey("scrollstart");
            this.f38163d = map.containsKey("scrollend");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public void mo53262b(LynxBaseUI lynxBaseUI, int i) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        mo33940a(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        Log.d("Django", "child: " + lynxBaseUI + " index: " + i);
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.add(i, lynxBaseUI);
            ((Banner) this.f66253Z).mo53216a((LynxUI) lynxBaseUI);
            lynxBaseUI.mo94956a((AbstractC26757c) this);
        }
    }
}
