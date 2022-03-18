package com.ss.android.lark.mine.impl.index.v2.container;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.impl.index.v2.ICommonWidget;
import com.ss.android.lark.mine.impl.index.v2.IComponent;
import com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent;
import com.ss.android.lark.mine.impl.index.v2.list.ListComponent;
import com.ss.android.lark.mine.impl.index.v2.title.TitleComponent;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002#$B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/IComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/ICommonWidget;", "mContext", "Landroid/app/Activity;", "dependency", "Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer$IContainerDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer$IContainerDependency;)V", "bottomComponent", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent;", "getDependency", "()Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer$IContainerDependency;", "hostViewModel", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "layoutId", "", "getLayoutId", "()I", "listComponent", "Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent;", "getMContext", "()Landroid/app/Activity;", "titleComponent", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent;", "getComponentType", "initComponents", "", "initModel", "noticeShowMineTip", "canShow", "", "onCreate", "onShow", "reload", "Companion", "IContainerDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MineContainer extends Widget implements IComponent, ICommonWidget {

    /* renamed from: d */
    public static final Companion f115323d = new Companion(null);

    /* renamed from: a */
    public TitleComponent f115324a;

    /* renamed from: b */
    public BottomComponent f115325b;

    /* renamed from: c */
    public ListComponent f115326c;

    /* renamed from: e */
    private HostViewModel f115327e;

    /* renamed from: f */
    private final Activity f115328f;

    /* renamed from: g */
    private final IContainerDependency f115329g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer$IContainerDependency;", "", "isFragmentAdded", "", "onGotoOtherPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainer$b */
    public interface IContainerDependency {
        /* renamed from: a */
        void mo160800a();

        /* renamed from: b */
        boolean mo160801b();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.fragment_mine_v2_container;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Activity mo121985c() {
        return this.f115328f;
    }

    /* renamed from: f */
    public final IContainerDependency mo160804f() {
        return this.f115329g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/container/MineContainer$initComponents$1", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleComponent$ITitleDependency;", "isFragmentAdded", "", "()Z", "onGotoOtherPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainer$c */
    public static final class C45670c implements TitleComponent.ITitleDependency {

        /* renamed from: a */
        final /* synthetic */ MineContainer f115330a;

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleComponent.ITitleDependency
        /* renamed from: a */
        public void mo160805a() {
            this.f115330a.mo160804f().mo160800a();
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.title.TitleComponent.ITitleDependency
        /* renamed from: b */
        public boolean mo160806b() {
            return this.f115330a.mo160804f().mo160801b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45670c(MineContainer mineContainer) {
            this.f115330a = mineContainer;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/container/MineContainer$initComponents$2", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency;", "checkLocationPermission", "", "callback", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomComponent$IBottomDependency$ILocationPermissionResultCallback;", "onGotoOtherPage", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainer$d */
    public static final class C45671d implements BottomComponent.IBottomDependency {

        /* renamed from: a */
        final /* synthetic */ MineContainer f115331a;

        @Override // com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent.IBottomDependency
        /* renamed from: a */
        public void mo160776a() {
            this.f115331a.mo160804f().mo160800a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45671d(MineContainer mineContainer) {
            this.f115331a = mineContainer;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "granted", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainer$d$a */
        static final class C45672a<T> implements Consumer<Boolean> {

            /* renamed from: a */
            final /* synthetic */ BottomComponent.IBottomDependency.ILocationPermissionResultCallback f115332a;

            C45672a(BottomComponent.IBottomDependency.ILocationPermissionResultCallback aVar) {
                this.f115332a = aVar;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                BottomComponent.IBottomDependency.ILocationPermissionResultCallback aVar = this.f115332a;
                if (bool == null) {
                    Intrinsics.throwNpe();
                }
                aVar.mo160778a(bool.booleanValue());
            }
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.bottom.BottomComponent.IBottomDependency
        /* renamed from: a */
        public void mo160777a(BottomComponent.IBottomDependency.ILocationPermissionResultCallback aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            C51331a aVar2 = new C51331a(this.f115331a.mo121985c());
            if (!aVar2.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
                aVar2.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new C45672a(aVar));
            } else {
                aVar.mo160778a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/container/MineContainer$initComponents$3", "Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent$IListDependency;", "onGotoOtherPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainer$e */
    public static final class C45673e implements ListComponent.IListDependency {

        /* renamed from: a */
        final /* synthetic */ MineContainer f115333a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.ListComponent.IListDependency
        /* renamed from: a */
        public void mo160808a() {
            this.f115333a.mo160804f().mo160800a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45673e(MineContainer mineContainer) {
            this.f115333a = mineContainer;
        }
    }

    /* renamed from: g */
    private final void m181082g() {
        WidgetManager a = WidgetManager.f99047e.mo141220a(this);
        HostViewModel aVar = this.f115327e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hostViewModel");
        }
        a.mo141214a(new MineContainerModel(aVar));
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void bb_() {
        if (!UIUtils.isActivityRunning(this.f115328f)) {
            Log.m165387e("Mine_MineContainer", (Throwable) new Exception("mine container Activity is not running"), true);
        } else if (this.f115326c == null) {
            Log.m165387e("Mine_MineContainer", (Throwable) new Exception("listComponent is not isInitialized"), true);
        } else {
            ListComponent listComponent = this.f115326c;
            if (listComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listComponent");
            }
            listComponent.bb_();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        Activity activity = this.f115328f;
        if (activity != null) {
            AbstractC1142af a = aj.m5366a((FragmentActivity) activity).mo6005a(HostViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(mC…ostViewModel::class.java)");
            this.f115327e = (HostViewModel) a;
            m181083h();
            m181082g();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void ba_() {
        Boolean bool;
        MineContainer mineContainer = this;
        if (mineContainer.f115324a == null || mineContainer.f115325b == null || mineContainer.f115326c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("components are not initialized, activity is destroyed: ");
            Activity activity = this.f115328f;
            Boolean bool2 = null;
            if (activity != null) {
                bool = Boolean.valueOf(activity.isDestroyed());
            } else {
                bool = null;
            }
            sb.append(bool);
            sb.append(", Finishing: ");
            Activity activity2 = this.f115328f;
            if (activity2 != null) {
                bool2 = Boolean.valueOf(activity2.isFinishing());
            }
            sb.append(bool2);
            Log.m165397w("Mine_MineContainer", sb.toString());
            return;
        }
        TitleComponent titleComponent = this.f115324a;
        if (titleComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleComponent");
        }
        titleComponent.ba_();
        BottomComponent bottomComponent = this.f115325b;
        if (bottomComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomComponent");
        }
        bottomComponent.ba_();
        ListComponent listComponent = this.f115326c;
        if (listComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listComponent");
        }
        listComponent.ba_();
    }

    /* renamed from: h */
    private final void m181083h() {
        Boolean bool;
        if (!UIUtils.isActivityRunning(this.f115328f)) {
            StringBuilder sb = new StringBuilder();
            sb.append("stop initializing components, activity is destroyed: ");
            Activity activity = this.f115328f;
            Boolean bool2 = null;
            if (activity != null) {
                bool = Boolean.valueOf(activity.isDestroyed());
            } else {
                bool = null;
            }
            sb.append(bool);
            sb.append(", finishIng: ");
            Activity activity2 = this.f115328f;
            if (activity2 != null) {
                bool2 = Boolean.valueOf(activity2.isFinishing());
            }
            sb.append(bool2);
            Log.m165397w("Mine_MineContainer", sb.toString());
            return;
        }
        Activity activity3 = this.f115328f;
        if (activity3 == null) {
            Intrinsics.throwNpe();
        }
        HostViewModel aVar = this.f115327e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hostViewModel");
        }
        this.f115324a = new TitleComponent(activity3, aVar, new C45670c(this));
        this.f115325b = new BottomComponent(this.f115328f, new C45671d(this));
        Activity activity4 = this.f115328f;
        HostViewModel aVar2 = this.f115327e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hostViewModel");
        }
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        View findViewById = K.findViewById(R.id.inner_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView!!.findViewById(id.inner_content)");
        this.f115326c = new ListComponent(activity4, aVar2, (LinearLayout) findViewById, new C45673e(this));
        WidgetManager a = WidgetManager.f99047e.mo141220a(this);
        TitleComponent titleComponent = this.f115324a;
        if (titleComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleComponent");
        }
        WidgetManager a2 = a.mo141213a(R.id.title_zone, (Widget) titleComponent, false);
        BottomComponent bottomComponent = this.f115325b;
        if (bottomComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomComponent");
        }
        WidgetManager a3 = a2.mo141213a(R.id.bottom_zone, (Widget) bottomComponent, false);
        ListComponent listComponent = this.f115326c;
        if (listComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listComponent");
        }
        a3.mo141214a(listComponent);
        Log.m165389i("Mine_MineContainer", "init Container: on" + getLifecycle().getCurrentState().name());
    }

    /* renamed from: a */
    public final void mo160803a(boolean z) {
        if (!UIUtils.isActivityRunning(this.f115328f)) {
            Log.m165387e("Mine_MineContainer", (Throwable) new Exception("mine container Activity is not running"), true);
        } else if (this.f115324a == null) {
            Log.m165387e("Mine_MineContainer", (Throwable) new Exception("titleComponent is not isInitialized"), true);
        } else {
            TitleComponent titleComponent = this.f115324a;
            if (titleComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleComponent");
            }
            titleComponent.mo160879a(z);
        }
    }

    public MineContainer(Activity activity, IContainerDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f115328f = activity;
        this.f115329g = bVar;
    }
}
