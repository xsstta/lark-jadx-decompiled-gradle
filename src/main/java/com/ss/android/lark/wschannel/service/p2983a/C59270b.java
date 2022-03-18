package com.ss.android.lark.wschannel.service.p2983a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.wschannel.service.IWschannelService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.wschannel.service.a.b */
public class C59270b implements IWschannelService {

    /* renamed from: a */
    public static final List<WSConnState.AbstractC29537a> f147227a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private static ExecutorService f147228b;

    /* renamed from: c */
    private static Executor f147229c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.wschannel.service.a.b$a */
    public static class C59276a {

        /* renamed from: a */
        public static final C59270b f147238a = new C59270b();
    }

    /* renamed from: b */
    public static final C59270b m230203b() {
        return C59276a.f147238a;
    }

    static {
        ExecutorService newSerialCpuDensityThreadPool = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("thread-pool-wschannel");
        f147228b = newSerialCpuDensityThreadPool;
        f147229c = newSerialCpuDensityThreadPool;
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: a */
    public NetworkLevelListener.NetworkLevel mo201516a() {
        return C59267a.m230194a().mo201526b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.wschannel.service.a.b$5 */
    public static /* synthetic */ class C592755 {

        /* renamed from: a */
        static final /* synthetic */ int[] f147237a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse$Status[] r0 = com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.wschannel.service.p2983a.C59270b.C592755.f147237a = r0
                com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse$Status r1 = com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse.Status.CLOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.wschannel.service.p2983a.C59270b.C592755.f147237a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse$Status r1 = com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse.Status.OPENING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.wschannel.service.p2983a.C59270b.C592755.f147237a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse$Status r1 = com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.wschannel.service.p2983a.C59270b.C592755.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m230202a(String str) {
        Log.m165379d("WschannelService", str);
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: b */
    public void mo201520b(Context context) {
        C59267a.m230194a().mo201523a(context);
    }

    /* renamed from: a */
    private void m230201a(final GetWebSocketStatusResponse.Status status) {
        f147229c.execute(new Runnable() {
            /* class com.ss.android.lark.wschannel.service.p2983a.C59270b.RunnableC592744 */

            public void run() {
                WSConnState.ConnState connState;
                try {
                    int i = C592755.f147237a[status.ordinal()];
                    if (i == 1) {
                        connState = WSConnState.ConnState.ConnectClosed;
                    } else if (i == 2) {
                        connState = WSConnState.ConnState.Connecting;
                    } else if (i != 3) {
                        connState = WSConnState.ConnState.ConnectUnknown;
                    } else {
                        connState = WSConnState.ConnState.Connected;
                    }
                    for (WSConnState.AbstractC29537a aVar : C59270b.f147227a) {
                        aVar.mo102563a(connState);
                    }
                } catch (Throwable th) {
                    Log.m165384e("WschannelService", "Error when invoke WSChannel connection state listeners!", th);
                }
            }
        });
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: b */
    public void mo201521b(NetworkLevelListener networkLevelListener) {
        C59267a.m230194a().mo201527b(networkLevelListener);
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: b */
    public void mo201522b(final WSConnState.AbstractC29537a aVar) {
        f147229c.execute(new Runnable() {
            /* class com.ss.android.lark.wschannel.service.p2983a.C59270b.RunnableC592722 */

            public void run() {
                C59270b.f147227a.remove(aVar);
            }
        });
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: a */
    public void mo201517a(Context context) {
        C53248k.m205912a().mo181697a(Command.PUSH_WEB_SOCKET_STATUS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.wschannel.service.p2983a.C59270b.C592733 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59270b.this.mo201528a(bArr, str, z, z2);
            }
        });
        C59267a.m230194a().mo201523a(context);
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: a */
    public void mo201518a(NetworkLevelListener networkLevelListener) {
        C59267a.m230194a().mo201525a(networkLevelListener);
    }

    @Override // com.ss.android.lark.wschannel.service.IWschannelService
    /* renamed from: a */
    public void mo201519a(final WSConnState.AbstractC29537a aVar) {
        f147229c.execute(new Runnable() {
            /* class com.ss.android.lark.wschannel.service.p2983a.C59270b.RunnableC592711 */

            public void run() {
                if (aVar != null) {
                    C59270b.f147227a.add(aVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo201528a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            GetWebSocketStatusResponse.Status status = GetWebSocketStatusResponse.ADAPTER.decode(bArr).status;
            m230201a(status);
            int i = C592755.f147237a[status.ordinal()];
            if (i == 1) {
                m230202a("long connection close");
            } else if (i == 2) {
                m230202a("long connection opening");
            } else if (i == 3) {
                m230202a("long connection success");
            }
        } catch (Exception e) {
            Log.m165383e("WschannelService", e.getMessage());
        }
    }
}
