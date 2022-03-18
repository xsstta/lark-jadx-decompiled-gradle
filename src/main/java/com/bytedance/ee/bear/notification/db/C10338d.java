package com.bytedance.ee.bear.notification.db;

import android.content.Context;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.notification.bean.Notification;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.p701d.C13615c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.notification.db.d */
public class C10338d {

    /* renamed from: a */
    private static volatile C10338d f27848a;

    /* renamed from: a */
    public static C10338d m43016a() {
        return m43017a(C13615c.f35773a);
    }

    /* renamed from: e */
    private synchronized NotificationDatabase m43018e() {
        return (NotificationDatabase) DBController.m55314a().mo50590b("notification.db");
    }

    /* renamed from: b */
    public List<String> mo39453b() {
        try {
            return m43018e().mo16369m().mo39445b();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new ArrayList();
        }
    }

    /* renamed from: c */
    public LiveData<List<Notification>> mo39454c() {
        try {
            return m43018e().mo16369m().mo39440a(System.currentTimeMillis() / 1000);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new C1174u();
        }
    }

    /* renamed from: d */
    public int mo39455d() {
        try {
            C13479a.m54772d("NotificationDatabaseMan", "deleteNotificationAll");
            return m43018e().mo16369m().mo39439a();
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public static C10338d m43017a(Context context) {
        if (f27848a == null) {
            synchronized (C10338d.class) {
                if (f27848a == null) {
                    f27848a = new C10338d(context);
                }
            }
        }
        return f27848a;
    }

    private C10338d(Context context) {
        try {
            DBController.m55314a().mo50588a("notification.db", new DBController.C13632a(context).mo50597a("notification.db").mo50596a(NotificationDatabase.class));
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: a */
    public void mo39449a(String str) {
        try {
            C13479a.m54772d("NotificationDatabaseMan", "deleteNotificationByNid, nid = " + str);
            m43018e().mo16369m().mo39441a(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
    }

    /* renamed from: b */
    public int mo39452b(String str) {
        try {
            C13479a.m54772d("NotificationDatabaseMan", "updateCloseState, nid = " + str);
            return m43018e().mo16369m().mo39444b(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public long[] mo39450a(Notification notification) {
        try {
            C13479a.m54772d("NotificationDatabaseMan", "insertNotification, notification = " + notification);
            return m43018e().mo16369m().mo39443a(notification);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new long[0];
        }
    }

    /* renamed from: a */
    public long[] mo39451a(List<Notification> list) {
        try {
            C13479a.m54772d("NotificationDatabaseMan", "insertNotificationList, list = " + list);
            return m43018e().mo16369m().mo39442a(list);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return new long[0];
        }
    }
}
