package com.bytedance.ee.bear.list.listsync.entity;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import java.util.concurrent.TimeUnit;

@AppConfig(key = "list_push_sync_config")
public class SyncPushConfig implements NonProguard {
    private static volatile SyncPushConfig sInstance;
    private long allowed_time_offset = TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES);
    private int background_refresh_size = 50;
    private boolean enable_msg_time_check = true;
    private int first_screen_item_count = 15;
    private int register_size = 100;
    private boolean show_refresh_tips_ui;

    public long getAllowed_time_offset() {
        return this.allowed_time_offset;
    }

    public int getBackground_refresh_size() {
        return this.background_refresh_size;
    }

    public int getFirst_screen_item_count() {
        return this.first_screen_item_count;
    }

    public int getRegister_size() {
        return this.register_size;
    }

    public boolean isEnable_msg_time_check() {
        return this.enable_msg_time_check;
    }

    public boolean isShow_refresh_tips_ui() {
        return this.show_refresh_tips_ui;
    }

    public static SyncPushConfig instance() {
        if (sInstance == null) {
            synchronized (SyncPushConfig.class) {
                if (sInstance == null) {
                    sInstance = (SyncPushConfig) C4211a.m17514a().mo16532a("list_push_sync_config", SyncPushConfig.class, new SyncPushConfig());
                    C13479a.m54764b("list_push_sync_config", "sync config=" + sInstance);
                }
            }
        }
        return sInstance;
    }

    public String toString() {
        return "SyncPushConfig{register_size=" + this.register_size + ", show_refresh_tips_ui=" + this.show_refresh_tips_ui + ", background_refresh_size=" + this.background_refresh_size + ", enable_msg_time_check=" + this.enable_msg_time_check + ", allowed_time_offset=" + this.allowed_time_offset + ", first_screen_item_count=" + this.first_screen_item_count + '}';
    }

    public void setAllowed_time_offset(long j) {
        this.allowed_time_offset = j;
    }

    public void setBackground_refresh_size(int i) {
        this.background_refresh_size = i;
    }

    public void setEnable_msg_time_check(boolean z) {
        this.enable_msg_time_check = z;
    }

    public void setFirst_screen_item_count(int i) {
        this.first_screen_item_count = i;
    }

    public void setRegister_size(int i) {
        this.register_size = i;
    }

    public void setShow_refresh_tips_ui(boolean z) {
        this.show_refresh_tips_ui = z;
    }
}
