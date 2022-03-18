package com.bytedance.ee.bear.drive.biz.versions.push;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryVM;
import com.bytedance.ee.bear.drive.biz.versions.model.VersionPayLoadData;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mVersionChangeObserver", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "mVersionPush", "Lcom/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPush;", "onAttachPreview", "", "onDetachPreview", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveMultiVersionPlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);
    private AbstractC1178x<VersionPayLoadData> mVersionChangeObserver;
    private DriveMultiVersionPush mVersionPush;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/versions/push/DriveMultiVersionPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.DriveMultiVersionPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        DriveMultiVersionPush aVar;
        LiveData<VersionPayLoadData> b;
        super.onDetachPreview();
        DriveMultiVersionPush aVar2 = this.mVersionPush;
        if (aVar2 != null) {
            aVar2.mo27011c();
        }
        AbstractC1178x<VersionPayLoadData> xVar = this.mVersionChangeObserver;
        if (xVar != null && (aVar = this.mVersionPush) != null && (b = aVar.mo27010b()) != null) {
            b.mo5928b(xVar);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        LiveData<VersionPayLoadData> b;
        super.onAttachPreview();
        DriveMultiVersionPush aVar = new DriveMultiVersionPush(C6891a.m27230a((BasePlugin<DrivePluginHost>) this));
        this.mVersionPush = aVar;
        if (aVar != null) {
            aVar.mo27009a();
        }
        DriveMultiVersionPush aVar2 = this.mVersionPush;
        if (aVar2 != null && (b = aVar2.mo27010b()) != null) {
            C6851b bVar = new C6851b(this);
            this.mVersionChangeObserver = bVar;
            b.mo5925a(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/versions/model/VersionPayLoadData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.push.DriveMultiVersionPlugin$b */
    static final class C6851b<T> implements AbstractC1178x<VersionPayLoadData> {

        /* renamed from: a */
        final /* synthetic */ DriveMultiVersionPlugin f18619a;

        C6851b(DriveMultiVersionPlugin driveMultiVersionPlugin) {
            this.f18619a = driveMultiVersionPlugin;
        }

        /* renamed from: a */
        public final void onChanged(VersionPayLoadData versionPayLoadData) {
            try {
                Intrinsics.checkExpressionValueIsNotNull(versionPayLoadData, "it");
                if (!TextUtils.equals(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18619a), versionPayLoadData.getToken())) {
                    C13479a.m54758a("DriveComponent_DriveMultiVersionPlugin", "VersionObserver receive not equals obj token, ignore change.");
                } else if (versionPayLoadData.getOperation() == 101) {
                    if (versionPayLoadData.getSource() != 7) {
                        AbstractC6946a fileModel = ((DrivePluginHost) this.f18619a.getHost()).mo27261l().getFileModel();
                        if (fileModel == null || fileModel.mo27349p() != 2) {
                            ((DriveHistoryVM) this.f18619a.viewModel(DriveHistoryVM.class)).getLiveHasNewVersion().mo5926a(versionPayLoadData.getVersion());
                            return;
                        }
                    }
                    C13479a.m54764b("DriveComponent_DriveMultiVersionPlugin", "wps preview new version, do not show dialog");
                    ((DriveHistoryVM) this.f18619a.viewModel(DriveHistoryVM.class)).setCurrentDataVersion(versionPayLoadData.getVersion());
                } else if (versionPayLoadData.getOperation() == 102) {
                    C13479a.m54764b("DriveComponent_DriveMultiVersionPlugin", "file version deleted");
                    ((DriveHistoryVM) this.f18619a.viewModel(DriveHistoryVM.class)).getLiveVersionDeleted().mo5926a(versionPayLoadData.getVersion());
                }
            } catch (Exception e) {
                C13479a.m54761a("DriveComponent_DriveMultiVersionPlugin", e);
            }
        }
    }
}
