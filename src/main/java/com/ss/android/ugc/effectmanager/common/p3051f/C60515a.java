package com.ss.android.ugc.effectmanager.common.p3051f;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60509a;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import com.ss.android.ugc.effectmanager.common.p3053h.C60524b;
import com.ss.android.ugc.effectmanager.common.p3053h.C60537p;
import java.io.InputStream;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.common.f.a */
public class C60515a {

    /* renamed from: a */
    private AbstractC60509a f151311a;

    /* renamed from: b */
    private Context f151312b;

    /* renamed from: b */
    private void m235200b(C60499b bVar) {
        try {
            String replaceAll = bVar.mo207143a().replaceAll("&?device_info=[^&]*", "");
            EPLog.m235179b("EffectNetWorker", "request url: " + replaceAll);
        } catch (Exception e) {
            EPLog.m235177a("EffectNetWorker", "error in print url", e);
        }
    }

    /* renamed from: a */
    public InputStream mo207213a(C60499b bVar) throws Exception {
        m235200b(bVar);
        InputStream a = this.f151311a.mo207187a(bVar);
        if (a != null) {
            return a;
        }
        if (!C60537p.m235321a(this.f151312b)) {
            throw new RuntimeException("network unavailable");
        } else if (TextUtils.isEmpty(bVar.mo207151e())) {
            throw new RuntimeException("Download error");
        } else {
            throw new RuntimeException(bVar.mo207151e());
        }
    }

    public C60515a(AbstractC60509a aVar, Context context) {
        this.f151311a = aVar;
        this.f151312b = context;
    }

    /* renamed from: a */
    public <T extends BaseNetResponse> T mo207211a(C60499b bVar, AbstractC60510b bVar2, Class<T> cls) throws Exception {
        m235200b(bVar);
        InputStream a = this.f151311a.mo207187a(bVar);
        if (a != null) {
            T t = (T) ((BaseNetResponse) bVar2.mo207188a(a, cls));
            C60524b.m235232a(a);
            if (t != null) {
                int status_code = t.getStatus_code();
                if (status_code == 0) {
                    return t;
                }
                throw new StatusCodeException(status_code, t.getMessage());
            }
            throw new JSONException("Json convert fail");
        } else if (!C60537p.m235321a(this.f151312b)) {
            throw new Exception("network unavailable");
        } else if (TextUtils.isEmpty(bVar.mo207151e())) {
            throw new NetworkErrorException("Download error");
        } else {
            throw new NetworkErrorException(bVar.mo207151e());
        }
    }

    /* renamed from: a */
    public <T extends BaseNetResponse> T mo207212a(C60499b bVar, InputStream inputStream, AbstractC60510b bVar2, Class<T> cls) throws Exception {
        T t = (T) ((BaseNetResponse) bVar2.mo207188a(inputStream, cls));
        if (t != null) {
            int status_code = t.getStatus_code();
            if (status_code == 0) {
                return t;
            }
            throw new StatusCodeException(status_code, t.getMessage());
        }
        throw new JSONException("Json convert fail");
    }
}
