package com.ss.android.vc.meeting.module.feedback;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.floatbubble.FloatBubble;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.BaseFeedbackBean;
import com.ss.android.vc.entity.FeedbackBean;
import com.ss.android.vc.entity.FeedbackData;
import com.ss.android.vc.entity.FeedbackReasons;
import com.ss.android.vc.entity.MeetingFeedbackBean;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.feedback.View$OnClickListenerC61668a;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import com.ss.android.vc.statistics.event.an;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.feedback.a */
public class View$OnClickListenerC61668a implements View.OnClickListener {

    /* renamed from: A */
    private View f154714A;

    /* renamed from: B */
    private ArrayList<FeedbackReasons.FeedbackReasonItem> f154715B;

    /* renamed from: C */
    private final ArrayList<String> f154716C = new ArrayList<>();

    /* renamed from: D */
    private String f154717D = "";

    /* renamed from: E */
    private final ArrayList<String> f154718E = new ArrayList<>();

    /* renamed from: F */
    private boolean f154719F;

    /* renamed from: G */
    private final VideoChat f154720G;

    /* renamed from: a */
    TextView f154721a;

    /* renamed from: b */
    TextView f154722b;

    /* renamed from: c */
    RecyclerView f154723c;

    /* renamed from: d */
    LinearLayout f154724d;

    /* renamed from: e */
    View f154725e;

    /* renamed from: f */
    TextView f154726f;

    /* renamed from: g */
    LinearLayout f154727g;

    /* renamed from: h */
    View f154728h;

    /* renamed from: i */
    TextView f154729i;

    /* renamed from: j */
    LinearLayout f154730j;

    /* renamed from: k */
    LinearLayout f154731k;

    /* renamed from: l */
    View f154732l;

    /* renamed from: m */
    View f154733m;

    /* renamed from: n */
    TextView f154734n;

    /* renamed from: o */
    View f154735o;

    /* renamed from: p */
    TextView f154736p;

    /* renamed from: q */
    ConstraintLayout f154737q;

    /* renamed from: r */
    View f154738r;

    /* renamed from: s */
    C61672a f154739s;

    /* renamed from: t */
    public final ArrayList<String> f154740t = new ArrayList<>();

    /* renamed from: u */
    public final ArrayList<String> f154741u = new ArrayList<>();

    /* renamed from: v */
    public int f154742v = 0;

    /* renamed from: w */
    public boolean f154743w = false;

    /* renamed from: x */
    public final Handler f154744x = new Handler();

    /* renamed from: y */
    public final UserCallStatusMonitor.AbstractC63478a f154745y = new UserCallStatusMonitor.AbstractC63478a() {
        /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$a$Jg8iSHNxGQ3qtsSaXHhITp6G4g */

        @Override // com.ss.android.vc.meeting.utils.UserCallStatusMonitor.AbstractC63478a
        public final void onEnterOnCall(int i) {
            View$OnClickListenerC61668a.m271232lambda$Jg8iSHNxGQ3qtsSaXHhITp6G4g(View$OnClickListenerC61668a.this, i);
        }
    };

    /* renamed from: z */
    private FloatBubble f154746z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.feedback.a$a */
    public class C61672a extends RecyclerView.Adapter<C61673a> {

        /* renamed from: b */
        private List<FeedbackReasons.FeedbackReasonItem> f154751b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f154751b.size();
        }

        public C61672a(List<FeedbackReasons.FeedbackReasonItem> list) {
            this.f154751b = list;
        }

        /* renamed from: com.ss.android.vc.meeting.module.feedback.a$a$a */
        public class C61673a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public TextView f154752a;

            /* renamed from: b */
            public IconFontView f154753b;

            public C61673a(View view) {
                super(view);
                this.f154753b = (IconFontView) view.findViewById(R.id.desktop_feedback_reason_checkbox);
                this.f154752a = (TextView) view.findViewById(R.id.desktop_feedback_reason_text);
            }
        }

        /* renamed from: a */
        public C61673a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C61673a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.desktop_feedback_reason_item, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(C61673a aVar, int i) {
            String str;
            String str2;
            FeedbackReasons.FeedbackReasonItem feedbackReasonItem = this.f154751b.get(i);
            ArrayList<String> arrayList = null;
            if (feedbackReasonItem != null) {
                str2 = feedbackReasonItem.message;
                str = feedbackReasonItem.subkey;
            } else {
                str = null;
                str2 = null;
            }
            aVar.f154752a.setText(str2);
            aVar.f154752a.setTag(str);
            if (View$OnClickListenerC61668a.this.f154742v == 0) {
                arrayList = View$OnClickListenerC61668a.this.f154740t;
            } else if (View$OnClickListenerC61668a.this.f154742v == 1) {
                arrayList = View$OnClickListenerC61668a.this.f154741u;
            }
            if (arrayList == null || !arrayList.contains(str2)) {
                View$OnClickListenerC61668a.this.mo213616a(aVar.f154753b, false);
            } else {
                View$OnClickListenerC61668a.this.mo213616a(aVar.f154753b, true);
            }
            View$OnClickListenerC61668a.this.mo213617a(aVar);
        }
    }

    /* renamed from: b */
    public void m240722i() {
        FloatBubble floatBubble = this.f154746z;
        if (floatBubble != null) {
            floatBubble.mo101314a();
        }
        this.f154744x.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public void mo213619c() {
        this.f154744x.removeCallbacksAndMessages(null);
        if (!this.f154743w) {
            this.f154744x.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.feedback.View$OnClickListenerC61668a.RunnableC616713 */

                public void run() {
                    if (!View$OnClickListenerC61668a.this.f154743w) {
                        C60700b.m235851b("DesktopFeedbackWindow", "[resetAutoFinishHandler]", "finish because no user operation in 50 seconds");
                        View$OnClickListenerC61668a.this.m240722i();
                    }
                }
            }, 5000);
        }
    }

    /* renamed from: e */
    private void m240718e() {
        this.f154746z.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.feedback.View$OnClickListenerC61668a.View$OnTouchListenerC616691 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                View$OnClickListenerC61668a.this.mo213619c();
                return false;
            }
        });
        this.f154746z.mo101311a(new FloatBubble.AbstractC28457b() {
            /* class com.ss.android.vc.meeting.module.feedback.View$OnClickListenerC61668a.C616702 */

            @Override // com.ss.android.floatbubble.FloatBubble.AbstractC28457b
            public void onDismiss() {
                C60700b.m235851b("DesktopFeedbackWindow", "[onDismiss]", "onDismiss");
                C61677e.m240740b();
                View$OnClickListenerC61668a.this.f154744x.removeCallbacksAndMessages(null);
                UserCallStatusMonitor.m248763b(View$OnClickListenerC61668a.this.f154745y);
            }
        });
        this.f154746z.mo101309a(3);
        this.f154746z.mo101315b(85);
        this.f154746z.mo101310a(40, 100);
        this.f154746z.mo101316b();
    }

    /* renamed from: h */
    private void m240721h() {
        this.f154730j.setVisibility(8);
        this.f154731k.setVisibility(8);
        this.f154732l.setVisibility(8);
        this.f154737q.setVisibility(8);
        this.f154738r.setVisibility(0);
        this.f154744x.postDelayed(new Runnable() {
            /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$a$y2Kme5jnEUyaI3bn0zVqSZv3wJ4 */

            public final void run() {
                View$OnClickListenerC61668a.lambda$y2Kme5jnEUyaI3bn0zVqSZv3wJ4(View$OnClickListenerC61668a.this);
            }
        }, 3000);
    }

    /* renamed from: f */
    private void m240719f() {
        int i;
        int i2 = 0;
        if (C61677e.m240737a().mo213629e() != null) {
            i = C61677e.m240737a().mo213629e().size();
        } else {
            i = 0;
        }
        if (C61677e.m240737a().mo213628d() != null) {
            i2 = C61677e.m240737a().mo213628d().size();
        }
        int max = Math.max(i, i2);
        if (max > 7) {
            max = 7;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f154723c.getLayoutParams();
        layoutParams.height = C60773o.m236115a((double) (max * 32));
        this.f154723c.setLayoutParams(layoutParams);
        mo213619c();
        an.m250023a(this.f154720G);
        UserCallStatusMonitor.m248762a(this.f154745y);
    }

    /* renamed from: d */
    private void m240717d() {
        this.f154721a = (TextView) this.f154714A.findViewById(R.id.comment);
        this.f154722b = (TextView) this.f154714A.findViewById(R.id.confirm_feed_back);
        this.f154723c = (RecyclerView) this.f154714A.findViewById(R.id.feedback_negative_reasons);
        this.f154724d = (LinearLayout) this.f154714A.findViewById(R.id.feed_back_type_screen_container);
        this.f154725e = this.f154714A.findViewById(R.id.feed_back_type_screen_icon);
        this.f154726f = (TextView) this.f154714A.findViewById(R.id.feed_back_type_screen_text);
        this.f154727g = (LinearLayout) this.f154714A.findViewById(R.id.feed_back_type_video_container);
        this.f154728h = this.f154714A.findViewById(R.id.feed_back_type_video_icon);
        this.f154729i = (TextView) this.f154714A.findViewById(R.id.feed_back_type_video_text);
        this.f154730j = (LinearLayout) this.f154714A.findViewById(R.id.feed_back_awesome);
        this.f154731k = (LinearLayout) this.f154714A.findViewById(R.id.feed_back_bad);
        this.f154732l = this.f154714A.findViewById(R.id.question_tip);
        this.f154733m = this.f154714A.findViewById(R.id.feed_back_awesome_icon);
        this.f154734n = (TextView) this.f154714A.findViewById(R.id.feed_back_awesome_text);
        this.f154735o = this.f154714A.findViewById(R.id.feed_back_bad_icon);
        this.f154736p = (TextView) this.f154714A.findViewById(R.id.feed_back_bad_text);
        this.f154737q = (ConstraintLayout) this.f154714A.findViewById(R.id.feedback_negative_selected_container);
        this.f154738r = this.f154714A.findViewById(R.id.feedback_thanks);
        this.f154722b.setOnClickListener(this);
        this.f154727g.setOnClickListener(this);
        this.f154731k.setOnClickListener(this);
        this.f154730j.setOnClickListener(this);
        this.f154724d.setOnClickListener(this);
    }

    /* renamed from: g */
    private void m240720g() {
        BaseFeedbackBean baseFeedbackBean;
        BaseFeedbackBean.Quality quality;
        String str;
        if (this.f154721a.getText() != null) {
            this.f154717D = this.f154721a.getText().toString();
        }
        if (this.f154720G.getType() == VideoChat.Type.CALL) {
            baseFeedbackBean = new FeedbackBean();
        } else {
            baseFeedbackBean = new MeetingFeedbackBean();
        }
        if (this.f154719F) {
            quality = BaseFeedbackBean.Quality.GOOD;
        } else {
            quality = BaseFeedbackBean.Quality.BAD;
        }
        baseFeedbackBean.quatity = quality;
        FeedbackData feedbackData = new FeedbackData();
        feedbackData.reasonSubkeys = this.f154716C;
        FeedbackData feedbackData2 = new FeedbackData();
        feedbackData2.reasonSubkeys = this.f154718E;
        if (!this.f154719F) {
            baseFeedbackBean.audioVideoFeedback = feedbackData;
            baseFeedbackBean.shareScreenFeedback = feedbackData2;
            baseFeedbackBean.otherReason = this.f154717D;
        }
        VideoChat videoChat = this.f154720G;
        if (videoChat != null) {
            baseFeedbackBean.meetingId = videoChat.getId();
        }
        C61677e.m240737a().mo213626a(baseFeedbackBean);
        boolean z = this.f154719F;
        String a = m240710a(this.f154716C);
        String a2 = m240710a(this.f154718E);
        if (this.f154717D != null) {
            str = "Other";
        } else {
            str = null;
        }
        an.m250024a(z, a, a2, str, this.f154720G);
        C60700b.m235851b("DesktopFeedbackWindow", "[submitFeedback]", "event submit feedback");
        m240721h();
    }

    /* renamed from: a */
    public void mo213615a() {
        if (C28460b.m104296a(ar.m236694a())) {
            C60700b.m235851b("DesktopFeedbackWindow", "[show]", "show");
            this.f154714A = LayoutInflater.from(ar.m236698c()).inflate(R.layout.desktop_meeting_feedback, (ViewGroup) null);
            m240717d();
            FloatBubble a = FloatBubble.m104273a(ar.m236697b(), this.f154714A);
            this.f154746z = a;
            if (a != null) {
                m240719f();
                m240718e();
                return;
            }
            return;
        }
        C60700b.m235851b("DesktopFeedbackWindow", "[show2]", "no float permission");
        Activity h = C36519d.m144080a().mo134826h();
        if (h != null) {
            C28460b.m104294a(h, new C28460b.C28464b().mo101331a(UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b())).mo101332b(h.getString(R.string.View_G_ConfirmButton)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m240716c(int i) {
        C60700b.m235851b("DesktopFeedbackWindow", "[onCallStatus]", "dismiss because user enter oncall");
        m240722i();
    }

    public View$OnClickListenerC61668a(VideoChat videoChat) {
        this.f154720G = videoChat;
    }

    /* renamed from: a */
    private String m240710a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(";");
            }
        }
        C60700b.m235851b("DesktopFeedbackWindow", "[getReasonsStr]", sb.toString());
        return sb.toString();
    }

    /* renamed from: a */
    private void m240711a(int i) {
        boolean z;
        this.f154742v = i;
        m240715b(i);
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            z2 = true;
        }
        this.f154727g.setSelected(z);
        this.f154728h.setSelected(z);
        this.f154729i.setSelected(z);
        this.f154724d.setSelected(z2);
        this.f154725e.setSelected(z2);
        this.f154726f.setSelected(z2);
    }

    /* renamed from: b */
    private void m240715b(int i) {
        if (i == 0) {
            this.f154715B = C61677e.m240737a().mo213628d();
        } else if (i == 1) {
            this.f154715B = C61677e.m240737a().mo213629e();
        }
        ArrayList<FeedbackReasons.FeedbackReasonItem> arrayList = this.f154715B;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f154723c.setVisibility(4);
            return;
        }
        this.f154723c.setVisibility(0);
        this.f154723c.setLayoutManager(new LinearLayoutManager(ar.m236694a()));
        C61672a aVar = new C61672a(this.f154715B);
        this.f154739s = aVar;
        this.f154723c.setAdapter(aVar);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.cancel_feed_back) {
            m240722i();
        } else if (view.getId() == R.id.confirm_feed_back) {
            m240720g();
        } else if (view.getId() == R.id.feed_back_type_screen_container) {
            m240711a(1);
        } else if (view.getId() == R.id.feed_back_close) {
            m240722i();
        } else if (view.getId() == R.id.feed_back_awesome) {
            m240713a(true);
        } else if (view.getId() == R.id.feed_back_bad) {
            m240713a(false);
            m240711a(this.f154742v);
        } else if (view.getId() == R.id.feed_back_type_video_container) {
            m240711a(0);
        }
    }

    /* renamed from: a */
    private void m240713a(boolean z) {
        if (!this.f154743w || this.f154719F != z) {
            this.f154743w = true;
            this.f154719F = z;
            this.f154734n.setSelected(z);
            this.f154733m.setSelected(z);
            this.f154730j.setSelected(z);
            this.f154731k.setSelected(!z);
            this.f154735o.setSelected(!z);
            this.f154736p.setSelected(!z);
            if (z) {
                m240720g();
            } else {
                this.f154737q.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public void mo213617a(C61672a.C61673a aVar) {
        aVar.itemView.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$a$DWiZIypcPkZCCrfBOpLhHCJj1p0 */
            public final /* synthetic */ View$OnClickListenerC61668a.C61672a.C61673a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                View$OnClickListenerC61668a.lambda$DWiZIypcPkZCCrfBOpLhHCJj1p0(View$OnClickListenerC61668a.this, this.f$1, view);
            }
        });
        aVar.itemView.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$a$AaN9cL_59pOKHjckkbY8Te2S7vw */

            public final boolean onHover(View view, MotionEvent motionEvent) {
                return View$OnClickListenerC61668a.lambda$AaN9cL_59pOKHjckkbY8Te2S7vw(View$OnClickListenerC61668a.C61672a.C61673a.this, view, motionEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240712a(C61672a.C61673a aVar, View view) {
        String str = (String) aVar.f154752a.getText();
        String str2 = (String) aVar.f154752a.getTag();
        if (aVar.f154753b.isSelected()) {
            mo213616a(aVar.f154753b, false);
            int i = this.f154742v;
            if (i == 0) {
                this.f154740t.remove(str);
                this.f154716C.remove(str2);
            } else if (i == 1) {
                this.f154741u.remove(str);
                this.f154718E.remove(str2);
            }
        } else {
            mo213616a(aVar.f154753b, true);
            int i2 = this.f154742v;
            if (i2 == 0) {
                this.f154740t.add(str);
                this.f154716C.add(str2);
            } else if (i2 == 1) {
                this.f154741u.add(str);
                this.f154718E.add(str2);
            }
        }
        C60700b.m235851b("DesktopFeedbackWindow", "[onCheckBoxClick]", "selectedVideoReasons " + this.f154740t.size() + ", selectedScreenReasons " + this.f154741u.size());
    }

    /* renamed from: a */
    public void mo213616a(IconFontView iconFontView, boolean z) {
        int i;
        iconFontView.setSelected(z);
        if (z) {
            i = R.string.iconfont_icon_checkbox_selected;
        } else {
            i = R.string.iconfont_icon_checkbox_unselected;
        }
        iconFontView.setText(UIHelper.getString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m240714a(C61672a.C61673a aVar, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            aVar.f154753b.setHovered(true);
            return true;
        } else if (motionEvent.getAction() != 10) {
            return false;
        } else {
            aVar.f154753b.setHovered(false);
            return true;
        }
    }
}
