package com.ss.android.appcenter.common.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;

public class SearchBar extends FrameLayout {

    /* renamed from: a */
    public ImageView f70739a;

    /* renamed from: b */
    public AbstractC28217a f70740b;

    /* renamed from: c */
    private RelativeLayout f70741c;

    /* renamed from: d */
    private ImageView f70742d;

    /* renamed from: e */
    private EditText f70743e;

    /* renamed from: f */
    private boolean f70744f;

    /* renamed from: com.ss.android.appcenter.common.view.SearchBar$a */
    public interface AbstractC28217a {
        /* renamed from: a */
        void mo98328a(Editable editable);
    }

    public EditText getEditView() {
        return this.f70743e;
    }

    public AbstractC28217a getTextChangeListener() {
        return this.f70740b;
    }

    /* renamed from: b */
    private void m103322b() {
        EditText editText = this.f70743e;
        if (editText != null) {
            editText.setText("");
        }
    }

    public String getText() {
        EditText editText = this.f70743e;
        if (editText != null) {
            return editText.getText().toString();
        }
        return null;
    }

    /* renamed from: a */
    private void m103319a() {
        this.f70743e.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.appcenter.common.view.SearchBar.C282161 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    SearchBar.this.f70739a.setVisibility(8);
                } else {
                    SearchBar.this.f70739a.setVisibility(0);
                }
                if (SearchBar.this.f70740b != null) {
                    SearchBar.this.f70740b.mo98328a(editable);
                }
            }
        });
        this.f70739a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.common.view.$$Lambda$SearchBar$A0NB7YRRrlJyYbIINjbfLUNtE4 */

            public final void onClick(View view) {
                SearchBar.this.m103324c(view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m103323b(View view) {
        m103322b();
    }

    public void setForbidEdit(boolean z) {
        this.f70744f = z;
    }

    public void setTextChangeListener(AbstractC28217a aVar) {
        this.f70740b = aVar;
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m103324c(View view) {
        this.f70743e.setText("");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.f70744f;
        if (z) {
            return z;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m103320a(Context context) {
        m103321a(LayoutInflater.from(context).inflate(R.layout.appcenter_common_searchbar_layout, (ViewGroup) this, true));
        this.f70744f = false;
    }

    /* renamed from: a */
    private void m103321a(View view) {
        this.f70741c = (RelativeLayout) view.findViewById(R.id.common_searchbar);
        this.f70742d = (ImageView) view.findViewById(R.id.common_searchbar_lefticon);
        this.f70743e = (EditText) view.findViewById(R.id.common_searchbar_edit);
        ImageView imageView = (ImageView) view.findViewById(R.id.common_searchbar_delete);
        this.f70739a = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.common.view.$$Lambda$SearchBar$osbYpPtRpQADc1QunIzpcWH8Nw */

            public final void onClick(View view) {
                SearchBar.this.m103323b(view);
            }
        });
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103320a(context);
        m103319a();
    }
}
