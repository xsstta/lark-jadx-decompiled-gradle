package com.ss.android.lark.create.groupchat.impl.type.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a;
import com.ss.android.lark.create.groupchat.impl.select_member.NextStepClickListener;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.type.fragment.TypeSelectorFragmentView;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/GroupTypeSelectorFragment;", "Lcom/ss/android/lark/create/groupchat/impl/select_member/BaseGroupFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentPresenter;", "mView", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView;", "nextStepClickListener", "Lcom/ss/android/lark/create/groupchat/impl/select_member/NextStepClickListener;", "initMvp", "", "view", "Landroid/view/View;", "onBackPressed", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onTitleLeftClick", "onTitleRightClick", "onViewCreated", "Companion", "ViewDependency", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.b */
public final class GroupTypeSelectorFragment extends AbstractC36375a {

    /* renamed from: b */
    public static final Companion f93899b = new Companion(null);

    /* renamed from: a */
    public NextStepClickListener f93900a;

    /* renamed from: c */
    private TypeSelectorFragmentPresenter f93901c;

    /* renamed from: d */
    private TypeSelectorFragmentView f93902d;

    /* renamed from: e */
    private HashMap f93903e;

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a
    /* renamed from: b */
    public void mo134066b() {
    }

    /* renamed from: d */
    public void mo134237d() {
        HashMap hashMap = this.f93903e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo134237d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/GroupTypeSelectorFragment$Companion;", "", "()V", "KEY_GROUP_CREATE_INFO", "", "newInstance", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/GroupTypeSelectorFragment;", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "nextStepClickListener", "Lcom/ss/android/lark/create/groupchat/impl/select_member/NextStepClickListener;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final GroupTypeSelectorFragment mo134238a(GroupCreateInfo groupCreateInfo, NextStepClickListener iVar) {
            Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
            Intrinsics.checkParameterIsNotNull(iVar, "nextStepClickListener");
            GroupTypeSelectorFragment bVar = new GroupTypeSelectorFragment();
            bVar.f93900a = iVar;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_group_create_info", groupCreateInfo);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a
    /* renamed from: a */
    public void mo134065a() {
        GroupHitPoint.f93889a.mo134214e();
        mo134067c();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a
    /* renamed from: c */
    public boolean mo134067c() {
        TypeSelectorFragmentView fVar = this.f93902d;
        if (fVar == null) {
            return false;
        }
        fVar.mo134247a();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        TypeSelectorFragmentPresenter eVar = this.f93901c;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/GroupTypeSelectorFragment$ViewDependency;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentView$ViewDependency;", "(Lcom/ss/android/lark/create/groupchat/impl/type/fragment/GroupTypeSelectorFragment;)V", "finish", "", "goToNextPage", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "openThreadTabShowGuide", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.b$b */
    public final class ViewDependency implements TypeSelectorFragmentView.ViewDependency {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDependency() {
        }

        @Override // com.ss.android.lark.create.groupchat.impl.type.fragment.TypeSelectorFragmentView.ViewDependency
        /* renamed from: a */
        public void mo134239a(GroupCreateInfo groupCreateInfo) {
            Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
            NextStepClickListener iVar = GroupTypeSelectorFragment.this.f93900a;
            if (iVar != null) {
                iVar.mo134195a(groupCreateInfo);
            }
        }
    }

    /* renamed from: a */
    private final void m143509a(View view) {
        Serializable serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_group_create_info");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            TypeSelectorFragmentModel dVar = new TypeSelectorFragmentModel((GroupCreateInfo) serializable);
            TypeSelectorFragmentView fVar = new TypeSelectorFragmentView(getContext(), view, new ViewDependency());
            this.f93902d = fVar;
            if (fVar != null) {
                TypeSelectorFragmentPresenter eVar = new TypeSelectorFragmentPresenter(dVar, fVar);
                this.f93901c = eVar;
                if (eVar != null) {
                    eVar.create();
                }
                TypeSelectorFragmentPresenter eVar2 = this.f93901c;
                if (eVar2 != null) {
                    eVar2.mo134245b();
                    return;
                }
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.create.groupchat.dto.GroupCreateInfo");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m143509a(view);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_group_type_selector, viewGroup, false);
    }
}
