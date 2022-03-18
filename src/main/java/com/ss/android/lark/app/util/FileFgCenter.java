package com.ss.android.lark.app.util;

import android.app.Application;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/app/util/FileFgCenter;", "", "()V", "createFile", "", "markFile", "", "deleteFile", "isEnable", "", "featureName", "updateAllAsync", "Companion", "FgBean", "SingletonHolder", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.app.util.e */
public final class FileFgCenter {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, FgBean> f72894a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final String f72895b;

    /* renamed from: c */
    public static final Companion f72896c;

    @JvmStatic
    /* renamed from: b */
    public static final FileFgCenter m106955b() {
        return f72896c.mo103172a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/app/util/FileFgCenter$Companion;", "", "()V", "TAG", "", "sFgMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/app/util/FileFgCenter$FgBean;", "sFileDir", "addFG", "", "featureName", "getInstance", "Lcom/ss/android/lark/app/util/FileFgCenter;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.e$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final FileFgCenter mo103172a() {
            return SingletonHolder.f72899a.mo103180a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo103173a(String str) {
            FileFgCenter.f72894a.put(str, new FgBean(FileFgCenter.f72895b + File.separator + str, null, 2, null));
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0007J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/app/util/FileFgCenter$FgBean;", "", "markFile", "", "isEnable", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMarkFile", "()Ljava/lang/String;", "setMarkFile", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ss/android/lark/app/util/FileFgCenter$FgBean;", "equals", "other", "hashCode", "", "toString", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.e$b */
    public static final class FgBean {

        /* renamed from: a */
        private String f72897a;

        /* renamed from: b */
        private Boolean f72898b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FgBean)) {
                return false;
            }
            FgBean bVar = (FgBean) obj;
            return Intrinsics.areEqual(this.f72897a, bVar.f72897a) && Intrinsics.areEqual(this.f72898b, bVar.f72898b);
        }

        public int hashCode() {
            String str = this.f72897a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Boolean bool = this.f72898b;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "FgBean(markFile=" + this.f72897a + ", isEnable=" + this.f72898b + ")";
        }

        /* renamed from: a */
        public final String mo103174a() {
            return this.f72897a;
        }

        /* renamed from: b */
        public final Boolean mo103176b() {
            return this.f72898b;
        }

        /* renamed from: a */
        public final void mo103175a(Boolean bool) {
            this.f72898b = bool;
        }

        public FgBean(String str, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(str, "markFile");
            this.f72897a = str;
            this.f72898b = bool;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FgBean(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bool);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/app/util/FileFgCenter$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/app/util/FileFgCenter;", "getInstance", "()Lcom/ss/android/lark/app/util/FileFgCenter;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.e$c */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f72899a = new SingletonHolder();

        /* renamed from: b */
        private static final FileFgCenter f72900b = new FileFgCenter();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final FileFgCenter mo103180a() {
            return f72900b;
        }
    }

    static {
        Companion aVar = new Companion(null);
        f72896c = aVar;
        StringBuilder sb = new StringBuilder();
        StoragePathUtils dVar = StoragePathUtils.f94669a;
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        sb.append(dVar.mo135728Z(application));
        sb.append(File.separator);
        sb.append("file_fg");
        String sb2 = sb.toString();
        f72895b = sb2;
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        aVar.mo103173a("lark.mira.delay.hook.classloader");
        aVar.mo103173a("lark.android.double.thread.quicken");
        aVar.mo103173a("privacy_detection_dynamic");
    }

    /* renamed from: a */
    public final synchronized void mo103170a() {
        AbstractC37250a b = C37239a.m146648b();
        for (String str : f72894a.keySet()) {
            FgBean bVar = f72894a.get(str);
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(bVar, "sFgMap[key]!!");
            boolean a = b.mo136952a(str, false);
            String a2 = bVar.mo103174a();
            boolean j = C26311p.m95290j(a2);
            Log.m165389i("FileFgCenter", str + " fg value is " + a + ", mark file is exist " + j);
            if (a && !j) {
                m106956b(a2);
            }
            if (!a && j) {
                m106957c(a2);
            }
        }
    }

    /* renamed from: b */
    private final void m106956b(String str) {
        boolean createNewFile = new File(str).createNewFile();
        Log.m165389i("FileFgCenter", "create mark file " + str + " is success: " + createNewFile);
    }

    /* renamed from: c */
    private final void m106957c(String str) {
        boolean k = C26311p.m95291k(str);
        Log.m165389i("FileFgCenter", "delete mark file " + str + " is success: " + k);
    }

    /* renamed from: a */
    public final synchronized boolean mo103171a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "featureName");
        z = false;
        FgBean bVar = f72894a.get(str);
        if (bVar != null) {
            if (bVar.mo103176b() == null) {
                bVar.mo103175a(Boolean.valueOf(C26311p.m95290j(bVar.mo103174a())));
            }
            z = Intrinsics.areEqual((Object) bVar.mo103176b(), (Object) true);
        }
        return z;
    }
}
