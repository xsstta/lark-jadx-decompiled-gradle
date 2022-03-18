package com.bytedance.ee.bear.document.export.net;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class GetExportResultParser implements NetService.AbstractC5074c<NetService.Result<ExportResult>> {

    public class ExportResult implements NonProguard {
        private int status;
        private String ticket;

        public int getStatus() {
            return this.status;
        }

        public String getTicket() {
            return this.ticket;
        }

        public void setStatus(int i) {
            this.status = i;
        }

        /* access modifiers changed from: package-private */
        public void setTicket(String str) {
            this.ticket = str;
        }

        public ExportResult() {
        }
    }

    GetExportResultParser() {
    }

    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<ExportResult> parse(String str) throws NetService.ParseException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            NetService.Result<ExportResult> result = new NetService.Result<>();
            ExportResult exportResult = new ExportResult();
            exportResult.setStatus(jSONObject.optInt(UpdateKey.STATUS));
            exportResult.setTicket(jSONObject.optString("ticket"));
            result.setData(exportResult);
            return result;
        } catch (JSONException unused) {
            throw new NetService.ParseException();
        }
    }
}
