package com.ss.android.lark.feed.statistics.shortcut;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J*\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\"\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020#H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/feed/statistics/shortcut/ShortcutHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "EVENT_SHORTCUT_CHAT_ADD", "", "EVENT_SHORTCUT_CHAT_REMOVE", "EVENT_SHORTCUT_CHAT_VIEW", "EVENT_SHORTCUT_FOLD", "EVENT_SHORTCUT_UNFOLD", "SOURCE_PARAM", "SOURCE_PARAM_CLICK", "SOURCE_PARAM_DRAG", "SOURCE_PARAM_HIDE", "getSource", "sourceType", "", "getSubType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/biz/im/api/FeedCard$Type;", "item", "Lcom/ss/android/lark/feed/app/entity/UIFeedCard;", "getType", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "sendShortcutChatAdd", "", "operSource", "feedType", "subType", "chatId", "sendShortcutChatRemove", "sendShortcutChatView", "shortcutFold", "click", "", "shortcutUnfold", "drag", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.f.h.a */
public final class ShortcutHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final ShortcutHitPoint f97739a = new ShortcutHitPoint();

    @JvmStatic
    /* renamed from: a */
    public static final String m149832a(int i) {
        return i == 0 ? "feed" : i == 1 ? "setting" : "";
    }

    private ShortcutHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149836a(UIFeedCard uIFeedCard) {
        Intrinsics.checkParameterIsNotNull(uIFeedCard, "item");
        FeedCard.Type type = uIFeedCard.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "item.type");
        String a = m149833a(type, uIFeedCard.getChatMode());
        FeedCard.Type type2 = uIFeedCard.getType();
        Intrinsics.checkExpressionValueIsNotNull(type2, "item.type");
        m149837a(a, m149834a(type2, uIFeedCard), uIFeedCard.getId());
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m149842b(boolean z) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "click_button";
            } else {
                str = "hide";
            }
            Statistics.sendEvent("shortcut_fold", jSONObject.put(ShareHitPoint.f121868c, str));
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149839a(boolean z) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "drag";
            } else {
                str = "click_button";
            }
            Statistics.sendEvent("shortcut_unfold", jSONObject.put(ShareHitPoint.f121868c, str));
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m149833a(FeedCard.Type type, Chat.ChatMode chatMode) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == FeedCard.Type.CHAT) {
            if (chatMode == Chat.ChatMode.THREAD_V2) {
                return "channel";
            }
            return "chat";
        } else if (type == FeedCard.Type.DOC) {
            return "space";
        } else {
            return "";
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149835a(int i, UIFeedCard uIFeedCard) {
        if (uIFeedCard != null) {
            FeedCard.Type type = uIFeedCard.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "item.type");
            String a = m149833a(type, uIFeedCard.getChatMode());
            FeedCard.Type type2 = uIFeedCard.getType();
            Intrinsics.checkExpressionValueIsNotNull(type2, "item.type");
            m149838a(m149832a(i), a, m149834a(type2, uIFeedCard), uIFeedCard.getId());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m149840b(int i, UIFeedCard uIFeedCard) {
        if (uIFeedCard != null) {
            FeedCard.Type type = uIFeedCard.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "item.type");
            String a = m149833a(type, uIFeedCard.getChatMode());
            FeedCard.Type type2 = uIFeedCard.getType();
            Intrinsics.checkExpressionValueIsNotNull(type2, "item.type");
            m149841b(m149832a(i), a, m149834a(type2, uIFeedCard), uIFeedCard.getId());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m149834a(FeedCard.Type type, UIFeedCard uIFeedCard) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(uIFeedCard, "item");
        if (type == FeedCard.Type.CHAT && (uIFeedCard instanceof ChatFeedPreview)) {
            ChatFeedPreview chatFeedPreview = (ChatFeedPreview) uIFeedCard;
            if (chatFeedPreview.isMeeting()) {
                return "meeting_chat";
            }
            if (chatFeedPreview.isSecret()) {
                if (chatFeedPreview.getChatType() == Chat.Type.P2P) {
                    return "secret_singe_chat";
                }
                if (chatFeedPreview.getChatType() == Chat.Type.GROUP) {
                    return "secret_group_chat";
                }
            }
            if (chatFeedPreview.isBotChat()) {
                return "single_bot";
            }
            if (chatFeedPreview.getChatType() == Chat.Type.P2P) {
                return "single_chat";
            }
            if (chatFeedPreview.getChatType() == Chat.Type.GROUP) {
                return "group_chat";
            }
            return "";
        } else if (type != FeedCard.Type.DOC) {
            return "";
        } else {
            DocFeedPreview docFeedPreview = (DocFeedPreview) uIFeedCard;
            if (docFeedPreview.getDocType() == DocType.DOC) {
                return "docs";
            }
            if (docFeedPreview.getDocType() == DocType.SHEET) {
                return "sheet";
            }
            if (docFeedPreview.getDocType() == DocType.SLIDE) {
                return "slide";
            }
            if (docFeedPreview.getDocType() == DocType.FILE) {
                return "file";
            }
            if (docFeedPreview.getDocType() == DocType.MINDNOTE) {
                return "mindnote";
            }
            if (docFeedPreview.getDocType() == DocType.BITABLE) {
                return "bitable";
            }
            return "unknown_space";
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149837a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "feedType");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        try {
            Statistics.sendEvent("shortcut_chat_view", new JSONObject().put(ShareHitPoint.f121869d, str).put("sub_type", str2).put("chat_id", str3).put("call_type", "click"));
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m149841b(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "operSource");
        Intrinsics.checkParameterIsNotNull(str2, "feedType");
        Intrinsics.checkParameterIsNotNull(str3, "subType");
        try {
            Statistics.sendEvent("shortcut_chat_remove", new JSONObject().put("soure", str).put(ShareHitPoint.f121869d, str2).put("sub_type", str3).put("chat_id", str4));
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m149838a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "operSource");
        Intrinsics.checkParameterIsNotNull(str2, "feedType");
        Intrinsics.checkParameterIsNotNull(str3, "subType");
        try {
            Statistics.sendEvent("shortcut_chat_add", new JSONObject().put("soure", str).put(ShareHitPoint.f121869d, str2).put("sub_type", str3).put("chat_id", str4));
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
