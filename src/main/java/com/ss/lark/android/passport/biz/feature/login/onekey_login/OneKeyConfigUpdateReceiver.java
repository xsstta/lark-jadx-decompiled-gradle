package com.ss.lark.android.passport.biz.feature.login.onekey_login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;

public class OneKeyConfigUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private final PassportLog f163480a = PassportLog.f123351c.mo171474a();

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if (TextUtils.equals(intent.getAction(), "com.ss.android.lark.passport.common.config.update")) {
                this.f163480a.mo171465b("OneKeyConfigUpdateReceiver", "received one key config update action");
                OneKeyAuthUtil.f163513a.mo223821a(PassportConfigCenter.f123034a.mo171113d().getOneKeyAuthData());
                return;
            }
            PassportLog passportLog = this.f163480a;
            passportLog.mo171471d("OneKeyConfigUpdateReceiver", "received broadcast but action is " + intent.getAction());
        }
    }
}
