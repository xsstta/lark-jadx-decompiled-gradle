package com.tt.miniapphost.data;

import android.os.IBinder;
import com.tt.miniapphost.process.base.IHostProcessService;

/* renamed from: com.tt.miniapphost.data.d */
public class C67490d implements IHostProcessService {

    /* renamed from: a */
    private IHostProcessService f170199a;

    C67490d() {
    }

    @Override // com.tt.miniapphost.process.base.IHostProcessService
    public IBinder getHostProcessCrossProcessCallBinder() {
        if (m262545a() != null) {
            return this.f170199a.getHostProcessCrossProcessCallBinder();
        }
        return null;
    }

    /* renamed from: a */
    private IHostProcessService m262545a() {
        if (this.f170199a == null) {
            try {
                Object newInstance = Class.forName("com.tt.miniapp.AppbrandHostProcessImpl").newInstance();
                if (newInstance instanceof IHostProcessService) {
                    this.f170199a = (IHostProcessService) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
        return this.f170199a;
    }
}
