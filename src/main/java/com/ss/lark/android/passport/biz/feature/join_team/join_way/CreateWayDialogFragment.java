package com.ss.lark.android.passport.biz.feature.join_team.join_way;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.google.android.material.bottomsheet.C22184b;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.entity.MenuInfo;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.entity.RegisterItem;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "getUniContext", "()Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "setUniContext", "(Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;)V", "getTheme", "", "initView", "", "item", "Lcom/ss/lark/android/passport/biz/entity/RegisterItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "CreateWayAdapter", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a */
public final class CreateWayDialogFragment extends C22184b {

    /* renamed from: c */
    public static String f163415c;

    /* renamed from: d */
    public static final Companion f163416d = new Companion(null);

    /* renamed from: e */
    private UniContext f163417e;

    /* renamed from: f */
    private HashMap f163418f;

    @JvmStatic
    /* renamed from: a */
    public static final CreateWayDialogFragment m254540a(RegisterItem registerItem, UniContext uniContext, String str) {
        return f163416d.mo223708a(registerItem, uniContext, str);
    }

    /* renamed from: a */
    public View mo223704a(int i) {
        if (this.f163418f == null) {
            this.f163418f = new HashMap();
        }
        View view = (View) this.f163418f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f163418f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: e */
    public int mo5515e() {
        return R.style.TenantJoinWayDialogStyle;
    }

    /* renamed from: g */
    public void mo223707g() {
        HashMap hashMap = this.f163418f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo223707g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment$Companion;", "", "()V", "KEY_REGISTER_ITEM", "", "flowType", "getFlowType", "()Ljava/lang/String;", "setFlowType", "(Ljava/lang/String;)V", "newInstance", "Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment;", "item", "Lcom/ss/lark/android/passport/biz/entity/RegisterItem;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo223709a() {
            return CreateWayDialogFragment.f163415c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo223710a(String str) {
            CreateWayDialogFragment.f163415c = str;
        }

        @JvmStatic
        /* renamed from: a */
        public final CreateWayDialogFragment mo223708a(RegisterItem registerItem, UniContext uniContext, String str) {
            Intrinsics.checkParameterIsNotNull(registerItem, "item");
            Bundle bundle = new Bundle();
            bundle.putSerializable("REGISTER_ITEM", registerItem);
            CreateWayDialogFragment aVar = new CreateWayDialogFragment();
            aVar.mo223705a(uniContext);
            aVar.setArguments(bundle);
            mo223710a(str);
            return aVar;
        }
    }

    /* renamed from: f */
    public final UniContext mo223706f() {
        return this.f163417e;
    }

    /* renamed from: a */
    public final void mo223705a(UniContext uniContext) {
        this.f163417e = uniContext;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/infra/entity/MenuInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a$c */
    public static final class C64820c extends Lambda implements Function1<MenuInfo, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CreateWayDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64820c(CreateWayDialogFragment aVar, Context context) {
            super(1);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenuInfo menuInfo) {
            invoke(menuInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(MenuInfo menuInfo) {
            Intrinsics.checkParameterIsNotNull(menuInfo, "it");
            if (ButtonType.CREATE_PERSONAL == menuInfo.getButtonType()) {
                JoinTeamStatisticsHelper.m254574e(CreateWayDialogFragment.f163416d.mo223709a());
                PassportLog.f123351c.mo171474a().mo171460a("n_action_click_personal_use");
            } else if (ButtonType.CREATE_TENANT == menuInfo.getButtonType()) {
                JoinTeamStatisticsHelper.m254573d(CreateWayDialogFragment.f163416d.mo223709a());
                PassportLog.f123351c.mo171474a().mo171460a("n_action_click_input_team_code");
            }
            C49092f.m193529a(this.$context, menuInfo.next, RouterScene.ALL.value, this.this$0.mo223706f(), (PassportLog) null, (AbstractC49336a) null);
            this.this$0.u_();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B)\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment$CreateWayAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment$CreateWayAdapter$VH;", "Lcom/ss/android/lark/passport/infra/entity/MenuInfo;", "menus", "", "onItemClickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getIconRes", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/passport/signinsdk_api/contants/ButtonType;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "VH", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a$b */
    public static final class CreateWayAdapter extends LarkRecyclerViewBaseAdapter<VH, MenuInfo> {

        /* renamed from: a */
        public final Function1<MenuInfo, Unit> f163419a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a$b$b */
        public static final class View$OnClickListenerC64819b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CreateWayAdapter f163421a;

            /* renamed from: b */
            final /* synthetic */ MenuInfo f163422b;

            View$OnClickListenerC64819b(CreateWayAdapter bVar, MenuInfo menuInfo) {
                this.f163421a = bVar;
                this.f163422b = menuInfo;
            }

            public final void onClick(View view) {
                Function1<MenuInfo, Unit> function1 = this.f163421a.f163419a;
                MenuInfo menuInfo = this.f163422b;
                Intrinsics.checkExpressionValueIsNotNull(menuInfo, "item");
                function1.invoke(menuInfo);
            }
        }

        /* renamed from: a */
        private final int m254550a(ButtonType buttonType) {
            int i = C64831b.f163438a[buttonType.ordinal()];
            if (i == 1) {
                return R.drawable.ic_svg_personal;
            }
            if (i != 2) {
                return R.drawable.signin_sdk_btn_icon_placeholder;
            }
            return R.drawable.ic_svg_create_team;
        }

        /* access modifiers changed from: private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment$CreateWayAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/CreateWayDialogFragment$CreateWayAdapter;Landroid/view/View;)V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a$b$a */
        public final class VH extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ CreateWayAdapter f163420a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public VH(CreateWayAdapter bVar, View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "view");
                this.f163420a = bVar;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.ss.android.lark.passport.infra.entity.MenuInfo, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public CreateWayAdapter(List<? extends MenuInfo> list, Function1<? super MenuInfo, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onItemClickListener");
            this.f163419a = function1;
            if (list != null) {
                addAll(list);
            }
        }

        /* renamed from: a */
        public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.signin_sdk_item_create_way, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new VH(this, inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(VH aVar, int i) {
            boolean z;
            int i2;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            MenuInfo menuInfo = (MenuInfo) getItem(i);
            aVar.itemView.setOnClickListener(new View$OnClickListenerC64819b(this, menuInfo));
            View view = aVar.itemView;
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_title");
            textView.setText(menuInfo.text);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_title);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_title");
            TextView textView3 = textView2;
            String str = menuInfo.text;
            int i3 = 0;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView3.setVisibility(i2);
            TextView textView4 = (TextView) view.findViewById(R.id.tv_sub_title);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tv_sub_title");
            textView4.setText(menuInfo.desc);
            TextView textView5 = (TextView) view.findViewById(R.id.tv_sub_title);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tv_sub_title");
            TextView textView6 = textView5;
            String str2 = menuInfo.desc;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                i3 = 8;
            }
            textView6.setVisibility(i3);
            ComponentCallbacks2C2126g a = ComponentCallbacks2C2115c.m9141a((ImageView) view.findViewById(R.id.iv_icon));
            Intrinsics.checkExpressionValueIsNotNull(menuInfo, "item");
            ButtonType buttonType = menuInfo.getButtonType();
            Intrinsics.checkExpressionValueIsNotNull(buttonType, "item.buttonType");
            ((C2124f) a.mo10413a(Integer.valueOf(m254550a(buttonType))).mo11143c((int) R.drawable.signin_sdk_btn_icon_placeholder)).mo10399a((ImageView) view.findViewById(R.id.iv_icon));
        }
    }

    /* renamed from: a */
    private final void m254541a(RegisterItem registerItem) {
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            RecyclerView recyclerView = (RecyclerView) mo223704a(R.id.rv_create_way);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_create_way");
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            RecyclerView recyclerView2 = (RecyclerView) mo223704a(R.id.rv_create_way);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_create_way");
            recyclerView2.setAdapter(new CreateWayAdapter(registerItem.dispatchList, new C64820c(this, context)));
            TextView textView = (TextView) mo223704a(R.id.tv_dialog_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_dialog_title");
            textView.setText(registerItem.title);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("REGISTER_ITEM");
            if (!(serializable instanceof RegisterItem)) {
                serializable = null;
            }
            RegisterItem registerItem = (RegisterItem) serializable;
            if (registerItem != null) {
                m254541a(registerItem);
            } else {
                u_();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.signin_sdk_dialog_create_way, viewGroup, false);
    }
}
