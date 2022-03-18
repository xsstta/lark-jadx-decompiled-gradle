package com.ss.android.lark.calendar.impl.features.calendarview.widget;

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
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Iterator;

public class SearchBar extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    ImageView f78469a;

    /* renamed from: b */
    EditText f78470b;

    /* renamed from: c */
    ImageView f78471c;

    /* renamed from: d */
    ArrayList<TextWatcher> f78472d = new ArrayList<>();

    /* renamed from: e */
    private boolean f78473e = C30022a.f74883b.mo112706n();

    /* renamed from: c */
    public void mo112606c() {
        this.f78471c.setVisibility(8);
    }

    public void clearFocus() {
        this.f78470b.clearFocus();
    }

    /* renamed from: a */
    public void mo112601a() {
        this.f78470b.getText().clear();
    }

    public String getText() {
        return this.f78470b.getText().toString();
    }

    /* renamed from: b */
    public void mo112604b() {
        this.f78470b.setFocusable(true);
        this.f78470b.setFocusableInTouchMode(true);
        this.f78470b.requestFocus();
    }

    public void setEditTextImeOptions(int i) {
        this.f78470b.setImeOptions(i);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.f78470b.setFilters(inputFilterArr);
    }

    public void setHint(int i) {
        this.f78470b.setHint(i);
    }

    public void setIcon(int i) {
        this.f78469a.setImageResource(i);
    }

    public void setSearchIconVisibility(int i) {
        this.f78469a.setVisibility(i);
    }

    public void setSelection(int i) {
        this.f78470b.setSelection(i);
    }

    public void setText(String str) {
        this.f78470b.setText(str);
    }

    public void setTextColor(int i) {
        this.f78470b.setTextColor(i);
    }

    /* renamed from: b */
    public void mo112605b(TextWatcher textWatcher) {
        if (this.f78473e) {
            this.f78472d.remove(textWatcher);
        }
        this.f78470b.removeTextChangedListener(textWatcher);
    }

    public void setStyle(int i) {
        this.f78470b.setTextAppearance(getContext(), i);
    }

    public SearchBar(Context context) {
        super(context);
        m116050a(context);
    }

    /* renamed from: a */
    public void mo112603a(TextWatcher textWatcher) {
        if (this.f78473e) {
            this.f78472d.add(textWatcher);
        }
        this.f78470b.addTextChangedListener(textWatcher);
    }

    public void setEditTextEnabled(boolean z) {
        this.f78470b.setEnabled(z);
        this.f78470b.setFocusable(false);
        this.f78470b.setFocusableInTouchMode(false);
    }

    /* renamed from: a */
    private void m116050a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.calendar_widget_search_bar_layout, (ViewGroup) this, true);
        this.f78469a = (ImageView) findViewById(R.id.icon);
        this.f78470b = (EditText) findViewById(R.id.etSearchBar);
        ImageView imageView = (ImageView) findViewById(R.id.clearBtn);
        this.f78471c = imageView;
        imageView.setOnClickListener(this);
        this.f78470b.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SearchBar.C310881 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    SearchBar.this.f78471c.setVisibility(4);
                } else {
                    SearchBar.this.f78471c.setVisibility(0);
                }
            }
        });
    }

    public void onClick(View view) {
        if (view == this.f78471c) {
            this.f78470b.setText((CharSequence) null);
            Iterator<TextWatcher> it = this.f78472d.iterator();
            while (it.hasNext()) {
                it.next().afterTextChanged(Editable.Factory.getInstance().newEditable(""));
            }
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116050a(context);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m116050a(context);
    }

    /* renamed from: a */
    public void mo112602a(int i, int i2, int i3, int i4) {
        UIUtils.setMargins(this.f78470b, i, i2, i3, i4);
    }
}
