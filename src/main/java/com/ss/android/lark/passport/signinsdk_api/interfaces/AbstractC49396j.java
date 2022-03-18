package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.entity.C49368c;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.j */
public interface AbstractC49396j {
    String getAccessTokenConst();

    void getAuthToken(AbstractC49352d<Bundle> dVar);

    String getNetTypeConst();

    void getPhoneInfo(AbstractC49352d<Bundle> dVar);

    String getSecurityPhoneConst();

    boolean initOneKeyLogin(Context context, Map<Integer, C49368c> map, AbstractC49395i iVar);

    SecurityScanResult mobileSecurityScan(Context context);

    void updateSettings(Context context, JSONObject jSONObject);
}
