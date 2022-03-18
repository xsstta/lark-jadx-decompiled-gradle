package com.ss.lark.android.passport.biz.feature.country;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.GetPassportConfigData;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.account.C64291a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.lark.android.passport.biz.feature.country.g */
public class C64741g {

    /* renamed from: a */
    private volatile Country f163298a;

    /* renamed from: b */
    private volatile String f163299b;

    /* renamed from: c */
    private volatile boolean f163300c;

    /* renamed from: d */
    private final ArrayList<String> f163301d;

    /* renamed from: e */
    private final PassportLog f163302e;

    /* renamed from: com.ss.lark.android.passport.biz.feature.country.g$a */
    private static class C64743a {

        /* renamed from: a */
        public static final C64741g f163303a = new C64741g();
    }

    /* renamed from: a */
    public static C64741g m254275a() {
        return C64743a.f163303a;
    }

    /* renamed from: a */
    public void mo223608a(Context context, boolean z, List<String> list, AbstractC49352d<List<CountryBean>> dVar) {
        if (list == null || list.isEmpty()) {
            if (dVar != null) {
                dVar.mo145178a(new NetworkErrorResult(-1, "search key is null!"));
            }
        } else if (dVar != null) {
            if (z || !this.f163300c) {
                mo223605a(context);
            }
            HashSet hashSet = new HashSet(list.size());
            for (String str : list) {
                hashSet.add("+".concat(str));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Country b = m254277b();
            if (b != null) {
                LinkedHashMap<String, CountryBean> data = b.getData();
                for (String str2 : b.getTopList()) {
                    CountryBean countryBean = data.get(str2);
                    if (countryBean != null && hashSet.contains(countryBean.getCode())) {
                        linkedHashSet.add(countryBean);
                    }
                }
                for (CountryBean countryBean2 : data.values()) {
                    if (hashSet.contains(countryBean2.getCode())) {
                        linkedHashSet.add(countryBean2);
                    }
                }
                dVar.mo145179a(new ArrayList(linkedHashSet));
            } else if (dVar != null) {
                dVar.mo145178a(new NetworkErrorResult(-1, "country info is null!"));
            }
        }
    }

    private C64741g() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f163301d = arrayList;
        this.f163302e = PassportLog.f123351c.mo171474a();
        arrayList.add("IR");
        arrayList.add("SY");
        arrayList.add("KP");
        arrayList.add("CU");
    }

    /* renamed from: b */
    private Country m254277b() {
        boolean z;
        GetPassportConfigData.ConfigBean d;
        PassportLog passportLog = this.f163302e;
        StringBuilder sb = new StringBuilder();
        sb.append("getHandledCountry mCountry: ");
        if (this.f163298a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        passportLog.mo171465b("CountryService", sb.toString());
        if (!(this.f163298a == null || (d = PassportConfigCenter.f123034a.mo171113d()) == null)) {
            List<String> list = d.blackCountryList;
            if (list == null || list.isEmpty()) {
                m254276a(this.f163301d);
            } else {
                m254276a(list);
            }
            List<String> list2 = d.topCountryList;
            if (list2 != null && !list2.isEmpty()) {
                this.f163298a.setTopList((String[]) list2.toArray(new String[list2.size()]));
            }
        }
        return this.f163298a;
    }

    /* renamed from: a */
    private void m254276a(List<String> list) {
        if (!(list == null || list.isEmpty() || this.f163298a == null)) {
            LinkedHashMap<String, CountryBean> data = this.f163298a.getData();
            if (data != null) {
                for (String str : list) {
                    data.remove(str);
                }
            }
            this.f163298a.setData(data);
        }
    }

    /* renamed from: b */
    private String m254278b(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        language.hashCode();
        char c = 65535;
        switch (language.hashCode()) {
            case 3201:
                if (language.equals("de")) {
                    c = 0;
                    break;
                }
                break;
            case 3246:
                if (language.equals("es")) {
                    c = 1;
                    break;
                }
                break;
            case 3276:
                if (language.equals("fr")) {
                    c = 2;
                    break;
                }
                break;
            case 3329:
                if (language.equals("hi")) {
                    c = 3;
                    break;
                }
                break;
            case 3355:
                if (language.equals("id")) {
                    c = 4;
                    break;
                }
                break;
            case 3371:
                if (language.equals("it")) {
                    c = 5;
                    break;
                }
                break;
            case 3383:
                if (language.equals("ja")) {
                    c = 6;
                    break;
                }
                break;
            case 3428:
                if (language.equals("ko")) {
                    c = 7;
                    break;
                }
                break;
            case 3588:
                if (language.equals("pt")) {
                    c = '\b';
                    break;
                }
                break;
            case 3651:
                if (language.equals("ru")) {
                    c = '\t';
                    break;
                }
                break;
            case 3700:
                if (language.equals("th")) {
                    c = '\n';
                    break;
                }
                break;
            case 3763:
                if (language.equals("vi")) {
                    c = 11;
                    break;
                }
                break;
            case 3886:
                if (language.equals("zh")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "country/mobile_code_de-DE.json";
            case 1:
                return "country/mobile_code_es-ES.json";
            case 2:
                return "country/mobile_code_fr-FR.json";
            case 3:
                return "country/mobile_code_hi-IN.json";
            case 4:
                return "country/mobile_code_id-ID.json";
            case 5:
                return "country/mobile_code_it-IT.json";
            case 6:
                return "country/mobile_code_ja-JP.json";
            case 7:
                return "country/mobile_code_ko-KR.json";
            case '\b':
                return "country/mobile_code_pt-BR.json";
            case '\t':
                return "country/mobile_code_ru-RU.json";
            case '\n':
                return "country/mobile_code_th-TH.json";
            case 11:
                return "country/mobile_code_vi-VN.json";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                if (locale.getCountry().equals("HK")) {
                    return "country/mobile_code_zh-HK.json";
                }
                if (locale.getCountry().equals("TW")) {
                    return "country/mobile_code_zh-TW.json";
                }
                return "country/mobile_code_zh-CN.json";
            default:
                return "country/mobile_code_en-US.json";
        }
    }

    /* renamed from: a */
    public synchronized void mo223605a(Context context) {
        try {
            this.f163299b = m254278b(context);
            InputStream open = context.getResources().getAssets().open(this.f163299b);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            this.f163298a = (Country) JSON.parseObject(new String(bArr, StandardCharsets.UTF_8), Country.class, Feature.OrderedField);
            open.close();
        } catch (IOException e) {
            this.f163302e.mo171466b("CountryService", "init error", e);
            this.f163298a = null;
            e.printStackTrace();
        } catch (Throwable th) {
            this.f163300c = true;
            throw th;
        }
        this.f163300c = true;
    }

    /* renamed from: a */
    public Country mo223604a(Context context, boolean z) {
        boolean z2;
        if (z || !this.f163300c || !TextUtils.equals(m254278b(context), this.f163299b)) {
            z2 = true;
        } else {
            z2 = false;
        }
        PassportLog passportLog = this.f163302e;
        passportLog.mo171465b("CountryService", "getCountryInfo shouldInit: " + z2 + ", isInit: " + this.f163300c);
        if (z2) {
            mo223605a(context);
        }
        return m254277b();
    }

    /* renamed from: a */
    public void mo223606a(Context context, boolean z, AbstractC49352d<Country> dVar) {
        if (dVar != null) {
            dVar.mo145179a(mo223604a(context, z));
        }
    }

    /* renamed from: a */
    public CountryBean mo223602a(Country country, String str, UniContext uniContext) {
        if (country == null || country.getData() == null || TextUtils.isEmpty(str)) {
            this.f163302e.mo171465b("CountryService", "getCountryBean4Code: country or code is empty");
            return null;
        }
        for (Map.Entry<String, CountryBean> entry : country.getData().entrySet()) {
            if (entry.getValue() != null && TextUtils.equals(entry.getValue().getCode(), str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public CountryBean mo223603a(Country country, boolean z, String str, UniContext uniContext) {
        if (country == null || country.getData() == null) {
            this.f163302e.mo171465b("CountryService", "country is empty");
            return null;
        }
        String b = C64291a.m252807b();
        if (TextUtils.isEmpty(b)) {
            boolean z2 = false;
            String a = PassportConfigHelper.m193017a(z, str);
            LinkedHashMap<String, CountryBean> data = country.getData();
            Iterator<String> it = data.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (data.get(next) != null && a.equals(data.get(next).getCode())) {
                    z2 = true;
                    b = next;
                    break;
                }
            }
            if (!z2) {
                b = country.getDefaultCountry();
            }
        }
        return country.getData().get(b);
    }

    /* renamed from: b */
    public void mo223609b(Context context, boolean z, String str, AbstractC49352d<CountryBean> dVar) {
        if (str != null) {
            if (z || !this.f163300c) {
                mo223605a(context);
            }
            Country b = m254277b();
            if (b != null) {
                LinkedHashMap<String, CountryBean> data = b.getData();
                for (String str2 : b.getTopList()) {
                    CountryBean countryBean = data.get(str2);
                    if (countryBean != null && countryBean.getCode().substring(1).equals(str)) {
                        if (dVar != null) {
                            dVar.mo145179a(countryBean);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                for (CountryBean countryBean2 : data.values()) {
                    if (countryBean2.getCode().substring(1).equals(str)) {
                        if (dVar != null) {
                            dVar.mo145179a(countryBean2);
                            return;
                        }
                        return;
                    }
                }
                if (dVar != null) {
                    dVar.mo145179a((CountryBean) null);
                }
            } else if (dVar != null) {
                dVar.mo145178a(new NetworkErrorResult(-1, "country info is null!"));
            }
        } else if (dVar != null) {
            dVar.mo145178a(new NetworkErrorResult(-1, "search key is null!"));
        }
    }

    /* renamed from: a */
    public void mo223607a(Context context, boolean z, String str, AbstractC49352d<List<CountryBean>> dVar) {
        if (!TextUtils.isEmpty(str)) {
            if (z || !this.f163300c) {
                mo223605a(context);
            }
            Country b = m254277b();
            if (b != null) {
                LinkedHashMap<String, CountryBean> data = b.getData();
                ArrayList arrayList = new ArrayList();
                for (CountryBean countryBean : data.values()) {
                    if (!TextUtils.isEmpty(countryBean.getName()) && countryBean.getName().contains(str)) {
                        arrayList.add(countryBean);
                    } else if (!TextUtils.isEmpty(countryBean.getFullPinyin()) && countryBean.getFullPinyin().contains(str)) {
                        arrayList.add(countryBean);
                    } else if (!TextUtils.isEmpty(countryBean.getHeadPinyin()) && countryBean.getHeadPinyin().contains(str)) {
                        arrayList.add(countryBean);
                    } else if (!TextUtils.isEmpty(countryBean.getCode()) && countryBean.getCode().contains(str)) {
                        arrayList.add(countryBean);
                    }
                }
                if (dVar != null) {
                    dVar.mo145179a(arrayList);
                }
            } else if (dVar != null) {
                dVar.mo145178a(new NetworkErrorResult(-1, "country info is null!"));
            }
        } else if (dVar != null) {
            dVar.mo145178a(new NetworkErrorResult(-1, "search key is null!"));
        }
    }
}
