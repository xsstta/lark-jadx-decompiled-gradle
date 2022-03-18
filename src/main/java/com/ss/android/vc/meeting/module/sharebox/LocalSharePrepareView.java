package com.ss.android.vc.meeting.module.sharebox;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.KeepClickablePartIntactSpannableTextView;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.localshare.LocalShareCodeDialogFactory;
import com.ss.android.vc.meeting.module.localshare.LocalShareManager;
import com.ss.android.vc.meeting.module.localshare.LocalShareUssLoadingDesktopDialog;
import com.ss.android.vc.meeting.module.localshare.LocalShareUssLoadingDialog;
import com.ss.android.vc.meeting.module.localshare.UssRecvManager;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.C63766o;
import com.ss.android.vc.statistics.event.LocalShareEvent;
import com.ss.android.vc.statistics.event.MeetingShareWindowEvent;
import com.ss.android.vc.statistics.event2.MeetingSharingRoomEvent;
import com.ss.android.vc.statistics.event2.ShareCodeInputEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J2\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\u001c\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u0016\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020\u000bH\u0016J\b\u0010,\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0016J\u000f\u00100\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0002\u00102J\n\u00103\u001a\u0004\u0018\u00010\nH\u0016J\n\u00104\u001a\u0004\u0018\u00010\nH\u0016J\n\u00105\u001a\u0004\u0018\u00010\nH\u0016J\n\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0016J\u000f\u00109\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0002\u00102J\b\u0010:\u001a\u00020\u000bH\u0016J\u001c\u0010;\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010<\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010=\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020\tH\u0016J\u000f\u0010?\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010@J\u0010\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\tH\u0016J\u0018\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020/H\u0016J\b\u0010F\u001a\u00020\u000bH\u0016J\b\u0010G\u001a\u00020\u000bH\u0016J\u0010\u0010H\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\nH\u0002J\u001c\u0010I\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010<\u001a\u0004\u0018\u00010\nH\u0016JD\u0010J\u001a\u00020\u000b2:\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(M\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0016J\u001a\u0010O\u001a\u00020\u000b2\u0010\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.H\u0016J\u0010\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\tH\u0016J\u0012\u0010S\u001a\u00020\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010U\u001a\u00020\u000b2\u0010\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.H\u0016J\u0010\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\tH\u0016J\u0012\u0010Y\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010Z\u001a\u00020\u000b2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020\u000bH\u0016J\b\u0010^\u001a\u00020\u000bH\u0016J\u0012\u0010_\u001a\u00020\u000b2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J*\u0010`\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\n2\b\u0010a\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016J\b\u0010b\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "activity", "Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareActivity;", "(Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareActivity;)V", "docListDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "onUssRecvCallback", "Lkotlin/Function2;", "", "", "", "rootView", "Landroid/widget/FrameLayout;", "shareContentDialog", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalShareContentDialog;", "viewDelegate", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView$IViewDelegate;", "beginShareInRoomMeeting", "changeShareContentOrCheckShareCode", "checkAndShareScreenToRoomByMeetingNumber", "meetingNumber", "callback", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "checkAndStartMeeting", "joinPath", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "shareCodeOrMeetingNumber", "shareCodeCallback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "meetingNumberCallback", "checkLocalMeeting", "checkShareCode", "checkUssRecvResult", "shareCode", "clearCachedDocs", "create", "createDoc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "destroy", "dismissShareContentDialog", "finish", "getCachedDocsCopy", "", "Lcom/ss/android/vc/entity/VcDoc;", "getCachedDocsSize", "", "()Ljava/lang/Integer;", "getEnvId", "getShareDocUrl", "getShareRoomName", "getShareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getUserOpenedDocsCopy", "getUserOpenedDocsSize", "gotoShareCode", "handleUssRecvCallback", "roomName", "isAutoConnectOpen", "isFollowViewEnable", "needUpdateCachedDocs", "()Ljava/lang/Boolean;", "onAutoConnectChanged", "open", "onDocItemClicked", "pos", "doc", "onMagicShareUnSupported", "onShareScreenClicked", "onUssRecvSuccess", "recordShareCode", "registerUssRecvCallback", "Lkotlin/ParameterName;", "name", "success", "shareKey", "setCachedDocs", "cachedDocs", "setCachedDocsNeedUpdate", "needUpdate", "setDocListDialog", "dialog", "setUserOpenedDocs", "userOpenedDocs", "setUssRecvResultInProcessing", "inProcessing", "setViewDelegate", "shareScreenInRoomMeeting", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "showUssRecvLoadingPage", "showUssRecvResultConfirmDialog", "startFollowInRoomMeeting", "startShareMeetingByShareCode", "meetingId", "startUssReceive", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.l */
public final class LocalSharePrepareView implements ILocalSharePrepareContract.IView {

    /* renamed from: c */
    public static final Companion f158870c = new Companion(null);

    /* renamed from: a */
    public Function2<? super Boolean, ? super String, Unit> f158871a;

    /* renamed from: b */
    public final LocalSharePrepareActivity f158872b;

    /* renamed from: d */
    private FrameLayout f158873d;

    /* renamed from: e */
    private ILocalSharePrepareContract.IView.IViewDelegate f158874e;

    /* renamed from: f */
    private ILocalShareContentDialog f158875f;

    /* renamed from: g */
    private AbstractC61222a f158876g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo217842a(boolean z) {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217816a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$checkAndShareScreenToRoomByMeetingNumber$1", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "alReadyInOtherMeeting", "", "alReadyInRoomNormalMeeting", "alReadyInRoomShareMeeting", "invalidShareCode", "magicShareNotSupport", "noRoomInMeeting", "noSharePermission", "notSupportShareToRoom", "onJoinMeetingSuccess", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "otherError", "roomInWiredShare", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$b */
    public static final class C63033b implements LocalShareManager.ICheckAndShareToRoomByMeetingNumber {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareView f158877a;

        /* renamed from: b */
        final /* synthetic */ LocalShareManager.ICheckAndShareToRoomByMeetingNumber f158878b;

        /* renamed from: c */
        final /* synthetic */ String f158879c;

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: b */
        public void mo215057b() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215057b();
            }
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: a */
        public void mo215055a() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215055a();
            }
            this.f158877a.mo217809m();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: c */
        public void mo215058c() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215058c();
            }
            this.f158877a.mo217809m();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: j */
        public void mo215065j() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215065j();
            }
            this.f158877a.mo217794a((String) null, (String) null);
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: f */
        public void mo215061f() {
            C60738ac.m236029a(C60773o.m236119a((int) R.string.View_MV_NoShareDoc));
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215061f();
            }
            this.f158877a.mo217847q();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: g */
        public void mo215062g() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215062g();
            }
            C60738ac.m236029a(C60773o.m236119a((int) R.string.View_M_NoPermissionToShareMirroring));
            this.f158877a.mo217794a((String) null, (String) null);
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: i */
        public void mo215064i() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215064i();
            }
            C60738ac.m236023a((int) R.string.View_G_AlreadySharingViaHDMI);
            this.f158877a.mo217794a((String) null, (String) null);
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: d */
        public void mo215059d() {
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215059d();
            }
            MeetingManager a = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
            if (a.mo211906j() != null) {
                this.f158877a.mo217792a(ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_MEETING_NUMBER, this.f158879c, null, this);
            }
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: e */
        public void mo215060e() {
            String str;
            String str2;
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215060e();
            }
            LocalSharePrepareActivity localSharePrepareActivity = this.f158877a.f158872b;
            if (localSharePrepareActivity != null) {
                str = localSharePrepareActivity.f158824b;
            } else {
                str = null;
            }
            LocalSharePrepareActivity localSharePrepareActivity2 = this.f158877a.f158872b;
            if (localSharePrepareActivity2 != null) {
                str2 = localSharePrepareActivity2.f158825c;
            } else {
                str2 = null;
            }
            LocalShareEvent.m249996a(str, "invalid_code", str2);
            this.f158877a.mo217794a((String) null, (String) null);
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: h */
        public void mo215063h() {
            String str;
            String str2;
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215063h();
            }
            LocalSharePrepareActivity localSharePrepareActivity = this.f158877a.f158872b;
            if (localSharePrepareActivity != null) {
                str = localSharePrepareActivity.f158824b;
            } else {
                str = null;
            }
            LocalSharePrepareActivity localSharePrepareActivity2 = this.f158877a.f158872b;
            if (localSharePrepareActivity2 != null) {
                str2 = localSharePrepareActivity2.f158825c;
            } else {
                str2 = null;
            }
            LocalShareEvent.m249996a(str, "invalid_room", str2);
            this.f158877a.mo217794a((String) null, (String) null);
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckAndShareToRoomByMeetingNumber
        /* renamed from: a */
        public void mo215056a(VideoChat videoChat) {
            String str;
            Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
            C60700b.m235851b("LocalSharePrepareView", "[onJoinMeetingSuccess]", "onSuccess");
            LocalSharePrepareActivity localSharePrepareActivity = this.f158877a.f158872b;
            C61303k kVar = null;
            if (localSharePrepareActivity != null) {
                str = localSharePrepareActivity.f158825c;
            } else {
                str = null;
            }
            C63766o.m250325a(videoChat, str);
            LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar = this.f158878b;
            if (cVar != null) {
                cVar.mo215056a(videoChat);
            }
            this.f158877a.mo217808l();
            MeetingManager a = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
            AbstractC61294b j = a.mo211906j();
            if (j instanceof C61303k) {
                kVar = j;
            }
            C61303k kVar2 = kVar;
            if (kVar2 == null || !TextUtils.equals(kVar2.mo212055d(), videoChat.getId())) {
                LocalShareManager.f156170b.mo215084a().mo215077a(videoChat);
            } else {
                this.f158877a.mo217809m();
            }
        }

        C63033b(LocalSharePrepareView lVar, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar, String str) {
            this.f158877a = lVar;
            this.f158878b = cVar;
            this.f158879c = str;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: c */
    public void mo217799c() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217818c();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f158875f = null;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: j */
    public void mo217806j() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217824i();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: k */
    public void mo217807k() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217825j();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: m */
    public void mo217809m() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217826k();
        }
    }

    /* renamed from: s */
    public void mo217849s() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217828m();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public List<VcDoc> mo217789a() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217811a();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: b */
    public Integer mo217798b() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217817b();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: d */
    public boolean mo217800d() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217819d();
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: e */
    public boolean mo217801e() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217820e();
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: n */
    public String mo217810n() {
        LocalSharePrepareActivity localSharePrepareActivity = this.f158872b;
        if (localSharePrepareActivity != null) {
            return localSharePrepareActivity.f158825c;
        }
        return null;
    }

    /* renamed from: o */
    public ShareScreenToRoomEntityRequest.ShareType mo217845o() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217821f();
        }
        return null;
    }

    /* renamed from: p */
    public String mo217846p() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217822g();
        }
        return null;
    }

    /* renamed from: r */
    public String mo217848r() {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            return aVar.mo217827l();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: i */
    public void mo217805i() {
        mo217842a(false);
        UssRecvManager.f156195e.mo215103a().mo215100b();
        UssRecvManager.f156195e.mo215103a().mo215099a(new C63041i(this));
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: l */
    public void mo217808l() {
        UssRecvManager.f156195e.mo215103a().mo215099a(null);
        UssRecvManager.f156195e.mo215103a().mo215101c();
        LocalSharePrepareActivity localSharePrepareActivity = this.f158872b;
        if (localSharePrepareActivity != null) {
            localSharePrepareActivity.finish();
        }
    }

    /* renamed from: q */
    public void mo217847q() {
        C60700b.m235851b("LocalSharePrepareView", "[onMagicShareUnSupported]", "onMagicShareUnSupported");
        AbstractC61222a aVar = this.f158876g;
        if (aVar != null) {
            aVar.dismiss();
        }
        ILocalSharePrepareContract.IView.IViewDelegate aVar2 = this.f158874e;
        if (aVar2 != null) {
            aVar2.mo217823h();
        }
        ILocalShareContentDialog bVar = this.f158875f;
        if (bVar != null) {
            bVar.mo217763a(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: f */
    public void mo217802f() {
        boolean z;
        C60700b.m235851b("LocalSharePrepareView", "[gotoShareCode]", "gotoShareCode");
        LocalSharePrepareActivity localSharePrepareActivity = this.f158872b;
        if (localSharePrepareActivity != null) {
            AbstractC61222a a = LocalShareCodeDialogFactory.m242737a(localSharePrepareActivity, localSharePrepareActivity.f158824b, this);
            if (a != null) {
                a.mo211606a();
            }
            ShareCodeInputEvent a2 = ShareCodeInputEvent.f160810b.mo220238a();
            MeetingManager a3 = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "MeetingManager.getInstance()");
            if (a3.mo211908l() != null) {
                z = true;
            } else {
                z = false;
            }
            a2.mo220237a(z, this.f158872b.f158825c);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: g */
    public void mo217803g() {
        if (this.f158872b == null) {
            return;
        }
        if (DesktopUtil.m144307b()) {
            new LocalShareUssLoadingDesktopDialog(this.f158872b, this).mo211606a();
        } else {
            new LocalShareUssLoadingDialog(this.f158872b, this).mo211606a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        String str;
        LocalSharePrepareActivity localSharePrepareActivity = this.f158872b;
        if (localSharePrepareActivity == null) {
            C60700b.m235851b("LocalSharePrepareView", "[create]", "activity is null");
            return;
        }
        this.f158873d = (FrameLayout) localSharePrepareActivity.findViewById(R.id.local_share_prepare_root);
        LocalSharePrepareActivity localSharePrepareActivity2 = this.f158872b;
        ILocalShareContentDialog a = LocalShareContentDialogFactory.m246801a(localSharePrepareActivity2, localSharePrepareActivity2.f158824b, this);
        this.f158875f = a;
        if (a != null) {
            a.mo211606a();
        }
        MeetingShareWindowEvent a2 = MeetingShareWindowEvent.f160898b.mo220398a();
        LocalSharePrepareActivity localSharePrepareActivity3 = this.f158872b;
        if (localSharePrepareActivity3 != null) {
            str = localSharePrepareActivity3.f158825c;
        } else {
            str = null;
        }
        a2.mo220397a(null, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$startShareMeetingByShareCode$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$h */
    public static final class C63039h implements AbstractC63598b<C60965at> {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareView f158886a;

        /* renamed from: b */
        final /* synthetic */ AbstractC63598b f158887b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$startShareMeetingByShareCode$1$onError$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$h$a */
        static final class RunnableC63040a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C63039h f158888a;

            /* renamed from: b */
            final /* synthetic */ C63602e f158889b;

            RunnableC63040a(C63039h hVar, C63602e eVar) {
                this.f158888a = hVar;
                this.f158889b = eVar;
            }

            public final void run() {
                String str;
                String str2;
                String str3;
                String str4;
                switch (this.f158889b.mo219899a()) {
                    case 231106:
                        LocalSharePrepareActivity localSharePrepareActivity = this.f158888a.f158886a.f158872b;
                        if (localSharePrepareActivity != null) {
                            str = localSharePrepareActivity.f158824b;
                        } else {
                            str = null;
                        }
                        LocalSharePrepareActivity localSharePrepareActivity2 = this.f158888a.f158886a.f158872b;
                        if (localSharePrepareActivity2 != null) {
                            str2 = localSharePrepareActivity2.f158825c;
                        } else {
                            str2 = null;
                        }
                        LocalShareEvent.m249996a(str, "invalid_room", str2);
                        this.f158888a.f158886a.mo217794a((String) null, (String) null);
                        return;
                    case 232302:
                    case 232502:
                        return;
                    case 232401:
                        if (this.f158888a.f158887b == null) {
                            C60738ac.m236029a(C60773o.m236119a((int) R.string.View_MV_ConnectionFailedUseCode));
                            this.f158888a.f158886a.mo217802f();
                        }
                        LocalSharePrepareActivity localSharePrepareActivity3 = this.f158888a.f158886a.f158872b;
                        if (localSharePrepareActivity3 != null) {
                            str3 = localSharePrepareActivity3.f158824b;
                        } else {
                            str3 = null;
                        }
                        LocalSharePrepareActivity localSharePrepareActivity4 = this.f158888a.f158886a.f158872b;
                        if (localSharePrepareActivity4 != null) {
                            str4 = localSharePrepareActivity4.f158825c;
                        } else {
                            str4 = null;
                        }
                        LocalShareEvent.m249996a(str3, "invalid_code", str4);
                        this.f158888a.f158886a.mo217794a((String) null, (String) null);
                        return;
                    case 232402:
                        C60738ac.m236029a(C60773o.m236119a((int) R.string.View_M_NoPermissionToShareMirroring));
                        return;
                    case 236001:
                        C60738ac.m236029a(C60773o.m236119a((int) R.string.View_MV_NoShareDoc));
                        this.f158888a.f158886a.mo217847q();
                        return;
                    default:
                        this.f158888a.f158886a.mo217794a((String) null, (String) null);
                        return;
                }
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            if (eVar != null && eVar != null) {
                C60700b.m235864f("LocalSharePrepareView", "[processTextInput2]", "shareScreenToRoom error: " + eVar);
                AbstractC63598b bVar = this.f158887b;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
                C60735ab.m236001a(new RunnableC63040a(this, eVar));
            }
        }

        /* renamed from: a */
        public void onSuccess(C60965at atVar) {
            VideoChat videoChat;
            String str;
            C60700b.m235851b("LocalSharePrepareView", "[startShareMeeting]", "onSuccess");
            C61303k kVar = null;
            if (atVar != null) {
                VideoChat videoChat2 = atVar.f152659a;
                LocalSharePrepareActivity localSharePrepareActivity = this.f158886a.f158872b;
                if (localSharePrepareActivity != null) {
                    str = localSharePrepareActivity.f158825c;
                } else {
                    str = null;
                }
                C63766o.m250325a(videoChat2, str);
            }
            AbstractC63598b bVar = this.f158887b;
            if (bVar != null) {
                bVar.onSuccess(atVar);
            }
            this.f158886a.mo217808l();
            if (atVar != null && (videoChat = atVar.f152659a) != null) {
                MeetingManager a = MeetingManager.m238341a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
                AbstractC61294b j = a.mo211906j();
                if (j instanceof C61303k) {
                    kVar = j;
                }
                C61303k kVar2 = kVar;
                if (kVar2 == null || !TextUtils.equals(kVar2.mo212055d(), videoChat.getId())) {
                    LocalShareManager.f156170b.mo215084a().mo215077a(videoChat);
                } else {
                    this.f158886a.mo217809m();
                }
            }
        }

        C63039h(LocalSharePrepareView lVar, AbstractC63598b bVar) {
            this.f158886a = lVar;
            this.f158887b = bVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: h */
    public void mo217804h() {
        if (this.f158872b != null) {
            MeetingSharingRoomEvent a = MeetingSharingRoomEvent.f160804b.mo220226a();
            String str = this.f158872b.f158825c;
            Intrinsics.checkExpressionValueIsNotNull(str, "activity.envId");
            String str2 = null;
            MeetingSharingRoomEvent.m249717a(a, str, null, 2, null);
            View inflate = this.f158872b.getLayoutInflater().inflate(R.layout.dialog_uss_recv_result_confirm_content, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.meeting_room_name_lt);
            if (textView != null) {
                textView.setText(mo217848r());
            }
            Intrinsics.checkExpressionValueIsNotNull(inflate, "customLayout");
            DialogC25637f a2 = VCDialogUtils.m236183a((Context) this.f158872b, inflate, (int) R.string.View_G_ShareScreen_ShareToThisRoom, 2, 20, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC63037f(this), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC63038g(this), false);
            KeepClickablePartIntactSpannableTextView keepClickablePartIntactSpannableTextView = (KeepClickablePartIntactSpannableTextView) inflate.findViewById(R.id.enter_sharing_code_tv);
            if (keepClickablePartIntactSpannableTextView != null) {
                Regex regex = new Regex("(?<=@@).*(?=@@)");
                CharSequence text = keepClickablePartIntactSpannableTextView.getText();
                Intrinsics.checkExpressionValueIsNotNull(text, "text");
                MatchResult find$default = Regex.find$default(regex, text, 0, 2, null);
                if (find$default != null) {
                    str2 = find$default.mo242581b();
                }
                keepClickablePartIntactSpannableTextView.mo208449a(StringsKt.replace$default(keepClickablePartIntactSpannableTextView.getText().toString(), "@@", "", false, 4, (Object) null), str2, C60773o.m236126d(R.color.function_info_500), new C63036e(this, a2));
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ILocalSharePrepareContract.IView.IViewDelegate aVar) {
        this.f158874e = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$onUssRecvSuccess$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/AdminSettings;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$d */
    public static final class C63035d implements AbstractC63598b<AdminSettings> {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareView f158882a;

        /* renamed from: b */
        final /* synthetic */ String f158883b;

        /* renamed from: a */
        public void onSuccess(AdminSettings adminSettings) {
            this.f158882a.mo217843b(this.f158883b);
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            this.f158882a.mo217843b(this.f158883b);
        }

        C63035d(LocalSharePrepareView lVar, String str) {
            this.f158882a = lVar;
            this.f158883b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$showUssRecvResultConfirmDialog$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$e */
    static final class C63036e extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ DialogC25637f $dialog$inlined;
        final /* synthetic */ LocalSharePrepareView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63036e(LocalSharePrepareView lVar, DialogC25637f fVar) {
            super(1);
            this.this$0 = lVar;
            this.$dialog$inlined = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            MeetingSharingRoomEvent a = MeetingSharingRoomEvent.f160804b.mo220226a();
            String str = this.this$0.f158872b.f158825c;
            Intrinsics.checkExpressionValueIsNotNull(str, "activity.envId");
            MeetingSharingRoomEvent.m249718a(a, str, "sharecode", null, 4, null);
            this.this$0.mo217802f();
            DialogC25637f fVar = this.$dialog$inlined;
            if (fVar != null) {
                fVar.dismiss();
            }
        }
    }

    public LocalSharePrepareView(LocalSharePrepareActivity localSharePrepareActivity) {
        this.f158872b = localSharePrepareActivity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareView$checkUssRecvResult$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "roomFullName", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$c */
    public static final class C63034c implements AbstractC63598b<String> {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareView f158880a;

        /* renamed from: b */
        final /* synthetic */ String f158881b;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            C60700b.m235864f("LocalSharePrepareView", "[checkUssRecvResult2]", "uss recv success, getRoomNameByShareCode failed");
            this.f158880a.mo217844b(this.f158881b, null);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            C60700b.m235851b("LocalSharePrepareView", "[checkUssRecvResult]", "uss recv success, getRoomNameByShareCode success: " + "[shareCode]:" + this.f158881b + ", [roomFullName]:" + str);
            this.f158880a.mo217844b(this.f158881b, str);
        }

        C63034c(LocalSharePrepareView lVar, String str) {
            this.f158880a = lVar;
            this.f158881b = str;
        }
    }

    /* renamed from: a */
    public final void mo217841a(String str) {
        VideoChatAdminSettings.m239405a(new C63035d(this, str));
    }

    /* renamed from: b */
    public final void mo217843b(String str) {
        if (VideoChatAdminSettings.m239432k()) {
            LocalShareManager.f156170b.mo215084a().mo215081a(str, new C63034c(this, str));
            return;
        }
        C60700b.m235851b("LocalSharePrepareView", "[checkUssRecvResult3]", "uss recv success, adminSettings no need to show confirm dialog");
        mo217844b(str, null);
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217796a(List<? extends VcDoc> list) {
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217815a(list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217797a(Function2<? super Boolean, ? super String, Unit> kVar) {
        this.f158871a = kVar;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217791a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61751a.AbstractC61752a aVar) {
        ILocalSharePrepareContract.IView.IViewDelegate aVar2 = this.f158874e;
        if (aVar2 != null) {
            aVar2.mo217813a(createDocType, aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "success", "", "shareKey", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$i */
    static final class C63041i extends Lambda implements Function2<Boolean, String, Unit> {
        final /* synthetic */ LocalSharePrepareView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63041i(LocalSharePrepareView lVar) {
            super(2);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Boolean bool, String str) {
            invoke(bool.booleanValue(), str);
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, String str) {
            boolean z2;
            if (z && str != null) {
                if (str.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.this$0.mo217842a(true);
                    this.this$0.mo217841a(str);
                    UssRecvManager.f156195e.mo215103a().mo215099a(null);
                }
            }
            C60700b.m235851b("LocalSharePrepareView", "[startUssReceive]", "uss recv failed");
            Function2<? super Boolean, ? super String, Unit> kVar = this.this$0.f158871a;
            if (kVar != null) {
                kVar.invoke(false, str);
            }
            UssRecvManager.f156195e.mo215103a().mo215099a(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$f */
    static final class DialogInterface$OnClickListenerC63037f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareView f158884a;

        DialogInterface$OnClickListenerC63037f(LocalSharePrepareView lVar) {
            this.f158884a = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            MeetingSharingRoomEvent a = MeetingSharingRoomEvent.f160804b.mo220226a();
            String str = this.f158884a.f158872b.f158825c;
            Intrinsics.checkExpressionValueIsNotNull(str, "activity.envId");
            MeetingSharingRoomEvent.m249718a(a, str, "confirm", null, 4, null);
            this.f158884a.mo217849s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.l$g */
    static final class DialogInterface$OnClickListenerC63038g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareView f158885a;

        DialogInterface$OnClickListenerC63038g(LocalSharePrepareView lVar) {
            this.f158885a = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            MeetingSharingRoomEvent a = MeetingSharingRoomEvent.f160804b.mo220226a();
            String str = this.f158885a.f158872b.f158825c;
            Intrinsics.checkExpressionValueIsNotNull(str, "activity.envId");
            MeetingSharingRoomEvent.m249718a(a, str, "cancel", null, 4, null);
            this.f158885a.mo217808l();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217790a(int i, VcDoc vcDoc) {
        Intrinsics.checkParameterIsNotNull(vcDoc, "doc");
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217812a(i, vcDoc);
        }
    }

    /* renamed from: b */
    public final void mo217844b(String str, String str2) {
        mo217842a(false);
        mo217794a(str, str2);
        Function2<? super Boolean, ? super String, Unit> kVar = this.f158871a;
        if (kVar != null) {
            kVar.invoke(true, str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217793a(String str, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar) {
        Intrinsics.checkParameterIsNotNull(str, "meetingNumber");
        LocalShareManager.f156170b.mo215084a().mo215078a(str, mo217845o(), mo217846p(), new C63033b(this, cVar, str));
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217794a(String str, String str2) {
        C60700b.m235851b("LocalSharePrepareView", "[recordShareCode]", "shareCode = " + str + ", [roomName]: " + str2);
        ILocalSharePrepareContract.IView.IViewDelegate aVar = this.f158874e;
        if (aVar != null) {
            aVar.mo217814a(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217795a(String str, String str2, AbstractC63598b<C60965at> bVar) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "shareCode");
        LocalSharePrepareActivity localSharePrepareActivity = this.f158872b;
        if (localSharePrepareActivity != null) {
            str3 = localSharePrepareActivity.f158825c;
        } else {
            str3 = null;
        }
        C63766o.m250327a(str3);
        mo217794a(str, mo217848r());
        LocalShareManager.f156170b.mo215084a().mo215083a(str, str2, mo217845o(), mo217846p(), new C63039h(this, bVar));
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView
    /* renamed from: a */
    public void mo217792a(ShareScreenToRoomEntityRequest.JoinPath joinPath, String str, AbstractC63598b<C60965at> bVar, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar) {
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(joinPath, "joinPath");
        Intrinsics.checkParameterIsNotNull(str, "shareCodeOrMeetingNumber");
        LocalSharePrepareActivity localSharePrepareActivity = this.f158872b;
        JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.UNKNOWN;
        LocalSharePrepareActivity localSharePrepareActivity2 = this.f158872b;
        if (localSharePrepareActivity2 != null) {
            str2 = localSharePrepareActivity2.f158824b;
        } else {
            str2 = null;
        }
        LocalSharePrepareActivity localSharePrepareActivity3 = this.f158872b;
        if (localSharePrepareActivity3 != null) {
            str3 = localSharePrepareActivity3.f158825c;
        } else {
            str3 = null;
        }
        MeetingCheckUtils.meetingCheck(localSharePrepareActivity, "0", joinMeetingCheckIDType, false, str2, str3, 2, false).subscribe(new LocalSharePrepareView$checkAndStartMeeting$1(this, joinPath, str, bVar, cVar));
    }
}
