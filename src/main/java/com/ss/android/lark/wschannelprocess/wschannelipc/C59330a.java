package com.ss.android.lark.wschannelprocess.wschannelipc;

import android.content.Context;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelprocess.C59300b;
import com.ss.android.lark.wschannelprocess.C59307d;
import com.ss.android.lark.wschannelprocess.IMainProcIPCServer;
import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import com.ss.android.lark.wschannelprocess.statistics.AbstractC59317b;
import com.ss.android.lark.wschannelprocess.statistics.p2987a.C59316b;
import com.ss.android.lark.wschannelprocess.statistics.p2988b.C59319b;
import ee.android.framework.manis.C68183b;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.lark.wschannelprocess.wschannelipc.a */
public class C59330a {

    /* renamed from: a */
    private C59316b f147302a;

    /* renamed from: b */
    private C59319b f147303b;

    /* renamed from: c */
    private ExecutorService f147304c;

    public C59330a() {
        m230341c();
    }

    /* renamed from: b */
    public boolean mo201659b() {
        IMainProcIPCServer a = mo201655a(true);
        if (a == null) {
            Log.m165383e("MainProcessIPCClient", "getMainProcDozeState get IMainProcIPCServer null");
            return false;
        }
        a.removeMainProcDozeStateForWhile();
        return true;
    }

    /* renamed from: c */
    private void m230341c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("ws_recorder"));
        this.f147304c = newSingleThreadExecutor;
        C59316b bVar = new C59316b(newSingleThreadExecutor);
        this.f147302a = bVar;
        bVar.mo201632a(new AbstractC59317b<AppLogEntity>() {
            /* class com.ss.android.lark.wschannelprocess.wschannelipc.C59330a.C593311 */

            @Override // com.ss.android.lark.wschannelprocess.statistics.AbstractC59317b
            /* renamed from: a */
            public boolean mo201633a(List<AppLogEntity> list) {
                IMainProcIPCServer a = C59330a.this.mo201655a(false);
                if (a == null) {
                    Log.m165383e("MainProcessIPCClient", "getMainProcDozeState get IMainProcIPCServer null");
                    return false;
                }
                Log.m165379d("MainProcessIPCClient", "upload applog record ipc begin");
                a.uploadAppLogRecord(list);
                return true;
            }
        });
        C59319b bVar2 = new C59319b(this.f147304c);
        this.f147303b = bVar2;
        bVar2.mo201637a(new AbstractC59317b<TeaLogEntity>() {
            /* class com.ss.android.lark.wschannelprocess.wschannelipc.C59330a.C593322 */

            @Override // com.ss.android.lark.wschannelprocess.statistics.AbstractC59317b
            /* renamed from: a */
            public boolean mo201633a(List<TeaLogEntity> list) {
                IMainProcIPCServer a = C59330a.this.mo201655a(false);
                if (a == null) {
                    Log.m165383e("MainProcessIPCClient", "getMainProcDozeState get IMainProcIPCServer null");
                    return false;
                }
                Log.m165379d("MainProcessIPCClient", "upload tea record ipc begin");
                a.uploadTeaRecord(list);
                return true;
            }
        });
    }

    /* renamed from: a */
    public boolean mo201658a() {
        IMainProcIPCServer a = mo201655a(false);
        if (a == null) {
            Log.m165383e("MainProcessIPCClient", "getMainProcDozeState get IMainProcIPCServer null");
            return true;
        }
        boolean mainProcDozeState = a.getMainProcDozeState();
        Log.m165389i("MainProcessIPCClient", "getMainProcDozeState get Main proc doze state is " + mainProcDozeState);
        return mainProcDozeState;
    }

    /* renamed from: a */
    public void mo201656a(AppLogEntity appLogEntity) {
        this.f147302a.mo201631a(appLogEntity);
    }

    /* renamed from: a */
    public void mo201657a(TeaLogEntity teaLogEntity) {
        this.f147303b.mo201636a(teaLogEntity);
    }

    /* renamed from: a */
    public IMainProcIPCServer mo201655a(boolean z) {
        Context a = C59307d.m230286b().mo177782a();
        if (z) {
            Log.m165397w("MainProcessIPCClient", "getMainProcIPCServer bForce is true");
            return (IMainProcIPCServer) C68183b.m264839a().mo237086a(a, IMainProcIPCServer.class);
        } else if (C59300b.m230259a(a)) {
            return (IMainProcIPCServer) C68183b.m264839a().mo237086a(a, IMainProcIPCServer.class);
        } else {
            Log.m165397w("MainProcessIPCClient", "getMainProcIPCServer found main process not exist");
            return null;
        }
    }
}
