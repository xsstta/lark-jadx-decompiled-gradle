package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.widget.PreviewVideoView;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.impl.AbstractC61013b;
import com.ss.android.vc.irtc.C61022a;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.net.service.VCSyncGetService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.p3180a.C63697g;

public class PreviewVideoView extends FrameLayout {

    /* renamed from: a */
    public final String f152074a = ("PreviewVideoView#" + hashCode());

    /* renamed from: b */
    public View f152075b;

    /* renamed from: c */
    private C61022a f152076c;

    /* renamed from: d */
    private boolean f152077d = false;

    /* renamed from: e */
    private final int f152078e = 1;

    /* renamed from: f */
    private final int f152079f = 2;

    /* renamed from: g */
    private int f152080g = 0;

    /* renamed from: com.ss.android.vc.common.widget.PreviewVideoView$a */
    public interface AbstractC60811a {
        /* renamed from: a */
        void mo208482a();

        /* renamed from: b */
        void mo208483b();
    }

    /* renamed from: e */
    private boolean m236350e() {
        return C63634c.m249496b("byteview.meeting.android.mirror");
    }

    /* renamed from: d */
    private void m236349d() {
        C60700b.m235851b(this.f152074a, "[init]", "init");
    }

    /* renamed from: a */
    public void mo208474a() {
        if (!C61237h.m238223a().mo210551i()) {
            C60700b.m235861e(this.f152074a, "[startPreviewWithoutRequest]", "rtc not inited");
        } else {
            m236348b(null);
        }
    }

    /* renamed from: c */
    public void mo208477c() {
        C60700b.m235851b(this.f152074a, "[detachVideoView]", "detachVideoView");
        View view = this.f152075b;
        if (view != null) {
            C60740ad.m236044a(view);
            C61237h.m238223a().mo210499a(this.f152075b);
            this.f152075b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C60700b.m235851b(this.f152074a, "[onDetachedFromWindow]", "onDetachedFromWindow");
        if (this.f152076c != null) {
            C61237h.m238223a().mo210527b(this.f152076c);
            this.f152076c = null;
        }
        mo208477c();
    }

    /* renamed from: b */
    public void mo208476b() {
        C60700b.m235851b(this.f152074a, "[stopPreview]", "stopPreview");
        C60740ad.m236044a(this.f152075b);
        C61237h.m238223a().mo210553k();
        if (this.f152076c != null) {
            C61237h.m238223a().mo210527b(this.f152076c);
            this.f152076c = null;
        }
    }

    public void setCornerRadius(int i) {
        View view;
        this.f152080g = i;
        if (i > 0 && (view = this.f152075b) != null) {
            C61074b.m237510a(view, (float) i);
        }
    }

    public PreviewVideoView(Context context) {
        super(context);
        m236349d();
    }

    /* renamed from: b */
    private void m236348b(final AbstractC60811a aVar) {
        boolean J = C61237h.m238223a().mo211785J();
        if (!J) {
            C63697g.m249708f();
        }
        if (this.f152075b == null) {
            this.f152075b = C61237h.m238223a().mo210531c(false);
            setCornerRadius(this.f152080g);
        }
        C61074b.m237511a(this.f152075b, C60773o.m236126d(R.color.vc_bg_cam_off));
        if (!J) {
            C60700b.m235851b(this.f152074a, "[commonStart]", "first start");
            this.f152075b.setVisibility(8);
            C61237h.m238223a().mo211786K();
            if (this.f152076c != null) {
                C61237h.m238223a().mo210527b(this.f152076c);
            }
            this.f152076c = new C61022a() {
                /* class com.ss.android.vc.common.widget.PreviewVideoView.C608101 */

                @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
                /* renamed from: a */
                public void mo208480a(int i, int i2) {
                    super.mo208480a(i, i2);
                    C63697g.m249709g();
                    if (PreviewVideoView.this.f152075b != null) {
                        if (PreviewVideoView.this.f152075b.getParent() == null) {
                            PreviewVideoView previewVideoView = PreviewVideoView.this;
                            previewVideoView.addView(previewVideoView.f152075b, 0);
                        }
                        if (C61237h.m238223a().mo210551i()) {
                            C61237h.m238223a().mo210504a(PreviewVideoView.this.f152075b, "");
                        }
                    }
                    C62003a.m242249a();
                    AbstractC60811a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo208482a();
                    }
                    if (PreviewVideoView.this.f152075b != null) {
                        PreviewVideoView.this.f152075b.setVisibility(0);
                    }
                }

                @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
                /* renamed from: a */
                public void mo208481a(int i, String str, int i2) {
                    super.mo208481a(i, str, i2);
                    String str2 = PreviewVideoView.this.f152074a;
                    C60700b.m235864f(str2, "[commonStart2]", "onMediaDeviceError code: " + i2);
                }
            };
            C61237h.m238223a().mo210510a(this.f152076c);
        } else {
            View view = this.f152075b;
            if (view != null) {
                if (view.getParent() == null) {
                    addView(this.f152075b, 0);
                }
                C61237h.m238223a().mo210504a(this.f152075b, "");
            }
            C62003a.m242249a();
            if (aVar != null) {
                aVar.mo208482a();
            }
            View view2 = this.f152075b;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (!this.f152077d) {
            this.f152077d = true;
            ViewDeviceSetting viewDeviceSetting = VCSyncGetService.getViewDeviceSetting();
            if (viewDeviceSetting == null || viewDeviceSetting.video == null) {
                m236346a(true, true);
            } else {
                m236346a(true, viewDeviceSetting.video.mirror);
            }
        } else {
            m236346a(true, true);
        }
        C61237h.m238223a().mo210506a((AbstractC61013b) null);
    }

    /* renamed from: a */
    public void mo208475a(AbstractC60811a aVar) {
        C60788y.m236245a(C60773o.m236124b(getContext()), (AbstractC60798c) new AbstractC60798c(aVar) {
            /* class com.ss.android.vc.common.widget.$$Lambda$PreviewVideoView$shmS0BAymryNkIs3b3NPK7zrGzw */
            public final /* synthetic */ PreviewVideoView.AbstractC60811a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.common.permission.AbstractC60798c
            public final void permissionGranted(boolean z) {
                PreviewVideoView.lambda$shmS0BAymryNkIs3b3NPK7zrGzw(PreviewVideoView.this, this.f$1, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236345a(AbstractC60811a aVar, boolean z) {
        String str = this.f152074a;
        C60700b.m235851b(str, "[startPreview2]", "granted = " + z);
        if (z) {
            if (C61237h.m238223a().mo210551i()) {
                m236348b(aVar);
            } else {
                C60700b.m235861e(this.f152074a, "[startPreview]", "rtc not inited");
            }
        } else if (aVar != null) {
            aVar.mo208483b();
        }
    }

    public PreviewVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236349d();
    }

    /* renamed from: a */
    private void m236346a(boolean z, boolean z2) {
        String str = this.f152074a;
        C60700b.m235851b(str, "[setMirror]", "isFrontCamera = " + z + ", isMirrorSwitchOn = " + z2);
        if (!z) {
            m236347a(false, false, -1);
        } else if (!m236350e()) {
        } else {
            if (z2) {
                m236347a(true, false, 2);
            } else {
                m236347a(false, false, 2);
            }
        }
    }

    public PreviewVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236349d();
    }

    /* renamed from: a */
    private void m236347a(boolean z, boolean z2, int i) {
        String str = this.f152074a;
        C60700b.m235851b(str, "[setRtcMirrorParams]", "flipCamera = " + z + ", flipVideo = " + z2 + ", mode = " + i);
        if (i == 1 || i == 2) {
            C61237h.m238223a().mo210541f(i);
        }
        C61237h.m238223a().mo210530b(z, z2);
    }
}
