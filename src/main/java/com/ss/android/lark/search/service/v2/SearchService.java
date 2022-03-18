package com.ss.android.lark.search.service.v2;

import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.search.v1.ChatterPermissionsRequest;
import com.bytedance.lark.pb.search.v2.BaseEntity;
import com.bytedance.lark.pb.search.v2.BaseEnum;
import com.bytedance.lark.pb.search.v2.SearchCommonRequestHeader;
import com.bytedance.lark.pb.search.v2.SearchEntityType;
import com.bytedance.lark.pb.search.v2.SuggestionType;
import com.bytedance.lark.pb.search.v2.UniversalFilters;
import com.bytedance.lark.pb.search.v2.UniversalSearchRequest;
import com.bytedance.lark.pb.search.v2.UniversalSearchResponse;
import com.bytedance.lark.pb.search.v2.UniversalSelectors;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.p2584b.AbstractC53280a;
import com.ss.android.lark.searchcommon.SearchArgsSetting;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import com.ss.android.lark.searchcommon.service.v2.UniversalSearchResponseParser;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JX\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J¬\u0001\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00042\u0010\b\u0001\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0001\u0010\u001f\u001a\u00020\u001c2\b\b\u0001\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020\u001c2\b\b\u0001\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010$\u001a\u00020\u001cH\u0016Jb\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0001\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010#\u001a\u00020\u001cH\u0016JF\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016JN\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016Jv\u0010,\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00152\u0006\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016Jf\u00103\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u00104\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J¹\u0001\u00105\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001082\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020=2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010C\u001a\u00020D2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0002\u0010EJ^\u0010F\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0001\u0010J\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010L\u001a\u00020M2\b\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u0010N\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0002\u0010OJ>\u0010P\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J>\u0010Q\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J>\u0010R\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0010\u0010S\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ6\u0010T\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010U\u001a\u00020V2\b\b\u0001\u0010W\u001a\u00020M2\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J6\u0010X\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010U\u001a\u00020V2\b\b\u0001\u0010W\u001a\u00020M2\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/search/service/v2/SearchService;", "Lcom/ss/android/lark/search/service/v2/ISearchService;", "()V", "TAG", "", "mergePolicy", "Lcom/bytedance/lark/pb/search/v2/BaseEnum$MergePolicy;", "setting", "Lcom/ss/android/lark/searchcommon/SearchArgsSetting;", "getSetting", "()Lcom/ss/android/lark/searchcommon/SearchArgsSetting;", "openSearch", "", "requestId", SearchIntents.EXTRA_QUERY, "session", "seqId", "", "pageToken", "appId", "extras", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "searchAddChatter", "chatIds", "includeOuterTenant", "", "permission", "Lcom/ss/android/lark/search/service/ISearchService$AddChatterPermission;", "disableSearchChatter", "fromChat", "searchOuterGroupChat", "fromDepartment", "isSearchableWhenVisible", "includeMailContact", "searchAddChatterForCalendar", "isCheckPermission", "searchApp", "includeBot", "searchCard", "qaCardEnable", "serviceCardEnable", "searchChat", "chatMode", "Lcom/bytedance/lark/pb/basic/v1/Chat$ChatMode;", "excludeWithoutChatUser", "excludeResignedUser", "includeThread", "isCheckOUPermission", "searchChatter", "includeSecretP2pChat", "searchDoc", "chatId", "docOwnerIds", "", "docTypes", "Lcom/bytedance/lark/pb/basic/v1/Doc$Type;", "myOwnDoc", "docCategory", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;", "docSharerIds", "docChatIds", "timeStart", "", "timeEnd", "searchContentType", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "searchGroup", "chatMembers", "chatTypes", "Lcom/ss/android/lark/searchcommon/service/entity/ChatType;", "searchMessage", "creatorIds", "searchType", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "hideBot", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/searchcommon/dto/Scene$Type;Ljava/lang/String;ZLcom/larksuite/framework/callback/IGetDataCallback;)V", "searchOnCall", "searchThread", "smartSearch", "syncSetting", "universalSearch", "request", "Lcom/bytedance/lark/pb/search/v2/UniversalSearchRequest$Builder;", "scene", "universalSearchWithLog", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.e.a */
public final class SearchService {

    /* renamed from: a */
    public static final SearchService f131813a = new SearchService();

    /* renamed from: b */
    private static BaseEnum.MergePolicy f131814b;

    /* renamed from: c */
    private static final SearchArgsSetting f131815c = new SearchArgsSetting();

    private SearchService() {
    }

    /* renamed from: a */
    public final SearchArgsSetting mo181936a() {
        return f131815c;
    }

    /* renamed from: a */
    public void mo181944a(String str, String str2, String str3, int i, String str4, List<String> list, boolean z, AbstractC53280a.C53281a aVar, IGetDataCallback<SearchResponse> iGetDataCallback, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(aVar, "permission");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String str5 = "";
        if (list != null) {
            String str6 = list.isEmpty() ^ true ? list.get(0) : str5;
            if (str6 != null) {
                str5 = str6;
            }
        }
        UniversalSearchRequest.C19089a aVar2 = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.ADD_CHAT_CHATTERS.toString());
        ArrayList arrayList = new ArrayList();
        if (!z2) {
            BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.USER).mo64942a(f131814b);
            BaseEntity.EntityFilter.C18947a aVar3 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar4 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.UN_RESIGNED.getValue()));
            BaseEntity.EntityItem a3 = a2.mo64940a(aVar3.mo64934a(aVar4.mo65292a(arrayList2).build()).build()).mo64941a(new BaseEntity.EntitySelector.C18951a().mo64951a(new UniversalSelectors.UserSelector.C19103a().mo65343a(str5).build()).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a3, "EntityItem.Builder()\n   …                 .build()");
            arrayList.add(a3);
        }
        if (z3) {
            BaseEntity.EntityItem.C18949a a4 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.GROUP_CHAT).mo64942a(f131814b);
            BaseEntity.EntityFilter.C18947a aVar5 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.ChatFilter.C19061a aVar6 = new UniversalFilters.ChatFilter.C19061a();
            ArrayList arrayList3 = new ArrayList();
            if (!z4) {
                arrayList3.add(Integer.valueOf(UniversalFilters.ChatFilter.SearchType.UN_CROSS_TENANT.getValue()));
            }
            BaseEntity.EntityItem a5 = a4.mo64940a(aVar5.mo64927a(aVar6.mo65225b(arrayList3).mo65222a(Boolean.valueOf(!z6)).build()).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a5, "EntityItem.Builder()\n   …                 .build()");
            arrayList.add(a5);
        }
        if (z5) {
            BaseEntity.EntityItem a6 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.DEPARTMENT).mo64942a(f131814b).mo64940a(new BaseEntity.EntityFilter.C18947a().mo64929a(new UniversalFilters.DepartmentFilter.C19069a().mo65244a(Boolean.valueOf(!z6)).build()).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a6, "EntityItem.Builder()\n   …                 .build()");
            arrayList.add(a6);
        }
        if (z7) {
            BaseEntity.EntityItem a7 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.MAIL_CONTACT).mo64942a(f131814b).mo64940a(new BaseEntity.EntityFilter.C18947a().mo64929a(new UniversalFilters.DepartmentFilter.C19069a().mo65244a(Boolean.valueOf(!z6)).build()).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a7, "EntityItem.Builder()\n   …                 .build()");
            arrayList.add(a7);
        }
        SearchCommonRequestHeader.C19015a a8 = c.mo65094a(a.mo64958a(arrayList).mo64956a(new UniversalFilters.CommonFilter.C19063a().mo65230a(Boolean.valueOf(z)).build()).build());
        ArrayList arrayList4 = new ArrayList();
        if (aVar.mo181840b()) {
            arrayList4.add(ActionType.INVITE_SAME_CRYPTO_CHAT);
        } else if (aVar.mo181842c()) {
            arrayList4.add(ActionType.INVITE_SAME_CROSS_TENANT_CHAT);
        } else if (aVar.mo181838a()) {
            arrayList4.add(ActionType.INVITE_SAME_CHAT);
        }
        if (!arrayList4.isEmpty()) {
            a8.mo65095a(new BaseEntity.SearchExtras.C18957a().mo64968a(new ChatterPermissionsRequest.C18817a().mo64609a(arrayList4).build()).build());
        }
        UniversalSearchRequest.C19089a a9 = aVar2.mo65311a(a8.build());
        Intrinsics.checkExpressionValueIsNotNull(a9, "request");
        m206299b(str, a9, Scene.Type.ADD_CHAT_CHATTERS, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181948a(String str, String str2, String str3, int i, String str4, boolean z, boolean z2, IGetDataCallback<SearchResponse> iGetDataCallback, boolean z3, boolean z4) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_IN_CALENDAR_SCENE.toString());
        BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.USER).mo64942a(f131814b);
        BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
        UniversalFilters.UserFilter.C19083a aVar3 = new UniversalFilters.UserFilter.C19083a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.UN_RESIGNED.getValue()));
        List<BaseEntity.EntityItem> mutableListOf = CollectionsKt.mutableListOf(a2.mo64940a(aVar2.mo64934a(aVar3.mo65292a(arrayList).build()).build()).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.GROUP_CHAT).mo64942a(f131814b).build());
        if (z3) {
            mutableListOf.add(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.DEPARTMENT).mo64942a(f131814b).mo64940a(new BaseEntity.EntityFilter.C18947a().mo64929a(new UniversalFilters.DepartmentFilter.C19069a().mo65244a(Boolean.valueOf(!z4)).build()).build()).build());
        }
        SearchCommonRequestHeader.C19015a a3 = c.mo65094a(a.mo64958a(mutableListOf).mo64956a(new UniversalFilters.CommonFilter.C19063a().mo65230a(Boolean.valueOf(z)).build()).build());
        ArrayList arrayList2 = new ArrayList();
        if (z2) {
            arrayList2.add(ActionType.INVITE_SAME_CHAT);
        }
        if (!arrayList2.isEmpty()) {
            a3.mo65095a(new BaseEntity.SearchExtras.C18957a().mo64968a(new ChatterPermissionsRequest.C18817a().mo64609a(arrayList2).build()).build());
        }
        UniversalSearchRequest.C19089a a4 = aVar.mo65311a(a3.build());
        Intrinsics.checkExpressionValueIsNotNull(a4, "request");
        m206299b(str, a4, Scene.Type.SEARCH_IN_CALENDAR_SCENE, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181945a(String str, String str2, String str3, int i, String str4, List<? extends Chat.ChatMode> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, IGetDataCallback<SearchResponse> iGetDataCallback) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.TRANSMIT_MESSAGES.toString());
        BaseEntity.EntityItem[] entityItemArr = new BaseEntity.EntityItem[3];
        BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.USER).mo64942a(f131814b);
        if (z && z2) {
            BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar3 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.RESIGNED.getValue() | UniversalFilters.UserFilter.SearchType.UN_TALKED.getValue()));
            a2.mo64940a(aVar2.mo64934a(aVar3.mo65292a(arrayList2).mo65291a((Boolean) true).build()).build());
        } else if (z) {
            BaseEntity.EntityFilter.C18947a aVar4 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar5 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.TALKED.getValue()));
            a2.mo64940a(aVar4.mo64934a(aVar5.mo65292a(arrayList3).build()).build());
        } else if (z2) {
            BaseEntity.EntityFilter.C18947a aVar6 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar7 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.UN_RESIGNED.getValue()));
            a2.mo64940a(aVar6.mo64934a(aVar7.mo65292a(arrayList4).build()).build());
        }
        entityItemArr[0] = a2.build();
        BaseEntity.EntityItem.C18949a a3 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.GROUP_CHAT).mo64942a(f131814b);
        BaseEntity.EntityFilter.C18947a aVar8 = new BaseEntity.EntityFilter.C18947a();
        UniversalFilters.ChatFilter.C19061a b = new UniversalFilters.ChatFilter.C19061a().mo65225b(CollectionsKt.mutableListOf(Integer.valueOf(UniversalFilters.ChatFilter.SearchType.JOINED.getValue())));
        if (list != null) {
            arrayList = list;
        } else {
            arrayList = new ArrayList();
        }
        entityItemArr[1] = a3.mo64940a(aVar8.mo64927a(b.mo65223a((List<Chat.ChatMode>) arrayList).build()).build()).build();
        entityItemArr[2] = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.BOT).mo64942a(f131814b).build();
        List<BaseEntity.EntityItem> mutableListOf = CollectionsKt.mutableListOf(entityItemArr);
        if (z4) {
            mutableListOf.add(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.THREAD).mo64942a(f131814b).build());
        }
        SearchCommonRequestHeader.C19015a a4 = c.mo65094a(a.mo64958a(mutableListOf).mo64956a(new UniversalFilters.CommonFilter.C19063a().mo65230a(Boolean.valueOf(z3)).build()).build());
        if (z5) {
            a4.mo65095a(new BaseEntity.SearchExtras.C18957a().mo64968a(new ChatterPermissionsRequest.C18817a().mo64609a(CollectionsKt.mutableListOf(ActionType.CREATE_P2P_CHAT)).build()).build());
        }
        UniversalSearchRequest.C19089a a5 = aVar.mo65311a(a4.build());
        Intrinsics.checkExpressionValueIsNotNull(a5, "request");
        m206299b(str, a5, Scene.Type.TRANSMIT_MESSAGES, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181942a(String str, String str2, String str3, int i, String str4, List<String> list, List<? extends ChatType> list2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_CHATS_IN_ADVANCE_SCENE.toString());
        BaseEntity.EntityItem[] entityItemArr = new BaseEntity.EntityItem[1];
        BaseEntity.EntityItem.C18949a aVar2 = new BaseEntity.EntityItem.C18949a();
        BaseEntity.EntityFilter.C18947a aVar3 = new BaseEntity.EntityFilter.C18947a();
        UniversalFilters.ChatFilter.C19061a aVar4 = new UniversalFilters.ChatFilter.C19061a();
        if (list == null) {
            list = new ArrayList();
        }
        UniversalFilters.ChatFilter.C19061a c2 = aVar4.mo65226c(list);
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            for (ChatType chatType : list2) {
                int i2 = C53312b.f131822a[chatType.ordinal()];
                if (i2 == 1) {
                    arrayList.add(Integer.valueOf(UniversalFilters.ChatFilter.SearchType.PRIVATE.getValue()));
                } else if (i2 == 2) {
                    arrayList.add(Integer.valueOf(UniversalFilters.ChatFilter.SearchType.CROSS_TENANT.getValue()));
                } else if (i2 == 3) {
                    arrayList.add(Integer.valueOf(UniversalFilters.ChatFilter.SearchType.PUBLIC.getValue() | UniversalFilters.ChatFilter.SearchType.JOINED.getValue()));
                } else if (i2 != 4) {
                    C53241h.m205894a("LarkSearch.Search.V2.SearchService", "Error type! " + chatType);
                } else {
                    arrayList.add(Integer.valueOf(UniversalFilters.ChatFilter.SearchType.PUBLIC.getValue() | UniversalFilters.ChatFilter.SearchType.UN_JOINED.getValue()));
                }
            }
        }
        entityItemArr[0] = aVar2.mo64940a(aVar3.mo64927a(c2.mo65225b(arrayList).build()).build()).mo64943a(SearchEntityType.GROUP_CHAT).mo64942a(f131814b).build();
        UniversalSearchRequest.C19089a a2 = aVar.mo65311a(c.mo65094a(a.mo64958a(CollectionsKt.mutableListOf(entityItemArr)).build()).mo65097a((Boolean) true).build());
        Intrinsics.checkExpressionValueIsNotNull(a2, "request");
        m206299b(str, a2, Scene.Type.SEARCH_CHATS_IN_ADVANCE_SCENE, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181943a(String str, String str2, String str3, int i, String str4, List<String> list, List<String> list2, Long l, Long l2, Scene.Type type, String str5, boolean z, IGetDataCallback<SearchResponse> iGetDataCallback) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(type, "searchType");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_MESSAGES.toString());
        if (str5 != null) {
            if (list != null) {
                list.clear();
            }
            a.mo64956a(new UniversalFilters.CommonFilter.C19063a().mo65231a(str5).build());
        }
        BaseEntity.EntityItem[] entityItemArr = new BaseEntity.EntityItem[1];
        BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(type == Scene.Type.SEARCH_LINK ? SearchEntityType.URL : SearchEntityType.MESSAGE).mo64942a(f131814b);
        BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
        if (type == Scene.Type.SEARCH_LINK) {
            UniversalFilters.URLFilter.C19079a aVar3 = new UniversalFilters.URLFilter.C19079a();
            if (list != null) {
                arrayList3 = list;
            } else {
                arrayList3 = new ArrayList();
            }
            UniversalFilters.URLFilter.C19079a b = aVar3.mo65283b(arrayList3);
            if (list2 != null) {
                arrayList4 = list2;
            } else {
                arrayList4 = new ArrayList();
            }
            UniversalFilters.URLFilter.C19079a a3 = b.mo65281a(arrayList4);
            UniversalFilters.TimeRange.C19077a aVar4 = new UniversalFilters.TimeRange.C19077a();
            if (l != null) {
                aVar4.mo65274a(Long.valueOf(l.longValue()));
            }
            if (l2 != null) {
                aVar4.mo65276b(Long.valueOf(l2.longValue()));
            }
            aVar2.mo64933a(a3.mo65280a(aVar4.build()).build());
        } else {
            UniversalFilters.MessageFilter.C19073a aVar5 = new UniversalFilters.MessageFilter.C19073a();
            if (list != null) {
                arrayList = list;
            } else {
                arrayList = new ArrayList();
            }
            UniversalFilters.MessageFilter.C19073a b2 = aVar5.mo65262b(arrayList);
            if (list2 != null) {
                arrayList2 = list2;
            } else {
                arrayList2 = new ArrayList();
            }
            UniversalFilters.MessageFilter.C19073a a4 = b2.mo65260a(arrayList2);
            UniversalFilters.TimeRange.C19077a aVar6 = new UniversalFilters.TimeRange.C19077a();
            if (l != null) {
                aVar6.mo65274a(Long.valueOf(l.longValue()));
            }
            if (l2 != null) {
                aVar6.mo65276b(Long.valueOf(l2.longValue()));
            }
            UniversalFilters.MessageFilter.C19073a a5 = a4.mo65259a(aVar6.build());
            if (type == Scene.Type.SEARCH_FILE) {
                a5.mo65263c(CollectionsKt.listOf(Message.Type.FILE));
            } else if (type == Scene.Type.SEARCH_FILE_AND_FOLDER) {
                a5.mo65263c(CollectionsKt.listOf((Object[]) new Message.Type[]{Message.Type.FILE, Message.Type.FOLDER}));
            }
            if (z) {
                a5.mo65264d(CollectionsKt.mutableListOf(UniversalFilters.MessageFilter.FromType.USER));
            }
            aVar2.mo64931a(a5.build());
        }
        entityItemArr[0] = a2.mo64940a(aVar2.build()).build();
        UniversalSearchRequest.C19089a a6 = aVar.mo65311a(c.mo65094a(a.mo64958a(CollectionsKt.mutableListOf(entityItemArr)).build()).mo65097a((Boolean) true).build());
        Intrinsics.checkExpressionValueIsNotNull(a6, "request");
        m206299b(str, a6, Scene.Type.SEARCH_MESSAGES, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181946a(String str, String str2, String str3, int i, String str4, boolean z, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_OPEN_APP_SCENE.toString());
        List<BaseEntity.EntityItem> mutableListOf = CollectionsKt.mutableListOf(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.APP).mo64942a(f131814b).build());
        if (z) {
            mutableListOf.add(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.BOT).mo64942a(f131814b).build());
        }
        UniversalSearchRequest.C19089a a2 = aVar.mo65311a(c.mo65094a(a.mo64958a(mutableListOf).build()).build());
        Intrinsics.checkExpressionValueIsNotNull(a2, "request");
        m206299b(str, a2, Scene.Type.SEARCH_OPEN_APP_SCENE, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181941a(String str, String str2, String str3, int i, String str4, String str5, List<String> list, List<Doc.Type> list2, boolean z, SearchContext.DocCategory docCategory, List<String> list3, List<String> list4, Long l, Long l2, SearchContext.DocSearchContentType docSearchContentType, IGetDataCallback<SearchResponse> iGetDataCallback) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(docCategory, "docCategory");
        Intrinsics.checkParameterIsNotNull(docSearchContentType, "searchContentType");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_SPACE.toString());
        if (str5 != null) {
            a.mo64956a(new UniversalFilters.CommonFilter.C19063a().mo65231a(str5).build());
        }
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList9 = new ArrayList();
        if (docCategory == SearchContext.DocCategory.ALL || docCategory == SearchContext.DocCategory.DOC) {
            BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.DOC).mo64942a(f131814b);
            BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.DocFilter.C19071a aVar3 = new UniversalFilters.DocFilter.C19071a();
            if (list != null) {
                arrayList5 = list;
            } else {
                arrayList5 = new ArrayList();
            }
            if (z) {
                ISearchModuleDependency a3 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "SearchModule.getDependency()");
                ISearchModuleDependency.AbstractC53328n j = a3.mo181761j();
                Intrinsics.checkExpressionValueIsNotNull(j, "SearchModule.getDependency().loginDependency");
                String a4 = j.mo181815a();
                String str6 = a4;
                if (!(str6 == null || StringsKt.isBlank(str6))) {
                    Intrinsics.checkExpressionValueIsNotNull(a4, "userId");
                    arrayList5.add(a4);
                }
            }
            Unit unit2 = Unit.INSTANCE;
            UniversalFilters.DocFilter.C19071a a5 = aVar3.mo65250a(arrayList5);
            if (list2 != null) {
                arrayList6 = list2;
            } else {
                arrayList6 = new ArrayList();
            }
            UniversalFilters.DocFilter.C19071a c2 = a5.mo65253c(arrayList6);
            if (list3 != null) {
                arrayList7 = list3;
            } else {
                arrayList7 = new ArrayList();
            }
            UniversalFilters.DocFilter.C19071a e = c2.mo65255e(arrayList7);
            if (list4 != null) {
                arrayList8 = list4;
            } else {
                arrayList8 = new ArrayList();
            }
            UniversalFilters.DocFilter.C19071a b = e.mo65252b(arrayList8);
            UniversalFilters.TimeRange.C19077a aVar4 = new UniversalFilters.TimeRange.C19077a();
            if (l != null) {
                aVar4.mo65274a(Long.valueOf(l.longValue()));
            }
            if (l2 != null) {
                aVar4.mo65276b(Long.valueOf(l2.longValue()));
            }
            Unit unit3 = Unit.INSTANCE;
            UniversalFilters.DocFilter.C19071a a6 = b.mo65249a(aVar4.build());
            ArrayList arrayList10 = new ArrayList();
            int i2 = C53312b.f131823b[docSearchContentType.ordinal()];
            if (i2 == 1) {
                arrayList10.add(UniversalFilters.DocFilter.SearchContentType.ONLY_TITLE);
            } else if (i2 == 2) {
                arrayList10.add(UniversalFilters.DocFilter.SearchContentType.ONLY_COMMENT);
            } else if (i2 == 3) {
                arrayList10.add(UniversalFilters.DocFilter.SearchContentType.FULL_CONTENT);
            }
            a6.mo65254d(arrayList10);
            Unit unit4 = Unit.INSTANCE;
            BaseEntity.EntityItem a7 = a2.mo64940a(aVar2.mo64930a(a6.build()).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a7, "EntityItem.Builder()\n   …                 .build()");
            arrayList9.add(a7);
        }
        if (docCategory == SearchContext.DocCategory.ALL || docCategory == SearchContext.DocCategory.WIKI) {
            BaseEntity.EntityItem.C18949a a8 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.WIKI).mo64942a(f131814b);
            BaseEntity.EntityFilter.C18947a aVar5 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.WikiFilter.C19085a aVar6 = new UniversalFilters.WikiFilter.C19085a();
            if (list != null) {
                arrayList = list;
            } else {
                arrayList = new ArrayList();
            }
            if (z) {
                ISearchModuleDependency a9 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a9, "SearchModule.getDependency()");
                ISearchModuleDependency.AbstractC53328n j2 = a9.mo181761j();
                Intrinsics.checkExpressionValueIsNotNull(j2, "SearchModule.getDependency().loginDependency");
                String a10 = j2.mo181815a();
                String str7 = a10;
                if (!(str7 == null || StringsKt.isBlank(str7))) {
                    Intrinsics.checkExpressionValueIsNotNull(a10, "userId");
                    arrayList.add(a10);
                }
            }
            Unit unit5 = Unit.INSTANCE;
            UniversalFilters.WikiFilter.C19085a a11 = aVar6.mo65298a(arrayList);
            if (list2 != null) {
                arrayList2 = list2;
            } else {
                arrayList2 = new ArrayList();
            }
            UniversalFilters.WikiFilter.C19085a c3 = a11.mo65301c(arrayList2);
            if (list3 != null) {
                arrayList3 = list3;
            } else {
                arrayList3 = new ArrayList();
            }
            UniversalFilters.WikiFilter.C19085a e2 = c3.mo65303e(arrayList3);
            if (list4 != null) {
                arrayList4 = list4;
            } else {
                arrayList4 = new ArrayList();
            }
            UniversalFilters.WikiFilter.C19085a b2 = e2.mo65300b(arrayList4);
            UniversalFilters.TimeRange.C19077a aVar7 = new UniversalFilters.TimeRange.C19077a();
            if (l != null) {
                aVar7.mo65274a(Long.valueOf(l.longValue()));
            }
            if (l2 != null) {
                aVar7.mo65276b(Long.valueOf(l2.longValue()));
            }
            Unit unit6 = Unit.INSTANCE;
            UniversalFilters.WikiFilter.C19085a a12 = b2.mo65297a(aVar7.build());
            ArrayList arrayList11 = new ArrayList();
            int i3 = C53312b.f131824c[docSearchContentType.ordinal()];
            if (i3 == 1) {
                arrayList11.add(UniversalFilters.WikiFilter.SearchContentType.ONLY_TITLE);
            } else if (i3 == 2) {
                arrayList11.add(UniversalFilters.WikiFilter.SearchContentType.ONLY_COMMENT);
            } else if (i3 == 3) {
                arrayList11.add(UniversalFilters.WikiFilter.SearchContentType.FULL_CONTENT);
            }
            a12.mo65302d(arrayList11);
            Unit unit7 = Unit.INSTANCE;
            BaseEntity.EntityItem a13 = a8.mo64940a(aVar5.mo64935a(a12.build()).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a13, "EntityItem.Builder()\n   …                 .build()");
            arrayList9.add(a13);
        }
        Unit unit8 = Unit.INSTANCE;
        UniversalSearchRequest.C19089a a14 = aVar.mo65311a(c.mo65094a(a.mo64958a(arrayList9).build()).mo65097a((Boolean) true).build());
        Intrinsics.checkExpressionValueIsNotNull(a14, "request");
        m206299b(str, a14, Scene.Type.SEARCH_SPACE, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181947a(String str, String str2, String str3, int i, String str4, boolean z, boolean z2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        BaseEntity.SuggestionItem a = new BaseEntity.SuggestionItem.C18961a().mo64978a(SuggestionType.SERVICE_CARD).mo64977a(new BaseEntity.SuggestionSelector.C18963a().mo64983a(new UniversalSelectors.ServiceCardSelector.C19101a().mo65338a(UniversalSelectors.RenderType.JSON_RAW).build()).build()).build();
        BaseEntity.EntityItem a2 = new BaseEntity.EntityItem.C18949a().mo64943a(z ? SearchEntityType.QA_CARD : SearchEntityType.UNKNOWN).mo64941a(new BaseEntity.EntitySelector.C18951a().mo64950a(new UniversalSelectors.QaCardSelector.C19099a().mo65333a(UniversalSelectors.RenderType.JSON_RAW).build()).build()).mo64942a(f131814b).build();
        BaseEntity.EntityItem a3 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.CUSTOMIZATION).mo64941a(new BaseEntity.EntitySelector.C18951a().mo64948a(new UniversalSelectors.CustomizationSelector.C19095a().mo65324a(UniversalSelectors.RenderType.JSON_RAW).build()).build()).mo64942a(f131814b).build();
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a4 = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_CARDS.toString()).mo64958a(CollectionsKt.mutableListOf(a2, a3));
        if (z2) {
            a4.mo64960b(CollectionsKt.mutableListOf(a));
        }
        UniversalSearchRequest.C19089a a5 = aVar.mo65311a(c.mo65094a(a4.build()).build());
        Intrinsics.checkExpressionValueIsNotNull(a5, "request");
        m206299b(str, a5, Scene.Type.SEARCH_CARDS, iGetDataCallback);
    }

    static {
        BaseEnum.MergePolicy mergePolicy;
        boolean a = C53258a.m205939a().mo181745a("lark.search.v2.api.local");
        C53241h.m205898b("LarkSearch.Search.V2.SearchService", "v2LocalEnable: " + a);
        if (a) {
            mergePolicy = BaseEnum.MergePolicy.COMBINE_LOCAL_AND_SERVER;
        } else {
            mergePolicy = BaseEnum.MergePolicy.SERVER_ONLY;
        }
        f131814b = mergePolicy;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/service/v2/SearchService$universalSearchWithLog$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.e.a$b */
    public static final class C53311b implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ Scene.Type f131819a;

        /* renamed from: b */
        final /* synthetic */ String f131820b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f131821c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("LarkSearch.Search.V2.SearchService", "scene: " + this.f131819a + ", err. code: " + errorResult.getErrorCode() + ", errMsg: " + errorResult.getDebugMsg());
            this.f131821c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            String str;
            Integer num;
            Boolean bool;
            Integer num2;
            List<SearchBaseInfo> infoList;
            StringBuilder sb = new StringBuilder();
            sb.append("scene: ");
            sb.append(this.f131819a);
            sb.append(", success. requestId: ");
            sb.append(this.f131820b);
            sb.append("  data.requestId: ");
            String str2 = null;
            if (searchResponse != null) {
                str = searchResponse.getRequestId();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" data size?: ");
            if (searchResponse == null || (infoList = searchResponse.getInfoList()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(infoList.size());
            }
            sb.append(num);
            sb.append(" hasMore?: ");
            if (searchResponse != null) {
                bool = Boolean.valueOf(searchResponse.isHasMore());
            } else {
                bool = null;
            }
            sb.append(bool);
            sb.append(" total: ");
            if (searchResponse != null) {
                num2 = Integer.valueOf(searchResponse.getTotal());
            } else {
                num2 = null;
            }
            sb.append(num2);
            sb.append(" token: ");
            if (searchResponse != null) {
                str2 = searchResponse.getPageToken();
            }
            sb.append(str2);
            C53241h.m205898b("LarkSearch.Search.V2.SearchService", sb.toString());
            this.f131821c.onSuccess(searchResponse);
        }

        C53311b(Scene.Type type, String str, IGetDataCallback iGetDataCallback) {
            this.f131819a = type;
            this.f131820b = str;
            this.f131821c = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo181937a(SearchArgsSetting searchArgsSetting) {
        if (searchArgsSetting != null) {
            C53241h.m205899c("LarkSearch.Search.V2.SearchService", "syncSetting: " + searchArgsSetting);
            SearchArgsSetting searchArgsSetting2 = f131815c;
            searchArgsSetting2.f133115a = searchArgsSetting.f133115a;
            searchArgsSetting2.f133116b = searchArgsSetting.f133116b;
            searchArgsSetting2.f133117c = searchArgsSetting.f133117c;
            searchArgsSetting2.f133118d = searchArgsSetting.f133118d;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.e.a$a */
    public static final class C53310a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f131816a;

        /* renamed from: b */
        final /* synthetic */ UniversalSearchRequest.C19089a f131817b;

        /* renamed from: c */
        final /* synthetic */ Scene.Type f131818c;

        C53310a(String str, UniversalSearchRequest.C19089a aVar, Scene.Type type) {
            this.f131816a = str;
            this.f131817b = aVar;
            this.f131818c = type;
        }

        /* renamed from: a */
        public final SearchResponse parse(byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            UniversalSearchResponse decode = UniversalSearchResponse.ADAPTER.decode(bArr);
            UniversalSearchResponseParser gVar = UniversalSearchResponseParser.f133248a;
            String str = this.f131816a;
            String str2 = this.f131817b.f47201a.search_session;
            Intrinsics.checkExpressionValueIsNotNull(str2, "request.header.search_session");
            Integer num = this.f131817b.f47201a.session_seq_id;
            Intrinsics.checkExpressionValueIsNotNull(num, "request.header.session_seq_id");
            int intValue = num.intValue();
            String str3 = this.f131817b.f47201a.query;
            Intrinsics.checkExpressionValueIsNotNull(str3, "request.header.query");
            Scene.Type type = this.f131818c;
            Intrinsics.checkExpressionValueIsNotNull(decode, "response");
            return gVar.mo184359a(str, str2, intValue, str3, type, decode);
        }
    }

    /* renamed from: b */
    private final void m206299b(String str, UniversalSearchRequest.C19089a aVar, Scene.Type type, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206298a(str, aVar, type, new C53311b(type, str, iGetDataCallback));
    }

    /* renamed from: a */
    private final void m206298a(String str, UniversalSearchRequest.C19089a aVar, Scene.Type type, IGetDataCallback<SearchResponse> iGetDataCallback) {
        if (!C53258a.m205939a().mo181745a("lark.search.display.num.of.chars.disable")) {
            if (AvatarItemView.f133492d.mo184693a() != -1) {
                aVar.mo65311a(aVar.f47201a.newBuilder().mo65096a(new SearchCommonRequestHeader.Layout.C19013a().mo65088a(1).mo65090b(Integer.valueOf(AvatarItemView.f133492d.mo184693a())).build()).build());
            }
            if (AvatarItemView.f133492d.mo184694b() != -1) {
                aVar.mo65311a(aVar.f47201a.newBuilder().mo65101b(new SearchCommonRequestHeader.Layout.C19013a().mo65088a(1).mo65090b(Integer.valueOf(AvatarItemView.f133492d.mo184694b())).build()).build());
            }
        }
        SdkSender.asynSendRequestNonWrap(Command.UNIVERSAL_SEARCH, aVar, str, iGetDataCallback, new C53310a(str, aVar, type));
    }

    /* renamed from: b */
    public void mo181949b(String str, String str2, String str3, int i, String str4, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a a = new UniversalSearchRequest.C19089a().mo65311a(new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4).mo65094a(new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_THREAD.toString()).mo64958a(CollectionsKt.mutableListOf(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.THREAD).mo64942a(f131814b).build())).build()).build());
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        m206299b(str, a, Scene.Type.SEARCH_THREAD, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181938a(String str, String str2, String str3, int i, String str4, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a a = new UniversalSearchRequest.C19089a().mo65311a(new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4).mo65094a(new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_HELP_DESK.toString()).mo64958a(CollectionsKt.mutableListOf(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.ONCALL).mo64942a(f131814b).build())).build()).build());
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        m206299b(str, a, Scene.Type.SEARCH_HELP_DESK, iGetDataCallback);
    }

    /* renamed from: c */
    public void mo181950c(String str, String str2, String str3, int i, String str4, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SMART_SEARCH.toString());
        BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.USER);
        BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
        UniversalFilters.UserFilter.C19083a aVar3 = new UniversalFilters.UserFilter.C19083a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.RESIGNED.getValue() | UniversalFilters.UserFilter.SearchType.UN_TALKED.getValue()));
        UniversalSearchRequest.C19089a a3 = aVar.mo65311a(c.mo65094a(a.mo64958a(CollectionsKt.mutableListOf(a2.mo64940a(aVar2.mo64934a(aVar3.mo65292a(arrayList).mo65291a((Boolean) true).build()).build()).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.BOT).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.GROUP_CHAT).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.CRYPTO_P2P_CHAT).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.MESSAGE).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.DOC).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.APP).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.ONCALL).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.THREAD).mo64942a(f131814b).build(), new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.URL).mo64942a(f131814b).build())).build()).build());
        Intrinsics.checkExpressionValueIsNotNull(a3, "request");
        m206299b(str, a3, Scene.Type.SMART_SEARCH, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181940a(String str, String str2, String str3, int i, String str4, String str5, List<String> list, IGetDataCallback<SearchResponse> iGetDataCallback) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String str6 = str5;
        if (str6 == null || StringsKt.isBlank(str6)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C53241h.m205894a("LarkSearch.Search.V2.SearchService", "err! appId is invalid!");
            iGetDataCallback.onSuccess(new SearchResponse());
            return;
        }
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_OPEN_SEARCH_SCENE.toString());
        BaseEntity.EntityItem[] entityItemArr = new BaseEntity.EntityItem[2];
        BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.SLASH_COMMAND).mo64942a(f131814b);
        BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
        UniversalFilters.SlashCommandFilter.C19075a a3 = new UniversalFilters.SlashCommandFilter.C19075a().mo65268a(str5);
        if (list == null) {
            list = new ArrayList();
        }
        entityItemArr[0] = a2.mo64940a(aVar2.mo64932a(a3.mo65269a(list).build()).build()).build();
        entityItemArr[1] = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.CUSTOMIZATION).mo64942a(f131814b).mo64941a(new BaseEntity.EntitySelector.C18951a().mo64948a(new UniversalSelectors.CustomizationSelector.C19095a().mo65324a(UniversalSelectors.RenderType.JSON_RAW).build()).build()).build();
        UniversalSearchRequest.C19089a a4 = aVar.mo65311a(c.mo65094a(a.mo64958a(CollectionsKt.mutableListOf(entityItemArr)).build()).mo65097a((Boolean) true).build());
        Intrinsics.checkExpressionValueIsNotNull(a4, "request");
        m206299b(str, a4, Scene.Type.SEARCH_OPEN_SEARCH_SCENE, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181939a(String str, String str2, String str3, int i, String str4, IGetDataCallback<SearchResponse> iGetDataCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str3, "session");
        Intrinsics.checkParameterIsNotNull(str4, "pageToken");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UniversalSearchRequest.C19089a aVar = new UniversalSearchRequest.C19089a();
        SearchCommonRequestHeader.C19015a c = new SearchCommonRequestHeader.C19015a().mo65102b(str2).mo65099a(str3).mo65098a(Integer.valueOf(i)).mo65103c(str4);
        BaseEntity.SearchContext.C18953a a = new BaseEntity.SearchContext.C18953a().mo64957a(Scene.Type.SEARCH_CHATTERS.toString());
        BaseEntity.EntityItem[] entityItemArr = new BaseEntity.EntityItem[1];
        BaseEntity.EntityItem.C18949a a2 = new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.USER).mo64942a(f131814b);
        if (z3 && z4) {
            BaseEntity.EntityFilter.C18947a aVar2 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar3 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.RESIGNED.getValue() | UniversalFilters.UserFilter.SearchType.UN_TALKED.getValue()));
            a2.mo64940a(aVar2.mo64934a(aVar3.mo65292a(arrayList).mo65291a((Boolean) true).build()).build());
        } else if (z3) {
            BaseEntity.EntityFilter.C18947a aVar4 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar5 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.TALKED.getValue()));
            a2.mo64940a(aVar4.mo64934a(aVar5.mo65292a(arrayList2).build()).build());
        } else if (z4) {
            BaseEntity.EntityFilter.C18947a aVar6 = new BaseEntity.EntityFilter.C18947a();
            UniversalFilters.UserFilter.C19083a aVar7 = new UniversalFilters.UserFilter.C19083a();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(Integer.valueOf(UniversalFilters.UserFilter.SearchType.UN_RESIGNED.getValue()));
            a2.mo64940a(aVar6.mo64934a(aVar7.mo65292a(arrayList3).build()).build());
        }
        entityItemArr[0] = a2.build();
        List<BaseEntity.EntityItem> mutableListOf = CollectionsKt.mutableListOf(entityItemArr);
        if (z) {
            mutableListOf.add(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.CRYPTO_P2P_CHAT).mo64942a(f131814b).build());
        }
        if (z2) {
            mutableListOf.add(new BaseEntity.EntityItem.C18949a().mo64943a(SearchEntityType.BOT).mo64942a(f131814b).build());
        }
        UniversalSearchRequest.C19089a a3 = aVar.mo65311a(c.mo65094a(a.mo64958a(mutableListOf).mo64956a(new UniversalFilters.CommonFilter.C19063a().mo65230a(Boolean.valueOf(z5)).build()).build()).build());
        Intrinsics.checkExpressionValueIsNotNull(a3, "request");
        m206299b(str, a3, Scene.Type.SEARCH_CHATTERS, iGetDataCallback);
    }
}
