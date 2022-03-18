package com.ss.android.lark.profile.func.v3.userprofile.fields.description;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias.IAliasItemDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/description/DescriptionItemBinder;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/description/DescriptionViewData;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/IAliasItemDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/IAliasItemDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.e.a */
public class DescriptionItemBinder extends BaseInfoBinderV3<DescriptionViewData, IAliasItemDependencyV3> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/description/DescriptionItemBinder$bindData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.e.a$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52757a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionItemBinder f130499a;

        /* renamed from: b */
        final /* synthetic */ View f130500b;

        public void onGlobalLayout() {
            if (((TextView) this.f130500b.findViewById(R.id.tv_description)) != null) {
                TextView textView = (TextView) this.f130500b.findViewById(R.id.tv_description);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_description");
                if (textView.getVisibility() == 0) {
                    TextView textView2 = (TextView) this.f130500b.findViewById(R.id.tv_description);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_description");
                    textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandTextView expandTextView = (ExpandTextView) this.f130500b.findViewById(R.id.etv_description);
                    Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.etv_description");
                    int width = this.f130500b.getWidth();
                    TextView textView3 = (TextView) this.f130500b.findViewById(R.id.tv_description);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_description");
                    int width2 = width - textView3.getWidth();
                    ImageView imageView = (ImageView) this.f130500b.findViewById(R.id.iump_icon);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.iump_icon");
                    int width3 = width2 - (imageView.getWidth() * 2);
                    ImageView imageView2 = (ImageView) this.f130500b.findViewById(R.id.icon_alias);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.icon_alias");
                    expandTextView.setMaxWidth(((width3 - imageView2.getWidth()) - this.f130499a.mo180250a()) - C52743a.m204272a(16));
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52757a(DescriptionItemBinder aVar, View view) {
            this.f130499a = aVar;
            this.f130500b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptionItemBinder(IAliasItemDependencyV3 dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.e.a$b */
    public static final class View$OnClickListenerC52758b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionItemBinder f130501a;

        /* renamed from: b */
        final /* synthetic */ DescriptionViewData f130502b;

        View$OnClickListenerC52758b(DescriptionItemBinder aVar, DescriptionViewData bVar) {
            this.f130501a = aVar;
            this.f130502b = bVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180563a(this.f130502b.mo180256d());
            ((IAliasItemDependencyV3) this.f130501a.mo180255b()).mo180245b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.e.a$c */
    public static final class View$OnClickListenerC52759c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DescriptionItemBinder f130503a;

        /* renamed from: b */
        final /* synthetic */ DescriptionViewData f130504b;

        View$OnClickListenerC52759c(DescriptionItemBinder aVar, DescriptionViewData bVar) {
            this.f130503a = aVar;
            this.f130504b = bVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180563a(this.f130504b.mo180256d());
            ((IAliasItemDependencyV3) this.f130503a.mo180255b()).mo180245b();
        }
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.description_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new DescriptionViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo180237a(View view, DescriptionViewData bVar, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.tv_description);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_description");
        mo180252a(textView, bVar.mo180254c());
        TextView textView2 = (TextView) view.findViewById(R.id.tv_description);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_description");
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52757a(this, view));
        ImageView imageView = (ImageView) view.findViewById(R.id.icon_alias);
        if (bVar.mo180266b() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        UIUtils.display(imageView, z2);
        ((ExpandTextView) view.findViewById(R.id.etv_description)).setOnClickListener(new View$OnClickListenerC52758b(this, bVar));
        ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.etv_description);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.etv_description");
        expandTextView.setText(bVar.mo180265a());
        view.setLongClickable(false);
        view.setOnClickListener(new View$OnClickListenerC52759c(this, bVar));
        View findViewById = view.findViewById(R.id.bottom_line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.bottom_line");
        mo180251a(findViewById, z);
    }
}
