package com.ss.android.lark.contact.impl.contacts_robot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.contacts_robot.RobotView;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;

/* renamed from: com.ss.android.lark.contact.impl.contacts_robot.b */
public class C35723b extends BaseFragment {

    /* renamed from: a */
    public View f92364a;

    /* renamed from: b */
    RobotView.AbstractC35716a f92365b = new RobotView.AbstractC35716a() {
        /* class com.ss.android.lark.contact.impl.contacts_robot.C35723b.C357241 */

        @Override // com.ss.android.lark.contact.impl.contacts_robot.RobotView.AbstractC35716a
        /* renamed from: a */
        public void mo131515a(RobotView robotView) {
            ButterKnife.bind(robotView, C35723b.this.f92364a);
        }
    };

    /* renamed from: c */
    private C35728d f92366c;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f92366c.destroy();
    }

    /* renamed from: a */
    private void m139828a() {
        C35728d dVar = new C35728d(new C35725c(), new RobotView(this.f92365b, getActivity()));
        this.f92366c = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f92364a = layoutInflater.inflate(R.layout.activity_bot_contacts, viewGroup, false);
        m139828a();
        ContactHitPoint.m140799e();
        return this.f92364a;
    }
}
