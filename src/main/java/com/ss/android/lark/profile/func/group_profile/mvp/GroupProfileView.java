package com.ss.android.lark.profile.func.group_profile.mvp;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c;
import com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView;
import com.ss.android.lark.profile.statistics.GroupProfilePerceivableErrorCostTimeHitPoint;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class GroupProfileView implements AbstractC52331c.AbstractC52333b {

    /* renamed from: c */
    private static final int f129723c;

    /* renamed from: d */
    private static final int f129724d;

    /* renamed from: a */
    public AbstractC52331c.AbstractC52333b.AbstractC52334a f129725a;

    /* renamed from: b */
    public Context f129726b;

    /* renamed from: e */
    private AbstractC52322b f129727e;

    /* renamed from: f */
    private IProfileModuleDependency.AbstractC52251f f129728f = C52239a.m202617d().mo133585o();
    @BindView(6995)
    TextView mBtnField;
    @BindView(7239)
    View mBtnFieldContainer;
    @BindView(6858)
    View mDivideLIneNameLayout;
    @BindView(6856)
    View mDivideLineBetweenDescribeAndOwner;
    @BindView(6857)
    View mDivideLineOnOwnerBottom;
    @BindView(6994)
    ImageView mGroupAvatar;
    @BindView(6996)
    TextView mGroupCountTV;
    @BindView(6998)
    TextView mGroupDescTV;
    @BindView(7001)
    View mGroupDescribeLayout;
    @BindView(7012)
    View mGroupNameLayout;
    @BindView(7013)
    TextView mGroupNameTV;
    @BindView(7014)
    ImageView mGroupOwnerAvatar;
    @BindView(7010)
    View mGroupOwnerLayout;
    @BindView(7243)
    View mTipContainer;
    @BindView(7971)
    TextView mTipTv;
    @BindView(7876)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView$a */
    public static class C52321a {

        /* renamed from: a */
        public int f129736a;

        /* renamed from: b */
        public String f129737b;

        /* renamed from: c */
        public String f129738c;

        /* renamed from: d */
        public String f129739d;

        /* renamed from: e */
        public String f129740e;

        /* renamed from: f */
        public String f129741f;

        /* renamed from: g */
        public String f129742g;

        /* renamed from: h */
        public String f129743h;

        /* renamed from: i */
        public boolean f129744i;
    }

    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView$b */
    public interface AbstractC52322b {
        /* renamed from: a */
        void mo179136a();

        /* renamed from: a */
        void mo179137a(GroupProfileView groupProfileView);

        /* renamed from: a */
        void mo179138a(String str, String str2, String str3);
    }

    /* renamed from: f */
    private void m202968f() {
    }

    /* renamed from: b */
    private void m202957b() {
        m202962c();
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public void mo179170a(String str) {
        LKUIToast.show(this.f129726b, str);
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public boolean mo179172a(ErrorResult errorResult) {
        boolean a = BillingTipsDialog.m226153a(errorResult.getErrorCode());
        if (a) {
            BillingTipsDialog.m226151a(this.f129726b, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
        }
        return a;
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public void mo179171a(String str, String str2, String str3) {
        this.f129727e.mo179138a(str, str2, str3);
    }

    /* renamed from: g */
    private void m202969g() {
        m202953a(0);
    }

    /* renamed from: h */
    private void m202970h() {
        m202953a(8);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f129727e = null;
        this.f129725a = null;
    }

    static {
        int dp2px = UIHelper.dp2px(40.0f);
        f129723c = dp2px;
        f129724d = dp2px;
    }

    /* renamed from: e */
    private void m202967e() {
        this.mTipTv.setText("");
        this.mTipContainer.setVisibility(8);
    }

    /* renamed from: d */
    private void m202964d() {
        this.mBtnFieldContainer.setVisibility(0);
        this.mBtnField.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.$$Lambda$GroupProfileView$8EmSxhTMKd0EXZkZEhb7IL2YjG0 */

            public final void onClick(View view) {
                GroupProfileView.lambda$8EmSxhTMKd0EXZkZEhb7IL2YjG0(GroupProfileView.this, view);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f129727e.mo179137a(this);
        this.f129726b = this.mTitleBar.getContext();
        m202957b();
    }

    /* renamed from: c */
    private void m202962c() {
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.$$Lambda$GroupProfileView$C5efcXYhgu0SgmCpCKtYpjfOrow */

            public final void onClick(View view) {
                GroupProfileView.lambda$C5efcXYhgu0SgmCpCKtYpjfOrow(GroupProfileView.this, view);
            }
        });
        this.mTitleBar.setBackgroundColor(UIHelper.getColor(R.color.lkui_transparent));
        this.mTitleBar.setDividerVisible(false);
        if (DesktopUtil.m144301a(this.f129726b)) {
            ViewGroup.LayoutParams layoutParams = this.mGroupAvatar.getLayoutParams();
            layoutParams.height = UIHelper.dp2px(300.0f);
            this.mGroupAvatar.setLayoutParams(layoutParams);
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE, R.color.static_white);
            return;
        }
        StatusBarUtil.setTransparentForImageView((Activity) this.f129726b, this.mTitleBar);
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK, R.color.static_white);
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public void mo179164a() {
        this.f129727e.mo179136a();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC52331c.AbstractC52333b.AbstractC52334a aVar) {
        this.f129725a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m202960b(View view) {
        this.f129727e.mo179136a();
    }

    public GroupProfileView(AbstractC52322b bVar) {
        this.f129727e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m202955a(View view) {
        this.f129725a.mo179195a(this.f129726b);
        ProfileHitPoint.m204711b("Join_Group");
    }

    /* renamed from: b */
    private void m202958b(Bundle bundle) {
        m202954a(bundle, this.f129726b.getString(R.string.Lark_Chat_Scan_QRcode_Group_External_SwitchOrganization_Button));
    }

    /* renamed from: c */
    private void m202963c(Bundle bundle) {
        m202959b(bundle, this.f129726b.getString(R.string.Lark_Chat_Scan_QRcode_Group_External_ApplyOrganizationPermissionYes_Button));
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: c */
    public void mo179174c(String str) {
        C52239a.m202617d().mo133586p().mo133603a(this.f129726b, str);
    }

    /* renamed from: a */
    private void m202953a(int i) {
        this.mDivideLIneNameLayout.setVisibility(i);
        this.mGroupDescribeLayout.setVisibility(i);
        this.mDivideLineBetweenDescribeAndOwner.setVisibility(i);
        this.mGroupOwnerLayout.setVisibility(i);
        this.mDivideLineOnOwnerBottom.setVisibility(i);
        this.mBtnFieldContainer.setVisibility(i);
        this.mTipContainer.setVisibility(i);
    }

    /* renamed from: d */
    private void m202965d(final Bundle bundle) {
        this.mBtnFieldContainer.setVisibility(0);
        this.mBtnField.setText(R.string.Lark_Education_RequestToJoinClassButton);
        this.mBtnField.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.C523204 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C52239a.m202617d().mo133564b(GroupProfileView.this.f129726b, bundle.getString("params_invite_url", ""));
                ProfileHitPoint.m204711b("Join_Organization");
                ProfileHitPoint.m204696a(4);
            }
        });
    }

    /* renamed from: d */
    private void m202966d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mTipContainer.setVisibility(0);
            this.mTipTv.setText(str);
        }
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: b */
    public void mo179173b(String str) {
        LKUIToast.show(this.f129726b, str);
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public void mo179167a(Bundle bundle) {
        m202964d();
        boolean z = bundle.getBoolean("params_in_organization", true);
        boolean z2 = bundle.getBoolean("params_is_other_tenant_in_orgainization", false);
        boolean z3 = bundle.getBoolean("key_param_is_external_group", false);
        boolean z4 = bundle.getBoolean("params_show_join_organization", false);
        boolean z5 = bundle.getBoolean("params_education_group", false);
        bundle.getString("params__chat_id", "");
        if (z5) {
            m202970h();
            m202968f();
        } else if (!z && !z3) {
            m202970h();
            if (z2) {
                m202966d(bundle.getString("parmas_tip_str", ""));
                m202958b(bundle);
            } else if (z4) {
                ProfileHitPoint.m204715c("normal");
                m202963c(bundle);
            } else {
                ProfileHitPoint.m204715c("no_permisson");
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public void mo179168a(C52321a aVar) {
        int i;
        this.mGroupOwnerAvatar.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.C523171 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                GroupProfileView.this.f129725a.mo179194a();
            }
        });
        if (!TextUtils.isEmpty(aVar.f129738c)) {
            this.mGroupDescTV.setText(aVar.f129738c);
        } else {
            this.mGroupDescTV.setText(UIHelper.getString(R.string.Lark_Legacy_EmptyDescription));
        }
        this.mGroupNameTV.setText(aVar.f129737b);
        this.mGroupCountTV.setText(aVar.f129736a + UIHelper.getString(R.string.Lark_Legacy_AmountGroupUnit));
        m202956a(aVar.f129739d, aVar.f129740e);
        m202961b(aVar.f129742g, aVar.f129743h);
        TextView textView = this.mBtnField;
        if (aVar.f129744i) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    private void m202956a(String str, String str2) {
        mo179166a(this.f129726b, str, str2, this.mGroupAvatar);
    }

    /* renamed from: a */
    private void m202954a(Bundle bundle, String str) {
        this.mBtnFieldContainer.setVisibility(0);
        this.mBtnField.setText(str);
        final String string = bundle.getString("params_tenant_id", "");
        this.mBtnField.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.C523182 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m202982a(String str) {
                Context context;
                Activity f = C52239a.m202617d().mo133573f();
                IProfileModuleDependency d = C52239a.m202617d();
                if (f == null) {
                    context = GroupProfileView.this.f129726b;
                } else {
                    context = f;
                }
                d.mo133566c(context, str);
                Log.m165389i("GroupProfileView", "swicth tenant top Activity = " + f);
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C52239a.m202617d().mo133548a(GroupProfileView.this.f129726b);
                ProfileHitPoint.m204711b("Switch_Organization");
                ProfileHitPoint.m204696a(3);
                UICallbackExecutor.executeDelayed(new Runnable(string) {
                    /* class com.ss.android.lark.profile.func.group_profile.mvp.$$Lambda$GroupProfileView$2$fX75h17v6SWhz2kyqy4HXgd3ol0 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        GroupProfileView.C523182.lambda$fX75h17v6SWhz2kyqy4HXgd3ol0(GroupProfileView.C523182.this, this.f$1);
                    }
                }, 100);
            }
        });
    }

    /* renamed from: b */
    private void m202959b(Bundle bundle, String str) {
        this.mBtnFieldContainer.setVisibility(0);
        this.mBtnField.setText(str);
        final String string = bundle.getString("params_invite_url", "");
        this.mBtnField.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.C523193 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C52239a.m202617d().mo133564b(GroupProfileView.this.f129726b, string);
                ProfileHitPoint.m204711b("Join_Organization");
                ProfileHitPoint.m204696a(1);
            }
        });
    }

    /* renamed from: b */
    private void m202961b(String str, String str2) {
        this.f129728f.mo133596a(this.f129726b, this.mGroupOwnerAvatar, str, str2, new ProfileLoadParams().mo178889a(f129723c).mo178894b(f129724d));
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b
    /* renamed from: a */
    public void mo179165a(int i, Bundle bundle) {
        if (i == 1) {
            m202969g();
            m202967e();
            return;
        }
        m202966d(this.f129726b.getString(R.string.Lark_Education_NeedApprovalToJoinGroup2));
        if (i == 2) {
            m202965d(bundle);
        } else if (i == 3) {
            m202954a(bundle, this.f129726b.getString(R.string.Lark_Education_SwitchPersonalAccountButton));
        } else if (i == 4) {
            m202959b(bundle, this.f129726b.getString(R.string.Lark_Education_CreatePersonalAccountButton));
        }
    }

    /* renamed from: a */
    public void mo179166a(Context context, String str, String str2, ImageView imageView) {
        if (!TextUtils.isEmpty(str)) {
            Drawable drawable = UIUtils.getDrawable(context, R.drawable.common_chat_window_image_item_holder);
            this.f129728f.mo133596a(context, imageView, str, str2, new ProfileLoadParams().mo178889a(640).mo178894b(640).mo178891a(str).mo178890a(drawable).mo178895b(drawable).mo178897b(true).mo178898c(true).mo178896b("webp").mo178892a(true));
            GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180537h();
        }
    }
}
