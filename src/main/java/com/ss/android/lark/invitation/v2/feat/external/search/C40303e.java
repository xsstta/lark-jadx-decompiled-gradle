package com.ss.android.lark.invitation.v2.feat.external.search;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.profile.entity.C52260a;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.e */
public class C40303e extends AbstractC58968a<C40303e> {

    /* renamed from: a */
    public final Profile f102396a;

    /* renamed from: b */
    private int f102397b = -1;

    /* renamed from: a */
    public int mo146154a() {
        return this.f102397b;
    }

    /* renamed from: b */
    public static List<C40303e> m159757b() {
        return new ArrayList();
    }

    public C40303e(Profile profile) {
        super(R.layout.inv_item_search_result);
        this.f102396a = profile;
    }

    /* renamed from: a */
    public boolean mo146156a(String str) {
        Profile profile = this.f102396a;
        if (profile == null) {
            return false;
        }
        return TextUtils.equals(str, profile.getId());
    }

    /* renamed from: a */
    private static C40303e m159754a(GetUserProfileResponse getUserProfileResponse) {
        if (getUserProfileResponse == null) {
            return null;
        }
        return new C40303e(C52260a.m202784a(getUserProfileResponse, C40147z.m159160a().getLoginDependency().mo145590f()));
    }

    /* renamed from: a */
    public static List<C40303e> m159755a(List<GetUserProfileResponse> list) {
        ArrayList arrayList = new ArrayList();
        for (GetUserProfileResponse getUserProfileResponse : list) {
            C40303e a = m159754a(getUserProfileResponse);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo146155a(ProfileFinishResult profileFinishResult) {
        if (profileFinishResult != null) {
            this.f102396a.setIsFriend(profileFinishResult.isFriend);
            this.f102396a.setIsRequestUserApplied(profileFinishResult.isRequestUserApplied);
            this.f102396a.setIsTargetUserApplied(profileFinishResult.isTargetUserApplied);
        }
    }

    /* renamed from: a */
    private void m159756a(TextView textView, boolean z) {
        if (z) {
            textView.setBackgroundResource(R.drawable.inv_invite_btn_bg_enable);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.static_white));
            return;
        }
        textView.setBackground(null);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.text_placeholder));
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        this.f102397b = i;
        ImageView imageView = (ImageView) cVar.mo200081a(R.id.ipisrAvatarIv);
        TextView textView = (TextView) cVar.mo200081a(R.id.ipisrIsFriendTv);
        TextView textView2 = (TextView) cVar.mo200081a(R.id.ipisrUsernameTv);
        TextView textView3 = (TextView) cVar.mo200081a(R.id.ipisrTenantTv);
        C57832h.m224486a(cVar.itemView);
        cVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40303e.View$OnClickListenerC403041 */

            public void onClick(View view) {
                C40147z.m159160a().openProfileForResult(ViewUtils.m224142a(view), C40303e.this.f102396a, C40305f.m159762a().mo146159b(), 273);
                InvHitPoint.m160386i();
            }
        });
        C40125p.m159094a(this.f102396a.getAvatarKey(), this.f102396a.getId(), imageView);
        if (this.f102396a.isFriend()) {
            m159756a(textView, false);
            textView.setText(UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleSearchAdded));
        } else if (this.f102396a.isRequestUserApplied()) {
            m159756a(textView, false);
            textView.setText(UIHelper.getString(R.string.Lark_Contacts_ExternalContactRequestSent));
        } else if (this.f102396a.isTargetUserApplied()) {
            m159756a(textView, true);
            textView.setText(UIHelper.getString(R.string.Lark_Legacy_Agree));
        } else {
            m159756a(textView, true);
            textView.setText(UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleSearchAdd));
        }
        textView2.setText(C40147z.m159160a().getChatDependency().mo145575a(this.f102396a.getName(), this.f102396a.getEnName(), this.f102396a.getLocalizedName(), this.f102396a.getAlias()));
        textView3.setText(this.f102396a.getTenant());
        if (mo200069h() == mo200068g() - 1) {
            cVar.mo200081a(R.id.ipisrSplitLine).setVisibility(8);
        } else {
            cVar.mo200081a(R.id.ipisrSplitLine).setVisibility(0);
        }
        DesktopUtil.m144304b(imageView);
        DesktopUtil.m144299a(textView2);
        DesktopUtil.m144306b(textView3);
    }
}
