package com.ss.android.vc.meeting.module.breakoutroom.p3112a;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;

/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.a.a */
public class C61517a extends AbstractC61424d implements AbstractC61518b {

    /* renamed from: a */
    private ViewGroup f154297a;

    /* renamed from: b */
    private TextView f154298b;

    /* renamed from: c */
    private View f154299c;

    /* renamed from: d */
    private ViewGroup f154300d;

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        C60700b.m235851b("BreakoutRoom_BroadcastInMeetingViewControl", "[init]", "init");
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.p3112a.AbstractC61518b
    /* renamed from: a */
    public void mo213216a() {
        ViewGroup viewGroup = this.f154297a;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.f154300d.setVisibility(8);
        }
        getMeeting().al().mo213168a(false);
        C60700b.m235851b("BreakoutRoom_BroadcastInMeetingViewControl", "[closeBanner]", "closeBanner");
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        ViewGroup viewGroup;
        C60700b.m235851b("BreakoutRoom_BroadcastInMeetingViewControl", "[destroy]", "destroy");
        if (!(getRootView() == null || this.f154297a == null || (viewGroup = (ViewGroup) getRootView().findViewById(R.id.breakout_room_container)) == null)) {
            viewGroup.removeAllViews();
            this.f154297a = null;
            viewGroup.setVisibility(8);
        }
        super.destroy();
    }

    /* renamed from: b */
    private void m240138b() {
        if (getRootView() != null) {
            C60700b.m235851b("BreakoutRoom_BroadcastInMeetingViewControl", "[initIfNotInflated]", "init");
            if (this.f154297a == null) {
                ViewGroup viewGroup = (ViewGroup) C60748b.m236068a(getRootView().getContext(), R.layout.breakout_room_broadcast_layout, null, false);
                this.f154297a = viewGroup;
                this.f154298b = (TextView) viewGroup.findViewById(R.id.bd_content);
                View findViewById = this.f154297a.findViewById(R.id.icon_close);
                this.f154299c = findViewById;
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.breakoutroom.p3112a.$$Lambda$a$HTX4B8FRCEBYywjQKJw9szgbInY */

                    public final void onClick(View view) {
                        C61517a.lambda$HTX4B8FRCEBYywjQKJw9szgbInY(C61517a.this, view);
                    }
                });
            }
            this.f154300d = (ViewGroup) getRootView().findViewById(R.id.breakout_room_container);
            ViewParent parent = this.f154297a.getParent();
            ViewGroup viewGroup2 = this.f154300d;
            if (parent != viewGroup2) {
                viewGroup2.removeAllViews();
                this.f154300d.addView(this.f154297a, new ViewGroup.LayoutParams(-1, -2));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240137a(View view) {
        mo213216a();
    }

    public C61517a(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* renamed from: b */
    private void m240139b(String str) {
        if (!TextUtils.isEmpty(str) && this.f154298b != null) {
            SpannableString spannableString = new SpannableString(String.format("%s%s", UIHelper.getString(R.string.View_G_FromTheHost), str));
            spannableString.setSpan(new StyleSpan(1), 0, UIHelper.getString(R.string.View_G_FromTheHost).length() - 1, 33);
            this.f154298b.setText(spannableString);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.p3112a.AbstractC61518b
    /* renamed from: a */
    public void mo213217a(String str) {
        C60700b.m235851b("BreakoutRoom_BroadcastInMeetingViewControl", "[showBanner]", "showBanner");
        m240138b();
        m240139b(str);
        this.f154297a.setVisibility(0);
        this.f154300d.setVisibility(0);
        getMeeting().al().mo213168a(true);
    }
}
