package com.bytedance.ee.bear.bitable.card.view.cell.user;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4534h;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.user.e */
public class C4710e extends AbstractC4597b<List<UserEntity>, List<UserEntity>> implements AbstractC4697a {

    /* renamed from: g */
    private C4537a<List<UserEntity>> f13925g;

    /* renamed from: h */
    private C4771b f13926h;

    /* renamed from: i */
    private UserCellContainer f13927i;

    /* renamed from: j */
    private MentionUserSelectPanel f13928j;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13927i;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.user.AbstractC4697a
    /* renamed from: l */
    public String mo18017l() {
        return C4484g.m18494b().mo17252c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        super.mo17996h();
        this.f13927i.setDropTriangleSelected(true);
        m19535n();
        if (this.f13928j != null) {
            m19534m();
            this.f13928j.mo17973a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        this.f13927i.setDropTriangleSelected(false);
        MentionUserSelectPanel bVar = this.f13928j;
        if (bVar != null && bVar.mo17980d()) {
            this.f13928j.mo17978b();
        }
    }

    /* renamed from: m */
    private void m19534m() {
        String str;
        boolean z;
        C4537a<List<UserEntity>> aVar = this.f13925g;
        if (aVar != null && this.f13928j != null) {
            C4534h hVar = (C4534h) aVar.mo17829a();
            MentionUserSelectPanel bVar = this.f13928j;
            if (hVar == null) {
                str = "";
            } else {
                str = hVar.mo17750h();
            }
            if (hVar == null || !hVar.mo17756a()) {
                z = false;
            } else {
                z = true;
            }
            bVar.mo18377a(str, z, this.f13925g.mo17835c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m19536o() {
        C4525a b = this.f13925g.mo17834b();
        this.f13926h.closeEditPanel(b.mo17705a(), this.f13925g.mo17829a().mo17749g(), b.mo17707b(), this.f13928j.mo18173h());
        mo17997i();
    }

    /* renamed from: n */
    private void m19535n() {
        Context context = this.f13927i.getContext();
        DocumentInfo k = this.f13588e.mo17878k();
        if (!(context instanceof FragmentActivity) || k == null) {
            C13479a.m54758a("UserCellViewHolder", "context is not FragmentActivity");
            return;
        }
        MentionUserSelectPanel bVar = new MentionUserSelectPanel(context, (FragmentActivity) context, k.getObjToken(), C10599b.m43898a(C8275a.m34052b(k.getType())), true, !EViewType.FORM.equals(this.f13926h.getShowingTable().mo17775e().mo17794c()), this.f13926h.getEnableNotifyUserWhenMentioned());
        this.f13928j = bVar;
        bVar.mo17977a(new AbstractC4565a.AbstractC4569b<List<UserEntity>>() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.user.C4710e.C47111 */

            /* renamed from: a */
            public void mo17986a(List<UserEntity> list) {
                C4710e.this.mo18110a(list);
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4569b
            /* renamed from: a */
            public void mo17987a(String str, Map<String, String> map) {
                C4710e.this.f13588e.mo17864a(str, map);
            }
        });
        this.f13928j.mo17976a(new AbstractC4565a.AbstractC4568a() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.user.$$Lambda$e$BBTbtC9AKkSdHhdryBAD3sF7nw */

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4568a
            public final void onDismiss() {
                C4710e.this.m19536o();
            }
        });
        this.f13928j.mo17975a(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.user.AbstractC4697a
    /* renamed from: a */
    public void mo18130a(String str) {
        this.f13588e.mo17863a(str);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<UserEntity>> aVar) {
        super.mo17993a((C4537a) aVar);
        this.f13925g = aVar;
        this.f13927i.setData(aVar.mo17835c());
        m19534m();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        boolean z2;
        super.mo17995a(z, eFieldUneditableReason);
        UserCellContainer userCellContainer = this.f13927i;
        if (!z || mo18116e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        userCellContainer.setDropTriangleVisibility(z2);
    }

    public C4710e(View view, AbstractC4712d dVar, C4771b bVar) {
        super(view, dVar);
        this.f13926h = bVar;
        UserCellContainer userCellContainer = (UserCellContainer) view.findViewById(R.id.field_user_container);
        this.f13927i = userCellContainer;
        userCellContainer.setDelegate(this);
    }
}
