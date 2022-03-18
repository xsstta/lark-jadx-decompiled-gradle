package com.bytedance.ee.bear.document.offline.sync;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "offline_db_config")
public class OfflineDbConfig implements NonProguard {
    public long offline_db_item_count = 500;
    public long offline_db_size = 209715200;

    public long getOffline_db_item_count() {
        return this.offline_db_item_count;
    }

    public long getOffline_db_size() {
        return this.offline_db_size;
    }

    public String toString() {
        return "OfflineDbConfig{offline_db_size=" + this.offline_db_size + ", offline_db_item_count=" + this.offline_db_item_count + '}';
    }

    public void setOffline_db_item_count(long j) {
        this.offline_db_item_count = j;
    }

    public void setOffline_db_size(long j) {
        this.offline_db_size = j;
    }
}
