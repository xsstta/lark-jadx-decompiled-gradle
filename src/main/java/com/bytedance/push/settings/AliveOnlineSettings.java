package com.bytedance.push.settings;

import com.bytedance.push.settings.annotation.Settings;
import java.util.List;

@Settings(storageKey = "push_multi_process_config", supportMultiProcess = true)
public interface AliveOnlineSettings extends ISettings {
    /* renamed from: a */
    List<String> mo69002a();

    /* renamed from: a */
    void mo69003a(boolean z);

    /* renamed from: b */
    void mo69004b(boolean z);

    /* renamed from: c */
    void mo69005c(boolean z);

    /* renamed from: d */
    void mo69006d(boolean z);

    /* renamed from: e */
    void mo69007e(boolean z);
}
