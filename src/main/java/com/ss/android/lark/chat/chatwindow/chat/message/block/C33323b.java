package com.ss.android.lark.chat.chatwindow.chat.message.block;

import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.LayoutSizeHelper;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33304n;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.reaction.ReactionHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.b */
public class C33323b extends AbstractC59004b<ChatMessageVO, C33324a> {

    /* renamed from: a */
    private static final boolean f85844a = C29990c.m110930b().mo134586n().mo134685a("lark.feed.reaction.optimize");

    /* renamed from: b */
    private final AbstractC33304n f85845b;

    /* renamed from: c */
    private final AbstractC36450aa f85846c = C29990c.m110930b().mo134515N();

    /* renamed from: d */
    private final AbstractC34072a<? extends ContentVO> f85847d;

    /* renamed from: e */
    private final AbstractC33342d f85848e;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.block.b$a */
    public static class C33324a extends AbstractC59010e {

        /* renamed from: a */
        public View f85849a;

        /* renamed from: b */
        public ReactionFlowLayout f85850b;

        C33324a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            this.f85849a = view.findViewById(R.id.reaction_divider);
            this.f85850b = (ReactionFlowLayout) view.findViewById(R.id.view_reaction);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<C33324a> mo122650b() {
        return C33324a.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129011a(ChatMessageVO cVar, String str) {
        AbstractC33304n nVar = this.f85845b;
        if (nVar != null) {
            nVar.mo122265a(cVar.mo121681a(), str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129014b(ChatMessageVO cVar, String str) {
        if (str != null) {
            m129012a(cVar, "none", "profile");
            C29990c.m110930b().mo134523V().mo134436a(this.f85848e.mo122543g(), new ProfileSource.C36868a().mo136066c(str).mo136060a(4).mo136062a(C34339g.m133170d(this.f85848e.mo122550n())).mo136063a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(C33324a aVar, ChatMessageVO cVar) {
        C34034b bVar;
        int[] iArr;
        boolean z;
        AbstractC34072a<? extends ContentVO> aVar2 = this.f85847d;
        if (aVar2 != null) {
            bVar = aVar2.mo122836a(cVar);
        } else {
            bVar = null;
        }
        ReactionHitPoint.f135903c.mo187699a(cVar.mo121681a());
        int i = 8;
        if (cVar.mo121698f() || cVar.mo124251X() || !cVar.ah()) {
            aVar.f85850b.setVisibility(8);
            if (aVar.f85849a != null) {
                aVar.f85849a.setVisibility(8);
            }
            aVar.f85850b.setup(null);
            return;
        }
        m129013b(aVar, cVar);
        String a = this.f85846c.mo134394a();
        if (this.f85848e.mo122541e()) {
            aVar.f85850b.setMaxNameCount(5);
        } else {
            aVar.f85850b.setMaxNameCount(Integer.MAX_VALUE);
        }
        aVar.f85850b.mo181183a(C35237c.m137596a(a, !this.f85848e.mo122540d(), cVar.mo121658D()), true);
        aVar.f85850b.setVisibility(0);
        if (bVar != null) {
            iArr = bVar.mo126156a();
        } else {
            iArr = new int[]{0, 0, 0, 0};
        }
        if (bVar == null || !bVar.mo126157b()) {
            z = false;
        } else {
            z = true;
        }
        aVar.f85850b.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        if (aVar.f85849a != null) {
            View view = aVar.f85849a;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (this.f85848e.mo122551o() == null || !this.f85848e.mo122551o().mo124224l()) {
            aVar.f85850b.setReactionClickListener(new ReactionBaseFlowLayout.AbstractC53049d(cVar, a) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$b$9GiLQhhxJZ7RBRHvJXUN4Tdqk */
                public final /* synthetic */ ChatMessageVO f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
                public final void onReactionClicked(String str) {
                    C33323b.this.m129015b(this.f$1, this.f$2, str);
                }
            });
            aVar.f85850b.setOnReactionNameTrigger(new ReactionBaseFlowLayout.AbstractC53046a(cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$b$NiP6c6PfxaJzU5g_yFWtbf6GlZY */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
                public final void perform(String str) {
                    C33323b.this.m129014b((C33323b) this.f$1, (ChatMessageVO) str);
                }
            });
            aVar.f85850b.setOnReactionMoreTrigger(new ReactionBaseFlowLayout.AbstractC53047b(cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.block.$$Lambda$b$XqK9CPVRtLdpb7gwELSm72Rya0 */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
                public final void perform(String str) {
                    C33323b.this.m129011a((C33323b) this.f$1, (ChatMessageVO) str);
                }
            });
            return;
        }
        aVar.f85850b.setReactionClickListener(null);
        aVar.f85850b.setOnReactionMoreTrigger(null);
        aVar.f85850b.setOnReactionMoreTrigger(null);
    }

    /* renamed from: b */
    private void m129013b(C33324a aVar, ChatMessageVO cVar) {
        int i;
        int i2;
        AbstractC34072a<? extends ContentVO> aVar2 = this.f85847d;
        if (aVar2 != null && aVar2.mo122836a(cVar) != null) {
            int c = this.f85847d.mo122836a(cVar).mo126158c();
            if (c == 1) {
                aVar.f85850b.setTagBackground(this.f85848e.mo122543g().getResources().getDrawable(R.drawable.chat_bubble_reaction_white_bg_new));
                aVar.f85850b.setDivideLineColor(this.f85848e.mo122543g().getResources().getColor(R.color.line_border_component));
                aVar.f85850b.setTextColor(R.color.text_placeholder);
                aVar.f85850b.setReactionPaddings(new int[]{UIHelper.dp2px(5.0f), UIHelper.dp2px(3.0f), UIHelper.dp2px(5.0f), UIHelper.dp2px(4.0f)});
                aVar.f85850b.setReactionLeftMargin(0);
                aVar.f85850b.setReactionTopMargin(0);
                aVar.f85850b.setChildXOffset(-UIHelper.dp2px(4.0f));
                aVar.f85850b.setChildYOffset(-UIHelper.dp2px(5.0f));
                i = -UIHelper.dp2px(10.0f);
                i2 = UIHelper.dp2px(3.0f);
            } else if (c == 2) {
                aVar.f85850b.setTagBackground(C33360a.m129155b(this.f85848e.mo122543g(), false));
                aVar.f85850b.setDivideLineColor(C33360a.m129161e(false));
                aVar.f85850b.setTextColor(C33360a.m129159d(false));
                aVar.f85850b.setReactionPaddings(null);
                aVar.f85850b.setReactionPaddings(new int[]{0, 0, 0, 0});
                aVar.f85850b.setReactionTopMargin(UIHelper.dp2px(4.0f));
                aVar.f85850b.setReactionLeftMargin(UIHelper.dp2px(6.0f));
                aVar.f85850b.setChildXOffset(0);
                aVar.f85850b.setChildYOffset(0);
                i = UIHelper.dp2px(4.0f);
                i2 = UIHelper.dp2px(6.0f);
            } else if (c != 3) {
                aVar.f85850b.setTagBackground(this.f85848e.mo122543g().getResources().getDrawable(R.drawable.chat_bubble_reaction_bg));
                aVar.f85850b.setDivideLineColor(this.f85848e.mo122543g().getResources().getColor(R.color.line_border_component));
                aVar.f85850b.setTextColor(R.color.text_placeholder);
                aVar.f85850b.setReactionPaddings(null);
                aVar.f85850b.setReactionPaddings(new int[]{0, 0, 0, 0});
                aVar.f85850b.setReactionTopMargin(UIHelper.dp2px(4.0f));
                aVar.f85850b.setReactionLeftMargin(UIHelper.dp2px(6.0f));
                aVar.f85850b.setChildXOffset(0);
                aVar.f85850b.setChildYOffset(0);
                i = UIHelper.dp2px(4.0f);
                i2 = UIHelper.dp2px(6.0f);
            } else {
                aVar.f85850b.setTagBackground(C33360a.m129155b(this.f85848e.mo122543g(), true));
                aVar.f85850b.setDivideLineColor(C33360a.m129161e(true));
                aVar.f85850b.setTextColor(C33360a.m129159d(true));
                aVar.f85850b.setReactionPaddings(null);
                aVar.f85850b.setReactionPaddings(new int[]{0, 0, 0, 0});
                aVar.f85850b.setReactionTopMargin(UIHelper.dp2px(4.0f));
                aVar.f85850b.setReactionLeftMargin(UIHelper.dp2px(6.0f));
                aVar.f85850b.setChildXOffset(0);
                aVar.f85850b.setChildYOffset(0);
                i = UIHelper.dp2px(4.0f);
                i2 = UIHelper.dp2px(6.0f);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.f85850b.getLayoutParams();
            marginLayoutParams.topMargin = i;
            marginLayoutParams.leftMargin = -i2;
            aVar.f85850b.setLayoutParams(marginLayoutParams);
            aVar.f85850b.setReactionTextSize(11);
            aVar.f85850b.setDisplayChangeEnable(true);
            ReactionFlowLayout reactionFlowLayout = aVar.f85850b;
            boolean z = f85844a;
            reactionFlowLayout.setNewReactionEnable(z);
            if (z) {
                aVar.f85850b.setReactionMaxWidth(LayoutSizeHelper.m128406a(this.f85848e.mo122543g()));
            }
        }
    }

    public C33323b(AbstractC33342d dVar, AbstractC33304n nVar, AbstractC34072a<? extends ContentVO> aVar) {
        this.f85848e = dVar;
        this.f85845b = nVar;
        this.f85847d = aVar;
    }

    /* renamed from: a */
    private void m129012a(ChatMessageVO cVar, String str, String str2) {
        Map<String, ? extends Object> a = ChatParamUtils.f88665a.mo126912a(cVar);
        a.put("effect", str2);
        a.put("reaction_type", str);
        ChatHitPointNew.f135660c.mo187384a(this.f85848e.mo122550n(), "reaction", ChatHitPointNew.f135660c.mo187391b("reaction"), a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129015b(ChatMessageVO cVar, String str, String str2) {
        String str3;
        if (this.f85845b != null) {
            if (C35249h.m137636a(cVar.mo121658D(), str2, str)) {
                str3 = "remove";
            } else {
                str3 = "add";
            }
            m129012a(cVar, str2, str3);
            this.f85845b.mo122266a(cVar.mo121681a(), str2, 5);
        }
    }
}
