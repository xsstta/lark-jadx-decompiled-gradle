package com.ss.android.lark.search.impl.entity;

import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.utils.ImprId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchDetailInitData implements Serializable {
    private static final long serialVersionUID = -8984001686325697284L;
    public final String bitmapKey;
    public final NetSearchRequest.ChatFilter chatFilter;
    public final int dataFromType;
    public final NetSearchRequest.Filter filter;
    public final boolean hasMore;
    public final ImprId imprId;
    public final List<SearchBaseViewData> initDataList;
    public final boolean isMainPage;
    public final SearchInfoHistory.MessageSubSource msgSubSource;
    public final int resultType;
    public final Scene.Type sceneType;
    public final String searchActionType;
    public final int searchFromTab;
    public final String searchImprId;
    public final String searchKey;
    public final int translateY;

    public static C53384a newBuilder() {
        return new C53384a();
    }

    /* renamed from: com.ss.android.lark.search.impl.entity.SearchDetailInitData$a */
    public static final class C53384a {

        /* renamed from: a */
        public String f131913a;

        /* renamed from: b */
        public String f131914b;

        /* renamed from: c */
        public boolean f131915c;

        /* renamed from: d */
        public int f131916d;

        /* renamed from: e */
        public String f131917e;

        /* renamed from: f */
        public Scene.Type f131918f;

        /* renamed from: g */
        public int f131919g;

        /* renamed from: h */
        public List<SearchBaseViewData> f131920h;

        /* renamed from: i */
        public boolean f131921i;

        /* renamed from: j */
        public int f131922j;

        /* renamed from: k */
        public NetSearchRequest.Filter f131923k;

        /* renamed from: l */
        public SearchInfoHistory.MessageSubSource f131924l;

        /* renamed from: m */
        public String f131925m;

        /* renamed from: n */
        public ImprId f131926n;

        /* renamed from: o */
        public NetSearchRequest.ChatFilter f131927o;

        /* renamed from: p */
        public int f131928p;

        private C53384a() {
            this.f131913a = "";
            this.f131914b = "";
            this.f131916d = 1;
            this.f131917e = "search_detail";
            this.f131918f = Scene.Type.SEARCH_CHATTERS;
            this.f131919g = 1;
            this.f131920h = new ArrayList();
            this.f131921i = true;
            this.f131922j = 0;
            this.f131923k = NetSearchRequest.Filter.newBuilder().mo184522a();
            this.f131924l = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL);
            this.f131925m = "";
            this.f131927o = NetSearchRequest.ChatFilter.newBuilder().mo184512a();
            this.f131928p = 1;
        }

        /* renamed from: a */
        public SearchDetailInitData mo182083a() {
            return new SearchDetailInitData(this);
        }

        /* renamed from: a */
        public C53384a mo182074a(int i) {
            this.f131916d = i;
            return this;
        }

        /* renamed from: b */
        public C53384a mo182084b(int i) {
            this.f131919g = i;
            return this;
        }

        /* renamed from: c */
        public C53384a mo182086c(int i) {
            this.f131922j = i;
            return this;
        }

        /* renamed from: d */
        public C53384a mo182088d(int i) {
            this.f131928p = i;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182075a(Scene.Type type) {
            this.f131918f = type;
            return this;
        }

        /* renamed from: b */
        public C53384a mo182085b(String str) {
            this.f131914b = str;
            return this;
        }

        /* renamed from: c */
        public C53384a mo182087c(String str) {
            this.f131917e = str;
            return this;
        }

        /* renamed from: d */
        public C53384a mo182089d(String str) {
            this.f131925m = str;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182076a(SearchInfoHistory.MessageSubSource messageSubSource) {
            this.f131924l = messageSubSource;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182077a(NetSearchRequest.ChatFilter chatFilter) {
            this.f131927o = chatFilter;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182078a(NetSearchRequest.Filter filter) {
            this.f131923k = filter;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182079a(ImprId imprId) {
            this.f131926n = imprId;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182080a(String str) {
            this.f131913a = str;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182081a(List<SearchBaseViewData> list) {
            this.f131920h = list;
            return this;
        }

        /* renamed from: a */
        public C53384a mo182082a(boolean z) {
            this.f131921i = z;
            return this;
        }
    }

    private SearchDetailInitData(C53384a aVar) {
        this.searchKey = aVar.f131913a;
        this.bitmapKey = aVar.f131914b;
        this.hasMore = aVar.f131915c;
        this.dataFromType = aVar.f131916d;
        this.searchActionType = aVar.f131917e;
        this.isMainPage = aVar.f131921i;
        this.sceneType = aVar.f131918f;
        this.resultType = aVar.f131919g;
        this.initDataList = aVar.f131920h;
        this.translateY = aVar.f131922j;
        this.filter = aVar.f131923k;
        this.msgSubSource = aVar.f131924l;
        this.searchImprId = aVar.f131925m;
        this.chatFilter = aVar.f131927o;
        this.searchFromTab = aVar.f131928p;
        this.imprId = aVar.f131926n;
    }
}
