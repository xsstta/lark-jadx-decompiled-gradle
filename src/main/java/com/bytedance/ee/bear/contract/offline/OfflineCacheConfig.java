package com.bytedance.ee.bear.contract.offline;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "offline_cache_config")
public class OfflineCacheConfig implements NonProguard {
    private boolean offline_cache_enabled = true;
    private boolean only_wifi;
    private int preload_clientvar_frequency = 5000;
    private int preload_clientvar_number_per_time = 10;
    private boolean preload_image_only_wifi = true;
    private int preload_pin_number = 8;
    private int recent_list_lru_max = 100;
    private int recent_list_preload_clientvar_number = 20;
    private long update_clientvar_frequency = 86400000;
    private int update_clientvar_number = 10;

    public int getPreload_clientvar_frequency() {
        return this.preload_clientvar_frequency;
    }

    public int getPreload_clientvar_number_per_time() {
        return this.preload_clientvar_number_per_time;
    }

    public int getPreload_pin_number() {
        return this.preload_pin_number;
    }

    public int getRecent_list_lru_max() {
        return this.recent_list_lru_max;
    }

    public int getRecent_list_preload_clientvar_number() {
        return this.recent_list_preload_clientvar_number;
    }

    public long getUpdate_clientvar_frequency() {
        return this.update_clientvar_frequency;
    }

    public int getUpdate_clientvar_number() {
        return this.update_clientvar_number;
    }

    public boolean isOffline_cache_enabled() {
        return this.offline_cache_enabled;
    }

    public boolean isOnly_wifi() {
        return this.only_wifi;
    }

    public boolean isPreload_image_only_wifi() {
        return this.preload_image_only_wifi;
    }

    public void setOffline_cache_enabled(boolean z) {
        this.offline_cache_enabled = z;
    }

    public void setOnly_wifi(boolean z) {
        this.only_wifi = z;
    }

    public void setPreload_clientvar_frequency(int i) {
        this.preload_clientvar_frequency = i;
    }

    public void setPreload_clientvar_number_per_time(int i) {
        this.preload_clientvar_number_per_time = i;
    }

    public void setPreload_image_only_wifi(boolean z) {
        this.preload_image_only_wifi = z;
    }

    public void setPreload_pin_number(int i) {
        this.preload_pin_number = i;
    }

    public void setRecent_list_lru_max(int i) {
        this.recent_list_lru_max = i;
    }

    public void setRecent_list_preload_clientvar_number(int i) {
        this.recent_list_preload_clientvar_number = i;
    }

    public void setUpdate_clientvar_frequency(long j) {
        this.update_clientvar_frequency = j;
    }

    public void setUpdate_clientvar_number(int i) {
        this.update_clientvar_number = i;
    }
}
