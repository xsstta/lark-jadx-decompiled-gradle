package com.ss.android.vc.meeting.module.meetingdialog.search;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlMenuItemLayout;
import com.ss.android.vc.statistics.event.cf;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u00100\u001a\u000201J\u001a\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u001e2\b\u00105\u001a\u0004\u0018\u00010\u0014J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00069"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/search/SearchUserInLobbyViewHolder;", "", "mActivity", "Landroid/app/Activity;", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "addFromLobbyView", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlMenuItemLayout;", "getAddFromLobbyView", "()Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlMenuItemLayout;", "setAddFromLobbyView", "(Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlMenuItemLayout;)V", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "(Landroid/app/Activity;)V", "mClickAction", "Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;", "getMClickAction", "()Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;", "setMClickAction", "(Lcom/ss/android/vc/meeting/module/meetingdialog/search/ISearchUserClickAction;)V", "getMDialog", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "setMDialog", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "mItem", "Lcom/ss/android/vc/dto/SearchParticipantInfo;", "getMItem", "()Lcom/ss/android/vc/dto/SearchParticipantInfo;", "setMItem", "(Lcom/ss/android/vc/dto/SearchParticipantInfo;)V", "getMMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMMeeting", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "removeFromLobbyView", "getRemoveFromLobbyView", "setRemoveFromLobbyView", "userNameTextView", "Landroid/widget/TextView;", "getUserNameTextView", "()Landroid/widget/TextView;", "setUserNameTextView", "(Landroid/widget/TextView;)V", "createView", "Landroid/view/View;", "init", "", "item", "clickAction", "sendEvent", "action", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.c */
public final class SearchUserInLobbyViewHolder {

    /* renamed from: a */
    public ControlMenuItemLayout f156253a;

    /* renamed from: b */
    public ControlMenuItemLayout f156254b;

    /* renamed from: c */
    public TextView f156255c;

    /* renamed from: d */
    private SearchParticipantInfo f156256d;

    /* renamed from: e */
    private AbstractC62201a f156257e;

    /* renamed from: f */
    private Activity f156258f;

    /* renamed from: g */
    private C61303k f156259g;

    /* renamed from: h */
    private AbstractC61222a f156260h;

    /* renamed from: a */
    public final SearchParticipantInfo mo215133a() {
        return this.f156256d;
    }

    /* renamed from: b */
    public final AbstractC62201a mo215136b() {
        return this.f156257e;
    }

    /* renamed from: d */
    public final C61303k mo215138d() {
        return this.f156259g;
    }

    /* renamed from: e */
    public final AbstractC61222a mo215139e() {
        return this.f156260h;
    }

    /* renamed from: c */
    public final View mo215137c() {
        View inflate = LayoutInflater.from(this.f156258f).inflate(R.layout.dialog_search_user_in_lobby, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mAct…arch_user_in_lobby, null)");
        View findViewById = inflate.findViewById(R.id.add_from_lobby);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.add_from_lobby)");
        this.f156253a = (ControlMenuItemLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.remove_from_lobby);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.remove_from_lobby)");
        this.f156254b = (ControlMenuItemLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.participant_name_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.participant_name_text)");
        this.f156255c = (TextView) findViewById3;
        return inflate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.c$a */
    static final class View$OnClickListenerC62202a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchUserInLobbyViewHolder f156261a;

        View$OnClickListenerC62202a(SearchUserInLobbyViewHolder cVar) {
            this.f156261a = cVar;
        }

        public final void onClick(View view) {
            VCLobbyParticipant vCLobbyParticipant;
            this.f156261a.mo215135a("admit");
            MeetingOnTheCallEvent2.f160846b.mo220311a().mo220306a("admit", "none", this.f156261a.mo215138d());
            AbstractC62201a b = this.f156261a.mo215136b();
            if (b != null) {
                SearchParticipantInfo a = this.f156261a.mo215133a();
                if (a != null) {
                    vCLobbyParticipant = a.getLobbyParticipant();
                } else {
                    vCLobbyParticipant = null;
                }
                b.mo215131a(vCLobbyParticipant);
            }
            this.f156261a.mo215139e().dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.c.c$b */
    static final class View$OnClickListenerC62203b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchUserInLobbyViewHolder f156262a;

        View$OnClickListenerC62203b(SearchUserInLobbyViewHolder cVar) {
            this.f156262a = cVar;
        }

        public final void onClick(View view) {
            VCLobbyParticipant vCLobbyParticipant;
            this.f156262a.mo215135a("remove");
            MeetingOnTheCallEvent2.f160846b.mo220311a().mo220306a("remove", "none", this.f156262a.mo215138d());
            AbstractC62201a b = this.f156262a.mo215136b();
            if (b != null) {
                SearchParticipantInfo a = this.f156262a.mo215133a();
                if (a != null) {
                    vCLobbyParticipant = a.getLobbyParticipant();
                } else {
                    vCLobbyParticipant = null;
                }
                b.mo215132b(vCLobbyParticipant);
            }
            this.f156262a.mo215139e().dismiss();
        }
    }

    /* renamed from: a */
    public final void mo215135a(String str) {
        String str2;
        VCLobbyParticipant lobbyParticipant;
        ByteviewUser user;
        VCLobbyParticipant lobbyParticipant2;
        ByteviewUser user2;
        C61303k kVar = this.f156259g;
        SearchParticipantInfo searchParticipantInfo = this.f156256d;
        String str3 = null;
        if (searchParticipantInfo == null || (lobbyParticipant2 = searchParticipantInfo.getLobbyParticipant()) == null || (user2 = lobbyParticipant2.getUser()) == null) {
            str2 = null;
        } else {
            str2 = user2.getUserId();
        }
        SearchParticipantInfo searchParticipantInfo2 = this.f156256d;
        if (!(searchParticipantInfo2 == null || (lobbyParticipant = searchParticipantInfo2.getLobbyParticipant()) == null || (user = lobbyParticipant.getUser()) == null)) {
            str3 = user.getDeviceId();
        }
        cf.m250279a(kVar, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo215134a(SearchParticipantInfo searchParticipantInfo, AbstractC62201a aVar) {
        String str;
        this.f156256d = searchParticipantInfo;
        this.f156257e = aVar;
        TextView textView = this.f156255c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameTextView");
        }
        StringBuilder sb = new StringBuilder();
        SearchParticipantInfo searchParticipantInfo2 = this.f156256d;
        if (searchParticipantInfo2 != null) {
            str = searchParticipantInfo2.getTitle();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("(");
        sb.append(C60773o.m236119a((int) R.string.View_M_WaitingEllipsis));
        sb.append(")");
        textView.setText(sb.toString());
        ControlMenuItemLayout controlMenuItemLayout = this.f156253a;
        if (controlMenuItemLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addFromLobbyView");
        }
        controlMenuItemLayout.setOnClickListener(new View$OnClickListenerC62202a(this));
        ControlMenuItemLayout controlMenuItemLayout2 = this.f156254b;
        if (controlMenuItemLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("removeFromLobbyView");
        }
        controlMenuItemLayout2.setOnClickListener(new View$OnClickListenerC62203b(this));
    }

    public SearchUserInLobbyViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(kVar, "mMeeting");
        Intrinsics.checkParameterIsNotNull(aVar, "mDialog");
        this.f156258f = activity;
        this.f156259g = kVar;
        this.f156260h = aVar;
    }
}
