package com.bytedance.ee.bear.more.p501b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.more.AbstractC10213g;
import com.bytedance.ee.bear.more.PageViewResult;
import com.bytedance.ee.bear.more.export.C10211e;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.C11841g;
import com.bytedance.ee.bear.widgets.MaxSizeLinearLayout;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p705h.C13666a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.p078b.p079a.AbstractC2055e;
import com.p078b.p079a.C2057g;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.more.b.a */
public class C10197a implements AbstractC10213g {

    /* renamed from: a */
    private Dialog f27497a;

    /* renamed from: b */
    private C10200b f27498b;

    /* renamed from: c */
    private Context f27499c;

    /* renamed from: d */
    private C10201b f27500d;

    /* renamed from: e */
    private String f27501e;

    /* renamed from: f */
    private AbstractC2055e f27502f;

    /* renamed from: g */
    private AbstractC2055e f27503g;

    /* renamed from: h */
    private AbstractC2055e f27504h;

    /* renamed from: i */
    private AbstractC2055e f27505i;

    /* renamed from: j */
    private Handler f27506j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private Runnable f27507k = new Runnable() {
        /* class com.bytedance.ee.bear.more.p501b.$$Lambda$a$aEy2NzYNN6vBrqVsMTGncrdg5OU */

        public final void run() {
            C10197a.lambda$aEy2NzYNN6vBrqVsMTGncrdg5OU(C10197a.this);
        }
    };

    /* renamed from: l */
    private Runnable f27508l = new Runnable() {
        /* class com.bytedance.ee.bear.more.p501b.$$Lambda$a$rpumH8DUMyagGsKbpchZjQOO1k */

        public final void run() {
            C10197a.m269877lambda$rpumH8DUMyagGsKbpchZjQOO1k(C10197a.this);
        }
    };

    /* renamed from: m */
    private Runnable f27509m = new Runnable() {
        /* class com.bytedance.ee.bear.more.p501b.$$Lambda$a$O7mgEpd3AZ2msyZInKkXX8aWr10 */

        public final void run() {
            C10197a.lambda$O7mgEpd3AZ2msyZInKkXX8aWr10(C10197a.this);
        }
    };

    /* renamed from: n */
    private Runnable f27510n = new Runnable() {
        /* class com.bytedance.ee.bear.more.p501b.$$Lambda$a$ZpaYzGRbPMecoD8DB5hbQT97tLc */

        public final void run() {
            C10197a.lambda$ZpaYzGRbPMecoD8DB5hbQT97tLc(C10197a.this);
        }
    };

    /* renamed from: o */
    private AbstractC10199a f27511o;

    /* renamed from: p */
    private final C10917c f27512p;

    /* renamed from: q */
    private boolean f27513q;

    /* renamed from: com.bytedance.ee.bear.more.b.a$a */
    public interface AbstractC10199a {
        void gotoProfile(String str, C10917c cVar);
    }

    /* renamed from: e */
    private void m42476e() {
        this.f27506j.removeCallbacks(this.f27507k);
        AbstractC2055e eVar = this.f27502f;
        if (eVar != null) {
            eVar.mo10130b();
        }
    }

    /* renamed from: g */
    private void m42478g() {
        this.f27506j.removeCallbacks(this.f27508l);
        AbstractC2055e eVar = this.f27503g;
        if (eVar != null) {
            eVar.mo10130b();
        }
    }

    /* renamed from: i */
    private void m42480i() {
        this.f27506j.removeCallbacks(this.f27509m);
        AbstractC2055e eVar = this.f27504h;
        if (eVar != null) {
            eVar.mo10130b();
        }
    }

    /* renamed from: k */
    private void m42482k() {
        this.f27506j.removeCallbacks(this.f27510n);
        AbstractC2055e eVar = this.f27505i;
        if (eVar != null) {
            eVar.mo10130b();
        }
    }

    /* renamed from: c */
    private void m42474c() {
        this.f27498b.f27530p.setVisibility(8);
        this.f27498b.f27522h.setVisibility(8);
        this.f27498b.f27524j.setVisibility(8);
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m42475d() {
        this.f27502f = C11841g.m49167a(this.f27498b.f27522h).mo10151a(R.layout.doc_pageview_skeleton_word).mo10153a();
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m42477f() {
        int i;
        C2057g.C2059a a = C11841g.m49167a(this.f27498b.f27523i);
        if (this.f27513q) {
            i = R.layout.doc_pageview_skeleton_activity;
        } else {
            i = R.layout.doc_pageview_skeleton_activity_hide_like;
        }
        this.f27503g = a.mo10151a(i).mo10153a();
    }

    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m42479h() {
        this.f27504h = C11841g.m49167a(this.f27498b.f27516b).mo10151a(R.layout.doc_pageview_skeleton_owner_info).mo10153a();
    }

    /* access modifiers changed from: public */
    /* renamed from: j */
    private void m42481j() {
        this.f27505i = C11841g.m49167a(this.f27498b.f27520f).mo10151a(R.layout.doc_pageview_skeleton_owner_info).mo10153a();
    }

    /* renamed from: b */
    public void mo38992b() {
        Dialog dialog = this.f27497a;
        if (dialog != null) {
            dialog.dismiss();
        }
        m42478g();
        m42476e();
        m42480i();
        m42482k();
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10213g
    public void onGetPageViewError() {
        Context context = this.f27499c;
        Toast.showFailureText(context, context.getString(R.string.Doc_More_LoadFailed), 0);
        m42478g();
        m42480i();
        m42482k();
    }

    /* renamed from: a */
    public void mo38987a() {
        this.f27498b.f27527m.setVisibility(8);
        this.f27498b.f27528n.setVisibility(8);
    }

    /* renamed from: a */
    public void mo38990a(AbstractC10199a aVar) {
        this.f27511o = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.more.b.a$b */
    public static class C10200b {

        /* renamed from: a */
        TextView f27515a;

        /* renamed from: b */
        LinearLayout f27516b;

        /* renamed from: c */
        ImageView f27517c;

        /* renamed from: d */
        TextView f27518d;

        /* renamed from: e */
        TextView f27519e;

        /* renamed from: f */
        LinearLayout f27520f;

        /* renamed from: g */
        TextView f27521g;

        /* renamed from: h */
        LinearLayout f27522h;

        /* renamed from: i */
        LinearLayout f27523i;

        /* renamed from: j */
        LinearLayout f27524j;

        /* renamed from: k */
        TextView f27525k;

        /* renamed from: l */
        TextView f27526l;

        /* renamed from: m */
        TextView f27527m;

        /* renamed from: n */
        TextView f27528n;

        /* renamed from: o */
        CommonActionPanelLayout f27529o;

        /* renamed from: p */
        TextView f27530p;

        /* renamed from: q */
        TextView f27531q;

        /* renamed from: r */
        TextView f27532r;

        /* renamed from: s */
        TextView f27533s;

        /* renamed from: t */
        TextView f27534t;

        /* renamed from: u */
        TextView f27535u;

        /* renamed from: v */
        TextView f27536v;

        public C10200b(View view) {
            m42490a(view);
        }

        /* renamed from: a */
        private void m42490a(View view) {
            this.f27529o = (CommonActionPanelLayout) view.findViewById(R.id.title_panel);
            this.f27530p = (TextView) view.findViewById(R.id.title_subhead_1);
            this.f27531q = (TextView) view.findViewById(R.id.title_subhead_2);
            this.f27532r = (TextView) view.findViewById(R.id.title_subhead_3);
            this.f27533s = (TextView) view.findViewById(R.id.title_subhead_value_2);
            this.f27534t = (TextView) view.findViewById(R.id.title_subhead_value_3);
            this.f27524j = (LinearLayout) view.findViewById(R.id.word_description_ll);
            this.f27522h = (LinearLayout) view.findViewById(R.id.word_ll);
            this.f27523i = (LinearLayout) view.findViewById(R.id.activity_ll);
            this.f27525k = (TextView) view.findViewById(R.id.read_people_num_tv);
            this.f27526l = (TextView) view.findViewById(R.id.read_num_tv);
            this.f27527m = (TextView) view.findViewById(R.id.like_tv);
            this.f27528n = (TextView) view.findViewById(R.id.like_description_tv);
            this.f27515a = (TextView) view.findViewById(R.id.title_owner);
            this.f27516b = (LinearLayout) view.findViewById(R.id.owner_info);
            this.f27517c = (ImageView) view.findViewById(R.id.owner_avatar);
            this.f27518d = (TextView) view.findViewById(R.id.owner_name);
            this.f27519e = (TextView) view.findViewById(R.id.title_creation_time);
            this.f27520f = (LinearLayout) view.findViewById(R.id.creation_time_info);
            this.f27521g = (TextView) view.findViewById(R.id.creation_time);
            this.f27535u = (TextView) view.findViewById(R.id.document_title);
            this.f27536v = (TextView) view.findViewById(R.id.document_title_details);
        }
    }

    /* renamed from: a */
    public void mo38989a(DialogInterface.OnDismissListener onDismissListener) {
        Dialog dialog = this.f27497a;
        if (dialog != null) {
            dialog.setOnDismissListener(onDismissListener);
        }
    }

    /* renamed from: a */
    private String m42471a(int i) {
        return new DecimalFormat("###,###").format((long) i);
    }

    /* renamed from: a */
    private View m42470a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.pageview_layout, (ViewGroup) null);
        this.f27498b = new C10200b(inflate);
        ((MaxSizeLinearLayout) inflate.findViewById(R.id.linear_layout)).setMaxHeight((int) (((double) ((float) C13749l.m55748b())) * 0.8d));
        m42472a(inflate);
        return inflate;
    }

    public C10197a(Activity activity) {
        m42470a(activity);
        this.f27499c = activity;
        this.f27512p = new C10917c(new C10929e());
        this.f27500d = new C10201b();
        this.f27501e = C4484g.m18494b().mo17252c();
    }

    /* renamed from: a */
    private void m42472a(View view) {
        Dialog dialog = new Dialog(view.getContext(), R.style.ActionSheetDialogStyle);
        this.f27497a = dialog;
        Window window = dialog.getWindow();
        if (window != null) {
            window.setContentView(view);
            window.setGravity(8388691);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10213g
    public void onGetPageViewSuccess(PageViewResult pageViewResult) {
        C10200b bVar = this.f27498b;
        if (bVar != null && pageViewResult != null) {
            bVar.f27527m.setText(m42471a(pageViewResult.likeCount));
            this.f27498b.f27526l.setText(m42471a(pageViewResult.pv));
            this.f27498b.f27525k.setText(m42471a(pageViewResult.uv));
            this.f27498b.f27521g.setText(C13723a.m55664d(this.f27499c, pageViewResult.creationTime * 1000));
            this.f27498b.f27518d.setText(C13666a.m55443a(this.f27501e, pageViewResult.ownerName, pageViewResult.ownerEnName));
            this.f27498b.f27517c.setOnClickListener(new View.OnClickListener(pageViewResult) {
                /* class com.bytedance.ee.bear.more.p501b.$$Lambda$a$XwglkYNWDccd4NonepNe4JSAk */
                public final /* synthetic */ PageViewResult f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C10197a.m269876lambda$XwglkYNWDccd4NonepNe4JSAk(C10197a.this, this.f$1, view);
                }
            });
            ComponentCallbacks2C2115c.m9151c(this.f27499c).mo10414a(new C13664a(pageViewResult.ownerAvatarUrl)).mo10399a(this.f27498b.f27517c);
            m42478g();
            m42480i();
            m42482k();
        }
    }

    /* renamed from: a */
    public void mo38991a(C10211e eVar) {
        if (this.f27498b != null && eVar != null) {
            this.f27513q = eVar.mo39078k();
            if (!eVar.mo39078k()) {
                mo38987a();
            }
            this.f27498b.f27529o.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
                /* class com.bytedance.ee.bear.more.p501b.C10197a.C101981 */

                @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
                /* renamed from: d */
                public void mo18838d() {
                    super.mo18838d();
                    C10197a.this.mo38992b();
                }
            });
            if (!TextUtils.isEmpty(eVar.mo39073f())) {
                this.f27498b.f27529o.setTitle(eVar.mo39073f());
            }
            if (!TextUtils.isEmpty(eVar.mo39068a())) {
                this.f27498b.f27530p.setText(eVar.mo39068a());
            }
            if (!TextUtils.isEmpty(eVar.mo39069b())) {
                this.f27498b.f27531q.setText(eVar.mo39069b());
            }
            if (!TextUtils.isEmpty(eVar.mo39070c())) {
                this.f27498b.f27532r.setText(eVar.mo39070c());
            }
            boolean z = false;
            if (!TextUtils.isEmpty(eVar.mo39074g())) {
                this.f27498b.f27535u.setVisibility(0);
                this.f27498b.f27535u.setText(eVar.mo39074g());
            }
            if (!TextUtils.isEmpty(eVar.mo39075h())) {
                this.f27498b.f27536v.setVisibility(0);
                this.f27498b.f27536v.setText(eVar.mo39075h());
            }
            if (!TextUtils.isEmpty(eVar.mo39076i())) {
                this.f27498b.f27515a.setText(eVar.mo39076i());
            }
            if (!TextUtils.isEmpty(eVar.mo39077j())) {
                this.f27498b.f27519e.setText(eVar.mo39077j());
            }
            boolean z2 = true;
            if (!TextUtils.isEmpty(eVar.mo39071d())) {
                this.f27498b.f27533s.setText(eVar.mo39071d());
                z = true;
            }
            if (!TextUtils.isEmpty(eVar.mo39072e())) {
                this.f27498b.f27534t.setText(eVar.mo39072e());
            } else {
                z2 = z;
            }
            if (z2) {
                m42476e();
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42473a(PageViewResult pageViewResult, View view) {
        AbstractC10199a aVar = this.f27511o;
        if (aVar != null) {
            aVar.gotoProfile(pageViewResult.ownerId, this.f27512p);
        }
    }

    /* renamed from: a */
    public void mo38988a(int i, String str, boolean z) {
        if (!this.f27497a.isShowing()) {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40646a((FrameLayout) this.f27497a.getWindow().getDecorView());
            this.f27497a.show();
        }
        this.f27506j.removeCallbacks(this.f27508l);
        this.f27506j.removeCallbacks(this.f27507k);
        this.f27506j.removeCallbacks(this.f27509m);
        this.f27506j.removeCallbacks(this.f27510n);
        this.f27500d.mo38995a(i, str, this);
        this.f27506j.postDelayed(this.f27508l, 400);
        this.f27506j.postDelayed(this.f27509m, 400);
        this.f27506j.postDelayed(this.f27510n, 400);
        if (z) {
            m42474c();
        } else {
            this.f27506j.postDelayed(this.f27507k, 400);
        }
    }
}
