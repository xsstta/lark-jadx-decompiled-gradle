package com.ss.android.lark.invitation.v2.p2050a;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;

/* renamed from: com.ss.android.lark.invitation.v2.a.b */
public class C40155b extends AbstractC28490a<Boolean> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isSticky() {
        return true;
    }

    /* renamed from: a */
    public Boolean getDefault() {
        return true;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("invite_member_channel_adjust", "invite_member_channel_adjust", "caimengjie", "邀请成员分流页面调整");
    }
}
