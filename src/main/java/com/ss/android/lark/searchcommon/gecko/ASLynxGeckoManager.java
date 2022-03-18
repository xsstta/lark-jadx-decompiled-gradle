package com.ss.android.lark.searchcommon.gecko;

import android.app.Application;
import android.content.Context;
import android.util.Pair;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.utils.C14367l;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.env.AppEnvType;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C69705k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J.\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0006\u0010\u001f\u001a\u00020\u0017J\u001a\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020\u001eJ\u0006\u0010&\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager;", "Lcom/ss/android/lark/searchcommon/gecko/ITemplateLoader;", "()V", "accessKey", "", "getAccessKey", "()Ljava/lang/String;", "isSynced", "", "mApplication", "Landroid/app/Application;", "mGeckoClient", "Lcom/bytedance/geckox/GeckoClient;", "mGeckoConfig", "Lcom/bytedance/geckox/GeckoConfig;", "mTargetChannels", "", "", "Lcom/bytedance/geckox/model/CheckRequestBodyModel$TargetChannel;", "templateCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "clearMemoryCache", "", "getTemplateByteArray", "channel", "templateName", "result", "Lkotlin/Function1;", "getTemplateFile", "Ljava/io/File;", "init", "loadFromAssets", "context", "Landroid/content/Context;", "fileName", "loadTemplate", "file", "syncTemplates", "Companion", "SingletonHolder", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.a.a */
public final class ASLynxGeckoManager {

    /* renamed from: e */
    public static final ASLynxGeckoManager f133122e = SingletonHolder.f133130a.mo183795a();

    /* renamed from: f */
    public static final Companion f133123f = new Companion(null);

    /* renamed from: a */
    public C14205b f133124a;

    /* renamed from: b */
    public Map<String, List<CheckRequestBodyModel.TargetChannel>> f133125b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, byte[]> f133126c;

    /* renamed from: d */
    public boolean f133127d;

    /* renamed from: g */
    private C14218d f133128g;

    /* renamed from: h */
    private Application f133129h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager$Companion;", "", "()V", "ACCESS_KEY_BOE", "", "ACCESS_KEY_ONLINE", "ACCESS_KEY_PRE", "CHANNEL_ENTERPRISE_CARD", "CHANNEL_SEARCH", "LOG_TAG", "instance", "Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager;", "getInstance", "()Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ASLynxGeckoManager mo183794a() {
            return ASLynxGeckoManager.f133122e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager;", "getHolder", "()Lcom/ss/android/lark/searchcommon/gecko/ASLynxGeckoManager;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a.a$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f133130a = new SingletonHolder();

        /* renamed from: b */
        private static final ASLynxGeckoManager f133131b = new ASLynxGeckoManager(null);

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final ASLynxGeckoManager mo183795a() {
            return f133131b;
        }
    }

    /* renamed from: c */
    public void mo183793c() {
        this.f133126c.clear();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a.a$c */
    public static final class C53878c<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ ASLynxGeckoManager f133132a;

        /* renamed from: b */
        final /* synthetic */ File f133133b;

        C53878c(ASLynxGeckoManager aVar, File file) {
            this.f133132a = aVar;
            this.f133133b = file;
        }

        /* renamed from: a */
        public final byte[] produce() {
            return this.f133132a.mo183791a(this.f133133b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a.a$e */
    public static final class RunnableC53880e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ASLynxGeckoManager f133137a;

        RunnableC53880e(ASLynxGeckoManager aVar) {
            this.f133137a = aVar;
        }

        public final void run() {
            ASLynxGeckoManager.m208776a(this.f133137a).mo52091a(this.f133137a.f133125b, new AbstractC14267a(this) {
                /* class com.ss.android.lark.searchcommon.gecko.ASLynxGeckoManager.RunnableC53880e.C538811 */

                /* renamed from: a */
                final /* synthetic */ RunnableC53880e f133138a;

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21857a() {
                    Log.m165379d("ASLynxGeckoManager", "syncTemplates，onUpdateFinish");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f133138a = r1;
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21863a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
                    Log.m165379d("ASLynxGeckoManager", "syncTemplates，onCheckServerVersionFail");
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21862a(String str, Throwable th) {
                    Log.m165379d("ASLynxGeckoManager", "syncTemplates，onUpdateSuccess， channel：" + str);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21861a(String str, long j) {
                    this.f133138a.f133137a.f133127d = true;
                    Log.m165379d("ASLynxGeckoManager", "syncTemplates，onUpdateSuccess， channel：" + str + ", version: " + j);
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21864a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                    Log.m165379d("ASLynxGeckoManager", "syncTemplates，onCheckServerVersionSuccess");
                }
            });
        }
    }

    private ASLynxGeckoManager() {
        this.f133125b = new HashMap();
        this.f133126c = new ConcurrentHashMap<>();
    }

    /* renamed from: b */
    public final void mo183792b() {
        if (!this.f133127d) {
            CoreThreadPool.getBackgroundHandler().post(new RunnableC53880e(this));
        }
    }

    /* renamed from: d */
    private final String m208778d() {
        AppEnvType c = SearchCommonModuleDependency.m208732b().mo102909c();
        if (c == null) {
            return "f2e97c8d28fd14414ce871534b57db7e";
        }
        int i = C53882b.f133139a[c.ordinal()];
        if (i == 1) {
            return "285fded323223388f4aedf68b975d216";
        }
        if (i == 2) {
            return "f2e97c8d28fd14414ce871534b57db7e";
        }
        if (i == 3) {
            return "80f3d6f8eb94aad0dc181ca3a881adcc";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final void mo183789a() {
        if (this.f133128g == null) {
            this.f133129h = LarkContext.getApplication();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel("mobile_search"));
            arrayList.add(new CheckRequestBodyModel.TargetChannel("mobile_cyclopedia"));
            this.f133125b.put(m208778d(), arrayList);
            C14218d.C14220a c = new C14218d.C14220a(this.f133129h).mo52154a((long) SearchCommonModuleDependency.m208732b().mo102882a()).mo52161a(m208778d()).mo52165b(m208778d()).mo52158a(C26246a.m94977a(this.f133129h)).mo52163b(SearchCommonModuleDependency.m208732b().mo102905b()).mo52166c(SearchCommonModuleDependency.m208732b().mo102887a("gecko"));
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            C14218d.C14220a b = c.mo52164b(coreThreadPool.getCachedThreadPool());
            CoreThreadPool coreThreadPool2 = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool2, "CoreThreadPool.getDefault()");
            C14218d a = b.mo52159a(coreThreadPool2.getCachedThreadPool()).mo52162a();
            this.f133128g = a;
            C14205b a2 = C14205b.m57334a(a);
            Intrinsics.checkExpressionValueIsNotNull(a2, "GeckoClient.create(mGeckoConfig)");
            this.f133124a = a2;
        }
    }

    public /* synthetic */ ASLynxGeckoManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public static final /* synthetic */ C14205b m208776a(ASLynxGeckoManager aVar) {
        C14205b bVar = aVar.f133124a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGeckoClient");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a.a$d */
    public static final class C53879d<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ ASLynxGeckoManager f133134a;

        /* renamed from: b */
        final /* synthetic */ File f133135b;

        /* renamed from: c */
        final /* synthetic */ Function1 f133136c;

        C53879d(ASLynxGeckoManager aVar, File file, Function1 function1) {
            this.f133134a = aVar;
            this.f133135b = file;
            this.f133136c = function1;
        }

        /* renamed from: a */
        public final void consume(byte[] bArr) {
            if (bArr != null) {
                String absolutePath = this.f133135b.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                this.f133134a.f133126c.put(absolutePath, bArr);
            }
            this.f133136c.invoke(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[SYNTHETIC, Splitter:B:15:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e A[SYNTHETIC, Splitter:B:21:0x002e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo183791a(java.io.File r4) {
        /*
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            r0 = 0
            r1 = r0
            java.io.InputStream r1 = (java.io.InputStream) r1
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            okio.u r4 = okio.C69705k.m267596a(r2)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            okio.e r4 = okio.C69705k.m267590a(r4)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            byte[] r4 = r4.readByteArray()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            return r4
        L_0x0020:
            r4 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x0023:
            r1 = r2
            goto L_0x002c
        L_0x0025:
            r4 = move-exception
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r4
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.gecko.ASLynxGeckoManager.mo183791a(java.io.File):byte[]");
    }

    /* renamed from: a */
    private final byte[] m208777a(Context context, String str) {
        Log.m165379d("ASLynxGeckoManager", "loadFromAssets，fileName：" + str);
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            if (open != null) {
                byte[] readByteArray = C69705k.m267590a(C69705k.m267596a(open)).readByteArray();
                try {
                    open.close();
                } catch (IOException unused) {
                }
                return readByteArray;
            }
        } catch (IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return null;
    }

    /* renamed from: a */
    public File mo183788a(String str, String str2) {
        File file;
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "channel");
        Intrinsics.checkParameterIsNotNull(str2, "templateName");
        Log.m165379d("ASLynxGeckoManager", "getTemplateFile， channel：" + str + ", templateName: " + str2);
        C14218d dVar = this.f133128g;
        if (dVar != null) {
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            File n = dVar.mo52148n();
            C14218d dVar2 = this.f133128g;
            if (dVar2 == null) {
                Intrinsics.throwNpe();
            }
            if (C14367l.m57844a(n, dVar2.mo52140f(), str)) {
                StringBuilder sb = new StringBuilder();
                C14218d dVar3 = this.f133128g;
                if (dVar3 != null) {
                    file = dVar3.mo52148n();
                } else {
                    file = null;
                }
                C14218d dVar4 = this.f133128g;
                if (dVar4 != null) {
                    str3 = dVar4.mo52140f();
                } else {
                    str3 = null;
                }
                sb.append(C14367l.m57846b(file, str3, str));
                sb.append("/");
                sb.append(str2);
                File file2 = new File(sb.toString());
                if (file2.exists()) {
                    Log.m165379d("ASLynxGeckoManager", "getTemplateFile, find template in gecko，channel：" + str + ", templateName: " + str2);
                    return file2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: ? super byte[] */
    /* renamed from: a */
    public void mo183790a(String str, String str2, Function1<? super byte[], Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "channel");
        Intrinsics.checkParameterIsNotNull(str2, "templateName");
        Intrinsics.checkParameterIsNotNull(function1, "result");
        if (this.f133129h != null) {
            Log.m165379d("ASLynxGeckoManager", "getTemplateByteArray， channel：" + str + ", templateName: " + str2);
            File a = mo183788a(str, str2);
            if (a == null) {
                Application application = this.f133129h;
                if (application == null) {
                    Intrinsics.throwNpe();
                }
                function1.invoke(m208777a(application, str2));
            } else if (this.f133126c.get(a.getAbsolutePath()) != null) {
                function1.invoke(this.f133126c.get(a.getAbsolutePath()));
            } else {
                C57865c.m224574a(new C53878c(this, a), new C53879d(this, a, function1));
            }
        }
    }
}
