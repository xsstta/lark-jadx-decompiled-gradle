package com.bytedance.ee.bear.drive.loader.impl;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.config.fg.DrivePreviewConfig;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.AbsFileLoader;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import java.io.File;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/loader/impl/LocalFileLoader;", "Lcom/bytedance/ee/bear/drive/core/load/AbsFileLoader;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "(Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;)V", "mOpenEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/LocalOpenEntity;", "initFileModel", "Lcom/bytedance/ee/bear/drive/loader/model/DriveFileModel;", "openEntity", "load", "", "loadDirectly", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.loader.a.b */
public final class LocalFileLoader extends AbsFileLoader {

    /* renamed from: a */
    public static final Companion f18920a = new Companion(null);

    /* renamed from: b */
    private final LocalOpenEntity f18921b;

    /* renamed from: c */
    private final DrivePluginHost f18922c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/loader/impl/LocalFileLoader$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.loader.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: f */
    public void mo27307f() {
        C13479a.m54775e("DriveComponent", "loadDirectly() not support for localFileLoader");
    }

    @Override // com.bytedance.ee.bear.drive.core.load.AbsFileLoader, com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: b */
    public void mo27298b() {
        super.mo27298b();
        if (this.f18921b == null || !new File(this.f18921b.getLocalFilePath()).exists()) {
            C13479a.m54758a("LocalFileLoader", "load() mOpenEntity=" + this.f18921b);
            mo27296a().mo25511a(ErrCode.FILE_NOT_FOUND);
            return;
        }
        C7086a a = m27865a(this.f18921b);
        this.f18922c.mo27261l().setFileModel(a);
        mo27296a().mo25427a(InfoCode.FileInfoSuccess, a);
        C7553d v = a.mo27356v();
        Intrinsics.checkExpressionValueIsNotNull(v, "previewFileModel");
        v.mo29482d(this.f18921b.getAppId());
        this.f18922c.mo27261l().setFileName(this.f18921b.getFileName());
        if (a.mo27322a().f18787c <= 0) {
            C13479a.m54764b("LocalFileLoader", "fileSize is 0");
            mo27296a().mo25511a(ErrCode.DRIVE_FILE_ZERO_SIZE);
            return;
        }
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        if (!f.mo27169d().mo27712a(v.mo29483d())) {
            C13479a.m54764b("LocalFileLoader", "isLocalSupport false for ext=" + v.mo29483d());
            mo27296a().mo25511a(ErrCode.DRIVE_FILE_NOT_SUPPORT_PREVIEW);
            return;
        }
        if (C6892d.m27253k(v.mo29483d())) {
            long j = a.mo27322a().f18787c;
            C6920b f2 = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "DriveConfigServiceImpl.getInstance()");
            C6923a c = f2.mo27168c();
            Intrinsics.checkExpressionValueIsNotNull(c, "DriveConfigServiceImpl.getInstance().driveConfig");
            DrivePreviewConfig i = c.mo27227i();
            Intrinsics.checkExpressionValueIsNotNull(i, "DriveConfigServiceImpl.g…Config.drivePreviewConfig");
            if (j > ((long) (i.getLocal_archive_max_size() * 1024))) {
                C13479a.m54764b("LocalFileLoader", "isArchiveLibSupportExt but file  too large");
                mo27296a().mo25511a(ErrCode.DRIVE_FILE_OVER_SIZE);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isLocalSupport success, fileSize=");
        sb.append(a.mo27322a().f18787c);
        sb.append(", ");
        sb.append("fileName=");
        C7086a.C7087a x = a.mo27322a();
        Intrinsics.checkExpressionValueIsNotNull(x, "fileModel.meta");
        sb.append(C13598b.m55197d(x.mo27358a()));
        sb.append("filePath=");
        sb.append(C13598b.m55197d(a.mo27343j()));
        C13479a.m54764b("LocalFileLoader", sb.toString());
        mo27296a().mo25512a(v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalFileLoader(DrivePluginHost aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        this.f18922c = aVar;
        BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
        if (openEntity != null) {
            this.f18921b = (LocalOpenEntity) openEntity;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity");
    }

    /* renamed from: a */
    private final C7086a m27865a(LocalOpenEntity localOpenEntity) {
        String str;
        C7086a aVar = new C7086a(new C7086a.C7087a(this.f18921b.getFileName(), C13675f.m55525d(this.f18921b.getLocalFilePath()), new int[0], 0, "", false, C6891a.m27231a(localOpenEntity), "", "", 0, "", "", "", 0, 0));
        aVar.mo27334d(this.f18921b.getLocalFilePath());
        if (TextUtils.isEmpty(this.f18921b.getFileType())) {
            str = C13672c.m55481b(this.f18921b.getFileName());
        } else {
            str = this.f18921b.getFileType();
        }
        aVar.mo27319a(str);
        aVar.mo27332c(true);
        aVar.mo27328b(true);
        return aVar;
    }
}
