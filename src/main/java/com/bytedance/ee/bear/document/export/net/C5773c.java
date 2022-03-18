package com.bytedance.ee.bear.document.export.net;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.net.GetExportResultParser;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13675f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.document.export.net.c */
public class C5773c implements AbstractC5772b {

    /* renamed from: a */
    public Call f16239a;

    /* renamed from: b */
    private final Context f16240b;

    /* renamed from: c */
    private final NetService f16241c = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: d */
    private final String f16242d;

    /* renamed from: e */
    private Disposable f16243e;

    /* renamed from: a */
    public void mo23224a(ExportFormatEnum exportFormatEnum, Response response, AbstractC5168a aVar) {
        Closeable closeable;
        Throwable th;
        Exception e;
        InputStream inputStream = null;
        Uri a = C13671b.m55462a(this.f16240b, this.f16242d + "." + exportFormatEnum, null, null);
        byte[] bArr = new byte[2048];
        String header = response.header("Content-Length");
        if (header == null) {
            header = "-1";
        }
        long parseLong = Long.parseLong(header);
        try {
            InputStream byteStream = response.body().byteStream();
            try {
                OutputStream a2 = C13671b.m55465a(this.f16240b, a);
                int i = 0;
                while (true) {
                    int read = byteStream.read(bArr);
                    int i2 = -1;
                    if (read != -1) {
                        a2.write(bArr, 0, read);
                        i += read;
                        if (parseLong != -1) {
                            i2 = (int) ((((float) i) * 100.0f) / ((float) parseLong));
                        }
                        aVar.mo20646b(i2);
                    } else {
                        a2.flush();
                        C13671b.m55476e(this.f16240b, a);
                        aVar.mo20644a(a);
                        C13479a.m54764b("DocumentExportExecutorImpl", "download success");
                        C13675f.m55517b(byteStream, a2);
                        return;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                closeable = null;
                inputStream = byteStream;
                try {
                    C13479a.m54759a("DocumentExportExecutorImpl", "download fail", e);
                    C13671b.m55471b(this.f16240b, a);
                    aVar.mo20645a(e);
                    C13675f.m55517b(inputStream, closeable);
                } catch (Throwable th2) {
                    th = th2;
                    C13675f.m55517b(inputStream, closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                inputStream = byteStream;
                C13675f.m55517b(inputStream, closeable);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            closeable = null;
            C13479a.m54759a("DocumentExportExecutorImpl", "download fail", e);
            C13671b.m55471b(this.f16240b, a);
            aVar.mo20645a(e);
            C13675f.m55517b(inputStream, closeable);
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            C13675f.m55517b(inputStream, closeable);
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.document.export.net.AbstractC5772b
    /* renamed from: a */
    public void mo23222a() {
        Disposable disposable = this.f16243e;
        if (disposable != null && !disposable.isDisposed()) {
            this.f16243e.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m23310a(AbstractC68307f fVar) throws Exception {
        return fVar.mo238019d(3, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m23314a(NetService.Result result) throws Exception {
        C13479a.m54772d("DocumentExportExecutorImpl", "filter，status = " + ((GetExportResultParser.ExportResult) result.data).getStatus());
        if (((GetExportResultParser.ExportResult) result.data).getStatus() == 0) {
            return true;
        }
        return false;
    }

    public C5773c(Context context, String str) {
        this.f16240b = context;
        this.f16242d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23313a(AbstractC5168a aVar, Throwable th) throws Exception {
        C13479a.m54759a("DocumentExportExecutorImpl", "startExport error", th);
        aVar.mo20645a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m23311a(String str, String str2, AbstractC5168a aVar, NetService.Result result) throws Exception {
        return m23309a(str, str2, (String) result.data, aVar);
    }

    /* renamed from: a */
    private AbstractC68307f<NetService.Result<GetExportResultParser.ExportResult>> m23309a(String str, String str2, String str3, final AbstractC5168a aVar) {
        C13479a.m54764b("DocumentExportExecutorImpl", "polling getExportResult, ticket = " + str3);
        aVar.n_();
        NetService.C5077f fVar = new NetService.C5077f("/space/api/parser/get_export_result");
        fVar.mo20145a("ticket", str3);
        fVar.mo20145a(ShareHitPoint.f121869d, str);
        fVar.mo20145a("token", str2);
        return this.f16241c.mo20117a(new GetExportResultParser()).mo20141a(fVar).mo238031g($$Lambda$c$bVMWeCNoN9QBBCUSi5pR7cKZ78.INSTANCE).mo238016c(new AbstractC68322n<NetService.Result<GetExportResultParser.ExportResult>>() {
            /* class com.bytedance.ee.bear.document.export.net.C5773c.C57752 */

            /* renamed from: a */
            int f16246a;

            /* renamed from: a */
            public boolean test(NetService.Result<GetExportResultParser.ExportResult> result) throws Exception {
                C13479a.m54772d("DocumentExportExecutorImpl", "takeUtil，status = " + ((GetExportResultParser.ExportResult) result.data).getStatus());
                int i = this.f16246a + 1;
                this.f16246a = i;
                if (i < 20) {
                    aVar.mo20643a(i);
                    if (((GetExportResultParser.ExportResult) result.data).getStatus() == 0) {
                        return true;
                    }
                    return false;
                }
                throw new IOException("polling time out");
            }
        }).mo237998a((AbstractC68322n) $$Lambda$c$Y5wXwVFyPdoJLSaAvVcYvODizac.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.document.export.net.AbstractC5772b
    /* renamed from: a */
    public Disposable mo23221a(ExportFormatEnum exportFormatEnum, String str, String str2, AbstractC5168a aVar) {
        return mo23223a(exportFormatEnum, str, str2, "", aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23312a(ExportFormatEnum exportFormatEnum, String str, String str2, AbstractC5168a aVar, NetService.Result result) throws Exception {
        m23315b(exportFormatEnum, str, str2, ((GetExportResultParser.ExportResult) result.data).getTicket(), aVar);
    }

    /* renamed from: b */
    private void m23315b(final ExportFormatEnum exportFormatEnum, String str, String str2, String str3, final AbstractC5168a aVar) {
        C13479a.m54764b("DocumentExportExecutorImpl", "downloadExportFile, ticket = " + str3);
        aVar.o_();
        Request.Builder builder = new Request.Builder();
        builder.url(new HttpUrl.Builder().scheme("https").host(C6313i.f17510b).encodedPath("/space/api/parser/download").addQueryParameter("ticket", str3).addQueryParameter(ShareHitPoint.f121869d, str).addQueryParameter("token", str2).build());
        this.f16241c.mo20122b(builder.build(), new Callback() {
            /* class com.bytedance.ee.bear.document.export.net.C5773c.C57763 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                C13479a.m54759a("DocumentExportExecutorImpl", "onFailure", iOException);
                aVar.mo20645a(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                C5773c.this.f16239a = call;
                if (response.isSuccessful()) {
                    C5773c.this.mo23224a(exportFormatEnum, response, aVar);
                } else {
                    C13479a.m54758a("DocumentExportExecutorImpl", "onResponse, code = " + response.code());
                    aVar.mo20645a(new Throwable());
                }
                C5773c.this.f16239a = null;
            }
        });
    }

    /* renamed from: a */
    public Disposable mo23223a(ExportFormatEnum exportFormatEnum, String str, String str2, String str3, AbstractC5168a aVar) {
        C13479a.m54764b("DocumentExportExecutorImpl", "startExport");
        mo23222a();
        NetService.C5077f fVar = new NetService.C5077f("/space/api/parser/export");
        fVar.mo20145a(ShareHitPoint.f121869d, str);
        fVar.mo20145a("token", str2);
        fVar.mo20145a("format", exportFormatEnum.toString());
        fVar.mo20145a("ext", str3);
        final Disposable b = this.f16241c.mo20117a(new C5771a()).mo20141a(fVar).mo237985a(C11678b.m48478b()).mo238014c(new Function(str, str2, aVar) {
            /* class com.bytedance.ee.bear.document.export.net.$$Lambda$c$DjTu8WcXaYqxDsD4_hZBqF104FI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ AbstractC5168a f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5773c.this.m23311a(this.f$1, this.f$2, this.f$3, (NetService.Result) obj);
            }
        }).mo238001b(new Consumer(exportFormatEnum, str, str2, aVar) {
            /* class com.bytedance.ee.bear.document.export.net.$$Lambda$c$VSMxUOZrZnKEoInzd9Ngb3z8VXg */
            public final /* synthetic */ ExportFormatEnum f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ AbstractC5168a f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5773c.this.m23312a((C5773c) this.f$1, (ExportFormatEnum) this.f$2, this.f$3, (String) this.f$4, (AbstractC5168a) ((NetService.Result) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.export.net.$$Lambda$c$Nf9FmY2hsBT7Xyl8mChXziN0KU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5773c.m23313a(AbstractC5168a.this, (Throwable) obj);
            }
        });
        C57741 r9 = new Disposable() {
            /* class com.bytedance.ee.bear.document.export.net.C5773c.C57741 */

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                if (!b.isDisposed() || C5773c.this.f16239a == null || !C5773c.this.f16239a.isCanceled()) {
                    return false;
                }
                return true;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                C13479a.m54764b("DocumentExportExecutorImpl", "dispose");
                b.dispose();
                if (C5773c.this.f16239a != null && !C5773c.this.f16239a.isCanceled()) {
                    C5773c.this.f16239a.cancel();
                }
            }
        };
        this.f16243e = r9;
        return r9;
    }
}
