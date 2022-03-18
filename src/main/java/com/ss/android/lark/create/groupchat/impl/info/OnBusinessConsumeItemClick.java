package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/OnBusinessConsumeItemClick;", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "auditDependency", "Lcom/ss/android/lark/create/groupchat/dependency/ICreateGroupChatModuleDependency$IAuditDependency;", "kotlin.jvm.PlatformType", "isLoginUserAuthorityControlled", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatterInfo;", "onBusinessBindItemCheckBox", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBusinessConsumeItemClick", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.info.g */
public final class OnBusinessConsumeItemClick implements SearchResultView.IOnBusinessConsumeItem {

    /* renamed from: a */
    private final AbstractC36248c.AbstractC36251c f93732a;

    /* renamed from: b */
    private final Context f93733b;

    public OnBusinessConsumeItemClick(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f93733b = context;
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        this.f93732a = dependency.getAuditDependency();
    }

    /* renamed from: a */
    private final boolean m143053a(SearchChatterInfo searchChatterInfo) {
        AbstractC36248c.AbstractC36251c cVar = this.f93732a;
        if (cVar != null && searchChatterInfo.getDeniedReason() == cVar.mo133725a()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
    /* renamed from: a */
    public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (searchBaseInfo instanceof SearchChatterInfo) {
            SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
            if (!searchChatterInfo.isHasOUPermission() || !searchChatterInfo.isHasSecretPermission() || searchChatterInfo.isBlockOrBeBlocked() || m143053a(searchChatterInfo)) {
                z = true;
                return new SearchResultView.CheckBoxBindStatus(z, false, false);
            }
        }
        z = false;
        return new SearchResultView.CheckBoxBindStatus(z, false, false);
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
    /* renamed from: b */
    public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(searchBaseInfo instanceof SearchChatterInfo)) {
            return false;
        }
        SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
        if (!searchChatterInfo.isHasSecretPermission()) {
            LKUIToast.show(this.f93733b, (int) R.string.Lark_Chat_CantSecretChatWithUserSecurityRestrict);
            return true;
        } else if (!searchChatterInfo.isHasOUPermission()) {
            LKUIToast.show(this.f93733b, (int) R.string.Lark_Groups_NoPermissionToAdd);
            return true;
        } else if (searchChatterInfo.isBeBlocked()) {
            LKUIToast.show(this.f93733b, (int) R.string.Lark_NewContacts_CantAddToGroupBlockedTip);
            return true;
        } else if (searchChatterInfo.isBlock()) {
            LKUIToast.show(this.f93733b, (int) R.string.Lark_NewContacts_CantAddToGroupBlockedOthersTip);
            return true;
        } else if (!m143053a(searchChatterInfo)) {
            return false;
        } else {
            LKUIToast.show(this.f93733b, (int) R.string.Lark_Contacts_CantAddExternalContactNoExternalCommunicationPermission);
            return true;
        }
    }
}
