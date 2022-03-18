package com.ss.android.lark.multitask.screencapture;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.C48335j;
import com.ss.android.lark.multitask.IMultitaskDependency;
import com.ss.android.lark.multitask.task.ScreenshotCapturedCallback;
import com.ss.android.lark.multitask_impl.MultitaskScreenCaptureInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/screencapture/CompositeScreenshotCapture;", "Lcom/ss/android/lark/multitask/screencapture/ScreenshotCapture;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "captureScreenshot", "", "callback", "Lcom/ss/android/lark/multitask/task/ScreenshotCapturedCallback;", "Companion", "ScreenshotCaptureImpl", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.screencapture.a */
public final class CompositeScreenshotCapture implements ScreenshotCapture {

    /* renamed from: b */
    public static final Companion f121772b = new Companion(null);

    /* renamed from: a */
    public final Context f121773a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/multitask/screencapture/CompositeScreenshotCapture$Companion;", "", "()V", "TAG", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.screencapture.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CompositeScreenshotCapture(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f121773a = context;
    }

    @Override // com.ss.android.lark.multitask.screencapture.ScreenshotCapture
    /* renamed from: a */
    public void mo169096a(ScreenshotCapturedCallback screenshotCapturedCallback) {
        Class cls;
        IMultitaskDependency.ActivityInfo c = C48335j.m190643a().mo168872c();
        if (c != null) {
            ScreenshotCaptureImpl bVar = new ScreenshotCaptureImpl(this, c.mo168876a(), screenshotCapturedCallback);
            if (Intrinsics.areEqual(c.mo168877b(), "main")) {
                cls = MainProcessScreenshotCaptureService.class;
            } else {
                cls = P0ProcessScreenshotCaptureService.class;
            }
            this.f121773a.bindService(new Intent(this.f121773a, cls), bVar, 1);
        } else if (screenshotCapturedCallback != null) {
            screenshotCapturedCallback.onScreenshotCaptured(0, 0, C48350b.m190714a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/multitask/screencapture/CompositeScreenshotCapture$ScreenshotCaptureImpl;", "Landroid/content/ServiceConnection;", "mostRecentActivity", "", "callback", "Lcom/ss/android/lark/multitask/task/ScreenshotCapturedCallback;", "(Lcom/ss/android/lark/multitask/screencapture/CompositeScreenshotCapture;Ljava/lang/String;Lcom/ss/android/lark/multitask/task/ScreenshotCapturedCallback;)V", "getCallback", "()Lcom/ss/android/lark/multitask/task/ScreenshotCapturedCallback;", "getMostRecentActivity", "()Ljava/lang/String;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.screencapture.a$b */
    public final class ScreenshotCaptureImpl implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ CompositeScreenshotCapture f121774a;

        /* renamed from: b */
        private final String f121775b;

        /* renamed from: c */
        private final ScreenshotCapturedCallback f121776c;

        public void onServiceDisconnected(ComponentName componentName) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                MultitaskScreenCaptureInterface.Stub.asInterface(iBinder).captureScreenshot(this.f121775b, this.f121776c);
            } catch (RemoteException e) {
                Log.m165398w("MULTITASK-CompositeScreenshotCapture", "onServiceConnected, error capture screenshot", e);
            }
            this.f121774a.f121773a.unbindService(this);
        }

        public ScreenshotCaptureImpl(CompositeScreenshotCapture aVar, String str, ScreenshotCapturedCallback screenshotCapturedCallback) {
            Intrinsics.checkParameterIsNotNull(str, "mostRecentActivity");
            this.f121774a = aVar;
            this.f121775b = str;
            this.f121776c = screenshotCapturedCallback;
        }
    }
}
