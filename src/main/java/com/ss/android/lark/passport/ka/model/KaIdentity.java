package com.ss.android.lark.passport.ka.model;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;

public class KaIdentity extends ExtraIdentify {
    private static final PassportLog log = PassportLog.f123351c.mo171474a();
    public long refreshTokenExpiresTimestamp;
    public long tokenExpiresTimestamp;

    public static KaIdentity from(ExtraIdentify extraIdentify) {
        KaIdentity kaIdentity = new KaIdentity();
        if (extraIdentify != null) {
            kaIdentity.externalToken = extraIdentify.externalToken;
            PassportLog passportLog = log;
            passportLog.mo171465b("KaIdentity", "KaIdentity.from token: " + C49160a.m193857b(kaIdentity.externalToken));
            kaIdentity.refreshToken = extraIdentify.refreshToken;
            kaIdentity.tokenExpires = extraIdentify.tokenExpires;
            kaIdentity.refreshTokenExpires = extraIdentify.refreshTokenExpires;
            kaIdentity.openId = extraIdentify.openId;
            passportLog.mo171465b("KaIdentity", "KaIdentity.from tokenExpires: " + C49160a.m193857b(kaIdentity.tokenExpires));
            kaIdentity.tokenExpiresTimestamp = parseTimestamp(extraIdentify.tokenExpires, "tokenExpires error: ");
            kaIdentity.refreshTokenExpiresTimestamp = parseTimestamp(extraIdentify.refreshTokenExpires, "refreshTokenExpires error: ");
        }
        return kaIdentity;
    }

    private static long parseTimestamp(String str, String str2) {
        PassportLog passportLog = log;
        passportLog.mo171465b("KaIdentity", "parseTimestamp expires: " + str);
        long currentTimeMillis = System.currentTimeMillis();
        passportLog.mo171465b("KaIdentity", "parseTimestamp currentTimestamp: " + currentTimeMillis);
        try {
            return currentTimeMillis + (Long.parseLong(str) * 1000);
        } catch (NumberFormatException e) {
            PassportLog passportLog2 = log;
            passportLog2.mo171471d("KaIdentity", str2 + ": " + e.toString());
            return currentTimeMillis;
        }
    }
}
