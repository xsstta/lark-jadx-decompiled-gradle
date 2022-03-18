package com.bytedance.platform.horae.p874a.p876b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.platform.horae.common.C20371b;
import com.bytedance.platform.horae.common.C20376g;
import com.bytedance.platform.horae.common.Logger;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.bytedance.platform.horae.a.b.a */
public class C20354a {

    /* renamed from: a */
    public static Method f49677a;

    /* renamed from: b */
    public static MessageQueue f49678b;

    /* renamed from: c */
    private static C20354a f49679c = new C20354a();

    /* renamed from: d */
    private static Object f49680d;

    /* renamed from: e */
    private static Field f49681e;

    /* renamed from: f */
    private static Field f49682f;

    /* renamed from: g */
    private static Field f49683g;

    /* renamed from: h */
    private static Field f49684h;

    /* renamed from: i */
    private static Field f49685i;

    /* renamed from: j */
    private int f49686j;

    /* renamed from: k */
    private int f49687k = -1;

    /* renamed from: l */
    private HandlerC20355a f49688l;

    /* renamed from: m */
    private Method f49689m;

    /* renamed from: a */
    public static C20354a m74172a() {
        return f49679c;
    }

    /* renamed from: b */
    public int mo68667b() {
        try {
            if (f49678b == null || f49681e == null || f49682f == null || f49680d == null || f49683g == null || f49684h == null || f49685i == null) {
                f49678b = (MessageQueue) C20371b.m74215a(Looper.class, "mQueue").get(Looper.getMainLooper());
                f49681e = C20371b.m74215a(MessageQueue.class, "mMessages");
                f49682f = C20371b.m74215a(MessageQueue.class, "mNextBarrierToken");
                Object a = C20376g.m74226a(Class.forName("android.view.WindowManagerGlobal"), "getInstance", new Object[0]);
                f49680d = a;
                f49683g = C20371b.m74215a(a.getClass(), "mRoots");
                f49684h = C20371b.m74215a(Class.forName("android.view.ViewRootImpl"), "mTraversalBarrier");
                f49685i = C20371b.m74215a(Message.class, "next");
                Logger.m74206c("ContentValues", "initBarrierMonitorReflect");
            }
            if (f49677a == null) {
                f49677a = C20371b.m74216a(MessageQueue.class, "removeSyncBarrier", Integer.TYPE);
            }
            if (this.f49688l == null) {
                this.f49688l = new HandlerC20355a(Looper.getMainLooper());
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public int mo68666a(WeakReference<Message> weakReference) {
        return mo68668b(weakReference);
    }

    /* renamed from: com.bytedance.platform.horae.a.b.a$a */
    public class HandlerC20355a extends Handler {
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1001) {
                try {
                    int i = message.arg1;
                    C20354a.f49677a.invoke(C20354a.f49678b, Integer.valueOf(i));
                    Logger.m74205b("ContentValues", "force remove lost barrier for:" + i);
                } catch (Exception e) {
                    Logger.m74205b("ContentValues", "delete barrier message throwable !!!" + e);
                    e.printStackTrace();
                }
            }
        }

        public HandlerC20355a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public int mo68665a(int i) throws Throwable {
        Object obj = f49683g.get(f49680d);
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj2 = arrayList.get(i2);
                if (((Integer) f49684h.get(obj2)).intValue() == i) {
                    Logger.m74207d("ContentValues", "mTraversalBarrier == token : for viewRoot:" + obj2);
                    return -1;
                }
            }
            return 0;
        }
        Logger.m74201a("ContentValues", " mRoots type is:" + obj);
        return -1;
    }

    /* renamed from: b */
    public int mo68668b(WeakReference<Message> weakReference) {
        try {
            Message message = weakReference.get();
            ArrayList arrayList = new ArrayList();
            Message message2 = message;
            int i = 0;
            int i2 = -1;
            while (message2 != null && i < 5 && message2.getTarget() == null && message2.arg1 >= 0) {
                if (message2.arg1 > 0) {
                    Logger.m74207d("ContentValues", "barrier message:" + message2 + " getWhen:" + message2.getWhen());
                }
                i2 = message2.arg1;
                arrayList.add(Integer.valueOf(i2));
                message2 = (Message) f49685i.get(message2);
                i++;
            }
            int size = arrayList.size();
            if (size <= 0) {
                return -1;
            }
            for (int i3 = 0; i3 < size; i3++) {
                if (mo68665a(((Integer) arrayList.get(i3)).intValue()) < 0) {
                    return -1;
                }
            }
            if (this.f49687k != i2) {
                this.f49686j = 0;
                this.f49687k = i2;
            }
            int intValue = ((Integer) f49682f.get(f49678b)).intValue();
            Logger.m74206c("ContentValues", "last barrier message token:" + i2 + " MessageQueue::mNextBarrierToken:" + intValue);
            if (i2 < intValue) {
                this.f49686j++;
            }
            if (this.f49686j < 2) {
                Logger.m74206c("ContentValues", "token < mNextBarrierToken try again,mCheckTime:" + this.f49686j);
                return -1;
            }
            Logger.m74205b("ContentValues", "firstMsg:" + message);
            this.f49688l.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED);
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                int intValue2 = ((Integer) arrayList.get(i5)).intValue();
                if (intValue2 < intValue) {
                    Message obtainMessage = this.f49688l.obtainMessage(CommonCode.StatusCode.API_CLIENT_EXPIRED, intValue2, 0);
                    if (Build.VERSION.SDK_INT >= 22) {
                        obtainMessage.setAsynchronous(true);
                    } else {
                        if (this.f49689m == null) {
                            this.f49689m = C20376g.m74228a((Class<?>) Message.class, "setAsynchronous", Boolean.TYPE);
                        }
                        try {
                            this.f49689m.invoke(obtainMessage, true);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    this.f49688l.sendMessage(obtainMessage);
                    i4 = intValue2;
                }
            }
            this.f49686j = 0;
            this.f49687k = -1;
            return i4;
        } catch (Throwable th2) {
            th2.printStackTrace();
            Logger.m74205b("ContentValues", "checkAndRemoveDangerBarrier throwable !!!");
            return -1;
        }
    }
}
