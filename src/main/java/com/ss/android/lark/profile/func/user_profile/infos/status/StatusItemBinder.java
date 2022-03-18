package com.ss.android.lark.profile.func.user_profile.infos.status;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.C59170l;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/status/StatusItemBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/StatusItemViewData;", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/IStatusDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/infos/status/IStatusDependency;)V", BottomDialog.f17198f, "", "binderData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "initStatus", "setChatterId", "setDesktopLayout", "rootView", "lineView", "labelView", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f.b */
public final class StatusItemBinder extends BaseInfoBinder<StatusItemViewData, IStatusDependency> {

    /* renamed from: b */
    public static final Companion f130316b = new Companion(null);

    /* renamed from: a */
    public String f130317a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f.b$e */
    public static final class View$OnClickListenerC52645e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC52645e f130323a = new View$OnClickListenerC52645e();

        View$OnClickListenerC52645e() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/status/StatusItemBinder$Companion;", "", "()V", "USER_STATUS_MAX_TEXT_WIDTH", "", "USER_STATUS_TEXT_SIZE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo179919a(String str) {
        this.f130317a = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/status/StatusItemBinder$initStatus$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "url", "", "onURLLongClick", "", "text", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f.b$b */
    public static final class C52642b implements LinkEmojiTextView.AbstractC58525j {

        /* renamed from: a */
        final /* synthetic */ StatusItemBinder f130318a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: b */
        public boolean mo122807b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52642b(StatusItemBinder bVar) {
            this.f130318a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: a */
        public void mo122806a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "url");
            ((IStatusDependency) this.f130318a.mo179589a()).mo179773a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/status/StatusItemBinder$initStatus$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IPhoneStringClickListener;", "onPhoneClick", "", "view", "Landroid/view/View;", "phoneNumber", "", "onPhoneLongClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f.b$c */
    public static final class C52643c implements LinkEmojiTextView.AbstractC58524i {

        /* renamed from: a */
        final /* synthetic */ StatusItemBinder f130319a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: b */
        public void mo122809b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52643c(StatusItemBinder bVar) {
            this.f130319a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: a */
        public void mo122808a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            ((IStatusDependency) this.f130319a.mo179589a()).mo179774b(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusItemBinder(IStatusDependency aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f.b$d */
    public static final class View$OnClickListenerC52644d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StatusItemBinder f130320a;

        /* renamed from: b */
        final /* synthetic */ View f130321b;

        /* renamed from: c */
        final /* synthetic */ StatusItemViewData f130322c;

        View$OnClickListenerC52644d(StatusItemBinder bVar, View view, StatusItemViewData cVar) {
            this.f130320a = bVar;
            this.f130321b = view;
            this.f130322c = cVar;
        }

        public final void onClick(View view) {
            UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) this.f130321b.findViewById(R.id.mUserStatus);
            Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout, "view.mUserStatus");
            UserStatusLinearLayout userStatusLinearLayout2 = (UserStatusLinearLayout) this.f130321b.findViewById(R.id.mUserStatus);
            Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout2, "view.mUserStatus");
            int maxLines = userStatusLinearLayout2.getMaxLines();
            int i = 1;
            if (maxLines <= 1) {
                i = 10;
            }
            userStatusLinearLayout.setMaxLines(i);
            ((UserStatusLinearLayout) this.f130321b.findViewById(R.id.mUserStatus)).mo201155a(this.f130322c.mo179922b(), this.f130320a.f130317a, UIUtils.getDrawable(((IStatusDependency) this.f130320a.mo179589a()).mo179591d(), this.f130322c.mo179923c()));
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((IStatusDependency) mo179589a()).mo179591d()).inflate(R.layout.status_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        ((UserStatusLinearLayout) inflate.findViewById(R.id.mUserStatus)).setIconGravity(48);
        if (DesktopUtil.m144301a(((IStatusDependency) mo179589a()).mo179591d())) {
            View findViewById = inflate.findViewById(R.id.mLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.mLine");
            TextView textView = (TextView) inflate.findViewById(R.id.mTypeNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
            mo179843a(inflate, findViewById, textView);
        }
        return new StatusItemViewHolder(inflate);
    }

    /* renamed from: b */
    private final void m204027b(View view, StatusItemViewData cVar) {
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setShowArrow(true);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setTextMaxWidth(UIHelper.dp2px((float) 252));
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).mo201157b();
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setTextSize(14);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setTextColor(UIHelper.getColor(R.color.lkui_N500));
        UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) view.findViewById(R.id.mUserStatus);
        Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout, "view.mUserStatus");
        userStatusLinearLayout.setMaxLines(1);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setOnURLClickListener(new C52642b(this));
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setOnPhoneClickListener(new C52643c(this));
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setOnClickListener(new View$OnClickListenerC52644d(this, view, cVar));
        ak.m95026a((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus), UIHelper.dp2px(8.0f));
        view.setOnClickListener(View$OnClickListenerC52645e.f130323a);
    }

    /* renamed from: a */
    public void mo179592a(View view, StatusItemViewData cVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
        mo179844a(textView, cVar.mo179856a());
        m204027b(view, cVar);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setNeedToRecognize(true);
        if (cVar.mo179922b() != null) {
            if (C59170l.m229843a().mo201118a(Intrinsics.stringPlus(this.f130317a, cVar.mo179922b())) == null) {
                ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).mo201154a(cVar.mo179922b(), UIUtils.getDrawable(((IStatusDependency) mo179589a()).mo179591d(), cVar.mo179923c()));
            } else {
                ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).mo201155a(cVar.mo179922b(), this.f130317a, UIUtils.getDrawable(((IStatusDependency) mo179589a()).mo179591d(), cVar.mo179923c()));
            }
            if (cVar.mo179924e() == null) {
                ((IStatusDependency) mo179589a()).mo179775c(cVar.mo179922b());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.profile.func.user_profile.infos.BaseInfoBinder
    /* renamed from: a */
    public void mo179843a(View view, View view2, View view3) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(view2, "lineView");
        Intrinsics.checkParameterIsNotNull(view3, "labelView");
        super.mo179843a(view, view2, view3);
        UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) view.findViewById(R.id.mUserStatus);
        Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout, "rootView.mUserStatus");
        ViewGroup.LayoutParams layoutParams = userStatusLinearLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, mo179846b(), marginLayoutParams.rightMargin, mo179846b());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
