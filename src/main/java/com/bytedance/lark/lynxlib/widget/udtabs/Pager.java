package com.bytedance.lark.lynxlib.widget.udtabs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView;
import com.bytedance.lark.lynxlib.widget.udtabs.childitem.LynxViewpagerItem;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.lynx.tasm.behavior.ui.view.C26840a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0003IJKB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0007J\u000e\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020%J\u0006\u00105\u001a\u00020/J\u0014\u00106\u001a\u0002012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u00108\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000109J\u000e\u0010:\u001a\u0002012\u0006\u00102\u001a\u00020\u0007J\u000e\u0010;\u001a\u0002012\u0006\u00104\u001a\u00020%J\u000e\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020/J\u000e\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020/J\u000e\u0010@\u001a\u0002012\u0006\u0010=\u001a\u00020/J\u000e\u0010A\u001a\u0002012\u0006\u0010B\u001a\u00020\u0017J\u000e\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020\u0015J\u0015\u0010E\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\bFJ\u0016\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020%2\u0006\u0010=\u001a\u00020/R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "children", "", "Lcom/bytedance/lark/lynxlib/widget/udtabs/childitem/LynxViewpagerItem;", "interceptTouchEventListener", "Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$InterceptTouchEventListener;", "getInterceptTouchEventListener", "()Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$InterceptTouchEventListener;", "setInterceptTouchEventListener", "(Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$InterceptTouchEventListener;)V", "mAdapter", "Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$Adapter;", "mEnableDrag", "", "mOnTabSelectedListener", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "mTabBarView", "Lcom/bytedance/lark/lynxlib/widget/udtabs/LynxTabBarView;", "mTabClickListenerListener", "Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$IOnTabClickListener;", "mTabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "getMTabLayout", "()Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "setMTabLayout", "(Lcom/larksuite/component/universe_design/tab/UDTabLayout;)V", "mTabLayoutCoordinator", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "getMTabLayoutCoordinator", "()Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "setMTabLayoutCoordinator", "(Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;)V", "mTabLayoutTitles", "", "getMTabLayoutTitles", "()Ljava/util/List;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "getMViewPager", "()Landroidx/viewpager/widget/ViewPager;", "setMViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "selectIndex", "", "addChildItem", "", "child", "addTabTag", "tag", "getCurrentSelectIndex", "initOrSetTabBar", "tabbar", "removeChild", "Landroid/view/View;", "removeChildItem", "removeTabTag", "setCurrentSelectIndex", "index", "setLynxDirection", "layoutDirection", "setSelectedIndex", "setTabClickListenerListener", "tabClickListener", "setTabLayout", "lynxTabBarView", "setTabSelectedListener", "setTabSelectedListener$ud_tabs_release", "updateTagItem", "newTag", "Adapter", "IOnTabClickListener", "InterceptTouchEventListener", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.a */
public final class Pager extends LinearLayout {

    /* renamed from: a */
    public final List<LynxViewpagerItem> f38686a = new ArrayList();

    /* renamed from: b */
    private LynxTabBarView f38687b;

    /* renamed from: c */
    private final Adapter f38688c;

    /* renamed from: d */
    private InterceptTouchEventListener f38689d;

    /* renamed from: e */
    private ViewPager f38690e;

    /* renamed from: f */
    private final List<String> f38691f = new ArrayList();

    /* renamed from: g */
    private UDTabLayout f38692g;

    /* renamed from: h */
    private UDTabLayoutCoordinator f38693h;

    /* renamed from: i */
    private IOnTabClickListener f38694i;

    /* renamed from: j */
    private UDTabLayout.OnTabSelectedListener f38695j;

    /* renamed from: k */
    private boolean f38696k = true;

    /* renamed from: l */
    private int f38697l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$IOnTabClickListener;", "", "onTabClicked", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.a$b */
    public interface IOnTabClickListener {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$InterceptTouchEventListener;", "", "interceptTouchEvent", "", "intercept", "", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.a$c */
    public interface InterceptTouchEventListener {
        /* renamed from: a */
        void mo53916a(boolean z);
    }

    public final InterceptTouchEventListener getInterceptTouchEventListener() {
        return this.f38689d;
    }

    public final UDTabLayout getMTabLayout() {
        return this.f38692g;
    }

    public final UDTabLayoutCoordinator getMTabLayoutCoordinator() {
        return this.f38693h;
    }

    public final List<String> getMTabLayoutTitles() {
        return this.f38691f;
    }

    public final ViewPager getMViewPager() {
        return this.f38690e;
    }

    public final int getCurrentSelectIndex() {
        return this.f38690e.getCurrentItem();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager$Adapter;", "Landroidx/viewpager/widget/PagerAdapter;", "(Lcom/bytedance/lark/lynxlib/widget/udtabs/Pager;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "getItemPosition", "getPageTitle", "", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "obj", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.a$a */
    public final class Adapter extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return Pager.this.f38686a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Adapter() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "object");
            int indexOf = CollectionsKt.indexOf((List) Pager.this.f38686a, obj);
            if (indexOf == -1) {
                return -2;
            }
            return indexOf;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            if (i + 1 > Pager.this.getMTabLayoutTitles().size()) {
                return null;
            }
            return Pager.this.getMTabLayoutTitles().get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            LynxViewpagerItem lynxViewpagerItem = Pager.this.f38686a.get(i);
            viewGroup.addView(lynxViewpagerItem.av());
            lynxViewpagerItem.mo53946a(true, i);
            return lynxViewpagerItem;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(obj, "obj");
            if (!(obj instanceof LynxViewpagerItem) || view != ((C26840a) ((LynxViewpagerItem) obj).av())) {
                return false;
            }
            return true;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            Intrinsics.checkParameterIsNotNull(obj, "object");
            if (obj instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) obj;
                viewGroup.removeView(lynxViewpagerItem.av());
                lynxViewpagerItem.mo53946a(false, i);
            }
        }
    }

    public final void setInterceptTouchEventListener(InterceptTouchEventListener cVar) {
        this.f38689d = cVar;
    }

    public final void setMTabLayout(UDTabLayout uDTabLayout) {
        this.f38692g = uDTabLayout;
    }

    public final void setMTabLayoutCoordinator(UDTabLayoutCoordinator uDTabLayoutCoordinator) {
        this.f38693h = uDTabLayoutCoordinator;
    }

    public final void setSelectedIndex(int i) {
        this.f38697l = i;
    }

    /* renamed from: a */
    public final void mo53923a(View view) {
        if (view != null) {
            removeView(view);
        }
    }

    public final void setCurrentSelectIndex(int i) {
        this.f38690e.setCurrentItem(i);
    }

    public final void setMViewPager(ViewPager viewPager) {
        Intrinsics.checkParameterIsNotNull(viewPager, "<set-?>");
        this.f38690e = viewPager;
    }

    public final void setTabClickListenerListener(IOnTabClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tabClickListener");
        this.f38694i = bVar;
    }

    public final void setTabSelectedListener$ud_tabs_release(UDTabLayout.OnTabSelectedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mOnTabSelectedListener");
        this.f38695j = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/widget/udtabs/Pager$mViewPager$1", "Landroidx/viewpager/widget/ViewPager;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.a$d */
    public static final class C14620d extends ViewPager {

        /* renamed from: a */
        final /* synthetic */ Pager f38699a;

        /* renamed from: b */
        final /* synthetic */ Context f38700b;

        @Override // androidx.viewpager.widget.ViewPager
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            InterceptTouchEventListener interceptTouchEventListener = this.f38699a.getInterceptTouchEventListener();
            if (interceptTouchEventListener != null) {
                interceptTouchEventListener.mo53916a(onInterceptTouchEvent);
            }
            return onInterceptTouchEvent;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14620d(Pager aVar, Context context, Context context2) {
            super(context2);
            this.f38699a = aVar;
            this.f38700b = context;
        }
    }

    /* renamed from: b */
    public final void mo53926b(LynxViewpagerItem lynxViewpagerItem) {
        Intrinsics.checkParameterIsNotNull(lynxViewpagerItem, "child");
        this.f38686a.remove(lynxViewpagerItem);
        this.f38688c.notifyDataSetChanged();
    }

    public final void setTabLayout(LynxTabBarView lynxTabBarView) {
        Intrinsics.checkParameterIsNotNull(lynxTabBarView, "lynxTabBarView");
        this.f38687b = lynxTabBarView;
        m59133a(lynxTabBarView.mo53300d());
    }

    /* renamed from: a */
    public final void mo53924a(LynxViewpagerItem lynxViewpagerItem) {
        Intrinsics.checkParameterIsNotNull(lynxViewpagerItem, "child");
        this.f38686a.add(lynxViewpagerItem);
        this.f38688c.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final int mo53922a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        this.f38691f.add(str);
        int size = this.f38691f.size() - 1;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m59132a(this, null, 1, null);
        }
        return size;
    }

    /* renamed from: b */
    public final void mo53927b(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f38691f.contains(str)) {
                this.f38691f.remove(str);
            }
            if (this.f38691f.size() > 0) {
                m59132a(this, null, 1, null);
            }
        }
    }

    public final void setLynxDirection(int i) {
        UDTabLayout uDTabLayout = this.f38692g;
        if (uDTabLayout != null) {
            if (i == 2 || i == 1) {
                if (uDTabLayout == null) {
                    Intrinsics.throwNpe();
                }
                ViewCompat.m4078f((View) uDTabLayout, 1);
                return;
            }
            if (uDTabLayout == null) {
                Intrinsics.throwNpe();
            }
            ViewCompat.m4078f((View) uDTabLayout, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Adapter aVar = new Adapter();
        this.f38688c = aVar;
        this.f38690e = new C14620d(this, context, context);
        setOrientation(1);
        this.f38690e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f38690e.setAdapter(aVar);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f38690e, 0);
    }

    /* renamed from: a */
    private final void m59133a(UDTabLayout uDTabLayout) {
        if (uDTabLayout != null) {
            removeView(this.f38692g);
            UDTabLayoutCoordinator uDTabLayoutCoordinator = this.f38693h;
            if (uDTabLayoutCoordinator != null) {
                uDTabLayoutCoordinator.detach();
            }
            this.f38692g = uDTabLayout;
            this.f38691f.clear();
        } else if (this.f38692g == null) {
            LynxTabBarView.Companion aVar = LynxTabBarView.f38659g;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDTabLayout a = aVar.mo53902a(context);
            this.f38692g = a;
            UDTabLayout.OnTabSelectedListener bVar = this.f38695j;
            if (!(bVar == null || a == null)) {
                a.addOnTabSelectedListener(bVar);
            }
        } else {
            return;
        }
        UDTabLayout uDTabLayout2 = this.f38692g;
        if (uDTabLayout2 != null) {
            UDTabLayoutCoordinator uDTabLayoutCoordinator2 = new UDTabLayoutCoordinator(uDTabLayout2, this.f38690e);
            this.f38693h = uDTabLayoutCoordinator2;
            if (uDTabLayoutCoordinator2 != null) {
                uDTabLayoutCoordinator2.attach();
            }
        }
        addView(this.f38692g, 0);
    }

    /* renamed from: a */
    public final void mo53925a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "newTag");
        this.f38691f.set(i, str);
        this.f38688c.notifyDataSetChanged();
    }

    /* renamed from: a */
    static /* synthetic */ void m59132a(Pager aVar, UDTabLayout uDTabLayout, int i, Object obj) {
        if ((i & 1) != 0) {
            uDTabLayout = null;
        }
        aVar.m59133a(uDTabLayout);
    }
}
