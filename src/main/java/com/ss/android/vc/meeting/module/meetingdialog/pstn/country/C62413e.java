package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.e */
public class C62413e {

    /* renamed from: a */
    private volatile CountryListManifest f156987a;

    /* renamed from: b */
    private volatile String f156988b;

    /* renamed from: c */
    private volatile boolean f156989c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.e$a */
    public static class C62415a {

        /* renamed from: a */
        public static C62413e f156990a = new C62413e();
    }

    private C62413e() {
    }

    /* renamed from: a */
    public static C62413e m243942a() {
        return C62415a.f156990a;
    }

    /* renamed from: b */
    public CountryListManifest mo215805b(Context context) {
        boolean z;
        if (!this.f156989c || !TextUtils.equals(m243943c(context), this.f156988b)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo215804a(context);
        }
        return this.f156987a;
    }

    /* renamed from: a */
    public synchronized void mo215804a(Context context) {
        try {
            this.f156988b = m243943c(context);
            InputStream open = context.getResources().getAssets().open(this.f156988b);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            this.f156987a = (CountryListManifest) JSON.parseObject(new String(bArr, "utf-8"), CountryListManifest.class, Feature.OrderedField);
            open.close();
        } catch (IOException e) {
            this.f156987a = null;
            e.printStackTrace();
        } catch (Throwable th) {
            this.f156989c = true;
            throw th;
        }
        this.f156989c = true;
    }

    /* renamed from: c */
    private String m243943c(Context context) {
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
                String country = locale.getCountry();
                country.hashCode();
                if (country.equals("HK")) {
                    return "country/mobile_code_zh-HK.json";
                }
                if (!country.equals("TW")) {
                    return "country/mobile_code_zh-CN.json";
                }
                return "country/mobile_code_zh-TW.json";
            default:
                return "country/mobile_code_en-US.json";
        }
    }
}
