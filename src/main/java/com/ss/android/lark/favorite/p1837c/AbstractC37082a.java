package com.ss.android.lark.favorite.p1837c;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.C29612d;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.favorite.p1836b.C37080a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.c.a */
public interface AbstractC37082a {
    /* renamed from: a */
    List<FavoriteMessageInfo> mo136710a(FavoriteMessageInfo favoriteMessageInfo);

    /* renamed from: a */
    void mo136711a(long j, int i, IGetDataCallback<C37080a> iGetDataCallback);

    /* renamed from: a */
    void mo136712a(String str, List<String> list, List<C29612d> list2, IGetDataCallback<Map<String, String>> iGetDataCallback);

    /* renamed from: a */
    void mo136713a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo136714a(List<String> list, String str, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo136715a(List<String> list, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);
}
