package com.ss.android.vc.meeting.module.sharebox;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.localshare.LocalShareManager;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001:\u0002\r\u000eB\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePreparePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView$IViewDelegate;", "activity", "Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareActivity;", "(Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareActivity;)V", "getActivity", "()Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePrepareActivity;", "createModelDelegate", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel$IModelDelegate;", "createViewDelegate", "LocalSharePrepareModelDelegate", "LocalSharePrepareViewDelegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.k */
public final class LocalSharePreparePresenter extends BasePresenter<ILocalSharePrepareContract.IModel, ILocalSharePrepareContract.IView, ILocalSharePrepareContract.IView.IViewDelegate> {

    /* renamed from: a */
    private final LocalSharePrepareActivity f158867a;

    /* renamed from: b */
    private final ILocalSharePrepareContract.IModel.IModelDelegate m246849b() {
        return new LocalSharePrepareModelDelegate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ILocalSharePrepareContract.IView.IViewDelegate createViewDelegate() {
        return new LocalSharePrepareViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J*\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePreparePresenter$LocalSharePrepareModelDelegate;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IModel$IModelDelegate;", "(Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePreparePresenter;)V", "checkAndStartMeeting", "", "joinPath", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "shareCodeOrMeetingNumber", "", "shareCodeCallback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "meetingNumberCallback", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "dismissShareContentDialog", "finish", "getEnvId", "getSource", "gotoShareCode", "onMagicShareUnSupported", "showUssRecvLoadingPage", "showUssRecvResultConfirmDialog", "startShareMeeting", "shareCode", "meetingId", "callback", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.k$a */
    public final class LocalSharePrepareModelDelegate implements ILocalSharePrepareContract.IModel.IModelDelegate {
        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel.IModelDelegate
        /* renamed from: a */
        public void mo217783a() {
            ILocalSharePrepareContract.IView bVar = (ILocalSharePrepareContract.IView) LocalSharePreparePresenter.this.getView();
            if (bVar != null) {
                bVar.mo217802f();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel.IModelDelegate
        /* renamed from: b */
        public void mo217786b() {
            ILocalSharePrepareContract.IView bVar = (ILocalSharePrepareContract.IView) LocalSharePreparePresenter.this.getView();
            if (bVar != null) {
                bVar.mo217808l();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel.IModelDelegate
        /* renamed from: c */
        public void mo217787c() {
            ILocalSharePrepareContract.IView bVar = (ILocalSharePrepareContract.IView) LocalSharePreparePresenter.this.getView();
            if (bVar != null) {
                bVar.mo217803g();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel.IModelDelegate
        /* renamed from: d */
        public void mo217788d() {
            ILocalSharePrepareContract.IView bVar = (ILocalSharePrepareContract.IView) LocalSharePreparePresenter.this.getView();
            if (bVar != null) {
                bVar.mo217804h();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public LocalSharePrepareModelDelegate() {
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel.IModelDelegate
        /* renamed from: a */
        public void mo217785a(String str, String str2, AbstractC63598b<C60965at> bVar) {
            Intrinsics.checkParameterIsNotNull(str, "shareCode");
            ILocalSharePrepareContract.IView bVar2 = (ILocalSharePrepareContract.IView) LocalSharePreparePresenter.this.getView();
            if (bVar2 != null) {
                bVar2.mo217795a(str, str2, bVar);
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IModel.IModelDelegate
        /* renamed from: a */
        public void mo217784a(ShareScreenToRoomEntityRequest.JoinPath joinPath, String str, AbstractC63598b<C60965at> bVar, LocalShareManager.ICheckAndShareToRoomByMeetingNumber cVar) {
            Intrinsics.checkParameterIsNotNull(joinPath, "joinPath");
            Intrinsics.checkParameterIsNotNull(str, "shareCodeOrMeetingNumber");
            ILocalSharePrepareContract.IView bVar2 = (ILocalSharePrepareContract.IView) LocalSharePreparePresenter.this.getView();
            if (bVar2 != null) {
                bVar2.mo217792a(joinPath, str, bVar, cVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u000f\u0010 \u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001eH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u001c\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010,\u001a\u00020\u00042\u0010\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u001eH\u0016J\u001a\u00100\u001a\u00020\u00042\u0010\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u001eH\u0016J\u0012\u00104\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u000106H\u0016¨\u00068"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePreparePresenter$LocalSharePrepareViewDelegate;", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView$IViewDelegate;", "(Lcom/ss/android/vc/meeting/module/sharebox/LocalSharePreparePresenter;)V", "beginShareInRoomMeeting", "", "changeShareContentOrCheckShareCode", "checkLocalMeeting", "checkShareCode", "clearCachedDocs", "createDoc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "callback", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "getCachedDocsCopy", "", "Lcom/ss/android/vc/entity/VcDoc;", "getCachedDocsSize", "", "()Ljava/lang/Integer;", "getEnvId", "", "getShareDocUrl", "getShareRoomName", "getShareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getSource", "getUserOpenedDocsCopy", "getUserOpenedDocsSize", "isAutoConnectOpen", "", "isFollowViewEnable", "needUpdateCachedDocs", "()Ljava/lang/Boolean;", "onAutoConnectChanged", "open", "onDocItemClicked", "pos", "doc", "onMagicShareUnSupported", "onShareScreenClicked", "recordShareCode", "shareCode", "roomName", "setCachedDocs", "cachedDocs", "setCachedDocsNeedUpdate", "needUpdate", "setUserOpenedDocs", "userOpenedDocs", "setUssRecvResultInProcessing", "inProcessing", "shareScreenInRoomMeeting", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "startFollowInRoomMeeting", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.k$b */
    public final class LocalSharePrepareViewDelegate implements ILocalSharePrepareContract.IView.IViewDelegate {
        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: c */
        public void mo217818c() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217774e();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: h */
        public void mo217823h() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217777h();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: i */
        public void mo217824i() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217779j();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: j */
        public void mo217825j() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217780k();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: k */
        public void mo217826k() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217781l();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: m */
        public void mo217828m() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217782m();
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: a */
        public List<VcDoc> mo217811a() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217764a();
            }
            return null;
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: b */
        public Integer mo217817b() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217771b();
            }
            return null;
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: d */
        public boolean mo217819d() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217772c();
            }
            return false;
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: e */
        public boolean mo217820e() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217773d();
            }
            return true;
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: f */
        public ShareScreenToRoomEntityRequest.ShareType mo217821f() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217775f();
            }
            return null;
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: g */
        public String mo217822g() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217776g();
            }
            return null;
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: l */
        public String mo217827l() {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                return aVar.mo217778i();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public LocalSharePrepareViewDelegate() {
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo217815a(List<? extends VcDoc> list) {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217769a(list);
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo217816a(boolean z) {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217770a(z);
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo217813a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61751a.AbstractC61752a aVar) {
            ILocalSharePrepareContract.IModel aVar2 = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar2 != null) {
                aVar2.mo217766a(createDocType, aVar);
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo217812a(int i, VcDoc vcDoc) {
            Intrinsics.checkParameterIsNotNull(vcDoc, "doc");
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217765a(i, vcDoc);
            }
        }

        @Override // com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo217814a(String str, String str2) {
            ILocalSharePrepareContract.IModel aVar = (ILocalSharePrepareContract.IModel) LocalSharePreparePresenter.this.getModel();
            if (aVar != null) {
                aVar.mo217768a(str, str2);
            }
        }
    }

    public LocalSharePreparePresenter(LocalSharePrepareActivity localSharePrepareActivity) {
        this.f158867a = localSharePrepareActivity;
        LocalSharePrepareModel iVar = new LocalSharePrepareModel();
        LocalSharePrepareView lVar = new LocalSharePrepareView(localSharePrepareActivity);
        lVar.setViewDelegate(createViewDelegate());
        iVar.mo217767a(m246849b());
        setModel(iVar);
        setView(lVar);
    }
}
