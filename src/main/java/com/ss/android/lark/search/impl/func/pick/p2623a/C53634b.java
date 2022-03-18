package com.ss.android.lark.search.impl.func.pick.p2623a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.searchcommon.dto.C53893b;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;

/* renamed from: com.ss.android.lark.search.impl.func.pick.a.b */
public class C53634b {

    /* renamed from: a */
    private final C53635c f132395a = new C53635c();

    /* renamed from: b */
    private final C53636d f132396b = new C53636d();

    /* renamed from: a */
    public BasePickViewData mo182942a(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchChatterInfo) {
            return this.f132396b.mo182949a((SearchChatterInfo) searchBaseInfo);
        } else if (!(searchBaseInfo instanceof SearchChatInfo)) {
            return null;
        } else {
            return this.f132395a.mo182947a((SearchChatInfo) searchBaseInfo);
        }
    }

    /* renamed from: a */
    public SearchBaseInfo mo182943a(BasePickViewData basePickViewData) {
        if (basePickViewData instanceof PickChatViewData) {
            return this.f132395a.mo182948a((PickChatViewData) basePickViewData);
        } else if (!(basePickViewData instanceof PickChatterViewData)) {
            return null;
        } else {
            return this.f132396b.mo182950a((PickChatterViewData) basePickViewData);
        }
    }

    /* renamed from: a */
    public SearchChatterInfo mo182944a(PickChatViewData pickChatViewData) {
        if (pickChatViewData.getChatType() != Chat.Type.P2P) {
            return null;
        }
        SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
        searchChatterInfo.setId(pickChatViewData.getAvatarId());
        searchChatterInfo.setP2pChatId(pickChatViewData.getId());
        searchChatterInfo.setTitle(pickChatViewData.getName());
        searchChatterInfo.setAvatarKey(pickChatViewData.getImageKey());
        searchChatterInfo.setRegistered(true);
        searchChatterInfo.setChatterDescription(pickChatViewData.getP2pChatterDescription());
        if (pickChatViewData.isShowBotTag()) {
            searchChatterInfo.setChatterType(Chatter.ChatterType.BOT);
            return searchChatterInfo;
        }
        searchChatterInfo.setChatterType(Chatter.ChatterType.USER);
        return searchChatterInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x000d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo> mo182945a(java.util.List<com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x000d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r6.next()
            com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData r1 = (com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData) r1
            boolean r2 = r1 instanceof com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData
            if (r2 == 0) goto L_0x002d
            r2 = r1
            com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData r2 = (com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData) r2
            com.ss.android.lark.chat.entity.chat.Chat$Type r3 = r2.getChatType()
            com.ss.android.lark.chat.entity.chat.Chat$Type r4 = com.ss.android.lark.chat.entity.chat.Chat.Type.P2P
            if (r3 != r4) goto L_0x002d
            com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo r1 = r5.mo182944a(r2)
            goto L_0x0035
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo r1 = r5.mo182943a(r1)
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x000d
            r0.add(r1)
            goto L_0x000d
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.impl.func.pick.p2623a.C53634b.mo182945a(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public BasePickViewData mo182941a(C53893b bVar, Chat chat, Chatter chatter) {
        return this.f132395a.mo182946a(bVar, chat, chatter);
    }
}
