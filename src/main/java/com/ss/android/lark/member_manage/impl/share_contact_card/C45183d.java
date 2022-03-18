package com.ss.android.lark.member_manage.impl.share_contact_card;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView;
import com.ss.android.lark.member_manage.impl.add_member.C44951d;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;

/* renamed from: com.ss.android.lark.member_manage.impl.share_contact_card.d */
public class C45183d extends C44951d {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.add_member.C44951d
    /* renamed from: a */
    public void mo159070a(Bundle bundle, Bundle bundle2) {
        mo92553a(new C45184e(this.f113827b, this.f113826a, bundle.getBoolean("key_multi_select_mode", true), bundle.getBoolean("extra_key_show_title_bar", true), false), new C45182c(this.f113827b, bundle, bundle2, this.f113828c));
        ((IAddGroupMemberContract.IView) mo92551a()).setViewDelegate(new C45185f(this.f113827b, this));
    }

    public C45183d(Activity activity, Bundle bundle, Bundle bundle2, AddGroupMemberView.AbstractC44927a aVar) {
        super(activity, bundle, bundle2, aVar);
    }
}
