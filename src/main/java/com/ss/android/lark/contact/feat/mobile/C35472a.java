package com.ss.android.lark.contact.feat.mobile;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.feat.mobile.mvp.C35483a;
import com.ss.android.lark.contact.feat.mobile.mvp.C35485b;
import com.ss.android.lark.contact.feat.mobile.mvp.C35486c;
import com.ss.android.lark.contact.feat.mobile.mvp.C35487d;
import com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView;
import com.ss.android.lark.contact.feat.statistics.ContactMobileHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.contact.feat.mobile.a */
public class C35472a extends C40098a implements ContactMobileApi.AbstractC35404c {

    /* renamed from: a */
    public View f91715a;

    /* renamed from: b */
    private C35487d f91716b;

    /* renamed from: c */
    private Context f91717c;

    /* renamed from: d */
    private ContactMobileApi.AbstractC35403b f91718d;

    /* renamed from: e */
    private ContactMobileApi.ContactType f91719e = ContactMobileApi.ContactType.PHONE;

    /* renamed from: f */
    private ContactMobileApi.C35402a f91720f = ContactMobileApi.C35402a.m138370b();

    /* renamed from: g */
    private String f91721g;

    /* renamed from: h */
    private String f91722h;

    /* renamed from: i */
    private boolean f91723i;

    /* renamed from: j */
    private ContactMobileChooseBaseView f91724j;

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C35487d dVar = this.f91716b;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // com.ss.android.lark.contact.entity.api.ContactMobileApi.AbstractC35404c
    /* renamed from: a */
    public boolean mo130583a() {
        ContactMobileApi.AbstractC35403b bVar;
        ContactMobileChooseBaseView contactMobileChooseBaseView;
        ContactMobileApi.C35402a aVar = this.f91720f;
        if (aVar == null || !aVar.mo130576c() || (bVar = this.f91718d) == null || (contactMobileChooseBaseView = this.f91724j) == null) {
            return false;
        }
        bVar.mo130581a(contactMobileChooseBaseView.mo130910g());
        return true;
    }

    /* renamed from: a */
    private void m138761a(boolean z) {
        this.f91723i = z;
    }

    /* renamed from: a */
    private void m138760a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f91722h = UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberImportContactsSave);
        } else {
            this.f91722h = str;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f91717c = context;
        if (DesktopUtil.m144307b()) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && (parentFragment instanceof ContactMobileApi.AbstractC35403b)) {
                this.f91718d = (ContactMobileApi.AbstractC35403b) parentFragment;
            } else if (parentFragment == null && (context instanceof ContactMobileApi.AbstractC35403b)) {
                this.f91718d = (ContactMobileApi.AbstractC35403b) context;
            }
        } else if (context instanceof ContactMobileApi.AbstractC35403b) {
            this.f91718d = (ContactMobileApi.AbstractC35403b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (this.f91719e == ContactMobileApi.ContactType.EMAIL) {
            z = true;
        } else {
            z = false;
        }
        C35486c cVar = new C35486c(activity, z);
        C354731 r3 = new ContactMobileChooseBaseView.AbstractC35482a() {
            /* class com.ss.android.lark.contact.feat.mobile.C35472a.C354731 */

            @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.AbstractC35482a
            /* renamed from: a */
            public void mo130891a(IView iView) {
                ButterKnife.bind(iView, C35472a.this.f91715a);
            }
        };
        if (this.f91720f.mo130576c()) {
            this.f91724j = new C35483a(this.f91717c, r3, this.f91718d, this.f91721g, this.f91722h, this.f91723i);
        } else if (this.f91720f.mo130577d()) {
            this.f91724j = new C35485b(this.f91717c, r3, this.f91718d, this.f91721g);
        }
        C35487d dVar = new C35487d(cVar, this.f91724j, this.f91718d);
        this.f91716b = dVar;
        dVar.f91767b = this.f91721g;
        this.f91716b.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contact_contact_mobile_fragment, (ViewGroup) null, false);
        this.f91715a = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C35472a m138759a(ContactMobileApi.ContactType contactType, ContactMobileApi.C35402a aVar, String str) {
        boolean z;
        C35472a aVar2 = new C35472a();
        aVar2.f91719e = contactType;
        aVar2.f91720f = aVar;
        aVar2.m138760a(aVar.mo130578e());
        aVar2.m138761a(aVar.mo130579f());
        aVar2.f91721g = str;
        ContactMobileHitPoint.f91565a.mo130727a(str);
        ContactMobileHitPoint bVar = ContactMobileHitPoint.f91565a;
        if (contactType == ContactMobileApi.ContactType.EMAIL) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo130728a(z);
        return aVar2;
    }
}
