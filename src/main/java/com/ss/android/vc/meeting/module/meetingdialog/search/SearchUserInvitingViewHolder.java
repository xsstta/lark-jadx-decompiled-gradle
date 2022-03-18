package com.ss.android.vc.meeting.module.meetingdialog.search;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlMenuItemLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010-\u001a\u00020.J\u001a\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u001e2\b\u00102\u001a\u0004\u0018\u00010\u0014R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/search/SearchUserInvitingViewHolder;", "", "mActivity", "Landroid/app/Activity;", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "cancelCallingView", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlMenuItemLayout;", "getCancelCallingView", "()Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlMenuItemLayout;", "setCancelCallingView", "(Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlMenuItemLayout;)V", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "(Landroid/app/Activity;)V", "mClickAction", "Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;", "getMClickAction", "()Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;", "setMClickAction", "(Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;)V", "getMDialog", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "setMDialog", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "mItem", "Lcom/ss/android/vc/dto/SearchParticipantInfo;", "getMItem", "()Lcom/ss/android/vc/dto/SearchParticipantInfo;", "setMItem", "(Lcom/ss/android/vc/dto/SearchParticipantInfo;)V", "getMMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMMeeting", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "userNameTextView", "Landroid/widget/TextView;", "getUserNameTextView", "()Landroid/widget/TextView;", "setUserNameTextView", "(Landroid/widget/TextView;)V", "createView", "Landroid/view/View;", "init", "", "item", "clickAction", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.f */
public final class SearchUserInvitingViewHolder {

    /* renamed from: a */
    public ControlMenuItemLayout f156265a;

    /* renamed from: b */
    public TextView f156266b;

    /* renamed from: c */
    private SearchParticipantInfo f156267c;

    /* renamed from: d */
    private AbstractC62201a f156268d;

    /* renamed from: e */
    private Activity f156269e;

    /* renamed from: f */
    private C61303k f156270f;

    /* renamed from: g */
    private AbstractC61222a f156271g;

    /* renamed from: a */
    public final AbstractC62201a mo215142a() {
        return this.f156268d;
    }

    /* renamed from: c */
    public final AbstractC61222a mo215145c() {
        return this.f156271g;
    }

    /* renamed from: b */
    public final View mo215144b() {
        View inflate = LayoutInflater.from(this.f156269e).inflate(R.layout.dialog_search_user_inviting, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mAct…arch_user_inviting, null)");
        View findViewById = inflate.findViewById(R.id.cancel_calling);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.cancel_calling)");
        this.f156265a = (ControlMenuItemLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.participant_name_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.participant_name_text)");
        this.f156266b = (TextView) findViewById2;
        return inflate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.f$a */
    static final class View$OnClickListenerC62204a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchUserInvitingViewHolder f156272a;

        /* renamed from: b */
        final /* synthetic */ SearchParticipantInfo f156273b;

        View$OnClickListenerC62204a(SearchUserInvitingViewHolder fVar, SearchParticipantInfo searchParticipantInfo) {
            this.f156272a = fVar;
            this.f156273b = searchParticipantInfo;
        }

        public final void onClick(View view) {
            AbstractC62201a a = this.f156272a.mo215142a();
            if (a != null) {
                a.mo215130a(this.f156273b);
            }
            this.f156272a.mo215145c().dismiss();
        }
    }

    /* renamed from: a */
    public final void mo215143a(SearchParticipantInfo searchParticipantInfo, AbstractC62201a aVar) {
        String str;
        this.f156267c = searchParticipantInfo;
        this.f156268d = aVar;
        TextView textView = this.f156266b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameTextView");
        }
        SearchParticipantInfo searchParticipantInfo2 = this.f156267c;
        if (searchParticipantInfo2 != null) {
            str = searchParticipantInfo2.getTitle();
        } else {
            str = null;
        }
        textView.setText(Intrinsics.stringPlus(str, C60773o.m236119a((int) R.string.View_M_CallingParentheses)));
        ControlMenuItemLayout controlMenuItemLayout = this.f156265a;
        if (controlMenuItemLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelCallingView");
        }
        controlMenuItemLayout.setOnClickListener(new View$OnClickListenerC62204a(this, searchParticipantInfo));
    }

    public SearchUserInvitingViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(kVar, "mMeeting");
        Intrinsics.checkParameterIsNotNull(aVar, "mDialog");
        this.f156269e = activity;
        this.f156270f = kVar;
        this.f156271g = aVar;
    }
}
