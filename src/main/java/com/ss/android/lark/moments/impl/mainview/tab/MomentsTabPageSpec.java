package com.ss.android.lark.moments.impl.mainview.tab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1787a.C36517b;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.AbstractC44557j;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.moments.impl.mainview.MomentsMainFragment;
import com.ss.android.lark.moments.impl.mainview.OnFragmentDestroyListener;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.moments.impl.mainview.title.MomentsTitleControllerProxy;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0019\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0017\u0010(\u001a\u0002H)\"\b\b\u0000\u0010)*\u00020*H\u0016¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020.H\u0016J\u0017\u0010/\u001a\u0002H)\"\b\b\u0000\u0010)*\u00020*H\u0016¢\u0006\u0002\u0010+J\b\u00100\u001a\u00020\u000fH\u0016J\b\u00101\u001a\u00020'H\u0016J\b\u00102\u001a\u000203H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\n\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020\fH\u0016J\u0018\u00109\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0:H\u0016J\u0010\u0010=\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020\"H\u0016J\b\u0010?\u001a\u00020\"H\u0002J\b\u0010@\u001a\u00020\"H\u0016J\u0018\u0010A\u001a\u0012\u0012\u0004\u0012\u00020;\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0:H\u0016J\b\u0010B\u001a\u00020\"H\u0016J\u0010\u0010C\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010 \u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec;", "Lcom/ss/android/lark/maincore/TabPageSpecV2;", "Lcom/ss/android/lark/maincore/TabPageSpec$Resetable;", "Lcom/ss/android/lark/desktopmode/frame/tab/IDesktopPageSpec;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "tabAppInfo", "Lcom/ss/android/lark/maincore/dto/TabAppInfo;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;Lcom/ss/android/lark/maincore/dto/TabAppInfo;)V", "firstTimeToMoments", "", "mContext", "mMomentsMainFragment", "Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragment;", "mMomentsTitleController", "Lcom/ss/android/lark/moments/impl/mainview/title/MomentsTitleControllerProxy;", "mNavigationTabView", "Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsNavigationTabView;", "getMNavigationTabView", "()Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsNavigationTabView;", "mNavigationTabView$delegate", "Lkotlin/Lazy;", "mPageSwitchListener", "com/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$mPageSwitchListener$1;", "mTabView", "Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsMainTabView;", "getMTabView", "()Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsMainTabView;", "mTabView$delegate", "mTitleController", "destroy", "", "execCommand", "bundle", "Landroid/os/Bundle;", "getDrawerMenuLockMode", "", "getMainTabContent", "T", "Landroid/view/View;", "()Landroid/view/View;", "getMomentsTitleController", "getName", "", "getNavigationTabContent", "getPageContent", "getPageLoadStrategy", "getPageSwitchListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "getTabDoubleClickedListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnTabDoubleClickedListener;", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "handleBackPress", "initTabFragments", "", "Lcom/ss/android/lark/desktopmode/base/ContainerType;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "onReloadTabAppInfo", "preloadPage", "registerBootMileStone", "reload", "reloadTabFragments", "resetPage", "setPreloadFragmentBaseData", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a */
public final class MomentsTabPageSpec implements AbstractC36553a, AbstractC44552i.AbstractC44555c, AbstractC44557j {

    /* renamed from: d */
    public static boolean f120324d;

    /* renamed from: e */
    public static final Companion f120325e = new Companion(null);

    /* renamed from: a */
    public final Context f120326a;

    /* renamed from: b */
    public boolean f120327b = true;

    /* renamed from: c */
    public MomentsTitleControllerProxy f120328c;

    /* renamed from: f */
    private final Lazy f120329f = LazyKt.lazy(new C47756e(this));

    /* renamed from: g */
    private final Lazy f120330g = LazyKt.lazy(new C47754c(this));

    /* renamed from: h */
    private ITitleController f120331h;

    /* renamed from: i */
    private volatile MomentsMainFragment f120332i;

    /* renamed from: j */
    private final C47755d f120333j;

    /* renamed from: p */
    private final MomentsNavigationTabView m188780p() {
        return (MomentsNavigationTabView) this.f120330g.getValue();
    }

    /* renamed from: a */
    public final MomentsMainTabView mo167451a() {
        return (MomentsMainTabView) this.f120329f.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "moments";
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$Companion;", "", "()V", "TAB_KEY", "", "TAG", "isInCurrentTab", "", "()Z", "setInCurrentTab", "(Z)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo167455a() {
            return MomentsTabPageSpec.f120324d;
        }

        /* renamed from: a */
        public final void mo167454a(boolean z) {
            MomentsTabPageSpec.f120324d = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$registerBootMileStone$1", "Lcom/ss/android/lark/maincore/IBootMileStoneListener;", "onFirstContentDraw", "", "tabName", "", "onFirstDataLoaded", "onFirstFrameDraw", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$f */
    public static final class C47757f implements AbstractC44544a {
        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102546a() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: b */
        public void mo102548b() {
        }

        C47757f() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$f$a */
        static final class RunnableC47758a implements Runnable {

            /* renamed from: a */
            public static final RunnableC47758a f120336a = new RunnableC47758a();

            RunnableC47758a() {
            }

            public final void run() {
                UserGlobalConfigAndSettingsManager.f120180a.mo167296a();
                MomentsNotificationManager.f120258a.mo167378a();
            }
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102547a(String str) {
            MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144721b(this);
            CoreThreadPool.getSerialTaskHandler().post(RunnableC47758a.f120336a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$getPageContent$2$1$1", "Lcom/ss/android/lark/moments/impl/mainview/OnFragmentDestroyListener;", "onFragmentDestroy", "", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$b */
    public static final class C47753b implements OnFragmentDestroyListener {

        /* renamed from: a */
        final /* synthetic */ MomentsTabPageSpec f120334a;

        @Override // com.ss.android.lark.moments.impl.mainview.OnFragmentDestroyListener
        /* renamed from: a */
        public void mo167433a() {
            this.f120334a.mo103434s();
        }

        C47753b(MomentsTabPageSpec aVar) {
            this.f120334a = aVar;
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f120333j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsNavigationTabView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$c */
    static final class C47754c extends Lambda implements Function0<MomentsNavigationTabView> {
        final /* synthetic */ MomentsTabPageSpec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47754c(MomentsTabPageSpec aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsNavigationTabView invoke() {
            return new MomentsNavigationTabView(this.this$0.f120326a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsMainTabView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$e */
    static final class C47756e extends Lambda implements Function0<MomentsMainTabView> {
        final /* synthetic */ MomentsTabPageSpec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47756e(MomentsTabPageSpec aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsMainTabView invoke() {
            return new MomentsMainTabView(this.this$0.f120326a);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        return m188781q().mo167350b();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f120332i = null;
        this.f120328c = null;
    }

    /* renamed from: q */
    private final MomentsTitleControllerProxy m188781q() {
        MomentsTitleControllerProxy bVar = this.f120328c;
        if (bVar != null) {
            return bVar;
        }
        MomentsTitleControllerProxy a = MomentsTitleControllerProxy.f120224c.mo167354a(this.f120326a, this.f120331h);
        this.f120328c = a;
        return a;
    }

    /* renamed from: t */
    private final void m188782t() {
        MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144718a(new C47757f());
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        MomentsMainTabView a = mo167451a();
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        MomentsNotificationManager.f120258a.mo167388c();
        mo167451a().mo167444e();
        m188780p().mo167448c();
        MomentsTitleControllerProxy bVar = this.f120328c;
        if (bVar != null) {
            bVar.mo167349a();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        MomentsNavigationTabView p = m188780p();
        if (p != null) {
            return p;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: o */
    public MomentsMainFragment mo31318i() {
        MomentsMainFragment dVar = this.f120332i;
        if (dVar != null) {
            return dVar;
        }
        MomentsMainFragment a = MomentsMainFragment.f120273d.mo167414a(this.f120326a);
        a.mo167410a(new C47753b(this));
        Context context = this.f120326a;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            a.mo167407a(activity);
        }
        a.mo167409a(m188781q());
        this.f120332i = a;
        return a;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a<?>> mo103433r() {
        C36517b a = C36517b.m144069a(mo31318i());
        a.setFragmentParams(new MainWindowParams.C36570a(ContainerType.ALL).mo134958a(mo31311b()).mo134930b());
        return MapsKt.hashMapOf(new Pair(ContainerType.ALL, a));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/mainview/tab/MomentsTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "afterPageSwitch", "", "prePageName", "", "currentPageName", "beforePageSwitch", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.a$d */
    public static final class C47755d implements AbstractC44552i.AbstractC44553a {

        /* renamed from: a */
        final /* synthetic */ MomentsTabPageSpec f120335a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47755d(MomentsTabPageSpec aVar) {
            this.f120335a = aVar;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "prePageName");
            Intrinsics.checkParameterIsNotNull(str2, "currentPageName");
            MomentsAppreciableHitPoint.f119684a.mo166742a(this.f120335a.f120327b);
            this.f120335a.f120327b = false;
            MomentsAppreciableHitPoint.f119684a.mo166759k();
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f120335a.mo31311b(), str);
            boolean equals2 = TextUtils.equals(this.f120335a.mo31311b(), str2);
            this.f120335a.mo31318i().mo167411a(equals, equals2);
            if (!equals && equals2) {
                this.f120335a.mo167451a().mo110677a();
                MomentsTabPageSpec.f120325e.mo167454a(true);
                MomentsNotificationManager.f120258a.mo167393f();
                MomentsTitleControllerProxy bVar = this.f120335a.f120328c;
                if (bVar != null) {
                    bVar.mo167351c();
                }
            } else if (equals && !equals2) {
                this.f120335a.mo167451a().mo110683b();
                MomentsTabPageSpec.f120325e.mo167454a(false);
            }
            if (equals2) {
                MomentsHitPointNew.f119721a.mo166861b();
            }
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        mo31318i().mo167408a(bundle);
    }

    /* renamed from: a */
    public final void mo167452a(ITitleController iTitleController) {
        MomentsMainFragment dVar;
        this.f120331h = iTitleController;
        if (this.f120332i == null) {
            this.f120332i = MomentsMainFragment.f120273d.mo167414a(this.f120326a);
        }
        this.f120328c = MomentsTitleControllerProxy.f120224c.mo167354a(this.f120326a, this.f120331h);
        Context context = this.f120326a;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (!(activity == null || (dVar = this.f120332i) == null)) {
            dVar.mo167407a(activity);
        }
        MomentsMainFragment dVar2 = this.f120332i;
        if (dVar2 != null) {
            dVar2.mo167409a(m188781q());
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44557j
    /* renamed from: a */
    public void mo158102a(TabAppInfo tabAppInfo) {
        Intrinsics.checkParameterIsNotNull(tabAppInfo, "tabAppInfo");
        Log.m165389i("MomentsTabPageSpec", "onReloadTabAppInfo name=" + tabAppInfo.getName());
        MomentsAppNameHolder.f120253a.mo167375a(tabAppInfo);
        mo167451a().mo153398d();
        m188780p().mo167447b();
        MomentsNotificationManager.f120258a.mo167385b();
        UserGlobalConfigAndSettingsManager.f120180a.mo167296a();
    }

    public MomentsTabPageSpec(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(tabAppInfo, "tabAppInfo");
        this.f120326a = context;
        this.f120331h = iTitleController;
        this.f120333j = new C47755d(this);
        MomentsAppNameHolder.f120253a.mo167375a(tabAppInfo);
        mo167451a().mo137108c();
        m188780p().mo153395a();
        m188782t();
    }
}
