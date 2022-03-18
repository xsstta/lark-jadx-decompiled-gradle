package com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.b */
public class C40453b extends C40098a {

    /* renamed from: a */
    private C40455d f102754a;

    /* renamed from: b */
    private String f102755b;

    /* renamed from: c */
    private String f102756c;

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C40455d dVar = this.f102754a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    public static C40453b m160165a(String str, String str2) {
        C40453b bVar = new C40453b();
        bVar.f102755b = str;
        bVar.f102756c = str2;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C40455d dVar = new C40455d(this, this.f102755b, this.f102756c);
        this.f102754a = dVar;
        dVar.create();
        InvHitPoint.m160371c(this.f102755b);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.inv_invite_member_mobile_fragment, viewGroup, false);
    }
}
