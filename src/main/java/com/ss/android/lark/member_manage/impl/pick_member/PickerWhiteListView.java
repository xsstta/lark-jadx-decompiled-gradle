package com.ss.android.lark.member_manage.impl.pick_member;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.dto.SelectChatterDTO;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.pick_member.IPickWhiteListContract;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001-B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0014J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001fH\u0014J\u0018\u0010$\u001a\u00020\u000e2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u0016\u0010&\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110(H\u0016J\u001e\u0010)\u001a\u00020\u000e2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0011\u0018\u00010+H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006."}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView;", "Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView$Delegate;", "Lcom/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView$Dependency;", "Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView;", "activity", "Landroid/app/Activity;", "dependency", "(Landroid/app/Activity;Lcom/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView$Dependency;)V", "getActivity", "()Landroid/app/Activity;", "getDependency", "()Lcom/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView$Dependency;", "cancelSelect", "", "cancelList", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "closeForResult", "selectChatters", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "Lkotlin/collections/ArrayList;", "getFuncType", "", "initConfirmButton", "initTitle", "initView", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isKeepConfirm", "", "showMembers", "dataList", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "showSelected", "showSelectedMembers", "selectedList", "startSelected", "list", "", "updateSelectedRecyclerView", "selectedItems", "", "", "Dependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.pick_member.h */
public final class PickerWhiteListView extends BaseGroupMemberManageView<IPickWhiteListContract.IView.Delegate, Dependency> implements IPickWhiteListContract.IView {

    /* renamed from: j */
    private final Activity f114323j;

    /* renamed from: k */
    private final Dependency f114324k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView$Dependency;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageView$ViewDependency;", "closeForResult", "", "selectChatters", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "Lkotlin/collections/ArrayList;", "startSelected", "list", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.h$a */
    public interface Dependency extends BaseGroupMemberManageView.AbstractC45064a {
        /* renamed from: a */
        void mo159666a(ArrayList<SelectChatterDTO> arrayList);

        /* renamed from: b */
        void mo159667b(List<? extends C45084c> list);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    public boolean aX_() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return 6;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: j */
    public boolean mo159415j() {
        return true;
    }

    /* renamed from: k */
    private final void m179194k() {
        Button button = this.mConfirmBT;
        Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
        button.setVisibility(0);
        Button button2 = this.mConfirmBT;
        Intrinsics.checkExpressionValueIsNotNull(button2, "mConfirmBT");
        button2.setEnabled(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        int i;
        Chat chat = this.f114081f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "mCurrentChat");
        if (chat.isThread()) {
            i = R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_SelectMember_Title;
        } else {
            i = R.string.Lark_Legacy_TitleSelectMember;
        }
        this.mTitleBar.setTitle(UIHelper.getString(i));
        mo159387a(R.string.Lark_Legacy_ConfirmInfo, -1);
        this.mTitleBar.setLeftClickListener(new View$OnClickListenerC45154b(this));
        TextView textView = this.f114076a;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRightButtonView");
        textView.setVisibility(8);
        this.mSelectCountTV.setOnClickListener(new C45155c(this));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
        b_(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/pick_member/PickerWhiteListView$initTitle$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.h$c */
    public static final class C45155c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PickerWhiteListView f114326a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45155c(PickerWhiteListView hVar) {
            this.f114326a = hVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ((IPickWhiteListContract.IView.Delegate) this.f114326a.f114080e).mo159662g();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        this.f114081f = chat;
        mo159385a();
        m179194k();
    }

    @Override // com.ss.android.lark.member_manage.impl.pick_member.IPickWhiteListContract.IView
    public void a_(List<? extends C45084c> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f114324k.mo159667b(list);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "dataList");
        b_(dVar);
        a_(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.h$b */
    static final class View$OnClickListenerC45154b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PickerWhiteListView f114325a;

        View$OnClickListenerC45154b(PickerWhiteListView hVar) {
            this.f114325a = hVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f114325a.mo159414h());
            ((Dependency) this.f114325a.f114082g).mo159423a();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.pick_member.IPickWhiteListContract.IView
    /* renamed from: a */
    public void mo159659a(ArrayList<SelectChatterDTO> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectChatters");
        this.f114324k.mo159666a(arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
        mo159403b(map);
        Button button = this.mConfirmBT;
        Intrinsics.checkExpressionValueIsNotNull(button, "mConfirmBT");
        button.setEnabled(true);
    }

    @Override // com.ss.android.lark.member_manage.impl.pick_member.IPickWhiteListContract.IView
    /* renamed from: c */
    public void mo159570c(List<C45084c> list) {
        Intrinsics.checkParameterIsNotNull(list, "cancelList");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((IPickWhiteListContract.IView.Delegate) this.f114080e).mo159452a((C45084c) it.next(), false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickerWhiteListView(Activity activity, Dependency aVar) {
        super(activity, aVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f114323j = activity;
        this.f114324k = aVar;
    }
}
