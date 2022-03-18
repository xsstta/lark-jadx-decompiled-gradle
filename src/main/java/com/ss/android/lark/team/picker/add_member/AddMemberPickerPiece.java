package com.ss.android.lark.team.picker.add_member;

import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.picker.TeamPickerViewModel;
import com.ss.android.lark.team.picker.base.BaseTeamPickerPiece;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/team/picker/add_member/AddMemberPickerPiece;", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece;", "()V", "getChatterPickerParamsBuilder", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;", "getPickerCenterCustomTextResId", "", "getSearchHintResId", "isUnsupportedGroupType", "Lkotlin/Pair;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddMemberPickerPiece extends BaseTeamPickerPiece {
    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: b */
    public int mo189636b() {
        return R.string.Project_MV_SearchContacts;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    public int bp_() {
        return R.string.Project_MV_ToastGroupsManage;
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: d */
    public ChatterPickerParams.Builder mo189641d() {
        String str;
        ChatterPickerParams.Builder j = new ChatterPickerParams.Builder().mo183676h(true).mo183716m(false).mo183718n(false).mo183678j(true);
        TeamPickerViewModel e = mo189662e();
        if (e != null) {
            str = e.getChatId();
        } else {
            str = null;
        }
        return j.mo183663b(str).mo183728s(false);
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: a */
    public Pair<Boolean, Integer> mo189639a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean z = true;
        if (searchBaseInfo instanceof SearchChatInfo) {
            SearchChatInfo searchChatInfo = (SearchChatInfo) searchBaseInfo;
            if (!searchChatInfo.isCrossTenant() && !searchChatInfo.isSecretChat()) {
                z = false;
            }
            return TuplesKt.to(Boolean.valueOf(z), Integer.valueOf((int) R.string.Project_MV_UnableToSelectExternalGroups));
        } else if (!(searchBaseInfo instanceof SearchChatterInfo)) {
            return TuplesKt.to(false, 0);
        } else {
            SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
            if (searchChatterInfo.getChatterType() != Chatter.ChatterType.BOT && !(!Intrinsics.areEqual(searchChatterInfo.getTenantId(), C55356a.m214819a().mo144123b().mo144131b()))) {
                z = false;
            }
            return TuplesKt.to(Boolean.valueOf(z), Integer.valueOf((int) R.string.Project_T_DontChooseExternal));
        }
    }
}
