package com.ss.android.lark.app.monitor.filedeletion;

import android.util.Pair;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.diskmanage.monitor.C36819a;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.app.monitor.filedeletion.a */
public class C28931a implements C36819a.AbstractC36821a {
    @Override // com.ss.android.lark.diskmanage.monitor.C36819a.AbstractC36821a
    /* renamed from: a */
    public Pair<List<String>, List<String>> mo102669a() {
        FileDeletionFilterConfig fileDeletionFilterConfig = (FileDeletionFilterConfig) SettingManager.getInstance().get(FileDeletionFilterConfig.class);
        Log.m165389i("FileDeletionDependency", "file_deletion_filter_config config value: " + fileDeletionFilterConfig);
        if (fileDeletionFilterConfig != null) {
            return new Pair<>(fileDeletionFilterConfig.f72548b, fileDeletionFilterConfig.f72547a);
        }
        return null;
    }
}
