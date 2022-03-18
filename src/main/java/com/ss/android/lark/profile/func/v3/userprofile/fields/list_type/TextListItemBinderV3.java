package com.ss.android.lark.profile.func.v3.userprofile.fields.list_type;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.ITextDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.TextItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.TextItemViewHolderV3;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/list_type/TextListItemBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/text/TextItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/text/ITextDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/text/ITextDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.g.d */
public final class TextListItemBinderV3 extends BaseInfoBinderV3<TextItemViewDataV3, ITextDependencyV3> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextListItemBinderV3(ITextDependencyV3 aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.g.d$a */
    public static final class View$OnLongClickListenerC52786a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ TextListItemBinderV3 f130555a;

        /* renamed from: b */
        final /* synthetic */ TextItemViewDataV3 f130556b;

        View$OnLongClickListenerC52786a(TextListItemBinderV3 dVar, TextItemViewDataV3 cVar) {
            this.f130555a = dVar;
            this.f130556b = cVar;
        }

        public final boolean onLongClick(View view) {
            ITextDependencyV3 aVar = (ITextDependencyV3) this.f130555a.mo180255b();
            String a = this.f130556b.mo180339a();
            if (a == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180303a(a);
            return true;
        }
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text_list_item_v3_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new TextItemViewHolderV3(inflate);
    }

    /* renamed from: a */
    public void mo180237a(View view, TextItemViewDataV3 cVar, boolean z) {
        int i;
        Context context;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(cVar.mo180340b() == null || (context = view.getContext()) == null)) {
            int color = UIUtils.getColor(context, R.color.icon_n3);
            TextStyle b = cVar.mo180340b();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.mValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mValueTv");
            mo180253a(b, expandTextView, UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_up_bold_outlined, color, new UDDimension.Dp(16.0f)), UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_down_bold_outlined, color, new UDDimension.Dp(16.0f)));
        }
        ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.mValueTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.mValueTv");
        expandTextView2.setText(cVar.mo180339a());
        ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.mValueTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.mValueTv");
        if (TextUtils.isEmpty(cVar.mo180339a())) {
            i = 8;
        } else {
            i = 0;
        }
        expandTextView3.setVisibility(i);
        if (!TextUtils.isEmpty(cVar.mo180339a())) {
            view.setOnLongClickListener(new View$OnLongClickListenerC52786a(this, cVar));
            return;
        }
        view.setLongClickable(false);
        view.setOnLongClickListener(null);
    }
}
