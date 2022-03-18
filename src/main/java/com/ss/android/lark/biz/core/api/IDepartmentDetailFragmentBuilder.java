package com.ss.android.lark.biz.core.api;

import com.ss.android.lark.base.fragment.BaseFragment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H&J\u0012\u0010\u0012\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\nH&J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H&J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\nH&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0006H&J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0006H&J\u0016\u0010(\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H&J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0006H&J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0006H&J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0006H&J\u0010\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0006H&J\u0012\u00102\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\nH&¨\u00064"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IDepartmentDetailFragmentBuilder;", "", "build", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "needEnterpriseEmail", "hasEnterpriseEmail", "", "(Ljava/lang/Boolean;)Lcom/ss/android/lark/biz/core/api/IDepartmentDetailFragmentBuilder;", "setChatId", "chatId", "", "setCheckOneWayContact", "isCheckOneWayContact", "setCheckPermission", "isCheckPermission", "setContainMember", "containMember", "", "setEduExtra", "prefixName", "setEduMode", "isEdu", "setGetInactiveParent", "getInactiveParent", "setIgnoreLoginUser", "isIgnoreLoginUser", "setIsB2B", "isB2B", "setOnOperationListener", "listener", "Lcom/ss/android/lark/biz/core/api/IOnOperationListener;", "setPageTitle", "title", "setPickType", "pickType", "Lcom/ss/android/lark/biz/core/api/PickType;", "setReadFromMemory", "readFromMemory", "setSelectMode", "isSelectMode", "setSelectedMember", "selectedMember", "setShowContact", "isShowContact", "setShowGroupEntrance", "isShowGroupEntrance", "setShowUserLocalTime", "isShowUsersLocalTime", "setShowUserStatus", "isShowUserStatus", "setTargetDepartmentId", "targetDepartmentId", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.o */
public interface IDepartmentDetailFragmentBuilder {
    /* renamed from: a */
    BaseFragment mo105797a();

    /* renamed from: a */
    IDepartmentDetailFragmentBuilder mo105798a(PickType pickType);

    /* renamed from: a */
    IDepartmentDetailFragmentBuilder mo105799a(AbstractC29541ac acVar);

    /* renamed from: a */
    IDepartmentDetailFragmentBuilder mo105800a(Boolean bool);

    /* renamed from: a */
    IDepartmentDetailFragmentBuilder mo105801a(String str);

    /* renamed from: a */
    IDepartmentDetailFragmentBuilder mo105802a(boolean z);

    /* renamed from: b */
    IDepartmentDetailFragmentBuilder mo105803b(Boolean bool);

    /* renamed from: b */
    IDepartmentDetailFragmentBuilder mo105804b(String str);

    /* renamed from: b */
    IDepartmentDetailFragmentBuilder mo105805b(boolean z);

    /* renamed from: c */
    IDepartmentDetailFragmentBuilder mo105806c(String str);

    /* renamed from: c */
    IDepartmentDetailFragmentBuilder mo105807c(boolean z);

    /* renamed from: d */
    IDepartmentDetailFragmentBuilder mo105808d(boolean z);

    /* renamed from: e */
    IDepartmentDetailFragmentBuilder mo105809e(boolean z);

    /* renamed from: f */
    IDepartmentDetailFragmentBuilder mo105810f(boolean z);

    /* renamed from: g */
    IDepartmentDetailFragmentBuilder mo105811g(boolean z);

    /* renamed from: h */
    IDepartmentDetailFragmentBuilder mo105812h(boolean z);

    /* renamed from: i */
    IDepartmentDetailFragmentBuilder mo105813i(boolean z);
}
