package com.ss.android.lark.search.redesign.viewmodel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.search.redesign.filter.ChatFilterData;
import com.ss.android.lark.search.redesign.filter.DocCategoryFilterData;
import com.ss.android.lark.search.redesign.filter.DocFormatFilterData;
import com.ss.android.lark.search.redesign.filter.DocInChatFilterData;
import com.ss.android.lark.search.redesign.filter.DocMyOwnFilterData;
import com.ss.android.lark.search.redesign.filter.DocOwnerFilterData;
import com.ss.android.lark.search.redesign.filter.DocSearchContentTypeFilterData;
import com.ss.android.lark.search.redesign.filter.DocSharerFilterData;
import com.ss.android.lark.search.redesign.filter.DocTimeFilterData;
import com.ss.android.lark.search.redesign.filter.MessageChatFilter;
import com.ss.android.lark.search.redesign.filter.MessageChatterFilter;
import com.ss.android.lark.search.redesign.filter.MessageHideBotFilter;
import com.ss.android.lark.search.redesign.filter.MessageSceneFilter;
import com.ss.android.lark.search.redesign.filter.MessageTimeFilter;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0007¨\u00065"}, d2 = {"Lcom/ss/android/lark/search/redesign/viewmodel/BaseSearchTabFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatMemberFilterData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/search/redesign/filter/ChatFilterData;", "getChatMemberFilterData", "()Landroidx/lifecycle/MutableLiveData;", "chatTypeFilterData", "getChatTypeFilterData", "docCategoryFilterData", "Lcom/ss/android/lark/search/redesign/filter/DocCategoryFilterData;", "getDocCategoryFilterData", "docFormatFilterData", "Lcom/ss/android/lark/search/redesign/filter/DocFormatFilterData;", "getDocFormatFilterData", "docInChatFilterDate", "Lcom/ss/android/lark/search/redesign/filter/DocInChatFilterData;", "getDocInChatFilterDate", "docMyOwnFilterData", "Lcom/ss/android/lark/search/redesign/filter/DocMyOwnFilterData;", "getDocMyOwnFilterData", "docOwnerFilterData", "Lcom/ss/android/lark/search/redesign/filter/DocOwnerFilterData;", "getDocOwnerFilterData", "docSearchContentTypeData", "Lcom/ss/android/lark/search/redesign/filter/DocSearchContentTypeFilterData;", "getDocSearchContentTypeData", "docSharerFilterData", "Lcom/ss/android/lark/search/redesign/filter/DocSharerFilterData;", "getDocSharerFilterData", "docTimeFilterData", "Lcom/ss/android/lark/search/redesign/filter/DocTimeFilterData;", "getDocTimeFilterData", "messageChatFilterData", "Lcom/ss/android/lark/search/redesign/filter/MessageChatFilter;", "getMessageChatFilterData", "messageChatterFilterData", "Lcom/ss/android/lark/search/redesign/filter/MessageChatterFilter;", "getMessageChatterFilterData", "messageHideBotFilterData", "Lcom/ss/android/lark/search/redesign/filter/MessageHideBotFilter;", "getMessageHideBotFilterData", "messageTimeFilterData", "Lcom/ss/android/lark/search/redesign/filter/MessageTimeFilter;", "getMessageTimeFilterData", "messageTypeFilterData", "Lcom/ss/android/lark/search/redesign/filter/MessageSceneFilter;", "getMessageTypeFilterData", "searchBaseInfoDataList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getSearchBaseInfoDataList", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.b.a */
public final class BaseSearchTabFragmentViewModel extends AbstractC1142af {
    private final C1177w<ChatFilterData> chatMemberFilterData = new C1177w<>();
    private final C1177w<ChatFilterData> chatTypeFilterData = new C1177w<>();
    private final C1177w<DocCategoryFilterData> docCategoryFilterData = new C1177w<>();
    private final C1177w<DocFormatFilterData> docFormatFilterData = new C1177w<>();
    private final C1177w<DocInChatFilterData> docInChatFilterDate = new C1177w<>();
    private final C1177w<DocMyOwnFilterData> docMyOwnFilterData = new C1177w<>();
    private final C1177w<DocOwnerFilterData> docOwnerFilterData = new C1177w<>();
    private final C1177w<DocSearchContentTypeFilterData> docSearchContentTypeData = new C1177w<>();
    private final C1177w<DocSharerFilterData> docSharerFilterData = new C1177w<>();
    private final C1177w<DocTimeFilterData> docTimeFilterData = new C1177w<>();
    private final C1177w<MessageChatFilter> messageChatFilterData = new C1177w<>();
    private final C1177w<MessageChatterFilter> messageChatterFilterData = new C1177w<>();
    private final C1177w<MessageHideBotFilter> messageHideBotFilterData = new C1177w<>();
    private final C1177w<MessageTimeFilter> messageTimeFilterData = new C1177w<>();
    private final C1177w<MessageSceneFilter> messageTypeFilterData = new C1177w<>();
    private final C1177w<List<SearchBaseInfo>> searchBaseInfoDataList = new C1177w<>();

    public final C1177w<ChatFilterData> getChatMemberFilterData() {
        return this.chatMemberFilterData;
    }

    public final C1177w<ChatFilterData> getChatTypeFilterData() {
        return this.chatTypeFilterData;
    }

    public final C1177w<DocCategoryFilterData> getDocCategoryFilterData() {
        return this.docCategoryFilterData;
    }

    public final C1177w<DocFormatFilterData> getDocFormatFilterData() {
        return this.docFormatFilterData;
    }

    public final C1177w<DocInChatFilterData> getDocInChatFilterDate() {
        return this.docInChatFilterDate;
    }

    public final C1177w<DocMyOwnFilterData> getDocMyOwnFilterData() {
        return this.docMyOwnFilterData;
    }

    public final C1177w<DocOwnerFilterData> getDocOwnerFilterData() {
        return this.docOwnerFilterData;
    }

    public final C1177w<DocSearchContentTypeFilterData> getDocSearchContentTypeData() {
        return this.docSearchContentTypeData;
    }

    public final C1177w<DocSharerFilterData> getDocSharerFilterData() {
        return this.docSharerFilterData;
    }

    public final C1177w<DocTimeFilterData> getDocTimeFilterData() {
        return this.docTimeFilterData;
    }

    public final C1177w<MessageChatFilter> getMessageChatFilterData() {
        return this.messageChatFilterData;
    }

    public final C1177w<MessageChatterFilter> getMessageChatterFilterData() {
        return this.messageChatterFilterData;
    }

    public final C1177w<MessageHideBotFilter> getMessageHideBotFilterData() {
        return this.messageHideBotFilterData;
    }

    public final C1177w<MessageTimeFilter> getMessageTimeFilterData() {
        return this.messageTimeFilterData;
    }

    public final C1177w<MessageSceneFilter> getMessageTypeFilterData() {
        return this.messageTypeFilterData;
    }

    public final C1177w<List<SearchBaseInfo>> getSearchBaseInfoDataList() {
        return this.searchBaseInfoDataList;
    }
}
