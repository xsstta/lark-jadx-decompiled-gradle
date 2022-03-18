package com.ss.android.lark.passport.biz_variant;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.entity.C49368c;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49395i;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j;
import java.util.Map;
import org.json.JSONObject;

@ClaymoreImpl(AbstractC49396j.class)
public class OneKeyLoginService implements AbstractC49396j {
    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public String getAccessTokenConst() {
        return "";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public void getAuthToken(AbstractC49352d<Bundle> dVar) {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public String getNetTypeConst() {
        return "";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public void getPhoneInfo(AbstractC49352d<Bundle> dVar) {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public String getSecurityPhoneConst() {
        return "";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public boolean initOneKeyLogin(Context context, Map<Integer, C49368c> map, AbstractC49395i iVar) {
        return false;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public SecurityScanResult mobileSecurityScan(Context context) {
        return null;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j
    public void updateSettings(Context context, JSONObject jSONObject) {
    }
}
