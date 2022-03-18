package com.bytedance.ee.bear.drive.biz.wps;

import android.content.Intent;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.WpsPreviewView;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/wps/DriveWPSPlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "Lcom/bytedance/ee/bear/facade/common/ActivityResultHandler;", "()V", "editable", "", "getEditable", "()Z", "setEditable", "(Z)V", "keyboardHeightObserver", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "wpsKeyboardEnable", "getWpsKeyboardEnable", "setWpsKeyboardEnable", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAttachToHost", "host", "onDetachFromHost", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveWPSPlugin extends BasePlugin<DrivePluginHost> implements AbstractC7664b {
    public static final Companion Companion = new Companion(null);
    private boolean editable;
    public final AbstractC10549e keyboardHeightObserver = new C6867b(this);
    private boolean wpsKeyboardEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/wps/DriveWPSPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final boolean getWpsKeyboardEnable() {
        return this.wpsKeyboardEnable;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setWpsKeyboardEnable(boolean z) {
        this.wpsKeyboardEnable = z;
    }

    public void onDetachFromHost(DrivePluginHost aVar) {
        super.onDetachFromHost((C4943e) aVar);
        if (this.wpsKeyboardEnable) {
            C13479a.m54764b("DriveWPSPlugin", "close wps keyboard");
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this.keyboardHeightObserver);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSPlugin$d */
    public static final class C6869d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveWPSPlugin f18641a;

        C6869d(DriveWPSPlugin driveWPSPlugin) {
            this.f18641a = driveWPSPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C13479a.m54764b("DriveWPSPlugin", "enable wps keyboard");
            DriveWPSPlugin driveWPSPlugin = this.f18641a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            driveWPSPlugin.setWpsKeyboardEnable(bool.booleanValue());
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                AbstractC10550f.AbstractC10551a.m43717b(this.f18641a.getActivity()).mo39924a(this.f18641a.keyboardHeightObserver);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSPlugin$c */
    public static final class C6868c<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18640a;

        C6868c(DrivePluginHost aVar) {
            this.f18640a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            if (bVar != null) {
                C6891a.m27236d(this.f18640a).liveInnerFilePermissionChanged().mo5926a(bVar);
            }
            if (bVar != null) {
                C13479a.m54764b("DriveWPSPlugin", "DriveWPSPlugin#onChanged()... token= " + C13598b.m55197d(bVar.mo26055a()) + ", selfPermission = " + bVar.mo26056b() + ", previewStatusCode = " + bVar.mo26065k());
            }
        }
    }

    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost((C4943e) aVar);
        boolean z = false;
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.drive_wps_edit_enable", false);
        boolean isHistoryMode = aVar.mo27261l().isHistoryMode();
        if (a && !isHistoryMode) {
            z = true;
        }
        this.editable = z;
        C6891a.m27236d(aVar).liveInnerWPSEditModeAvailable().mo5926a(Boolean.valueOf(this.editable));
        ((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C6868c(aVar));
        C6891a.m27236d(aVar).liveInnerWPSKeyboardChangedActive().mo5923a(getLifecycleOwner(), new C6869d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "kotlin.jvm.PlatformType", "keyboardHeight", "", "<anonymous parameter 2>", "onKeyboardHeightChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.wps.DriveWPSPlugin$b */
    static final class C6867b implements AbstractC10549e {

        /* renamed from: a */
        final /* synthetic */ DriveWPSPlugin f18639a;

        C6867b(DriveWPSPlugin driveWPSPlugin) {
            this.f18639a = driveWPSPlugin;
        }

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public final void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            DrivePluginHost aVar = (DrivePluginHost) this.f18639a.getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27236d(aVar).liveInnerWPSViewPaddingChanged().mo5926a(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        AbstractC7549a aVar;
        DrivePreviewContentPlugin drivePreviewContentPlugin = (DrivePreviewContentPlugin) findPlugin(DrivePreviewContentPlugin.class);
        if (drivePreviewContentPlugin != null) {
            aVar = drivePreviewContentPlugin.currentPreviewView();
        } else {
            aVar = null;
        }
        if (aVar != null && (aVar instanceof AbstractC7664b) && (aVar instanceof WpsPreviewView)) {
            ((AbstractC7664b) aVar).onActivityResult(i, i2, intent);
        }
    }
}
