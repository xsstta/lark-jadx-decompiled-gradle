package com.ss.android.lark.ug.integrator;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.ugreach.v1.DeleteUGReachPointCacheRequest;
import com.bytedance.lark.pb.ugreach.v1.DeleteUGReachPointCacheResponse;
import com.bytedance.lark.pb.ugreach.v1.GetUGLocalRuleRequest;
import com.bytedance.lark.pb.ugreach.v1.GetUGLocalRuleResponse;
import com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsRequest;
import com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsResponse;
import com.bytedance.lark.pb.ugreach.v1.GetUGScenarioCacheRequest;
import com.bytedance.lark.pb.ugreach.v1.GetUGScenarioCacheResponse;
import com.bytedance.lark.pb.ugreach.v1.GetUGScenarioRequest;
import com.bytedance.lark.pb.ugreach.v1.GetUGScenarioResponse;
import com.bytedance.lark.pb.ugreach.v1.LocalRule;
import com.bytedance.lark.pb.ugreach.v1.PushUGScenarioInfo;
import com.bytedance.lark.pb.ugreach.v1.ReachPointConfig;
import com.bytedance.lark.pb.ugreach.v1.ReachPointEntity;
import com.bytedance.lark.pb.ugreach.v1.ReachPointMaterial;
import com.bytedance.lark.pb.ugreach.v1.ScenarioContext;
import com.bytedance.lark.pb.ugreach.v1.ScenarioContextCache;
import com.bytedance.lark.pb.ugreach.v1.UploadUGEventRequest;
import com.bytedance.lark.pb.ugreach.v1.UploadUGEventResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.ug.common.ApmUtils;
import com.ss.android.lark.ug.facade.UgReachSdk;
import com.ss.android.lark.ug.facade.bean.BizContextProvider;
import com.ss.android.lark.ug.plugin.C57533c;
import com.ss.android.lark.ug.plugin.ContainerServiceDependency;
import com.ss.android.lark.ug.plugin.ReachPoint;
import com.ss.android.lark.ug.plugin.ReachPointContainerService;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import com.ss.android.lark.ug.scheduler.common.C57537a;
import com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback;
import com.ss.android.lark.ug.scheduler.common.api.SchedulerService;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000µ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J \u0010!\u001a\u00020\u001c2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00050#j\b\u0012\u0004\u0012\u00020\u0005`$H\u0002J\u0006\u0010%\u001a\u00020\u001cJ\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010(\u001a\u0004\u0018\u00010\u0017J\u001e\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0002J;\u0010/\u001a\u0004\u0018\u0001H0\"\f\b\u0000\u00100*\u0006\u0012\u0002\b\u0003012\u0006\u00102\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u0002H0042\b\u00105\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u00106J \u00107\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\nH\u0002JA\u0010;\u001a\u00020\u001c\"\u000e\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H<01\"\u001c\b\u0001\u0010<*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030=j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`>2\u0006\u0010?\u001a\u0002H0¢\u0006\u0002\u0010@J \u0010A\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0015H\u0002J\u0016\u0010C\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u00020\u001cJ\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020I2\b\u00105\u001a\u0004\u0018\u00010\u0015J\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0015J(\u0010J\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020L2\u0006\u0010*\u001a\u00020\u00132\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010NH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0011X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/lark/ug/integrator/UgReachSdkIntegrator;", "", "()V", "DEFAULT_UPLOAD_EVENTS", "", "", "TAG", "exposeBuffer", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isUgSdkSettingsReady", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onSchedulerCallback", "com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$onSchedulerCallback$1", "Lcom/ss/android/lark/ug/integrator/UgReachSdkIntegrator$onSchedulerCallback$1;", "readyRpIds", "Ljava/util/concurrent/CopyOnWriteArraySet;", "rpId2Sid", "Ljava/util/concurrent/ConcurrentHashMap;", "rpidScenarioContextCachedMap", "Lcom/bytedance/lark/pb/ugreach/v1/ScenarioContext;", "scenarioIdBizContextProvider", "Lcom/ss/android/lark/ug/facade/bean/BizContextProvider;", "storage", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGSDKSettingsResponse$SDKInnerStrategy;", "unreadyRpMap", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "uploadEvents", "appendBizContextIfNeeded", "", "scenarioId", "requestBuilder", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioRequest$Builder;", "consumeExposeBuffer", "deleteRpids", "expiredRpids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "destroy", "expose", "exposeReal", "getInnerStrategy", "getScenarioContextWithEntities", "scenarioContext", "entities", "getUGScenarioRequest", "scenarioInfo", "Lcom/bytedance/lark/pb/ugreach/v1/PushUGScenarioInfo;", "obtainReachPointById", "RP", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "reachPointId", "reachPointClazz", "Ljava/lang/Class;", "provider", "(Ljava/lang/String;Ljava/lang/Class;Lcom/ss/android/lark/ug/facade/bean/BizContextProvider;)Lcom/ss/android/lark/ug/plugin/ReachPoint;", "processScenarioInfoCache", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioCacheResponse;", "isGetNetResponse", "recycleReachPoint", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "reachPoint", "(Lcom/ss/android/lark/ug/plugin/ReachPoint;)V", "registerBizContextProvider", "rpId", "scenarioEnter", "isRemote", "", "setup", "tryExpose", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "uploadEvent", "params", "Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.f.a */
public final class UgReachSdkIntegrator {

    /* renamed from: a */
    public static final UgReachSdkIntegrator f141653a = new UgReachSdkIntegrator();

    /* renamed from: b */
    private static final List<String> f141654b = CollectionsKt.listOf((Object[]) new String[]{"onClick", "didShow", "didHide", "consume"});

    /* renamed from: c */
    private static GetUGSDKSettingsResponse.SDKInnerStrategy f141655c;

    /* renamed from: d */
    private static AtomicBoolean f141656d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final CopyOnWriteArrayList<String> f141657e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, ScenarioContext> f141658f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static final ConcurrentHashMap<String, ConcurrentHashMap<String, BizContextProvider>> f141659g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static final ConcurrentHashMap<String, String> f141660h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final CopyOnWriteArraySet<String> f141661i = new CopyOnWriteArraySet<>();

    /* renamed from: j */
    private static final ConcurrentHashMap<String, ReachPointEntity> f141662j = new ConcurrentHashMap<>();

    /* renamed from: k */
    private static List<String> f141663k = CollectionsKt.emptyList();

    /* renamed from: l */
    private static final C57493i f141664l = new C57493i();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$deleteRpids$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/DeleteUGReachPointCacheResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$a */
    public static final class C57485a implements IGetDataCallback<DeleteUGReachPointCacheResponse> {
        C57485a() {
        }

        /* renamed from: a */
        public void onSuccess(DeleteUGReachPointCacheResponse deleteUGReachPointCacheResponse) {
            Intrinsics.checkParameterIsNotNull(deleteUGReachPointCacheResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "deleteRpids: DELETE_UG_REACH_POINT_CACHE -> " + deleteUGReachPointCacheResponse);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "deleteRpids: DELETE_UG_REACH_POINT_CACHE -> " + errorResult.getDebugMsg());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$deleteRpids$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/DeleteUGReachPointCacheResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$b */
    public static final class C57486b implements SdkSender.IParser<DeleteUGReachPointCacheResponse> {
        C57486b() {
        }

        /* renamed from: a */
        public DeleteUGReachPointCacheResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            DeleteUGReachPointCacheResponse decode = DeleteUGReachPointCacheResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$exposeReal$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioCacheResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$d */
    public static final class C57488d implements SdkSender.IParser<GetUGScenarioCacheResponse> {
        C57488d() {
        }

        /* renamed from: a */
        public GetUGScenarioCacheResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GetUGScenarioCacheResponse decode = GetUGScenarioCacheResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$exposeReal$4", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$f */
    public static final class C57490f implements SdkSender.IParser<GetUGScenarioResponse> {
        C57490f() {
        }

        /* renamed from: a */
        public GetUGScenarioResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GetUGScenarioResponse decode = GetUGScenarioResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$getUGScenarioRequest$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$g */
    public static final class C57491g implements IGetDataCallback<GetUGScenarioResponse> {
        C57491g() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "uploadEvent: GET_UG_SCENARIO -> " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(GetUGScenarioResponse getUGScenarioResponse) {
            Intrinsics.checkParameterIsNotNull(getUGScenarioResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "uploadEvent: GET_UG_SCENARIO -> " + getUGScenarioResponse);
            ScenarioContext scenarioContext = getUGScenarioResponse.scenario_context;
            if (scenarioContext != null) {
                UgReachSdkIntegrator aVar = UgReachSdkIntegrator.f141653a;
                Intrinsics.checkExpressionValueIsNotNull(scenarioContext, "it");
                aVar.mo195125a(scenarioContext, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$getUGScenarioRequest$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$h */
    public static final class C57492h implements SdkSender.IParser<GetUGScenarioResponse> {
        C57492h() {
        }

        /* renamed from: a */
        public GetUGScenarioResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GetUGScenarioResponse decode = GetUGScenarioResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$onSchedulerCallback$1", "Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;", "onHide", "", "reachPointEntities", "", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "onShow", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$i */
    public static final class C57493i implements OnSchedulerCallback {
        C57493i() {
        }

        @Override // com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback
        /* renamed from: b */
        public void mo195146b(Collection<ReachPointEntity> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "reachPointEntities");
            for (T t : collection) {
                ReachPointContainerService a = C57533c.m223351a(ReachPointContainerService.f141766a);
                String str = t.reach_point_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.reach_point_id");
                String str2 = t.type;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.type");
                a.mo195236a(str, str2);
            }
        }

        @Override // com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback
        /* renamed from: a */
        public void mo195145a(Collection<ReachPointEntity> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "reachPointEntities");
            for (T t : collection) {
                if (t.material.isEmpty()) {
                    Log.m165383e("UgReach", "materials is empty");
                    return;
                }
                ReachPointMaterial reachPointMaterial = t.material.get(0);
                if (reachPointMaterial == null) {
                    Log.m165397w("UgReach", "reachPointMaterial is null");
                    return;
                }
                ReachPointContainerService a = C57533c.m223351a(ReachPointContainerService.f141766a);
                String str = t.reach_point_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.reach_point_id");
                String str2 = t.type;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.type");
                byte[] byteArray = reachPointMaterial.material.toByteArray();
                Intrinsics.checkExpressionValueIsNotNull(byteArray, "reachPointMaterial.material.toByteArray()");
                a.mo195257a(str, str2, byteArray);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$setup$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGSDKSettingsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$j */
    public static final class C57494j implements IGetDataCallback<GetUGSDKSettingsResponse> {
        C57494j() {
        }

        /* renamed from: a */
        public void onSuccess(GetUGSDKSettingsResponse getUGSDKSettingsResponse) {
            Intrinsics.checkParameterIsNotNull(getUGSDKSettingsResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "setup: GET_UG_SDK_SETTINGS -> " + getUGSDKSettingsResponse);
            UgReachSdkIntegrator aVar = UgReachSdkIntegrator.f141653a;
            UgReachSdkIntegrator.f141656d.set(true);
            UgReachSdkIntegrator aVar2 = UgReachSdkIntegrator.f141653a;
            UgReachSdkIntegrator.f141655c = getUGSDKSettingsResponse.sdk_strategy;
            UgReachSdkIntegrator aVar3 = UgReachSdkIntegrator.f141653a;
            List<String> list = getUGSDKSettingsResponse.event_names;
            Intrinsics.checkExpressionValueIsNotNull(list, "data.event_names");
            UgReachSdkIntegrator.f141663k = list;
            UgReachSdkIntegrator.f141653a.mo195133b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "setup: GET_UG_SDK_SETTINGS -> " + errorResult.getDebugMsg());
            UgReachSdkIntegrator aVar = UgReachSdkIntegrator.f141653a;
            UgReachSdkIntegrator aVar2 = UgReachSdkIntegrator.f141653a;
            UgReachSdkIntegrator.f141663k = UgReachSdkIntegrator.f141654b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$setup$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGSDKSettingsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$k */
    public static final class C57495k implements SdkSender.IParser<GetUGSDKSettingsResponse> {
        C57495k() {
        }

        /* renamed from: a */
        public GetUGSDKSettingsResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GetUGSDKSettingsResponse decode = GetUGSDKSettingsResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$tryExpose$3", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGLocalRuleResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$m */
    public static final class C57497m implements SdkSender.IParser<GetUGLocalRuleResponse> {
        C57497m() {
        }

        /* renamed from: a */
        public GetUGLocalRuleResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GetUGLocalRuleResponse decode = GetUGLocalRuleResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetUGLocalRuleResponse.ADAPTER.decode(data)");
            return decode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$uploadEvent$5", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/ugreach/v1/UploadUGEventResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$o */
    public static final class C57499o implements SdkSender.IParser<UploadUGEventResponse> {
        C57499o() {
        }

        /* renamed from: a */
        public UploadUGEventResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            UploadUGEventResponse decode = UploadUGEventResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return decode;
        }
    }

    private UgReachSdkIntegrator() {
    }

    /* renamed from: a */
    public final void mo195126a(ReachPointEvent aVar, ScenarioContext scenarioContext, IGetDataCallback<Boolean> iGetDataCallback) {
        UploadUGEventRequest.C19807a aVar2 = new UploadUGEventRequest.C19807a();
        aVar2.mo67039a(scenarioContext.scenario_id);
        MaterialBase c = aVar.mo195239c();
        if (c != null) {
            aVar2.mo67043c(c.mkey);
        }
        LocalRule localRule = scenarioContext.local_rule;
        if (localRule != null) {
            aVar2.mo67038a(localRule.rule_id);
        }
        aVar2.mo67042b(aVar.mo195237a());
        aVar2.mo67044d(aVar.mo195238b().mo195244a());
        Map<String, String> d = aVar.mo195240d();
        if (d != null) {
            aVar2.mo67040a(d);
        }
        SdkSender.asynSendRequestNonWrap(Command.UPLOAD_UG_EVENT, aVar2, new ApmUtils.GetDataCallback(new C57498n(iGetDataCallback), "ug_reach_upload_event", null, 4, null), new C57499o());
    }

    /* renamed from: a */
    public final <RP extends ReachPoint<DATA>, DATA extends Message<?, ?>> void mo195127a(RP rp) {
        Intrinsics.checkParameterIsNotNull(rp, "reachPoint");
        ConcurrentHashMap<String, String> concurrentHashMap = f141660h;
        String str = concurrentHashMap.get(rp.mo195214h());
        if (str != null) {
            ConcurrentHashMap<String, BizContextProvider> concurrentHashMap2 = f141659g.get(str);
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.remove(rp.mo195214h());
            }
            concurrentHashMap.remove(rp.mo195214h());
        }
        C57533c.m223351a(ReachPointContainerService.f141766a).mo195256a(rp);
    }

    /* renamed from: a */
    public final void mo195131a(String str, BizContextProvider aVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        mo195128a(new ReachPointAction(str, "", null, 4, null), aVar);
    }

    /* renamed from: a */
    public final void mo195128a(ReachPointAction aVar, BizContextProvider aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        GetUGLocalRuleRequest.C19769a aVar3 = new GetUGLocalRuleRequest.C19769a();
        String a = aVar.mo195280a();
        aVar3.mo66950a(a);
        if (aVar2 != null) {
            f141653a.m223141a(aVar2.mo130965b(), "", aVar2);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_UG_LOCAL_RULE, aVar3, new C57496l(aVar, a), new C57497m());
    }

    /* renamed from: a */
    public final void mo195130a(String str, GetUGScenarioCacheResponse getUGScenarioCacheResponse, AtomicBoolean atomicBoolean) {
        ScenarioContextCache scenarioContextCache = getUGScenarioCacheResponse.scenario_cache;
        if (scenarioContextCache != null) {
            Intrinsics.checkExpressionValueIsNotNull(scenarioContextCache, "data.scenario_cache ?: return");
            ScenarioContext scenarioContext = scenarioContextCache.meta;
            if (scenarioContext != null) {
                Intrinsics.checkExpressionValueIsNotNull(scenarioContext, "scenarioCache.meta ?: return");
                if (!scenarioContext.entities.isEmpty()) {
                    Map<String, Long> map = scenarioContextCache.rpid2update_time;
                    ArrayList arrayList = new ArrayList();
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    long ntpTime = SdkSender.getNtpTime();
                    for (ReachPointEntity reachPointEntity : scenarioContext.entities) {
                        ReachPointConfig reachPointConfig = reachPointEntity.config;
                        Long l = reachPointConfig != null ? reachPointConfig.cache_period : null;
                        if (l == null) {
                            Log.m165389i("UgReach", reachPointEntity + " #cachePeriod is null");
                        } else {
                            Long l2 = map.get(reachPointEntity.reach_point_id);
                            if (l2 == null) {
                                Log.m165389i("UgReach", map + " #" + reachPointEntity.reach_point_id + " is null");
                            } else if (ntpTime - l2.longValue() < l.longValue()) {
                                arrayList.add(reachPointEntity);
                            } else {
                                arrayList2.add(reachPointEntity.reach_point_id);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ScenarioContext.C19803a aVar = new ScenarioContext.C19803a();
                        aVar.mo67027a(scenarioContext.scenario_id);
                        aVar.mo67025a(scenarioContext.local_rule);
                        aVar.mo67026a(scenarioContext.priority);
                        aVar.mo67028a(scenarioContext.share_scenario_ids);
                        aVar.mo67030b(arrayList);
                        if (!atomicBoolean.get()) {
                            ScenarioContext a = aVar.build();
                            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
                            mo195125a(a, false);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        mo195132a(arrayList2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo195132a(ArrayList<String> arrayList) {
        DeleteUGReachPointCacheRequest.C19765a aVar = new DeleteUGReachPointCacheRequest.C19765a();
        aVar.mo66941a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.DELETE_UG_REACH_POINT_CACHE, aVar, new C57485a(), new C57486b());
    }

    /* renamed from: a */
    public final void mo195125a(ScenarioContext scenarioContext, boolean z) {
        Intrinsics.checkParameterIsNotNull(scenarioContext, "scenarioContext");
        Log.m165379d("UgReach", "scenarioEnter() called isRemote = " + z);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ReachPointEntity reachPointEntity : scenarioContext.entities) {
            if (f141661i.contains(reachPointEntity.reach_point_id)) {
                List<ReachPointMaterial> list = reachPointEntity.material;
                Intrinsics.checkExpressionValueIsNotNull(list, "entity.material");
                if (!list.isEmpty()) {
                    arrayList.add(reachPointEntity);
                } else {
                    arrayList2.add(reachPointEntity.reach_point_id);
                    ReachPointContainerService a = C57533c.m223351a(ReachPointContainerService.f141766a);
                    String str = reachPointEntity.reach_point_id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "entity.reach_point_id");
                    String str2 = reachPointEntity.type;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "entity.type");
                    a.mo195236a(str, str2);
                }
                f141662j.remove(reachPointEntity.reach_point_id);
            } else {
                String str3 = reachPointEntity.reach_point_id;
                Intrinsics.checkExpressionValueIsNotNull(str3, "entity.reach_point_id");
                Intrinsics.checkExpressionValueIsNotNull(reachPointEntity, "entity");
                f141662j.put(str3, reachPointEntity);
            }
            String str4 = reachPointEntity.reach_point_id;
            Intrinsics.checkExpressionValueIsNotNull(str4, "entity.reach_point_id");
            f141658f.put(str4, m223136a(scenarioContext, CollectionsKt.listOf(reachPointEntity)));
        }
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            C57537a.m223390a(SchedulerService.f141770a).mo195267a(ReachPointState.REMOVE, arrayList3);
            Log.m165383e("UgReach", "scenarioEnter: without material -> " + arrayList2);
        }
        if (!arrayList.isEmpty()) {
            C57537a.m223390a(SchedulerService.f141770a).mo195265a(m223136a(scenarioContext, arrayList));
            Log.m165383e("UgReach", "scenarioEnter: with material -> " + arrayList);
        }
    }

    /* renamed from: b */
    public final void mo195133b() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f141657e;
        if (!copyOnWriteArrayList.isEmpty()) {
            Iterator<String> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "scenarioId");
                m223143b(next);
            }
            f141657e.clear();
        }
    }

    static {
        C57533c.m223351a(ReachPointContainerService.f141766a).mo195255a(new ContainerServiceDependency() {
            /* class com.ss.android.lark.ug.integrator.UgReachSdkIntegrator.C574831 */

            @Override // com.ss.android.lark.ug.plugin.ContainerServiceDependency
            /* renamed from: a */
            public void mo195136a(String str) {
                UgReachSdk.UgSdkDependency dependency$ug_reach_sdk_release = UgReachSdk.INSTANCE.getDependency$ug_reach_sdk_release();
                if (dependency$ug_reach_sdk_release != null) {
                    dependency$ug_reach_sdk_release.mo103094a(str);
                }
            }

            @Override // com.ss.android.lark.ug.plugin.ContainerServiceDependency
            /* renamed from: a */
            public void mo195135a(ReachPointEvent aVar, IGetDataCallback<Boolean> iGetDataCallback) {
                Intrinsics.checkParameterIsNotNull(aVar, "params");
                Log.m165389i("UgReach", String.valueOf(aVar));
                String a = aVar.mo195238b().mo195244a();
                if (Intrinsics.areEqual("onCreate", a)) {
                    Log.m165389i("UgReach", "rp create");
                } else if (Intrinsics.areEqual("onReady", a)) {
                    UgReachSdkIntegrator aVar2 = UgReachSdkIntegrator.f141653a;
                    UgReachSdkIntegrator.f141661i.add(aVar.mo195237a());
                    UgReachSdkIntegrator aVar3 = UgReachSdkIntegrator.f141653a;
                    ReachPointEntity reachPointEntity = (ReachPointEntity) UgReachSdkIntegrator.f141662j.get(aVar.mo195237a());
                    if (reachPointEntity != null) {
                        Intrinsics.checkExpressionValueIsNotNull(reachPointEntity, "unreadyRpMap[params.reachPointId] ?: return");
                        UgReachSdkIntegrator aVar4 = UgReachSdkIntegrator.f141653a;
                        ScenarioContext scenarioContext = (ScenarioContext) UgReachSdkIntegrator.f141658f.get(aVar.mo195237a());
                        if (scenarioContext != null) {
                            Intrinsics.checkExpressionValueIsNotNull(scenarioContext, "rpidScenarioContextCache…                ?: return");
                            UgReachSdkIntegrator.f141653a.mo195125a(scenarioContext, false);
                        }
                    }
                } else {
                    UgReachSdkIntegrator aVar5 = UgReachSdkIntegrator.f141653a;
                    ScenarioContext scenarioContext2 = (ScenarioContext) UgReachSdkIntegrator.f141658f.get(aVar.mo195237a());
                    if (scenarioContext2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(scenarioContext2, "rpidScenarioContextCache…s.reachPointId] ?: return");
                        UgReachSdkIntegrator aVar6 = UgReachSdkIntegrator.f141653a;
                        if (UgReachSdkIntegrator.f141663k.contains(a) && aVar.mo195238b().mo195245b()) {
                            UgReachSdkIntegrator.f141653a.mo195126a(aVar, scenarioContext2, iGetDataCallback);
                        }
                        if (Intrinsics.areEqual("onDestroy", a)) {
                            UgReachSdkIntegrator aVar7 = UgReachSdkIntegrator.f141653a;
                            UgReachSdkIntegrator.f141661i.remove(aVar.mo195237a());
                            C57537a.m223390a(SchedulerService.f141770a).mo195267a(ReachPointState.LEAVE, CollectionsKt.listOf(aVar.mo195237a()));
                        } else if (Intrinsics.areEqual("didShow", a)) {
                            if (aVar.mo195238b().mo195245b()) {
                                C57537a.m223390a(SchedulerService.f141770a).mo195267a(ReachPointState.SHOW, CollectionsKt.listOf(aVar.mo195237a()));
                            }
                        } else if (Intrinsics.areEqual("didHide", a)) {
                            if (aVar.mo195238b().mo195245b()) {
                                C57537a.m223390a(SchedulerService.f141770a).mo195267a(ReachPointState.HIDE, CollectionsKt.listOf(aVar.mo195237a()));
                            }
                        } else if (Intrinsics.areEqual("consume", a)) {
                            C57537a.m223390a(SchedulerService.f141770a).mo195267a(ReachPointState.CONSUME, CollectionsKt.listOf(aVar.mo195237a()));
                            UgReachSdkIntegrator.f141653a.mo195132a(CollectionsKt.arrayListOf(aVar.mo195237a()));
                        }
                    }
                }
            }
        });
        C53248k.m205912a().mo181697a(Command.PUSH_UG_SCENARIO_INFO, C574842.f141665a);
    }

    /* renamed from: c */
    public final void mo195134c() {
        f141656d.set(false);
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f141657e;
        if (!copyOnWriteArrayList.isEmpty()) {
            Log.m165397w("UgReach", "exposeBuffer is not empty: " + copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
        }
        f141661i.clear();
        f141658f.clear();
        f141659g.clear();
        f141660h.clear();
        C57537a.m223390a(SchedulerService.f141770a).mo195269b(f141664l);
        C57537a.m223390a(SchedulerService.f141770a).mo195264a();
        C57533c.m223351a(ReachPointContainerService.f141766a).mo195254a();
    }

    /* renamed from: a */
    public final void mo195123a() {
        SdkSender.asynSendRequestNonWrap(Command.GET_UG_SDK_SETTINGS, new GetUGSDKSettingsRequest.C19773a(), new ApmUtils.GetDataCallback(new C57494j(), "ug_reach_fetch_settings", null, 4, null), new C57495k());
        C57537a.m223390a(SchedulerService.f141770a).mo195266a(f141664l);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$exposeReal$3", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$e */
    public static final class C57489e implements IGetDataCallback<GetUGScenarioResponse> {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f141668a;

        C57489e(AtomicBoolean atomicBoolean) {
            this.f141668a = atomicBoolean;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "exposeReal: GET_UG_SCENARIO -> " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(GetUGScenarioResponse getUGScenarioResponse) {
            Intrinsics.checkParameterIsNotNull(getUGScenarioResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "exposeReal: GET_UG_SCENARIO -> " + getUGScenarioResponse);
            this.f141668a.set(true);
            ScenarioContext scenarioContext = getUGScenarioResponse.scenario_context;
            if (scenarioContext != null) {
                UgReachSdkIntegrator aVar = UgReachSdkIntegrator.f141653a;
                Intrinsics.checkExpressionValueIsNotNull(scenarioContext, "it");
                aVar.mo195125a(scenarioContext, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$uploadEvent$4", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/UploadUGEventResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$n */
    public static final class C57498n implements IGetDataCallback<UploadUGEventResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f141671a;

        C57498n(IGetDataCallback iGetDataCallback) {
            this.f141671a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(UploadUGEventResponse uploadUGEventResponse) {
            Intrinsics.checkParameterIsNotNull(uploadUGEventResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "uploadEvent: UPLOAD_UG_EVENT -> " + uploadUGEventResponse);
            IGetDataCallback iGetDataCallback = this.f141671a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(true);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "uploadEvent: UPLOAD_UG_EVENT -> " + errorResult.getDebugMsg());
            IGetDataCallback iGetDataCallback = this.f141671a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$exposeReal$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGScenarioCacheResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$c */
    public static final class C57487c implements IGetDataCallback<GetUGScenarioCacheResponse> {

        /* renamed from: a */
        final /* synthetic */ String f141666a;

        /* renamed from: b */
        final /* synthetic */ AtomicBoolean f141667b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "exposeReal: GET_UG_SCENARIO_INFO_CACHE -> " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(GetUGScenarioCacheResponse getUGScenarioCacheResponse) {
            Intrinsics.checkParameterIsNotNull(getUGScenarioCacheResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "exposeReal: GET_UG_SCENARIO_INFO_CACHE -> " + getUGScenarioCacheResponse);
            UgReachSdkIntegrator.f141653a.mo195130a(this.f141666a, getUGScenarioCacheResponse, this.f141667b);
        }

        C57487c(String str, AtomicBoolean atomicBoolean) {
            this.f141666a = str;
            this.f141667b = atomicBoolean;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/integrator/UgReachSdkIntegrator$tryExpose$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/ugreach/v1/GetUGLocalRuleResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.f.a$l */
    public static final class C57496l implements IGetDataCallback<GetUGLocalRuleResponse> {

        /* renamed from: a */
        final /* synthetic */ ReachPointAction f141669a;

        /* renamed from: b */
        final /* synthetic */ String f141670b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UgReach", "tryExpose: GET_UG_LOCAL_RULE -> " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(GetUGLocalRuleResponse getUGLocalRuleResponse) {
            Intrinsics.checkParameterIsNotNull(getUGLocalRuleResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UgReach", "tryExpose: GET_UG_LOCAL_RULE -> " + getUGLocalRuleResponse);
            LocalRule localRule = getUGLocalRuleResponse.local_rule;
            if (localRule == null) {
                UgReachSdkIntegrator.f141653a.mo195129a(this.f141670b);
            } else if (C57537a.m223390a(SchedulerService.f141770a).mo195268a(this.f141669a, localRule)) {
                UgReachSdkIntegrator.f141653a.mo195129a(this.f141670b);
            }
        }

        C57496l(ReachPointAction aVar, String str) {
            this.f141669a = aVar;
            this.f141670b = str;
        }
    }

    /* renamed from: a */
    public final void mo195129a(String str) {
        if (!f141656d.get()) {
            f141657e.add(str);
        } else {
            m223143b(str);
        }
    }

    /* renamed from: b */
    private final void m223143b(String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        GetUGScenarioCacheRequest.C19779a aVar = new GetUGScenarioCacheRequest.C19779a();
        aVar.mo66971a(str);
        SdkSender.asynSendRequestNonWrap(Command.GET_UG_SCENARIO_INFO_CACHE, aVar, new C57487c(str, atomicBoolean), new C57488d());
        GetUGScenarioRequest.C19783a aVar2 = new GetUGScenarioRequest.C19783a();
        aVar2.mo66980a(str);
        m223140a(str, aVar2);
        SdkSender.asynSendRequestNonWrap(Command.GET_UG_SCENARIO, aVar2, new ApmUtils.GetDataCallback(new C57489e(atomicBoolean), "ug_reach_fetch_scenario_info", null, 4, null), new C57490f());
    }

    /* renamed from: a */
    public final void mo195124a(PushUGScenarioInfo pushUGScenarioInfo) {
        GetUGScenarioRequest.C19783a aVar = new GetUGScenarioRequest.C19783a();
        aVar.mo66980a(pushUGScenarioInfo.scenario_id);
        aVar.mo66981a(pushUGScenarioInfo.reach_point_ids.reach_point_ids);
        String str = pushUGScenarioInfo.scenario_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "scenarioInfo.scenario_id");
        m223140a(str, aVar);
        SdkSender.asynSendRequestNonWrap(Command.GET_UG_SCENARIO, aVar, new C57491g(), new C57492h());
    }

    /* renamed from: a */
    private final ScenarioContext m223136a(ScenarioContext scenarioContext, List<ReachPointEntity> list) {
        ScenarioContext.C19803a aVar = new ScenarioContext.C19803a();
        aVar.mo67027a(scenarioContext.scenario_id);
        aVar.mo67025a(scenarioContext.local_rule);
        aVar.mo67026a(scenarioContext.priority);
        aVar.mo67028a(scenarioContext.share_scenario_ids);
        aVar.mo67030b(list);
        ScenarioContext a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
        return a;
    }

    /* renamed from: a */
    private final void m223140a(String str, GetUGScenarioRequest.C19783a aVar) {
        ConcurrentHashMap<String, BizContextProvider> concurrentHashMap = f141659g.get(str);
        if (concurrentHashMap != null) {
            HashMap hashMap = new HashMap();
            for (BizContextProvider aVar2 : concurrentHashMap.values()) {
                hashMap.putAll(aVar2.mo130964a());
            }
            aVar.mo66982a(hashMap);
        }
    }

    /* renamed from: a */
    private final void m223141a(String str, String str2, BizContextProvider aVar) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, ConcurrentHashMap<String, BizContextProvider>> concurrentHashMap = f141659g;
            ConcurrentHashMap<String, BizContextProvider> concurrentHashMap2 = concurrentHashMap.get(str);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                concurrentHashMap.put(str, concurrentHashMap2);
            }
            concurrentHashMap2.put(str2, aVar);
        }
    }

    /* renamed from: a */
    public final <RP extends ReachPoint<?>> RP mo195122a(String str, Class<RP> cls, BizContextProvider aVar) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(cls, "reachPointClazz");
        if (aVar != null) {
            String b = aVar.mo130965b();
            f141653a.m223141a(b, str, aVar);
            f141660h.put(str, b);
        }
        return (RP) C57533c.m223351a(ReachPointContainerService.f141766a).mo195253a(str, cls);
    }
}
