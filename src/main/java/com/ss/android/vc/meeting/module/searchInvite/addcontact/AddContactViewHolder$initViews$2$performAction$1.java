package com.ss.android.vc.meeting.module.searchInvite.addcontact;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.module.searchInvite.addcontact.AddContactViewHolder;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/vc/meeting/module/searchInvite/addcontact/AddContactViewHolder$initViews$2$performAction$1", "Lcom/ss/android/vc/service/XIGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddContactViewHolder$initViews$2$performAction$1 extends XIGetDataCallback<Boolean> {

    /* renamed from: a */
    final /* synthetic */ AddContactViewHolder.C62917b f158465a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.addcontact.AddContactViewHolder$initViews$2$performAction$1$a */
    public static final class RunnableC62914a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ErrorResult f158466a;

        RunnableC62914a(ErrorResult errorResult) {
            this.f158466a = errorResult;
        }

        public final void run() {
            C60738ac.m236029a(this.f158466a.getDisplayMsg(UIHelper.getString(R.string.View_N_CouldntAddContact)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.addcontact.AddContactViewHolder$initViews$2$performAction$1$b */
    public static final class RunnableC62915b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AddContactViewHolder$initViews$2$performAction$1 f158467a;

        RunnableC62915b(AddContactViewHolder$initViews$2$performAction$1 addContactViewHolder$initViews$2$performAction$1) {
            this.f158467a = addContactViewHolder$initViews$2$performAction$1;
        }

        public final void run() {
            C60738ac.m236037c((int) R.string.View_G_RequestSentShort);
            this.f158467a.f158465a.f158483a.mo217417d().dismiss();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    AddContactViewHolder$initViews$2$performAction$1(AddContactViewHolder.C62917b bVar) {
        this.f158465a = bVar;
    }

    @XMethod
    public void onSuccess(Boolean bool) {
        C60735ab.m236001a(new RunnableC62915b(this));
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        C60700b.m235864f("AddContactViewHolder", "[sendFriendRequest]", "error: " + errorResult);
        C60735ab.m236001a(new RunnableC62914a(errorResult));
    }
}
