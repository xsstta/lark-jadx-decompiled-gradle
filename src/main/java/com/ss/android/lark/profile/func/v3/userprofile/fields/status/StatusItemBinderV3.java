package com.ss.android.lark.profile.func.v3.userprofile.fields.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/StatusItemBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/StatusItemViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/IStatusDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/IStatusDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "initStatus", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.j.b */
public final class StatusItemBinderV3 extends BaseInfoBinderV3<StatusItemViewDataV3, IStatusDependencyV3> {

    /* renamed from: a */
    public static final Companion f130576a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/StatusItemBinderV3$Companion;", "", "()V", "USER_STATUS_MAX_TEXT_WIDTH", "", "USER_STATUS_TEXT_SIZE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.j.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/status/StatusItemBinderV3$initStatus$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "url", "", "onURLLongClick", "", "text", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.j.b$b */
    public static final class C52793b implements LinkEmojiTextView.AbstractC58525j {

        /* renamed from: a */
        final /* synthetic */ StatusItemBinderV3 f130577a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: b */
        public boolean mo122807b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52793b(StatusItemBinderV3 bVar) {
            this.f130577a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: a */
        public void mo122806a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "url");
            ((IStatusDependencyV3) this.f130577a.mo180255b()).mo180301a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/status/StatusItemBinderV3$initStatus$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IPhoneStringClickListener;", "onPhoneClick", "", "view", "Landroid/view/View;", "phoneNumber", "", "onPhoneLongClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.j.b$c */
    public static final class C52794c implements LinkEmojiTextView.AbstractC58524i {

        /* renamed from: a */
        final /* synthetic */ StatusItemBinderV3 f130578a;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: b */
        public void mo122809b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52794c(StatusItemBinderV3 bVar) {
            this.f130578a = bVar;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
        /* renamed from: a */
        public void mo122808a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            ((IStatusDependencyV3) this.f130578a.mo180255b()).mo180302b(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusItemBinderV3(IStatusDependencyV3 aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.status_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        ((UserStatusLinearLayout) inflate.findViewById(R.id.mUserStatus)).setIconGravity(48);
        return new StatusItemViewHolderV3(inflate);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.j.b$d */
    public static final class View$OnClickListenerC52795d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f130579a;

        /* renamed from: b */
        final /* synthetic */ StatusItemViewDataV3 f130580b;

        View$OnClickListenerC52795d(View view, StatusItemViewDataV3 cVar) {
            this.f130579a = view;
            this.f130580b = cVar;
        }

        public final void onClick(View view) {
            UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) this.f130579a.findViewById(R.id.mUserStatus);
            Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout, "view.mUserStatus");
            UserStatusLinearLayout userStatusLinearLayout2 = (UserStatusLinearLayout) this.f130579a.findViewById(R.id.mUserStatus);
            Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout2, "view.mUserStatus");
            int maxLines = userStatusLinearLayout2.getMaxLines();
            int i = 1;
            if (maxLines <= 1) {
                i = 10;
            }
            userStatusLinearLayout.setMaxLines(i);
            Context context = this.f130579a.getContext();
            if (context != null) {
                ((UserStatusLinearLayout) this.f130579a.findViewById(R.id.mUserStatus)).mo201154a(this.f130580b.mo180334a(), UIUtils.getDrawable(context, this.f130580b.mo180335b()));
            }
        }
    }

    /* renamed from: a */
    private final void m204437a(View view, StatusItemViewDataV3 cVar) {
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setShowArrow(true);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setTextMaxWidth(UIHelper.dp2px((float) 252));
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).mo201157b();
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setTextSize(16);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setTextColor(UIHelper.getColor(R.color.text_link_normal));
        UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) view.findViewById(R.id.mUserStatus);
        Intrinsics.checkExpressionValueIsNotNull(userStatusLinearLayout, "view.mUserStatus");
        userStatusLinearLayout.setMaxLines(1);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setOnURLClickListener(new C52793b(this));
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setOnPhoneClickListener(new C52794c(this));
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setOnClickListener(new View$OnClickListenerC52795d(view, cVar));
        ak.m95026a((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus), UIHelper.dp2px(8.0f));
        view.setOnClickListener(null);
    }

    /* renamed from: a */
    public void mo180237a(View view, StatusItemViewDataV3 cVar, boolean z) {
        Context context;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) view.findViewById(R.id.mTypeNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.mTypeNameTv");
        mo180252a(textView, cVar.mo180254c());
        m204437a(view, cVar);
        ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).setNeedToRecognize(true);
        if (!(cVar.mo180334a() == null || (context = view.getContext()) == null)) {
            ((UserStatusLinearLayout) view.findViewById(R.id.mUserStatus)).mo201154a(cVar.mo180334a(), UIUtils.getDrawable(context, cVar.mo180335b()));
        }
        View findViewById = view.findViewById(R.id.line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.line");
        mo180251a(findViewById, z);
    }
}
