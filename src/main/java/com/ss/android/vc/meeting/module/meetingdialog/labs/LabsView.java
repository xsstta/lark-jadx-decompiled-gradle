package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundResponse;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.background.PushVirtualBackgroundType;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62276a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62284e;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62285f;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsPageTitlesView;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsTouchUpTab;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.p3159s.AbstractC62904a;
import com.ss.android.vc.meeting.module.toptips.TopTipsViewControl;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LabsView extends ConstraintLayout implements View.OnClickListener, AbstractC62216c.AbstractC62218b, AbstractC62300w {

    /* renamed from: n */
    protected static View f156296n;

    /* renamed from: a */
    protected Context f156297a;

    /* renamed from: b */
    protected AbstractC62216c.AbstractC62218b.AbstractC62220b f156298b;

    /* renamed from: c */
    public C61303k f156299c;

    /* renamed from: d */
    public C62293r f156300d;

    /* renamed from: e */
    protected ImageView f156301e;

    /* renamed from: f */
    protected FrameLayout f156302f;

    /* renamed from: g */
    protected ViewPager f156303g;

    /* renamed from: h */
    protected C62285f f156304h;

    /* renamed from: i */
    protected LabsPageTitlesView f156305i;

    /* renamed from: j */
    protected TextView f156306j;

    /* renamed from: k */
    protected TextView f156307k;

    /* renamed from: l */
    public ByteRtc f156308l;

    /* renamed from: m */
    protected boolean f156309m;

    /* renamed from: o */
    protected View f156310o;

    /* renamed from: p */
    protected View f156311p;

    /* renamed from: q */
    protected View f156312q;

    /* renamed from: r */
    protected List<AbstractC62283d> f156313r = new ArrayList();

    /* renamed from: s */
    protected EffectSeekBarLayout f156314s;

    /* renamed from: t */
    protected int f156315t = 0;

    /* renamed from: u */
    public LabsScene f156316u = LabsScene.LABS_SETTING_PAGE;

    /* renamed from: v */
    protected String f156317v;

    /* renamed from: w */
    private AbstractC62216c.AbstractC62218b.AbstractC62219a f156318w;

    /* renamed from: x */
    private boolean f156319x;

    /* renamed from: y */
    private boolean f156320y = false;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b
    public String getEnvId() {
        return this.f156317v;
    }

    /* renamed from: a */
    public void mo215207a(boolean z, boolean z2) {
        C62293r rVar;
        if (z2 && (rVar = this.f156300d) != null) {
            rVar.mo215434a(z);
        }
        List<AbstractC62283d> list = this.f156313r;
        if (list != null) {
            for (AbstractC62283d dVar : list) {
                if (dVar != null) {
                    dVar.mo215393a(z);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w
    /* renamed from: a */
    public void mo215206a(boolean z) {
        EffectSeekBarLayout effectSeekBarLayout = this.f156314s;
        if (effectSeekBarLayout != null) {
            effectSeekBarLayout.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62300w
    /* renamed from: a */
    public void mo215204a(String str, int i, int i2, int i3, int i4) {
        EffectSeekBarLayout effectSeekBarLayout = this.f156314s;
        if (effectSeekBarLayout != null) {
            effectSeekBarLayout.mo215181a(str, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo215205a(List<VirtualBackgroundInfo> list, PushVirtualBackgroundType pushVirtualBackgroundType) {
        if (!CollectionUtils.isEmpty(this.f156313r)) {
            C62277b bVar = null;
            Iterator<AbstractC62283d> it = this.f156313r.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC62283d next = it.next();
                if (next instanceof C62277b) {
                    bVar = (C62277b) next;
                    break;
                }
            }
            if (bVar != null) {
                bVar.mo215392a(list, pushVirtualBackgroundType);
            }
        }
    }

    /* renamed from: l */
    public void mo215219l() {
        this.f156308l.mo212017d();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b
    /* renamed from: b */
    public void mo215208b() {
        VideoChatModule.getDependency().openPhotoPickerPage((Activity) this.f156297a);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo215221n();
        this.f156297a = null;
        this.f156298b = null;
    }

    /* renamed from: i */
    public void mo215216i() {
        this.f156311p.setVisibility(0);
        mo215227s();
    }

    private int getAnimojiTabIndex() {
        for (int i = 0; i < this.f156313r.size(); i++) {
            if (this.f156313r.get(i) instanceof C62276a) {
                return i;
            }
        }
        return -1;
    }

    private int getFilterTabIndex() {
        for (int i = 0; i < this.f156313r.size(); i++) {
            if (this.f156313r.get(i) instanceof C62284e) {
                return i;
            }
        }
        return -1;
    }

    private int getTouchUpTabIndex() {
        for (int i = 0; i < this.f156313r.size(); i++) {
            if (this.f156313r.get(i) instanceof LabsTouchUpTab) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: t */
    private boolean m242935t() {
        if (this.f156299c.mo212056e() == null) {
            return false;
        }
        return this.f156299c.mo212092J().mo212504A();
    }

    /* renamed from: d */
    public void mo215210d() {
        setBackgroundColor(C60773o.m236126d(R.color.ud_N100));
        this.f156309m = C60788y.m236247a(getContext());
        mo215211e();
        mo215207a(C61999a.m242220f(), false);
    }

    /* renamed from: f */
    public void mo215212f() {
        C60783v.m236227a(this.f156301e, (int) R.drawable.ud_icon_close_outlined, (int) R.color.static_white);
        this.f156307k.setVisibility(0);
    }

    /* renamed from: g */
    public void mo215213g() {
        this.f156308l = this.f156299c.mo212165y();
        C62293r rVar = new C62293r(this.f156297a, this.f156299c, new LabsUtils.AbstractC62209b() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView.C622101 */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62208a
            /* renamed from: a */
            public void mo215195a(String str) {
                LabsView.this.f156308l.mo212011b(str);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62209b
            /* renamed from: b */
            public void mo215198b(String str) {
                LabsView.this.f156308l.mo211998a(str);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62209b
            /* renamed from: a */
            public void mo215197a(boolean z) {
                LabsView.this.f156308l.mo212023g(z);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62208a
            /* renamed from: a */
            public void mo215196a(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
                LabsView.this.f156308l.mo212001a(str, str2, str3, i, iArr, strArr, i2, str4);
            }
        }, this);
        this.f156300d = rVar;
        rVar.create();
    }

    /* renamed from: j */
    public void mo215217j() {
        View view;
        boolean a = C60788y.m236247a(getContext());
        this.f156309m = a;
        if (a && (view = this.f156311p) != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: m */
    public void mo215220m() {
        C60700b.m235851b("LabsView@", "[onDestroy]", "LabsView onDestroy");
        C62299v.m243372b();
        C60740ad.m236044a(f156296n);
        C62261j.m243153b(this);
        this.f156308l.mo211992a(f156296n);
        f156296n = null;
        mo215222o();
        if (this.f156309m && m242935t()) {
            C60700b.m235851b("LabsView@", "[onDestroy2]", "local video muted, stopPreview");
            mo215219l();
        }
        C62293r rVar = this.f156300d;
        if (rVar != null) {
            rVar.destroy();
        }
    }

    /* renamed from: o */
    public void mo215222o() {
        if (!CollectionUtils.isEmpty(this.f156313r)) {
            C62277b bVar = null;
            Iterator<AbstractC62283d> it = this.f156313r.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC62283d next = it.next();
                if (next instanceof C62277b) {
                    bVar = (C62277b) next;
                    break;
                }
            }
            if (bVar != null) {
                bVar.mo215395b(this);
            }
        }
    }

    /* renamed from: p */
    public void mo215224p() {
        mo215226r();
        mo215225q();
        mo215227s();
        this.f156305i.mo215368a(this.f156319x);
        List<AbstractC62283d> list = this.f156313r;
        if (list != null) {
            for (AbstractC62283d dVar : list) {
                if (dVar != null) {
                    dVar.mo215396e();
                }
            }
        }
    }

    /* renamed from: q */
    public void mo215225q() {
        View findViewById = findViewById(R.id.labs_bottom_bar);
        if (findViewById != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.height = (int) (((double) C60776r.m236144b()) * 0.35d);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: r */
    public void mo215226r() {
        int i;
        if (this.f156312q != null) {
            int a = C60776r.m236139a();
            int b = C60776r.m236144b();
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156312q.getLayoutParams();
            double d = (double) b;
            if (((double) a) < 0.8d * d) {
                i = Math.min((a * 16) / 9, b);
            } else {
                i = (int) (d * 0.75d);
            }
            layoutParams.width = a;
            layoutParams.height = i;
            this.f156312q.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: s */
    public void mo215227s() {
        if (this.f156311p != null) {
            int e = (int) (((double) C60776r.m236147e()) * 0.4d);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156311p.getLayoutParams();
            layoutParams.width = e;
            layoutParams.height = e;
            this.f156311p.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b
    /* renamed from: c */
    public void mo215209c() {
        int touchUpTabIndex;
        int filterTabIndex;
        int animojiTabIndex;
        if (!this.f156319x) {
            this.f156319x = true;
            if (LabsUtils.m242917i() && (animojiTabIndex = getAnimojiTabIndex()) >= 0 && animojiTabIndex < this.f156313r.size()) {
                this.f156313r.remove(animojiTabIndex);
            }
            if (LabsUtils.m242916h() && (filterTabIndex = getFilterTabIndex()) >= 0 && filterTabIndex < this.f156313r.size()) {
                this.f156313r.remove(filterTabIndex);
            }
            if (LabsUtils.m242915g() && (touchUpTabIndex = getTouchUpTabIndex()) >= 0 && touchUpTabIndex < this.f156313r.size()) {
                this.f156313r.remove(touchUpTabIndex);
            }
            this.f156304h.mo215411a(this.f156313r);
            this.f156305i.mo215368a(this.f156319x);
            this.f156306j.setVisibility(0);
        }
    }

    /* renamed from: h */
    public void mo215215h() {
        boolean z;
        String str;
        File parentFile;
        if (C62261j.f156429a != null && !C60742af.m236059a(C62261j.f156429a.f156427a)) {
            Iterator<VirtualBackgroundInfo> it = C62261j.f156429a.f156427a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                VirtualBackgroundInfo next = it.next();
                if (!next.isPreset() && !TextUtils.isEmpty(next.getPath())) {
                    str = next.getPath();
                    break;
                }
            }
            if (!TextUtils.isEmpty(str) && ((parentFile = new File(str).getParentFile()) == null || !parentFile.isDirectory() || parentFile.list() == null || parentFile.list().length <= 0)) {
                C60700b.m235851b("LabsView@", "[loadLabsConfig]", "parentFile is empty. userNetCache = true");
                z = false;
                this.f156300d.mo215435a(z, new AbstractC63598b<C62260i>() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView.C622123 */

                    /* access modifiers changed from: public */
                    /* renamed from: b */
                    private /* synthetic */ void m242968b(C62260i iVar) {
                        LabsView.this.mo215203a(iVar);
                    }

                    /* renamed from: a */
                    public void onSuccess(C62260i iVar) {
                        C60700b.m235851b("LabsView@", "[loadLabsConfig2]", "onSuccess");
                        if (iVar != null) {
                            C60735ab.m236001a(new Runnable(iVar) {
                                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$3$MeHlGjqa1iyfFpGcBjDsGZZuY */
                                public final /* synthetic */ C62260i f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    LabsView.C622123.m271298lambda$MeHlGjqa1iyfFpGcBjDsGZZuY(LabsView.C622123.this, this.f$1);
                                }
                            });
                        }
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("LabsView@", "[loadLabsConfig3]", "onError: " + eVar.mo219902b());
                        LabsView.this.mo215203a((C62260i) null);
                    }
                });
            }
        }
        z = true;
        this.f156300d.mo215435a(z, new AbstractC63598b<C62260i>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView.C622123 */

            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m242968b(C62260i iVar) {
                LabsView.this.mo215203a(iVar);
            }

            /* renamed from: a */
            public void onSuccess(C62260i iVar) {
                C60700b.m235851b("LabsView@", "[loadLabsConfig2]", "onSuccess");
                if (iVar != null) {
                    C60735ab.m236001a(new Runnable(iVar) {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$3$MeHlGjqa1iyfFpGcBjDsGZZuY */
                        public final /* synthetic */ C62260i f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            LabsView.C622123.m271298lambda$MeHlGjqa1iyfFpGcBjDsGZZuY(LabsView.C622123.this, this.f$1);
                        }
                    });
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("LabsView@", "[loadLabsConfig3]", "onError: " + eVar.mo219902b());
                LabsView.this.mo215203a((C62260i) null);
            }
        });
    }

    /* renamed from: k */
    public void mo215218k() {
        mo215217j();
        this.f156299c.mo212102T().mo212208a(f156296n, ParticipantUtil.m248728b(this.f156299c));
        C61074b.m237511a(f156296n, C60773o.m236126d(R.color.vc_bg_cam_off));
        C61074b.m237510a(f156296n, (float) BitmapDescriptorFactory.HUE_RED);
        if (f156296n.getParent() != null) {
            ((ViewGroup) f156296n.getParent()).removeView(f156296n);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f156302f.addView(f156296n, layoutParams);
        this.f156308l.mo212014c();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b
    /* renamed from: a */
    public void mo215199a() {
        VCDialogUtils.m236178a(getContext(), (int) R.string.View_G_GoToThirdPartyPlatformMobile, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$9K6FRa1IGtgjvLXmYH9bhxLp9g */

            public final void onClick(DialogInterface dialogInterface, int i) {
                LabsView.m271296lambda$9K6FRa1IGtgjvLXmYH9bhxLp9g(LabsView.this, dialogInterface, i);
            }
        }, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$oqMM3sCQwfGyAfJXvGVwU_69yfM */

            public final void onClick(DialogInterface dialogInterface, int i) {
                LabsView.lambda$oqMM3sCQwfGyAfJXvGVwU_69yfM(LabsView.this, dialogInterface, i);
            }
        }, false);
        this.f156300d.mo215449h();
    }

    /* renamed from: e */
    public void mo215211e() {
        LayoutInflater.from(getContext()).inflate(R.layout.labs_layout, (ViewGroup) this, true);
        this.f156310o = findViewById(R.id.labs_title);
        ImageView imageView = (ImageView) findViewById(R.id.labs_icon_close);
        this.f156301e = imageView;
        imageView.setOnClickListener(this);
        this.f156302f = (FrameLayout) findViewById(R.id.video_view);
        this.f156314s = (EffectSeekBarLayout) findViewById(R.id.effect_seek_bar);
        this.f156303g = (ViewPager) findViewById(R.id.labs_content_pager);
        C62285f fVar = new C62285f();
        this.f156304h = fVar;
        this.f156303g.setAdapter(fVar);
        this.f156305i = (LabsPageTitlesView) findViewById(R.id.tabs);
        this.f156306j = (TextView) findViewById(R.id.tabs_button_done);
        this.f156307k = (TextView) findViewById(R.id.hint_text);
        this.f156311p = findViewById(R.id.camera_unavailable);
        this.f156312q = findViewById(R.id.video_container);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156310o.getLayoutParams();
        layoutParams.topMargin = C60776r.m236148f();
        this.f156310o.setLayoutParams(layoutParams);
        mo215226r();
        mo215225q();
        mo215212f();
    }

    /* renamed from: n */
    public void mo215221n() {
        if (this.f156319x) {
            this.f156319x = false;
            this.f156306j.setVisibility(8);
            if (LabsUtils.m242917i()) {
                this.f156313r.add(new C62276a(this.f156300d, this.f156298b, this));
            }
            if (LabsUtils.m242915g()) {
                this.f156313r.add(new LabsTouchUpTab(this.f156300d, this.f156298b, this));
            }
            if (LabsUtils.m242916h()) {
                this.f156313r.add(new C62284e(this.f156300d, this.f156298b, this));
            }
            this.f156304h.mo215411a(this.f156313r);
            this.f156305i.mo215368a(this.f156319x);
            if (!CollectionUtils.isEmpty(this.f156313r)) {
                C62277b bVar = null;
                Iterator<AbstractC62283d> it = this.f156313r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC62283d next = it.next();
                    if (next instanceof C62277b) {
                        bVar = (C62277b) next;
                        break;
                    }
                }
                if (bVar != null) {
                    bVar.mo215399h();
                }
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242930a(View view) {
        mo215221n();
    }

    public void setActionListener(AbstractC62216c.AbstractC62218b.AbstractC62219a aVar) {
        this.f156318w = aVar;
    }

    public void setEnvId(String str) {
        this.f156317v = str;
    }

    public void setViewDelegate(AbstractC62216c.AbstractC62218b.AbstractC62220b bVar) {
        this.f156298b = bVar;
    }

    public void setScene(LabsScene labsScene) {
        this.f156316u = labsScene;
        C62293r rVar = this.f156300d;
        if (rVar != null) {
            rVar.mo215429a(labsScene);
        }
    }

    public LabsView(Context context) {
        super(context);
        this.f156297a = context;
        mo215210d();
    }

    public void onClick(View view) {
        if (view == this.f156301e && this.f156318w != null) {
            if (this.f156320y) {
                this.f156300d.mo215428a(this.f156299c);
            }
            this.f156318w.bN_();
        }
    }

    /* renamed from: b */
    private void m242934b(final C61303k kVar) {
        this.f156300d.mo215437b(this.f156316u, !this.f156299c.mo212092J().mo212504A());
        this.f156320y = true;
        new TopTipsViewControl((ViewGroup) this, false).mo217391a(new AbstractC62904a.AbstractC62906b() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView.C622112 */

            @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62906b
            /* renamed from: a */
            public void mo215232a() {
                kVar.mo212092J().mo212567r(true);
                LabsView.this.f156300d.mo215430a(LabsView.this.f156316u, true ^ LabsView.this.f156299c.mo212092J().mo212504A());
            }
        });
    }

    /* renamed from: a */
    public void mo215201a(C61303k kVar) {
        C62299v.m243370a();
        this.f156299c = kVar;
        C62261j.m243150a(this);
        mo215213g();
        this.f156313r.clear();
        boolean k = LabsUtils.m242919k();
        boolean i = LabsUtils.m242917i();
        boolean h = LabsUtils.m242916h();
        boolean g = LabsUtils.m242915g();
        C60700b.m235851b("LabsView@", "[init]", "animoji:" + i + ", filter:" + h + ", touchup:" + g + ", background:" + k);
        if (k) {
            this.f156313r.add(new C62277b(this.f156300d, this.f156298b, this));
        }
        if (i) {
            this.f156313r.add(new C62276a(this.f156300d, this.f156298b, this));
        }
        if (g) {
            this.f156313r.add(new LabsTouchUpTab(this.f156300d, this.f156298b, this));
        }
        if (h) {
            this.f156313r.add(new C62284e(this.f156300d, this.f156298b, this));
        }
        this.f156304h.mo215411a(this.f156313r);
        this.f156305i.mo215367a(this.f156304h);
        if (!CollectionUtils.isEmpty(this.f156313r)) {
            this.f156303g.setCurrentItem(0, false);
            this.f156314s.setSeekBarChangeListener(this.f156313r.get(0));
            this.f156313r.get(0).bO_();
            this.f156315t = 0;
        }
        this.f156305i.setTabChangeListener(new LabsPageTitlesView.AbstractC62272a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$7oGfPuP4zvIfH2UZrUZo45T_HI */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsPageTitlesView.AbstractC62272a
            public final void onTabChanged(int i, AbstractC62283d dVar) {
                LabsView.m271295lambda$7oGfPuP4zvIfH2UZrUZo45T_HI(LabsView.this, i, dVar);
            }
        });
        this.f156306j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$H9pkjg89rBPgBmCLzAOkww3rXRQ */

            public final void onClick(View view) {
                LabsView.lambda$H9pkjg89rBPgBmCLzAOkww3rXRQ(LabsView.this, view);
            }
        });
        mo215215h();
        if (f156296n == null) {
            f156296n = this.f156308l.mo211988a(false);
        }
        if (this.f156309m) {
            mo215218k();
        } else {
            mo215216i();
        }
        if (!LabsUtils.m242913e() && kVar != null && !kVar.mo212092J().mo212515L().booleanValue()) {
            m242934b(kVar);
        }
    }

    /* renamed from: a */
    public void mo215203a(C62260i iVar) {
        for (AbstractC62283d dVar : this.f156313r) {
            dVar.mo215391a(iVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m242933b(DialogInterface dialogInterface, int i) {
        this.f156300d.mo215451j();
    }

    public LabsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f156297a = context;
        mo215210d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242928a(int i, AbstractC62283d dVar) {
        this.f156303g.setCurrentItem(i, false);
        this.f156314s.setSeekBarChangeListener(dVar);
        this.f156313r.get(this.f156315t).mo215408k();
        dVar.bO_();
        this.f156315t = i;
        AbstractC62216c.AbstractC62218b.AbstractC62220b bVar = this.f156298b;
        if (bVar != null) {
            bVar.mo215250a(dVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242929a(DialogInterface dialogInterface, int i) {
        this.f156300d.mo215450i();
        if (!TextUtils.isEmpty(LabsUtils.m242921m())) {
            VideoChatModule.getDependency().getLittleAppDependency().startLittleAppActivity(this.f156297a, LabsUtils.m242921m());
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.AbstractC62216c.AbstractC62218b
    /* renamed from: a */
    public void mo215200a(VirtualBackgroundInfo virtualBackgroundInfo, C62239f.AbstractC62249d dVar) {
        VideoChat videoChat;
        C60700b.m235851b("LabsView@", "[deleteVirtualBackground]", "delete");
        if (this.f156297a != null) {
            this.f156300d.mo215452k();
            VCDialogUtils.m236219c(this.f156297a, C60773o.m236119a((int) R.string.View_G_DeleteBackgroundQuestion), 2, C60773o.m236119a((int) R.string.View_VM_OnceDeleteNoRecover), R.string.View_G_CancelButton, new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$nhCs_zAjQWlxqhG66aD6VrPPgmc */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    LabsView.lambda$nhCs_zAjQWlxqhG66aD6VrPPgmc(C62239f.AbstractC62249d.this, dialogInterface, i);
                }
            }, R.string.View_G_Delete, new DialogInterface.OnClickListener(virtualBackgroundInfo, dVar) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$LabsView$hTU5Pq93pli8XjkB57kVDt0SZU */
                public final /* synthetic */ VirtualBackgroundInfo f$1;
                public final /* synthetic */ C62239f.AbstractC62249d f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    LabsView.m271297lambda$hTU5Pq93pli8XjkB57kVDt0SZU(LabsView.this, this.f$1, this.f$2, dialogInterface, i);
                }
            }, false);
            MeetingPopupEvent a = MeetingPopupEvent.m249838a();
            C61303k kVar = this.f156299c;
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            a.mo220317a("delete_virtual_background", videoChat);
        }
    }

    /* renamed from: a */
    public void mo215202a(C61303k kVar, Context context) {
        C62299v.m243370a();
        this.f156299c = kVar;
        this.f156297a = context;
        mo215213g();
        C62261j.m243150a(this);
        List<AbstractC62283d> list = this.f156313r;
        if (list != null) {
            for (AbstractC62283d dVar : list) {
                dVar.mo215407a(this.f156300d, this.f156298b);
                dVar.bP_();
                if (dVar instanceof C62277b) {
                    C62277b bVar = (C62277b) dVar;
                    bVar.mo215401j();
                    bVar.mo215394b(context);
                }
            }
        }
        this.f156309m = C60788y.m236247a(getContext());
        mo215207a(C61999a.m242220f(), false);
        if (f156296n == null) {
            f156296n = this.f156308l.mo211988a(false);
        }
        this.f156302f.removeAllViews();
        if (this.f156309m) {
            mo215218k();
        } else {
            mo215216i();
        }
        mo215224p();
    }

    /* renamed from: a */
    public static /* synthetic */ void m242932a(C62239f.AbstractC62249d dVar, DialogInterface dialogInterface, int i) {
        C60700b.m235851b("LabsView@", "[deleteVirtualBackground2]", "cancel");
        dVar.mo215340c();
    }

    public LabsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f156297a = context;
        mo215210d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242931a(final VirtualBackgroundInfo virtualBackgroundInfo, final C62239f.AbstractC62249d dVar, DialogInterface dialogInterface, int i) {
        C60700b.m235851b("LabsView@", "[deleteVirtualBackground3]", "confirm");
        this.f156300d.mo215441c(virtualBackgroundInfo);
        VcBizSender.m249296k(virtualBackgroundInfo.key).mo219889a(new AbstractC63598b<DelVcVirtualBackgroundResponse>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView.C622134 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("LabsView@", "[deleteVirtualBackground5]", "delete background fail, error: " + eVar);
                dVar.mo215339b();
            }

            /* renamed from: a */
            public void onSuccess(DelVcVirtualBackgroundResponse delVcVirtualBackgroundResponse) {
                C60700b.m235851b("LabsView@", "[deleteVirtualBackground4]", "delete background success, key is " + virtualBackgroundInfo.key);
                dVar.mo215338a();
                C62261j.f156429a.f156427a.remove(virtualBackgroundInfo);
            }
        });
    }
}
