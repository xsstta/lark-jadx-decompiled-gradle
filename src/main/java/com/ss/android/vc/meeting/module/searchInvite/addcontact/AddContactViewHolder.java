package com.ss.android.vc.meeting.module.searchInvite.addcontact;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.dependency.AbstractC60895k;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event.AddContactRequestEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/ss/android/vc/meeting/module/searchInvite/addcontact/AddContactViewHolder;", "", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "getActivity", "()Landroid/app/Activity;", "mAliasNameEt", "Landroid/widget/EditText;", "getMDialog", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "mReasonEdit", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "initViews", "", "rootView", "presetAliasHint", "alias", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.searchInvite.addcontact.b */
public final class AddContactViewHolder {

    /* renamed from: a */
    public EditText f158475a;

    /* renamed from: b */
    public EditText f158476b;

    /* renamed from: c */
    private String f158477c = "";

    /* renamed from: d */
    private CommonTitleBar f158478d;

    /* renamed from: e */
    private final Activity f158479e;

    /* renamed from: f */
    private final C61303k f158480f;

    /* renamed from: g */
    private final AbstractC61222a f158481g;

    /* renamed from: a */
    public final String mo217413a() {
        return this.f158477c;
    }

    /* renamed from: c */
    public final C61303k mo217416c() {
        return this.f158480f;
    }

    /* renamed from: d */
    public final AbstractC61222a mo217417d() {
        return this.f158481g;
    }

    /* renamed from: b */
    public final View mo217415b() {
        View inflate = LayoutInflater.from(this.f158479e).inflate(R.layout.dialog_add_contact, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        m246346a(inflate);
        return inflate;
    }

    /* renamed from: a */
    public final void mo217414a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f158477c = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.addcontact.b$a */
    public static final class View$OnClickListenerC62916a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddContactViewHolder f158482a;

        View$OnClickListenerC62916a(AddContactViewHolder bVar) {
            this.f158482a = bVar;
        }

        public final void onClick(View view) {
            this.f158482a.mo217417d().dismiss();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m246345a(AddContactViewHolder bVar) {
        EditText editText = bVar.f158475a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReasonEdit");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditText m246347b(AddContactViewHolder bVar) {
        EditText editText = bVar.f158476b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAliasNameEt");
        }
        return editText;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/searchInvite/addcontact/AddContactViewHolder$initViews$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.addcontact.b$b */
    public static final class C62917b extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ AddContactViewHolder f158483a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            AddContactRequestEvent.m249939a();
            IVideoChatDependency dependency = VideoChatModule.getDependency();
            Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModule.getDependency()");
            AbstractC60895k contactDependency = dependency.getContactDependency();
            String a = this.f158483a.mo217413a();
            String obj = AddContactViewHolder.m246345a(this.f158483a).getText().toString();
            String obj2 = AddContactViewHolder.m246347b(this.f158483a).getText().toString();
            VideoChat e = this.f158483a.mo217416c().mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "meeting.videoChat.videoChatSettings");
            String topic = videoChatSettings.getTopic();
            VideoChat e2 = this.f158483a.mo217416c().mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "meeting.videoChat");
            String id = e2.getId();
            VideoChat e3 = this.f158483a.mo217416c().mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "meeting.videoChat");
            contactDependency.sendFriendRequest(a, obj, obj2, topic, id, e3.getSponsorUser(), new AddContactViewHolder$initViews$2$performAction$1(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62917b(AddContactViewHolder bVar, String str, int i) {
            super(str, i);
            this.f158483a = bVar;
        }
    }

    /* renamed from: a */
    private final void m246346a(View view) {
        View findViewById = view.findViewById(R.id.mReasonEdit);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.mReasonEdit)");
        this.f158475a = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.mAliasNameEt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.mAliasNameEt)");
        this.f158476b = (EditText) findViewById2;
        View findViewById3 = view.findViewById(R.id.mTitleBar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.mTitleBar)");
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById3;
        this.f158478d = commonTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.getLeftText().setOnClickListener(new View$OnClickListenerC62916a(this));
        CommonTitleBar commonTitleBar2 = this.f158478d;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.addAction(new C62917b(this, C57582a.m223604a((Context) this.f158479e, (int) R.string.View_G_Send), R.color.in_meeting_blue_text_selector));
        CommonTitleBar commonTitleBar3 = this.f158478d;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar3.setTitle(R.string.View_M_AddContactNow);
    }

    public AddContactViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "mDialog");
        this.f158479e = activity;
        this.f158480f = kVar;
        this.f158481g = aVar;
    }
}
