package com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch;

public enum UserSwitchReason {
    Unknown(0, "unknown"),
    SessionInvalid(1, "session_invalid"),
    Logout(2, "logout"),
    EnterApp(3, "enter_app"),
    External(4, "external"),
    AppLink(5, "applink"),
    Unregister(6, "unregister"),
    OperationCenter(7, "operation_center");
    
    private final String desc;
    private final int value;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.UserSwitchReason$a */
    public static class C49378a {

        /* renamed from: a */
        public static final UserSwitchReason[] f123929a = UserSwitchReason.values();
    }

    public String getDesc() {
        return this.desc;
    }

    public int getValue() {
        return this.value;
    }

    public static UserSwitchReason fromValue(int i) {
        UserSwitchReason[] userSwitchReasonArr = C49378a.f123929a;
        for (UserSwitchReason userSwitchReason : userSwitchReasonArr) {
            if (userSwitchReason.value == i) {
                return userSwitchReason;
            }
        }
        return Unknown;
    }

    public static String getDescFromValue(int i) {
        UserSwitchReason[] userSwitchReasonArr = C49378a.f123929a;
        for (UserSwitchReason userSwitchReason : userSwitchReasonArr) {
            if (userSwitchReason.value == i) {
                return userSwitchReason.desc;
            }
        }
        return Unknown.desc;
    }

    private UserSwitchReason(int i, String str) {
        this.value = i;
        this.desc = str;
    }
}
