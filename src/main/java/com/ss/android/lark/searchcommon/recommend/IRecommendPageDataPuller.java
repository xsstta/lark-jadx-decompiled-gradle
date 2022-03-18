package com.ss.android.lark.searchcommon.recommend;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\b\u0010\n\u001a\u00020\u0003H&J\u001c\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/recommend/IRecommendPageDataPuller;", "", "canLoadMore", "", "loadData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "needHeader", "onLoadMore", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.c.a */
public interface IRecommendPageDataPuller {
    /* renamed from: a */
    void mo141031a(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback);

    /* renamed from: a */
    boolean mo141032a();

    /* renamed from: b */
    void mo141033b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback);

    /* renamed from: b */
    boolean mo141034b();
}
