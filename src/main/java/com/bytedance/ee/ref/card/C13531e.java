package com.bytedance.ee.ref.card;

import android.content.Context;
import android.graphics.Typeface;
import android.webkit.URLUtil;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.fontface.FontFace;
import com.lynx.tasm.p1220b.C26603c;
import com.lynx.tasm.utils.C26958l;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.ref.card.e */
public class C13531e extends C26603c.AbstractC26606a {

    /* renamed from: a */
    private final C26603c.AbstractC26606a f35620a;

    public C13531e(C26603c.AbstractC26606a aVar) {
        this.f35620a = aVar;
    }

    /* renamed from: a */
    private Typeface m54950a(Context context, String str) {
        try {
            Response execute = C12617b.m52365c().newCall(new Request.Builder().url(str).build()).execute();
            if (execute.body() == null || !execute.isSuccessful()) {
                return null;
            }
            return C26958l.m97965a(context, execute.body().bytes());
        } catch (Exception unused) {
            AppBrandLogger.m52829e("OkHttpFontLoader", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.p1220b.C26603c.AbstractC26606a
    /* renamed from: a */
    public Typeface mo50289a(AbstractC26684l lVar, FontFace.TYPE type, String str) {
        Typeface c = this.f35620a.mo94487c(lVar, type, str);
        if (c != null || !URLUtil.isNetworkUrl(str)) {
            return c;
        }
        return m54950a(lVar.mo94680e(), str);
    }
}
