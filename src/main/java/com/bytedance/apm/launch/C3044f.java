package com.bytedance.apm.launch;

import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.monitor.util.C20164a;
import com.bytedance.monitor.util.C20169b;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.bytedance.apm.launch.f */
public class C3044f {
    /* renamed from: a */
    public static Intent m12748a() {
        try {
            MessageQueue messageQueue = (MessageQueue) C20169b.m73601a(Looper.getMainLooper(), "mQueue");
            synchronized (messageQueue) {
                Message message = (Message) C20169b.m73601a(messageQueue, "mMessages");
                if (message != null && message.getTarget() == C20164a.m73588d() && C20164a.m73585a(message)) {
                    int i = message.what;
                    if (i == 100 || i == 159) {
                        return m12752d(message);
                    }
                }
                Field a = C20169b.m73603a((Class<?>) Message.class, "next");
                a.setAccessible(true);
                while (message != null) {
                    Message message2 = (Message) C20169b.m73602a(a, message);
                    if (message2 != null && message2.getTarget() == C20164a.m73588d() && C20164a.m73585a(message)) {
                        int i2 = message.what;
                        if (i2 == 100 || i2 == 159) {
                            return m12752d(message);
                        }
                    }
                    message = message2;
                }
                return null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    static Intent m12750b(Message message) {
        String str;
        if (message.what == 114 || message.what == 121) {
            str = "intent";
        } else if (message.what == 115) {
            str = "args";
        } else {
            str = "";
        }
        if (str.isEmpty() || message.obj == null) {
            return null;
        }
        try {
            return (Intent) C20169b.m73601a(message.obj, str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    static Intent m12751c(Message message) {
        String str;
        if (message.what == 113) {
            str = "intent";
        } else {
            str = "";
        }
        if (str.isEmpty() || message.obj == null) {
            return null;
        }
        try {
            return (Intent) C20169b.m73601a(message.obj, str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private static Intent m12752d(Message message) {
        int i = message.what;
        if (i != 100) {
            if (i != 121) {
                if (i != 159) {
                    switch (i) {
                        case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                            return m12751c(message);
                        case SmEvents.EVENT_TO /*{ENCODED_INT: 114}*/:
                        case 115:
                            break;
                        default:
                            return null;
                    }
                }
            }
            return m12750b(message);
        }
        return m12749a(message);
    }

    /* renamed from: a */
    static Intent m12749a(Message message) {
        Object obj = message.obj;
        if (Build.VERSION.SDK_INT < 28 && message.what == 100) {
            try {
                return (Intent) C20169b.m73601a(obj, "intent");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        } else if (Build.VERSION.SDK_INT < 28 || message.what != 159) {
            return null;
        } else {
            try {
                List list = (List) C20169b.m73601a(obj, "mActivityCallbacks");
                if (list == null) {
                    return null;
                }
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    if (obj2 != null) {
                        return (Intent) C20169b.m73601a(obj2, "mIntent");
                    }
                }
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }
}
