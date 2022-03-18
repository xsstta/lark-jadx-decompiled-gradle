package com.bytedance.ee.bear.document.export.net.exportV2;

import com.bytedance.ee.bear.contract.NetService;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/export/net/exportV2/CommitExportParserV2;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/CommitExportParserV2$CommitExportResult;", "()V", "parse", "json", "", "CommitExportResult", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommitExportParserV2 implements NetService.AbstractC5074c<NetService.Result<CommitExportResult>> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/document/export/net/exportV2/CommitExportParserV2$CommitExportResult;", "Ljava/io/Serializable;", "ticket", "", "jobTimeout", "", "(Ljava/lang/String;I)V", "getJobTimeout", "()I", "getTicket", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class CommitExportResult implements Serializable {
        private final int jobTimeout;
        private final String ticket;

        public static /* synthetic */ CommitExportResult copy$default(CommitExportResult commitExportResult, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = commitExportResult.ticket;
            }
            if ((i2 & 2) != 0) {
                i = commitExportResult.jobTimeout;
            }
            return commitExportResult.copy(str, i);
        }

        public final String component1() {
            return this.ticket;
        }

        public final int component2() {
            return this.jobTimeout;
        }

        public final CommitExportResult copy(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "ticket");
            return new CommitExportResult(str, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CommitExportResult) {
                    CommitExportResult commitExportResult = (CommitExportResult) obj;
                    if (Intrinsics.areEqual(this.ticket, commitExportResult.ticket)) {
                        if (this.jobTimeout == commitExportResult.jobTimeout) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.ticket;
            return ((str != null ? str.hashCode() : 0) * 31) + this.jobTimeout;
        }

        public String toString() {
            return "CommitExportResult(ticket=" + this.ticket + ", jobTimeout=" + this.jobTimeout + ")";
        }

        public final int getJobTimeout() {
            return this.jobTimeout;
        }

        public final String getTicket() {
            return this.ticket;
        }

        public CommitExportResult(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "ticket");
            this.ticket = str;
            this.jobTimeout = i;
        }
    }

    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<CommitExportResult> parse(String str) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        try {
            JSONObject jSONObject = new JSONObject(str);
            NetService.Result<CommitExportResult> result = new NetService.Result<>();
            result.msg = jSONObject.optString("msg");
            result.code = jSONObject.optInt("code");
            if (result.code == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                String optString = jSONObject2.optString("ticket");
                Intrinsics.checkExpressionValueIsNotNull(optString, "jsonObject.optString(\"ticket\")");
                result.data = new CommitExportResult(optString, jSONObject2.optInt("job_timeout"));
            }
            return result;
        } catch (JSONException unused) {
            throw new NetService.ParseException();
        }
    }
}
