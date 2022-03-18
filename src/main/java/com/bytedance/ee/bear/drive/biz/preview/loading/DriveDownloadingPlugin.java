package com.bytedance.ee.bear.drive.biz.preview.loading;

import android.view.View;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b;
import com.bytedance.ee.bear.drive.view.preview.loadingview.C7404c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/loading/DriveDownloadingPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "mDownloadProgressView", "Lcom/bytedance/ee/bear/drive/view/preview/loadingview/ILoadingView;", "mLoadingViewManager", "Lcom/bytedance/ee/bear/drive/view/preview/loadingview/LoadingViewManager;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveDownloadingPlugin extends AbsDrivePreviewPlugin {
    public AbstractC7403b mDownloadProgressView;
    public C7404c mLoadingViewManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/loading/DriveDownloadingPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "onProgress", "percent", "", "onSuccess", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.loading.DriveDownloadingPlugin$a */
    public static final class C6609a extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveDownloadingPlugin f18106a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18107b;

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            View a;
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            AbstractC7403b bVar = this.f18106a.mDownloadProgressView;
            if (bVar != null && (a = bVar.mo28888a()) != null) {
                a.setVisibility(8);
            }
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            View a;
            Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
            AbstractC7403b bVar = this.f18106a.mDownloadProgressView;
            if (bVar != null && (a = bVar.mo28888a()) != null) {
                a.setVisibility(8);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (r2 == null) goto L_0x002d;
         */
        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo25760a(int r5) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.preview.loading.DriveDownloadingPlugin.C6609a.mo25760a(int):void");
        }

        C6609a(DriveDownloadingPlugin driveDownloadingPlugin, DrivePluginHost aVar) {
            this.f18106a = driveDownloadingPlugin;
            this.f18107b = aVar;
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        this.mLoadingViewManager = new C7404c(f.mo27169d(), aVar.mo27261l().isInBlockState());
        aVar.mo27262m().mo27297a(new C6609a(this, aVar));
    }
}
