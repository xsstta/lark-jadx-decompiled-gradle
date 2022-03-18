package com.ss.android.lark.contact.impl.contacts_group.groupframe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.IContactsGroupController;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f;
import com.ss.android.lark.contact.impl.contacts_group.manage.C35627b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0001H\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010 \u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010&\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/groupframe/ContactsGroupOwnerFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/biz/core/api/IContactsGroupController;", "()V", "groupItemOperationHandler", "Lcom/ss/android/lark/contact/impl/contacts_group/IGroupItemOperationListener;", "inited", "", "isMultiSelectMode", "operationListener", "Lcom/ss/android/lark/biz/core/api/IContactsGroupController$IOnOperationListener;", "pickType", "Lcom/ss/android/lark/biz/core/api/PickType;", "selectedChatIds", "", "", "subFragment", "Lcom/ss/android/lark/contact/impl/contacts_group/manage/MyManageGroupFragment;", "asFragment", "init", "multiSelectMode", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setContainedChatId", "chaIds", "", "setGroupOperationListener", "listener", "setPickType", "setSelectChatIds", "setupContent", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_group.a.a */
public final class ContactsGroupOwnerFragment extends BaseFragment implements IContactsGroupController {

    /* renamed from: a */
    public IContactsGroupController.IOnOperationListener f92066a;

    /* renamed from: b */
    public C35627b f92067b;

    /* renamed from: c */
    private PickType f92068c = new PickType();

    /* renamed from: d */
    private boolean f92069d;

    /* renamed from: e */
    private List<String> f92070e = new ArrayList();

    /* renamed from: f */
    private boolean f92071f;

    /* renamed from: g */
    private final AbstractC35602f f92072g = new C35591a(this);

    /* renamed from: h */
    private HashMap f92073h;

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public BaseFragment mo105763a() {
        return this;
    }

    /* renamed from: b */
    public void mo131266b() {
        HashMap hashMap = this.f92073h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo131266b();
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public void mo105766a(IContactsGroupController.IOnOperationListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f92066a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a.a$b */
    public static final class View$OnClickListenerC35592b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContactsGroupOwnerFragment f92075a;

        View$OnClickListenerC35592b(ContactsGroupOwnerFragment aVar) {
            this.f92075a = aVar;
        }

        public final void onClick(View view) {
            IContactsGroupController.IOnOperationListener aVar = this.f92075a.f92066a;
            if (aVar != null) {
                aVar.mo102993a();
            }
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: b */
    public void mo105768b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "chaIds");
        if (this.f92067b != null) {
            C35627b bVar = this.f92067b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subFragment");
            }
            bVar.mo131313b(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public void mo105765a(PickType pickType) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        this.f92068c = pickType;
        if (this.f92067b != null) {
            C35627b bVar = this.f92067b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subFragment");
            }
            bVar.mo131309a(pickType);
        }
    }

    /* renamed from: a */
    private final void m139361a(View view) {
        C35627b bVar = new C35627b();
        bVar.mo131312a(this.f92069d, this.f92070e, this.f92068c);
        bVar.mo131310a(this.f92072g);
        this.f92067b = bVar;
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        C35627b bVar2 = this.f92067b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subFragment");
        }
        C35627b bVar3 = bVar2;
        C35627b bVar4 = this.f92067b;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subFragment");
        }
        beginTransaction.replace(R.id.contact_sub_content, bVar3, bVar4.getClass().getSimpleName()).commitNowAllowingStateLoss();
        ((TextView) view.findViewById(R.id.tv_contacts)).setOnClickListener(new View$OnClickListenerC35592b(this));
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public void mo105767a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "chaIds");
        if (this.f92067b != null) {
            C35627b bVar = this.f92067b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subFragment");
            }
            bVar.mo131311a(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m139361a(view);
    }

    @Override // com.ss.android.lark.biz.core.api.IContactsGroupController
    /* renamed from: a */
    public IContactsGroupController mo105764a(boolean z, PickType pickType) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        if (this.f92071f) {
            return this;
        }
        this.f92071f = true;
        this.f92069d = z;
        this.f92068c = pickType;
        return this;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.contacts_owner_group, viewGroup, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "selected", "position", "", "onItemSelected"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a.a$a */
    static final class C35591a implements AbstractC35602f {

        /* renamed from: a */
        final /* synthetic */ ContactsGroupOwnerFragment f92074a;

        C35591a(ContactsGroupOwnerFragment aVar) {
            this.f92074a = aVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f
        public final boolean onItemSelected(Chat chat, boolean z, int i) {
            IContactsGroupController.IOnOperationListener aVar = this.f92074a.f92066a;
            if (aVar == null) {
                return true;
            }
            if (chat == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (!aVar.mo102994a(chat, z, i)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
