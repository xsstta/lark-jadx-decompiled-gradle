package com.ss.android.lark.profile.func.v3.userprofile.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\f\u0010\u0018\u001a\u00020\u0012*\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u0012*\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u0012*\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001e\u001a\u00020\u0012*\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/FieldAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "mContext", "Landroid/content/Context;", "binderPools", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/BinderPoolV3;", "(Landroid/content/Context;Lcom/ss/android/lark/profile/func/v3/userprofile/fields/BinderPoolV3;)V", "getItemId", "", "position", "", "getItemViewType", "itemIsFirst", "", "itemIsLast", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "binderPosition", "hideRadius", "Landroid/graphics/drawable/GradientDrawable;", "showAllRadius", "radius", "", "showBottomRadius", "showTopRadius", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.b */
public final class FieldAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, BaseInfoViewDataV3> {

    /* renamed from: a */
    private final Context f130480a;

    /* renamed from: b */
    private final BinderPoolV3 f130481b;

    /* renamed from: b */
    private final boolean m204310b(int i) {
        return i == 0;
    }

    /* renamed from: a */
    private final boolean m204308a(int i) {
        if (i == getItemCount() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m204306a(GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadii(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        BaseInfoViewDataV3 bVar = (BaseInfoViewDataV3) getItem(i);
        if (bVar != null) {
            return (long) bVar.mo180256d().hashCode();
        }
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        BinderPoolV3 aVar = this.f130481b;
        String name = ((BaseInfoViewDataV3) getItem(i)).getClass().getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "getItem(position).javaClass.name");
        return aVar.mo180232a(name);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/FieldAdapter$onCreateViewHolder$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.b$a */
    public static final class C52752a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FieldAdapter f130482a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52752a(FieldAdapter bVar, View view) {
            super(view);
            this.f130482a = bVar;
        }
    }

    public FieldAdapter(Context context, BinderPoolV3 aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "binderPools");
        this.f130480a = context;
        this.f130481b = aVar;
    }

    /* renamed from: c */
    private final void m204311c(GradientDrawable gradientDrawable, float f) {
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
    }

    /* renamed from: a */
    private final void m204307a(GradientDrawable gradientDrawable, float f) {
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    /* renamed from: b */
    private final void m204309b(GradientDrawable gradientDrawable, float f) {
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder a;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        BaseInfoBinderV3<BaseInfoViewDataV3, IBinderDependencyV3> a2 = this.f130481b.mo180233a(i);
        if (a2 == null || (a = a2.mo180235a(viewGroup)) == null) {
            return new C52752a(this, new View(this.f130480a));
        }
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        BaseInfoBinderV3<BaseInfoViewDataV3, IBinderDependencyV3> a = this.f130481b.mo180233a(getItemViewType(i));
        boolean b = m204310b(i);
        boolean a2 = m204308a(i);
        if (a != null) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            Object item = getItem(i);
            Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
            a.mo180237a(view, item, a2);
        }
        View view2 = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        Drawable background = view2.getBackground();
        if (!(background instanceof GradientDrawable)) {
            background = null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(UIUtils.getColorStateList(this.f130480a, R.color.bg_setting_group_item));
        }
        float a3 = UDDimenUtils.m93308a(this.f130480a, 8);
        if (b && a2) {
            m204311c(gradientDrawable, a3);
        } else if (b) {
            m204307a(gradientDrawable, a3);
        } else if (a2) {
            m204309b(gradientDrawable, a3);
        } else {
            m204306a(gradientDrawable);
        }
        View view3 = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        view3.setBackground(gradientDrawable);
    }
}
