package com.ss.android.vc.meeting.module.feedback;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.entity.BaseFeedbackBean;
import com.ss.android.vc.entity.FeedbackBean;
import com.ss.android.vc.entity.FeedbackData;
import com.ss.android.vc.entity.FeedbackReasons;
import com.ss.android.vc.entity.MeetingFeedbackBean;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import com.ss.android.vc.statistics.event.an;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeetingFeedbackDialogActivity extends BaseActivity {

    /* renamed from: A */
    private C60762k f154674A;

    /* renamed from: B */
    private VideoChat f154675B;

    /* renamed from: C */
    private final Handler f154676C = new Handler();

    /* renamed from: D */
    private final UserCallStatusMonitor.AbstractC63478a f154677D = new UserCallStatusMonitor.AbstractC63478a() {
        /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$MeetingFeedbackDialogActivity$xCN_wIUEShTCegVCZYL5XHLYwn4 */

        @Override // com.ss.android.vc.meeting.utils.UserCallStatusMonitor.AbstractC63478a
        public final void onEnterOnCall(int i) {
            MeetingFeedbackDialogActivity.lambda$xCN_wIUEShTCegVCZYL5XHLYwn4(MeetingFeedbackDialogActivity.this, i);
        }
    };

    /* renamed from: b */
    TextView f154678b;

    /* renamed from: c */
    TextView f154679c;

    /* renamed from: d */
    View f154680d;

    /* renamed from: e */
    View f154681e;

    /* renamed from: f */
    TextView f154682f;

    /* renamed from: g */
    TextView f154683g;

    /* renamed from: h */
    RecyclerView f154684h;

    /* renamed from: i */
    LinearLayout f154685i;

    /* renamed from: j */
    TextView f154686j;

    /* renamed from: k */
    MeetingFeedbackSelector f154687k;

    /* renamed from: l */
    MeetingFeedbackSelector f154688l;

    /* renamed from: m */
    LinearLayout f154689m;

    /* renamed from: n */
    View f154690n;

    /* renamed from: o */
    View f154691o;

    /* renamed from: p */
    View f154692p;

    /* renamed from: q */
    C61666a f154693q;

    /* renamed from: r */
    public final ArrayList<String> f154694r = new ArrayList<>();

    /* renamed from: s */
    public final ArrayList<String> f154695s = new ArrayList<>();

    /* renamed from: t */
    public int f154696t = 0;

    /* renamed from: u */
    public boolean f154697u = false;

    /* renamed from: v */
    private ArrayList<FeedbackReasons.FeedbackReasonItem> f154698v;

    /* renamed from: w */
    private final ArrayList<String> f154699w = new ArrayList<>();

    /* renamed from: x */
    private String f154700x = "";

    /* renamed from: y */
    private final ArrayList<String> f154701y = new ArrayList<>();

    /* renamed from: z */
    private boolean f154702z;

    /* renamed from: a */
    public Context mo213597a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo213598a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo213599a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m240681a(this, context);
    }

    /* renamed from: b */
    public void mo213600b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo213601c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m240676a(this, configuration);
    }

    public AssetManager getAssets() {
        return m240686c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m240677a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m240685b(this);
    }

    /* renamed from: k */
    private void m240693k() {
        finish();
    }

    /* renamed from: l */
    private void m240694l() {
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.feedback.MeetingFeedbackDialogActivity$a */
    public class C61666a extends RecyclerView.Adapter<C61667a> {

        /* renamed from: b */
        private List<FeedbackReasons.FeedbackReasonItem> f154709b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f154709b.size();
        }

        /* renamed from: com.ss.android.vc.meeting.module.feedback.MeetingFeedbackDialogActivity$a$a */
        public class C61667a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public TextView f154710a;

            public C61667a(TextView textView) {
                super(textView);
                this.f154710a = textView;
            }
        }

        public C61666a(List<FeedbackReasons.FeedbackReasonItem> list) {
            this.f154709b = list;
        }

        /* renamed from: a */
        public C61667a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C61667a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.meeting_feedback_reason_textview, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(C61667a aVar, int i) {
            String str;
            String str2;
            FeedbackReasons.FeedbackReasonItem feedbackReasonItem = this.f154709b.get(i);
            ArrayList<String> arrayList = null;
            if (feedbackReasonItem != null) {
                str2 = feedbackReasonItem.message;
                str = feedbackReasonItem.subkey;
            } else {
                str = null;
                str2 = null;
            }
            aVar.f154710a.setText(str2);
            aVar.f154710a.setTag(str);
            if (MeetingFeedbackDialogActivity.this.f154696t == 0) {
                arrayList = MeetingFeedbackDialogActivity.this.f154694r;
            } else if (MeetingFeedbackDialogActivity.this.f154696t == 1) {
                arrayList = MeetingFeedbackDialogActivity.this.f154695s;
            }
            if (arrayList == null || !arrayList.contains(str2)) {
                aVar.f154710a.setSelected(false);
            } else {
                aVar.f154710a.setSelected(true);
            }
        }
    }

    /* renamed from: o */
    private void m240697o() {
        m240684b(0);
    }

    /* renamed from: p */
    private void m240698p() {
        m240684b(1);
    }

    /* renamed from: q */
    private void m240699q() {
        m240700r();
        finish();
    }

    /* renamed from: j */
    private void m240692j() {
        C60762k kVar = new C60762k(this);
        this.f154674A = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.feedback.MeetingFeedbackDialogActivity.C616621 */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public void onKeyboardStateChanged(boolean z, int i) {
                C60700b.m235851b("MeetingFeedbackDialogActivity", "[onKeyboardStateChanged]", String.format("isShown=%b, isGoodOrBadSelected=%b, keyboardHeight=%d", Boolean.valueOf(z), Boolean.valueOf(MeetingFeedbackDialogActivity.this.f154697u), Integer.valueOf(i)));
                final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) MeetingFeedbackDialogActivity.this.f154681e.getLayoutParams();
                if (!MeetingFeedbackDialogActivity.this.f154697u) {
                    layoutParams.bottomMargin = 0;
                    MeetingFeedbackDialogActivity.this.f154681e.setLayoutParams(layoutParams);
                } else if (z) {
                    MeetingFeedbackDialogActivity.this.f154689m.setVisibility(8);
                    MeetingFeedbackDialogActivity.this.f154685i.setVisibility(8);
                    MeetingFeedbackDialogActivity.this.f154684h.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams2 = MeetingFeedbackDialogActivity.this.f154682f.getLayoutParams();
                    layoutParams2.height = C28459a.m104293b(MeetingFeedbackDialogActivity.this, 81);
                    MeetingFeedbackDialogActivity.this.f154682f.setLayoutParams(layoutParams2);
                    layoutParams.bottomMargin = i;
                    MeetingFeedbackDialogActivity.this.f154681e.postDelayed(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.feedback.MeetingFeedbackDialogActivity.C616621.RunnableC616631 */

                        public void run() {
                            MeetingFeedbackDialogActivity.this.f154681e.setLayoutParams(layoutParams);
                        }
                    }, 50);
                } else {
                    MeetingFeedbackDialogActivity.this.f154689m.setVisibility(0);
                    MeetingFeedbackDialogActivity.this.f154685i.setVisibility(0);
                    MeetingFeedbackDialogActivity.this.f154684h.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams3 = MeetingFeedbackDialogActivity.this.f154682f.getLayoutParams();
                    layoutParams3.height = C28459a.m104293b(MeetingFeedbackDialogActivity.this, 40);
                    MeetingFeedbackDialogActivity.this.f154682f.setLayoutParams(layoutParams3);
                    layoutParams.bottomMargin = 0;
                    MeetingFeedbackDialogActivity.this.f154681e.setLayoutParams(layoutParams);
                }
            }
        });
    }

    /* renamed from: n */
    private void m240696n() {
        m240683a(false);
        m240684b(this.f154696t);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        C60700b.m235851b("MeetingFeedbackDialogActivity", "[onResume]", "onResume");
        super.onResume();
    }

    /* renamed from: h */
    private void m240690h() {
        try {
            if (Build.VERSION.SDK_INT == 26) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
        } catch (Exception e) {
            C60775q.m236136a(e.getMessage());
        }
    }

    /* renamed from: m */
    private void m240695m() {
        m240683a(true);
        this.f154685i.postDelayed(new Runnable() {
            /* class com.ss.android.vc.meeting.module.feedback.MeetingFeedbackDialogActivity.RunnableC616642 */

            public void run() {
                MeetingFeedbackDialogActivity.this.finish();
            }
        }, 500);
    }

    /* renamed from: s */
    private void m240701s() {
        this.f154676C.removeCallbacksAndMessages(null);
        if (!this.f154697u) {
            this.f154676C.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.feedback.MeetingFeedbackDialogActivity.RunnableC616653 */

                public void run() {
                    if (!MeetingFeedbackDialogActivity.this.f154697u) {
                        C60700b.m235851b("MeetingFeedbackDialogActivity", "[resetAutoFinishHandler]", "finish because no user operation in 50 seconds");
                        MeetingFeedbackDialogActivity.this.finish();
                    }
                }
            }, 5000);
        }
    }

    /* renamed from: g */
    private void m240689g() {
        $$Lambda$MeetingFeedbackDialogActivity$Tmjt5bJtC4lzdIJKkiFq9vCEzs0 r0 = new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$MeetingFeedbackDialogActivity$Tmjt5bJtC4lzdIJKkiFq9vCEzs0 */

            public final void onClick(View view) {
                MeetingFeedbackDialogActivity.lambda$Tmjt5bJtC4lzdIJKkiFq9vCEzs0(MeetingFeedbackDialogActivity.this, view);
            }
        };
        this.f154691o.setOnClickListener(r0);
        this.f154692p.setOnClickListener(r0);
        this.f154678b.setOnClickListener(r0);
        this.f154679c.setOnClickListener(r0);
        this.f154688l.setOnClickListener(r0);
        this.f154687k.setOnClickListener(r0);
        this.f154683g.setOnClickListener(r0);
    }

    public void finish() {
        C60700b.m235851b("MeetingFeedbackDialogActivity", "[finish]", "finish");
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f154682f.getWindowToken(), 0);
        } catch (Exception e) {
            C60700b.m235864f("MeetingFeedbackDialogActivity", "[finish2]", e.getMessage());
        }
        super.finishAndRemoveTask();
        overridePendingTransition(R.anim.vc_activity_bottom_in, R.anim.activity_bottom_out);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        C60700b.m235851b("MeetingFeedbackDialogActivity", "[oNDestroy]", "onDestroy");
        super.onDestroy();
        C61677e.m240740b();
        this.f154676C.removeCallbacksAndMessages(null);
        UserCallStatusMonitor.m248763b(this.f154677D);
        C60762k kVar = this.f154674A;
        if (kVar != null) {
            kVar.mo208368a();
        }
    }

    /* renamed from: i */
    private void m240691i() {
        int i;
        Intent intent = getIntent();
        if (!(intent == null || intent.getExtras() == null)) {
            this.f154675B = (VideoChat) intent.getExtras().getSerializable("videoChatInfo");
        }
        int i2 = 0;
        if (C61677e.m240737a().mo213629e() != null) {
            i = C61677e.m240737a().mo213629e().size();
        } else {
            i = 0;
        }
        if (C61677e.m240737a().mo213628d() != null) {
            i2 = C61677e.m240737a().mo213628d().size();
        }
        int max = (Math.max(i, i2) + 1) / 2;
        if (max > 4) {
            max = 4;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f154684h.getLayoutParams();
        layoutParams.height = C60773o.m236115a((double) ((max * 57) + 30));
        this.f154684h.setLayoutParams(layoutParams);
        m240701s();
        an.m250023a(this.f154675B);
    }

    /* renamed from: d */
    private void m240688d() {
        this.f154678b = (TextView) findViewById(R.id.feed_back_awesome);
        this.f154679c = (TextView) findViewById(R.id.feed_back_bad);
        this.f154680d = findViewById(R.id.feed_back_hint);
        this.f154681e = findViewById(R.id.feed_back_body);
        this.f154682f = (TextView) findViewById(R.id.comment);
        this.f154683g = (TextView) findViewById(R.id.confirm_feed_back);
        this.f154684h = (RecyclerView) findViewById(R.id.feedback_negative_reasons);
        this.f154685i = (LinearLayout) findViewById(R.id.feed_back_container);
        this.f154686j = (TextView) findViewById(R.id.question_tip);
        this.f154687k = (MeetingFeedbackSelector) findViewById(R.id.feed_back_type_screen);
        this.f154688l = (MeetingFeedbackSelector) findViewById(R.id.feed_back_type_video);
        this.f154689m = (LinearLayout) findViewById(R.id.feed_back_type_selector);
        this.f154690n = findViewById(R.id.feed_back_parting_line);
        this.f154691o = findViewById(R.id.feed_back);
        this.f154692p = findViewById(R.id.feed_back_close);
    }

    /* renamed from: r */
    private void m240700r() {
        BaseFeedbackBean baseFeedbackBean;
        BaseFeedbackBean.Quality quality;
        String str;
        if (this.f154675B != null) {
            if (this.f154682f.getText() != null) {
                this.f154700x = this.f154682f.getText().toString();
            }
            if (this.f154675B.getType() == VideoChat.Type.CALL) {
                baseFeedbackBean = new FeedbackBean();
            } else {
                baseFeedbackBean = new MeetingFeedbackBean();
            }
            if (this.f154702z) {
                quality = BaseFeedbackBean.Quality.GOOD;
            } else {
                quality = BaseFeedbackBean.Quality.BAD;
            }
            baseFeedbackBean.quatity = quality;
            FeedbackData feedbackData = new FeedbackData();
            feedbackData.reasonSubkeys = this.f154699w;
            FeedbackData feedbackData2 = new FeedbackData();
            feedbackData2.reasonSubkeys = this.f154701y;
            if (!this.f154702z) {
                baseFeedbackBean.audioVideoFeedback = feedbackData;
                baseFeedbackBean.shareScreenFeedback = feedbackData2;
                baseFeedbackBean.otherReason = this.f154700x;
            }
            VideoChat videoChat = this.f154675B;
            if (videoChat != null) {
                baseFeedbackBean.meetingId = videoChat.getId();
            }
            C61677e.m240737a().mo213626a(baseFeedbackBean);
            boolean z = this.f154702z;
            String a = m240678a(this.f154699w);
            String a2 = m240678a(this.f154701y);
            if (this.f154700x != null) {
                str = "Other";
            } else {
                str = null;
            }
            an.m250024a(z, a, a2, str, this.f154675B);
            C60700b.m235851b("MeetingFeedbackDialogActivity", "[submitFeedback]", "event submit feedback");
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m240701s();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m240687c(int i) {
        C60700b.m235851b("MeetingFeedbackDialogActivity", "[onCallStatus]", "dismiss because user enter oncall");
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        C60700b.m235851b("MeetingFeedbackDialogActivity", "[onNewIntent]", "onNewIntent");
        super.onNewIntent(intent);
        m240691i();
    }

    /* renamed from: a */
    public static Resources m240677a(MeetingFeedbackDialogActivity meetingFeedbackDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingFeedbackDialogActivity);
        }
        return meetingFeedbackDialogActivity.mo213598a();
    }

    /* renamed from: c */
    public static AssetManager m240686c(MeetingFeedbackDialogActivity meetingFeedbackDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingFeedbackDialogActivity);
        }
        return meetingFeedbackDialogActivity.mo213601c();
    }

    /* renamed from: b */
    private void m240684b(int i) {
        this.f154696t = i;
        m240679a(i);
        if (i == 0) {
            m240682a(this.f154688l, true);
            m240682a(this.f154687k, false);
        } else if (i == 1) {
            m240682a(this.f154688l, false);
            m240682a(this.f154687k, true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        C60700b.m235851b("MeetingFeedbackDialogActivity", "[onCreate]", "onCreate");
        getWindow().getDecorView();
        super.onCreate(bundle);
        setContentView(R.layout.meeting_layout_feedback_dialog);
        UserCallStatusMonitor.m248762a(this.f154677D);
        m240690h();
        m240688d();
        this.f154689m.bringToFront();
        m240692j();
        overridePendingTransition(R.anim.vc_activity_bottom_in, R.anim.fix_black_screen_anim);
        m240691i();
        m240689g();
    }

    /* renamed from: a */
    private String m240678a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m240685b(MeetingFeedbackDialogActivity meetingFeedbackDialogActivity) {
        meetingFeedbackDialogActivity.mo213600b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingFeedbackDialogActivity meetingFeedbackDialogActivity2 = meetingFeedbackDialogActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingFeedbackDialogActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m240679a(int i) {
        if (i == 0) {
            this.f154698v = C61677e.m240737a().mo213628d();
        } else if (i == 1) {
            this.f154698v = C61677e.m240737a().mo213629e();
        }
        ArrayList<FeedbackReasons.FeedbackReasonItem> arrayList = this.f154698v;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f154684h.setVisibility(4);
            return;
        }
        this.f154684h.setVisibility(0);
        this.f154684h.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        C61666a aVar = new C61666a(this.f154698v);
        this.f154693q = aVar;
        this.f154684h.setAdapter(aVar);
    }

    public void onItemClick(View view) {
        if ((view instanceof TextView) && this.f154698v != null) {
            TextView textView = (TextView) view;
            String str = (String) textView.getText();
            String str2 = (String) textView.getTag();
            if (view.isSelected()) {
                view.setSelected(false);
                int i = this.f154696t;
                if (i == 0) {
                    this.f154694r.remove(str);
                    this.f154699w.remove(str2);
                } else if (i == 1) {
                    this.f154695s.remove(str);
                    this.f154701y.remove(str2);
                }
            } else {
                view.setSelected(true);
                int i2 = this.f154696t;
                if (i2 == 0) {
                    this.f154694r.add(str);
                    this.f154699w.add(str2);
                } else if (i2 == 1) {
                    this.f154695s.add(str);
                    this.f154701y.add(str2);
                }
            }
            C60700b.m235851b("MeetingFeedbackDialogActivity", "[onCheckBoxClick]", "selectedVideoReasons " + this.f154694r.size() + ", selectedScreenReasons " + this.f154695s.size());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240680a(View view) {
        if (view.getId() == R.id.feed_back) {
            m240693k();
        } else if (view.getId() == R.id.feed_back_close) {
            m240694l();
        } else if (view.getId() == R.id.feed_back_awesome) {
            m240695m();
        } else if (view.getId() == R.id.feed_back_bad) {
            m240696n();
        } else if (view.getId() == R.id.feed_back_type_video) {
            m240697o();
        } else if (view.getId() == R.id.feed_back_type_screen) {
            m240698p();
        } else if (view.getId() == R.id.confirm_feed_back) {
            m240699q();
        }
    }

    /* renamed from: a */
    private void m240683a(boolean z) {
        int i;
        int i2;
        int i3;
        boolean z2 = this.f154697u;
        if (!z2 || this.f154702z != z) {
            if (!z2) {
                if (z) {
                    i = R.drawable.vc_feedback_awesome_press;
                } else {
                    i = R.drawable.vc_feedback_awesome_normal;
                }
            } else if (z) {
                i = R.drawable.vc_feedback_awesome_badpage_press;
            } else {
                i = R.drawable.vc_feedback_awesome_badpage_normal;
            }
            this.f154697u = true;
            this.f154702z = z;
            int i4 = R.color.primary_pri_500;
            if (z) {
                i2 = R.color.primary_pri_500;
            } else {
                i2 = R.color.text_title;
            }
            if (z) {
                i3 = R.drawable.vc_feedback_bad_normal;
            } else {
                i3 = R.drawable.vc_feedback_bad_press;
            }
            if (z) {
                i4 = R.color.text_title;
            }
            this.f154678b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, getResources().getDrawable(i), (Drawable) null, (Drawable) null);
            this.f154678b.setTextColor(C60773o.m236126d(i2));
            this.f154679c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, getResources().getDrawable(i3), (Drawable) null, (Drawable) null);
            this.f154679c.setTextColor(C60773o.m236126d(i4));
            if (z) {
                m240700r();
                return;
            }
            this.f154679c.setTextSize(BitmapDescriptorFactory.HUE_RED);
            this.f154678b.setTextSize(BitmapDescriptorFactory.HUE_RED);
            this.f154679c.setCompoundDrawablePadding(0);
            this.f154678b.setCompoundDrawablePadding(0);
            ViewGroup.LayoutParams layoutParams = this.f154690n.getLayoutParams();
            layoutParams.height = C60773o.m236115a(22.0d);
            layoutParams.width = C60773o.m236115a(2.0d);
            this.f154690n.setLayoutParams(layoutParams);
            this.f154689m.setVisibility(0);
            this.f154684h.setVisibility(0);
            this.f154682f.setVisibility(0);
            this.f154683g.setVisibility(0);
            this.f154680d.setVisibility(8);
            this.f154685i.setPadding(C60773o.m236115a(83.0d), 0, C60773o.m236115a(83.0d), 0);
            this.f154678b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, C60773o.m236128f(R.drawable.vc_feedback_awesome_badpage_normal), (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: a */
    public static void m240681a(MeetingFeedbackDialogActivity meetingFeedbackDialogActivity, Context context) {
        meetingFeedbackDialogActivity.mo213599a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingFeedbackDialogActivity);
        }
    }

    /* renamed from: a */
    public static Context m240676a(MeetingFeedbackDialogActivity meetingFeedbackDialogActivity, Configuration configuration) {
        Context a = meetingFeedbackDialogActivity.mo213597a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m240682a(MeetingFeedbackSelector meetingFeedbackSelector, boolean z) {
        if (z) {
            meetingFeedbackSelector.setTextColor(C60773o.m236126d(R.color.text_title));
            meetingFeedbackSelector.setIconVisibility(0);
            return;
        }
        meetingFeedbackSelector.setTextColor(C60773o.m236126d(R.color.text_placeholder));
        meetingFeedbackSelector.setIconVisibility(4);
    }
}
