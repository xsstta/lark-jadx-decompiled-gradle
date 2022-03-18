package com.facebook.react.modules.network;

import android.net.Uri;
import android.util.Base64;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.eenet.httpclient.C12614a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C21110b;
import com.facebook.react.common.p959a.C21109a;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import okio.C69703i;
import okio.C69705k;

@ReactModule(name = "Networking")
public final class NetworkingModule extends ReactContextBaseJavaModule {
    private static AbstractC21209a customClientBuilder;
    public final AbstractC12625f mClient;
    private final C21217e mCookieHandler;
    private final AbstractC21213a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<AbstractC21210b> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    public final List<AbstractC21211c> mResponseHandlers;
    public boolean mShuttingDown;
    private final List<AbstractC21212d> mUriHandlers;

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$a */
    public interface AbstractC21209a {
        /* renamed from: a */
        void mo72046a(C12614a aVar);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$b */
    public interface AbstractC21210b {
        /* renamed from: a */
        RequestBody mo71912a(ReadableMap readableMap, String str);

        /* renamed from: a */
        boolean mo71913a(ReadableMap readableMap);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$c */
    public interface AbstractC21211c {
        /* renamed from: a */
        WritableMap mo71914a(ResponseBody responseBody) throws IOException;

        /* renamed from: a */
        boolean mo71915a(String str);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$d */
    public interface AbstractC21212d {
        /* renamed from: a */
        WritableMap mo71910a(Uri uri) throws IOException;

        /* renamed from: a */
        boolean mo71911a(Uri uri, String str);
    }

    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Networking";
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.mo72048a(C21215c.m76973a(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.mo72053a();
        this.mCookieJarContainer.mo72047a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    public static void setCustomClientBuilder(AbstractC21209a aVar) {
        customClientBuilder = aVar;
    }

    private static void applyCustomBuilder(C12614a aVar) {
        AbstractC21209a aVar2 = customClientBuilder;
        if (aVar2 != null) {
            aVar2.mo72046a(aVar);
        }
    }

    @ReactMethod
    public void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    public void addRequestBodyHandler(AbstractC21210b bVar) {
        this.mRequestBodyHandlers.add(bVar);
    }

    public void addResponseHandler(AbstractC21211c cVar) {
        this.mResponseHandlers.add(cVar);
    }

    public void addUriHandler(AbstractC21212d dVar) {
        this.mUriHandlers.add(dVar);
    }

    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.mo72054a(callback);
    }

    public void removeRequestBodyHandler(AbstractC21210b bVar) {
        this.mRequestBodyHandlers.remove(bVar);
    }

    public void removeResponseHandler(AbstractC21211c cVar) {
        this.mResponseHandlers.remove(cVar);
    }

    public void removeUriHandler(AbstractC21212d dVar) {
        this.mUriHandlers.remove(dVar);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, C21228i.m76999a(reactApplicationContext), null);
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private void cancelRequest(final int i) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.network.NetworkingModule.AsyncTaskC212084 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void doInBackgroundGuarded(Void... voidArr) {
                C21109a.m76732a(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static WritableMap translateHeaders(Headers headers) {
        WritableMap createMap = Arguments.createMap();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (createMap.hasKey(name)) {
                createMap.putString(name, createMap.getString(name) + ", " + headers.value(i));
            } else {
                createMap.putString(name, headers.value(i));
            }
        }
        return createMap;
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, C21228i.m76999a(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<AbstractC21226g> list) {
        this(reactApplicationContext, null, C21228i.m76999a(reactApplicationContext), list);
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String a = C21225f.m76993a(array.getString(0));
                String b = C21225f.m76994b(array.getString(1));
                if (!(a == null || b == null)) {
                    builder.add(a, b);
                }
            }
            return null;
        }
        if (builder.get("user-agent") == null && (str = this.mDefaultUserAgent) != null) {
            builder.add("user-agent", str);
        }
        if (readableMap != null && readableMap.hasKey("string")) {
            z = true;
        }
        if (!z) {
            builder.removeAll("content-encoding");
        }
        return builder.build();
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, final int i) {
        if (requestBody == null) {
            return null;
        }
        return C21236o.m77010a(requestBody, new AbstractC21229j() {
            /* class com.facebook.react.modules.network.NetworkingModule.C212073 */

            /* renamed from: a */
            long f51696a = System.nanoTime();

            @Override // com.facebook.react.modules.network.AbstractC21229j
            /* renamed from: a */
            public void mo72044a(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if (z || NetworkingModule.shouldDispatch(nanoTime, this.f51696a)) {
                    C21238p.m77019a(rCTDeviceEventEmitter, i, j, j2);
                    this.f51696a = nanoTime;
                }
            }
        });
    }

    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) throws IOException {
        long j;
        Charset charset;
        long j2 = -1;
        try {
            C21232l lVar = (C21232l) responseBody;
            j = lVar.mo72071a();
            try {
                j2 = lVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        if (responseBody.contentType() == null) {
            charset = C21110b.f51494a;
        } else {
            charset = responseBody.contentType().charset(C21110b.f51494a);
        }
        C21234m mVar = new C21234m(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    C21238p.m77022a(rCTDeviceEventEmitter, i, mVar.mo72072a(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                C21238p.m77023a(eventEmitter, i, "Missing or invalid header format for FormData part.", (Throwable) null);
                return null;
            }
            String str2 = extractHeaders.get("content-type");
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                extractHeaders = extractHeaders.newBuilder().removeAll("content-type").build();
            } else {
                mediaType = null;
            }
            if (map.hasKey("string")) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, map.getString("string")));
            } else if (!map.hasKey("uri")) {
                C21238p.m77023a(eventEmitter, i, "Unrecognized FormData part.", (Throwable) null);
            } else if (mediaType == null) {
                C21238p.m77023a(eventEmitter, i, "Binary FormData part needs a content-type header.", (Throwable) null);
                return null;
            } else {
                String string = map.getString("uri");
                InputStream a = C21236o.m77012a(getReactApplicationContext(), string);
                if (a == null) {
                    C21238p.m77023a(eventEmitter, i, "Could not retrieve file for uri " + string, (Throwable) null);
                    return null;
                }
                builder.addPart(extractHeaders, C21236o.m77013a(mediaType, a));
            }
        }
        return builder;
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<AbstractC21226g> list) {
        super(reactApplicationContext);
        OkHttpClient.Builder builder;
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (okHttpClient != null) {
            builder = okHttpClient.newBuilder();
        } else {
            builder = C12617b.m52365c().newBuilder();
        }
        builder.cookieJar(new C21235n());
        OkHttpClient.Builder a = C21228i.m76998a(builder);
        if (list != null) {
            for (AbstractC21226g gVar : list) {
                a.addNetworkInterceptor(gVar.mo72070a());
            }
        }
        AbstractC12625f a2 = C12617b.m52356a(a);
        this.mClient = a2;
        this.mCookieHandler = new C21217e(reactApplicationContext);
        this.mCookieJarContainer = (AbstractC21213a) a2.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    @ReactMethod
    public void sendRequest(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, i2, z2);
        } catch (Throwable th) {
            FLog.m76575e("NetworkingModule", "Failed to send url request: " + str2, th);
            C21238p.m77023a(getEventEmitter(), i, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, final int i, ReadableArray readableArray, ReadableMap readableMap, final String str3, final boolean z, int i2, boolean z2) {
        AbstractC21210b bVar;
        RequestBody requestBody;
        final DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri parse = Uri.parse(str2);
            for (AbstractC21212d dVar : this.mUriHandlers) {
                if (dVar.mo71911a(parse, str3)) {
                    C21238p.m77020a(eventEmitter, i, dVar.mo71910a(parse));
                    C21238p.m77017a(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                C12614a a = this.mClient.mo47928a();
                applyCustomBuilder(a);
                if (!z2) {
                    a.mo47916a(CookieJar.NO_COOKIES);
                }
                if (z) {
                    a.mo47921b(new Interceptor() {
                        /* class com.facebook.react.modules.network.NetworkingModule.C212041 */

                        @Override // okhttp3.Interceptor
                        public Response intercept(Interceptor.Chain chain) throws IOException {
                            Response proceed = chain.proceed(chain.request());
                            return proceed.newBuilder().body(new C21232l(proceed.body(), new AbstractC21229j() {
                                /* class com.facebook.react.modules.network.NetworkingModule.C212041.C212051 */

                                /* renamed from: a */
                                long f51689a = System.nanoTime();

                                @Override // com.facebook.react.modules.network.AbstractC21229j
                                /* renamed from: a */
                                public void mo72044a(long j, long j2, boolean z) {
                                    long nanoTime = System.nanoTime();
                                    if ((z || NetworkingModule.shouldDispatch(nanoTime, this.f51689a)) && !str3.equals("text")) {
                                        C21238p.m77024b(eventEmitter, i, j, j2);
                                        this.f51689a = nanoTime;
                                    }
                                }
                            })).build();
                        }
                    });
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    a.mo47915a((long) i2, TimeUnit.MILLISECONDS);
                }
                AbstractC12625f a2 = a.mo47919a();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    C21238p.m77023a(eventEmitter, i, "Unrecognized headers format", (Throwable) null);
                    return;
                }
                String str4 = extractHeaders.get("content-type");
                String str5 = extractHeaders.get("content-encoding");
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<AbstractC21210b> it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        bVar = it.next();
                        if (bVar.mo71913a(readableMap)) {
                            break;
                        }
                    }
                    if (readableMap != null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                        requestBody = C21236o.m77016b(str);
                    } else if (bVar != null) {
                        requestBody = bVar.mo71912a(readableMap, str4);
                    } else if (readableMap.hasKey("string")) {
                        if (str4 == null) {
                            C21238p.m77023a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string = readableMap.getString("string");
                        MediaType parse2 = MediaType.parse(str4);
                        if (C21236o.m77015a(str5)) {
                            requestBody = C21236o.m77014a(parse2, string);
                            if (requestBody == null) {
                                C21238p.m77023a(eventEmitter, i, "Failed to gzip request body", (Throwable) null);
                                return;
                            }
                        } else {
                            Charset charset = C21110b.f51494a;
                            if (parse2 != null) {
                                charset = parse2.charset(charset);
                            }
                            requestBody = RequestBody.create(parse2, string.getBytes(charset));
                        }
                    } else if (readableMap.hasKey("base64")) {
                        if (str4 == null) {
                            C21238p.m77023a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        requestBody = RequestBody.create(MediaType.parse(str4), ByteString.decodeBase64(readableMap.getString("base64")));
                    } else if (readableMap.hasKey("uri")) {
                        if (str4 == null) {
                            C21238p.m77023a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string2 = readableMap.getString("uri");
                        InputStream a3 = C21236o.m77012a(getReactApplicationContext(), string2);
                        if (a3 == null) {
                            C21238p.m77023a(eventEmitter, i, "Could not retrieve file for uri " + string2, (Throwable) null);
                            return;
                        }
                        requestBody = C21236o.m77013a(MediaType.parse(str4), a3);
                    } else if (readableMap.hasKey("formData")) {
                        if (str4 == null) {
                            str4 = "multipart/form-data";
                        }
                        MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray("formData"), str4, i);
                        if (constructMultipartBody != null) {
                            requestBody = constructMultipartBody.build();
                        } else {
                            return;
                        }
                    } else {
                        requestBody = C21236o.m77016b(str);
                    }
                    url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                    addRequest(i);
                    a2.newCall(url.build()).enqueue(new okhttp3.Callback() {
                        /* class com.facebook.react.modules.network.NetworkingModule.C212062 */

                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException iOException) {
                            String str;
                            if (!NetworkingModule.this.mShuttingDown) {
                                NetworkingModule.this.removeRequest(i);
                                if (iOException.getMessage() != null) {
                                    str = iOException.getMessage();
                                } else {
                                    str = "Error while executing request: " + iOException.getClass().getSimpleName();
                                }
                                C21238p.m77023a(eventEmitter, i, str, iOException);
                            }
                        }

                        @Override // okhttp3.Callback
                        public void onResponse(Call call, Response response) throws IOException {
                            MediaType mediaType;
                            if (!NetworkingModule.this.mShuttingDown) {
                                NetworkingModule.this.removeRequest(i);
                                C21238p.m77018a(eventEmitter, i, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                                try {
                                    ResponseBody body = response.body();
                                    if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                                        C69703i iVar = new C69703i(body.source());
                                        String header = response.header("Content-Type");
                                        if (header != null) {
                                            mediaType = MediaType.parse(header);
                                        } else {
                                            mediaType = null;
                                        }
                                        body = ResponseBody.create(mediaType, -1, C69705k.m267590a(iVar));
                                    }
                                    for (AbstractC21211c cVar : NetworkingModule.this.mResponseHandlers) {
                                        if (cVar.mo71915a(str3)) {
                                            C21238p.m77020a(eventEmitter, i, cVar.mo71914a(body));
                                            C21238p.m77017a(eventEmitter, i);
                                            return;
                                        }
                                    }
                                    if (!z || !str3.equals("text")) {
                                        String str = "";
                                        if (str3.equals("text")) {
                                            try {
                                                str = body.string();
                                            } catch (IOException e) {
                                                if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                                    C21238p.m77023a(eventEmitter, i, e.getMessage(), e);
                                                }
                                            }
                                        } else if (str3.equals("base64")) {
                                            str = Base64.encodeToString(body.bytes(), 2);
                                        }
                                        C21238p.m77021a(eventEmitter, i, str);
                                        C21238p.m77017a(eventEmitter, i);
                                        return;
                                    }
                                    NetworkingModule.this.readWithProgress(eventEmitter, i, body);
                                    C21238p.m77017a(eventEmitter, i);
                                } catch (IOException e2) {
                                    C21238p.m77023a(eventEmitter, i, e2.getMessage(), e2);
                                }
                            }
                        }
                    });
                }
                bVar = null;
                if (readableMap != null) {
                }
                requestBody = C21236o.m77016b(str);
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                addRequest(i);
                a2.newCall(url.build()).enqueue(new okhttp3.Callback() {
                    /* class com.facebook.react.modules.network.NetworkingModule.C212062 */

                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        String str;
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i);
                            if (iOException.getMessage() != null) {
                                str = iOException.getMessage();
                            } else {
                                str = "Error while executing request: " + iOException.getClass().getSimpleName();
                            }
                            C21238p.m77023a(eventEmitter, i, str, iOException);
                        }
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        MediaType mediaType;
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i);
                            C21238p.m77018a(eventEmitter, i, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                            try {
                                ResponseBody body = response.body();
                                if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                                    C69703i iVar = new C69703i(body.source());
                                    String header = response.header("Content-Type");
                                    if (header != null) {
                                        mediaType = MediaType.parse(header);
                                    } else {
                                        mediaType = null;
                                    }
                                    body = ResponseBody.create(mediaType, -1, C69705k.m267590a(iVar));
                                }
                                for (AbstractC21211c cVar : NetworkingModule.this.mResponseHandlers) {
                                    if (cVar.mo71915a(str3)) {
                                        C21238p.m77020a(eventEmitter, i, cVar.mo71914a(body));
                                        C21238p.m77017a(eventEmitter, i);
                                        return;
                                    }
                                }
                                if (!z || !str3.equals("text")) {
                                    String str = "";
                                    if (str3.equals("text")) {
                                        try {
                                            str = body.string();
                                        } catch (IOException e) {
                                            if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                                C21238p.m77023a(eventEmitter, i, e.getMessage(), e);
                                            }
                                        }
                                    } else if (str3.equals("base64")) {
                                        str = Base64.encodeToString(body.bytes(), 2);
                                    }
                                    C21238p.m77021a(eventEmitter, i, str);
                                    C21238p.m77017a(eventEmitter, i);
                                    return;
                                }
                                NetworkingModule.this.readWithProgress(eventEmitter, i, body);
                                C21238p.m77017a(eventEmitter, i);
                            } catch (IOException e2) {
                                C21238p.m77023a(eventEmitter, i, e2.getMessage(), e2);
                            }
                        }
                    }
                });
            } catch (Exception e) {
                C21238p.m77023a(eventEmitter, i, e.getMessage(), (Throwable) null);
            }
        } catch (IOException e2) {
            C21238p.m77023a(eventEmitter, i, e2.getMessage(), e2);
        }
    }
}
