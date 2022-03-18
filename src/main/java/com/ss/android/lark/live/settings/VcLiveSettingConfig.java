package com.ss.android.lark.live.settings;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.ss.android.lark.live.p2139b.C41505a;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class VcLiveSettingConfig implements Serializable {
    public List<String> liveHosts = new ArrayList();
    public boolean liveNative;
    public List<String> livePaths = new ArrayList();
    public List<Pattern> livePattern = new ArrayList();
    public List<String> liveUrls = new ArrayList();
    private C41523a mSettingHelper = new C41523a();

    public C41523a getSettingHelper() {
        return this.mSettingHelper;
    }

    /* renamed from: com.ss.android.lark.live.settings.VcLiveSettingConfig$a */
    public class C41523a {
        /* renamed from: b */
        public boolean mo149408b() {
            boolean a = C41505a.m164727a();
            C45855f.m181664c("VcLiveSettingConfig", "[isLiveFloatEnable] floatLiveEnable: " + a);
            return a;
        }

        /* renamed from: a */
        public void mo149406a() {
            for (String str : VcLiveSettingConfig.this.livePaths) {
                try {
                    VcLiveSettingConfig.this.livePattern.add(Pattern.compile(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public C41523a() {
        }

        /* renamed from: b */
        private boolean m164774b(String str) {
            C45855f.m181664c("VcLiveSettingConfig", "[matchFullUrl] enter");
            if (VcLiveSettingConfig.this.liveUrls.contains(str)) {
                C45855f.m181664c("VcLiveSettingConfig", "[matchFullUrl2] match liveUrls success");
                return true;
            }
            C45855f.m181664c("VcLiveSettingConfig", "[matchFullUrl3] match liveUrls failed");
            return false;
        }

        /* renamed from: c */
        private boolean m164775c(String str) {
            for (String str2 : VcLiveSettingConfig.this.liveHosts) {
                if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        private boolean m164776d(String str) {
            for (Pattern pattern : VcLiveSettingConfig.this.livePattern) {
                try {
                    if (pattern.matcher(str).find()) {
                        return true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo149407a(String str) {
            C45855f.m181664c("VcLiveSettingConfig", "[matchUrl] enter");
            boolean z = false;
            if (!VcLiveSettingConfig.this.liveNative || !mo149408b()) {
                C45855f.m181664c("VcLiveSettingConfig", "[matchUrl2] liveNative is false or live float not enable");
                return false;
            }
            Uri parse = Uri.parse(str);
            if (m164774b(str) || m164773a(parse.getHost(), parse.getPath())) {
                z = true;
            }
            C45855f.m181664c("VcLiveSettingConfig", "[matchUrl3] result is " + z);
            return z;
        }

        /* renamed from: a */
        private boolean m164773a(String str, String str2) {
            C45855f.m181664c("VcLiveSettingConfig", "[match] enter");
            boolean z = false;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C45855f.m181664c("VcLiveSettingConfig", "[match3] failed, host or path is null");
                return false;
            }
            if (m164775c(str) && m164776d(str2)) {
                z = true;
            }
            C45855f.m181664c("VcLiveSettingConfig", "[match2] matchHost and matchPath " + z);
            return z;
        }
    }

    public static VcLiveSettingConfig parse(String str) {
        Exception e;
        VcLiveSettingConfig vcLiveSettingConfig = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            VcLiveSettingConfig vcLiveSettingConfig2 = (VcLiveSettingConfig) JSON.parseObject(str, VcLiveSettingConfig.class);
            try {
                vcLiveSettingConfig2.getSettingHelper().mo149406a();
                return vcLiveSettingConfig2;
            } catch (Exception e2) {
                e = e2;
                vcLiveSettingConfig = vcLiveSettingConfig2;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return vcLiveSettingConfig;
        }
    }
}
