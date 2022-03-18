package com.ss.android.lark.threaddetail.view.block;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2993y.p2994a.AbstractC59357a;
import com.ss.android.lark.p2993y.p2994a.AbstractC59358b;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ThreadDetailCommonBlock extends AbstractC59004b<ChatMessageVO, ThreadDetailCommonViewHolder> implements AbstractC59357a {

    /* renamed from: g */
    private static final boolean f138072g = C29990c.m110930b().mo134586n().mo134685a("lark.feed.reaction.optimize");

    /* renamed from: a */
    public final AbstractC55866b f138073a;

    /* renamed from: b */
    public final C55934b f138074b;

    /* renamed from: d */
    private final AbstractC36450aa f138075d = C29990c.m110930b().mo134515N();

    /* renamed from: e */
    private final Locale f138076e = C29990c.m110930b().mo134587o().mo134744c();

    /* renamed from: h */
    private final boolean f138077h;

    @Override // com.ss.android.lark.p2993y.p2994a.AbstractC59357a
    /* renamed from: a */
    public /* synthetic */ boolean mo122800a(AbstractC59358b bVar, ChatMessageVO cVar) {
        return AbstractC59357a.CC.$default$a(this, bVar, cVar);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadDetailCommonViewHolder extends AbstractC59010e implements AbstractC59358b {
        @BindView(7244)
        public ImageView mAvatarIV;
        @BindView(7259)
        public FrameLayout mAvatarWrapper;
        @BindView(7430)
        public UDCheckBox mCheckBox;
        @BindView(8941)
        public TextView mDateTV;
        @BindView(8977)
        public View mMaskView;
        @BindView(8287)
        public TextView mNameTV;
        @BindView(9293)
        public ReactionFlowLayout mReactionDetailView;
        @BindView(8773)
        public LKUILottieAnimationView mTranslateShowOriginLV;
        @BindView(9082)
        public TextView mTranslationFeedbackTV;
        @BindView(8498)
        public TextView mTvRecallDesc;

        ThreadDetailCommonViewHolder() {
        }

        @Override // com.ss.android.lark.p2993y.p2994a.AbstractC59358b
        /* renamed from: a */
        public LKUILottieAnimationView mo122801a() {
            return this.mTranslateShowOriginLV;
        }

        @Override // com.ss.android.lark.p2993y.p2994a.AbstractC59358b
        /* renamed from: b */
        public TextView mo122802b() {
            return this.mTranslationFeedbackTV;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public class ThreadDetailCommonViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadDetailCommonViewHolder f138089a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadDetailCommonViewHolder threadDetailCommonViewHolder = this.f138089a;
            if (threadDetailCommonViewHolder != null) {
                this.f138089a = null;
                threadDetailCommonViewHolder.mCheckBox = null;
                threadDetailCommonViewHolder.mMaskView = null;
                threadDetailCommonViewHolder.mAvatarIV = null;
                threadDetailCommonViewHolder.mAvatarWrapper = null;
                threadDetailCommonViewHolder.mNameTV = null;
                threadDetailCommonViewHolder.mDateTV = null;
                threadDetailCommonViewHolder.mReactionDetailView = null;
                threadDetailCommonViewHolder.mTvRecallDesc = null;
                threadDetailCommonViewHolder.mTranslateShowOriginLV = null;
                threadDetailCommonViewHolder.mTranslationFeedbackTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadDetailCommonViewHolder_ViewBinding(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, View view) {
            this.f138089a = threadDetailCommonViewHolder;
            threadDetailCommonViewHolder.mCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.choose_message_checkbox, "field 'mCheckBox'", UDCheckBox.class);
            threadDetailCommonViewHolder.mMaskView = Utils.findRequiredView(view, R.id.thread_item_mask, "field 'mMaskView'");
            threadDetailCommonViewHolder.mAvatarIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mAvatarIV'", ImageView.class);
            threadDetailCommonViewHolder.mAvatarWrapper = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.avatar_wrapper, "field 'mAvatarWrapper'", FrameLayout.class);
            threadDetailCommonViewHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
            threadDetailCommonViewHolder.mDateTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text_date, "field 'mDateTV'", TextView.class);
            threadDetailCommonViewHolder.mReactionDetailView = (ReactionFlowLayout) Utils.findRequiredViewAsType(view, R.id.view_reaction_detail, "field 'mReactionDetailView'", ReactionFlowLayout.class);
            threadDetailCommonViewHolder.mTvRecallDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.recall_desc, "field 'mTvRecallDesc'", TextView.class);
            threadDetailCommonViewHolder.mTranslateShowOriginLV = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.show_translate_origin_lv, "field 'mTranslateShowOriginLV'", LKUILottieAnimationView.class);
            threadDetailCommonViewHolder.mTranslationFeedbackTV = (TextView) Utils.findRequiredViewAsType(view, R.id.translation_feedback_tv, "field 'mTranslationFeedbackTV'", TextView.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m217055a(String str) {
        this.f138073a.mo190476h(str);
    }

    /* renamed from: a */
    private String m217052a(long j) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191599b(!C29990c.m110930b().mo134524W().mo134469a());
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219292g(UIHelper.getContext(), new Date(j), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m217053a(ChatMessageVO cVar, View view) {
        AbstractC55866b bVar = this.f138073a;
        if (bVar != null) {
            bVar.mo190477i(cVar.mo121681a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m217054a(ChatMessageVO cVar, String str) {
        this.f138073a.mo190468b(cVar.mo121658D(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo190561c(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, final ChatMessageVO cVar) {
        if (mo122800a((AbstractC59358b) threadDetailCommonViewHolder, cVar)) {
            C25649b.m91856a(threadDetailCommonViewHolder.mTranslationFeedbackTV, 12);
            threadDetailCommonViewHolder.mTranslationFeedbackTV.setOnClickListener(new View.OnClickListener(cVar) {
                /* class com.ss.android.lark.threaddetail.view.block.$$Lambda$ThreadDetailCommonBlock$RublS2GeoCeTGSOEkC1tSXff93s */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    ThreadDetailCommonBlock.lambda$RublS2GeoCeTGSOEkC1tSXff93s(ThreadDetailCommonBlock.this, this.f$1, view);
                }
            });
            threadDetailCommonViewHolder.mTranslateShowOriginLV.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock.C559014 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (ThreadDetailCommonBlock.this.f138073a != null) {
                        ThreadDetailCommonBlock.this.f138073a.mo190447a(view, cVar);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m217056b(ChatMessageVO cVar, String str) {
        boolean a = C35249h.m137636a(cVar.mo121658D(), str, this.f138075d.mo134394a());
        AbstractC55866b bVar = this.f138073a;
        if (bVar == null) {
            return;
        }
        if (a) {
            MessageHitPoint.f135779d.mo187531a(cVar.mo121681a(), Integer.valueOf(cVar.mo121710r().getNumber()), cVar.mo121692b(), str, 5, 0, null);
            this.f138073a.mo190467b(cVar.mo121681a(), str);
            return;
        }
        bVar.mo190458a(cVar.mo121681a(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo190560b(final ThreadDetailCommonViewHolder threadDetailCommonViewHolder, final ChatMessageVO cVar) {
        if (this.f138074b.mo122553q()) {
            threadDetailCommonViewHolder.mCheckBox.setVisibility(0);
            threadDetailCommonViewHolder.mMaskView.setVisibility(0);
            if (this.f138074b.mo190686a(threadDetailCommonViewHolder.mo200148l())) {
                threadDetailCommonViewHolder.mCheckBox.setChecked(true);
                threadDetailCommonViewHolder.f146209n.setBackgroundColor(UIHelper.getColor(R.color.bg_base));
            } else {
                threadDetailCommonViewHolder.mCheckBox.setChecked(false);
                threadDetailCommonViewHolder.f146209n.setBackgroundColor(UIHelper.getColor(R.color.lkui_transparent));
            }
            if (cVar.ai()) {
                threadDetailCommonViewHolder.mCheckBox.setVisibility(4);
            } else {
                threadDetailCommonViewHolder.mMaskView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock.View$OnClickListenerC559003 */

                    public void onClick(View view) {
                        if (ThreadDetailCommonBlock.this.f138073a != null) {
                            ThreadDetailCommonBlock.this.f138073a.mo190443a(threadDetailCommonViewHolder.mo200148l(), cVar);
                        }
                    }
                });
            }
        } else {
            threadDetailCommonViewHolder.mCheckBox.setVisibility(8);
            threadDetailCommonViewHolder.mMaskView.setVisibility(8);
            threadDetailCommonViewHolder.mMaskView.setOnClickListener(null);
            threadDetailCommonViewHolder.f146209n.setBackgroundColor(UIHelper.getColor(R.color.lkui_transparent));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, ChatMessageVO cVar) {
        int i;
        if (cVar.mo124235H()) {
            threadDetailCommonViewHolder.mAvatarIV.setVisibility(8);
            return;
        }
        C33973b C = cVar.mo121657C();
        if (cVar.mo124243P()) {
            i = 32;
        } else {
            i = 30;
        }
        mo190556a(threadDetailCommonViewHolder, C, i, cVar);
        mo190559a(threadDetailCommonViewHolder, cVar.mo121681a());
        mo190555a(threadDetailCommonViewHolder, cVar.mo121716x(), cVar.mo121656B());
        mo190558a(threadDetailCommonViewHolder, cVar, cVar.mo121656B());
        mo190560b(threadDetailCommonViewHolder, cVar);
        mo190561c(threadDetailCommonViewHolder, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190559a(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, String str) {
        threadDetailCommonViewHolder.mTvRecallDesc.setVisibility(8);
    }

    public ThreadDetailCommonBlock(C55934b bVar, boolean z, AbstractC55866b bVar2) {
        this.f138074b = bVar;
        this.f138077h = z;
        this.f138073a = bVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190555a(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, long j, SendStatus sendStatus) {
        int i;
        if (sendStatus == SendStatus.SUCCESS) {
            threadDetailCommonViewHolder.mDateTV.setVisibility(0);
            threadDetailCommonViewHolder.mDateTV.setText(m217052a(j * 1000));
        } else {
            threadDetailCommonViewHolder.mDateTV.setVisibility(8);
        }
        TextView textView = threadDetailCommonViewHolder.mDateTV;
        if (this.f138077h) {
            i = 12;
        } else {
            i = 11;
        }
        C25649b.m91856a(textView, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190558a(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, ChatMessageVO cVar, SendStatus sendStatus) {
        int i;
        if (cVar.mo121655A() == Message.Status.DELETED) {
            threadDetailCommonViewHolder.mReactionDetailView.setVisibility(8);
            threadDetailCommonViewHolder.mReactionDetailView.setup(null);
            return;
        }
        threadDetailCommonViewHolder.mReactionDetailView.setDisplayChangeEnable(true);
        if (!cVar.ah() || sendStatus != SendStatus.SUCCESS) {
            threadDetailCommonViewHolder.mReactionDetailView.setVisibility(8);
            threadDetailCommonViewHolder.mReactionDetailView.setup(null);
            return;
        }
        List<ReactionInfo> D = cVar.mo121658D();
        threadDetailCommonViewHolder.mReactionDetailView.setTagBackgroundColor(0);
        threadDetailCommonViewHolder.mReactionDetailView.setDivideLineColor(C33360a.m129161e(false));
        threadDetailCommonViewHolder.mReactionDetailView.setTextColor(C33360a.m129159d(false));
        String a = this.f138075d.mo134394a();
        threadDetailCommonViewHolder.mReactionDetailView.setMaxNameCount(5);
        ReactionFlowLayout reactionFlowLayout = threadDetailCommonViewHolder.mReactionDetailView;
        boolean z = f138072g;
        reactionFlowLayout.setNewReactionEnable(z);
        if (z) {
            int dp2px = UIUtils.dp2px(this.f138074b.mo122543g(), 6.0f);
            threadDetailCommonViewHolder.mReactionDetailView.setReactionLeftMargin(dp2px);
            int screenWidth = DeviceUtils.getScreenWidth(this.f138074b.mo122543g()) - dp2px;
            if (this.f138077h) {
                i = UIUtils.dp2px(this.f138074b.mo122543g(), 16.0f) * 2;
            } else {
                screenWidth -= UIUtils.dp2px(this.f138074b.mo122543g(), 16.0f);
                i = LKUIDisplayManager.m91881c(this.f138074b.mo122543g(), 48);
            }
            int i2 = screenWidth - i;
            if (this.f138074b.mo122553q()) {
                i2 -= UIUtils.dp2px(this.f138074b.mo122543g(), 36.0f);
            }
            threadDetailCommonViewHolder.mReactionDetailView.setReactionMaxWidth(i2);
        }
        threadDetailCommonViewHolder.mReactionDetailView.setup(C35237c.m137596a(a, false, D));
        threadDetailCommonViewHolder.mReactionDetailView.setVisibility(0);
        threadDetailCommonViewHolder.mReactionDetailView.setReactionClickListener(new ReactionBaseFlowLayout.AbstractC53049d(cVar) {
            /* class com.ss.android.lark.threaddetail.view.block.$$Lambda$ThreadDetailCommonBlock$lfw7FxFw4XCuuGCMHsiHOUkNx9M */
            public final /* synthetic */ ChatMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
            public final void onReactionClicked(String str) {
                ThreadDetailCommonBlock.lambda$lfw7FxFw4XCuuGCMHsiHOUkNx9M(ThreadDetailCommonBlock.this, this.f$1, str);
            }
        });
        threadDetailCommonViewHolder.mReactionDetailView.setOnReactionNameTrigger(new ReactionBaseFlowLayout.AbstractC53046a() {
            /* class com.ss.android.lark.threaddetail.view.block.$$Lambda$ThreadDetailCommonBlock$RHapT8R3lgLkja3CAvXUtSq_WM8 */

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
            public final void perform(String str) {
                ThreadDetailCommonBlock.lambda$RHapT8R3lgLkja3CAvXUtSq_WM8(ThreadDetailCommonBlock.this, str);
            }
        });
        threadDetailCommonViewHolder.mReactionDetailView.setOnReactionMoreTrigger(new ReactionBaseFlowLayout.AbstractC53047b(cVar) {
            /* class com.ss.android.lark.threaddetail.view.block.$$Lambda$ThreadDetailCommonBlock$J2dKv8TQQLIMizmnZmbixl73iug */
            public final /* synthetic */ ChatMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
            public final void perform(String str) {
                ThreadDetailCommonBlock.lambda$J2dKv8TQQLIMizmnZmbixl73iug(ThreadDetailCommonBlock.this, this.f$1, str);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190556a(ThreadDetailCommonViewHolder threadDetailCommonViewHolder, final C33973b bVar, int i, final ChatMessageVO cVar) {
        threadDetailCommonViewHolder.mAvatarIV.setVisibility(0);
        if (bVar != null) {
            final String d = bVar.mo124205d();
            threadDetailCommonViewHolder.mNameTV.setText(d);
            float f = (float) i;
            C34336c.m133130a(this.f138074b.mo122543g(), threadDetailCommonViewHolder.mAvatarIV, bVar.mo124216h(), bVar.mo124202c(), UIHelper.dp2px(f), UIHelper.dp2px(f), Scene.Thread);
            threadDetailCommonViewHolder.mAvatarIV.setOnClickListener(new AbstractView$OnClickListenerC58542c() {
                /* class com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock.C558981 */

                @Override // com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c
                /* renamed from: a */
                public void mo123648a(View view) {
                    if (bVar.mo124230r()) {
                        Log.m165389i("ThreadDetailCommonBlock", "chatter is anonymous block avatar click");
                        return;
                    }
                    if (ThreadDetailCommonBlock.this.f138073a != null) {
                        ThreadDetailCommonBlock.this.f138073a.mo190475g(bVar.mo124202c());
                    }
                    ThreadTopicHitPointNew.f135908b.mo187753a(ThreadDetailCommonBlock.this.f138074b.mo122550n(), ThreadDetailCommonBlock.this.f138074b.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(cVar, "icon", (String) null, (String) null));
                }
            });
            threadDetailCommonViewHolder.mAvatarIV.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock.View$OnLongClickListenerC558992 */

                public boolean onLongClick(View view) {
                    if (bVar.mo124230r()) {
                        Log.m165389i("ThreadDetailCommonBlock", "chatter is anonymous block avatar click");
                        return false;
                    } else if (ThreadDetailCommonBlock.this.f138073a != null) {
                        return ThreadDetailCommonBlock.this.f138073a.mo190463a(d, bVar.mo124202c(), bVar.mo124230r());
                    } else {
                        return false;
                    }
                }
            });
        } else {
            threadDetailCommonViewHolder.mNameTV.setText("");
            threadDetailCommonViewHolder.mAvatarIV.setImageResource(0);
        }
        if (DesktopUtil.m144301a((Context) this.f138074b.mo122543g())) {
            DesktopUtil.m144299a(threadDetailCommonViewHolder.mNameTV);
            return;
        }
        C25649b.m91856a(threadDetailCommonViewHolder.mNameTV, 14);
        if (this.f138077h) {
            C25649b.m91853a(threadDetailCommonViewHolder.mAvatarIV, 40);
            threadDetailCommonViewHolder.mNameTV.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138074b.mo122543g(), 20);
            return;
        }
        C25649b.m91853a(threadDetailCommonViewHolder.mAvatarIV, 24);
        threadDetailCommonViewHolder.mAvatarWrapper.getLayoutParams().width = LKUIDisplayManager.m91881c(this.f138074b.mo122543g(), 48);
        threadDetailCommonViewHolder.mAvatarWrapper.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138074b.mo122543g(), 48);
    }
}
