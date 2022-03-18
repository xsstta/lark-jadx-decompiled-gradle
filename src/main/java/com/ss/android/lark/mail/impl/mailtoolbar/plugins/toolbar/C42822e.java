package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.MailTxtAttrId;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.e */
public class C42822e extends AbstractC1142af {
    protected AbstractC42823a callback;
    private C1177w<C42824b> selectParam;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.e$a */
    public interface AbstractC42823a {
        void onFontSelected(MailTxtAttrId mailTxtAttrId);
    }

    /* access modifiers changed from: package-private */
    public C1177w<C42824b> getSelectParam() {
        if (this.selectParam == null) {
            this.selectParam = new C1177w<>();
        }
        return this.selectParam;
    }

    public void setCallback(AbstractC42823a aVar) {
        this.callback = aVar;
    }

    /* access modifiers changed from: package-private */
    public void fontSelected(MailTxtAttrId mailTxtAttrId) {
        updateSelectedFont(mailTxtAttrId);
        AbstractC42823a aVar = this.callback;
        if (aVar != null) {
            aVar.onFontSelected(mailTxtAttrId);
        }
    }

    public void updateSelectedFont(MailTxtAttrId mailTxtAttrId) {
        C1177w<C42824b> selectParam2 = getSelectParam();
        C42824b b = selectParam2.mo5927b();
        if (b != null) {
            b.f109015b = mailTxtAttrId;
            selectParam2.mo5929b(b);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.e$b */
    public static class C42824b {

        /* renamed from: a */
        public String f109014a;

        /* renamed from: b */
        public MailTxtAttrId f109015b;

        /* renamed from: c */
        public MailTxtAttrId[] f109016c;

        public C42824b(String str, MailTxtAttrId mailTxtAttrId, MailTxtAttrId[] mailTxtAttrIdArr) {
            this.f109014a = str;
            this.f109015b = mailTxtAttrId;
            this.f109016c = mailTxtAttrIdArr;
        }
    }

    public void selectFont(FragmentActivity fragmentActivity, C42824b bVar, AbstractC42823a aVar) {
        getSelectParam().mo5929b(bVar);
        this.callback = aVar;
        ((DialogInterface$OnCancelListenerC1021b) Fragment.instantiate(fragmentActivity, C42820d.class.getName())).mo5511a(fragmentActivity.getSupportFragmentManager(), "select_font");
    }
}
