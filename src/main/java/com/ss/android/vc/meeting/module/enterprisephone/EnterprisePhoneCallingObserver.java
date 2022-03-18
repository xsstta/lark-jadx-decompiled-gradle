package com.ss.android.vc.meeting.module.enterprisephone;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60749c;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCEnterprisePhoneNotify;
import com.ss.android.vc.entity.response.C60970c;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.p3155q.C62784b;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\u001a\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u00102\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020(2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020(2\u0006\u00106\u001a\u000207H\u0016J\b\u00109\u001a\u00020(H\u0002J\u0010\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020\u001bH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0006R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneCallingObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ss/android/vc/net/push/VideoChatPush$IPushVCEnterprisePhoneListener;", "Lcom/ss/android/vc/meeting/module/telephone/VCCallingStateListener$OnCallStateChangedListener;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "blurBackgroundView", "Landroid/widget/ImageView;", "blurFrontView", "Landroid/view/View;", "callingCancelTextView", "Landroid/widget/TextView;", "callingCancelView", "callingStateListener", "Lcom/ss/android/vc/meeting/module/telephone/VCCallingStateListener;", "chatId", "", "chatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "closeEnterprisePhoneCalling", "Ljava/lang/Runnable;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "inviteTipsView", "isCancelClicked", "", "mRootView", "phoneId", "phoneNumber", "thumbnailView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", ShareHitPoint.f121869d, "userAvatarContainer", "userAvatarView", "usernameView", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, "", "cancelEnterpriseCall", "", "cancelEnterprisePhoneCall", "initAvatarAndBackground", "initAvatarContainerPosition", "initBottomViews", "initPreviewAndUserInfoViews", "onCallStateChanged", "state", "", "number", "onPushVCEnterprisePhone", "enterprisePhoneNotify", "Lcom/ss/android/vc/entity/VCEnterprisePhoneNotify;", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "removeFragmentOrFinishActivity", "showStatusBar", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class EnterprisePhoneCallingObserver implements DefaultLifecycleObserver, C62784b.AbstractC62785a, VideoChatPush.AbstractC63574n {

    /* renamed from: d */
    public static final Companion f154553d = new Companion(null);

    /* renamed from: a */
    public ImageView f154554a;

    /* renamed from: b */
    public OpenChatter f154555b;

    /* renamed from: c */
    public C62784b f154556c;

    /* renamed from: e */
    private View f154557e;

    /* renamed from: f */
    private View f154558f;

    /* renamed from: g */
    private LKUIRoundedImageView f154559g;

    /* renamed from: h */
    private TextView f154560h;

    /* renamed from: i */
    private View f154561i;

    /* renamed from: j */
    private View f154562j;

    /* renamed from: k */
    private TextView f154563k;

    /* renamed from: l */
    private ImageView f154564l;

    /* renamed from: m */
    private TextView f154565m;

    /* renamed from: n */
    private String f154566n = "";

    /* renamed from: o */
    private String f154567o = "";

    /* renamed from: p */
    private String f154568p = "";

    /* renamed from: q */
    private boolean f154569q;

    /* renamed from: r */
    private String f154570r = "";

    /* renamed from: s */
    private long f154571s;

    /* renamed from: t */
    private Runnable f154572t;

    /* renamed from: u */
    private Fragment f154573u;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onCreate(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onDestroy(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onPause(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onResume(this, lifecycleOwner);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneCallingObserver$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneCallingObserver$cancelEnterpriseCall$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CancelEnterprisePhoneEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$b */
    public static final class C61610b implements AbstractC63598b<C60970c> {
        C61610b() {
        }

        /* renamed from: a */
        public void onSuccess(C60970c cVar) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[cancelEnterpriseCall2]", "onSuccess:" + cVar);
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[cancelEnterpriseCall3]", "onError:" + eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$c */
    static final class RunnableC61611c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154575a;

        RunnableC61611c(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154575a = enterprisePhoneCallingObserver;
        }

        public final void run() {
            this.f154575a.mo213485b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$h */
    static final class RunnableC61616h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154580a;

        RunnableC61616h(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154580a = enterprisePhoneCallingObserver;
        }

        public final void run() {
            C62784b bVar = this.f154580a.f154556c;
            if (bVar != null) {
                bVar.mo216828a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$i */
    static final class RunnableC61617i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154581a;

        RunnableC61617i(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154581a = enterprisePhoneCallingObserver;
        }

        public final void run() {
            C62784b bVar = this.f154581a.f154556c;
            if (bVar != null) {
                bVar.mo216830b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneCallingObserver$initAvatarAndBackground$2", "Lcom/ss/android/vc/common/utils/AbsAsyncVcTask;", "Landroid/graphics/Bitmap;", "doInBackground", "onPostExecute", "", "result", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$e */
    public static final class C61613e extends AbstractC60728a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154577a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Bitmap mo208348a() {
            Bitmap a = C60783v.m236225a("", "", ParticipantType.UNKNOWN, SmEvents.EVENT_NO, SmEvents.EVENT_NO);
            if (a != null) {
                return C60749c.m236070a(a, 5, 5);
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61613e(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154577a = enterprisePhoneCallingObserver;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo208351b(Bitmap bitmap) {
            ImageView imageView;
            super.mo208351b(bitmap);
            if (bitmap != null && (imageView = this.f154577a.f154554a) != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: c */
    private final void m240553c() {
        ImageView imageView = this.f154564l;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC61614f(this));
        }
        TextView textView = this.f154565m;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC61615g(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneCallingObserver$initAvatarAndBackground$1", "Lcom/ss/android/vc/common/utils/AbsAsyncVcTask;", "Landroid/graphics/Bitmap;", "doInBackground", "onPostExecute", "", "result", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$d */
    public static final class C61612d extends AbstractC60728a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154576a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Bitmap mo208348a() {
            String str;
            String str2;
            OpenChatter openChatter = this.f154576a.f154555b;
            if (openChatter != null) {
                str = openChatter.getAvatarKey();
            } else {
                str = null;
            }
            OpenChatter openChatter2 = this.f154576a.f154555b;
            if (openChatter2 != null) {
                str2 = openChatter2.getId();
            } else {
                str2 = null;
            }
            Bitmap a = C60783v.m236225a(str, str2, ParticipantType.LARK_USER, SmEvents.EVENT_NO, SmEvents.EVENT_NO);
            if (a != null) {
                return C60749c.m236070a(a, 5, 5);
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61612d(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154576a = enterprisePhoneCallingObserver;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo208351b(Bitmap bitmap) {
            ImageView imageView;
            super.mo208351b(bitmap);
            if (bitmap != null && (imageView = this.f154576a.f154554a) != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: d */
    private final void m240554d() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[cancelEnterpriseCall]", "phoneId:" + this.f154567o);
        VcBizSender.m249231b(this.f154567o, this.f154566n).mo219893b(new C61610b());
    }

    /* renamed from: g */
    private final void m240557g() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f154562j;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (!DesktopUtil.m144307b()) {
            float dimension = this.f154573u.getResources().getDimension(R.dimen.ringing_bottom_btns_height);
            float dimension2 = this.f154573u.getResources().getDimension(R.dimen.cr_avatar_container_height);
            if (layoutParams2 != null) {
                layoutParams2.topMargin = (int) (((((float) C60776r.m236144b()) - dimension) - dimension2) / ((float) 2));
                return;
            }
            return;
        }
        if (layoutParams2 != null) {
            layoutParams2.topMargin = 0;
        }
        if (layoutParams2 != null) {
            layoutParams2.addRule(15);
        }
    }

    /* renamed from: a */
    public final void mo213482a() {
        View findViewById;
        View findViewById2;
        if (!this.f154569q) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[cancelEnterpriseCallAndClosePage]", "click");
            m240554d();
            this.f154569q = true;
            View view = this.f154557e;
            if (view != null) {
                view.setEnabled(false);
            }
            View view2 = this.f154557e;
            if (view2 != null) {
                view2.setClickable(false);
            }
            View view3 = this.f154557e;
            if (!(view3 == null || (findViewById2 = view3.findViewById(R.id.calling_cancel_text)) == null)) {
                findViewById2.setEnabled(false);
            }
            View view4 = this.f154557e;
            if (!(view4 == null || (findViewById = view4.findViewById(R.id.calling_cancel)) == null)) {
                findViewById.setEnabled(false);
            }
            mo213485b();
        }
    }

    /* renamed from: b */
    public final void mo213485b() {
        FragmentActivity activity;
        if (C57782ag.m224242a(this.f154570r, "fragment_type_normal_calling")) {
            FragmentActivity activity2 = this.f154573u.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        } else if (C57782ag.m224242a(this.f154570r, "fragment_type_dial_calling")) {
            if (this.f154573u.isAdded() && (activity = this.f154573u.getActivity()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                activity.getSupportFragmentManager().beginTransaction().remove(this.f154573u).commitAllowingStateLoss();
            }
        } else if (C57782ag.m224242a(this.f154570r, "fragment_type_phone_calling")) {
            FragmentActivity activity3 = this.f154573u.getActivity();
            if (activity3 != null) {
                activity3.finish();
            }
        } else {
            FragmentActivity activity4 = this.f154573u.getActivity();
            if (activity4 != null) {
                activity4.finish();
            }
        }
    }

    /* renamed from: e */
    private final void m240555e() {
        ImageView imageView;
        View view;
        LKUIRoundedImageView lKUIRoundedImageView;
        TextView textView;
        View view2;
        View view3;
        ImageView imageView2;
        TextView textView2;
        String str;
        View view4 = this.f154557e;
        TextView textView3 = null;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.calling_ringing_blurImage);
        } else {
            imageView = null;
        }
        this.f154554a = imageView;
        View view5 = this.f154557e;
        if (view5 != null) {
            view = view5.findViewById(R.id.calling_ringing_blurImageFg);
        } else {
            view = null;
        }
        this.f154558f = view;
        View view6 = this.f154557e;
        if (view6 != null) {
            lKUIRoundedImageView = (LKUIRoundedImageView) view6.findViewById(R.id.cr_thumbnail);
        } else {
            lKUIRoundedImageView = null;
        }
        this.f154559g = lKUIRoundedImageView;
        View view7 = this.f154557e;
        if (view7 != null) {
            textView = (TextView) view7.findViewById(R.id.cr_username);
        } else {
            textView = null;
        }
        this.f154560h = textView;
        View view8 = this.f154557e;
        if (view8 != null) {
            view2 = view8.findViewById(R.id.cr_user_avatar);
        } else {
            view2 = null;
        }
        this.f154561i = view2;
        View view9 = this.f154557e;
        if (view9 != null) {
            view3 = view9.findViewById(R.id.cr_user_avatar_container);
        } else {
            view3 = null;
        }
        this.f154562j = view3;
        View view10 = this.f154557e;
        if (view10 != null) {
            imageView2 = (ImageView) view10.findViewById(R.id.calling_cancel);
        } else {
            imageView2 = null;
        }
        this.f154564l = imageView2;
        View view11 = this.f154557e;
        if (view11 != null) {
            textView2 = (TextView) view11.findViewById(R.id.calling_cancel_text);
        } else {
            textView2 = null;
        }
        this.f154565m = textView2;
        TextView textView4 = this.f154560h;
        if (textView4 != null) {
            OpenChatter openChatter = this.f154555b;
            if (openChatter == null || (str = openChatter.getName()) == null) {
                str = this.f154568p;
            }
            textView4.setText(str);
        }
        View view12 = this.f154557e;
        if (view12 != null) {
            textView3 = (TextView) view12.findViewById(R.id.cr_invite_msg);
        }
        this.f154563k = textView3;
        if (textView3 != null) {
            textView3.setText(UIHelper.getString(R.string.View_MV_AnswerSystemPhone));
        }
        m240557g();
        m240556f();
    }

    /* renamed from: f */
    private final void m240556f() {
        String str;
        if (C60752f.m236082b((Object) this.f154559g) && C60752f.m236082b((Object) this.f154554a)) {
            if (C57782ag.m224242a(this.f154570r, "fragment_type_normal_calling")) {
                C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[initAvatarAndBackground]", "load user avatar");
                OpenChatter openChatter = this.f154555b;
                String str2 = null;
                if (openChatter != null) {
                    str = openChatter.getAvatarKey();
                } else {
                    str = null;
                }
                OpenChatter openChatter2 = this.f154555b;
                if (openChatter2 != null) {
                    str2 = openChatter2.getId();
                }
                C60783v.m236230a(str, str2, ParticipantType.LARK_USER, this.f154559g, LocationRequest.PRIORITY_NO_POWER, LocationRequest.PRIORITY_NO_POWER);
                C60735ab.m235996a(new C61612d(this));
            } else if (C57782ag.m224242a(this.f154570r, "fragment_type_dial_calling") || C57782ag.m224242a(this.f154570r, "fragment_type_phone_calling")) {
                C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[initAvatarAndBackground2]", "load default avatar");
                C60783v.m236230a("", "", ParticipantType.UNKNOWN, this.f154559g, LocationRequest.PRIORITY_NO_POWER, LocationRequest.PRIORITY_NO_POWER);
                C60735ab.m235996a(new C61613e(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$f */
    public static final class View$OnClickListenerC61614f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154578a;

        View$OnClickListenerC61614f(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154578a = enterprisePhoneCallingObserver;
        }

        public final void onClick(View view) {
            this.f154578a.mo213482a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver$g */
    public static final class View$OnClickListenerC61615g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneCallingObserver f154579a;

        View$OnClickListenerC61615g(EnterprisePhoneCallingObserver enterprisePhoneCallingObserver) {
            this.f154579a = enterprisePhoneCallingObserver;
        }

        public final void onClick(View view) {
            this.f154579a.mo213482a();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[onStart]", "onStart");
        C60735ab.m236002a(this.f154572t, this.f154571s);
        C60735ab.m236001a(new RunnableC61616h(this));
    }

    /* renamed from: a */
    private final void m240552a(boolean z) {
        View view = this.f154557e;
        if (view == null) {
            return;
        }
        if (z) {
            view.setPadding(view.getLeft(), C60776r.m236148f(), view.getRight(), view.getBottom());
        } else if (view.getTop() != 0) {
            view.setPadding(view.getLeft(), 0, view.getRight(), view.getBottom());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        VideoChatPush.m249004a().mo219755c();
        VideoChatPush.m249004a().mo219742b(this);
        C60735ab.m236001a(new RunnableC61617i(this));
        C60735ab.m236011b(this.f154572t);
    }

    public EnterprisePhoneCallingObserver(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f154573u = fragment;
        this.f154557e = fragment.getView();
        m240552a(false);
        Bundle arguments = this.f154573u.getArguments();
        if (arguments != null) {
            String string = arguments.getString("fragment_type_key");
            this.f154570r = string;
            if (C57782ag.m224242a(string, "fragment_type_normal_calling")) {
                Serializable serializable = arguments.getSerializable("open_chatter");
                if (serializable != null) {
                    this.f154555b = (OpenChatter) serializable;
                    this.f154566n = arguments.getString("chat_id");
                    this.f154567o = arguments.getString("phone_id");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.export.entity.chatter.OpenChatter");
                }
            } else if (C57782ag.m224242a(this.f154570r, "fragment_type_dial_calling")) {
                this.f154568p = arguments.getString("phone_number");
                this.f154567o = arguments.getString("phone_id");
            } else if (C57782ag.m224242a(this.f154570r, "fragment_type_phone_calling")) {
                this.f154568p = arguments.getString("phone_number");
                this.f154567o = arguments.getString("phone_id");
            }
            m240555e();
            m240553c();
            VideoChatPush.m249004a().mo219719a(this);
        }
        C60735ab.m236001a(new Runnable(this) {
            /* class com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneCallingObserver.RunnableC616091 */

            /* renamed from: a */
            final /* synthetic */ EnterprisePhoneCallingObserver f154574a;

            {
                this.f154574a = r1;
            }

            public final void run() {
                if (this.f154574a.f154556c == null) {
                    this.f154574a.f154556c = new C62784b(ar.m236694a());
                    C62784b bVar = this.f154574a.f154556c;
                    if (bVar != null) {
                        bVar.mo216829a(this.f154574a);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
        this.f154571s = 10000;
        this.f154572t = new RunnableC61611c(this);
    }

    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63574n
    /* renamed from: a */
    public void mo213484a(VCEnterprisePhoneNotify vCEnterprisePhoneNotify) {
        VCEnterprisePhoneNotify.Action action;
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[onPushVCEnterprisePhone]", "enterprisePhoneNotify:" + vCEnterprisePhoneNotify);
        VCEnterprisePhoneNotify.Action action2 = null;
        if (vCEnterprisePhoneNotify != null) {
            action = vCEnterprisePhoneNotify.action;
        } else {
            action = null;
        }
        if (action == VCEnterprisePhoneNotify.Action.CALLER_RINGING) {
            mo213485b();
            return;
        }
        if (vCEnterprisePhoneNotify != null) {
            action2 = vCEnterprisePhoneNotify.action;
        }
        if (action2 == VCEnterprisePhoneNotify.Action.CALL_EXCEPTION_TOAST_CALLER_UNREACHED) {
            C60738ac.m236029a(C60773o.m236119a((int) R.string.View_MV_CallFailMakeSureCanCall_Toast));
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.C62784b.AbstractC62785a
    /* renamed from: a */
    public void mo213483a(int i, String str) {
        if (i == 3) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneCallingObserver", "[onCallStateChanged]", "VC_TELE_STATE_RINGING");
            mo213485b();
        }
    }
}
