package com.bytedance.ee.bear.contract.drive;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

public class DriveCommonConstants {

    @AppConfig(key = "drive_rust_config")
    public static class DriveRustFgConfig implements NonProguard {
        public boolean disable_cdn_download = true;
        public int max_download_part_size = 3145728;
        public int max_thread_size = 5;
    }
}
