package com.bytedance.ee.plugin.common.log;

import android.util.Log;

class DefaultLog implements ILog {
    DefaultLog() {
    }

    @Override // com.bytedance.ee.plugin.common.log.ILog
    /* renamed from: d */
    public void mo28176d(String str) {
        Log.d("PluginCommon", str);
    }

    @Override // com.bytedance.ee.plugin.common.log.ILog
    /* renamed from: e */
    public void mo28177e(String str) {
        Log.e("PluginCommon", str);
    }

    @Override // com.bytedance.ee.plugin.common.log.ILog
    /* renamed from: i */
    public void mo28179i(String str) {
        Log.i("PluginCommon", str);
    }

    @Override // com.bytedance.ee.plugin.common.log.ILog
    /* renamed from: e */
    public void mo28178e(Throwable th) {
        Log.e("PluginCommon", Log.getStackTraceString(th));
    }
}
