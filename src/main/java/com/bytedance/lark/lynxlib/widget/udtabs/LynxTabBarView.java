package com.bytedance.lark.lynxlib.widget.udtabs;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u001c\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0011H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0007H\u0007J\u001e\u0010'\u001a\u00020\u001c2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020)\u0018\u00010\u0010H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0007H\u0007J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\rH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0012H\u0007J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0012H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView;", "Lcom/lynx/tasm/behavior/ui/view/UISimpleView;", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "disableAttachEvent", "", "mClickedTab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "mEnableTabChangedEvent", "mFirstSelected", "mTabClickListenerListener", "Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$IOnTabClickListener;", "mTabLayout", "mTag", "", "", "", "createView", "Landroid/content/Context;", "findTabIndex", "tab", "generateLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "childParams", "getTabLayout", "initDefaultValue", "", "needCustomLayout", "selectTab", "params", "Lcom/lynx/react/bridge/ReadableMap;", "callback", "Lcom/lynx/react/bridge/Callback;", "setCurrentSelectIndex", "index", "setDisableAttachEvent", "disable", "setEvents", "events", "Lcom/lynx/tasm/event/EventsListener;", "setIndicatorFullWidth", "full", "setTabClickListenerListener", "tabClickListener", "setTabLayoutGravity", "gravity", "setTabMode", "Companion", "IOnTabClickListener", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
public class LynxTabBarView extends UISimpleView<UDTabLayout> {

    /* renamed from: g */
    public static final Companion f38659g = new Companion(null);

    /* renamed from: a */
    public boolean f38660a = true;

    /* renamed from: b */
    public boolean f38661b;

    /* renamed from: c */
    public UDTabLayout f38662c;

    /* renamed from: d */
    public UDTab f38663d;

    /* renamed from: e */
    public boolean f38664e;

    /* renamed from: f */
    public Map<Integer, String> f38665f = new HashMap();

    /* renamed from: h */
    private IOnTabClickListener f38666h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$IOnTabClickListener;", "", "onTabClicked", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView$b */
    public interface IOnTabClickListener {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$Companion;", "", "()V", "BIND_ON_TAB_CHANGED", "", "LABEL", "TAG", "createDefaultTabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "context", "Landroid/content/Context;", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UDTabLayout mo53902a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            UDTabLayout uDTabLayout = new UDTabLayout(context);
            uDTabLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            uDTabLayout.setTabMode(2);
            return uDTabLayout;
        }
    }

    /* renamed from: d */
    public final UDTabLayout mo53300d() {
        UDTabLayout uDTabLayout = this.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        return uDTabLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$initDefaultValue$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView$d */
    public static final class View$OnAttachStateChangeListenerC14610d implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f38668a;

        /* renamed from: b */
        final /* synthetic */ C14612e f38669b;

        public void onViewDetachedFromWindow(View view) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 13})
        /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView$d$a */
        static final class RunnableC14611a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC14610d f38670a;

            RunnableC14611a(View$OnAttachStateChangeListenerC14610d dVar) {
                this.f38670a = dVar;
            }

            public final void run() {
                if (LynxTabBarView.m59100a(this.f38670a.f38668a).getTabCount() > LynxTabBarView.m59100a(this.f38670a.f38668a).getSelectPosition() && LynxTabBarView.m59100a(this.f38670a.f38668a).getSelectPosition() >= 0) {
                    this.f38670a.f38669b.mo53908c(LynxTabBarView.m59100a(this.f38670a.f38668a).getTabAt(LynxTabBarView.m59100a(this.f38670a.f38668a).getSelectPosition()));
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            if (!this.f38668a.f38664e) {
                LynxTabBarView.m59100a(this.f38668a).post(new RunnableC14611a(this));
            }
        }

        View$OnAttachStateChangeListenerC14610d(LynxTabBarView lynxTabBarView, C14612e eVar) {
            this.f38668a = lynxTabBarView;
            this.f38669b = eVar;
        }
    }

    /* renamed from: a */
    private final void m59101a(IOnTabClickListener bVar) {
        this.f38666h = bVar;
    }

    @LynxProp(defaultBoolean = false, name = "disable-attach-event")
    public final void setDisableAttachEvent(boolean z) {
        this.f38664e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$initDefaultValue$1", "Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$IOnTabClickListener;", "onTabClicked", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView$c */
    public static final class C14609c implements IOnTabClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f38667a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14609c(LynxTabBarView lynxTabBarView) {
            this.f38667a = lynxTabBarView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView$initDefaultValue$mTabSelectedListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView$e */
    public static final class C14612e implements UDTabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f38671a;

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: a */
        public void mo53906a(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: b */
        public void mo53907b(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14612e(LynxTabBarView lynxTabBarView) {
            this.f38671a = lynxTabBarView;
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: c */
        public void mo53908c(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            if (this.f38671a.f38661b) {
                int a = this.f38671a.mo53894a(bVar);
                AbstractC26684l u = this.f38671a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38671a.mo94576q(), "change");
                String str = this.f38671a.f38665f.get(Integer.valueOf(a));
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                cVar.mo94347a("tag", str);
                cVar.mo94347a("index", Integer.valueOf(a));
                if (!this.f38671a.f38660a) {
                    if (this.f38671a.f38663d == bVar) {
                        str2 = "click";
                    } else {
                        str2 = "slide";
                    }
                }
                cVar.mo94347a("scene", str2);
                i.mo94075a(cVar);
                this.f38671a.f38660a = false;
                this.f38671a.f38663d = null;
            }
        }
    }

    public LynxTabBarView(AbstractC26684l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ UDTabLayout m59100a(LynxTabBarView lynxTabBarView) {
        UDTabLayout uDTabLayout = lynxTabBarView.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        return uDTabLayout;
    }

    @LynxProp(name = "indicator-full-width")
    public final void setIndicatorFullWidth(boolean z) {
        UDTabLayout uDTabLayout = this.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        uDTabLayout.setIndicatorFullWidth(z);
    }

    /* renamed from: b */
    private final void m59102b(int i) {
        UDTabLayout uDTabLayout = this.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        UDTab tabAt = uDTabLayout.getTabAt(i);
        if (tabAt != null) {
            tabAt.mo91344e();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public ViewGroup.LayoutParams mo53895a(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* renamed from: c */
    private final void m59103c(Context context) {
        this.f38662c = f38659g.mo53902a(context);
        C14612e eVar = new C14612e(this);
        UDTabLayout uDTabLayout = this.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        uDTabLayout.addOnTabSelectedListener(eVar);
        m59101a((IOnTabClickListener) new C14609c(this));
        UDTabLayout uDTabLayout2 = this.f38662c;
        if (uDTabLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        uDTabLayout2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC14610d(this, eVar));
    }

    /* renamed from: a */
    public final int mo53894a(UDTab bVar) {
        if (bVar == null) {
            return 0;
        }
        UDTabLayout uDTabLayout = this.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        if (uDTabLayout == null) {
            Intrinsics.throwNpe();
        }
        int tabCount = uDTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            UDTabLayout uDTabLayout2 = this.f38662c;
            if (uDTabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            if (uDTabLayout2.getTabAt(i) == bVar) {
                return i;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UDTabLayout mo33942b(Context context) {
        if (context == null) {
            return null;
        }
        m59103c(context);
        UDTabLayout uDTabLayout = this.f38662c;
        if (uDTabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
        }
        return uDTabLayout;
    }

    @LynxProp(name = "tab-layout-gravity")
    public final void setTabLayoutGravity(String str) {
        Intrinsics.checkParameterIsNotNull(str, "gravity");
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode == 3317767 && lowerCase.equals("left")) {
                    UDTabLayout uDTabLayout = this.f38662c;
                    if (uDTabLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
                    }
                    uDTabLayout.setTabGravity(2);
                }
            } else if (lowerCase.equals("fill")) {
                UDTabLayout uDTabLayout2 = this.f38662c;
                if (uDTabLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
                }
                uDTabLayout2.setTabGravity(1);
            }
        } else if (lowerCase.equals("center")) {
            UDTabLayout uDTabLayout3 = this.f38662c;
            if (uDTabLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            uDTabLayout3.setTabGravity(0);
        }
    }

    @LynxProp(name = "tab-mode")
    public final void setTabMode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "gravity");
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -907680051) {
            if (hashCode != 3005871) {
                if (hashCode == 97445748 && lowerCase.equals("fixed")) {
                    UDTabLayout uDTabLayout = this.f38662c;
                    if (uDTabLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
                    }
                    uDTabLayout.setTabMode(1);
                }
            } else if (lowerCase.equals("auto")) {
                UDTabLayout uDTabLayout2 = this.f38662c;
                if (uDTabLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
                }
                uDTabLayout2.setTabMode(2);
            }
        } else if (lowerCase.equals("scroll")) {
            UDTabLayout uDTabLayout3 = this.f38662c;
            if (uDTabLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            uDTabLayout3.setTabMode(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        Log.d("LynxTabBarView", "events: " + map);
        if (map != null) {
            this.f38661b = map.containsKey("change");
        }
    }

    @LynxUIMethod
    public final void selectTab(ReadableMap readableMap, Callback callback) {
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = javaOnlyMap;
        javaOnlyMap2.put("success", false);
        if (readableMap.hasKey("index")) {
            int i = readableMap.getInt("index");
            if (i >= 0) {
                UDTabLayout uDTabLayout = this.f38662c;
                if (uDTabLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
                }
                if (i < uDTabLayout.getTabCount()) {
                    m59102b(i);
                    javaOnlyMap2.put("success", true);
                    if (callback != null) {
                        callback.invoke(0, javaOnlyMap);
                        return;
                    }
                    return;
                }
            }
            javaOnlyMap2.put("msg", "index out of bounds");
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        javaOnlyMap2.put("msg", "no index key");
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    @LynxUIMethod
    public static /* synthetic */ void selectTab$default(LynxTabBarView lynxTabBarView, ReadableMap readableMap, Callback callback, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                callback = null;
            }
            lynxTabBarView.selectTab(readableMap, callback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectTab");
    }
}
