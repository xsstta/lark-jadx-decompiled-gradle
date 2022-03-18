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
import com.ss.android.vc.common.p3083e.C60773o;

public class InMeetingControlPopItemLayout extends FrameLayout {

    /* renamed from: g */
    private static final Integer f156615g = 0;

    /* renamed from: h */
    private static final Integer f156616h = 1;

    /* renamed from: a */
    private Context f156617a;

    /* renamed from: b */
    private View f156618b;

    /* renamed from: c */
    private TextView f156619c;

    /* renamed from: d */
    private ImageView f156620d;

    /* renamed from: e */
    private int f156621e;

    /* renamed from: f */
    private ImageView f156622f;

    /* renamed from: a */
    public void mo215534a() {
        this.f156619c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156619c.setText(R.string.View_VM_NoCamera);
        this.f156620d.setImageResource(R.drawable.ud_icon_video_off_outlined);
        this.f156620d.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        this.f156622f.setVisibility(0);
    }

    /* renamed from: b */
    public void mo215535b() {
        this.f156619c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156619c.setText(R.string.View_VM_AccessToCameraDenied);
        this.f156620d.setImageResource(R.drawable.ud_icon_video_off_outlined);
        this.f156620d.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        this.f156622f.setVisibility(0);
    }

    /* renamed from: c */
    public void mo215536c() {
        this.f156619c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156619c.setText(R.string.View_VM_NoMic);
        this.f156620d.setImageResource(R.drawable.ud_icon_mic_off_outlined);
        this.f156620d.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        this.f156622f.setVisibility(0);
    }

    /* renamed from: d */
    public void mo215537d() {
        this.f156619c.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f156619c.setText(R.string.View_VM_AccessToMicDenied);
        this.f156620d.setImageResource(R.drawable.ud_icon_mic_off_outlined);
        this.f156620d.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        this.f156622f.setVisibility(0);
    }

    public InMeetingControlPopItemLayout(Context context) {
        this(context, null);
    }

    public void setBackgroundResId(int i) {
        this.f156618b.setBackgroundResource(i);
    }

    public void setTitleText(String str) {
        if (str != null) {
            this.f156619c.setText(str);
        }
    }

    /* renamed from: a */
    private int m243449a(int i) {
        if (i == f156616h.intValue()) {
            return R.color.function_danger_500;
        }
        return R.color.text_title;
    }

    /* renamed from: b */
    private int m243451b(int i) {
        if (i == f156616h.intValue()) {
            return R.color.function_danger_500;
        }
        return R.color.icon_n1;
    }

    public void setTitleText(int i) {
        String a = C60773o.m236119a(i);
        if (a != null) {
            this.f156619c.setText(a);
        }
    }

    public void setIconColor(int i) {
        int i2 = this.f156621e;
        if (i2 != -1) {
            this.f156620d.setImageResource(i2);
            this.f156620d.getDrawable().setTint(C60773o.m236126d(i));
        }
    }

    public void setIconImage(int i) {
        this.f156621e = i;
        if (i != -1) {
            this.f156620d.setImageResource(i);
            this.f156620d.getDrawable().setTint(C60773o.m236126d(R.color.icon_n1));
        }
    }

    private void setColor(int i) {
        this.f156619c.setTextColor(C60773o.m236126d(m243449a(i)));
        if (this.f156621e != -1) {
            int d = C60773o.m236126d(m243451b(i));
            this.f156620d.setImageResource(this.f156621e);
            this.f156620d.getDrawable().setTint(d);
        }
    }

    public InMeetingControlPopItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m243450a(Context context, AttributeSet attributeSet) {
        this.f156617a = context;
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.vc_participant_control_item_pop_window, (ViewGroup) this, true);
        this.f156618b = inflate;
        this.f156619c = (TextView) inflate.findViewById(R.id.title_tv);
        this.f156620d = (ImageView) this.f156618b.findViewById(R.id.icon_iv);
        this.f156622f = (ImageView) this.f156618b.findViewById(R.id.forbid_icon);
        TypedArray obtainStyledAttributes = this.f156617a.obtainStyledAttributes(attributeSet, new int[]{R.attr.pop_color_style, R.attr.pop_image_res, R.attr.pop_title_text});
        setTitleText(obtainStyledAttributes.getString(2));
        this.f156621e = obtainStyledAttributes.getResourceId(1, -1);
        setColor(obtainStyledAttributes.getInteger(0, f156615g.intValue()));
        obtainStyledAttributes.recycle();
    }

    public InMeetingControlPopItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243450a(context, attributeSet);
    }
}
