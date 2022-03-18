package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.RoundFrameLayout;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.AskOwnerPresenter;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPanel;", "Landroidx/fragment/app/DialogFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter$Dependency;", "()V", "from", "", "fromVC", "", "invitedUserList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "isWiki", "module", "", "ownerId", "ownerName", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter;", "publicPerm", "subType", "token", ShareHitPoint.f121869d, "userPerm", "close", "", "initData", "initMVP", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.c */
public final class AskOwnerPanel extends DialogInterface$OnCancelListenerC1021b implements AskOwnerPresenter.Dependency {

    /* renamed from: c */
    public static final Companion f26086c = new Companion(null);

    /* renamed from: d */
    private String f26087d;

    /* renamed from: e */
    private int f26088e;

    /* renamed from: f */
    private String f26089f;

    /* renamed from: g */
    private String f26090g;

    /* renamed from: h */
    private ArrayList<UserInfo> f26091h;

    /* renamed from: i */
    private int f26092i = 1;

    /* renamed from: j */
    private String f26093j;

    /* renamed from: k */
    private String f26094k = "";

    /* renamed from: l */
    private boolean f26095l;

    /* renamed from: m */
    private AskOwnerPresenter f26096m;

    /* renamed from: n */
    private HashMap f26097n;

    @JvmStatic
    /* renamed from: a */
    public static final void m40094a(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, ArrayList<UserInfo> arrayList, int i2, String str4, String str5, boolean z) {
        f26086c.mo36991a(fragmentActivity, str, i, str2, str3, arrayList, i2, str4, str5, z);
    }

    /* renamed from: g */
    public void mo36990g() {
        HashMap hashMap = this.f26097n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPanel$Companion;", "", "()V", "EXTRA_FROM", "", "EXTRA_INVITED_USER_LIST", "EXTRA_IS_WIKI", "EXTRA_MODULE", "EXTRA_OWNER_ID", "EXTRA_OWNER_NAME", "EXTRA_SUB_TYPE", "EXTRA_TOKEN", "EXTRA_TYPE", "FROM_CHAT_CARD", "", "FROM_INVITED_USER", "TAG", "showPanel", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "token", ShareHitPoint.f121869d, "ownerId", "ownerName", "invitedUserList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "from", "module", "subType", "isWiki", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo36991a(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, ArrayList<UserInfo> arrayList, int i2, String str4, String str5, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "ownerId");
            Intrinsics.checkParameterIsNotNull(str3, "ownerName");
            Intrinsics.checkParameterIsNotNull(arrayList, "invitedUserList");
            Intrinsics.checkParameterIsNotNull(str4, "module");
            Intrinsics.checkParameterIsNotNull(str5, "subType");
            Bundle bundle = new Bundle();
            bundle.putString("extra_token", str);
            bundle.putInt("extra_type", i);
            bundle.putString("extra_owner_id", str2);
            bundle.putString("extra_owner_name", str3);
            bundle.putSerializable("extra_invited_user_list", arrayList);
            bundle.putInt("extra_from", i2);
            bundle.putString("extra_module", str4);
            bundle.putString("extra_sub_type", str5);
            bundle.putBoolean("extra_is_wiki", z);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, AskOwnerPanel.class.getName(), bundle);
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), AskOwnerPanel.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.AskOwnerPresenter.Dependency
    /* renamed from: f */
    public void mo36989f() {
        mo5513b();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AskOwnerPresenter dVar = this.f26096m;
        if (dVar != null) {
            dVar.destroy();
        }
        mo36990g();
    }

    public AskOwnerPanel() {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        this.f26088e = aVar.mo32555b();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null && (window = v_.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            attributes.softInputMode = 16;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            window.setDimAmount(0.2f);
            window.setWindowAnimations(R.style.ActionSheetAnimation);
            window.setBackgroundDrawableResource(17170445);
            TypedValue typedValue = new TypedValue();
            getResources().getValue(R.dimen.spacekit_dialog_background_dim_amount, typedValue, true);
            window.setDimAmount(typedValue.getFloat());
        }
    }

    /* renamed from: h */
    private final void m40095h() {
        String str;
        int i;
        String str2;
        String str3;
        Serializable serializable;
        ArrayList<UserInfo> arrayList;
        int i2;
        String str4;
        String string;
        Bundle arguments = getArguments();
        String str5 = "";
        if (arguments == null || (str = arguments.getString("extra_token", str5)) == null) {
            str = str5;
        }
        this.f26087d = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("extra_type", this.f26088e);
        } else {
            i = this.f26088e;
        }
        this.f26088e = i;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("extra_owner_id", str5)) == null) {
            str2 = str5;
        }
        this.f26089f = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str3 = arguments4.getString("extra_owner_name", str5)) == null) {
            str3 = str5;
        }
        this.f26090g = str3;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            serializable = arguments5.getSerializable("extra_invited_user_list");
        } else {
            serializable = null;
        }
        if (serializable == null) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = (ArrayList) serializable;
        }
        this.f26091h = arrayList;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            i2 = arguments6.getInt("extra_from", this.f26092i);
        } else {
            i2 = this.f26092i;
        }
        this.f26092i = i2;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (str4 = arguments7.getString("extra_module", str5)) == null) {
            str4 = str5;
        }
        this.f26093j = str4;
        Bundle arguments8 = getArguments();
        if (!(arguments8 == null || (string = arguments8.getString("extra_sub_type", str5)) == null)) {
            str5 = string;
        }
        this.f26094k = str5;
        Bundle arguments9 = getArguments();
        boolean z = false;
        if (arguments9 != null) {
            z = arguments9.getBoolean("extra_is_wiki", false);
        }
        this.f26095l = z;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40095h();
    }

    /* renamed from: a */
    private final void m40093a(View view) {
        String str = this.f26087d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        int i = this.f26088e;
        ArrayList<UserInfo> arrayList = this.f26091h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitedUserList");
        }
        AskOwnerModel bVar = new AskOwnerModel(str, i, arrayList);
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        Dialog v_ = v_();
        String str2 = this.f26090g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerName");
        }
        String str3 = this.f26089f;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerId");
        }
        ArrayList<UserInfo> arrayList2 = this.f26091h;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitedUserList");
        }
        int i2 = this.f26092i;
        String str4 = this.f26087d;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        int i3 = this.f26088e;
        String str5 = this.f26093j;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        AskOwnerView eVar = new AskOwnerView(context, view, v_, str2, str3, arrayList2, i2, str4, i3, str5, this.f26094k, this.f26095l);
        Context context2 = getContext();
        if (context2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
        AskOwnerPanel cVar = this;
        String str6 = this.f26090g;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownerName");
        }
        String str7 = this.f26087d;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        int i4 = this.f26088e;
        String str8 = this.f26093j;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        int i5 = this.f26092i;
        ArrayList<UserInfo> arrayList3 = this.f26091h;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invitedUserList");
        }
        AskOwnerPresenter dVar = new AskOwnerPresenter(context2, bVar, eVar, cVar, str6, str7, i4, str8, i5, arrayList3, this.f26094k, this.f26095l);
        this.f26096m = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m40093a(view);
        IWatermarkManager aVar = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        String str = this.f26087d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        aVar.mo40649a(str, String.valueOf(this.f26088e));
        aVar.mo40646a((RoundFrameLayout) view.findViewById(R.id.content));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_ask_owner_panel_layout, viewGroup, false);
    }
}
