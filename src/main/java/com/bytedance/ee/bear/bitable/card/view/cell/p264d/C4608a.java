package com.bytedance.ee.bear.bitable.card.view.cell.p264d;

import android.view.View;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c;
import com.bytedance.ee.bear.bitable.card.view.cell.user.AbstractC4697a;
import com.bytedance.ee.bear.bitable.card.view.cell.user.UserCellContainer;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.d.a */
public class C4608a extends AbstractC4602c<List<UserEntity>> implements AbstractC4697a {

    /* renamed from: g */
    protected UserCellContainer f13613g;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4602c, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13613g;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: d */
    public boolean mo18115d() {
        return !mo18116e();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.user.AbstractC4697a
    /* renamed from: l */
    public String mo18017l() {
        return C4484g.m18494b().mo17252c();
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
        this.f13613g.setData(aVar.mo17835c());
    }

    public C4608a(View view, AbstractC4712d dVar) {
        super(view, dVar);
        UserCellContainer userCellContainer = (UserCellContainer) view.findViewById(R.id.field_user_container);
        this.f13613g = userCellContainer;
        userCellContainer.setDelegate(this);
        this.f13613g.setDropTriangleVisibility(false);
    }
}
