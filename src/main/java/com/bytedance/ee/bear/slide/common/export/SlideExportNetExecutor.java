package com.bytedance.ee.bear.slide.common.export;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.bear.slide.common.export.AbstractC11392a;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13680g;
import com.bytedance.ee.util.io.NonProguard;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class SlideExportNetExecutor implements Handler.Callback {

    /* renamed from: a */
    private int f30589a;

    /* renamed from: b */
    private Context f30590b;

    /* renamed from: c */
    private NetService f30591c;

    /* renamed from: d */
    private String f30592d;

    /* renamed from: e */
    private List<Call> f30593e;

    /* renamed from: f */
    private Handler f30594f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g */
    private C68289a f30595g;

    /* renamed from: h */
    private AbstractC11392a.AbstractC11393a f30596h;

    /* renamed from: lambda$Bad7CgFubYTZ5qY-ag1JnYChX7k  reason: not valid java name */
    public static /* synthetic */ void m269972lambda$Bad7CgFubYTZ5qYag1JnYChX7k(SlideExportNetExecutor slideExportNetExecutor, String str, NetService.Result result) {
        slideExportNetExecutor.m47281a(str, result);
    }

    public static /* synthetic */ void lambda$OWGbwxwdPVeYXjRHNjO8Z7PcZCc(SlideExportNetExecutor slideExportNetExecutor, Throwable th) {
        slideExportNetExecutor.m47289b(th);
    }

    public static /* synthetic */ NetService.Result lambda$_BzhkgyI3G6LeBTO5Zfp74RRG_c(SlideExportNetExecutor slideExportNetExecutor, String str) {
        return slideExportNetExecutor.m47279a(str);
    }

    public static /* synthetic */ void lambda$c557XCur3uyrgeWPlptVbfb7PNM(SlideExportNetExecutor slideExportNetExecutor) {
        slideExportNetExecutor.m47290c();
    }

    /* access modifiers changed from: package-private */
    public class ExportStatusModel implements NonProguard {
        private int status;
        private String ticket;

        public int getStatus() {
            return this.status;
        }

        public String getTicket() {
            return this.ticket;
        }

        public void setStatus(int i) {
            this.status = i;
        }

        /* access modifiers changed from: package-private */
        public void setTicket(String str) {
            this.ticket = str;
        }

        ExportStatusModel() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43595a(String str, String str2, String str3, String str4) {
        this.f30593e.clear();
        this.f30592d = str4;
        m47285a(str, str2, str3);
    }

    /* renamed from: a */
    private void m47285a(String str, String str2, String str3) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/parser/export");
        fVar.mo20143a(2);
        fVar.mo20145a("token", str2);
        fVar.mo20145a("format", str);
        fVar.mo20145a("ext", str3);
        this.f30595g.mo237937a(this.f30591c.mo20117a($$Lambda$SlideExportNetExecutor$uTvWeKw855dsvIdz9qLDZEcYA_I.INSTANCE).mo20141a(fVar).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportNetExecutor$Bad7CgFubYTZ5qYag1JnYChX7k */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SlideExportNetExecutor.m269972lambda$Bad7CgFubYTZ5qYag1JnYChX7k(SlideExportNetExecutor.this, this.f$1, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportNetExecutor$OWGbwxwdPVeYXjRHNjO8Z7PcZCc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SlideExportNetExecutor.lambda$OWGbwxwdPVeYXjRHNjO8Z7PcZCc(SlideExportNetExecutor.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: a */
    public void mo43596a(Response response, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        if (response == null || !response.isSuccessful()) {
            mo43593a();
            return;
        }
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream byteStream = response.body().byteStream();
            try {
                String str2 = this.f30592d;
                if (TextUtils.equals(str, "slide2pdf")) {
                    str2 = str2 + ".pdf";
                } else if (TextUtils.equals(str, "slide2png")) {
                    str2 = str2 + ".zip";
                }
                File file = new File(C11417h.m47420a(this.f30590b).getAbsolutePath(), str2);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
                try {
                    for (int read = byteStream.read(bArr); read != -1; read = byteStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    C13675f.m55496a(this.f30590b, file.getAbsolutePath());
                    m47282a(str, file);
                    C13675f.m55517b(byteStream, fileOutputStream);
                } catch (Exception e2) {
                    e = e2;
                    inputStream = byteStream;
                    try {
                        C13479a.m54761a("SlideExportNetExecutor", e);
                        mo43593a();
                        C13675f.m55517b(inputStream, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C13675f.m55517b(inputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = byteStream;
                    C13675f.m55517b(inputStream, fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
                inputStream = byteStream;
                C13479a.m54761a("SlideExportNetExecutor", e);
                mo43593a();
                C13675f.m55517b(inputStream, fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                inputStream = byteStream;
                C13675f.m55517b(inputStream, fileOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
            C13479a.m54761a("SlideExportNetExecutor", e);
            mo43593a();
            C13675f.m55517b(inputStream, fileOutputStream);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            C13675f.m55517b(inputStream, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: c */
    private /* synthetic */ void m47290c() {
        AbstractC11392a.AbstractC11393a aVar = this.f30596h;
        if (aVar != null) {
            aVar.mo43634a();
        }
    }

    /* renamed from: a */
    public void mo43593a() {
        this.f30594f.post(new Runnable() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportNetExecutor$c557XCur3uyrgeWPlptVbfb7PNM */

            public final void run() {
                SlideExportNetExecutor.lambda$c557XCur3uyrgeWPlptVbfb7PNM(SlideExportNetExecutor.this);
            }
        });
    }

    /* renamed from: b */
    public void mo43597b() {
        this.f30595g.mo237935a();
        for (Call call : this.f30593e) {
            call.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43594a(AbstractC11392a.AbstractC11393a aVar) {
        this.f30596h = aVar;
    }

    /* renamed from: b */
    private /* synthetic */ void m47289b(Throwable th) throws Exception {
        C13479a.m54761a("SlideExportNetExecutor", th);
        this.f30595g.mo237935a();
        mo43593a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47286a(Throwable th) throws Exception {
        C13479a.m54761a("SlideExportNetExecutor", th);
        this.f30595g.mo237935a();
        mo43593a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ NetService.Result m47287b(String str) throws NetService.ParseException {
        try {
            String optString = new JSONObject(str).optString("ticket");
            NetService.Result result = new NetService.Result();
            result.setData(optString);
            return result;
        } catch (JSONException e) {
            C13479a.m54761a("SlideExportNetExecutor", e);
            throw new NetService.ParseException();
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f30596h.mo43635a((Uri) message.obj);
            return false;
        } else if (i != 2) {
            return false;
        } else {
            this.f30596h.mo43636a((List) message.obj);
            return false;
        }
    }

    /* renamed from: a */
    private /* synthetic */ NetService.Result m47279a(String str) throws NetService.ParseException {
        ExportStatusModel exportStatusModel = new ExportStatusModel();
        try {
            JSONObject jSONObject = new JSONObject(str);
            exportStatusModel.setStatus(jSONObject.optInt(UpdateKey.STATUS));
            exportStatusModel.setTicket(jSONObject.optString("ticket"));
            NetService.Result result = new NetService.Result();
            result.setData(exportStatusModel);
            C13479a.m54772d("SlideExportNetExecutor", "parse..." + exportStatusModel.getStatus());
            return result;
        } catch (JSONException e) {
            C13479a.m54761a("SlideExportNetExecutor", e);
            throw new NetService.ParseException();
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m47281a(String str, NetService.Result result) throws Exception {
        String str2 = (String) result.getData();
        m47283a(str2, str);
        C13479a.m54772d("SlideExportNetExecutor", str2);
    }

    SlideExportNetExecutor(Context context, AbstractC4928g gVar) {
        this.f30590b = context;
        this.f30591c = (NetService) KoinJavaComponent.m268610a(NetService.class);
        this.f30593e = new ArrayList();
        this.f30595g = new C68289a();
    }

    /* renamed from: b */
    private void m47288b(String str, final String str2) {
        C13479a.m54758a("SlideExportNetExecutor", "downloadFile()...");
        Request.Builder builder = new Request.Builder();
        HttpUrl.Builder newBuilder = HttpUrl.parse("https://" + C6313i.f17510b + "/space/api/parser/download").newBuilder();
        newBuilder.addQueryParameter("ticket", str);
        builder.url(newBuilder.build());
        Call newCall = C12617b.m52365c().newBuilder().connectTimeout(120, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).retryOnConnectionFailure(false).dispatcher(new Dispatcher(BearExecutors.m48467b())).cookieJar(C4969a.m20606a()).build().newCall(builder.build());
        this.f30593e.add(newCall);
        newCall.enqueue(new Callback() {
            /* class com.bytedance.ee.bear.slide.common.export.SlideExportNetExecutor.C113881 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (call.isCanceled()) {
                    C13479a.m54772d("SlideExportNetExecutor", "call is cancel...");
                    return;
                }
                C13479a.m54761a("SlideExportNetExecutor", iOException);
                SlideExportNetExecutor.this.mo43593a();
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (call.isCanceled()) {
                    C13479a.m54772d("SlideExportNetExecutor", "call is cancel...");
                } else if (response.isSuccessful()) {
                    SlideExportNetExecutor.this.mo43596a(response, str2);
                } else {
                    SlideExportNetExecutor.this.mo43593a();
                }
            }
        });
    }

    /* renamed from: a */
    private void m47282a(String str, File file) {
        if (str.equals("slide2pdf")) {
            Uri a = C13671b.m55462a(this.f30590b, file.getName(), null, null);
            boolean a2 = C13671b.m55469a(this.f30590b, file.getAbsolutePath(), a);
            C13671b.m55476e(this.f30590b, a);
            try {
                C13675f.m55498a(file);
                if (a2) {
                    this.f30594f.sendMessage(this.f30594f.obtainMessage(1, a));
                    return;
                }
                mo43593a();
            } catch (IOException e) {
                C13479a.m54761a("SlideExportNetExecutor", e);
                mo43593a();
            }
        } else if (str.equals("slide2png")) {
            File file2 = new File(this.f30590b.getExternalCacheDir(), "ccm" + File.separator + "Slide");
            String str2 = file2.getPath() + File.separator + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_temp";
            C11417h.m47422a(file, str2);
            File file3 = new File(str2);
            ArrayList arrayList = new ArrayList();
            m47280a(this.f30590b, file3.getPath(), C13680g.f35878a, arrayList);
            try {
                C13675f.m55513b(file3);
                if (arrayList.size() > 0) {
                    this.f30594f.sendMessage(this.f30594f.obtainMessage(2, arrayList));
                    return;
                }
                mo43593a();
            } catch (IOException e2) {
                C13479a.m54761a("SlideExportNetExecutor", e2);
                mo43593a();
            }
        }
    }

    /* renamed from: a */
    private void m47283a(String str, String str2) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/parser/get_export_result");
        fVar.mo20143a(2);
        fVar.mo20145a("ticket", str);
        this.f30589a = 0;
        this.f30595g.mo237937a(this.f30591c.mo20117a(new NetService.AbstractC5074c() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportNetExecutor$_BzhkgyI3G6LeBTO5Zfp74RRG_c */

            @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
            public final NetService.Result parse(String str) {
                return SlideExportNetExecutor.lambda$_BzhkgyI3G6LeBTO5Zfp74RRG_c(SlideExportNetExecutor.this, str);
            }
        }).mo20141a(fVar).mo237984a(3L, TimeUnit.SECONDS, false).mo238032h().mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str, str2) {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportNetExecutor$tMSv9W_Mq1vkeIiaiP_lRDZUw8k */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SlideExportNetExecutor.this.m47284a((SlideExportNetExecutor) this.f$1, this.f$2, (String) ((NetService.Result) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportNetExecutor$uJPbnNKkN5AIragoAstAE46ZvN4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SlideExportNetExecutor.this.m47286a((SlideExportNetExecutor) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47284a(String str, String str2, NetService.Result result) throws Exception {
        int i = this.f30589a + 1;
        this.f30589a = i;
        if (i > 20) {
            C13479a.m54772d("SlideExportNetExecutor", "access times > 20...");
            this.f30595g.mo237935a();
            mo43593a();
            return;
        }
        int status = ((ExportStatusModel) result.getData()).getStatus();
        C13479a.m54772d("SlideExportNetExecutor", "accept..." + status);
        if (status == 0) {
            m47288b(str, str2);
            this.f30595g.mo237935a();
        } else if (status < 0 || status > 3) {
            C13479a.m54772d("SlideExportNetExecutor", "mission fail...");
            this.f30595g.mo237935a();
            mo43593a();
        }
    }

    /* renamed from: a */
    public static void m47280a(Context context, String str, String str2, List<Uri> list) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory()) {
                String[] list2 = file.list();
                if (list2 != null && list2.length > 0) {
                    for (String str3 : list2) {
                        m47280a(context, new File(str, str3).getPath(), str2, list);
                    }
                    return;
                }
                return;
            }
            Uri a = C13671b.m55462a(context, file.getName(), null, str2);
            if (C13671b.m55469a(context, str, a)) {
                list.add(a);
            }
            C13671b.m55476e(context, a);
        }
    }
}
