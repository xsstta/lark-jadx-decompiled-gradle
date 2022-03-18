package com.bytedance.push.settings;

import com.bytedance.push.settings.annotation.Settings;

@Settings(storageKey = "push_multi_process_config", supportMultiProcess = true)
public interface LocalSettings extends ILocalSettings {
    /* renamed from: a */
    void mo69040a(int i);

    /* renamed from: a */
    void mo69041a(String str);

    /* renamed from: a */
    void mo69042a(boolean z);

    /* renamed from: a */
    boolean mo69043a();

    /* renamed from: b */
    String mo69044b();

    /* renamed from: b */
    void mo69045b(String str);

    /* renamed from: c */
    String mo69046c();

    /* renamed from: d */
    int mo69047d();

    /* renamed from: e */
    boolean mo69048e();
}
