package com.bytedance.ee.bear.drive.biz.importfile.request;

import androidx.core.util.C0844e;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveImportResultException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveImportResultTimeOutException;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.location.LocationRequest;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.List;
import org.apache.http.conn.ConnectTimeoutException;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public class CheckImportRequester {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<ImportCheckResult>> f17895a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C6484a());

    /* renamed from: b */
    private ConnectionService f17896b = C5084ad.m20847d();

    public static class ImportCheckResult implements Serializable {
        private int code;
        private String status;
        private String ticket;
        private List<String> tokens;
        private String type;
        private String url;

        public int getCode() {
            return this.code;
        }

        public String getStatus() {
            return this.status;
        }

        public String getTicket() {
            return this.ticket;
        }

        public List<String> getTokens() {
            return this.tokens;
        }

        public String getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public String toString() {
            return "Result{code='" + this.code + '\'' + ", status=" + this.status + ", ticket=" + this.ticket + ", tokens='" + this.tokens + '\'' + ", type='" + this.type + '\'' + ", url='" + C13721c.m55650d(this.url) + '\'' + '}';
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public void setTicket(String str) {
            this.ticket = str;
        }

        public void setTokens(List<String> list) {
            this.tokens = list;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.CheckImportRequester$a */
    private static class C6484a implements NetService.AbstractC5074c<NetService.Result<ImportCheckResult>> {
        private C6484a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<ImportCheckResult> parse(String str) {
            NetService.Result<ImportCheckResult> result = new NetService.Result<>();
            result.setData((ImportCheckResult) JSON.parseObject(str, ImportCheckResult.class));
            return result;
        }
    }

    public CheckImportRequester(C10917c cVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ ImportCheckResult m26043b(NetService.Result result) throws Exception {
        if (m26041a(result)) {
            return (ImportCheckResult) result.getData();
        }
        throw new DriveImportResultException();
    }

    /* renamed from: a */
    public AbstractC68307f<ImportCheckResult> mo25924a(String str) {
        C13479a.m54764b("CheckImportRequester", "lastTimeCheckImportResult ticket: " + str);
        return AbstractC68307f.m265083a(str).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$CheckImportRequester$dZqeY7hJZkq8_uqJFhJX9nwzHE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CheckImportRequester.this.m26040a(this.f$1, (String) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$CheckImportRequester$AXu6dc3r7oWhi_M9Zul2G_eAgDU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CheckImportRequester.this.m26043b((NetService.Result) obj);
            }
        });
    }

    /* renamed from: b */
    public AbstractC68307f<NetService.Result<ImportCheckResult>> mo25925b(String str) {
        C13479a.m54764b("CheckImportRequester", "checkImportResult");
        NetService.C5077f fVar = new NetService.C5077f("/api/parser/getresult/");
        fVar.mo20143a(2);
        fVar.mo20145a("ticket", str);
        return this.f17895a.mo20141a(fVar);
    }

    /* renamed from: a */
    public static ImportFailedType m26039a(Throwable th) {
        if (th instanceof DriveImportResultTimeOutException) {
            return ImportFailedType.FailedCanRetry;
        }
        if (!(th instanceof NetService.ServerErrorException)) {
            return ImportFailedType.FailedCanRetry;
        }
        int code = ((NetService.ServerErrorException) th).getCode();
        if (code == 11001) {
            return ImportFailedType.FailedOverLimitCount;
        }
        switch (code) {
            case 101:
                return ImportFailedType.FailedType;
            case 102:
                return ImportFailedType.FailedEncrypt;
            case 103:
            case 104:
            case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                return ImportFailedType.FailedCanRetry;
            default:
                switch (code) {
                    case 7000:
                        return ImportFailedType.FailedImportBlockNumberOverLimit;
                    case 7001:
                        return ImportFailedType.FailedImportBlockHierarchyOverLimit;
                    case 7002:
                        return ImportFailedType.FailedImportBlockStorageOverLimit;
                    default:
                        return ImportFailedType.FailedCanContactSupport;
                }
        }
    }

    /* renamed from: b */
    public static C0844e<String, String> m26042b(Throwable th) {
        String str;
        ConnectionService d = C5084ad.m20847d();
        String str2 = "serverFail";
        if ((th instanceof DriveImportResultTimeOutException) || (th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            str2 = "overtime";
            str = "DEC2";
        } else if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            if (code != 88) {
                switch (code) {
                    case 100:
                        str = "DEC24";
                        break;
                    case 101:
                        str = "DEC21";
                        break;
                    case 102:
                        str = "DEC22";
                        break;
                    case 103:
                        str = "DEC18";
                        break;
                    case 104:
                        str = "DEC19";
                        break;
                    case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                        str = "DEC20";
                        break;
                    default:
                        str = code + "";
                        break;
                }
            } else {
                str = "DEC23";
            }
        } else if (d.mo20038b() == null || !d.mo20038b().mo20041b()) {
            str2 = "nativeFail";
            str = "DEC3";
        } else {
            str = C7128a.m28545b(th);
        }
        return new C0844e<>(str2, str);
    }

    /* renamed from: a */
    private boolean m26041a(NetService.Result<ImportCheckResult> result) {
        if (result == null || result.code != 0 || result.getData() == null) {
            return false;
        }
        List<String> tokens = result.getData().getTokens();
        int code = result.getData().getCode();
        if (code == 0 && tokens != null && tokens.size() > 0) {
            return true;
        }
        C13479a.m54772d("CheckImportRequester", "checkImportResult code : " + code);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m26040a(String str, String str2) throws Exception {
        return mo25925b(str);
    }
}
