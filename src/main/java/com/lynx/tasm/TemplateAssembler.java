package com.lynx.tasm;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.common.C26872a;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.p1216a.C26546b;
import com.lynx.tasm.p1216a.C26550f;
import com.lynx.tasm.p1216a.C26553i;
import com.lynx.tasm.p1227d.C26886a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public class TemplateAssembler {

    /* renamed from: a */
    public AbstractC26911n f65627a;

    /* renamed from: b */
    private long f65628b;

    /* renamed from: c */
    private AbstractC26543a f65629c;

    /* renamed from: d */
    private String f65630d;

    /* renamed from: e */
    private JSProxy f65631e;

    /* renamed from: f */
    private int f65632f;

    /* renamed from: g */
    private volatile boolean f65633g;

    /* renamed from: h */
    private C26908k f65634h;

    /* renamed from: i */
    private WeakReference<AbstractC26684l> f65635i;

    /* renamed from: j */
    private PaintingContext f65636j;

    /* renamed from: k */
    private LayoutContext f65637k;

    /* renamed from: l */
    private boolean f65638l;

    /* renamed from: m */
    private C26932p f65639m;

    /* renamed from: n */
    private DynamicComponentLoader f65640n;

    /* renamed from: o */
    private AtomicInteger f65641o = new AtomicInteger(0);

    /* renamed from: p */
    private SparseArray<AbstractC26907j> f65642p = new SparseArray<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.TemplateAssembler$a */
    public interface AbstractC26543a {
        /* renamed from: a */
        String mo94220a(String str, String str2);

        /* renamed from: a */
        void mo94221a();

        /* renamed from: a */
        void mo94222a(int i, String str);

        /* renamed from: a */
        void mo94223a(LynxPerfMetric lynxPerfMetric);

        /* renamed from: a */
        void mo94224a(C26886a aVar);

        /* renamed from: a */
        void mo94225a(String str, String str2, int i);

        /* renamed from: b */
        void mo94226b();

        /* renamed from: b */
        void mo94227b(LynxPerfMetric lynxPerfMetric);
    }

    private native long nativeCreate(Object obj, Object obj2, Object obj3, int i, boolean z, int i2, int i3);

    private native void nativeDestroy(long j);

    private native JavaOnlyMap nativeGetAllJsSource(long j);

    private native void nativeGetDataAsync(long j, int i);

    private native JavaOnlyMap nativeGetListPlatformInfo(long j, int i);

    private native void nativeInitRuntime(long j, ResourceLoader resourceLoader, ExternalSourceLoader externalSourceLoader, LynxModuleManager lynxModuleManager, String str, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4);

    private native void nativeLoadTemplate(long j, String str, byte[] bArr, ByteBuffer byteBuffer, int i);

    private native void nativeLoadTemplateByJson(long j, String str, byte[] bArr, String str2);

    private native void nativeLoadTemplateByPreParsedData(long j, String str, byte[] bArr, long j2, boolean z, String str2);

    private native void nativeOnEnterBackground(long j);

    private native void nativeOnEnterForeground(long j);

    private native void nativeOnFirstScreen(long j);

    private native void nativeRemoveChild(long j, int i, int i2);

    private native void nativeRenderChild(long j, int i, int i2, long j2);

    private native void nativeSendCustomEvent(long j, String str, int i, ByteBuffer byteBuffer, int i2, String str2);

    private native void nativeSendInternalEvent(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeSendSyncTouchEvent(long j, String str, int i, float f, float f2, float f3, float f4, float f5, float f6);

    private native void nativeSendTouchEvent(long j, String str, int i, float f, float f2, float f3, float f4, float f5, float f6);

    private native void nativeSetGlobalProps(long j, long j2);

    private native void nativeSyncFetchLayoutResult(long j);

    private native void nativeUpdateChild(long j, int i, int i2, int i3, long j2);

    private native void nativeUpdateConfig(long j, ByteBuffer byteBuffer, int i);

    private native void nativeUpdateDataByPreParsedData(long j, long j2, String str, boolean z);

    private native void nativeUpdateScreenMetrics(long j, int i, int i2, float f);

    private native void nativeUpdateViewport(long j, int i, int i2, int i3, int i4);

    private long getPtr() {
        return this.f65628b;
    }

    /* renamed from: a */
    public long mo94290a() {
        return this.f65628b;
    }

    /* renamed from: b */
    public JSProxy mo94309b() {
        return this.f65631e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo94315d() {
        return this.f65632f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94306a(byte[] bArr, TemplateData templateData, String str, AbstractC26543a aVar) {
        String str2;
        boolean z;
        long j;
        if (bArr == null) {
            LLog.m96429e("TA", "Load Template with null template");
            return;
        }
        if (templateData != null) {
            templateData.mo94337c();
            long b = templateData.mo94334b();
            str2 = templateData.mo94339e();
            z = templateData.mo94342g();
            j = b;
        } else {
            str2 = null;
            j = 0;
            z = false;
        }
        if (j == 0) {
            LLog.m96429e("TA", "Load Template with zero templatedata");
        }
        this.f65630d = str;
        this.f65629c = aVar;
        this.f65632f = bArr.length;
        nativeLoadTemplateByPreParsedData(this.f65628b, str, bArr, j, z, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94307a(byte[] bArr, String str, String str2, AbstractC26543a aVar) {
        if (bArr == null) {
            LLog.m96429e("TA", "Load Template with null template");
            return;
        }
        this.f65630d = str2;
        this.f65629c = aVar;
        this.f65632f = bArr.length;
        nativeLoadTemplateByJson(this.f65628b, str2, bArr, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94308a(byte[] bArr, Map<String, Object> map, String str, AbstractC26543a aVar) {
        if (bArr == null) {
            LLog.m96429e("TA", "Load Template with null template");
            return;
        }
        ByteBuffer a = C26872a.f66718a.mo95651a(map);
        this.f65630d = str;
        this.f65629c = aVar;
        this.f65632f = bArr.length;
        nativeLoadTemplate(this.f65628b, str, bArr, a, a == null ? 0 : a.position());
    }

    /* renamed from: a */
    public void mo94300a(C26553i iVar) {
        String d = iVar.mo94349d();
        if (this.f65633g) {
            LLog.m96429e("TemplateAssembler", "SendTouchEvent: " + d + " error: TemplateAssemble is destroyed.");
            return;
        }
        nativeSendTouchEvent(this.f65628b, d, iVar.mo94348c(), iVar.mo94357a().mo94360a(), iVar.mo94357a().mo94362b(), iVar.mo94358b().mo94360a(), iVar.mo94358b().mo94362b(), iVar.mo94359e().mo94360a(), iVar.mo94359e().mo94362b());
    }

    /* renamed from: a */
    public void mo94299a(C26550f fVar) {
        int i;
        ByteBuffer byteBuffer;
        if (this.f65633g) {
            LLog.m96429e("TemplateAssembler", "SendInternalEvent: id " + fVar.mo94352b() + " tag: " + fVar.mo94351a());
            return;
        }
        if (fVar.mo94353c() != null) {
            ByteBuffer a = C26872a.f66718a.mo95651a(fVar.mo94353c());
            byteBuffer = a;
            i = a.position();
        } else {
            byteBuffer = null;
            i = 0;
        }
        nativeSendInternalEvent(this.f65628b, fVar.mo94351a(), fVar.mo94352b(), byteBuffer, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94303a(AbstractC26907j jVar) {
        int incrementAndGet = this.f65641o.incrementAndGet();
        this.f65642p.put(incrementAndGet, jVar);
        nativeGetDataAsync(this.f65628b, incrementAndGet);
    }

    /* renamed from: a */
    public void mo94302a(C26886a aVar) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            aVar.mo95678a(hashMap, "theme");
            ByteBuffer a = C26872a.f66718a.mo95651a(hashMap);
            if (a != null) {
                nativeUpdateConfig(this.f65628b, a, a.position());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94304a(AbstractC26911n nVar) {
        this.f65627a = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94305a(boolean z) {
        if (z || m96180k()) {
            nativeOnEnterForeground(this.f65628b);
        }
    }

    private void dispatchOnLoaded() {
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            aVar.mo94221a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo94317f() {
        nativeSyncFetchLayoutResult(this.f65628b);
    }

    /* renamed from: g */
    public void mo94318g() {
        nativeOnFirstScreen(this.f65628b);
    }

    /* renamed from: h */
    public Map<String, Object> mo94320h() {
        return nativeGetAllJsSource(this.f65628b);
    }

    public void onRuntimeReady() {
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            aVar.mo94226b();
        }
    }

    /* renamed from: l */
    private String m96181l() {
        C26908k kVar = this.f65634h;
        if (kVar != null) {
            return kVar.mo95716b();
        }
        return C26908k.f66805b;
    }

    /* renamed from: m */
    private String[] m96182m() {
        C26908k kVar = this.f65634h;
        if (kVar != null) {
            return kVar.mo95719e();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m96180k() {
        if (!this.f65638l) {
            return false;
        }
        C26932p pVar = this.f65639m;
        if (pVar != null) {
            return pVar.mo95773a();
        }
        LLog.m96429e("TemplateAssembler", "PageConfig is null.GetAutoExpose get default true!");
        return true;
    }

    /* renamed from: c */
    public String mo94314c() {
        C26932p pVar = this.f65639m;
        if (pVar != null) {
            return pVar.mo95775c();
        }
        LLog.m96429e("TemplateAssembler", "PageConfig is null.GetPageVersion get default error;");
        return "error";
    }

    /* renamed from: i */
    public boolean mo94321i() {
        C26932p pVar = this.f65639m;
        if (pVar != null) {
            return pVar.mo95774b();
        }
        LLog.m96429e("TemplateAssembler", "PageConfig is null. EnableEventThrough get default false!");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo94316e() {
        this.f65637k.mo94510b();
        this.f65636j.mo94538a();
        this.f65633g = true;
        nativeDestroy(this.f65628b);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.TemplateAssembler.RunnableC265411 */

            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.lynx.tasm.TemplateAssembler.RunnableC265411.RunnableC265421 */

                    public void run() {
                        if (TemplateAssembler.this.f65627a != null) {
                            TemplateAssembler.this.f65627a.mo11464e();
                        }
                    }
                });
            }
        });
        this.f65631e.mo95664b();
        this.f65628b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C26903g mo94322j() {
        C26932p pVar = this.f65639m;
        if (pVar == null) {
            return new C26903g("", "", "", "");
        }
        return new C26903g(pVar.mo95775c(), this.f65639m.mo95776d(), this.f65639m.mo95777e(), this.f65639m.mo95778f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94301a(AbstractC26684l lVar) {
        this.f65635i = new WeakReference<>(lVar);
    }

    public void onPageConfigDecoded(ReadableMap readableMap) {
        this.f65639m = new C26932p(readableMap);
    }

    /* renamed from: a */
    public void mo94297a(TemplateData templateData) {
        long j;
        if (templateData != null) {
            templateData.mo94337c();
            j = templateData.mo94334b();
        } else {
            j = 0;
        }
        if (j == 0) {
            LLog.m96429e("TA", "SetGlobalProps with zero templatedata");
        }
        nativeSetGlobalProps(this.f65628b, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo94311b(TemplateData templateData) {
        nativeUpdateDataByPreParsedData(this.f65628b, templateData.mo94334b(), templateData.mo94339e(), templateData.mo94342g());
    }

    /* renamed from: a */
    public JavaOnlyMap mo94291a(int i) {
        if (!this.f65633g) {
            return nativeGetListPlatformInfo(this.f65628b, i);
        }
        LLog.m96429e("TemplateAssembler", "getListPlatformInfo while tasm is destoryed: listSign " + i);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo94312b(boolean z) {
        if (z || m96180k()) {
            nativeOnEnterBackground(this.f65628b);
        }
    }

    /* renamed from: b */
    public boolean mo94313b(C26553i iVar) {
        String d = iVar.mo94349d();
        if (!this.f65633g) {
            return nativeSendSyncTouchEvent(this.f65628b, d, iVar.mo94348c(), iVar.mo94357a().mo94360a(), iVar.mo94357a().mo94362b(), iVar.mo94358b().mo94360a(), iVar.mo94358b().mo94362b(), iVar.mo94359e().mo94360a(), iVar.mo94359e().mo94362b());
        }
        LLog.m96429e("TemplateAssembler", "SendSyncTouchEvent: " + d + " error: TemplateAssemble is destroyed.");
        return false;
    }

    /* renamed from: a */
    public void mo94298a(C26546b bVar) {
        int i;
        String d = bVar.mo94349d();
        if (this.f65633g) {
            LLog.m96429e("TemplateAssembler", "SendCustomEvent: " + d + " error: TemplateAssemble is destroyed.");
            return;
        }
        ByteBuffer a = C26872a.f66718a.mo95651a(bVar.mo94345a());
        if (a == null) {
            i = 0;
        } else {
            i = a.position();
        }
        nativeSendCustomEvent(this.f65628b, d, bVar.mo94348c(), a, i, bVar.mo94346b());
    }

    public void reportError(int i, String str) {
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            aVar.mo94222a(i, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo94310b(int i, int i2) {
        nativeUpdateScreenMetrics(this.f65628b, i, i2, 1.0f);
    }

    public void onFirstLoadPerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.f65630d);
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            aVar.mo94223a(lynxPerfMetric);
        }
    }

    public void onUpdatePerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.f65630d);
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            aVar.mo94227b(lynxPerfMetric);
        }
    }

    public String translateResourceForTheme(String str, String str2) {
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            return aVar.mo94220a(str, str2);
        }
        return null;
    }

    public void getDataBack(ByteBuffer byteBuffer, int i) {
        AbstractC26907j jVar = this.f65642p.get(i);
        Object a = C26872a.f66718a.mo95650a(byteBuffer);
        if (a instanceof Map) {
            jVar.mo95714a(JavaOnlyMap.from((Map) a));
        } else {
            jVar.mo95715a("LynxView GetData Failed");
        }
    }

    /* renamed from: a */
    public void mo94292a(int i, int i2) {
        if (this.f65633g) {
            LLog.m96429e("TemplateAssembler", "removeChild: listSign " + i + ", childSign " + i2);
            return;
        }
        nativeRemoveChild(this.f65628b, i, i2);
    }

    public void onConfigUpdatedByJS(String str, Object obj) {
        if (!(str == null || obj == null || !(obj instanceof HashMap))) {
            HashMap hashMap = (HashMap) obj;
            if ("theme".equals(str)) {
                C26886a aVar = new C26886a();
                for (Map.Entry entry : hashMap.entrySet()) {
                    aVar.mo95680a((String) entry.getKey(), (String) entry.getValue());
                }
                AbstractC26543a aVar2 = this.f65629c;
                if (aVar2 != null) {
                    aVar2.mo94224a(aVar);
                }
            }
        }
    }

    public void onModuleFunctionInvoked(String str, String str2, int i) {
        AbstractC26543a aVar = this.f65629c;
        if (aVar != null) {
            try {
                aVar.mo94225a(str, str2, i);
            } catch (Exception e) {
                reportError(904, "onModuleFunctionInvoked threw an exception: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo94295a(int i, int i2, long j) {
        if (this.f65633g) {
            LLog.m96429e("TemplateAssembler", "renderChild: listSign " + i + ", index " + i2);
            return;
        }
        nativeRenderChild(this.f65628b, i, i2, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo94293a(int i, int i2, int i3, int i4) {
        nativeUpdateViewport(this.f65628b, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo94294a(int i, int i2, int i3, long j) {
        if (this.f65633g) {
            LLog.m96429e("TemplateAssembler", "renderChild: listSign " + i + ", oldSign " + i2 + ", newIndex " + i3);
            return;
        }
        nativeUpdateChild(this.f65628b, i, i2, i3, j);
    }

    /* renamed from: a */
    public void mo94296a(LynxModuleManager lynxModuleManager, ExternalSourceLoader externalSourceLoader, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        long j = this.f65628b;
        ResourceLoader resourceLoader = new ResourceLoader();
        String l = m96181l();
        String[] m = m96182m();
        C26908k kVar = this.f65634h;
        if (kVar == null || !kVar.mo95717c()) {
            z3 = false;
        } else {
            z3 = true;
        }
        C26908k kVar2 = this.f65634h;
        if (kVar2 == null || !kVar2.mo95718d()) {
            z4 = false;
        } else {
            z4 = true;
        }
        nativeInitRuntime(j, resourceLoader, externalSourceLoader, lynxModuleManager, l, m, z3, z4, z2, z);
        this.f65631e = new JSProxy(this.f65628b, this.f65635i);
    }

    TemplateAssembler(PaintingContext paintingContext, LayoutContext layoutContext, DynamicComponentLoader dynamicComponentLoader, C26908k kVar, ThreadStrategyForRendering threadStrategyForRendering, boolean z, boolean z2) {
        int i;
        this.f65636j = paintingContext;
        this.f65637k = layoutContext;
        this.f65634h = kVar;
        this.f65640n = dynamicComponentLoader;
        DisplayMetrics a = layoutContext.mo94507a();
        DynamicComponentLoader dynamicComponentLoader2 = this.f65640n;
        if (threadStrategyForRendering == null) {
            i = ThreadStrategyForRendering.ALL_ON_UI.id();
        } else {
            i = threadStrategyForRendering.id();
        }
        this.f65628b = nativeCreate(paintingContext, layoutContext, dynamicComponentLoader2, i, z, a.widthPixels, a.heightPixels);
        this.f65633g = false;
        this.f65638l = z2;
    }
}
