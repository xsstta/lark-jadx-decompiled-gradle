package com.ss.android.photoeditor.text;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.view.ColorChoiceView;

public class TextInputView extends RelativeLayout {

    /* renamed from: a */
    public AbstractC59800c f148615a;

    /* renamed from: b */
    public EditText f148616b;

    /* renamed from: c */
    public Activity f148617c;

    /* renamed from: d */
    public boolean f148618d;

    /* renamed from: e */
    public int f148619e;

    /* renamed from: f */
    private AbstractC59799b f148620f;

    /* renamed from: g */
    private ViewTreeObserver$OnGlobalLayoutListenerC59798a f148621g;

    /* renamed from: h */
    private TextView f148622h;

    /* renamed from: i */
    private TextView f148623i;

    /* renamed from: j */
    private ColorChoiceView f148624j;

    /* renamed from: com.ss.android.photoeditor.text.TextInputView$b */
    public interface AbstractC59799b {
        /* renamed from: a */
        void mo203547a();
    }

    /* renamed from: com.ss.android.photoeditor.text.TextInputView$c */
    public interface AbstractC59800c {
        /* renamed from: a */
        void mo203546a(String str, int i);
    }

    /* renamed from: c */
    public void mo203553c() {
        AbstractC59799b bVar = this.f148620f;
        if (bVar != null) {
            bVar.mo203547a();
        }
    }

    /* renamed from: d */
    public void mo203554d() {
        this.f148624j.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        AbstractC59799b bVar = this.f148620f;
        if (bVar != null) {
            bVar.mo203547a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.text.TextInputView$a */
    public class ViewTreeObserver$OnGlobalLayoutListenerC59798a implements ViewTreeObserver.OnGlobalLayoutListener {
        /* renamed from: a */
        private int m231962a() {
            return ((WindowManager) TextInputView.this.getContext().getSystemService("window")).getDefaultDisplay().getHeight();
        }

        public void onGlobalLayout() {
            Rect rect = new Rect();
            TextInputView.this.f148617c.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int a = m231962a();
            int i = a - rect.bottom;
            boolean z = TextInputView.this.f148618d;
            Log.m165379d("TextInputView", "keyboardHeight = " + i);
            if (Math.abs(i) > a / 5) {
                TextInputView.this.f148618d = true;
                TextInputView.this.mo203553c();
                int[] iArr = new int[2];
                TextInputView.this.getLocationOnScreen(iArr);
                TextInputView.this.mo203551a((-(((float) i) - (((float) a) - ((float) iArr[1])))) - ((float) TextInputView.this.getHeight()));
                return;
            }
            if (z) {
                TextInputView.this.mo203554d();
            }
            TextInputView.this.f148618d = false;
        }

        private ViewTreeObserver$OnGlobalLayoutListenerC59798a() {
        }
    }

    /* renamed from: b */
    public void mo203552b() {
        InputMethodManager inputMethodManager;
        if (this.f148617c != null && (inputMethodManager = (InputMethodManager) this.f148616b.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f148616b.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public void mo203550a() {
        if (this.f148617c != null) {
            this.f148616b.setFocusable(true);
            this.f148616b.setFocusableInTouchMode(true);
            this.f148616b.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f148616b.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f148616b, 0);
            }
        }
    }

    /* renamed from: e */
    private void m231955e() {
        inflate(getContext(), R.layout.photo_editor_text_input_view, this);
        this.f148622h = (TextView) findViewById(R.id.tv_confirm);
        this.f148623i = (TextView) findViewById(R.id.tv_back);
        this.f148616b = (EditText) findViewById(R.id.et_input);
        this.f148624j = (ColorChoiceView) findViewById(R.id.text_color_selector);
        this.f148622h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.text.TextInputView.View$OnClickListenerC597951 */

            public void onClick(View view) {
                String obj = TextInputView.this.f148616b.getText().toString();
                if (TextInputView.this.f148615a != null) {
                    TextInputView.this.f148615a.mo203546a(obj, TextInputView.this.f148619e);
                }
            }
        });
        this.f148623i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.text.TextInputView.View$OnClickListenerC597962 */

            public void onClick(View view) {
                if (TextInputView.this.f148615a != null) {
                    TextInputView.this.f148615a.mo203546a("", -1);
                }
            }
        });
        this.f148624j.setOnColorChangedListener(new ColorChoiceView.AbstractC59657a() {
            /* class com.ss.android.photoeditor.text.TextInputView.C597973 */

            @Override // com.ss.android.photoeditor.base.view.ColorChoiceView.AbstractC59657a
            /* renamed from: a */
            public void mo203195a(int i, ColorChoiceView.ChoiceColor choiceColor) {
                TextInputView.this.f148616b.setTextColor(i);
                TextInputView.this.f148619e = i;
            }
        });
        this.f148621g = new ViewTreeObserver$OnGlobalLayoutListenerC59798a();
        if (getContext() instanceof Activity) {
            setActivity((Activity) getContext());
        }
    }

    public void setBottomColorChoiceChangeCallback(AbstractC59799b bVar) {
        this.f148620f = bVar;
    }

    public void setOnInputSaveCallback(AbstractC59800c cVar) {
        this.f148615a = cVar;
    }

    public TextInputView(Context context) {
        super(context);
        m231955e();
    }

    /* renamed from: a */
    public void mo203551a(float f) {
        this.f148624j.setTranslationY(f);
    }

    public void setText(CharSequence charSequence) {
        this.f148616b.setText(charSequence);
        this.f148616b.setSelection(charSequence.length());
    }

    public void setTextColor(int i) {
        this.f148624j.mo203190a(i);
        this.f148616b.setTextColor(i);
        this.f148619e = i;
    }

    public void setActivity(Activity activity) {
        if (activity != null) {
            this.f148617c = activity;
            activity.getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this.f148621g);
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.f148621g);
        }
    }

    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m231955e();
    }

    public TextInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m231955e();
    }
}
