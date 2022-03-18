package com.bytedance.ee.bear.notification.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotificationResult implements NonProguard {
    private Map<String, Notification> bulletins;

    public Map<String, Notification> getBulletins() {
        return this.bulletins;
    }

    public List<Notification> getNotificationResults() {
        return new ArrayList(this.bulletins.values());
    }

    public void setBulletins(Map<String, Notification> map) {
        this.bulletins = map;
    }
}
