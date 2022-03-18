package com.bytedance.ee.bear.document.service;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.document.service.SaveImageFromBase64Service;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

public class SaveImageFromBase64Service extends C4918a implements AbstractC7945d<JSImageData> {

    public static class JSImageData implements NonProguard {
        private String data;

        public String getData() {
            return this.data;
        }

        public void setData(String str) {
            this.data = str;
        }
    }

    /* renamed from: a */
    public AbstractC68307f<JSImageData> mo24804a(JSImageData jSImageData) {
        return AbstractC68307f.m265080a(new AbstractC68324h(jSImageData) {
            /* class com.bytedance.ee.bear.document.service.$$Lambda$SaveImageFromBase64Service$rU5niiCbkFeGukzBXAjrFOIjzS0 */
            public final /* synthetic */ SaveImageFromBase64Service.JSImageData f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                SaveImageFromBase64Service.this.m24848a((SaveImageFromBase64Service) this.f$1, (SaveImageFromBase64Service.JSImageData) gVar);
            }
        }, BackpressureStrategy.BUFFER);
    }

    /* renamed from: a */
    public void handle(JSImageData jSImageData, AbstractC7947h hVar) {
        m24852b(jSImageData, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24848a(JSImageData jSImageData, AbstractC68323g gVar) throws Exception {
        C13708c.m55598a(mo19345b(), "android.permission.WRITE_EXTERNAL_STORAGE", mo19345b().getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b(jSImageData) {
            /* class com.bytedance.ee.bear.document.service.$$Lambda$SaveImageFromBase64Service$_xptbM4t147N8lfZMRkTpuUX9fc */
            public final /* synthetic */ SaveImageFromBase64Service.JSImageData f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                SaveImageFromBase64Service.m24851a(AbstractC68323g.this, this.f$1, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24849a(AbstractC7947h hVar, Uri uri) throws Exception {
        C13671b.m55476e(mo19345b(), uri);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "1");
        hVar.mo17188a(jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24850a(AbstractC7947h hVar, Throwable th) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "0");
        hVar.mo17188a(jSONObject);
        C13479a.m54761a("SaveImageFromBase64", th);
    }

    /* renamed from: b */
    private void m24852b(final JSImageData jSImageData, AbstractC7947h hVar) {
        Disposable b = AbstractC68307f.m265083a(jSImageData).mo237985a(C11678b.m48479c()).mo238020d(new Function<JSImageData, JSImageData>() {
            /* class com.bytedance.ee.bear.document.service.SaveImageFromBase64Service.C61513 */

            /* renamed from: a */
            public JSImageData apply(JSImageData jSImageData) throws Exception {
                if (jSImageData != null && !TextUtils.isEmpty(jSImageData.getData())) {
                    return jSImageData;
                }
                throw new IllegalStateException("Bad img data");
            }
        }).mo238014c(new Function<JSImageData, AbstractC70020b<JSImageData>>() {
            /* class com.bytedance.ee.bear.document.service.SaveImageFromBase64Service.C61502 */

            /* renamed from: a */
            public AbstractC70020b<JSImageData> apply(JSImageData jSImageData) throws Exception {
                return SaveImageFromBase64Service.this.mo24804a(jSImageData);
            }
        }).mo238020d(new Function<JSImageData, Uri>() {
            /* class com.bytedance.ee.bear.document.service.SaveImageFromBase64Service.C61491 */

            /* renamed from: a */
            public Uri apply(JSImageData jSImageData) throws Exception {
                Context b = SaveImageFromBase64Service.this.mo19345b();
                Uri a = C13671b.m55462a(b, System.currentTimeMillis() + ".png", null, null);
                SaveImageFromBase64Service.this.mo24806a(jSImageData.getData(), a);
                return a;
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(hVar) {
            /* class com.bytedance.ee.bear.document.service.$$Lambda$SaveImageFromBase64Service$wh2WbR8jbdgIbnYZQQXv3tlSvHc */
            public final /* synthetic */ AbstractC7947h f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SaveImageFromBase64Service.this.m24849a((SaveImageFromBase64Service) this.f$1, (AbstractC7947h) ((Uri) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.service.$$Lambda$SaveImageFromBase64Service$8YGpjxoeXctROeVLRph5i6rGJI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SaveImageFromBase64Service.m24850a(AbstractC7947h.this, (Throwable) obj);
            }
        });
        C13479a.m54764b("SaveImageFromBase64", "disposable = " + b);
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.util.save2Image", this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24806a(java.lang.String r3, android.net.Uri r4) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = ","
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r3, r0)
        L_0x0011:
            int r1 = r3.length
            if (r0 >= r1) goto L_0x0022
            byte r1 = r3[r0]
            if (r1 >= 0) goto L_0x001f
            byte r1 = r3[r0]
            int r1 = r1 + 256
            byte r1 = (byte) r1
            r3[r0] = r1
        L_0x001f:
            int r0 = r0 + 1
            goto L_0x0011
        L_0x0022:
            r0 = 0
            android.content.Context r1 = r2.mo19345b()     // Catch:{ all -> 0x003a }
            java.io.OutputStream r0 = com.bytedance.ee.util.io.C13671b.m55465a(r1, r4)     // Catch:{ all -> 0x003a }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x003a }
            r4.<init>(r0)     // Catch:{ all -> 0x003a }
            r4.write(r3)     // Catch:{ all -> 0x0037 }
            r4.close()
            return
        L_0x0037:
            r3 = move-exception
            r0 = r4
            goto L_0x003b
        L_0x003a:
            r3 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.service.SaveImageFromBase64Service.mo24806a(java.lang.String, android.net.Uri):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24851a(AbstractC68323g gVar, JSImageData jSImageData, boolean z) {
        if (z) {
            gVar.onNext(jSImageData);
            gVar.onComplete();
            return;
        }
        gVar.onError(new IllegalStateException("Permission not granted !"));
    }
}
