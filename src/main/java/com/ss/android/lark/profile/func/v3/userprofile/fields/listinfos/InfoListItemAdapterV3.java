package com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos.InfoListItemBinderV3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000  *\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001 B\u001b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0014\u0010\u001d\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListItemAdapterV3;", "D", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinder", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;)V", "isExpanded", "", "maxLines", "", "getItemCount", "getItemId", "", "position", "getItemViewType", "handleBindExpandButton", "", "holder", "handleExpandClick", "ignore", "Landroid/view/View;", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.h.b */
public final class InfoListItemAdapterV3<D extends BaseInfoViewDataV3> extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, D> {

    /* renamed from: a */
    public static final Companion f130557a = new Companion(null);

    /* renamed from: b */
    private int f130558b = 5;

    /* renamed from: c */
    private boolean f130559c;

    /* renamed from: d */
    private final BaseInfoBinderV3<D, ? extends IBinderDependencyV3> f130560d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListItemAdapterV3$Companion;", "", "()V", "EXPAND_BTN", "", "NORMAL", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.h.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public int getItemCount() {
        int size = this.items.size();
        int i = this.f130558b;
        if (size <= i || this.f130559c) {
            return size;
        }
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "D", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "p1", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "ignore", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.h.b$b */
    public static final /* synthetic */ class C52787b extends FunctionReference implements Function1<View, Unit> {
        C52787b(InfoListItemAdapterV3 bVar) {
            super(1, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleExpandClick";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(InfoListItemAdapterV3.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleExpandClick(Landroid/view/View;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "p1");
            ((InfoListItemAdapterV3) this.receiver).mo180316a(view);
        }
    }

    public InfoListItemAdapterV3(BaseInfoBinderV3<D, ? extends IBinderDependencyV3> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "itemBinder");
        this.f130560d = aVar;
    }

    /* renamed from: a */
    public final void mo180316a(View view) {
        this.f130559c = !this.f130559c;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f130558b || this.f130559c) {
            return -2;
        }
        return -1;
    }

    /* renamed from: a */
    private final void m204417a(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.setOnClickListener(new View$OnClickListenerC52788c(new C52787b(this)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        int i2;
        if (getItemViewType(i) == -2) {
            i2 = ((BaseInfoViewDataV3) getItem(i)).mo180256d().hashCode();
        } else {
            i2 = R.string.Lark_Legacy_ProfileDetailDepartmentsMore;
        }
        return (long) i2;
    }

    /* renamed from: a */
    public final void mo180317a(List<? extends D> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.items.clear();
        addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (getItemViewType(i) == -2) {
            BaseInfoBinderV3<D, ? extends IBinderDependencyV3> aVar = this.f130560d;
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            Object obj = this.items.get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "items[position]");
            aVar.mo180237a(view, obj, false);
            return;
        }
        m204417a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == -2) {
            RecyclerView.ViewHolder a = this.f130560d.mo180235a(viewGroup);
            a.itemView.setPadding(0, 0, 0, 0);
            return a;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.info_item_expand_btn, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
        return new InfoListItemBinderV3.ViewHolder(inflate);
    }
}
