package com.ss.android.lark.feed.app.view.title;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.CompatDrawableTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.guide.C37609c;
import com.ss.android.lark.feed.app.statistics.p1866a.C37817a;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FeedListTitle extends LinearLayout implements AbstractC38026b {

    /* renamed from: a */
    public static final float f97612a;

    /* renamed from: b */
    AbstractC38019a f97613b;

    /* renamed from: c */
    float f97614c;

    /* renamed from: d */
    public Animator f97615d;

    /* renamed from: e */
    public C36592a f97616e;

    /* renamed from: f */
    private int f97617f;

    /* renamed from: g */
    private boolean f97618g = true;
    @BindView(6156)
    ImageView mAvatar;
    @BindView(6157)
    View mAvatarClickWrapper;
    @BindView(6196)
    ImageView mBottomTip;
    @BindView(6416)
    AppCompatImageView mFilterBT;
    @BindView(7090)
    CompatDrawableTextView mFilterDesc;
    @BindView(6527)
    LabelView mLabel;
    @BindView(6529)
    View mLabelClickWrapper;
    @BindView(6677)
    AppCompatImageView mMoreBT;
    @BindView(6819)
    ImageView mRewardTip;
    @BindView(6876)
    TextView mSearchBT;
    @BindView(6881)
    AppCompatImageView mSearchDesktop;
    @BindView(6884)
    FrameLayout mSearchLayout;
    @BindView(7011)
    TextView mTenantDesc;
    @BindView(7064)
    View mTitleLayout;
    @BindView(7143)
    ImageView mUpdateTip;

    @Retention(RetentionPolicy.SOURCE)
    public @interface STATUS {
    }

    /* renamed from: com.ss.android.lark.feed.app.view.title.FeedListTitle$a */
    public interface AbstractC38019a {
        /* renamed from: a */
        void mo137048a();

        /* renamed from: a */
        void mo137049a(View view);

        /* renamed from: b */
        void mo137050b();

        /* renamed from: c */
        void mo137051c();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139097a(View view) {
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public ITitleInfo getTitleInfo() {
        return null;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public int getOriginSearchLayoutHeight() {
        return (int) this.f97614c;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: c */
    public boolean mo139103c() {
        return this.f97618g;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: d */
    public void mo139104d() {
        this.mLabel.mo139144a();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public float getAlpha() {
        return super.getAlpha();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public int getCurrentHeight() {
        return getHeight();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public int getTitleHeight() {
        return this.mTitleLayout.getMeasuredHeight();
    }

    /* renamed from: b */
    public void mo139100b() {
        C36592a aVar = this.f97616e;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: e */
    public void mo139105e() {
        this.f97617f |= 2;
        m149479o();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: f */
    public void mo139106f() {
        this.f97617f |= 4;
        m149479o();
    }

    /* renamed from: g */
    public void mo139107g() {
        if (m149480p()) {
            mo139114h();
        } else {
            mo139115i();
        }
    }

    /* renamed from: h */
    public void mo139114h() {
        this.f97617f |= 1;
        m149479o();
    }

    /* renamed from: i */
    public void mo139115i() {
        this.f97617f &= -2;
        m149479o();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: j */
    public void mo139116j() {
        this.f97617f &= -5;
        m149479o();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: k */
    public void mo139117k() {
        this.f97617f &= -3;
        m149479o();
    }

    static {
        float f;
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            f = 48.0f;
        } else {
            f = 93.5f;
        }
        f97612a = f;
    }

    /* renamed from: n */
    private void m149478n() {
        this.f97614c = getContext().getResources().getDimension(R.dimen.feed_title_search_height);
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public Bitmap getTitleLayoutBitmap() {
        this.mAvatar.invalidate();
        Bitmap a = C57820d.m224432a(this.mTitleLayout);
        if (a != null) {
            return C57820d.m224429a(a, (int) ParticipantRepo.f117150c);
        }
        C53241h.m205894a("FeedListTitle", "getTitleLayoutBitmap failed: bitmap is null");
        return null;
    }

    /* renamed from: o */
    private void m149479o() {
        this.mUpdateTip.setVisibility(8);
        this.mBottomTip.setVisibility(8);
        this.mRewardTip.setVisibility(8);
        int i = this.f97617f;
        if ((i & 4) == 4) {
            this.mBottomTip.setVisibility(0);
        } else if ((i & 2) == 2) {
            this.mUpdateTip.setVisibility(0);
        } else if ((i & 1) == 1) {
            this.mRewardTip.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo139095a() {
        int i;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (DesktopUtil.m144301a(getContext())) {
            i = R.layout.activity_feed_title_desktop;
        } else {
            i = R.layout.activity_feed_title;
        }
        ButterKnife.bind(from.inflate(i, (ViewGroup) this, true));
        m149478n();
        m149476l();
        AppCompatImageView appCompatImageView = this.mMoreBT;
        if (appCompatImageView != null) {
            appCompatImageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.View$OnAttachStateChangeListenerC380101 */

                public void onViewDetachedFromWindow(View view) {
                }

                public void onViewAttachedToWindow(View view) {
                    C37609c.m147867a("more_btn_old", FeedListTitle.this.mMoreBT);
                }
            });
        }
        mo139107g();
    }

    /* renamed from: l */
    private void m149476l() {
        View$OnClickListenerC380112 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.View$OnClickListenerC380112 */

            public void onClick(View view) {
                if (!C57744a.m224104a().getBoolean("key_param_activity_avatar_hide", false)) {
                    C57744a.m224104a().putBoolean("key_param_activity_avatar_hide", true);
                    C37817a.m148837b();
                    FeedListTitle.this.mo139115i();
                }
                if (FeedListTitle.this.f97613b != null) {
                    FeedListTitle.this.f97613b.mo137051c();
                }
            }
        };
        this.mAvatar.setOnClickListener(r0);
        this.mAvatarClickWrapper.setOnClickListener(r0);
        View$OnClickListenerC380123 r02 = new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.View$OnClickListenerC380123 */

            public void onClick(View view) {
                FeedListTitle.this.mo139100b();
            }
        };
        this.mLabel.setOnClickListener(r02);
        this.mLabelClickWrapper.setOnClickListener(r02);
        View view = this.mSearchDesktop;
        if (view == null) {
            view = this.mSearchBT;
        }
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.View$OnClickListenerC380134 */

            public void onClick(View view) {
                FeedListTitle.this.mo139100b();
                if (FeedListTitle.this.f97613b != null) {
                    FeedListTitle.this.f97613b.mo137048a();
                }
            }
        });
        this.mMoreBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.C380145 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FeedListTitle.this.mo139100b();
                if (FeedListTitle.this.f97613b != null) {
                    FeedListTitle.this.f97613b.mo137050b();
                }
            }
        });
        m149477m();
        this.mAvatar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.ViewTreeObserver$OnGlobalLayoutListenerC380156 */

            public void onGlobalLayout() {
                if (FeedListTitle.this.mAvatar.getMeasuredWidth() > 0 && FeedListTitle.this.mAvatar.getMeasuredHeight() > 0 && FeedListTitle.this.f97613b != null) {
                    FeedListTitle.this.f97613b.mo137049a(FeedListTitle.this.mAvatar);
                }
                FeedListTitle.this.mAvatar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    /* renamed from: m */
    private void m149477m() {
        if (DesktopUtil.m144301a(getContext())) {
            this.f97616e = new C36592a.C36593a().mo135003a(getContext());
            AppCompatImageView appCompatImageView = this.mSearchDesktop;
            if (appCompatImageView != null) {
                m149475a(appCompatImageView, getContext().getString(R.string.Lark_Legacy_Search));
            }
            m149475a(this.mFilterBT, getContext().getString(getResources().getIdentifier("Lark_Search_DocTypeFilter", "string", getContext().getPackageName())));
            m149475a(this.mMoreBT, getContext().getString(getResources().getIdentifier("Lark_Legacy_MoreTipLabel", "string", getContext().getPackageName())));
        }
    }

    /* renamed from: p */
    private boolean m149480p() {
        boolean a = C37262a.m146726a().mo139198q().mo139256a("activity.award.enable");
        boolean a2 = C37262a.m146726a().mo139198q().mo139256a("invite.member.award.enable");
        boolean a3 = C37262a.m146726a().mo139198q().mo139256a("invite.external.award.enable");
        boolean z = C57744a.m224104a().getBoolean("key_param_activity_avatar_hide", false);
        C53241h.m205898b("FeedListTitle", " fg-> " + a + " " + a2 + " " + a3 + " " + z);
        if (z) {
            return false;
        }
        if (a || a2 || a3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    public void setOnTitleClickListener(AbstractC38019a aVar) {
        this.f97613b = aVar;
    }

    /* renamed from: b */
    public void mo139101b(int i) {
        this.mFilterBT.setVisibility(i);
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: c */
    public void mo139102c(int i) {
        this.mLabel.mo139145a(i);
    }

    public FeedListTitle(Context context) {
        super(context);
        mo139095a();
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public int mo139094a(FeedCard.FeedType feedType) {
        return C57582a.m223601a(getContext(), f97612a);
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139096a(int i) {
        float f = this.f97614c;
        if (((float) i) > f) {
            i = (int) f;
        } else if (i < 0) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = this.mSearchLayout.getLayoutParams();
        if (layoutParams.height != i && !DesktopUtil.m144301a(getContext())) {
            layoutParams.height = i;
            this.mSearchLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139098a(C38020b bVar) {
        C37268c.m146766b().mo139205x().mo139262a(getContext(), bVar.f97631b, bVar.f97630a, this.mAvatar, 30, 30);
        if (!TextUtils.isEmpty(bVar.f97632c) || DesktopUtil.m144301a(getContext())) {
            this.mTenantDesc.setVisibility(0);
            this.mTenantDesc.setText(bVar.f97632c);
            this.mLabel.setTextSizeMode(1);
            return;
        }
        this.mTenantDesc.setVisibility(8);
        this.mLabel.setTextSizeMode(0);
    }

    @Override // com.ss.android.lark.feed.app.view.title.AbstractC38026b
    /* renamed from: a */
    public void mo139099a(boolean z) {
        if (z != this.f97618g) {
            Animator animator = this.f97615d;
            if (animator != null) {
                animator.cancel();
            }
            this.f97618g = z;
            if (z) {
                setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
                this.f97615d = duration;
                duration.start();
                this.f97615d.addListener(new Animator.AnimatorListener() {
                    /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.C380178 */

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationCancel(Animator animator) {
                        FeedListTitle.this.f97615d = null;
                    }

                    public void onAnimationEnd(Animator animator) {
                        FeedListTitle.this.f97615d = null;
                    }

                    public void onAnimationStart(Animator animator) {
                        FeedListTitle.this.setVisibility(0);
                    }
                });
                return;
            }
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
            this.f97615d = duration2;
            duration2.start();
            this.f97615d.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.C380189 */

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationCancel(Animator animator) {
                    FeedListTitle.this.f97615d = null;
                }

                public void onAnimationEnd(Animator animator) {
                    FeedListTitle.this.setVisibility(8);
                    FeedListTitle.this.f97615d = null;
                }
            });
        }
    }

    /* renamed from: a */
    private void m149475a(final View view, final String str) {
        view.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.feed.app.view.title.FeedListTitle.View$OnHoverListenerC380167 */

            public boolean onHover(View view, MotionEvent motionEvent) {
                if (FeedListTitle.this.f97616e == null) {
                    return false;
                }
                if (motionEvent.getAction() == 9) {
                    FeedListTitle.this.f97616e.dismiss();
                    FeedListTitle.this.f97616e.mo134999a(str);
                    FeedListTitle.this.f97616e.mo134995a(view.getId());
                    FeedListTitle.this.f97616e.mo135001b(view, 1, 5);
                } else if (motionEvent.getAction() == 10 && FeedListTitle.this.f97616e.mo134994a() == view.getId()) {
                    FeedListTitle.this.f97616e.dismiss();
                }
                return false;
            }
        });
    }

    public FeedListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo139095a();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.title.FeedListTitle$b */
    public static class C38020b {

        /* renamed from: a */
        public String f97630a;

        /* renamed from: b */
        public String f97631b;

        /* renamed from: c */
        public String f97632c;

        public C38020b(String str, String str2, String str3) {
            this.f97630a = str;
            this.f97631b = str2;
            this.f97632c = str3;
        }
    }

    public FeedListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo139095a();
    }
}
