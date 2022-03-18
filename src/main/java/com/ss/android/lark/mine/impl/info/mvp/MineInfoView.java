package com.ss.android.lark.mine.impl.info.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import com.ss.android.lark.mine.impl.info.mvp.C45778a;
import com.ss.android.lark.mine.impl.statistics.setting.EditProfileHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.drawable.TenantCertificationDrawable;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2931b.C58324b;

public class MineInfoView implements C45778a.AbstractC45781b {

    /* renamed from: a */
    public Context f115540a;

    /* renamed from: b */
    public AbstractC45777a f115541b;

    /* renamed from: c */
    private C45778a.AbstractC45781b.AbstractC45782a f115542c;
    @BindView(7299)
    LinearLayout mMyMedalView;
    @BindView(6881)
    ViewGroup mMyProfileDepartmentContainer;
    @BindView(7429)
    TextView mMyProfileDepartmentTV;
    @BindView(7430)
    ImageView mMyProfileEditNameArrowIV;
    @BindView(7431)
    SelectableRoundedImageView mMyProfileImageIV;
    @BindView(7432)
    ConstraintLayout mMyProfileImageRL;
    @BindView(7434)
    ConstraintLayout mMyProfileNameLL;
    @BindView(7433)
    TextView mMyProfileNameTV;
    @BindView(7436)
    ViewGroup mMyQrCodeContainer;
    @BindView(7247)
    ViewGroup mTenantContainer;
    @BindView(7441)
    TextView mTenantName;
    @BindView(7956)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mine.impl.info.mvp.MineInfoView$a */
    public interface AbstractC45777a {
        /* renamed from: a */
        Context mo160948a();

        /* renamed from: a */
        void mo160949a(Context context, String str);

        /* renamed from: a */
        void mo160950a(MineInfoView mineInfoView);

        /* renamed from: a */
        void mo160951a(String str);

        /* renamed from: b */
        void mo160952b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f115542c = null;
        this.f115541b = null;
    }

    /* renamed from: f */
    private boolean m181396f() {
        return C45421b.m180420a().mo133458q().mo133501b();
    }

    /* renamed from: g */
    private boolean m181397g() {
        return C45421b.m180420a().mo133458q().mo133502c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f115541b.mo160950a(this);
        m181391c();
    }

    /* renamed from: c */
    private void m181391c() {
        boolean z;
        this.mMyProfileImageRL.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mine.impl.info.mvp.$$Lambda$MineInfoView$rLIU3xGEzlMAqIy1de9WYKWZ_K0 */

            public final void onClick(View view) {
                MineInfoView.this.m181392c((MineInfoView) view);
            }
        });
        this.mMyQrCodeContainer.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mine.impl.info.mvp.MineInfoView.C457731 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C45421b.m180420a().mo133463v().mo133529a(MineInfoView.this.mMyQrCodeContainer.getContext());
            }
        });
        ViewGroup viewGroup = this.mMyProfileDepartmentContainer;
        if (m181396f() || m181397g()) {
            z = false;
        } else {
            z = true;
        }
        UIUtils.display(viewGroup, z);
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mine.impl.info.mvp.$$Lambda$MineInfoView$fTGty7BZDGHHl0nERTThKmev2Hw */

            public final void onClick(View view) {
                MineInfoView.this.m181389b((MineInfoView) view);
            }
        });
        m181395e();
        m181394d();
    }

    /* renamed from: d */
    private void m181394d() {
        if (C45421b.m180420a().mo133451j().mo133481a("messenger.profile.badge")) {
            UIUtils.show(this.mMyMedalView);
            this.mMyMedalView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mine.impl.info.mvp.$$Lambda$MineInfoView$KGHOIuuh9yHr5L4hiHPooE4b6Y */

                public final void onClick(View view) {
                    MineInfoView.this.m181387a((MineInfoView) view);
                }
            });
            EditProfileHitPoint.m181473a(true);
            return;
        }
        UIUtils.hide(this.mMyMedalView);
        EditProfileHitPoint.m181473a(false);
    }

    /* renamed from: e */
    private void m181395e() {
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            DesktopUtil.m144305b(this.mMyProfileImageRL);
            DesktopUtil.m144298a(this.mMyProfileNameLL, this.mMyProfileDepartmentContainer);
        }
    }

    /* renamed from: a */
    public void mo160979a() {
        if (TextUtils.isEmpty(this.mMyProfileNameTV.getText())) {
            Log.m165383e("MineInfoView", "mine name is empty");
            return;
        }
        AbstractC45777a aVar = this.f115541b;
        if (aVar != null) {
            aVar.mo160951a(this.mMyProfileNameTV.getText().toString());
        }
    }

    /* renamed from: b */
    public void mo160985b() {
        float f;
        C25639g gVar = new C25639g(this.f115540a);
        if (DesktopUtil.m144307b()) {
            f = 440.0f;
        } else {
            f = 0.8f;
        }
        gVar.mo89222a(f).mo89248g(R.string.Lark_Legacy_EditNamePermission).mo89251j(3).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: a */
    public void setViewDelegate(C45778a.AbstractC45781b.AbstractC45782a aVar) {
        this.f115542c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m181389b(View view) {
        this.f115541b.mo160952b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m181392c(View view) {
        this.f115542c.mo160999a();
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: a */
    public void mo160983a(String str) {
        this.mMyProfileDepartmentTV.setText(str);
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: b */
    public void mo160987b(String str) {
        this.mMyProfileNameTV.setText(str);
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: c */
    public void mo160989c(String str) {
        this.mMyProfileNameTV.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m181387a(View view) {
        String b = this.f115542c.mo161000b();
        if (!TextUtils.isEmpty(b)) {
            C45421b.m180420a().mo133463v().mo133533b(this.f115540a, b);
        }
        EditProfileHitPoint.m181472a();
    }

    /* renamed from: c */
    private void m181393c(final boolean z) {
        this.mMyProfileNameLL.setClickable(true);
        this.mMyProfileEditNameArrowIV.setVisibility(0);
        this.mMyProfileNameLL.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mine.impl.info.mvp.MineInfoView.C457764 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                EditProfileHitPoint.f115575a.mo161019a(z);
                if (z) {
                    MineInfoView.this.mo160979a();
                } else {
                    MineInfoView.this.mo160985b();
                }
            }
        });
    }

    /* renamed from: b */
    private void m181390b(boolean z) {
        if (z) {
            this.mMyProfileNameLL.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.mine.impl.info.mvp.MineInfoView.C457753 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    MineInfoView.this.mo160979a();
                }
            });
            this.mMyProfileNameLL.setClickable(true);
            this.mMyProfileEditNameArrowIV.setVisibility(0);
            return;
        }
        this.mMyProfileNameLL.setOnClickListener(null);
        this.mMyProfileNameLL.setClickable(false);
        this.mMyProfileEditNameArrowIV.setVisibility(8);
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: c */
    public void mo160988c(Chatter chatter) {
        ImageLoader.with(this.f115541b.mo160948a()).load(AvatarImage.Builder.obtain(chatter.getAvatarKey(), chatter.getId(), UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f)).build()).override(UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f)).into(this.mMyProfileImageIV);
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: a */
    public void mo160980a(Chatter chatter) {
        mo160988c(chatter);
        mo160987b(C45421b.m180420a().mo133459r().mo133505a(chatter));
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: b */
    public void mo160986b(Chatter chatter) {
        if (chatter != null && !TextUtils.isEmpty(chatter.getAvatarKey())) {
            C45421b.m180420a().mo133437a(this.f115541b.mo160948a(), chatter.getAvatarKey(), chatter.getId(), this.mMyProfileImageIV);
        }
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: a */
    public void mo160981a(final TenantCertificationInfo gVar) {
        String h = C45421b.m180420a().mo133449h();
        if (TextUtils.isEmpty(h)) {
            this.mTenantContainer.setVisibility(8);
            this.mTenantContainer.setOnClickListener(null);
            return;
        }
        this.mTenantContainer.setVisibility(0);
        if (gVar == null || !gVar.mo160312a()) {
            this.mTenantName.setText(h);
            return;
        }
        m181388a(h, gVar);
        this.mTenantContainer.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mine.impl.info.mvp.MineInfoView.C457742 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                EditProfileHitPoint.f115575a.mo161021b(gVar.mo160313b());
                MineInfoView.this.f115541b.mo160949a(MineInfoView.this.f115540a, gVar.mo160314c());
            }
        });
    }

    @Override // com.ss.android.lark.mine.impl.info.mvp.C45778a.AbstractC45781b
    /* renamed from: a */
    public void mo160984a(boolean z) {
        if (C45421b.m180420a().mo133451j().mo133481a("lark.all.change.name")) {
            m181393c(z);
        } else {
            m181390b(z);
        }
    }

    MineInfoView(Context context, AbstractC45777a aVar) {
        this.f115541b = aVar;
        this.f115540a = context;
    }

    /* renamed from: a */
    private void m181388a(String str, TenantCertificationInfo gVar) {
        C58324b bVar;
        SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) "$");
        if (gVar.mo160313b()) {
            Context context = this.f115540a;
            bVar = new C58324b(new TenantCertificationDrawable(context, UIUtils.getDrawable(context, R.drawable.mine_tenant_certification_icon), UIHelper.getString(R.string.Lark_FeishuCertif_Verif), UIUtils.getColor(this.f115540a, R.color.udtoken_tag_bg_turquoise), UIUtils.getColor(this.f115540a, R.color.udtoken_tag_text_s_turquoise)));
        } else {
            bVar = new C58324b(new TenantCertificationDrawable(this.f115540a, null, UIHelper.getString(R.string.Lark_FeishuCertif_Unverif), UIUtils.getColor(this.f115540a, R.color.udtoken_tag_neutral_bg_normal), UIUtils.getColor(this.f115540a, R.color.udtoken_tag_neutral_text_normal)));
        }
        append.setSpan(bVar, append.length() - 1, append.length(), 34);
        this.mTenantName.setText(append);
    }
}
