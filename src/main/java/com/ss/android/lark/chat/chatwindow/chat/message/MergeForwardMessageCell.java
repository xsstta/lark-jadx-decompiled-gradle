package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.base.view.vo.message.MergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.mergeforward.C45275c;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class MergeForwardMessageCell extends AbstractC33290a<MergeForwardContentVO, MergeForwardMessageViewHolder> {

    /* renamed from: a */
    private final int f85680a;

    /* renamed from: b */
    private final int f85681b;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.merge_forward_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return MergeForwardContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<MergeForwardMessageViewHolder> mo122650b() {
        return MergeForwardMessageViewHolder.class;
    }

    public class MergeForwardMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MergeForwardMessageViewHolder f85682a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MergeForwardMessageViewHolder mergeForwardMessageViewHolder = this.f85682a;
            if (mergeForwardMessageViewHolder != null) {
                this.f85682a = null;
                mergeForwardMessageViewHolder.mTitleTV = null;
                mergeForwardMessageViewHolder.mContentTV = null;
                mergeForwardMessageViewHolder.mRootView = null;
                mergeForwardMessageViewHolder.mLabel = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MergeForwardMessageViewHolder_ViewBinding(MergeForwardMessageViewHolder mergeForwardMessageViewHolder, View view) {
            this.f85682a = mergeForwardMessageViewHolder;
            mergeForwardMessageViewHolder.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_title, "field 'mTitleTV'", TextView.class);
            mergeForwardMessageViewHolder.mContentTV = (LKUILightTextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_content, "field 'mContentTV'", LKUILightTextView.class);
            mergeForwardMessageViewHolder.mRootView = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRootView'", ConstraintLayout.class);
            mergeForwardMessageViewHolder.mLabel = Utils.findRequiredView(view, R.id.label, "field 'mLabel'");
        }
    }

    public MergeForwardMessageCell(AbstractC33342d dVar) {
        this(dVar, 0, 0);
    }

    public static class MergeForwardMessageViewHolder extends AbstractC59010e {
        @BindView(8182)
        public LKUILightTextView mContentTV;
        @BindView(7971)
        public View mLabel;
        @BindView(8596)
        public ConstraintLayout mRootView;
        @BindView(8187)
        public TextView mTitleTV;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128748a(view.getContext());
        }

        /* renamed from: a */
        private void m128748a(Context context) {
            if (!DesktopUtil.m144307b()) {
                LKUILightTextView lKUILightTextView = this.mContentTV;
                lKUILightTextView.setTextSize((int) LKUIDisplayManager.m91865a(lKUILightTextView.getContext(), LarkFont.BODY1));
                C25649b.m91857a(this.mTitleTV, LarkFont.TITLE4);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.mLabel.getLayoutParams();
                int c = LKUIDisplayManager.m91881c(context, 4);
                layoutParams.width = LKUIDisplayManager.m91881c(context, 2);
                layoutParams.setMargins(0, c, 0, c);
                this.mLabel.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: c */
    private void m128739c(MergeForwardMessageViewHolder mergeForwardMessageViewHolder, AbsMessageVO<MergeForwardContentVO> aVar) {
        int c = C52990a.m205239c(mo122719d(), R.color.text_title);
        int c2 = C52990a.m205239c(mo122719d(), R.color.text_caption);
        DesktopUtil.m144299a(mergeForwardMessageViewHolder.mTitleTV);
        mergeForwardMessageViewHolder.mTitleTV.setTextColor(c);
        mergeForwardMessageViewHolder.mContentTV.setTextColor(c2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(MergeForwardMessageViewHolder mergeForwardMessageViewHolder, AbsMessageVO<MergeForwardContentVO> aVar) {
        Drawable drawable;
        super.mo122648a((AbstractC59010e) mergeForwardMessageViewHolder, (AbsMessageVO) aVar);
        C29597a a = aVar.mo121699g().mo121875a();
        if (a != null) {
            mergeForwardMessageViewHolder.mTitleTV.setText(a.f74159a);
            mergeForwardMessageViewHolder.mContentTV.setMaxLines(4);
            mergeForwardMessageViewHolder.mContentTV.setEllipsize(TextUtils.TruncateAt.END);
            mergeForwardMessageViewHolder.mContentTV.setTextColor(mergeForwardMessageViewHolder.mContentTV.getContext().getResources().getColor(R.color.text_caption));
            mergeForwardMessageViewHolder.mContentTV.setTextSize((int) UIHelper.sp2px(14.0f));
            mergeForwardMessageViewHolder.mContentTV.setContentText(a.f74160b);
        }
        mergeForwardMessageViewHolder.mRootView.setOnClickListener(new View.OnClickListener(mergeForwardMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MergeForwardMessageCell$qCW4WtD_kpxRh6m_Wze3A4N81ro */
            public final /* synthetic */ MergeForwardMessageCell.MergeForwardMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                MergeForwardMessageCell.lambda$qCW4WtD_kpxRh6m_Wze3A4N81ro(MergeForwardMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        mergeForwardMessageViewHolder.mRootView.setOnLongClickListener(new View.OnLongClickListener(mergeForwardMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MergeForwardMessageCell$nML4LJG7jXIqI4qhs9CqeWZAwNc */
            public final /* synthetic */ MergeForwardMessageCell.MergeForwardMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return MergeForwardMessageCell.lambda$nML4LJG7jXIqI4qhs9CqeWZAwNc(MergeForwardMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        ConstraintLayout constraintLayout = mergeForwardMessageViewHolder.mRootView;
        if (this.f85681b == 0) {
            drawable = null;
        } else {
            drawable = this.f85789d.mo122543g().getDrawable(this.f85681b);
        }
        constraintLayout.setBackground(drawable);
        ConstraintLayout constraintLayout2 = mergeForwardMessageViewHolder.mRootView;
        int i = this.f85680a;
        constraintLayout2.setPadding(i, i, i, i);
        m128739c(mergeForwardMessageViewHolder, aVar);
        if (DesktopUtil.m144301a((Context) this.f85789d.mo122543g())) {
            mergeForwardMessageViewHolder.mRootView.getLayoutParams().width = UIHelper.dp2px(332.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(MergeForwardMessageViewHolder mergeForwardMessageViewHolder, AbsMessageVO<MergeForwardContentVO> aVar) {
        MergeForwardContent mergeForwardContent;
        MergeForwardContentVO g = aVar.mo121699g();
        ((MergeForwardContent) g.mo126168z()).setTranslated(g.mo121814i());
        ((MergeForwardContent) g.mo126168z()).setManualTranslated(g.mo121927v());
        ((MergeForwardContent) g.mo126168z()).setMessageId(aVar.mo121681a());
        Context d = mo122719d();
        String b = aVar.mo121692b();
        MergeForwardContent mergeForwardContent2 = (MergeForwardContent) g.mo126168z();
        if (g.mo121930y() != null) {
            mergeForwardContent = (MergeForwardContent) g.mo121930y().mo126168z();
        } else {
            mergeForwardContent = null;
        }
        C45275c.m179793a(d, b, mergeForwardContent2, mergeForwardContent);
        if (this.f85789d.mo122560x() && (this.f85789d instanceof C55934b)) {
            C55934b bVar = (C55934b) this.f85789d;
            ThreadTopicHitPointNew.f135908b.mo187753a(bVar.mo122550n(), bVar.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(aVar, "mergeForward", (String) null, (String) null));
        } else if (!this.f85789d.mo122559w()) {
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "mergeforward", ChatHitPointNew.f135660c.mo187391b("mergeforward"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m128738b(MergeForwardMessageViewHolder mergeForwardMessageViewHolder, AbsMessageVO aVar, View view) {
        mo122683c(mergeForwardMessageViewHolder, (AbsMessageVO<MergeForwardContentVO>) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128737a(MergeForwardMessageViewHolder mergeForwardMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) mergeForwardMessageViewHolder, (Object) aVar);
    }

    public MergeForwardMessageCell(AbstractC33342d dVar, int i, int i2) {
        super(dVar);
        this.f85680a = i;
        this.f85681b = i2;
    }
}
