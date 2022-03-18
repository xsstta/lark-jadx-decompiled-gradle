package com.bytedance.ttnet.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.parser.CacheControlParser;
import com.bytedance.frameworks.baselib.network.http.parser.MimeType;
import com.bytedance.frameworks.baselib.network.http.retrofit.C14082b;
import com.bytedance.frameworks.baselib.network.http.retrofit.SsHttpExecutor;
import com.bytedance.frameworks.baselib.network.http.retrofit.p745a.p746a.C14079a;
import com.bytedance.frameworks.baselib.network.http.util.C14087e;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.AbstractC20592a;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.http.RequestContext;
import com.bytedance.ttnet.p913d.C20766b;
import com.bytedance.ttnet.p913d.C20767c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public class RetrofitUtils {
    private static volatile CopyOnWriteArrayList<Interceptor> sInterceptors = new CopyOnWriteArrayList<>();
    private static C14087e<String, Retrofit> sOKRetrofitCache = new C14087e<>(10);
    private static C14087e<String, Retrofit> sRetrofitCache = new C14087e<>(10);

    static {
        Retrofit.setCommonInterceptor(sInterceptors);
    }

    /* renamed from: com.bytedance.ttnet.utils.RetrofitUtils$b */
    private static class C20785b extends AbstractC20784a {
        public C20785b(Interceptor interceptor) {
            super(interceptor);
        }

        @Override // com.bytedance.retrofit2.intercept.Interceptor, com.bytedance.ttnet.utils.RetrofitUtils.AbstractC20784a
        public SsResponse intercept(Interceptor.Chain chain) throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String name = this.f50946a.getClass().getName();
            String substring = name.substring(name.lastIndexOf(46) + 1, name.length());
            Map<String, Long> map = chain.metrics().f50270P;
            map.put(substring + "Time", Long.valueOf(currentTimeMillis));
            return this.f50946a.intercept(chain);
        }
    }

    /* renamed from: com.bytedance.ttnet.utils.RetrofitUtils$a */
    private static abstract class AbstractC20784a implements Interceptor {

        /* renamed from: a */
        protected Interceptor f50946a;

        public AbstractC20784a(Interceptor interceptor) {
            this.f50946a = interceptor;
        }

        @Override // com.bytedance.retrofit2.intercept.Interceptor
        public SsResponse intercept(Interceptor.Chain chain) throws Exception {
            return this.f50946a.intercept(chain);
        }
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(15000);
        }
    }

    public static String getEtag(List<Header> list) {
        Header firstHeader;
        if (list == null || (firstHeader = getFirstHeader(list, "ETag")) == null) {
            return null;
        }
        return firstHeader.getValue();
    }

    public static String getLastModified(List<Header> list) {
        Header firstHeader;
        if (list == null || (firstHeader = getFirstHeader(list, "Last-Modified")) == null) {
            return null;
        }
        return firstHeader.getValue();
    }

    public static synchronized void removeInterceptor(Interceptor interceptor) {
        synchronized (RetrofitUtils.class) {
            if (interceptor != null) {
                sInterceptors.remove(interceptor);
                C20793d.m75746b(sRetrofitCache, interceptor);
                C20793d.m75746b(sOKRetrofitCache, interceptor);
            }
        }
    }

    public static synchronized void addInterceptor(Interceptor interceptor) {
        synchronized (RetrofitUtils.class) {
            if (interceptor != null) {
                C20785b bVar = new C20785b(interceptor);
                if (!sInterceptors.contains(bVar)) {
                    sInterceptors.add(bVar);
                }
                C20793d.m75744a(sRetrofitCache, bVar);
                C20793d.m75744a(sOKRetrofitCache, bVar);
            }
        }
    }

    public static long extractMaxAge(List<Header> list) {
        Header firstHeader;
        if (list == null || (firstHeader = getFirstHeader(list, "Cache-Control")) == null) {
            return -1;
        }
        try {
            String a = new CacheControlParser(firstHeader.getValue()).mo51770a(CacheControlParser.Directive.MAXAGE);
            if (a != null) {
                return Long.parseLong(a);
            }
            return -1;
        } catch (Exception e) {
            Logger.m15181w("RetrofitUtils", "extract max-age exception: " + e);
            return -1;
        }
    }

    public static String getHostAddress(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                if (Logger.debug()) {
                    Logger.m15167d("RetrofitUtils", "getHostAddress remoteIp = " + split[0]);
                }
                return split[0];
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "";
    }

    public static synchronized Retrofit getOkRetrofit(String str) {
        synchronized (RetrofitUtils.class) {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            Retrofit a = sOKRetrofitCache.mo51813a(str);
            if (a != null) {
                return a;
            }
            Retrofit createOkRetrofit = createOkRetrofit(str, null, null, null);
            sOKRetrofitCache.mo51814a(str, createOkRetrofit);
            return createOkRetrofit;
        }
    }

    public static synchronized Retrofit getSsRetrofit(String str) {
        synchronized (RetrofitUtils.class) {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            Retrofit a = sRetrofitCache.mo51813a(str);
            if (a != null) {
                return a;
            }
            Retrofit createSsRetrofit = createSsRetrofit(str, null, null, null);
            sRetrofitCache.mo51814a(str, createSsRetrofit);
            return createSsRetrofit;
        }
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2;
        Throwable th;
        String str3 = null;
        if (str == null) {
            return null;
        }
        try {
            MimeType mimeType = new MimeType(str);
            str2 = mimeType.getBaseType();
            try {
                str3 = mimeType.getParameter("charset");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = null;
            th.printStackTrace();
            return new Pair<>(str2, str3);
        }
        return new Pair<>(str2, str3);
    }

    public static synchronized <S> S createOkService(String str, Class<S> cls) {
        S s;
        synchronized (RetrofitUtils.class) {
            s = (S) createService(getOkRetrofit(str), cls);
        }
        return s;
    }

    public static synchronized <S> S createSsService(String str, Class<S> cls) {
        S s;
        synchronized (RetrofitUtils.class) {
            s = (S) createService(getSsRetrofit(str), cls);
        }
        return s;
    }

    public static synchronized <S> S createService(Retrofit retrofit, Class<S> cls) {
        synchronized (RetrofitUtils.class) {
            if (retrofit == null) {
                return null;
            }
            return (S) retrofit.create(cls);
        }
    }

    public static Header getFirstHeader(List<Header> list, String str) {
        if (list != null && !StringUtils.isEmpty(str)) {
            for (Header header : list) {
                if (str.equalsIgnoreCase(header.getName())) {
                    return header;
                }
            }
        }
        return null;
    }

    public static String getHeaderValueIgnoreCase(List<Header> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (Header header : list) {
            if (str.equalsIgnoreCase(header.getName())) {
                return header.getValue();
            }
        }
        return "";
    }

    public static Pair<byte[], String> tryCompressData(byte[] bArr, CompressType compressType) throws IOException {
        String str;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (CompressType.GZIP == compressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr2 = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (CompressType.DEFLATER != compressType || length <= 128) {
            str = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr2 = byteArrayOutputStream2.toByteArray();
            str = "deflate";
        }
        return new Pair<>(bArr2, str);
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    public static synchronized Retrofit createSsRetrofit(String str, List<Interceptor> list, Converter.Factory factory) {
        Retrofit createSsRetrofit;
        synchronized (RetrofitUtils.class) {
            createSsRetrofit = createSsRetrofit(str, list, factory, null);
        }
        return createSsRetrofit;
    }

    public static void addCacheValidationHeaders(List<Header> list, String str, String str2) {
        if (list != null) {
            if (!StringUtils.isEmpty(str)) {
                list.add(new Header("If-None-Match", str));
            }
            if (!StringUtils.isEmpty(str2)) {
                list.add(new Header("If-Modified-Since", str2));
            }
        }
    }

    public static synchronized Retrofit createOkRetrofit(String str, List<Interceptor> list, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit createRetrofit;
        synchronized (RetrofitUtils.class) {
            createRetrofit = createRetrofit(str, list, factory, factory2, new AbstractC20592a.AbstractC20593a() {
                /* class com.bytedance.ttnet.utils.RetrofitUtils.C207824 */

                @Override // com.bytedance.retrofit2.client.AbstractC20592a.AbstractC20593a
                /* renamed from: a */
                public AbstractC20592a mo69391a() {
                    return new C20767c();
                }
            });
        }
        return createRetrofit;
    }

    public static synchronized Retrofit createSsRetrofit(String str, List<Interceptor> list, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit createRetrofit;
        synchronized (RetrofitUtils.class) {
            createRetrofit = createRetrofit(str, list, factory, factory2, new AbstractC20592a.AbstractC20593a() {
                /* class com.bytedance.ttnet.utils.RetrofitUtils.C207802 */

                @Override // com.bytedance.retrofit2.client.AbstractC20592a.AbstractC20593a
                /* renamed from: a */
                public AbstractC20592a mo69391a() {
                    return new C20767c();
                }
            });
        }
        return createRetrofit;
    }

    public static synchronized Retrofit createTTNetRetrofit(String str, List<Interceptor> list, List<Converter.Factory> list2, List<CallAdapter.Factory> list3) {
        Retrofit createRetrofit;
        synchronized (RetrofitUtils.class) {
            createRetrofit = createRetrofit(list, list2, list3, new AbstractC20592a.AbstractC20593a() {
                /* class com.bytedance.ttnet.utils.RetrofitUtils.C207813 */

                @Override // com.bytedance.retrofit2.client.AbstractC20592a.AbstractC20593a
                /* renamed from: a */
                public AbstractC20592a mo69391a() {
                    return new C20767c();
                }
            }, str);
        }
        return createRetrofit;
    }

    public static synchronized Retrofit createRetrofit(String str, List<Interceptor> list, Converter.Factory factory, CallAdapter.Factory factory2, AbstractC20592a.AbstractC20593a aVar) {
        ArrayList arrayList;
        Retrofit createRetrofit;
        synchronized (RetrofitUtils.class) {
            ArrayList arrayList2 = null;
            if (factory != null) {
                try {
                    arrayList = new ArrayList();
                    arrayList.add(factory);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                arrayList = null;
            }
            if (factory2 != null) {
                arrayList2 = new ArrayList();
                arrayList2.add(factory2);
            }
            createRetrofit = createRetrofit(list, arrayList, arrayList2, aVar, str);
        }
        return createRetrofit;
    }

    private static void getOutIp(BaseHttpRequestInfo baseHttpRequestInfo, String[] strArr, List<Header> list, RequestContext requestContext, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Header header : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(header.getName())) {
                            str = header.getValue();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (StringUtils.isEmpty(str) && requestContext != null) {
            str = requestContext.remoteIp;
        }
        if (StringUtils.isEmpty(str)) {
            str = getHostAddress(exc);
        }
        if (!StringUtils.isEmpty(str)) {
            if (strArr != null && strArr.length > 0) {
                strArr[0] = str;
            }
            if (baseHttpRequestInfo != null) {
                baseHttpRequestInfo.remoteIp = str;
                if (baseHttpRequestInfo.reqContext != null) {
                    baseHttpRequestInfo.reqContext.remoteIp = str;
                }
            }
        }
    }

    public static synchronized Retrofit createRetrofit(List<Interceptor> list, List<Converter.Factory> list2, List<CallAdapter.Factory> list3, AbstractC20592a.AbstractC20593a aVar, String str) {
        boolean z;
        Retrofit a;
        synchronized (RetrofitUtils.class) {
            if (aVar == null) {
                aVar = new AbstractC20592a.AbstractC20593a() {
                    /* class com.bytedance.ttnet.utils.RetrofitUtils.C207835 */

                    @Override // com.bytedance.retrofit2.client.AbstractC20592a.AbstractC20593a
                    /* renamed from: a */
                    public AbstractC20592a mo69391a() {
                        return new C20767c();
                    }
                };
            }
            Retrofit.C20576a a2 = new Retrofit.C20576a().mo69317a(str).mo69315a(aVar).mo69318a(new SsHttpExecutor());
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            if (list2.isEmpty()) {
                list2.add(C14079a.m57004a());
            }
            for (Converter.Factory factory : list2) {
                a2.mo69314a(factory);
            }
            if (list3 != null && !list3.isEmpty()) {
                for (CallAdapter.Factory factory2 : list3) {
                    a2.mo69313a(factory2);
                }
            }
            LinkedList<Interceptor> linkedList = new LinkedList();
            if (list == null || list.size() <= 0) {
                z = false;
            } else {
                z = false;
                for (Interceptor interceptor : list) {
                    if (interceptor instanceof C20766b) {
                        if (!z) {
                            linkedList.add(interceptor);
                            z = true;
                        }
                    } else if (interceptor instanceof C14082b) {
                    }
                    linkedList.add(interceptor);
                }
            }
            if (!z) {
                linkedList.add(0, new C20766b());
            }
            if (sInterceptors != null && sInterceptors.size() > 0) {
                linkedList.addAll(sInterceptors);
            }
            linkedList.add(new C14082b());
            for (Interceptor interceptor2 : linkedList) {
                a2.mo69316a(interceptor2);
            }
            a = a2.mo69319a();
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e2, code lost:
        r6 = null;
        r27 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01f9 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0205 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x021a A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0221 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0230 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x027d A[Catch:{ all -> 0x028f, all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0280 A[Catch:{ all -> 0x028f, all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:57:0x00c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean downloadFile(int r32, final java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.bytedance.frameworks.baselib.network.http.util.AbstractC14085c<java.lang.String> r37, java.lang.String r38, com.bytedance.frameworks.baselib.network.http.util.C14090h r39, java.util.List<com.bytedance.retrofit2.client.Header> r40, java.lang.String[] r41, int[] r42) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.RetrofitUtils.downloadFile(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.c, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.h, java.util.List, java.lang.String[], int[]):boolean");
    }
}
