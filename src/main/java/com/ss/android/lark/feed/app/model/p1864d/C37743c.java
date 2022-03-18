package com.ss.android.lark.feed.app.model.p1864d;

import android.text.TextUtils;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.HighPriorityDisplay;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.c */
public class C37743c extends AbstractC37737a<ChatFeedPreview> {
    /* renamed from: a */
    public List<ChatFeedPreview> mo138444a(List<FeedPreviewInfo> list) {
        List<ChatFeedPreview> a = mo138437a(FeedCard.Type.CHAT, list);
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ChatFeedPreview mo138436a(FeedPreviewInfo feedPreviewInfo) {
        ChatFeedPreview chatFeedPreview = new ChatFeedPreview();
        mo138438a((FeedPreview) chatFeedPreview, feedPreviewInfo);
        m148570a(chatFeedPreview, feedPreviewInfo);
        m148569a(chatFeedPreview);
        return chatFeedPreview;
    }

    /* renamed from: a */
    private void m148569a(ChatFeedPreview chatFeedPreview) {
        LarkNameTag a = C37711b.m148266a(UIHelper.getContext(), chatFeedPreview);
        C37711b.m148269a().mo138227a(a, a.mo90006b());
        chatFeedPreview.setFeedNameTag(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a
    /* renamed from: b */
    public void mo138439b(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        String E = feedPreviewInfo.mo105981E();
        if (E.length() > 80) {
            E = E.substring(0, 80);
        }
        feedPreview.setLocalizedDigestMessage(E);
    }

    /* renamed from: a */
    public List<ChatFeedPreview> mo138445a(List<FeedPreviewInfo> list, boolean z) {
        List<ChatFeedPreview> a = mo138437a(FeedCard.Type.CHAT, list);
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private void m148570a(ChatFeedPreview chatFeedPreview, FeedPreviewInfo feedPreviewInfo) {
        boolean z;
        String str;
        long j;
        boolean z2 = true;
        if (feedPreviewInfo.mo106051c() == Chat.Type.P2P && feedPreviewInfo.mo106068f() == Chatter.ChatterType.BOT) {
            z = true;
        } else {
            z = false;
        }
        chatFeedPreview.setBotChat(z);
        if (!chatFeedPreview.isBotChat() || !"bot".equalsIgnoreCase(feedPreviewInfo.mo106045b())) {
            z2 = false;
        }
        chatFeedPreview.setShowBotTag(z2);
        chatFeedPreview.setChatType(feedPreviewInfo.mo106051c());
        chatFeedPreview.setChatMode(feedPreviewInfo.mo106058d());
        chatFeedPreview.setMeeting(feedPreviewInfo.mo106067e());
        chatFeedPreview.setSecret(feedPreviewInfo.mo106079i());
        chatFeedPreview.setDepartment(feedPreviewInfo.mo105979C());
        chatFeedPreview.setSuper(feedPreviewInfo.mo105978B());
        chatFeedPreview.setTenantChat(feedPreviewInfo.mo105980D());
        chatFeedPreview.setPublic(feedPreviewInfo.mo105997U());
        chatFeedPreview.setOfficialOncall(feedPreviewInfo.mo105998V());
        chatFeedPreview.setOfflineOncall(feedPreviewInfo.mo105999W());
        chatFeedPreview.setZenModeEndTime(feedPreviewInfo.mo106000X());
        chatFeedPreview.setOnCallId(feedPreviewInfo.mo105990N());
        chatFeedPreview.setMiniAvatarKey(feedPreviewInfo.ag());
        chatFeedPreview.setP2pChatterId(feedPreviewInfo.mo106074h());
        chatFeedPreview.setMyThreadUpdated(feedPreviewInfo.ae());
        chatFeedPreview.setEdu(feedPreviewInfo.ai());
        chatFeedPreview.setCrossWithKa(feedPreviewInfo.aj());
        chatFeedPreview.setHighPriorityDisplay(feedPreviewInfo.mo105989M());
        chatFeedPreview.setFocusInfo(feedPreviewInfo.mo105988L());
        if (feedPreviewInfo.mo105989M() == null && !feedPreviewInfo.mo106107u()) {
            String str2 = null;
            long j2 = 0;
            if (feedPreviewInfo.mo106111y() == null || TextUtils.isEmpty(feedPreviewInfo.mo106111y().mo106129g())) {
                j = 0;
            } else {
                str2 = feedPreviewInfo.mo106111y().mo106129g();
                j2 = feedPreviewInfo.mo106111y().mo106124e();
                j = feedPreviewInfo.mo106111y().mo106127f();
            }
            if (feedPreviewInfo.mo106112z() != null && !TextUtils.isEmpty(feedPreviewInfo.mo106112z().mo106775c())) {
                str2 = feedPreviewInfo.mo106112z().mo106775c();
                j2 = feedPreviewInfo.mo106112z().mo106774b().longValue();
                j = feedPreviewInfo.mo106112z().mo106773a().longValue();
            }
            if (str2 != null) {
                chatFeedPreview.setHighPriorityDisplay(new HighPriorityDisplay(str2, Long.valueOf(j), Long.valueOf(j2)));
            }
        }
        if (feedPreviewInfo.ae()) {
            str = UIHelper.getString(R.string.Lark_TopicChannel_ReceivedNReplies);
        } else if (feedPreviewInfo.mo105988L() != null) {
            str = "[" + UIHelper.getString(R.string.Lark_Legacy_SpecialRemind) + "]";
        } else {
            str = "";
        }
        chatFeedPreview.setMarkText(str);
        chatFeedPreview.setTags(feedPreviewInfo.al());
    }
}
