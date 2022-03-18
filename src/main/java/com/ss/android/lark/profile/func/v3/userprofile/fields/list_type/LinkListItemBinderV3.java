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
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.ILinkDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.LinkItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.LinkItemViewHolderV3;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/list_type/LinkListItemBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/ILinkDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/ILinkDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "strToDBC", "", "input", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.g.b */
public final class LinkListItemBinderV3 extends BaseInfoBinderV3<LinkItemViewDataV3, ILinkDependencyV3> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkListItemBinderV3(ILinkDependencyV3 aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.g.b$a */
    public static final class View$OnClickListenerC52783a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkListItemBinderV3 f130548a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewDataV3 f130549b;

        View$OnClickListenerC52783a(LinkListItemBinderV3 bVar, LinkItemViewDataV3 cVar) {
            this.f130548a = bVar;
            this.f130549b = cVar;
        }

        public final void onClick(View view) {
            ILinkDependencyV3 aVar = (ILinkDependencyV3) this.f130548a.mo180255b();
            String e = this.f130549b.mo180276e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180268a(e, this.f130549b.mo180256d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.g.b$b */
    public static final class View$OnLongClickListenerC52784b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkListItemBinderV3 f130550a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewDataV3 f130551b;

        View$OnLongClickListenerC52784b(LinkListItemBinderV3 bVar, LinkItemViewDataV3 cVar) {
            this.f130550a = bVar;
            this.f130551b = cVar;
        }

        public final boolean onLongClick(View view) {
            ILinkDependencyV3 aVar = (ILinkDependencyV3) this.f130550a.mo180255b();
            String b = this.f130551b.mo180275b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180267a(b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.g.b$c */
    public static final class View$OnClickListenerC52785c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkListItemBinderV3 f130552a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewDataV3 f130553b;

        View$OnClickListenerC52785c(LinkListItemBinderV3 bVar, LinkItemViewDataV3 cVar) {
            this.f130552a = bVar;
            this.f130553b = cVar;
        }

        public final void onClick(View view) {
            ILinkDependencyV3 aVar = (ILinkDependencyV3) this.f130552a.mo180255b();
            String e = this.f130553b.mo180276e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180268a(e, this.f130553b.mo180256d());
        }
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.link_list_item_v3_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new LinkItemViewHolderV3(inflate);
    }

    /* renamed from: a */
    private final String m204408a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        if (str != null) {
            char[] charArray = str.toCharArray();
            Intrinsics.checkExpressionValueIsNotNull(charArray, "(this as java.lang.String).toCharArray()");
            int length = charArray.length;
            for (int i = 0; i < length; i++) {
                if (charArray[i] == 12288) {
                    charArray[i] = (char) 32;
                } else {
                    char c = charArray[i];
                    if (65281 <= c && 65374 >= c) {
                        charArray[i] = (char) (charArray[i] - 65248);
                    }
                }
            }
            return new String(charArray);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public void mo180237a(View view, LinkItemViewDataV3 cVar, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar.mo180277f() != null) {
            Context context = view.getContext();
            if (context != null) {
                int color = UIUtils.getColor(context, R.color.icon_n3);
                TextStyle f = cVar.mo180277f();
                ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.mCustomTv);
                Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mCustomTv");
                mo180253a(f, expandTextView, UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_up_bold_outlined, color, new UDDimension.Dp(16.0f)), UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_down_bold_outlined, color, new UDDimension.Dp(16.0f)));
            }
        } else if (!TextUtils.isEmpty(cVar.mo180276e())) {
            ((ExpandTextView) view.findViewById(R.id.mCustomTv)).setOnClickListener(new View$OnClickListenerC52783a(this, cVar));
        }
        ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.mCustomTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.mCustomTv");
        expandTextView2.setText(m204408a(cVar.mo180275b()));
        ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.mCustomTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.mCustomTv");
        if (TextUtils.isEmpty(cVar.mo180275b())) {
            i = 8;
        } else {
            i = 0;
        }
        expandTextView3.setVisibility(i);
        if (!TextUtils.isEmpty(cVar.mo180275b())) {
            view.setOnLongClickListener(new View$OnLongClickListenerC52784b(this, cVar));
        } else {
            view.setOnLongClickListener(null);
        }
        if (!TextUtils.isEmpty(cVar.mo180276e())) {
            view.setOnClickListener(new View$OnClickListenerC52785c(this, cVar));
        }
    }
}
