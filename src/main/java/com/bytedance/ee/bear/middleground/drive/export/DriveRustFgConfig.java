package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.util.io.NonProguard;

public class DriveRustFgConfig implements NonProguard {
    public boolean disable_cdn_download;
    public int max_download_part_size;
    public int max_thread_size;
    public boolean pause_background;

    public String toString() {
        return "DriveRustFgConfig{disable_cdn_download=" + this.disable_cdn_download + ", max_thread_size=" + this.max_thread_size + ", max_download_part_size=" + this.max_download_part_size + ", pause_background=" + this.pause_background + '}';
    }

    public DriveRustFgConfig(boolean z, int i, int i2, boolean z2) {
        this.disable_cdn_download = z;
        this.max_thread_size = i;
        this.max_download_part_size = i2;
        this.pause_background = z2;
    }
}
