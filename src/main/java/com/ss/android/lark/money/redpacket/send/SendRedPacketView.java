package com.ss.android.lark.money.redpacket.send;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2364a.p2365a.C48022a;
import com.ss.android.lark.money.p2367c.C48033a;
import com.ss.android.lark.money.redpacket.send.C48173a;
import com.ss.android.lark.money.statistics.RedPacketHitPoint;
import com.ss.android.lark.money.statistics.RedPacketHitPointOld;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SendRedPacketView implements C48173a.AbstractC48175b {

    /* renamed from: g */
    private static final int f121214g = UIHelper.dp2px(240.0f);

    /* renamed from: h */
    private static final int f121215h = UIHelper.dp2px(48.0f);

    /* renamed from: a */
    public int f121216a;

    /* renamed from: b */
    public Context f121217b;

    /* renamed from: c */
    public AbstractC48172b f121218c;

    /* renamed from: d */
    public C48173a.AbstractC48175b.AbstractC48176a f121219d;

    /* renamed from: e */
    public boolean f121220e;

    /* renamed from: f */
    public RedPacketCover f121221f;

    /* renamed from: i */
    private int f121222i;

    /* renamed from: j */
    private CommonLoadingDialog f121223j;
    View vBtnCreateRedPacket;
    ImageView vCoverForeground;
    ViewGroup vCoverLayout;
    ImageView vCoverMiddlePartIv;
    TextView vCoverNameTv;
    EditText vEditAmount;
    EditText vEditComment;
    EditText vEditCount;
    ViewGroup vLayoutAmountTips;
    View vLayoutCount;
    ViewGroup vLayoutCountTips;
    View vLayoutState;
    TextView vTextAmountName;
    TextView vTextAmountWarning;
    TextView vTextCountWarning;
    TextView vTextCurrentChangeState;
    TextView vTextGroupMemberNum;
    TextView vTextTotalMoney;
    CommonTitleBar vTitleBar;

    /* renamed from: com.ss.android.lark.money.redpacket.send.SendRedPacketView$b */
    public interface AbstractC48172b {
        /* renamed from: a */
        void mo168586a();

        /* renamed from: a */
        void mo168587a(RedPacketCover redPacketCover);

        /* renamed from: a */
        void mo168588a(SendRedPacketView sendRedPacketView);

        /* renamed from: b */
        void mo168589b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m190133l();
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: a */
    public void mo168597a(String str, boolean z, C48178c cVar, Runnable runnable) {
        C48022a.m189558a(this.f121217b, str, z, cVar, runnable);
    }

    /* renamed from: c */
    public void mo168601c() {
        m190136o();
        m190135n();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f121219d = null;
        this.f121218c = null;
    }

    /* renamed from: j */
    public void mo168610j() {
        AbstractC48172b bVar = this.f121218c;
        if (bVar != null) {
            bVar.mo168586a();
        }
    }

    /* renamed from: n */
    private void m190135n() {
        this.vBtnCreateRedPacket.setEnabled(mo168604d());
    }

    /* renamed from: o */
    private void m190136o() {
        double f = mo168606f();
        if (this.f121216a == -1) {
            int h = mo168608h();
            if (h <= 0) {
                h = 1;
            }
            f *= (double) h;
        }
        this.vTextTotalMoney.setText(C48033a.m189577a(f));
    }

    /* renamed from: p */
    private void m190137p() {
        this.f121216a = 2;
        this.vTextAmountName.setText(R.string.Lark_Legacy_Amount);
        UIUtils.hide(this.vLayoutAmountTips);
        UIUtils.hide(this.vLayoutState);
        UIUtils.hide(this.vLayoutCount);
    }

    /* renamed from: d */
    public boolean mo168604d() {
        int h = mo168608h();
        if ((!this.f121220e || m190130d(h)) && m190129b(mo168606f(), h)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public double mo168605e() {
        try {
            return Double.parseDouble(this.vTextTotalMoney.getText().toString());
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    /* renamed from: f */
    public double mo168606f() {
        try {
            return Double.parseDouble(this.vEditAmount.getText().toString());
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    /* renamed from: g */
    public boolean mo168607g() {
        if (mo168606f() != 0.0d || "0.00".equals(this.vEditAmount.getText().toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public int mo168608h() {
        try {
            return Integer.parseInt(this.vEditCount.getText().toString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: i */
    public String mo168609i() {
        String obj = this.vEditComment.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return this.vEditComment.getHint().toString();
        }
        return obj;
    }

    /* renamed from: k */
    private void m190132k() {
        this.vTitleBar.setTitle(R.string.Lark_Legacy_SendHongbao);
        this.vTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.vTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketView.View$OnClickListenerC481651 */

            public void onClick(View view) {
                SendRedPacketView.this.mo168610j();
            }
        });
        this.vTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_History), R.color.text_title) {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketView.C481662 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                SendRedPacketView.this.f121218c.mo168589b();
            }
        });
    }

    /* renamed from: m */
    private void m190134m() {
        this.vEditAmount.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketView.C481684 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (SendRedPacketView.this.mo168607g()) {
                    SendRedPacketView.this.mo168600b((String) null);
                } else {
                    SendRedPacketView sendRedPacketView = SendRedPacketView.this;
                    sendRedPacketView.mo168600b(sendRedPacketView.mo168590a(sendRedPacketView.mo168606f(), SendRedPacketView.this.mo168608h()));
                }
                SendRedPacketView.this.mo168601c();
            }
        });
        this.vEditAmount.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8), new C48177b()});
        this.vEditCount.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketView.C481695 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.length() == 0) {
                    SendRedPacketView.this.mo168603c((String) null);
                } else {
                    SendRedPacketView sendRedPacketView = SendRedPacketView.this;
                    sendRedPacketView.mo168603c(sendRedPacketView.mo168598b(sendRedPacketView.mo168608h()));
                }
                if (SendRedPacketView.this.mo168607g()) {
                    SendRedPacketView.this.mo168600b((String) null);
                } else {
                    SendRedPacketView sendRedPacketView2 = SendRedPacketView.this;
                    sendRedPacketView2.mo168600b(sendRedPacketView2.mo168590a(sendRedPacketView2.mo168606f(), SendRedPacketView.this.mo168608h()));
                }
                SendRedPacketView.this.mo168601c();
            }
        });
        this.vEditCount.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
    }

    /* renamed from: l */
    private void m190133l() {
        RedPacketHitPoint.m190212a();
        this.f121218c.mo168588a(this);
        m190132k();
        m190127a(this.f121220e);
        m190134m();
        this.vTextTotalMoney.setTypeface(Typeface.createFromAsset(this.f121217b.getAssets(), "fonts/DINAlternateBold.ttf"));
        mo168601c();
        this.vEditComment.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        this.vBtnCreateRedPacket.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketView.C481673 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                boolean z;
                String str;
                long j;
                int i;
                Long l;
                if (SendRedPacketView.this.mo168604d()) {
                    if (SendRedPacketView.this.f121216a == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!SendRedPacketView.this.f121220e) {
                        str = "single";
                    } else if (z) {
                        str = "group_identical";
                    } else {
                        str = "group_normal";
                    }
                    RedPacketHitPointOld.m190218b(str);
                    RedPacketHitPoint.HongbaoSendClickParams hongbaoSendClickParams = RedPacketHitPoint.HongbaoSendClickParams.HONGBAO_SEND;
                    if (SendRedPacketView.this.f121221f == null) {
                        j = -1;
                    } else {
                        j = SendRedPacketView.this.f121221f.getId();
                    }
                    RedPacketHitPoint.m190214a(hongbaoSendClickParams, j);
                    C48173a.AbstractC48175b.AbstractC48176a aVar = SendRedPacketView.this.f121219d;
                    Context context = SendRedPacketView.this.f121217b;
                    double e = SendRedPacketView.this.mo168605e();
                    if (SendRedPacketView.this.f121220e) {
                        i = SendRedPacketView.this.mo168608h();
                    } else {
                        i = 1;
                    }
                    String i2 = SendRedPacketView.this.mo168609i();
                    if (SendRedPacketView.this.f121221f != null) {
                        l = Long.valueOf(SendRedPacketView.this.f121221f.getId());
                    } else {
                        l = null;
                    }
                    aVar.mo168628a(context, z, e, i, i2, l);
                }
            }
        });
        m190138q();
    }

    /* renamed from: q */
    private void m190138q() {
        int i;
        ViewGroup viewGroup = this.vCoverLayout;
        if (MoneyModule.getDependency().getFeatureGatingDependency().isEnable("lark.hongbao.skin")) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        RedPacketCover redPacketCover = this.f121221f;
        if (redPacketCover == null || redPacketCover.getMainCover() == null) {
            this.vCoverMiddlePartIv.setImageResource(R.drawable.default_cover);
        } else {
            ImageLoader.with(this.f121217b).load(this.f121221f.getMainCover()).override(f121214g, f121215h).into(this.vCoverMiddlePartIv);
        }
        this.vCoverLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        this.vCoverLayout.setClipToOutline(true);
        this.vCoverForeground.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.send.$$Lambda$SendRedPacketView$mZDlMdDoTpg0Ix6rCbJPYVqAM */

            public final void onClick(View view) {
                SendRedPacketView.m270856lambda$mZDlMdDoTpg0Ix6rCbJPYVqAM(SendRedPacketView.this, view);
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: a */
    public void mo168591a() {
        if (this.f121223j == null) {
            this.f121223j = new CommonLoadingDialog();
        }
        this.f121223j.show(this.f121217b);
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: b */
    public void mo168599b() {
        CommonLoadingDialog commonLoadingDialog;
        Context context = this.f121217b;
        if ((context instanceof Activity) && !((Activity) context).isDestroyed() && (commonLoadingDialog = this.f121223j) != null) {
            commonLoadingDialog.dismiss();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C48173a.AbstractC48175b.AbstractC48176a aVar) {
        this.f121219d = aVar;
    }

    /* renamed from: com.ss.android.lark.money.redpacket.send.SendRedPacketView$a */
    public static class C48171a extends ClickableSpan {

        /* renamed from: a */
        private int f121230a;

        /* renamed from: b */
        private View.OnClickListener f121231b;

        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f121231b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f121230a);
            textPaint.setUnderlineText(false);
        }

        public C48171a(int i, View.OnClickListener onClickListener) {
            this.f121230a = i;
            this.f121231b = onClickListener;
        }
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: a */
    public void mo168595a(String str) {
        LKUIToast.show(this.f121217b, str);
    }

    /* renamed from: a */
    private void m190127a(boolean z) {
        if (z) {
            mo168602c(1);
        } else {
            m190137p();
        }
    }

    /* renamed from: d */
    private boolean m190130d(int i) {
        if (mo168598b(i) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private double m190125a(double d) {
        return new BigDecimal(String.valueOf(d)).setScale(2, RoundingMode.DOWN).doubleValue();
    }

    /* renamed from: b */
    public String mo168598b(int i) {
        if (i < 1) {
            return UIHelper.getString(R.string.Lark_Legacy_QuantityCantBeEmpty);
        }
        if (i > 5000) {
            return UIHelper.getString(R.string.Lark_Legacy_MaximumQuantityIs5000);
        }
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m190126a(View view) {
        long j;
        RedPacketHitPoint.HongbaoSendClickParams hongbaoSendClickParams = RedPacketHitPoint.HongbaoSendClickParams.HONGBAO_THEME;
        RedPacketCover redPacketCover = this.f121221f;
        if (redPacketCover == null) {
            j = -1;
        } else {
            j = redPacketCover.getId();
        }
        RedPacketHitPoint.m190214a(hongbaoSendClickParams, j);
        this.f121218c.mo168587a(this.f121221f);
    }

    /* renamed from: e */
    private void m190131e(int i) {
        int h;
        double f = mo168606f();
        if (f <= 0.0d || (h = mo168608h()) <= 0) {
            return;
        }
        if (i == -1) {
            this.vEditAmount.setText(C48033a.m189577a(m190125a(f / ((double) h))));
        } else if (i == 1) {
            this.vEditAmount.setText(C48033a.m189577a(mo168605e()));
        }
    }

    /* renamed from: c */
    public void mo168603c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.vEditCount.setSelected(false);
            UIUtils.invisible(this.vTextCountWarning);
            return;
        }
        this.vEditCount.setSelected(true);
        this.vTextCountWarning.setText(str);
        UIUtils.show(this.vTextCountWarning);
    }

    /* renamed from: b */
    public void mo168600b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.vEditAmount.setSelected(false);
            UIUtils.invisible(this.vTextAmountWarning);
            if (this.f121216a == 2) {
                UIUtils.hide(this.vLayoutAmountTips);
                return;
            }
            return;
        }
        this.vEditAmount.setSelected(true);
        this.vTextAmountWarning.setText(str);
        UIUtils.show(this.vTextAmountWarning);
    }

    /* renamed from: c */
    public void mo168602c(int i) {
        if (this.f121216a != i) {
            this.f121216a = i;
            m190131e(i);
            UIUtils.show(this.vLayoutAmountTips);
            UIUtils.show(this.vLayoutState);
            UIUtils.show(this.vLayoutCount);
            if (this.f121222i > 0) {
                this.vTextGroupMemberNum.setText(UIHelper.mustacheFormat(UIHelper.getString(R.string.Lark_Legacy_MemberCount), "member_number", Integer.toString(this.f121222i)));
                UIUtils.show(this.vLayoutCountTips);
            } else {
                UIUtils.invisible(this.vLayoutCountTips);
            }
            String string = UIHelper.getString(R.string.Lark_Legacy_SendHongbaoChangeToNormalHongbao);
            String string2 = UIHelper.getString(R.string.Lark_Legacy_SendHongbaoChangeToRandomHongbao);
            String string3 = UIHelper.getString(R.string.Lark_Legacy_NormalAmount);
            String string4 = UIHelper.getString(R.string.Lark_Legacy_RandomHongbao);
            this.vTextCurrentChangeState.setMovementMethod(LinkMovementMethod.getInstance());
            this.vTextCurrentChangeState.setHighlightColor(this.f121217b.getResources().getColor(R.color.lkui_transparent));
            if (i == -1) {
                this.vTextAmountName.setText(R.string.Lark_Legacy_SendHongbaoAmountEach);
                this.vTextCurrentChangeState.setText(m190128b(string2, string4));
            } else if (i == 1) {
                this.vTextAmountName.setText(R.string.Lark_Legacy_TotalAmount);
                this.vTextCurrentChangeState.setText(m190128b(string, string3));
            }
        }
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: a */
    public void mo168592a(int i) {
        mo168595a(UIUtils.getString(this.f121217b, i));
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: a */
    public void mo168593a(RedPacketCover redPacketCover) {
        String str;
        this.f121221f = redPacketCover;
        TextView textView = this.vCoverNameTv;
        if (redPacketCover != null) {
            str = redPacketCover.getName();
        } else {
            str = UIHelper.getString(R.string.Lark_RedPacket_Theme_Default);
        }
        textView.setText(str);
        RedPacketCover redPacketCover2 = this.f121221f;
        if (redPacketCover2 == null || redPacketCover2.getMainCover() == null) {
            this.vCoverMiddlePartIv.setImageResource(R.drawable.default_cover);
        } else {
            ImageLoader.with(this.f121217b).load(this.f121221f.getMainCover()).override(f121214g, f121215h).into(this.vCoverMiddlePartIv);
        }
    }

    /* renamed from: b */
    private boolean m190129b(double d, int i) {
        if (mo168590a(d, i) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private SpannableString m190128b(String str, String str2) {
        int i;
        int i2;
        SpannableString spannableString = new SpannableString(str);
        int length = str.length();
        if (str.contains(str2)) {
            i2 = str.indexOf(str2);
            i = str.indexOf(str2) + str2.length();
        } else {
            i = length;
            i2 = 0;
        }
        spannableString.setSpan(new C48171a(this.f121217b.getResources().getColor(R.color.text_link_normal), new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketView.View$OnClickListenerC481706 */

            public void onClick(View view) {
                SendRedPacketView sendRedPacketView = SendRedPacketView.this;
                sendRedPacketView.mo168602c(-sendRedPacketView.f121216a);
            }
        }), i2, i, 33);
        return spannableString;
    }

    /* renamed from: a */
    public String mo168590a(double d, int i) {
        int i2;
        int i3 = this.f121216a;
        if (i3 != 2) {
            if (i <= 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            if (i3 != -1) {
                if (i3 == 1) {
                    if (i != 0 && d - ((double) (i2 * LocationRequest.PRIORITY_HD_ACCURACY)) > 0.0d) {
                        return UIHelper.getString(R.string.Lark_Legacy_UpTo200CNYForEachHongbao);
                    }
                    if (d - (((double) i2) * 0.01d) < 0.0d) {
                        return UIHelper.getString(R.string.Lark_Legacy_AtLeast001CNY);
                    }
                    if (d - 49999.0d > 0.0d) {
                        return UIHelper.getString(R.string.Lark_Legacy_UpTo49999CNY);
                    }
                }
                return null;
            } else if (d - 0.01d < 0.0d) {
                return UIHelper.getString(R.string.Lark_Legacy_AtLeast001CNY);
            } else {
                if (d - 200.0d > 0.0d) {
                    return UIHelper.getString(R.string.Lark_Legacy_UpTo200CNYForEachHongbao);
                }
                if ((((double) i2) * d) - 49999.0d > 0.0d) {
                    return UIHelper.getString(R.string.Lark_Legacy_UpTo49999CNY);
                }
                return null;
            }
        } else if (d - 0.01d < 0.0d) {
            return UIHelper.getString(R.string.Lark_Legacy_AtLeast001CNY);
        } else {
            if (d - 200.0d > 0.0d) {
                return UIHelper.getString(R.string.Lark_Legacy_UpTo200CNY);
            }
            return null;
        }
    }

    @Override // com.ss.android.lark.money.redpacket.send.C48173a.AbstractC48175b
    /* renamed from: a */
    public void mo168596a(String str, String str2) {
        IMoneyModuleDependency.IContactDependency contactDependency = MoneyModule.getDependency().getContactDependency();
        Context context = this.f121217b;
        contactDependency.showApplyCollabDialog(context, str, str2, UIUtils.getString(context, R.string.Lark_NewContacts_NeedToAddToContactstHongbaoOneDialogContent), null);
    }

    public SendRedPacketView(Context context, AbstractC48172b bVar, boolean z, int i) {
        this.f121217b = context;
        this.f121218c = bVar;
        this.f121220e = z;
        this.f121222i = i;
    }
}
