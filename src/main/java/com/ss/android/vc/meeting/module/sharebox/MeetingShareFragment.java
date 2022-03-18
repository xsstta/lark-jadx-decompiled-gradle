package com.ss.android.vc.meeting.module.sharebox;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.base.AbstractC61428h;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.C61434m;
import com.ss.android.vc.meeting.module.busyring.C61544d;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61661d;
import com.ss.android.vc.meeting.module.floatingwindow.FloatWindowLaunchType;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.p3114c.C61550d;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.p3151p.C62614c;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.LocalShareEvent;
import com.ss.android.vc.statistics.event.MeetingShareScreenEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001MB\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\n\b\u0000\u0010\u0012*\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u000eH\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\b\u0010*\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0016J$\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u001c2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00105\u001a\u00020\"H\u0016J\b\u00106\u001a\u00020\"H\u0016J\u0018\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0016J\b\u0010:\u001a\u00020\"H\u0014J\b\u0010;\u001a\u00020\"H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u001a\u0010>\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u000eH\u0002J\u0018\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u000eH\u0002J\u0006\u0010E\u001a\u00020\"J\b\u0010F\u001a\u00020\"H\u0016J\b\u0010G\u001a\u00020\"H\u0016J\b\u0010H\u001a\u00020\"H\u0016J\b\u0010I\u001a\u00020\u000eH\u0016J\b\u0010J\u001a\u00020\"H\u0002J\b\u0010K\u001a\u00020\"H\u0002J\b\u0010L\u001a\u00020\"H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/MeetingShareFragment;", "Lcom/ss/android/vc/meeting/module/base/MeetingFragment;", "Lcom/ss/android/vc/meeting/module/fastentry/IVideoChatFastEntry;", "Lcom/ss/android/vc/meeting/module/sharebox/AbsShareBoxControl$IShareBoxListener;", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "Lcom/ss/android/vc/meeting/module/base/IFragmentBackHandler;", "()V", "busyRingViewControl", "Lcom/ss/android/vc/meeting/module/busyring/BusyRingViewControl;", "connViewControl", "Lcom/ss/android/vc/meeting/module/connectloading/ConnectLoadingViewControl;", "mBusyRingingContainer", "Landroid/widget/FrameLayout;", "mIsFromFloat", "", "rootView", "Landroid/view/View;", "findViewById", "T", "id", "", "(I)Landroid/view/View;", "getActivityContext", "Landroid/app/Activity;", "getInMeetingPresenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "getNoticeContainer", "getRootContainer", "Landroid/view/ViewGroup;", "getVcContext", "Landroid/content/Context;", "getVcMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "gone", "", "initShareAudioView", "initViews", "view", "isFollowPage", "isFragmentAdded", "isFromFloat", "isSharingPage", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView_", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onCreate_", "onDestroyView_", "onDestroy_", "onOrientation", "isLandscape", "isRotate", "onPreDraw_", "onResume_", "onStart_", "onStop_", "onViewCreated_", "sendShareDeviceAudioEvent", "shareAudioEnable", "setNeedShareAudio", "shareScreenControl", "Lcom/ss/android/vc/meeting/module/sharescreen/AbsShareScreenControl;", "needShareAudio", "showFloatWindowForBack2App", "showLoading", "showPrepareToSharePage", "showStopSharePage", "tryShowFloatWindow", "visibleLoading", "visibleStartShare", "visibleStopShare", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.n */
public class MeetingShareFragment extends C61434m implements AbstractC61428h, AbstractC61429i, AbstractC61661d, AbstractC63022a.AbstractC63023a {

    /* renamed from: a */
    public static final Companion f158891a = new Companion(null);

    /* renamed from: b */
    private View f158892b;

    /* renamed from: c */
    private C61550d f158893c;

    /* renamed from: d */
    private C61544d f158894d;

    /* renamed from: e */
    private boolean f158895e;

    /* renamed from: f */
    private FrameLayout f158896f;

    /* renamed from: g */
    private HashMap f158897g;

    /* renamed from: E */
    public void mo217859E() {
        HashMap hashMap = this.f158897g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public View mo217863c(int i) {
        if (this.f158897g == null) {
            this.f158897g = new HashMap();
        }
        View view = (View) this.f158897g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f158897g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: e */
    public FrameLayout mo212920e() {
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: h */
    public boolean mo212923h() {
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: i */
    public boolean mo212924i() {
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: j */
    public InMeetingPresenter mo212925j() {
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo217859E();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$Companion;", "", "()V", "KEY_IS_FROM_FLOAT", "", "TAG", "newInstance", "Lcom/ss/android/vc/meeting/module/sharebox/MeetingShareFragment;", "isFromFloat", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MeetingShareFragment mo217868a(boolean z) {
            MeetingShareFragment nVar = new MeetingShareFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_is_from_float", z);
            nVar.setArguments(bundle);
            return nVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: g */
    public boolean mo212922g() {
        return this.f158895e;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: l */
    public void mo212933l() {
        super.mo212933l();
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: o */
    public void mo212936o() {
        super.mo212936o();
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: p */
    public void mo212937p() {
        super.mo212937p();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$d */
    public static final class RunnableC63046d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158900a;

        RunnableC63046d(MeetingShareFragment nVar) {
            this.f158900a = nVar;
        }

        public final void run() {
            this.f158900a.mo217866u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$e */
    static final class RunnableC63047e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158901a;

        RunnableC63047e(MeetingShareFragment nVar) {
            this.f158901a = nVar;
        }

        public final void run() {
            this.f158901a.mo217864s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$f */
    static final class RunnableC63048f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158902a;

        RunnableC63048f(MeetingShareFragment nVar) {
            this.f158902a = nVar;
        }

        public final void run() {
            this.f158902a.mo217865t();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: a */
    public Context mo212916a() {
        return getContext();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: b */
    public Activity mo212918b() {
        return getActivity();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: k */
    public boolean mo212926k() {
        return isAdded();
    }

    /* renamed from: D */
    public void mo217858D() {
        C60735ab.m236001a(new RunnableC63046d(this));
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a.AbstractC63023a
    public void bZ_() {
        C60735ab.m236001a(new RunnableC63047e(this));
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: d */
    public ViewGroup mo212919d() {
        View view = this.f158892b;
        if (view != null) {
            return (ViewGroup) view;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: f */
    public C61303k mo212921f() {
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        return w;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a.AbstractC63023a
    /* renamed from: r */
    public void mo217762r() {
        C60735ab.m236001a(new RunnableC63048f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$showFloatWindowForBack2App$1", "Lcom/ss/android/vc/common/utils/AbsAsyncVcTask;", "", "doInBackground", "()Ljava/lang/Boolean;", "onPostExecute", "", "result", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$c */
    public static final class C63045c extends AbstractC60728a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158899a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Boolean mo208348a() {
            Context context;
            FragmentActivity activity = this.f158899a.getActivity();
            if (activity != null) {
                context = activity.getApplicationContext();
            } else {
                context = null;
            }
            return Boolean.valueOf(C28460b.m104296a(context));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63045c(MeetingShareFragment nVar) {
            this.f158899a = nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.vc.common.p3083e.AbstractC60728a
        /* renamed from: b */
        public /* synthetic */ void mo208351b(Boolean bool) {
            mo217871a(bool.booleanValue());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo217871a(boolean z) {
            super.mo208351b(Boolean.valueOf(z));
            if (z) {
                C63693e.m249682a("lobby");
                C61303k w = this.f158899a.mo212965w();
                Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
                w.ae().mo213805a(0, FloatWindowLaunchType.BACK2FRONT);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: C */
    public void mo212962C() {
        super.mo212962C();
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        VideoChat e = w.mo212056e();
        C61303k w2 = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
        LocalShareEvent.m249997b(e, w2.mo212093K());
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: m */
    public void mo212934m() {
        super.mo212934m();
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.au().mo213267a();
    }

    /* renamed from: v */
    public final void mo217867v() {
        C60700b.m235851b("MeetingShareFragment", "[showFloatWindowForBack2App]", "showFloatWindowForBack2App");
        C60735ab.m235996a(new C63045c(this));
    }

    @Override // com.ss.android.vc.meeting.module.fastentry.AbstractC61661d
    public boolean bx_() {
        if (!C28460b.m104296a(getActivity())) {
            return false;
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.ae().mo213805a(0, FloatWindowLaunchType.NORMAL);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: q */
    public void mo212938q() {
        super.mo212938q();
        AbstractC61417a x = mo212966x();
        Intrinsics.checkExpressionValueIsNotNull(x, "meetingControl");
        x.mo212835n().mo217755b(this);
        C61550d dVar = this.f158893c;
        if (dVar != null) {
            dVar.destroy();
        }
        C61544d dVar2 = this.f158894d;
        if (dVar2 != null) {
            dVar2.destroy();
        }
    }

    /* renamed from: u */
    public final void mo217866u() {
        LinearLayout linearLayout = (LinearLayout) mo217863c(R.id.view_loading);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        View c = mo217863c(R.id.iv_content_view);
        if (c != null) {
            c.setVisibility(8);
        }
        IconFontView iconFontView = (IconFontView) mo217863c(R.id.box_share_back);
        if (iconFontView != null) {
            iconFontView.setVisibility(8);
        }
        IconFontView iconFontView2 = (IconFontView) mo217863c(R.id.box_share_close);
        if (iconFontView2 != null) {
            iconFontView2.setVisibility(8);
        }
    }

    /* renamed from: F */
    private final void m246921F() {
        boolean z;
        AbstractC62612a aj;
        int i;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 29 || !C62614c.m244945q()) {
            z = false;
        } else {
            z = true;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo217863c(R.id.audio_share_layout);
        if (constraintLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            constraintLayout.setVisibility(i);
        }
        UDSwitch uDSwitch = (UDSwitch) mo217863c(R.id.audio_share_switch);
        if (uDSwitch != null) {
            C61303k w = mo212965w();
            if (w == null || (aj = w.aj()) == null || !aj.mo216422l()) {
                z2 = false;
            }
            uDSwitch.setChecked(z2);
            uDSwitch.setOnCheckedChangeListener(new C63043b(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61428h
    /* renamed from: c */
    public boolean mo212915c() {
        C60700b.m235851b("MeetingShareFragment", "[onClick3]", "on back pressed");
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        AbstractC63022a ak = w.ak();
        Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
        if (ak.mo217754a()) {
            IconFontView iconFontView = (IconFontView) mo217863c(R.id.box_share_back);
            if (iconFontView == null) {
                return true;
            }
            iconFontView.performClick();
            return true;
        }
        IconFontView iconFontView2 = (IconFontView) mo217863c(R.id.box_share_close);
        if (iconFontView2 == null) {
            return true;
        }
        iconFontView2.performClick();
        return true;
    }

    /* renamed from: s */
    public final void mo217864s() {
        LinearLayout linearLayout = (LinearLayout) mo217863c(R.id.view_loading);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View c = mo217863c(R.id.iv_content_view);
        if (c != null) {
            c.setVisibility(0);
        }
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo217863c(R.id.lt_stop_text);
        if (lineHeightTextView != null) {
            lineHeightTextView.setVisibility(8);
        }
        TextView textView = (TextView) mo217863c(R.id.tv_stop_share);
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) mo217863c(R.id.tv_start_share);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        LineHeightTextView lineHeightTextView2 = (LineHeightTextView) mo217863c(R.id.lt_not_share_text);
        if (lineHeightTextView2 != null) {
            lineHeightTextView2.setVisibility(0);
        }
        IconFontView iconFontView = (IconFontView) mo217863c(R.id.box_share_back);
        if (iconFontView != null) {
            iconFontView.setVisibility(8);
        }
        IconFontView iconFontView2 = (IconFontView) mo217863c(R.id.box_share_close);
        if (iconFontView2 != null) {
            iconFontView2.setVisibility(0);
        }
        IconFontView iconFontView3 = (IconFontView) mo217863c(R.id.box_share_close);
        if (iconFontView3 != null) {
            iconFontView3.setOnClickListener(new C63049g(this));
        }
        TextView textView3 = (TextView) mo217863c(R.id.tv_start_share);
        if (textView3 != null) {
            textView3.setOnClickListener(new C63050h(this));
        }
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        AbstractC63022a ak = w.ak();
        Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
        if (ak.mo217757c()) {
            C61303k w2 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            w2.ak().mo217758d();
            C61303k w3 = mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            AbstractC63022a ak2 = w3.ak();
            Intrinsics.checkExpressionValueIsNotNull(ak2, "meeting.shareBoxControl");
            ak2.mo217753a(false);
        }
    }

    /* renamed from: t */
    public final void mo217865t() {
        LinearLayout linearLayout = (LinearLayout) mo217863c(R.id.view_loading);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View c = mo217863c(R.id.iv_content_view);
        if (c != null) {
            c.setVisibility(0);
        }
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo217863c(R.id.lt_stop_text);
        if (lineHeightTextView != null) {
            lineHeightTextView.setVisibility(0);
        }
        TextView textView = (TextView) mo217863c(R.id.tv_stop_share);
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) mo217863c(R.id.tv_start_share);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        LineHeightTextView lineHeightTextView2 = (LineHeightTextView) mo217863c(R.id.lt_not_share_text);
        if (lineHeightTextView2 != null) {
            lineHeightTextView2.setVisibility(8);
        }
        IconFontView iconFontView = (IconFontView) mo217863c(R.id.box_share_back);
        if (iconFontView != null) {
            iconFontView.setVisibility(0);
        }
        IconFontView iconFontView2 = (IconFontView) mo217863c(R.id.box_share_close);
        if (iconFontView2 != null) {
            iconFontView2.setVisibility(8);
        }
        IconFontView iconFontView3 = (IconFontView) mo217863c(R.id.box_share_back);
        if (iconFontView3 != null) {
            iconFontView3.setOnClickListener(new C63051i(this));
        }
        TextView textView3 = (TextView) mo217863c(R.id.tv_stop_share);
        if (textView3 != null) {
            textView3.setOnClickListener(new C63052j(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$visibleStartShare$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$g */
    public static final class C63049g extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158903a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63049g(MeetingShareFragment nVar) {
            this.f158903a = nVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            AbstractC63441a ah;
            C61303k w = this.f158903a.mo212965w();
            if (!(w == null || (ah = w.ah()) == null)) {
                ah.mo219482b();
            }
            C61303k w2 = this.f158903a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            VideoChat e = w2.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            C61303k w3 = this.f158903a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            LocalShareEvent.m249998b("leave_before_start_broadcast", e, w3.mo212093K());
            C61303k w4 = this.f158903a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            VideoChat e2 = w4.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
            C61303k w5 = this.f158903a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            LocalShareEvent.m249994a("leave_before_start_broadcast", e2, w5.mo212093K());
            MeetingShareScreenEvent a = MeetingShareScreenEvent.f160896b.mo220396a();
            C61303k w6 = this.f158903a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
            VideoChat e3 = w6.mo212056e();
            C61303k w7 = this.f158903a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
            a.mo220395a("close", "none", e3, w7.mo212093K());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$visibleStartShare$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$h */
    public static final class C63050h extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158904a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63050h(MeetingShareFragment nVar) {
            this.f158904a = nVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b("MeetingShareFragment", "[onClick]", "click to start share");
            this.f158904a.mo217858D();
            C61303k w = this.f158904a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            w.ak().mo217758d();
            C61303k w2 = this.f158904a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            VideoChat e = w2.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            C61303k w3 = this.f158904a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            LocalShareEvent.m249998b("start_broadcast", e, w3.mo212093K());
            MeetingShareScreenEvent a = MeetingShareScreenEvent.f160896b.mo220396a();
            C61303k w4 = this.f158904a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            VideoChat e2 = w4.mo212056e();
            C61303k w5 = this.f158904a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            a.mo220395a("start_sharing", "none", e2, w5.mo212093K());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$visibleStopShare$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$i */
    public static final class C63051i extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158905a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63051i(MeetingShareFragment nVar) {
            this.f158905a = nVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            AbstractC63441a ah;
            C61303k w = this.f158905a.mo212965w();
            if (!(w == null || (ah = w.ah()) == null)) {
                ah.mo219483b(VCAppLifeCycle.m236256c());
            }
            C61303k w2 = this.f158905a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            VideoChat e = w2.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            C61303k w3 = this.f158905a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            LocalShareEvent.m249998b("minimize", e, w3.mo212093K());
            MeetingShareScreenEvent a = MeetingShareScreenEvent.f160896b.mo220396a();
            C61303k w4 = this.f158905a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            VideoChat e2 = w4.mo212056e();
            C61303k w5 = this.f158905a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            a.mo220395a("minimize", "none", e2, w5.mo212093K());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$visibleStopShare$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$j */
    public static final class C63052j extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158906a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63052j(MeetingShareFragment nVar) {
            this.f158906a = nVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b("MeetingShareFragment", "[onClick2]", "click to stop share");
            C61303k w = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
            w.ak().mo217759e();
            C61303k w2 = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w2, "meeting");
            VideoChat e = w2.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            C61303k w3 = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w3, "meeting");
            LocalShareEvent.m249998b("stop_sharing", e, w3.mo212093K());
            C61303k w4 = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w4, "meeting");
            VideoChat e2 = w4.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
            C61303k w5 = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w5, "meeting");
            LocalShareEvent.m249994a("finish_share_screen", e2, w5.mo212093K());
            MeetingShareScreenEvent a = MeetingShareScreenEvent.f160896b.mo220396a();
            C61303k w6 = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w6, "meeting");
            VideoChat e3 = w6.mo212056e();
            C61303k w7 = this.f158906a.mo212965w();
            Intrinsics.checkExpressionValueIsNotNull(w7, "meeting");
            a.mo220395a("stop_sharing", "none", e3, w7.mo212093K());
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61429i
    /* renamed from: a */
    public <T extends View> T mo212917a(int i) {
        View view = this.f158892b;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        mo217862a(z, true);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212927a(Bundle bundle) {
        super.mo212927a(bundle);
        AbstractC61417a x = mo212966x();
        Intrinsics.checkExpressionValueIsNotNull(x, "meetingControl");
        x.mo212835n().mo217752a(this);
        AbstractC61417a x2 = mo212966x();
        Intrinsics.checkExpressionValueIsNotNull(x2, "meetingControl");
        x2.mo212834m().mo216400a(getActivity());
    }

    /* renamed from: a */
    private final void m246922a(View view) {
        FrameLayout frameLayout;
        StringBuilder sb = new StringBuilder();
        sb.append("isSharing= ");
        AbstractC61417a x = mo212966x();
        Intrinsics.checkExpressionValueIsNotNull(x, "meetingControl");
        AbstractC62612a m = x.mo212834m();
        Intrinsics.checkExpressionValueIsNotNull(m, "meetingControl.shareScreenControl");
        sb.append(m.mo216408a());
        C60700b.m235851b("MeetingShareFragment", "[initViews]", sb.toString());
        m246921F();
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        AbstractC63022a ak = w.ak();
        Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
        if (ak.mo217754a()) {
            mo217865t();
        } else {
            mo217864s();
        }
        View view2 = this.f158892b;
        if (view2 != null) {
            frameLayout = (FrameLayout) view2.findViewById(R.id.busy_ringing_layout);
        } else {
            frameLayout = null;
        }
        this.f158896f = frameLayout;
        MeetingShareFragment nVar = this;
        this.f158893c = new C61550d(nVar);
        this.f158894d = new C61544d(nVar, this.f158896f);
    }

    /* renamed from: a */
    public final void mo217861a(boolean z) {
        VideoChat videoChat;
        if (Build.VERSION.SDK_INT >= 29) {
            C61303k w = mo212965w();
            if (w != null) {
                videoChat = w.mo212056e();
            } else {
                videoChat = null;
            }
            C63742at.m250065a(videoChat, z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "com/ss/android/vc/meeting/module/sharebox/MeetingShareFragment$initShareAudioView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.n$b */
    public static final class C63043b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ MeetingShareFragment f158898a;

        C63043b(MeetingShareFragment nVar) {
            this.f158898a = nVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r3 = r3.mo212834m();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCheckedChanged(android.widget.CompoundButton r3, final boolean r4) {
            /*
                r2 = this;
                com.ss.android.vc.meeting.module.sharebox.n r3 = r2.f158898a
                com.ss.android.vc.meeting.framework.meeting.k r3 = r3.mo212965w()
                if (r3 == 0) goto L_0x0031
                com.ss.android.vc.meeting.module.base.a r3 = r3.mo212105W()
                if (r3 == 0) goto L_0x0031
                com.ss.android.vc.meeting.module.p.a r3 = r3.mo212834m()
                if (r3 == 0) goto L_0x0031
                kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
                r0.<init>()
                r0.element = r4
                if (r4 == 0) goto L_0x0028
                com.ss.android.vc.meeting.module.sharebox.n$b$1 r1 = new com.ss.android.vc.meeting.module.sharebox.n$b$1
                r1.<init>(r3, r0, r2, r4)
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                r3.mo216405a(r1)
                goto L_0x0031
            L_0x0028:
                r3.mo216420j()
                com.ss.android.vc.meeting.module.sharebox.n r4 = r2.f158898a
                r0 = 0
                r4.mo217860a(r3, r0)
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sharebox.MeetingShareFragment.C63043b.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    public void a_(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a_(view, bundle);
        this.f158892b = view;
        m246922a(view);
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        Boolean E = w.mo212092J().mo212508E();
        if (E != null) {
            MeetingAudioManager.m239471k().mo212702f(!E.booleanValue());
        }
    }

    /* renamed from: a */
    public final void mo217860a(AbstractC62612a aVar, boolean z) {
        aVar.mo216413c(z);
        UDSwitch uDSwitch = (UDSwitch) mo217863c(R.id.audio_share_switch);
        if (uDSwitch != null) {
            uDSwitch.setChecked(z);
        }
    }

    /* renamed from: a */
    public void mo217862a(boolean z, boolean z2) {
        C61303k w = mo212965w();
        Intrinsics.checkExpressionValueIsNotNull(w, "meeting");
        w.aj().mo216406a(z);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public View mo212879a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C60700b.m235851b("MeetingShareFragment", "[onCreateView_]", "onCreateView_");
        View inflate = layoutInflater.inflate(R.layout.vc_share_box_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…layout, container, false)");
        return inflate;
    }
}
