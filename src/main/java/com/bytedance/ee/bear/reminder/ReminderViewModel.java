package com.bytedance.ee.bear.reminder;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.reminder.model.C10621b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u0010\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\fJ\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/reminder/ReminderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "getBearUrl", "mDelegate", "Lcom/bytedance/ee/bear/reminder/ReminderViewModel$IReminderDelegate;", "originReminderSettings", "Lcom/bytedance/ee/bear/reminder/model/ReminderSettings;", "getOriginReminderSettings", "closeReminder", "", "onCalendarSelect", "onCancelAllDay", "onClickConfirmQuit", "onClickContinueEdit", "onClickNoReminder", "onMonthChange", "onSelectReminderTime", "onSelectTime", "onSetAllDay", "onShowReminderPersonCountLimitToast", "saveReminder", "settings", "setActive", "setBearUrl", "setDelegate", "delegate", "setOriginReminderSettings", "IReminderDelegate", "reminder_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.reminder.d */
public class ReminderViewModel extends AbstractC1142af {
    private final C1177w<Boolean> active = new C1177w<>();
    private final C1177w<BearUrl> bearUrl = new C1177w<>();
    private IReminderDelegate mDelegate;
    private final C1177w<C10621b> originReminderSettings = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/reminder/ReminderViewModel$IReminderDelegate;", "", "onCalendarSelect", "", "onCancelAllDay", "onClickConfirmQuit", "onClickContinueEdit", "onClickNoReminder", "onClose", "onMonthChange", "onSave", "settings", "Lcom/bytedance/ee/bear/reminder/model/ReminderSettings;", "onSelectReminderTime", "onSelectTime", "onSetAllDay", "onShowReminderPersonCountLimitToast", "reminder_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.reminder.d$a */
    public interface IReminderDelegate {
        /* renamed from: a */
        void mo40157a();

        /* renamed from: a */
        void mo40158a(C10621b bVar);

        /* renamed from: b */
        void mo40159b();

        /* renamed from: c */
        void mo40160c();

        /* renamed from: d */
        void mo40161d();

        /* renamed from: e */
        void mo40162e();

        /* renamed from: f */
        void mo40163f();

        /* renamed from: g */
        void mo40164g();

        /* renamed from: h */
        void mo40165h();

        /* renamed from: i */
        void mo40166i();

        /* renamed from: j */
        void mo40167j();

        /* renamed from: k */
        void mo40168k();
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final C1177w<BearUrl> getBearUrl() {
        return this.bearUrl;
    }

    public final C1177w<C10621b> getOriginReminderSettings() {
        return this.originReminderSettings;
    }

    public final void closeReminder() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40157a();
        }
    }

    public final void onCalendarSelect() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40161d();
        }
    }

    public final void onCancelAllDay() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40160c();
        }
    }

    public final void onClickConfirmQuit() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40164g();
        }
    }

    public final void onClickContinueEdit() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40163f();
        }
    }

    public final void onClickNoReminder() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40165h();
        }
    }

    public final void onMonthChange() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40162e();
        }
    }

    public final void onSelectReminderTime() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40166i();
        }
    }

    public final void onSelectTime() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40167j();
        }
    }

    public final void onSetAllDay() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40159b();
        }
    }

    public final void onShowReminderPersonCountLimitToast() {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40168k();
        }
    }

    public final void setDelegate(IReminderDelegate aVar) {
        this.mDelegate = aVar;
    }

    public final void saveReminder(C10621b bVar) {
        IReminderDelegate aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo40158a(bVar);
        }
    }

    public final void setActive(boolean z) {
        this.active.mo5929b(Boolean.valueOf(z));
    }

    public final void setBearUrl(BearUrl bearUrl2) {
        Intrinsics.checkParameterIsNotNull(bearUrl2, "bearUrl");
        this.bearUrl.mo5929b(bearUrl2);
    }

    public final void setOriginReminderSettings(C10621b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "originReminderSettings");
        this.originReminderSettings.mo5929b(bVar);
    }
}
