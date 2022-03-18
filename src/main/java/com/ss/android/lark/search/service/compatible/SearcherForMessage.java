package com.ss.android.lark.search.service.compatible;

import android.util.Pair;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.bytedance.lark.pb.search.v1.MessageFilterParam;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.utils.ImprId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForMessage;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "mChatId", "", "mChatList", "", "mChatterList", "mCount", "", "mHideBot", "", "mLastCreateTime", "", "mLastMsgId", "mSearchSceneType", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "mTimePair", "Landroid/util/Pair;", "Ljava/util/Date;", "getChatFilter", "Lcom/ss/android/lark/searchcommon/service/entity/request/NetSearchRequest$ChatFilter;", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "session", "seqId", "v2Search", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.n */
public final class SearcherForMessage extends BaseSearcher {

    /* renamed from: c */
    public static final Companion f131747c = new Companion(null);

    /* renamed from: d */
    private List<String> f131748d = new ArrayList();

    /* renamed from: e */
    private String f131749e;

    /* renamed from: f */
    private List<String> f131750f = new ArrayList();

    /* renamed from: g */
    private Scene.Type f131751g = Scene.Type.SEARCH_MESSAGES;

    /* renamed from: h */
    private Pair<Date, Date> f131752h;

    /* renamed from: i */
    private int f131753i = 20;

    /* renamed from: j */
    private String f131754j = "0";

    /* renamed from: k */
    private long f131755k = C26279i.m95159b();

    /* renamed from: l */
    private boolean f131756l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForMessage$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    private final NetSearchRequest.ChatFilter m206168j() {
        NetSearchRequest.ChatFilter.C53950a newBuilder = NetSearchRequest.ChatFilter.newBuilder();
        if (C53258a.m205939a().mo181745a("search.topic.enabled")) {
            newBuilder.mo184514c(CollectionsKt.listOf(ChatFilterParam.ChatMode.NORMAL));
        }
        NetSearchRequest.ChatFilter a = newBuilder.mo184512a();
        Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
        return a;
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        this.f131748d = searchContext.mo184447w();
        this.f131749e = searchContext.mo184372E();
        this.f131750f = searchContext.mo184448x();
        Scene.Type y = searchContext.mo184449y();
        if (y == null) {
            y = Scene.Type.SEARCH_MESSAGES;
        }
        this.f131751g = y;
        this.f131752h = searchContext.mo184450z();
        this.f131753i = searchContext.mo184369B();
        this.f131754j = searchContext.mo184370C();
        this.f131755k = searchContext.mo184371D();
        this.f131756l = searchContext.mo184368A();
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Date date;
        Long l;
        Date date2;
        Long l2;
        Date date3;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        Date date4 = null;
        Long l3 = null;
        Pair<Date, Date> pair = this.f131752h;
        if (pair != null) {
            date = (Date) pair.first;
        } else {
            date = null;
        }
        if (date != null) {
            Pair<Date, Date> pair2 = this.f131752h;
            if (pair2 != null) {
                date3 = (Date) pair2.first;
            } else {
                date3 = null;
            }
            l = Long.valueOf(mo181843a(date3));
        } else {
            l = l3;
        }
        Pair<Date, Date> pair3 = this.f131752h;
        if (pair3 != null) {
            date2 = (Date) pair3.second;
        } else {
            date2 = null;
        }
        if (date2 != null) {
            Pair<Date, Date> pair4 = this.f131752h;
            if (pair4 != null) {
                date4 = (Date) pair4.second;
            }
            l2 = Long.valueOf(mo181843a(date4));
        } else {
            l2 = l3;
        }
        SearchService.f131813a.mo181943a(str, mo181844a(), str2, i, mo181860e(), this.f131748d, this.f131750f, l, l2, this.f131751g, this.f131749e, this.f131756l, mo181850b());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Date date;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        NetSearchRequest.Filter.C53951a newBuilder = NetSearchRequest.Filter.newBuilder();
        Pair<Date, Date> pair = this.f131752h;
        Date date2 = null;
        if (pair != null) {
            date = (Date) pair.first;
        } else {
            date = null;
        }
        NetSearchRequest.Filter.C53951a a = newBuilder.mo184516a(mo181843a(date));
        Pair<Date, Date> pair2 = this.f131752h;
        if (pair2 != null) {
            date2 = (Date) pair2.second;
        }
        NetSearchRequest.Filter.C53951a a2 = a.mo184523b(mo181843a(date2)).mo184529d(this.f131750f).mo184520a(this.f131748d).mo184518a(m206168j()).mo184526c(this.f131755k).mo184515a(this.f131753i);
        if (!Intrinsics.areEqual(this.f131754j, "0")) {
            a2.mo184519a(this.f131754j);
        }
        if (this.f131756l) {
            a2.mo184517a(new MessageFilterParam.C18841a().mo64694a(CollectionsKt.mutableListOf(MessageFilterParam.MessageFromType.BOT)).build());
        }
        NetSearchRequest.Filter a3 = a2.mo184522a();
        int i2 = C53286o.f131757a[this.f131751g.ordinal()];
        if (i2 == 1) {
            mo181861f().mo181886a(str, str2, mo181844a(), mo181855c(), mo181859d(), a3, mo181850b());
        } else if (i2 == 2) {
            mo181861f().mo181897b(str, str2, new ImprId(str2, i).imprId(), mo181844a(), mo181855c(), mo181859d(), a3, mo181850b());
        } else if (i2 == 3 || i2 == 4) {
            Log.m165379d("LarkSearch.Search.V2.SearcherForMessage", "searchFile");
            mo181861f().mo181895b(str, str2, mo181844a(), mo181855c(), mo181859d(), a3, mo181850b());
        } else {
            Log.m165383e("LarkSearch.Search.V2.SearcherForMessage", "unknown type.");
        }
    }
}
