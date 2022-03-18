package com.bytedance.ee.bear.attachment.filereader;

import com.bytedance.ee.bear.attachment.filereader.C4288d;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13748k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.attachment.filereader.d */
public class C4288d {

    /* renamed from: com.bytedance.ee.bear.attachment.filereader.d$a */
    public interface AbstractC4293a {
        /* renamed from: a */
        void mo16857a();

        /* renamed from: a */
        void mo16858a(int i);

        /* renamed from: b */
        void mo16859b();
    }

    /* renamed from: a */
    public static void m17791a(AbstractC4293a aVar) {
        if (aVar != null) {
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.attachment.filereader.$$Lambda$d$fWy5HevGj6QZNWbxWB_8EyUsU */

                public final void run() {
                    C4288d.AbstractC4293a.this.mo16859b();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m17793a(final String str, final String str2, final AbstractC4293a aVar) {
        try {
            C12617b.m52365c().newBuilder().dispatcher(new Dispatcher(BearExecutors.m48467b())).build().newCall(new Request.Builder().url(str).build()).enqueue(new Callback() {
                /* class com.bytedance.ee.bear.attachment.filereader.C4288d.C42902 */

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    C13479a.m54759a("FileDownloadUtil", "   downloadFileFromNut 22  filePath:  url: " + C13598b.m55197d(str) + "  onFailure: ", iOException);
                    C4288d.m17791a(aVar);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    C13479a.m54772d("FileDownloadUtil", "   downloadFileFromNut filePath:  url: " + C13598b.m55197d(str) + "  response: " + response);
                    C4288d.m17794a(response, str2, aVar, str);
                }
            });
        } catch (Throwable th) {
            C13479a.m54759a("FileDownloadUtil", "   downloadFileFromNut 33  filePath:  url: " + C13598b.m55197d(str) + "  onFailure: ", th);
            m17791a(aVar);
        }
    }

    /* renamed from: a */
    public static void m17792a(NetService netService, final String str, final String str2, final AbstractC4293a aVar) {
        netService.mo20122b(new Request.Builder().url(str).build(), new Callback() {
            /* class com.bytedance.ee.bear.attachment.filereader.C4288d.C42891 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                C13479a.m54759a("FileDownloadUtil", "   downloadFileFromTos 22  filePath:  url: " + C13598b.m55197d(str) + "  onFailure: ", iOException);
                C4288d.m17791a(aVar);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                C13479a.m54772d("FileDownloadUtil", "   downloadFileFromTos filePath:  url: " + C13598b.m55197d(str) + "  response: " + response);
                C4288d.m17794a(response, str2, aVar, str);
            }
        });
    }

    /* renamed from: a */
    public static void m17794a(Response response, String str, final AbstractC4293a aVar, String str2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        if (response == null || !response.isSuccessful()) {
            m17791a(aVar);
            return;
        }
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream byteStream = response.body().byteStream();
            try {
                long contentLength = response.body().contentLength();
                fileOutputStream = new FileOutputStream(new File(str));
                try {
                    Long l = 0L;
                    for (int read = byteStream.read(bArr); read != -1; read = byteStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, read);
                        l = Long.valueOf(l.longValue() + ((long) read));
                        final int longValue = (int) ((((float) l.longValue()) * 1.0f) / ((float) contentLength));
                        C13748k.m55732a(new Runnable() {
                            /* class com.bytedance.ee.bear.attachment.filereader.C4288d.RunnableC42913 */

                            public void run() {
                                AbstractC4293a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo16858a(longValue);
                                }
                            }
                        });
                    }
                    fileOutputStream.flush();
                    C13748k.m55732a(new Runnable() {
                        /* class com.bytedance.ee.bear.attachment.filereader.C4288d.RunnableC42924 */

                        public void run() {
                            AbstractC4293a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo16857a();
                            }
                        }
                    });
                    C13675f.m55517b(byteStream, fileOutputStream);
                } catch (Exception unused) {
                    inputStream = byteStream;
                    try {
                        m17791a(aVar);
                        C13675f.m55517b(inputStream, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C13675f.m55517b(inputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = byteStream;
                    C13675f.m55517b(inputStream, fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
                inputStream = byteStream;
                m17791a(aVar);
                C13675f.m55517b(inputStream, fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                inputStream = byteStream;
                C13675f.m55517b(inputStream, fileOutputStream);
                throw th;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
            m17791a(aVar);
            C13675f.m55517b(inputStream, fileOutputStream);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            C13675f.m55517b(inputStream, fileOutputStream);
            throw th;
        }
    }
}
