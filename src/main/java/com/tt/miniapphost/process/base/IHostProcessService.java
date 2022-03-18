package com.tt.miniapphost.process.base;

import android.os.IBinder;

public interface IHostProcessService {
    IBinder getHostProcessCrossProcessCallBinder();
}
