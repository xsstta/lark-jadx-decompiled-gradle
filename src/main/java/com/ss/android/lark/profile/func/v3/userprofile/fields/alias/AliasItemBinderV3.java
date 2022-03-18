package com.ss.android.lark.profile.func.v3.userprofile.fields.alias;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/AliasItemBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/AliasItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/IAliasItemDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/IAliasItemDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.a.a */
public class AliasItemBinderV3 extends BaseInfoBinderV3<AliasItemViewDataV3, IAliasItemDependencyV3> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/alias/AliasItemBinderV3$bindData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.a.a$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52748a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinderV3 f130470a;

        /* renamed from: b */
        final /* synthetic */ View f130471b;

        public void onGlobalLayout() {
            if (((TextView) this.f130471b.findViewById(R.id.tv_alias_name)) != null) {
                TextView textView = (TextView) this.f130471b.findViewById(R.id.tv_alias_name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_alias_name");
                if (textView.getVisibility() == 0) {
                    TextView textView2 = (TextView) this.f130471b.findViewById(R.id.tv_alias_name);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_alias_name");
                    textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandTextView expandTextView = (ExpandTextView) this.f130471b.findViewById(R.id.etv_change_alias);
                    Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.etv_change_alias");
                    int width = this.f130471b.getWidth();
                    TextView textView3 = (TextView) this.f130471b.findViewById(R.id.tv_alias_name);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_alias_name");
                    int width2 = width - textView3.getWidth();
                    ImageView imageView = (ImageView) this.f130471b.findViewById(R.id.iump_icon);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.iump_icon");
                    expandTextView.setMaxWidth((width2 - imageView.getWidth()) - this.f130470a.mo180250a());
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52748a(AliasItemBinderV3 aVar, View view) {
            this.f130470a = aVar;
            this.f130471b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AliasItemBinderV3(IAliasItemDependencyV3 dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.a.a$b */
    public static final class View$OnClickListenerC52749b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinderV3 f130472a;

        /* renamed from: b */
        final /* synthetic */ AliasItemViewDataV3 f130473b;

        View$OnClickListenerC52749b(AliasItemBinderV3 aVar, AliasItemViewDataV3 bVar) {
            this.f130472a = aVar;
            this.f130473b = bVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180563a(this.f130473b.mo180256d());
            ((IAliasItemDependencyV3) this.f130472a.mo180255b()).mo180245b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.a.a$c */
    public static final class View$OnLongClickListenerC52750c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinderV3 f130474a;

        /* renamed from: b */
        final /* synthetic */ AliasItemViewDataV3 f130475b;

        View$OnLongClickListenerC52750c(AliasItemBinderV3 aVar, AliasItemViewDataV3 bVar) {
            this.f130474a = aVar;
            this.f130475b = bVar;
        }

        public final boolean onLongClick(View view) {
            IAliasItemDependencyV3 dVar = (IAliasItemDependencyV3) this.f130474a.mo180255b();
            String a = this.f130475b.mo180242a();
            if (a == null) {
                Intrinsics.throwNpe();
            }
            dVar.mo180244a(a);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.a.a$d */
    public static final class View$OnClickListenerC52751d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinderV3 f130476a;

        /* renamed from: b */
        final /* synthetic */ AliasItemViewDataV3 f130477b;

        View$OnClickListenerC52751d(AliasItemBinderV3 aVar, AliasItemViewDataV3 bVar) {
            this.f130476a = aVar;
            this.f130477b = bVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180563a(this.f130477b.mo180256d());
            ((IAliasItemDependencyV3) this.f130476a.mo180255b()).mo180245b();
        }
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alias_name_item_v3_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new AliasItemViewHolderV3(inflate);
    }

    /* renamed from: a */
    public void mo180237a(View view, AliasItemViewDataV3 bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.tv_alias_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_alias_name");
        mo180252a(textView, bVar.mo180254c());
        TextView textView2 = (TextView) view.findViewById(R.id.tv_alias_name);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_alias_name");
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52748a(this, view));
        if (bVar.mo180243b() != null) {
            TextStyle b = bVar.mo180243b();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.etv_change_alias);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.etv_change_alias");
            mo180253a(b, expandTextView, null, null);
        } else {
            ((ExpandTextView) view.findViewById(R.id.etv_change_alias)).setOnClickListener(new View$OnClickListenerC52749b(this, bVar));
        }
        if (!TextUtils.isEmpty(bVar.mo180242a())) {
            ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.etv_change_alias);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.etv_change_alias");
            expandTextView2.setText(bVar.mo180242a());
            view.setOnLongClickListener(new View$OnLongClickListenerC52750c(this, bVar));
        } else {
            ((ExpandTextView) view.findViewById(R.id.etv_change_alias)).setText(R.string.Lark_Legacy_EditAlias);
            view.setLongClickable(false);
            view.setOnLongClickListener(null);
        }
        view.setOnClickListener(new View$OnClickListenerC52751d(this, bVar));
        TextStyle b2 = bVar.mo180243b();
        if (b2 != null) {
            ((ExpandTextView) view.findViewById(R.id.etv_change_alias)).setTextColor(b2.mo179598c());
            ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.etv_change_alias);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.etv_change_alias");
            expandTextView3.setMaxLines(b2.mo179593a());
            ExpandTextView expandTextView4 = (ExpandTextView) view.findViewById(R.id.etv_change_alias);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView4, "view.etv_change_alias");
            expandTextView4.setEnabled(b2.mo179597b());
            ExpandTextView expandTextView5 = (ExpandTextView) view.findViewById(R.id.etv_change_alias);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView5, "view.etv_change_alias");
            expandTextView5.setClickable(b2.mo179597b());
        }
        View findViewById = view.findViewById(R.id.bottom_line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.bottom_line");
        mo180251a(findViewById, z);
    }
}
