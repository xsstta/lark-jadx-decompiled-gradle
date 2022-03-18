package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;
import com.ss.android.socialbase.downloader.network.AbstractC60136f;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.socialbase.downloader.impls.f */
public class C60096f implements AbstractC60136f {
    @Override // com.ss.android.socialbase.downloader.network.AbstractC60136f
    /* renamed from: a */
    public AbstractC60135e mo204944a(String str, List<HttpHeader> list) throws IOException {
        OkHttpClient r = C60046b.m233008r();
        if (r != null) {
            Request.Builder head = new Request.Builder().url(str).head();
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    head.addHeader(httpHeader.getName(), C60161d.m233817e(httpHeader.getValue()));
                }
            }
            final Call newCall = r.newCall(head.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                if (C60158a.m233738a(2097152)) {
                    execute.close();
                }
                return new AbstractC60135e() {
                    /* class com.ss.android.socialbase.downloader.impls.C60096f.C600971 */

                    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
                    /* renamed from: a */
                    public int mo204945a() throws IOException {
                        return execute.code();
                    }

                    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
                    /* renamed from: b */
                    public void mo204947b() {
                        Call call = newCall;
                        if (call != null && !call.isCanceled()) {
                            newCall.cancel();
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.network.AbstractC60135e
                    /* renamed from: a */
                    public String mo204946a(String str) {
                        return execute.header(str);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
