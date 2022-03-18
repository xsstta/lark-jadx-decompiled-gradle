package com.ss.android.lark.passport.infra.widget.verifycode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class VerifyCodeEditText extends RelativeLayout {

    /* renamed from: a */
    public EditText f123718a;

    /* renamed from: b */
    public int f123719b;

    /* renamed from: c */
    public AbstractC49281e f123720c;

    /* renamed from: d */
    public AbstractC49279c f123721d;

    /* renamed from: e */
    public AbstractC49277a f123722e;

    /* renamed from: f */
    public AbstractC49278b f123723f;

    /* renamed from: g */
    public AbstractC49280d f123724g;

    /* renamed from: h */
    private final Context f123725h;

    /* renamed from: com.ss.android.lark.passport.infra.widget.verifycode.VerifyCodeEditText$a */
    public interface AbstractC49277a {
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.verifycode.VerifyCodeEditText$b */
    public interface AbstractC49278b {
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.verifycode.VerifyCodeEditText$c */
    public interface AbstractC49279c {
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.verifycode.VerifyCodeEditText$d */
    public interface AbstractC49280d {
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.verifycode.VerifyCodeEditText$e */
    public interface AbstractC49281e {
    }

    public String getVerifyCodeText() {
        EditText editText = this.f123718a;
        if (editText != null) {
            return editText.getText().toString().trim();
        }
        return "";
    }

    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        super.setOnCreateContextMenuListener(onCreateContextMenuListener);
    }

    public void setOnInputCompleteListener(AbstractC49277a aVar) {
        this.f123722e = aVar;
    }

    public void setOnInputProcessListener(AbstractC49278b bVar) {
        this.f123723f = bVar;
    }

    public void setOnKeyboardWillShowListener(AbstractC49279c cVar) {
        this.f123721d = cVar;
    }

    public void setOnTextChangeListener(AbstractC49280d dVar) {
        this.f123724g = dVar;
    }

    public void setOnTextFinishListener(AbstractC49281e eVar) {
        this.f123720c = eVar;
    }

    public VerifyCodeEditText(Context context) {
        this(context, null);
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f123719b = 4;
        this.f123725h = context;
    }
}
