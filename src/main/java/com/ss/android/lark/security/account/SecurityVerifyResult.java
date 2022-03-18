package com.ss.android.lark.security.account;

import android.text.TextUtils;
import com.ss.android.lark.http.model.BaseResponseModel;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class SecurityVerifyResult extends BaseResponseModel {
    private String mToken;
    private Map<Integer, String> mVerifyResultStatusMap = new HashMap<Integer, String>() {
        /* class com.ss.android.lark.security.account.SecurityVerifyResult.C540571 */

        {
            put(0, "Security verification succeeded");
            put(1, "User canceled, security verification failed");
            put(2, "Incorrect password,security verification failed");
            put(3, "Incorrect password is entered too many times,security verification failed");
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface SecurityVerifyResultStatus {
    }

    public String getToken() {
        return this.mToken;
    }

    public String getVerifyResultText() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", getErrorCode());
            jSONObject.put("errorMessage", this.mVerifyResultStatusMap.get(Integer.valueOf(getErrorCode())));
            if (!TextUtils.isEmpty(this.mToken)) {
                jSONObject.put("token", this.mToken);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            PassportLog.f123351c.mo171474a().mo171462a("SecurityVerifyResult", "build data failed when getVerifyResultText", e);
            return "";
        }
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public static SecurityVerifyResult newInstance(int i) {
        return new SecurityVerifyResult(i, "");
    }

    private SecurityVerifyResult(int i, String str) {
        setCode(i);
        this.mToken = str;
    }

    public static SecurityVerifyResult newInstance(int i, String str) {
        return new SecurityVerifyResult(i, str);
    }
}
