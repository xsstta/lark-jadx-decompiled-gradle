package com.ss.android.vc.meeting.module.meetingdialog.labs.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.PreviewVideoView;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62261j;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62293r;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62299v;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62276a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62277b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.C62284e;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsPageTitlesView;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsTouchUpTab;
import com.ss.android.vc.meeting.module.p3159s.AbstractC62904a;
import com.ss.android.vc.meeting.module.toptips.TopTipsViewControl;
import com.ss.android.vc.service.VideoChatManager;

public class LabsPreviewView extends LabsView {

    /* renamed from: w */
    public boolean f156494w;

    /* renamed from: x */
    private boolean f156495x;

    /* renamed from: y */
    private PreviewVideoView f156496y;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: d */
    public void mo215210d() {
        super.mo215210d();
        this.f156316u = LabsScene.PAGE_PREVIEW;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: k */
    public void mo215218k() {
        mo215217j();
        this.f156496y.mo208475a(new PreviewVideoView.AbstractC60811a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.preview.LabsPreviewView.C622883 */

            @Override // com.ss.android.vc.common.widget.PreviewVideoView.AbstractC60811a
            /* renamed from: a */
            public void mo208482a() {
                LabsPreviewView.this.f156494w = true;
            }

            @Override // com.ss.android.vc.common.widget.PreviewVideoView.AbstractC60811a
            /* renamed from: b */
            public void mo208483b() {
                LabsPreviewView.this.f156494w = false;
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: f */
    public void mo215212f() {
        this.f156496y = (PreviewVideoView) findViewById(R.id.preview_video_view);
        C60783v.m236227a(this.f156301e, (int) R.drawable.ud_icon_left_outlined, (int) R.color.static_white);
        this.f156307k.setVisibility(8);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: m */
    public void mo215220m() {
        C60700b.m235851b("LabsPreviewView", "[onDestroy]", "LabsView onDestroy");
        C62299v.m243372b();
        C62261j.m243153b(this);
        mo215222o();
        if (this.f156309m && !this.f156495x) {
            this.f156496y.mo208476b();
        }
        if (this.f156300d != null) {
            this.f156300d.destroy();
        }
    }

    public LabsPreviewView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: a */
    public /* synthetic */ void m243300a(View view) {
        mo215221n();
    }

    /* renamed from: b */
    private void m243301b(final C61303k kVar) {
        this.f156300d.mo215437b(this.f156316u, this.f156494w);
        new TopTipsViewControl((ViewGroup) this, false).mo217391a(new AbstractC62904a.AbstractC62906b() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.preview.LabsPreviewView.C622872 */

            @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62906b
            /* renamed from: a */
            public void mo215232a() {
                C61303k kVar = kVar;
                if (kVar == null) {
                    VideoChatManager.m249444a().mo220127e(true);
                } else {
                    kVar.mo212092J().mo212567r(true);
                }
                LabsPreviewView.this.f156300d.mo215430a(LabsPreviewView.this.f156316u, LabsPreviewView.this.f156494w);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: a */
    public void mo215201a(C61303k kVar) {
        C62299v.m243370a();
        C62261j.m243150a(this);
        this.f156300d = new C62293r(this.f156297a, kVar, new LabsUtils.AbstractC62209b() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.preview.LabsPreviewView.C622861 */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62208a
            /* renamed from: a */
            public void mo215195a(String str) {
                C61237h.m238223a().mo210528b(str);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62209b
            /* renamed from: b */
            public void mo215198b(String str) {
                C61237h.m238223a().mo210542f(str);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62209b
            /* renamed from: a */
            public void mo215197a(boolean z) {
                C61237h.m238223a().mo210549h(z);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62208a
            /* renamed from: a */
            public void mo215196a(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
                C61237h.m238223a().mo210514a(str, str2, str3, i, iArr, strArr, i2, str4);
            }
        }, this);
        this.f156300d.mo215429a(this.f156316u);
        this.f156300d.create();
        this.f156313r.clear();
        boolean k = LabsUtils.m242919k();
        boolean i = LabsUtils.m242917i();
        boolean h = LabsUtils.m242916h();
        boolean g = LabsUtils.m242915g();
        C60700b.m235851b("LabsPreviewView", "[init]", "animoji:" + i + ", filter:" + h + ", touchup:" + g + ", background:" + k);
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
        boolean z = false;
        if (!CollectionUtils.isEmpty(this.f156313r)) {
            this.f156303g.setCurrentItem(0, false);
            this.f156314s.setSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this.f156313r.get(0));
            ((AbstractC62283d) this.f156313r.get(0)).bO_();
            this.f156315t = 0;
        }
        this.f156305i.setTabChangeListener(new LabsPageTitlesView.AbstractC62272a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.preview.$$Lambda$LabsPreviewView$X41tLWfZI8r2N3Umr_GueJ2TiI */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsPageTitlesView.AbstractC62272a
            public final void onTabChanged(int i, AbstractC62283d dVar) {
                LabsPreviewView.this.m243299a((LabsPreviewView) i, (int) dVar);
            }
        });
        this.f156306j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.preview.$$Lambda$LabsPreviewView$uHFD6Rc_NB0qcx7_JdozFu4GBE */

            public final void onClick(View view) {
                LabsPreviewView.this.m243300a((LabsPreviewView) view);
            }
        });
        mo215215h();
        this.f156496y.setCornerRadius(0);
        this.f156495x = C61237h.m238223a().mo210552j();
        C60700b.m235851b("LabsPreviewView", "[init2]", "mIsCameraPreview: " + this.f156495x);
        if (this.f156309m) {
            mo215218k();
        } else {
            mo215216i();
        }
        if (!LabsUtils.m242913e()) {
            boolean z2 = true;
            if (kVar == null && !VideoChatManager.m249444a().mo220124d(false)) {
                z = true;
            }
            if (kVar == null || kVar.mo212092J().mo212515L().booleanValue()) {
                z2 = z;
            }
            if (z2) {
                m243301b(kVar);
            }
        }
    }

    public LabsPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsView
    /* renamed from: a */
    public /* synthetic */ void m243299a(int i, AbstractC62283d dVar) {
        this.f156303g.setCurrentItem(i, false);
        this.f156314s.setSeekBarChangeListener(dVar);
        ((AbstractC62283d) this.f156313r.get(this.f156315t)).mo215408k();
        dVar.bO_();
        this.f156315t = i;
        if (this.f156298b != null) {
            this.f156298b.mo215250a(dVar);
        }
    }

    public LabsPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
