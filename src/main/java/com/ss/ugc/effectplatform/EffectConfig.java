package com.ss.ugc.effectplatform;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.concurrent.executor.AsyncExecutor;
import bytekn.foundation.concurrent.executor.ExecutorService;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.ILogger;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.ss.ugc.effectplatform.bridge.EffectFetcher;
import com.ss.ugc.effectplatform.bridge.EffectFetcherImpl;
import com.ss.ugc.effectplatform.bridge.file.IFileUnzipper;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.p3241b.C65499c;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.listener.CallbackManager;
import com.ss.ugc.effectplatform.listener.IModelDownloadEventListener;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.repository.EffectDownloadManager;
import com.ss.ugc.effectplatform.task.TaskManager;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00012\u00020\u0001:\u0006\u0001\u0001\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020~J\u0010\u0010\u001a\u00020|2\b\u00102\u001a\u0004\u0018\u000103R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\tR\"\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\tR\"\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\tR.\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\tR\u0014\u0010.\u001a\u00020/X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001bR\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001bR\"\u00108\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\tR\"\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\u0005\u001a\u0004\u0018\u00010:@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\"\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR$\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0005\u001a\u0004\u0018\u00010B@BX\u000e¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\"\u0010G\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\tR\"\u0010I\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\tRV\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Kj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`L2\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Kj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`L@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\"\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010\u0005\u001a\u0004\u0018\u00010P@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020B@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001c\u0010W\u001a\u0004\u0018\u00010XX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u0004\u0018\u00010]2\b\u0010\u0005\u001a\u0004\u0018\u00010]@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001e\u0010b\u001a\u00020a2\u0006\u0010\u0005\u001a\u00020a@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\"\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u001b\"\u0004\bh\u0010\u001dR\"\u0010i\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\tR\"\u0010k\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\tR\u001e\u0010m\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020B@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bn\u0010VR\u001e\u0010o\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020B@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bp\u0010VR\"\u0010q\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\br\u0010\tR\u001c\u0010s\u001a\u0004\u0018\u00010tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010y\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bz\u0010\t¨\u0006\u0001"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectConfig;", "", "builder", "Lcom/ss/ugc/effectplatform/EffectConfig$Builder;", "(Lcom/ss/ugc/effectplatform/EffectConfig$Builder;)V", "<set-?>", "", "accessKey", "getAccessKey", "()Ljava/lang/String;", "algorithmDir", "getAlgorithmDir", "apiAddress", "getApiAddress", "appContext", "getAppContext", "()Ljava/lang/Object;", "appId", "getAppId", "appLanguage", "getAppLanguage", "appVersion", "getAppVersion", "cache", "Lbytekn/foundation/concurrent/SharedReference;", "Lcom/ss/ugc/effectplatform/cache/ICache;", "getCache", "()Lbytekn/foundation/concurrent/SharedReference;", "setCache", "(Lbytekn/foundation/concurrent/SharedReference;)V", "callbackManager", "Lcom/ss/ugc/effectplatform/listener/CallbackManager;", "getCallbackManager$effectplatform_release", "()Lcom/ss/ugc/effectplatform/listener/CallbackManager;", "channel", "getChannel", "deviceId", "getDeviceId", "deviceType", "getDeviceType", "", "draftList", "getDraftList", "()Ljava/util/List;", "effectDir", "getEffectDir", "effectDownloadManager", "Lcom/ss/ugc/effectplatform/repository/EffectDownloadManager;", "getEffectDownloadManager$effectplatform_release", "()Lcom/ss/ugc/effectplatform/repository/EffectDownloadManager;", "effectFetcher", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcher;", "getEffectFetcher", "effectNetWorker", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "getEffectNetWorker", "exclusionPattern", "getExclusionPattern", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "executor", "getExecutor", "()Lbytekn/foundation/concurrent/executor/ExecutorService;", "fileUnZipper", "Lcom/ss/ugc/effectplatform/bridge/file/IFileUnzipper;", "getFileUnZipper", "setFileUnZipper", "", "filterType", "getFilterType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "gpuVersion", "getGpuVersion", "host", "getHost", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "iopInfo", "getIopInfo", "()Ljava/util/HashMap;", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "jsonConverter", "getJsonConverter", "()Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "modelApiMaxTryCount", "getModelApiMaxTryCount", "()I", "modelDownloadEventListener", "Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;", "getModelDownloadEventListener", "()Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;", "setModelDownloadEventListener", "(Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;)V", "Lcom/ss/ugc/effectplatform/EffectConfig$ModelFileEnv;", "modelFileEnv", "getModelFileEnv", "()Lcom/ss/ugc/effectplatform/EffectConfig$ModelFileEnv;", "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "modelType", "getModelType", "()Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "monitorReport", "Lcom/ss/ugc/effectplatform/monitor/IMonitorReport;", "getMonitorReport", "setMonitorReport", "platform", "getPlatform", "region", "getRegion", "requestStrategy", "getRequestStrategy", "retryCount", "getRetryCount", "sdkVersion", "getSdkVersion", "taskManager", "Lcom/ss/ugc/effectplatform/task/TaskManager;", "getTaskManager", "()Lcom/ss/ugc/effectplatform/task/TaskManager;", "setTaskManager", "(Lcom/ss/ugc/effectplatform/task/TaskManager;)V", "testStatus", "getTestStatus", "setCustomLogger", "", "customLogger", "Lbytekn/foundation/logger/ILogger;", "setEffectFetcher", "Builder", "Companion", "ModelFileEnv", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EffectConfig {

    /* renamed from: a */
    public static final Companion f164685a = new Companion(null);

    /* renamed from: A */
    private TaskManager f164686A;

    /* renamed from: B */
    private String f164687B;

    /* renamed from: C */
    private List<String> f164688C;

    /* renamed from: D */
    private Object f164689D;

    /* renamed from: E */
    private FetchModelType f164690E;

    /* renamed from: F */
    private String f164691F;

    /* renamed from: G */
    private ModelFileEnv f164692G;

    /* renamed from: H */
    private IModelDownloadEventListener f164693H;

    /* renamed from: I */
    private String f164694I;

    /* renamed from: J */
    private final EffectDownloadManager f164695J;

    /* renamed from: K */
    private final CallbackManager f164696K;

    /* renamed from: L */
    private Integer f164697L;

    /* renamed from: b */
    private String f164698b = "/effect/api";

    /* renamed from: c */
    private String f164699c;

    /* renamed from: d */
    private String f164700d;

    /* renamed from: e */
    private String f164701e;

    /* renamed from: f */
    private String f164702f;

    /* renamed from: g */
    private String f164703g;

    /* renamed from: h */
    private String f164704h;

    /* renamed from: i */
    private String f164705i;

    /* renamed from: j */
    private String f164706j;

    /* renamed from: k */
    private String f164707k;

    /* renamed from: l */
    private String f164708l;

    /* renamed from: m */
    private String f164709m;

    /* renamed from: n */
    private HashMap<String, String> f164710n;

    /* renamed from: o */
    private int f164711o;

    /* renamed from: p */
    private int f164712p;

    /* renamed from: q */
    private int f164713q;

    /* renamed from: r */
    private IJsonConverter f164714r;

    /* renamed from: s */
    private final SharedReference<INetworkClient> f164715s;

    /* renamed from: t */
    private SharedReference<IMonitorReport> f164716t;

    /* renamed from: u */
    private SharedReference<IFileUnzipper> f164717u;

    /* renamed from: v */
    private ExecutorService f164718v;

    /* renamed from: w */
    private final SharedReference<EffectFetcher> f164719w;

    /* renamed from: x */
    private SharedReference<ICache> f164720x;

    /* renamed from: y */
    private String f164721y;

    /* renamed from: z */
    private String f164722z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectConfig$ModelFileEnv;", "", "(Ljava/lang/String;I)V", "TEST", "ONLINE", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ModelFileEnv {
        TEST,
        ONLINE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00002\b\u0010d\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010e\u001a\u00020fJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u0014\u0010 \u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001fJ\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010g\u001a\u00020)J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u0004J\u000e\u0010i\u001a\u00020\u00002\u0006\u0010j\u001a\u00020AJ\u000e\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/J\u0010\u0010k\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0004J\u000e\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0004J$\u0010l\u001a\u00020\u00002\b\u0010m\u001a\u0004\u0018\u00010\u00042\b\u0010n\u001a\u0004\u0018\u00010\u00042\b\u0010o\u001a\u0004\u0018\u00010\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010p\u001a\u00020/J\u0010\u0010I\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010HJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010M\u001a\u00020LJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020PJ\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020TJ\u000e\u0010X\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0004J\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0004J\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020/J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020/J\u000e\u0010`\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u0004J\u0010\u0010b\u001a\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010\u0004R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\"\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R.\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\"\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0003\u001a\u0004\u0018\u00010%@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0003\u001a\u0004\u0018\u00010)@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\"\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0007R$\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u0003\u001a\u0004\u0018\u00010/@BX\u000e¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\"\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\"\u00106\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007RV\u0010:\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`92\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`9@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\"\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u0003\u001a\u0004\u0018\u00010=@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0003\u001a\u0004\u0018\u00010A@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\"\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u0003\u001a\u0004\u0018\u00010H@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u0004\u0018\u00010L2\b\u0010\u0003\u001a\u0004\u0018\u00010L@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001e\u0010Q\u001a\u00020P2\u0006\u0010\u0003\u001a\u00020P@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\"\u0010U\u001a\u0004\u0018\u00010T2\b\u0010\u0003\u001a\u0004\u0018\u00010T@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\"\u0010X\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0007R\"\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\u0007R\u001e\u0010\\\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b]\u0010GR\u001e\u0010^\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010GR\"\u0010`\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0007R\"\u0010b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0007¨\u0006q"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectConfig$Builder;", "", "()V", "<set-?>", "", "accessKey", "getAccessKey", "()Ljava/lang/String;", "algorithmDir", "getAlgorithmDir", "appContext", "getAppContext", "()Ljava/lang/Object;", "appID", "getAppID", "appLanguage", "getAppLanguage", "appVersion", "getAppVersion", "cache", "Lcom/ss/ugc/effectplatform/cache/ICache;", "getCache", "()Lcom/ss/ugc/effectplatform/cache/ICache;", "setCache", "(Lcom/ss/ugc/effectplatform/cache/ICache;)V", "channel", "getChannel", "deviceId", "getDeviceId", "deviceType", "getDeviceType", "", "draftList", "getDraftList", "()Ljava/util/List;", "effectDir", "getEffectDir", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcher;", "effectFetcher", "getEffectFetcher", "()Lcom/ss/ugc/effectplatform/bridge/EffectFetcher;", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "effectNetWorker", "getEffectNetWorker", "()Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "exclusionPattern", "getExclusionPattern", "", "filterType", "getFilterType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "gpuVersion", "getGpuVersion", "hosts", "getHosts", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "iopInfo", "getIopInfo", "()Ljava/util/HashMap;", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "jsonConverter", "getJsonConverter", "()Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "mExecutor", "getMExecutor", "()Lbytekn/foundation/concurrent/executor/ExecutorService;", "modelApiMaxTryCount", "getModelApiMaxTryCount", "()I", "Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;", "modelDownloadEventListener", "getModelDownloadEventListener", "()Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;", "Lcom/ss/ugc/effectplatform/EffectConfig$ModelFileEnv;", "modelFileEnv", "getModelFileEnv", "()Lcom/ss/ugc/effectplatform/EffectConfig$ModelFileEnv;", "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "modelType", "getModelType", "()Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "Lcom/ss/ugc/effectplatform/monitor/IMonitorReport;", "monitorReport", "getMonitorReport", "()Lcom/ss/ugc/effectplatform/monitor/IMonitorReport;", "platform", "getPlatform", "region", "getRegion", "requestStrategy", "getRequestStrategy", "retryCount", "getRetryCount", "sdkVersion", "getSdkVersion", "testStatus", "getTestStatus", "context", "build", "Lcom/ss/ugc/effectplatform/EffectConfig;", "effectINetworkClient", "pattern", "executor", "executorService", "gpuInfo", "iop", "lx", "ly", "cyCode", "count", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.EffectConfig$a */
    public static class Builder {

        /* renamed from: A */
        private Object f164723A;

        /* renamed from: B */
        private FetchModelType f164724B = FetchModelType.ORIGIN;

        /* renamed from: C */
        private String f164725C;

        /* renamed from: D */
        private ModelFileEnv f164726D;

        /* renamed from: E */
        private Integer f164727E;

        /* renamed from: a */
        private String f164728a;

        /* renamed from: b */
        private String f164729b;

        /* renamed from: c */
        private String f164730c;

        /* renamed from: d */
        private String f164731d;

        /* renamed from: e */
        private String f164732e;

        /* renamed from: f */
        private String f164733f;

        /* renamed from: g */
        private INetworkClient f164734g;

        /* renamed from: h */
        private IJsonConverter f164735h;

        /* renamed from: i */
        private ICache f164736i;

        /* renamed from: j */
        private String f164737j;

        /* renamed from: k */
        private String f164738k;

        /* renamed from: l */
        private String f164739l;

        /* renamed from: m */
        private String f164740m;

        /* renamed from: n */
        private String f164741n;

        /* renamed from: o */
        private int f164742o = 3;

        /* renamed from: p */
        private int f164743p = 3;

        /* renamed from: q */
        private String f164744q;

        /* renamed from: r */
        private ExecutorService f164745r;

        /* renamed from: s */
        private EffectFetcher f164746s;

        /* renamed from: t */
        private IMonitorReport f164747t;

        /* renamed from: u */
        private String f164748u;

        /* renamed from: v */
        private String f164749v;

        /* renamed from: w */
        private HashMap<String, String> f164750w = new HashMap<>();

        /* renamed from: x */
        private int f164751x;

        /* renamed from: y */
        private String f164752y;

        /* renamed from: z */
        private List<String> f164753z;

        /* renamed from: A */
        public final Object mo227580A() {
            return this.f164723A;
        }

        /* renamed from: B */
        public final FetchModelType mo227581B() {
            return this.f164724B;
        }

        /* renamed from: C */
        public final String mo227582C() {
            return this.f164725C;
        }

        /* renamed from: D */
        public final ModelFileEnv mo227583D() {
            return this.f164726D;
        }

        /* renamed from: E */
        public final Integer mo227584E() {
            return this.f164727E;
        }

        /* renamed from: b */
        public final String mo227597b() {
            return this.f164729b;
        }

        /* renamed from: c */
        public final String mo227599c() {
            return this.f164730c;
        }

        /* renamed from: d */
        public final String mo227601d() {
            return this.f164731d;
        }

        /* renamed from: e */
        public final String mo227603e() {
            return this.f164732e;
        }

        /* renamed from: f */
        public final String mo227605f() {
            return this.f164733f;
        }

        /* renamed from: g */
        public final INetworkClient mo227607g() {
            return this.f164734g;
        }

        /* renamed from: i */
        public final ICache mo227611i() {
            return this.f164736i;
        }

        /* renamed from: k */
        public final String mo227615k() {
            return this.f164738k;
        }

        /* renamed from: l */
        public final String mo227616l() {
            return this.f164739l;
        }

        /* renamed from: m */
        public final String mo227617m() {
            return this.f164740m;
        }

        /* renamed from: n */
        public final String mo227618n() {
            return this.f164741n;
        }

        /* renamed from: o */
        public final int mo227619o() {
            return this.f164742o;
        }

        /* renamed from: p */
        public final int mo227620p() {
            return this.f164743p;
        }

        /* renamed from: q */
        public final String mo227621q() {
            return this.f164744q;
        }

        /* renamed from: r */
        public final ExecutorService mo227622r() {
            return this.f164745r;
        }

        /* renamed from: s */
        public final EffectFetcher mo227623s() {
            return this.f164746s;
        }

        /* renamed from: t */
        public final IMonitorReport mo227624t() {
            return this.f164747t;
        }

        /* renamed from: u */
        public final String mo227625u() {
            return this.f164748u;
        }

        /* renamed from: v */
        public final String mo227626v() {
            return this.f164749v;
        }

        /* renamed from: w */
        public final HashMap<String, String> mo227627w() {
            return this.f164750w;
        }

        /* renamed from: x */
        public final int mo227628x() {
            return this.f164751x;
        }

        /* renamed from: y */
        public final String mo227629y() {
            return this.f164752y;
        }

        /* renamed from: z */
        public final List<String> mo227630z() {
            return this.f164753z;
        }

        /* renamed from: F */
        public final EffectConfig mo227585F() {
            return new EffectConfig(this);
        }

        /* renamed from: h */
        public final IJsonConverter mo227609h() {
            return this.f164735h;
        }

        /* renamed from: j */
        public final String mo227613j() {
            return this.f164737j;
        }

        /* renamed from: a */
        public final String mo227595a() {
            return this.f164728a;
        }

        /* renamed from: a */
        public final Builder mo227586a(int i) {
            this.f164742o = i;
            return this;
        }

        /* renamed from: h */
        public final Builder mo227608h(String str) {
            this.f164740m = str;
            return this;
        }

        /* renamed from: j */
        public final Builder mo227612j(String str) {
            this.f164733f = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo227587a(ExecutorService bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "executorService");
            this.f164745r = bVar;
            return this;
        }

        /* renamed from: b */
        public final Builder mo227596b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "sdkVersion");
            this.f164729b = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo227598c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "appVersion");
            this.f164730c = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo227600d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "deviceId");
            this.f164731d = str;
            return this;
        }

        /* renamed from: e */
        public final Builder mo227602e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "channel");
            this.f164737j = str;
            return this;
        }

        /* renamed from: f */
        public final Builder mo227604f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "platform");
            this.f164738k = str;
            return this;
        }

        /* renamed from: g */
        public final Builder mo227606g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "deviceType");
            this.f164739l = str;
            return this;
        }

        /* renamed from: i */
        public final Builder mo227610i(String str) {
            Builder aVar = this;
            aVar.f164741n = str;
            return aVar;
        }

        /* renamed from: k */
        public final Builder mo227614k(String str) {
            Intrinsics.checkParameterIsNotNull(str, "hosts");
            this.f164752y = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo227588a(ModelFileEnv modelFileEnv) {
            Intrinsics.checkParameterIsNotNull(modelFileEnv, "modelFileEnv");
            Builder aVar = this;
            aVar.f164726D = modelFileEnv;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo227589a(EffectFetcher aVar) {
            this.f164746s = aVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo227590a(IJsonConverter bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "jsonConverter");
            this.f164735h = bVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo227591a(INetworkClient cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "effectINetworkClient");
            this.f164734g = cVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo227592a(FetchModelType fetchModelType) {
            Intrinsics.checkParameterIsNotNull(fetchModelType, "modelType");
            Builder aVar = this;
            aVar.f164724B = fetchModelType;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo227593a(Object obj) {
            Builder aVar = this;
            aVar.f164723A = obj;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo227594a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "accessKey");
            Builder aVar = this;
            aVar.f164728a = str;
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000204XT¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectConfig$Companion;", "", "()V", "API_ADDRESS", "", "KEY_ACCESS_KEY", "KEY_APP_ID", "KEY_APP_LANG", "KEY_APP_LANGUAGE", "KEY_APP_VERSION", "KEY_CARRIER_REGION", "KEY_CATEGORY", "KEY_CHANNEL", "KEY_CITY_CODE", "KEY_COUNT", "KEY_CREATION_ID", "KEY_CURSOR", "KEY_CY_CODE", "KEY_DEVICE_ID", "KEY_DEVICE_INFO", "KEY_DEVICE_PLATFORM", "KEY_DEVICE_TYPE", "KEY_EFFECT_IDS", "KEY_FILTER_TYPE", "KEY_GPU", "KEY_GPU_INFO", "KEY_GRADE_KEY", "KEY_IMAGE_URI", "KEY_LIBRARY", "KEY_LX", "KEY_LY", "KEY_PANEL", "KEY_PLATFORM_AB_PARAM", "KEY_PLATFORM_SDK_VERSION", "KEY_PROVIDER_NAME", "KEY_REGION", "KEY_RESOURCE_IDS", "KEY_SCENE", "KEY_SDK_VERSION", "KEY_SEARCH_KEYWORD", "KEY_SEARCH_WORD", "KEY_SEC_ID", "KEY_SORTING_POSITION", "KEY_SOURCE", "KEY_STATUS", "KEY_SYS_REGION", "KEY_TEST_STATUS", "KEY_TYPE", "KEY_VERSION", "KEY_WITH_CATEGORY_EFFECTS", "KEY_WORD", "STRATEGY_OPTIMIZE_CHECK_UPDATE", "", "STRATEGY_OPTIMIZE_JSON", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.EffectConfig$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: A */
    public final String mo227541A() {
        return this.f164687B;
    }

    /* renamed from: B */
    public final List<String> mo227542B() {
        return this.f164688C;
    }

    /* renamed from: C */
    public final Object mo227543C() {
        return this.f164689D;
    }

    /* renamed from: D */
    public final FetchModelType mo227544D() {
        return this.f164690E;
    }

    /* renamed from: E */
    public final String mo227545E() {
        return this.f164691F;
    }

    /* renamed from: F */
    public final ModelFileEnv mo227546F() {
        return this.f164692G;
    }

    /* renamed from: G */
    public final IModelDownloadEventListener mo227547G() {
        return this.f164693H;
    }

    /* renamed from: H */
    public final String mo227548H() {
        return this.f164694I;
    }

    /* renamed from: I */
    public final EffectDownloadManager mo227549I() {
        return this.f164695J;
    }

    /* renamed from: J */
    public final CallbackManager mo227550J() {
        return this.f164696K;
    }

    /* renamed from: K */
    public final Integer mo227551K() {
        return this.f164697L;
    }

    /* renamed from: a */
    public final String mo227552a() {
        return this.f164698b;
    }

    /* renamed from: b */
    public final String mo227555b() {
        return this.f164699c;
    }

    /* renamed from: c */
    public final String mo227556c() {
        return this.f164700d;
    }

    /* renamed from: d */
    public final String mo227557d() {
        return this.f164701e;
    }

    /* renamed from: e */
    public final String mo227558e() {
        return this.f164702f;
    }

    /* renamed from: f */
    public final String mo227559f() {
        return this.f164703g;
    }

    /* renamed from: g */
    public final String mo227560g() {
        return this.f164704h;
    }

    /* renamed from: h */
    public final String mo227561h() {
        return this.f164705i;
    }

    /* renamed from: i */
    public final String mo227562i() {
        return this.f164706j;
    }

    /* renamed from: j */
    public final String mo227563j() {
        return this.f164707k;
    }

    /* renamed from: k */
    public final String mo227564k() {
        return this.f164708l;
    }

    /* renamed from: l */
    public final String mo227565l() {
        return this.f164709m;
    }

    /* renamed from: m */
    public final HashMap<String, String> mo227566m() {
        return this.f164710n;
    }

    /* renamed from: n */
    public final int mo227567n() {
        return this.f164711o;
    }

    /* renamed from: o */
    public final int mo227568o() {
        return this.f164712p;
    }

    /* renamed from: p */
    public final int mo227569p() {
        return this.f164713q;
    }

    /* renamed from: q */
    public final IJsonConverter mo227570q() {
        return this.f164714r;
    }

    /* renamed from: r */
    public final SharedReference<INetworkClient> mo227571r() {
        return this.f164715s;
    }

    /* renamed from: s */
    public final SharedReference<IMonitorReport> mo227572s() {
        return this.f164716t;
    }

    /* renamed from: t */
    public final SharedReference<IFileUnzipper> mo227573t() {
        return this.f164717u;
    }

    /* renamed from: u */
    public final ExecutorService mo227574u() {
        return this.f164718v;
    }

    /* renamed from: v */
    public final SharedReference<EffectFetcher> mo227575v() {
        return this.f164719w;
    }

    /* renamed from: w */
    public final SharedReference<ICache> mo227576w() {
        return this.f164720x;
    }

    /* renamed from: x */
    public final String mo227577x() {
        return this.f164721y;
    }

    /* renamed from: y */
    public final String mo227578y() {
        return this.f164722z;
    }

    /* renamed from: z */
    public final TaskManager mo227579z() {
        return this.f164686A;
    }

    /* renamed from: a */
    public final void mo227554a(TaskManager oVar) {
        this.f164686A = oVar;
    }

    /* renamed from: a */
    public final void mo227553a(ILogger aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "customLogger");
        Logger.f5760a.mo8661a(aVar);
    }

    protected EffectConfig(Builder aVar) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f164699c = aVar.mo227595a();
        this.f164700d = aVar.mo227597b();
        this.f164701e = aVar.mo227599c();
        this.f164702f = aVar.mo227601d();
        String str3 = "test";
        if (!TextUtils.f165135a.mo228358a(str3, aVar.mo227613j()) && !TextUtils.f165135a.mo228358a("local_test", aVar.mo227613j())) {
            str3 = "online";
        }
        this.f164703g = str3;
        if (aVar.mo227615k() == null) {
            str = "android";
        } else {
            str = aVar.mo227615k();
        }
        this.f164704h = str;
        this.f164705i = aVar.mo227616l();
        String m = aVar.mo227617m();
        this.f164706j = m == null ? "" : m;
        this.f164707k = aVar.mo227603e();
        if (aVar.mo227605f() == null) {
            str2 = "0";
        } else {
            str2 = aVar.mo227605f();
        }
        this.f164708l = str2;
        this.f164709m = aVar.mo227621q();
        this.f164710n = aVar.mo227627w();
        this.f164711o = aVar.mo227619o();
        this.f164712p = aVar.mo227620p();
        this.f164713q = aVar.mo227628x();
        IJsonConverter h = aVar.mo227609h();
        this.f164714r = h == null ? C65499c.m256738a() : h;
        SharedReference<INetworkClient> bVar = new SharedReference<>(null);
        this.f164715s = bVar;
        this.f164716t = new SharedReference<>(null);
        this.f164717u = new SharedReference<>(null);
        AsyncExecutor r = aVar.mo227622r();
        this.f164718v = r == null ? new AsyncExecutor() : r;
        SharedReference<EffectFetcher> bVar2 = new SharedReference<>(null);
        this.f164719w = bVar2;
        this.f164720x = new SharedReference<>(null);
        this.f164721y = aVar.mo227626v();
        this.f164722z = aVar.mo227625u();
        TaskManager.Builder aVar2 = new TaskManager.Builder();
        ExecutorService bVar3 = this.f164718v;
        if (bVar3 == null) {
            Intrinsics.throwNpe();
        }
        this.f164686A = aVar2.mo228293a(bVar3).mo228294a();
        this.f164687B = aVar.mo227629y();
        this.f164688C = aVar.mo227630z();
        this.f164689D = aVar.mo227580A();
        this.f164690E = aVar.mo227581B();
        this.f164691F = aVar.mo227582C();
        this.f164692G = aVar.mo227583D();
        String n = aVar.mo227618n();
        if (n == null) {
            n = this.f164706j + FileManager.f5817a.mo8712a() + "algorithm";
        }
        this.f164694I = n;
        this.f164695J = EffectDownloadManager.f164921a;
        this.f164696K = new CallbackManager();
        this.f164697L = aVar.mo227584E();
        bVar.mo8626a(aVar.mo227607g());
        EffectFetcherImpl s = aVar.mo227623s();
        C1686c.m7469a(bVar2, s == null ? new EffectFetcherImpl(this) : s);
        C1686c.m7469a(this.f164716t, aVar.mo227624t());
        C1686c.m7469a(this.f164720x, aVar.mo227611i());
    }
}
