package com.ss.android.bytedcert.net;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.messaging.Constants;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1304b.C28317a;
import org.json.JSONObject;

public class BDResponse {
    public C28429c bcResponse;
    public int detailErrorCode;
    public String detailErrorMsg;
    public int errorCode;
    public String errorMsg;
    public JSONObject jsonBody;
    public JSONObject jsonData;
    public String logId;
    public boolean success;
    public String ticket;

    public String toString() {
        return "BDResponse{bcResponse=" + this.bcResponse + ", success=" + this.success + ", errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + '\'' + ", detailErrorCode=" + this.detailErrorCode + ", detailErrorMsg='" + this.detailErrorMsg + '\'' + ", jsonBody=" + this.jsonBody + ", jsonData=" + this.jsonData + ", ticket='" + this.ticket + '\'' + '}';
    }

    public BDResponse(boolean z) {
        if (BytedCertManager.getInstance().getCertInfo() != null) {
            this.ticket = BytedCertManager.getInstance().getCertInfo().f71352b;
        }
        this.success = z;
    }

    public BDResponse(Pair<Integer, String> pair) {
        if (BytedCertManager.getInstance().getCertInfo() != null) {
            this.ticket = BytedCertManager.getInstance().getCertInfo().f71352b;
        }
        if (pair == null) {
            this.errorCode = ((Integer) C28317a.C28318a.f71138b.first).intValue();
            this.errorMsg = (String) C28317a.C28318a.f71138b.second;
        } else {
            this.errorCode = ((Integer) pair.first).intValue();
            this.errorMsg = (String) pair.second;
        }
        this.detailErrorCode = this.errorCode;
        this.detailErrorMsg = this.errorMsg;
    }

    public BDResponse(C28429c cVar) {
        this.bcResponse = cVar;
        this.ticket = BytedCertManager.getInstance().getCertInfo().f71352b;
        if (cVar != null) {
            String b = cVar.mo101228b();
            try {
                if (!TextUtils.isEmpty(b)) {
                    JSONObject jSONObject = new JSONObject(b);
                    this.jsonBody = jSONObject;
                    this.errorCode = jSONObject.optInt("status_code");
                    this.errorMsg = this.jsonBody.optString("description");
                    this.jsonData = this.jsonBody.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    this.logId = this.jsonBody.optString("log_id");
                    if (this.errorCode == 0) {
                        this.success = true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.errorCode = ((Integer) C28317a.C28318a.f71148l.first).intValue();
                this.errorMsg = (String) C28317a.C28318a.f71148l.second;
            }
        } else {
            this.errorCode = ((Integer) C28317a.C28318a.f71138b.first).intValue();
            this.errorMsg = (String) C28317a.C28318a.f71138b.second;
        }
        this.detailErrorCode = this.errorCode;
        this.detailErrorMsg = this.errorMsg;
    }

    public BDResponse(int i, String str) {
        if (BytedCertManager.getInstance().getCertInfo() != null) {
            this.ticket = BytedCertManager.getInstance().getCertInfo().f71352b;
        }
        this.errorCode = ((Integer) C28317a.C28318a.f71137a.first).intValue();
        this.errorMsg = (String) C28317a.C28318a.f71137a.second;
        this.detailErrorCode = i;
        this.detailErrorMsg = str;
    }

    public BDResponse(boolean z, JSONObject jSONObject) {
        if (BytedCertManager.getInstance().getCertInfo() != null) {
            this.ticket = BytedCertManager.getInstance().getCertInfo().f71352b;
        }
        this.success = z;
        this.jsonData = jSONObject;
    }
}
