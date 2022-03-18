package com.ss.android.lark.ccm_api;

public interface SpacekitConst {

    public @interface DocIconColor {
    }

    public enum LoginEvent {
        BeforeLogout,
        Login,
        Logout,
        SwitchTenantStart,
        SwitchTenantEnd,
        SwitchTenantFailed
    }
}
