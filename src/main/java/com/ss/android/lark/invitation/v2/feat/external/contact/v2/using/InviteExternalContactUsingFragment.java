package com.ss.android.lark.invitation.v2.feat.external.contact.v2.using;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.ContactsMobileFeishuInfo;
import com.ss.android.lark.contact.entity.mobile.util.C35409a;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.using.InviteExternalContactUsingItem;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55718b;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.widget.recyclerview.FpsRecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010\u0019\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "baseItemAdapter", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItemAdapter;", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem;", "cpFeishuUsers", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;", "isCreated", "", "searchKey", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "update", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.a */
public final class InviteExternalContactUsingFragment extends C40098a {

    /* renamed from: d */
    public static final Companion f102264d = new Companion(null);

    /* renamed from: a */
    public List<ContactsMobileFeishuInfo.CpFeishuUsers> f102265a;

    /* renamed from: b */
    public C55718b<InviteExternalContactUsingItem> f102266b;

    /* renamed from: c */
    public String f102267c = "";

    /* renamed from: e */
    private boolean f102268e;

    /* renamed from: f */
    private HashMap f102269f;

    /* renamed from: a */
    public View mo145985a(int i) {
        if (this.f102269f == null) {
            this.f102269f = new HashMap();
        }
        View view = (View) this.f102269f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102269f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo145986a() {
        HashMap hashMap = this.f102269f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo145986a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingFragment;", "cpFeishuUsers", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteExternalContactUsingFragment mo145988a(List<ContactsMobileFeishuInfo.CpFeishuUsers> list) {
            Intrinsics.checkParameterIsNotNull(list, "cpFeishuUsers");
            InviteExternalContactUsingFragment aVar = new InviteExternalContactUsingFragment();
            aVar.f102265a = list;
            return aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.inv.export.ui.C40098a
    public void onDestroy() {
        super.onDestroy();
        C57783ah.m224245a().mo196094b(R.id.UiMessageExternalContactSearch);
        C57783ah.m224245a().mo196094b(R.id.UiMessageExternalContactUsingItem);
        C35409a.m138443a();
    }

    /* renamed from: a */
    public static final /* synthetic */ C55718b m159513a(InviteExternalContactUsingFragment aVar) {
        C55718b<InviteExternalContactUsingItem> bVar = aVar.f102266b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseItemAdapter");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ List m159514b(InviteExternalContactUsingFragment aVar) {
        List<ContactsMobileFeishuInfo.CpFeishuUsers> list = aVar.f102265a;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
        }
        return list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "localMessage", "Lcom/ss/android/lark/utils/UiMessageUtils$UiMessage;", "handleMessage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.a$b */
    static final class C40249b implements C57783ah.AbstractC57787c {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactUsingFragment f102270a;

        C40249b(InviteExternalContactUsingFragment aVar) {
            this.f102270a = aVar;
        }

        @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
        public final void handleMessage(C57783ah.C57786b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "localMessage");
            InviteExternalContactUsingFragment aVar = this.f102270a;
            Object b = bVar.mo196098b();
            if (b != null) {
                aVar.f102267c = (String) b;
                InviteExternalContactUsingFragment.m159513a(this.f102270a).mo189862a(InviteExternalContactUsingItem.f102272c.mo145989a(InviteExternalContactUsingFragment.m159514b(this.f102270a), this.f102270a.f102267c, this.f102270a));
                InviteExternalContactUsingFragment.m159513a(this.f102270a).notifyDataSetChanged();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "localMessage", "Lcom/ss/android/lark/utils/UiMessageUtils$UiMessage;", "handleMessage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.a$c */
    static final class C40250c implements C57783ah.AbstractC57787c {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactUsingFragment f102271a;

        C40250c(InviteExternalContactUsingFragment aVar) {
            this.f102271a = aVar;
        }

        @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
        public final void handleMessage(C57783ah.C57786b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "localMessage");
            Object b = bVar.mo196098b();
            if (!(b instanceof UserContactStatus)) {
                b = null;
            }
            UserContactStatus userContactStatus = (UserContactStatus) b;
            if (userContactStatus != null) {
                InviteExternalContactUsingItem.Companion aVar = InviteExternalContactUsingItem.f102272c;
                List<? extends AbstractC55713a<?>> a = InviteExternalContactUsingFragment.m159513a(this.f102271a).mo189857a();
                Intrinsics.checkExpressionValueIsNotNull(a, "baseItemAdapter.items");
                aVar.mo145990a(a, userContactStatus);
            }
        }
    }

    /* renamed from: a */
    public final void mo145987a(List<ContactsMobileFeishuInfo.CpFeishuUsers> list) {
        Intrinsics.checkParameterIsNotNull(list, "cpFeishuUsers");
        if (this.f102268e) {
            this.f102265a = list;
            C55718b<InviteExternalContactUsingItem> bVar = this.f102266b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseItemAdapter");
            }
            bVar.mo189862a(InviteExternalContactUsingItem.f102272c.mo145989a(list, this.f102267c, this));
            C55718b<InviteExternalContactUsingItem> bVar2 = this.f102266b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseItemAdapter");
            }
            bVar2.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        C55718b<InviteExternalContactUsingItem> bVar = new C55718b<>();
        this.f102266b = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseItemAdapter");
        }
        InviteExternalContactUsingItem.Companion aVar = InviteExternalContactUsingItem.f102272c;
        List<ContactsMobileFeishuInfo.CpFeishuUsers> list = this.f102265a;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
        }
        bVar.mo189862a(aVar.mo145989a(list, this.f102267c, this));
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo145985a(R.id.iecuRv);
        Intrinsics.checkExpressionValueIsNotNull(fpsRecyclerView, "iecuRv");
        C55718b<InviteExternalContactUsingItem> bVar2 = this.f102266b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseItemAdapter");
        }
        fpsRecyclerView.setAdapter(bVar2);
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo145985a(R.id.iecuRv);
        Intrinsics.checkExpressionValueIsNotNull(fpsRecyclerView2, "iecuRv");
        fpsRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        C35409a.m138444b();
        C57783ah.m224245a().mo196092a(R.id.UiMessageExternalContactSearch, (C57783ah.AbstractC57787c) new C40249b(this));
        C57783ah.m224245a().mo196092a(R.id.UiMessageExternalContactUsingItem, (C57783ah.AbstractC57787c) new C40250c(this));
        List<ContactsMobileFeishuInfo.CpFeishuUsers> list2 = this.f102265a;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
        }
        int i = 0;
        for (ContactsMobileFeishuInfo.CpFeishuUsers bVar3 : list2) {
            i += bVar3.mo130652b().size();
        }
        Pair[] pairArr = new Pair[2];
        List<ContactsMobileFeishuInfo.CpFeishuUsers> list3 = this.f102265a;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
        }
        pairArr[0] = Pair.create("availableCpCount", Integer.valueOf(list3.size()));
        pairArr[1] = Pair.create("availableUserCount", Integer.valueOf(i));
        InvApmUtils.m158966a("contact_opt_contact_list_timing_ms", null, C40108g.m159014a(pairArr), null, 10, null);
        this.f102268e = true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_invite_external_contact_v2_using_view, viewGroup, false);
    }
}
