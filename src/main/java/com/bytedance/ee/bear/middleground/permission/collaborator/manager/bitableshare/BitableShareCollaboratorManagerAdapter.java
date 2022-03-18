package com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9753a;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0014R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/BaseCollaboratorManageAdapter;", "avatarClickListener", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "", "permissionClickListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "getAccount", "()Lcom/bytedance/ee/bear/contract/AccountService$Account;", "account$delegate", "Lkotlin/Lazy;", "getAvatarClickListener", "()Lkotlin/jvm/functions/Function1;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale$delegate", "getPermissionClickListener", "bindCollaborator", "helper", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/BaseCollaboratorManageAdapter$ViewHolder;", "item", "bindOwner", "convert", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.a */
public final class BitableShareCollaboratorManagerAdapter extends AbstractC9753a {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26261a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableShareCollaboratorManagerAdapter.class), "locale", "getLocale()Ljava/util/Locale;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableShareCollaboratorManagerAdapter.class), "account", "getAccount()Lcom/bytedance/ee/bear/contract/AccountService$Account;"))};

    /* renamed from: b */
    private final Lazy f26262b = LazyKt.lazy(C9733e.INSTANCE);

    /* renamed from: c */
    private final Lazy f26263c = LazyKt.lazy(C9729a.INSTANCE);

    /* renamed from: d */
    private final Function1<UserInfo, Unit> f26264d;

    /* renamed from: e */
    private final Function1<UserInfo, Unit> f26265e;

    /* renamed from: e */
    private final Locale m40291e() {
        Lazy lazy = this.f26262b;
        KProperty kProperty = f26261a[0];
        return (Locale) lazy.getValue();
    }

    /* renamed from: s */
    private final AccountService.Account m40292s() {
        Lazy lazy = this.f26263c;
        KProperty kProperty = f26261a[1];
        return (AccountService.Account) lazy.getValue();
    }

    /* renamed from: a */
    public final Function1<UserInfo, Unit> mo18916a() {
        return this.f26264d;
    }

    /* renamed from: d */
    public final Function1<UserInfo, Unit> mo37152d() {
        return this.f26265e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.a$a */
    static final class C9729a extends Lambda implements Function0<AccountService.Account> {
        public static final C9729a INSTANCE = new C9729a();

        C9729a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountService.Account invoke() {
            return ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.a$e */
    static final class C9733e extends Lambda implements Function0<Locale> {
        public static final C9733e INSTANCE = new C9733e();

        C9733e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Locale invoke() {
            return C4484g.m18494b().mo17253d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter$bindCollaborator$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.a$c */
    public static final class C9731c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerAdapter f26268a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26269b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26268a.mo37152d().invoke(this.f26269b);
        }

        C9731c(BitableShareCollaboratorManagerAdapter aVar, UserInfo userInfo) {
            this.f26268a = aVar;
            this.f26269b = userInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter$bindOwner$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.a$d */
    public static final class C9732d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerAdapter f26270a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26271b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26270a.mo18916a().invoke(this.f26271b);
        }

        C9732d(BitableShareCollaboratorManagerAdapter aVar, UserInfo userInfo) {
            this.f26270a = aVar;
            this.f26271b = userInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter$bindCollaborator$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.a$b */
    public static final class C9730b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerAdapter f26266a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26267b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f26267b.isUserType()) {
                this.f26266a.mo18916a().invoke(this.f26267b);
            }
        }

        C9730b(BitableShareCollaboratorManagerAdapter aVar, UserInfo userInfo) {
            this.f26266a = aVar;
            this.f26267b = userInfo;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(AbstractC9753a.C9754a aVar, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "helper");
        Intrinsics.checkParameterIsNotNull(userInfo, "item");
        if (userInfo.isOwner()) {
            m40289b(aVar, userInfo);
        } else {
            m40290c(aVar, userInfo);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.share.export.UserInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.share.export.UserInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public BitableShareCollaboratorManagerAdapter(Function1<? super UserInfo, Unit> function1, Function1<? super UserInfo, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "avatarClickListener");
        Intrinsics.checkParameterIsNotNull(function12, "permissionClickListener");
        this.f26264d = function1;
        this.f26265e = function12;
    }

    /* renamed from: b */
    private final void m40289b(AbstractC9753a.C9754a aVar, UserInfo userInfo) {
        boolean z;
        boolean z2;
        UDAvatar uDAvatar = aVar.f26306a;
        Intrinsics.checkExpressionValueIsNotNull(uDAvatar, "helper.avatarView");
        AvatarLoadHelper.m39732a(uDAvatar, userInfo);
        aVar.f26306a.setOnClickListener(new C9732d(this, userInfo));
        CustomTitleView customTitleView = aVar.f26307b;
        Intrinsics.checkExpressionValueIsNotNull(customTitleView, "helper.nameView");
        customTitleView.setTitle(userInfo.getDisplayName(m40291e()));
        CustomTitleView customTitleView2 = aVar.f26307b;
        Intrinsics.checkExpressionValueIsNotNull(customTitleView2, "helper.nameView");
        boolean z3 = true;
        int i = 0;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(m40292s())) {
            z = false;
        } else {
            z = true;
        }
        customTitleView2.setExternalVisible(z);
        TextView textView = aVar.f26309d;
        Intrinsics.checkExpressionValueIsNotNull(textView, "helper.sourceView");
        textView.setVisibility(8);
        String displayLabel = userInfo.getDisplayLabel();
        if (displayLabel == null) {
            displayLabel = "";
        }
        if (displayLabel.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && userInfo.getOwnerType() == 2) {
            UDAvatar uDAvatar2 = aVar.f26306a;
            Intrinsics.checkExpressionValueIsNotNull(uDAvatar2, "helper.avatarView");
            displayLabel = uDAvatar2.getContext().getString(R.string.Doc_Facade_NoGroupDesc);
            Intrinsics.checkExpressionValueIsNotNull(displayLabel, "helper.avatarView.contex…g.Doc_Facade_NoGroupDesc)");
        }
        TextView textView2 = aVar.f26308c;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "helper.descView");
        String str = displayLabel;
        if (str.length() != 0) {
            z3 = false;
        }
        if (z3) {
            i = 8;
        }
        textView2.setVisibility(i);
        TextView textView3 = aVar.f26308c;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "helper.descView");
        textView3.setText(str);
        ImageView imageView = aVar.f26311f;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "helper.permissionIcon");
        imageView.setVisibility(8);
        aVar.f26310e.setText(R.string.Doc_Share_ShareOwner);
        TextView textView4 = aVar.f26310e;
        Context context = this.f51211q;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        textView4.setTextColor(context.getResources().getColor(R.color.text_caption));
        aVar.f26310e.setOnClickListener(null);
    }

    /* renamed from: c */
    private final void m40290c(AbstractC9753a.C9754a aVar, UserInfo userInfo) {
        boolean z;
        UDAvatar uDAvatar = aVar.f26306a;
        Intrinsics.checkExpressionValueIsNotNull(uDAvatar, "helper.avatarView");
        AvatarLoadHelper.m39732a(uDAvatar, userInfo);
        aVar.f26306a.setOnClickListener(new C9730b(this, userInfo));
        CustomTitleView customTitleView = aVar.f26307b;
        Intrinsics.checkExpressionValueIsNotNull(customTitleView, "helper.nameView");
        customTitleView.setTitle(userInfo.getDisplayName(m40291e()));
        CustomTitleView customTitleView2 = aVar.f26307b;
        Intrinsics.checkExpressionValueIsNotNull(customTitleView2, "helper.nameView");
        boolean z2 = true;
        int i = 0;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(m40292s())) {
            z = false;
        } else {
            z = true;
        }
        customTitleView2.setExternalVisible(z);
        TextView textView = aVar.f26309d;
        Intrinsics.checkExpressionValueIsNotNull(textView, "helper.sourceView");
        textView.setVisibility(8);
        String displayLabel = userInfo.getDisplayLabel();
        if (displayLabel == null) {
            displayLabel = "";
        }
        TextView textView2 = aVar.f26308c;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "helper.descView");
        String str = displayLabel;
        if (str.length() != 0) {
            z2 = false;
        }
        if (z2) {
            i = 8;
        }
        textView2.setVisibility(i);
        TextView textView3 = aVar.f26308c;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "helper.descView");
        textView3.setText(str);
        ImageView imageView = aVar.f26311f;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "helper.permissionIcon");
        imageView.setVisibility(8);
        aVar.f26310e.setText(R.string.Bitable_Form_Remove);
        TextView textView4 = aVar.f26310e;
        Context context = this.f51211q;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        textView4.setTextColor(context.getResources().getColor(R.color.text_title));
        aVar.f26310e.setOnClickListener(new C9731c(this, userInfo));
    }
}
