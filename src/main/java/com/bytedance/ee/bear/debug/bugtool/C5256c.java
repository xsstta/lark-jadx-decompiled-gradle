package com.bytedance.ee.bear.debug.bugtool;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.bear.debug.bugtool.C5256c;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.debug.bugtool.c */
public class C5256c {

    /* renamed from: a */
    public Context f15045a;

    /* renamed from: b */
    public JsonParser f15046b = new JsonParser();

    /* renamed from: c */
    private Gson f15047c = new Gson();

    /* renamed from: d */
    private OkHttpClient f15048d = new OkHttpClient();

    public C5256c(Context context) {
        this.f15045a = context;
    }

    /* renamed from: a */
    public void mo21198a(String str, AbstractC5255b bVar) {
        m21503a("fields", str, null, bVar);
    }

    /* renamed from: b */
    public void mo21200b(String str, AbstractC5255b bVar) {
        m21503a("businesses", str, null, bVar);
    }

    /* renamed from: a */
    public void mo21199a(Map<String, Object> map, String str, AbstractC5255b bVar) {
        m21503a("issue", str, this.f15047c.toJson(map), bVar);
    }

    /* renamed from: a */
    private void m21503a(String str, String str2, String str3, final AbstractC5255b bVar) {
        Request.Builder builder = new Request.Builder();
        Request.Builder addHeader = builder.url("https://meego.bytedance.net/open-api/v1/project/larksuite/" + str).addHeader("X-Meego-Token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6IjcwMTI0MzQ3ODI5OTkxNTA1OTMiLCJwcm9qZWN0SWQiOiI1ZTk2ZDdiZmY0ZTdjNTI1NTEwZjkxNTYiLCJ0ZW5hbnRLZXkiOiI3MzY1ODhjOTI2MGYxNzVkIiwiaWF0IjoxNjM1MTI3ODc4fQ.OLLHSvfEeYbsfYLCDzG2TVXtvmBhi-Nu17A0dj000q8").addHeader("X-Meego-User", str2);
        if (str3 != null && !"".equals(str3)) {
            addHeader.post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str3));
        }
        this.f15048d.newCall(addHeader.build()).enqueue(new Callback() {
            /* class com.bytedance.ee.bear.debug.bugtool.C5256c.C52571 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m21507a() {
                Toast.showFailureText(C5256c.this.f15045a, "请求失败，请检查网络并重试", 1);
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$c$1$io3fZQYaw9JOLfxAE66vociWYms */

                    public final void run() {
                        C5256c.C52571.this.m21507a();
                    }
                });
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                bVar.onResponse(C5256c.this.f15046b.parse(response.body().string()).getAsJsonObject());
            }
        });
    }
}
