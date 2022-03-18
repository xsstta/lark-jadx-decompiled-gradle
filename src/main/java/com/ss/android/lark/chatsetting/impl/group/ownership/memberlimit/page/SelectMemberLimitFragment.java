package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.C1254b;
import androidx.recyclerview.widget.AbstractC1396o;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyMemberLimitPageState;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003!\"#B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001e\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/ViewCompanion;", "Lcom/larksuite/arch/jack/JackView;", "()V", "adapter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$SelectOptionAdapter;", "contentRV", "Landroidx/recyclerview/widget/RecyclerView;", "model", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "getModel", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "model$delegate", "Lkotlin/Lazy;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "initView", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "updateRV", "options", "", "", "selectedOption", "Option", "OptionItemHolder", "SelectOptionAdapter", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SelectMemberLimitFragment extends BaseFragment implements JackView, ViewCompanion {

    /* renamed from: a */
    private CommonTitleBar f89813a;

    /* renamed from: b */
    private RecyclerView f89814b;

    /* renamed from: c */
    private final Lazy f89815c;

    /* renamed from: d */
    private final SelectOptionAdapter f89816d = new SelectOptionAdapter();

    /* renamed from: e */
    private HashMap f89817e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$Option;", "", "value", "", "selected", "", "(IZ)V", "getSelected", "()Z", "getValue", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$a */
    public static final class Option {

        /* renamed from: a */
        public static final C1374g.AbstractC1378c<Option> f89818a = new C34776b();

        /* renamed from: b */
        public static final Companion f89819b = new Companion(null);

        /* renamed from: c */
        private final int f89820c;

        /* renamed from: d */
        private final boolean f89821d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option aVar = (Option) obj;
            return this.f89820c == aVar.f89820c && this.f89821d == aVar.f89821d;
        }

        public int hashCode() {
            int i = this.f89820c * 31;
            boolean z = this.f89821d;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public String toString() {
            return "Option(value=" + this.f89820c + ", selected=" + this.f89821d + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$Option$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$Option;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$a$a */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final C1374g.AbstractC1378c<Option> mo128370a() {
                return Option.f89818a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$Option$Companion$DIFF_CALLBACK$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$Option;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$a$b */
        public static final class C34776b extends C1374g.AbstractC1378c<Option> {
            C34776b() {
            }

            /* renamed from: a */
            public boolean areItemsTheSame(Option aVar, Option aVar2) {
                Intrinsics.checkParameterIsNotNull(aVar, "oldItem");
                Intrinsics.checkParameterIsNotNull(aVar2, "newItem");
                return Intrinsics.areEqual(aVar, aVar2);
            }

            /* renamed from: b */
            public boolean areContentsTheSame(Option aVar, Option aVar2) {
                Intrinsics.checkParameterIsNotNull(aVar, "oldItem");
                Intrinsics.checkParameterIsNotNull(aVar2, "newItem");
                return Intrinsics.areEqual(aVar, aVar2);
            }
        }

        /* renamed from: a */
        public final int mo128365a() {
            return this.f89820c;
        }

        /* renamed from: b */
        public final boolean mo128366b() {
            return this.f89821d;
        }

        public Option(int i, boolean z) {
            this.f89820c = i;
            this.f89821d = z;
        }
    }

    /* renamed from: c */
    public final ApplyGroupMemberLimitModel mo128363c() {
        return (ApplyGroupMemberLimitModel) this.f89815c.getValue();
    }

    /* renamed from: d */
    public void mo128364d() {
        HashMap hashMap = this.f89817e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo128364d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$OptionItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment;Landroid/view/View;)V", "count", "Landroid/widget/TextView;", "getCount", "()Landroid/widget/TextView;", "divider", "getDivider", "()Landroid/view/View;", "selectedIcon", "Landroid/widget/ImageView;", "getSelectedIcon", "()Landroid/widget/ImageView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$b */
    public final class OptionItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ SelectMemberLimitFragment f89822a;

        /* renamed from: b */
        private final TextView f89823b;

        /* renamed from: c */
        private final ImageView f89824c;

        /* renamed from: d */
        private final View f89825d;

        /* renamed from: a */
        public final TextView mo128373a() {
            return this.f89823b;
        }

        /* renamed from: b */
        public final ImageView mo128374b() {
            return this.f89824c;
        }

        /* renamed from: c */
        public final View mo128375c() {
            return this.f89825d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OptionItemHolder(SelectMemberLimitFragment selectMemberLimitFragment, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f89822a = selectMemberLimitFragment;
            View findViewById = view.findViewById(R.id.count_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.count_tv)");
            this.f89823b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.check_iv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.check_iv)");
            this.f89824c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.divider)");
            this.f89825d = findViewById3;
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    public Context ay_() {
        return ViewCompanion.C34764a.m135160a(this);
    }

    public SelectMemberLimitFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApplyGroupMemberLimitModel.class);
        this.f89815c = LazyKt.lazy(new SelectMemberLimitFragment$$special$$inlined$activityViewModel$1(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    /* renamed from: e */
    private final void m135190e() {
        CommonTitleBar commonTitleBar = this.f89813a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC34778d(this));
        ISubscriber.C24024a.m87814a(this, mo128363c(), C34785f.INSTANCE, C34786g.INSTANCE, (SubscriptionConfig) null, new C34779e(this), 4, (Object) null);
        RecyclerView recyclerView = this.f89814b;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRV");
        }
        recyclerView.setAdapter(this.f89816d);
        RecyclerView recyclerView2 = this.f89814b;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRV");
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f89814b;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRV");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView4 = this.f89814b;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentRV");
        }
        recyclerView4.setOverScrollMode(2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$e */
    public static final class C34779e extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ SelectMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34779e(SelectMemberLimitFragment selectMemberLimitFragment) {
            super(1);
            this.this$0 = selectMemberLimitFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            this.this$0.mo128362a(bVar.mo128326c(), bVar.mo128323a());
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    /* renamed from: b */
    public float mo128336b(int i) {
        return ViewCompanion.C34764a.m135161b(this, i);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m135190e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\n\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$SelectOptionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$Option;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$OptionItemHolder;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment;)V", "handleItemSelect", "", "index", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$c */
    public final class SelectOptionAdapter extends AbstractC1396o<Option, OptionItemHolder> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SelectOptionAdapter() {
            super(Option.f89819b.mo128370a());
        }

        /* renamed from: a */
        public final void mo128377a(int i) {
            SelectMemberLimitFragment.this.mo128363c().selectApplyOption(i);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/SelectMemberLimitFragment$SelectOptionAdapter$onBindViewHolder$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$c$a */
        public static final class View$OnClickListenerC34777a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SelectOptionAdapter f89827a;

            /* renamed from: b */
            final /* synthetic */ Option f89828b;

            /* renamed from: c */
            final /* synthetic */ int f89829c;

            View$OnClickListenerC34777a(SelectOptionAdapter cVar, Option aVar, int i) {
                this.f89827a = cVar;
                this.f89828b = aVar;
                this.f89829c = i;
            }

            public final void onClick(View view) {
                this.f89827a.mo128377a(this.f89829c);
                C1254b.m5698a(SelectMemberLimitFragment.this).mo6337b();
            }
        }

        /* renamed from: a */
        public OptionItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_group_limit_option, viewGroup, false);
            SelectMemberLimitFragment selectMemberLimitFragment = SelectMemberLimitFragment.this;
            Intrinsics.checkExpressionValueIsNotNull(inflate, "v");
            return new OptionItemHolder(selectMemberLimitFragment, inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(OptionItemHolder bVar, int i) {
            int i2;
            boolean z;
            Intrinsics.checkParameterIsNotNull(bVar, "holder");
            Option aVar = (Option) getItem(i);
            bVar.mo128373a().setText(String.valueOf(aVar.mo128365a()));
            ImageView b = bVar.mo128374b();
            int i3 = 8;
            if (aVar.mo128366b()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b.setVisibility(i2);
            View c = bVar.mo128375c();
            if (i != getItemCount() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3 = 0;
            }
            c.setVisibility(i3);
            bVar.itemView.setOnClickListener(new View$OnClickListenerC34777a(this, aVar, i));
            if (i == 0) {
                bVar.itemView.setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
            } else if (i == getItemCount() - 1) {
                bVar.itemView.setBackgroundResource(R.drawable.bg_setting_group_item_round_bottom);
            } else {
                bVar.itemView.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.SelectMemberLimitFragment$d */
    public static final class View$OnClickListenerC34778d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectMemberLimitFragment f89830a;

        View$OnClickListenerC34778d(SelectMemberLimitFragment selectMemberLimitFragment) {
            this.f89830a = selectMemberLimitFragment;
        }

        public final void onClick(View view) {
            C1254b.m5698a(this.f89830a).mo6337b();
        }
    }

    /* renamed from: a */
    public final void mo128362a(List<Integer> list, int i) {
        boolean z;
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (i == intValue) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new Option(intValue, z));
        }
        this.f89816d.submitList(arrayList);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_slecet_member_limit, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.titlebar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.titlebar)");
        this.f89813a = (CommonTitleBar) findViewById;
        View findViewById2 = inflate.findViewById(R.id.rv_options);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.rv_options)");
        this.f89814b = (RecyclerView) findViewById2;
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou….id.rv_options)\n        }");
        return inflate;
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }
}
