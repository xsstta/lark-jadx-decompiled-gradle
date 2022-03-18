package com.ss.android.lark.profile.func.user_profile.infos.list;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder;
import com.ss.android.lark.profile.func.user_profile.infos.link.ILinkDependency;
import com.ss.android.lark.profile.func.user_profile.infos.link.LinkItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.link.LinkItemViewHolder;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/list/LinkListItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/LinkItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/ILinkDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/link/ILinkDependency;)V", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "strToDBC", "", "input", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.c.b */
public final class LinkListItemBinder extends BaseInfoBinder<LinkItemViewData, ILinkDependency> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkListItemBinder(ILinkDependency aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.c.b$a */
    public static final class View$OnClickListenerC52629a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkListItemBinder f130269a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewData f130270b;

        View$OnClickListenerC52629a(LinkListItemBinder bVar, LinkItemViewData cVar) {
            this.f130269a = bVar;
            this.f130270b = cVar;
        }

        public final void onClick(View view) {
            ILinkDependency aVar = (ILinkDependency) this.f130269a.mo179589a();
            String f = this.f130270b.mo179865f();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179769a(f, this.f130270b.mo179863c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.c.b$b */
    public static final class View$OnLongClickListenerC52630b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkListItemBinder f130271a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewData f130272b;

        View$OnLongClickListenerC52630b(LinkListItemBinder bVar, LinkItemViewData cVar) {
            this.f130271a = bVar;
            this.f130272b = cVar;
        }

        public final boolean onLongClick(View view) {
            ILinkDependency aVar = (ILinkDependency) this.f130271a.mo179589a();
            String e = this.f130272b.mo179864e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179768a(e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.c.b$c */
    public static final class View$OnClickListenerC52631c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkListItemBinder f130273a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewData f130274b;

        View$OnClickListenerC52631c(LinkListItemBinder bVar, LinkItemViewData cVar) {
            this.f130273a = bVar;
            this.f130274b = cVar;
        }

        public final void onClick(View view) {
            ILinkDependency aVar = (ILinkDependency) this.f130273a.mo179589a();
            String f = this.f130274b.mo179865f();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179769a(f, this.f130274b.mo179863c());
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((ILinkDependency) mo179589a()).mo179591d()).inflate(R.layout.link_list_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new LinkItemViewHolder(inflate);
    }

    /* renamed from: a */
    private final String m203958a(String str) {
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
    public void mo179592a(View view, LinkItemViewData cVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar.mo179866g() != null) {
            TextStyle g = cVar.mo179866g();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.mCustomTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mCustomTv");
            mo179845a(g, expandTextView, UIUtils.getDrawable(((ILinkDependency) mo179589a()).mo179591d(), R.drawable.description_close), UIUtils.getDrawable(((ILinkDependency) mo179589a()).mo179591d(), R.drawable.description_more));
        } else if (!TextUtils.isEmpty(cVar.mo179865f())) {
            ((ExpandTextView) view.findViewById(R.id.mCustomTv)).setOnClickListener(new View$OnClickListenerC52629a(this, cVar));
        }
        ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.mCustomTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.mCustomTv");
        expandTextView2.setText(m203958a(cVar.mo179864e()));
        ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.mCustomTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.mCustomTv");
        if (TextUtils.isEmpty(cVar.mo179864e())) {
            i = 8;
        } else {
            i = 0;
        }
        expandTextView3.setVisibility(i);
        if (!TextUtils.isEmpty(cVar.mo179864e())) {
            view.setOnLongClickListener(new View$OnLongClickListenerC52630b(this, cVar));
        } else {
            view.setOnLongClickListener(null);
        }
        if (!TextUtils.isEmpty(cVar.mo179865f())) {
            view.setOnClickListener(new View$OnClickListenerC52631c(this, cVar));
        }
    }
}
