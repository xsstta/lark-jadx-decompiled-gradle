package com.bytedance.ee.bear.drive.biz.preview.titlebar;

import com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/titlebar/ImportFileMoreBadgeStrategy;", "Lcom/bytedance/ee/bear/document/titlebar/badge/ITitleBarBadgeStrategy;", "permissionVM", "Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionVM;", "driveVM", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "(Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionVM;Lcom/bytedance/ee/bear/drive/core/DriveViewModel;)V", "TAG", "", "getDriveVM", "()Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "getPermissionVM", "()Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionVM;", "autoMarkNotNewAfterClick", "", "getId", "isNew", "markNotNew", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.titlebar.a */
public final class ImportFileMoreBadgeStrategy implements ITitleBarBadgeStrategy {

    /* renamed from: a */
    private final String f18299a = "ImportFileMoreBadgeStrategy";

    /* renamed from: b */
    private final DriveMGPermissionVM f18300b;

    /* renamed from: c */
    private final C6937b f18301c;

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: a */
    public String mo25029a() {
        return "item_import_fileV2";
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: c */
    public void mo25031c() {
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: d */
    public boolean mo25032d() {
        return false;
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: b */
    public boolean mo25030b() {
        DriveMGPermissionVM aVar = this.f18300b;
        if (aVar == null || aVar.livePerm().mo5927b() == null || this.f18301c.getFileModel() == null) {
            C13479a.m54775e(this.f18299a, "driveState = null");
            return false;
        }
        C6522b b = this.f18300b.livePerm().mo5927b();
        if (b == null || !b.mo26059e() || !C6476a.m26022a((C7086a) this.f18301c.getFileModel()) || !((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38977a("item_import_fileV2")) {
            return false;
        }
        return true;
    }

    public ImportFileMoreBadgeStrategy(DriveMGPermissionVM aVar, C6937b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "driveVM");
        this.f18300b = aVar;
        this.f18301c = bVar;
    }
}
