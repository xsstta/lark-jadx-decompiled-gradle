package com.bytedance.push.log;

import android.util.Log;

/* renamed from: com.bytedance.push.log.a */
public class C20472a implements ILogger {

    /* renamed from: a */
    private final String f49958a = "BDPush";

    /* renamed from: b */
    private boolean f49959b;

    @Override // com.bytedance.push.log.ILogger
    public boolean debug() {
        return this.f49959b;
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: d */
    public void mo68948d(String str) {
        Log.d("BDPush", str);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: e */
    public void mo68951e(String str) {
        Log.e("BDPush", str);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: i */
    public void mo68954i(String str) {
        Log.d("BDPush", str);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: e */
    public void mo68952e(String str, String str2) {
        Log.d("BDPush", str2);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: d */
    public void mo68949d(String str, String str2) {
        Log.d("BDPush", str + " >>> " + str2);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: i */
    public void mo68955i(String str, String str2) {
        Log.i("BDPush", str + " >>> " + str2);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: e */
    public void mo68953e(String str, String str2, Throwable th) {
        Log.d("BDPush", str + " >>> " + str2);
    }

    @Override // com.bytedance.push.log.ILogger
    /* renamed from: i */
    public void mo68956i(String str, String str2, Throwable th) {
        Log.i("BDPush", str + " >>> " + str2, th);
    }
}
