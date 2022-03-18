package com.ss.android.lark.favorite.common.text;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.utils.C34330a;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;

/* renamed from: com.ss.android.lark.favorite.common.text.b */
public class C37170b implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    public final Context f95527a;

    public C37170b(Context context) {
        this.f95527a = context;
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        TextMessageHolder textMessageHolder = (TextMessageHolder) itemListCommonHolder.mo136774a();
        final Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        TextContent textContent = (TextContent) favoriteMessageInfo.getSourceMessage().getContent();
        Chatter sourceChatter = favoriteMessageInfo.getSourceChatter();
        if (sourceChatter == null) {
            C37169a.m146446a(sourceChatter, favoriteMessageInfo.getSourceMessage());
        }
        if (sourceMessage.getStatus() == Message.Status.DELETED || sourceMessage.getType() == Message.Type.UNKNOWN) {
            textMessageHolder.mTextView.setTextColor(UIHelper.getColor(R.color.text_placeholder));
        } else {
            textMessageHolder.mTextView.setTextColor(UIHelper.getColor(R.color.text_title));
        }
        C34330a.m133107a(textMessageHolder.mTextView, favoriteMessageInfo.getSourceMessage().isFromMe());
        if (textContent != null) {
            if (i == 1) {
                textMessageHolder.mTextView.setMaxLines(3);
            } else if (i == 2) {
                textMessageHolder.mTextView.setMaxLines(Integer.MAX_VALUE);
            }
            textMessageHolder.mTextView.setRichTextListener(new RichTextView.AbstractC59025c() {
                /* class com.ss.android.lark.favorite.common.text.C37170b.C371711 */

                @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
                /* renamed from: a */
                public void mo124117a(TextView textView) {
                    C37122d.m146374b(textView, itemListCommonHolder, favoriteMessageInfo);
                }

                @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
                /* renamed from: a */
                public void mo124118a(String str, TextView textView) {
                    C37122d.m146373a(textView, itemListCommonHolder, favoriteMessageInfo);
                }
            });
            textMessageHolder.mTextView.setPhoneStringClickListener(new LinkEmojiTextView.AbstractC58524i() {
                /* class com.ss.android.lark.favorite.common.text.C37170b.C371722 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
                /* renamed from: b */
                public void mo122809b(View view, String str) {
                }

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
                /* renamed from: a */
                public void mo122808a(View view, String str) {
                    C29990c.m110930b().mo134525X().mo134641a(C37170b.this.f95527a, str);
                }
            });
            textMessageHolder.mTextView.setUrlStringClickListner(new LinkEmojiTextView.AbstractC58525j() {
                /* class com.ss.android.lark.favorite.common.text.C37170b.C371733 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
                /* renamed from: b */
                public boolean mo122807b(View view, String str) {
                    return false;
                }

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
                /* renamed from: a */
                public void mo122806a(View view, String str) {
                    C29990c.m110930b().mo134577e().mo120961b();
                    C29990c.m110930b().mo134593u().mo134334c(C37170b.this.f95527a, str);
                    C29990c.m110930b().mo134594v().mo134496a(str);
                }
            });
            textMessageHolder.mTextView.setAtStringClickListner(new LinkEmojiTextView.AbstractC58521f() {
                /* class com.ss.android.lark.favorite.common.text.C37170b.C371744 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
                /* renamed from: b */
                public boolean mo117507b(View view, String str, String str2) {
                    return false;
                }

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
                /* renamed from: c */
                public void mo120297c(View view, String str, String str2) {
                    C29990c.m110930b().mo134523V().mo134436a(C37170b.this.f95527a, new ProfileSource.C36868a().mo136066c(str2).mo136065b(favoriteMessageInfo.getSourceMessage().getChatId()).mo136064b(6).mo136060a(1).mo136063a());
                }
            });
            textMessageHolder.mTextView.setMentionListener(new IMentionSpanClickListener() {
                /* class com.ss.android.lark.favorite.common.text.C37170b.C371755 */

                @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
                /* renamed from: a */
                public boolean mo122873a(View view, String str, String str2, boolean z) {
                    return false;
                }

                @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
                /* renamed from: a */
                public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                    C29990c.m110930b().mo134548a(view.getContext(), str3);
                }
            });
            textMessageHolder.mTextView.setAbbreviationListener(new LinkEmojiTextView.AbstractC58520e() {
                /* class com.ss.android.lark.favorite.common.text.C37170b.C371766 */

                @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58520e
                /* renamed from: a */
                public void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                    C29990c.m110930b().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, sourceMessage.getChatId(), new AbstractC28533c() {
                        /* class com.ss.android.lark.favorite.common.text.C37170b.C371766.C371771 */

                        @Override // com.ss.android.lark.ai.AbstractC28533c
                        /* renamed from: a */
                        public void mo101579a(Dialog dialog) {
                            WindowDialogManager.f91123a.mo129819a(dialog);
                        }

                        @Override // com.ss.android.lark.ai.AbstractC28533c
                        /* renamed from: a */
                        public void mo101580a(PopupWindow popupWindow) {
                            WindowDialogManager.f91123a.mo129820a(popupWindow);
                        }
                    }, abbreviationInfo.messageId);
                }
            });
            textMessageHolder.mTextView.mo200508a(textContent.getRichText(), favoriteMessageInfo.getId());
        } else {
            textMessageHolder.mTextView.mo200508a(C59029c.m229155a(), favoriteMessageInfo.getId());
        }
        View$OnClickListenerC371787 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.text.C37170b.View$OnClickListenerC371787 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371798 r1 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.text.C37170b.View$OnLongClickListenerC371798 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r0);
            itemListCommonHolder.f95392a.setOnLongClickListener(r1);
            itemListCommonHolder.mContentViewGroup.setOnClickListener(r0);
            itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r1);
        }
    }
}
