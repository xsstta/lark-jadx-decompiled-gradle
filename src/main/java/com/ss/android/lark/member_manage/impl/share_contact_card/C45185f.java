package com.ss.android.lark.member_manage.impl.share_contact_card;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.impl.add_member.C44953e;
import com.ss.android.lark.member_manage.impl.statistics.SelectContactHitPoint;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;

/* renamed from: com.ss.android.lark.member_manage.impl.share_contact_card.f */
public class C45185f extends C44953e {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m179308a(DialogInterface dialogInterface, int i) {
    }

    public C45185f(Context context, C45183d dVar) {
        super(context, dVar);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.C44953e, com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: b */
    public void mo159002b(String str, SearchBaseInfo searchBaseInfo) {
        mo158997a(str, searchBaseInfo);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.C44953e, com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public void mo158997a(String str, SearchBaseInfo searchBaseInfo) {
        float f;
        C25639g gVar = new C25639g(this.f113833d);
        if (DesktopUtil.m144307b()) {
            f = 440.0f;
        } else {
            f = 1.0f;
        }
        gVar.mo89222a(f).mo89254m(R.string.Lark_Legacy_UserCardConfirm).mo89255n(17).mo89253l(8388611).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, $$Lambda$f$RJESlfOHm6QKdFKLbnWqTVwvX9s.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Send, new DialogInterface.OnClickListener(searchBaseInfo) {
            /* class com.ss.android.lark.member_manage.impl.share_contact_card.$$Lambda$f$0hPXxD44NYBfBZYoe2yF3Of0hd4 */
            public final /* synthetic */ SearchBaseInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C45185f.this.m179309a(this.f$1, dialogInterface, i);
            }
        }).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m179309a(SearchBaseInfo searchBaseInfo, DialogInterface dialogInterface, int i) {
        String str;
        if (searchBaseInfo != null) {
            Intent intent = new Intent();
            ProfileContent profileContent = new ProfileContent();
            profileContent.setId(searchBaseInfo.getId());
            profileContent.setAvatarKey(searchBaseInfo.getAvatarKey());
            profileContent.setDisplayName(searchBaseInfo.getTitle());
            intent.putExtra("extra_key_profile_content", profileContent);
            this.f113832c.mo158989a(-1, intent);
            SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
            if (!searchChatterInfo.isFromOrganization()) {
                str = "search";
            } else if (searchChatterInfo.isCrossTenant()) {
                str = "external";
            } else {
                str = "organization";
            }
            SelectContactHitPoint.m179754a(str);
        }
        this.f113832c.mo158988a();
    }
}
