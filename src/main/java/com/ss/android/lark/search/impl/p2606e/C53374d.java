package com.ss.android.lark.search.impl.p2606e;

import android.text.TextUtils;
import com.ss.android.lark.search.impl.entity.viewdata.SearchChatterViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSecretP2PChatInfo;

/* renamed from: com.ss.android.lark.search.impl.e.d */
public class C53374d extends AbstractC53371a<SearchChatterViewData, SearchBaseInfo> {

    /* renamed from: b */
    private boolean f131909b = this.f131908a.mo181817c();

    /* renamed from: c */
    private String f131910c = this.f131908a.mo181816b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public SearchChatterViewData mo182051a(SearchBaseInfo searchBaseInfo) {
        return new SearchChatterViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchChatterViewData searchChatterViewData, SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchChatterInfo) {
            SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
            if (searchChatterInfo.isP2pCryptoChat()) {
                m206612b(searchChatterViewData, searchChatterInfo);
            } else {
                m206610a(searchChatterViewData, searchChatterInfo);
            }
        } else if (searchBaseInfo instanceof SearchSecretP2PChatInfo) {
            m206611a(searchChatterViewData, (SearchSecretP2PChatInfo) searchBaseInfo);
        }
    }

    /* renamed from: a */
    private void m206610a(SearchChatterViewData searchChatterViewData, SearchChatterInfo searchChatterInfo) {
        searchChatterViewData.setChatterId(searchChatterInfo.getId());
        searchChatterViewData.setType(searchChatterInfo.getChatterType());
        searchChatterViewData.setChatterDescription(searchChatterInfo.getChatterDescription());
        searchChatterViewData.setRegistered(searchChatterInfo.isRegistered());
        searchChatterViewData.setP2pChatId(searchChatterInfo.getP2pChatId());
        searchChatterViewData.setNewMsgCount(searchChatterInfo.getNewMsgCount());
        searchChatterViewData.setRemind(searchChatterInfo.isRemind());
        searchChatterViewData.setTenantId(searchChatterInfo.getTenantId());
        searchChatterViewData.setCrossTenant(!TextUtils.equals(this.f131910c, searchChatterInfo.getTenantId()));
        searchChatterViewData.setWorkStatus(searchChatterInfo.getWorkStatus());
        searchChatterViewData.setZenModeEndTime(searchChatterInfo.getZenModeEndTime());
        searchChatterViewData.setExtraTitle(searchChatterInfo.getExtraTitle());
        searchChatterViewData.setExtraTitleHitTerms(searchChatterInfo.getExtraTitleHitTerms());
        searchChatterViewData.setShowTag(!this.f131909b);
        searchChatterViewData.setSecretP2PChat(false);
    }

    /* renamed from: b */
    private void m206612b(SearchChatterViewData searchChatterViewData, SearchChatterInfo searchChatterInfo) {
        searchChatterViewData.setSecretP2pChatId(searchChatterInfo.getId());
        searchChatterViewData.setType(searchChatterInfo.getChatterType());
        searchChatterViewData.setChatterDescription(searchChatterInfo.getChatterDescription());
        searchChatterViewData.setRegistered(searchChatterInfo.isRegistered());
        searchChatterViewData.setTenantId(searchChatterInfo.getTenantId());
        searchChatterViewData.setCrossTenant(!TextUtils.equals(this.f131910c, searchChatterInfo.getTenantId()));
        searchChatterViewData.setShowTag(!this.f131909b);
        searchChatterViewData.setSecretP2PChat(true);
        searchChatterViewData.setSecretChatterId(searchChatterInfo.getCryptoChatterId());
    }

    /* renamed from: a */
    private void m206611a(SearchChatterViewData searchChatterViewData, SearchSecretP2PChatInfo searchSecretP2PChatInfo) {
        searchChatterViewData.setSecretP2pChatId(searchSecretP2PChatInfo.getId());
        searchChatterViewData.setType(searchSecretP2PChatInfo.getChatterType());
        searchChatterViewData.setChatterDescription(searchSecretP2PChatInfo.getChatterDescription());
        searchChatterViewData.setRegistered(searchSecretP2PChatInfo.isRegistered());
        searchChatterViewData.setTenantId(searchSecretP2PChatInfo.getTenantId());
        searchChatterViewData.setCrossTenant(!TextUtils.equals(this.f131910c, searchSecretP2PChatInfo.getTenantId()));
        searchChatterViewData.setShowTag(!this.f131909b);
        searchChatterViewData.setSecretP2PChat(true);
        searchChatterViewData.setSecretChatterId(searchSecretP2PChatInfo.getChatterId());
    }
}
