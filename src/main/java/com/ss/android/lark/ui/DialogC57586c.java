package com.ss.android.lark.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.ui.c */
public class DialogC57586c extends DialogC57584b {

    /* renamed from: a */
    private FrameLayout f141930a;

    /* renamed from: b */
    private FrameLayout f141931b;

    /* renamed from: d */
    private FrameLayout f141932d;

    /* renamed from: e */
    private FrameLayout f141933e;

    /* renamed from: f */
    private FrameLayout f141934f;

    /* renamed from: g */
    private TextView f141935g;

    /* renamed from: h */
    private TextView f141936h;

    /* renamed from: i */
    private View f141937i;

    /* renamed from: j */
    private View f141938j;

    /* renamed from: k */
    private TextView f141939k;

    /* renamed from: l */
    private TextView f141940l;

    /* renamed from: m */
    private TextView f141941m;

    /* renamed from: n */
    private Context f141942n;

    @Override // com.ss.android.lark.ui.DialogC57584b
    public void show() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        attributes.width = C57582a.m223601a(this.f141942n, 300.0f);
        super.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ui.c$a */
    public class View$OnClickListenerC57588a implements View.OnClickListener {
        private View$OnClickListenerC57588a() {
        }

        public void onClick(View view) {
            DialogC57586c.this.cancel();
        }
    }

    /* renamed from: b */
    public DialogC57586c mo195562b(int i) {
        this.f141936h.setTextSize((float) i);
        return this;
    }

    /* renamed from: d */
    public DialogC57586c mo195568d(int i) {
        this.f141936h.setTextColor(i);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ui.c$b */
    public class View$OnClickListenerC57589b implements View.OnClickListener {

        /* renamed from: b */
        private View.OnClickListener f141945b;

        /* renamed from: c */
        private boolean f141946c;

        public void onClick(View view) {
            if (this.f141946c) {
                DialogC57586c.this.dismiss();
            }
            this.f141945b.onClick(view);
        }

        View$OnClickListenerC57589b(View.OnClickListener onClickListener, boolean z) {
            this.f141945b = onClickListener;
            this.f141946c = z;
        }
    }

    public DialogC57586c(Context context) {
        super(context, R.style.CommonDialog);
        setContentView(R.layout.common_dialog_layout);
        m223620a(context);
    }

    /* renamed from: a */
    public DialogC57586c mo195558a(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f141935g.getLayoutParams();
        layoutParams.gravity = i;
        this.f141935g.setLayoutParams(layoutParams);
        return this;
    }

    /* renamed from: c */
    public DialogC57586c mo195566c(int i) {
        this.f141936h.setTypeface(this.f141936h.getTypeface(), i);
        return this;
    }

    /* renamed from: b */
    public DialogC57586c mo195563b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C57582a.m223612b(this.f141936h);
        } else {
            C57582a.m223606a(this.f141936h);
            this.f141936h.setText(charSequence);
        }
        return this;
    }

    /* renamed from: a */
    public DialogC57586c mo195559a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C57582a.m223612b(this.f141935g);
        } else {
            C57582a.m223606a(this.f141935g);
            this.f141935g.setText(charSequence);
        }
        return this;
    }

    /* renamed from: a */
    private void m223620a(Context context) {
        this.f141942n = context;
        this.f141935g = (TextView) findViewById(R.id.dialog_title);
        this.f141936h = (TextView) findViewById(R.id.dialog_message);
        this.f141930a = (FrameLayout) findViewById(R.id.dialog_title_container);
        this.f141931b = (FrameLayout) findViewById(R.id.dialog_content_container);
        this.f141932d = (FrameLayout) findViewById(R.id.dialog_content_divider_container);
        this.f141933e = (FrameLayout) findViewById(R.id.dialog_buttons_container);
        this.f141937i = findViewById(R.id.dialog_content_divider);
        this.f141938j = findViewById(R.id.dialog_vertical_divider);
        this.f141939k = (TextView) findViewById(R.id.dialog_btn_left);
        this.f141940l = (TextView) findViewById(R.id.dialog_btn_right);
        this.f141941m = (TextView) findViewById(R.id.dialog_single_btn);
        this.f141934f = (FrameLayout) findViewById(R.id.dialog_bottom_holder);
    }

    /* renamed from: a */
    public DialogC57586c mo195560a(CharSequence charSequence, View.OnClickListener onClickListener) {
        return mo195561a(charSequence, onClickListener, true);
    }

    /* renamed from: b */
    public DialogC57586c mo195564b(CharSequence charSequence, View.OnClickListener onClickListener) {
        return mo195565b(charSequence, onClickListener, true);
    }

    /* renamed from: a */
    private void m223621a(View view, View.OnClickListener onClickListener, boolean z) {
        view.setVisibility(0);
        if (onClickListener != null) {
            view.setOnClickListener(new View$OnClickListenerC57589b(onClickListener, z));
        } else {
            view.setOnClickListener(new View$OnClickListenerC57588a());
        }
    }

    /* renamed from: b */
    public DialogC57586c mo195565b(CharSequence charSequence, View.OnClickListener onClickListener, boolean z) {
        this.f141938j.setVisibility(0);
        if (TextUtils.isEmpty(charSequence)) {
            this.f141940l.setText(this.f141942n.getString(R.string.Lark_Legacy_ConfirmInfo));
        } else {
            this.f141940l.setText(charSequence);
        }
        m223621a(this.f141940l, onClickListener, z);
        return this;
    }

    /* renamed from: c */
    public DialogC57586c mo195567c(CharSequence charSequence, View.OnClickListener onClickListener, boolean z) {
        this.f141938j.setVisibility(8);
        this.f141939k.setVisibility(8);
        this.f141940l.setVisibility(8);
        this.f141941m.setVisibility(0);
        if (TextUtils.isEmpty(charSequence)) {
            this.f141941m.setText(this.f141942n.getString(R.string.Lark_Legacy_ConfirmInfo));
        } else {
            this.f141941m.setText(charSequence);
        }
        m223621a(this.f141941m, onClickListener, z);
        return this;
    }

    /* renamed from: a */
    public DialogC57586c mo195561a(CharSequence charSequence, View.OnClickListener onClickListener, boolean z) {
        this.f141938j.setVisibility(0);
        if (TextUtils.isEmpty(charSequence)) {
            this.f141939k.setText(this.f141942n.getString(R.string.Lark_Legacy_CancelTip));
        } else {
            this.f141939k.setText(charSequence);
        }
        m223621a(this.f141939k, onClickListener, z);
        return this;
    }
}
