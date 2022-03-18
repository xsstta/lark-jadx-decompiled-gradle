package com.ss.android.lark.passport.infra.widget.password;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;

public class PasswordEditText extends RelativeLayout {

    /* renamed from: a */
    public EditText f123679a;

    /* renamed from: b */
    public AbstractC49273c f123680b;

    /* renamed from: c */
    public AbstractC49272b f123681c;

    /* renamed from: d */
    public AbstractC49271a f123682d;

    /* renamed from: e */
    private final Context f123683e;

    /* renamed from: f */
    private final List<ObjectAnimator> f123684f;

    /* renamed from: com.ss.android.lark.passport.infra.widget.password.PasswordEditText$a */
    public interface AbstractC49271a {
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.password.PasswordEditText$b */
    public interface AbstractC49272b {
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.password.PasswordEditText$c */
    public interface AbstractC49273c {
    }

    public String getString() {
        EditText editText = this.f123679a;
        if (editText != null) {
            return editText.getText().toString();
        }
        return "";
    }

    public void setKeyboardWillOpenListener(AbstractC49272b bVar) {
        this.f123681c = bVar;
    }

    public void setOnInputCompleteListener(AbstractC49271a aVar) {
        this.f123682d = aVar;
    }

    public void setTextChangeListener(AbstractC49273c cVar) {
        this.f123680b = cVar;
    }

    public PasswordEditText(Context context) {
        this(context, null);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f123684f = new ArrayList();
        this.f123683e = context;
    }
}
