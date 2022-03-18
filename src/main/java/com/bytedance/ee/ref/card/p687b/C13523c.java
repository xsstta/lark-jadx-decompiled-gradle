package com.bytedance.ee.ref.card.p687b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.applink.C29187c;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;

/* renamed from: com.bytedance.ee.ref.card.b.c */
public class C13523c {

    /* renamed from: com.bytedance.ee.ref.card.b.c$a */
    public static class C13524a extends AbsMetaLoadEntity {

        /* renamed from: a */
        private String f35611a;

        /* renamed from: b */
        private String f35612b;

        /* renamed from: c */
        private String f35613c;

        /* renamed from: d */
        private String f35614d;

        /* renamed from: a */
        public String mo50279a() {
            return this.f35613c;
        }

        /* renamed from: b */
        public String mo50280b() {
            return this.f35614d;
        }

        @Override // com.tt.refer.common.meta.base.AbsMetaLoadEntity
        public String getVersionType() {
            return this.versionType;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("Entity->");
            stringBuffer.append("appId:");
            stringBuffer.append(this.appId);
            stringBuffer.append(" cardId:");
            stringBuffer.append(this.identifier);
            stringBuffer.append(" versionType:");
            stringBuffer.append(this.versionType);
            stringBuffer.append(" token:");
            stringBuffer.append(this.f35614d);
            return stringBuffer.toString();
        }

        @Override // com.tt.refer.common.meta.base.AbsMetaLoadEntity
        public void setVersionType(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.versionType = str;
            }
        }

        public C13524a(String str, String str2) {
            this("sslocal", "card", str, str2, null, null);
        }

        public C13524a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f35611a = str;
            this.appId = str3;
            this.identifier = str4;
            this.f35612b = str2;
            this.f35613c = str5;
            this.f35614d = str6;
            if (!TextUtils.isEmpty(str6)) {
                this.versionType = "preview";
            } else {
                this.versionType = "current";
            }
        }
    }

    /* renamed from: a */
    public static C13524a m54933a(String str) {
        if (!m54934b(str)) {
            AppBrandLogger.m52830i("card_app_launch", "processSchema:schema is not card schema!");
            return null;
        }
        Uri parse = Uri.parse(str);
        try {
            return new C13524a(parse.getScheme(), parse.getAuthority(), parse.getQueryParameter("app_id"), parse.getQueryParameter("card_id"), parse.getQueryParameter("start"), parse.getQueryParameter("token"));
        } catch (Exception e) {
            AppBrandLogger.m52829e("card_app_launch", "processSchema error:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m54934b(String str) {
        boolean z;
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("card_app_launch", "isCardSchema->schema is empty!");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"sslocal".equals(parse.getScheme()) || !"card".equals(parse.getAuthority())) {
            z = false;
        } else {
            z = true;
        }
        if (z || !C29187c.m107300a().mo103470a(parse) || !"/client/widget/open".equals(parse.getPath())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
