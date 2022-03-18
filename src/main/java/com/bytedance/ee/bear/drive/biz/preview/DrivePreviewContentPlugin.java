package com.bytedance.ee.bear.drive.biz.preview;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7554e;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/DrivePreviewContentPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "mListener", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromUIContainer", "onDetachPreview", "InternalLoadListener", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DrivePreviewContentPlugin extends AbsDrivePreviewPlugin {
    private final IFileLoader.LoadListener mListener = new InternalLoadListener();

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        C13479a.m54764b("DriveComponent", "onAttachPreview() called, lifecycleOwner=" + getLifecycleOwner());
        ((DrivePluginHost) getHost()).mo27262m().mo27297a(this.mListener);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        C13479a.m54764b("DriveComponent", "onDetachPreview() called, lifecycleOwner=" + getLifecycleOwner());
        ((DrivePluginHost) getHost()).mo27262m().mo27299b(this.mListener);
        removePreviewView();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005H\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/DrivePreviewContentPlugin$InternalLoadListener;", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "(Lcom/bytedance/ee/bear/drive/biz/preview/DrivePreviewContentPlugin;)V", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "onSuccess", "fileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "showPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin$a */
    private final class InternalLoadListener extends IFileLoader.SimpleLoadListener {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public InternalLoadListener() {
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "fileModel");
            m26255b(dVar);
        }

        /* renamed from: b */
        private final void m26255b(C7553d dVar) {
            C6738g gVar;
            DriveVCFollowPlugin driveVCFollowPlugin = (DriveVCFollowPlugin) DrivePreviewContentPlugin.this.findPlugin(DriveVCFollowPlugin.class);
            C7554e mPreviewViewManager = DrivePreviewContentPlugin.this.getMPreviewViewManager();
            Context context = DrivePreviewContentPlugin.this.getContext();
            C4943e host = DrivePreviewContentPlugin.this.getHost();
            DrivePluginHost aVar = (DrivePluginHost) DrivePreviewContentPlugin.this.getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            LifecycleOwner h = aVar.mo19566h();
            if (driveVCFollowPlugin != null) {
                gVar = driveVCFollowPlugin.getVcManager();
            } else {
                gVar = null;
            }
            DrivePreviewContentPlugin.this.removeAndAddPreviewView(mPreviewViewManager.mo29501a(context, host, h, dVar, gVar, 3));
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            boolean z = true;
            if (C6539a.f17994a[infoCode.ordinal()] == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("onInfo#HitCache, data is null?=");
                if (t != null) {
                    z = false;
                }
                sb.append(z);
                C13479a.m54764b("DriveComponent", sb.toString());
                if (t instanceof AbstractC6946a) {
                    C7553d v = t.mo27356v();
                    Intrinsics.checkExpressionValueIsNotNull(v, "data.toPreviewFileModel()");
                    m26255b(v);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).setBizType(aVar.mo27261l().getBizType());
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin
    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer(aVar, nVar);
        C13479a.m54764b("DriveComponent", "onAttachToUIContainer() called, lifecycleOwner=" + getLifecycleOwner());
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        C13479a.m54764b("DriveComponent", "onDetachFromUIContainer() called, lifecycleOwner=" + getLifecycleOwner());
    }
}
