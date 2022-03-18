package com.bytedance.ee.bear.basesdk;

import com.bytedance.ee.bear.contract.config.DocDynamicConfig;

public interface IDocInit {

    public enum LoginEvent {
        BeforeLogout,
        Login,
        Logout,
        SwitchTenantStart,
        SwitchTenantEnd,
        SwitchTenantFailed
    }

    public enum PreInitPeriod {
        OnAttachBase,
        OnCreate
    }

    /* renamed from: a */
    void mo16959a(int i);

    /* renamed from: a */
    void mo16960a(DocDynamicConfig docDynamicConfig);

    /* renamed from: a */
    void mo16961a(String str);
}
