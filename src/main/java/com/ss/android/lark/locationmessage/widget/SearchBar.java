package com.ss.android.lark.locationmessage.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;

public class SearchBar extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    ImageView f105865a;

    /* renamed from: b */
    EditText f105866b;

    /* renamed from: c */
    ImageView f105867c;

    public void clearFocus() {
        this.f105866b.clearFocus();
    }

    public String getText() {
        return this.f105866b.getText().toString();
    }

    public SearchBar(Context context) {
        super(context);
        m165375a(context);
    }

    /* renamed from: a */
    public void mo149873a(TextWatcher textWatcher) {
        this.f105866b.addTextChangedListener(textWatcher);
    }

    /* renamed from: b */
    public void mo149874b(TextWatcher textWatcher) {
        this.f105866b.removeTextChangedListener(textWatcher);
    }

    public void setEditTextImeOptions(int i) {
        this.f105866b.setImeOptions(i);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f105866b.setFilters(inputFilterArr);
    }

    public void setHint(int i) {
        this.f105866b.setHint(i);
    }

    public void setIcon(int i) {
        this.f105865a.setImageResource(i);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f105866b.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setSearchIconVisibility(int i) {
        this.f105865a.setVisibility(i);
    }

    public void setSelection(int i) {
        this.f105866b.setSelection(i);
    }

    public void setText(String str) {
        this.f105866b.setText(str);
    }

    public void setTextColor(int i) {
        this.f105866b.setTextColor(i);
    }

    public void onClick(View view) {
        if (view == this.f105867c) {
            this.f105866b.setText((CharSequence) null);
        }
    }

    public void setEditTextEnabled(boolean z) {
        this.f105866b.setEnabled(z);
        this.f105866b.setFocusable(z);
        this.f105866b.setFocusableInTouchMode(z);
    }

    public void setStyle(int i) {
        this.f105866b.setTextAppearance(getContext(), i);
    }

    /* renamed from: a */
    private void m165375a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.location_widget_search_bar_layout, (ViewGroup) this, true);
        this.f105865a = (ImageView) findViewById(R.id.icon);
        this.f105866b = (EditText) findViewById(R.id.etSearchBar);
        ImageView imageView = (ImageView) findViewById(R.id.clearBtn);
        this.f105867c = imageView;
        imageView.setOnClickListener(this);
        this.f105866b.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.locationmessage.widget.SearchBar.C416851 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    SearchBar.this.f105867c.setVisibility(4);
                } else {
                    SearchBar.this.f105867c.setVisibility(0);
                }
            }
        });
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m165375a(context);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m165375a(context);
    }
}
