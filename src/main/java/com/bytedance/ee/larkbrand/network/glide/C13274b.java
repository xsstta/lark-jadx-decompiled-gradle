package com.bytedance.ee.larkbrand.network.glide;

import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.util.C2558c;
import com.bumptech.glide.util.C2567j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.larkbrand.network.glide.b */
public class C13274b implements AbstractC2147d<InputStream>, Callback {

    /* renamed from: a */
    private final Call.Factory f35157a;

    /* renamed from: b */
    private final GlideRequest f35158b;

    /* renamed from: c */
    private InputStream f35159c;

    /* renamed from: d */
    private ResponseBody f35160d;

    /* renamed from: e */
    private AbstractC2147d.AbstractC2148a<? super InputStream> f35161e;

    /* renamed from: f */
    private volatile Call f35162f;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<InputStream> mo10481a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
        Call call = this.f35162f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        try {
            InputStream inputStream = this.f35159c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f35160d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f35161e = null;
    }

    public C13274b(Call.Factory factory, GlideRequest glideRequest) {
        this.f35157a = factory;
        this.f35158b = glideRequest;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        this.f35161e.mo10502a((Exception) iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f35160d = response.body();
        if (response.isSuccessful()) {
            InputStream a = C2558c.m10872a(this.f35160d.byteStream(), ((ResponseBody) C2567j.m10894a(this.f35160d)).contentLength());
            this.f35159c = a;
            this.f35161e.mo10503a(a);
            return;
        }
        this.f35161e.mo10502a((Exception) new HttpException(response.message(), response.code()));
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super InputStream> aVar) {
        String str;
        String str2;
        String a = this.f35158b.mo49492a();
        if (!TextUtils.isEmpty(a)) {
            if (a.startsWith("file://")) {
                a = a.substring(7);
            }
            File file = new File(a);
            if (file.exists()) {
                try {
                    aVar.mo10503a(new FileInputStream(file));
                    return;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        Request.Builder url = new Request.Builder().url(a);
        Map<String, String> b = this.f35158b.mo49493b();
        if (!b.isEmpty()) {
            for (Map.Entry<String, String> entry : b.entrySet()) {
                url.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (TextUtils.equals("GET", this.f35158b.mo49494c())) {
            url.get();
        } else {
            if (!TextUtils.isEmpty(b.get("Content-Type"))) {
                str = b.get("Content-Type");
            } else if (!TextUtils.isEmpty(b.get("content-type"))) {
                str = b.get("content-type");
            } else if (!TextUtils.isEmpty(this.f35158b.mo49495d())) {
                aVar.mo10502a((Exception) new HttpException("content-type is invalid", 433006));
                return;
            } else {
                str = "application/x-www-form-urlencoded";
            }
            if (TextUtils.isEmpty(this.f35158b.mo49495d())) {
                str2 = "";
            } else {
                str2 = this.f35158b.mo49495d();
            }
            url.post(RequestBody.create(MediaType.parse(str), str2));
        }
        Request build = url.build();
        this.f35161e = aVar;
        this.f35162f = this.f35157a.newCall(build);
        this.f35162f.enqueue(this);
    }
}
