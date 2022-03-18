package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendResponse;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.utils.C43762e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.undo.UndoBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Date;

public class ScheduleSendCancelProcess extends AbstractC43975a<String> implements Parcelable {
    public static final Parcelable.Creator<ScheduleSendCancelProcess> CREATOR = new Parcelable.Creator<ScheduleSendCancelProcess>() {
        /* class com.ss.android.lark.mail.impl.view.undo.ScheduleSendCancelProcess.C439643 */

        /* renamed from: a */
        public ScheduleSendCancelProcess[] newArray(int i) {
            return new ScheduleSendCancelProcess[i];
        }

        /* renamed from: a */
        public ScheduleSendCancelProcess createFromParcel(Parcel parcel) {
            return new ScheduleSendCancelProcess(parcel);
        }
    };

    /* renamed from: a */
    public final String f111551a;

    /* renamed from: g */
    private final long f111552g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43977b
    /* renamed from: a */
    public long mo156428a() {
        return 7;
    }

    public int describeContents() {
        return 0;
    }

    protected ScheduleSendCancelProcess(Parcel parcel) {
        this(parcel.readString(), parcel.readLong());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111551a);
        parcel.writeLong(this.f111552g);
    }

    /* renamed from: b */
    public void mo156429a(final Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            C42187a.m168518d();
            C42176e.m168344a().mo152224a(new ArrayList(), str, new AbstractC41870b<MailCancelScheduleSendResponse>() {
                /* class com.ss.android.lark.mail.impl.view.undo.ScheduleSendCancelProcess.C439632 */

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                /* renamed from: a */
                public void mo150434a(ErrorResult errorResult) {
                    MailToast.m173697a((int) R.string.Mail_SendLater_CancelFailure);
                }

                /* renamed from: a */
                public void mo150435a(MailCancelScheduleSendResponse mailCancelScheduleSendResponse) {
                    MailToast.m173697a((int) R.string.Mail_SendLater_Cancelsucceed);
                    if (ScheduleSendCancelProcess.this.f111611f != null) {
                        C43849u.m173826a(ScheduleSendCancelProcess.this.f111611f);
                    } else {
                        ScheduleSendCancelProcess scheduleSendCancelProcess = ScheduleSendCancelProcess.this;
                        scheduleSendCancelProcess.mo156521a(context, scheduleSendCancelProcess.f111551a);
                    }
                    C42330c.m169076e();
                }
            });
        }
    }

    public ScheduleSendCancelProcess(String str, long j) {
        super(str, C43819s.m173686a(R.string.Mail_SendLater_ScheduledForDate, "Time", C43762e.m173476a(new Date(j), C41816b.m166115a().mo150116F().mo150192b(), true)), C43819s.m173684a((int) R.string.Mail_Toast_Undo));
        this.f111551a = str;
        this.f111552g = j;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43977b
    /* renamed from: a */
    public boolean mo156448a(UndoBar.C43971a<String> aVar, Runnable runnable) {
        final Context a = aVar.mo156496a();
        UDToastImpl j = UDToast.build(a).mo91643a(UIHelper.getString(R.string.Mail_SendLater_SuccessfullyScheduled)).mo91644a(this.f111609d, new UDToast.OnActionClickListener() {
            /* class com.ss.android.lark.mail.impl.view.undo.ScheduleSendCancelProcess.C439621 */

            @Override // com.larksuite.component.universe_design.toast.UDToast.OnActionClickListener
            public void onActionClick(UDToastImpl dVar) {
                ScheduleSendCancelProcess scheduleSendCancelProcess = ScheduleSendCancelProcess.this;
                scheduleSendCancelProcess.mo156429a(a, scheduleSendCancelProcess.f111551a);
                dVar.cancel();
            }
        }).mo91647b(R.drawable.ud_icon_yes_outlined).mo91640a(mo156428a() * 1000).mo91655j();
        if (j != null) {
            j.show();
        }
        if (j == null || !j.mo91668c()) {
            return false;
        }
        return true;
    }
}
