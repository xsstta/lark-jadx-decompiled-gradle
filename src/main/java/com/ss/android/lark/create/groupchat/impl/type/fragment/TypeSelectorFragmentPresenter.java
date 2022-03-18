package com.ss.android.lark.create.groupchat.impl.type.fragment;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.statistics.PublicGroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\f\u0010\b\u001a\u00060\tR\u00020\u0000H\u0014J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IModel;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IModel;Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView;)V", "createViewDelegate", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentPresenter$Delegate;", "initView", "", "Delegate", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.e */
public final class TypeSelectorFragmentPresenter extends BasePresenter<ITypeSelectorContract.IModel, ITypeSelectorContract.IView, ITypeSelectorContract.IView.Delegate> {

    /* renamed from: a */
    public final ITypeSelectorContract.IModel f93906a;

    /* renamed from: b */
    public final ITypeSelectorContract.IView f93907b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Delegate createViewDelegate() {
        return new Delegate();
    }

    /* renamed from: b */
    public final void mo134245b() {
        this.f93907b.mo134242a(this.f93906a.mo134240a().isPublic(), this.f93906a.mo134240a().isCrossTenant(), this.f93906a.mo134240a().isCrossWithKa(), this.f93906a.mo134240a().getHasMultiEntity(), this.f93906a.mo134240a().getMode());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentPresenter$Delegate;", "Lcom/ss/android/lark/create/groupchat/impl/type/fragment/ITypeSelectorContract$IView$Delegate;", "(Lcom/ss/android/lark/create/groupchat/impl/type/fragment/TypeSelectorFragmentPresenter;)V", "onCreateGroupGuideFinish", "", "onNeedShowCreateGroupGuide", "", "onNextStep", "isPublic", "chatMode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.e$a */
    public final class Delegate implements ITypeSelectorContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Override // com.ss.android.lark.create.groupchat.impl.type.fragment.ITypeSelectorContract.IView.Delegate
        /* renamed from: a */
        public void mo134243a(boolean z, CreateGroupMode createGroupMode) {
            String str;
            Intrinsics.checkParameterIsNotNull(createGroupMode, "chatMode");
            GroupCreateInfo a = TypeSelectorFragmentPresenter.this.f93906a.mo134240a();
            a.setPublic(z);
            a.setMode(createGroupMode);
            PublicGroupHitPoint.Companion aVar = PublicGroupHitPoint.f93891a;
            if (z) {
                str = "public";
            } else {
                str = "private";
            }
            aVar.mo134223a(str);
            TypeSelectorFragmentPresenter.this.f93907b.mo134241a(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeSelectorFragmentPresenter(ITypeSelectorContract.IModel aVar, ITypeSelectorContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f93906a = aVar;
        this.f93907b = bVar;
    }
}
