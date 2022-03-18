package com.bytedance.lark.sdk;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.C1711a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.Packet;
import com.bytedance.lark.sdk.api.LarkProxyApi;
import com.bytedance.lark.sdk.util.GenerateID;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.C53254m;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sdk {
    private static ExecutorService DEFAULT_EXECUTOR_SERVICE;
    private static long globalStartTime = System.currentTimeMillis();
    private static long globalWorkTime = 0;
    private static C19838m mSdkInitiatorInterceptor;
    private static C19840n mSdkRequestInterceptor;
    private static C19829a sDispatcher = new C19829a();
    public static final List<AbstractC19832d> sIPushObservers = new CopyOnWriteArrayList();
    private static Executor sPushExecutorService;
    public static final Map<Long, AbstractC19831c> sTaskId2CallbackMap = new ConcurrentHashMap();
    private Map apiMap;
    private volatile HandlerThreadC19836l mHandlerThread;
    private Command mNetProxyCommand;
    private RustTask mNetProxyTask;

    /* renamed from: com.bytedance.lark.sdk.Sdk$a */
    public static class C19828a {

        /* renamed from: a */
        public static final Sdk f48378a = new Sdk();
    }

    private static final native void _fetchAsync(byte[] bArr, long j);

    public static final native byte[] _getAvatar(long j, String str, int i, float f, String str2);

    public static final native byte[] _getInitSettings(String str, String str2, int i, String str3);

    public static final native long _getNtpTime();

    public static final native byte[] _getTTNetRequestLogs();

    public static final native int _initSDK(byte[] bArr);

    public static final native byte[] _invoke(int i, byte[] bArr);

    public static final native void _invokeAsync(int i, byte[] bArr, long j);

    public static final native void _log(String str, String str2, String str3, String str4, int i, long j, String str5, String str6, int i2, String str7, String str8, int i3);

    public static Sdk getInstance() {
        return C19828a.f48378a;
    }

    private static long getAvailableTaskId() {
        return GenerateID.f48386b.mo67172a();
    }

    public static void notifyEndInitSdk() {
        mSdkInitiatorInterceptor.mo67199a();
    }

    private Sdk() {
        this.apiMap = new HashMap();
        LarkNet eVar = new LarkNet();
        this.apiMap.put(LarkNetApi.class, eVar);
        this.apiMap.put(LarkProxyApi.class, eVar);
        this.mHandlerThread = new HandlerThreadC19836l("lark_sdk_sub");
        this.mHandlerThread.start();
    }

    protected static boolean isWschannelProc() {
        Context a = C53254m.m205919a();
        if (a == null) {
            return false;
        }
        String a2 = C26252ad.m94992a(a);
        C53241h.m205899c("sdk", "Process name is " + a2);
        if (TextUtils.isEmpty(a2) || !a2.contains(":wschannel")) {
            return false;
        }
        return true;
    }

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("thread-pool-push"));
        DEFAULT_EXECUTOR_SERVICE = newSingleThreadExecutor;
        sPushExecutorService = newSingleThreadExecutor;
        long currentTimeMillis = System.currentTimeMillis();
        if (isWschannelProc()) {
            C1711a.m7628a("wschannel");
        } else {
            C1711a.m7628a("lark");
        }
        C19840n nVar = new C19840n();
        mSdkRequestInterceptor = nVar;
        mSdkInitiatorInterceptor = new C19838m(nVar);
        C53241h.m205898b("sdk", "Load C++ native library successfully, cos=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public static void addPushObserver(AbstractC19832d dVar) {
        sIPushObservers.add(dVar);
    }

    public static void removePushObserver(AbstractC19832d dVar) {
        sIPushObservers.remove(dVar);
    }

    public <T> T getApi(Class<T> cls) {
        return (T) this.apiMap.get(cls);
    }

    public void clearNetProxy(RustTask kVar) {
        this.mNetProxyTask = kVar;
        this.mNetProxyCommand = Command.CLEAR_NETWORK_PROXY;
        invokeSetNetProxy(Command.CLEAR_NETWORK_PROXY, kVar);
    }

    public void sendNetRequestAsync(RustTask kVar) {
        _fetchAsync(kVar.mo67195a(), kVar.mo67196b());
    }

    public void setNetProxy(RustTask kVar) {
        this.mNetProxyTask = kVar;
        this.mNetProxyCommand = Command.SET_NETWORK_PROXY;
        invokeSetNetProxy(Command.SET_NETWORK_PROXY, kVar);
    }

    public static void pushCallback(final byte[] bArr) {
        C53241h.m205899c("sdk", "pushCallback received");
        sPushExecutorService.execute(new Runnable() {
            /* class com.bytedance.lark.sdk.Sdk.RunnableC198251 */

            public void run() {
                Packet packet;
                boolean z;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    packet = Packet.ADAPTER.decode(bArr);
                } catch (IOException e) {
                    e.printStackTrace();
                    packet = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (packet == null) {
                    C53241h.m205894a("sdk", "onPush: packet is null");
                    return;
                }
                long longValue = packet.task_id.longValue();
                C53241h.m205899c("sdk", "taskId:" + longValue);
                if (longValue <= 0) {
                    for (AbstractC19832d dVar : Sdk.sIPushObservers) {
                        dVar.mo67180a(packet, currentTimeMillis, currentTimeMillis2);
                    }
                    Sdk.calculateWorkTime(currentTimeMillis, System.currentTimeMillis());
                    return;
                }
                Packet.StreamStatus streamStatus = packet.stream_status;
                if (streamStatus == Packet.StreamStatus.ACTIVE) {
                    z = true;
                } else if (streamStatus == Packet.StreamStatus.FINAL_WITH_PAYLOAD) {
                    z = false;
                } else if (streamStatus == Packet.StreamStatus.FINAL_WITHOUT_PAYLOAD) {
                    Sdk.sTaskId2CallbackMap.remove(Long.valueOf(longValue));
                    return;
                } else {
                    return;
                }
                Sdk.handleAsyncCallback(longValue, packet.is_err.booleanValue(), packet.payload.toByteArray(), z);
            }
        });
    }

    public static void setPushExecutorService(Executor executor) {
        if (executor != null) {
            Executor executor2 = sPushExecutorService;
            ExecutorService executorService = DEFAULT_EXECUTOR_SERVICE;
            if (executor2 == executorService) {
                executorService.shutdown();
                DEFAULT_EXECUTOR_SERVICE = null;
            }
            sPushExecutorService = executor;
        }
    }

    public void cancelNetRequestAsync(RustTask kVar) {
        _invokeAsync(Command.CANCEL_FETCH.getValue(), kVar.mo67195a(), kVar.mo67196b());
    }

    public static byte[] OnFetchReadBuf(long j, long j2) {
        return LarkNet.f48391b.mo67185a(j, j2);
    }

    private void invokeSetNetProxy(Command command, RustTask kVar) {
        C53241h.m205899c("sdk", "invokeSetNetProxy:" + command);
        _invoke(command.getValue(), kVar.mo67195a());
    }

    public static void log(String str, String str2) {
        _log("", str2, "", str, 2, System.currentTimeMillis(), "", null, 0, "", Thread.currentThread().getName(), Process.myPid());
    }

    public static void calculateWorkTime(long j, long j2) {
        long j3 = globalWorkTime + (j2 - j);
        globalWorkTime = j3;
        long j4 = globalStartTime;
        if (j2 - j4 > 10000) {
            float f = (((float) j3) * 1.0f) / ((float) (j2 - j4));
            if (((double) f) > 0.5d) {
                C53241h.m205900d("sdk", "CPU工作时间占比过高，比例为:" + f);
            }
            globalWorkTime = 0;
            globalStartTime = System.currentTimeMillis();
        }
    }

    public void initSDK(Context context, InitSDKRequest.C15029a aVar) {
        Command command;
        C53254m.m205929e().mo102657a();
        int _initSDK = _initSDK(aVar.build().encode());
        C53254m.m205929e().mo102658b();
        C53241h.m205898b("sdk", "result: " + _initSDK);
        RustTask kVar = this.mNetProxyTask;
        if (kVar != null && (command = this.mNetProxyCommand) != null) {
            invokeSetNetProxy(command, kVar);
            this.mNetProxyCommand = null;
            this.mNetProxyTask = null;
        }
    }

    public static void AsyncCallback(long j, boolean z, byte[] bArr) {
        handleAsyncCallback(j, z, bArr, false);
    }

    public static void OnFetchResponse(long j, boolean z, byte[] bArr) {
        LarkNet.f48391b.mo67184a(j, z, bArr);
    }

    public final void invokeAsync(final int i, final byte[] bArr, final long j) {
        boolean z;
        AbstractC53238e d = C53254m.m205928d();
        if (d != null) {
            z = d.mo102656d();
        } else {
            z = false;
        }
        if (!z || !C19847o.m72384a() || this.mHandlerThread.mo67197a() == null) {
            _invokeAsync(i, bArr, j);
            return;
        }
        C53241h.m205898b("sdk", "call command = " + i + "run in SerialTaskHandler");
        this.mHandlerThread.mo67197a().post(new Runnable() {
            /* class com.bytedance.lark.sdk.Sdk.RunnableC198273 */

            public void run() {
                Sdk._invokeAsync(i, bArr, j);
            }
        });
    }

    public static final byte[] invoke(Command command, byte[] bArr, String str, C53253l lVar) {
        C53254m.m205931g().mo178036a(command);
        return mSdkInitiatorInterceptor.mo67202a(command, bArr, str, lVar);
    }

    public byte[] getInitSetting(String str, String str2, int i, String str3) {
        try {
            byte[] _getInitSettings = _getInitSettings(str, str2, i, str3);
            C53241h.m205898b("sdk", "getInitSetting native success");
            return _getInitSettings;
        } catch (Exception e) {
            C53241h.m205895a("sdk", "getInitSetting native success", e);
            return null;
        }
    }

    public static void handleAsyncCallback(long j, final boolean z, final byte[] bArr, boolean z2) {
        C53241h.m205899c("sdk", "taskId:" + j + ",err:" + z + ",msg:" + bArr);
        Map<Long, AbstractC19831c> map = sTaskId2CallbackMap;
        final AbstractC19831c cVar = map.get(Long.valueOf(j));
        if (!z2) {
            map.remove(Long.valueOf(j));
        }
        if (cVar == null) {
            C53241h.m205894a("sdk", "AsyncCallback: taskId not find callback， taskId = " + j);
            return;
        }
        boolean a = cVar.mo67179a();
        sDispatcher.mo67169a(new Runnable() {
            /* class com.bytedance.lark.sdk.Sdk.RunnableC198262 */

            public void run() {
                cVar.AsyncCallback(z, bArr);
            }
        }, a);
    }

    public static final void invokeAsync(Command command, byte[] bArr, String str, AbstractC19831c cVar, StreamDataSource streamDataSource) {
        invokeAsync(command, bArr, str, cVar, streamDataSource, null);
    }

    public byte[] getAvatar(long j, String str, int i, float f, String str2) {
        try {
            byte[] _getAvatar = _getAvatar(j, str, i, f, str2);
            C53241h.m205898b("sdk", "getAvatar native success, key is:" + str);
            return _getAvatar;
        } catch (Exception e) {
            e.printStackTrace();
            C53241h.m205895a("sdk", "getAvatar failed, key is:" + str, e);
            return null;
        }
    }

    public static final void invokeAsync(Command command, byte[] bArr, String str, AbstractC19831c cVar, StreamDataSource streamDataSource, C53253l lVar) {
        long availableTaskId = getAvailableTaskId();
        sTaskId2CallbackMap.put(Long.valueOf(availableTaskId), mSdkRequestInterceptor.mo67203a(command, cVar));
        C53241h.m205899c("sdk", "invokeAsync taskId:" + availableTaskId + ",command:" + command.name());
        mSdkInitiatorInterceptor.mo67201a(command, bArr, availableTaskId, str, streamDataSource, lVar);
        C53254m.m205931g().mo178036a(command);
    }

    public static final void invokePassTroughAsync(int i, byte[] bArr, String str, AbstractC19831c cVar, StreamDataSource streamDataSource, C53253l lVar) {
        long availableTaskId = getAvailableTaskId();
        sTaskId2CallbackMap.put(Long.valueOf(availableTaskId), mSdkRequestInterceptor.mo67203a(Command.POST_GATEWAY, cVar));
        C53241h.m205899c("sdk", "invokeAsync taskId:" + availableTaskId + ",command:" + i);
        mSdkInitiatorInterceptor.mo67200a(i, bArr, availableTaskId, str, streamDataSource, lVar);
        C53254m.m205931g().mo178036a(Command.POST_GATEWAY);
    }
}
