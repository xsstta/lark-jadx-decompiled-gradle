package com.ss.android.lark.desktopmode.p1787a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.desktopmode.a.b */
public class C36517b extends C36516a {

    /* renamed from: a */
    private Fragment f94033a;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getChildFragmentManager().beginTransaction().remove(this.f94033a).commitAllowingStateLoss();
    }

    /* renamed from: b */
    private void m144070b(Fragment fragment) {
        this.f94033a = fragment;
    }

    /* renamed from: a */
    public static C36517b m144069a(Fragment fragment) {
        C36517b bVar = new C36517b();
        bVar.m144070b(fragment);
        return bVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.add(R.id.fragment_wrapper, this.f94033a);
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.fragment_wrapper);
        frameLayout.setBackgroundColor(-1);
        return frameLayout;
    }
}
