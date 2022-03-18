package com.bytedance.common.wschannel.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;

public class WsChannelClientSdk {
    private static WsChannelClientSdk mInstance = new WsChannelClientSdk();
    public static WeakReference<Context> sContextRef;
    public LinkedBlockingDeque<ServiceHolder> mServiceHolderQueue = new LinkedBlockingDeque<>();
    Messenger service;
    ServiceConnection serviceConnection;

    /* access modifiers changed from: package-private */
    public static class ServiceHolder {
        String key;
        Parcelable obj;
        int what;

        ServiceHolder() {
        }
    }

    public static WsChannelClientSdk inst() {
        return mInstance;
    }

    private WsChannelClientSdk() {
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
    }

    /* access modifiers changed from: package-private */
    public class MessengerServiceConnection implements ServiceConnection {
        MessengerServiceConnection() {
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (componentName != null) {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelSdk", "onServiceDisconnected name = " + componentName.toString());
                }
                try {
                    WsChannelClientSdk.this.service = null;
                    WsChannelClientSdk.this.mServiceHolderQueue.clear();
                    WsChannelClientSdk.this.onServiceDisconnected(componentName);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (componentName != null && iBinder != null) {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelSdk", "onServiceConnected name = " + componentName.toString());
                }
                try {
                    WsChannelClientSdk.this.service = new Messenger(iBinder);
                    WsChannelClientSdk.this.bindOrSendMsg(componentName);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void onEnterToBackground(Context context) {
        sendAppState(context, 2);
    }

    public static void onEnterToForeground(Context context) {
        sendAppState(context, 1);
    }

    public synchronized void bindOrSendMsg(ComponentName componentName) {
        if (this.service == null) {
            doBindService(componentName);
        } else {
            onServiceConnected(componentName);
        }
    }

    private void doBindService(ComponentName componentName) {
        WeakReference<Context> weakReference = sContextRef;
        if (weakReference != null && weakReference.get() != null) {
            Context context = weakReference.get();
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "doBindService");
            }
            if (componentName != null) {
                try {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    MessengerServiceConnection messengerServiceConnection = new MessengerServiceConnection();
                    this.serviceConnection = messengerServiceConnection;
                    context.bindService(intent, messengerServiceConnection, 1);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void onServiceConnected(ComponentName componentName) {
        ServiceHolder poll;
        if (componentName != null) {
            while (this.mServiceHolderQueue.peek() != null && (poll = this.mServiceHolderQueue.poll()) != null) {
                try {
                    Message message = new Message();
                    message.what = poll.what;
                    message.getData().putParcelable(poll.key, poll.obj);
                    try {
                        sendMsg(componentName, message);
                    } catch (DeadObjectException unused) {
                        this.service = null;
                        this.mServiceHolderQueue.offerFirst(poll);
                        return;
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable unused2) {
                    return;
                }
            }
        }
    }

    public static void tryStartPushProcess(Context context, boolean z) {
        tryStartPushProcess(context, z, false);
    }

    private void startPushProcess(final Context context, final boolean z) {
        ThreadPlus.submitRunnable(new Runnable() {
            /* class com.bytedance.common.wschannel.client.WsChannelClientSdk.RunnableC36602 */

            public void run() {
                int i;
                if (context != null) {
                    if (WsChannelClientSdk.sContextRef == null || WsChannelClientSdk.sContextRef.get() == null) {
                        WsChannelClientSdk.sContextRef = new WeakReference<>(context.getApplicationContext());
                    }
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        ServiceHolder serviceHolder = new ServiceHolder();
                        if (z) {
                            i = 9;
                        } else {
                            i = 11;
                        }
                        serviceHolder.what = i;
                        WsChannelClientSdk.this.mServiceHolderQueue.offer(serviceHolder);
                        WsChannelClientSdk.this.bindOrSendMsg(componentName);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        });
    }

    public static void unRegisterApp(Context context, int i) {
        if (context != null) {
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "unRegisterApp");
            }
            mInstance.unregister(context, i);
        }
    }

    public static void registerApp(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (WsChannelSettings.inst(context).isEnable() && ssWsApp != null) {
                mInstance.register(context, ssWsApp);
            }
        }
    }

    private void sendMsg(ComponentName componentName, Message message) throws RemoteException {
        if (componentName != null) {
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "sendMsg msg = " + message.toString() + " , + what = " + message.what);
            }
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(message);
            }
        }
    }

    public static void onParameterChange(Context context, SsWsApp ssWsApp) {
        if (context != null && ssWsApp != null) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "onParameterChange" + ssWsApp.toString());
            }
            if (WsChannelSettings.inst(context).isEnable()) {
                mInstance.sendParameterChange(context, ssWsApp);
            }
        }
    }

    private void register(Context context, IWsApp iWsApp) {
        if (context != null && iWsApp != null) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "register wsApp = " + iWsApp.toString());
            }
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    ServiceHolder serviceHolder = new ServiceHolder();
                    serviceHolder.key = "ws_app";
                    serviceHolder.obj = iWsApp;
                    serviceHolder.what = 0;
                    this.mServiceHolderQueue.offer(serviceHolder);
                    bindOrSendMsg(componentName);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private static void sendAppState(Context context, int i) {
        if (context != null && i > 0 && i <= 3) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "sendAppState appState = " + i);
            }
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
                    intent.setComponent(componentName);
                    intent.putExtra("app_state", i);
                    context.startService(intent);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void sendParameterChange(Context context, IWsApp iWsApp) {
        if (context != null && iWsApp != null) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "sendParameterChange wsApp = " + iWsApp.toString());
            }
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    ServiceHolder serviceHolder = new ServiceHolder();
                    serviceHolder.key = "ws_app";
                    serviceHolder.obj = iWsApp;
                    serviceHolder.what = 4;
                    this.mServiceHolderQueue.offer(serviceHolder);
                    bindOrSendMsg(componentName);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void unregister(Context context, int i) {
        if (context != null) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "unregister channelId = " + i);
            }
            try {
                ComponentName componentName = new ComponentName(context, WsChannelService.class);
                ServiceHolder serviceHolder = new ServiceHolder();
                serviceHolder.key = "ws_app";
                serviceHolder.obj = new IntegerParcelable(i);
                serviceHolder.what = 1;
                this.mServiceHolderQueue.offer(serviceHolder);
                bindOrSendMsg(componentName);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void sendPayload(Context context, WsChannelMsg wsChannelMsg) {
        if (context != null && wsChannelMsg != null) {
            WeakReference<Context> weakReference = sContextRef;
            if (weakReference == null || weakReference.get() == null) {
                sContextRef = new WeakReference<>(context.getApplicationContext());
            }
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "sendPayload wsChannelMsg = " + wsChannelMsg.toString());
            }
            if (WsChannelSettings.inst(context).isEnable()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    ServiceHolder serviceHolder = new ServiceHolder();
                    serviceHolder.key = "payload";
                    serviceHolder.obj = wsChannelMsg;
                    serviceHolder.what = 5;
                    this.mServiceHolderQueue.offer(serviceHolder);
                    bindOrSendMsg(componentName);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void tryStartPushProcess(final Context context, boolean z, boolean z2) {
        if (z) {
            mInstance.startPushProcess(context, z2);
        } else {
            ThreadPlus.submitRunnable(new Runnable() {
                /* class com.bytedance.common.wschannel.client.WsChannelClientSdk.RunnableC36591 */

                public void run() {
                    try {
                        context.startService(new Intent(context, WsChannelService.class));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }
}
