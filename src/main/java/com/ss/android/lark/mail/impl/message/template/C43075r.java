package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.template.r */
public class C43075r extends AbstractC43031a<List<MailLabelEntity>> {

    /* renamed from: a */
    private C42104p f109625a;

    public C43075r(C42104p pVar) {
        this.f109625a = pVar;
    }

    /* renamed from: a */
    public String mo154257a(List<MailLabelEntity> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        String a = mo154209a("message_label_item");
        for (int i = 0; i < list.size(); i++) {
            final MailLabelEntity mailLabelEntity = list.get(i);
            mo154210a(sb, a, new AbstractC43088y() {
                /* class com.ss.android.lark.mail.impl.message.template.C43075r.C430761 */

                @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
                /* renamed from: a */
                public String mo154220a(String str) {
                    return C43075r.this.mo154256a(str, mailLabelEntity);
                }
            });
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154256a(String str, MailLabelEntity mailLabelEntity) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2115337775:
                if (str.equals("text_color")) {
                    c = 0;
                    break;
                }
                break;
            case -1793855122:
                if (str.equals("google_label")) {
                    c = 1;
                    break;
                }
                break;
            case -1649494120:
                if (str.equals("label_text")) {
                    c = 2;
                    break;
                }
                break;
            case -1265068311:
                if (str.equals("bg_color")) {
                    c = 3;
                    break;
                }
                break;
            case -607414078:
                if (str.equals("label_dir")) {
                    c = 4;
                    break;
                }
                break;
            case -472939564:
                if (str.equals("isAndroidFont")) {
                    c = 5;
                    break;
                }
                break;
            case 1373389403:
                if (str.equals("isforward")) {
                    c = 6;
                    break;
                }
                break;
        }
        String str2 = "";
        switch (c) {
            case 0:
                return C43761d.m173471b(mailLabelEntity.mo151521g());
            case 1:
                if (!mailLabelEntity.mo151539w()) {
                    str2 = "message-google-label-item";
                    break;
                }
                break;
            case 2:
                String l = mailLabelEntity.mo151528l();
                if (!TextUtils.isEmpty(mailLabelEntity.mo151492A())) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i = 0; i < mailLabelEntity.mo151493B().size(); i++) {
                        stringBuffer.append(mailLabelEntity.mo151493B().get(i));
                        if (i < mailLabelEntity.mo151493B().size() - 1) {
                            stringBuffer.append("/");
                        }
                    }
                    l = stringBuffer.toString();
                }
                if (mailLabelEntity.mo151539w()) {
                    return C43032aa.m171192d(l);
                }
                return C43785p.m173549d(C43761d.m173470a(mailLabelEntity.mo151515e())) + C43032aa.m171192d(l);
            case 3:
                return C43761d.m173471b(mailLabelEntity.mo151525i());
            case 4:
                if (TextUtils.isEmpty(mailLabelEntity.mo151492A())) {
                    return "ltr";
                }
                return "rtl";
            case 5:
                return "android-font-style";
            case 6:
                C42104p pVar = this.f109625a;
                if (pVar != null && pVar.mo152024f()) {
                    return "isforward";
                }
        }
        return str2;
    }
}
