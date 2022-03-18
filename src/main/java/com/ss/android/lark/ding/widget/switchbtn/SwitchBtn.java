package com.ss.android.lark.ding.widget.switchbtn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;

public class SwitchBtn extends FrameLayout {

    /* renamed from: a */
    public SwitchView f94504a;

    /* renamed from: b */
    public TextView f94505b;

    /* renamed from: c */
    public TextView f94506c;

    /* renamed from: d */
    public TextView f94507d;

    /* renamed from: e */
    public AbstractC36784a f94508e;

    /* renamed from: f */
    public Context f94509f;

    /* renamed from: g */
    public boolean f94510g = true;

    /* renamed from: com.ss.android.lark.ding.widget.switchbtn.SwitchBtn$a */
    public interface AbstractC36784a {
        /* renamed from: a */
        void mo135349a(int i);
    }

    /* renamed from: b */
    private void m145091b() {
        this.f94505b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.widget.switchbtn.SwitchBtn.View$OnClickListenerC367811 */

            public void onClick(View view) {
                Log.m165389i("SCREEN_TAG", "appTV");
                SwitchBtn.this.f94504a.mo135495a(1);
                SwitchBtn.this.f94505b.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.static_white));
                if (SwitchBtn.this.f94510g) {
                    SwitchBtn.this.f94507d.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.function_info_500));
                    SwitchBtn.this.f94506c.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.function_info_500));
                }
                if (SwitchBtn.this.f94508e != null) {
                    SwitchBtn.this.f94508e.mo135349a(1);
                }
            }
        });
        this.f94506c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.widget.switchbtn.SwitchBtn.View$OnClickListenerC367822 */

            public void onClick(View view) {
                if (SwitchBtn.this.f94510g) {
                    SwitchBtn.this.f94504a.mo135495a(2);
                    SwitchBtn.this.f94505b.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.function_info_500));
                    SwitchBtn.this.f94507d.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.function_info_500));
                    SwitchBtn.this.f94506c.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.static_white));
                }
                if (SwitchBtn.this.f94508e != null) {
                    SwitchBtn.this.f94508e.mo135349a(2);
                }
                Log.m165389i("SCREEN_TAG", "smsTv");
            }
        });
        this.f94507d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ding.widget.switchbtn.SwitchBtn.View$OnClickListenerC367833 */

            public void onClick(View view) {
                if (SwitchBtn.this.f94510g) {
                    SwitchBtn.this.f94504a.mo135495a(3);
                    SwitchBtn.this.f94505b.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.function_info_500));
                    SwitchBtn.this.f94506c.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.function_info_500));
                    SwitchBtn.this.f94507d.setTextColor(UIUtils.getColor(SwitchBtn.this.f94509f, R.color.static_white));
                }
                if (SwitchBtn.this.f94508e != null) {
                    SwitchBtn.this.f94508e.mo135349a(3);
                }
                Log.m165389i("SCREEN_TAG", "phoneTv");
            }
        });
    }

    /* renamed from: a */
    public void mo135489a() {
        if (this.f94510g) {
            this.f94506c.setTextColor(UIUtils.getColor(this.f94509f, R.color.function_info_500));
            this.f94506c.setBackground(getResources().getDrawable(R.drawable.ding_switch_btn_item_bg));
            this.f94507d.setTextColor(UIUtils.getColor(this.f94509f, R.color.function_info_500));
            setBackgroundResource(R.drawable.ding_switch_btn_frame);
            return;
        }
        this.f94506c.setTextColor(UIUtils.getColor(this.f94509f, R.color.text_disable));
        this.f94506c.setBackground(getResources().getDrawable(R.drawable.ding_switch_btn_item_bg_gray));
        this.f94507d.setTextColor(UIUtils.getColor(this.f94509f, R.color.text_disable));
        setBackgroundResource(R.drawable.ding_switch_btn_frame_gray);
    }

    public void setOnSwitchBtnListener(AbstractC36784a aVar) {
        this.f94508e = aVar;
    }

    public void setEnableSmsPhone(boolean z) {
        this.f94510g = z;
        mo135489a();
    }

    /* renamed from: a */
    private void m145090a(Context context) {
        this.f94509f = context;
        this.f94504a = new SwitchView(getContext());
        this.f94504a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f94504a.setWeightSum(3.0f);
        addView(this.f94504a);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        TextView textView = new TextView(getContext());
        this.f94505b = textView;
        textView.setText(UIUtils.getString(context, R.string.Lark_Legacy_DingApp));
        this.f94505b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        this.f94505b.setGravity(17);
        this.f94505b.setTextSize(11.0f);
        this.f94505b.setTextColor(UIUtils.getColor(context, R.color.static_white));
        TextView textView2 = new TextView(getContext());
        this.f94506c = textView2;
        textView2.setText(UIUtils.getString(context, R.string.Lark_Legacy_DingAppSms));
        this.f94506c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        this.f94506c.setGravity(17);
        this.f94506c.setTextSize(11.0f);
        this.f94506c.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        this.f94506c.setBackground(getResources().getDrawable(R.drawable.ding_switch_btn_item_bg));
        TextView textView3 = new TextView(getContext());
        this.f94507d = textView3;
        textView3.setText(UIUtils.getString(context, R.string.Lark_Legacy_DingAppCall));
        this.f94507d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        this.f94507d.setGravity(17);
        this.f94507d.setTextSize(11.0f);
        this.f94507d.setTextColor(UIUtils.getColor(context, R.color.function_info_500));
        linearLayout.addView(this.f94505b);
        linearLayout.addView(this.f94506c);
        linearLayout.addView(this.f94507d);
        addView(linearLayout);
        setBackgroundResource(R.drawable.ding_switch_btn_frame);
    }

    public SwitchBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m145090a(context);
        m145091b();
    }
}
