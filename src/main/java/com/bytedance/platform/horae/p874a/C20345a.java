package com.bytedance.platform.horae.p874a;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.platform.horae.common.C20371b;
import com.bytedance.platform.horae.common.Logger;
import com.bytedance.platform.horae.p874a.p877c.C20366e;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.horae.a.a */
public class C20345a {

    /* renamed from: g */
    private static Field f49634g;

    /* renamed from: h */
    private static Field f49635h;

    /* renamed from: i */
    private static Field f49636i;

    /* renamed from: j */
    private static Field f49637j;

    /* renamed from: k */
    private static Field f49638k;

    /* renamed from: l */
    private static Field f49639l;

    /* renamed from: m */
    private static Field f49640m;

    /* renamed from: a */
    public String f49641a;

    /* renamed from: b */
    public String f49642b;

    /* renamed from: c */
    private int f49643c;

    /* renamed from: d */
    private long f49644d;

    /* renamed from: e */
    private String f49645e = Thread.currentThread().getName();

    /* renamed from: f */
    private int f49646f;

    public String toString() {
        String str;
        int i = this.f49646f;
        if (i == 0) {
            str = "Not_Followed";
        } else if (i == 9527) {
            str = "System";
        } else if (i == 9528) {
            str = "Schedule";
        } else {
            str = "Error:" + this.f49646f;
        }
        return "ServiceFollowBean{mServiceName='" + this.f49641a + '\'' + ", mWhat=" + this.f49643c + ", mTimeStamp=" + this.f49644d + ", mToken='" + this.f49642b + '\'' + ", mThreadName='" + this.f49645e + '\'' + ", mHandleFlag=" + str + '}';
    }

    /* renamed from: a */
    public static C20345a m74155a(Message message) {
        try {
            switch (message.what) {
                case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                    Object obj = message.obj;
                    if (f49640m == null) {
                        f49640m = C20371b.m74215a(obj.getClass(), "intent");
                    }
                    Intent intent = (Intent) f49640m.get(obj);
                    if (intent != null) {
                        Logger.m74201a("c_receiver", intent.getComponent().getClassName());
                        return new C20345a(intent.getComponent().getClassName(), message.what, System.currentTimeMillis(), "null", 0);
                    }
                    break;
                case SmEvents.EVENT_TO /*{ENCODED_INT: 114}*/:
                    if (f49634g == null) {
                        f49634g = C20371b.m74215a(message.obj.getClass(), "info");
                    }
                    if (f49635h == null) {
                        f49635h = C20371b.m74215a(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f49634g.get(message.obj);
                    String str = null;
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new C20345a(str, message.what, System.currentTimeMillis(), f49635h.get(message.obj).toString(), message.arg2);
                case 115:
                    if (f49636i == null) {
                        f49636i = C20371b.m74215a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) f49636i.get(message.obj);
                    if (iBinder != null) {
                        return new C20345a(C20366e.m74194a().mo68701a(iBinder), message.what, System.currentTimeMillis(), iBinder.toString(), message.arg2);
                    }
                    break;
                case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                    return new C20345a(C20366e.m74194a().mo68701a((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString(), message.arg2);
                case 117:
                case 118:
                case 119:
                case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                    if (f49637j == null) {
                        f49637j = C20371b.m74215a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) f49637j.get(message.obj);
                    if (iBinder2 != null) {
                        return new C20345a(C20366e.m74194a().mo68701a(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString(), message.arg2);
                    }
                    break;
                case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                    if (f49638k == null) {
                        f49638k = C20371b.m74215a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) f49638k.get(message.obj);
                    if (iBinder3 != null) {
                        return new C20345a(C20366e.m74194a().mo68701a(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString(), message.arg2);
                    }
                    break;
                case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                    if (f49639l == null) {
                        f49639l = C20371b.m74215a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) f49639l.get(message.obj);
                    if (iBinder4 != null) {
                        return new C20345a(C20366e.m74194a().mo68701a(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString(), message.arg2);
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new C20345a("unknow", message.what, System.currentTimeMillis(), "unknow", message.arg2);
    }

    public C20345a(String str, int i, long j, String str2, int i2) {
        this.f49641a = str;
        this.f49643c = i;
        this.f49644d = j;
        this.f49642b = str2;
        this.f49646f = i2;
    }
}
