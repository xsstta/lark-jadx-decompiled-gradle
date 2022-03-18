package com.bytedance.monitor.collector.p852a;

import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.monitor.collector.a.c */
public class C20125c {

    /* renamed from: f */
    private static Field f49113f;

    /* renamed from: g */
    private static Field f49114g;

    /* renamed from: h */
    private static Field f49115h;

    /* renamed from: i */
    private static Field f49116i;

    /* renamed from: j */
    private static Field f49117j;

    /* renamed from: k */
    private static Field f49118k;

    /* renamed from: a */
    public String f49119a;

    /* renamed from: b */
    public int f49120b;

    /* renamed from: c */
    public long f49121c;

    /* renamed from: d */
    public String f49122d;

    /* renamed from: e */
    public String f49123e;

    public C20125c() {
    }

    public String toString() {
        return "ServiceFollowBean{mServiceName='" + this.f49119a + '\'' + ", mWhat=" + this.f49120b + ", mTimeStamp=" + this.f49121c + ", mToken='" + this.f49122d + '\'' + ", mThreadName='" + this.f49123e + '\'' + '}';
    }

    /* renamed from: a */
    public static C20125c m73451a(Message message) {
        try {
            switch (message.what) {
                case SmEvents.EVENT_TO /*{ENCODED_INT: 114}*/:
                    if (f49113f == null) {
                        f49113f = C20123a.m73449b(message.obj.getClass(), "info");
                    }
                    if (f49114g == null) {
                        f49114g = C20123a.m73449b(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f49113f.get(message.obj);
                    String str = null;
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new C20125c(str, message.what, System.currentTimeMillis(), f49114g.get(message.obj).toString());
                case 115:
                    if (f49115h == null) {
                        f49115h = C20123a.m73449b(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) f49115h.get(message.obj);
                    if (iBinder != null) {
                        return new C20125c(C20126d.m73452a().mo68230a(iBinder), message.what, System.currentTimeMillis(), iBinder.toString());
                    }
                    break;
                case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                    return new C20125c(C20126d.m73452a().mo68230a((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString());
                case 117:
                case 118:
                case 119:
                case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                    if (f49116i == null) {
                        f49116i = C20123a.m73449b(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) f49116i.get(message.obj);
                    if (iBinder2 != null) {
                        return new C20125c(C20126d.m73452a().mo68230a(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString());
                    }
                    break;
                case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                    if (f49117j == null) {
                        f49117j = C20123a.m73449b(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) f49117j.get(message.obj);
                    if (iBinder3 != null) {
                        return new C20125c(C20126d.m73452a().mo68230a(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString());
                    }
                    break;
                case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                    if (f49118k == null) {
                        f49118k = C20123a.m73449b(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) f49118k.get(message.obj);
                    if (iBinder4 != null) {
                        return new C20125c(C20126d.m73452a().mo68230a(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new C20125c("unknow", message.what, System.currentTimeMillis(), "unknow");
    }

    public C20125c(String str, int i, long j, String str2) {
        this.f49119a = str;
        this.f49120b = i;
        this.f49121c = j;
        this.f49122d = str2;
        this.f49123e = Thread.currentThread().getName();
    }
}
