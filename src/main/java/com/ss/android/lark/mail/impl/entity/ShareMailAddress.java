package com.ss.android.lark.mail.impl.entity;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.an;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailAddress;

public class ShareMailAddress extends MailAddress {

    /* renamed from: k */
    public String f107008k;

    /* renamed from: com.ss.android.lark.mail.impl.entity.ShareMailAddress$a */
    public static final class C42084a extends MailAddress.C42062a {

        /* renamed from: l */
        public String f107009l;

        /* renamed from: b */
        public ShareMailAddress mo151210a() {
            return new ShareMailAddress(this);
        }
    }

    /* renamed from: u */
    public JSONObject mo151781u() {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f107008k)) {
            str = an.m95036a(20);
        } else {
            str = this.f107008k;
        }
        jSONObject.put("id", (Object) str);
        jSONObject.put("name", (Object) this.f106763a);
        jSONObject.put("address", (Object) this.f106764b);
        jSONObject.put("larkEntityId", (Object) this.f106765c);
        jSONObject.put("larkEntityIdString", (Object) this.f106765c);
        jSONObject.put("larkEntityType", (Object) this.f106766d);
        return jSONObject;
    }

    protected ShareMailAddress(C42084a aVar) {
        super(aVar);
        this.f107008k = aVar.f107009l;
    }

    /* renamed from: a */
    public boolean mo151780a(ShareMailAddress shareMailAddress) {
        if (shareMailAddress == null || TextUtils.isEmpty(shareMailAddress.f107008k) || TextUtils.isEmpty(this.f107008k)) {
            return false;
        }
        return this.f107008k.equals(shareMailAddress.f107008k);
    }

    /* renamed from: a */
    public static ShareMailAddress m167847a(MailAddress mailAddress) {
        if (mailAddress == null) {
            return null;
        }
        C42084a aVar = new C42084a();
        aVar.f106774a = mailAddress.f106763a;
        aVar.f106775b = mailAddress.f106764b;
        aVar.f106776c = mailAddress.f106765c;
        aVar.f106777d = mailAddress.f106766d;
        aVar.f106779f = mailAddress.f106767e;
        aVar.f107009l = an.m95036a(20);
        return aVar.mo151210a();
    }

    /* renamed from: a */
    public static ShareMailAddress m167846a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C42084a aVar = new C42084a();
            aVar.f106774a = jSONObject.getString("name");
            aVar.f106775b = jSONObject.getString("address");
            aVar.f106776c = jSONObject.getString("larkEntityIdString");
            aVar.f106777d = AddressType.fromValue(jSONObject.getInteger("larkEntityType").intValue());
            String string = jSONObject.getString("id");
            if (TextUtils.isEmpty(string)) {
                string = an.m95036a(20);
            }
            aVar.f107009l = string;
            return aVar.mo151210a();
        } catch (Exception e) {
            Log.m165384e("ShareMailAddress", "parseFromSharedAddressJSON", e);
            return null;
        }
    }
}
