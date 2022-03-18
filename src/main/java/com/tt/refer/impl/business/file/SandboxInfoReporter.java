package com.tt.refer.impl.business.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40645l;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0003J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J.\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/tt/refer/impl/business/file/SandboxInfoReporter;", "", "()V", "TAG", "", "enableFGKey", "isReport", "", "()Z", "setReport", "(Z)V", "isRootDirReportedMap", "", "()Ljava/util/Map;", "setRootDirReportedMap", "(Ljava/util/Map;)V", "getCommonParams", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getReportInfo", "root", "Ljava/io/File;", "isFGEnable", "report", "", "dir", "reportRootDir", ShareHitPoint.f121869d, "file", "runnable", "Ljava/lang/Runnable;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.e */
public final class SandboxInfoReporter {

    /* renamed from: a */
    public static final SandboxInfoReporter f171084a = new SandboxInfoReporter();

    /* renamed from: b */
    private static boolean f171085b;

    /* renamed from: c */
    private static Map<String, Boolean> f171086c = new LinkedHashMap();

    private SandboxInfoReporter() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "", "", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.e$a */
    public static final class C67926a<T> implements ObservableOnSubscribe<T> {

        /* renamed from: a */
        final /* synthetic */ File f171087a;

        C67926a(File file) {
            this.f171087a = file;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(ObservableEmitter<Map<String, Object>> observableEmitter) {
            Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
            observableEmitter.onNext(SandboxInfoReporter.m264430a(this.f171087a));
            observableEmitter.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.e$b */
    public static final class C67927b<T> implements Consumer<Map<String, ? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ OPMonitor f171088a;

        /* renamed from: b */
        final /* synthetic */ IAppContext f171089b;

        C67927b(OPMonitor oPMonitor, IAppContext iAppContext) {
            this.f171088a = oPMonitor;
            this.f171089b = iAppContext;
        }

        /* renamed from: a */
        public final void accept(Map<String, ? extends Object> map) {
            this.f171088a.timing().addMap(map).setResultTypeSuccess().addCommonParams(SandboxInfoReporter.m264429a(this.f171089b)).flush();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, Object> m264429a(IAppContext iAppContext) {
        HashMap<String, Object> b;
        if (iAppContext == null) {
            return MapsKt.emptyMap();
        }
        AbstractC67796c cVar = (AbstractC67796c) iAppContext.findServiceByInterface(AbstractC67796c.class);
        if (cVar == null || (b = cVar.mo88674b()) == null) {
            return MapsKt.emptyMap();
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.file.e$c */
    public static final class C67928c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ OPMonitor f171090a;

        /* renamed from: b */
        final /* synthetic */ IAppContext f171091b;

        C67928c(OPMonitor oPMonitor, IAppContext iAppContext) {
            this.f171090a = oPMonitor;
            this.f171091b = iAppContext;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f171090a.timing().setError(th).setErrorMessage(th.getMessage()).setResultTypeFail().addCommonParams(SandboxInfoReporter.m264429a(this.f171091b)).flush();
        }
    }

    /* renamed from: b */
    private final boolean m264433b(IAppContext iAppContext) {
        Boolean bool;
        if (iAppContext != null) {
            AbstractC67724a aVar = (AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class);
            boolean z = true;
            if (aVar != null && aVar.mo50456b("ecosystem.open_app.sandbox.info.monitor")) {
                return true;
            }
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("hostService null: ");
            if (aVar != null) {
                z = false;
            }
            sb.append(z);
            sb.append(' ');
            sb.append("or fg closed: ");
            if (aVar != null) {
                bool = Boolean.valueOf(aVar.mo50456b("ecosystem.open_app.sandbox.info.monitor"));
            } else {
                bool = null;
            }
            sb.append(bool);
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i("SandboxInfoReporter", objArr);
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, Object> m264430a(File file) {
        File[] listFiles;
        boolean z = false;
        if (file == null || !file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("root file illegal. null: ");
            if (file == null) {
                z = true;
            }
            sb.append(z);
            sb.append(" isDirectory:");
            Boolean bool = null;
            sb.append(file != null ? Boolean.valueOf(file.isDirectory()) : null);
            sb.append(", ");
            sb.append("exists:");
            sb.append(file != null ? Boolean.valueOf(file.exists()) : null);
            sb.append(", isFile:");
            if (file != null) {
                bool = Boolean.valueOf(file.isFile());
            }
            sb.append(bool);
            throw new IllegalArgumentException(sb.toString());
        } else if (file.exists()) {
            LinkedList linkedList = new LinkedList();
            linkedList.offer(file);
            String str = "";
            long j = 0;
            int i = 0;
            int i2 = 0;
            String str2 = str;
            long j2 = 0;
            for (boolean z2 = true; linkedList.isEmpty() ^ z2; z2 = true) {
                int size = linkedList.size();
                while (size > 0) {
                    File file2 = (File) linkedList.poll();
                    size--;
                    if (file2 != null && file2.exists()) {
                        if (file2.isFile()) {
                            j = Math.max(file2.length(), j);
                            if (str2.length() < file2.getName().length()) {
                                str2 = file2.getName();
                                Intrinsics.checkExpressionValueIsNotNull(str2, "file.name");
                            }
                            i2++;
                            j2 += file2.length();
                        } else if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                            for (File file3 : listFiles) {
                                linkedList.offer(file3);
                            }
                        }
                        if (file2.getCanonicalPath().length() > str.length()) {
                            str = file2.getCanonicalPath();
                            Intrinsics.checkExpressionValueIsNotNull(str, "file.canonicalPath");
                        }
                    }
                }
                i++;
            }
            if (i > 0) {
                i--;
            }
            return MapsKt.mapOf(TuplesKt.to("user_total_size", Long.valueOf(j2)), TuplesKt.to("user_max_depth", Integer.valueOf(i)), TuplesKt.to("user_max_file_size", Long.valueOf(j)), TuplesKt.to("user_file_name_max_length", Integer.valueOf(str2.length())), TuplesKt.to("user_file_num", Integer.valueOf(i2)), TuplesKt.to("user_path_max_length", Integer.valueOf(str.length())));
        } else {
            throw new IllegalArgumentException("root file not exists");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m264431a(File file, IAppContext iAppContext) {
        SandboxInfoReporter eVar = f171084a;
        if (eVar.m264433b(iAppContext)) {
            synchronized (eVar) {
                if (!f171085b) {
                    f171085b = true;
                    Unit unit = Unit.INSTANCE;
                    OPMonitor timing = new OPMonitor(C40645l.f103103a).timing();
                    Observable.create(new C67926a(file)).subscribeOn(C68279a.m265021a()).timeout(15, TimeUnit.SECONDS).subscribe(new C67927b(timing, iAppContext), new C67928c(timing, iAppContext));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = new com.ss.android.lark.opmonitor.service.OPMonitor(com.ss.android.lark.p2069j.p2070a.C40645l.f103105c).timing();
        r4 = r0.addCategoryValue("dir_type", r4).addCategoryValue("dir_exists_before", java.lang.Boolean.valueOf(r5.exists())).addCategoryValue("dir_is_dir_before", java.lang.Boolean.valueOf(r5.isDirectory())).addCategoryValue("dir_is_regular_file_before", java.lang.Boolean.valueOf(r5.isFile()));
        r2 = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, "Thread.currentThread()");
        r4 = r4.addCategoryValue("current_thread_id", java.lang.Long.valueOf(r2.getId()));
        r2 = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, "Thread.currentThread()");
        r4.addCategoryValue("current_thread_name", r2.getName());
        r7.run();
        r0.addCategoryValue("dir_exists_after", java.lang.Boolean.valueOf(r5.exists())).addCategoryValue("dir_is_dir_after", java.lang.Boolean.valueOf(r5.isDirectory())).addCategoryValue("dir_is_regular_file_after", java.lang.Boolean.valueOf(r5.isFile())).addCommonParams(m264429a(r6)).timing();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00dc, code lost:
        if (r5.isDirectory() == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00de, code lost:
        r0.setResultTypeSuccess();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e2, code lost:
        r0.setResultTypeFail();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e5, code lost:
        r0.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e8, code lost:
        return;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m264432a(java.lang.String r4, java.io.File r5, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r6, java.lang.Runnable r7) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.impl.business.file.SandboxInfoReporter.m264432a(java.lang.String, java.io.File, com.bytedance.ee.lark.infra.sandbox.context.IAppContext, java.lang.Runnable):void");
    }
}
