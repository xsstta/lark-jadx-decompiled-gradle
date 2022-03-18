package com.bytedance.ee.bear.dynamicres;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13618f;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.utils.C14367l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eJ.\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0016\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0004J\u001c\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager;", "", "()V", "featureSwitch", "", "getFeatureSwitch", "()Z", "setFeatureSwitch", "(Z)V", "lock", "mContext", "Landroid/content/Context;", "mGeckoClientCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/bytedance/geckox/GeckoClient;", "clear", "", "accessKey", "channel", "destroyGeckoClient", "getChannelFile", "Ljava/io/File;", "getGeckoClient", "getGeckoRootPath", "getResource", "Lcom/bytedance/ee/bear/dynamicres/ResourceBean;", "hasRegisterBiz", "registerBiz", "baseConfig", "Lcom/bytedance/ee/bear/dynamicres/BaseConfig;", "channels", "", "listener", "Lcom/bytedance/ee/bear/dynamicres/ResourceStatusListener;", "switchDebug", "context", "enable", "sync", "Companion", "SingletonHolder", "dynamic-resource_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.dynamicres.b */
public final class DynamicResourceManager {

    /* renamed from: a */
    public static final DynamicResourceManager f20599a = SingletonHolder.f20605a.mo29848a();

    /* renamed from: b */
    public static final Companion f20600b = new Companion(null);

    /* renamed from: c */
    private final Object f20601c;

    /* renamed from: d */
    private final ConcurrentHashMap<String, C14205b> f20602d;

    /* renamed from: e */
    private Context f20603e;

    /* renamed from: f */
    private boolean f20604f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager;", "getInstance", "()Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager;", "dynamic-resource_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.dynamicres.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DynamicResourceManager mo29847a() {
            return DynamicResourceManager.f20599a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager$SingletonHolder;", "", "()V", "holder", "Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager;", "getHolder", "()Lcom/bytedance/ee/bear/dynamicres/DynamicResourceManager;", "dynamic-resource_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.dynamicres.b$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f20605a = new SingletonHolder();

        /* renamed from: b */
        private static final DynamicResourceManager f20606b = new DynamicResourceManager(null);

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DynamicResourceManager mo29848a() {
            return f20606b;
        }
    }

    private DynamicResourceManager() {
        this.f20601c = new Object();
        this.f20602d = new ConcurrentHashMap<>();
        this.f20604f = true;
    }

    /* renamed from: a */
    private final File m30432a() {
        Context context = this.f20603e;
        if (context == null) {
            C13479a.m54758a("DynamicResourceManager", "getGeckoRootPath: context is null,can not get dir");
            return null;
        }
        File filesDir = context.getFilesDir();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
        if (filesDir.exists() || filesDir.mkdirs()) {
            File file = new File(filesDir, "gecko");
            if (file.exists() || file.mkdirs()) {
                C13479a.m54772d("DynamicResourceManager", "getGeckoRootPath: " + file.getAbsolutePath());
                return file;
            }
            C13479a.m54775e("DynamicResourceManager", "mkdir gecko Dir failed");
            return null;
        }
        C13479a.m54775e("DynamicResourceManager", "mkdir filesDir failed");
        return null;
    }

    public /* synthetic */ DynamicResourceManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo29845a(boolean z) {
        this.f20604f = z;
    }

    /* renamed from: b */
    private final C14205b m30433b(String str) {
        return this.f20602d.get(str);
    }

    /* renamed from: a */
    public final boolean mo29846a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        return this.f20602d.containsKey(str);
    }

    /* renamed from: a */
    public final ResourceBean mo29842a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(str2, "channel");
        String b = C14367l.m57846b(m30432a(), str, str2);
        ResourceBean resourceBean = new ResourceBean();
        resourceBean.mo29827a(b);
        C13479a.m54764b("DynamicResourceManager", "getResource: " + resourceBean);
        return resourceBean;
    }

    /* renamed from: a */
    public final void mo29844a(String str, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(list, "channels");
        C14205b b = m30433b(str);
        if (b == null) {
            C13479a.m54775e("DynamicResourceManager", "sync(): failed cause geckoClient is null , accessKey is " + str);
        } else if (list.isEmpty()) {
            b.mo52087a();
            C13479a.m54764b("DynamicResourceManager", "sync(): all channels");
        } else {
            C13479a.m54764b("DynamicResourceManager", "sync(): channels " + list);
            b.mo52087a();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str, arrayList);
            b.mo52090a(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo29843a(BaseConfig aVar, String str, List<String> list, ResourceStatusListener cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "baseConfig");
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(list, "channels");
        this.f20603e = aVar.mo29835a();
        if (!this.f20604f) {
            C13479a.m54775e("DynamicResourceManager", "registerBiz: abandon cause feature switch is " + this.f20604f);
            return;
        }
        synchronized (this.f20601c) {
            if (this.f20602d.get(str) != null) {
                if (cVar != null) {
                    cVar.mo29849a();
                }
                return;
            }
            if (!TextUtils.isEmpty(aVar.mo29837c())) {
                C14205b a = C14205b.m57334a(new C14218d.C14220a(aVar.mo29835a()).mo52165b(str).mo52161a(str).mo52154a((long) aVar.mo29836b()).mo52166c(aVar.mo29838d()).mo52158a(C13618f.m55265a(aVar.mo29835a())).mo52163b(aVar.mo29837c()).mo52157a(m30432a()).mo52162a());
                Intrinsics.checkExpressionValueIsNotNull(a, "geckoClient");
                this.f20602d.put(str, a);
                if (cVar != null) {
                    cVar.mo29849a();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                C13479a.m54775e("DynamicResourceManager", "deviceId is null");
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
