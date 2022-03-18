package com.bytedance.ee.bear.drive.biz.preview.loading;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.p364a.AbstractC7219b;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7258b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/loading/DriveGeneratingPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "mGeneratingStartTime", "", "mIsGenerating", "", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveGeneratingPlugin extends AbsDrivePreviewPlugin {
    public long mGeneratingStartTime;
    public boolean mIsGenerating;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.loading.DriveGeneratingPlugin$b */
    public static final class RunnableC6611b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveGeneratingPlugin f18110a;

        RunnableC6611b(DriveGeneratingPlugin driveGeneratingPlugin) {
            this.f18110a = driveGeneratingPlugin;
        }

        public final void run() {
            this.f18110a.mIsGenerating = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.loading.DriveGeneratingPlugin$a */
    public static final class RunnableC6610a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveGeneratingPlugin f18108a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18109b;

        RunnableC6610a(DriveGeneratingPlugin driveGeneratingPlugin, DrivePluginHost aVar) {
            this.f18108a = driveGeneratingPlugin;
            this.f18109b = aVar;
        }

        public final void run() {
            C7553d dVar;
            this.f18108a.mIsGenerating = true;
            this.f18108a.mGeneratingStartTime = SystemClock.uptimeMillis();
            AbstractC6946a fileModel = this.f18109b.mo27261l().getFileModel();
            if (fileModel != null) {
                dVar = fileModel.mo27356v();
            } else {
                dVar = null;
            }
            if (dVar != null) {
                C6920b f = C6920b.m27342f();
                Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                C7258b bVar = new C7258b(this.f18108a.getActivity(), f.mo27169d());
                DriveGeneratingPlugin driveGeneratingPlugin = this.f18108a;
                AbstractC7219b a = bVar.mo28360a(new ViewOwner(this.f18109b, driveGeneratingPlugin.getLifecycleOwner()), dVar, C6418d.m25763a(this.f18109b.mo27261l().getBizType(), this.f18108a.getActivity(), ar.f14811a));
                Intrinsics.checkExpressionValueIsNotNull(a, "generatingViewManager\n  …ceHolder.serviceContext))");
                View a2 = a.mo28238a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "generatingViewManager\n  …der.serviceContext)).view");
                driveGeneratingPlugin.removeAndAddPreviewView(a2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addInfoHandler(new RunnableC6610a(this, aVar), InfoCode.Generating);
        addInfoHandler(new RunnableC6611b(this), InfoCode.GenerateFailed, InfoCode.GenerateFinished);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        if (this.mIsGenerating) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.mGeneratingStartTime;
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27167b().mo27880a("server_transform", 2, uptimeMillis, aVar.mo27261l().getFileModel());
            this.mIsGenerating = false;
        }
    }
}
