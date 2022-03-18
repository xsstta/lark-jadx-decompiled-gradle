package com.ss.android.lark.passport.infra.base.statistics;

import android.text.TextUtils;
import com.larksuite.suite.R;

public enum AuthChannelEnum {
    TYPE_GOOGLE("google", R.drawable.sign_sdk_cp_google),
    TYPE_APPLE("apple_id", R.drawable.sign_sdk_cp_apple),
    TYPE_WECHAT("wechat", R.drawable.sign_sdk_cp_wechat),
    TYPE_OTHERS("others", R.drawable.sign_sdk_cp_default);
    
    private int iconRes;
    private String type;

    public int getIconRes() {
        return this.iconRes;
    }

    public String value() {
        return this.type;
    }

    public static AuthChannelEnum fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return TYPE_OTHERS;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    c = 0;
                    break;
                }
                break;
            case -791770330:
                if (str.equals("wechat")) {
                    c = 1;
                    break;
                }
                break;
            case 1179383840:
                if (str.equals("apple_id")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TYPE_GOOGLE;
            case 1:
                return TYPE_WECHAT;
            case 2:
                return TYPE_APPLE;
            default:
                return TYPE_OTHERS;
        }
    }

    private AuthChannelEnum(String str, int i) {
        this.type = str;
        this.iconRes = i;
    }
}
