package com.ss.android.lark.member_manage.impl.share_contact_card;

import android.app.Activity;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.member_manage.impl.share_contact_card.e */
public class C45184e extends AddGroupMemberView {

    /* renamed from: h */
    private final boolean f114374h;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView
    /* renamed from: c */
    public boolean mo158976c() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView
    /* renamed from: a */
    public void mo158967a() {
        int i;
        super.mo158967a();
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setTitle(R.string.Lark_Legacy_SelectUserCard);
        this.mTitleBar.setRightVisible(this.f114374h);
        RelativeLayout relativeLayout = this.mBottomDetailRL;
        if (this.f114374h) {
            i = 0;
        } else {
            i = 8;
        }
        relativeLayout.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView
    /* renamed from: b */
    public void mo158972b() {
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) mo158978e().mo183562a(PickerUseCategory.PROFILE)).mo183604p(false)).mo183565a((SearchResultView.IOnBusinessConsumeItem) null)).mo183624t(true)).mo183483a();
        this.mChatterPicker.mo183573b(new ArrayList(this.f113749a.mo159015n().values()));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView
    /* renamed from: a */
    public ChatterPickerParams.Builder mo158966a(ChatterPickerParams.Builder aVar) {
        return aVar.mo183673f(mo158982i()).mo183712k(false).mo183668d(true);
    }

    public C45184e(Activity activity, AddGroupMemberView.AbstractC44927a aVar, boolean z, boolean z2, boolean z3) {
        super(activity, aVar, z2, z3);
        this.f114374h = z;
    }
}
