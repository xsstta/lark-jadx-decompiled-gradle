package com.ss.android.lark.mail.impl.settings.subsetting.signature.parse;

import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.message.template.AbstractC43088y;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.c */
public class C43603c extends AbstractC43599a<List<MailEntSignature>> {
    /* renamed from: b */
    static String m173065b(String str) {
        return "$" + str + "$";
    }

    /* renamed from: a */
    public String mo155611a(final List<MailEntSignature> list) {
        StringBuilder sb = new StringBuilder();
        mo155603a(sb, mo155602a("main"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43603c.C436041 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43603c.this.mo155610a(str, list);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo155609a(String str, String str2) {
        return str.replace(m173065b("signature_list"), str2);
    }

    /* renamed from: a */
    public String mo155610a(String str, List<MailEntSignature> list) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -701856827:
                if (str.equals("signature_list")) {
                    c = 0;
                    break;
                }
                break;
            case -50798406:
                if (str.equals("screenWidth")) {
                    c = 1;
                    break;
                }
                break;
            case 1764761017:
                if (str.equals("signature_background_color")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m173065b(str);
            case 1:
                return Integer.toString(UIHelper.px2dp((float) UIHelper.getWindowWidth(UIHelper.getContext())));
            case 2:
                return String.format("#%06X", Integer.valueOf(16777215 & UDColorUtils.getColor(UIHelper.getContext(), R.color.bg_base)));
            default:
                return "";
        }
    }
}
