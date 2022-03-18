package com.ss.android.vc.meeting.module.enterprisephone;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;

public class EnterprisePhoneEditText extends AppCompatEditText implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final Context f154627a;

    /* renamed from: b */
    private C61639a f154628b;

    /* renamed from: c */
    private AbstractC61640b f154629c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneEditText$b */
    public interface AbstractC61640b {
        /* renamed from: a */
        void mo213497a();
    }

    /* renamed from: d */
    private void m240587d() {
        setShowSoftInputOnFocus(false);
        m240588e();
    }

    /* renamed from: e */
    private void m240588e() {
        C61639a aVar = new C61639a(this);
        this.f154628b = aVar;
        addTextChangedListener(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo213525a() {
        C60700b.m235843a("EnterprisePhoneLog_EnterprisePhoneEditText", "[onTextCut]", "onTextCut");
        AbstractC61640b bVar = this.f154629c;
        if (bVar != null) {
            bVar.mo213497a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo213527c() {
        C60700b.m235843a("EnterprisePhoneLog_EnterprisePhoneEditText", "[onTextCopy]", "onTextCopy");
        AbstractC61640b bVar = this.f154629c;
        if (bVar != null) {
            bVar.mo213497a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo213526b() {
        C60700b.m235843a("EnterprisePhoneLog_EnterprisePhoneEditText", "[onTextPaste]", "onTextPaste");
        String charSequence = ((ClipboardManager) VCAppLifeCycle.m236256c().getSystemService("clipboard")).getText().toString();
        if (!TextUtils.isEmpty(charSequence)) {
            String replaceAll = charSequence.replaceAll("[^*#+\\d]", "");
            getEditableText().insert(getSelectionStart(), replaceAll);
            AbstractC61640b bVar = this.f154629c;
            if (bVar != null) {
                bVar.mo213497a();
            }
        }
    }

    public void setPhoneNumberListener(AbstractC61640b bVar) {
        this.f154629c = bVar;
    }

    public EnterprisePhoneEditText(Context context) {
        super(context);
        this.f154627a = context;
        m240587d();
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return onTextContextMenuItem(menuItem.getItemId());
    }

    public boolean onTextContextMenuItem(int i) {
        switch (i) {
            case 16908320:
                boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
                mo213525a();
                return onTextContextMenuItem;
            case 16908321:
                boolean onTextContextMenuItem2 = super.onTextContextMenuItem(i);
                mo213527c();
                return onTextContextMenuItem2;
            case 16908322:
                mo213526b();
                return true;
            default:
                return super.onTextContextMenuItem(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneEditText$a */
    public class C61639a implements TextWatcher {

        /* renamed from: b */
        private final char f154631b = ' ';

        /* renamed from: c */
        private volatile String f154632c = "";

        /* renamed from: d */
        private EditText f154633d;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:73:0x0492  */
        /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r17) {
            /*
            // Method dump skipped, instructions count: 1227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneEditText.C61639a.afterTextChanged(android.text.Editable):void");
        }

        C61639a(EditText editText) {
            this.f154633d = editText;
        }
    }

    public EnterprisePhoneEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154627a = context;
        m240587d();
    }

    public EnterprisePhoneEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f154627a = context;
        m240587d();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }
}
