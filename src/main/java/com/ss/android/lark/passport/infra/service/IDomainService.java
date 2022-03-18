package com.ss.android.lark.passport.infra.service;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IDomainService;", "", "getAccountsHost", "", "unitType", "Lcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;", "getApiHost", "getAppLogHost", "getOldHost", "getPolicyHost", "getPolicyUrl", "policy", "Lcom/ss/android/lark/passport/infra/service/IDomainService$Policy;", "host", "getTuringHosts", "", "Lcom/ss/android/lark/passport/infra/service/IDomainService$TuringRegion;", "Policy", "TuringRegion", "UrlUnitType", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IDomainService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;", "", "(Ljava/lang/String;I)V", "CURRENT_UNIT", "HOST_UNIT", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UrlUnitType {
        CURRENT_UNIT,
        HOST_UNIT
    }

    String getAccountsHost(UrlUnitType urlUnitType);

    String getApiHost();

    @Deprecated(message = "老模型域名配置，后续需要下掉")
    String getOldHost();

    String getPolicyHost(UrlUnitType urlUnitType);

    String getPolicyUrl(UrlUnitType urlUnitType, Policy policy);

    String getPolicyUrl(String str, Policy policy);

    Map<TuringRegion, String> getTuringHosts();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IDomainService$Policy;", "", "path", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "SERVICE_TERM", "PRIVACY", "FACE_INFO", "REAL_NAME", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Policy {
        SERVICE_TERM("terms"),
        PRIVACY("privacy"),
        FACE_INFO("face-id"),
        REAL_NAME("identity");
        
        private final String path;

        public final String getPath() {
            return this.path;
        }

        private Policy(String str) {
            this.path = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IDomainService$TuringRegion;", "", "region", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRegion", "()Ljava/lang/String;", "CN", "VA", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TuringRegion {
        CN("cn"),
        VA("va");
        
        private final String region;

        public final String getRegion() {
            return this.region;
        }

        private TuringRegion(String str) {
            this.region = str;
        }
    }
}
