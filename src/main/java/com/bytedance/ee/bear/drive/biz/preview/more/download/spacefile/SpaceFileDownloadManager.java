package com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.external.C6414b;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.config.fg.DrivePreviewConfig;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p714p.C13719a;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57788ai;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/download/spacefile/SpaceFileDownloadManager;", "", "context", "Landroid/content/Context;", "openEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseOpenEntity;", "fileModel", "Lcom/bytedance/ee/bear/drive/core/model/AbsFileModel;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseOpenEntity;Lcom/bytedance/ee/bear/drive/core/model/AbsFileModel;)V", "openExternalHelper", "Lcom/bytedance/ee/bear/drive/biz/external/OpenExternalHelper;", "clear", "", "handleDownload", "handleDownloadInternal", "showSizeTooLargeToast", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.a */
public class SpaceFileDownloadManager {

    /* renamed from: a */
    public final C6418d f18188a;

    /* renamed from: b */
    public final Context f18189b;

    /* renamed from: c */
    public final BaseOpenEntity f18190c;

    /* renamed from: d */
    private final AbstractC6946a f18191d;

    /* renamed from: a */
    public final void mo26339a() {
        m26369b(this.f18191d);
    }

    /* renamed from: b */
    public final void mo26341b() {
        this.f18188a.mo25755f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/download/spacefile/SpaceFileDownloadManager$handleDownloadInternal$1", "Lcom/bytedance/ee/bear/drive/biz/external/OpenExternalHelper$IOpenExternalListener;", "fileInfoDone", "", "fileModel", "Lcom/bytedance/ee/bear/drive/core/model/AbsFileModel;", "onFileLoadingCancel", "onFileLoadingFailure", "onFileLoadingReady", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.a$a */
    public static final class C6665a implements C6418d.AbstractC6422a {

        /* renamed from: a */
        final /* synthetic */ SpaceFileDownloadManager f18192a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f18193b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.a$a$a */
        static final class RunnableC6666a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6665a f18194a;

            RunnableC6666a(C6665a aVar) {
                this.f18194a = aVar;
            }

            public final void run() {
                Toast.showText(this.f18194a.f18192a.f18189b, (int) R.string.CreationMobile_ECM_SaveToLocal_insufficient_toast);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.a$a$b */
        static final class RunnableC6667b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6665a f18195a;

            RunnableC6667b(C6665a aVar) {
                this.f18195a = aVar;
            }

            public final void run() {
                Toast.showText(this.f18195a.f18192a.f18189b, (int) R.string.Drive_Drive_OpenFile_Fail);
            }
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
        /* renamed from: a */
        public void mo25739a() {
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27166a().mo27903a(this.f18192a.f18190c, false);
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
        /* renamed from: b */
        public void mo25741b() {
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27166a().mo27903a(this.f18192a.f18190c, true);
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
        /* renamed from: c */
        public void mo25742c() {
            long j;
            AbstractC6947b a;
            Context context = this.f18192a.f18189b;
            String a2 = C57788ai.m224257a(this.f18192a.f18189b, C13671b.m55462a(context, String.valueOf(System.currentTimeMillis()) + ".txt", "text/plain", ""));
            if (this.f18192a.mo26340a((AbstractC6946a) this.f18193b.get())) {
                C13479a.m54775e("DriveComponent", "onFileLoadingFailure() showSizeTooLargeToast");
                return;
            }
            if (a2 != null) {
                long freeSpace = new File(a2).getFreeSpace();
                AbstractC6946a aVar = (AbstractC6946a) this.f18193b.get();
                if (aVar == null || (a = aVar.mo27322a()) == null) {
                    j = 0;
                } else {
                    j = a.f18787c;
                }
                if (freeSpace < j) {
                    C13748k.m55732a(new RunnableC6666a(this));
                    C6920b f = C6920b.m27342f();
                    Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                    f.mo27166a().mo27929b(this.f18192a.f18190c);
                    return;
                }
            }
            C13748k.m55732a(new RunnableC6667b(this));
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6418d.AbstractC6422a
        /* renamed from: a */
        public void mo25740a(AbstractC6946a aVar) {
            this.f18193b.set(aVar);
            if (this.f18192a.mo26340a(aVar)) {
                this.f18192a.f18188a.mo25755f();
            }
        }

        C6665a(SpaceFileDownloadManager aVar, AtomicReference atomicReference) {
            this.f18192a = aVar;
            this.f18193b = atomicReference;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.a$c */
    public static final class RunnableC6670c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpaceFileDownloadManager f18200a;

        /* renamed from: b */
        final /* synthetic */ String f18201b;

        RunnableC6670c(SpaceFileDownloadManager aVar, String str) {
            this.f18200a = aVar;
            this.f18201b = str;
        }

        public final void run() {
            Toast.showFailureText(this.f18200a.f18189b, this.f18201b, 0);
        }
    }

    /* renamed from: a */
    public final boolean mo26340a(AbstractC6946a aVar) {
        long j;
        AbstractC6947b a;
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        C6923a c = f.mo27168c();
        Intrinsics.checkExpressionValueIsNotNull(c, "DriveConfigServiceImpl.getInstance().driveConfig");
        DrivePreviewConfig i = c.mo27227i();
        Intrinsics.checkExpressionValueIsNotNull(i, "driveConfig.drivePreviewConfig");
        long download_origin_file_max_size = i.getDownload_origin_file_max_size() * ((long) 1024);
        if (aVar == null || (a = aVar.mo27322a()) == null) {
            j = 0;
        } else {
            j = a.f18787c;
        }
        if (j <= download_origin_file_max_size) {
            return false;
        }
        C13748k.m55732a(new RunnableC6670c(this, C10539a.m43639a(this.f18189b, R.string.CreationMobile_ECM_SaveToLocal_TooLarge_toast, "SIZE", C13719a.m55622b(Long.valueOf(download_origin_file_max_size)))));
        C6920b f2 = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "DriveConfigServiceImpl.getInstance()");
        f2.mo27166a().mo27938c(this.f18190c);
        return true;
    }

    /* renamed from: b */
    private final void m26369b(AbstractC6946a aVar) {
        String str;
        boolean z;
        AbstractC6947b a;
        C8275a aVar2 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.FILE");
        if (!((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36543b(aVar2.mo32555b(), this.f18190c.getFileId())) {
            Toast.showText(C13615c.f35773a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
        } else if (!mo26340a(aVar)) {
            if ((aVar == null || (a = aVar.mo27322a()) == null || (str = a.mo27364g()) == null) && (str = this.f18190c.getFileExt()) == null) {
                str = "";
            }
            boolean h = C6892d.m27250h(str);
            boolean i = C6892d.m27251i(str);
            if (h || i) {
                z = true;
            } else {
                z = false;
            }
            String fileId = this.f18190c.getFileId();
            Intrinsics.checkExpressionValueIsNotNull(fileId, "openEntity.fileId");
            ((IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null)).mo37701a(3, 7, fileId);
            AtomicReference atomicReference = new AtomicReference(aVar);
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            f.mo27166a().mo27947d(this.f18190c);
            this.f18188a.mo25748a(new C6665a(this, atomicReference));
            C6414b bVar = new C6414b(true, new C6668b(this, z));
            bVar.f17724c = false;
            C13479a.m54764b("DriveComponent", "buildDownloadMenuItem() ext=" + str + ", isImage=" + h + ", isVideo=" + i);
            this.f18188a.mo25745a(0, this.f18190c.getFileId(), this.f18190c.getApiExtra(), this.f18190c.getMountPoint(), bVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "isSuccess", "", "saveUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "onOpen"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.a$b */
    public static final class C6668b implements C6414b.AbstractC6415a {

        /* renamed from: a */
        final /* synthetic */ SpaceFileDownloadManager f18196a;

        /* renamed from: b */
        final /* synthetic */ boolean f18197b;

        C6668b(SpaceFileDownloadManager aVar, boolean z) {
            this.f18196a = aVar;
            this.f18197b = z;
        }

        @Override // com.bytedance.ee.bear.drive.biz.external.C6414b.AbstractC6415a
        /* renamed from: a */
        public final void mo25737a(boolean z, final Uri uri) {
            if (z && this.f18196a.f18189b != null && uri != null) {
                C13748k.m55732a(new Runnable(this) {
                    /* class com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.SpaceFileDownloadManager.C6668b.RunnableC66691 */

                    /* renamed from: a */
                    final /* synthetic */ C6668b f18198a;

                    {
                        this.f18198a = r1;
                    }

                    public final void run() {
                        String str;
                        if (this.f18198a.f18197b) {
                            str = this.f18198a.f18196a.f18189b.getString(R.string.CreationMobile_ECM_SaveToLocal_toAlbum_toast);
                        } else {
                            str = this.f18198a.f18196a.f18189b.getString(R.string.CreationMobile_ECM_SaveToLocal_saved_toast) + C57788ai.m224257a(this.f18198a.f18196a.f18189b, uri);
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str, "if (isMedia) context.get…UriPath(context, saveUri)");
                        Toast.showSuccessText(this.f18198a.f18196a.f18189b, str, 1);
                    }
                });
                if (this.f18197b) {
                    C13671b.m55476e(this.f18196a.f18189b, uri);
                } else {
                    C13671b.m55477f(this.f18196a.f18189b, uri);
                }
            }
        }
    }

    public SpaceFileDownloadManager(Context context, BaseOpenEntity baseOpenEntity, AbstractC6946a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(baseOpenEntity, "openEntity");
        this.f18189b = context;
        this.f18190c = baseOpenEntity;
        this.f18191d = aVar;
        C6418d a = C6418d.m25763a(baseOpenEntity.getBizType(), context, ar.f14811a);
        Intrinsics.checkExpressionValueIsNotNull(a, "OpenExternalHelper.newIn…iceHolder.serviceContext)");
        this.f18188a = a;
    }
}
