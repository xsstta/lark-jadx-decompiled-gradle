package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.content.Context;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorPresenter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorDialog;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneBaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", ShareHitPoint.f121868c, "", "timezoneId", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "middleStatus", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.j */
public final class TimeZoneSelectorDialog extends TimeZoneBaseDialog {
    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.DragShrinkDialog
    /* renamed from: e */
    public void mo156942e() {
        mo157040f().mo157058c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneSelectorDialog(Context context, int i, String str, String str2) {
        super(context, i, str, str2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str2, "timezoneId");
        mo157040f().mo157056a(new TimeZoneSelectorPresenter.Dependency(this) {
            /* class com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorDialog.C441181 */

            /* renamed from: a */
            final /* synthetic */ TimeZoneSelectorDialog f112042a;

            @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorPresenter.Dependency
            /* renamed from: a */
            public void mo157049a() {
                this.f112042a.mo156939b();
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorPresenter.Dependency
            /* renamed from: b */
            public void mo157051b() {
                this.f112042a.mo156940c();
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorPresenter.Dependency
            /* renamed from: c */
            public void mo157052c() {
                this.f112042a.mo156937a();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f112042a = r1;
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorPresenter.Dependency
            /* renamed from: a */
            public void mo157050a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
                Iterator<T> it = this.f112042a.mo157041g().iterator();
                while (it.hasNext()) {
                    it.next().mo157017a(str);
                }
            }
        });
    }
}
