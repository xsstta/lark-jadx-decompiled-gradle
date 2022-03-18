package com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.b */
public class C40433b extends C40098a {

    /* renamed from: a */
    private C40435d f102716a;

    /* renamed from: b */
    private String f102717b;

    /* renamed from: c */
    private String f102718c;

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C40435d dVar = this.f102716a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    public static C40433b m160133a(String str, String str2) {
        C40433b bVar = new C40433b();
        bVar.f102717b = str;
        bVar.f102718c = str2;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C40435d dVar = new C40435d(this, this.f102717b, this.f102718c);
        this.f102716a = dVar;
        dVar.create();
        InvHitPoint.m160376d(this.f102717b);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.inv_invite_member_email_fragment, viewGroup, false);
    }
}
