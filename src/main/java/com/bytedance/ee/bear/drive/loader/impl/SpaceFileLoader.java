package com.bytedance.ee.bear.drive.loader.impl;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6932i;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.AbsFileLoader;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.download.AbstractC7006d;
import com.bytedance.ee.bear.drive.loader.download.C7003b;
import com.bytedance.ee.bear.drive.loader.download.platform.C7078e;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.FileInfoV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.C6978a;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6995f;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.C6990b;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.C6991c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/drive/loader/impl/SpaceFileLoader;", "Lcom/bytedance/ee/bear/drive/core/load/AbsFileLoader;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "(Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;)V", "mOpenEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseSpaceOpenEntity;", "mPreviewExecutor", "Lcom/bytedance/ee/bear/drive/loader/impl/executor/PreviewFileExecutor;", "Lcom/bytedance/ee/bear/drive/loader/download/platform/api/drive/FileInfoV1Puller$Params;", "Lcom/bytedance/ee/bear/drive/loader/model/DriveFileModel;", "load", "", "loadDirectly", "onDetach", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.loader.a.c */
public final class SpaceFileLoader extends AbsFileLoader {

    /* renamed from: a */
    public static final Companion f18923a = new Companion(null);

    /* renamed from: b */
    private final BaseSpaceOpenEntity f18924b;

    /* renamed from: c */
    private final C6978a<FileInfoV1Puller.Params, C7086a> f18925c;

    /* renamed from: d */
    private final DrivePluginHost f18926d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/loader/impl/SpaceFileLoader$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.loader.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.load.AbsFileLoader, com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: b */
    public void mo27298b() {
        super.mo27298b();
        this.f18925c.mo27495a();
    }

    @Override // com.bytedance.ee.bear.drive.core.load.AbsFileLoader, com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: e */
    public void mo27302e() {
        super.mo27302e();
        C13479a.m54764b("SpaceFileLoader", "onDetach()");
        this.f18925c.mo27498b();
    }

    @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader
    /* renamed from: f */
    public void mo27307f() {
        if (this.f18926d.mo27261l().getIFileModel() != null) {
            this.f18925c.mo27496a(this.f18926d.mo27261l().getIFileModel());
        } else {
            C13479a.m54758a("DriveComponent", "loadDirectly() error iFileModel null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceFileLoader(DrivePluginHost aVar) {
        super(aVar);
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        this.f18926d = aVar;
        BaseOpenEntity openEntity = aVar.mo27261l().getOpenEntity();
        if (openEntity != null) {
            BaseSpaceOpenEntity baseSpaceOpenEntity = (BaseSpaceOpenEntity) openEntity;
            this.f18924b = baseSpaceOpenEntity;
            final AbstractC6927d a = C6932i.m27446a(aVar.mo27261l());
            C6978a.C6981a a2 = new C6978a.C6981a().mo27505a(baseSpaceOpenEntity.getFileId()).mo27506a(aVar.mo27261l().isVCFollowMode());
            if (aVar.mo27261l().isVCFollowMode() || aVar.mo27261l().isInBlockState()) {
                z = true;
            } else {
                z = false;
            }
            C6978a.C6981a c = a2.mo27508b(z).mo27509c(aVar.mo27261l().isHistoryMode());
            String fileId = baseSpaceOpenEntity.getFileId();
            String mountNodeToken = baseSpaceOpenEntity.getMountNodeToken();
            String mountPoint = baseSpaceOpenEntity.getMountPoint();
            Intrinsics.checkExpressionValueIsNotNull(a, "previewFileStrategy");
            C6978a<FileInfoV1Puller.Params, C7086a> a3 = c.mo27504a(new FileInfoV1Puller.Params(fileId, mountNodeToken, mountPoint, a.mo27238a(), a.mo27241a(baseSpaceOpenEntity.getVersion()), baseSpaceOpenEntity.getApiExtra())).mo27501a((AbstractC7006d) new AbstractC7006d() {
                /* class com.bytedance.ee.bear.drive.loader.impl.SpaceFileLoader.C69991 */

                @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
                /* renamed from: b */
                public AbstractC6927d mo25751b() {
                    AbstractC6927d dVar = a;
                    Intrinsics.checkExpressionValueIsNotNull(dVar, "previewFileStrategy");
                    return dVar;
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
                /* renamed from: a */
                public C10917c mo25743a() {
                    C10917c a = ar.m20936a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "ServiceHolder.serviceContext()");
                    return a;
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
                /* renamed from: c */
                public C6880a mo25752c() {
                    C6920b f = C6920b.m27342f();
                    Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                    C6880a e = f.mo27170e();
                    Intrinsics.checkExpressionValueIsNotNull(e, "DriveConfigServiceImpl.getInstance().cacheManager");
                    return e;
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
                /* renamed from: d */
                public AbstractC7095c mo25753d() {
                    C6920b f = C6920b.m27342f();
                    Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                    AbstractC7095c d = f.mo27169d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "DriveConfigServiceImpl.g…nstance().mimeTypeManager");
                    return d;
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
                /* renamed from: e */
                public C7128a mo25754e() {
                    C6920b f = C6920b.m27342f();
                    Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                    C7128a b = f.mo27167b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "DriveConfigServiceImpl.g…driveDevPerformanceReport");
                    return b;
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
                /* renamed from: a */
                public String mo25744a(String str, String str2) {
                    String a = a.mo27240a(new C7086a(new C7086a.C7087a("", 0, null, 0, "", false, str, "", "", 0, "", str2, "", 0, 0)));
                    Intrinsics.checkExpressionValueIsNotNull(a, "previewFileStrategy.getC…              \"\", 0, 0)))");
                    return a;
                }
            }).mo27502a(C7078e.m28152a(new C7023a(ar.f14811a), new C7003b(a), new C6990b(a))).mo27503a((AbstractC7064c) C7058b.m28085a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null))).mo27500a((AbstractC6995f) new C6991c(baseSpaceOpenEntity.getApiExtra())).mo27499a((IFileLoader.LoadListener) mo27296a()).mo27507a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "PreviewFileExecutor.Buil…ner)\n            .build()");
            this.f18925c = a3;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity");
    }
}
