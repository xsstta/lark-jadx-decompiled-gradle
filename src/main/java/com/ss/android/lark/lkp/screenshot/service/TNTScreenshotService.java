package com.ss.android.lark.lkp.screenshot.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.lkp.screenshot.dto.IScreenshotAPI;
import com.ss.android.lark.lkp.screenshot.receiver.ScreenShotReceiverManager;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/service/TNTScreenshotService;", "Lcom/ss/android/lark/lkp/screenshot/dto/IScreenshotAPI;", "Landroid/os/Handler$Callback;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCurrentConnection", "Landroid/content/ServiceConnection;", "mScreenshotConnection", "handleMessage", "", "msg", "Landroid/os/Message;", "requestScreenshot", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/biz/im/api/LKPType;", "callBack", "Lcom/ss/android/lark/biz/im/api/IScreenshotCallBack;", "sendScreenshotCmd", "ScreenShotCallbackWrapper", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.lkp.screenshot.c.b */
public final class TNTScreenshotService implements Handler.Callback, IScreenshotAPI {

    /* renamed from: a */
    public ServiceConnection f105608a;

    /* renamed from: b */
    private ServiceConnection f105609b;

    /* renamed from: c */
    private final Context f105610c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/service/TNTScreenshotService$ScreenShotCallbackWrapper;", "Lcom/ss/android/lark/biz/im/api/IScreenshotCallBack;", "callBack", "(Lcom/ss/android/lark/biz/im/api/IScreenshotCallBack;)V", "onFail", "", "errCode", "", "onSuccess", "path", "", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.c.b$a */
    public static final class ScreenShotCallbackWrapper implements IScreenshotCallBack {

        /* renamed from: b */
        public final IScreenshotCallBack f105611b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.lkp.screenshot.c.b$a$a */
        static final class RunnableC41544a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ScreenShotCallbackWrapper f105612a;

            /* renamed from: b */
            final /* synthetic */ int f105613b;

            RunnableC41544a(ScreenShotCallbackWrapper aVar, int i) {
                this.f105612a = aVar;
                this.f105613b = i;
            }

            public final void run() {
                this.f105612a.f105611b.mo106758a(this.f105613b);
                ScreenShotReceiverManager.f105624b.mo149485a().mo149484b(this.f105612a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.lkp.screenshot.c.b$a$b */
        static final class RunnableC41545b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ScreenShotCallbackWrapper f105614a;

            /* renamed from: b */
            final /* synthetic */ String f105615b;

            RunnableC41545b(ScreenShotCallbackWrapper aVar, String str) {
                this.f105614a = aVar;
                this.f105615b = str;
            }

            public final void run() {
                this.f105614a.f105611b.mo106759a(this.f105615b);
                ScreenShotReceiverManager.f105624b.mo149485a().mo149484b(this.f105614a);
            }
        }

        public ScreenShotCallbackWrapper(IScreenshotCallBack uVar) {
            Intrinsics.checkParameterIsNotNull(uVar, "callBack");
            this.f105611b = uVar;
        }

        @Override // com.ss.android.lark.biz.im.api.IScreenshotCallBack
        /* renamed from: a */
        public void mo106758a(int i) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC41544a(this, i));
        }

        @Override // com.ss.android.lark.biz.im.api.IScreenshotCallBack
        /* renamed from: a */
        public void mo106759a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC41545b(this, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/lkp/screenshot/service/TNTScreenshotService$sendScreenshotCmd$1", "Landroid/content/ServiceConnection;", "createQrcodeMessage", "Landroid/os/Message;", "createScreenShotMessage", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.c.b$b */
    public static final class ServiceConnectionC41546b implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ TNTScreenshotService f105616a;

        /* renamed from: b */
        final /* synthetic */ LKPType f105617b;

        /* renamed from: a */
        private final Message m164854a() {
            Message obtain = Message.obtain((Handler) null, 2);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_floating_window", false);
            bundle.putBoolean("show_share_button", false);
            Intrinsics.checkExpressionValueIsNotNull(obtain, "msg");
            obtain.setData(bundle);
            obtain.replyTo = new Messenger(new Handler(Looper.getMainLooper(), this.f105616a));
            return obtain;
        }

        /* renamed from: b */
        private final Message m164855b() {
            Message obtain = Message.obtain((Handler) null, 2);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_floating_window", false);
            bundle.putBoolean("quick_shot", true);
            Intrinsics.checkExpressionValueIsNotNull(obtain, "msg");
            obtain.setData(bundle);
            obtain.replyTo = new Messenger(new Handler(Looper.getMainLooper(), this.f105616a));
            return obtain;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f105616a.f105608a = null;
        }

        ServiceConnectionC41546b(TNTScreenshotService bVar, LKPType lKPType) {
            this.f105616a = bVar;
            this.f105617b = lKPType;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Message message;
            Messenger messenger = new Messenger(iBinder);
            if (this.f105617b == LKPType.ScreenShot) {
                message = m164854a();
            } else {
                message = m164855b();
            }
            try {
                messenger.send(message);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public TNTScreenshotService(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        this.f105610c = context;
    }

    public boolean handleMessage(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "msg");
        if (!Intrinsics.areEqual(this.f105609b, this.f105608a)) {
            return true;
        }
        Context context = this.f105610c;
        ServiceConnection serviceConnection = this.f105608a;
        if (serviceConnection == null) {
            Intrinsics.throwNpe();
        }
        context.unbindService(serviceConnection);
        this.f105608a = null;
        return true;
    }

    /* renamed from: a */
    private final boolean m164850a(LKPType lKPType) {
        if (this.f105608a != null) {
            return true;
        }
        ComponentName componentName = new ComponentName("com.android.desktop.systemui", "com.android.desktop.systemui.screenshot.TakeScreenshotService");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        ServiceConnectionC41546b bVar = new ServiceConnectionC41546b(this, lKPType);
        this.f105609b = bVar;
        try {
            Context context = this.f105610c;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            if (context.bindService(intent, bVar, 1)) {
                this.f105608a = this.f105609b;
                Log.m165389i("SCREEN_SHOT_LKP", "bind Success!");
                return true;
            }
            Log.m165389i("SCREEN_SHOT_LKP", "bind Fail!");
            return false;
        } catch (SecurityException e) {
            Log.m165383e("SCREEN_SHOT_LKP", e.getMessage());
        }
    }

    @Override // com.ss.android.lark.lkp.screenshot.dto.IScreenshotAPI
    /* renamed from: a */
    public void mo149468a(LKPType lKPType, IScreenshotCallBack uVar) {
        Intrinsics.checkParameterIsNotNull(lKPType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(uVar, "callBack");
        ScreenShotCallbackWrapper aVar = new ScreenShotCallbackWrapper(uVar);
        ScreenShotReceiverManager.f105624b.mo149485a().mo149482a(aVar);
        if (!m164850a(lKPType)) {
            uVar.mo106758a(1);
            ScreenShotReceiverManager.f105624b.mo149485a().mo149484b(aVar);
        }
    }
}
