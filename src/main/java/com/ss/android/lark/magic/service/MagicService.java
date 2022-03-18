package com.ss.android.lark.magic.service;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.an;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.applogbridge.p1367a.AbstractC29201c;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.magic.IMagicLifecycleListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.magic.entity.MagicScenarioRelation;
import com.ss.android.lark.magic.provider.IMagicProvider;
import com.ss.android.lark.magic.provider.IOpener;
import com.ss.android.lark.magic.provider.ITrigger;
import com.ss.android.lark.magic.provider.MagicProviderFactory;
import com.ss.android.lark.magic.provider.TriggerResponse;
import com.ss.android.lark.magic.settings.UGMagicConfigHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u000234B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010$J \u0010%\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\b\u0010 \u001a\u0004\u0018\u00010!J.\u0010(\u001a\u00020)2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,\u0018\u00010+H\u0002J,\u0010-\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100+H\u0002J\u000e\u0010/\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0010J\u000e\u00100\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0010J\u000e\u00101\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0010J\u0010\u00102\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/magic/service/MagicService;", "Lcom/ss/android/lark/magic/provider/ITrigger$ITriggerCallback;", "()V", "externalOpener", "Lcom/ss/android/lark/magic/provider/IOpener;", "handler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "logEventObserver", "Lcom/ss/android/lark/magic/service/MagicService$LogEventObserver;", "mainHandler", "provider", "Lcom/ss/android/lark/magic/provider/IMagicProvider;", "scenarioIdList", "", "", "scenarioRelationSparseArray", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/magic/entity/MagicScenarioRelation;", "destroy", "", "init", "onEventV3", "event", "params", "Lorg/json/JSONObject;", "onTriggerResponse", "triggerResponse", "Lcom/ss/android/lark/magic/provider/TriggerResponse;", "registerInterceptor", "scenarioId", "interceptor", "Lcom/ss/android/lark/biz/core/api/IMagicInterceptor;", "registerLifecycle", "lifecycleListener", "Lcom/ss/android/lark/biz/core/api/magic/IMagicLifecycleListener;", "registerScenario", "viewContainer", "Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "shouldNotTrigger", "", "filterMap", "", "", "startTrigger", "triggerParams", "unregisterInterceptor", "unregisterLifecycle", "unregisterScenario", "validateScenario", "Companion", "LogEventObserver", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.e.c */
public final class MagicService implements ITrigger.ITriggerCallback {

    /* renamed from: g */
    public static final MagicService f105966g = new MagicService();

    /* renamed from: h */
    public static final Companion f105967h = new Companion(null);

    /* renamed from: a */
    public IMagicProvider f105968a;

    /* renamed from: b */
    public final List<String> f105969b = new ArrayList();

    /* renamed from: c */
    public final SparseArray<MagicScenarioRelation> f105970c = new SparseArray<>(16);

    /* renamed from: d */
    public final Handler f105971d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final Handler f105972e;

    /* renamed from: f */
    public final IOpener f105973f;

    /* renamed from: i */
    private final LogEventObserver f105974i = new LogEventObserver(this);

    /* renamed from: j */
    private final HandlerThread f105975j;

    @JvmStatic
    /* renamed from: b */
    public static final MagicService m165661b() {
        return f105967h.mo150068a();
    }

    /* renamed from: c */
    public static HandlerThread m165662c(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/magic/service/MagicService$Companion;", "", "()V", "TAG", "", "sService", "Lcom/ss/android/lark/magic/service/MagicService;", "inst", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.e.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final MagicService mo150068a() {
            return MagicService.f105966g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/magic/service/MagicService$LogEventObserver;", "Lcom/ss/android/lark/applogbridge/listener/IEventListener;", "magicService", "Lcom/ss/android/lark/magic/service/MagicService;", "(Lcom/ss/android/lark/magic/service/MagicService;)V", "getMagicService", "()Lcom/ss/android/lark/magic/service/MagicService;", "onEventV3", "", "event", "", "params", "Lorg/json/JSONObject;", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.e.c$b */
    public static final class LogEventObserver implements AbstractC29201c {

        /* renamed from: a */
        private final MagicService f105976a;

        /* renamed from: a */
        public final MagicService mo150069a() {
            return this.f105976a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.magic.e.c$b$a */
        static final class RunnableC41718a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ LogEventObserver f105977a;

            /* renamed from: b */
            final /* synthetic */ String f105978b;

            /* renamed from: c */
            final /* synthetic */ JSONObject f105979c;

            RunnableC41718a(LogEventObserver bVar, String str, JSONObject jSONObject) {
                this.f105977a = bVar;
                this.f105978b = str;
                this.f105979c = jSONObject;
            }

            public final void run() {
                this.f105977a.mo150069a().mo150065a(this.f105978b, this.f105979c);
            }
        }

        public LogEventObserver(MagicService cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "magicService");
            this.f105976a = cVar;
        }

        @Override // com.ss.android.lark.applogbridge.p1367a.AbstractC29201c
        /* renamed from: a */
        public void mo103494a(String str, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            this.f105976a.f105972e.post(new RunnableC41718a(this, str, jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo150061a() {
        AppLogProxy.addEventListener(this.f105974i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.e.c$c */
    static final class RunnableC41719c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MagicService f105980a;

        /* renamed from: b */
        final /* synthetic */ TriggerResponse f105981b;

        RunnableC41719c(MagicService cVar, TriggerResponse eVar) {
            this.f105980a = cVar;
            this.f105981b = eVar;
        }

        public final void run() {
            if (this.f105980a.f105973f.mo150025a(this.f105981b)) {
                Log.m165389i("MagicService", "externalOpener showMagic.");
            } else if (!this.f105980a.mo150067b(this.f105981b)) {
                Log.m165389i("MagicService", "validateScenario false.");
            } else {
                this.f105980a.f105971d.post(new Runnable(this) {
                    /* class com.ss.android.lark.magic.service.MagicService.RunnableC41719c.RunnableC417201 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC41719c f105982a;

                    {
                        this.f105982a = r1;
                    }

                    public final void run() {
                        IMagicProvider aVar = this.f105982a.f105980a.f105968a;
                        if (aVar != null) {
                            aVar.mo150025a(this.f105982a.f105981b);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.e.c$d */
    public static final class RunnableC41721d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MagicService f105983a;

        /* renamed from: b */
        final /* synthetic */ String f105984b;

        /* renamed from: c */
        final /* synthetic */ MagicViewContainer f105985c;

        RunnableC41721d(MagicService cVar, String str, MagicViewContainer awVar) {
            this.f105983a = cVar;
            this.f105984b = str;
            this.f105985c = awVar;
        }

        public final void run() {
            int indexOf = this.f105983a.f105969b.indexOf(this.f105984b);
            if (indexOf < 0) {
                this.f105983a.f105969b.add(this.f105984b);
                indexOf = this.f105983a.f105969b.size() - 1;
            }
            this.f105983a.f105970c.put(indexOf, new MagicScenarioRelation(this.f105984b, this.f105985c));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.e.c$e */
    public static final class RunnableC41722e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MagicService f105986a;

        /* renamed from: b */
        final /* synthetic */ String f105987b;

        RunnableC41722e(MagicService cVar, String str) {
            this.f105986a = cVar;
            this.f105987b = str;
        }

        public final void run() {
            int indexOf = this.f105986a.f105969b.indexOf(this.f105987b);
            if (indexOf >= 0) {
                this.f105986a.f105971d.post(new Runnable(this) {
                    /* class com.ss.android.lark.magic.service.MagicService.RunnableC41722e.RunnableC417231 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC41722e f105988a;

                    {
                        this.f105988a = r1;
                    }

                    public final void run() {
                        IMagicProvider aVar = this.f105988a.f105986a.f105968a;
                        if (aVar != null) {
                            aVar.mo150022a(this.f105988a.f105987b);
                        }
                    }
                });
                this.f105986a.f105970c.remove(indexOf);
                this.f105986a.f105969b.remove(indexOf);
                MagicLifecycleService.f105961b.mo150060a().mo150056b(this.f105987b);
            }
        }
    }

    private MagicService() {
        HandlerThread c = m165662c("MagicService");
        this.f105975j = c;
        this.f105973f = MagicProviderFactory.f105951a.mo150034b();
        Log.m165379d("MagicService", "init");
        c.start();
        this.f105972e = new Handler(c.getLooper());
        this.f105968a = MagicProviderFactory.f105951a.mo150033a();
    }

    /* renamed from: b */
    public final void mo150066b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        MagicLifecycleService.f105961b.mo150060a().mo150047a(str);
    }

    @Override // com.ss.android.lark.magic.provider.ITrigger.ITriggerCallback
    /* renamed from: a */
    public void mo150032a(TriggerResponse eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "triggerResponse");
        this.f105972e.post(new RunnableC41719c(this, eVar));
    }

    /* renamed from: b */
    public final boolean mo150067b(TriggerResponse eVar) {
        MagicScenarioRelation aVar;
        int size = this.f105969b.size() - 1;
        if (size < 0 || (aVar = this.f105970c.get(size)) == null || !TextUtils.equals(eVar.mo150043e(), aVar.mo150016a())) {
            return false;
        }
        eVar.mo150035a(aVar.mo150017b());
        return true;
    }

    /* renamed from: a */
    public final void mo150062a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        this.f105972e.post(new RunnableC41722e(this, str));
    }

    /* renamed from: a */
    public final void mo150064a(String str, IMagicLifecycleListener bVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        MagicLifecycleService.f105961b.mo150060a().mo150048a(str, bVar);
    }

    /* renamed from: a */
    private final boolean m165660a(JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        if (!CollectionUtils.isNotEmpty(map) || jSONObject == null || jSONObject.length() <= 0) {
            return false;
        }
        if (map == null) {
            Intrinsics.throwNpe();
        }
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                String optString = jSONObject.optString(key);
                if (!list.contains(optString)) {
                    Log.m165389i("MagicService", "shouldNotTrigger. key: " + key + ", " + list + " not contain " + optString);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo150065a(String str, JSONObject jSONObject) {
        String str2;
        Set<String> set;
        Map<String, Map<String, List<String>>> a = UGMagicConfigHolder.f105989a.mo150089a();
        if (!CollectionUtils.isEmpty(a) && a.containsKey(str)) {
            Log.m165389i("MagicService", "event = " + str + ", params = " + jSONObject);
            Map<String, List<String>> map = a.get(str);
            if (!m165660a(jSONObject, map)) {
                ArrayMap arrayMap = new ArrayMap();
                if (jSONObject != null && jSONObject.length() > 0) {
                    if (map != null) {
                        set = map.keySet();
                    } else {
                        set = null;
                    }
                    if (set != null) {
                        for (T t : set) {
                            String optString = jSONObject.optString(t);
                            Intrinsics.checkExpressionValueIsNotNull(optString, "params.optString(it)");
                            arrayMap.put(t, optString);
                        }
                    }
                }
                String str3 = "";
                if (CollectionUtils.isNotEmpty(this.f105969b) && (str2 = this.f105969b.get(this.f105969b.size() - 1)) != null) {
                    str3 = str2;
                }
                m165659a(str3, str, arrayMap);
            }
        }
    }

    /* renamed from: a */
    private final void m165659a(String str, String str2, Map<String, String> map) {
        String a = an.m95036a((short) 16);
        IMagicProvider aVar = this.f105968a;
        if (aVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(a, "uniqueTag");
            aVar.mo150024a(a, str, str2, map, this);
        }
    }

    /* renamed from: a */
    public final void mo150063a(String str, MagicViewContainer awVar, AbstractC29588w wVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(awVar, "viewContainer");
        this.f105972e.post(new RunnableC41721d(this, str, awVar));
        MagicLifecycleService.f105961b.mo150060a().mo150049a(str, wVar);
    }
}
