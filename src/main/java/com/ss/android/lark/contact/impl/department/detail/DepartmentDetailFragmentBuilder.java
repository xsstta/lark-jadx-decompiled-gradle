package com.ss.android.lark.contact.impl.department.detail;

import android.os.Bundle;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder;
import com.ss.android.lark.biz.core.api.PickType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0017\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0016J\u0017\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0017\u0010\u001e\u001a\u00020\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00012\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\nH\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\nH\u0016J\u0016\u0010,\u001a\u00020\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\nH\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\nH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\nH\u0016J\u0010\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016J\u0012\u00106\u001a\u00020\u00012\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/DepartmentDetailFragmentBuilder;", "Lcom/ss/android/lark/biz/core/api/IDepartmentDetailFragmentBuilder;", "()V", "bundle", "Landroid/os/Bundle;", "fragment", "Lcom/ss/android/lark/contact/impl/department/detail/DepartmentDetailFragment;", "build", "needEnterpriseEmail", "hasEnterpriseEmail", "", "(Ljava/lang/Boolean;)Lcom/ss/android/lark/biz/core/api/IDepartmentDetailFragmentBuilder;", "setChatId", "chatId", "", "setCheckOneWayContact", "isCheckOneWayContact", "setCheckPermission", "isCheckPermission", "setContainMember", "containMember", "", "setEduExtra", "prefixName", "setEduMode", "isEdu", "setGetInactiveParent", "getInactiveParent", "setIgnoreLoginUser", "isIgnoreLoginUser", "setIsB2B", "isB2B", "setOnOperationListener", "listener", "Lcom/ss/android/lark/biz/core/api/IOnOperationListener;", "setPageTitle", "title", "setPickType", "pickType", "Lcom/ss/android/lark/biz/core/api/PickType;", "setReadFromMemory", "readFromMemory", "setSelectMode", "isSelectMode", "setSelectedMember", "selectedMember", "setShowContact", "isShowContact", "setShowGroupEntrance", "isShowGroupEntrance", "setShowUserLocalTime", "isShowUsersLocalTime", "setShowUserStatus", "isShowUserStatus", "setTargetDepartmentId", "targetDepartmentId", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.b */
public class DepartmentDetailFragmentBuilder implements IDepartmentDetailFragmentBuilder {

    /* renamed from: a */
    private final C35819a f92606a = new C35819a();

    /* renamed from: b */
    private final Bundle f92607b = new Bundle();

    /* renamed from: b */
    public C35819a mo105797a() {
        this.f92606a.setArguments(this.f92607b);
        return this.f92606a;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: a */
    public IDepartmentDetailFragmentBuilder mo105799a(AbstractC29541ac acVar) {
        Intrinsics.checkParameterIsNotNull(acVar, "listener");
        this.f92606a.mo131790a(acVar);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: b */
    public IDepartmentDetailFragmentBuilder mo105804b(String str) {
        Bundle bundle = this.f92607b;
        if (str == null) {
            str = "";
        }
        bundle.putString("prefix_name", str);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: c */
    public IDepartmentDetailFragmentBuilder mo105806c(String str) {
        this.f92607b.putString("department_page_title", str);
        return this;
    }

    /* renamed from: d */
    public IDepartmentDetailFragmentBuilder mo131804d(String str) {
        this.f92607b.putString("department_id", str);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: e */
    public IDepartmentDetailFragmentBuilder mo105809e(boolean z) {
        this.f92607b.putBoolean("KEY_IS_SHOW_CONTACT", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: f */
    public IDepartmentDetailFragmentBuilder mo105810f(boolean z) {
        this.f92607b.putBoolean("need_show_local_time", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: g */
    public IDepartmentDetailFragmentBuilder mo105811g(boolean z) {
        this.f92607b.putBoolean("is_check_one_way_contact", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: h */
    public IDepartmentDetailFragmentBuilder mo105812h(boolean z) {
        this.f92607b.putBoolean("get_inactive_parent", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: i */
    public IDepartmentDetailFragmentBuilder mo105813i(boolean z) {
        this.f92607b.putBoolean("read_departments_from_shared_memory", z);
        return this;
    }

    /* renamed from: j */
    public IDepartmentDetailFragmentBuilder mo131805j(boolean z) {
        this.f92607b.putBoolean("department_select_mode", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: a */
    public IDepartmentDetailFragmentBuilder mo105798a(PickType pickType) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        this.f92607b.putSerializable("department_pick_type", pickType);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: b */
    public IDepartmentDetailFragmentBuilder mo105803b(Boolean bool) {
        boolean z;
        Bundle bundle = this.f92607b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        bundle.putBoolean("b2b_connect", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: c */
    public IDepartmentDetailFragmentBuilder mo105807c(boolean z) {
        this.f92607b.putBoolean("KEY_IS_CHECK_PERMISSION", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: d */
    public IDepartmentDetailFragmentBuilder mo105808d(boolean z) {
        this.f92607b.putBoolean("need_show_group_entrance", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: a */
    public IDepartmentDetailFragmentBuilder mo105800a(Boolean bool) {
        boolean z;
        Bundle bundle = this.f92607b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        bundle.putBoolean("is_edu_mode", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: b */
    public IDepartmentDetailFragmentBuilder mo105805b(boolean z) {
        this.f92607b.putBoolean("ignore_login_user", z);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: a */
    public IDepartmentDetailFragmentBuilder mo105801a(String str) {
        this.f92607b.putString("chat_id", str);
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder
    /* renamed from: a */
    public IDepartmentDetailFragmentBuilder mo105802a(boolean z) {
        this.f92607b.putBoolean("department_user_status", z);
        return this;
    }
}
