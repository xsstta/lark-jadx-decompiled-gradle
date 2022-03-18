package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.search.v1.SearchChatterMeta;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.d */
public class C53909d extends AbstractC53906a<SearchChatterInfo, SearchChatterMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchChatterInfo mo184290a() {
        return new SearchChatterInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchChatterInfo searchChatterInfo, SearchChatterMeta searchChatterMeta) {
        DeniedReason deniedReason;
        searchChatterInfo.setChatterType(Chatter.ChatterType.forNumber(searchChatterMeta.type.getValue()));
        searchChatterInfo.setChatterDescription(new ChatterDescription(searchChatterMeta.description, ChatterDescription.Type.valueOf(searchChatterMeta.description_flag.getValue())));
        searchChatterInfo.setRegistered(searchChatterMeta.is_registered.booleanValue());
        searchChatterInfo.setP2pChatId(searchChatterMeta.p2p_chat_id);
        searchChatterInfo.setNewMsgCount(searchChatterMeta.new_message_count.intValue());
        searchChatterInfo.setRemind(searchChatterMeta.is_remind.booleanValue());
        searchChatterInfo.setInContacts(searchChatterMeta.in_contacts.booleanValue());
        searchChatterInfo.setCanJoinGroup(searchChatterMeta.can_join_group.booleanValue());
        searchChatterInfo.setTenantId(searchChatterMeta.tenant_id);
        searchChatterInfo.setZenModeEndTime(searchChatterMeta.do_not_disturb_end_time.longValue());
        searchChatterInfo.setInChatIds(searchChatterMeta.in_chat_ids);
        searchChatterInfo.setExtraTitle(searchChatterMeta.extra_title);
        searchChatterInfo.setExtraTitleHitTerms(searchChatterMeta.extra_hit_terms);
        searchChatterInfo.setMailAddress(searchChatterMeta.mail_address);
        if (CollectionUtils.isNotEmpty(searchChatterMeta.denied_permissions) && (deniedReason = searchChatterMeta.denied_reason.get(Integer.valueOf(searchChatterMeta.denied_permissions.get(0).getValue()))) != null) {
            searchChatterInfo.setDeniedReason(deniedReason.getValue());
            if (deniedReason == DeniedReason.SAME_TENANT_DENY) {
                searchChatterInfo.setHasOUPermission(false);
            }
            if (deniedReason == DeniedReason.CRYPTO_CHAT_DENY) {
                searchChatterInfo.setHasSecretPermission(false);
            }
        }
        if (searchChatterMeta.timezone != null) {
            searchChatterInfo.setTimeZoneId(searchChatterMeta.timezone.name);
        }
        searchChatterInfo.setCrossTenant(!TextUtils.equals(searchChatterInfo.getTenantId(), SearchCommonModuleDependency.m208732b().mo102920j()));
        WorkStatus workStatus = searchChatterMeta.work_status;
        if (workStatus != null) {
            searchChatterInfo.setWorkStatus(new com.ss.android.lark.chat.entity.chatter.WorkStatus(WorkStatus.Status.valueOf(workStatus.status.getValue()), workStatus.description, workStatus.start_time.longValue(), workStatus.end_time.longValue(), searchChatterInfo.isCrossTenant()));
        }
    }
}
