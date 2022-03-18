package com.ss.android.vc.lark.message.meeting.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.avatarlist.VcCrescentAvatarListView;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.lark.message.vc.C61150c;
import com.ss.android.vc.service.C63634c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.e */
public class C61148e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final View f153177a;

    /* renamed from: b */
    public final WeakReference<C61148e> f153178b = new WeakReference<>(this);

    /* renamed from: c */
    protected LinearLayout f153179c;

    /* renamed from: d */
    protected LinearLayout f153180d;

    /* renamed from: e */
    protected ImageView f153181e;

    /* renamed from: f */
    protected TextView f153182f;

    /* renamed from: g */
    protected TextView f153183g;

    /* renamed from: h */
    protected TextView f153184h;

    /* renamed from: i */
    protected TextView f153185i;

    /* renamed from: j */
    protected TextView f153186j;

    /* renamed from: k */
    protected TextView f153187k;

    /* renamed from: l */
    protected ImageView f153188l;

    /* renamed from: m */
    protected ConstraintLayout f153189m;

    /* renamed from: n */
    protected VcCrescentAvatarListView f153190n;

    /* renamed from: o */
    protected TextView f153191o;

    /* renamed from: p */
    public FrameLayout f153192p;

    /* renamed from: q */
    protected TextView f153193q;

    /* renamed from: r */
    protected LinearLayout f153194r;

    /* renamed from: s */
    protected TextView f153195s;

    /* renamed from: t */
    protected TextView f153196t;

    /* renamed from: u */
    protected LinearLayout f153197u;

    /* renamed from: v */
    protected TextView f153198v;

    /* renamed from: w */
    private ImageView f153199w;

    /* renamed from: x */
    private ImageView f153200x;

    /* renamed from: a */
    public static C61148e m237783a(View view) {
        return (C61148e) view.getTag();
    }

    public C61148e(View view) {
        super(view);
        this.f153177a = view;
        view.setTag(this);
        m237784b(view);
        if (C63634c.m249496b("lark.mobile.display_textsize") && !DesktopUtil.m144307b()) {
            C61150c.m237789a(this.f153184h, LarkFont.BODY1);
            C61150c.m237789a(this.f153182f, LarkFont.HEADLINE);
            C61150c.m237789a(this.f153185i, LarkFont.HEADLINE);
            C61150c.m237789a(this.f153195s, LarkFont.HEADLINE);
            C61150c.m237789a(this.f153187k, LarkFont.BODY1);
            C61150c.m237789a(this.f153191o, LarkFont.BODY2);
            C61150c.m237789a(this.f153198v, LarkFont.BODY2);
            C61150c.m237789a(this.f153183g, LarkFont.CAPTION1);
            C61150c.m237789a(this.f153186j, LarkFont.CAPTION1);
            C61150c.m237789a(this.f153196t, LarkFont.CAPTION1);
            C25649b.m91853a(this.f153181e, C60773o.m236122b((double) LKUIDisplayManager.m91865a(ar.m236694a(), LarkFont.BODY0)));
            C25649b.m91853a(this.f153200x, C60773o.m236122b((double) LKUIDisplayManager.m91865a(ar.m236694a(), LarkFont.BODY0)));
            C25649b.m91853a(this.f153199w, C60773o.m236122b((double) LKUIDisplayManager.m91865a(ar.m236694a(), LarkFont.BODY0)));
        }
    }

    /* renamed from: b */
    private void m237784b(View view) {
        this.f153179c = (LinearLayout) view.findViewById(R.id.video_meeting_card_container);
        this.f153184h = (TextView) view.findViewById(R.id.video_meeting_card_time);
        this.f153190n = (VcCrescentAvatarListView) view.findViewById(R.id.video_meeting_card_crescent_avatar_list);
        this.f153189m = (ConstraintLayout) view.findViewById(R.id.video_meeting_card_content);
        this.f153180d = (LinearLayout) view.findViewById(R.id.video_meeting_card_header);
        this.f153188l = (ImageView) view.findViewById(R.id.video_meeting_card_copy_meetinginfo);
        this.f153191o = (TextView) view.findViewById(R.id.video_meeting_card_join_info_button);
        this.f153187k = (TextView) view.findViewById(R.id.video_meeting_meet_number);
        this.f153182f = (TextView) view.findViewById(R.id.video_meeting_card_meeting_title_line1);
        this.f153185i = (TextView) view.findViewById(R.id.video_meeting_card_meeting_title_line2);
        this.f153181e = (ImageView) view.findViewById(R.id.video_meeting_card_video_icon);
        this.f153183g = (TextView) view.findViewById(R.id.externalTagView1);
        this.f153186j = (TextView) view.findViewById(R.id.externalTagView2);
        this.f153192p = (FrameLayout) view.findViewById(R.id.meeting_card_message_container);
        this.f153193q = (TextView) view.findViewById(R.id.video_meeting_card_chat_room_textview);
        this.f153194r = (LinearLayout) view.findViewById(R.id.short_card_title_name_container);
        this.f153195s = (TextView) view.findViewById(R.id.video_meeting_short_card_meeting_title_line);
        this.f153196t = (TextView) view.findViewById(R.id.externalTagView3);
        this.f153197u = (LinearLayout) view.findViewById(R.id.video_meeting_card_title_container_line2);
        this.f153198v = (TextView) view.findViewById(R.id.video_meeting_card_join_info_button_short_card);
        this.f153199w = (ImageView) view.findViewById(R.id.icon_card_id);
        this.f153200x = (ImageView) view.findViewById(R.id.icon_card_avatar);
    }

    /* renamed from: a */
    public static C61148e m237782a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.video_meeting_share_card, viewGroup, false);
        if (DesktopUtil.m144301a(ar.m236694a()) && (inflate.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) inflate.getLayoutParams()).width = C28459a.m104293b(ar.m236694a(), 380);
        }
        return new C61148e(inflate);
    }
}
