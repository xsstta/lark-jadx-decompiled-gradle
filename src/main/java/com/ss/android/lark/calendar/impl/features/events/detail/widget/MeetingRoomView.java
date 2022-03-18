package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

public class MeetingRoomView extends LinearLayout {

    /* renamed from: a */
    private Context f79745a;

    /* renamed from: b */
    private TextView f79746b;

    /* renamed from: c */
    private TextView f79747c;

    /* renamed from: d */
    private ImageView f79748d;

    /* renamed from: e */
    private boolean f79749e;

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingRoomView$a */
    public interface AbstractC31467a {
        /* renamed from: a */
        void mo113709a();
    }

    /* renamed from: a */
    public boolean mo114183a() {
        return this.f79749e;
    }

    public View getMeetingRoomInfoView() {
        return this.f79748d;
    }

    /* renamed from: b */
    private void m118400b() {
        Context context = getContext();
        this.f79745a = context;
        LayoutInflater.from(context).inflate(R.layout.view_calendar_detail_meeting_room, this);
        this.f79746b = (TextView) findViewById(R.id.meeting_room);
        this.f79747c = (TextView) findViewById(R.id.tv_disabled_icon);
        this.f79748d = (ImageView) findViewById(R.id.meetingRoomInfoIv);
    }

    public void setIsMeetingRoomApproval(boolean z) {
        this.f79749e = z;
    }

    public MeetingRoomView(Context context) {
        super(context);
        m118400b();
    }

    public void setMeetingRoom(CharSequence charSequence) {
        mo114182a(true, charSequence);
    }

    public void setDisabledTvVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f79747c.setVisibility(i);
    }

    public MeetingRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118400b();
    }

    /* renamed from: a */
    private CharSequence m118399a(String str, final AbstractC31467a aVar) {
        if (str.isEmpty()) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingRoomView.C314661 */

            public void onClick(View view) {
                aVar.mo113709a();
            }

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(C32634ae.m125178a(R.color.lkui_B700));
                textPaint.setUnderlineText(false);
            }
        }, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public void mo114182a(boolean z, CharSequence charSequence) {
        this.f79746b.setText(charSequence);
        if (z) {
            this.f79746b.setVisibility(0);
            this.f79746b.setTextColor(UIUtils.getColor(this.f79745a, R.color.text_title));
            this.f79746b.getPaint().setFlags(1);
            return;
        }
        this.f79746b.setVisibility(0);
        this.f79746b.setTextColor(UIUtils.getColor(this.f79745a, R.color.text_caption));
    }

    public MeetingRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118400b();
    }

    /* renamed from: a */
    public void mo114181a(CharSequence charSequence, String str, AbstractC31467a aVar) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(m118399a(str, aVar)).append((CharSequence) " ").append(charSequence);
        this.f79746b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f79746b.setHighlightColor(C32634ae.m125178a(R.color.transparent));
        mo114182a(true, (CharSequence) append);
    }
}
