package com.lynx.tasm.provider;

import android.content.Context;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public abstract class CanvasProvider {
    /* renamed from: a */
    public abstract long mo95193a(String str, Long l, boolean z);

    /* renamed from: a */
    public abstract void mo95198a(LynxBaseUI lynxBaseUI);

    /* renamed from: a */
    public abstract void mo95199a(Long l);

    /* renamed from: a */
    public abstract void mo95200a(boolean z);

    /* renamed from: b */
    public abstract void mo95204b(Context context);

    /* renamed from: b */
    public abstract void mo95205b(Long l);

    /* access modifiers changed from: protected */
    public abstract void executeRunnableCalledOnJSThread(Runnable runnable);

    /* access modifiers changed from: protected */
    public native boolean nativeInit(boolean z);

    public native void nativeRunOnJSThread(Runnable runnable);

    /* access modifiers changed from: protected */
    public abstract void onJSException(String str);

    /* access modifiers changed from: protected */
    public abstract boolean onValidateEffectFromJS();

    /* access modifiers changed from: protected */
    public abstract boolean setupHeliumApp(long j, long[] jArr);
}
