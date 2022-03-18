package com.ss.android.vc.meeting.module.sharebox;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60973g;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.localshare.LocalShareManager;
import com.ss.android.vc.meeting.module.localshare.UssRecvManager;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3148o.C62606c;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.preview.MeetingDeviceSwitchStateUtil;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u001c\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"H\u0016J\u000f\u0010#\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0002\u0010%J\n\u0010&\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010'\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"H\u0016J\u000f\u0010*\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0002\u0010%J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\u000f\u0010-\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0006H\u0016J\u0018\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u000fH\u0016J\b\u00104\u001a\u00020\u0014H\u0016J\b\u00105\u001a\u00020\u0014H\u0016J\u001c\u00106\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u00107\u001a\u00020\u00142\u0010\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\"H\u0016J\u0010\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0012\u0010;\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010<\u001a\u00020\u00142\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\"H\u0016J\u0010\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0006H\u0016J\u0012\u0010@\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0012\u0010C\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u00010BH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareModel;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel;", "()V", "cachedDocManager", "Lcom/ss/android/vc/meeting/module/setting/CachedDocManager;", "followAvailable", "", "isAutoConnectOpen", "isUssRecvResultProcessing", "modelDelegate", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel$IModelDelegate;", "roomName", "", "shareCode", "shareDoc", "Lcom/ss/android/vc/entity/VcDoc;", "shareDocUrl", "shareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "beginShareInRoomMeeting", "", "changeShareContentOrCheckShareCode", "checkAndStartMeetingByShareCode", "checkLocalMeeting", "checkShareCode", "clearCachedDocs", "create", "createDoc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "callback", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "destroy", "getCachedDocsCopy", "", "getCachedDocsSize", "", "()Ljava/lang/Integer;", "getShareDocUrl", "getShareRoomName", "getShareType", "getUserOpenedDocsCopy", "getUserOpenedDocsSize", "gotoShareCode", "isFollowViewEnable", "needUpdateCachedDocs", "()Ljava/lang/Boolean;", "onAutoConnectChanged", "open", "onDocItemClicked", "pos", "doc", "onMagicShareUnSupported", "onShareScreenClicked", "recordShareCode", "setCachedDocs", "cachedDocs", "setCachedDocsNeedUpdate", "needUpdate", "setModelDelegate", "setUserOpenedDocs", "userOpenedDocs", "setUssRecvResultInProcessing", "inProcessing", "shareScreenInRoomMeeting", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "startFollowInRoomMeeting", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.i */
public final class LocalSharePrepareModel implements ILocalSharePrepareContract.IModel {

    /* renamed from: g */
    public static final Companion f158849g = new Companion(null);

    /* renamed from: a */
    public ILocalSharePrepareContract.IModel.IModelDelegate f158850a;

    /* renamed from: b */
    public ShareScreenToRoomEntityRequest.ShareType f158851b;

    /* renamed from: c */
    public String f158852c;

    /* renamed from: d */
    public VcDoc f158853d;

    /* renamed from: e */
    public String f158854e;

    /* renamed from: f */
    public String f158855f;

    /* renamed from: h */
    private C62606c f158856h = new C62606c();

    /* renamed from: i */
    private boolean f158857i = true;

    /* renamed from: j */
    private boolean f158858j = true;

    /* renamed from: k */
    private boolean f158859k;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: h */
    public void mo217777h() {
        this.f158858j = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareModel$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: c */
    public boolean mo217772c() {
        return this.f158858j;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: f */
    public ShareScreenToRoomEntityRequest.ShareType mo217775f() {
        return this.f158851b;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: g */
    public String mo217776g() {
        return this.f158852c;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: i */
    public String mo217778i() {
        return this.f158855f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareModel$checkLocalMeeting$1", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckLocalMeetingCallbak;", "hasNoMeeting", "", "inDiffNormalMeeting", "inSameNormalMeeting", "isSharingToRoom", "localInNormalMeetingAndRoomInWiredMeeting", "onError", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onlyLocalInNormalMeeting", "meetingId", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.i$b */
    public static final class C63028b implements LocalShareManager.ICheckLocalMeetingCallbak {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareModel f158860a;

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: a */
        public void mo215045a() {
            this.f158860a.mo217837o();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: b */
        public void mo215048b() {
            this.f158860a.mo217781l();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: c */
        public void mo215049c() {
            this.f158860a.mo217837o();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: e */
        public void mo215051e() {
            this.f158860a.mo217781l();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: d */
        public void mo215050d() {
            String str = null;
            this.f158860a.f158854e = str;
            this.f158860a.f158855f = str;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63028b(LocalSharePrepareModel iVar) {
            this.f158860a = iVar;
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: a */
        public void mo215046a(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            String str = null;
            this.f158860a.f158854e = str;
            this.f158860a.f158855f = str;
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.ICheckLocalMeetingCallbak
        /* renamed from: a */
        public void mo215047a(String str) {
            ILocalSharePrepareContract.IModel.IModelDelegate aVar;
            String str2 = this.f158860a.f158854e;
            if (str2 != null && (aVar = this.f158860a.f158850a) != null) {
                aVar.mo217785a(str2, str, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareModel$checkShareCode$1", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$IGetShareCodeInfoCallback;", "isRoom", "", "isShareBox", "onError", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.i$c */
    public static final class C63029c implements LocalShareManager.IGetShareCodeInfoCallback {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareModel f158861a;

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.IGetShareCodeInfoCallback
        /* renamed from: a */
        public void mo215042a() {
            this.f158861a.mo217837o();
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.IGetShareCodeInfoCallback
        /* renamed from: b */
        public void mo215044b() {
            this.f158861a.mo217782m();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63029c(LocalSharePrepareModel iVar) {
            this.f158861a = iVar;
        }

        @Override // com.ss.android.vc.meeting.module.localshare.LocalShareManager.IGetShareCodeInfoCallback
        /* renamed from: a */
        public void mo215043a(C63602e eVar) {
            String str = null;
            this.f158861a.f158854e = str;
            this.f158861a.f158855f = str;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: d */
    public boolean mo217773d() {
        return MeetingDeviceSwitchStateUtil.m245170e();
    }

    /* renamed from: n */
    public void mo217836n() {
        ILocalSharePrepareContract.IModel.IModelDelegate aVar = this.f158850a;
        if (aVar != null) {
            aVar.mo217783a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public List<VcDoc> mo217764a() {
        C62606c cVar = this.f158856h;
        if (cVar != null) {
            return cVar.mo216381a();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: b */
    public Integer mo217771b() {
        C62606c cVar = this.f158856h;
        if (cVar != null) {
            return Integer.valueOf(cVar.mo216386b());
        }
        return null;
    }

    /* renamed from: o */
    public final void mo217837o() {
        ILocalSharePrepareContract.IModel.IModelDelegate aVar;
        String str = this.f158854e;
        if (str != null && (aVar = this.f158850a) != null) {
            aVar.mo217784a(ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_SHARE_CODE, str, null, null);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: e */
    public void mo217774e() {
        this.f158851b = ShareScreenToRoomEntityRequest.ShareType.SCREEN;
        this.f158852c = null;
        this.f158853d = null;
        mo217780k();
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: m */
    public void mo217782m() {
        LocalShareManager.f156170b.mo215084a().mo215079a(this.f158854e, new C63028b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareModel$startFollowInRoomMeeting$1", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$IShareFollowCallback;", "onShareFail", "", "dismiss", "", "onShareSuccess", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.i$e */
    public static final class C63031e implements AbstractC61751a.AbstractC61755d {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareModel f158864a;

        /* renamed from: b */
        final /* synthetic */ C61303k f158865b;

        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61755d
        /* renamed from: a */
        public void mo213909a() {
            String str;
            VcDoc vcDoc = this.f158864a.f158853d;
            if (vcDoc != null) {
                str = vcDoc.getDocUrl();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f158864a.f158852c)) {
                this.f158865b.aa().mo216266a(this.f158864a.f158853d, true);
            }
            ILocalSharePrepareContract.IModel.IModelDelegate aVar = this.f158864a.f158850a;
            if (aVar != null) {
                aVar.mo217786b();
            }
        }

        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61755d
        /* renamed from: a */
        public void mo213910a(boolean z) {
            ILocalSharePrepareContract.IModel.IModelDelegate aVar;
            if (z && (aVar = this.f158864a.f158850a) != null) {
                aVar.mo217786b();
            }
        }

        C63031e(LocalSharePrepareModel iVar, C61303k kVar) {
            this.f158864a = iVar;
            this.f158865b = kVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: j */
    public void mo217779j() {
        String str;
        boolean z;
        if ((TextUtils.isEmpty(this.f158854e) && UssRecvManager.f156195e.mo215103a().mo215102d()) || this.f158859k) {
            ILocalSharePrepareContract.IModel.IModelDelegate aVar = this.f158850a;
            if (aVar != null) {
                aVar.mo217787c();
            }
        } else if (TextUtils.isEmpty(this.f158854e)) {
            mo217836n();
        } else {
            if (VideoChatAdminSettings.m239432k() && (str = this.f158855f) != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ILocalSharePrepareContract.IModel.IModelDelegate aVar2 = this.f158850a;
                    if (aVar2 != null) {
                        aVar2.mo217788d();
                        return;
                    }
                    return;
                }
            }
            LocalShareManager.f156170b.mo215084a().mo215080a(this.f158854e, new C63029c(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: k */
    public void mo217780k() {
        VideoChat e;
        VideoChatSettings videoChatSettings;
        VideoChat e2;
        VideoChatSettings videoChatSettings2;
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        VideoChatSettings.SubType subType = null;
        if (!(j instanceof C61303k)) {
            j = null;
        }
        C61303k kVar = (C61303k) j;
        if (!(kVar == null || (e2 = kVar.mo212056e()) == null || (videoChatSettings2 = e2.getVideoChatSettings()) == null)) {
            subType = videoChatSettings2.getSubType();
        }
        if (subType != VideoChatSettings.SubType.SCREEN_SHARE || kVar == null || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null || videoChatSettings.isBoxSharing()) {
            mo217779j();
        } else {
            mo217781l();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: l */
    public void mo217781l() {
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        if (!(j instanceof C61303k)) {
            j = null;
        }
        C61303k kVar = (C61303k) j;
        if (kVar != null) {
            ShareScreenToRoomEntityRequest.ShareType shareType = this.f158851b;
            if (shareType != null) {
                int i = C63032j.f158866a[shareType.ordinal()];
                if (i == 1) {
                    AbstractC62612a aj = kVar.aj();
                    Intrinsics.checkExpressionValueIsNotNull(aj, "it.shareScreenControl");
                    if (!aj.mo216408a()) {
                        kVar.mo212092J().mo212526a(true);
                        kVar.mo212092J().mo212530b(true);
                    }
                } else if (i == 2) {
                    kVar.aj().mo216414d();
                    mo217834a(kVar);
                }
            }
            ILocalSharePrepareContract.IModel.IModelDelegate aVar = this.f158850a;
            if (aVar != null) {
                aVar.mo217786b();
            }
            ByteRTCMeetingActivity.f157054h.mo215867a(kVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public void mo217767a(ILocalSharePrepareContract.IModel.IModelDelegate aVar) {
        this.f158850a = aVar;
    }

    /* renamed from: b */
    public void mo217835b(boolean z) {
        C62606c cVar = this.f158856h;
        if (cVar != null) {
            cVar.mo216385a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/sharebox/LocalSharePrepareModel$createDoc$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CreateDocEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "createDocResponse", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.i$d */
    public static final class C63030d implements AbstractC63598b<C60973g> {

        /* renamed from: a */
        final /* synthetic */ LocalSharePrepareModel f158862a;

        /* renamed from: b */
        final /* synthetic */ AbstractC61751a.AbstractC61752a f158863b;

        /* renamed from: a */
        public void onSuccess(C60973g gVar) {
            String str;
            this.f158862a.mo217835b(true);
            this.f158862a.f158851b = ShareScreenToRoomEntityRequest.ShareType.MAGIC_SHARE;
            LocalSharePrepareModel iVar = this.f158862a;
            if (gVar != null) {
                str = gVar.f152687a;
            } else {
                str = null;
            }
            iVar.f158852c = str;
            this.f158862a.f158853d = null;
            AbstractC61751a.AbstractC61752a aVar = this.f158863b;
            if (aVar != null) {
                aVar.mo213913a();
            }
            this.f158862a.mo217780k();
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            C60700b.m235864f("LocalSharePrepareModel@", "[createDoc2]", "error url= " + eVar.mo219902b());
            AbstractC61751a.AbstractC61752a aVar = this.f158863b;
            if (aVar != null) {
                aVar.mo213914a(eVar);
            }
        }

        C63030d(LocalSharePrepareModel iVar, AbstractC61751a.AbstractC61752a aVar) {
            this.f158862a = iVar;
            this.f158863b = aVar;
        }
    }

    /* renamed from: a */
    public void mo217834a(C61303k kVar) {
        if (!TextUtils.isEmpty(this.f158852c) && kVar != null) {
            kVar.ab().mo213863a(this.f158852c, "", FollowInfo.InitSource.INIT_DIRECTLY, false, -1, new C63031e(this, kVar));
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public void mo217769a(List<? extends VcDoc> list) {
        C62606c cVar = this.f158856h;
        if (cVar != null) {
            cVar.mo216384a((List<VcDoc>) list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public void mo217770a(boolean z) {
        this.f158859k = z;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public void mo217768a(String str, String str2) {
        this.f158854e = str;
        this.f158855f = str2;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public void mo217765a(int i, VcDoc vcDoc) {
        Intrinsics.checkParameterIsNotNull(vcDoc, "doc");
        if (this.f158858j) {
            this.f158851b = ShareScreenToRoomEntityRequest.ShareType.MAGIC_SHARE;
            this.f158852c = vcDoc.getDocUrl();
            this.f158853d = vcDoc;
            mo217780k();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel
    /* renamed from: a */
    public void mo217766a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61751a.AbstractC61752a aVar) {
        C60700b.m235851b("LocalSharePrepareModel@", "[createDoc]", "type = " + createDocType);
        VcBizSender.m249149a(createDocType).mo219889a(new C63030d(this, aVar));
    }
}
