package com.ss.android.lark.contact.impl.invite;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.dto.GetInactiveParentsResponse;
import com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract;
import com.ss.android.lark.contact.impl.service.SchoolParentService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J>\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J,\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011H\u0016J4\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IModel;", "()V", "mIsHasMore", "", "mOffset", "", "getCurrentCursor", "getInactiveParentList", "", "departmentId", "", "chatId", "limit", "offset", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", "isHasMore", "notifyAll", "notifySingle", "id", "updateParameter", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.invite.c */
public final class InviteInactiveParentListModel extends BaseModel implements IInviteInactiveParentListContract.IModel {

    /* renamed from: a */
    public static final Companion f92943a = new Companion(null);

    /* renamed from: b */
    private int f92944b;

    /* renamed from: c */
    private boolean f92945c = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListModel$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IModel
    /* renamed from: a */
    public boolean mo132245a() {
        return this.f92945c;
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IModel
    /* renamed from: a */
    public void mo132241a(int i, boolean z) {
        this.f92944b = i;
        this.f92945c = z;
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IModel
    /* renamed from: a */
    public void mo132243a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        SchoolParentService a = SchoolParentService.f92889a.mo132192a();
        if (a != null) {
            a.mo132190a(str, str2, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IModel
    /* renamed from: a */
    public void mo132244a(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str3, "id");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str3);
        SchoolParentService a = SchoolParentService.f92889a.mo132192a();
        if (a != null) {
            a.mo132191a(str, str2, arrayList, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IModel
    /* renamed from: a */
    public void mo132242a(String str, String str2, int i, int i2, IGetDataCallback<GetInactiveParentsResponse> iGetDataCallback) {
        SchoolParentService a = SchoolParentService.f92889a.mo132192a();
        if (a != null) {
            a.mo132189a(str, str2, i, i2, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }
}
