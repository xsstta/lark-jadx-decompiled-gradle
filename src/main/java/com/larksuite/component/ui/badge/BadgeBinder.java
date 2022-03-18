package com.larksuite.component.ui.badge;

import android.view.View;
import com.larksuite.component.ui.imageview.LKUIBadgeDrawable2;
import com.larksuite.component.ui.list.IComponentBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/badge/BadgeBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Landroid/view/View;", "Lcom/larksuite/component/ui/badge/BadgeModel;", "()V", "bind", "", "view", "model", "unbind", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.a.b */
public final class BadgeBinder implements IComponentBinder<View, BadgeModel> {
    @Override // com.larksuite.component.ui.list.IComponentBinder
    /* renamed from: a */
    public void mo88913a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        LKUIBadgeDrawable2.f62638a.mo89364a(view).setVisible(false, false);
    }

    /* renamed from: a */
    public void mo88915a(View view, BadgeModel cVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, "model");
        LKUIBadgeDrawable2.f62638a.mo89364a(view).mo89355a().mo89373b(cVar.mo88938i()).mo89374b(cVar.mo88937h()).mo89376c(cVar.mo88939j()).mo89368a(cVar.mo88935f()).mo89377d(cVar.mo88936g()).mo89369a(cVar.mo88923a()).mo89367a(cVar.mo88934e()).mo89366a(cVar.mo88928b()).mo89375c(cVar.mo88933d()).mo89372b(cVar.mo88931c()).mo89370a(cVar.mo88940k()).mo89371a();
    }
}
