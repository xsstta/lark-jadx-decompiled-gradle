package com.bytedance.lark.lynxlib.widget.udtabs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.lark.lynxlib.widget.udtabs.Pager;
import com.bytedance.lark.lynxlib.widget.udtabs.childitem.LynxViewpagerItem;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.ui.AbstractC26757c;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u000fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0007J \u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0002J\u001e\u0010(\u001a\u00020\u00162\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0016J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u0011H\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager;", "Lcom/lynx/tasm/behavior/ui/view/UISimpleView;", "Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "mClickedTab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "mEnableChangeEvent", "", "mFirstSelected", "mOnTabSelectedListener", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "mPager", "createView", "Landroid/content/Context;", "findTabIndex", "", "tabbar", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "tab", "initDefaultValue", "", "insertChild", "child", "Lcom/lynx/tasm/behavior/ui/LynxBaseUI;", "index", "layoutChildren", "needCustomLayout", "notifyDefaultTabSelected", "removeChild", "selectTab", "params", "Lcom/lynx/react/bridge/ReadableMap;", "callback", "Lcom/lynx/react/bridge/Callback;", "sendTabChangeEvent", "tag", "", "scene", "setEvents", "events", "", "Lcom/lynx/tasm/event/EventsListener;", "setLynxDirection", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "setSelect", "selectIndex", "Companion", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
public class LynxViewPager extends UISimpleView<Pager> {

    /* renamed from: e */
    public static final Companion f38672e = new Companion(null);

    /* renamed from: a */
    public boolean f38673a;

    /* renamed from: b */
    public Pager f38674b;

    /* renamed from: c */
    public UDTab f38675c;

    /* renamed from: d */
    public boolean f38676d = true;

    /* renamed from: f */
    private UDTabLayout.OnTabSelectedListener f38677f;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$Companion;", "", "()V", "BIND_ON_CHANGED", "", "LABEL", "TAG", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$initDefaultValue$4", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$f */
    public static final class View$OnAttachStateChangeListenerC14617f implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f38682a;

        public void onViewDetachedFromWindow(View view) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 13})
        /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$f$a */
        static final class RunnableC14618a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC14617f f38683a;

            RunnableC14618a(View$OnAttachStateChangeListenerC14617f fVar) {
                this.f38683a = fVar;
            }

            public final void run() {
                this.f38683a.f38682a.mo53300d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC14617f(LynxViewPager lynxViewPager) {
            this.f38682a = lynxViewPager;
        }

        public void onViewAttachedToWindow(View view) {
            LynxViewPager.m59115a(this.f38682a).post(new RunnableC14618a(this));
        }
    }

    /* renamed from: d */
    public final void mo53300d() {
        int i;
        UDTab bVar;
        UDTabLayout.OnTabSelectedListener bVar2;
        Pager aVar = this.f38674b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        int currentSelectIndex = aVar.getCurrentSelectIndex();
        Pager aVar2 = this.f38674b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        UDTabLayout mTabLayout = aVar2.getMTabLayout();
        if (mTabLayout != null) {
            i = mTabLayout.getTabCount();
        } else {
            i = 0;
        }
        if (i > currentSelectIndex && currentSelectIndex >= 0) {
            Pager aVar3 = this.f38674b;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPager");
            }
            UDTabLayout mTabLayout2 = aVar3.getMTabLayout();
            if (mTabLayout2 != null) {
                bVar = mTabLayout2.getTabAt(currentSelectIndex);
            } else {
                bVar = null;
            }
            if (bVar != null && (bVar2 = this.f38677f) != null) {
                bVar2.mo53908c(bVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: e */
    public void mo53301e() {
        List list = this.f66242w;
        Intrinsics.checkExpressionValueIsNotNull(list, "mChildren");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) this.f66242w.get(i);
            boolean z = lynxBaseUI instanceof LynxUI;
            if (!z || ViewCompat.m4015I(((LynxUI) lynxBaseUI).av())) {
                if (!needCustomLayout()) {
                    if (z) {
                        lynxBaseUI.mo53306j();
                    }
                } else if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).mo53301e();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$createView$1", "Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$InterceptTouchEventListener;", "interceptTouchEvent", "", "intercept", "", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$b */
    public static final class C14613b implements Pager.InterceptTouchEventListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f38678a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14613b(LynxViewPager lynxViewPager) {
            this.f38678a = lynxViewPager;
        }

        @Override // com.bytedance.lark.lynxlib.widget.udtabs.Pager.InterceptTouchEventListener
        /* renamed from: a */
        public void mo53916a(boolean z) {
            AbstractC26684l u;
            if (z && (u = this.f38678a.mo95039u()) != null) {
                u.mo94686h();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$initDefaultValue$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$c */
    public static final class C14614c implements UDTabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f38679a;

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
        C14614c(LynxViewPager lynxViewPager) {
            this.f38679a = lynxViewPager;
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: c */
        public void mo53908c(UDTab bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            CharSequence b = bVar.mo91339b();
            if (b != null && this.f38679a.f38673a) {
                LynxViewPager lynxViewPager = this.f38679a;
                String obj = b.toString();
                LynxViewPager lynxViewPager2 = this.f38679a;
                int a = lynxViewPager2.mo53910a(LynxViewPager.m59115a(lynxViewPager2).getMTabLayout(), bVar);
                if (this.f38679a.f38676d) {
                    str = "";
                } else if (this.f38679a.f38675c == bVar) {
                    str = "click";
                } else {
                    str = "slide";
                }
                lynxViewPager.mo53912a(obj, a, str);
                this.f38679a.f38676d = false;
            }
            this.f38679a.f38675c = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$initDefaultValue$2", "Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$IOnTabClickListener;", "onTabClicked", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$d */
    public static final class C14615d implements Pager.IOnTabClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f38680a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14615d(LynxViewPager lynxViewPager) {
            this.f38680a = lynxViewPager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$initDefaultValue$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "p0", "", "onPageScrolled", "p1", "", "p2", "onPageSelected", "index", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$e */
    public static final class C14616e implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f38681a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14616e(LynxViewPager lynxViewPager) {
            this.f38681a = lynxViewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f38681a.f38673a && LynxViewPager.m59115a(this.f38681a).getMTabLayout() == null) {
                this.f38681a.mo53912a("", i, "slide");
            }
        }
    }

    public LynxViewPager(AbstractC26684l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ Pager m59115a(LynxViewPager lynxViewPager) {
        Pager aVar = lynxViewPager.f38674b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLynxDirection(int i) {
        super.setLynxDirection(i);
        Pager aVar = this.f38674b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        aVar.setLynxDirection(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/LynxViewPager$insertChild$1", "Lcom/bytedance/lark/lynxlib/widget/udtabs/childitem/LynxViewpagerItem$IPropChaneListener;", "onTagChange", "", "tag", "", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager$g */
    public static final class C14619g implements LynxViewpagerItem.IPropChaneListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f38684a;

        /* renamed from: b */
        final /* synthetic */ int f38685b;

        @Override // com.bytedance.lark.lynxlib.widget.udtabs.childitem.LynxViewpagerItem.IPropChaneListener
        /* renamed from: a */
        public void mo53920a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            LynxViewPager.m59115a(this.f38684a).mo53925a(str, this.f38685b);
        }

        C14619g(LynxViewPager lynxViewPager, int i) {
            this.f38684a = lynxViewPager;
            this.f38685b = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pager mo33942b(Context context) {
        if (context == null) {
            return null;
        }
        Pager aVar = new Pager(context);
        this.f38674b = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        aVar.setInterceptTouchEventListener(new C14613b(this));
        m59116c(context);
        Pager aVar2 = this.f38674b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        return aVar2;
    }

    @LynxProp(name = "select-index")
    public final void setSelect(int i) {
        int i2;
        Pager aVar = this.f38674b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        if (aVar.getCurrentSelectIndex() != i) {
            if (i >= 0) {
                Pager aVar2 = this.f38674b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                }
                PagerAdapter adapter = aVar2.getMViewPager().getAdapter();
                if (adapter != null) {
                    i2 = adapter.getCount();
                } else {
                    i2 = 0;
                }
                if (i < i2) {
                    Pager aVar3 = this.f38674b;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPager");
                    }
                    aVar3.setCurrentSelectIndex(i);
                }
            }
            Pager aVar4 = this.f38674b;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPager");
            }
            aVar4.setSelectedIndex(i);
        }
    }

    /* renamed from: c */
    private final void m59116c(Context context) {
        Pager aVar = this.f38674b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f38677f = new C14614c(this);
        Pager aVar2 = this.f38674b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        UDTabLayout.OnTabSelectedListener bVar = this.f38677f;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        aVar2.setTabSelectedListener$ud_tabs_release(bVar);
        Pager aVar3 = this.f38674b;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        aVar3.setTabClickListenerListener(new C14615d(this));
        Pager aVar4 = this.f38674b;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        aVar4.getMViewPager().addOnPageChangeListener(new C14616e(this));
        Pager aVar5 = this.f38674b;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
        }
        aVar5.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC14617f(this));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33939a(LynxBaseUI lynxBaseUI) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.remove(lynxBaseUI);
            ((LynxUI) lynxBaseUI).mo94956a((AbstractC26757c) null);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.mo94923F().hasKey("tag")) {
                    Pager aVar = this.f38674b;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPager");
                    }
                    aVar.mo53927b(lynxViewpagerItem.mo53300d());
                }
                Pager aVar2 = this.f38674b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                }
                aVar2.mo53926b(lynxViewpagerItem);
            } else if (lynxBaseUI instanceof LynxTabBarView) {
                Pager aVar3 = this.f38674b;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                }
                aVar3.mo53923a((View) ((LynxTabBarView) lynxBaseUI).mo53300d());
            } else {
                LLog.m96429e("LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        if (map != null) {
            this.f38673a = map.containsKey("change");
        }
    }

    /* renamed from: a */
    public final int mo53910a(UDTabLayout uDTabLayout, UDTab bVar) {
        int i;
        UDTab tabAt;
        if (uDTabLayout != null) {
            i = uDTabLayout.getTabCount();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!(uDTabLayout == null || (tabAt = uDTabLayout.getTabAt(i2)) == null || tabAt != bVar)) {
                return i2;
            }
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.add(i, lynxBaseUI);
            ((LynxUI) lynxBaseUI).mo94956a((AbstractC26757c) this);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.mo94923F().hasKey("tag")) {
                    Pager aVar = this.f38674b;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPager");
                    }
                    lynxViewpagerItem.mo53945a((LynxViewpagerItem.IPropChaneListener) new C14619g(this, aVar.mo53922a(lynxViewpagerItem.mo53300d())));
                }
                Pager aVar2 = this.f38674b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                }
                aVar2.mo53924a(lynxViewpagerItem);
            } else if (lynxBaseUI instanceof LynxTabBarView) {
                Pager aVar3 = this.f38674b;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                }
                aVar3.setTabLayout((LynxTabBarView) lynxBaseUI);
            } else {
                LLog.m96429e("LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
        }
    }

    @LynxUIMethod
    public final void selectTab(ReadableMap readableMap, Callback callback) {
        int i;
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = javaOnlyMap;
        javaOnlyMap2.put("success", false);
        if (readableMap.hasKey("index")) {
            int i2 = readableMap.getInt("index");
            if (i2 >= 0) {
                Pager aVar = this.f38674b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                }
                PagerAdapter adapter = aVar.getMViewPager().getAdapter();
                if (adapter != null) {
                    i = adapter.getCount();
                } else {
                    i = 0;
                }
                if (i2 < i) {
                    Pager aVar2 = this.f38674b;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPager");
                    }
                    aVar2.setCurrentSelectIndex(i2);
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

    /* renamed from: a */
    public final void mo53912a(String str, int i, String str2) {
        AbstractC26684l u = mo95039u();
        Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
        EventEmitter i2 = u.mo94687i();
        C26547c cVar = new C26547c(mo94576q(), "change");
        cVar.mo94347a("tag", str);
        cVar.mo94347a("index", Integer.valueOf(i));
        cVar.mo94347a("scene", str2);
        i2.mo94075a(cVar);
    }

    @LynxUIMethod
    public static /* synthetic */ void selectTab$default(LynxViewPager lynxViewPager, ReadableMap readableMap, Callback callback, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                callback = null;
            }
            lynxViewPager.selectTab(readableMap, callback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectTab");
    }
}
