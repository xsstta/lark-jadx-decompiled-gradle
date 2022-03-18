package com.ss.android.lark.search.service.compatible;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.search.service.compatible.global.GlobalSearcher;
import com.ss.android.lark.searchcommon.dto.Scene;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherRepo;", "", "()V", "repo", "", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "Lcom/ss/android/lark/search/service/compatible/ISearcher;", "getSearcher", ShareHitPoint.f121869d, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.u */
public final class SearcherRepo {

    /* renamed from: a */
    private final Map<Scene.Type, ISearcher> f131763a;

    public SearcherRepo() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f131763a = linkedHashMap;
        linkedHashMap.put(Scene.Type.ADD_CHAT_CHATTERS, new SearcherForAddChatChatters());
        linkedHashMap.put(Scene.Type.SEARCH_IN_CALENDAR_SCENE, new SearcherForCalendarAddChatChatter());
        linkedHashMap.put(Scene.Type.SEARCH_GLOBAL, new GlobalSearcher());
        linkedHashMap.put(Scene.Type.SEARCH_OPEN_APP_SCENE, new SearcherForOpenApp());
        linkedHashMap.put(Scene.Type.SEARCH_MESSAGES, new SearcherForMessage());
        linkedHashMap.put(Scene.Type.SEARCH_CHATS, new SearcherForGroup());
        linkedHashMap.put(Scene.Type.SEARCH_CHATTERS, new SearcherForChatter());
        linkedHashMap.put(Scene.Type.SEARCH_HELP_DESK, new SearcherForHelpDesk());
        linkedHashMap.put(Scene.Type.SEARCH_CALENDAR_EVENT, new SearcherForCalendarEvent());
        linkedHashMap.put(Scene.Type.TRANSMIT_MESSAGES, new SearcherForChat());
        linkedHashMap.put(Scene.Type.SEARCH_USERS, new SearcherForUser());
        linkedHashMap.put(Scene.Type.SEARCH_OPEN_SEARCH_SCENE, new SearcherForOpenSearch());
        linkedHashMap.put(Scene.Type.SEARCH_HAD_CHAT_HISTORY_SCENE, new SearcherForChatWithHistory());
        linkedHashMap.put(Scene.Type.SEARCH_DOCS_WIKI_IN_CHAT_SCENE, new SearcherForDoc());
        linkedHashMap.put(Scene.Type.SEARCH_CARDS, new SearcherForCard(false, false, 3, null));
        linkedHashMap.put(Scene.Type.SEARCH_SPACE, new SearcherForDoc());
    }

    /* renamed from: a */
    public final ISearcher mo181875a(Scene.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return this.f131763a.get(type);
    }
}
