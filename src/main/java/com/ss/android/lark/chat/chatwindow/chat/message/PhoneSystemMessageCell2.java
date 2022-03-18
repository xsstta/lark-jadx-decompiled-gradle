package com.ss.android.lark.chat.chatwindow.chat.message;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33303m;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.utils.C34365w;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class PhoneSystemMessageCell2 extends AbstractC33290a<SystemContentVO, CallSystemMessageViewHolder> {

    /* renamed from: a */
    public long f85722a;

    /* renamed from: b */
    public final AbstractC33303m f85723b;

    /* renamed from: c */
    private final AbstractC36450aa f85724c = C29990c.m110930b().mo134515N();

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.activity_chat_window_system_item_new;
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

    public class CallSystemMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private CallSystemMessageViewHolder f85727a;

        @Override // butterknife.Unbinder
        public void unbind() {
            CallSystemMessageViewHolder callSystemMessageViewHolder = this.f85727a;
            if (callSystemMessageViewHolder != null) {
                this.f85727a = null;
                callSystemMessageViewHolder.mRedPacketSystemIV = null;
                callSystemMessageViewHolder.mSystemTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public CallSystemMessageViewHolder_ViewBinding(CallSystemMessageViewHolder callSystemMessageViewHolder, View view) {
            this.f85727a = callSystemMessageViewHolder;
            callSystemMessageViewHolder.mRedPacketSystemIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.red_packet_system_iv, "field 'mRedPacketSystemIV'", ImageView.class);
            callSystemMessageViewHolder.mSystemTV = (TextView) Utils.findRequiredViewAsType(view, R.id.system_label, "field 'mSystemTV'", TextView.class);
        }
    }

    public static class CallSystemMessageViewHolder extends AbstractC59010e {
        @BindView(8533)
        public ImageView mRedPacketSystemIV;
        @BindView(8887)
        public TextView mSystemTV;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.mSystemTV.setHighlightColor(C57582a.m223616d(view.getContext(), R.color.color_transparent));
            this.mSystemTV.setTextSize(0, LKUIDisplayManager.m91864a(view.getContext(), 14));
        }
    }

    public PhoneSystemMessageCell2(AbstractC33342d dVar, AbstractC33303m mVar) {
        super(dVar);
        this.f85723b = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(CallSystemMessageViewHolder callSystemMessageViewHolder, AbsMessageVO<SystemContentVO> aVar) {
        super.mo122648a((AbstractC59010e) callSystemMessageViewHolder, (AbsMessageVO) aVar);
        SystemContent systemContent = (SystemContent) aVar.mo121699g().mo126168z();
        final boolean a = this.f85724c.mo134398a(systemContent.getContents().get("caller_id"));
        CharSequence a2 = C34365w.m133279a(mo122719d(), systemContent, aVar.mo121692b(), aVar.mo121681a(), this.f85789d.mo122540d(), new AbstractView$OnClickListenerC52989b(500) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.PhoneSystemMessageCell2.C332761 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                if (PhoneSystemMessageCell2.this.f85723b != null && System.currentTimeMillis() - PhoneSystemMessageCell2.this.f85722a >= 1000) {
                    PhoneSystemMessageCell2.this.f85722a = System.currentTimeMillis();
                    PhoneSystemMessageCell2.this.f85723b.mo122775a(a);
                }
            }
        }, a);
        if (TextUtils.isEmpty(a2)) {
            callSystemMessageViewHolder.mSystemTV.setText("");
            return;
        }
        if (a2 instanceof SpannableStringBuilder) {
            callSystemMessageViewHolder.mSystemTV.setMovementMethod(LinkMovementMethod.getInstance());
        }
        callSystemMessageViewHolder.mSystemTV.setText(a2);
        callSystemMessageViewHolder.mRedPacketSystemIV.setVisibility(8);
    }
}
