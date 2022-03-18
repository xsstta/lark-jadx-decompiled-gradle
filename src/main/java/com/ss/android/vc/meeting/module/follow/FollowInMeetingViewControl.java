package com.ss.android.vc.meeting.module.follow;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/FollowInMeetingViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/follow/IFollowInMeetingViewControl;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "TAG", "", "followOnGoingContainer", "Landroid/view/View;", "followTitle", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "isClicked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "openFollowLinkBtn", "destroy", "", "goneBanner", "initIfNotInflated", "onInMeetingInfoUpdate", "followInfo", "Lcom/ss/android/vc/entity/follow/FollowInfo;", "onPageTitleChanged", "title", "onRequestOpenLink", "url", "showFollowNotSupportDialog", "updateFollowTitle", "updateTipsView", "visibleBanner", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.follow.c */
public final class FollowInMeetingViewControl extends AbstractC61424d implements AbstractC61807d {

    /* renamed from: a */
    public LineHeightTextView f155073a;

    /* renamed from: b */
    public final String f155074b = "FollowInMeetingViewControl@";

    /* renamed from: c */
    private View f155075c;

    /* renamed from: d */
    private LineHeightTextView f155076d;

    /* renamed from: e */
    private final AtomicBoolean f155077e = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.c$b */
    static final class DialogInterface$OnClickListenerC61788b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC61788b f155080a = new DialogInterface$OnClickListenerC61788b();

        DialogInterface$OnClickListenerC61788b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.c$a */
    static final class RunnableC61787a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FollowInMeetingViewControl f155078a;

        /* renamed from: b */
        final /* synthetic */ FollowInfo f155079b;

        RunnableC61787a(FollowInMeetingViewControl cVar, FollowInfo followInfo) {
            this.f155078a = cVar;
            this.f155079b = followInfo;
        }

        public final void run() {
            this.f155078a.mo214055a(this.f155079b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/follow/FollowInMeetingViewControl$updateTipsView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.c$d */
    public static final class C61790d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowInMeetingViewControl f155083a;

        /* renamed from: b */
        final /* synthetic */ FollowInfo f155084b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/follow/FollowInMeetingViewControl$updateTipsView$1$onSingleClick$1", "Lcom/ss/android/vc/common/utils/AbsAsyncVcTask;", "", "doInBackground", "()Ljava/lang/Boolean;", "onPostExecute", "", "result", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.follow.c$d$a */
        public static final class C61791a extends AbstractC60728a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C61790d f155085a;

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public Boolean mo208348a() {
                return Boolean.valueOf(C28460b.m104296a(this.f155085a.f155083a.getContext()));
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C61791a(C61790d dVar) {
                this.f155085a = dVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.vc.common.p3083e.AbstractC60728a
            /* renamed from: b */
            public /* synthetic */ void mo208351b(Boolean bool) {
                mo214061a(bool.booleanValue());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo214061a(boolean z) {
                super.mo208351b(Boolean.valueOf(z));
                if (z) {
                    VideoChatModuleDependency.getBrowserDependency().openUrlBrowser(this.f155085a.f155083a.getActivity(), this.f155085a.f155084b.getUrl());
                }
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C60700b.m235851b(this.f155083a.f155074b, "[updateBanner2]", "click open banner button");
            C60735ab.m235996a(new C61791a(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61790d(FollowInMeetingViewControl cVar, FollowInfo followInfo, long j) {
            super(j);
            this.f155083a = cVar;
            this.f155084b = followInfo;
        }
    }

    /* renamed from: b */
    private final void m241397b() {
        C60700b.m235851b(this.f155074b, "[visibleBanner]", "set visible");
        m241400d();
        View view = this.f155075c;
        if (view != null) {
            C60752f.m236079a(view);
        }
    }

    /* renamed from: c */
    private final void m241399c() {
        C60700b.m235851b(this.f155074b, "[goneBanner]", "set gone");
        View view = this.f155075c;
        if (view != null) {
            C60752f.m236083c(view);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61807d, com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b(this.f155074b, "[destroy]", "destroy");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ab().mo213869b(this);
        super.destroy();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61807d
    /* renamed from: a */
    public void mo214054a() {
        C60700b.m235851b(this.f155074b, "[showFollowNotSupportDialog]", "show dialog");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        VCDialogUtils.m236181a(context, (int) R.string.View_VM_CanNotFollowDueToDeviceRestrictions, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC61788b.f155080a, false);
    }

    /* renamed from: d */
    private final void m241400d() {
        FrameLayout frameLayout;
        Context context;
        LineHeightTextView lineHeightTextView;
        LineHeightTextView lineHeightTextView2;
        ViewParent viewParent = null;
        if (this.f155075c == null) {
            ViewGroup rootView = getRootView();
            if (rootView != null) {
                context = rootView.getContext();
            } else {
                context = null;
            }
            View a = C60748b.m236068a(context, R.layout.follow_ongoing_banner_layout, null, false);
            this.f155075c = a;
            if (a != null) {
                lineHeightTextView = (LineHeightTextView) a.findViewById(R.id.follow_ongoing_banner_btn);
            } else {
                lineHeightTextView = null;
            }
            this.f155076d = lineHeightTextView;
            View view = this.f155075c;
            if (view != null) {
                lineHeightTextView2 = (LineHeightTextView) view.findViewById(R.id.follow_ongoing_banner_title);
            } else {
                lineHeightTextView2 = null;
            }
            this.f155073a = lineHeightTextView2;
        }
        ViewGroup rootView2 = getRootView();
        if (rootView2 != null) {
            frameLayout = (FrameLayout) rootView2.findViewById(R.id.container_share_toolbar);
        } else {
            frameLayout = null;
        }
        View view2 = this.f155075c;
        if (view2 != null) {
            viewParent = view2.getParent();
        }
        if (!Intrinsics.areEqual(viewParent, frameLayout)) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f155075c, new FrameLayout.LayoutParams(-1, -2));
            }
        }
        if (frameLayout != null) {
            C60752f.m236079a((View) frameLayout);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61807d
    /* renamed from: a */
    public void mo214056a(String str) {
        m241398b(str);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61807d
    /* renamed from: b */
    public void mo214058b(FollowInfo followInfo) {
        C26171w.m94675a(new RunnableC61787a(this, followInfo));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "onGetUserInfo"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.c$c */
    public static final class C61789c implements GetUserInfoListener {

        /* renamed from: a */
        final /* synthetic */ FollowInMeetingViewControl f155081a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f155082b;

        C61789c(FollowInMeetingViewControl cVar, Ref.ObjectRef objectRef) {
            this.f155081a = cVar;
            this.f155082b = objectRef;
        }

        @Override // com.ss.android.vc.net.service.GetUserInfoListener
        public final void onGetUserInfo(VideoChatUser videoChatUser) {
            Intrinsics.checkParameterIsNotNull(videoChatUser, "user");
            LineHeightTextView lineHeightTextView = this.f155081a.f155073a;
            if (lineHeightTextView != null) {
                lineHeightTextView.setText(UIHelper.mustacheFormat((int) R.string.View_VM_NameIsSharing, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())).toString() + ((String) this.f155082b.element));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowInMeetingViewControl(AbstractC61429i iVar) {
        super(iVar);
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC61751a ab = meeting.ab();
        if (ab != null) {
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            meeting2.ab().mo213860a(this);
            if (!FollowConfig.m241446b()) {
                mo214055a(ab.mo213882h());
            }
        }
    }

    /* renamed from: b */
    private final void m241398b(String str) {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        AbstractC61751a ab = meeting.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "meeting.followControl");
        FollowInfo h = ab.mo213882h();
        if (h == null) {
            C60700b.m235851b(this.f155074b, "[updateFollowTitle]", "followInfo is empty");
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        if (TextUtils.isEmpty(str)) {
            objectRef.element = TextUtils.isEmpty(h.getDocTitle()) ? (T) h.getUrl() : (T) h.getDocTitle();
        }
        C60700b.m235851b(this.f155074b, "[updateFollowTitle2]", "new title");
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        UserInfoService.getUserInfoById(meeting2.mo212055d(), h.getUserId(), h.getUserType(), new C61789c(this, objectRef));
    }

    /* renamed from: a */
    public final void mo214055a(FollowInfo followInfo) {
        C60700b.m235851b(this.f155074b, "[updateTipsView]", "update");
        if (followInfo == null || TextUtils.isEmpty(followInfo.getUrl())) {
            m241399c();
            return;
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ab().mo213894t();
        m241397b();
        m241398b((String) null);
        LineHeightTextView lineHeightTextView = this.f155076d;
        if (lineHeightTextView != null) {
            lineHeightTextView.setText(R.string.View_VM_OpenLink);
        }
        LineHeightTextView lineHeightTextView2 = this.f155076d;
        if (lineHeightTextView2 != null) {
            lineHeightTextView2.setOnClickListener(new C61790d(this, followInfo, 1000));
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61807d
    /* renamed from: a */
    public void mo214057a(String str, String str2) {
        m241398b(str2);
    }
}
