package com.ss.android.lark.calendar.wrapper.impl.tabspec;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorFragment;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSideBarEntrance;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarMainLauncher;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarNavigationTabView;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView;
import com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface;
import com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderManager;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002\f\u0019\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0017\u0010,\u001a\u0002H-\"\b\b\u0000\u0010-*\u00020.H\u0016¢\u0006\u0002\u0010/J\b\u00100\u001a\u000201H\u0016J\u0017\u00102\u001a\u0002H-\"\b\b\u0000\u0010-*\u00020.H\u0016¢\u0006\u0002\u0010/J\b\u00103\u001a\u00020!H\u0016J\b\u00104\u001a\u00020+H\u0016J\b\u00105\u001a\u000206H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\n\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020<H\u0016J\u0018\u0010=\u001a\u0012\u0012\u0004\u0012\u00020?\u0012\b\u0012\u0006\u0012\u0002\b\u00030@0>H\u0016J\b\u0010A\u001a\u00020%H\u0016J\b\u0010B\u001a\u00020%H\u0016J\u0018\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?\u0012\b\u0012\u0006\u0012\u0002\b\u00030@0>H\u0016J\b\u0010D\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec;", "Lcom/ss/android/lark/maincore/TabPageSpec;", "Lcom/ss/android/lark/maincore/TabPageSpec$Resetable;", "Lcom/ss/android/lark/desktopmode/frame/tab/IDesktopPageSpec;", "mContext", "Landroid/content/Context;", "mTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;)V", "activity", "Landroid/app/Activity;", "componentCallback", "com/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$componentCallback$1", "Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$componentCallback$1;", "mCalendarTitleController", "Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTitleProxyImpl;", "mNavigationTabController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarNavigationTabView;", "getMNavigationTabController", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarNavigationTabView;", "mNavigationTabController$delegate", "Lkotlin/Lazy;", "mOverallReminderManager", "Lcom/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderManager;", "mPageSwitchListener", "com/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$mPageSwitchListener$1;", "mTabController", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabView;", "getMTabController", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabView;", "mTabController$delegate", "mainFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "tabDateUpdate", "Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabDateUpdate;", "destroy", "", "execCommand", "bundle", "Landroid/os/Bundle;", "getCalendarTitleController", "getDrawerMenuLockMode", "", "getMainTabContent", "T", "Landroid/view/View;", "()Landroid/view/View;", "getName", "", "getNavigationTabContent", "getPageContent", "getPageLoadStrategy", "getPageSwitchListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "getTabDoubleClickedListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnTabDoubleClickedListener;", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "handleBackPress", "", "initTabFragments", "", "Lcom/ss/android/lark/desktopmode/base/ContainerType;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "preloadPage", "reload", "reloadTabFragments", "resetPage", "Companion", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.a */
public final class CalendarTabPageSpec implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: d */
    public static final Companion f83898d = new Companion(null);

    /* renamed from: a */
    public final Activity f83899a;

    /* renamed from: b */
    public final CalendarTabDateUpdate f83900b;

    /* renamed from: c */
    public final Context f83901c;

    /* renamed from: e */
    private final Lazy f83902e = LazyKt.lazy(new C32718e(this));

    /* renamed from: f */
    private CalendarTitleProxyImpl f83903f;

    /* renamed from: g */
    private volatile BaseFragment f83904g;

    /* renamed from: h */
    private final Lazy f83905h;

    /* renamed from: i */
    private final ComponentCallbacksC32715b f83906i;

    /* renamed from: j */
    private OverallReminderManager f83907j;

    /* renamed from: k */
    private final C32717d f83908k;

    /* renamed from: l */
    private final ITitleController f83909l;

    /* renamed from: p */
    private final CalendarNavigationTabView m125561p() {
        return (CalendarNavigationTabView) this.f83905h.getValue();
    }

    /* renamed from: a */
    public final CalendarTabView mo120471a() {
        return (CalendarTabView) this.f83902e.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "calendar";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$Companion;", "", "()V", "TAB_KEY", "", "TAG", "getFromAppLinkBundle", "Landroid/os/Bundle;", ShareHitPoint.f121869d, "date", "getFromSearchBundle", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Bundle mo120473a() {
            return CalendarMainLauncher.f76830a.mo110724a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo120474a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str2, "date");
            return CalendarMainLauncher.f76830a.mo110725a(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$componentCallback$1", "Landroid/content/ComponentCallbacks;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.a$b */
    public static final class ComponentCallbacksC32715b implements ComponentCallbacks {
        public void onLowMemory() {
        }

        ComponentCallbacksC32715b() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
            CalendarSkinColorTool.m124924a();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f83908k;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarNavigationTabView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.a$c */
    static final class C32716c extends Lambda implements Function0<CalendarNavigationTabView> {
        final /* synthetic */ CalendarTabPageSpec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32716c(CalendarTabPageSpec aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarNavigationTabView invoke() {
            return new CalendarNavigationTabView(this.this$0.f83901c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.a$e */
    static final class C32718e extends Lambda implements Function0<CalendarTabView> {
        final /* synthetic */ CalendarTabPageSpec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32718e(CalendarTabPageSpec aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarTabView invoke() {
            return new CalendarTabView(this.this$0.f83901c);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        return m125562q().mo120479b();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f83904g = null;
        this.f83903f = null;
    }

    /* renamed from: q */
    private final CalendarTitleProxyImpl m125562q() {
        CalendarTitleProxyImpl bVar = this.f83903f;
        if (bVar != null) {
            return bVar;
        }
        CalendarTitleProxyImpl bVar2 = new CalendarTitleProxyImpl(this.f83901c, this.f83909l);
        this.f83903f = bVar2;
        return bVar2;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        CalendarTabView a = mo120471a();
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        this.f83900b.mo120470a(null);
        OverallReminderManager cVar = this.f83907j;
        if (cVar != null) {
            cVar.mo117937b();
        }
        this.f83901c.unregisterComponentCallbacks(this.f83906i);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        CalendarNavigationTabView p = m125561p();
        if (p != null) {
            return p;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: o */
    public BaseFragment mo31318i() {
        BaseFragment baseFragment;
        BaseFragment baseFragment2 = this.f83904g;
        if (baseFragment2 == null) {
            baseFragment2 = CalendarMainLauncher.f76830a.mo110726a(this.f83901c);
            if (!(baseFragment2 instanceof CalendarMainFragmentInterface)) {
                baseFragment = null;
            } else {
                baseFragment = baseFragment2;
            }
            CalendarMainFragmentInterface aVar = (CalendarMainFragmentInterface) baseFragment;
            if (aVar != null) {
                aVar.mo111855a(m125562q());
            }
            this.f83904g = baseFragment2;
        }
        return baseFragment2;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a<?>> mo103433r() {
        ContainerType containerType = ContainerType.Left;
        CalendarSelectorFragment cVar = new CalendarSelectorFragment();
        cVar.setFragmentParams(new MainWindowParams.C36570a(ContainerType.Left).mo134958a(mo31311b()).mo134930b());
        ContainerType containerType2 = ContainerType.Right;
        BaseFragment o = mo31318i();
        o.setFragmentParams(new MainWindowParams.C36570a(ContainerType.Right).mo134958a(mo31311b()).mo134930b());
        return MapsKt.hashMapOf(new Pair(containerType, cVar), new Pair(containerType2, o));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/wrapper/impl/tabspec/CalendarTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "afterPageSwitch", "", "prePageName", "", "currentPageName", "beforePageSwitch", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.tabspec.a$d */
    public static final class C32717d implements AbstractC44552i.AbstractC44553a {

        /* renamed from: a */
        final /* synthetic */ CalendarTabPageSpec f83910a;

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "prePageName");
            Intrinsics.checkParameterIsNotNull(str2, "currentPageName");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32717d(CalendarTabPageSpec aVar) {
            this.f83910a = aVar;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean areEqual = Intrinsics.areEqual(this.f83910a.mo31311b(), str);
            boolean areEqual2 = Intrinsics.areEqual(this.f83910a.mo31311b(), str2);
            CalendarMainFragmentInterface aVar = null;
            if (!areEqual && areEqual2) {
                this.f83910a.mo120471a().mo110677a();
                this.f83910a.f83900b.mo120470a(null);
            } else if (!areEqual || areEqual2) {
                this.f83910a.f83900b.mo120469a();
            } else {
                this.f83910a.mo120471a().mo110683b();
                CalendarTabDateUpdate calendarTabDateUpdate = this.f83910a.f83900b;
                Activity activity = this.f83910a.f83899a;
                if (!(activity instanceof LifecycleOwner)) {
                    activity = null;
                }
                calendarTabDateUpdate.mo120470a((LifecycleOwner) activity);
            }
            BaseFragment o = this.f83910a.mo31318i();
            if (o instanceof CalendarMainFragmentInterface) {
                aVar = o;
            }
            CalendarMainFragmentInterface aVar2 = aVar;
            if (aVar2 != null) {
                aVar2.mo111856a(areEqual, areEqual2);
            }
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        String string;
        boolean z;
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        BaseFragment o = mo31318i();
        String str = null;
        if (!(o instanceof CalendarMainFragmentInterface)) {
            o = null;
        }
        CalendarMainFragmentInterface aVar = (CalendarMainFragmentInterface) o;
        if (aVar != null) {
            aVar.mo111854a(bundle);
        }
        if (bundle.getBoolean("cal_route_calendar_list_from_tab") && (string = bundle.getString("calendar_id")) != null) {
            Intrinsics.checkExpressionValueIsNotNull(string, "it");
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = string;
            }
            if (str != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "bundle.getString(Calenda….isNotEmpty() } ?: return");
                CalendarSideBarEntrance.m113511a(this.f83901c, str);
            }
        }
    }

    public CalendarTabPageSpec(Context context, ITitleController iTitleController) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f83901c = context;
        this.f83909l = iTitleController;
        Activity activityFromContext = UIUtils.getActivityFromContext(context);
        this.f83899a = activityFromContext;
        CalendarTabDateUpdate calendarTabDateUpdate = new CalendarTabDateUpdate();
        this.f83900b = calendarTabDateUpdate;
        this.f83905h = LazyKt.lazy(new C32716c(this));
        ComponentCallbacksC32715b bVar = new ComponentCallbacksC32715b();
        this.f83906i = bVar;
        this.f83908k = new C32717d(this);
        C30810k.m114955a().mo111643b();
        context.registerComponentCallbacks(bVar);
        if (activityFromContext != null) {
            OverallReminderManager cVar = new OverallReminderManager(activityFromContext);
            this.f83907j = cVar;
            if (cVar != null) {
                cVar.mo117936a();
            }
        }
        calendarTabDateUpdate.mo120470a((LifecycleOwner) (!(activityFromContext instanceof LifecycleOwner) ? null : activityFromContext));
    }
}
