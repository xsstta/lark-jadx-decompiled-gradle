package com.ss.android.lark.multitask.screencapture;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/screencapture/P0ProcessScreenshotCaptureService;", "Landroid/app/Service;", "()V", "stub", "Lcom/ss/android/lark/multitask/screencapture/MultitaskScreenCaptureInterfaceStub;", "getStub", "()Lcom/ss/android/lark/multitask/screencapture/MultitaskScreenCaptureInterfaceStub;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class P0ProcessScreenshotCaptureService extends Service {

    /* renamed from: a */
    private final MultitaskScreenCaptureInterfaceStub f121771a = new MultitaskScreenCaptureInterfaceStub();

    public IBinder onBind(Intent intent) {
        return this.f121771a;
    }
}
