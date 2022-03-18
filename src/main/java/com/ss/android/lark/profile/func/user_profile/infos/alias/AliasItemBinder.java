package com.ss.android.lark.profile.func.user_profile.infos.alias;

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
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/IAliasItemDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/alias/IAliasItemDependency;)V", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a.a */
public class AliasItemBinder extends BaseInfoBinder<AliasItemViewData, IAliasItemDependency> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemBinder$binderData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a.a$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52621a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinder f130242a;

        /* renamed from: b */
        final /* synthetic */ View f130243b;

        public void onGlobalLayout() {
            if (((TextView) this.f130243b.findViewById(R.id.mTypeNameTv)) != null) {
                TextView textView = (TextView) this.f130243b.findViewById(R.id.mTypeNameTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
                if (textView.getVisibility() == 0) {
                    TextView textView2 = (TextView) this.f130243b.findViewById(R.id.mTypeNameTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mTypeNameTv");
                    textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandTextView expandTextView = (ExpandTextView) this.f130243b.findViewById(R.id.mAliasValueTv);
                    Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mAliasValueTv");
                    int width = this.f130243b.getWidth();
                    TextView textView3 = (TextView) this.f130243b.findViewById(R.id.mAliasTypeNameTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "view.mAliasTypeNameTv");
                    int width2 = width - textView3.getWidth();
                    ImageView imageView = (ImageView) this.f130243b.findViewById(R.id.mJumpIcon);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.mJumpIcon");
                    expandTextView.setMaxWidth((width2 - imageView.getWidth()) - this.f130242a.mo179847c());
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52621a(AliasItemBinder aVar, View view) {
            this.f130242a = aVar;
            this.f130243b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AliasItemBinder(IAliasItemDependency dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a.a$b */
    public static final class View$OnClickListenerC52622b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinder f130244a;

        /* renamed from: b */
        final /* synthetic */ AliasItemViewData f130245b;

        View$OnClickListenerC52622b(AliasItemBinder aVar, AliasItemViewData bVar) {
            this.f130244a = aVar;
            this.f130245b = bVar;
        }

        public final void onClick(View view) {
            ((IAliasItemDependency) this.f130244a.mo179589a()).mo179756a(this.f130245b.mo179854b());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a.a$c */
    public static final class View$OnLongClickListenerC52623c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinder f130246a;

        /* renamed from: b */
        final /* synthetic */ AliasItemViewData f130247b;

        View$OnLongClickListenerC52623c(AliasItemBinder aVar, AliasItemViewData bVar) {
            this.f130246a = aVar;
            this.f130247b = bVar;
        }

        public final boolean onLongClick(View view) {
            IAliasItemDependency dVar = (IAliasItemDependency) this.f130246a.mo179589a();
            String b = this.f130247b.mo179854b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            dVar.mo179757b(b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a.a$d */
    public static final class View$OnClickListenerC52624d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AliasItemBinder f130248a;

        /* renamed from: b */
        final /* synthetic */ AliasItemViewData f130249b;

        View$OnClickListenerC52624d(AliasItemBinder aVar, AliasItemViewData bVar) {
            this.f130248a = aVar;
            this.f130249b = bVar;
        }

        public final void onClick(View view) {
            ((IAliasItemDependency) this.f130248a.mo179589a()).mo179756a(this.f130249b.mo179854b());
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((IAliasItemDependency) mo179589a()).mo179591d()).inflate(R.layout.alias_name_item_layout, viewGroup, false);
        if (DesktopUtil.m144301a(((IAliasItemDependency) mo179589a()).mo179591d())) {
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            View findViewById = inflate.findViewById(R.id.mLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.mLine");
            TextView textView = (TextView) inflate.findViewById(R.id.mAliasTypeNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.mAliasTypeNameTv");
            mo179843a(inflate, findViewById, textView);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new AliasItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void mo179592a(View view, AliasItemViewData bVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.mAliasTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.mAliasTypeNameTv");
        mo179844a(textView, bVar.mo179856a());
        TextView textView2 = (TextView) view.findViewById(R.id.mAliasTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mAliasTypeNameTv");
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52621a(this, view));
        if (bVar.mo179855c() != null) {
            TextStyle c = bVar.mo179855c();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.mAliasValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.mAliasValueTv");
            mo179845a(c, expandTextView, null, null);
        } else {
            ((ExpandTextView) view.findViewById(R.id.mAliasValueTv)).setOnClickListener(new View$OnClickListenerC52622b(this, bVar));
        }
        if (!TextUtils.isEmpty(bVar.mo179854b())) {
            ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.mAliasValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.mAliasValueTv");
            expandTextView2.setText(bVar.mo179854b());
            view.setOnLongClickListener(new View$OnLongClickListenerC52623c(this, bVar));
        } else {
            ((ExpandTextView) view.findViewById(R.id.mAliasValueTv)).setText(R.string.Lark_Legacy_EditAlias);
            view.setLongClickable(false);
            view.setOnLongClickListener(null);
        }
        view.setOnClickListener(new View$OnClickListenerC52624d(this, bVar));
        TextStyle c2 = bVar.mo179855c();
        if (c2 != null) {
            ((ExpandTextView) view.findViewById(R.id.mAliasValueTv)).setTextColor(c2.mo179598c());
            ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.mAliasValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.mAliasValueTv");
            expandTextView3.setMaxLines(c2.mo179593a());
            ExpandTextView expandTextView4 = (ExpandTextView) view.findViewById(R.id.mAliasValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView4, "view.mAliasValueTv");
            expandTextView4.setEnabled(c2.mo179597b());
            ExpandTextView expandTextView5 = (ExpandTextView) view.findViewById(R.id.mAliasValueTv);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView5, "view.mAliasValueTv");
            expandTextView5.setClickable(c2.mo179597b());
        }
    }
}
