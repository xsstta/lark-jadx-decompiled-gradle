package com.ss.android.lark.chat.chatwindow.chat.message.block;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.block.MessageTranslateBlock;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.p2993y.p2994a.AbstractC59357a;
import com.ss.android.lark.p2993y.p2994a.AbstractC59358b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class MessageTranslateBlock extends AbstractC59004b<ChatMessageVO, TranslateHolder> implements AbstractC59357a {

    /* renamed from: a */
    AbstractC33307q f85805a;

    /* renamed from: b */
    private final AbstractC33342d f85806b;

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

    public static class TranslateHolder extends AbstractC59010e implements AbstractC59358b {
        @BindView(8773)
        public LKUILottieAnimationView mTranslateShowOriginLV;
        @BindView(9082)
        public TextView mTranslationFeedbackTV;

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
            C25649b.m91856a(this.mTranslationFeedbackTV, 12);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<TranslateHolder> mo122650b() {
        return TranslateHolder.class;
    }

    public class TranslateHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TranslateHolder f85807a;

        @Override // butterknife.Unbinder
        public void unbind() {
            TranslateHolder translateHolder = this.f85807a;
            if (translateHolder != null) {
                this.f85807a = null;
                translateHolder.mTranslateShowOriginLV = null;
                translateHolder.mTranslationFeedbackTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TranslateHolder_ViewBinding(TranslateHolder translateHolder, View view) {
            this.f85807a = translateHolder;
            translateHolder.mTranslateShowOriginLV = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.show_translate_origin_lv, "field 'mTranslateShowOriginLV'", LKUILottieAnimationView.class);
            translateHolder.mTranslationFeedbackTV = (TextView) Utils.findRequiredViewAsType(view, R.id.translation_feedback_tv, "field 'mTranslationFeedbackTV'", TextView.class);
        }
    }

    public MessageTranslateBlock(AbstractC33342d dVar, AbstractC33307q qVar) {
        this.f85806b = dVar;
        this.f85805a = qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128951a(ChatMessageVO cVar, View view) {
        AbstractC33307q qVar = this.f85805a;
        if (qVar != null) {
            qVar.mo122780s(cVar.mo121681a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(TranslateHolder translateHolder, ChatMessageVO cVar) {
        if (mo122800a((AbstractC59358b) translateHolder, cVar)) {
            if (!this.f85806b.mo122539c() && f147354c) {
                UIUtils.hide(translateHolder.mTranslationFeedbackTV);
            }
            UIUtils.disableAllParentClipChild(translateHolder.mTranslateShowOriginLV);
            UIUtils.disableAllParentClipChild(translateHolder.mTranslationFeedbackTV);
            translateHolder.mTranslateShowOriginLV.setOnClickListener(new View.OnClickListener(translateHolder, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageTranslateBlock$YGthf0aEnCvWvR185Js8mAeQfi0 */
                public final /* synthetic */ MessageTranslateBlock.TranslateHolder f$1;
                public final /* synthetic */ ChatMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    MessageTranslateBlock.this.m128954c(this.f$1, this.f$2, view);
                }
            });
            translateHolder.mTranslateShowOriginLV.setOnLongClickListener(new View.OnLongClickListener(translateHolder, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageTranslateBlock$BmBzMhUtRwKJ5e6fbba4NERGXzw */
                public final /* synthetic */ MessageTranslateBlock.TranslateHolder f$1;
                public final /* synthetic */ ChatMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return MessageTranslateBlock.this.m128953b(this.f$1, this.f$2, view);
                }
            });
            translateHolder.mTranslationFeedbackTV.setOnClickListener(new View.OnClickListener(cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageTranslateBlock$OG1XWTCKAX7ESS2IVKk3khbQK5M */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    MessageTranslateBlock.this.m128951a((MessageTranslateBlock) this.f$1, (ChatMessageVO) view);
                }
            });
            translateHolder.mTranslationFeedbackTV.setOnLongClickListener(new View.OnLongClickListener(translateHolder, cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$MessageTranslateBlock$I1e9VXF37frGTZl4H3r7yv8c4 */
                public final /* synthetic */ MessageTranslateBlock.TranslateHolder f$1;
                public final /* synthetic */ ChatMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return MessageTranslateBlock.this.m128952a(this.f$1, this.f$2, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128952a(TranslateHolder translateHolder, ChatMessageVO cVar, View view) {
        return mo122755b(translateHolder, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m128953b(TranslateHolder translateHolder, ChatMessageVO cVar, View view) {
        return mo122755b(translateHolder, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m128954c(TranslateHolder translateHolder, ChatMessageVO cVar, View view) {
        boolean z;
        if (this.f85805a != null) {
            Boolean bool = (Boolean) view.getTag(R.id.translate_show_origin_tag);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                this.f85805a.mo122778a(translateHolder.mTranslateShowOriginLV, cVar);
            } else {
                this.f85805a.mo122779r(cVar.mo121681a());
            }
        }
    }
}
