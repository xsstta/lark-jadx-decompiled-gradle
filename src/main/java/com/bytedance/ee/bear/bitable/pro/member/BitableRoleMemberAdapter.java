package com.bytedance.ee.bear.bitable.pro.member;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bitable.pro.Role;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nJ\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "role", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "avatarClickListener", "Lkotlin/Function1;", "", "removeCickListener", "(Lcom/bytedance/ee/bear/bitable/pro/Role;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "getAccount", "()Lcom/bytedance/ee/bear/contract/AccountService$Account;", "account$delegate", "Lkotlin/Lazy;", "getAvatarClickListener", "()Lkotlin/jvm/functions/Function1;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale$delegate", "getRemoveCickListener", "getRole", "()Lcom/bytedance/ee/bear/bitable/pro/Role;", "convert", "helper", "item", "getRemoveTextColor", "", "isDefault", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.a.a */
public final class BitableRoleMemberAdapter extends BaseQuickAdapter<UserInfo, C20923c> {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f14154a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableRoleMemberAdapter.class), "locale", "getLocale()Ljava/util/Locale;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableRoleMemberAdapter.class), "account", "getAccount()Lcom/bytedance/ee/bear/contract/AccountService$Account;"))};

    /* renamed from: b */
    private final Lazy f14155b = LazyKt.lazy(C4819d.INSTANCE);

    /* renamed from: c */
    private final Lazy f14156c = LazyKt.lazy(C4816a.INSTANCE);

    /* renamed from: d */
    private final Role f14157d;

    /* renamed from: e */
    private final Function1<UserInfo, Unit> f14158e;

    /* renamed from: f */
    private final Function1<UserInfo, Unit> f14159f;

    /* renamed from: d */
    private final Locale m19920d() {
        Lazy lazy = this.f14155b;
        KProperty kProperty = f14154a[0];
        return (Locale) lazy.getValue();
    }

    /* renamed from: e */
    private final AccountService.Account m19921e() {
        Lazy lazy = this.f14156c;
        KProperty kProperty = f14154a[1];
        return (AccountService.Account) lazy.getValue();
    }

    /* renamed from: a */
    public final Function1<UserInfo, Unit> mo18916a() {
        return this.f14158e;
    }

    public final Function1<UserInfo, Unit> k_() {
        return this.f14159f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.a$a */
    static final class C4816a extends Lambda implements Function0<AccountService.Account> {
        public static final C4816a INSTANCE = new C4816a();

        C4816a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountService.Account invoke() {
            return ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.a$d */
    static final class C4819d extends Lambda implements Function0<Locale> {
        public static final C4819d INSTANCE = new C4819d();

        C4819d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Locale invoke() {
            return C4484g.m18494b().mo17253d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberAdapter$convert$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.a$c */
    public static final class C4818c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberAdapter f14162a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f14163b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f14162a.k_().invoke(this.f14163b);
        }

        C4818c(BitableRoleMemberAdapter aVar, UserInfo userInfo) {
            this.f14162a = aVar;
            this.f14163b = userInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/member/BitableRoleMemberAdapter$convert$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a.a$b */
    public static final class C4817b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableRoleMemberAdapter f14160a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f14161b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f14161b.isUserType()) {
                this.f14160a.mo18916a().invoke(this.f14161b);
            }
        }

        C4817b(BitableRoleMemberAdapter aVar, UserInfo userInfo) {
            this.f14160a = aVar;
            this.f14161b = userInfo;
        }
    }

    /* renamed from: a */
    private final int m19919a(boolean z) {
        if (z) {
            Context context = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            return context.getResources().getColor(R.color.text_disable);
        }
        Context context2 = this.f51211q;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        return context2.getResources().getColor(R.color.text_title);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16806a(com.chad.library.adapter.base.C20923c r7, com.bytedance.ee.bear.share.export.UserInfo r8) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.pro.member.BitableRoleMemberAdapter.mo16806a(com.chad.library.adapter.base.c, com.bytedance.ee.bear.share.export.UserInfo):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.share.export.UserInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.share.export.UserInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableRoleMemberAdapter(Role role, Function1<? super UserInfo, Unit> function1, Function1<? super UserInfo, Unit> function12) {
        super(R.layout.bitable_pro_role_member_manage_item, role.getMembers());
        Intrinsics.checkParameterIsNotNull(role, "role");
        Intrinsics.checkParameterIsNotNull(function1, "avatarClickListener");
        Intrinsics.checkParameterIsNotNull(function12, "removeCickListener");
        this.f14157d = role;
        this.f14158e = function1;
        this.f14159f = function12;
    }
}
