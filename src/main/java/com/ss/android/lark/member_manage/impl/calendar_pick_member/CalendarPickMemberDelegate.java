package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45082a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberDelegate;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView$Delegate;", "view", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView;", "model", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberModel;", "(Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView;Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberModel;)V", "getModel", "()Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberModel;", "getView", "()Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView;", "changeUnselectedEnable", "", "enable", "", "onConfirmButtonClicked", "onMultiItemSelected", "selectBean", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "isSelected", "onSelectedNumClick", "onSingleItemClick", "onTitleRightButtonClick", "onUnSelectableItemClick", "setUnselectedEnableIfExceed", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.b */
public final class CalendarPickMemberDelegate extends AbstractC45074b implements ICalendarPickMemberContract.IView.Delegate {

    /* renamed from: c */
    private final ICalendarPickMemberContract.IView f114178c;

    /* renamed from: d */
    private final CalendarPickMemberModel f114179d;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: c */
    public void mo159456c(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: f */
    public void mo159461f() {
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView.Delegate
    /* renamed from: g */
    public void mo159552g() {
        if (this.f114179d.mo159441c().size() >= 30) {
            m178912a(false);
        } else {
            m178912a(true);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView.Delegate
    /* renamed from: h */
    public void mo159553h() {
        Map<String, C45084c> c = this.f114179d.mo159441c();
        if (CollectionUtils.isNotEmpty(c)) {
            this.f114178c.mo159570c(CollectionsKt.toList(c.values()));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: e */
    public void mo159460e() {
        Map<String, C45084c> c = this.f114179d.mo159441c();
        ArrayList<String> arrayList = new ArrayList<>(c.size());
        for (T t : c.values()) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            C45085e g = t.mo159512g();
            Intrinsics.checkExpressionValueIsNotNull(g, "it.chatterInfo");
            arrayList.add(g.mo159522a());
        }
        this.f114178c.mo159569b(arrayList);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: d */
    public void mo159458d(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
        this.f114178c.mo159572k();
    }

    /* renamed from: a */
    private final void m178912a(boolean z) {
        for (C45084c cVar : this.f114179d.mo159433a().mo159516b()) {
            if (cVar instanceof C45082a) {
                C45082a aVar = (C45082a) cVar;
                if (!aVar.mo159504b()) {
                    aVar.mo159490a(z);
                    this.f114179d.mo159436a(cVar, aVar.mo159504b());
                }
            }
        }
        for (C45084c cVar2 : this.f114179d.mo159440b()) {
            if (cVar2 instanceof C45082a) {
                C45082a aVar2 = (C45082a) cVar2;
                if (!aVar2.mo159504b()) {
                    aVar2.mo159490a(z);
                    this.f114179d.mo159436a(cVar2, aVar2.mo159504b());
                }
            }
        }
        IGroupMemberBaseContract.AbstractC45066b bVar = this.f114121a;
        IGroupMemberBaseContract.AbstractC45065a aVar3 = this.f114122b;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "mModel");
        SelectBeansResult a = aVar3.mo159433a();
        IGroupMemberBaseContract.AbstractC45065a aVar4 = this.f114122b;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "mModel");
        List<C45084c> b = aVar4.mo159440b();
        IGroupMemberBaseContract.AbstractC45065a aVar5 = this.f114122b;
        Intrinsics.checkExpressionValueIsNotNull(aVar5, "mModel");
        bVar.mo159392a(a, b, aVar5.mo159441c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarPickMemberDelegate(ICalendarPickMemberContract.IView bVar, CalendarPickMemberModel eVar) {
        super(bVar, eVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(eVar, "model");
        this.f114178c = bVar;
        this.f114179d = eVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b
    /* renamed from: a */
    public void mo159452a(C45084c cVar, boolean z) {
        C45082a aVar;
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
        int size = this.f114179d.mo159441c().size();
        if (cVar instanceof C45082a) {
            aVar = (C45082a) cVar;
        } else {
            aVar = new C45082a(cVar);
        }
        if (!aVar.mo159491a()) {
            this.f114178c.mo159572k();
        } else if (z && size >= 29) {
            this.f114122b.mo159436a(cVar, z);
            m178912a(!z);
            IGroupMemberBaseContract.AbstractC45066b bVar = this.f114121a;
            IGroupMemberBaseContract.AbstractC45065a aVar2 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
            SelectBeansResult a = aVar2.mo159433a();
            IGroupMemberBaseContract.AbstractC45065a aVar3 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar3, "mModel");
            List<C45084c> b = aVar3.mo159440b();
            IGroupMemberBaseContract.AbstractC45065a aVar4 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar4, "mModel");
            bVar.mo159392a(a, b, aVar4.mo159441c());
        } else if (z || size < 30) {
            this.f114122b.mo159436a(cVar, z);
            IGroupMemberBaseContract.AbstractC45066b bVar2 = this.f114121a;
            IGroupMemberBaseContract.AbstractC45065a aVar5 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar5, "mModel");
            SelectBeansResult a2 = aVar5.mo159433a();
            IGroupMemberBaseContract.AbstractC45065a aVar6 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar6, "mModel");
            List<C45084c> b2 = aVar6.mo159440b();
            IGroupMemberBaseContract.AbstractC45065a aVar7 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar7, "mModel");
            bVar2.mo159392a(a2, b2, aVar7.mo159441c());
        } else {
            this.f114122b.mo159436a(cVar, z);
            m178912a(!z);
            IGroupMemberBaseContract.AbstractC45066b bVar3 = this.f114121a;
            IGroupMemberBaseContract.AbstractC45065a aVar8 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar8, "mModel");
            SelectBeansResult a3 = aVar8.mo159433a();
            IGroupMemberBaseContract.AbstractC45065a aVar9 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar9, "mModel");
            List<C45084c> b3 = aVar9.mo159440b();
            IGroupMemberBaseContract.AbstractC45065a aVar10 = this.f114122b;
            Intrinsics.checkExpressionValueIsNotNull(aVar10, "mModel");
            bVar3.mo159392a(a3, b3, aVar10.mo159441c());
        }
    }
}
