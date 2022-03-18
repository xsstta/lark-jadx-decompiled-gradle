package com.ss.android.lark.contact.impl.contacts_group.join;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f;
import com.ss.android.lark.contact.impl.contacts_group.join.MyJoinGroupView;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.b */
public class C35610b extends BaseFragment {

    /* renamed from: a */
    private C35615d f92096a;

    /* renamed from: b */
    private AbstractC35602f f92097b;

    /* renamed from: c */
    private MyJoinGroupView.AbstractC35605a f92098c = new MyJoinGroupView.AbstractC35605a() {
        /* class com.ss.android.lark.contact.impl.contacts_group.join.C35610b.C356111 */

        @Override // com.ss.android.lark.contact.impl.contacts_group.join.MyJoinGroupView.AbstractC35605a
        /* renamed from: a */
        public void mo131280a(MyJoinGroupView myJoinGroupView) {
            ButterKnife.bind(myJoinGroupView, C35610b.this.getView());
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f92096a.destroy();
    }

    /* renamed from: a */
    private void m139405a() {
        C35615d dVar = new C35615d(new C35612c(), new MyJoinGroupView(this.f92098c, this.f92097b));
        this.f92096a = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public void mo131286a(AbstractC35602f fVar) {
        this.f92097b = fVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m139405a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_contacts_my_join_group, viewGroup, false);
    }
}
