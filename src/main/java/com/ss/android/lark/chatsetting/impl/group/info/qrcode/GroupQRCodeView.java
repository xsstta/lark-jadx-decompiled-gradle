package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.cardheadergenerator.CardHeaderGenerator;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.GroupShareUtil;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.ListenableImageView;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.RotateLoadingView;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;

public class GroupQRCodeView implements AbstractC34675c.AbstractC34678b {

    /* renamed from: d */
    private static final int f89448d;

    /* renamed from: e */
    private static final int f89449e;

    /* renamed from: a */
    public AbstractC34662c f89450a;

    /* renamed from: b */
    public AbstractC34675c.AbstractC34678b.AbstractC34679a f89451b;

    /* renamed from: c */
    public Context f89452c;

    /* renamed from: f */
    private String f89453f;
    ListenableImageView mGroupAvatar;
    TextView mGroupDesc;
    TextView mGroupName;
    RelativeLayout mGroupQRCode;
    ImageView mGroupQRCodeBlurHeader;
    RelativeLayout mGroupQRCodeEmptyLayout;
    ImageView mGroupQRCodeIV;
    LinearLayout mGroupQRCodeInfoLayout;
    LinearLayout mGroupQRCodeLayout;
    TextView mGroupQRCodeLoadAgainBtn;
    RotateLoadingView mGroupQRCodeLoading;
    RelativeLayout mGroupQRCodeLoadingLayout;
    TextView mGroupQRCodeModifyShareCardValidityPeriod;
    TextView mGroupQRCodeSaveToPhoneBtn;
    TextView mGroupQRCodeShareBtn;
    TextView mGroupQRCodeValidTipTV;
    TextView mQRCodeAddTipTv;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView$a */
    public static class C34660a {

        /* renamed from: a */
        public String f89460a;

        /* renamed from: b */
        public String f89461b;

        /* renamed from: c */
        public String f89462c;

        /* renamed from: d */
        public String f89463d;

        /* renamed from: e */
        public boolean f89464e;

        /* renamed from: f */
        public boolean f89465f;

        /* renamed from: g */
        public boolean f89466g;
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView$b */
    public static class C34661b {

        /* renamed from: a */
        public Bitmap f89467a;

        /* renamed from: b */
        public String f89468b;
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView$c */
    public interface AbstractC34662c {
        /* renamed from: a */
        void mo127974a();

        /* renamed from: a */
        void mo127975a(GroupQRCodeView groupQRCodeView);

        /* renamed from: a */
        void mo127976a(String str);

        /* renamed from: b */
        void mo127977b(String str);
    }

    /* renamed from: d */
    private void m134657d() {
        m134661g();
        m134659e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f89450a = null;
        this.f89451b = null;
    }

    static {
        int dp2px = UIHelper.dp2px(48.0f);
        f89448d = dp2px;
        f89449e = dp2px;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: c */
    public void mo127988c() {
        this.mGroupQRCodeLoadingLayout.setVisibility(8);
        this.mGroupQRCodeLoading.setVisibility(8);
    }

    /* renamed from: e */
    private void m134659e() {
        this.mGroupQRCodeSaveToPhoneBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$GroupQRCodeView$ZRiZc4GRsUoDs5DwqOndc_pXy7s */

            public final void onClick(View view) {
                GroupQRCodeView.lambda$ZRiZc4GRsUoDs5DwqOndc_pXy7s(GroupQRCodeView.this, view);
            }
        });
        this.mGroupQRCodeLoadAgainBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$GroupQRCodeView$h4V1Vzah4AOqy5VgOvcCgiJNbOg */

            public final void onClick(View view) {
                GroupQRCodeView.this.m134652a((GroupQRCodeView) view);
            }
        });
        this.mGroupQRCode.setClickable(true);
    }

    /* renamed from: f */
    private IParam m134660f() {
        int d = this.f89451b.mo128029d();
        if (d == 0) {
            return ChatSettingExtraParams.ValidPeriod.WITHIN_7_DAYS;
        }
        if (d == 1) {
            return ChatSettingExtraParams.ValidPeriod.WITHIN_1_YEARS;
        }
        if (d != 2) {
            return TARGET_NONE.f135700a;
        }
        return ChatSettingExtraParams.ValidPeriod.PERMANENT;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: a */
    public void mo127978a() {
        this.mGroupQRCodeLayout.setVisibility(8);
        this.mGroupQRCodeEmptyLayout.setVisibility(0);
        this.mGroupQRCodeSaveToPhoneBtn.setEnabled(false);
        this.mGroupQRCodeShareBtn.setEnabled(false);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f89450a.mo127975a(this);
        this.f89452c = this.mTitleBar.getContext();
        m134657d();
        ChatSettingHitPointNew.m136639g();
    }

    /* renamed from: g */
    private void m134661g() {
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_QrCode));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.View$OnClickListenerC346561 */

            public void onClick(View view) {
                GroupQRCodeView.this.f89450a.mo127974a();
            }
        });
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
        this.mTitleBar.setBackgroundColor(ContextCompat.getColor(this.f89452c, R.color.transparent));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: b */
    public void mo127985b() {
        this.mGroupQRCodeLayout.setVisibility(8);
        this.mGroupQRCodeEmptyLayout.setVisibility(8);
        this.mGroupQRCodeLoadingLayout.setVisibility(0);
        this.mGroupQRCodeLoading.setVisibility(0);
        this.mGroupQRCodeShareBtn.setEnabled(false);
        this.mGroupQRCodeSaveToPhoneBtn.setEnabled(false);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC34675c.AbstractC34678b.AbstractC34679a aVar) {
        this.f89451b = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: b */
    public void mo127986b(C34660a aVar) {
        mo127980a(aVar);
    }

    public GroupQRCodeView(AbstractC34662c cVar) {
        this.f89450a = cVar;
    }

    /* renamed from: a */
    private /* synthetic */ void m134652a(View view) {
        this.f89451b.mo128027b();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: b */
    public void mo127987b(String str) {
        this.f89450a.mo127976a(str);
    }

    /* renamed from: b */
    private void m134655b(boolean z) {
        this.mGroupQRCodeShareBtn.setOnClickListener(new View.OnClickListener(z) {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$GroupQRCodeView$AVJIBOzBPnepbN9J0KHqcp9bitQ */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                GroupQRCodeView.lambda$AVJIBOzBPnepbN9J0KHqcp9bitQ(GroupQRCodeView.this, this.f$1, view);
            }
        });
    }

    /* renamed from: d */
    private void m134658d(String str) {
        this.mGroupQRCodeModifyShareCardValidityPeriod.postDelayed(new Runnable() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.RunnableC346583 */

            public void run() {
                GroupQRCodeView.this.mGroupQRCodeValidTipTV.setHighlightColor(UIUtils.getColor(GroupQRCodeView.this.f89452c, R.color.transparent));
                GroupQRCodeView.this.mGroupQRCodeModifyShareCardValidityPeriod.setText(GroupShareUtil.m134453a(GroupQRCodeView.this.mGroupQRCodeModifyShareCardValidityPeriod, "", UIHelper.getString(R.string.Lark_Group_ChangeQRcodeValidity), new View.OnClickListener() {
                    /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.RunnableC346583.View$OnClickListenerC346591 */

                    public void onClick(View view) {
                        GroupQRCodeView.this.f89451b.mo128028c();
                    }
                }));
                GroupQRCodeView.this.mGroupQRCodeModifyShareCardValidityPeriod.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }, 100);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: a */
    public void mo127979a(int i) {
        LKUIToast.show(this.f89452c, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: c */
    public void mo127989c(String str) {
        this.mQRCodeAddTipTv.setText(UIHelper.mustacheFormat((int) R.string.Lark_Education_NeedApprovalToJoinGroup, "ClassName", str));
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m134654b(View view) {
        if (GroupShareUtil.m134454a()) {
            this.mGroupQRCodeValidTipTV.setText(this.f89453f);
            this.f89451b.mo128025a(C57820d.m224432a(this.mGroupQRCodeInfoLayout));
            m134658d(this.f89453f);
        } else {
            this.f89451b.mo128025a(C57820d.m224432a(this.mGroupQRCodeInfoLayout));
        }
        this.f89451b.mo128024a();
        ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.SAVE;
        TARGET_NONE eVar = TARGET_NONE.f135700a;
        ChatSettingHitPointNew.m136642h(click.plus(eVar).plus(m134660f()));
    }

    /* renamed from: c */
    private void m134656c(C34660a aVar) {
        String str;
        String b = ChatSettingModule.m133639a().mo127277g().mo127414b();
        if (aVar.f89464e) {
            if (aVar.f89466g) {
                str = UIUtils.getString(this.f89452c, R.string.Lark_Groups_ScanQRCodeToJoinCircle);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Group_OnlyInternalMembersCanJoin, "company_name", b);
            }
        } else if (aVar.f89465f) {
            str = "";
        } else if (aVar.f89466g) {
            str = UIUtils.getString(this.f89452c, R.string.Lark_Chat_ExternalGroupQRCodeImageContent);
        } else {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Group_OnlyInternalMembersCanJoin, "GROUP_QRCODE_TENANT_NAME", b);
        }
        this.mQRCodeAddTipTv.setText(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: a */
    public void mo127980a(C34660a aVar) {
        if (aVar.f89464e) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_GroupInfoGroupQrCode));
        } else {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_QrCode));
        }
        this.mGroupName.setText(aVar.f89462c);
        this.mGroupDesc.setText(aVar.f89463d);
        m134656c(aVar);
        m134655b(aVar.f89466g);
        AbstractC34461c.AbstractC34474m i = ChatSettingModule.m133639a().mo127279i();
        final Context context = this.f89452c;
        final ImageView imageView = this.mGroupQRCodeBlurHeader;
        this.mGroupAvatar.setOnImageDrawableChangedListener(new ListenableImageView.OnImageDrawableChangedListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView.C346572 */

            @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.ListenableImageView.OnImageDrawableChangedListener
            /* renamed from: a */
            public void mo127991a(Drawable drawable, Drawable drawable2) {
                if (drawable2 instanceof BitmapDrawable) {
                    imageView.setImageDrawable(CardHeaderGenerator.m91674a(context, ((BitmapDrawable) drawable2).getBitmap(), UIHelper.getWindowWidth(context)));
                }
            }
        });
        i.mo127409a(this.f89452c, aVar.f89461b, aVar.f89460a, this.mGroupAvatar, f89448d, f89449e);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: a */
    public void mo127981a(C34661b bVar) {
        this.mGroupQRCodeLayout.setVisibility(0);
        this.mGroupQRCodeEmptyLayout.setVisibility(8);
        this.mGroupQRCodeIV.setImageBitmap(bVar.f89467a);
        this.f89453f = bVar.f89468b;
        if (GroupShareUtil.m134454a()) {
            m134658d(this.f89453f);
        }
        this.mGroupQRCodeValidTipTV.setText(bVar.f89468b);
        this.mGroupQRCodeSaveToPhoneBtn.setEnabled(true);
        this.mGroupQRCodeShareBtn.setEnabled(true);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: a */
    public void mo127983a(String str) {
        this.f89450a.mo127977b(str);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b
    /* renamed from: a */
    public void mo127984a(boolean z) {
        int i;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        commonTitleBar.setVisibility(i);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m134653a(boolean z, View view) {
        this.f89451b.mo128025a(C57820d.m224432a(this.mGroupQRCodeInfoLayout));
        this.f89451b.mo128026a(z);
        ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.SHARE;
        ChatSettingExtraParams.Target target = ChatSettingExtraParams.Target.IM_GROUP_QR_SHARE_TO_VIEW;
        ChatSettingHitPointNew.m136642h(click.plus(target).plus(m134660f()));
    }
}
