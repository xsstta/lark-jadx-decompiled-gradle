package com.bytedance.ee.bear.drive.biz.extra_info;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentVM;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenVM;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0017J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/extra_info/DriveSpaceFileExtraInfoViewPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "mExtraInfoView", "Lcom/bytedance/ee/bear/drive/biz/extra_info/FileExtraInfoView;", "mMainPageRootRl", "Landroid/view/ViewGroup;", "ensureFileExtraView", "", "findMainPageRoot", "getFileExtraView", "onAttachPreview", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileExtraInfoViewPlugin extends AbsDrivePreviewPlugin {
    public FileExtraInfoView mExtraInfoView;
    private ViewGroup mMainPageRootRl;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin$f */
    public static final class RunnableC6432f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileExtraInfoViewPlugin f17776a;

        RunnableC6432f(DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin) {
            this.f17776a = driveSpaceFileExtraInfoViewPlugin;
        }

        public final void run() {
            FileExtraInfoView fileExtraInfoView = this.f17776a.mExtraInfoView;
            if (fileExtraInfoView != null) {
                fileExtraInfoView.setVisibility(8);
            }
        }
    }

    public FileExtraInfoView getFileExtraView() {
        ensureFileExtraView();
        FileExtraInfoView fileExtraInfoView = this.mExtraInfoView;
        if (fileExtraInfoView == null) {
            Intrinsics.throwNpe();
        }
        return fileExtraInfoView;
    }

    private final void findMainPageRoot() {
        if (this.mMainPageRootRl == null) {
            this.mMainPageRootRl = (ViewGroup) findViewById(R.id.main_page_holder_view);
        }
        if (this.mMainPageRootRl == null) {
            C13479a.m54758a("DriveComponent", "DriveSpaceFileExtraInfoViewPlugin() find mainPageRootRl null");
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        FileExtraInfoView fileExtraInfoView = this.mExtraInfoView;
        if (fileExtraInfoView != null) {
            fileExtraInfoView.mo25772a();
            ViewGroup viewGroup = this.mMainPageRootRl;
            if (viewGroup != null) {
                viewGroup.removeView(fileExtraInfoView);
            }
        }
    }

    public final void ensureFileExtraView() {
        findMainPageRoot();
        if (this.mExtraInfoView == null) {
            this.mExtraInfoView = new FileExtraInfoView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            FileExtraInfoView fileExtraInfoView = this.mExtraInfoView;
            if (fileExtraInfoView != null) {
                fileExtraInfoView.setLayoutParams(layoutParams);
            }
            FileExtraInfoView fileExtraInfoView2 = this.mExtraInfoView;
            if (fileExtraInfoView2 != null) {
                fileExtraInfoView2.setVisibility(0);
            }
            FileExtraInfoView fileExtraInfoView3 = this.mExtraInfoView;
            if (fileExtraInfoView3 != null) {
                fileExtraInfoView3.setId(R.id.drive_extra_fileinfo);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        ViewGroup viewGroup;
        super.onAttachPreview();
        ensureFileExtraView();
        FileExtraInfoView fileExtraInfoView = this.mExtraInfoView;
        if (fileExtraInfoView != null) {
            fileExtraInfoView.mo25774a(((DrivePluginHost) getHost()).mo27261l(), !Intrinsics.areEqual((Object) ((DriveFullScreenVM) new C1144ai(getActivity()).mo6005a(DriveFullScreenVM.class)).getLiveFullScreen().mo5927b(), (Object) true));
            if (fileExtraInfoView.getParent() == null && (viewGroup = this.mMainPageRootRl) != null) {
                viewGroup.addView(fileExtraInfoView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin$a */
    public static final class C6427a<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileExtraInfoViewPlugin f17770a;

        C6427a(DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin) {
            this.f17770a = driveSpaceFileExtraInfoViewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f17770a.ensureFileExtraView();
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                FileExtraInfoView fileExtraInfoView = this.f17770a.mExtraInfoView;
                if (fileExtraInfoView != null) {
                    fileExtraInfoView.setVisibility(8);
                    return;
                }
                return;
            }
            FileExtraInfoView fileExtraInfoView2 = this.f17770a.mExtraInfoView;
            if (fileExtraInfoView2 != null) {
                fileExtraInfoView2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin$b */
    public static final class C6428b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileExtraInfoViewPlugin f17771a;

        C6428b(DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin) {
            this.f17771a = driveSpaceFileExtraInfoViewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                FileExtraInfoView fileExtraInfoView = this.f17771a.mExtraInfoView;
                if (fileExtraInfoView != null) {
                    fileExtraInfoView.setVisibility(8);
                    return;
                }
                return;
            }
            FileExtraInfoView fileExtraInfoView2 = this.f17771a.mExtraInfoView;
            if (fileExtraInfoView2 != null) {
                fileExtraInfoView2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin$c */
    public static final class C6429c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileExtraInfoViewPlugin f17772a;

        /* renamed from: b */
        final /* synthetic */ DriveFullScreenVM f17773b;

        C6429c(DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin, DriveFullScreenVM bVar) {
            this.f17772a = driveSpaceFileExtraInfoViewPlugin;
            this.f17773b = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            FileExtraInfoView fileExtraInfoView;
            if (Intrinsics.areEqual((Object) bool, (Object) false) && (!Intrinsics.areEqual((Object) this.f17773b.getLiveFullScreen().mo5927b(), (Object) true)) && (fileExtraInfoView = this.f17772a.mExtraInfoView) != null) {
                fileExtraInfoView.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin$d */
    public static final class C6430d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileExtraInfoViewPlugin f17774a;

        C6430d(DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin) {
            this.f17774a = driveSpaceFileExtraInfoViewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                FileExtraInfoView fileExtraInfoView = this.f17774a.mExtraInfoView;
                if (fileExtraInfoView != null) {
                    fileExtraInfoView.setVisibility(0);
                    return;
                }
                return;
            }
            FileExtraInfoView fileExtraInfoView2 = this.f17774a.mExtraInfoView;
            if (fileExtraInfoView2 != null) {
                fileExtraInfoView2.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin$e */
    public static final class C6431e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileExtraInfoViewPlugin f17775a;

        C6431e(DriveSpaceFileExtraInfoViewPlugin driveSpaceFileExtraInfoViewPlugin) {
            this.f17775a = driveSpaceFileExtraInfoViewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                FileExtraInfoView fileExtraInfoView = this.f17775a.mExtraInfoView;
                if (fileExtraInfoView != null) {
                    fileExtraInfoView.setVisibility(8);
                    return;
                }
                return;
            }
            FileExtraInfoView fileExtraInfoView2 = this.f17775a.mExtraInfoView;
            if (fileExtraInfoView2 != null) {
                fileExtraInfoView2.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        AbstractC1142af a = new C1144ai(getActivity()).mo6005a(DriveFullScreenVM.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(activi…FullScreenVM::class.java)");
        DriveFullScreenVM bVar = (DriveFullScreenVM) a;
        bVar.getLiveFullScreen().mo5923a(getLifecycleOwner(), new C6427a(this));
        C6891a.m27236d(aVar).liveInnerVideoFullScreen().mo5923a(getLifecycleOwner(), new C6428b(this));
        C6891a.m27236d(aVar).liveInnerThumbVisibleState().mo5923a(getLifecycleOwner(), new C6429c(this, bVar));
        C6891a.m27236d(aVar).liveInnerExtraViewVisible().mo5923a(getLifecycleOwner(), new C6430d(this));
        ((DriveCommentVM) viewModel(DriveCommentVM.class)).getCommentPanelShowing().mo5923a(getLifecycleOwner(), new C6431e(this));
        addErrorHandler(new RunnableC6432f(this), ErrCode.OWNER_DELETED_FILE, ErrCode.FILE_NOT_FOUND);
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
    }
}
