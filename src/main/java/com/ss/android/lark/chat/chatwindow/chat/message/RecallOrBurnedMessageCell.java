package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34330a;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.span.RecogniseSpansResult;

public class RecallOrBurnedMessageCell extends AbstractC33290a<ContentVO<?>, RecallMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC33295e f85728a;

    /* renamed from: b */
    private final al f85729b = C29990c.m110930b().mo134596x();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return null;
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.recall_message_content;
    }

    /* access modifiers changed from: protected */
    public static class RecallMessageViewHolder extends AbstractC59010e {
        @BindView(8499)
        public TextView mReEditText;
        @BindView(8500)
        public LinkEmojiTextView mRecallText;

        protected RecallMessageViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128825a(view.getContext());
        }

        /* renamed from: a */
        private void m128825a(Context context) {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91856a(this.mReEditText, 17);
                C25649b.m91856a((TextView) this.mRecallText, 17);
                this.mReEditText.setCompoundDrawables(null, null, C33360a.m129160d(context, false), null);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<RecallMessageViewHolder> mo122650b() {
        return RecallMessageViewHolder.class;
    }

    public class RecallMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private RecallMessageViewHolder f85735a;

        @Override // butterknife.Unbinder
        public void unbind() {
            RecallMessageViewHolder recallMessageViewHolder = this.f85735a;
            if (recallMessageViewHolder != null) {
                this.f85735a = null;
                recallMessageViewHolder.mRecallText = null;
                recallMessageViewHolder.mReEditText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public RecallMessageViewHolder_ViewBinding(RecallMessageViewHolder recallMessageViewHolder, View view) {
            this.f85735a = recallMessageViewHolder;
            recallMessageViewHolder.mRecallText = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.recall_text, "field 'mRecallText'", LinkEmojiTextView.class);
            recallMessageViewHolder.mReEditText = (TextView) Utils.findRequiredViewAsType(view, R.id.recall_re_edit, "field 'mReEditText'", TextView.class);
        }
    }

    public RecallOrBurnedMessageCell(AbstractC33342d dVar, AbstractC33295e eVar) {
        super(dVar);
        this.f85728a = eVar;
    }

    /* renamed from: b */
    private void m128816b(RecallMessageViewHolder recallMessageViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        int c = C33360a.m129156c(aVar.mo121695c());
        int h = C33360a.m129164h(aVar.mo121695c());
        recallMessageViewHolder.mReEditText.getPaint().setFlags(recallMessageViewHolder.mReEditText.getPaint().getFlags() & -9);
        recallMessageViewHolder.mReEditText.getPaint().setAntiAlias(true);
        recallMessageViewHolder.mReEditText.setTextColor(h);
        recallMessageViewHolder.mRecallText.setTextColor(c);
        recallMessageViewHolder.mReEditText.setCompoundDrawables(null, null, C33360a.m129160d(mo122719d(), false), null);
        recallMessageViewHolder.mReEditText.setBackground(C33360a.m129170n(aVar.mo121695c()));
        recallMessageViewHolder.mRecallText.setTextColor(C33360a.m129156c(aVar.mo121695c()));
        C34330a.m133106a(recallMessageViewHolder.mRecallText, aVar.mo121695c());
        DesktopUtil.m144299a(recallMessageViewHolder.mReEditText);
        DesktopUtil.m144299a(recallMessageViewHolder.mRecallText);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(RecallMessageViewHolder recallMessageViewHolder, final AbsMessageVO<ContentVO<?>> aVar) {
        String str;
        super.mo122648a((AbstractC59010e) recallMessageViewHolder, (AbsMessageVO) aVar);
        m128816b(recallMessageViewHolder, aVar);
        final ContentVO<?> g = aVar.mo121699g();
        C33973b l = aVar.mo121704l();
        if (aVar.mo121706n() && aVar.mo121683a(this.f85729b.mo134462a())) {
            str = UIHelper.getString(R.string.Lark_Legacy_MessageBurned);
        } else if (l != null) {
            String b = C57814c.m224350b(l.mo124202c(), l.mo124205d());
            if (((aVar instanceof ChatMessageVO) || (aVar instanceof ThreadMessageVO)) && aVar.mo121660F()) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupAdminRecalledMsg, "GroupAdministrator", b);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MessageGroupRecallMessage, "recaller", b);
            }
            Log.m165389i("RecallOrBurnedMessageCell", "recallMessage by recaller");
        } else if (!(g instanceof AudioContentVO) || aVar.mo121698f()) {
            str = UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled);
            Log.m165389i("RecallOrBurnedMessageCell", "recallMessage by myself");
        } else {
            str = UIHelper.getString(R.string.Lark_Message_AudioMessageWithdraw);
        }
        recallMessageViewHolder.mRecallText.mo198363a((RecogniseSpansResult) null, str, false);
        recallMessageViewHolder.mRecallText.setAtStringClickListner(new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.RecallOrBurnedMessageCell.C332771 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                C29990c.m110930b().mo134523V().mo134436a(RecallOrBurnedMessageCell.this.mo122719d(), new ProfileSource.C36868a().mo136066c(str2).mo136065b(aVar.mo121692b()).mo136060a(2).mo136062a(C34339g.m133170d(RecallOrBurnedMessageCell.this.f85789d.mo122550n())).mo136063a());
            }
        });
        if (!aVar.mo121703k() || !aVar.mo121695c() || aVar.mo121704l() != null || this.f85728a == null) {
            recallMessageViewHolder.mReEditText.setVisibility(8);
            recallMessageViewHolder.mReEditText.setOnClickListener(null);
        } else {
            recallMessageViewHolder.mReEditText.setVisibility(0);
            recallMessageViewHolder.mReEditText.setText(UIHelper.getString(R.string.Lark_Legacy_Reedit));
            recallMessageViewHolder.mReEditText.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.RecallOrBurnedMessageCell.C332782 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (g instanceof BaseTextContentVO) {
                        RecallOrBurnedMessageCell.this.f85728a.mo122761a(aVar);
                    }
                }
            });
        }
        if (this.f85789d.mo122559w() && TextUtils.isEmpty(aVar.mo121700h()) && aVar.mo121713u()) {
            recallMessageViewHolder.mRecallText.setVisibility(0);
            recallMessageViewHolder.mRecallText.setText(R.string.Lark_Legacy_MessageRemove);
        }
    }
}
