package com.ss.android.lark.passport.infra.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.utils.ViewUtils;

public class CommonTitleBar extends ConstraintLayout {

    /* renamed from: a */
    public AbstractC49238b f123560a;

    /* renamed from: b */
    public Activity f123561b;

    /* renamed from: c */
    private CharSequence f123562c;

    /* renamed from: d */
    private int f123563d;

    /* renamed from: e */
    private int f123564e;

    /* renamed from: f */
    private float f123565f;

    /* renamed from: g */
    private float f123566g;

    /* renamed from: h */
    private int f123567h;

    /* renamed from: i */
    private int f123568i;

    /* renamed from: j */
    private int f123569j;

    /* renamed from: k */
    private boolean f123570k;

    /* renamed from: l */
    private int f123571l;

    /* renamed from: m */
    private String f123572m;

    /* renamed from: n */
    private String f123573n;

    /* renamed from: o */
    private int f123574o;

    /* renamed from: p */
    private ImageView f123575p;

    /* renamed from: q */
    private TextView f123576q;

    /* renamed from: r */
    private TextView f123577r;

    /* renamed from: s */
    private TextView f123578s;

    /* renamed from: t */
    private FrameLayout f123579t;

    /* renamed from: u */
    private Context f123580u;

    /* renamed from: com.ss.android.lark.passport.infra.widget.CommonTitleBar$a */
    public interface AbstractC49236a {

        /* renamed from: com.ss.android.lark.passport.infra.widget.CommonTitleBar$a$a */
        public interface AbstractC49237a {
            /* renamed from: a */
            void mo171780a();
        }

        /* renamed from: a */
        View mo171778a();

        /* renamed from: b */
        AbstractC49237a mo171779b();
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.CommonTitleBar$b */
    public interface AbstractC49238b {
        /* renamed from: a */
        void mo171769a();

        /* renamed from: b */
        void mo171770b();

        /* renamed from: c */
        void mo171771c();

        /* renamed from: d */
        void mo171772d();
    }

    /* renamed from: com.ss.android.lark.passport.infra.widget.CommonTitleBar$c */
    public static abstract class AbstractC49239c implements AbstractC49238b {
        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: b */
        public void mo171770b() {
        }

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: c */
        public void mo171771c() {
        }

        @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
        /* renamed from: d */
        public void mo171772d() {
        }
    }

    public TextView getRightTextView() {
        return this.f123578s;
    }

    public TextView getTitleView() {
        return this.f123577r;
    }

    /* renamed from: a */
    public void mo171754a() {
        if (this.f123561b == null) {
            this.f123561b = ViewUtils.m224141a(getContext());
        }
    }

    /* renamed from: b */
    private void m194072b() {
        this.f123560a = new AbstractC49238b() {
            /* class com.ss.android.lark.passport.infra.widget.CommonTitleBar.C492301 */

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: b */
            public void mo171770b() {
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: c */
            public void mo171771c() {
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: d */
            public void mo171772d() {
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: a */
            public void mo171769a() {
                CommonTitleBar.this.mo171754a();
                if (CommonTitleBar.this.f123561b != null) {
                    CommonTitleBar.this.f123561b.onBackPressed();
                }
            }
        };
        setBackgroundColor(this.f123563d);
        this.f123575p = (ImageView) findViewById(R.id.left_icon);
        this.f123576q = (TextView) findViewById(R.id.left_text);
        this.f123577r = (TextView) findViewById(R.id.center);
        this.f123578s = (TextView) findViewById(R.id.tv_right);
        this.f123577r.setClickable(false);
        this.f123579t = (FrameLayout) findViewById(R.id.left_container);
        if (TextUtils.isEmpty(this.f123562c)) {
            this.f123577r.setVisibility(8);
        } else {
            this.f123577r.setVisibility(0);
        }
        this.f123577r.setText(this.f123562c);
        this.f123577r.setTextColor(this.f123564e);
        this.f123577r.setTextSize((float) C49154ag.m193842d(getContext(), (int) this.f123565f));
        TextView textView = this.f123577r;
        textView.setTypeface(textView.getTypeface(), 1);
        setRithtText(this.f123573n);
        int i = this.f123569j;
        if (i == 0) {
            this.f123576q.setVisibility(8);
            this.f123575p.setVisibility(0);
            this.f123579t.setVisibility(8);
            this.f123575p.setImageDrawable(UDIconUtils.getIconDrawable(this.f123580u, this.f123571l, UDColorUtils.getColor(this.f123580u, R.color.icon_n1)));
        } else if (i == 1) {
            this.f123576q.setVisibility(0);
            this.f123575p.setVisibility(8);
            this.f123579t.setVisibility(8);
            this.f123576q.setText(this.f123572m);
            this.f123576q.setTextSize((float) C49154ag.m193842d(getContext(), (int) this.f123566g));
            this.f123576q.setTextColor(this.f123567h);
        } else if (i == 2) {
            this.f123576q.setVisibility(8);
            this.f123575p.setVisibility(8);
            this.f123579t.setVisibility(0);
        }
        m194071a(this.f123575p, this.f123574o);
        m194071a(this.f123576q, this.f123574o);
        m194071a(this.f123579t, this.f123574o);
        this.f123575p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.infra.widget.CommonTitleBar.View$OnClickListenerC492312 */

            public void onClick(View view) {
                if (CommonTitleBar.this.f123560a != null) {
                    CommonTitleBar.this.f123560a.mo171769a();
                }
            }
        });
        this.f123576q.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.infra.widget.CommonTitleBar.View$OnClickListenerC492323 */

            public void onClick(View view) {
                if (CommonTitleBar.this.f123560a != null) {
                    CommonTitleBar.this.f123560a.mo171770b();
                }
            }
        });
        this.f123577r.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.infra.widget.CommonTitleBar.View$OnClickListenerC492334 */

            public void onClick(View view) {
                if (CommonTitleBar.this.f123560a != null) {
                    CommonTitleBar.this.f123560a.mo171771c();
                }
            }
        });
        this.f123578s.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.infra.widget.CommonTitleBar.View$OnClickListenerC492345 */

            public void onClick(View view) {
                if (CommonTitleBar.this.f123560a != null) {
                    CommonTitleBar.this.f123560a.mo171772d();
                }
            }
        });
    }

    public void setTitleClickListener(AbstractC49238b bVar) {
        this.f123560a = bVar;
    }

    public CommonTitleBar(Context context) {
        this(context, null);
    }

    public void setLeftTextColor(int i) {
        this.f123567h = i;
        this.f123576q.setTextColor(i);
    }

    public void setRightTvEnable(boolean z) {
        this.f123578s.setEnabled(z);
    }

    public void setTitleColor(int i) {
        this.f123564e = i;
        this.f123577r.setTextColor(i);
    }

    public void setLeftTextSize(float f) {
        this.f123566g = C49154ag.m193836b(getContext(), f);
        this.f123576q.setTextSize(f);
    }

    public void setLeftText(String str) {
        this.f123569j = 1;
        this.f123576q.setVisibility(0);
        this.f123575p.setVisibility(8);
        this.f123579t.setVisibility(8);
        this.f123572m = str;
        this.f123576q.setText(str);
    }

    public void setTitleText(CharSequence charSequence) {
        this.f123562c = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            this.f123577r.setVisibility(8);
        } else {
            this.f123577r.setVisibility(0);
        }
        this.f123577r.setText(this.f123562c);
    }

    public void setTitleTextSize(int i) {
        float f = (float) i;
        this.f123565f = C49154ag.m193836b(getContext(), f);
        this.f123577r.setTextSize(f);
    }

    public void setLeftClickAction(final AbstractC49236a aVar) {
        this.f123569j = 2;
        this.f123576q.setVisibility(8);
        this.f123575p.setVisibility(8);
        this.f123579t.setVisibility(0);
        this.f123579t.addView(aVar.mo171778a(), new FrameLayout.LayoutParams(-2, -2));
        this.f123579t.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.infra.widget.CommonTitleBar.View$OnClickListenerC492356 */

            public void onClick(View view) {
                AbstractC49236a.AbstractC49237a b = aVar.mo171779b();
                if (b != null) {
                    b.mo171780a();
                }
            }
        });
    }

    public void setLeftIconRes(int i) {
        this.f123571l = i;
        this.f123576q.setVisibility(8);
        this.f123575p.setVisibility(0);
        this.f123579t.setVisibility(8);
        this.f123575p.setImageDrawable(UDIconUtils.getIconDrawable(this.f123580u, this.f123571l, UDColorUtils.getColor(this.f123580u, R.color.icon_n1)));
    }

    public void setRithtText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f123578s.setVisibility(8);
            return;
        }
        this.f123578s.setVisibility(0);
        this.f123578s.setText(str);
        if (!this.f123570k) {
            this.f123578s.setTextColor(this.f123568i);
        }
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m194071a(View view, int i) {
        ((ConstraintLayout.LayoutParams) view.getLayoutParams()).leftMargin = i;
    }

    /* renamed from: a */
    public void mo171755a(boolean z, boolean z2) {
        int i;
        ImageView imageView = this.f123575p;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        int color = UDColorUtils.getColor(this.f123580u, R.color.icon_n1);
        Drawable iconDrawable = UDIconUtils.getIconDrawable(this.f123580u, (int) R.drawable.signin_sdk_titlebar_close_normal, color);
        Drawable iconDrawable2 = UDIconUtils.getIconDrawable(this.f123580u, (int) R.drawable.signin_sdk_titlebar_back_normal, color);
        ImageView imageView2 = this.f123575p;
        if (!z2) {
            iconDrawable = iconDrawable2;
        }
        imageView2.setImageDrawable(iconDrawable);
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f123562c = "";
        this.f123563d = C49154ag.m193840c(getContext(), R.color.lkui_transparent);
        this.f123564e = C49154ag.m193840c(getContext(), R.color.text_title);
        this.f123565f = C49154ag.m193836b(getContext(), 17.0f);
        this.f123566g = C49154ag.m193836b(getContext(), 17.0f);
        this.f123567h = C49154ag.m193840c(getContext(), R.color.text_title);
        this.f123568i = C49154ag.m193840c(getContext(), R.color.text_title);
        this.f123569j = 0;
        this.f123570k = false;
        this.f123571l = R.drawable.signin_sdk_titlebar_back_normal;
        this.f123572m = "";
        this.f123573n = "";
        this.f123574o = 16;
        this.f123580u = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.tb_back_icon, R.attr.tb_background, R.attr.tb_divider_visible, R.attr.tb_left_icon, R.attr.tb_left_padding, R.attr.tb_left_text, R.attr.tb_left_text_color, R.attr.tb_left_text_size, R.attr.tb_left_type, R.attr.tb_right_padding, R.attr.tb_right_text, R.attr.tb_right_text_color, R.attr.tb_right_text_size, R.attr.tb_title, R.attr.tb_title_color, R.attr.tb_title_text, R.attr.tb_title_text_size, R.attr.tb_use_defalut_selector});
        this.f123562c = obtainStyledAttributes.getString(15);
        this.f123563d = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.lkui_transparent));
        this.f123564e = obtainStyledAttributes.getColor(14, context.getResources().getColor(R.color.text_title));
        this.f123571l = obtainStyledAttributes.getResourceId(3, R.drawable.signin_sdk_titlebar_back_normal);
        this.f123574o = obtainStyledAttributes.getDimensionPixelOffset(4, C49154ag.m193828a(getContext(), 16.0f));
        this.f123572m = obtainStyledAttributes.getString(5);
        this.f123573n = obtainStyledAttributes.getString(10);
        this.f123565f = obtainStyledAttributes.getDimension(16, C49154ag.m193836b(getContext(), 17.0f));
        this.f123566g = obtainStyledAttributes.getDimension(7, C49154ag.m193836b(getContext(), 17.0f));
        this.f123567h = obtainStyledAttributes.getColor(6, context.getResources().getColor(R.color.text_title));
        C49154ag.m193836b(getContext(), 17.0f);
        boolean z = obtainStyledAttributes.getBoolean(17, false);
        this.f123570k = z;
        if (!z) {
            this.f123568i = obtainStyledAttributes.getColor(11, context.getResources().getColor(R.color.text_title));
        }
        this.f123569j = obtainStyledAttributes.getInteger(8, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_common_title_bar, (ViewGroup) this, true);
        m194072b();
    }
}
