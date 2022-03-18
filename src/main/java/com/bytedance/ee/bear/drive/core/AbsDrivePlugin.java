package com.bytedance.ee.bear.drive.core;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.common.DriveViewUtils;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J#\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "()V", "mAttachStateListener", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$LoadListener;", "findViewById", "T", "Landroid/view/View;", "idRes", "", "(I)Landroid/view/View;", "onAttachPreview", "", "onAttachToHost", "host", "onDetachFromHost", "onDetachPreview", "AttachStateListener", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class AbsDrivePlugin extends BasePlugin<DrivePluginHost> {
    private IFileLoader.LoadListener mAttachStateListener;

    public void onAttachPreview() {
    }

    public void onDetachPreview() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin$AttachStateListener;", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "(Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;)V", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.AbsDrivePlugin$a */
    public final class AttachStateListener extends IFileLoader.SimpleLoadListener {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public AttachStateListener() {
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.OnAttach) {
                AbsDrivePlugin.this.onAttachPreview();
            } else if (infoCode == InfoCode.OnDetach) {
                AbsDrivePlugin.this.onDetachPreview();
            }
        }
    }

    public final <T extends View> T findViewById(int i) {
        return (T) DriveViewUtils.f18671a.mo27134a(i, (Fragment) getLifecycleOwner());
    }

    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost((C4943e) aVar);
        IFileLoader.LoadListener aVar2 = this.mAttachStateListener;
        if (aVar2 != null) {
            aVar.mo27262m().mo27299b(aVar2);
        }
    }

    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost((C4943e) aVar);
        this.mAttachStateListener = new AttachStateListener();
        IFileLoader m = aVar.mo27262m();
        IFileLoader.LoadListener aVar2 = this.mAttachStateListener;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        m.mo27297a(aVar2);
    }
}
