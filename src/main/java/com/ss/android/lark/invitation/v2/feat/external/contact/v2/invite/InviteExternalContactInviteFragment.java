package com.ss.android.lark.invitation.v2.feat.external.contact.v2.invite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.invite.InviteExternalContactInviteItem;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55718b;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.widget.recyclerview.FpsRecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "baseItemAdapter", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItemAdapter;", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteItem;", "beans", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "update", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.a */
public final class InviteExternalContactInviteFragment extends C40098a {

    /* renamed from: c */
    public static final Companion f102242c = new Companion(null);

    /* renamed from: a */
    public List<? extends ContactMobileBean> f102243a;

    /* renamed from: b */
    public C55718b<InviteExternalContactInviteItem> f102244b = new C55718b<>();

    /* renamed from: d */
    private HashMap f102245d;

    /* renamed from: a */
    public View mo145968a(int i) {
        if (this.f102245d == null) {
            this.f102245d = new HashMap();
        }
        View view = (View) this.f102245d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102245d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo145969a() {
        HashMap hashMap = this.f102245d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo145969a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteFragment;", "beans", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteExternalContactInviteFragment mo145971a(List<? extends ContactMobileBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "beans");
            InviteExternalContactInviteFragment aVar = new InviteExternalContactInviteFragment();
            aVar.f102243a = list;
            return aVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ List m159492a(InviteExternalContactInviteFragment aVar) {
        List<? extends ContactMobileBean> list = aVar.f102243a;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beans");
        }
        return list;
    }

    /* renamed from: a */
    public final void mo145970a(List<? extends ContactMobileBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "beans");
        this.f102243a = list;
        this.f102244b.mo189862a(InviteExternalContactInviteItem.f102249e.mo145977a(list));
        this.f102244b.notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "localMessage", "Lcom/ss/android/lark/utils/UiMessageUtils$UiMessage;", "handleMessage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.a$b */
    static final class C40243b implements C57783ah.AbstractC57787c {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactInviteFragment f102246a;

        C40243b(InviteExternalContactInviteFragment aVar) {
            this.f102246a = aVar;
        }

        @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
        public final void handleMessage(C57783ah.C57786b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "localMessage");
            Object b = bVar.mo196098b();
            if (b != null) {
                String str = (String) b;
                Log.m165389i("InvitationModule", str);
                this.f102246a.f102244b.mo189862a(InviteExternalContactInviteItem.f102249e.mo145978a(InviteExternalContactInviteFragment.m159492a(this.f102246a), str));
                this.f102246a.f102244b.notifyDataSetChanged();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        C55718b<InviteExternalContactInviteItem> bVar = this.f102244b;
        InviteExternalContactInviteItem.Companion aVar = InviteExternalContactInviteItem.f102249e;
        List<? extends ContactMobileBean> list = this.f102243a;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beans");
        }
        bVar.mo189862a(aVar.mo145977a(list));
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo145968a(R.id.ieciRv);
        Intrinsics.checkExpressionValueIsNotNull(fpsRecyclerView, "ieciRv");
        fpsRecyclerView.setAdapter(this.f102244b);
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo145968a(R.id.ieciRv);
        Intrinsics.checkExpressionValueIsNotNull(fpsRecyclerView2, "ieciRv");
        fpsRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        C57783ah.m224245a().mo196092a(R.id.UiMessageExternalContactSearch, (C57783ah.AbstractC57787c) new C40243b(this));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_invite_external_contact_v2_invite_view, viewGroup, false);
    }
}
