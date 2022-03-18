package com.bytedance.ee.bear.drive.biz.preview.loading;

import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.loadingview.BlockLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.LoadingAnimView;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/loading/DriveLoadingPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "setUpLoadingView", "tipsText", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveLoadingPlugin extends AbsDrivePreviewPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/loading/DriveLoadingPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.loading.DriveLoadingPlugin$a */
    public static final class C6612a extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveLoadingPlugin f18111a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6612a(DriveLoadingPlugin driveLoadingPlugin) {
            this.f18111a = driveLoadingPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (C6613a.f18112a[infoCode.ordinal()] == 1) {
                DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) this.f18111a.findPlugin(DrivePreviewContentPlugin.class);
                if (drivePreviewContentPlugin == null || !drivePreviewContentPlugin.isShowingContent()) {
                    this.f18111a.setUpLoadingView("");
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6612a(this));
    }

    public final void setUpLoadingView(String str) {
        boolean z;
        LiveData<Integer> livePreviewType = ((DrivePluginHost) getHost()).mo27261l().livePreviewType();
        Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
        Integer b = livePreviewType.mo5927b();
        if (b != null && b.intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (z) {
            BlockLoadingView blockLoadingView = new BlockLoadingView(getContext());
            blockLoadingView.setLayoutParams(layoutParams);
            blockLoadingView.mo28891a(400);
            removeAndAddPreviewView(blockLoadingView);
            return;
        }
        LoadingAnimView loadingAnimView = new LoadingAnimView(getContext());
        loadingAnimView.setGravity(17);
        loadingAnimView.setLayoutParams(layoutParams);
        loadingAnimView.mo28900a(400);
        removeAndAddPreviewView(loadingAnimView);
        loadingAnimView.setTipText(str);
    }
}
