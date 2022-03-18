package com.ss.android.lark.main.app.drawer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.drawer.C44232c;
import com.ss.android.lark.main.app.drawer.adapter.AbstractC44213a;
import com.ss.android.lark.main.app.drawer.adapter.C44216b;
import com.ss.android.lark.main.app.drawer.adapter.C44218c;
import com.ss.android.lark.main.app.drawer.adapter.C44222d;
import com.ss.android.lark.main.guide.TenantSwitchGuideAgent;
import com.ss.android.lark.main.p2231a.AbstractC44176b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.ui.C57605g;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FeedDrawerView implements C44232c.AbstractC44235b {

    /* renamed from: a */
    public final Context f112142a;

    /* renamed from: b */
    public C44232c.AbstractC44235b.AbstractC44236a f112143b;

    /* renamed from: c */
    public final AbstractC44206a f112144c;

    /* renamed from: d */
    public C44218c f112145d;

    /* renamed from: e */
    public GuideDelegate f112146e;

    /* renamed from: f */
    private C44222d f112147f;

    /* renamed from: g */
    private C44216b f112148g;

    /* renamed from: h */
    private final FragmentManager f112149h;

    /* renamed from: i */
    private volatile boolean f112150i;

    /* renamed from: j */
    private Fragment f112151j;
    @BindView(6667)
    public SelectableRoundedImageView joinTeamSRIV;

    /* renamed from: k */
    private C57605g f112152k;

    /* renamed from: l */
    private CountDownTimer f112153l = new CountDownTimer(3000, 3000) {
        /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.CountDownTimerC441931 */

        public void onTick(long j) {
        }

        public void onFinish() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.CountDownTimerC441931.RunnableC441941 */

                public void run() {
                    if (FeedDrawerView.this.f112146e != null && FeedDrawerView.this.f112146e.mo141658a()) {
                        FeedDrawerView.this.f112146e.mo141659b();
                    }
                }
            });
        }
    };
    @BindView(6913)
    public FrameLayout mContainer;
    @BindView(6836)
    public FrameLayout mCurItemContainer;
    @BindView(6780)
    public ConstraintLayout mJoinTeamCL;
    @BindView(7876)
    public TextView mJoinTeamTV;
    @BindView(7774)
    public CommonRecyclerView mTenantRV;

    /* renamed from: com.ss.android.lark.main.app.drawer.FeedDrawerView$a */
    public interface AbstractC44206a {
        /* renamed from: a */
        void mo157187a();

        /* renamed from: a */
        void mo157188a(C44232c.AbstractC44235b bVar);

        /* renamed from: a */
        void mo157189a(TenantInfo tenantInfo);

        /* renamed from: a */
        void mo157190a(boolean z);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: c */
    public void mo157200c() {
        m175340h();
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: d */
    public void mo157201d() {
        if (this.f112151j != null) {
            this.f112150i = true;
        }
    }

    /* renamed from: g */
    private void m175339g() {
        mo157199b();
        this.mJoinTeamCL.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C442049 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MainHitPoint.f112172b.mo157221b();
                MainHitPoint.f112172b.mo157222c();
                FeedDrawerView.this.f112143b.mo157257a(FeedDrawerView.this.f112142a, "mine", new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C442049.C442051 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("FeedDrawerView", "Failed to open join team page!");
                    }

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        if (bool.booleanValue()) {
                            FeedDrawerView.this.mo157191a();
                        }
                    }
                });
            }
        });
    }

    /* renamed from: k */
    private void m175343k() {
        this.mTenantRV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.ViewTreeObserver$OnGlobalLayoutListenerC441963 */

            public void onGlobalLayout() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.ViewTreeObserver$OnGlobalLayoutListenerC441963.RunnableC441971 */

                    public void run() {
                        boolean z;
                        if (FeedDrawerView.this.f112143b != null) {
                            C44232c.AbstractC44235b.AbstractC44236a aVar = FeedDrawerView.this.f112143b;
                            if (FeedDrawerView.this.f112145d.getItemCount() >= 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar.mo157258a(z);
                        }
                    }
                });
                FeedDrawerView.this.mTenantRV.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    /* renamed from: a */
    public void mo157191a() {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.AnonymousClass12 */

            public void run() {
                if (FeedDrawerView.this.f112144c != null) {
                    FeedDrawerView.this.f112144c.mo157190a(false);
                }
            }
        }, 800);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f112144c.mo157188a(this);
        m175338f();
        m175342j();
        m175339g();
    }

    /* renamed from: h */
    private void m175340h() {
        ((ConstraintLayout.LayoutParams) this.mContainer.getLayoutParams()).width = UIHelper.dp2px((float) m175341i());
    }

    /* renamed from: i */
    private int m175341i() {
        int screenDensity = (((int) (((float) this.f112142a.getResources().getDisplayMetrics().widthPixels) / DeviceUtils.getScreenDensity(this.f112142a))) - 65) - 96;
        if (screenDensity > 259) {
            return 259;
        }
        return screenDensity;
    }

    /* renamed from: j */
    private void m175342j() {
        FragmentTransaction beginTransaction = this.f112149h.beginTransaction();
        this.f112151j = C44134a.m174959a().mo133250f().mo133309a();
        m175340h();
        beginTransaction.add(R.id.drawer_fragment_container, this.f112151j);
        beginTransaction.commitAllowingStateLoss();
        C44134a.m174959a().mo133250f().mo133315a(this.f112151j, new AbstractC44176b() {
            /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C441952 */

            @Override // com.ss.android.lark.main.p2231a.AbstractC44176b
            /* renamed from: a */
            public void mo157139a() {
                if (FeedDrawerView.this.f112144c != null) {
                    FeedDrawerView.this.f112144c.mo157190a(false);
                }
            }
        });
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: b */
    public void mo157199b() {
        if (DesktopUtil.m144301a(this.f112142a) || !C44134a.m174959a().mo133248e().mo133307a() || this.f112143b.mo157260c()) {
            UIUtils.hide(this.mJoinTeamCL);
            Log.m165389i("FeedDrawerView", "hide the join-team button");
            return;
        }
        UIUtils.show(this.mJoinTeamCL);
        Log.m165389i("FeedDrawerView", "show the join-team button");
        this.mJoinTeamTV.setText(UIHelper.getString(R.string.Lark_Accounts_NavigationBarPlusButtonTitle));
    }

    /* renamed from: f */
    private void m175338f() {
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(this.f112142a, 1, false);
        ((SimpleItemAnimator) this.mTenantRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mTenantRV.setLayoutManager(stableLinearLayoutManager);
        if (this.f112147f == null) {
            C44222d dVar = new C44222d(this.f112142a);
            this.f112147f = dVar;
            dVar.mo157241a(new AbstractC44213a.AbstractC44214a<TenantInfo>() {
                /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C441995 */

                /* renamed from: a */
                public void mo157212a(TenantInfo tenantInfo) {
                    Activity activity;
                    if (FeedDrawerView.this.f112144c != null) {
                        if (FeedDrawerView.this.f112142a == null || !(FeedDrawerView.this.f112142a instanceof Activity)) {
                            activity = null;
                        } else {
                            activity = (Activity) FeedDrawerView.this.f112142a;
                        }
                        C44134a.m174959a().mo133210a(activity, tenantInfo.getBadgeCount());
                        FeedDrawerView.this.mo157195a(tenantInfo);
                        MainHitPoint.f112172b.mo157219a(tenantInfo.getUserId());
                        FeedDrawerView.this.f112144c.mo157189a(tenantInfo);
                        FeedDrawerView.this.f112144c.mo157190a(true);
                    }
                }
            });
            this.f112147f.mo157239a(5);
            this.f112147f.mo157242a(new AbstractC44213a.AbstractC44215b() {
                /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C442006 */

                @Override // com.ss.android.lark.main.app.drawer.adapter.AbstractC44213a.AbstractC44215b
                /* renamed from: a */
                public void mo157213a(View view) {
                    if (FeedDrawerView.this.f112144c != null) {
                        FeedDrawerView.this.f112144c.mo157187a();
                    }
                }
            });
        }
        if (this.f112148g == null) {
            C44216b bVar = new C44216b(this.f112142a);
            this.f112148g = bVar;
            bVar.mo157241a(new AbstractC44213a.AbstractC44214a<TenantInfo.PendingUser>() {
                /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C442017 */

                /* renamed from: a */
                public void mo157212a(TenantInfo.PendingUser pendingUser) {
                    Log.m165389i("FeedDrawerView", "pendingUser item click. tenantId=" + pendingUser.tenantId);
                    new C25639g(FeedDrawerView.this.f112142a).mo89248g(R.string.Lark_Login_WaitApproveTitle).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Login_WaitApproveDescription, "tenantName", pendingUser.tenantName)).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Login_GotIt, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C442017.DialogInterface$OnClickListenerC442021 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).mo89233b().show();
                }
            });
            this.f112148g.mo157239a(5);
        }
        C44218c cVar = new C44218c();
        this.f112145d = cVar;
        cVar.mo157246a(this.f112147f);
        this.f112145d.mo157246a(this.f112148g);
        this.mTenantRV.setAdapter(this.f112145d);
        this.mTenantRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.C442038 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (FeedDrawerView.this.mTenantRV.getTranslationY() < BitmapDescriptorFactory.HUE_RED) {
                    FeedDrawerView.this.mCurItemContainer.setVisibility(0);
                } else {
                    FeedDrawerView.this.mCurItemContainer.setVisibility(8);
                }
            }
        });
        this.mTenantRV.setMonitorFps(false);
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: e */
    public void mo157202e() {
        if (!TenantSwitchGuideAgent.f112846a.mo157927a()) {
            C57605g gVar = this.f112152k;
            if ((gVar == null || !gVar.mo195588b()) && (this.mTenantRV.getLayoutManager() instanceof LinearLayoutManager) && this.mTenantRV.getWidth() != 0 && this.mTenantRV.getHeight() != 0 && this.mTenantRV.getLayoutManager().getItemCount() > 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mTenantRV.getLayoutManager();
                View findViewByPosition = linearLayoutManager.findViewByPosition(0);
                View findViewByPosition2 = this.mTenantRV.getLayoutManager().findViewByPosition(linearLayoutManager.findLastVisibleItemPosition());
                if (findViewByPosition != null && findViewByPosition2 != null) {
                    int[] iArr = new int[2];
                    findViewByPosition.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    findViewByPosition2.getLocationInWindow(iArr2);
                    C44134a.m174959a().mo133200T().mo133279a(this.mTenantRV, new Rect(iArr[0], iArr[1], iArr[0] + this.mTenantRV.getMeasuredWidth(), iArr2[1] + findViewByPosition2.getMeasuredHeight()), UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SwitchTeamGuide), UIHelper.getString(R.string.Lark_Legacy_SwitchTeamOK), new View.OnClickListener() {
                        /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.View$OnClickListenerC441984 */

                        public void onClick(View view) {
                            if (FeedDrawerView.this.f112143b != null) {
                                FeedDrawerView.this.f112143b.mo157256a();
                            }
                        }
                    });
                    MainHitPoint.f112172b.mo157224e();
                }
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C44232c.AbstractC44235b.AbstractC44236a aVar) {
        this.f112143b = aVar;
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: a */
    public void mo157198a(boolean z) {
        if (this.f112151j != null) {
            C44134a.m174959a().mo133250f().mo133316a(this.f112151j, z);
        }
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: a */
    public void mo157192a(int i) {
        if (i == 3 && this.f112150i && this.f112151j != null) {
            C44134a.m174959a().mo133250f().mo133314a(this.f112151j);
            this.f112150i = false;
        }
        if (i == 0 && this.f112151j != null) {
            C44134a.m174959a().mo133250f().mo133317b(this.f112151j);
        }
    }

    /* renamed from: a */
    public void mo157193a(View view) {
        ButtonBubbleConfig dVar = new ButtonBubbleConfig(new AnchorConfig(view, AnchorConfig.AnchorGravity.END, new Point(0, 0)), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), null, UIUtils.getString(this.f112142a, R.string.Lark_Accounts_LogBackInToastOnboarding), null, new ButtonConfig(UIHelper.getString(R.string.Lark_Accounts_OnboardWelcomeToTenantButton), new ButtonConfig.ButtonAction() {
            /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.AnonymousClass11 */

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                if (gVar.mo141658a()) {
                    gVar.mo141659b();
                }
            }
        }));
        dVar.mo141757a((Boolean) true);
        dVar.mo141759b(true);
        if (this.f112142a instanceof Activity) {
            MainHitPoint.f112172b.mo157223d();
            this.f112146e = GuideComponent.m152612a((Activity) this.f112142a, dVar);
            this.f112153l.start();
            C44134a.m174959a().mo133200T().mo133287c("all_sidebar_new_exit_single");
        }
    }

    /* renamed from: b */
    private void m175337b(List<TenantInfo> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (TenantInfo tenantInfo : list) {
            sb.append("{ tenantId:" + tenantInfo.getTenantId() + ", badgeCount: " + tenantInfo.getBadgeCount() + ", avatarKey: " + tenantInfo.getAvatarUrl() + ", isSessionValid: " + tenantInfo.isSessionValid() + ", isCurrentUser: " + tenantInfo.isCurrentUser() + ", isNewUser: " + tenantInfo.isNewUser() + " }  ");
        }
        sb.append("]");
        Log.m165389i("FeedDrawerView", sb.toString());
    }

    /* renamed from: a */
    public void mo157195a(TenantInfo tenantInfo) {
        C44232c.AbstractC44235b.AbstractC44236a aVar = this.f112143b;
        if (aVar != null) {
            String d = aVar.mo157261d();
            String str = MainHitPoint.f112172b.mo157218a().get(Integer.valueOf(tenantInfo.getStatus()));
            if (!TextUtils.isEmpty(d) && str != null) {
                MainHitPoint.f112172b.mo157220a(d, tenantInfo.getTenantId(), str);
            }
        }
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: a */
    public void mo157196a(List<TenantInfo> list) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165397w("FeedDrawerView", "tenantInfos is empty");
            return;
        }
        SelectableRoundedImageView selectableRoundedImageView = this.joinTeamSRIV;
        if (selectableRoundedImageView == null) {
            Log.m165397w("FeedDrawerView", "joinTeamSRIV is null");
        } else if (!UIUtils.isVisible(selectableRoundedImageView)) {
            Log.m165397w("FeedDrawerView", "joinTeamSRIV is invisible");
        } else if (list.size() >= 4) {
            Log.m165397w("FeedDrawerView", "tenantInfos'size is greater equals 4");
        } else {
            C57744a a = C57744a.m224104a();
            if (!a.getBoolean("sp_key_from_logout", false)) {
                Log.m165397w("FeedDrawerView", "isFromLogout is false");
                return;
            }
            a.putBoolean("sp_key_from_logout", false);
            boolean a2 = C44134a.m174959a().mo133200T().mo133283a("all_sidebar_new_exit_single");
            Log.m165389i("FeedDrawerView", "current tenantId is " + this.f112143b.mo157261d() + ", result of checkToShow is " + a2);
            if (a2) {
                this.joinTeamSRIV.post(new Runnable() {
                    /* class com.ss.android.lark.main.app.drawer.FeedDrawerView.AnonymousClass10 */

                    public void run() {
                        FeedDrawerView feedDrawerView = FeedDrawerView.this;
                        feedDrawerView.mo157193a(feedDrawerView.joinTeamSRIV);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.main.app.drawer.C44232c.AbstractC44235b
    /* renamed from: a */
    public void mo157197a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
        if (this.f112147f != null) {
            if (C44134a.m174959a().mo133248e().mo133308b() || !this.f112143b.mo157259b()) {
                ArrayList arrayList = new ArrayList(list);
                m175337b(arrayList);
                this.f112147f.diff(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(list.get(0));
                m175337b(arrayList2);
                this.f112147f.diff(arrayList2);
            }
        }
        if (this.f112148g != null) {
            this.f112148g.diff(new ArrayList(list2));
        }
        m175343k();
    }

    public FeedDrawerView(Context context, FragmentManager fragmentManager, AbstractC44206a aVar) {
        this.f112142a = context;
        this.f112144c = aVar;
        this.f112149h = fragmentManager;
    }
}
