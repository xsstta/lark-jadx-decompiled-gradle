package com.bytedance.ee.bear.document.export.net.exportV2;

import com.bytedance.ee.bear.contract.NetService;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "()V", "parse", "json", "", "ExportResultV2", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class GetExportResultParserV2 implements NetService.AbstractC5074c<NetService.Result<ExportResultV2>> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0011JT\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "Ljava/io/Serializable;", "job_status", "", "job_error_msg", "", "fileToken", "fileName", "fileExtension", "file_size", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFileExtension", "()Ljava/lang/String;", "getFileName", "getFileToken", "getFile_size", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getJob_error_msg", "setJob_error_msg", "(Ljava/lang/String;)V", "getJob_status", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/bytedance/ee/bear/document/export/net/exportV2/GetExportResultParserV2$ExportResultV2;", "equals", "", "other", "", "hashCode", "toString", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ExportResultV2 implements Serializable {
        private final String fileExtension;
        private final String fileName;
        private final String fileToken;
        private final Long file_size;
        private String job_error_msg;
        private final int job_status;

        public static /* synthetic */ ExportResultV2 copy$default(ExportResultV2 exportResultV2, int i, String str, String str2, String str3, String str4, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = exportResultV2.job_status;
            }
            if ((i2 & 2) != 0) {
                str = exportResultV2.job_error_msg;
            }
            if ((i2 & 4) != 0) {
                str2 = exportResultV2.fileToken;
            }
            if ((i2 & 8) != 0) {
                str3 = exportResultV2.fileName;
            }
            if ((i2 & 16) != 0) {
                str4 = exportResultV2.fileExtension;
            }
            if ((i2 & 32) != 0) {
                l = exportResultV2.file_size;
            }
            return exportResultV2.copy(i, str, str2, str3, str4, l);
        }

        public final int component1() {
            return this.job_status;
        }

        public final String component2() {
            return this.job_error_msg;
        }

        public final String component3() {
            return this.fileToken;
        }

        public final String component4() {
            return this.fileName;
        }

        public final String component5() {
            return this.fileExtension;
        }

        public final Long component6() {
            return this.file_size;
        }

        public final ExportResultV2 copy(int i, String str, String str2, String str3, String str4, Long l) {
            return new ExportResultV2(i, str, str2, str3, str4, l);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExportResultV2) {
                    ExportResultV2 exportResultV2 = (ExportResultV2) obj;
                    if (!(this.job_status == exportResultV2.job_status) || !Intrinsics.areEqual(this.job_error_msg, exportResultV2.job_error_msg) || !Intrinsics.areEqual(this.fileToken, exportResultV2.fileToken) || !Intrinsics.areEqual(this.fileName, exportResultV2.fileName) || !Intrinsics.areEqual(this.fileExtension, exportResultV2.fileExtension) || !Intrinsics.areEqual(this.file_size, exportResultV2.file_size)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.job_status * 31;
            String str = this.job_error_msg;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.fileToken;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.fileName;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.fileExtension;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Long l = this.file_size;
            if (l != null) {
                i2 = l.hashCode();
            }
            return hashCode4 + i2;
        }

        public String toString() {
            return "ExportResultV2(job_status=" + this.job_status + ", job_error_msg=" + this.job_error_msg + ", fileToken=" + this.fileToken + ", fileName=" + this.fileName + ", fileExtension=" + this.fileExtension + ", file_size=" + this.file_size + ")";
        }

        public final String getFileExtension() {
            return this.fileExtension;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getFileToken() {
            return this.fileToken;
        }

        public final Long getFile_size() {
            return this.file_size;
        }

        public final String getJob_error_msg() {
            return this.job_error_msg;
        }

        public final int getJob_status() {
            return this.job_status;
        }

        public final void setJob_error_msg(String str) {
            this.job_error_msg = str;
        }

        public ExportResultV2(int i, String str, String str2, String str3, String str4, Long l) {
            this.job_status = i;
            this.job_error_msg = str;
            this.fileToken = str2;
            this.fileName = str3;
            this.fileExtension = str4;
            this.file_size = l;
        }
    }

    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<ExportResultV2> parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            NetService.Result<ExportResultV2> result = new NetService.Result<>();
            result.code = jSONObject.optInt("code");
            result.msg = jSONObject.optString("message");
            JSONObject jSONObject2 = new JSONObject(new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).optString("result"));
            result.data = new ExportResultV2(jSONObject2.optInt("job_status"), jSONObject2.optString("job_error_msg"), jSONObject2.optString("file_token"), jSONObject2.optString("file_name"), jSONObject2.optString("file_extension"), Long.valueOf(jSONObject2.optLong("file_size")));
            return result;
        } catch (JSONException unused) {
            throw new NetService.ParseException();
        }
    }
}
