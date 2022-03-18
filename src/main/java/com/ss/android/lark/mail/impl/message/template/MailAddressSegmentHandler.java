package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.List;

public class MailAddressSegmentHandler extends AbstractC43031a<List<MailAddress>> {

    /* renamed from: c */
    private static String f109532c = "$address_type$";

    /* renamed from: d */
    private static String f109533d = "$lan$";

    /* renamed from: e */
    private static String f109534e = "$send-separately$";

    /* renamed from: f */
    private static String f109535f = "$address_item$";

    /* renamed from: g */
    private static String f109536g = "$user_id$";

    /* renamed from: h */
    private static String f109537h = "$user_type$";

    /* renamed from: i */
    private static String f109538i = "$tenant_id$";

    /* renamed from: j */
    private static String f109539j = "$address_name$";

    /* renamed from: k */
    private static String f109540k = "$address_address$";

    /* renamed from: l */
    private static String f109541l = "$address-item-group-icon$";

    /* renamed from: m */
    private static String f109542m = "$address_item_group_type_icon$";

    /* renamed from: n */
    private static String f109543n = "$no-name-content$";

    /* renamed from: a */
    private RecipientType f109544a;

    /* renamed from: b */
    private boolean f109545b;

    /* renamed from: o */
    private String f109546o;

    public enum RecipientType {
        TO(R.string.Mail_Normal_To),
        CC(R.string.Mail_Normal_Cc),
        BCC(R.string.Mail_Normal_Bcc),
        SEPARATELY(R.string.Mail_Normal_Sp),
        FROM(R.string.Mail_Normal_From);
        
        private int stringID;

        public String getStr() {
            return C43819s.m173684a(this.stringID);
        }

        private RecipientType(int i) {
            this.stringID = i;
        }
    }

    /* renamed from: b */
    private String m171180b() {
        RecipientType recipientType = this.f109544a;
        if (recipientType != null) {
            return recipientType.getStr();
        }
        return "";
    }

    /* renamed from: a */
    private String m171176a() {
        if (this.f109546o == null) {
            this.f109546o = mo154209a("recipients_item").replace(f109533d, C43032aa.m171186a());
        }
        return this.f109546o;
    }

    /* renamed from: a */
    public String mo154206a(MailAddress mailAddress) {
        String str;
        boolean z;
        String replace = m171176a().replace(f109532c, m171180b());
        String str2 = f109534e;
        if (this.f109545b) {
            str = "send-separately";
        } else {
            str = "";
        }
        String replace2 = replace.replace(str2, str);
        String str3 = f109535f;
        if (RecipientType.FROM != this.f109544a) {
            z = true;
        } else {
            z = false;
        }
        return replace2.replace(str3, m171177a(mailAddress, z));
    }

    /* renamed from: a */
    public String mo154207a(List<MailAddress> list) {
        String str;
        boolean z;
        String replace = m171176a().replace(f109532c, m171180b());
        String str2 = f109534e;
        if (this.f109545b) {
            str = "send-separately";
        } else {
            str = "";
        }
        String replace2 = replace.replace(str2, str);
        String str3 = f109535f;
        if (RecipientType.FROM != this.f109544a) {
            z = true;
        } else {
            z = false;
        }
        return replace2.replace(str3, m171178a(list, z));
    }

    /* renamed from: a */
    public MailAddressSegmentHandler mo154205a(RecipientType recipientType, boolean z) {
        this.f109544a = recipientType;
        this.f109545b = z;
        return this;
    }

    /* renamed from: a */
    private String m171177a(MailAddress mailAddress, boolean z) {
        StringBuilder sb = new StringBuilder();
        m171179a(mailAddress, sb, z);
        return sb.toString();
    }

    /* renamed from: a */
    private String m171178a(List<MailAddress> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (MailAddress mailAddress : list) {
            m171179a(mailAddress, sb, z);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m171179a(MailAddress mailAddress, StringBuilder sb, boolean z) {
        int i;
        String str;
        String str2;
        String a = mo154209a("address_item");
        if (mailAddress.mo151190k() != null) {
            i = mailAddress.mo151190k().getValue();
        } else {
            i = 0;
        }
        String a2 = mailAddress.mo151176a();
        if (z && !TextUtils.isEmpty(mailAddress.mo151182e()) && C43350d.m172098a().mo155037b(mailAddress.mo151182e())) {
            a2 = C43819s.m173684a((int) R.string.Mail_ThreadList_Me);
        }
        String str3 = f109536g;
        String str4 = "";
        if (mailAddress.mo151191l()) {
            str = str4;
        } else {
            str = mailAddress.mo151189j();
        }
        String replace = a.replace(str3, str).replace(f109539j, C43032aa.m171192d(a2)).replace(f109537h, String.valueOf(i)).replace(f109538i, String.valueOf(mailAddress.mo151196q())).replace(f109540k, C43032aa.m171192d(mailAddress.mo151182e()));
        String str5 = f109541l;
        if (mailAddress.mo151191l()) {
            str2 = str4;
        } else {
            str2 = "hide";
        }
        String replace2 = replace.replace(str5, str2).replace(f109542m, C43785p.m173537a(mailAddress.mo151190k()));
        String str6 = f109543n;
        if (!mailAddress.mo151191l() && a2.isEmpty()) {
            str4 = "no-name-content";
        }
        sb.append(replace2.replace(str6, str4));
    }
}
