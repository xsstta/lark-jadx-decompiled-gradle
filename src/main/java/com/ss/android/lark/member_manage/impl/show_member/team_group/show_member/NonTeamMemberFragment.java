package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.MemberShowView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002*\u0001\r\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0013H\u0016J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010(\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130*H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006,"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/NonTeamMemberFragment;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mItemClickListener", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "getMItemClickListener", "()Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "setMItemClickListener", "(Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;)V", "mPresenter", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter;", "mViewDependency", "com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/NonTeamMemberFragment$mViewDependency$1", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/NonTeamMemberFragment$mViewDependency$1;", "asFragment", "changeItemSelectedStatus", "", "itemId", "", "isSelected", "", "changeSelectableStatus", "isSelectable", "getName", "", "loadFirstPageMembers", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSearch", "key", "onViewCreated", "view", "removeItems", "itemList", "", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.f */
public final class NonTeamMemberFragment extends BaseFragment implements IBaseFragment {

    /* renamed from: a */
    public static final Companion f114579a = new Companion(null);

    /* renamed from: b */
    private MemberShowPresenter f114580b;

    /* renamed from: c */
    private IBaseFragment.ItemClickListener f114581c;

    /* renamed from: d */
    private final C45268b f114582d = new C45268b(this);

    /* renamed from: e */
    private HashMap f114583e;

    /* renamed from: a */
    public View mo159925a(int i) {
        if (this.f114583e == null) {
            this.f114583e = new HashMap();
        }
        View view = (View) this.f114583e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f114583e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: a */
    public BaseFragment mo159813a() {
        return this;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: b */
    public int mo159818b() {
        return R.string.Lark_Group_OutsideDepartmentMember;
    }

    /* renamed from: d */
    public void mo159927d() {
        HashMap hashMap = this.f114583e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/NonTeamMemberFragment$Companion;", "", "()V", "KEY_PARAM_CHAT", "", "newInstance", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/NonTeamMemberFragment;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemClickListener", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NonTeamMemberFragment mo159928a(Chat chat, IBaseFragment.ItemClickListener itemClickListener) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(itemClickListener, "itemClickListener");
            NonTeamMemberFragment fVar = new NonTeamMemberFragment();
            fVar.mo159926a(itemClickListener);
            Bundle bundle = new Bundle();
            bundle.putSerializable("param_chat", chat);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: c */
    public void mo159819c() {
        MemberShowPresenter dVar = this.f114580b;
        if (dVar != null) {
            dVar.mo159913a();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        MemberShowPresenter dVar = this.f114580b;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
        mo159927d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/NonTeamMemberFragment$mViewDependency$1", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$ViewDependency;", "goToUserProfile", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatId", "", "chatName", "startAppProfileByBotId", BottomDialog.f17198f, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.f$b */
    public static final class C45268b implements MemberShowView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ NonTeamMemberFragment f114584a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45268b(NonTeamMemberFragment fVar) {
            this.f114584a = fVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.MemberShowView.ViewDependency
        /* renamed from: a */
        public void mo159889a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            GroupMemberManageModule.m177902a().startAppProfileByBotId(this.f114584a.mContext, str);
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.MemberShowView.ViewDependency
        /* renamed from: a */
        public void mo159888a(Chatter chatter, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(chatter, "chatter");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "chatName");
            GroupMemberManageModule.m177902a().startContactsProfileActivityFromChatContact(this.f114584a.mContext, chatter, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo159926a(IBaseFragment.ItemClickListener itemClickListener) {
        this.f114581c = itemClickListener;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: a */
    public void mo159814a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        MemberShowPresenter dVar = this.f114580b;
        if (dVar != null) {
            dVar.mo159914a(str);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: a */
    public void mo159816a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        MemberShowPresenter dVar = this.f114580b;
        if (dVar != null) {
            dVar.mo159916a(list);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: a */
    public void mo159817a(boolean z) {
        MemberShowPresenter dVar = this.f114580b;
        if (dVar != null) {
            dVar.mo159917a(z);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment
    /* renamed from: a */
    public void mo159815a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "itemId");
        MemberShowPresenter dVar = this.f114580b;
        if (dVar != null) {
            dVar.mo159915a(str, z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Chat chat = null;
        if (arguments != null) {
            obj = arguments.get("param_chat");
        } else {
            obj = null;
        }
        if (obj instanceof Chat) {
            chat = obj;
        }
        Chat chat2 = chat;
        if (chat2 != null) {
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            RelativeLayout relativeLayout = (RelativeLayout) mo159925a(R.id.mRootLayout);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootLayout");
            RelativeLayout relativeLayout2 = relativeLayout;
            C45268b bVar = this.f114582d;
            NonTeamMemberFragment$onViewCreated$1 nonTeamMemberFragment$onViewCreated$1 = this.f114581c;
            if (nonTeamMemberFragment$onViewCreated$1 == null) {
                nonTeamMemberFragment$onViewCreated$1 = new NonTeamMemberFragment$onViewCreated$1();
            }
            MemberShowPresenter dVar = new MemberShowPresenter(context, relativeLayout2, chat2, 2, bVar, true, nonTeamMemberFragment$onViewCreated$1);
            this.f114580b = dVar;
            if (dVar != null) {
                dVar.create();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_all_member, viewGroup, false);
    }
}
