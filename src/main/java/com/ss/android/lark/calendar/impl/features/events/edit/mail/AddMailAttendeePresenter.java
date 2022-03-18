package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import android.content.Intent;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u000f\u0010B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeModelApi;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewApi;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewAction;", "view", "model", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewApi;Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeModelApi;)V", "mActivityDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter$ActivityDependency;", "getViewAction", "setActivityDependency", "", "activityDependency", "ActivityDependency", "addMailAttendeeViewAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.d */
public final class AddMailAttendeePresenter extends BasePresenterCalendar<AddMailAttendeeContract.IAddMailAttendeeModelApi, AddMailAttendeeContract.IAddMailAttendeeViewApi, AddMailAttendeeContract.IAddMailAttendeeViewData, AddMailAttendeeContract.IAddMailAttendeeViewAction> {

    /* renamed from: a */
    public ActivityDependency f81229a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter$ActivityDependency;", "", "finishActivityWithIntent", "", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.d$a */
    public interface ActivityDependency {
        /* renamed from: a */
        void mo116141a(Intent intent);
    }

    /* renamed from: a */
    public AddMailAttendeeContract.IAddMailAttendeeViewAction mo109713b() {
        return new addMailAttendeeViewAction();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter$addMailAttendeeViewAction;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeePresenter;)V", "onAddEmail", "", "addItem", "", "onDeleteEmail", "deleteItem", "onPerformAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.d$b */
    public final class addMailAttendeeViewAction implements AddMailAttendeeContract.IAddMailAttendeeViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeViewAction
        /* renamed from: a */
        public void mo116163a() {
            Intent putExtra = new Intent().putExtra("add_external_emails", ((AddMailAttendeeContract.IAddMailAttendeeModelApi) AddMailAttendeePresenter.this.mo118652t()).mo116161b()).putExtra("delete_external_emails", ((AddMailAttendeeContract.IAddMailAttendeeModelApi) AddMailAttendeePresenter.this.mo118652t()).mo116159a());
            Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent().putExtra(\n     …l.getDeleteAccountList())");
            ActivityDependency aVar = AddMailAttendeePresenter.this.f81229a;
            if (aVar != null) {
                aVar.mo116141a(putExtra);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public addMailAttendeeViewAction() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeViewAction
        /* renamed from: a */
        public void mo116164a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "deleteItem");
            ((AddMailAttendeeContract.IAddMailAttendeeModelApi) AddMailAttendeePresenter.this.mo118652t()).mo116160a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract.IAddMailAttendeeViewAction
        /* renamed from: b */
        public void mo116165b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "addItem");
            ((AddMailAttendeeContract.IAddMailAttendeeModelApi) AddMailAttendeePresenter.this.mo118652t()).mo116162b(str);
        }
    }

    /* renamed from: a */
    public final void mo116170a(ActivityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        this.f81229a = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddMailAttendeePresenter(AddMailAttendeeContract.IAddMailAttendeeViewApi cVar, AddMailAttendeeContract.IAddMailAttendeeModelApi aVar) {
        super(cVar, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
    }
}
