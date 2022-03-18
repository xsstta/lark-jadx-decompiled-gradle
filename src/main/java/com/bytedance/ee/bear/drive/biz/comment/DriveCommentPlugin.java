package com.bytedance.ee.bear.drive.biz.comment;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.biz.comment.C6382h;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.comment.data.C6377b;
import com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin;
import com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView;
import com.bytedance.ee.bear.drive.biz.feed.AbstractC6464e;
import com.bytedance.ee.bear.drive.biz.feed.C6462d;
import com.bytedance.ee.bear.drive.biz.feed.DriveFeedVM;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenVM;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6724a;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.DrivePreviewViewPager;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7552c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/comment/DriveCommentPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mCommentWrapper", "Lcom/bytedance/ee/bear/drive/biz/comment/DriveCommentWrapper;", "mLoadListener", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachPreview", "setupCommentIfNeed", "setupState", "permissionVM", "Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionVM;", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveCommentPlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);
    public C6382h mCommentWrapper;
    private IFileLoader.LoadListener mLoadListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/comment/DriveCommentPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$m */
    public static final class C6354m<T> implements AbstractC7552c<Integer> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentVM f17601a;

        C6354m(DriveCommentVM gVar) {
            this.f17601a = gVar;
        }

        /* renamed from: b */
        public final int mo25523b() {
            return this.f17601a.getCommentPanelDefaultHeight();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7552c
        /* renamed from: a */
        public /* synthetic */ Integer mo25522a() {
            return Integer.valueOf(mo25523b());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$t */
    public static final class C6361t<T> implements AbstractC7552c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17610a;

        C6361t(DriveCommentPlugin driveCommentPlugin) {
            this.f17610a = driveCommentPlugin;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7552c
        /* renamed from: a */
        public /* synthetic */ Boolean mo25522a() {
            return Boolean.valueOf(mo25530b());
        }

        /* renamed from: b */
        public final boolean mo25530b() {
            C6382h hVar = this.f17610a.mCommentWrapper;
            if (hVar == null || !hVar.mo25654i()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/IPreviewView;", "get"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$b */
    static final class C6343b implements AbstractC6395l {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17588a;

        C6343b(DriveCommentPlugin driveCommentPlugin) {
            this.f17588a = driveCommentPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6395l
        /* renamed from: a */
        public final AbstractC7549a mo25510a() {
            DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) this.f17588a.findPlugin(DrivePreviewContentPlugin.class);
            if (drivePreviewContentPlugin != null) {
                return drivePreviewContentPlugin.currentPreviewView();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/IPreviewView;", "get"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$g */
    static final class C6348g implements AbstractC6395l {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17593a;

        C6348g(DriveCommentPlugin driveCommentPlugin) {
            this.f17593a = driveCommentPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.biz.comment.AbstractC6395l
        /* renamed from: a */
        public final AbstractC7549a mo25510a() {
            DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) this.f17593a.findPlugin(DrivePreviewContentPlugin.class);
            if (drivePreviewContentPlugin != null) {
                return drivePreviewContentPlugin.currentPreviewView();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/comment/DriveCommentPlugin$onAttachPreview$6", "Lcom/bytedance/ee/bear/drive/biz/extra_info/FileExtraInfoView$OnCommentListener;", "onClickCommentInfo", "", "commentCount", "", "onClickInput", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$f */
    public static final class C6347f implements FileExtraInfoView.AbstractC6435a {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17592a;

        @Override // com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView.AbstractC6435a
        /* renamed from: a */
        public void mo25515a() {
            C6382h hVar = this.f17592a.mCommentWrapper;
            if (hVar != null) {
                hVar.mo25649d(false);
            }
            DrivePluginHost aVar = (DrivePluginHost) this.f17592a.getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27229a(aVar).mo27949d(((DrivePluginHost) this.f17592a.getHost()).mo27261l().getFileModel(), "input", "ccm_comment_view");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6347f(DriveCommentPlugin driveCommentPlugin) {
            this.f17592a = driveCommentPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView.AbstractC6435a
        /* renamed from: a */
        public void mo25516a(int i) {
            if (i > 0) {
                C6382h hVar = this.f17592a.mCommentWrapper;
                if (hVar != null) {
                    hVar.mo25655j();
                }
            } else {
                C6382h hVar2 = this.f17592a.mCommentWrapper;
                if (hVar2 != null) {
                    hVar2.mo25649d(false);
                }
            }
            DrivePluginHost aVar = (DrivePluginHost) this.f17592a.getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27229a(aVar).mo27949d(((DrivePluginHost) this.f17592a.getHost()).mo27261l().getFileModel(), Comment.f24093e, "ccm_comment_view");
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        IFileLoader.LoadListener aVar = this.mLoadListener;
        if (aVar != null) {
            ((DrivePluginHost) getHost()).mo27262m().mo27299b(aVar);
        }
        C6382h hVar = this.mCommentWrapper;
        if (hVar != null) {
            hVar.mo25632a();
        }
        C6382h hVar2 = this.mCommentWrapper;
        if (hVar2 != null) {
            hVar2.mo25651f();
        }
    }

    public final void setupCommentIfNeed() {
        C6522b bVar;
        LiveData<C6522b> livePerm;
        C6382h hVar = this.mCommentWrapper;
        if (hVar != null) {
            C6937b l = ((DrivePluginHost) getHost()).mo27261l();
            DriveMGPermissionVM aVar = (DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class);
            if (aVar == null || (livePerm = aVar.livePerm()) == null) {
                bVar = null;
            } else {
                bVar = livePerm.mo5927b();
            }
            hVar.mo25636a(l, bVar);
        }
        C6382h hVar2 = this.mCommentWrapper;
        if (hVar2 != null) {
            hVar2.mo25647d();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        FileExtraInfoView fileExtraInfoView;
        C6738g vcManager;
        C6724a d;
        super.onAttachPreview();
        DriveCommentVM gVar = (DriveCommentVM) viewModel(DriveCommentVM.class);
        C6462d dVar = new C6462d(((DrivePluginHost) getHost()).mo27261l(), (DriveFullScreenVM) viewModel(DriveFullScreenVM.class), new C6348g(this), findViewById(R.id.drive_sdk_main_title_bar_root_fl));
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C7555f d2 = C6891a.m27236d(aVar);
        FragmentActivity activity = getActivity();
        C6343b bVar = new C6343b(this);
        C6377b commentDataManger = gVar.getCommentDataManger();
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        this.mCommentWrapper = new C6382h(gVar, d2, activity, bVar, commentDataManger, f.mo27168c(), (FrameLayout) getActivity().findViewById(16908290), dVar);
        IFileLoader m = ((DrivePluginHost) getHost()).mo27262m();
        C6344c cVar = new C6344c(this);
        this.mLoadListener = cVar;
        m.mo27297a(cVar);
        DriveFeedVM fVar = (DriveFeedVM) viewModel(DriveFeedVM.class);
        C6382h hVar = this.mCommentWrapper;
        if (hVar != null) {
            hVar.mo25635a(new C6345d(fVar));
        }
        C6382h hVar2 = this.mCommentWrapper;
        if (hVar2 != null) {
            hVar2.mo25634a(new C6346e(fVar));
        }
        DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin = (DriveSpaceFileExtraInfoViewPlugin) findPlugin(DriveSpaceFileExtraInfoViewPlugin.class);
        if (driveSpaceFileExtraInfoViewPlugin != null) {
            fileExtraInfoView = driveSpaceFileExtraInfoViewPlugin.getFileExtraView();
        } else {
            fileExtraInfoView = null;
        }
        if (fileExtraInfoView != null) {
            fileExtraInfoView.setOnCommentListener(new C6347f(this));
        }
        DriveVCFollowPlugin driveVCFollowPlugin = (DriveVCFollowPlugin) findPlugin(DriveVCFollowPlugin.class);
        if (driveVCFollowPlugin != null && (vcManager = driveVCFollowPlugin.getVcManager()) != null && (d = vcManager.mo26516d()) != null) {
            d.mo26470a(this.mCommentWrapper);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J%\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u0001H\u0007H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/drive/biz/comment/DriveCommentPlugin$onAttachPreview$2", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "onInfo", "T", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$c */
    public static final class C6344c extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17589a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6344c(DriveCommentPlugin driveCommentPlugin) {
            this.f17589a = driveCommentPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            int i = C6381f.f17663a[errCode.ordinal()];
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            C6382h hVar;
            Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
            super.mo25512a(dVar);
            if (dVar.mo29497p() == 2 && (hVar = this.f17589a.mCommentWrapper) != null) {
                hVar.mo25645c(true);
            }
            C6382h hVar2 = this.f17589a.mCommentWrapper;
            if (hVar2 != null) {
                hVar2.mo25652g();
            }
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            C6382h hVar;
            C7086a aVar;
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode != InfoCode.FileInfoSuccess || !(t instanceof C7086a)) {
                boolean z = true;
                if (infoCode == InfoCode.FileNotChange) {
                    C6382h hVar2 = this.f17589a.mCommentWrapper;
                    if (hVar2 != null) {
                        DrivePluginHost aVar2 = (DrivePluginHost) this.f17589a.getHost();
                        Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
                        C1177w<Boolean> liveInnerAreaCommentEnableState = C6891a.m27236d(aVar2).liveInnerAreaCommentEnableState();
                        Intrinsics.checkExpressionValueIsNotNull(liveInnerAreaCommentEnableState, "host.previewViewModel().…rAreaCommentEnableState()");
                        if (!Intrinsics.areEqual((Object) liveInnerAreaCommentEnableState.mo5927b(), (Object) true) || (aVar = (C7086a) ((DrivePluginHost) this.f17589a.getHost()).mo27261l().getFileModel()) == null || !aVar.mo27706y()) {
                            z = false;
                        }
                        hVar2.mo25639a(z);
                    }
                } else if (infoCode == InfoCode.HitCache) {
                    if ((t instanceof AbstractC6946a) && t.mo27349p() == 2 && (hVar = this.f17589a.mCommentWrapper) != null) {
                        hVar.mo25645c(true);
                    }
                    C6382h hVar3 = this.f17589a.mCommentWrapper;
                    if (hVar3 != null) {
                        hVar3.mo25652g();
                    }
                }
            } else {
                this.f17589a.setupCommentIfNeed();
                DrivePluginHost aVar3 = (DrivePluginHost) this.f17589a.getHost();
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "host");
                C6891a.m27236d(aVar3).liveOuterSupportAreaComment().mo5926a(Boolean.valueOf(t.mo27706y()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/comment/area/CommentRectF;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$l */
    public static final class C6353l<T> implements AbstractC1178x<CommentRectF> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17600a;

        C6353l(DriveCommentPlugin driveCommentPlugin) {
            this.f17600a = driveCommentPlugin;
        }

        /* renamed from: a */
        public final void onChanged(CommentRectF commentRectF) {
            C6382h hVar;
            if (commentRectF != null && (hVar = this.f17600a.mCommentWrapper) != null) {
                hVar.mo25633a(commentRectF, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "messageIds", "", "", "readMessage"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$e */
    static final class C6346e implements C6382h.AbstractC6390c {

        /* renamed from: a */
        final /* synthetic */ DriveFeedVM f17591a;

        C6346e(DriveFeedVM fVar) {
            this.f17591a = fVar;
        }

        @Override // com.bytedance.ee.bear.drive.biz.comment.C6382h.AbstractC6390c
        /* renamed from: a */
        public final void mo25514a(List<String> list) {
            if (this.f17591a.getDriveFeedManager() != null) {
                AbstractC6464e driveFeedManager = this.f17591a.getDriveFeedManager();
                if (driveFeedManager != null) {
                    driveFeedManager.mo25828a(list);
                    return;
                }
                return;
            }
            C13479a.m54758a("DriveComponent_DriveCommentPlugin", "readMessage failed! mDriveFeedManager is null!");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$i */
    public static final class C6350i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17596a;

        C6350i(DrivePluginHost aVar) {
            this.f17596a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C6891a.m27236d(this.f17596a).liveOuterDisableShowComment().mo5926a(Boolean.valueOf(Intrinsics.areEqual((Object) bool, (Object) true)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$o */
    public static final class C6356o<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17605a;

        C6356o(DriveCommentPlugin driveCommentPlugin) {
            this.f17605a = driveCommentPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C6382h hVar = this.f17605a.mCommentWrapper;
            if (hVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                hVar.mo25643b(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$p */
    public static final class C6357p<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17606a;

        C6357p(DriveCommentPlugin driveCommentPlugin) {
            this.f17606a = driveCommentPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            DrivePreviewViewPager drivePreviewViewPager = (DrivePreviewViewPager) this.f17606a.findViewById(R.id.drive_sdk_preview_viewpager);
            if (drivePreviewViewPager != null) {
                drivePreviewViewPager.setEnableSwipe(Intrinsics.areEqual((Object) bool, (Object) true));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "commentRectF", "Lcom/bytedance/ee/bear/drive/biz/comment/area/CommentRectF;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$q */
    public static final class C6358q<T> implements AbstractC1178x<CommentRectF> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17607a;

        C6358q(DriveCommentPlugin driveCommentPlugin) {
            this.f17607a = driveCommentPlugin;
        }

        /* renamed from: a */
        public final void onChanged(CommentRectF commentRectF) {
            if (commentRectF == null) {
                C6382h hVar = this.f17607a.mCommentWrapper;
                if (hVar != null) {
                    hVar.mo25653h();
                    return;
                }
                return;
            }
            C6382h hVar2 = this.f17607a.mCommentWrapper;
            if (hVar2 != null) {
                hVar2.mo25633a(commentRectF, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$r */
    public static final class C6359r<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17608a;

        C6359r(DriveCommentPlugin driveCommentPlugin) {
            this.f17608a = driveCommentPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Void r2) {
            C6382h hVar;
            C6382h hVar2 = this.f17608a.mCommentWrapper;
            if (hVar2 != null && hVar2.mo25654i() && (hVar = this.f17608a.mCommentWrapper) != null) {
                hVar.mo25653h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$s */
    public static final class C6360s<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17609a;

        C6360s(DriveCommentPlugin driveCommentPlugin) {
            this.f17609a = driveCommentPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C6382h hVar = this.f17609a.mCommentWrapper;
            if (hVar != null) {
                hVar.mo25649d(Intrinsics.areEqual((Object) bool, (Object) true));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$h */
    public static final class C6349h<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17594a;

        /* renamed from: b */
        final /* synthetic */ DriveMGPermissionVM f17595b;

        C6349h(DriveCommentPlugin driveCommentPlugin, DriveMGPermissionVM aVar) {
            this.f17594a = driveCommentPlugin;
            this.f17595b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            C6382h hVar;
            DriveCommentPlugin driveCommentPlugin = this.f17594a;
            DriveMGPermissionVM aVar = this.f17595b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "permissionVM");
            driveCommentPlugin.setupState(aVar);
            this.f17594a.setupCommentIfNeed();
            if ((bVar == null || !bVar.mo26063i()) && (hVar = this.f17594a.mCommentWrapper) != null) {
                hVar.mo25632a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$j */
    public static final class C6351j<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17597a;

        C6351j(DrivePluginHost aVar) {
            this.f17597a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                C6891a.m27236d(this.f17597a).liveOuterCommentable().mo5926a((Boolean) false);
                C6891a.m27236d(this.f17597a).liveOuterSupportAreaComment().mo5926a((Boolean) false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$k */
    public static final class C6352k<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17598a;

        /* renamed from: b */
        final /* synthetic */ DriveMGPermissionVM f17599b;

        C6352k(DriveCommentPlugin driveCommentPlugin, DriveMGPermissionVM aVar) {
            this.f17598a = driveCommentPlugin;
            this.f17599b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            FileExtraInfoView fileExtraInfoView;
            DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin = (DriveSpaceFileExtraInfoViewPlugin) this.f17598a.findPlugin(DriveSpaceFileExtraInfoViewPlugin.class);
            if (driveSpaceFileExtraInfoViewPlugin != null) {
                fileExtraInfoView = driveSpaceFileExtraInfoViewPlugin.getFileExtraView();
            } else {
                fileExtraInfoView = null;
            }
            if (fileExtraInfoView != null) {
                Intrinsics.checkExpressionValueIsNotNull(num, "it");
                fileExtraInfoView.mo25773a(num.intValue());
            }
            DriveCommentPlugin driveCommentPlugin = this.f17598a;
            DriveMGPermissionVM aVar = this.f17599b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "permissionVM");
            driveCommentPlugin.setupState(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$u */
    public static final class C6362u<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17611a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17612b;

        C6362u(DriveCommentPlugin driveCommentPlugin, DrivePluginHost aVar) {
            this.f17611a = driveCommentPlugin;
            this.f17612b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C7086a aVar;
            C6382h hVar = this.f17611a.mCommentWrapper;
            if (hVar != null) {
                boolean z = true;
                if (!Intrinsics.areEqual((Object) bool, (Object) true) || (aVar = (C7086a) this.f17612b.mo27261l().getFileModel()) == null || !aVar.mo27706y()) {
                    z = false;
                }
                hVar.mo25639a(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$n */
    public static final class C6355n<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveCommentPlugin f17602a;

        /* renamed from: b */
        final /* synthetic */ DriveMGPermissionVM f17603b;

        /* renamed from: c */
        final /* synthetic */ DrivePluginHost f17604c;

        C6355n(DriveCommentPlugin driveCommentPlugin, DriveMGPermissionVM aVar, DrivePluginHost aVar2) {
            this.f17602a = driveCommentPlugin;
            this.f17603b = aVar;
            this.f17604c = aVar2;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            DriveCommentPlugin driveCommentPlugin = this.f17602a;
            DriveMGPermissionVM aVar = this.f17603b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "permissionVM");
            driveCommentPlugin.setupState(aVar);
            C6382h hVar = this.f17602a.mCommentWrapper;
            if (hVar != null) {
                hVar.mo25647d();
            }
            C1177w<Boolean> liveOuterDisableShowComment = C6891a.m27236d(this.f17604c).liveOuterDisableShowComment();
            boolean z = true;
            if (networkState != null && networkState.mo20041b() && !Intrinsics.areEqual((Object) ((DriveFullScreenVM) this.f17602a.viewModel(DriveFullScreenVM.class)).getLiveFullScreen().mo5927b(), (Object) true)) {
                z = false;
            }
            liveOuterDisableShowComment.mo5926a(Boolean.valueOf(z));
        }
    }

    public final void setupState(DriveMGPermissionVM aVar) {
        boolean z;
        boolean z2;
        FileExtraInfoView fileExtraInfoView;
        boolean a = C6891a.m27233a((AbsDrivePlugin) this);
        C6522b b = aVar.livePerm().mo5927b();
        boolean z3 = false;
        if (b == null || !b.mo26060f() || ((DrivePluginHost) getHost()).mo27261l().isHistoryMode()) {
            z = false;
        } else {
            z = true;
        }
        DrivePluginHost aVar2 = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
        C1177w<Boolean> liveOuterCommentable = C6891a.m27236d(aVar2).liveOuterCommentable();
        if (!a || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        liveOuterCommentable.mo5926a(Boolean.valueOf(z2));
        DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin = (DriveSpaceFileExtraInfoViewPlugin) findPlugin(DriveSpaceFileExtraInfoViewPlugin.class);
        if (driveSpaceFileExtraInfoViewPlugin != null) {
            fileExtraInfoView = driveSpaceFileExtraInfoViewPlugin.getFileExtraView();
        } else {
            fileExtraInfoView = null;
        }
        if (fileExtraInfoView != null) {
            if (a && z) {
                z3 = true;
            }
            fileExtraInfoView.setCommentEnterState(z3);
        }
        if (fileExtraInfoView != null) {
            fileExtraInfoView.mo25775a(a, z);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        DriveMGPermissionVM aVar2 = (DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class);
        aVar2.livePerm().mo5923a(getLifecycleOwner(), new C6349h(this, aVar2));
        C6891a.m27232a(this, new C6355n(this, aVar2, aVar));
        C6891a.m27236d(aVar).liveInnerInterceptMaskClick().mo5923a(getLifecycleOwner(), new C6356o(this));
        C6891a.m27236d(aVar).liveInnerSetSwipeEnable().mo5923a(getLifecycleOwner(), new C6357p(this));
        C6891a.m27236d(aVar).liveInnerCommentSelected().mo5923a(getLifecycleOwner(), new C6358q(this));
        C6891a.m27236d(aVar).liveInnerSingleTap().mo5923a(getLifecycleOwner(), new C6359r(this));
        C6891a.m27236d(aVar).liveInnerCreateNewComment().mo5923a(getLifecycleOwner(), new C6360s(this));
        C6891a.m27236d(aVar).liveOuterCommentCardVisible().mo5926a(new C6361t(this));
        C6891a.m27236d(aVar).liveInnerAreaCommentEnableState().mo5923a(getLifecycleOwner(), new C6362u(this, aVar));
        ((DriveFullScreenVM) viewModel(DriveFullScreenVM.class)).getLiveFullScreen().mo5923a(getLifecycleOwner(), new C6350i(aVar));
        aVar.mo27261l().liveHistoryMode().mo5923a(getLifecycleOwner(), new C6351j(aVar));
        DriveCommentVM gVar = (DriveCommentVM) viewModel(DriveCommentVM.class);
        gVar.getLiveCommentCount().mo5923a(getLifecycleOwner(), new C6352k(this, aVar2));
        gVar.getLiveFeedSelectedComment().mo5923a(getLifecycleOwner(), new C6353l(this));
        C6891a.m27236d(aVar).liveOuterNotPreviewContentHeight().mo5926a(new C6354m(gVar));
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) aVar, nVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "enter", "", "close", "toComment"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin$d */
    static final class C6345d implements C6382h.AbstractC6391d {

        /* renamed from: a */
        final /* synthetic */ DriveFeedVM f17590a;

        C6345d(DriveFeedVM fVar) {
            this.f17590a = fVar;
        }

        @Override // com.bytedance.ee.bear.drive.biz.comment.C6382h.AbstractC6391d
        /* renamed from: a */
        public final void mo25513a(boolean z, boolean z2) {
            AbstractC6464e driveFeedManager;
            if (this.f17590a.getDriveFeedManager() != null && (driveFeedManager = this.f17590a.getDriveFeedManager()) != null) {
                driveFeedManager.mo25829a(z, z2);
            }
        }
    }
}
