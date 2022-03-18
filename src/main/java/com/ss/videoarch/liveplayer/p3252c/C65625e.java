package com.ss.videoarch.liveplayer.p3252c;

import com.ss.videoarch.liveplayer.AbstractC65627d;
import com.ss.videoarch.liveplayer.log.LiveError;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.videoarch.liveplayer.c.e */
public final class C65625e {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.liveplayer.c.e$a */
    public interface AbstractC65626a {
        /* renamed from: a */
        void mo229629a(LiveError liveError);

        /* renamed from: a */
        void mo229630a(JSONObject jSONObject);
    }

    /* renamed from: a */
    static void m257254a(AbstractC65627d dVar, String str, String str2, AbstractC65626a aVar) {
        LiveError liveError;
        if (str2 != null) {
            AbstractC65627d.C65629a a = dVar.mo142531a(str, str2);
            if (a == null) {
                aVar.mo229629a(new LiveError(-100011, "result is null", null));
                return;
            }
            Exception exc = a.f165192d;
            if (exc != null || a.f165189a == null) {
                HashMap hashMap = new HashMap();
                if (a.f165189a != null) {
                    hashMap.put("rawResp", a.f165189a);
                }
                if (exc instanceof IOException) {
                    hashMap.put("description", "network IO exception");
                    liveError = new LiveError(-100008, exc.toString(), hashMap);
                } else if (exc instanceof JSONException) {
                    hashMap.put("description", "parse JSON failure");
                    if (a.f165190b != null) {
                        hashMap.put("rowBody", a.f165190b);
                    }
                    if (a.f165191c != null) {
                        hashMap.put("responseHeader", a.f165191c);
                    }
                    liveError = new LiveError(-100000, exc.getMessage(), hashMap);
                } else {
                    hashMap.put("description", "response not successful");
                    liveError = new LiveError(-100004, exc.getMessage(), hashMap);
                }
                aVar.mo229629a(liveError);
                return;
            }
            aVar.mo229630a(a.f165189a);
        }
    }
}
