package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13233a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13235c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p660a.C13212a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13229d;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.e */
public class C13240e extends AppCompatEditText {

    /* renamed from: a */
    public AbstractC13242a f35073a;

    /* renamed from: b */
    public boolean f35074b;

    /* renamed from: c */
    private TextWatcher f35075c = new TextWatcher() {
        /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13240e.C132411 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Editable.Factory.getInstance().newEditable(C13240e.this.getText());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C13240e.this.f35073a != null) {
                C13240e.this.f35073a.mo49433a(!TextUtils.isEmpty(charSequence));
            }
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i) && C13240e.this.f35073a != null && !C13240e.this.f35074b) {
                C13240e.this.f35073a.mo49434c();
            }
        }
    };

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.e$a */
    public interface AbstractC13242a {
        /* renamed from: a */
        void mo49433a(boolean z);

        /* renamed from: c */
        void mo49434c();
    }

    public C13212a[] getAtData() {
        return (C13212a[]) getText().getSpans(0, getText().length(), C13212a.class);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f35075c);
        AppBrandLogger.m52830i("RichEdit", "rich edit attached to window");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f35075c);
        AppBrandLogger.m52830i("RichEdit", "rich edit detached from window");
    }

    public void setAnonymous(boolean z) {
        this.f35074b = z;
    }

    public void setListener(AbstractC13242a aVar) {
        this.f35073a = aVar;
    }

    public C13240e(Context context) {
        super(context);
    }

    /* renamed from: b */
    private SpannableString m53953b(C13235c cVar) {
        String str = "@" + cVar.mo49409b();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C13212a(getContext(), str, cVar.mo49407a(), cVar.mo49411c()), 0, str.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    public void mo49420a(C13233a aVar) {
        int selectionStart = getSelectionStart();
        Editable editableText = getEditableText();
        if (selectionStart < 0 || selectionStart >= editableText.length()) {
            editableText.append((CharSequence) aVar.mo49406a());
        } else {
            editableText.insert(selectionStart, aVar.mo49406a());
        }
    }

    /* renamed from: a */
    public void mo49421a(C13235c cVar) {
        int selectionStart = getSelectionStart();
        String obj = getText().toString();
        if (!TextUtils.isEmpty(obj) && selectionStart > 0) {
            int i = selectionStart - 1;
            if (obj.substring(i, selectionStart).equals("@")) {
                getEditableText().delete(i, selectionStart);
                AppBrandLogger.m52830i("RichEdit", "insertAtTag has at flag");
            }
        }
        int selectionStart2 = getSelectionStart();
        if (selectionStart2 >= 0) {
            getEditableText().insert(selectionStart2, m53953b(cVar));
            getEditableText().insert(getSelectionStart(), " ");
            return;
        }
        getEditableText().append((CharSequence) m53953b(cVar));
        getEditableText().append(" ");
    }

    /* renamed from: a */
    public void mo49422a(String str, RichTextData.AtData[] atDataArr) {
        setTextColor(getResources().getColor(R.color.text_title));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (atDataArr != null && atDataArr.length > 0) {
            for (int i = 0; i < atDataArr.length; i++) {
                AppBrandLogger.m52830i("RichTextModule", "setRichContent atName=" + atDataArr[i].getName() + " start=" + atDataArr[i].getOffset() + " length=" + atDataArr[i].getLength());
                C13212a aVar = new C13212a(getContext(), atDataArr[i].getName(), null, atDataArr[i].getId(), atDataArr[i].getColor());
                try {
                    spannableStringBuilder.setSpan(aVar, atDataArr[i].getOffset(), atDataArr[i].getOffset() + atDataArr[i].getLength(), 33);
                } catch (IndexOutOfBoundsException e) {
                    AppBrandLogger.eWithThrowable("RichEdit", "content=" + str + "  span=" + aVar.mo49328a(), e);
                }
            }
        }
        setText(spannableStringBuilder);
        setSelection(getText().length());
        this.f35073a.mo49433a(!TextUtils.isEmpty(str));
    }

    /* renamed from: a */
    public RichTextData.AtData[] mo49423a(String[] strArr, String[] strArr2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        C13212a[] aVarArr = (C13212a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C13212a.class);
        if (aVarArr == null || aVarArr.length <= 0) {
            AppBrandLogger.m52830i("RichEdit", "getAtDatas at span is empty");
            return null;
        }
        RichTextData.AtData[] atDataArr = new RichTextData.AtData[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            int spanStart = spannableStringBuilder.getSpanStart(aVarArr[i]);
            int spanEnd = spannableStringBuilder.getSpanEnd(aVarArr[i]) - spanStart;
            String a = aVarArr[i].mo49328a();
            atDataArr[i] = new RichTextData.AtData();
            atDataArr[i].setOffset(spanStart);
            atDataArr[i].setLength(spanEnd);
            if (!TextUtils.isEmpty(a) && a.startsWith("@")) {
                a = a.substring(1);
            }
            atDataArr[i].setName(a);
            if (TextUtils.isEmpty(aVarArr[i].mo49330c())) {
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    if (!TextUtils.isEmpty(aVarArr[i].mo49329b()) && aVarArr[i].mo49329b().equals(strArr2[i2])) {
                        atDataArr[i].setId(strArr[i2]);
                    }
                }
            } else {
                atDataArr[i].setId(aVarArr[i].mo49330c());
            }
        }
        return atDataArr;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C13229d.m53936a().mo49366a(getContext(), getText(), C13264d.f35127a, C13264d.f35129c, C13264d.f35130d, C13264d.f35131e, C13264d.f35132f, false);
    }
}
