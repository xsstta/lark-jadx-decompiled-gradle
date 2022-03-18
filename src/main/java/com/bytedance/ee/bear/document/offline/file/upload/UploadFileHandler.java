package com.bytedance.ee.bear.document.offline.file.upload;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.apm.util.C3130n;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.alert.FullQuoteDialogHandler;
import com.bytedance.ee.bear.document.offline.file.FileResultModel;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.file.paste.PasteFileHelper;
import com.bytedance.ee.bear.document.offline.file.upload.UploadFileHandler;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.permission.C6063a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.export.C9225l;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.support.api.entity.core.CommonCode;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.p3511d.AbstractC70020b;

public class UploadFileHandler implements AbstractC7945d<FileUploadModel> {

    /* renamed from: a */
    public static List<String> f16647a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private Context f16648b;

    /* renamed from: c */
    private AbstractC5233x f16649c;

    /* renamed from: d */
    private NetService f16650d;

    /* renamed from: e */
    private ConnectionService f16651e;

    /* renamed from: f */
    private C5950f f16652f;

    /* renamed from: g */
    private From f16653g;

    /* renamed from: h */
    private FileUploadModel f16654h;

    public enum From {
        RN,
        WebView,
        Native
    }

    /* renamed from: a */
    private String m23950a(int i) {
        return i != 1 ? i != 2 ? "uploadToDocs" : "copy" : "uploadToDrive";
    }

    /* renamed from: a */
    public void handle(FileUploadModel fileUploadModel, AbstractC7947h hVar) {
        if (fileUploadModel == null) {
            C13479a.m54758a("UploadFileHandler", "handle()... data is empty");
            return;
        }
        this.f16654h = fileUploadModel;
        String fetchFirstUuid = fileUploadModel.fetchFirstUuid();
        C13479a.m54764b("UploadFileHandler", "handle()... data = " + fileUploadModel + " uuid = " + fetchFirstUuid + ", from = " + this.f16653g);
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238020d(new Function(fileUploadModel) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$8dZjecgRxUMK2Rl8v1miDLiC_QQ */
            public final /* synthetic */ FileUploadModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.this.m23964b(this.f$1, (String) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$HVeymLzjestYsyxdJsXS2E8qxXY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.m23963b(FileUploadModel.this, (Integer) obj);
            }
        }).mo237990a((Function) new Function(fileUploadModel) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$ERqkq7DDgLakvxxWYKiwYF64lo0 */
            public final /* synthetic */ FileUploadModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.this.m23953a(this.f$1, (Integer) obj);
            }
        }).mo238029f(new Function(fetchFirstUuid) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$t3_DpJVGPb2zcHDX6uY3iafZI4M */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.m23946a(this.f$0, (Throwable) obj);
            }
        }).mo238001b(new Consumer(hVar) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$GvPAPI5U3XJ4UEhDbAc6fkSkxLI */
            public final /* synthetic */ AbstractC7947h f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadFileHandler.this.m23958a((UploadFileHandler) this.f$1, (AbstractC7947h) ((FileResultModel) obj));
            }
        }, new Consumer(fetchFirstUuid, hVar) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$zQJulCG4v7BqDb8r88kitrDbWwg */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AbstractC7947h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UploadFileHandler.this.m23959a((UploadFileHandler) this.f$1, (String) this.f$2, (AbstractC7947h) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23959a(String str, AbstractC7947h hVar, Throwable th) throws Exception {
        C13479a.m54758a("UploadFileHandler", "err in upload .... throwable = " + th);
        FileResultModel fileResultModel = new FileResultModel();
        fileResultModel.setUuid(str);
        fileResultModel.setMessage(th.getMessage());
        m23956a(fileResultModel, th, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m23955a(boolean z, FileUploadModel fileUploadModel, C5937c cVar, FileResultModel fileResultModel, long j, UploadResult uploadResult) throws Exception {
        C13479a.m54764b("UploadFileHandler", "doFileUploadProcess：isNewUpload = " + z + ", result = " + uploadResult);
        if (z) {
            m23957a(fileUploadModel, cVar, uploadResult);
        }
        fileResultModel.setCode(uploadResult.getCode());
        fileResultModel.setUuid(fileUploadModel.fetchFirstUuid());
        return AbstractC68307f.m265083a(new C5943b(cVar, uploadResult, fileUploadModel, fileResultModel, j, C13675f.m55519c(m23966b(cVar), m23951a(cVar))));
    }

    /* renamed from: a */
    private void m23957a(FileUploadModel fileUploadModel, C5937c cVar, UploadResult uploadResult) {
        if (cVar != null && uploadResult != null && !TextUtils.isEmpty(uploadResult.getFileToken())) {
            String str = C6313i.m25327a().mo25399g(cVar.mo23959c()).f17446a;
            String fileToken = uploadResult.getFileToken();
            boolean b = m23966b(cVar);
            String a = m23951a(cVar);
            if (TextUtils.isEmpty(a)) {
                C13479a.m54775e("UploadFileHandler", "The path and uri is null.");
                return;
            }
            this.f16652f.mo24060a(str, fileToken, C13675f.m55491a(b, a));
        }
    }

    /* renamed from: a */
    private void m23956a(FileResultModel fileResultModel, Throwable th, AbstractC7947h hVar) {
        if (th != null) {
            fileResultModel.setMessage(th.getMessage());
        }
        if (m23960a(fileResultModel)) {
            fileResultModel.setShowQuotaAlert(true);
            new FullQuoteDialogHandler("uploadFile from: " + this.f16653g).mo22627a(FullQuotoConfig.UPLOAD);
        }
        if (m23965b(fileResultModel)) {
            fileResultModel.setShowQuotaAlert(true);
            new FullQuoteDialogHandler("uploadFile from: " + this.f16653g).mo22628a(this.f16654h.getMountNodeToken(), this.f16654h.getMountPoint());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onJsCallback from = ");
        sb.append(this.f16653g);
        sb.append(", uuid = ");
        sb.append(fileResultModel.getUuid());
        sb.append(", code = ");
        sb.append(fileResultModel.getCode());
        sb.append(", token = ");
        sb.append(C13598b.m55197d(fileResultModel.getData() != null ? fileResultModel.getData().getToken() : ""));
        C13479a.m54764b("UploadFileHandler", sb.toString());
        hVar.mo17189a(fileResultModel);
    }

    /* renamed from: a */
    private boolean m23960a(FileResultModel fileResultModel) {
        if (this.f16654h == null || fileResultModel.getCode() != 13001) {
            return false;
        }
        if (this.f16653g == From.WebView) {
            return true;
        }
        String contentType = this.f16654h.getContentType();
        if (TextUtils.isEmpty(contentType) || contentType.contains("file") || contentType.contains("video")) {
        }
        return true;
    }

    /* renamed from: b */
    private boolean m23965b(FileResultModel fileResultModel) {
        if (this.f16654h == null || fileResultModel.getCode() != 90003061) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private C5937c m23968d(FileUploadModel fileUploadModel) {
        String file_url = fileUploadModel.getFile_url();
        if (TextUtils.isEmpty(file_url) || !file_url.startsWith("docsource://com.bytedance.net/file/f/")) {
            return null;
        }
        return C5955d.m24025b().mo24097d(file_url);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5943b m23947a(C5943b bVar) {
        if (!(bVar == null || bVar.f16658d.getCode() != 0 || bVar.f16657c == null || bVar.f16656b == null || bVar.f16659e == -1)) {
            long currentTimeMillis = System.currentTimeMillis() - bVar.f16659e;
            String str = TextUtils.equals(Comment.f24093e, bVar.f16657c.getFrom()) ? Comment.f24093e : "others";
            String contentType = bVar.f16657c.getContentType();
            int indexOf = contentType.indexOf("/");
            if (indexOf >= 0) {
                contentType = contentType.substring(0, indexOf);
            }
            this.f16652f.mo24059a(bVar.f16656b.getCode(), bVar.f16656b.getMessage(), contentType, str, m23950a(bVar.f16657c.getUploadType()), currentTimeMillis, bVar.f16660f);
        }
        return bVar;
    }

    /* renamed from: b */
    private C3130n<C5937c, Boolean> m23961b(FileUploadModel fileUploadModel) {
        C5937c d = m23968d(fileUploadModel);
        if (d == null) {
            return new C3130n<>(null, true);
        }
        boolean b = m23966b(d);
        String a = m23951a(d);
        if (!C13675f.m55529e(b, a) || C13675f.m55519c(b, a) <= 0) {
            C13479a.m54758a("UploadFileHandler", "checkLocalFileModel... file : " + C13598b.m55197d(d.mo23957b()) + " invalid!");
            return new C3130n<>(d, false);
        }
        C13479a.m54772d("UploadFileHandler", "file : " + a + " is valid : true");
        return new C3130n<>(d, true);
    }

    /* renamed from: c */
    private int m23967c(FileUploadModel fileUploadModel) {
        C13479a.m54764b("UploadFileHandler", "funcCheckPermission");
        if (fileUploadModel == null) {
            return 1;
        }
        if (TextUtils.equals(Comment.f24093e, fileUploadModel.getFrom())) {
            C13479a.m54764b("UploadFileHandler", "funcCheckPermission... this is from comment, let him pass");
            return 0;
        }
        BearUrl g = C6313i.m25327a().mo25399g(fileUploadModel.getDoc_url());
        String str = g.f17446a;
        C6063a.C6065a a = C6063a.m24571a().mo24541a(g.f17447b, C8275a.m34051b(str), 60, false);
        if (a == null) {
            return 1;
        }
        return a.f16948a;
    }

    /* renamed from: a */
    private AbstractC68307f<FileResultModel> m23949a(FileUploadModel fileUploadModel) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48478b()).mo238014c(new Function(fileUploadModel) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$qgmBS4ZQcIpVfrXMogcUj4loGHE */
            public final /* synthetic */ FileUploadModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.this.m23954a(this.f$1, (String) obj);
            }
        }).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$dboVOknr3_qxIztbY__ntMkctc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.this.m23947a((UploadFileHandler.C5943b) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$AOcPyHiw81671FgC_muNmDJRiTs */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.this.m23962b((UploadFileHandler.C5943b) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public FileResultModel m23962b(C5943b bVar) throws C5942a {
        if (bVar.f16655a == null || bVar.f16658d == null) {
            C13479a.m54758a("UploadFileHandler", "unknown after uploading error");
            throw new C5942a("unknown error", 1);
        }
        if (bVar.f16658d.getCode() == 0 && bVar.f16656b != null && !TextUtils.isEmpty(bVar.f16656b.getFileToken())) {
            String fileToken = bVar.f16656b.getFileToken();
            if (TextUtils.equals(Comment.f24093e, bVar.f16657c.getFrom())) {
                if (bVar.f16657c.getUuids() != null && bVar.f16657c.getUuids().length > 0) {
                    C9225l.m38239b(bVar.f16657c.getUuids()[0], fileToken);
                }
                C9225l.m38237a(fileToken, bVar.f16657c.getFile_url());
            }
            bVar.f16655a.mo23966f(fileToken);
            C5955d.m24025b().mo24082b(bVar.f16655a);
            bVar.f16658d.setData(new FileResultModel.Data(fileToken, fileToken, bVar.f16657c.getUploadType()));
        }
        if (TextUtils.isEmpty(bVar.f16658d.getUuid()) && bVar.f16657c != null) {
            bVar.f16658d.setUuid(bVar.f16657c.fetchFirstUuid());
        }
        return bVar.f16658d;
    }

    /* renamed from: a */
    private String m23951a(C5937c cVar) {
        String d = cVar.mo23961d();
        return TextUtils.isEmpty(d) ? cVar.mo23973j() : d;
    }

    /* renamed from: b */
    private boolean m23966b(C5937c cVar) {
        return TextUtils.isEmpty(cVar.mo23961d());
    }

    /* renamed from: a */
    private Map<String, String> m23952a(String str) {
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            HashMap hashMap = new HashMap();
            Map<String, Object> innerMap = parseObject.getInnerMap();
            for (String str2 : innerMap.keySet()) {
                hashMap.put(str2, (String) innerMap.get(str2));
            }
            return hashMap;
        } catch (Exception e) {
            C13479a.m54758a("UploadFileHandler", "getExtraParams error: " + e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.file.upload.UploadFileHandler$a */
    public static class C5942a extends Exception {
        public int errCode;

        public C5942a(String str, int i) {
            super(str);
            this.errCode = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23958a(AbstractC7947h hVar, FileResultModel fileResultModel) throws Exception {
        m23956a(fileResultModel, (Throwable) null, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Integer m23964b(FileUploadModel fileUploadModel, String str) throws Exception {
        return Integer.valueOf(m23967c(fileUploadModel));
    }

    /* renamed from: a */
    private AbstractC5948e m23948a(int i, Context context) {
        if (i == 1) {
            return new C5945c();
        }
        return new DocFileUploadHelper(context, this.f16649c, this.f16650d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ FileResultModel m23946a(String str, Throwable th) throws Exception {
        C13479a.m54759a("UploadFileHandler", "handle uploading err : ", th);
        FileResultModel fileResultModel = new FileResultModel();
        if (th instanceof C5942a) {
            fileResultModel.setCode(((C5942a) th).errCode);
        }
        if (th instanceof NetService.HttpErrorException) {
            fileResultModel.setCode(((NetService.HttpErrorException) th).getCode());
        }
        if (th instanceof RustIOException) {
            fileResultModel.setCode(((RustIOException) th).getRustSdkErrorCode());
        }
        fileResultModel.setUuid(str);
        fileResultModel.setMessage(th.getMessage());
        return fileResultModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Integer m23963b(FileUploadModel fileUploadModel, Integer num) throws Exception {
        if (num.intValue() == 0) {
            return Integer.valueOf(fileUploadModel.getUploadType());
        }
        C13479a.m54758a("UploadFileHandler", "owner object permission check failed, err code = " + num);
        throw new C5942a("owner object no permission!", 2004);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m23953a(FileUploadModel fileUploadModel, Integer num) throws Exception {
        if (num.intValue() == 2) {
            return new PasteFileHelper(this.f16650d, this.f16651e).mo23975a(fileUploadModel);
        }
        return m23949a(fileUploadModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m23954a(FileUploadModel fileUploadModel, String str) throws Exception {
        boolean z;
        AbstractC68307f<UploadResult> fVar;
        long j;
        F f;
        boolean z2;
        F f2;
        Map<String, String> map;
        Map<String, String> map2;
        C13479a.m54764b("UploadFileHandler", "doFileUploadProcess, file: " + C13598b.m55197d(fileUploadModel.getToken()));
        FileResultModel fileResultModel = new FileResultModel();
        C3130n<C5937c, Boolean> b = m23961b(fileUploadModel);
        F f3 = b.f10052a;
        if (b.f10053b != null) {
            z = b.f10053b.booleanValue();
        } else {
            z = false;
        }
        if (f3 == null || !z) {
            C13479a.m54758a("UploadFileHandler", "corresponding file model not found or file not exists!");
            throw new C5942a("file not found!", CommonCode.StatusCode.API_CLIENT_EXPIRED);
        }
        C13479a.m54764b("UploadFileHandler", "doFileUploadProcess, fileModel: " + ((Object) f3));
        String h = f3.mo23969h();
        AbstractC5948e a = m23948a(fileUploadModel.getUploadType(), this.f16648b);
        if (TextUtils.isEmpty(h) || !f3.mo23957b().equals(fileUploadModel.getToken())) {
            if (!f3.mo23957b().equals(fileUploadModel.getToken())) {
                C13479a.m54764b("UploadFileHandler", "different token! fileModel token = " + C13598b.m55197d(f3.mo23957b()) + ", current doc token = " + C13598b.m55197d(fileUploadModel.getToken()));
                C5937c cVar = new C5937c(f3);
                cVar.mo23958b(fileUploadModel.getToken());
                cVar.mo23960c(fileUploadModel.getDoc_url());
                f2 = cVar;
            } else {
                f2 = f3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean b2 = m23966b((C5937c) f2);
            String a2 = m23951a((C5937c) f2);
            if (TextUtils.isEmpty(a2) || !C13675f.m55529e(b2, a2) || C13675f.m55519c(b2, a2) <= 0) {
                C13479a.m54758a("UploadFileHandler", "can not find the cached file, terminate upload process");
                throw new C5942a("uploaded cache file not exists!", CommonCode.StatusCode.API_CLIENT_EXPIRED);
            }
            if (fileUploadModel.getUploadParams() == null || TextUtils.isEmpty(fileUploadModel.getUploadParams().get("extraParams"))) {
                map = null;
            } else {
                map = m23952a(fileUploadModel.getUploadParams().get("extraParams"));
            }
            C13479a.m54772d("UploadFileHandler", "extra params: " + map);
            if (fileUploadModel.getUploadParams() == null || TextUtils.isEmpty(fileUploadModel.getUploadParams().get("extRust"))) {
                map2 = null;
            } else {
                map2 = m23952a(fileUploadModel.getUploadParams().get("extRust"));
            }
            C13479a.m54772d("UploadFileHandler", "extra rust: " + map2);
            AbstractC68307f<UploadResult> a3 = a.mo18066a(fileUploadModel, b2, a2, fileUploadModel.getMultiparts(), map, map2, new C5947d(f2, fileUploadModel, f16647a));
            f = f2;
            j = currentTimeMillis;
            z2 = true;
            fVar = a3;
        } else {
            fVar = a.mo18067a(h, new C5947d(f3, fileUploadModel, f16647a));
            f = f3;
            j = -1;
            z2 = false;
        }
        return fVar.mo238014c(new Function(z2, fileUploadModel, f, fileResultModel, j) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$UploadFileHandler$QVA2nMSRdhxuyli3zZ6HnFUapP4 */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ FileUploadModel f$2;
            public final /* synthetic */ C5937c f$3;
            public final /* synthetic */ FileResultModel f$4;
            public final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UploadFileHandler.this.m23955a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (UploadResult) obj);
            }
        });
    }

    public UploadFileHandler(Context context, AbstractC5233x xVar, NetService netService, ConnectionService connectionService, From from) {
        this.f16648b = context.getApplicationContext();
        this.f16649c = xVar;
        this.f16650d = netService;
        this.f16651e = connectionService;
        this.f16653g = from;
        this.f16652f = new C5950f(xVar);
        C6063a.m24571a().mo24542a(this.f16650d);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.file.upload.UploadFileHandler$b */
    public static class C5943b {

        /* renamed from: a */
        public C5937c f16655a;

        /* renamed from: b */
        public UploadResult f16656b;

        /* renamed from: c */
        public FileUploadModel f16657c;

        /* renamed from: d */
        public FileResultModel f16658d;

        /* renamed from: e */
        public long f16659e;

        /* renamed from: f */
        public long f16660f;

        public C5943b(C5937c cVar, UploadResult uploadResult, FileUploadModel fileUploadModel, FileResultModel fileResultModel, long j, long j2) {
            this.f16655a = cVar;
            this.f16656b = uploadResult;
            this.f16657c = fileUploadModel;
            this.f16658d = fileResultModel;
            this.f16659e = j;
            this.f16660f = j2;
        }
    }
}
