package com.bytedance.ee.bear.document.export.net.exportV2;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/document/export/net/exportV2/DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1", "Lcom/bytedance/ee/bear/middleground/drive/export/DownloadCallback;", "onFailed", "", "key", "", "errorCode", "", "updateProgress", UpdateKey.STATUS, "Lcom/bytedance/ee/bear/middleground/drive/export/DriveFile$Status;", "bytesTransferred", "", "bytesTotal", "dataVersion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 implements DownloadCallback {
    final /* synthetic */ AbstractC5168a $callback;
    final /* synthetic */ String $fileName;
    final /* synthetic */ ExportFormatEnum $format;
    final /* synthetic */ String $localPath;
    final /* synthetic */ DocumentExportExecutorImplV2 this$0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1$b */
    static final class C5778b<T> implements Consumer<Uri> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 f16253a;

        C5778b(DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 documentExportExecutorImplV2$downloadExportFile$downloadCallback$1) {
            this.f16253a = documentExportExecutorImplV2$downloadExportFile$downloadCallback$1;
        }

        /* renamed from: a */
        public final void accept(Uri uri) {
            this.f16253a.$callback.mo20644a(uri);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1$c */
    static final class C5779c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 f16254a;

        C5779c(DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 documentExportExecutorImplV2$downloadExportFile$downloadCallback$1) {
            this.f16254a = documentExportExecutorImplV2$downloadExportFile$downloadCallback$1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54774d(this.f16254a.this$0.f16255a, th);
            this.f16254a.$callback.mo20645a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "it", "", "apply", "(Ljava/lang/Boolean;)Landroid/net/Uri;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1$a */
    static final class C5777a<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 f16252a;

        C5777a(DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1 documentExportExecutorImplV2$downloadExportFile$downloadCallback$1) {
            this.f16252a = documentExportExecutorImplV2$downloadExportFile$downloadCallback$1;
        }

        /* renamed from: a */
        public final Uri apply(Boolean bool) {
            Intrinsics.checkParameterIsNotNull(bool, "it");
            Context b = this.f16252a.this$0.mo23258b();
            Uri a = C13671b.m55462a(b, this.f16252a.$fileName + '.' + this.f16252a.$format, null, null);
            Intrinsics.checkExpressionValueIsNotNull(a, "ExternalStorageUtil.crea…ame.$format\", null, null)");
            C13671b.m55469a(this.f16252a.this$0.mo23258b(), this.f16252a.$localPath, a);
            return a;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean onFailed(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String str2 = this.this$0.f16255a;
        C13479a.m54758a(str2, "drive download fail, errorCode: " + i);
        AbstractC5168a aVar = this.$callback;
        aVar.mo20645a(new Throwable("errorCode: " + i));
        return false;
    }

    DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1(DocumentExportExecutorImplV2 aVar, String str, ExportFormatEnum exportFormatEnum, String str2, AbstractC5168a aVar2) {
        this.this$0 = aVar;
        this.$fileName = str;
        this.$format = exportFormatEnum;
        this.$localPath = str2;
        this.$callback = aVar2;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(str2, "dataVersion");
        if (status == DriveFile.Status.SUCCESS) {
            this.this$0.f16258d = AbstractC68307f.m265083a((Object) true).mo238020d(new C5777a(this)).mo238004b(C11678b.m48477a()).mo237985a(C11678b.m48481e()).mo238001b(new C5778b(this), new C5779c(this));
            return false;
        } else if (status != DriveFile.Status.INFLIGHT || (i = (int) ((((float) j) * 100.0f) / ((float) j2))) <= 10) {
            return false;
        } else {
            this.$callback.mo20646b(i);
            return false;
        }
    }
}
