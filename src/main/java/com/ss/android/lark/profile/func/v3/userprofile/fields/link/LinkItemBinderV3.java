package com.ss.android.lark.profile.func.v3.userprofile.fields.link;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.ui.ExpandTextView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/ILinkDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/ILinkDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.b */
public final class LinkItemBinderV3 extends BaseInfoBinderV3<LinkItemViewDataV3, ILinkDependencyV3> {

    /* renamed from: a */
    public static final Companion f130509a = new Companion(null);

    /* renamed from: b */
    private static final Set<String> f130510b = am.m265689a((Object[]) new String[]{"B-OKR", "B-CALENDARSCHEDULE", "B-MORE", "B-WORKPLACE-INSIGHT", "B-FRIENDLINK", "C-6831319849977790465"});

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemBinderV3$Companion;", "", "()V", "CALENDAR_KEY", "", "DISABLE_LONG_CLICK_ITEMS", "", "FEEDBACK_KEY", "FRIEND_LINK_KEY", "INSIGHT_KEY", "OKR_KEY", "PEOPLE_KEY", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemBinderV3$bindData$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.b$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52760b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinderV3 f130511a;

        /* renamed from: b */
        final /* synthetic */ View f130512b;

        public void onGlobalLayout() {
            if (((TextView) this.f130512b.findViewById(R.id.tv_link_name)) != null) {
                TextView textView = (TextView) this.f130512b.findViewById(R.id.tv_link_name);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_link_name");
                if (textView.getVisibility() == 0) {
                    TextView textView2 = (TextView) this.f130512b.findViewById(R.id.tv_link_name);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_link_name");
                    textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandTextView expandTextView = (ExpandTextView) this.f130512b.findViewById(R.id.etv_link_value);
                    Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.etv_link_value");
                    int width = this.f130512b.getWidth();
                    TextView textView3 = (TextView) this.f130512b.findViewById(R.id.tv_link_name);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_link_name");
                    expandTextView.setMaxWidth((width - textView3.getWidth()) - this.f130511a.mo180250a());
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52760b(LinkItemBinderV3 bVar, View view) {
            this.f130511a = bVar;
            this.f130512b = view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkItemBinderV3(ILinkDependencyV3 aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.b$c */
    public static final class View$OnClickListenerC52761c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinderV3 f130513a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewDataV3 f130514b;

        View$OnClickListenerC52761c(LinkItemBinderV3 bVar, LinkItemViewDataV3 cVar) {
            this.f130513a = bVar;
            this.f130514b = cVar;
        }

        public final void onClick(View view) {
            ILinkDependencyV3 aVar = (ILinkDependencyV3) this.f130513a.mo180255b();
            String e = this.f130514b.mo180276e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180268a(e, this.f130514b.mo180256d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.b$d */
    public static final class View$OnLongClickListenerC52762d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinderV3 f130515a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewDataV3 f130516b;

        View$OnLongClickListenerC52762d(LinkItemBinderV3 bVar, LinkItemViewDataV3 cVar) {
            this.f130515a = bVar;
            this.f130516b = cVar;
        }

        public final boolean onLongClick(View view) {
            ILinkDependencyV3 aVar = (ILinkDependencyV3) this.f130515a.mo180255b();
            String b = this.f130516b.mo180275b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180267a(b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.f.b$e */
    public static final class View$OnClickListenerC52763e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkItemBinderV3 f130517a;

        /* renamed from: b */
        final /* synthetic */ LinkItemViewDataV3 f130518b;

        View$OnClickListenerC52763e(LinkItemBinderV3 bVar, LinkItemViewDataV3 cVar) {
            this.f130517a = bVar;
            this.f130518b = cVar;
        }

        public final void onClick(View view) {
            ILinkDependencyV3 aVar = (ILinkDependencyV3) this.f130517a.mo180255b();
            String e = this.f130518b.mo180276e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo180268a(e, this.f130518b.mo180256d());
        }
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.link_item_v3_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new LinkItemViewHolderV3(inflate);
    }

    /* renamed from: a */
    public void mo180237a(View view, LinkItemViewDataV3 cVar, boolean z) {
        int i;
        Context context;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.tv_link_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_link_name");
        mo180252a(textView, cVar.mo180254c());
        TextView textView2 = (TextView) view.findViewById(R.id.tv_link_name);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_link_name");
        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52760b(this, view));
        if (!(cVar.mo180277f() == null || (context = view.getContext()) == null)) {
            int color = UIUtils.getColor(context, R.color.icon_n3);
            TextStyle f = cVar.mo180277f();
            ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.etv_link_value);
            Intrinsics.checkExpressionValueIsNotNull(expandTextView, "view.etv_link_value");
            mo180253a(f, expandTextView, UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_up_bold_outlined, color, new UDDimension.Dp(16.0f)), UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_down_bold_outlined, color, new UDDimension.Dp(16.0f)));
        }
        if (!TextUtils.isEmpty(cVar.mo180276e())) {
            ((ExpandTextView) view.findViewById(R.id.etv_link_value)).setOnClickListener(new View$OnClickListenerC52761c(this, cVar));
        }
        ExpandTextView expandTextView2 = (ExpandTextView) view.findViewById(R.id.etv_link_value);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView2, "view.etv_link_value");
        expandTextView2.setText(cVar.mo180275b());
        ExpandTextView expandTextView3 = (ExpandTextView) view.findViewById(R.id.etv_link_value);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView3, "view.etv_link_value");
        if (TextUtils.isEmpty(cVar.mo180275b())) {
            i = 8;
        } else {
            i = 0;
        }
        expandTextView3.setVisibility(i);
        if (CollectionsKt.contains(f130510b, cVar.mo180274a()) || TextUtils.isEmpty(cVar.mo180275b())) {
            view.setOnLongClickListener(null);
        } else {
            view.setOnLongClickListener(new View$OnLongClickListenerC52762d(this, cVar));
        }
        if (!TextUtils.isEmpty(cVar.mo180276e())) {
            view.setOnClickListener(new View$OnClickListenerC52763e(this, cVar));
        }
        View findViewById = view.findViewById(R.id.line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.line");
        mo180251a(findViewById, z);
    }
}
