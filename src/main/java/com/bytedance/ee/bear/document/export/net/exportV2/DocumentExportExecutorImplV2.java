package com.bytedance.ee.bear.document.export.net.exportV2;

import android.content.Context;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.document.export.net.AbstractC5772b;
import com.bytedance.ee.bear.document.export.net.exportV2.CommitExportParserV2;
import com.bytedance.ee.bear.document.export.net.exportV2.GetExportResultParserV2;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.gson.JsonObject;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J<\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010)\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/document/export/net/exportV2/DocumentExportExecutorImplV2;", "Lcom/bytedance/ee/bear/document/export/net/DocumentExportExecutor;", "context", "Landroid/content/Context;", "fileName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "FIRST_POLL_INTERVAL", "", "POLL_INTERVAL", "TAG", "getContext", "()Landroid/content/Context;", "getFileName", "()Ljava/lang/String;", "mCall", "Lokhttp3/Call;", "mCopyDisposable", "Lio/reactivex/disposables/Disposable;", "mDisposable", "mKey", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "cancel", "", "downloadExportFile", "format", "Lcom/bytedance/ee/bear/contract/export/ExportFormatEnum;", "fileToken", "fileSize", "callback", "Lcom/bytedance/ee/bear/contract/export/DocumentExportCallback;", "getExportResult", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", ShareHitPoint.f121869d, "token", "ticket", "jobTimeOut", "", "startExport", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a */
public final class DocumentExportExecutorImplV2 implements AbstractC5772b {

    /* renamed from: a */
    public final String f16255a = "DocumentExportExecutorImplV2";

    /* renamed from: b */
    public final long f16256b = 3;

    /* renamed from: c */
    public final Call f16257c;

    /* renamed from: d */
    public volatile Disposable f16258d;

    /* renamed from: e */
    private final long f16259e = 1;

    /* renamed from: f */
    private String f16260f;

    /* renamed from: g */
    private final NetService f16261g = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));

    /* renamed from: h */
    private Disposable f16262h;

    /* renamed from: i */
    private final Context f16263i;

    /* renamed from: j */
    private final String f16264j;

    /* renamed from: b */
    public final Context mo23258b() {
        return this.f16263i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/export/net/exportV2/DocumentExportExecutorImplV2$startExport$2", "Lio/reactivex/disposables/Disposable;", "dispose", "", "isDisposed", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$d */
    public static final class C5783d implements Disposable {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16272a;

        /* renamed from: b */
        final /* synthetic */ Disposable f16273b;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            C13479a.m54764b(this.f16272a.f16255a, "dispose");
            this.f16273b.dispose();
            if (this.f16272a.f16257c != null && !this.f16272a.f16257c.isCanceled()) {
                this.f16272a.f16257c.cancel();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            Disposable disposable = this.f16273b;
            Intrinsics.checkExpressionValueIsNotNull(disposable, "disposable");
            if (!disposable.isDisposed() || this.f16272a.f16257c == null || !this.f16272a.f16257c.isCanceled()) {
                return false;
            }
            return true;
        }

        C5783d(DocumentExportExecutorImplV2 aVar, Disposable disposable) {
            this.f16272a = aVar;
            this.f16273b = disposable;
        }
    }

    @Override // com.bytedance.ee.bear.document.export.net.AbstractC5772b
    /* renamed from: a */
    public void mo23222a() {
        Disposable disposable = this.f16262h;
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f16258d;
        if (disposable2 != null && !disposable2.isDisposed()) {
            disposable2.dispose();
        }
        if (this.f16260f != null) {
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(this.f16260f);
            ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19657a(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "objectFlowable", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$a */
    public static final class C5780a<T, R> implements Function<AbstractC68307f<Object>, AbstractC70020b<?>> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16265a;

        C5780a(DocumentExportExecutorImplV2 aVar) {
            this.f16265a = aVar;
        }

        /* renamed from: a */
        public final AbstractC68307f<Object> apply(AbstractC68307f<Object> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "objectFlowable");
            return fVar.mo238019d(this.f16265a.f16256b, TimeUnit.SECONDS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$g */
    static final class C5786g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16281a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5168a f16282b;

        C5786g(DocumentExportExecutorImplV2 aVar, AbstractC5168a aVar2) {
            this.f16281a = aVar;
            this.f16282b = aVar2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f16281a.f16255a, "startExport error", th);
            this.f16282b.mo20645a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "exportResult", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "test"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$c */
    public static final class C5782c<T> implements AbstractC68322n<NetService.Result<GetExportResultParserV2.ExportResultV2>> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16271a;

        C5782c(DocumentExportExecutorImplV2 aVar) {
            this.f16271a = aVar;
        }

        /* renamed from: a */
        public final boolean test(NetService.Result<GetExportResultParserV2.ExportResultV2> result) {
            Intrinsics.checkParameterIsNotNull(result, "exportResult");
            String str = this.f16271a.f16255a;
            C13479a.m54772d(str, "filter，status = " + ((GetExportResultParserV2.ExportResultV2) result.data).getJob_status());
            if (((GetExportResultParserV2.ExportResultV2) result.data).getJob_status() == 0) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "result", "Lcom/bytedance/ee/bear/document/export/net/exportV2/CommitExportParserV2$CommitExportResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$e */
    static final class C5784e<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16274a;

        /* renamed from: b */
        final /* synthetic */ String f16275b;

        /* renamed from: c */
        final /* synthetic */ String f16276c;

        /* renamed from: d */
        final /* synthetic */ AbstractC5168a f16277d;

        C5784e(DocumentExportExecutorImplV2 aVar, String str, String str2, AbstractC5168a aVar2) {
            this.f16274a = aVar;
            this.f16275b = str;
            this.f16276c = str2;
            this.f16277d = aVar2;
        }

        /* renamed from: a */
        public final AbstractC68307f<NetService.Result<GetExportResultParserV2.ExportResultV2>> apply(NetService.Result<CommitExportParserV2.CommitExportResult> result) {
            Intrinsics.checkParameterIsNotNull(result, "result");
            return this.f16274a.mo23256a(this.f16275b, this.f16276c, ((CommitExportParserV2.CommitExportResult) result.data).getTicket(), ((CommitExportParserV2.CommitExportResult) result.data).getJobTimeout(), this.f16277d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$f */
    static final class C5785f<T> implements Consumer<NetService.Result<GetExportResultParserV2.ExportResultV2>> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16278a;

        /* renamed from: b */
        final /* synthetic */ ExportFormatEnum f16279b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5168a f16280c;

        C5785f(DocumentExportExecutorImplV2 aVar, ExportFormatEnum exportFormatEnum, AbstractC5168a aVar2) {
            this.f16278a = aVar;
            this.f16279b = exportFormatEnum;
            this.f16280c = aVar2;
        }

        /* renamed from: a */
        public final void accept(NetService.Result<GetExportResultParserV2.ExportResultV2> result) {
            Intrinsics.checkParameterIsNotNull(result, "result");
            DocumentExportExecutorImplV2 aVar = this.f16278a;
            ExportFormatEnum exportFormatEnum = this.f16279b;
            String fileToken = ((GetExportResultParserV2.ExportResultV2) result.data).getFileToken();
            if (fileToken == null) {
                Intrinsics.throwNpe();
            }
            Long file_size = ((GetExportResultParserV2.ExportResultV2) result.data).getFile_size();
            if (file_size == null) {
                Intrinsics.throwNpe();
            }
            long longValue = file_size.longValue();
            String fileName = ((GetExportResultParserV2.ExportResultV2) result.data).getFileName();
            if (fileName == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo23257a(exportFormatEnum, fileToken, longValue, fileName, this.f16280c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"com/bytedance/ee/bear/document/export/net/exportV2/DocumentExportExecutorImplV2$getExportResult$3", "Lio/reactivex/functions/Predicate;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "count", "", "getCount", "()I", "setCount", "(I)V", "time", "getTime", "setTime", "test", "", "exportResultResult", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.net.exportV2.a$b */
    public static final class C5781b implements AbstractC68322n<NetService.Result<GetExportResultParserV2.ExportResultV2>> {

        /* renamed from: a */
        final /* synthetic */ DocumentExportExecutorImplV2 f16266a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5168a f16267b;

        /* renamed from: c */
        final /* synthetic */ int f16268c;

        /* renamed from: d */
        private int f16269d = 1;

        /* renamed from: e */
        private int f16270e;

        /* renamed from: a */
        public boolean test(NetService.Result<GetExportResultParserV2.ExportResultV2> result) {
            Intrinsics.checkParameterIsNotNull(result, "exportResultResult");
            String str = this.f16266a.f16255a;
            C13479a.m54772d(str, "takeUtil，status = " + ((GetExportResultParserV2.ExportResultV2) result.data).getJob_status());
            AbstractC5168a aVar = this.f16267b;
            int i = this.f16270e;
            this.f16270e = i + 1;
            aVar.mo20643a(i);
            if (((GetExportResultParserV2.ExportResultV2) result.data).getJob_status() == 0) {
                return true;
            }
            if (((GetExportResultParserV2.ExportResultV2) result.data).getJob_status() <= 2) {
                int i2 = this.f16269d;
                if (i2 < this.f16268c) {
                    this.f16269d = i2 + 3;
                    return false;
                }
                throw new IOException("polling time out");
            }
            throw new NetService.ServerErrorException(((GetExportResultParserV2.ExportResultV2) result.data).getJob_status(), ((GetExportResultParserV2.ExportResultV2) result.data).getJob_error_msg(), ((GetExportResultParserV2.ExportResultV2) result.data).toString(), result.toString());
        }

        C5781b(DocumentExportExecutorImplV2 aVar, AbstractC5168a aVar2, int i) {
            this.f16266a = aVar;
            this.f16267b = aVar2;
            this.f16268c = i;
        }
    }

    public DocumentExportExecutorImplV2(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        this.f16263i = context;
        this.f16264j = str;
    }

    @Override // com.bytedance.ee.bear.document.export.net.AbstractC5772b
    /* renamed from: a */
    public Disposable mo23221a(ExportFormatEnum exportFormatEnum, String str, String str2, AbstractC5168a aVar) {
        Intrinsics.checkParameterIsNotNull(exportFormatEnum, "format");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        C13479a.m54764b(this.f16255a, "startExport");
        mo23222a();
        NetService.C5077f fVar = new NetService.C5077f("space/api/export/create/");
        fVar.mo20143a(1);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(ShareHitPoint.f121869d, str);
        jsonObject.addProperty("token", str2);
        jsonObject.addProperty("event_source", "15");
        jsonObject.addProperty("file_extension", exportFormatEnum.toString());
        fVar.mo20153c(jsonObject.toString());
        C5783d dVar = new C5783d(this, this.f16261g.mo20117a(new CommitExportParserV2()).mo20141a(fVar).mo237985a(C11678b.m48478b()).mo238019d(this.f16259e, TimeUnit.SECONDS).mo238014c(new C5784e(this, str, str2, aVar)).mo238001b(new C5785f(this, exportFormatEnum, aVar), new C5786g(this, aVar)));
        this.f16262h = dVar;
        if (dVar != null) {
            return dVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public final AbstractC68307f<NetService.Result<GetExportResultParserV2.ExportResultV2>> mo23256a(String str, String str2, String str3, int i, AbstractC5168a aVar) {
        String str4 = this.f16255a;
        C13479a.m54764b(str4, "polling getExportResult, ticket = " + str3);
        aVar.n_();
        NetService.C5077f fVar = new NetService.C5077f("/space/api/export/result/" + str3);
        fVar.mo20145a("token", str2);
        fVar.mo20145a(ShareHitPoint.f121869d, str);
        AbstractC68307f<NetService.Result<GetExportResultParserV2.ExportResultV2>> a = this.f16261g.mo20117a(new GetExportResultParserV2()).mo20141a(fVar).mo238031g(new C5780a(this)).mo238016c(new C5781b(this, aVar, i)).mo237998a((AbstractC68322n) new C5782c(this));
        Intrinsics.checkExpressionValueIsNotNull(a, "mNetService\n            …us == 0\n                }");
        return a;
    }

    /* renamed from: a */
    public final void mo23257a(ExportFormatEnum exportFormatEnum, String str, long j, String str2, AbstractC5168a aVar) {
        String c = CCMStorage.f15230a.mo21335c(this.f16263i, Biz.DOCS, "export");
        this.f16263i.getExternalCacheDir();
        File file = new File(c);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = file.getAbsolutePath() + File.separator + str2 + "." + exportFormatEnum.toString();
        DownloadRequestInfo.C9355a aVar2 = new DownloadRequestInfo.C9355a();
        aVar2.f25127c = str;
        aVar2.f25138n = new DocumentExportExecutorImplV2$downloadExportFile$downloadCallback$1(this, str2, exportFormatEnum, str3, aVar);
        aVar2.f25126b = str3;
        aVar2.f25129e = "ccm_import";
        this.f16260f = ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19649a(aVar2.mo35664a());
    }
}
