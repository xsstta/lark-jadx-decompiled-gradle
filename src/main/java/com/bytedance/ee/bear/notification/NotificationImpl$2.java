package com.bytedance.ee.bear.notification;

import com.bytedance.ee.bear.notification.AbstractC10318c;
import com.bytedance.ee.bear.notification.BinderINotificationView;
import java.util.List;

class NotificationImpl$2 extends BinderINotificationView.Stub {
    final /* synthetic */ C10339e this$0;
    final /* synthetic */ AbstractC10318c.AbstractC10319a val$callback;

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g.AbstractC10345a
    public void closeNotification(String str) {
        this.val$callback.mo24913a(str);
    }

    NotificationImpl$2(C10339e eVar, AbstractC10318c.AbstractC10319a aVar) {
        this.this$0 = eVar;
        this.val$callback = aVar;
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g.AbstractC10345a
    public void showNotification(String str, List<String> list, String str2) {
        this.val$callback.mo24914a(str, list, str2);
    }
}
