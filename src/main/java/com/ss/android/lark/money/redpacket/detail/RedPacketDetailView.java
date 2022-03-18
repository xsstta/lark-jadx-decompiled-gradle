package com.ss.android.lark.money.redpacket.detail;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2364a.p2365a.C48022a;
import com.ss.android.lark.money.p2366b.C48023a;
import com.ss.android.lark.money.p2367c.C48033a;
import com.ss.android.lark.money.redpacket.detail.C48106a;
import com.ss.android.lark.money.redpacket.dto.RedPacketDataWrapper;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetailItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.p2368a.C48034a;
import com.ss.android.lark.money.redpacket.p2368a.C48036c;
import com.ss.android.lark.money.redpacket.record.RedPacketRecordAdapter;
import com.ss.android.lark.money.redpacket.widget.DialogC48191a;
import com.ss.android.lark.money.statistics.RedPacketHitPoint;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashMap;
import java.util.List;

public class RedPacketDetailView implements C48106a.AbstractC48108b {

    /* renamed from: e */
    private static final int f121074e = UIHelper.dp2px(42.0f);

    /* renamed from: a */
    public boolean f121075a = true;

    /* renamed from: b */
    public RedPacketRecordAdapter f121076b;

    /* renamed from: c */
    public AbstractC48105b f121077c;

    /* renamed from: d */
    public C48106a.AbstractC48108b.AbstractC48109a f121078d;

    /* renamed from: f */
    private DialogC48191a f121079f;

    /* renamed from: g */
    private Context f121080g;

    /* renamed from: h */
    private String f121081h;

    /* renamed from: i */
    private IMoneyModuleDependency.IChatDependency f121082i;
    @BindView(7083)
    ImageView mCloseTitleIV;
    @BindView(6487)
    ViewGroup mCoverContentRoot;
    @BindView(7085)
    ImageView mDetailCoverIv;
    @BindView(7086)
    ImageView mDetailCoverMaskIv;
    @BindView(7087)
    ImageView mDialogAvatarIV;
    @BindView(6535)
    View mDialogBgView;
    @BindView(7084)
    ImageView mDialogBottomBgIV;
    @BindView(7088)
    TextView mDialogCheckDetailTV;
    @BindView(7100)
    LKUILottieAnimationView mDialogOpenAnimationLV;
    @BindView(7101)
    ImageView mDialogOpenIV;
    @BindView(7090)
    TextView mDialogOwnerTV;
    @BindView(6548)
    View mDialogRootView;
    @BindView(7091)
    TextView mDialogSubjectTV;
    @BindView(7111)
    ImageView mDialogTopBgIV;
    @BindView(7092)
    TextView mDialogTypeLabelTV;
    @BindView(7096)
    TextView mHistoryTV;
    @BindView(7103)
    RecyclerView mRecordRV;
    @BindView(7141)
    FrameLayout mRootView;
    @BindView(7109)
    RelativeLayout mTitleBarContentRootView;
    @BindView(7108)
    FrameLayout mTitleBarLayout;

    /* renamed from: com.ss.android.lark.money.redpacket.detail.RedPacketDetailView$b */
    public interface AbstractC48105b {
        /* renamed from: a */
        void mo168408a();

        /* renamed from: a */
        void mo168409a(RedPacketDetailView redPacketDetailView);

        /* renamed from: a */
        void mo168410a(String str);

        /* renamed from: a */
        void mo168411a(String str, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail);

        /* renamed from: b */
        void mo168412b();

        /* renamed from: c */
        void mo168413c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f121077c = null;
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: g */
    public void mo168428g() {
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168421a(List<RedPacketDetailItem> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.f121076b.addAll(list);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168422a(boolean z) {
        this.f121075a = z;
    }

    /* renamed from: l */
    private int m189897l() {
        return DeviceUtils.getStatusHeight(this.f121080g);
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: b */
    public void mo168423b() {
        this.f121079f.dismiss();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f121077c.mo168409a(this);
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: f */
    public void mo168427f() {
        this.mDialogOpenIV.setVisibility(0);
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: h */
    public void mo168429h() {
        this.f121077c.mo168408a();
    }

    /* renamed from: k */
    private void m189896k() {
        RedPacketDetailItem redPacketDetailItem = new RedPacketDetailItem();
        redPacketDetailItem.type = 2;
        this.f121076b.add(redPacketDetailItem);
    }

    /* renamed from: n */
    private Interpolator m189899n() {
        return PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f);
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: c */
    public void mo168424c() {
        LKUILottieAnimationView lKUILottieAnimationView = this.mDialogOpenAnimationLV;
        if (lKUILottieAnimationView != null) {
            lKUILottieAnimationView.cancelAnimation();
            this.mDialogOpenAnimationLV.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: d */
    public void mo168425d() {
        this.mDialogSubjectTV.setText(UIHelper.getString(R.string.Lark_Legacy_DialogTakeOverTips));
        this.mDialogOpenIV.setVisibility(8);
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: e */
    public void mo168426e() {
        this.mDialogSubjectTV.setText(UIHelper.getString(R.string.Lark_Legacy_PreviewHongbaoExpired));
        this.mDialogOpenIV.setVisibility(8);
    }

    /* renamed from: m */
    private void m189898m() {
        this.mDialogBgView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mDialogTopBgIV.getLayoutParams();
        layoutParams.removeRule(6);
        layoutParams.addRule(10);
        layoutParams.bottomMargin = -UIHelper.dp2px(100.0f);
        this.mDialogTopBgIV.setLayoutParams(layoutParams);
        this.mDialogTopBgIV.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mDialogBottomBgIV.setAlpha(BitmapDescriptorFactory.HUE_RED);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mDialogBottomBgIV.getLayoutParams();
        layoutParams2.removeRule(8);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = UIHelper.dp2px(122.0f) * -3;
        this.mDialogBottomBgIV.setLayoutParams(layoutParams2);
        this.mDialogOpenIV.setVisibility(8);
        this.mDialogOpenAnimationLV.cancelAnimation();
        this.mDialogOpenAnimationLV.setVisibility(8);
        this.mDialogSubjectTV.setVisibility(8);
        this.mDialogOwnerTV.setVisibility(8);
        this.mDialogAvatarIV.setVisibility(8);
        this.mDialogCheckDetailTV.setVisibility(8);
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168414a() {
        if (this.f121079f == null) {
            this.f121079f = new DialogC48191a(this.f121080g);
        }
        this.f121079f.show();
    }

    /* renamed from: i */
    public void mo168430i() {
        this.mDialogOpenIV.setVisibility(8);
        this.mDialogOpenAnimationLV.setVisibility(0);
        this.mDialogOpenAnimationLV.setImageAssetsFolder("red_packet/images/");
        this.mDialogOpenAnimationLV.setAnimation("red_packet/data.json");
        this.mDialogOpenAnimationLV.setRepeatCount(-1);
        this.mDialogOpenAnimationLV.playAnimation();
    }

    /* renamed from: j */
    public void mo168431j() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mRecordRV, "translationY", (((float) DeviceUtils.getScreenHeight(this.f121080g)) * 3.0f) / 4.0f, 0.0f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(m189899n());
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mRecordRV, "scaleX", 0.5f, 1.0f);
        ofFloat2.setDuration(450L);
        ofFloat2.setInterpolator(m189899n());
        ofFloat2.start();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.mRecordRV, "scaleY", 0.5f, 1.0f);
        ofFloat3.setDuration(450L);
        ofFloat3.setInterpolator(m189899n());
        ofFloat3.start();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.mRecordRV, "alpha", 0.5f, 1.0f);
        ofFloat4.setDuration(450L);
        ofFloat4.setInterpolator(m189899n());
        ofFloat4.start();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.mTitleBarLayout, "translationY", -300.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat5.setDuration(450L);
        ofFloat5.setInterpolator(m189899n());
        ofFloat5.start();
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.mTitleBarLayout, "alpha", 0.5f, 1.0f);
        ofFloat6.setDuration(450L);
        ofFloat6.setInterpolator(m189899n());
        ofFloat6.start();
    }

    /* renamed from: a */
    public void setViewDelegate(C48106a.AbstractC48108b.AbstractC48109a aVar) {
        this.f121078d = aVar;
    }

    /* renamed from: com.ss.android.lark.money.redpacket.detail.RedPacketDetailView$a */
    private class C48104a implements Transition.TransitionListener {
        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }

        private C48104a() {
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168418a(String str) {
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f121080g, str);
        }
    }

    /* renamed from: b */
    private void m189888b(String str) {
        RedPacketDetailItem redPacketDetailItem = new RedPacketDetailItem();
        redPacketDetailItem.type = 1;
        redPacketDetailItem.recordDetail = str;
        this.f121076b.add(0, redPacketDetailItem);
    }

    /* renamed from: c */
    private void m189889c(final RedPacketInfo redPacketInfo) {
        this.mDialogRootView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.View$OnClickListenerC480993 */

            public void onClick(View view) {
                RedPacketDetailView.this.f121077c.mo168408a();
            }
        });
        this.mDialogOpenIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.View$OnClickListenerC481004 */

            public void onClick(View view) {
                RedPacketDetailView.this.mo168430i();
                RedPacketDetailView.this.mo168422a(false);
                RedPacketHitPoint.m190215a(redPacketInfo.redPacketId);
                RedPacketDetailView.this.f121078d.mo168451c();
            }
        });
    }

    /* renamed from: b */
    private void m189885b(RedPacketInfo redPacketInfo) {
        this.f121081h = "dialog";
        this.mDialogRootView.setVisibility(0);
        this.mDialogBgView.setVisibility(0);
        this.mRecordRV.setVisibility(8);
        this.mTitleBarLayout.setVisibility(8);
        this.mDialogSubjectTV.setText(redPacketInfo.subject);
        m189890d(redPacketInfo);
        m189894h(redPacketInfo);
        m189893g(redPacketInfo);
        m189891e(redPacketInfo);
        m189892f(redPacketInfo);
        m189889c(redPacketInfo);
    }

    /* renamed from: d */
    private void m189890d(RedPacketInfo redPacketInfo) {
        IMoneyModuleDependency.IImageDependency imageDependency = MoneyModule.getDependency().getImageDependency();
        if (redPacketInfo.chatter != null) {
            imageDependency.loadAvatarImage(this.f121080g, redPacketInfo.chatter.getAvatarKey(), redPacketInfo.chatter.getId(), this.mDialogAvatarIV, SmEvents.EVENT_NW, SmEvents.EVENT_NW);
        }
        this.mDialogTypeLabelTV.setText(this.f121082i.getDisplayNameByName(redPacketInfo.chatter));
    }

    /* renamed from: e */
    private void m189891e(RedPacketInfo redPacketInfo) {
        if (redPacketInfo.isExpired) {
            this.mDialogOpenIV.setVisibility(8);
            this.mDialogSubjectTV.setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoExpired));
        } else if (redPacketInfo.totalNum == redPacketInfo.grabNum) {
            this.mDialogOpenIV.setVisibility(8);
            this.mDialogSubjectTV.setText(UIHelper.getString(R.string.Lark_Legacy_HongbaoNoneLeft));
        } else {
            this.mDialogOpenIV.setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m189892f(RedPacketInfo redPacketInfo) {
        if (redPacketInfo.cover == null || redPacketInfo.cover.getMainCover() == null) {
            this.mDialogTopBgIV.setImageResource(R.drawable.default_cover);
        } else {
            ImageLoader.with(this.f121080g).load(redPacketInfo.cover.getMainCover()).placeholder(R.drawable.default_cover).dontAnimate(false).into(this.mDialogTopBgIV);
        }
    }

    /* renamed from: h */
    private void m189894h(RedPacketInfo redPacketInfo) {
        if (redPacketInfo.type == RedPacketContent.Type.GROUP_RANDOM) {
            this.mDialogTypeLabelTV.append(UIHelper.getString(R.string.Lark_Legacy_PreviewHongbaoSendARandomHongbao));
        } else if (redPacketInfo.type == RedPacketContent.Type.P2P) {
            this.mDialogTypeLabelTV.append(UIHelper.getString(R.string.Lark_Legacy_PreviewHongbaoSendAHongbaoToYou));
        } else {
            this.mDialogTypeLabelTV.append(UIHelper.getString(R.string.Lark_Legacy_PreviewHongbaoSendAHongbaoToYou));
        }
    }

    /* renamed from: i */
    private void m189895i(RedPacketInfo redPacketInfo) {
        this.mRecordRV.setLayoutManager(new LinearLayoutManager(this.f121080g));
        ((SimpleItemAnimator) this.mRecordRV.getItemAnimator()).setSupportsChangeAnimations(false);
        RedPacketRecordAdapter aVar = new RedPacketRecordAdapter(this.f121077c);
        this.f121076b = aVar;
        this.mRecordRV.setAdapter(aVar);
        this.f121076b.mo168573a(redPacketInfo);
        this.f121076b.mo168574a(redPacketInfo.luckyUserId);
        this.mRecordRV.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.C481037 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                if (i2 >= RedPacketDetailView.this.f121076b.getItemCount() - 3 && RedPacketDetailView.this.f121078d.mo168449a()) {
                    RedPacketDetailView.this.f121078d.mo168450b();
                }
            }
        });
    }

    /* renamed from: g */
    private void m189893g(RedPacketInfo redPacketInfo) {
        boolean z;
        boolean z2 = true;
        if (redPacketInfo.type == RedPacketContent.Type.P2P) {
            z = true;
        } else {
            z = false;
        }
        if (redPacketInfo.type != RedPacketContent.Type.COMMERCIAL) {
            z2 = false;
        }
        if (z || z2) {
            this.mDialogCheckDetailTV.setVisibility(8);
            this.mDialogCheckDetailTV.setCompoundDrawables(null, null, null, null);
            return;
        }
        this.mDialogCheckDetailTV.setVisibility(0);
        this.mDialogCheckDetailTV.setText(UIHelper.getString(R.string.Lark_Legacy_PreviewHongbaoViewDetails));
        this.mDialogCheckDetailTV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.C481015 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (RedPacketDetailView.this.f121075a) {
                    RedPacketDetailView.this.f121078d.mo168452d();
                }
            }
        });
    }

    /* renamed from: a */
    private void m189882a(RedPacketInfo redPacketInfo) {
        boolean z;
        int i;
        this.mTitleBarLayout.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTitleBarContentRootView.getLayoutParams();
        layoutParams.topMargin = m189897l();
        this.mTitleBarContentRootView.setLayoutParams(layoutParams);
        this.mCloseTitleIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.View$OnClickListenerC480971 */

            public void onClick(View view) {
                RedPacketDetailView.this.f121077c.mo168408a();
            }
        });
        this.mHistoryTV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.C480982 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                RedPacketDetailView.this.f121077c.mo168413c();
            }
        });
        if (redPacketInfo.type == RedPacketContent.Type.COMMERCIAL) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = this.mHistoryTV;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        if (redPacketInfo.cover == null || redPacketInfo.cover.getHeadCover() == null) {
            this.mDetailCoverMaskIv.setVisibility(8);
            this.mDetailCoverIv.setImageResource(R.drawable.default_cover_header_bg);
            ViewGroup.LayoutParams layoutParams2 = this.mCoverContentRoot.getLayoutParams();
            layoutParams2.height = UIHelper.dp2px(140.0f);
            this.mCoverContentRoot.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.mDetailCoverIv.getLayoutParams();
            layoutParams3.height = UIHelper.dp2px(120.0f);
            this.mDetailCoverIv.setLayoutParams(layoutParams3);
            this.mRecordRV.setPaddingRelative(0, UIHelper.dp2px(120.0f), 0, 0);
            return;
        }
        this.mDetailCoverMaskIv.setVisibility(0);
        ImageLoader.with(this.f121080g).load(redPacketInfo.cover.getHeadCover()).placeholder(R.drawable.default_cover_header_bg).into(this.mDetailCoverIv);
        this.mDialogTypeLabelTV.setShadowLayer(4.0f, BitmapDescriptorFactory.HUE_RED, 2.0f, UDColorUtils.getColor(this.f121080g, R.color.static_black_20));
        this.mDialogSubjectTV.setShadowLayer(4.0f, BitmapDescriptorFactory.HUE_RED, 2.0f, UDColorUtils.getColor(this.f121080g, R.color.static_black_20));
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168416a(RedPacketDataWrapper redPacketDataWrapper) {
        List<RedPacketDetailItem> list;
        if (!TextUtils.isEmpty(redPacketDataWrapper.info.luckyUserId)) {
            this.f121076b.mo168574a(redPacketDataWrapper.info.luckyUserId);
        }
        if (redPacketDataWrapper.detail == null) {
            list = null;
        } else {
            list = redPacketDataWrapper.detail.detailList;
        }
        m189886b(redPacketDataWrapper.info, list);
    }

    /* renamed from: b */
    private void m189886b(RedPacketInfo redPacketInfo, List<RedPacketDetailItem> list) {
        TransitionSet duration = new AutoTransition().setOrdering(0).setDuration(450L);
        duration.addTransition(new C48036c(1.0f, 2.0f).addTarget(this.mDialogTopBgIV).addTarget(this.mDialogBottomBgIV));
        duration.addTransition(new C48034a().addTarget(this.mDialogTopBgIV).addTarget(this.mDialogBottomBgIV));
        duration.setInterpolator((TimeInterpolator) m189899n());
        duration.addListener((Transition.TransitionListener) new C48104a() {
            /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.C481026 */

            @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.C48104a
            public void onTransitionStart(Transition transition) {
                RedPacketDetailView.this.mo168431j();
            }

            @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.C48104a
            public void onTransitionEnd(Transition transition) {
                RedPacketDetailView.this.mDialogRootView.setVisibility(8);
            }
        });
        TransitionManager.beginDelayedTransition(this.mRootView, duration);
        m189898m();
        m189883a(redPacketInfo, list, true);
        if (redPacketInfo.type != RedPacketContent.Type.P2P) {
            mo168421a(list);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168417a(RedPacketInfo redPacketInfo, List<RedPacketDetailItem> list) {
        StatusBarUtil.setTransparent((Activity) this.f121080g);
        m189895i(redPacketInfo);
        if (this.f121081h.equals("dialog")) {
            m189885b(redPacketInfo);
            return;
        }
        m189883a(redPacketInfo, list, false);
        if (redPacketInfo.type != RedPacketContent.Type.P2P) {
            mo168421a(list);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168419a(String str, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail) {
        this.f121077c.mo168411a(str, redPacketInfo, redPacketDetail);
    }

    public RedPacketDetailView(Context context, AbstractC48105b bVar, String str) {
        this.f121080g = context;
        this.f121077c = bVar;
        this.f121081h = str;
        this.f121082i = MoneyModule.getDependency().getChatDependency();
    }

    /* renamed from: a */
    private void m189883a(RedPacketInfo redPacketInfo, List<RedPacketDetailItem> list, boolean z) {
        boolean z2;
        boolean z3;
        this.f121081h = "activity";
        this.f121077c.mo168410a("activity");
        boolean z4 = true;
        if (redPacketInfo.grabAmount != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!redPacketInfo.isFromMe || redPacketInfo.type != RedPacketContent.Type.P2P) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (redPacketInfo.type == RedPacketContent.Type.P2P || redPacketInfo.type == RedPacketContent.Type.COMMERCIAL) {
            z4 = false;
        }
        m189884a(redPacketInfo, z2, z3, z);
        m189887b(redPacketInfo, list, z4);
    }

    /* renamed from: b */
    private void m189887b(RedPacketInfo redPacketInfo, List<RedPacketDetailItem> list, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("grab_number", Integer.toString(redPacketInfo.grabNum));
        hashMap.put("total_number", Integer.toString(redPacketInfo.totalNum));
        hashMap.put("total_grab_amount", C48033a.m189577a(((double) redPacketInfo.totalGrabAmount) * 0.01d));
        hashMap.put("total_amount", C48033a.m189577a(((double) redPacketInfo.totalAmount) * 0.01d));
        m189888b(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_HongbaoOpenResultProgress, hashMap));
        if (CollectionUtils.isEmpty(list) && redPacketInfo.grabNum != 0 && z) {
            m189896k();
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48108b
    /* renamed from: a */
    public void mo168420a(String str, boolean z, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            if (str2.startsWith("sslocal://lynxview") || str2.startsWith("sslocal://lynx_page") || str2.startsWith("sslocal://lynxview_page") || str2.startsWith("lark://lynxview") || str2.startsWith("lark://lynx_page") || str2.startsWith("lark://lynxview_page") || str2.contains("//remote_debug_lynx")) {
                C48023a.m189561a().mo168195a(this.f121080g, str2);
            } else {
                C48022a.m189559a(this.f121080g, str, z, str2);
            }
        }
    }

    /* renamed from: a */
    private void m189884a(RedPacketInfo redPacketInfo, boolean z, boolean z2, boolean z3) {
        this.mDialogBgView.setVisibility(8);
        this.mRecordRV.setVisibility(0);
        m189882a(redPacketInfo);
        if (!z3) {
            this.mDialogRootView.setVisibility(8);
        }
    }
}
