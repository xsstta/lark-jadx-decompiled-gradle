package com.bytedance.ee.bear.drive.biz.wps;

import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.loadingview.BlockLoadingView;
import com.bytedance.ee.bear.drive.view.preview.wps.C7529g;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/wps/DriveWPSLoadingPlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "()V", "loadingView", "Lcom/bytedance/ee/bear/drive/view/preview/loadingview/BlockLoadingView;", "getLoadingView", "()Lcom/bytedance/ee/bear/drive/view/preview/loadingview/BlockLoadingView;", "setLoadingView", "(Lcom/bytedance/ee/bear/drive/view/preview/loadingview/BlockLoadingView;)V", "dismissLoadingView", "", "onAttachToHost", "host", "setupLoadingView", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveWPSLoadingPlugin extends BasePlugin<DrivePluginHost> {
    public static final Companion Companion = new Companion(null);
    private BlockLoadingView loadingView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/wps/DriveWPSLoadingPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSLoadingPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final BlockLoadingView getLoadingView() {
        return this.loadingView;
    }

    public final void dismissLoadingView() {
        if (this.loadingView != null) {
            getUIContainer().mo19594b(this, this.loadingView);
        }
    }

    public final void setupLoadingView() {
        boolean z;
        LiveData<Integer> livePreviewType = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
        Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
        Integer b = livePreviewType.mo5927b();
        boolean z2 = true;
        if (b != null && b.intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        AbstractC6946a fileModel = ((DrivePluginHost) getHost()).mo27261l().getFileModel();
        if (fileModel == null || fileModel.mo27349p() != 2) {
            z2 = false;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z && z2) {
            BlockLoadingView blockLoadingView = new BlockLoadingView(getContext());
            this.loadingView = blockLoadingView;
            if (blockLoadingView != null) {
                blockLoadingView.setLayoutParams(layoutParams);
            }
            getUIContainer().mo19588a(this, this.loadingView);
        }
    }

    public final void setLoadingView(BlockLoadingView blockLoadingView) {
        this.loadingView = blockLoadingView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/wps/DriveWPSLoadingPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSLoadingPlugin$b */
    public static final class C6864b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveWPSLoadingPlugin f18636a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6864b(DriveWPSLoadingPlugin driveWPSLoadingPlugin) {
            this.f18636a = driveWPSLoadingPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (C6870a.f18642a[infoCode.ordinal()] == 1) {
                this.f18636a.setupLoadingView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSLoadingPlugin$c */
    public static final class C6865c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveWPSLoadingPlugin f18637a;

        C6865c(DriveWPSLoadingPlugin driveWPSLoadingPlugin) {
            this.f18637a = driveWPSLoadingPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (str != null) {
                this.f18637a.dismissLoadingView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSLoadingPlugin$d */
    public static final class C6866d<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveWPSLoadingPlugin f18638a;

        C6866d(DriveWPSLoadingPlugin driveWPSLoadingPlugin) {
            this.f18638a = driveWPSLoadingPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (str != null) {
                this.f18638a.dismissLoadingView();
            }
        }
    }

    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost((C4943e) aVar);
        aVar.mo27262m().mo27297a(new C6864b(this));
        AbstractC1142af viewModel = viewModel(C7529g.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewModel(WpsViewModel::class.java)");
        ((C7529g) viewModel).getSuccessLiveData().mo5923a(getLifecycleOwner(), new C6865c(this));
        AbstractC1142af viewModel2 = viewModel(C7529g.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "viewModel(WpsViewModel::class.java)");
        ((C7529g) viewModel2).getErrorLiveData().mo5923a(getLifecycleOwner(), new C6866d(this));
    }
}
