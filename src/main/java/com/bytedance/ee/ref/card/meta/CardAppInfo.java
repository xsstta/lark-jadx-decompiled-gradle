package com.bytedance.ee.ref.card.meta;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.common.meta.base.AbsAppMeta;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardAppInfo extends AbsAppMeta {

    /* renamed from: a */
    private C13547a f35658a = new C13547a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardType {
    }

    /* renamed from: com.bytedance.ee.ref.card.meta.CardAppInfo$a */
    public static class C13547a extends AbsAppMeta.C67794b {

        /* renamed from: a */
        public String f35659a;

        /* renamed from: b */
        public String f35660b;

        /* renamed from: c */
        public String f35661c;

        /* renamed from: d */
        public int f35662d;

        /* renamed from: e */
        public String f35663e;
    }

    /* renamed from: a */
    public String mo50316a() {
        return this.f35658a.f35659a;
    }

    /* renamed from: b */
    public String mo50319b() {
        return this.f35658a.f35660b;
    }

    /* renamed from: c */
    public String mo50321c() {
        return this.f35658a.f35661c;
    }

    /* renamed from: d */
    public String mo50323d() {
        return this.packageData.f170756b;
    }

    /* renamed from: e */
    public List<String> mo50325e() {
        return this.packageData.f170755a;
    }

    /* renamed from: f */
    public String mo50327f() {
        return this.f35658a.f35663e;
    }

    @Override // com.tt.refer.common.meta.base.AbsAppMeta
    public int getMetaSource() {
        return this.f35658a.f35662d;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("CardAppInfo:");
        stringBuffer.append(" appId:");
        stringBuffer.append(getAppId());
        stringBuffer.append(" cardId:");
        stringBuffer.append(getIdentifier());
        stringBuffer.append(" versionType:");
        stringBuffer.append(getVersionType());
        stringBuffer.append(" version:");
        stringBuffer.append(this.appVersion);
        stringBuffer.append(" minClientVersion:");
        stringBuffer.append(this.f35658a.f35660b);
        stringBuffer.append(" cardType:");
        stringBuffer.append(this.f35658a.f35661c);
        stringBuffer.append(" lang:");
        stringBuffer.append(this.f35658a.f35663e);
        stringBuffer.append(" md5:");
        stringBuffer.append(this.packageData.f170756b);
        stringBuffer.append(" path:");
        if (this.packageData.f170755a != null) {
            str = Arrays.toString(this.packageData.f170755a.toArray());
        } else {
            str = "null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" name:");
        stringBuffer.append(this.name);
        return stringBuffer.toString();
    }

    @Override // com.tt.refer.common.meta.base.AbsAppMeta
    public void setMetaSource(int i) {
        this.f35658a.f35662d = i;
    }

    /* renamed from: e */
    public void mo50326e(String str) {
        this.f35658a.f35663e = str;
    }

    /* renamed from: a */
    public void mo50317a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f35658a.f35659a = str;
            return;
        }
        AppBrandLogger.m52829e("card_app_meta_info", "setExtra->value is empty!");
    }

    /* renamed from: b */
    public void mo50320b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f35658a.f35660b = str;
            return;
        }
        AppBrandLogger.m52829e("card_app_meta_info", "setMinClientVersion->value is empty!");
    }

    /* renamed from: c */
    public void mo50322c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f35658a.f35661c = str;
            return;
        }
        AppBrandLogger.m52829e("card_app_meta_info", "setCardType->value is empty!");
    }

    /* renamed from: d */
    public void mo50324d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.packageData.f170756b = str;
            return;
        }
        AppBrandLogger.m52829e("card_app_meta_info", "setMd5->value is empty!");
    }

    /* renamed from: a */
    public void mo50318a(List<String> list) {
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52829e("card_app_meta_info", "setUrls->value is empty!");
            return;
        }
        this.packageData.f170755a = new ArrayList(list);
    }
}
