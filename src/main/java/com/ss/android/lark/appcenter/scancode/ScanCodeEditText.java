package com.ss.android.lark.appcenter.scancode;

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

public class ScanCodeEditText extends FrameLayout {

    /* renamed from: a */
    public ImageView f72929a;

    /* renamed from: b */
    public C1177w<Boolean> f72930b;

    /* renamed from: c */
    private EditText f72931c;

    public View getFocusView() {
        return this.f72931c;
    }

    public String getEditContent() {
        EditText editText = this.f72931c;
        if (editText != null) {
            return editText.getText().toString();
        }
        return "";
    }

    /* renamed from: a */
    private void m107028a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.scancode_edit_layout, (ViewGroup) null, false);
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.f72929a = (ImageView) inflate.findViewById(R.id.clear);
        this.f72931c = (EditText) inflate.findViewById(R.id.edit);
        this.f72929a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.appcenter.scancode.$$Lambda$ScanCodeEditText$B_0kZ_3u19pDNtOqH3iLic5ugo */

            public final void onClick(View view) {
                ScanCodeEditText.m270270lambda$B_0kZ_3u19pDNtOqH3iLic5ugo(ScanCodeEditText.this, view);
            }
        });
        C1177w<Boolean> wVar = new C1177w<>();
        this.f72930b = wVar;
        wVar.mo5925a(new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeEditText.C291121 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                int i;
                ImageView imageView = ScanCodeEditText.this.f72929a;
                if (bool == null || !bool.booleanValue()) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f72931c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeEditText.C291132 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                ScanCodeEditText.this.f72930b.mo5929b(Boolean.valueOf(!TextUtils.isEmpty(charSequence)));
            }
        });
    }

    public ScanCodeEditText(Context context) {
        this(context, null);
    }

    public void setHint(String str) {
        this.f72931c.setHint(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m107029a(View view) {
        EditText editText = this.f72931c;
        if (editText != null) {
            editText.setText("");
        }
    }

    public ScanCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScanCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m107028a();
    }
}
