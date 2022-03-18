package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import android.text.TextUtils;
import com.bytedance.lark.pb.search.v1.SearchResult;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.a */
public abstract class AbstractC53906a<T extends SearchBaseInfo, M> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo184290a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(T t, M m) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184293a(T t, M m, SearchResult searchResult) {
    }

    /* renamed from: a */
    public T mo184291a(SearchResult searchResult, M m) {
        T a = mo184290a();
        m208917a((SearchBaseInfo) a, searchResult);
        mo184292a((SearchBaseInfo) a, (Object) m);
        mo184293a(a, m, searchResult);
        return a;
    }

    /* renamed from: a */
    private void m208917a(T t, SearchResult searchResult) {
        t.setId(searchResult.id);
        t.setImageUrl(searchResult.image_url);
        t.setAvatarKey(searchResult.avatar_key);
        if (searchResult.type != SearchResult.Type.CHAT || TextUtils.isEmpty(searchResult.exact_title)) {
            t.setTitle(searchResult.title);
        } else {
            t.setTitle(searchResult.exact_title);
        }
        t.setSubTitle(searchResult.subtitle);
        t.setType(SearchCommonConstants.m208814a(searchResult.type.getValue()));
        t.setTitleHitTerms(new ArrayList(searchResult.title_hit_terms));
        t.setSubTitleHitTerms(new ArrayList(searchResult.subtitle_hit_terms));
        Icon icon = new Icon();
        if (searchResult.icon != null) {
            icon.setType(searchResult.icon.type.getValue());
            icon.setValue(searchResult.icon.value);
        }
        t.setIcon(icon);
    }
}
