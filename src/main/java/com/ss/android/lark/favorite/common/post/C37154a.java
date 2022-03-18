package com.ss.android.lark.favorite.common.post;

import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.utils.C34330a;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.common.post.a */
public class C37154a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: d */
    private static final Map<Integer, Object> f95490d;

    /* renamed from: a */
    IBrowserDependency f95491a = C29990c.m110930b().mo134593u();

    /* renamed from: b */
    public final Context f95492b;

    /* renamed from: c */
    public final AbstractC36474h.AbstractC36489o f95493c = C29990c.m110930b().mo134525X();

    static {
        HashMap hashMap = new HashMap();
        f95490d = hashMap;
        hashMap.put(1, new Object() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371551 */
        });
        hashMap.put(2, new Object() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371594 */
        });
    }

    public C37154a(Context context) {
        this.f95492b = context;
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        PostMessageHolder postMessageHolder = (PostMessageHolder) itemListCommonHolder.mo136774a();
        PostContent postContent = (PostContent) favoriteMessageInfo.getSourceMessage().getContent();
        postMessageHolder.mSaveBoxPostContent.mo136799a();
        m146418a(itemListCommonHolder, postMessageHolder, favoriteMessageInfo.getSourceMessage(), favoriteMessageInfo.getId());
        boolean z = false;
        postMessageHolder.mSaveBoxPostContent.setNeedShowAtDot(false);
        C34330a.m133107a(postMessageHolder.mSaveBoxPostContent.getRichTextView(), favoriteMessageInfo.getSourceMessage().isFromMe());
        if (i == 2) {
            z = true;
        }
        if (postContent != null) {
            postMessageHolder.mSaveBoxPostContent.mo136800a(postContent.getTitleWithFilter(this.f95492b), postContent.getRichText(), z);
        } else {
            postMessageHolder.mSaveBoxPostContent.mo136800a(null, null, z);
        }
        View$OnClickListenerC371605 r1 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.View$OnClickListenerC371605 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371616 r3 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.View$OnLongClickListenerC371616 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r1);
            itemListCommonHolder.f95392a.setOnLongClickListener(r3);
            postMessageHolder.mSaveBoxPostContent.setOnClickListener(r1);
            postMessageHolder.mSaveBoxPostContent.setOnLongClickListener(r3);
        }
    }

    /* renamed from: a */
    private void m146418a(ItemListCommonHolder itemListCommonHolder, PostMessageHolder postMessageHolder, final Message message, final String str) {
        final PostContent postContent = (PostContent) message.getContent();
        postMessageHolder.mSaveBoxPostContent.setPhoneStringClickListener(new LinkEmojiTextView.AbstractC58524i() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371627 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                C37154a.this.f95493c.mo134641a(C37154a.this.f95492b, str);
            }
        });
        postMessageHolder.mSaveBoxPostContent.setUrlStringClickListener(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371638 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                C29990c.m110930b().mo134577e().mo120961b();
                C37154a.this.f95491a.mo134334c(C37154a.this.f95492b, str);
                C29990c.m110930b().mo134594v().mo134496a(str);
            }
        });
        postMessageHolder.mSaveBoxPostContent.setAtStringClickListener(new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371649 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                C29990c.m110930b().mo134523V().mo134436a(C37154a.this.f95492b, new ProfileSource.C36868a().mo136066c(str2).mo136065b(message.getChatId()).mo136064b(6).mo136060a(1).mo136063a());
            }
        });
        postMessageHolder.mSaveBoxPostContent.setMentionStringClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                C29990c.m110930b().mo134548a(C37154a.this.f95492b, str3);
            }
        });
        postMessageHolder.mSaveBoxPostContent.setPostImageListener(new RichTextView.AbstractC59024b() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59024b
            /* renamed from: a */
            public boolean mo136820a(View view) {
                return false;
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59024b
            /* renamed from: a */
            public void mo136819a(Image image, View view) {
                com.ss.android.lark.image.entity.Image a = C57305aa.m222055a(image);
                if (a != null) {
                    List<PhotoItem> a2 = C34353s.m133245a(C57305aa.m222056a(C59031e.m229179a(postContent.getRichText())), str);
                    if (!CollectionUtils.isEmpty(a2) && !CollectionUtils.isEmpty(C34353s.m133244a(Collections.singletonList(a)))) {
                        PhotoItem messageId = C34353s.m133244a(Collections.singletonList(a)).get(0).setMessageId(str);
                        boolean a3 = C29990c.m110930b().mo134586n().mo134685a("translate.other.image.viewer.enable");
                        C58630d.m227376b(C37154a.this.f95492b, a2, C34353s.m133238a(a2, messageId), view, a3);
                    }
                }
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59024b
            /* renamed from: a */
            public boolean mo136821a(Image image, View view, MotionEvent motionEvent) {
                return C33143g.m128109a(C37154a.this.f95492b, view, motionEvent.getRawX(), motionEvent.getRawY(), C33143g.m128103a(image));
            }
        });
        postMessageHolder.mSaveBoxPostContent.setPostVideoListener(new RichTextView.AbstractC59026d() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371562 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59026d
            /* renamed from: b */
            public boolean mo136824b(View view, RichTextElement.MediaProperty mediaProperty) {
                return false;
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59026d
            /* renamed from: a */
            public void mo136822a(View view, RichTextElement.MediaProperty mediaProperty) {
                MediaImageSet a = C57308c.m222071a(message.getId(), message.getChatId(), mediaProperty);
                a.setMessageIdentity(new MessageIdentity(message.getId(), message.getChatId(), str, Message.SourceType.TYPE_FROM_FAVORITE));
                List<PhotoItem> a2 = C58659h.m227513a(Collections.singletonList(a));
                if (!CollectionUtils.isEmpty(a2)) {
                    C29990c.m110930b().mo134541a(C37154a.this.f95492b, a2, 0, view, null, false, false, false, false, false, false, null, null, Scene.Favorite, 4);
                }
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59026d
            /* renamed from: a */
            public boolean mo136823a(View view, RichTextElement.MediaProperty mediaProperty, MotionEvent motionEvent) {
                return C33143g.m128107a(C37154a.this.f95492b, view, motionEvent.getRawX(), motionEvent.getRawY(), message);
            }
        });
        postMessageHolder.mSaveBoxPostContent.setAbbreviationClickListener(new LinkEmojiTextView.AbstractC58520e() {
            /* class com.ss.android.lark.favorite.common.post.C37154a.C371573 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58520e
            /* renamed from: a */
            public void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                C29990c.m110930b().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, message.getChatId(), new AbstractC28533c() {
                    /* class com.ss.android.lark.favorite.common.post.C37154a.C371573.C371581 */

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
    }
}
