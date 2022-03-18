package com.tt.miniapp;

import android.os.IBinder;
import com.tt.miniapphost.process.base.IHostProcessService;
import com.tt.miniapphost.process.base.MiniApp2HostBinderStub;

public class AppbrandHostProcessImpl implements IHostProcessService {
    @Override // com.tt.miniapphost.process.base.IHostProcessService
    public IBinder getHostProcessCrossProcessCallBinder() {
        return new MiniApp2HostBinderStub().asBinder();
    }
}
