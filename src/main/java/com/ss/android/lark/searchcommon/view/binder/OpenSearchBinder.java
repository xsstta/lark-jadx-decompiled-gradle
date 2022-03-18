package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.summary.SummaryModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/OpenSearchBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "context", "Landroid/content/Context;", "clickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "getContext", "()Landroid/content/Context;", "tagMap", "Ljava/util/HashMap;", "", "Lcom/larksuite/component/ui/tag/TextTag$Builder;", "Lkotlin/collections/HashMap;", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindSummary", "bindTag", "position", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.x */
public final class OpenSearchBinder extends CommonBinder<SearchOpenSearchInfo> {

    /* renamed from: a */
    private final HashMap<Integer, TextTag.Builder> f133689a;

    /* renamed from: b */
    private final Context f133690b;

    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchOpenSearchInfo searchOpenSearchInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchOpenSearchInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        aVar.mo184645a().getItem().mo184675a(searchOpenSearchInfo.getImageUrl());
    }

    /* renamed from: a */
    public void mo184805a(SearchOpenSearchInfo searchOpenSearchInfo, ChatterChatViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(searchOpenSearchInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo184645a().getItem().mo184669a(new SummaryModel(searchOpenSearchInfo.getExtraTitle()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSearchBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "clickHandler");
        this.f133690b = context;
        HashMap<Integer, TextTag.Builder> hashMap = new HashMap<>();
        this.f133689a = hashMap;
        TextTag.Builder aVar = new TextTag.Builder();
        aVar.mo90134a(4096);
        aVar.mo90145d(R.color.lkui_N600);
        aVar.mo90147e(R.color.lkui_N200);
        hashMap.put(0, aVar);
        TextTag.Builder aVar2 = new TextTag.Builder();
        aVar2.mo90134a(4097);
        aVar2.mo90145d(R.color.LARK_TAG_TEXT_BLUE);
        aVar2.mo90147e(R.color.LARK_TAG_TEXT_BLUE_BG);
        hashMap.put(1, aVar2);
        TextTag.Builder aVar3 = new TextTag.Builder();
        aVar3.mo90134a(4098);
        aVar3.mo90145d(R.color.LARK_TAG_TEXT_GREEN);
        aVar3.mo90147e(R.color.LARK_TAG_TEXT_GREEN_BG);
        hashMap.put(2, aVar3);
        TextTag.Builder aVar4 = new TextTag.Builder();
        aVar4.mo90134a(4099);
        aVar4.mo90145d(R.color.LARK_TAG_TEXT_ORANGE);
        aVar4.mo90147e(R.color.LARK_TAG_TEXT_ORANGE_BG);
        hashMap.put(3, aVar4);
        TextTag.Builder aVar5 = new TextTag.Builder();
        aVar5.mo90134a(4100);
        aVar5.mo90145d(R.color.LARK_TAG_TEXT_RED);
        aVar5.mo90147e(R.color.LARK_TAG_TEXT_READ_BG);
        hashMap.put(4, aVar5);
    }

    /* renamed from: a */
    public void mo184807b(int i, ChatterChatViewHolder aVar, SearchOpenSearchInfo searchOpenSearchInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchOpenSearchInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LarkNameTag.Builder bVar = new LarkNameTag.Builder(this.f133690b);
        List<SlashCommandMeta.SlashCommandTag> tag = searchOpenSearchInfo.getTag();
        if (tag != null && (!tag.isEmpty())) {
            for (T t : tag) {
                TextTag.Builder aVar2 = this.f133689a.get(t.type);
                if (aVar2 != null) {
                    aVar2.mo90136a(t.text);
                    LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) bVar, aVar2.mo90154l(), false, 2, (Object) null);
                }
            }
        }
        aVar.mo184645a().getItem().setTag(bVar);
    }
}
