package com.ss.android.vc.meeting.module.sharesecurity;

import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.net.request.C63602e;

public enum ShareSecurity {
    UNKNOWN(0),
    FAIL(231216);
    
    private final int value;

    private static boolean isValidValue(int i) {
        if (valueOf(i) != UNKNOWN) {
            return true;
        }
        return false;
    }

    public static ShareSecurity valueOf(int i) {
        ShareSecurity shareSecurity = FAIL;
        if (shareSecurity.value == i) {
            return shareSecurity;
        }
        return UNKNOWN;
    }

    public static boolean isCheckFail(C63602e eVar) {
        if (isValidValue(eVar.mo219899a()) || (eVar.f160598a != null && eVar.f160598a.type == VcMsgInfo.Type.ALERT)) {
            return true;
        }
        return false;
    }

    private ShareSecurity(int i) {
        this.value = i;
    }
}
