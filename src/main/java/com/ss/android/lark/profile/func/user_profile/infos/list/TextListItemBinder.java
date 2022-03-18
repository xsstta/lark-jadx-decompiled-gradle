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
import com.ss.android.lark.profile.func.user_profile.infos.text.ITextDependency;
import com.ss.android.lark.profile.func.user_profile.infos.text.TextItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.text.TextItemViewHolder;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/list/TextListItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/TextItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/ITextDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/text/ITextDependency;)V", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.c.d */
public final class TextListItemBinder extends BaseInfoBinder<TextItemViewData, ITextDependency> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextListItemBinder(ITextDependency aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.c.d$a */
    public static final class View$OnLongClickListenerC52632a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ TextListItemBinder f130276a;

        /* renamed from: b */
        final /* synthetic */ TextItemViewData f130277b;

        View$OnLongClickListenerC52632a(TextListItemBinder dVar, TextItemViewData cVar) {
            this.f130276a = dVar;
            this.f130277b = cVar;
        }

        public final boolean onLongClick(View view) {
            ITextDependency aVar = (ITextDependency) this.f130276a.mo179589a();
            String b = this.f130277b.mo179928b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179776a(b);
            return true;
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((ITextDependency) mo179589a()).mo179591d()).inflate(R.layout.text_list_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new TextItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo179592a(View view, TextItemViewData cVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (cVar.mo179929c() != null) {
            TextStyle c = cVar.mo179929c();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.mValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mValueTv");
            mo179845a(c, expandTextView, UIUtils.getDrawable(((ITextDependency) mo179589a()).mo179591d(), R.drawable.description_close), UIUtils.getDrawable(((ITextDependency) mo179589a()).mo179591d(), R.drawable.description_more));
        }
        ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.mValueTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.mValueTv");
        expandTextView2.setText(cVar.mo179928b());
        ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.mValueTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.mValueTv");
        if (TextUtils.isEmpty(cVar.mo179928b())) {
            i = 8;
        } else {
            i = 0;
        }
        expandTextView3.setVisibility(i);
        if (!TextUtils.isEmpty(cVar.mo179928b())) {
            view.setOnLongClickListener(new View$OnLongClickListenerC52632a(this, cVar));
            return;
        }
        view.setLongClickable(false);
        view.setOnLongClickListener(null);
    }
}
