package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.search.v2.CryptoP2PChatMeta;
import com.bytedance.lark.pb.search.v2.SimpleP2PChatInfo;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/CryptoP2pChatMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/CryptoP2PChatMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.e */
public final class CryptoP2pChatMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184324a(CryptoP2PChatMeta cryptoP2PChatMeta) {
        SearchChatterInfo searchChatterInfo;
        if (cryptoP2PChatMeta != null) {
            searchChatterInfo = new SearchChatterInfo();
            searchChatterInfo.setChatterType(Chatter.ChatterType.UNKNOWN);
            String str = cryptoP2PChatMeta.description;
            Chatter.Description.Type type = cryptoP2PChatMeta.description_flag;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.description_flag");
            searchChatterInfo.setChatterDescription(new ChatterDescription(str, ChatterDescription.Type.valueOf(type.getValue())));
            searchChatterInfo.setTenantId(cryptoP2PChatMeta.tenant_id);
            Boolean bool = cryptoP2PChatMeta.is_registered;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_registered");
            searchChatterInfo.setRegistered(bool.booleanValue());
            SimpleP2PChatInfo simpleP2PChatInfo = cryptoP2PChatMeta.p2p_chat_info;
            if (simpleP2PChatInfo != null) {
                Boolean bool2 = simpleP2PChatInfo.is_remind;
                Intrinsics.checkExpressionValueIsNotNull(bool2, "it.is_remind");
                searchChatterInfo.setRemind(bool2.booleanValue());
                searchChatterInfo.setP2pChatId(simpleP2PChatInfo.chat_id);
            }
            Long l = cryptoP2PChatMeta.do_not_disturb_end_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.do_not_disturb_end_time");
            searchChatterInfo.setZenModeEndTime(l.longValue());
            searchChatterInfo.setMailAddress(cryptoP2PChatMeta.mail_address);
            WorkStatus workStatus = cryptoP2PChatMeta.work_status;
            if (workStatus != null) {
                WorkStatus.Status status = workStatus.status;
                Intrinsics.checkExpressionValueIsNotNull(status, "workStatus.status");
                WorkStatus.Status valueOf = WorkStatus.Status.valueOf(status.getValue());
                String str2 = workStatus.description;
                Long l2 = workStatus.start_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "workStatus.start_time");
                long longValue = l2.longValue();
                Long l3 = workStatus.end_time;
                Intrinsics.checkExpressionValueIsNotNull(l3, "workStatus.end_time");
                searchChatterInfo.setWorkStatus(new com.ss.android.lark.chat.entity.chatter.WorkStatus(valueOf, str2, longValue, l3.longValue(), !Intrinsics.areEqual(searchChatterInfo.getTenantId(), SearchCommonModuleDependency.m208732b().mo102920j())));
            }
            searchChatterInfo.setP2pCryptoChat(true);
            searchChatterInfo.setCryptoChatterId(cryptoP2PChatMeta.chatter_id);
            searchChatterInfo.setStatusList(cryptoP2PChatMeta.custom_status);
        } else {
            searchChatterInfo = null;
        }
        return searchChatterInfo;
    }
}
