package com.ss.android.lark.appsetting.api;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57852m;
import com.tencent.mmkv.MMKV;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.apache.commons.compress.p3493a.C69753g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0006\u0010\u0016\u001a\u00020\u0014J,\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/appsetting/api/InternalLocalDefaultConfigStorage;", "", "()V", "context", "Landroid/content/Context;", "debuggable", "", "localDefaultKV", "Lcom/tencent/mmkv/MMKV;", "localDefaultMap", "", "", "lock", "Ljava/lang/Object;", "preloadFuture", "Ljava/util/concurrent/Future;", "getDefaultValue", "key", "parseJSONConfigToLocal", "preloadCacheFromMMKV", "", "kvTable", "preloadDefaultValueConfig", "storeMemCacheToMMKV", "versionTag", "", "memCache", "Companion", "appsetting-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.appsetting.api.b */
public final class InternalLocalDefaultConfigStorage {

    /* renamed from: d */
    public static final Lazy f73149d = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C29214b.INSTANCE);

    /* renamed from: e */
    public static final Companion f73150e = new Companion(null);

    /* renamed from: a */
    public Map<String, String> f73151a;

    /* renamed from: b */
    public MMKV f73152b;

    /* renamed from: c */
    public Context f73153c;

    /* renamed from: f */
    private final Object f73154f = new Object();

    /* renamed from: g */
    private Future<Boolean> f73155g;

    /* renamed from: h */
    private final boolean f73156h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/appsetting/api/InternalLocalDefaultConfigStorage$Companion;", "", "()V", "FILE_NAME_STATIC_SETTING", "", "INSTANCE", "Lcom/ss/android/lark/appsetting/api/InternalLocalDefaultConfigStorage;", "getINSTANCE", "()Lcom/ss/android/lark/appsetting/api/InternalLocalDefaultConfigStorage;", "INSTANCE$delegate", "Lkotlin/Lazy;", "KEY_KV_VERSION_TAG", "LOCAL_DEFAULT_KV_ID", "TAG", "appsetting-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.appsetting.api.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final InternalLocalDefaultConfigStorage mo103616a() {
            Lazy lazy = InternalLocalDefaultConfigStorage.f73149d;
            Companion aVar = InternalLocalDefaultConfigStorage.f73150e;
            return (InternalLocalDefaultConfigStorage) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/appsetting/api/InternalLocalDefaultConfigStorage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.appsetting.api.b$b */
    static final class C29214b extends Lambda implements Function0<InternalLocalDefaultConfigStorage> {
        public static final C29214b INSTANCE = new C29214b();

        C29214b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InternalLocalDefaultConfigStorage invoke() {
            return new InternalLocalDefaultConfigStorage();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/ss/android/lark/appsetting/api/InternalLocalDefaultConfigStorage$preloadDefaultValueConfig$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.appsetting.api.b$c */
    public static final class CallableC29215c<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InternalLocalDefaultConfigStorage f73157a;

        CallableC29215c(InternalLocalDefaultConfigStorage bVar) {
            this.f73157a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Boolean call() {
            return Boolean.valueOf(mo103617a());
        }

        /* renamed from: a */
        public final boolean mo103617a() {
            Integer num;
            long currentTimeMillis = System.currentTimeMillis();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) MMKV.mmkvWithID("LocalDefaultConfigStorage", 4);
            final int b = C26246a.m94978b(this.f73157a.f73153c);
            T t = objectRef.element;
            boolean z = false;
            if (t == null || t.count() != 0) {
                T t2 = objectRef.element;
                if (t2 != null) {
                    num = Integer.valueOf(t2.getInt("key_kv_version_tag", 0));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == b) {
                    z = true;
                }
            }
            if (z) {
                this.f73157a.f73152b = objectRef.element;
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getScheduleThreadPool().execute(new Runnable(this) {
                    /* class com.ss.android.lark.appsetting.api.InternalLocalDefaultConfigStorage.CallableC29215c.RunnableC292161 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC29215c f73158a;

                    {
                        this.f73158a = r1;
                    }

                    public final void run() {
                        InternalLocalDefaultConfigStorage bVar = this.f73158a.f73157a;
                        T t = objectRef.element;
                        Intrinsics.checkExpressionValueIsNotNull(t, "mmkvTable");
                        bVar.mo103613a((MMKV) t);
                    }
                });
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m165389i("LocalDefaultConfigSto", "preloadDefaultValueConfig load cache config success cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.");
            } else {
                final Map<String, String> b2 = this.f73157a.mo103615b();
                if (b2 == null) {
                    Log.m165389i("LocalDefaultConfigSto", "preloadDefaultValueConfig parse json file failed.");
                    long currentTimeMillis3 = System.currentTimeMillis();
                    Log.m165389i("LocalDefaultConfigSto", "preloadDefaultValueConfig load file config failed cost " + (currentTimeMillis3 - currentTimeMillis) + " ms.");
                } else {
                    CoreThreadPool coreThreadPool2 = CoreThreadPool.getDefault();
                    Intrinsics.checkExpressionValueIsNotNull(coreThreadPool2, "CoreThreadPool.getDefault()");
                    coreThreadPool2.getScheduleThreadPool().execute(new Runnable(this) {
                        /* class com.ss.android.lark.appsetting.api.InternalLocalDefaultConfigStorage.CallableC29215c.RunnableC292172 */

                        /* renamed from: a */
                        final /* synthetic */ CallableC29215c f73160a;

                        {
                            this.f73160a = r1;
                        }

                        public final void run() {
                            InternalLocalDefaultConfigStorage bVar = this.f73160a.f73157a;
                            T t = objectRef.element;
                            Intrinsics.checkExpressionValueIsNotNull(t, "mmkvTable");
                            bVar.mo103614a(t, b, b2);
                        }
                    });
                    this.f73157a.f73151a = b2;
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                Log.m165389i("LocalDefaultConfigSto", "preloadDefaultValueConfig load file config success cost " + (currentTimeMillis4 - currentTimeMillis) + " ms.");
            }
            return true;
        }
    }

    public InternalLocalDefaultConfigStorage() {
        Application application;
        boolean z;
        IAppSettingDependency aVar = (IAppSettingDependency) ClaymoreServiceLoader.loadFirstOrNull(IAppSettingDependency.class);
        if (aVar != null) {
            application = aVar.getContext();
        } else {
            application = null;
        }
        Application application2 = application;
        this.f73153c = application2;
        if (application2 != null) {
            z = C57852m.m224554a(application2);
        } else {
            z = false;
        }
        this.f73156h = z;
    }

    /* renamed from: a */
    public final void mo103612a() {
        synchronized (this.f73154f) {
            if (this.f73155g == null) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                this.f73155g = coreThreadPool.getFixedThreadPool().submit(new CallableC29215c(this));
                Log.m165389i("LocalDefaultConfigSto", "preloadDefaultValueConfig execute future.");
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: b */
    public final Map<String, String> mo103615b() {
        StringBuilder sb;
        long j;
        AssetManager assets;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream inputStream = null;
        try {
            Context context = this.f73153c;
            InputStream open = (context == null || (assets = context.getAssets()) == null) ? null : assets.open("lark_settings");
            byte[] a = C69753g.m267725a(open);
            Intrinsics.checkExpressionValueIsNotNull(a, "IOUtils.toByteArray(ais)");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkExpressionValueIsNotNull(charset, "StandardCharsets.UTF_8");
            String str = new String(a, charset);
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m165389i("LocalDefaultConfigSto", "parseJSONConfigToLocal load asset file cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.");
            JSONObject parseObject = JSONObject.parseObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : parseObject.keySet()) {
                Intrinsics.checkExpressionValueIsNotNull(str2, "key");
                String string = parseObject.getString(str2);
                Intrinsics.checkExpressionValueIsNotNull(string, "dataObj.getString(key)");
                linkedHashMap.put(str2, string);
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            Log.m165389i("LocalDefaultConfigSto", "parseJSONConfigToLocal json parse cost " + (currentTimeMillis3 - currentTimeMillis2) + " ms.");
            C69753g.m267724a((Closeable) open);
            long currentTimeMillis4 = System.currentTimeMillis();
            Log.m165389i("LocalDefaultConfigSto", "parseJSONConfigToLocal cost " + (currentTimeMillis4 - currentTimeMillis) + " ms.");
            return linkedHashMap;
        } catch (IOException e) {
            Log.m165384e("LocalDefaultConfigSto", "parseJSONConfigToLocal failed", e);
            C69753g.m267724a((Closeable) inputStream);
            j = System.currentTimeMillis();
            sb = new StringBuilder();
        } catch (Exception e2) {
            Log.m165384e("LocalDefaultConfigSto", "parseJSONConfigToLocal error", e2);
            C69753g.m267724a((Closeable) inputStream);
            j = System.currentTimeMillis();
            sb = new StringBuilder();
        } catch (Throwable th) {
            C69753g.m267724a((Closeable) inputStream);
            long currentTimeMillis5 = System.currentTimeMillis();
            Log.m165389i("LocalDefaultConfigSto", "parseJSONConfigToLocal cost " + (currentTimeMillis5 - currentTimeMillis) + " ms.");
            throw th;
        }
        sb.append("parseJSONConfigToLocal cost ");
        sb.append(j - currentTimeMillis);
        sb.append(" ms.");
        Log.m165389i("LocalDefaultConfigSto", sb.toString());
        return null;
    }

    /* renamed from: a */
    public final String mo103611a(String str) {
        boolean z;
        long j;
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (this.f73151a == null && this.f73152b == null) {
            z = true;
            mo103612a();
        } else {
            z = false;
        }
        try {
            if (this.f73156h) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            Future<Boolean> future = this.f73155g;
            if (future != null) {
                bool = future.get();
            } else {
                bool = null;
            }
            if (this.f73156h && z) {
                long currentTimeMillis = System.currentTimeMillis();
                Log.m165397w("LocalDefaultConfigSto", "getDefaultValue early fetch key " + str + " wait for " + (currentTimeMillis - j) + " ms.");
            }
            if (bool != null && !bool.booleanValue()) {
                return null;
            }
            Map<String, String> map = this.f73151a;
            if (map != null) {
                return map.get(str);
            }
            MMKV mmkv = this.f73152b;
            if (mmkv != null) {
                return mmkv.getString(str, null);
            }
            return null;
        } catch (Exception e) {
            Log.m165384e("LocalDefaultConfigSto", "getDefaultValue failed", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo103613a(MMKV mmkv) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String[] allKeys = mmkv.allKeys();
            for (String str : allKeys) {
                if (!TextUtils.equals(str, "key_kv_version_tag")) {
                    String string = mmkv.getString(str, null);
                    if (string != null) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "key");
                        linkedHashMap.put(str, string);
                    }
                }
            }
            this.f73151a = linkedHashMap;
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m165389i("LocalDefaultConfigSto", "preloadCacheFromMMKV success cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.");
        } catch (Exception e) {
            Log.m165385e("LocalDefaultConfigSto", "preloadCacheFromMMKV failed", e, true);
        }
    }

    /* renamed from: a */
    public final void mo103614a(MMKV mmkv, int i, Map<String, String> map) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            mmkv.clearAll();
            mmkv.putInt("key_kv_version_tag", i);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mmkv.putString(entry.getKey(), entry.getValue());
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m165389i("LocalDefaultConfigSto", "storeMemCacheToMMKV success cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.");
        } catch (Exception e) {
            Log.m165385e("LocalDefaultConfigSto", "storeMemCacheToMMKV failed", e, true);
        }
    }
}
