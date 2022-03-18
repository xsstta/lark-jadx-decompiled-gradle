package com.ss.android.lark.invitation.v2.feat.external.p2054a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.profile.entity.C52260a;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.a */
public class C40201a extends AbstractC58968a<C40201a> {

    /* renamed from: a */
    public final Profile f102139a;

    public C40201a(Profile profile) {
        super(R.layout.inv_item_drawer);
        this.f102139a = profile;
    }

    /* renamed from: a */
    private static C40201a m159351a(GetUserProfileResponse getUserProfileResponse) {
        if (getUserProfileResponse == null) {
            return null;
        }
        return new C40201a(C52260a.m202784a(getUserProfileResponse, C40147z.m159160a().getLoginDependency().mo145590f()));
    }

    /* renamed from: a */
    public static List<C40201a> m159352a(List<GetUserProfileResponse> list) {
        ArrayList arrayList = new ArrayList();
        for (GetUserProfileResponse getUserProfileResponse : list) {
            C40201a a = m159351a(getUserProfileResponse);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        ImageView imageView = (ImageView) cVar.mo200081a(R.id.ipdAvatarIv);
        TextView textView = (TextView) cVar.mo200081a(R.id.ipdUsernameTv);
        TextView textView2 = (TextView) cVar.mo200081a(R.id.ipdTenantTv);
        DesktopUtil.m144304b(imageView);
        DesktopUtil.m144299a(textView);
        DesktopUtil.m144306b(textView2);
        C57832h.m224486a(cVar.itemView);
        cVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40201a.View$OnClickListenerC402021 */

            public void onClick(View view) {
                C40147z.m159160a().openProfile(ViewUtils.m224142a(view), C40201a.this.f102139a, 10);
                InvHitPoint.m160382g();
            }
        });
        C40125p.m159094a(this.f102139a.getAvatarKey(), this.f102139a.getId(), imageView);
        textView.setText(C40147z.m159160a().getChatDependency().mo145575a(this.f102139a.getName(), this.f102139a.getEnName(), this.f102139a.getLocalizedName(), this.f102139a.getAlias()));
        textView2.setText(this.f102139a.getTenant());
        if (mo200069h() == mo200068g() - 1) {
            cVar.mo200081a(R.id.ipdSplitLine).setVisibility(8);
        } else {
            cVar.mo200081a(R.id.ipdSplitLine).setVisibility(0);
        }
    }
}
