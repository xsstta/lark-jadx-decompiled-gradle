package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.search.v1.TimeZone;
import com.bytedance.lark.pb.search.v2.SimpleP2PChatInfo;
import com.bytedance.lark.pb.search.v2.UserMeta;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/UserMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/UserMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.p */
public final class UserMetaParser {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public SearchBaseInfo mo184335a(UserMeta userMeta) {
        boolean z;
        Boolean bool;
        WorkStatus workStatus = null;
        if (userMeta != null) {
            SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
            searchChatterInfo.setChatterType(Chatter.ChatterType.USER);
            String str = userMeta.description;
            Chatter.Description.Type type = userMeta.description_flag;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.description_flag");
            searchChatterInfo.setChatterDescription(new ChatterDescription(str, ChatterDescription.Type.valueOf(type.getValue())));
            Boolean bool2 = userMeta.is_registered;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "it.is_registered");
            searchChatterInfo.setRegistered(bool2.booleanValue());
            SimpleP2PChatInfo simpleP2PChatInfo = userMeta.p2p_chat_info;
            if (simpleP2PChatInfo != null) {
                Boolean bool3 = simpleP2PChatInfo.is_remind;
                Intrinsics.checkExpressionValueIsNotNull(bool3, "it.is_remind");
                searchChatterInfo.setRemind(bool3.booleanValue());
                searchChatterInfo.setP2pChatId(simpleP2PChatInfo.chat_id);
            }
            searchChatterInfo.setTenantId(userMeta.tenant_id);
            Long l = userMeta.do_not_disturb_end_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.do_not_disturb_end_time");
            searchChatterInfo.setZenModeEndTime(l.longValue());
            searchChatterInfo.zenMode(SearchCommonModuleDependency.m208732b().mo102901a(searchChatterInfo.getZenModeEndTime()));
            UserMeta.ExtraFields extraFields = userMeta.extra_fields;
            if (extraFields == null || (bool = extraFields.is_in_chat) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            searchChatterInfo.setInChat(z);
            searchChatterInfo.setMailAddress(userMeta.mail_address);
            List<ActionType> list = userMeta.denied_permissions;
            if (list != null && (!list.isEmpty())) {
                Map<Integer, DeniedReason> map = userMeta.denied_reason;
                ActionType actionType = userMeta.denied_permissions.get(0);
                Intrinsics.checkExpressionValueIsNotNull(actionType, "it.denied_permissions[0]");
                DeniedReason deniedReason = map.get(Integer.valueOf(actionType.getValue()));
                if (deniedReason != null) {
                    searchChatterInfo.setDeniedReason(deniedReason.getValue());
                    if (deniedReason == DeniedReason.SAME_TENANT_DENY) {
                        searchChatterInfo.setHasOUPermission(false);
                    }
                    if (deniedReason == DeniedReason.CRYPTO_CHAT_DENY) {
                        searchChatterInfo.setHasSecretPermission(false);
                    }
                }
            }
            TimeZone timeZone = userMeta.timezone;
            if (timeZone != null) {
                searchChatterInfo.setTimeZoneId(timeZone.name);
            }
            com.bytedance.lark.pb.basic.v1.WorkStatus workStatus2 = userMeta.work_status;
            if (workStatus2 != null) {
                WorkStatus.Status status = workStatus2.status;
                Intrinsics.checkExpressionValueIsNotNull(status, "it.status");
                WorkStatus.Status valueOf = WorkStatus.Status.valueOf(status.getValue());
                String str2 = workStatus2.description;
                Long l2 = workStatus2.start_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "it.start_time");
                long longValue = l2.longValue();
                Long l3 = workStatus2.end_time;
                Intrinsics.checkExpressionValueIsNotNull(l3, "it.end_time");
                workStatus = new com.ss.android.lark.chat.entity.chatter.WorkStatus(valueOf, str2, longValue, l3.longValue(), searchChatterInfo.isCrossTenant());
            }
            searchChatterInfo.setWorkStatus(workStatus);
            searchChatterInfo.setEnterpriseMailAddress(userMeta.enterprise_mail_address);
            searchChatterInfo.setStatusList(userMeta.custom_status);
            searchChatterInfo.setCrossTenant(!Intrinsics.areEqual(SearchCommonModuleDependency.m208732b().mo102920j(), searchChatterInfo.getTenantId()));
            workStatus = searchChatterInfo;
        }
        return (SearchBaseInfo) workStatus;
    }
}
