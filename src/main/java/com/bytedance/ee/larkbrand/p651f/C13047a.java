package com.bytedance.ee.larkbrand.p651f;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.EnvInfo;

/* renamed from: com.bytedance.ee.larkbrand.f.a */
public class C13047a {

    /* renamed from: com.bytedance.ee.larkbrand.f.a$a */
    public static class C13048a {
        /* renamed from: a */
        public static String m53531a() {
            EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
            if (a == null || !a.mo148730a()) {
                return "https://applink.feishu.cn/client/mini_program/open";
            }
            return "https://applink.larksuite.com/client/mini_program/open";
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.f.a$b */
    public static class C13049b {
        /* renamed from: a */
        public static String m53532a() {
            String a = C13374s.m54382a(DomainSettings.Alias.MP_CONFIG);
            return a + "/open-apis/mina";
        }

        /* renamed from: b */
        public static String m53533b() {
            return C13374s.m54382a(DomainSettings.Alias.OPEN) + "/open-apis/id_verify/v1";
        }

        /* renamed from: c */
        public static String m53534c() {
            return C13374s.m54382a(DomainSettings.Alias.OPEN) + "/open-apis/mina/human_authentication/v1";
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.f.a$c */
    public static class C13050c {
        /* renamed from: a */
        public static int m53535a(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt == 11) {
                    return R.anim.microapp_i_bottom_slide_out;
                }
                if (parseInt == 22) {
                    return R.anim.littleapp_fade_out;
                }
                if (parseInt == 33) {
                    return R.anim.microapp_i_slide_out_right;
                }
                if (parseInt == 44) {
                    return R.anim.microapp_i_stay_out;
                }
                switch (parseInt) {
                    case 0:
                        return 0;
                    case 1:
                        return R.anim.microapp_i_slide_in_bottom;
                    case 2:
                        return R.anim.littleapp_multitask_fade_in;
                    case 3:
                        return R.anim.littleapp_multitask_half_fade_in;
                    case 4:
                        return R.anim.microapp_i_slide_in_right;
                    case 5:
                        return R.anim.littleapp_slide_in_scale;
                    case 6:
                        return R.anim.microapp_i_slide_in_top;
                    case 7:
                        return R.anim.microapp_i_slide_in_no;
                    case 8:
                        return R.anim.littleapp_slide_in_scale_no_fade;
                    default:
                        return -1;
                }
            } catch (NumberFormatException e) {
                AppBrandLogger.m52829e("PendingTransition", e);
                return -1;
            }
        }
    }
}
