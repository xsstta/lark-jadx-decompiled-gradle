package com.ss.android.lark.member_manage.impl.base.p2259b;

import android.text.TextUtils;
import androidx.core.util.C0843d;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45199f;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.TeamShowMemberLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.base.b.a */
public class C45051a implements AbstractC45054c {

    /* renamed from: a */
    String f114069a;

    /* renamed from: b */
    IGroupMemberManageModuleDependency.AbstractC44881d f114070b = GroupMemberManageModule.m177902a().getChatterDependency();

    @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c
    /* renamed from: b */
    public boolean mo159375b() {
        return false;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c
    /* renamed from: a */
    public String mo159373a() {
        return this.f114069a;
    }

    /* renamed from: a */
    public void mo159374a(final AbstractRunnableC45034a aVar, String str, final String str2, final AbstractC45053b<List<C45084c>> bVar) {
        this.f114069a = str2;
        if (!TextUtils.isEmpty(str2)) {
            final String lowerCase = str2.toLowerCase();
            aVar.mo159313a(str, lowerCase, new IGetDataCallback<GroupManageChatChatterResponse>() {
                /* class com.ss.android.lark.member_manage.impl.base.p2259b.C45051a.C450521 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ChatChatterSearcher", errorResult.getDebugMsg());
                    bVar.mo159379a(str2, errorResult);
                }

                /* renamed from: a */
                public void onSuccess(GroupManageChatChatterResponse bVar) {
                    if (bVar != null && !C0843d.m3987a(C45051a.this.f114069a, bVar.mo158902a())) {
                        List<ChatChatter> d = bVar.mo158906d();
                        if (CollectionUtils.isEmpty(d)) {
                            bVar.mo159378a(lowerCase);
                            return;
                        }
                        List<Chatter> arrayList = new ArrayList<>(d);
                        AbstractRunnableC45034a aVar = aVar;
                        if (!(aVar instanceof C45199f) && !(aVar instanceof TeamShowMemberLoader)) {
                            arrayList = aVar.mo159323b(arrayList);
                        }
                        List<C45084c> a = C45086f.m178890a(aVar.mo159316b(), arrayList, C45051a.this.f114070b.mo143779a(), bVar.mo158907e(), bVar.mo158909f());
                        aVar.mo159324c(a);
                        bVar.mo159377a(a, lowerCase);
                    }
                }
            });
        }
    }
}
