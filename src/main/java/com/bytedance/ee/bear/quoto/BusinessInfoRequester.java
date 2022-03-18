package com.bytedance.ee.bear.quoto;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessInfoRequester {

    /* renamed from: a */
    private final NetService.AbstractC5075d<NetService.Result<BusinessInfoResult>> f28331a;

    public static class BusinessAdminInfo implements Serializable {
        @JSONField(name = "en_name")
        public String enName;
        public String name;
        public String uid;
    }

    /* renamed from: com.bytedance.ee.bear.quoto.BusinessInfoRequester$a */
    private static class C10554a implements NetService.AbstractC5074c<NetService.Result<BusinessInfoResult>> {
        private C10554a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<BusinessInfoResult> parse(String str) throws NetService.ParseException {
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<BusinessInfoResult>>() {
                /* class com.bytedance.ee.bear.quoto.BusinessInfoRequester.C10554a.C105551 */
            }, new Feature[0]);
        }
    }

    public static class BusinessInfoResult implements Serializable {
        public List<BusinessAdminInfo> admins;
        @JSONField(name = "is_admin")
        public Boolean isAdmin;
        @JSONField(name = "suite_to_file_size_limit")
        public String suiteToFileSizeLimit;
        @JSONField(name = "suite_type")
        public String suiteType;

        public Map<String, Long> getSuiteToFileSizeLimitMap() {
            return BusinessInfoRequester.m43732a(this.suiteToFileSizeLimit);
        }

        public String toString() {
            return "BusinessInfoResult{suiteType='" + this.suiteType + '\'' + ", suiteToFileSizeLimit='" + this.suiteToFileSizeLimit + '\'' + ", isAdmin=" + this.isAdmin + '}';
        }
    }

    /* renamed from: a */
    public AbstractC68307f<BusinessInfoResult> mo39960a() {
        C13479a.m54764b("BusinessInfoRequester", "pullInfo");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/box/business/info/");
        fVar.mo20143a(2);
        return this.f28331a.mo20141a(fVar).mo238020d($$Lambda$aIgKJZSHrklM0PVuhD2f5UQhIL4.INSTANCE);
    }

    public BusinessInfoRequester(NetService netService) {
        this.f28331a = netService.mo20117a(new C10554a());
    }

    /* renamed from: a */
    public static Map<String, Long> m43732a(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            List<String> a = SuiteTypeVersion.f28438b.mo40061a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                String str2 = a.get(i);
                Long l = parseObject.getLong(str2);
                if (l != null) {
                    hashMap.put(str2, l);
                }
            }
        } catch (JSONException unused) {
            C13479a.m54758a("BusinessInfoRequester", "parseSuiteToFileSizeLimit exception: " + str);
        }
        return hashMap;
    }
}
