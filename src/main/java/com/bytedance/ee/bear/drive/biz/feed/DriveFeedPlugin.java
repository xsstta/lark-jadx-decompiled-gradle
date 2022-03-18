package com.bytedance.ee.bear.drive.biz.feed;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.drive.biz.comment.AbstractC6395l;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentVM;
import com.bytedance.ee.bear.drive.biz.comment.data.C6377b;
import com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenVM;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13604b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/feed/DriveFeedPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mDriveFeedManager", "Lcom/bytedance/ee/bear/drive/biz/feed/DriveFeedManager;", "createFeedManagerByPermission", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "instanceDefaultFeedManager", "Lcom/bytedance/ee/bear/drive/biz/feed/DefaultDriveFeedManager;", "onAttachPreview", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveFeedPlugin extends AbsDrivePlugin {
    public AbstractC6464e mDriveFeedManager;

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        AbstractC6464e eVar = this.mDriveFeedManager;
        if (eVar != null) {
            eVar.mo25830b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/IPreviewView;", "get"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.feed.DriveFeedPlugin$b */
    public static final class C6450b implements AbstractC6395l {

        /* renamed from: a */
        final /* synthetic */ DriveFeedPlugin f17817a;

        C6450b(DriveFeedPlugin driveFeedPlugin) {
            this.f17817a = driveFeedPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6395l
        /* renamed from: a */
        public final AbstractC7549a mo25510a() {
            DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) this.f17817a.findPlugin(DrivePreviewContentPlugin.class);
            if (drivePreviewContentPlugin != null) {
                return drivePreviewContentPlugin.currentPreviewView();
            }
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        createFeedManagerByPermission(((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5927b());
    }

    public final C6456c instanceDefaultFeedManager() {
        DriveCommentVM gVar = (DriveCommentVM) viewModel(DriveCommentVM.class);
        C6462d dVar = new C6462d(((DrivePluginHost) getHost()).mo27261l(), (DriveFullScreenVM) viewModel(DriveFullScreenVM.class), new C6450b(this), findViewById(R.id.drive_sdk_main_title_bar_root_fl));
        FragmentActivity activity = getActivity();
        C6937b l = ((DrivePluginHost) getHost()).mo27261l();
        DriveMGPermissionVM aVar = (DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class);
        DrivePluginHost aVar2 = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
        C7555f d = C6891a.m27236d(aVar2);
        FrameLayout frameLayout = (FrameLayout) getActivity().findViewById(16908290);
        C6377b commentDataManger = gVar.getCommentDataManger();
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        return new C6456c(activity, l, aVar, d, gVar, frameLayout, dVar, commentDataManger, f.mo27178g());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onFeedChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.feed.DriveFeedPlugin$a */
    public static final class C6449a implements AbstractC6464e.AbstractC6465a {

        /* renamed from: a */
        final /* synthetic */ DriveFeedVM f17816a;

        C6449a(DriveFeedVM fVar) {
            this.f17816a = fVar;
        }

        @Override // com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e.AbstractC6465a
        /* renamed from: a */
        public final void mo25820a(int i) {
            this.f17816a.getFeedCount().mo5926a(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.feed.DriveFeedPlugin$c */
    public static final class C6451c<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveFeedPlugin f17818a;

        C6451c(DriveFeedPlugin driveFeedPlugin) {
            this.f17818a = driveFeedPlugin;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            AbstractC6464e eVar;
            this.f17818a.createFeedManagerByPermission(bVar);
            if ((bVar == null || !bVar.mo26063i()) && (eVar = this.f17818a.mDriveFeedManager) != null) {
                eVar.mo25832d();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        ((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C6451c(this));
    }

    public final void createFeedManagerByPermission(C6522b bVar) {
        if (bVar == null) {
            C13479a.m54775e("DriveComponent", "createFeedManagerByPermission() but permission is null");
        } else if (bVar.mo26063i()) {
            AbstractC6464e eVar = this.mDriveFeedManager;
            if (eVar == null) {
                this.mDriveFeedManager = instanceDefaultFeedManager();
            } else if (eVar instanceof C6453b) {
                if (eVar != null) {
                    eVar.mo25830b();
                }
                this.mDriveFeedManager = instanceDefaultFeedManager();
            }
            DriveFeedVM fVar = (DriveFeedVM) viewModel(DriveFeedVM.class);
            fVar.setDriveFeedManager(this.mDriveFeedManager);
            AbstractC6464e eVar2 = this.mDriveFeedManager;
            if (eVar2 != null) {
                eVar2.mo25825a();
            }
            AbstractC6464e eVar3 = this.mDriveFeedManager;
            if (eVar3 != null) {
                eVar3.mo25826a(new C6449a(fVar));
            }
        } else {
            BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            if (openEntity == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity");
            } else if (C13604b.m55237a(((SpaceFileOpenEntity) openEntity).getUrl())) {
                AbstractC6464e eVar4 = this.mDriveFeedManager;
                if (eVar4 == null) {
                    FragmentActivity activity = getActivity();
                    C6937b l = ((DrivePluginHost) getHost()).mo27261l();
                    DriveMGPermissionVM aVar = (DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class);
                    DrivePluginHost aVar2 = (DrivePluginHost) getHost();
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
                    this.mDriveFeedManager = new C6453b(activity, l, aVar, C6891a.m27236d(aVar2), (DriveCommentVM) viewModel(DriveCommentVM.class), (FrameLayout) getActivity().findViewById(16908290));
                } else if (eVar4 instanceof C6456c) {
                    if (eVar4 != null) {
                        eVar4.mo25830b();
                    }
                    FragmentActivity activity2 = getActivity();
                    C6937b l2 = ((DrivePluginHost) getHost()).mo27261l();
                    DriveMGPermissionVM aVar3 = (DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class);
                    DrivePluginHost aVar4 = (DrivePluginHost) getHost();
                    Intrinsics.checkExpressionValueIsNotNull(aVar4, "host");
                    this.mDriveFeedManager = new C6453b(activity2, l2, aVar3, C6891a.m27236d(aVar4), (DriveCommentVM) viewModel(DriveCommentVM.class), (FrameLayout) getActivity().findViewById(16908290));
                }
                AbstractC6464e eVar5 = this.mDriveFeedManager;
                if (eVar5 != null) {
                    eVar5.mo25825a();
                }
            }
        }
    }
}
