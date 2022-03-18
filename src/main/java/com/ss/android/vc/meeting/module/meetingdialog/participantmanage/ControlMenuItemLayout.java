package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;

public class ControlMenuItemLayout extends FrameLayout {

    /* renamed from: g */
    private static final Integer f156605g = 0;

    /* renamed from: h */
    private static final Integer f156606h = 1;

    /* renamed from: a */
    private Context f156607a;

    /* renamed from: b */
    private View f156608b;

    /* renamed from: c */
    private TextView f156609c;

    /* renamed from: d */
    private ImageView f156610d;

    /* renamed from: e */
    private ImageView f156611e;

    /* renamed from: f */
    private View.OnClickListener f156612f;

    /* renamed from: a */
    public void mo215526a() {
        this.f156609c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156609c.setText(R.string.View_VM_NoCamera);
        this.f156610d.setImageResource(R.drawable.ud_icon_video_off_outlined);
        this.f156610d.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        this.f156611e.setVisibility(0);
    }

    /* renamed from: b */
    public void mo215527b() {
        this.f156609c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156609c.setText(R.string.View_VM_AccessToCameraDenied);
        C60783v.m236227a(this.f156610d, (int) R.drawable.ud_icon_video_off_outlined, (int) R.color.icon_disable);
        this.f156611e.setVisibility(0);
    }

    /* renamed from: c */
    public void mo215528c() {
        this.f156609c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156609c.setText(R.string.View_VM_NoMic);
        this.f156610d.setImageResource(R.drawable.ud_icon_mic_off_outlined);
        this.f156610d.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        this.f156611e.setVisibility(0);
    }

    /* renamed from: d */
    public void mo215529d() {
        this.f156609c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156609c.setText(R.string.View_VM_AccessToMicDenied);
        C60783v.m236227a(this.f156610d, (int) R.drawable.ud_icon_mic_off_outlined, (int) R.color.icon_disable);
        this.f156611e.setVisibility(0);
    }

    public ControlMenuItemLayout(Context context) {
        this(context, null);
    }

    public void setIconResource(int i) {
        if (i != 0) {
            this.f156610d.setImageResource(i);
        }
    }

    public void setTitleText(String str) {
        if (str != null) {
            this.f156609c.setText(str);
        }
    }

    public void setClickListener(final View.OnClickListener onClickListener) {
        this.f156612f = onClickListener;
        this.f156608b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlMenuItemLayout.C623181 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                onClickListener.onClick(view);
            }
        });
    }

    public void setTitleText(int i) {
        String a = C60773o.m236119a(i);
        if (a != null) {
            this.f156609c.setText(a);
        }
    }

    private void setColor(int i) {
        if (i == f156606h.intValue()) {
            this.f156609c.setTextColor(C60773o.m236126d(R.color.function_danger_500));
            this.f156610d.getDrawable().setTint(C60773o.m236126d(R.color.function_danger_500));
            return;
        }
        this.f156609c.setTextColor(C60773o.m236126d(R.color.text_title));
        this.f156610d.getDrawable().setTint(C60773o.m236126d(R.color.text_title));
    }

    public ControlMenuItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m243444a(Context context, AttributeSet attributeSet) {
        this.f156607a = context;
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.participant_control_item_menu_layout, (ViewGroup) this, true);
        this.f156608b = inflate;
        inflate.setBackground(C60773o.m236128f(R.drawable.participant_list_item_selector));
        this.f156609c = (TextView) this.f156608b.findViewById(R.id.title_tv);
        this.f156610d = (ImageView) this.f156608b.findViewById(R.id.icon_iv);
        this.f156611e = (ImageView) this.f156608b.findViewById(R.id.forbid_icon);
        TypedArray obtainStyledAttributes = this.f156607a.obtainStyledAttributes(attributeSet, new int[]{R.attr.color_style, R.attr.icon_src, R.attr.title_text});
        setTitleText(obtainStyledAttributes.getString(2));
        setIconResource(obtainStyledAttributes.getResourceId(1, 0));
        setColor(obtainStyledAttributes.getInteger(0, f156605g.intValue()));
    }

    public ControlMenuItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243444a(context, attributeSet);
    }
}
