package com.ss.android.lark.passport.infra.base.network;

import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.passport.infra.log.PassportLog;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/HttpUtils;", "", "()V", "putHeader", "", "headers", "Lcom/ss/android/lark/http/model/http/HttpHeaders;", "k", "", "v", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d */
public final class HttpUtils {

    /* renamed from: a */
    public static final HttpUtils f123257a = new HttpUtils();

    private HttpUtils() {
    }

    /* renamed from: a */
    public final void mo171332a(HttpHeaders httpHeaders, String str, String str2) {
        if (httpHeaders != null && str != null) {
            if (str2 != null) {
                try {
                    httpHeaders.put(str, str2);
                } catch (Exception e) {
                    PassportLog.f123351c.mo171474a().mo171471d("HttpUtils", e.toString());
                }
            } else {
                httpHeaders.remove(str);
            }
        }
    }
}
