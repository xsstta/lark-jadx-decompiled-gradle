package com.ss.android.lark.app.monitor.filedeletion;

import com.ss.android.lark.appsetting.annotation.AppConfig;
import java.util.List;

@AppConfig(key = "file_deletion_filter_config")
public class FileDeletionFilterConfig {

    /* renamed from: a */
    public List<String> f72547a;

    /* renamed from: b */
    public List<String> f72548b;

    public String toString() {
        return "FileDeletionFilterConfig{blackList=" + this.f72547a + ", whiteList=" + this.f72548b + '}';
    }
}
