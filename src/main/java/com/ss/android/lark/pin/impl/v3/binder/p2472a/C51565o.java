package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.RichTextViewHolder;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.span.AbbreviationInfo;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.o */
public class C51565o extends AbstractC51540b<RichTextViewHolder> {

    /* renamed from: a */
    public final AbstractC51472a f128350a = PinModule.m199585b();

    /* renamed from: b */
    AbstractC51472a.AbstractC51477d f128351b = PinModule.m199585b().mo144036j();

    /* renamed from: a */
    private void m200113a(RichTextViewHolder richTextViewHolder) {
        richTextViewHolder.f128418m.setTitleSize(LKUIDisplayManager.m91865a(this.f146181d, LarkFont.HEADLINE));
        richTextViewHolder.f128418m.setTitleEmojiSize(LKUIDisplayManager.m91881c(this.f146181d, 20));
        richTextViewHolder.f128418m.setContentEmojiSize(LKUIDisplayManager.m91881c(this.f146181d, 20));
        C25649b.m91853a(richTextViewHolder.mUrlIconIV, 24);
        C25649b.m91857a(richTextViewHolder.mUrlTitleTV, LarkFont.HEADLINE);
        C25649b.m91857a(richTextViewHolder.mUrlDescTV, LarkFont.BODY1);
        C25649b.m91853a(richTextViewHolder.mDocIconIV, 32);
        C25649b.m91857a(richTextViewHolder.mDocTitleTV, LarkFont.HEADLINE);
        C25649b.m91857a(richTextViewHolder.mDocOwnerTV, LarkFont.BODY1);
    }

    /* renamed from: a */
    private boolean m200114a(Message message) {
        if (message.getType() != Message.Type.POST) {
            return false;
        }
        PostContent postContent = (PostContent) message.getContent();
        if (CollectionUtils.isEmpty(postContent.getUrlPreviewList()) || postContent.getUrlPreviewList().size() != 1 || postContent.getUrlPreviewList().get(0).isDeleted() || TextUtils.isEmpty(postContent.getUrlPreviewList().get(0).getTitle())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public RichTextViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RichTextViewHolder.C51601a.m200238a(layoutInflater, viewGroup);
    }

    public C51565o(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(RichTextViewHolder richTextViewHolder, final PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) richTextViewHolder, bVar);
        richTextViewHolder.f128418m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.View$OnClickListenerC515716 */

            public void onClick(View view) {
                if (C51565o.this.f128306c != null) {
                    C51565o.this.f128306c.mo177363a(view, bVar);
                }
            }
        });
        richTextViewHolder.f128418m.setOnLongClickListener(mo177529a(bVar));
        richTextViewHolder.mUrlPreviewLayout.setOnLongClickListener(mo177529a(bVar));
        richTextViewHolder.mDocsLayout.setOnLongClickListener(mo177529a(bVar));
    }

    /* renamed from: a */
    public void mo177520a(RichTextViewHolder richTextViewHolder, int i, final PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) richTextViewHolder, i, bVar);
        PostContent postContent = (PostContent) bVar.mo177396g().getContent();
        richTextViewHolder.f128418m.setNeedShowAtDot(false);
        richTextViewHolder.f128418m.setAtStringClickListener(new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.C515661 */

            /* renamed from: c */
            private final DuplicateEnterChecker f128354c = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                if (!this.f128354c.mo198450a()) {
                    PinModule.m199585b().mo144035i().mo144073a(C51565o.this.f146181d, str2, bVar.mo177396g().getChatId());
                }
            }
        });
        richTextViewHolder.f128418m.setMentionStringClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.C515672 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                PinModule.m199585b().mo144024a(C51565o.this.f146181d, str3, 0);
            }
        });
        richTextViewHolder.f128418m.setPhoneStringClickListener(new LinkEmojiTextView.AbstractC58524i() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.C515683 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                C51565o.this.f128350a.mo144027b(C51565o.this.f146181d, str);
            }
        });
        richTextViewHolder.f128418m.setUrlStringClickListener(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.C515694 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                PinModule.m199585b().mo144019a(C51565o.this.f146181d, str);
                PinModule.m199585b().mo144041o().mo144052a(str);
            }
        });
        richTextViewHolder.f128418m.setAbbreviationClickListener(new LinkEmojiTextView.AbstractC58520e() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.C515705 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58520e
            /* renamed from: a */
            public void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                PinModule.m199585b().mo144021a(view, abbreviationInfo, f, f2);
            }
        });
        if (postContent != null) {
            String titleWithFilter = postContent.getTitleWithFilter(this.f146181d);
            richTextViewHolder.f128418m.getRichTextView().setVisibility(0);
            this.f128350a.mo144035i().mo144076a(richTextViewHolder.f128418m.getRichTextView(), bVar.mo177396g().isFromMe());
            richTextViewHolder.f128418m.setContentSize(LKUIDisplayManager.m91865a(this.f146181d, LarkFont.HEADLINE));
            richTextViewHolder.f128418m.mo177667a(titleWithFilter, postContent.getRichText(), false);
            richTextViewHolder.f128418m.getRichTextView().setVisibility(0);
        } else {
            richTextViewHolder.f128418m.mo177667a(null, null, false);
        }
        mo177577a(richTextViewHolder, bVar, false);
        if (bVar.mo177391b()) {
            richTextViewHolder.mUrlPreviewLayout.setBackgroundResource(R.drawable.item_bg_corner4_white);
            richTextViewHolder.mDocsLayout.setBackgroundResource(R.drawable.item_bg_corner4_white);
            richTextViewHolder.mDivider.setVisibility(8);
        }
        if (!DesktopUtil.m144307b()) {
            m200113a(richTextViewHolder);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0173  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo177577a(com.ss.android.lark.pin.impl.v3.binder.viewholder.RichTextViewHolder r17, com.ss.android.lark.pin.impl.entity.PinInfo r18, final boolean r19) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.pin.impl.v3.binder.p2472a.C51565o.mo177577a(com.ss.android.lark.pin.impl.v3.binder.viewholder.RichTextViewHolder, com.ss.android.lark.pin.impl.entity.b, boolean):void");
    }
}
