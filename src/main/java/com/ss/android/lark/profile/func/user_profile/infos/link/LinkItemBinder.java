package com.ss.android.lark.profile.func.user_profile.infos.link;

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
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/link/LinkItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/LinkItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/ILinkDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/link/ILinkDependency;)V", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.b.b */
public final class LinkItemBinder extends BaseInfoBinder<LinkItemViewData, ILinkDependency> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/link/LinkItemBinder$binderData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.b.b$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52625a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinder f130253a;

        /* renamed from: b */
        final /* synthetic */ View f130254b;

        public void onGlobalLayout() {
            if (((TextView) this.f130254b.findViewById(R.id.mTypeNameTv)) != null) {
                TextView textView = (TextView) this.f130254b.findViewById(R.id.mTypeNameTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
                if (textView.getVisibility() == 0) {
                    TextView textView2 = (TextView) this.f130254b.findViewById(R.id.mTypeNameTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mTypeNameTv");
                    textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandTextView expandTextView = (ExpandTextView) this.f130254b.findViewById(R.id.mCustomTv);
                    Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mCustomTv");
                    int width = this.f130254b.getWidth();
                    TextView textView3 = (TextView) this.f130254b.findViewById(R.id.mTypeNameTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "view.mTypeNameTv");
                    expandTextView.setMaxWidth((width - textView3.getWidth()) - this.f130253a.mo179847c());
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52625a(LinkItemBinder bVar, View view) {
            this.f130253a = bVar;
            this.f130254b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkItemBinder(ILinkDependency aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.b.b$c */
    public static final class View$OnLongClickListenerC52627c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinder f130257a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewData f130258b;

        View$OnLongClickListenerC52627c(LinkItemBinder bVar, LinkItemViewData cVar) {
            this.f130257a = bVar;
            this.f130258b = cVar;
        }

        public final boolean onLongClick(View view) {
            ILinkDependency aVar = (ILinkDependency) this.f130257a.mo179589a();
            String e = this.f130258b.mo179864e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179768a(e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.b.b$b */
    public static final class View$OnClickListenerC52626b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinder f130255a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewData f130256b;

        View$OnClickListenerC52626b(LinkItemBinder bVar, LinkItemViewData cVar) {
            this.f130255a = bVar;
            this.f130256b = cVar;
        }

        public final void onClick(View view) {
            String b = this.f130256b.mo179862b();
            if (b == null) {
                b = "unknown";
            }
            ProfileHitPoint.m204726g(b);
            ILinkDependency aVar = (ILinkDependency) this.f130255a.mo179589a();
            String f = this.f130256b.mo179865f();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179769a(f, this.f130256b.mo179863c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.b.b$d */
    public static final class View$OnClickListenerC52628d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinder f130259a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewData f130260b;

        View$OnClickListenerC52628d(LinkItemBinder bVar, LinkItemViewData cVar) {
            this.f130259a = bVar;
            this.f130260b = cVar;
        }

        public final void onClick(View view) {
            String b = this.f130260b.mo179862b();
            if (b == null) {
                b = "unknown";
            }
            ProfileHitPoint.m204726g(b);
            ILinkDependency aVar = (ILinkDependency) this.f130259a.mo179589a();
            String f = this.f130260b.mo179865f();
            if (f == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo179769a(f, this.f130260b.mo179863c());
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((ILinkDependency) mo179589a()).mo179591d()).inflate(R.layout.link_item_layout, viewGroup, false);
        if (DesktopUtil.m144301a(((ILinkDependency) mo179589a()).mo179591d())) {
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            View findViewById = inflate.findViewById(R.id.mLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.mLine");
            TextView textView = (TextView) inflate.findViewById(R.id.mTypeNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.mTypeNameTv");
            mo179843a(inflate, findViewById, textView);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new LinkItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo179592a(View view, LinkItemViewData cVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
        mo179844a(textView, cVar.mo179856a());
        TextView textView2 = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mTypeNameTv");
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52625a(this, view));
        if (cVar.mo179866g() != null) {
            TextStyle g = cVar.mo179866g();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.mCustomTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mCustomTv");
            mo179845a(g, expandTextView, UIUtils.getDrawable(((ILinkDependency) mo179589a()).mo179591d(), R.drawable.description_close), UIUtils.getDrawable(((ILinkDependency) mo179589a()).mo179591d(), R.drawable.description_more));
        }
        if (!TextUtils.isEmpty(cVar.mo179865f())) {
            ((ExpandTextView) view.findViewById(R.id.mCustomTv)).setOnClickListener(new View$OnClickListenerC52626b(this, cVar));
        }
        ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.mCustomTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.mCustomTv");
        expandTextView2.setText(cVar.mo179864e());
        ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.mCustomTv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.mCustomTv");
        if (TextUtils.isEmpty(cVar.mo179864e())) {
            i = 8;
        } else {
            i = 0;
        }
        expandTextView3.setVisibility(i);
        if (!TextUtils.isEmpty(cVar.mo179864e())) {
            view.setOnLongClickListener(new View$OnLongClickListenerC52627c(this, cVar));
        } else {
            view.setOnLongClickListener(null);
        }
        if (!TextUtils.isEmpty(cVar.mo179865f())) {
            view.setOnClickListener(new View$OnClickListenerC52628d(this, cVar));
        }
    }
}
