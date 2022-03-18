package com.bytedance.ee.bear.notification.db;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.notification.bean.Notification;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.notification.db.b */
public interface AbstractC10330b {
    /* renamed from: a */
    int mo39439a();

    /* renamed from: a */
    LiveData<List<Notification>> mo39440a(long j);

    /* renamed from: a */
    void mo39441a(String str);

    /* renamed from: a */
    long[] mo39442a(List<Notification> list);

    /* renamed from: a */
    long[] mo39443a(Notification... notificationArr);

    /* renamed from: b */
    int mo39444b(String str);

    /* renamed from: b */
    List<String> mo39445b();
}
