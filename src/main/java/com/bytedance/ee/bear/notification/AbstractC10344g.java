package com.bytedance.ee.bear.notification;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import java.util.List;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.notification.g */
public interface AbstractC10344g {

    /* renamed from: com.bytedance.ee.bear.notification.g$a */
    public interface AbstractC10345a {
        void closeNotification(String str);

        void showNotification(String str, List<String> list, String str2);
    }

    void notifyNotificationClosed(String str);

    void registerINotification(BinderINotificationView binderINotificationView);

    void unregisterINotification(BinderINotificationView binderINotificationView);
}
