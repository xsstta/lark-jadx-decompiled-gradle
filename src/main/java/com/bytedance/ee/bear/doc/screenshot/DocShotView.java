package com.bytedance.ee.bear.doc.screenshot;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.bizwidget.shareview.C4891e;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.bizwidget.shareview.ShareState;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.screenshot.C10780b;
import com.bytedance.ee.bear.screenshot.SubsamplingScaleImageView;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.io.File;
import org.koin.java.KoinJavaComponent;

public class DocShotView extends LinearLayout implements AbstractC5518b {

    /* renamed from: a */
    public AbstractC5500a f15618a;

    /* renamed from: b */
    public SubsamplingScaleImageView f15619b;

    /* renamed from: c */
    public IStatusBar f15620c;

    /* renamed from: d */
    public View f15621d;

    /* renamed from: e */
    private Context f15622e;

    /* renamed from: f */
    private BaseTitleBar f15623f;

    /* renamed from: g */
    private BearLottieView f15624g;

    /* renamed from: h */
    private View f15625h;

    /* renamed from: i */
    private ExternalShareView f15626i;

    /* renamed from: j */
    private View f15627j;

    /* renamed from: k */
    private TextView f15628k;

    /* renamed from: l */
    private View f15629l;

    /* renamed from: m */
    private View f15630m;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    /* renamed from: c */
    public void mo21964c() {
        m22347f();
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    /* renamed from: d */
    public boolean mo21965d() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m22346e() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.translate_from_bottom_in);
        setAnimation(loadAnimation);
        loadAnimation.setDuration(500);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC5496a() {
            /* class com.bytedance.ee.bear.doc.screenshot.DocShotView.C54942 */

            @Override // com.bytedance.ee.bear.doc.screenshot.DocShotView.animationAnimation$AnimationListenerC5496a
            public void onAnimationStart(Animation animation) {
                DocShotView.this.setBackgroundResource(R.color.bg_body);
            }

            @Override // com.bytedance.ee.bear.doc.screenshot.DocShotView.animationAnimation$AnimationListenerC5496a
            public void onAnimationEnd(Animation animation) {
                if (DocShotView.this.f15620c != null) {
                    DocShotView.this.f15620c.mo50687a();
                    DocShotView.this.f15620c.mo50690b(R.color.bg_body, true);
                }
            }
        });
        loadAnimation.start();
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    /* renamed from: b */
    public void mo21963b() {
        C13479a.m54772d("ScreenShotView", "onDocShotFail()...");
        m22345b(this.f15622e.getString(R.string.Doc_Facade_OperateFailed));
    }

    /* renamed from: f */
    private void m22347f() {
        clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.translate_top_to_bottom);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC5496a() {
            /* class com.bytedance.ee.bear.doc.screenshot.DocShotView.C54953 */

            @Override // com.bytedance.ee.bear.doc.screenshot.DocShotView.animationAnimation$AnimationListenerC5496a
            public void onAnimationEnd(Animation animation) {
                DocShotView.this.f15621d.setVisibility(8);
                DocShotView.this.f15619b.setVisibility(8);
                DocShotView.this.setVisibility(8);
            }
        });
        setAnimation(loadAnimation);
        IStatusBar aVar = this.f15620c;
        if (aVar != null) {
            aVar.mo50689b();
        }
        loadAnimation.start();
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    /* renamed from: a */
    public void mo21959a() {
        C13479a.m54772d("ScreenShotView", "onDocShotLoading()...");
        setVisibility(0);
        setViewVisibility(false);
        setBackgroundResource(R.color.bg_base);
        this.f15624g.playAnimation();
        this.f15623f.setBackgroundColor(getResources().getColor(R.color.space_kit_trans));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        BaseTitleBar baseTitleBar = (BaseTitleBar) findViewById(R.id.screen_shot_title);
        this.f15623f = baseTitleBar;
        baseTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotView$yhMbN1Ng_VVgfsx3nxSGv0x5oUs */

            public final void onClick(View view) {
                DocShotView.lambda$yhMbN1Ng_VVgfsx3nxSGv0x5oUs(DocShotView.this, view);
            }
        });
        this.f15623f.setDividerVisible(false);
        this.f15624g = (BearLottieView) findViewById(R.id.screen_shot_loading);
        this.f15619b = (SubsamplingScaleImageView) findViewById(R.id.screen_shot_bitmap);
        this.f15625h = findViewById(R.id.ll_bottom);
        this.f15629l = findViewById(R.id.screen_shot_title_divider);
        this.f15630m = findViewById(R.id.screen_shot_layout);
        this.f15621d = findViewById(R.id.loading_layout);
        this.f15626i = (ExternalShareView) findViewById(R.id.external_share_view);
        this.f15627j = findViewById(R.id.share_btn);
        this.f15628k = (TextView) findViewById(R.id.share_btn_text);
    }

    /* renamed from: a */
    private void m22341a(Context context) {
        this.f15622e = context;
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    public void setDocShotPresenter(AbstractC5500a aVar) {
        this.f15618a = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.DocShotView$a  reason: invalid class name */
    class animationAnimation$AnimationListenerC5496a implements Animation.AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        animationAnimation$AnimationListenerC5496a() {
        }
    }

    public DocShotView(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    /* renamed from: a */
    public void mo21961a(String str) {
        this.f15623f.setTitle(str);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    public void setActivity(Activity activity) {
        this.f15620c = StatusBarManager.m55628a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22342a(View view) {
        AbstractC5500a aVar = this.f15618a;
        if (aVar != null) {
            aVar.mo21952j();
            this.f15618a.mo21944b();
        }
    }

    /* renamed from: b */
    private void m22345b(String str) {
        IStatusBar aVar = this.f15620c;
        if (aVar != null) {
            aVar.mo50689b();
        }
        setVisibility(8);
        this.f15624g.cancelAnimation();
        this.f15621d.setVisibility(8);
        this.f15619b.setVisibility(8);
        this.f15625h.setVisibility(8);
        Toast.showFailureText(this.f15622e, str, 0);
    }

    private void setViewVisibility(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.f15621d;
        int i5 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        SubsamplingScaleImageView subsamplingScaleImageView = this.f15619b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        subsamplingScaleImageView.setVisibility(i2);
        View view2 = this.f15625h;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f15629l;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f15630m;
        if (z) {
            i5 = 0;
        }
        view4.setVisibility(i5);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    public void setSourceInfo(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(ShareType.ExportImage.name())) {
                this.f15626i.setVisibility(0);
                this.f15627j.setVisibility(8);
                return;
            }
            this.f15626i.setVisibility(8);
            this.f15627j.setVisibility(0);
            this.f15628k.setText(C10539a.m43639a(getContext(), R.string.Doc_Share_DownloadAndShare, "channelName", ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41770a(getContext(), ShareType.valueOf(str))));
            this.f15627j.setOnClickListener(new View.OnClickListener(str) {
                /* class com.bytedance.ee.bear.doc.screenshot.$$Lambda$DocShotView$UCLIyEoaD1wFYur2JJPafgfxrRc */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DocShotView.lambda$UCLIyEoaD1wFYur2JJPafgfxrRc(DocShotView.this, this.f$1, view);
                }
            });
        }
    }

    public DocShotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22341a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22344a(String str, View view) {
        AbstractC5500a aVar = this.f15618a;
        if (aVar != null) {
            aVar.mo21936a(ShareType.valueOf(str), true);
        }
    }

    /* renamed from: a */
    private void m22343a(File file, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            f = 1.0f;
        }
        this.f15619b.setEagerLoadingEnabled(false);
        this.f15619b.setMinScale(f);
        this.f15619b.setMaxScale(2.0f);
        this.f15619b.mo40690a(C10780b.m44665a(Uri.fromFile(file)), new ImageViewState(f, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0));
    }

    /* renamed from: a */
    public void mo21962a(boolean z, boolean z2) {
        this.f15626i.mo19154a(ShareType.Download, ShareState.SHOW);
        this.f15626i.mo19154a(ShareType.More, ShareState.SHOW);
        if (z2) {
            this.f15626i.mo19154a(ShareType.Lark, ShareState.SHOW);
        }
        if (z) {
            this.f15626i.mo19154a(ShareType.Wechat, ShareState.SHOW);
            this.f15626i.mo19154a(ShareType.WechatMoments, ShareState.SHOW);
            this.f15626i.mo19154a(ShareType.QQ, ShareState.SHOW);
            this.f15626i.mo19154a(ShareType.Weibo, ShareState.SHOW);
        }
        this.f15626i.setOnShareItemClickListener(new C4891e() {
            /* class com.bytedance.ee.bear.doc.screenshot.DocShotView.C54931 */

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: a */
            public void mo19175a() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21950h();
                }
            }

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: f */
            public void mo19178f() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21949g();
                }
            }

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: l */
            public void mo19184l() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21947e();
                }
            }

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: g */
            public void mo19179g() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21936a(ShareType.Wechat, false);
                }
            }

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: h */
            public void mo19180h() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21936a(ShareType.WechatMoments, false);
                }
            }

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: i */
            public void mo19181i() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21936a(ShareType.QQ, false);
                }
            }

            @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
            /* renamed from: j */
            public void mo19182j() {
                if (DocShotView.this.f15618a != null) {
                    DocShotView.this.f15618a.mo21936a(ShareType.Weibo, false);
                }
            }
        });
    }

    public DocShotView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    @Override // com.bytedance.ee.bear.doc.screenshot.AbstractC5518b
    /* renamed from: a */
    public void mo21960a(File file, float f, boolean z, boolean z2) {
        if (file != null) {
            C13479a.m54772d("ScreenShotView", "onDocShotSuccess()... success");
            setBackgroundResource(R.color.space_kit_trans);
            setViewVisibility(true);
            mo21962a(z, z2);
            this.f15624g.cancelAnimation();
            m22343a(file, f);
            this.f15623f.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
            this.f15623f.setLeftImageTint(R.color.facade_selector_icon_n1);
            this.f15623f.setBackgroundColor(getResources().getColor(R.color.bg_body));
            m22346e();
            return;
        }
        C13479a.m54772d("ScreenShotView", "onDocShotFail()... fail");
        mo21963b();
    }
}
