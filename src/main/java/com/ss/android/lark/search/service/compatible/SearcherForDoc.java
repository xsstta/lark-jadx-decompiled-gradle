package com.ss.android.lark.search.service.compatible;

import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForDoc;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "docCategory", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;", "docChatIds", "", "", "docSharerIds", "mChatId", "mDocOwnerIds", "mDocTypes", "Lcom/bytedance/lark/pb/basic/v1/Doc$Type;", "myOwnDoc", "", "searchContentType", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;", "timePair", "Landroid/util/Pair;", "Ljava/util/Date;", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.k */
public final class SearcherForDoc extends BaseSearcher {

    /* renamed from: c */
    private String f131736c;

    /* renamed from: d */
    private List<String> f131737d = new ArrayList();

    /* renamed from: e */
    private List<Doc.Type> f131738e = new ArrayList();

    /* renamed from: f */
    private boolean f131739f;

    /* renamed from: g */
    private SearchContext.DocCategory f131740g = SearchContext.DocCategory.ALL;

    /* renamed from: h */
    private List<String> f131741h = new ArrayList();

    /* renamed from: i */
    private List<String> f131742i = new ArrayList();

    /* renamed from: j */
    private Pair<Date, Date> f131743j;

    /* renamed from: k */
    private SearchContext.DocSearchContentType f131744k = SearchContext.DocSearchContentType.ALL;

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        this.f131736c = searchContext.mo184372E();
        List<String> list = this.f131737d;
        if (list != null) {
            list.clear();
        }
        List<String> list2 = this.f131737d;
        if (list2 != null) {
            ArrayList H = searchContext.mo184375H();
            if (H == null) {
                H = new ArrayList();
            }
            list2.addAll(H);
        }
        List<Doc.Type> list3 = this.f131738e;
        if (list3 != null) {
            list3.clear();
        }
        List<Doc.Type> list4 = this.f131738e;
        if (list4 != null) {
            ArrayList I = searchContext.mo184376I();
            if (I == null) {
                I = new ArrayList();
            }
            list4.addAll(I);
        }
        this.f131739f = searchContext.mo184377J();
        this.f131740g = searchContext.mo184378K();
        List<String> list5 = this.f131741h;
        if (list5 != null) {
            list5.clear();
        }
        List<String> list6 = this.f131741h;
        if (list6 != null) {
            ArrayList L = searchContext.mo184379L();
            if (L == null) {
                L = new ArrayList();
            }
            list6.addAll(L);
        }
        List<String> list7 = this.f131742i;
        if (list7 != null) {
            list7.clear();
        }
        List<String> list8 = this.f131742i;
        if (list8 != null) {
            ArrayList M = searchContext.mo184380M();
            if (M == null) {
                M = new ArrayList();
            }
            list8.addAll(M);
        }
        this.f131743j = searchContext.mo184381N();
        this.f131744k = searchContext.mo184382O();
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        mo181858c(str, str2, i);
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
        Pair<Date, Date> pair = this.f131743j;
        if (pair != null) {
            date = (Date) pair.first;
        } else {
            date = null;
        }
        if (date != null) {
            Pair<Date, Date> pair2 = this.f131743j;
            if (pair2 != null) {
                date3 = (Date) pair2.first;
            } else {
                date3 = null;
            }
            l = Long.valueOf(mo181843a(date3));
        } else {
            l = l3;
        }
        Pair<Date, Date> pair3 = this.f131743j;
        if (pair3 != null) {
            date2 = (Date) pair3.second;
        } else {
            date2 = null;
        }
        if (date2 != null) {
            Pair<Date, Date> pair4 = this.f131743j;
            if (pair4 != null) {
                date4 = (Date) pair4.second;
            }
            l2 = Long.valueOf(mo181843a(date4));
        } else {
            l2 = l3;
        }
        SearchService.f131813a.mo181941a(str, mo181844a(), str2, i, mo181860e(), this.f131736c, this.f131737d, this.f131738e, this.f131739f, this.f131740g, this.f131741h, this.f131742i, l, l2, this.f131744k, mo181850b());
    }
}
