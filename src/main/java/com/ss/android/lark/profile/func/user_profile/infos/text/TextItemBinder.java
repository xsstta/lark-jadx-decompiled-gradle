package com.ss.android.lark.profile.func.user_profile.infos.text;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/text/TextItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/TextItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/ITextDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/text/ITextDependency;)V", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.g.b */
public final class TextItemBinder extends BaseInfoBinder<TextItemViewData, ITextDependency> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/text/TextItemBinder$binderData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.g.b$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52646a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextItemBinder f130327a;

        /* renamed from: b */
        final /* synthetic */ View f130328b;

        public void onGlobalLayout() {
            if (((TextView) this.f130328b.findViewById(R.id.mTypeNameTv)) != null) {
                TextView textView = (TextView) this.f130328b.findViewById(R.id.mTypeNameTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
                if (textView.getVisibility() == 0) {
                    TextView textView2 = (TextView) this.f130328b.findViewById(R.id.mTypeNameTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mTypeNameTv");
                    textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandTextView expandTextView = (ExpandTextView) this.f130328b.findViewById(R.id.mValueTv);
                    Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mValueTv");
                    int width = this.f130328b.getWidth();
                    TextView textView3 = (TextView) this.f130328b.findViewById(R.id.mTypeNameTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "view.mTypeNameTv");
                    expandTextView.setMaxWidth((width - textView3.getWidth()) - this.f130327a.mo179847c());
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52646a(TextItemBinder bVar, View view) {
            this.f130327a = bVar;
            this.f130328b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextItemBinder(ITextDependency aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.g.b$b */
    public static final class View$OnLongClickListenerC52647b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ TextItemBinder f130329a;

        /* renamed from: b */
        final /* synthetic */ TextItemViewData f130330b;

        View$OnLongClickListenerC52647b(TextItemBinder bVar, TextItemViewData cVar) {
            this.f130329a = bVar;
            this.f130330b = cVar;
        }

        public final boolean onLongClick(View view) {
            ITextDependency aVar = (ITextDependency) this.f130329a.mo179589a();
            String b = this.f130330b.mo179928b();
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
        View inflate = LayoutInflater.from(((ITextDependency) mo179589a()).mo179591d()).inflate(R.layout.text_item_layout, viewGroup, false);
        if (DesktopUtil.m144301a(((ITextDependency) mo179589a()).mo179591d())) {
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            View findViewById = inflate.findViewById(R.id.mLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.mLine");
            TextView textView = (TextView) inflate.findViewById(R.id.mTypeNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.mTypeNameTv");
            mo179843a(inflate, findViewById, textView);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new TextItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo179592a(View view, TextItemViewData cVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
        mo179844a(textView, cVar.mo179856a());
        TextView textView2 = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mTypeNameTv");
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52646a(this, view));
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
            view.setOnLongClickListener(new View$OnLongClickListenerC52647b(this, cVar));
            return;
        }
        view.setLongClickable(false);
        view.setOnLongClickListener(null);
    }
}
