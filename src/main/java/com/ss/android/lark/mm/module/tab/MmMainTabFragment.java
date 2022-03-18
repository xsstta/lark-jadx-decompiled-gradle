package com.ss.android.lark.mm.module.tab;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.live.settings.C41524a;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.mm.apm.MmApmAgent;
import com.ss.android.lark.mm.apm.MmApmDataInfo;
import com.ss.android.lark.mm.apm.power.MmPowerDataInfo;
import com.ss.android.lark.mm.apm.scene.MmApmMonitorScene;
import com.ss.android.lark.mm.base.BaseFragment;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.MicrophonePermission;
import com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.home.MmHomeListFragment;
import com.ss.android.lark.mm.module.list.my.MmMyListFragment;
import com.ss.android.lark.mm.module.list.shared.MmSharedListFragment;
import com.ss.android.lark.mm.module.list.trash.MmTrashListFragment;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadCenter;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableListTracker;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableRecordTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ListPageClickEvent;
import com.ss.android.lark.mm.statistics.monitor.MmMonitorUtils;
import com.ss.android.lark.mm.statistics.monitor.recording.MmAudioMonitor;
import com.ss.android.lark.mm.utils.ktextensions.C47109c;
import com.ss.android.lark.ui.p2892a.C57582a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001\u000f\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\u0006\u0010'\u001a\u00020\u001eJ&\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010$H\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\u001a\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010$H\u0016J\u0012\u00102\u001a\u00020\u001e2\b\u00103\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u00104\u001a\u00020\u001eH\u0002J\b\u00105\u001a\u00020\u001eH\u0016J\u0006\u00106\u001a\u00020\u001eJ\u000e\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\rJ\u0010\u00109\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010\u0014J\b\u0010;\u001a\u00020\u001eH\u0002J\b\u0010<\u001a\u00020\rH\u0002J\b\u0010=\u001a\u00020\u001eH\u0002J\b\u0010>\u001a\u00020\u001eH\u0002J\b\u0010?\u001a\u00020\u001eH\u0002J\b\u0010@\u001a\u00020\u001eH\u0002R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmMainTabFragment;", "Lcom/ss/android/lark/mm/base/BaseFragment;", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "url", "", ShareHitPoint.f121868c, "", "recordMarginBottom", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "TAG", "handleCommandRunnable", "Ljava/lang/Runnable;", "isPageTracked", "", "listener", "com/ss/android/lark/mm/module/tab/MmMainTabFragment$listener$1", "Lcom/ss/android/lark/mm/module/tab/MmMainTabFragment$listener$1;", "mRootView", "Landroid/view/View;", "mTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "recordClickDisposable", "Lio/reactivex/disposables/Disposable;", "recordDisposable", "repoId", "Ljava/lang/Integer;", "targetSpace", "vcInnoSettings", "Lcom/ss/android/lark/live/settings/VcInnoSettings;", "add", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "getSpaceTypeByUrl", "handleCommand", "bundle", "Landroid/os/Bundle;", "initData", "initView", "onBackPressed", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onPause", "onResume", "onViewCreated", "view", "onViewDetachedFromWindow", "v", "openTargetSpace", "pop", "scrollToTop", "setRecordBtnVisibility", "isShow", "setTitleController", "controller", "setupRecordingView", "shouldStartMonitorPerformance", "startMonitorPerf", "stopPerfMonitor", "triggerMonitorPerfNow", "updateRootViewPadding", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.tab.a */
public final class MmMainTabFragment extends BaseFragment implements IFragmentManager {

    /* renamed from: c */
    public static final Companion f118391c = new Companion(null);

    /* renamed from: a */
    public final String f118392a;

    /* renamed from: b */
    public String f118393b;

    /* renamed from: d */
    private String f118394d;

    /* renamed from: e */
    private boolean f118395e;

    /* renamed from: f */
    private final Runnable f118396f;

    /* renamed from: g */
    private View f118397g;

    /* renamed from: h */
    private ITitleController f118398h;

    /* renamed from: i */
    private Disposable f118399i;

    /* renamed from: j */
    private Disposable f118400j;

    /* renamed from: k */
    private C41524a f118401k;

    /* renamed from: l */
    private final C47039c f118402l;

    /* renamed from: m */
    private String f118403m;

    /* renamed from: n */
    private Integer f118404n;

    /* renamed from: o */
    private int f118405o;

    /* renamed from: p */
    private HashMap f118406p;

    public MmMainTabFragment() {
        this(null, null, 0, 7, null);
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f118406p == null) {
            this.f118406p = new HashMap();
        }
        View view = (View) this.f118406p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118406p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f118406p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: d */
    public final void mo165265d() {
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmMainTabFragment$Companion;", "", "()V", "MINUTES_SOURCE_EXTRA", "", "MINUTES_TARGET_TAB_EXTRA", "MINUTES_URL_EXTRA", "SPACE_HOME", "SPACE_MY", "SPACE_SHARE", "SPACE_TRASH", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/tab/MmMainTabFragment$triggerMonitorPerfNow$1", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$g */
    public static final class C47048g implements MmApmAgent.IMmApmDataListener {
        C47048g() {
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161111a(MmApmDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "apmData");
            MmMonitorUtils aVar = MmMonitorUtils.f118585a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", MmApmMonitorScene.MinutesHome.name());
            MmMonitorUtils.m186469a(aVar, jSONObject, bVar, (JSONObject) null, 4, (Object) null);
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161112a(MmPowerDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "powerData");
            MmMonitorUtils aVar = MmMonitorUtils.f118585a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", MmApmMonitorScene.MinutesHome.name());
            MmMonitorUtils.m186470a(aVar, jSONObject, bVar, (JSONObject) null, 4, (Object) null);
        }
    }

    /* renamed from: h */
    private final void m186180h() {
        m186181i();
    }

    /* renamed from: f */
    public final void mo165267f() {
        bj_();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$b */
    static final class RunnableC47038b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmMainTabFragment f118407a;

        RunnableC47038b(MmMainTabFragment aVar) {
            this.f118407a = aVar;
        }

        public final void run() {
            this.f118407a.mo165263a((Bundle) null);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onPause() {
        super.onPause();
        m186185m();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onResume() {
        super.onResume();
        m186184l();
    }

    /* renamed from: l */
    private final void m186184l() {
        MmApmAgent.f115638a.mo161102a(this.f118402l);
    }

    /* renamed from: n */
    private final void m186186n() {
        MmApmAgent.f115638a.mo161104b(this.f118402l);
    }

    /* renamed from: k */
    private final void m186183k() {
        ITitleController iTitleController;
        int i;
        View view = this.f118397g;
        if (view != null && (iTitleController = this.f118398h) != null && view != null) {
            if (iTitleController != null) {
                i = iTitleController.mo99189a();
            } else {
                i = 0;
            }
            view.setPadding(0, i, 0, 0);
        }
    }

    /* renamed from: m */
    private final void m186185m() {
        if (!MmApmAgent.f115638a.mo161109f()) {
            MmApmAgent.f115638a.mo161106c(new C47048g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/tab/MmMainTabFragment$onViewCreated$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$e */
    static final class C47041e extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmMainTabFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47041e(MmMainTabFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (C45865a.m181719b()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.mo161166a(R.id.ivRecord);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivRecord");
                appCompatImageView.setVisibility(0);
                if (!(this.this$0.getActivity() instanceof MinutesListActivity)) {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.this$0.mo161166a(R.id.ivRecord);
                    Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivRecord");
                    appCompatImageView2.setTranslationY((float) C57582a.m223600a(22));
                    return;
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.this$0.mo161166a(R.id.ivRecord);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "ivRecord");
                appCompatImageView3.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: g */
    private final void m186179g() {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("mm_url_extra");
            if (string != null) {
                this.f118403m = string;
            }
            this.f118404n = Integer.valueOf(arguments.getInt("mm_source_extra"));
            String string2 = arguments.getString("mm_target_tab_extra");
            if (string2 != null) {
                this.f118394d = string2;
            }
        }
        String str = this.f118403m;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f118394d = m186178a(this.f118403m);
        }
        if (this.f118394d == null) {
            this.f118394d = "home";
        }
        this.f118393b = MmListControl.f116817j.mo163014b();
    }

    /* renamed from: i */
    private final void m186181i() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo161166a(R.id.ivRecord);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivRecord");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, this.f118405o);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo161166a(R.id.ivRecord);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivRecord");
        this.f118400j = C47109c.m186569a(appCompatImageView2).throttleFirst(1, TimeUnit.SECONDS).subscribe(new C47042f(this));
    }

    /* renamed from: j */
    private final void m186182j() {
        String str = this.f118394d;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3500) {
                if (hashCode != 3208415) {
                    if (hashCode != 109400031) {
                        if (hashCode == 110621496 && str.equals("trash")) {
                            mo161184a(FragmentType.TrashList);
                        }
                    } else if (str.equals("share")) {
                        mo161184a(FragmentType.SharedList);
                    }
                } else if (str.equals("home")) {
                    mo161184a(FragmentType.HomeList);
                }
            } else if (str.equals("my")) {
                mo161184a(FragmentType.MyList);
            }
        }
    }

    @Override // com.ss.android.lark.mm.base.IFragmentManager
    public void bj_() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        if (childFragmentManager.getBackStackEntryCount() > 1) {
            getChildFragmentManager().popBackStackImmediate();
            Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.containerFragment);
            if (findFragmentById instanceof MinutesBaseListFragment) {
                MinutesBaseListFragment cVar = (MinutesBaseListFragment) findFragmentById;
                cVar.mo162881j();
                cVar.mo162942h();
                cVar.mo162940f().mo165403a();
                MmListControl b = MmListControl.f116817j.mo163013b(this.f118393b);
                if (b != null) {
                    MmListControl.m183598a(b, MmListControl.DataSource.HomeList, 0, 2, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    public final boolean mo165266e() {
        boolean z;
        FragmentManager supportFragmentManager;
        boolean f = MmApmAgent.f115638a.mo161109f();
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        Activity a2 = lifecycleDependency.mo144570a();
        List<Fragment> list = null;
        if (!(a2 instanceof FragmentActivity)) {
            a2 = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) a2;
        if (!(fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null)) {
            list = supportFragmentManager.getFragments();
        }
        if (list == null || !list.contains(this)) {
            z = false;
        } else {
            z = true;
        }
        C45855f.m181664c(this.f118392a, "[shouldStartMonitorPerformance] isRecordingOrPodcastMode: " + f + ", isOnCurrentPage: " + z);
        if (f || !z) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/tab/MmMainTabFragment$listener$1", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$c */
    public static final class C47039c implements MmApmAgent.IMmApmDataListener {

        /* renamed from: a */
        final /* synthetic */ MmMainTabFragment f118408a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47039c(MmMainTabFragment aVar) {
            this.f118408a = aVar;
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161111a(MmApmDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "apmData");
            if (this.f118408a.mo165266e()) {
                MmMonitorUtils aVar = MmMonitorUtils.f118585a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", MmApmMonitorScene.MinutesHome.name());
                MmMonitorUtils.m186469a(aVar, jSONObject, bVar, (JSONObject) null, 4, (Object) null);
            }
        }

        @Override // com.ss.android.lark.mm.apm.MmApmAgent.IMmApmDataListener
        /* renamed from: a */
        public void mo161112a(MmPowerDataInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "powerData");
            if (this.f118408a.mo165266e()) {
                MmMonitorUtils aVar = MmMonitorUtils.f118585a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", MmApmMonitorScene.MinutesHome.name());
                MmMonitorUtils.m186470a(aVar, jSONObject, bVar, (JSONObject) null, 4, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo165264a(ITitleController iTitleController) {
        this.f118398h = iTitleController;
        m186183k();
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        Disposable disposable = this.f118400j;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f118399i;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        MmListControl.f116817j.mo163012a(this.f118393b);
        m186186n();
    }

    /* renamed from: a */
    private final String m186178a(String str) {
        if (this.f118401k.mo149416d(str)) {
            return "home";
        }
        if (this.f118401k.mo149418e(str)) {
            return "my";
        }
        if (this.f118401k.mo149420f(str)) {
            return "share";
        }
        if (this.f118401k.mo149421g(str)) {
            return "trash";
        }
        return "";
    }

    /* renamed from: b */
    public final void mo162053b(boolean z) {
        if (!z || !C45865a.m181719b()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo161166a(R.id.ivRecord);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivRecord");
            appCompatImageView.setVisibility(8);
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo161166a(R.id.ivRecord);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivRecord");
        appCompatImageView2.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$f */
    public static final class C47042f<T> implements Consumer<Unit> {

        /* renamed from: a */
        final /* synthetic */ MmMainTabFragment f118410a;

        C47042f(MmMainTabFragment aVar) {
            this.f118410a = aVar;
        }

        /* renamed from: a */
        public final void accept(Unit unit) {
            C45855f.m181664c(this.f118410a.f118392a, "click audio button");
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            if (a.mo161151b().mo164278h()) {
                C45858j.m181677a((int) R.string.MMWeb_G_CanNotRecordInPodcastMode);
                return;
            }
            MmAppreciableRecordTracker.TrackDetailInitTime.m186407a();
            new ListPageClickEvent("start_recording", null, 2, null).mo165437a();
            MmAudioMonitor.f118586a.mo165442a();
            C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("start_recording").mo165423e("vc_minutes_recording_view").mo165421c());
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f118410a.mo161166a(R.id.ivRecord);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivRecord");
            appCompatImageView.setEnabled(false);
            if (!MicrophonePermission.f116672a.mo162800a(this.f118410a.getContext())) {
                MicrophonePermission.f116672a.mo162799a(this.f118410a.getContext(), new Function1<Boolean, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.tab.MmMainTabFragment.C47042f.C470431 */
                    final /* synthetic */ C47042f this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        if (z) {
                            MmRecordManager.Companion aVar = MmRecordManager.f117918g;
                            FragmentActivity requireActivity = this.this$0.f118410a.requireActivity();
                            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
                            MmRecordManager.Companion.m185588a(aVar, requireActivity, this.this$0.f118410a.f118393b, false, new Function0<Unit>(this) {
                                /* class com.ss.android.lark.mm.module.tab.MmMainTabFragment.C47042f.C470431.C470441 */
                                final /* synthetic */ C470431 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final void invoke() {
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.this$0.f118410a.mo161166a(R.id.ivRecord);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setVisibility(8);
                                    }
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.this$0.this$0.f118410a.mo161166a(R.id.ivRecord);
                                    if (appCompatImageView2 != null) {
                                        appCompatImageView2.setEnabled(true);
                                    }
                                }
                            }, new Function0<Unit>(this) {
                                /* class com.ss.android.lark.mm.module.tab.MmMainTabFragment.C47042f.C470431.C470452 */
                                final /* synthetic */ C470431 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final void invoke() {
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.this$0.f118410a.mo161166a(R.id.ivRecord);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setEnabled(true);
                                    }
                                }
                            }, 4, null);
                        } else if (((AppCompatImageView) this.this$0.f118410a.mo161166a(R.id.ivRecord)) != null) {
                            AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.f118410a.mo161166a(R.id.ivRecord);
                            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivRecord");
                            appCompatImageView.setEnabled(true);
                        }
                    }
                });
                return;
            }
            MmRecordManager.Companion aVar = MmRecordManager.f117918g;
            FragmentActivity requireActivity = this.f118410a.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            MmRecordManager.Companion.m185588a(aVar, requireActivity, this.f118410a.f118393b, false, new Function0<Unit>(this) {
                /* class com.ss.android.lark.mm.module.tab.MmMainTabFragment.C47042f.C470462 */
                final /* synthetic */ C47042f this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.f118410a.mo161166a(R.id.ivRecord);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.this$0.f118410a.mo161166a(R.id.ivRecord);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setEnabled(true);
                    }
                }
            }, new Function0<Unit>(this) {
                /* class com.ss.android.lark.mm.module.tab.MmMainTabFragment.C47042f.C470473 */
                final /* synthetic */ C47042f this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.f118410a.mo161166a(R.id.ivRecord);
                    if (appCompatImageView != null) {
                        appCompatImageView.setEnabled(true);
                    }
                }
            }, 4, null);
        }
    }

    /* renamed from: a */
    public final void mo165263a(Bundle bundle) {
        String str;
        boolean z;
        View view = this.f118397g;
        if (view != null) {
            view.removeCallbacks(this.f118396f);
        }
        Integer num = null;
        if (bundle != null) {
            str = bundle.getString("mm_url_extra");
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f118403m = str;
            this.f118394d = m186178a(str);
        }
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("mm_source_extra"));
        }
        if (num != null) {
            this.f118404n = num;
        }
        if (!this.f118395e) {
            this.f118395e = true;
        }
    }

    @Override // com.ss.android.lark.mm.base.IFragmentManager
    /* renamed from: a */
    public void mo161184a(FragmentType fragmentType) {
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        int i = C47049b.f118411a[fragmentType.ordinal()];
        if (i == 1) {
            MmHomeListFragment cVar = new MmHomeListFragment(this.f118393b, this);
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "childFragmentManager.beginTransaction()");
            beginTransaction.add(R.id.containerFragment, cVar);
            beginTransaction.commit();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction.addToBackStack(MmHomeListFragment.class.getName()), "ft.addToBackStack(MmHome…ragment::class.java.name)");
        } else if (i == 2) {
            MmMyListFragment cVar2 = new MmMyListFragment(this.f118393b, this);
            FragmentTransaction beginTransaction2 = getChildFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction2, "childFragmentManager.beginTransaction()");
            beginTransaction2.add(R.id.containerFragment, cVar2).commit();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction2.addToBackStack(MmMyListFragment.class.getName()), "ft.addToBackStack(MmMyLi…ragment::class.java.name)");
        } else if (i == 3) {
            MmSharedListFragment bVar = new MmSharedListFragment(this.f118393b, this);
            FragmentTransaction beginTransaction3 = getChildFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction3, "childFragmentManager.beginTransaction()");
            beginTransaction3.add(R.id.containerFragment, bVar).commit();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction3.addToBackStack(MmSharedListFragment.class.getName()), "ft.addToBackStack(MmShar…ragment::class.java.name)");
        } else if (i == 4) {
            MmTrashListFragment aVar = new MmTrashListFragment(this.f118393b, this);
            FragmentTransaction beginTransaction4 = getChildFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction4, "childFragmentManager.beginTransaction()");
            beginTransaction4.add(R.id.containerFragment, aVar).commit();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction4.addToBackStack(MmTrashListFragment.class.getName()), "ft.addToBackStack(MmTras…ragment::class.java.name)");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "oldState", "Lcom/ss/android/lark/mm/depend/IMmDepend$IContextDepend$AppStateInfo;", "newState", "onAppLifecycleChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.a$d */
    static final class C47040d implements IMmDepend.AbstractC45871b.AbstractC45874c {

        /* renamed from: a */
        public static final C47040d f118409a = new C47040d();

        C47040d() {
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b.AbstractC45874c
        /* renamed from: a */
        public final void mo149331a(IMmDepend.AbstractC45871b.C45872a aVar, IMmDepend.AbstractC45871b.C45872a aVar2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(aVar, "oldState");
            Intrinsics.checkParameterIsNotNull(aVar2, "newState");
            boolean z2 = true;
            if (aVar.f115713c || !aVar2.f115713c) {
                z = false;
            } else {
                z = true;
            }
            if (!aVar.f115713c || aVar2.f115713c) {
                z2 = false;
            }
            if (z) {
                MmAudioUploadCenter.m185965b();
            }
            if (z2 && !MmRecordManager.f117918g.mo164549a()) {
                MmAudioUploadCenter.m185966c();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m186180h();
        MmListControl b = MmListControl.f116817j.mo163013b(this.f118393b);
        if (b != null) {
            this.f118399i = b.mo162973a(MmListControl.DataSource.RecordReady, new C47041e(this));
        }
        m186182j();
        View view2 = this.f118397g;
        if (view2 != null) {
            view2.postDelayed(this.f118396f, 500);
        }
    }

    public MmMainTabFragment(String str, Integer num, int i) {
        this.f118403m = str;
        this.f118404n = num;
        this.f118405o = i;
        this.f118392a = "MmMainTabFragment";
        this.f118393b = "";
        this.f118396f = new RunnableC47038b(this);
        this.f118401k = new C41524a();
        this.f118402l = new C47039c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C45855f.m181664c(this.f118392a, "onCreateView");
        if (!(getActivity() instanceof MinutesListActivity)) {
            MmAppreciableListTracker.f118526a.mo165387a(this.f118394d);
        }
        this.f118397g = layoutInflater.inflate(R.layout.mm_main_tab_fragment, viewGroup, false);
        m186183k();
        m186179g();
        MmAudioUploadCenter.m185965b();
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        a.getContextDepend().mo144560a(C47040d.f118409a);
        return this.f118397g;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmMainTabFragment(String str, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? 0 : i);
    }
}
