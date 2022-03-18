package com.ss.android.lark.search.impl.func.pick.p2623a;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.pick.a.d */
public class C53636d {

    /* renamed from: a */
    private final ISearchModuleDependency.AbstractC53328n f132397a = C53258a.m205939a().mo181761j();

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53317e f132398b = C53258a.m205939a().mo181756f();

    /* renamed from: a */
    public PickChatterViewData mo182949a(SearchChatterInfo searchChatterInfo) {
        PickChatterViewData pickChatterViewData = new PickChatterViewData();
        pickChatterViewData.setId(searchChatterInfo.getId());
        pickChatterViewData.setImageKey(searchChatterInfo.getAvatarKey());
        pickChatterViewData.setName(searchChatterInfo.getTitle());
        pickChatterViewData.setDescription(searchChatterInfo.getSubTitle());
        pickChatterViewData.setNameHighLights(searchChatterInfo.getTitleHitTerms());
        pickChatterViewData.setDescHighLights(searchChatterInfo.getSubTitleHitTerms());
        pickChatterViewData.setBusinessId(searchChatterInfo.getP2pChatId());
        pickChatterViewData.setP2pChatId(searchChatterInfo.getP2pChatId());
        pickChatterViewData.setChatterType(searchChatterInfo.getChatterType());
        pickChatterViewData.setChatterDescription(searchChatterInfo.getChatterDescription());
        pickChatterViewData.setRegistered(searchChatterInfo.isRegistered());
        pickChatterViewData.setCrossTenant(!TextUtils.equals(searchChatterInfo.getTenantId(), this.f132397a.mo181816b()));
        return pickChatterViewData;
    }

    /* renamed from: a */
    public SearchChatterInfo mo182950a(PickChatterViewData pickChatterViewData) {
        SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
        searchChatterInfo.setId(pickChatterViewData.getId());
        searchChatterInfo.setAvatarKey(pickChatterViewData.getImageKey());
        searchChatterInfo.setTitle(pickChatterViewData.getName());
        searchChatterInfo.setSubTitle(pickChatterViewData.getDescription());
        searchChatterInfo.setTitleHitTerms(pickChatterViewData.getNameHighLights());
        searchChatterInfo.setSubTitleHitTerms(pickChatterViewData.getDescHighLights());
        searchChatterInfo.setP2pChatId(pickChatterViewData.getP2pChatId());
        searchChatterInfo.setChatterType(pickChatterViewData.getChatterType());
        searchChatterInfo.setChatterDescription(pickChatterViewData.getChatterDescription());
        searchChatterInfo.setRegistered(pickChatterViewData.isRegistered());
        searchChatterInfo.setCrossTenant(pickChatterViewData.isCrossTenant());
        return searchChatterInfo;
    }

    /* renamed from: a */
    public List<BasePickViewData> mo182951a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        Map<String, Chatter> b = this.f132398b.mo181791b(list);
        if (CollectionUtils.isEmpty(b)) {
            return arrayList;
        }
        for (String str : list) {
            Chatter chatter = b.get(str);
            if (chatter == null) {
                Log.m165383e("LarkSearch.Search.PickChatterBeanParser", "parseViewDataFromChatterIds failed: chatter is null");
            } else {
                arrayList.add(m207632a(chatter, this.f132398b.mo181779a(chatter), this.f132398b.mo181780a(chatter.getId(), false), !TextUtils.equals(chatter.getTenantId(), this.f132397a.mo181816b())));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private PickChatterViewData m207632a(Chatter chatter, String str, String str2, boolean z) {
        PickChatterViewData pickChatterViewData = new PickChatterViewData();
        pickChatterViewData.setId(chatter.getId());
        pickChatterViewData.setImageKey(chatter.getAvatarKey());
        pickChatterViewData.setName(str);
        pickChatterViewData.setDescription("");
        pickChatterViewData.setNameHighLights(new ArrayList());
        pickChatterViewData.setDescHighLights(new ArrayList());
        pickChatterViewData.setBusinessId(str2);
        pickChatterViewData.setP2pChatId(str2);
        pickChatterViewData.setChatterType(chatter.getType());
        pickChatterViewData.setChatterDescription(chatter.getDescription());
        pickChatterViewData.setRegistered(chatter.getRegistered());
        pickChatterViewData.setCrossTenant(z);
        return pickChatterViewData;
    }
}
