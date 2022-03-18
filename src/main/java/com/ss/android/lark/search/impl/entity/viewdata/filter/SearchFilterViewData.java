package com.ss.android.lark.search.impl.entity.viewdata.filter;

import android.graphics.Bitmap;
import android.util.Pair;
import android.util.SparseArray;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class SearchFilterViewData {

    /* renamed from: a */
    private String f131941a;

    /* renamed from: b */
    private List<Bitmap> f131942b = new ArrayList();

    /* renamed from: c */
    private List<BasePickViewData> f131943c = new ArrayList();

    /* renamed from: d */
    private Pair<Date, Date> f131944d;

    /* renamed from: e */
    private SearchConstants.SpaceType f131945e;

    /* renamed from: f */
    private HashMap<String, AbstractC53388a> f131946f = new HashMap<>();

    /* renamed from: g */
    private SparseArray<String> f131947g = new SparseArray<>();

    public @interface SearchFilterType {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData$a */
    public interface AbstractC53388a {
        String getFilterLabel();
    }

    /* renamed from: a */
    public List<Bitmap> mo182347a() {
        return this.f131942b;
    }

    /* renamed from: d */
    public String mo182354d() {
        return this.f131941a;
    }

    /* renamed from: e */
    public Pair<Date, Date> mo182355e() {
        return this.f131944d;
    }

    /* renamed from: g */
    public SearchConstants.SpaceType mo182357g() {
        return this.f131945e;
    }

    /* renamed from: b */
    public void mo182352b() {
        this.f131942b.clear();
    }

    /* renamed from: c */
    public void mo182353c() {
        this.f131943c.clear();
    }

    public SearchFilterViewData() {
        m206673i();
        m206672h();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ String m206680p() {
        if (this.f131945e == null) {
            return UIHelper.getString(R.string.Lark_Search_DocTypeFilter);
        }
        return UIHelper.getString(R.string.Lark_Search_SelectDocTypeFilter) + this.f131947g.get(this.f131945e.getValue());
    }

    /* renamed from: f */
    public String mo182356f() {
        Pair<Date, Date> pair = this.f131944d;
        if (pair != null) {
            return m206671a((Date) pair.first, (Date) this.f131944d.second);
        }
        AbstractC53388a aVar = this.f131946f.get(this.f131941a);
        if (aVar != null) {
            return aVar.getFilterLabel();
        }
        Log.m165383e("LarkSearch.Search.SearchFilterViewData", "search filter type is unknown");
        return "";
    }

    /* renamed from: h */
    private void m206672h() {
        this.f131947g.put(SearchConstants.SpaceType.ALL.getValue(), UIHelper.getString(R.string.Lark_Legacy_All));
        this.f131947g.put(SearchConstants.SpaceType.DOC.getValue(), UIHelper.getString(R.string.Lark_Search_DocSearchFilter));
        this.f131947g.put(SearchConstants.SpaceType.SHEET.getValue(), UIHelper.getString(R.string.Lark_Search_SheetSearchFilter));
        this.f131947g.put(SearchConstants.SpaceType.SLIDE.getValue(), UIHelper.getString(R.string.Lark_Search_SlideSearchFilter));
        this.f131947g.put(SearchConstants.SpaceType.MINDNOTE.getValue(), UIHelper.getString(R.string.Lark_Search_MindNoteSearchFilter));
        this.f131947g.put(SearchConstants.SpaceType.BITABLE.getValue(), UIHelper.getString(R.string.Lark_Search_BitableSearchFilter));
        this.f131947g.put(SearchConstants.SpaceType.FILE.getValue(), UIHelper.getString(R.string.Lark_Search_FileSearchFilter));
    }

    /* renamed from: i */
    private void m206673i() {
        this.f131946f.put("search_message/filter/sender", $$Lambda$SearchFilterViewData$mBzw2HCbUozPEQWXYnRK1H8mpcA.INSTANCE);
        this.f131946f.put("search_message/filter/chat", $$Lambda$SearchFilterViewData$eKpWx1Y4z0NAJalQIPlSc9Yea9s.INSTANCE);
        this.f131946f.put("search_message/filter/time", $$Lambda$SearchFilterViewData$M7nDPURqpqhSkH2wEHsdSlpgpG4.INSTANCE);
        this.f131946f.put("chat_inside_search_message/filter/sender", $$Lambda$SearchFilterViewData$GRts5fYPOPQLvdHm5AcXvZsPFI.INSTANCE);
        this.f131946f.put("chat_inside_search_message/filter/time", $$Lambda$SearchFilterViewData$fzQH63FoutIRY92Lz2w8FHZdWsU.INSTANCE);
        this.f131946f.put("chat_inside_search_space/filter/owner", $$Lambda$SearchFilterViewData$0mA1nWZWRf1o0PyXJ0ZxDQJC7MM.INSTANCE);
        this.f131946f.put("chat_inside_search_space/filter/type", new AbstractC53388a() {
            /* class com.ss.android.lark.search.impl.entity.viewdata.filter.$$Lambda$SearchFilterViewData$2jDMDn5koupYlvFv2NszYXfNH6Y */

            @Override // com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData.AbstractC53388a
            public final String getFilterLabel() {
                return SearchFilterViewData.this.m206680p();
            }
        });
        this.f131946f.put("chat_inside_search_wiki/filter/owner", $$Lambda$SearchFilterViewData$poxyP3SLVn0wWfZsUhH9DgdVALI.INSTANCE);
        this.f131946f.put("search_thread/filter/type", $$Lambda$SearchFilterViewData$6silTgtdr7lMWJ_9CDD0wgC5MUQ.INSTANCE);
        this.f131946f.put("search_thread/filter/member", $$Lambda$SearchFilterViewData$NKBKyPRaSzq0_2gqKM1qLlFZKs.INSTANCE);
        this.f131946f.put("search_topic/filter/sender", $$Lambda$SearchFilterViewData$AcNBPCnV53EsGaIetqEpzhAIIHc.INSTANCE);
        this.f131946f.put("search_topic/filter/thread_group", $$Lambda$SearchFilterViewData$xWFghaIKbvwEb2_mWde5FWtZaqA.INSTANCE);
        this.f131946f.put("search_topic/filter/time", $$Lambda$SearchFilterViewData$dbPDYxaoiLP9kB1uj6YorhOlUbk.INSTANCE);
    }

    /* renamed from: a */
    public void mo182348a(Pair<Date, Date> pair) {
        this.f131944d = pair;
    }

    /* renamed from: a */
    public void mo182349a(SearchConstants.SpaceType spaceType) {
        this.f131945e = spaceType;
    }

    /* renamed from: a */
    public void mo182350a(String str) {
        this.f131941a = str;
    }

    /* renamed from: a */
    public void mo182351a(List<Bitmap> list) {
        this.f131942b = list;
    }

    /* renamed from: a */
    private String m206671a(Date date, Date date2) {
        return C53345b.m206461a(date, date2);
    }
}
