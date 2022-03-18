package com.ss.android.vc.meeting.module.sharebox;

import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.localshare.LocalShareManager;
import com.ss.android.vc.net.request.AbstractC63598b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract;", "", "IModel", "IView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.c */
public interface ILocalSharePrepareContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u00019J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0010\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001cH&J\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001cH&J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000fH&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\u001e\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0014H&J\u001a\u0010*\u001a\u00020\u00032\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u001cH&J\u0012\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u000100H&J\u001a\u00101\u001a\u00020\u00032\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH&J\u0010\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u001cH&J\u0012\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u000107H&J\u0012\u00108\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u000107H&¨\u0006:"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "beginShareInRoomMeeting", "", "changeShareContentOrCheckShareCode", "checkLocalMeeting", "checkShareCode", "clearCachedDocs", "createDoc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "callback", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "getCachedDocsCopy", "", "Lcom/ss/android/vc/entity/VcDoc;", "getCachedDocsSize", "", "()Ljava/lang/Integer;", "getShareDocUrl", "", "getShareRoomName", "getShareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getUserOpenedDocsCopy", "getUserOpenedDocsSize", "gotoShareCode", "isAutoConnectOpen", "", "isFollowViewEnable", "needUpdateCachedDocs", "()Ljava/lang/Boolean;", "onAutoConnectChanged", "open", "onDocItemClicked", "pos", "doc", "onMagicShareUnSupported", "onShareScreenClicked", "recordShareCode", "shareCode", "roomName", "setCachedDocs", "cachedDocs", "setCachedDocsNeedUpdate", "needUpdate", "setModelDelegate", "modelDelegate", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel$IModelDelegate;", "setUserOpenedDocs", "userOpenedDocs", "setUssRecvResultInProcessing", "inProcessing", "shareScreenInRoomMeeting", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "startFollowInRoomMeeting", "IModelDelegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J*\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel$IModelDelegate;", "", "checkAndStartMeeting", "", "joinPath", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "shareCodeOrMeetingNumber", "", "shareCodeCallback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "meetingNumberCallback", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "dismissShareContentDialog", "finish", "getEnvId", "getSource", "gotoShareCode", "onMagicShareUnSupported", "showUssRecvLoadingPage", "showUssRecvResultConfirmDialog", "startShareMeeting", "shareCode", "meetingId", "callback", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.sharebox.c$a$a */
        public interface IModelDelegate {
            /* renamed from: a */
            void mo217783a();

            /* renamed from: a */
            void mo217784a(ShareScreenToRoomEntityRequest.JoinPath joinPath, String str, AbstractC63598b<C60965at> bVar, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar);

            /* renamed from: a */
            void mo217785a(String str, String str2, AbstractC63598b<C60965at> bVar);

            /* renamed from: b */
            void mo217786b();

            /* renamed from: c */
            void mo217787c();

            /* renamed from: d */
            void mo217788d();
        }

        /* renamed from: a */
        List<VcDoc> mo217764a();

        /* renamed from: a */
        void mo217765a(int i, VcDoc vcDoc);

        /* renamed from: a */
        void mo217766a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61751a.AbstractC61752a aVar);

        /* renamed from: a */
        void mo217767a(IModelDelegate aVar);

        /* renamed from: a */
        void mo217768a(String str, String str2);

        /* renamed from: a */
        void mo217769a(List<? extends VcDoc> list);

        /* renamed from: a */
        void mo217770a(boolean z);

        /* renamed from: b */
        Integer mo217771b();

        /* renamed from: c */
        boolean mo217772c();

        /* renamed from: d */
        boolean mo217773d();

        /* renamed from: e */
        void mo217774e();

        /* renamed from: f */
        ShareScreenToRoomEntityRequest.ShareType mo217775f();

        /* renamed from: g */
        String mo217776g();

        /* renamed from: h */
        void mo217777h();

        /* renamed from: i */
        String mo217778i();

        /* renamed from: j */
        void mo217779j();

        /* renamed from: k */
        void mo217780k();

        /* renamed from: l */
        void mo217781l();

        /* renamed from: m */
        void mo217782m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001SJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J2\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u001c\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H&J\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH&J\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H&¢\u0006\u0002\u0010!J\n\u0010\"\u001a\u0004\u0018\u00010\bH&J\n\u0010#\u001a\u0004\u0018\u00010\bH&J\n\u0010$\u001a\u0004\u0018\u00010\bH&J\n\u0010%\u001a\u0004\u0018\u00010&H&J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH&J\u000f\u0010(\u001a\u0004\u0018\u00010 H&¢\u0006\u0002\u0010!J\b\u0010)\u001a\u00020\u0004H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020+H&J\u000f\u0010-\u001a\u0004\u0018\u00010+H&¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020+H&J\u0018\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\u001eH&J\b\u00104\u001a\u00020\u0004H&J\b\u00105\u001a\u00020\u0004H&J\u001e\u00106\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\bH&JD\u00109\u001a\u00020\u00042:\u0010\t\u001a6\u0012\u0013\u0012\u00110+¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u0004\u0018\u00010:H&J\u001a\u0010?\u001a\u00020\u00042\u0010\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001dH&J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020+H&J\u0012\u0010C\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010EH&J\u001a\u0010F\u001a\u00020\u00042\u0010\u0010G\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001dH&J\u0010\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020+H&J\u0012\u0010J\u001a\u00020\u00042\b\u0010K\u001a\u0004\u0018\u00010LH&J\b\u0010M\u001a\u00020\u0004H&J\b\u0010N\u001a\u00020\u0004H&J\u0012\u0010O\u001a\u00020\u00042\b\u0010K\u001a\u0004\u0018\u00010LH&J*\u0010P\u001a\u00020\u00042\u0006\u00107\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H&J\b\u0010R\u001a\u00020\u0004H&¨\u0006T"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView$IViewDelegate;", "beginShareInRoomMeeting", "", "changeShareContentOrCheckShareCode", "checkAndShareScreenToRoomByMeetingNumber", "meetingNumber", "", "callback", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "checkAndStartMeeting", "joinPath", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "shareCodeOrMeetingNumber", "shareCodeCallback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "meetingNumberCallback", "checkLocalMeeting", "checkShareCode", "clearCachedDocs", "createDoc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "dismissShareContentDialog", "finish", "getCachedDocsCopy", "", "Lcom/ss/android/vc/entity/VcDoc;", "getCachedDocsSize", "", "()Ljava/lang/Integer;", "getEnvId", "getShareDocUrl", "getShareRoomName", "getShareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getUserOpenedDocsCopy", "getUserOpenedDocsSize", "gotoShareCode", "isAutoConnectOpen", "", "isFollowViewEnable", "needUpdateCachedDocs", "()Ljava/lang/Boolean;", "onAutoConnectChanged", "open", "onDocItemClicked", "pos", "doc", "onMagicShareUnSupported", "onShareScreenClicked", "recordShareCode", "shareCode", "roomName", "registerUssRecvCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "success", "shareKey", "setCachedDocs", "cachedDocs", "setCachedDocsNeedUpdate", "needUpdate", "setDocListDialog", "dialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "setUserOpenedDocs", "userOpenedDocs", "setUssRecvResultInProcessing", "inProcessing", "shareScreenInRoomMeeting", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "showUssRecvLoadingPage", "showUssRecvResultConfirmDialog", "startFollowInRoomMeeting", "startShareMeetingByShareCode", "meetingId", "startUssReceive", "IViewDelegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0014H&J\u0010\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001dH&J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001dH&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000fH&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\u001e\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0014H&J\u001a\u0010+\u001a\u00020\u00032\u0010\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH&J\u001a\u0010/\u001a\u00020\u00032\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH&J\u0010\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u001dH&J\u0012\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000105H&J\u0012\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000105H&¨\u00067"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "beginShareInRoomMeeting", "", "changeShareContentOrCheckShareCode", "checkLocalMeeting", "checkShareCode", "clearCachedDocs", "createDoc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "callback", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "getCachedDocsCopy", "", "Lcom/ss/android/vc/entity/VcDoc;", "getCachedDocsSize", "", "()Ljava/lang/Integer;", "getEnvId", "", "getShareDocUrl", "getShareRoomName", "getShareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getSource", "getUserOpenedDocsCopy", "getUserOpenedDocsSize", "isAutoConnectOpen", "", "isFollowViewEnable", "needUpdateCachedDocs", "()Ljava/lang/Boolean;", "onAutoConnectChanged", "open", "onDocItemClicked", "pos", "doc", "onMagicShareUnSupported", "onShareScreenClicked", "recordShareCode", "shareCode", "roomName", "setCachedDocs", "cachedDocs", "setCachedDocsNeedUpdate", "needUpdate", "setUserOpenedDocs", "userOpenedDocs", "setUssRecvResultInProcessing", "inProcessing", "shareScreenInRoomMeeting", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "startFollowInRoomMeeting", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.sharebox.c$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            List<VcDoc> mo217811a();

            /* renamed from: a */
            void mo217812a(int i, VcDoc vcDoc);

            /* renamed from: a */
            void mo217813a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61751a.AbstractC61752a aVar);

            /* renamed from: a */
            void mo217814a(String str, String str2);

            /* renamed from: a */
            void mo217815a(List<? extends VcDoc> list);

            /* renamed from: a */
            void mo217816a(boolean z);

            /* renamed from: b */
            Integer mo217817b();

            /* renamed from: c */
            void mo217818c();

            /* renamed from: d */
            boolean mo217819d();

            /* renamed from: e */
            boolean mo217820e();

            /* renamed from: f */
            ShareScreenToRoomEntityRequest.ShareType mo217821f();

            /* renamed from: g */
            String mo217822g();

            /* renamed from: h */
            void mo217823h();

            /* renamed from: i */
            void mo217824i();

            /* renamed from: j */
            void mo217825j();

            /* renamed from: k */
            void mo217826k();

            /* renamed from: l */
            String mo217827l();

            /* renamed from: m */
            void mo217828m();
        }

        /* renamed from: a */
        List<VcDoc> mo217789a();

        /* renamed from: a */
        void mo217790a(int i, VcDoc vcDoc);

        /* renamed from: a */
        void mo217791a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61751a.AbstractC61752a aVar);

        /* renamed from: a */
        void mo217792a(ShareScreenToRoomEntityRequest.JoinPath joinPath, String str, AbstractC63598b<C60965at> bVar, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar);

        /* renamed from: a */
        void mo217793a(String str, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar);

        /* renamed from: a */
        void mo217794a(String str, String str2);

        /* renamed from: a */
        void mo217795a(String str, String str2, AbstractC63598b<C60965at> bVar);

        /* renamed from: a */
        void mo217796a(List<? extends VcDoc> list);

        /* renamed from: a */
        void mo217797a(Function2<? super Boolean, ? super String, Unit> kVar);

        /* renamed from: b */
        Integer mo217798b();

        /* renamed from: c */
        void mo217799c();

        /* renamed from: d */
        boolean mo217800d();

        /* renamed from: e */
        boolean mo217801e();

        /* renamed from: f */
        void mo217802f();

        /* renamed from: g */
        void mo217803g();

        /* renamed from: h */
        void mo217804h();

        /* renamed from: i */
        void mo217805i();

        /* renamed from: j */
        void mo217806j();

        /* renamed from: k */
        void mo217807k();

        /* renamed from: l */
        void mo217808l();

        /* renamed from: m */
        void mo217809m();

        /* renamed from: n */
        String mo217810n();
    }
}
