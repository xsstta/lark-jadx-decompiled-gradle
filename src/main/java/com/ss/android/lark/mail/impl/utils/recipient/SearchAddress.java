package com.ss.android.lark.mail.impl.utils.recipient;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.ContactSearchType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import java.util.List;

public class SearchAddress extends MailAddress {

    /* renamed from: k */
    private String f111118k = "";

    /* renamed from: l */
    private Long f111119l;

    /* renamed from: m */
    private ContactSearchType f111120m;

    /* renamed from: n */
    private List<String> f111121n;

    /* renamed from: o */
    private List<String> f111122o;

    /* renamed from: p */
    private boolean f111123p;

    /* renamed from: u */
    public String mo156029u() {
        return this.f111118k;
    }

    /* renamed from: v */
    public List<String> mo156030v() {
        return this.f111121n;
    }

    /* renamed from: w */
    public List<String> mo156031w() {
        return this.f111122o;
    }

    /* renamed from: x */
    public ContactSearchType mo156032x() {
        return this.f111120m;
    }

    /* renamed from: y */
    public boolean mo156033y() {
        return this.f111123p;
    }

    /* renamed from: z */
    public Long mo156034z() {
        return this.f111119l;
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.SearchAddress$a */
    public static final class C43799a extends MailAddress.C42062a {

        /* renamed from: l */
        public String f111124l = "";

        /* renamed from: m */
        public ContactSearchType f111125m;

        /* renamed from: n */
        public List<String> f111126n;

        /* renamed from: o */
        public List<String> f111127o;

        /* renamed from: p */
        public boolean f111128p;

        /* renamed from: q */
        public Long f111129q;

        /* renamed from: b */
        public SearchAddress mo151210a() {
            return new SearchAddress(this);
        }

        /* renamed from: a */
        public C43799a mo156036a(Long l) {
            this.f111129q = l;
            return this;
        }

        /* renamed from: b */
        public C43799a mo156039b(List<String> list) {
            this.f111127o = list;
            return this;
        }

        /* renamed from: h */
        public C43799a mo156041h(String str) {
            this.f111124l = str;
            return this;
        }

        /* renamed from: a */
        public C43799a mo156035a(ContactSearchType contactSearchType) {
            this.f111125m = contactSearchType;
            if (contactSearchType != null) {
                super.mo151207a(ContactSearchType.convertToAddressType(contactSearchType.getValue()));
            }
            return this;
        }

        /* renamed from: a */
        public C43799a mo156037a(List<String> list) {
            this.f111126n = list;
            return this;
        }

        /* renamed from: a */
        public C43799a mo156038a(boolean z) {
            this.f111128p = z;
            return this;
        }
    }

    public SearchAddress(C43799a aVar) {
        super(aVar);
        this.f111118k = aVar.f111124l;
        this.f111121n = aVar.f111126n;
        this.f111122o = aVar.f111127o;
        this.f111120m = aVar.f111125m;
        this.f111123p = aVar.f111128p;
        this.f111119l = aVar.f111129q;
    }

    /* renamed from: a */
    public static SearchAddress m173620a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C43799a aVar = new C43799a();
            aVar.mo151209a(jSONObject.getString("username"));
            aVar.mo151212b(jSONObject.getString("address"));
            aVar.mo151213c(jSONObject.getString("userId"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
            aVar.mo151207a(AddressType.fromValue(jSONObject2.getInteger("userType").intValue()));
            aVar.mo156041h(jSONObject2.getString("department"));
            aVar.mo151216f(jSONObject2.getString("tenantId"));
            aVar.mo151214d(jSONObject2.getString("avatarKey"));
            aVar.mo156036a(jSONObject2.getLong("memberCount"));
            aVar.mo156038a(true);
            return aVar.mo151210a();
        } catch (Exception e) {
            Log.m165384e("SearchAddress", "parseFromJSON", e);
            return null;
        }
    }
}
