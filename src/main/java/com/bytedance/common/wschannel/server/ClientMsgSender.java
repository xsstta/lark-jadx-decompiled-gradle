package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.AbsWsClientService;
import com.ss.android.message.C59438c;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ClientMsgSender {
    private final ISender mSender;
    public final Class<? extends AbsWsClientService> mTargetServiceClass;

    public interface ISender {
        void sendMsg(Intent intent);

        void tryResendMsg();
    }

    public void tryResendMsg() {
        this.mSender.tryResendMsg();
    }

    private class OSender implements ISender {
        private Runnable mBindServiceTimeoutRunnable = new Runnable() {
            /* class com.bytedance.common.wschannel.server.ClientMsgSender.OSender.RunnableC36761 */

            public void run() {
                synchronized (OSender.this.mLock) {
                    Logger.m15167d("WsChannelSdk", "mBindServiceTimeoutRunnable run");
                    if (OSender.this.mBinding) {
                        OSender.this.mBinding = false;
                    }
                }
            }
        };
        public boolean mBinding = false;
        public final Context mContext;
        private Runnable mDisconnectRunnable = new Runnable() {
            /* class com.bytedance.common.wschannel.server.ClientMsgSender.OSender.RunnableC36772 */

            public void run() {
                synchronized (OSender.this.mLock) {
                    try {
                        if (OSender.this.serviceConnection != null) {
                            OSender.this.mContext.unbindService(OSender.this.serviceConnection);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    OSender.this.serviceConnection = null;
                    OSender.this.service = null;
                    Logger.m15167d("WsChannelSdk", "mDisconnectRunnable timeout");
                }
            }
        };
        public final Object mLock = new Object();
        final AtomicInteger mMsgCount = new AtomicInteger(0);
        private LinkedBlockingDeque<Intent> mServiceHolderQueue = new LinkedBlockingDeque<>();
        public Messenger service;
        public ServiceConnection serviceConnection;

        public void removeSendBindServiceTimeout() {
            C59438c.m230748a().mo202706c().removeCallbacks(this.mBindServiceTimeoutRunnable);
        }

        private void sendBindServiceTimeout() {
            removeSendBindServiceTimeout();
            C59438c.m230748a().mo202706c().postDelayed(this.mBindServiceTimeoutRunnable, TimeUnit.SECONDS.toMillis(7));
        }

        private synchronized void sendTimeout() {
            removeTimeout();
            C59438c.m230748a().mo202706c().postDelayed(this.mDisconnectRunnable, TimeUnit.SECONDS.toMillis(10));
        }

        public void removeTimeout() {
            try {
                C59438c.m230748a().mo202706c().removeCallbacks(this.mDisconnectRunnable);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onServiceConnected() {
            while (this.mServiceHolderQueue.peek() != null) {
                try {
                    Intent poll = this.mServiceHolderQueue.poll();
                    if (poll != null) {
                        try {
                            send(poll);
                        } catch (DeadObjectException unused) {
                            Logger.m15167d("WsChannelSdk", "onServiceConnected DeadObjectException");
                            this.service = null;
                            this.mServiceHolderQueue.offerFirst(poll);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            }
            sendTimeout();
        }

        @Override // com.bytedance.common.wschannel.server.ClientMsgSender.ISender
        public void tryResendMsg() {
            if (this.mServiceHolderQueue.size() > 0 && this.service == null) {
                Logger.m15167d("WsChannelSdk", "tryResendMsg try reconnect");
                synchronized (this.mLock) {
                    if (this.mServiceHolderQueue.size() > 0 && this.service == null) {
                        doBindService();
                    }
                }
            }
        }

        private void doBindService() {
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "doBindService");
            }
            try {
                this.serviceConnection = new MessengerServiceConnection();
                this.mContext.bindService(new Intent(this.mContext, ClientMsgSender.this.mTargetServiceClass), this.serviceConnection, 1);
                sendBindServiceTimeout();
                this.mBinding = true;
                Logger.m15167d("WsChannelSdk", "doBindService, set mBinding = true");
            } catch (Throwable th) {
                removeSendBindServiceTimeout();
                this.mBinding = false;
                Logger.m15167d("WsChannelSdk", "doBindService error, set Unbind = false");
                th.printStackTrace();
            }
        }

        /* access modifiers changed from: private */
        public class MessengerServiceConnection implements ServiceConnection {
            private MessengerServiceConnection() {
            }

            public void onServiceDisconnected(ComponentName componentName) {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelSdk", "onServiceDisconnected name = " + componentName.toString());
                }
                synchronized (OSender.this.mLock) {
                    if (componentName != null) {
                        try {
                            Logger.m15167d("WsChannelSdk", "onServiceDisconnected set service = null");
                            OSender.this.service = null;
                            OSender.this.mContext.unbindService(this);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        Logger.m15167d("WsChannelSdk", "onServiceDisconnected, set Unbind = false");
                        OSender.this.mBinding = false;
                        OSender.this.removeTimeout();
                        OSender.this.removeSendBindServiceTimeout();
                    }
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelSdk", "onServiceConnected name = " + componentName.toString());
                }
                synchronized (OSender.this.mLock) {
                    OSender.this.removeSendBindServiceTimeout();
                    if (componentName != null && iBinder != null) {
                        try {
                            OSender.this.service = new Messenger(iBinder);
                            Logger.m15167d("WsChannelSdk", "onServiceConnected set service");
                            OSender.this.onServiceConnected();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        Logger.m15167d("WsChannelSdk", "onServiceConnected, set Unbind = false");
                        OSender.this.mBinding = false;
                    }
                }
            }
        }

        private void send(Intent intent) throws RemoteException {
            if (intent != null) {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelSdk", "sendMsg msg = " + intent);
                }
                Messenger messenger = this.service;
                Message message = new Message();
                message.what = 10123;
                message.getData().putParcelable("DATA_INTENT", intent);
                if (messenger != null) {
                    messenger.send(message);
                }
            }
        }

        @Override // com.bytedance.common.wschannel.server.ClientMsgSender.ISender
        public void sendMsg(Intent intent) {
            if (intent != null) {
                if (Logger.debug()) {
                    intent.putExtra("msg_count", this.mMsgCount.addAndGet(1));
                }
                synchronized (this.mLock) {
                    removeTimeout();
                    this.mServiceHolderQueue.offer(intent);
                    if (this.service != null) {
                        onServiceConnected();
                    } else if (!this.mBinding) {
                        doBindService();
                    }
                }
            }
        }

        OSender(Context context) {
            this.mContext = context;
        }
    }

    public void sendMsg(Intent intent) {
        this.mSender.sendMsg(intent);
    }

    private class DefaultSender implements ISender {
        private final Context mContext;

        @Override // com.bytedance.common.wschannel.server.ClientMsgSender.ISender
        public void tryResendMsg() {
        }

        @Override // com.bytedance.common.wschannel.server.ClientMsgSender.ISender
        public void sendMsg(Intent intent) {
            try {
                this.mContext.startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        DefaultSender(Context context) {
            this.mContext = context;
        }
    }

    public ClientMsgSender(Context context, Class<? extends AbsWsClientService> cls) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            this.mSender = new DefaultSender(context);
        } else {
            this.mSender = new OSender(context);
        }
        this.mTargetServiceClass = cls;
    }
}
