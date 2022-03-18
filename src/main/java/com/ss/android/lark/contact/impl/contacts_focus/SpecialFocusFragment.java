package com.ss.android.lark.contact.impl.contacts_focus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.contact.v1.PushFocusChatter;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0006\u001f !\"#$B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006%"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "specialFocusAdapter", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter;", "getSpecialFocusAdapter", "()Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter;", "specialFocusAdapter$delegate", "Lkotlin/Lazy;", "generateFollowedChatterList", "", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusChatter;", "pushFocusChatter", "Lcom/bytedance/lark/pb/contact/v1/PushFocusChatter;", "initView", "", "loadSpecialFocusList", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onFollowedChatterListChange", "onViewCreated", "view", "registerPush", "Companion", "FocusChatter", "FocusItemDecoration", "IFocusChatterPushListener", "SpecialFocusAdapter", "SpecialFocusViewHolder", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a */
public final class SpecialFocusFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f92021a = new Companion(null);

    /* renamed from: b */
    private final Lazy f92022b = LazyKt.lazy(new C35582i(this));

    /* renamed from: c */
    private HashMap f92023c;

    /* renamed from: a */
    public View mo131211a(int i) {
        if (this.f92023c == null) {
            this.f92023c = new HashMap();
        }
        View view = (View) this.f92023c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f92023c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final SpecialFocusAdapter mo131212a() {
        return (SpecialFocusAdapter) this.f92022b.getValue();
    }

    /* renamed from: b */
    public void mo131215b() {
        HashMap hashMap = this.f92023c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo131215b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusChatter;", "", BottomDialog.f17198f, "", "avatarKey", "chatterName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "getChatterId", "getChatterName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$b */
    public static final class FocusChatter {

        /* renamed from: a */
        private final String f92024a;

        /* renamed from: b */
        private final String f92025b;

        /* renamed from: c */
        private final String f92026c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FocusChatter)) {
                return false;
            }
            FocusChatter bVar = (FocusChatter) obj;
            return Intrinsics.areEqual(this.f92024a, bVar.f92024a) && Intrinsics.areEqual(this.f92025b, bVar.f92025b) && Intrinsics.areEqual(this.f92026c, bVar.f92026c);
        }

        public int hashCode() {
            String str = this.f92024a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f92025b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f92026c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "FocusChatter(chatterId=" + this.f92024a + ", avatarKey=" + this.f92025b + ", chatterName=" + this.f92026c + ")";
        }

        /* renamed from: a */
        public final String mo131216a() {
            return this.f92024a;
        }

        /* renamed from: b */
        public final String mo131217b() {
            return this.f92025b;
        }

        /* renamed from: c */
        public final String mo131218c() {
            return this.f92026c;
        }

        public FocusChatter(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
            Intrinsics.checkParameterIsNotNull(str3, "chatterName");
            this.f92024a = str;
            this.f92025b = str2;
            this.f92026c = str3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusViewHolder;", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusChatter;", "focusDependency", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter$IFocusDependency;", "(Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter$IFocusDependency;)V", "avatarSize", "", "getFocusDependency", "()Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter$IFocusDependency;", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "IFocusDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$d */
    public static final class SpecialFocusAdapter extends LarkRecyclerViewBaseAdapter<SpecialFocusViewHolder, FocusChatter> {

        /* renamed from: a */
        private final int f92030a = UIHelper.dp2px(48.0f);

        /* renamed from: b */
        private final IFocusDependency f92031b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter$IFocusDependency;", "", "onFocusPersonClick", "", BottomDialog.f17198f, "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$d$a */
        public interface IFocusDependency {
            /* renamed from: a */
            void mo131225a(String str);
        }

        /* renamed from: a */
        public final IFocusDependency mo131222a() {
            return this.f92031b;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter$onBindViewHolder$3$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$d$b */
        public static final class View$OnClickListenerC35578b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SpecialFocusAdapter f92032a;

            /* renamed from: b */
            final /* synthetic */ FocusChatter f92033b;

            View$OnClickListenerC35578b(SpecialFocusAdapter dVar, FocusChatter bVar) {
                this.f92032a = dVar;
                this.f92033b = bVar;
            }

            public final void onClick(View view) {
                ContactHitPoint.f92900a.mo132201d(this.f92032a.items.size());
                this.f92032a.mo131222a().mo131225a(this.f92033b.mo131216a());
            }
        }

        public SpecialFocusAdapter(IFocusDependency aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "focusDependency");
            this.f92031b = aVar;
        }

        /* renamed from: a */
        public SpecialFocusViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_special_focus, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            return new SpecialFocusViewHolder(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(SpecialFocusViewHolder eVar, int i) {
            boolean z;
            FocusChatter bVar;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(eVar, "holder");
            FocusChatter bVar2 = (FocusChatter) getItem(i);
            String b = bVar2.mo131217b();
            boolean z3 = false;
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String a = bVar2.mo131216a();
                if (a == null || a.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = true;
                }
            }
            if (z3) {
                bVar = bVar2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                View view = eVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                IRequestCreator with = ImageLoader.with(view.getContext());
                String b2 = bVar.mo131217b();
                String a2 = bVar.mo131216a();
                int i2 = this.f92030a;
                IRequestCreator load = with.load(AvatarImage.Builder.obtain(b2, a2, i2, i2).build());
                View view2 = eVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                load.into((LKUIRoundedImageView2) view2.findViewById(R.id.focus_avatar));
            }
            View view3 = eVar.itemView;
            TextView textView = (TextView) view3.findViewById(R.id.focus_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "focus_name");
            textView.setText(bVar2.mo131218c());
            view3.setOnClickListener(new View$OnClickListenerC35578b(this, bVar2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$i */
    static final class C35582i extends Lambda implements Function0<SpecialFocusAdapter> {
        final /* synthetic */ SpecialFocusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35582i(SpecialFocusFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpecialFocusAdapter invoke() {
            return new SpecialFocusAdapter(new SpecialFocusAdapter.IFocusDependency(this) {
                /* class com.ss.android.lark.contact.impl.contacts_focus.SpecialFocusFragment.C35582i.C355831 */

                /* renamed from: a */
                final /* synthetic */ C35582i f92037a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92037a = r1;
                }

                @Override // com.ss.android.lark.contact.impl.contacts_focus.SpecialFocusFragment.SpecialFocusAdapter.IFocusDependency
                /* renamed from: a */
                public void mo131225a(String str) {
                    Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                    AbstractC35361b a = C35358a.m138143a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
                    a.mo130168m().mo130242a(this.f92037a.this$0.requireActivity(), str);
                }
            });
        }
    }

    /* renamed from: e */
    private final void m139301e() {
        SpecialFocusModel.f92038a.mo131234a(new C35581h(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        SpecialFocusModel.f92038a.mo131232a();
        super.onDestroy();
    }

    /* renamed from: c */
    private final void m139299c() {
        SpecialFocusModel bVar = SpecialFocusModel.f92038a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C35579f(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…             }\n        })");
        bVar.mo131233a(wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "dividerHeight", "", "dividerMarginStart", "paint", "Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$c */
    public static final class FocusItemDecoration extends RecyclerView.AbstractC1335d {

        /* renamed from: a */
        private final Paint f92027a;

        /* renamed from: b */
        private final int f92028b = UIHelper.dp2px(60.0f);

        /* renamed from: c */
        private final int f92029c = UIHelper.dp2px(0.5f);

        public FocusItemDecoration() {
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f92027a = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            canvas.save();
            Paint paint = this.f92027a;
            Context context = recyclerView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            paint.setColor(UDColorUtils.getColor(context, R.color.line_divider_default));
            int childCount = recyclerView.getChildCount();
            float paddingStart = (float) (recyclerView.getPaddingStart() + this.f92028b);
            float width = (float) recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "childView");
                canvas.drawLine(paddingStart, (float) childAt.getBottom(), width, (float) (childAt.getBottom() + this.f92029c), this.f92027a);
            }
            canvas.restore();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = this.f92029c;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$g */
    public static final class RunnableC35580g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpecialFocusFragment f92035a;

        /* renamed from: b */
        final /* synthetic */ PushFocusChatter f92036b;

        RunnableC35580g(SpecialFocusFragment aVar, PushFocusChatter pushFocusChatter) {
            this.f92035a = aVar;
            this.f92036b = pushFocusChatter;
        }

        public final void run() {
            List<FocusChatter> b = this.f92035a.mo131214b(this.f92036b);
            UIUtils.display((UDEmptyState) this.f92035a.mo131211a(R.id.udes_focus), b.isEmpty());
            this.f92035a.mo131212a().diff(b);
        }
    }

    /* renamed from: d */
    private final void m139300d() {
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) mo131211a(R.id.rv_focus);
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        commonRecyclerView.setAdapter(mo131212a());
        commonRecyclerView.addItemDecoration(new FocusItemDecoration());
        commonRecyclerView.setItemAnimator(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$loadSpecialFocusList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusChatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "focusChatters", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$f */
    public static final class C35579f implements IGetDataCallback<List<? extends FocusChatter>> {

        /* renamed from: a */
        final /* synthetic */ SpecialFocusFragment f92034a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35579f(SpecialFocusFragment aVar) {
            this.f92034a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("SpecialFocusFragment", errorResult.getDisplayMsg());
        }

        /* renamed from: a */
        public void onSuccess(List<FocusChatter> list) {
            if (list != null) {
                UIUtils.display((UDEmptyState) this.f92034a.mo131211a(R.id.udes_focus), list.isEmpty());
                this.f92034a.mo131212a().diff(list);
                ContactHitPoint.f92900a.mo132200c(list.size());
                return;
            }
            Log.m165397w("SpecialFocusFragment", "focusChatters is null");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pushFocusChatter", "Lcom/bytedance/lark/pb/contact/v1/PushFocusChatter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$h */
    public static final class C35581h extends Lambda implements Function1<PushFocusChatter, Unit> {
        final /* synthetic */ SpecialFocusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35581h(SpecialFocusFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PushFocusChatter pushFocusChatter) {
            invoke(pushFocusChatter);
            return Unit.INSTANCE;
        }

        public final void invoke(PushFocusChatter pushFocusChatter) {
            if (pushFocusChatter != null) {
                this.this$0.mo131213a(pushFocusChatter);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m139299c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$SpecialFocusViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.a$e */
    public static final class SpecialFocusViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SpecialFocusViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    /* renamed from: a */
    public final void mo131213a(PushFocusChatter pushFocusChatter) {
        UICallbackExecutor.execute(new RunnableC35580g(this, pushFocusChatter));
    }

    /* renamed from: b */
    public final List<FocusChatter> mo131214b(PushFocusChatter pushFocusChatter) {
        ArrayList arrayList = new ArrayList(mo131212a().getItems());
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(((FocusChatter) obj).mo131216a(), obj);
        }
        List<Long> list = pushFocusChatter.delete_chatter_ids;
        if (list != null) {
            for (T t : list) {
                if (linkedHashMap.containsKey(String.valueOf(t.longValue()))) {
                    arrayList.remove(linkedHashMap.get(String.valueOf(t.longValue())));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        List<Chatter> list2 = pushFocusChatter.add_chatters;
        if (list2 != null) {
            for (T t2 : list2) {
                SpecialFocusModel bVar = SpecialFocusModel.f92038a;
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                arrayList3.add(bVar.mo131230a((Chatter) t2));
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m139300d();
        m139301e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_special_focus, viewGroup, false);
    }
}
