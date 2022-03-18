package com.tt.miniapp;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.network.p622a.p623a.AbstractC12794a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.Monitor;
import com.he.loader.Loader;
import com.he.loader.Resolver;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.impl.business.file.UriUtil;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.o */
public class C66536o implements Monitor.Impl, Loader {

    /* renamed from: c */
    private static final OkHttpClient f167987c = new OkHttpClient();

    /* renamed from: a */
    public IAppContext f167988a;

    /* renamed from: b */
    public AbstractC67722a f167989b;

    @Override // com.he.Monitor.Impl
    public void onRTCLogReport(String str, String str2) {
    }

    @Override // com.he.Monitor.Impl
    public void onHeliumAddViewFail() {
        m259959a("addview", 1, null);
    }

    @Override // com.he.Monitor.Impl
    public void onHeliumSetupFail() {
        m259959a("setup", 1, null);
    }

    public C66536o(IAppContext iAppContext) {
        this.f167988a = iAppContext;
        this.f167989b = (AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class);
    }

    @Override // com.he.Monitor.Impl
    public void onLoadEffectFail(Throwable th) {
        m259959a("load_effect", 1, null);
        AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "com.he.Monitor.onLoadEffectFail", th);
    }

    /* renamed from: a */
    private Uri m259958a(String str) {
        AppBrandLogger.m52830i("tma_TTAppLoaderImpl", "standardLoadMedia", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri a = UriUtil.m264453a(str);
        if (UriUtil.m264454a(a, "http") || UriUtil.m264454a(a, "https")) {
            return Uri.parse(str);
        }
        try {
            TTFile gVar = new TTFile(str);
            if (!gVar.mo235649c()) {
                return Uri.fromFile(new File(StreamLoader.waitExtractFinishIfNeeded(str, this.f167988a)));
            }
            return Uri.fromFile(this.f167989b.mo235635i(gVar, new TTFileContext(null, "TTAppLoaderImpl")));
        } catch (TTFileException e) {
            AppBrandLogger.m52829e("tma_TTAppLoaderImpl", "getSystemFile exception", e);
            return null;
        }
    }

    /* renamed from: b */
    private byte[] m259961b(String str) {
        AppBrandLogger.m52830i("tma_TTAppLoaderImpl", "standardLoadSync", str);
        try {
            return this.f167989b.mo235613b(new TTFile(str), new TTFileContext(null, "TTAppLoaderImpl"));
        } catch (TTFileException e) {
            AppBrandLogger.m52829e("tma_TTAppLoaderImpl", "standardLoadSync exception", e);
            C67500a aVar = new C67500a(C67501b.f170239g, this.f167988a);
            aVar.setErrorMessage("loadSync file: " + str + " exception!").setError(e).flush();
            return null;
        }
    }

    @Override // com.he.loader.Loader
    public Uri loadMedia(String str) {
        if (TTFileHelper.m264259a("TTAppLoaderImpl", this.f167988a)) {
            return m259958a(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return Uri.parse(str);
        }
        return Uri.fromFile(new File(StreamLoader.waitExtractFinishIfNeeded(this.f167989b.mo235082b(str), this.f167988a)));
    }

    @Override // com.he.loader.Loader
    public byte[] loadSync(String str) {
        if (TTFileHelper.m264259a("TTAppLoaderImpl", this.f167988a)) {
            return m259961b(str);
        }
        try {
            String b = this.f167989b.mo235082b(str);
            if (StreamLoader.findFile(b, this.f167988a) == null) {
                AppBrandLogger.m52828d("tma_TTAppLoaderImpl", "loadFile from file ", str);
                File file = new File(b);
                if (!file.exists() || !file.isFile() || !this.f167989b.mo235080a(file)) {
                    C67500a aVar = new C67500a(C67501b.f170239g, this.f167988a);
                    aVar.setErrorMessage("loadSync file: " + str + " error!").flush();
                    StringBuilder sb = new StringBuilder();
                    sb.append("cannot read file ");
                    sb.append(str);
                    AppBrandLogger.m52828d("tma_TTAppLoaderImpl", sb.toString());
                    return null;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            } else if (StreamLoader.findFile(b, this.f167988a) != null) {
                return StreamLoader.loadByteFromStream(b, this.f167988a);
            } else {
                C67500a aVar2 = new C67500a(C67501b.f170239g, this.f167988a);
                aVar2.setErrorMessage("loadSync file: " + str + " error, ttaPkgFile not found").flush();
                AppBrandLogger.m52828d("tma_TTAppLoaderImpl", "file ", str, " doesn't loaded, wait for resolve");
                return null;
            }
        } catch (Exception e) {
            C67500a aVar3 = new C67500a(C67501b.f170239g, this.f167988a);
            aVar3.setErrorMessage("loadSync file: " + str + " exception!").setError(e).flush();
            AppBrandLogger.m52829e("tma_TTAppLoaderImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: a */
    private void m259960a(final String str, final Resolver resolver) {
        AppBrandLogger.m52830i("tma_TTAppLoaderImpl", "standardLoad", str);
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.C66536o.C665382 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    byte[] b = C66536o.this.f167989b.mo235613b(new TTFile(str), new TTFileContext(null, "TTAppLoaderImpl"));
                    resolver.resolve(b, 0, b.length);
                } catch (TTFileException e) {
                    AppBrandLogger.m52829e("tma_TTAppLoaderImpl", "standardLoad exception", e);
                    C67500a aVar = new C67500a(C67501b.f170239g, C66536o.this.f167988a);
                    aVar.setErrorMessage("load file: " + str + " error!").setError(e).flush();
                }
            }
        }, C67554l.m262725b());
    }

    @Override // com.he.Monitor.Impl
    public void onAurumInitFail(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i2);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "unknown json exception", e);
        }
        m259959a("aurum_init", i, jSONObject);
    }

    @Override // com.he.Monitor.Impl
    public void onSmashModelDownloadSuccess(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put(UpdateKey.STATUS, 0);
            jSONObject2.put("duration", j);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "unknown json exception", e);
        }
        C67509b.m262590a("mp_smash_download", jSONObject, jSONObject2, (JSONObject) null, this.f167988a);
    }

    @Override // com.he.Monitor.Impl
    public void onSmashModelMapFail(String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put(UpdateKey.STATUS, 4);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "unknown json exception", e);
        }
        C67509b.m262590a("mp_smash_download", jSONObject, (JSONObject) null, (JSONObject) null, this.f167988a);
        AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "com.he.Monitor.onSmashModelMapFail:" + str, th);
    }

    @Override // com.he.loader.Loader
    public void loadUrl(final String str, final Resolver resolver) {
        Request request;
        if (str.startsWith("ttfile://")) {
            load(str, resolver);
            return;
        }
        try {
            request = new Request.Builder().url(str).build();
        } catch (RuntimeException e) {
            AppBrandLogger.m52829e("tma_TTAppLoaderImpl", e);
            request = null;
        }
        if (request == null) {
            C67500a aVar = new C67500a(C67501b.f170241i, this.f167988a);
            aVar.setErrorMessage("loadUrl file: " + str + ", url invalid!").flush();
            if (resolver != null) {
                resolver.reject(new IOException("unexpected url: " + str));
                return;
            }
            return;
        }
        f167987c.newCall(request).enqueue(new AbstractC12794a() {
            /* class com.tt.miniapp.C66536o.C665393 */

            @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.AbstractC12794a
            /* renamed from: a */
            public void mo48350a(Call call, Response response) throws IOException {
                if (response.body() != null) {
                    byte[] bytes = response.body().bytes();
                    resolver.resolve(bytes, 0, bytes.length);
                    return;
                }
                C67500a aVar = new C67500a(C67501b.f170241i, C66536o.this.f167988a);
                aVar.setErrorMessage("loadUrl file: " + str + ", resp body is empty").flush();
                AppBrandLogger.m52829e("tma_TTAppLoaderImpl", "response.body() == null");
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                AppBrandLogger.m52829e("tma_TTAppLoaderImpl", Log.getStackTraceString(iOException));
                C67500a aVar = new C67500a(C67501b.f170241i, C66536o.this.f167988a);
                aVar.setErrorMessage("loadUrl file: " + str + ", onFailure").setError(iOException).flush();
                resolver.reject(iOException);
            }
        });
    }

    @Override // com.he.loader.Loader
    public void load(String str, final Resolver resolver) {
        if (TTFileHelper.m264259a("TTAppLoaderImpl", this.f167988a)) {
            m259960a(str, resolver);
            return;
        }
        try {
            final String b = this.f167989b.mo235082b(str);
            if (StreamLoader.findFile(b, this.f167988a) == null) {
                AppBrandLogger.m52828d("tma_TTAppLoaderImpl", "loadFile from file ", str);
                File file = new File(b);
                if (!file.exists() || !file.isFile() || !this.f167989b.mo235080a(file)) {
                    C67500a aVar = new C67500a(C67501b.f170239g, this.f167988a);
                    aVar.setErrorMessage("load file: " + str + " error!").flush();
                    throw new IOException("cannot read file " + str);
                }
                resolver.resolve(file);
            } else if (StreamLoader.findFile(b, this.f167988a) != null) {
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.C66536o.C665371 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        byte[] loadByteFromStream = StreamLoader.loadByteFromStream(b, C66536o.this.f167988a);
                        resolver.resolve(loadByteFromStream, 0, loadByteFromStream.length);
                    }
                }, C67554l.m262725b());
            } else {
                AppBrandLogger.m52828d("tma_TTAppLoaderImpl", "file ", str, " doesn't loaded, wait for resolve");
            }
        } catch (IOException e) {
            AppBrandLogger.m52829e("tma_TTAppLoaderImpl", Log.getStackTraceString(e));
            resolver.reject(e);
            C67500a aVar2 = new C67500a(C67501b.f170239g, this.f167988a);
            aVar2.setErrorMessage("load file: " + str + " error!").setError(e).flush();
        } catch (Exception e2) {
            AppBrandLogger.m52829e("tma_TTAppLoaderImpl", Log.getStackTraceString(e2));
            C67500a aVar3 = new C67500a(C67501b.f170239g, this.f167988a);
            aVar3.setErrorMessage("load file: " + str + " error!").setError(e2).flush();
        }
    }

    /* renamed from: a */
    private void m259959a(String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("event", str);
            jSONObject2.put(UpdateKey.STATUS, i);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "unknown json exception", e);
        }
        C67509b.m262590a("mp_he_report", jSONObject2, (JSONObject) null, jSONObject, this.f167988a);
    }

    @Override // com.he.Monitor.Impl
    public void onAsyncCompile(int i, int i2, int i3) {
        if (i != 0 && i2 != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                double d = (double) i2;
                jSONObject.put("duration", d / 1000.0d);
                double d2 = (double) i;
                jSONObject.put("speed", (d2 / 1.024d) / d);
                jSONObject.put("inflation", ((double) i3) / d2);
            } catch (JSONException unused) {
            }
            C67509b.m262590a("mp_js_async_compile", (JSONObject) null, jSONObject, (JSONObject) null, this.f167988a);
        }
    }

    @Override // com.he.Monitor.Impl
    public void onCameraOpenFail(int i, int i2, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
            jSONObject.put("retries", i2);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "unknown json exception", e);
        }
        m259959a("camera_open", 1, jSONObject);
        AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "com.he.Monitor.onCameraOpenFail:" + i + " retries:" + i2, th);
    }

    @Override // com.he.Monitor.Impl
    public void onSmashModelDownloadFail(String str, int i, long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put(UpdateKey.STATUS, i);
            jSONObject2.put("duration", j);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "unknown json exception", e);
        }
        C67509b.m262590a("mp_smash_download", jSONObject, jSONObject2, (JSONObject) null, this.f167988a);
        AppBrandLogger.eWithThrowable("tma_TTAppLoaderImpl", "com.he.Monitor.onSmashDownLoadFail:" + str + " status:" + i, th);
    }
}
