package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\u0018\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\f\u0010\u0010\u001a\u00060\u0011R\u00020\u0000H\u0016J \u0010\u0012\u001a\u00020\f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeModelApi;", "()V", "mAddAccountList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mAttendeeAccountList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "mDeleteAccountList", "create", "", "destroy", "getAddAccountList", "getDeleteAccountList", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel$addMailAttendeeViewData;", "setAttendeeAccounts", "attendeeAccountList", "updateAddEmail", "addItem", "updateDeleteEmail", "deleteItem", "addMailAttendeeViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.c */
public final class AddMailAttendeeModel extends BaseModel implements AddMailAttendeeContract.IAddMailAttendeeModelApi {

    /* renamed from: a */
    public ArrayList<AddMailAttendeeData> f81225a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<String> f81226b = new ArrayList<>();

    /* renamed from: c */
    private ArrayList<String> f81227c = new ArrayList<>();

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeModelApi
    /* renamed from: a */
    public ArrayList<String> mo116159a() {
        return this.f81226b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeModelApi
    /* renamed from: b */
    public ArrayList<String> mo116161b() {
        return this.f81227c;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel$addMailAttendeeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeModel;)V", "getAttendeeEmails", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.c$a */
    public final class addMailAttendeeViewData implements AddMailAttendeeContract.IAddMailAttendeeViewData {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeViewData
        /* renamed from: a */
        public ArrayList<AddMailAttendeeData> mo116166a() {
            return AddMailAttendeeModel.this.f81225a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public addMailAttendeeViewData() {
        }
    }

    /* renamed from: c */
    public addMailAttendeeViewData mo109793f() {
        return new addMailAttendeeViewData();
    }

    /* renamed from: a */
    public void mo116167a(ArrayList<AddMailAttendeeData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeAccountList");
        this.f81225a = arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeModelApi
    /* renamed from: a */
    public void mo116160a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "deleteItem");
        if (this.f81227c.contains(str)) {
            this.f81227c.remove(str);
        } else {
            this.f81226b.add(str);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeModelApi
    /* renamed from: b */
    public void mo116162b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "addItem");
        if (this.f81226b.contains(str)) {
            this.f81226b.remove(str);
        } else {
            this.f81227c.add(str);
        }
    }
}
