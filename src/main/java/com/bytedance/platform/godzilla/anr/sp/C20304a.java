package com.bytedance.platform.godzilla.anr.sp;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.bytedance.platform.godzilla.p872b.C20309a;
import com.bytedance.platform.godzilla.p872b.C20312d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.bytedance.platform.godzilla.anr.sp.a */
public final class C20304a {

    /* renamed from: a */
    private static Handler f49578a;

    /* renamed from: b */
    private static LinkedList<Runnable> f49579b;

    /* renamed from: b */
    public static void m74059b() {
        Handler handler = f49578a;
        if (handler == null) {
            return;
        }
        if (!handler.hasMessages(1)) {
            Log.d("LinkedListForWorks", "Handler in QueuedWork has no MSG_RUN message,so we send one.");
            final Message obtain = Message.obtain(f49578a);
            obtain.what = 1;
            new Handler().post(new Runnable() {
                /* class com.bytedance.platform.godzilla.anr.sp.C20304a.RunnableC203051 */

                public void run() {
                    obtain.sendToTarget();
                }
            });
            return;
        }
        Log.d("LinkedListForWorks", "Handler in QueuedWork has MSG_RUN message,no need to send one.");
    }

    /* renamed from: c */
    public static void m74060c() {
        LinkedList<Runnable> linkedList;
        if (f49578a != null && (linkedList = f49579b) != null) {
            LinkedList linkedList2 = (LinkedList) linkedList.clone();
            f49579b.clear();
            f49578a.removeMessages(1);
            if (linkedList2.size() > 0) {
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m74057a() {
        if (Build.VERSION.SDK_INT <= 29) {
            try {
                Class<?> cls = Class.forName("android.app.QueuedWork");
                Field a = C20309a.m74066a(cls, "sFinishers");
                if (a != null) {
                    a.setAccessible(true);
                    LinkedList linkedList = (LinkedList) a.get(null);
                    if (linkedList != null) {
                        a.set(null, new LinkedListProxyForFinishers(linkedList));
                    }
                    Field a2 = C20309a.m74066a(cls, "sWork");
                    if (a2 != null) {
                        a2.setAccessible(true);
                        LinkedList linkedList2 = (LinkedList) a2.get(null);
                        if (linkedList2 != null) {
                            LinkedListProxyForWorks linkedListProxyForWorks = new LinkedListProxyForWorks(linkedList2);
                            f49579b = linkedListProxyForWorks;
                            a2.set(null, linkedListProxyForWorks);
                        }
                        Method a3 = C20312d.m74079a(cls, "getHandler", new Class[0]);
                        if (a3 != null) {
                            a3.setAccessible(true);
                            Handler handler = (Handler) a3.invoke(null, new Object[0]);
                            f49578a = handler;
                            m74058a(handler);
                            Log.d("QueuedWkPyAOrEAndroid0", "Above android 0,replaceQueueWorkPendingWorkFinishers success.");
                            Log.d("QueuedWkPyAOrEAndroid0", "end hook, time stamp = " + System.currentTimeMillis());
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("QueuedWkPyAOrEAndroid0", "Above android 0, hook sPendingWorkFinishers fail.", e);
            }
        }
    }

    /* renamed from: a */
    private static void m74058a(Handler handler) {
        if (handler != null) {
            try {
                Field a = C20309a.m74066a(Class.forName(Handler.class.getName()), "mCallback");
                if (a != null) {
                    a.setAccessible(true);
                    a.set(handler, new Handler.Callback() {
                        /* class com.bytedance.platform.godzilla.anr.sp.C20304a.C203062 */

                        public boolean handleMessage(Message message) {
                            if (message.what == 1) {
                                Log.d("LinkedListForWorks", "Hint the message MSG_RUN.");
                                try {
                                    C20304a.m74060c();
                                } catch (ConcurrentModificationException e) {
                                    Log.d("QueuedWorkProxyAboveO", e.toString());
                                }
                            }
                            return true;
                        }
                    });
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
        }
    }
}
