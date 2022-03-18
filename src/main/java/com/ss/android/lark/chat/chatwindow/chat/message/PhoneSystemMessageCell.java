package com.ss.android.lark.chat.chatwindow.chat.message;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33303m;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34330a;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.span.RecogniseSpansResult;

public class PhoneSystemMessageCell extends AbstractC33290a<SystemContentVO, CallSystemMessageViewHolder> {

    /* renamed from: a */
    private long f85715a;

    /* renamed from: b */
    private final AbstractC33303m f85716b;

    /* renamed from: c */
    private final AbstractC36450aa f85717c;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.telephone_system_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return SystemContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<CallSystemMessageViewHolder> mo122650b() {
        return CallSystemMessageViewHolder.class;
    }

    public static class CallSystemMessageViewHolder extends AbstractC59010e {
        @BindView(7203)
        public ImageView mArrowIcon;
        @BindView(7348)
        public LinearLayout mCallBackLayout;
        @BindView(7349)
        public TextView mCallTV;
        @BindView(8924)
        public LinkEmojiTextView mTelePhoneSystemTV;

        /* renamed from: a */
        private void m128806a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.mTelePhoneSystemTV, LarkFont.TITLE3);
                C25649b.m91857a(this.mCallTV, LarkFont.TITLE3);
                C25649b.m91854a(this.mArrowIcon, 17, 16);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128806a();
        }
    }

    public class CallSystemMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private CallSystemMessageViewHolder f85721a;

        @Override // butterknife.Unbinder
        public void unbind() {
            CallSystemMessageViewHolder callSystemMessageViewHolder = this.f85721a;
            if (callSystemMessageViewHolder != null) {
                this.f85721a = null;
                callSystemMessageViewHolder.mTelePhoneSystemTV = null;
                callSystemMessageViewHolder.mCallBackLayout = null;
                callSystemMessageViewHolder.mCallTV = null;
                callSystemMessageViewHolder.mArrowIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public CallSystemMessageViewHolder_ViewBinding(CallSystemMessageViewHolder callSystemMessageViewHolder, View view) {
            this.f85721a = callSystemMessageViewHolder;
            callSystemMessageViewHolder.mTelePhoneSystemTV = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.telephone_system_message, "field 'mTelePhoneSystemTV'", LinkEmojiTextView.class);
            callSystemMessageViewHolder.mCallBackLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.call_back_layout, "field 'mCallBackLayout'", LinearLayout.class);
            callSystemMessageViewHolder.mCallTV = (TextView) Utils.findRequiredViewAsType(view, R.id.call_tv, "field 'mCallTV'", TextView.class);
            callSystemMessageViewHolder.mArrowIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.arrow_iv, "field 'mArrowIcon'", ImageView.class);
        }
    }

    /* renamed from: a */
    private String m128795a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SystemMessageCheckPhone, "user", SystemContent.Companion.mo125657a(str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128796a(boolean z, View view) {
        if (this.f85716b != null && System.currentTimeMillis() - this.f85715a >= 1000) {
            this.f85715a = System.currentTimeMillis();
            this.f85716b.mo122775a(z);
        }
    }

    /* renamed from: b */
    private void m128797b(CallSystemMessageViewHolder callSystemMessageViewHolder, AbsMessageVO<SystemContentVO> aVar) {
        callSystemMessageViewHolder.mCallTV.getPaint().setFlags(callSystemMessageViewHolder.mCallTV.getPaint().getFlags() & -9);
        Drawable iconDrawable = UDIconUtils.getIconDrawable(mo122719d(), (int) R.drawable.ud_icon_right_outlined, UIUtils.getColor(mo122719d(), R.color.primary_pri_600));
        callSystemMessageViewHolder.mTelePhoneSystemTV.setTextColor(C33360a.m129156c(aVar.mo121695c()));
        callSystemMessageViewHolder.mCallTV.setTextColor(UIUtils.getColor(mo122719d(), R.color.text_link_normal));
        callSystemMessageViewHolder.mArrowIcon.setImageDrawable(iconDrawable);
        C34330a.m133106a(callSystemMessageViewHolder.mTelePhoneSystemTV, aVar.mo121695c());
        DesktopUtil.m144299a(callSystemMessageViewHolder.mTelePhoneSystemTV);
        DesktopUtil.m144299a(callSystemMessageViewHolder.mCallTV);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final CallSystemMessageViewHolder callSystemMessageViewHolder, final AbsMessageVO<SystemContentVO> aVar) {
        String str;
        super.mo122648a((AbstractC59010e) callSystemMessageViewHolder, (AbsMessageVO) aVar);
        m128797b(callSystemMessageViewHolder, aVar);
        SystemContent systemContent = (SystemContent) aVar.mo121699g().mo126168z();
        callSystemMessageViewHolder.mTelePhoneSystemTV.setCurrentUserId(this.f85717c.mo134394a());
        if (systemContent != null) {
            boolean a = this.f85717c.mo134398a(systemContent.getContents().get("caller_id"));
            String str2 = systemContent.getContents().get("callee_id");
            C33973b o = this.f85789d.mo122551o();
            if (o == null || !o.mo124202c().equals(str2)) {
                str = "";
            } else {
                str = o.mo124214g();
            }
            if (TextUtils.isEmpty(str)) {
                str = systemContent.getContents().get("to_chatters");
            }
            callSystemMessageViewHolder.mTelePhoneSystemTV.mo198363a((RecogniseSpansResult) null, m128795a(str2, C57814c.m224350b(str2, str)), false);
            callSystemMessageViewHolder.mCallBackLayout.setVisibility(0);
            if (a) {
                callSystemMessageViewHolder.mCallTV.setText(UIHelper.getString(R.string.Lark_Legacy_SystemMessageCall));
            } else {
                callSystemMessageViewHolder.mCallTV.setText(UIHelper.getString(R.string.Lark_Legacy_CallBackPhone));
            }
            callSystemMessageViewHolder.mCallBackLayout.setOnClickListener(new View.OnClickListener(a) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$PhoneSystemMessageCell$AJ33eshHSxn4bELXgo5G9UFCNlw */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    PhoneSystemMessageCell.lambda$AJ33eshHSxn4bELXgo5G9UFCNlw(PhoneSystemMessageCell.this, this.f$1, view);
                }
            });
            callSystemMessageViewHolder.mTelePhoneSystemTV.setAtStringClickListner(new LinkEmojiTextView.AbstractC58521f() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.PhoneSystemMessageCell.C332751 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
                /* renamed from: b */
                public boolean mo117507b(View view, String str, String str2) {
                    return PhoneSystemMessageCell.this.mo122755b((AbstractC59010e) callSystemMessageViewHolder, (Object) aVar);
                }

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
                /* renamed from: c */
                public void mo120297c(View view, String str, String str2) {
                    C29990c.m110930b().mo134523V().mo134436a(PhoneSystemMessageCell.this.mo122719d(), new ProfileSource.C36868a().mo136066c(str2).mo136065b(aVar.mo121692b()).mo136060a(2).mo136062a(C34339g.m133170d(PhoneSystemMessageCell.this.f85789d.mo122550n())).mo136063a());
                }
            });
        }
        m128797b(callSystemMessageViewHolder, aVar);
    }
}
