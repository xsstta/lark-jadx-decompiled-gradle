package com.ss.android.lark.multitask;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.floating.FloatingManager;
import com.ss.android.lark.multitask.task.AbstractC48377r;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.multitask.task.MainTaskChangeCallback;
import com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface;
import com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface;
import com.ss.android.lark.multitask.task.RemoteTaskCallback;
import com.ss.android.lark.multitask.task.RemoteTaskSnapshot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class MultitaskRemoteService extends Service {

    /* renamed from: a */
    Handler f121540a;

    /* renamed from: b */
    MultitaskRemoteServiceInterface.Stub f121541b = new MultitaskRemoteServiceInterface.Stub() {
        /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671 */

        public void showTaskListAndDoActionIfTaskDeletedByUserInternal(final RemoteFloatingWindowInterface remoteFloatingWindowInterface) {
            FloatingManager.f121676a.mo169014a(new Function0<Unit>() {
                /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.C482746 */

                /* renamed from: a */
                public Unit invoke() {
                    try {
                        remoteFloatingWindowInterface.call();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void terminateTask(final String str) throws RemoteException {
            MultitaskRemoteService.this.f121540a.post(new Runnable() {
                /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.RunnableC482703 */

                public void run() {
                    GlobalTaskContainerImpl.f121803b.mo169155a(str);
                }
            });
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void watchTaskListChange(MainTaskChangeCallback mainTaskChangeCallback) throws RemoteException {
            Log.m165389i("MULTITASK-MultitaskRemoteService", "watchTaskListChange");
            GlobalTaskContainerImpl.m190797a(mainTaskChangeCallback);
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void showTaskListAndDoActionIfTaskDeletedByUser(final RemoteFloatingWindowInterface remoteFloatingWindowInterface) throws RemoteException {
            Log.m165389i("MULTITASK-MultitaskRemoteService", "showTaskListAndDoActionIfTaskDeletedByUser");
            if (remoteFloatingWindowInterface != null) {
                MultitaskRemoteService.this.f121540a.post(new Runnable() {
                    /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.RunnableC482735 */

                    public void run() {
                        BinderC482671.this.showTaskListAndDoActionIfTaskDeletedByUserInternal(remoteFloatingWindowInterface);
                    }
                });
            }
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void notifyTaskWillEnterBackground(final RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException {
            Log.m165389i("MULTITASK-MultitaskRemoteService", "notifyTaskWillEnterBackground snapshot = " + remoteTaskSnapshot.mo169241c());
            MultitaskRemoteService.this.f121540a.post(new Runnable() {
                /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.RunnableC482681 */

                public void run() {
                    GlobalTaskContainerImpl.f121803b.mo169226b(remoteTaskSnapshot);
                }
            });
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void notifyTaskWillEnterForeground(final String str) throws RemoteException {
            Log.m165389i("MULTITASK-MultitaskRemoteService", "notifyTaskWillEnterForeground task identifier = " + str);
            MultitaskRemoteService.this.f121540a.post(new Runnable() {
                /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.RunnableC482692 */

                public void run() {
                    GlobalTaskContainerImpl.f121803b.mo169161b(str);
                }
            });
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void getTaskSnapshotForTaskId(final String str, final RemoteTaskCallback remoteTaskCallback) throws RemoteException {
            Log.m165389i("MULTITASK-MultitaskRemoteService", "getSnapshotForTaskId task identifier = " + str);
            if (remoteTaskCallback != null) {
                MultitaskRemoteService.this.f121540a.post(new Runnable() {
                    /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.RunnableC482714 */

                    public void run() {
                        GlobalTaskContainerImpl.f121803b.mo169224a(str, new AbstractC48377r() {
                            /* class com.ss.android.lark.multitask.MultitaskRemoteService.BinderC482671.RunnableC482714.C482721 */

                            @Override // com.ss.android.lark.multitask.task.AbstractC48377r
                            /* renamed from: a */
                            public void mo168851a(C48376q qVar) {
                                boolean z;
                                StringBuilder sb = new StringBuilder();
                                sb.append("getTaskSnapshotForTaskId actionPerformed() task == null :");
                                if (qVar == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb.append(z);
                                Log.m165389i("MULTITASK-MultitaskRemoteService", sb.toString());
                                if (qVar == null) {
                                    try {
                                        remoteTaskCallback.actionPerformed(null);
                                    } catch (RemoteException e) {
                                        Log.m165398w("MULTITASK-MultitaskRemoteService", "getTaskSnapshotForTaskId actionPerformed() failed to invoke callback", e);
                                    }
                                } else {
                                    remoteTaskCallback.actionPerformed(RemoteTaskSnapshot.m190749a(qVar));
                                }
                            }
                        });
                    }
                });
            }
        }
    };

    public IBinder onBind(Intent intent) {
        if (this.f121540a == null) {
            this.f121540a = new Handler(Looper.getMainLooper());
        }
        return this.f121541b;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
