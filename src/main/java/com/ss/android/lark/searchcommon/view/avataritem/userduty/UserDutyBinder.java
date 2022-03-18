package com.ss.android.lark.searchcommon.view.avataritem.userduty;

import com.larksuite.component.ui.list.IComponentBinder;
import com.ss.android.lark.widget.duty.UserDutyLinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/userduty/UserDutyBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Lcom/ss/android/lark/widget/duty/UserDutyLinearLayout;", "Lcom/ss/android/lark/searchcommon/view/avataritem/userduty/UserDutyModel;", "()V", "bind", "", "view", "model", "unbind", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.h.a */
public final class UserDutyBinder implements IComponentBinder<UserDutyLinearLayout, UserDutyModel> {

    /* renamed from: a */
    public static final UserDutyBinder f133550a = new UserDutyBinder();

    private UserDutyBinder() {
    }

    /* renamed from: a */
    public void mo88913a(UserDutyLinearLayout userDutyLinearLayout) {
        Intrinsics.checkParameterIsNotNull(userDutyLinearLayout, "view");
        userDutyLinearLayout.setVisibility(8);
    }

    /* renamed from: a */
    public void mo88915a(UserDutyLinearLayout userDutyLinearLayout, UserDutyModel bVar) {
        Intrinsics.checkParameterIsNotNull(userDutyLinearLayout, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        userDutyLinearLayout.setVisibility(8);
        userDutyLinearLayout.setDividerVisibility(0);
        String d = bVar.mo184749d();
        if (d != null && (d.hashCode() != 0 || !d.equals(""))) {
            userDutyLinearLayout.setSectionVisibility(0);
            userDutyLinearLayout.setVisibility(0);
            userDutyLinearLayout.setSection(bVar.mo184749d());
        } else {
            userDutyLinearLayout.setSectionVisibility(8);
            userDutyLinearLayout.setDividerVisibility(8);
            userDutyLinearLayout.setSection("");
        }
        String c = bVar.mo184748c();
        if (c != null && (c.hashCode() != 0 || !c.equals(""))) {
            userDutyLinearLayout.setDutyVisibility(0);
            userDutyLinearLayout.setVisibility(0);
            userDutyLinearLayout.setDuty(bVar.mo184748c());
        } else {
            userDutyLinearLayout.setDutyVisibility(8);
            userDutyLinearLayout.setDividerVisibility(8);
            userDutyLinearLayout.setDuty("");
        }
        if (bVar.mo184742a() != null) {
            Integer a = bVar.mo184742a();
            if (a == null) {
                Intrinsics.throwNpe();
            }
            userDutyLinearLayout.setTextColor(a.intValue());
        }
        if (bVar.mo184746b() != null) {
            Integer b = bVar.mo184746b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            userDutyLinearLayout.setTextSize(b.intValue());
        }
    }
}
