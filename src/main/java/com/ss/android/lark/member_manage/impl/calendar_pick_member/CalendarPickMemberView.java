package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00015B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J \u0010\u0018\u001a\u00020\u00142\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u0014H\u0014J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020%H\u0014J \u0010,\u001a\u00020\u00142\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u001aj\b\u0012\u0004\u0012\u00020\u0017`\u001cH\u0016J\u0018\u0010,\u001a\u00020\u00142\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0016J\b\u0010.\u001a\u00020\u0014H\u0016J\u0016\u0010/\u001a\u00020\u00142\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001701H\u0016J\u001c\u00102\u001a\u00020\u00142\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001704H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u00066"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView$Delegate;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView;", "activity", "Landroid/app/Activity;", "dependency", "(Landroid/app/Activity;Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;)V", "getActivity", "()Landroid/app/Activity;", "getDependency", "()Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getMChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setMChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "cancelSelect", "", "cancelList", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "closeForResult", "selectChatterIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "create", "destroy", "getFuncType", "", "initTitle", "initView", "chat", "isKeepConfirm", "", "setViewDelegate", "viewDelegate", "showMembers", "dataList", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "showSelected", "showSelectedMembers", "selectedList", "showSelectedPeopleLimitToast", "startSelected", "list", "", "updateSelectedRecyclerView", "selectedItems", "", "Dependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.g */
public final class CalendarPickMemberView extends BaseGroupMemberManageView<ICalendarPickMemberContract.IView.Delegate, Dependency> implements ICalendarPickMemberContract.IView {

    /* renamed from: j */
    public Chat f114200j;

    /* renamed from: k */
    private final Activity f114201k;

    /* renamed from: l */
    private final Dependency f114202l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView$ViewDependency;", "closeForResult", "", "selectChatterIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "startSelected", "list", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.g$a */
    public interface Dependency extends BaseGroupMemberManageView.AbstractC45064a {
        /* renamed from: a */
        void mo159555a(ArrayList<String> arrayList);

        /* renamed from: b */
        void mo159556b(List<? extends C45084c> list);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    public boolean aX_() {
        return false;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return 8;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: j */
    public boolean mo159415j() {
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView
    /* renamed from: k */
    public void mo159572k() {
        LKUIToast.show(mo159414h(), UIHelper.getString(R.string.Calendar_ChatFindTime_Max));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        Button button = this.mConfirmBT;
        Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
        button.setVisibility(0);
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Calendar_ChatFindTime_ChooseMember));
        mo159387a(R.string.Lark_Legacy_ConfirmInfo, -1);
        this.mTitleBar.setLeftClickListener(new View$OnClickListenerC45096b(this));
        TextView textView = this.f114076a;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRightButtonView");
        textView.setVisibility(8);
        this.mSelectCountTV.setOnClickListener(new C45097c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$initTitle$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.g$c */
    public static final class C45097c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarPickMemberView f114204a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45097c(CalendarPickMemberView gVar) {
            this.f114204a = gVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ((ICalendarPickMemberContract.IView.Delegate) this.f114204a.f114080e).mo159553h();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f114200j = chat;
        mo159385a();
        mo159411e();
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView
    /* renamed from: b */
    public void mo159569b(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectChatterIds");
        this.f114202l.mo159555a(arrayList);
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView
    /* renamed from: c */
    public void mo159570c(List<? extends C45084c> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f114202l.mo159556b(list);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "dataList");
        b_(dVar);
        a_(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.g$b */
    static final class View$OnClickListenerC45096b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarPickMemberView f114203a;

        View$OnClickListenerC45096b(CalendarPickMemberView gVar) {
            this.f114203a = gVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f114203a.mo159414h());
            ((Dependency) this.f114203a.f114082g).mo159423a();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ICalendarPickMemberContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f114080e = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView
    /* renamed from: a */
    public void mo159568a(ArrayList<C45084c> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "dataList");
        b_(arrayList);
        ICalendarPickMemberContract.IView.Delegate aVar = (ICalendarPickMemberContract.IView.Delegate) this.f114080e;
        if (aVar != null) {
            aVar.mo159552g();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract.IView
    /* renamed from: d */
    public void mo159571d(List<C45084c> list) {
        Intrinsics.checkParameterIsNotNull(list, "cancelList");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ICalendarPickMemberContract.IView.Delegate) this.f114080e).mo159452a((C45084c) it.next(), false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
        Intrinsics.checkParameterIsNotNull(map, "selectedItems");
        mo159403b(map);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarPickMemberView(Activity activity, Dependency aVar) {
        super(activity, aVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f114201k = activity;
        this.f114202l = aVar;
    }
}
