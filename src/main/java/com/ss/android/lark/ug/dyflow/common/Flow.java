package com.ss.android.lark.ug.dyflow.common;

import android.net.Uri;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.attribution.C57347a;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.data.FlowContext;
import com.ss.android.lark.ug.dyflow.common.data.FlowData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.service.IDyFlowService;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 12\u00020\u0001:\u000212B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u001f\u001a\u00020\u00162\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\u001a\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010#\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0002J.\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00102\u001c\u0010,\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0014H\u0016J\u0018\u0010-\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0010H\u0016J\u0012\u0010/\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u00100\u001a\u00020\u0019H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a$\u0012\u0004\u0012\u00020\u0010\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00140\u000fX\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/Flow;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "flowSuiteId", "", "flowService", "Lcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;", "(JLcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;)V", "flowData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "flowStatus", "Lcom/ss/android/lark/ug/dyflow/common/Flow$FlowStatus;", "statusListenerList", "", "Lcom/ss/android/lark/ug/dyflow/common/IFlow$IFlowStatusListener;", "stepCreatorMap", "", "", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "addStatusListener", "", "listener", "checkUriValid", "", "uri", "getFlowContext", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "getStepData", "getUtmSource", "loadData", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "notifyComplete", "notifyExExit", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "stepId", "stepName", "parseStepId", "uriString", "register", "stepCreator", "reportStepEvent", "slotId", "runStep", "start", "Companion", "FlowStatus", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Flow implements IFlow {

    /* renamed from: c */
    public static final Companion f141380c = new Companion(null);

    /* renamed from: a */
    public FlowData f141381a;

    /* renamed from: b */
    public FlowStatus f141382b = FlowStatus.INIT;

    /* renamed from: d */
    private final Map<String, Function2<IFlow, FlowStepData, IFlowStep>> f141383d = new HashMap();

    /* renamed from: e */
    private final List<IFlow.IFlowStatusListener> f141384e = new ArrayList();

    /* renamed from: f */
    private final long f141385f;

    /* renamed from: g */
    private final IDyFlowService f141386g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/Flow$FlowStatus;", "", "value", "", "extra", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getValue", "()I", "INIT", "DATA_LOADING", "DATA_SUCCESS", "STEP_RUNNING", "COMPLETE", "DATA_ERROR", "EX_EXIT", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FlowStatus {
        INIT(0, null, 2, null),
        DATA_LOADING(1, null, 2, null),
        DATA_SUCCESS(2, null, 2, null),
        STEP_RUNNING(3, null, 2, null),
        COMPLETE(4, null, 2, null),
        DATA_ERROR(5, null, 2, null),
        EX_EXIT(6, null, 2, null);
        
        private String extra;
        private final int value;

        public final String getExtra() {
            return this.extra;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setExtra(String str) {
            this.extra = str;
        }

        private FlowStatus(int i, String str) {
            this.value = i;
            this.extra = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ FlowStatus(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/Flow$Companion;", "", "()V", "FLOW_URI_PREFIX_PATH", "", "TAG", "isCurrentFlowUri", "", "uri", "flowId", "", "isDyFlowUri", "parseUriPath", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.Flow$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final String m222630b(String str) {
            if (str == null) {
                return null;
            }
            try {
                Uri parse = Uri.parse(str);
                Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(uriString)");
                return parse.getPath();
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo194749a(String str) {
            String b = m222630b(str);
            if (b != null) {
                return StringsKt.startsWith$default(b, "/dynamicFlow", false, 2, (Object) null);
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo194750a(String str, long j) {
            String b = m222630b(str);
            if (b == null) {
                return false;
            }
            return StringsKt.startsWith$default(b, "/dynamicFlow/" + j, false, 2, (Object) null);
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: b */
    public FlowContext mo194743b() {
        FlowData bVar = this.f141381a;
        if (bVar != null) {
            return bVar.mo194877d();
        }
        return null;
    }

    /* renamed from: d */
    private final String m222617d() {
        FlowContext d;
        Map<String, String> a;
        FlowData bVar = this.f141381a;
        if (bVar == null || (d = bVar.mo194877d()) == null || (a = d.mo194855a()) == null) {
            return null;
        }
        return a.get("utm_source");
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: c */
    public void mo194745c() {
        Log.m165389i("DyFlow", "notifyComplete, flowId=" + this.f141385f + ", flowStatus=" + this.f141382b);
        this.f141382b = FlowStatus.COMPLETE;
        Iterator<T> it = this.f141384e.iterator();
        while (it.hasNext()) {
            it.next().mo194712a();
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: a */
    public boolean mo194741a() {
        String c;
        boolean z;
        Log.m165389i("DyFlow", "flowStart, enter");
        if (this.f141382b != FlowStatus.DATA_SUCCESS) {
            Log.m165389i("DyFlow", "flowStart, flowStatus invalid, is " + this.f141382b);
            return false;
        }
        String d = m222617d();
        C57347a.m222308a().mo194494c(d);
        Log.m165389i("DyFlow", "flowStart, utmSource=" + d);
        FlowData bVar = this.f141381a;
        if (!(bVar == null || (c = bVar.mo194876c()) == null)) {
            if (c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c = null;
            }
            if (c != null) {
                boolean a = mo194742a(c);
                Log.m165389i("DyFlow", "flowStart, runStep result=" + a);
                return a;
            }
        }
        Log.m165383e("DyFlow", "flowStart, rootStepUri is null");
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/common/Flow$loadData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.Flow$b */
    public static final class C57421b implements IGetDataCallback<FlowData> {

        /* renamed from: a */
        final /* synthetic */ Flow f141387a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f141388b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165390i("DyFlow", "loadData error", errorResult);
            IGetDataCallback iGetDataCallback = this.f141388b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            this.f141387a.f141382b = FlowStatus.DATA_ERROR;
        }

        /* renamed from: a */
        public void onSuccess(FlowData bVar) {
            if (bVar == null || !(!Intrinsics.areEqual(bVar, FlowData.f141445b.mo194878a()))) {
                Log.m165389i("DyFlow", "loadData success=false");
                IGetDataCallback iGetDataCallback = this.f141388b;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(false);
                }
                this.f141387a.f141382b = FlowStatus.DATA_ERROR;
                return;
            }
            Log.m165389i("DyFlow", "loadData success=true");
            this.f141387a.f141381a = bVar;
            this.f141387a.f141382b = FlowStatus.DATA_SUCCESS;
            IGetDataCallback iGetDataCallback2 = this.f141388b;
            if (iGetDataCallback2 != null) {
                iGetDataCallback2.onSuccess(true);
            }
        }

        C57421b(Flow flow, IGetDataCallback iGetDataCallback) {
            this.f141387a = flow;
            this.f141388b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public void mo194737a(IFlow.IFlowStatusListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (!this.f141384e.contains(aVar)) {
            this.f141384e.add(aVar);
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: b */
    public boolean mo194744b(String str) {
        return f141380c.mo194750a(str, this.f141385f);
    }

    /* renamed from: d */
    private final String m222618d(String str) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(uriString)");
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment != null) {
            return lastPathSegment;
        }
        return "";
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: a */
    public void mo194736a(IGetDataCallback<Boolean> iGetDataCallback) {
        if (this.f141382b == FlowStatus.INIT || this.f141382b == FlowStatus.DATA_ERROR) {
            this.f141382b = FlowStatus.DATA_LOADING;
            this.f141386g.mo194775a(this.f141385f, new C57421b(this, iGetDataCallback));
            return;
        }
        Log.m165389i("DyFlow", "flowStatus invalid, is " + this.f141382b);
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(false);
        }
    }

    /* renamed from: c */
    private final FlowStepData m222616c(String str) {
        boolean z;
        String str2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (this.f141382b == FlowStatus.DATA_SUCCESS || this.f141382b == FlowStatus.STEP_RUNNING) {
            FlowData bVar = this.f141381a;
            if (bVar != null) {
                if (str != null) {
                    boolean z2 = false;
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        String d = m222618d(str2);
                        if (d.length() == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            objectRef.element = (T) ("parseStepId, stepId is empty, uri=" + str + ", flowId=" + bVar.mo194869a() + ", flowStatus=" + this.f141382b);
                            Log.m165389i("DyFlow", (String) objectRef.element);
                            mo194735a(-1, objectRef.element);
                            return null;
                        }
                        FlowStepData c = bVar.mo194875c(d);
                        if (c != null) {
                            return c;
                        }
                        objectRef.element = (T) ("flowStepData is null, flowId=" + bVar.mo194869a() + ", flowStatus=" + this.f141382b);
                        Log.m165389i("DyFlow", (String) objectRef.element);
                        mo194735a(1, objectRef.element);
                        return null;
                    }
                }
                objectRef.element = (T) ("uri is invalid, uri=" + str + ", flowStatus=" + this.f141382b);
                Log.m165389i("DyFlow", (String) objectRef.element);
                return null;
            }
            objectRef.element = (T) ("flowData is null, uri=" + str + ", flowStatus=" + this.f141382b);
            Log.m165389i("DyFlow", (String) objectRef.element);
            return null;
        }
        objectRef.element = (T) ("flowStatus invalid, is " + this.f141382b);
        Log.m165389i("DyFlow", (String) objectRef.element);
        return null;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: a */
    public boolean mo194742a(String str) {
        boolean z;
        boolean z2;
        Log.m165389i("DyFlow", "runStep, enter, uri=" + str);
        if (!mo194744b(str)) {
            if (f141380c.mo194749a(str)) {
                return false;
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    Log.m165389i("DyFlow", "runStep, openRouterUri, uri=" + str);
                    C57345a.m222261a().mo194669b(str);
                    return true;
                } catch (Exception e) {
                    Log.m165384e("DyFlow", "runStep, openRouterUri error", e);
                }
            }
            return false;
        } else if (this.f141382b == FlowStatus.DATA_SUCCESS || this.f141382b == FlowStatus.STEP_RUNNING) {
            FlowStepData c = m222616c(str);
            if (c != null) {
                if (c.mo194842e()) {
                    Log.m165389i("DyFlow", "runStep, stepData has consumed, uri=" + str + ", flowId=" + c.mo194828a() + ", stepName=" + c.mo194837c());
                    return false;
                }
                c.mo194833a(true);
                String c2 = c.mo194837c();
                if (c2 != null) {
                    if (c2.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        c2 = null;
                    }
                    if (c2 != null) {
                        Function2<IFlow, FlowStepData, IFlowStep> kVar = this.f141383d.get(c2);
                        if (kVar != null) {
                            IFlowStep invoke = kVar.invoke(this, c);
                            if (invoke.mo194765b()) {
                                String str3 = "uri=" + str + ", stepId=" + c.mo194834b() + ", stepName=" + c.mo194837c() + ", flowId=" + c.mo194828a();
                                Log.m165389i("DyFlow", "runStep, step onExec begin, " + str3);
                                invoke.mo194919f();
                                Log.m165389i("DyFlow", "runStep, step onExec end, " + str3);
                                FlowStatus flowStatus = FlowStatus.STEP_RUNNING;
                                flowStatus.setExtra(c2);
                                this.f141382b = flowStatus;
                                return true;
                            }
                            String str4 = "runStep, step data is invalid, uri=" + str + ", flowId=" + c.mo194828a() + ", stepName=" + c.mo194837c();
                            Log.m165389i("DyFlow", str4);
                            mo194739a(c.mo194834b(), c.mo194837c(), 2, str4);
                            return false;
                        }
                        Log.m165389i("DyFlow", "runStep, StepCreator not found, uri=" + str + ", flowId=" + c.mo194828a() + ", stepName=" + c.mo194837c());
                        return false;
                    }
                }
                Log.m165389i("DyFlow", "runStep, stepName is null, uri=" + str + ", flowId=" + c.mo194828a());
            }
            return false;
        } else {
            Log.m165389i("DyFlow", "runStep, flowStatus invalid, is " + this.f141382b);
            return false;
        }
    }

    /* renamed from: a */
    public void mo194735a(int i, String str) {
        mo194739a(null, null, i, str);
    }

    /* renamed from: a */
    public void mo194740a(String str, Function2<? super IFlow, ? super FlowStepData, ? extends IFlowStep> kVar) {
        Intrinsics.checkParameterIsNotNull(str, "stepName");
        Intrinsics.checkParameterIsNotNull(kVar, "stepCreator");
        this.f141383d.put(str, kVar);
    }

    public Flow(long j, IDyFlowService cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "flowService");
        this.f141385f = j;
        this.f141386g = cVar;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: a */
    public void mo194738a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "stepId");
        Intrinsics.checkParameterIsNotNull(str2, "slotId");
        this.f141386g.mo194776a(this.f141385f, str, str2);
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlow
    /* renamed from: a */
    public void mo194739a(String str, String str2, int i, String str3) {
        Log.m165389i("DyFlow", "notifyExExit, flowI=" + this.f141385f + ", stepId=" + str + ", stepName=" + str2 + ", errCode=" + i + ", errMsg=" + str3);
        if (this.f141382b == FlowStatus.DATA_SUCCESS || this.f141382b == FlowStatus.STEP_RUNNING) {
            this.f141382b = FlowStatus.EX_EXIT;
            long j = this.f141385f;
            UGApm.DyFlow.f141198a.mo194474a(i, str3, String.valueOf(j), str, str2);
            OnBoardingAppreciable.f141195a.mo194463a(i, str3, String.valueOf(j), str, str2);
            Iterator<T> it = this.f141384e.iterator();
            while (it.hasNext()) {
                it.next().mo194713b();
            }
        }
    }
}
