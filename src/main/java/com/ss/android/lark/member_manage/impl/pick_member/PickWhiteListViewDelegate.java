package com.ss.android.lark.member_manage.impl.pick_member;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.member_manage.dto.SelectChatterDTO;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.pick_member.IPickWhiteListContract;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView$Delegate;", "view", "Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView;", "model", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseModel;", "(Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView;Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseModel;)V", "getModel", "()Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseModel;", "getView", "()Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView;", "onConfirmButtonClicked", "", "onSelectedNumClick", "onSingleItemClick", "selectBean", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onTitleRightButtonClick", "onUnSelectableItemClick", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.pick_member.g */
public final class PickWhiteListViewDelegate extends AbstractC45074b implements IPickWhiteListContract.IView.Delegate {

    /* renamed from: c */
    private final IPickWhiteListContract.IView f114321c;

    /* renamed from: d */
    private final IGroupMemberBaseContract.AbstractC45065a f114322d;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: c */
    public void mo159456c(C45084c cVar) {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: d */
    public void mo159458d(C45084c cVar) {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: f */
    public void mo159461f() {
    }

    @Override // com.ss.android.lark.member_manage.impl.pick_member.IPickWhiteListContract.IView.Delegate
    /* renamed from: g */
    public void mo159662g() {
        Map<String, C45084c> c = this.f114322d.mo159441c();
        if (CollectionUtils.isNotEmpty(c)) {
            this.f114321c.a_(CollectionsKt.toList(c.values()));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: e */
    public void mo159460e() {
        Map<String, C45084c> c = this.f114322d.mo159441c();
        ArrayList<SelectChatterDTO> arrayList = new ArrayList<>(c.size());
        Intrinsics.checkExpressionValueIsNotNull(c, "selectedItems");
        for (Map.Entry<String, C45084c> entry : c.entrySet()) {
            C45084c value = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
            String h = value.mo159513h();
            Intrinsics.checkExpressionValueIsNotNull(h, "it.value.id");
            C45084c value2 = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(value2, "it.value");
            C45085e g = value2.mo159512g();
            Intrinsics.checkExpressionValueIsNotNull(g, "it.value.chatterInfo");
            String b = g.mo159526b();
            Intrinsics.checkExpressionValueIsNotNull(b, "it.value.chatterInfo.imageKey");
            arrayList.add(new SelectChatterDTO(h, b));
        }
        this.f114321c.mo159659a(arrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickWhiteListViewDelegate(IPickWhiteListContract.IView bVar, IGroupMemberBaseContract.AbstractC45065a aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f114321c = bVar;
        this.f114322d = aVar;
    }
}
