package com.ss.android.lark.search.service.recommend;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.search.recommend.v1.ActionRecommend;
import com.bytedance.lark.pb.search.recommend.v1.SearchRecommendRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.ai.ActionRecommend;
import com.ss.android.lark.pb.urecommend.LayoutStyle;
import com.ss.android.lark.pb.urecommend.RecommendEntitySection;
import com.ss.android.lark.pb.urecommend.RecommendSection;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.pb.urecommend.UniversalRecommendRequest;
import com.ss.android.lark.pb.urecommend.UniversalRecommendRequestHeader;
import com.ss.android.lark.pb.urecommend.UniversalRecommendResponse;
import com.ss.android.lark.pb.urecommend.UniversalRecommendResponseHeader;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import com.ss.android.lark.pb.usearch.SearchResult;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchActionRecommend;
import com.ss.android.lark.searchcommon.dto.info.SearchActionRecommendInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHistoryListInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.v2.passthrough.MetaParser;
import com.ss.android.lark.searchcommon.utils.PhysicsScreenSizeUtils;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0015H\u0002J\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/search/service/recommend/RecommendService;", "Lcom/ss/android/lark/search/service/recommend/IRecommendService;", "()V", "TAG", "", "commonRecommend", "", "sectionList", "", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "pageToken", "session", "tagName", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "parseActionRecommend", "Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommend;", "pbActionRecommend", "Lcom/bytedance/lark/pb/search/recommend/v1/ActionRecommend;", "parseActionRecommendPassThrough", "Lcom/ss/android/lark/pb/ai/ActionRecommend;", "topResultPageRecommend", "requestId", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.d.b */
public final class RecommendService {

    /* renamed from: a */
    public static final RecommendService f131805a = new RecommendService();

    private RecommendService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/service/recommend/RecommendService$commonRecommend$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/urecommend/UniversalRecommendResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.d.b$a */
    public static final class C53306a implements IGetDataCallback<UniversalRecommendResponse> {

        /* renamed from: a */
        final /* synthetic */ String f131806a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f131807b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f131807b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(UniversalRecommendResponse universalRecommendResponse) {
            String str;
            Iterator<T> it;
            Iterator<T> it2;
            boolean z;
            UniversalRecommendResponseHeader universalRecommendResponseHeader;
            ArrayList arrayList = new ArrayList();
            if (universalRecommendResponse == null || (universalRecommendResponseHeader = universalRecommendResponse.mheader) == null) {
                str = null;
            } else {
                str = universalRecommendResponseHeader.msession_id;
            }
            boolean z2 = true;
            if (!Intrinsics.areEqual(str, this.f131806a)) {
                this.f131807b.onSuccess(new SearchResponse());
                C53241h.m205898b("LarkSearch.Search.RecommendService", "session not same, callback empty list, return.");
                return;
            }
            List<RecommendSection> list = universalRecommendResponse.mrecommend_sections;
            Intrinsics.checkExpressionValueIsNotNull(list, "data.mrecommend_sections");
            Iterator<T> it3 = list.iterator();
            String str2 = "";
            boolean z3 = false;
            int i = 0;
            while (it3.hasNext()) {
                T next = it3.next();
                RecommendSection.SectionType sectionType = next.msection_type;
                if (sectionType != null) {
                    int i2 = C53309c.f131812c[sectionType.ordinal()];
                    int i3 = 2;
                    if (i2 != z2) {
                        if (i2 == 2) {
                            RecommendSection.SearchRelatedSections searchRelatedSections = next.mrecommend_content.msearch_related_section;
                            List<SearchInfoHistory> c = C53287b.m206220c(searchRelatedSections.msearch_histories.msearch_histories);
                            Intrinsics.checkExpressionValueIsNotNull(c, "SearchService.parseSearc…tories.msearch_histories)");
                            if (c.isEmpty() ^ z2) {
                                Integer num = searchRelatedSections.mmax_rows;
                                Intrinsics.checkExpressionValueIsNotNull(num, "mmax_rows");
                                SearchHistoryListInfo searchHistoryListInfo = new SearchHistoryListInfo(c, num.intValue());
                                int i4 = i + 1;
                                searchHistoryListInfo.setHeaderId(i);
                                searchHistoryListInfo.setId(String.valueOf(searchHistoryListInfo.getHeaderId()));
                                Unit unit = Unit.INSTANCE;
                                SearchPlaceholderInfo searchPlaceholderInfo = new SearchPlaceholderInfo();
                                searchPlaceholderInfo.setPlaceholderType(SearchPlaceholderInfo.Type.RECOMMEND_HISTORY_HEADER);
                                searchPlaceholderInfo.setTitle(searchRelatedSections.mtitle);
                                searchPlaceholderInfo.setHeaderId(searchHistoryListInfo.getHeaderId());
                                searchPlaceholderInfo.setId(String.valueOf(searchPlaceholderInfo.getHeaderId()));
                                Unit unit2 = Unit.INSTANCE;
                                arrayList.add(searchPlaceholderInfo);
                                arrayList.add(searchHistoryListInfo);
                                SearchPlaceholderInfo searchPlaceholderInfo2 = new SearchPlaceholderInfo();
                                searchPlaceholderInfo2.setPlaceholderType(SearchPlaceholderInfo.Type.DIVIDER_14DP);
                                i = i4 + 1;
                                searchPlaceholderInfo2.setHeaderId(i4);
                                searchPlaceholderInfo2.setId(String.valueOf(searchPlaceholderInfo2.getHeaderId()));
                                Unit unit3 = Unit.INSTANCE;
                                arrayList.add(searchPlaceholderInfo2);
                            }
                            Unit unit4 = Unit.INSTANCE;
                        } else if (i2 == 3) {
                            RecommendSection.SearchRelatedSections searchRelatedSections2 = next.mrecommend_content.msearch_related_section;
                            ArrayList arrayList2 = new ArrayList();
                            List<ActionRecommend> list2 = next.mrecommend_content.msearch_related_section.maction_recommends.maction_recommends;
                            Intrinsics.checkExpressionValueIsNotNull(list2, "it.mrecommend_content.ms…mmends.maction_recommends");
                            for (T t : list2) {
                                RecommendService bVar = RecommendService.f131805a;
                                Intrinsics.checkExpressionValueIsNotNull(t, "actionRecommend");
                                SearchActionRecommend a = bVar.mo181930a((ActionRecommend) t);
                                if (a != null) {
                                    arrayList2.add(a);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                            }
                            if (arrayList2.isEmpty() ^ z2) {
                                Integer num2 = searchRelatedSections2.mmax_rows;
                                Intrinsics.checkExpressionValueIsNotNull(num2, "mmax_rows");
                                SearchActionRecommendInfo searchActionRecommendInfo = new SearchActionRecommendInfo(arrayList2, num2.intValue());
                                int i5 = i + 1;
                                searchActionRecommendInfo.setHeaderId(i);
                                searchActionRecommendInfo.setId(String.valueOf(searchActionRecommendInfo.getHeaderId()));
                                Unit unit6 = Unit.INSTANCE;
                                SearchPlaceholderInfo searchPlaceholderInfo3 = new SearchPlaceholderInfo();
                                searchPlaceholderInfo3.setPlaceholderType(SearchPlaceholderInfo.Type.RECOMMEND_ACTION_HEADER);
                                searchPlaceholderInfo3.setTitle(searchRelatedSections2.mtitle);
                                searchPlaceholderInfo3.setHeaderId(searchActionRecommendInfo.getHeaderId());
                                searchPlaceholderInfo3.setId(String.valueOf(searchPlaceholderInfo3.getHeaderId()));
                                Unit unit7 = Unit.INSTANCE;
                                arrayList.add(searchPlaceholderInfo3);
                                arrayList.add(searchActionRecommendInfo);
                                SearchPlaceholderInfo searchPlaceholderInfo4 = new SearchPlaceholderInfo();
                                searchPlaceholderInfo4.setPlaceholderType(SearchPlaceholderInfo.Type.DIVIDER_14DP);
                                i = i5 + 1;
                                searchPlaceholderInfo4.setHeaderId(i5);
                                searchPlaceholderInfo4.setId(String.valueOf(searchPlaceholderInfo4.getHeaderId()));
                                Unit unit8 = Unit.INSTANCE;
                                arrayList.add(searchPlaceholderInfo4);
                            }
                            Unit unit9 = Unit.INSTANCE;
                        }
                        it = it3;
                        it3 = it;
                        z2 = true;
                    } else {
                        List<RecommendEntitySection> list3 = next.mrecommend_content.mentity_recommend.mentity_sections;
                        Intrinsics.checkExpressionValueIsNotNull(list3, "mentity_sections");
                        for (T t2 : list3) {
                            LayoutStyle.Style style = t2.mlayout_style.mstyle;
                            if (style != null) {
                                int i6 = C53309c.f131811b[style.ordinal()];
                                if (i6 == z2) {
                                    SearchCardInfo searchCardInfo = new SearchCardInfo();
                                    int i7 = i + 1;
                                    searchCardInfo.setHeaderId(i);
                                    searchCardInfo.setId(String.valueOf(searchCardInfo.getHeaderId()));
                                    searchCardInfo.setScene(Scene.Type.RECOMMEND);
                                    searchCardInfo.setOwnedCardTitle(t2.men_title);
                                    searchCardInfo.setSession(this.f131806a);
                                    LayoutStyle.CardStyle cardStyle = t2.mlayout_style.mcard_style;
                                    Integer num3 = cardStyle.mexpand_rows;
                                    Intrinsics.checkExpressionValueIsNotNull(num3, "style.mexpand_rows");
                                    searchCardInfo.setRowLimit(num3.intValue());
                                    Integer num4 = cardStyle.mcols;
                                    Intrinsics.checkExpressionValueIsNotNull(num4, "style.mcols");
                                    searchCardInfo.setColumnLimit(num4.intValue());
                                    Boolean bool = cardStyle.mdefualt_is_expand;
                                    Intrinsics.checkExpressionValueIsNotNull(bool, "style.mdefualt_is_expand");
                                    searchCardInfo.setExpand(bool.booleanValue());
                                    Boolean bool2 = cardStyle.mdefualt_is_expand;
                                    Intrinsics.checkExpressionValueIsNotNull(bool2, "style.mdefualt_is_expand");
                                    searchCardInfo.setDefaultExpand(bool2.booleanValue());
                                    searchCardInfo.setAvatarStyle(cardStyle.micon_style);
                                    Unit unit10 = Unit.INSTANCE;
                                    List<SearchBaseInfo> infoList = searchCardInfo.getInfoList();
                                    List<SearchResult> list4 = t2.mresults;
                                    Intrinsics.checkExpressionValueIsNotNull(list4, "section.mresults");
                                    ArrayList arrayList3 = new ArrayList();
                                    for (T t3 : list4) {
                                        MetaParser aVar = MetaParser.f133230a;
                                        SearchEntityType searchEntityType = t3.mtype;
                                        Intrinsics.checkExpressionValueIsNotNull(searchEntityType, "item.mtype");
                                        SearchBaseInfo a2 = aVar.mo184340a(searchEntityType, t3);
                                        if (a2 != null) {
                                            a2.setScene(Scene.Type.RECOMMEND);
                                            a2.setOwnedCardTitle(t2.men_title);
                                            a2.setSession(this.f131806a);
                                        } else {
                                            a2 = null;
                                        }
                                        if (a2 != null) {
                                            arrayList3.add(a2);
                                        }
                                        it3 = it3;
                                    }
                                    it2 = it3;
                                    infoList.addAll(arrayList3);
                                    int rowLimit = searchCardInfo.getRowLimit() * searchCardInfo.getColumnLimit();
                                    if (searchCardInfo.getInfoList().size() > rowLimit) {
                                        searchCardInfo.getInfoList().subList(rowLimit, searchCardInfo.getInfoList().size()).clear();
                                    }
                                    searchCardInfo.getTopRowList().clear();
                                    searchCardInfo.getNonTopRowList().clear();
                                    if (searchCardInfo.getInfoList().size() > searchCardInfo.getColumnLimit()) {
                                        searchCardInfo.getTopRowList().addAll(CollectionsKt.toMutableList((Collection) searchCardInfo.getInfoList().subList(0, searchCardInfo.getColumnLimit())));
                                        searchCardInfo.getNonTopRowList().addAll(CollectionsKt.toMutableList((Collection) searchCardInfo.getInfoList().subList(searchCardInfo.getColumnLimit(), searchCardInfo.getInfoList().size())));
                                    } else {
                                        searchCardInfo.getTopRowList().addAll(searchCardInfo.getInfoList());
                                        searchCardInfo.getNonTopRowList().clear();
                                    }
                                    Unit unit11 = Unit.INSTANCE;
                                    if (searchCardInfo.getInfoList().size() > 0) {
                                        SearchPlaceholderInfo searchPlaceholderInfo5 = new SearchPlaceholderInfo();
                                        searchPlaceholderInfo5.setPlaceholderType(SearchPlaceholderInfo.Type.CARD_RECOMMEND_HEADER);
                                        searchPlaceholderInfo5.setTitle(t2.mtitle);
                                        searchPlaceholderInfo5.setHeaderId(searchCardInfo.getHeaderId());
                                        searchPlaceholderInfo5.setId(String.valueOf(searchPlaceholderInfo5.getHeaderId()));
                                        if (searchCardInfo.getNonTopRowList().size() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        searchPlaceholderInfo5.setHasMore(z);
                                        searchPlaceholderInfo5.setAttachInfo(searchCardInfo);
                                        Unit unit12 = Unit.INSTANCE;
                                        arrayList.add(searchPlaceholderInfo5);
                                        arrayList.add(searchCardInfo);
                                        SearchPlaceholderInfo searchPlaceholderInfo6 = new SearchPlaceholderInfo();
                                        searchPlaceholderInfo6.setPlaceholderType(SearchPlaceholderInfo.Type.CARD_FOOTER);
                                        searchPlaceholderInfo6.setHeaderId(searchCardInfo.getHeaderId());
                                        searchPlaceholderInfo6.setId(String.valueOf(searchPlaceholderInfo6.getHeaderId()));
                                        Unit unit13 = Unit.INSTANCE;
                                        arrayList.add(searchPlaceholderInfo6);
                                        SearchPlaceholderInfo searchPlaceholderInfo7 = new SearchPlaceholderInfo();
                                        searchPlaceholderInfo7.setPlaceholderType(SearchPlaceholderInfo.Type.DIVIDER_8DP);
                                        searchPlaceholderInfo7.setHeaderId(i7);
                                        searchPlaceholderInfo7.setId(String.valueOf(searchPlaceholderInfo7.getHeaderId()));
                                        Unit unit14 = Unit.INSTANCE;
                                        arrayList.add(searchPlaceholderInfo7);
                                        i = i7 + 1;
                                    } else {
                                        i = i7;
                                    }
                                } else if (i6 == i3) {
                                    int i8 = i + 1;
                                    List<SearchResult> list5 = t2.mresults;
                                    Intrinsics.checkExpressionValueIsNotNull(list5, "section.mresults");
                                    ArrayList arrayList4 = new ArrayList();
                                    for (T t4 : list5) {
                                        MetaParser aVar2 = MetaParser.f133230a;
                                        SearchEntityType searchEntityType2 = t4.mtype;
                                        Intrinsics.checkExpressionValueIsNotNull(searchEntityType2, "item.mtype");
                                        SearchBaseInfo a3 = aVar2.mo184340a(searchEntityType2, t4);
                                        if (a3 != null) {
                                            a3.setHeaderLabel(t2.mtitle);
                                            a3.setHeaderId(i);
                                            a3.setAvatarStyle(t2.mlayout_style.mlist_style.micon_style);
                                            a3.setScene(Scene.Type.RECOMMEND);
                                            a3.setOwnedCardTitle(t2.men_title);
                                            a3.setSession(this.f131806a);
                                            Unit unit15 = Unit.INSTANCE;
                                        } else {
                                            a3 = null;
                                        }
                                        if (a3 != null) {
                                            arrayList4.add(a3);
                                        }
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    if (!arrayList5.isEmpty()) {
                                        arrayList.addAll(arrayList5);
                                        SearchPlaceholderInfo searchPlaceholderInfo8 = new SearchPlaceholderInfo();
                                        searchPlaceholderInfo8.setPlaceholderType(SearchPlaceholderInfo.Type.CARD_FOOTER);
                                        searchPlaceholderInfo8.setHeaderId(i);
                                        searchPlaceholderInfo8.setId(String.valueOf(i));
                                        arrayList.add(searchPlaceholderInfo8);
                                        SearchPlaceholderInfo searchPlaceholderInfo9 = new SearchPlaceholderInfo();
                                        searchPlaceholderInfo9.setPlaceholderType(SearchPlaceholderInfo.Type.DIVIDER_8DP);
                                        searchPlaceholderInfo9.setHeaderId(i8);
                                        searchPlaceholderInfo9.setId(String.valueOf(searchPlaceholderInfo9.getHeaderId()));
                                        arrayList.add(searchPlaceholderInfo9);
                                        i8++;
                                    }
                                    Boolean bool3 = t2.mhas_more;
                                    Intrinsics.checkExpressionValueIsNotNull(bool3, "section.mhas_more");
                                    boolean booleanValue = bool3.booleanValue();
                                    String str3 = t2.mpagination_token;
                                    Intrinsics.checkExpressionValueIsNotNull(str3, "section.mpagination_token");
                                    it2 = it3;
                                    i = i8;
                                    str2 = str3;
                                    z3 = booleanValue;
                                }
                                it3 = it2;
                                z2 = true;
                                i3 = 2;
                            }
                            C53241h.m205894a("LarkSearch.Search.RecommendService", "section style type err!");
                            it2 = it3;
                            it3 = it2;
                            z2 = true;
                            i3 = 2;
                        }
                        it = it3;
                        Unit unit16 = Unit.INSTANCE;
                        it3 = it;
                        z2 = true;
                    }
                }
                C53241h.m205894a("LarkSearch.Search.RecommendService", "ERROR!!!");
                it = it3;
                it3 = it;
                z2 = true;
            }
            IGetDataCallback iGetDataCallback = this.f131807b;
            SearchResponse searchResponse = new SearchResponse();
            searchResponse.setInfoList(arrayList);
            searchResponse.setHasMore(z3);
            searchResponse.setPageToken(str2);
            Unit unit17 = Unit.INSTANCE;
            iGetDataCallback.onSuccess(searchResponse);
        }

        C53306a(String str, IGetDataCallback iGetDataCallback) {
            this.f131806a = str;
            this.f131807b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/urecommend/UniversalRecommendResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.d.b$b */
    static final class C53307b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C53307b f131808a = new C53307b();

        C53307b() {
        }

        /* renamed from: a */
        public final UniversalRecommendResponse parse(byte[] bArr) {
            return UniversalRecommendResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    public final SearchActionRecommend mo181929a(com.bytedance.lark.pb.search.recommend.v1.ActionRecommend actionRecommend) {
        boolean z;
        if (actionRecommend.type != ActionRecommend.ActionRecommendType.OPERATION_RECOMMEND) {
            return null;
        }
        String str = actionRecommend.body;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        SearchActionRecommend searchActionRecommend = new SearchActionRecommend();
        String str2 = actionRecommend.body;
        Intrinsics.checkExpressionValueIsNotNull(str2, "pbActionRecommend.body");
        searchActionRecommend.setText(str2);
        return searchActionRecommend;
    }

    /* renamed from: a */
    public final SearchActionRecommend mo181930a(com.ss.android.lark.pb.ai.ActionRecommend actionRecommend) {
        boolean z;
        if (actionRecommend.mtype != ActionRecommend.ActionRecommendType.OPERATION_RECOMMEND) {
            return null;
        }
        String str = actionRecommend.mbody;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        SearchActionRecommend searchActionRecommend = new SearchActionRecommend();
        String str2 = actionRecommend.mbody;
        Intrinsics.checkExpressionValueIsNotNull(str2, "pbActionRecommend.mbody");
        searchActionRecommend.setText(str2);
        return searchActionRecommend;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.d.b$c */
    static final class C53308c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f131809a;

        C53308c(String str) {
            this.f131809a = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019b A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.lark.searchcommon.dto.SearchResponse parse(byte[] r14) {
            /*
            // Method dump skipped, instructions count: 572
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.service.recommend.RecommendService.C53308c.parse(byte[]):com.ss.android.lark.searchcommon.dto.SearchResponse");
        }
    }

    /* renamed from: a */
    public void mo181931a(String str, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.GET_SEARCH_RECOMMEND, new SearchRecommendRequest.C18775a(), str, iGetDataCallback, new C53308c(str));
    }

    /* renamed from: a */
    public void mo181932a(List<SectionEntityType> list, String str, String str2, String str3, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "sectionList");
        Intrinsics.checkParameterIsNotNull(str, "pageToken");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        Intrinsics.checkParameterIsNotNull(str3, "tagName");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C53241h.m205899c("LarkSearch.Search.RecommendService", "commonRecommend call trace: " + SearchCommonUtils.m209225a());
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.GET_UNIVERSAL_RECOMMEND;
        UniversalRecommendRequest.C50166a aVar = new UniversalRecommendRequest.C50166a();
        UniversalRecommendRequestHeader.C50170a a = new UniversalRecommendRequestHeader.C50170a().mo174178a(list).mo174177a(str).mo174182c(str2).mo174175a(new UniversalRecommendRequestHeader.RecommendContext.C50168a().mo174170a(str3).build());
        ISearchModuleDependency a2 = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
        Locale a3 = a2.mo181733a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "SearchModule.getDependency().cachedLanguageSetting");
        SdkSender.sendPassThroughRequest(command, aVar.mo174165a(a.mo174181b(a3.getLanguage()).mo174176a(Integer.valueOf(C69029a.m265653a(PhysicsScreenSizeUtils.f133386a.mo184559a()))).mo174180b(Integer.valueOf(C69029a.m265653a(PhysicsScreenSizeUtils.f133386a.mo184560b()))).build()), new C53306a(str2, iGetDataCallback), C53307b.f131808a);
    }
}
