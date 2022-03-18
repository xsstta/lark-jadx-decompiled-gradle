package com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity;

import com.bytedance.lark.pb.im.v1.TranslateScopeMask;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54307a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.c */
public class C54377c {

    /* renamed from: a */
    public static final int f134509a = TranslateScopeMask.UNKNOWN_TRANSLATE_SCOPE_MASK.getValue();

    /* renamed from: b */
    public static final int f134510b;

    /* renamed from: c */
    public static final int f134511c;

    /* renamed from: d */
    public static final int f134512d;

    /* renamed from: e */
    public static final int f134513e;

    /* renamed from: f */
    public static final int f134514f;

    /* renamed from: g */
    public static final int f134515g;

    /* renamed from: h */
    public static final int f134516h;

    /* renamed from: i */
    public static final int f134517i;

    /* renamed from: j */
    public static final int f134518j;

    /* renamed from: k */
    public static final int f134519k;

    /* renamed from: l */
    private int f134520l;

    /* renamed from: g */
    public int mo185982g() {
        return this.f134520l;
    }

    /* renamed from: a */
    public boolean mo185973a() {
        int i = this.f134520l;
        int i2 = f134510b;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo185974b() {
        int i = this.f134520l;
        int i2 = f134511c;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo185977c() {
        int i = this.f134520l;
        int i2 = f134512d;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo185979d() {
        int i = this.f134520l;
        int i2 = f134514f;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo185980e() {
        int i = this.f134520l;
        int i2 = f134513e;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo185981f() {
        int i = this.f134520l;
        int i2 = f134515g;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m211102h() {
        if (mo185975b(f134516h) || mo185975b(f134518j)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m211103i() {
        if (mo185975b(f134517i) || mo185975b(f134519k)) {
            return true;
        }
        return false;
    }

    static {
        int i;
        int value = TranslateScopeMask.LARK_MESSAGE_MASK.getValue();
        f134510b = value;
        int value2 = TranslateScopeMask.DOC_BODY_MASK.getValue();
        f134511c = value2;
        int value3 = TranslateScopeMask.DOC_COMMENT_MASK.getValue();
        f134512d = value3;
        int value4 = TranslateScopeMask.WEB_XML.getValue();
        f134513e = value4;
        int value5 = TranslateScopeMask.DOC_MASK.getValue();
        f134514f = value5;
        int value6 = TranslateScopeMask.EMAIL.getValue();
        f134515g = value6;
        int i2 = value2 | value | value3 | value4;
        if (C54307a.m210867b()) {
            i = value6;
        } else {
            i = 0;
        }
        int i3 = i2 | i;
        f134516h = i3;
        f134517i = i3 & (~value4);
        int i4 = value | value5 | value4;
        if (!C54307a.m210867b()) {
            value6 = 0;
        }
        int i5 = i4 | value6;
        f134518j = i5;
        f134519k = i5 & (~value4);
    }

    public String toString() {
        String str;
        if (f134509a == this.f134520l) {
            return UIHelper.getString(R.string.Lark_Chat_Auto_Translation_Closed);
        }
        if (m211102h()) {
            return UIHelper.getString(R.string.Lark_Chat_Auto_Translation_All_Support);
        }
        if (m211103i() && !C54307a.m210866a()) {
            return UIHelper.getString(R.string.Lark_Chat_Auto_Translation_All_Support);
        }
        StringBuilder sb = new StringBuilder();
        if (C54115c.m210080a().mo178289d().mo178343b()) {
            str = ", ";
        } else {
            str = "、";
        }
        boolean z = false;
        boolean z2 = true;
        if (mo185973a()) {
            sb.append(UIHelper.getString(R.string.Lark_Chat_TranslateMessage));
            z = true;
        }
        if (mo185979d()) {
            if (z) {
                sb.append(str);
            } else {
                z = true;
            }
            sb.append(UIHelper.getString(R.string.Lark_Chat_TranslateDocs));
        }
        if (C54307a.m210866a() && mo185980e()) {
            if (z) {
                sb.append(str);
                z2 = z;
            }
            sb.append(UIHelper.getString(R.string.Lark_Chat_SetWebAutoTranslate));
            z = z2;
        }
        if (C54307a.m210867b() && mo185981f()) {
            if (z) {
                sb.append(str);
            }
            sb.append(UIHelper.getString(R.string.Mail_Translations_AutoMailSetting));
        }
        return sb.toString();
    }

    public C54377c(int i) {
        this.f134520l = i;
    }

    /* renamed from: a */
    public static C54377c m211101a(int i) {
        return new C54377c(i);
    }

    /* renamed from: c */
    public void mo185976c(int i) {
        this.f134520l = i | this.f134520l;
    }

    /* renamed from: d */
    public void mo185978d(int i) {
        this.f134520l = (~i) & this.f134520l;
    }

    /* renamed from: b */
    public boolean mo185975b(int i) {
        if ((this.f134520l & i) == i) {
            return true;
        }
        return false;
    }
}
