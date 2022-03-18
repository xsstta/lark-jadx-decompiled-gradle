package com.ss.android.lark.passport.kar.refresh;

import android.text.TextUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.ka.model.KaIdentity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class KaTokenChecker {

    /* renamed from: a */
    private static final PassportLog f123798a = PassportLog.f123351c.mo171474a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Code {
    }

    /* renamed from: b */
    public static boolean m194320b(KaIdentity kaIdentity) {
        if (m194319a(kaIdentity).f123799a != 0 || kaIdentity.tokenExpiresTimestamp - System.currentTimeMillis() > 43200000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C49319a m194319a(KaIdentity kaIdentity) {
        if (kaIdentity == null) {
            f123798a.mo171471d("KaTokenChecker", "checkParams identity is null");
            return new C49319a(2, "ExtraIdentity is null");
        } else if (TextUtils.isEmpty(kaIdentity.externalToken)) {
            f123798a.mo171471d("KaTokenChecker", "checkParams externalToken is empty");
            return new C49319a(2, "externalToken is empty");
        } else if (TextUtils.isEmpty(kaIdentity.refreshToken)) {
            f123798a.mo171471d("KaTokenChecker", "checkParams refreshToken is empty");
            return new C49319a(2, "refreshToken is empty");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            PassportLog passportLog = f123798a;
            passportLog.mo171465b("KaTokenChecker", "checkParams tokenExpiresTimestamp:" + kaIdentity.tokenExpiresTimestamp + ",currentTime: " + currentTimeMillis);
            if (kaIdentity.tokenExpiresTimestamp > currentTimeMillis) {
                passportLog.mo171465b("KaTokenChecker", "checkParams externalToken is already valid");
                return new C49319a(0, "externalToken is already valid");
            }
            passportLog.mo171465b("KaTokenChecker", "checkParams refreshTokenExpiresTimestamp:" + kaIdentity.refreshTokenExpiresTimestamp + ",currentTime: " + currentTimeMillis);
            if (kaIdentity.refreshTokenExpiresTimestamp < currentTimeMillis) {
                passportLog.mo171465b("KaTokenChecker", "checkParams refreshTokenExpires is invalid");
                return new C49319a(2, "refreshTokenExpires is invalid");
            }
            passportLog.mo171465b("KaTokenChecker", "checkParams need refresh token");
            return new C49319a(1, "need refresh token");
        }
    }

    /* renamed from: com.ss.android.lark.passport.kar.refresh.KaTokenChecker$a */
    public static class C49319a {

        /* renamed from: a */
        public int f123799a;

        /* renamed from: b */
        public String f123800b;

        public C49319a(int i, String str) {
            this.f123799a = i;
            this.f123800b = str;
        }
    }
}
