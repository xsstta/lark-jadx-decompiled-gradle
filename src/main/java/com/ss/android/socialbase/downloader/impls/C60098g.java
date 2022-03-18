package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60134d;
import com.ss.android.socialbase.downloader.network.AbstractC60137g;
import com.ss.android.socialbase.downloader.network.AbstractC60138h;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.ss.android.socialbase.downloader.impls.g */
public class C60098g implements AbstractC60138h {
    @Override // com.ss.android.socialbase.downloader.network.AbstractC60138h
    /* renamed from: a */
    public AbstractC60137g mo204948a(int i, String str, List<HttpHeader> list) throws IOException {
        final GZIPInputStream gZIPInputStream;
        OkHttpClient r = C60046b.m233008r();
        if (r != null) {
            Request.Builder url = new Request.Builder().url(str);
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    url.addHeader(httpHeader.getName(), C60161d.m233817e(httpHeader.getValue()));
                }
            }
            final Call newCall = r.newCall(url.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                final ResponseBody body = execute.body();
                if (body == null) {
                    return null;
                }
                InputStream byteStream = body.byteStream();
                String header = execute.header("Content-Encoding");
                if (header == null || !"gzip".equalsIgnoreCase(header) || (byteStream instanceof GZIPInputStream)) {
                    gZIPInputStream = byteStream;
                } else {
                    gZIPInputStream = new GZIPInputStream(byteStream);
                }
                return new AbstractC60134d() {
                    /* class com.ss.android.socialbase.downloader.impls.C60098g.C600991 */

                    @Override // com.ss.android.socialbase.downloader.network.AbstractC60137g
                    /* renamed from: c */
                    public InputStream mo204949c() throws IOException {
                        return gZIPInputStream;
                    }

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

                    @Override // com.ss.android.socialbase.downloader.network.AbstractC60137g
                    /* renamed from: d */
                    public void mo204950d() {
                        try {
                            ResponseBody responseBody = body;
                            if (responseBody != null) {
                                responseBody.close();
                            }
                            Call call = newCall;
                            if (call != null && !call.isCanceled()) {
                                newCall.cancel();
                            }
                        } catch (Throwable unused) {
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
