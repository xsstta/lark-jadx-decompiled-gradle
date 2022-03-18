package com.ss.android.lark.feed.app;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.MuteUrgentInfo;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.p1862b.C37702h;
import com.ss.android.lark.feed.app.model.p1862b.C37707j;
import com.ss.android.lark.feed.service.impl.PullType;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.lark.feed.app.h */
public class C37611h implements AbstractC29619l {

    /* renamed from: a */
    private FeedCard.Type f96450a;

    @Override // com.ss.android.lark.biz.im.api.AbstractC29619l
    /* renamed from: a */
    public List<FeedPreviewInfo> mo106727a(FeedCard.FeedType feedType) {
        List<UIFeedCard> list;
        if (feedType == FeedCard.FeedType.INBOX) {
            list = C37731d.m148488a().mo138417h().mo138376c();
        } else {
            list = C37731d.m148488a().mo138418i().mo138376c();
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        m147872a(list, arrayList);
        m147871a(this.f96450a, arrayList);
        return arrayList;
    }

    @Override // com.ss.android.lark.biz.im.api.AbstractC29619l
    /* renamed from: b */
    public List<FeedPreviewInfo> mo106728b(FeedCard.FeedType feedType) {
        final AtomicReference atomicReference = new AtomicReference();
        new C37707j(feedType).mo138219a(new C37702h.C37703a().mo138204a(PullType.REFRESH).mo138206b(41).mo138209b(), new DataLoader.AbstractC37726a<AbstractC38118b.C38119a>() {
            /* class com.ss.android.lark.feed.app.C37611h.C376121 */

            @Override // com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a
            /* renamed from: a */
            public void mo137409a(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void mo137411a(AbstractC38118b.C38119a aVar) {
                atomicReference.set(aVar);
            }
        });
        AbstractC38118b.C38119a aVar = (AbstractC38118b.C38119a) atomicReference.get();
        if (aVar == null || CollectionUtils.isEmpty(aVar.f97745f)) {
            return new ArrayList();
        }
        m147871a(this.f96450a, aVar.f97745f);
        return aVar.f97745f;
    }

    public C37611h(FeedCard.FeedType feedType, FeedCard.Type type) {
        this.f96450a = type;
    }

    /* renamed from: a */
    private void m147871a(FeedCard.Type type, List<FeedPreviewInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            Iterator<FeedPreviewInfo> it = list.iterator();
            while (it.hasNext()) {
                FeedPreviewInfo next = it.next();
                if (!(type == FeedCard.Type.UNKNOWN || type == next.mo106101q())) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private void m147872a(List<UIFeedCard> list, List<FeedPreviewInfo> list2) {
        Chatter.ChatterType chatterType;
        for (UIFeedCard uIFeedCard : list) {
            if (uIFeedCard instanceof FeedPreview) {
                FeedPreview feedPreview = (FeedPreview) uIFeedCard;
                FeedPreviewInfo feedPreviewInfo = new FeedPreviewInfo();
                feedPreviewInfo.mo106060d(feedPreview.getId());
                feedPreviewInfo.mo106007a(feedPreview.getType());
                feedPreviewInfo.mo106064e(feedPreview.getAvatarKey());
                feedPreviewInfo.mo106069f(feedPreview.getName());
                feedPreviewInfo.mo106059d(feedPreview.getUnreadCount());
                feedPreviewInfo.mo106062d(feedPreview.isRemind());
                feedPreviewInfo.mo106066e(feedPreview.isShortCut());
                feedPreviewInfo.mo106047b(feedPreview.getRankTime());
                feedPreviewInfo.mo106005a(0L);
                feedPreviewInfo.mo106006a(feedPreview.getFeedType());
                feedPreviewInfo.mo106012a((FeedPreviewInfo.C29593a) null);
                feedPreviewInfo.mo106008a((FeedPreviewInfo.AtInfo) null);
                feedPreviewInfo.mo106015a((MuteUrgentInfo) null);
                feedPreviewInfo.mo106010a((FeedPreviewInfo.EntityStatus) null);
                feedPreviewInfo.mo106071g(feedPreview.getLocalizedDigestMessage());
                feedPreviewInfo.mo106078i(feedPreview.isDelayed());
                feedPreviewInfo.mo106075h(feedPreview.getParentCardId());
                if (feedPreview.getType() == FeedCard.Type.CHAT) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
                    feedPreviewInfo.mo106017a(chatFeedPreview.getChatType());
                    if (chatFeedPreview.isBotChat()) {
                        chatterType = Chatter.ChatterType.BOT;
                    } else {
                        chatterType = Chatter.ChatterType.USER;
                    }
                    feedPreviewInfo.mo106019a(chatterType);
                    feedPreviewInfo.mo106048b(chatFeedPreview.getP2pChatterId());
                    feedPreviewInfo.mo106056c(chatFeedPreview.isSecret());
                    feedPreviewInfo.mo106050b(chatFeedPreview.isMeeting());
                    feedPreviewInfo.mo106082j(chatFeedPreview.isCrossTenant());
                    feedPreviewInfo.mo106063e(chatFeedPreview.getZenModeEndTime());
                    feedPreviewInfo.mo106016a(chatFeedPreview.getChatMode());
                    feedPreviewInfo.mo106100p(chatFeedPreview.isEdu());
                    feedPreviewInfo.mo106103q(chatFeedPreview.isCrossWithKa());
                    feedPreviewInfo.mo106061d(chatFeedPreview.getTags());
                    feedPreviewInfo.mo106096o(chatFeedPreview.getTeamName());
                    feedPreviewInfo.mo106018a(chatFeedPreview.getTeamChatType());
                } else if (feedPreview.getType() == FeedCard.Type.DOC) {
                    DocFeedPreview docFeedPreview = (DocFeedPreview) feedPreview;
                    feedPreviewInfo.mo106023a(docFeedPreview.getDocType());
                    feedPreviewInfo.mo106054c(docFeedPreview.getDocUrl());
                    feedPreviewInfo.mo106022a(docFeedPreview.getDocMessageType());
                    feedPreviewInfo.mo106081j(docFeedPreview.getLastDocMessageId());
                    feedPreviewInfo.mo106082j(docFeedPreview.isCrossTenant());
                }
                list2.add(feedPreviewInfo);
            }
        }
    }
}
