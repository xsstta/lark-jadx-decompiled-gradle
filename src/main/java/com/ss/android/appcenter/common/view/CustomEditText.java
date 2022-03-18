package com.ss.android.appcenter.common.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.larksuite.suite.R;

public class CustomEditText extends FrameLayout {

    /* renamed from: a */
    public ImageView f70728a;

    /* renamed from: b */
    public C1177w<Boolean> f70729b;

    /* renamed from: c */
    private EditText f70730c;

    public View getFocusView() {
        return this.f70730c;
    }

    public String getEditContent() {
        EditText editText = this.f70730c;
        if (editText != null) {
            return editText.getText().toString();
        }
        return "";
    }

    /* renamed from: a */
    private void m103310a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.workplace_preview_block_edit_layout, (ViewGroup) null, false);
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.f70728a = (ImageView) inflate.findViewById(R.id.clear);
        this.f70730c = (EditText) inflate.findViewById(R.id.edit);
        this.f70728a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.common.view.$$Lambda$CustomEditText$Dia0U8LwBa1mITTXBhO7igyVe4c */

            public final void onClick(View view) {
                CustomEditText.this.m103311a(view);
            }
        });
        C1177w<Boolean> wVar = new C1177w<>();
        this.f70729b = wVar;
        wVar.mo5925a(new AbstractC1178x<Boolean>() {
            /* class com.ss.android.appcenter.common.view.CustomEditText.C282141 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                int i;
                ImageView imageView = CustomEditText.this.f70728a;
                if (bool == null || !bool.booleanValue()) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f70730c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.appcenter.common.view.CustomEditText.C282152 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CustomEditText.this.f70729b.mo5929b(Boolean.valueOf(!TextUtils.isEmpty(charSequence)));
            }
        });
    }

    public CustomEditText(Context context) {
        this(context, null);
    }

    public void setHint(String str) {
        this.f70730c.setHint(str);
    }

    public void setText(String str) {
        this.f70730c.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m103311a(View view) {
        EditText editText = this.f70730c;
        if (editText != null) {
            editText.setText("");
        }
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103310a();
    }
}
