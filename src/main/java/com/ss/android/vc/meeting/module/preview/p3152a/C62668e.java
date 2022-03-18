package com.ss.android.vc.meeting.module.preview.p3152a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.p3152a.C62656a;
import com.ss.android.vc.meeting.module.preview.view.MeetingNoEditText;
import com.ss.android.vc.statistics.event.al;

/* renamed from: com.ss.android.vc.meeting.module.preview.a.e */
public class C62668e extends AbstractC62715f<C62656a.AbstractC62659b.AbstractC62660a> implements C62656a.AbstractC62659b {

    /* renamed from: Q */
    protected TextView f157719Q;

    /* renamed from: R */
    protected MeetingNoEditText f157720R;

    /* renamed from: S */
    private boolean f157721S;

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: o */
    public void mo216542o() {
        super.mo216542o();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m245151F() {
        mo216675a((EditText) this.f157720R);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m245152G() {
        m245150E();
        m245149D();
    }

    @Override // com.ss.android.vc.meeting.module.preview.p3152a.C62656a.AbstractC62659b
    /* renamed from: a */
    public String mo216556a() {
        MeetingNoEditText meetingNoEditText = this.f157720R;
        if (meetingNoEditText == null) {
            return null;
        }
        return meetingNoEditText.getMeetingNo();
    }

    /* renamed from: D */
    private void m245149D() {
        if (this.f157720R != null) {
            this.f157838u.setEnabled(this.f157720R.mo216782a());
            this.f157839v.setEnabled(this.f157720R.mo216782a());
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.p3152a.C62656a.AbstractC62659b
    /* renamed from: b */
    public void mo216559b() {
        MeetingNoEditText meetingNoEditText = this.f157720R;
        if (meetingNoEditText != null) {
            if (TextUtils.isEmpty(meetingNoEditText.getText()) || this.f157803G) {
                this.f157720R.postDelayed(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.preview.p3152a.$$Lambda$e$PKV4bzqGSJ8s3yattrUcpKNoiKw */

                    public final void run() {
                        C62668e.this.m245151F();
                    }
                }, 500);
            }
        }
    }

    /* renamed from: E */
    private void m245150E() {
        this.f157719Q.setText(R.string.View_M_EnterMeetingId);
        this.f157719Q.setTextColor(C60773o.m236126d(R.color.text_placeholder));
        this.f157825h.setBackground(C60773o.m236128f(R.color.line_border_component));
        this.f157721S = false;
    }

    /* renamed from: C */
    public void mo216577C() {
        if (this.f157719Q != null && this.f157838u != null) {
            mo216537j();
            this.f157719Q.setText(R.string.View_M_InvalidMeetingId);
            this.f157719Q.setTextColor(C60773o.m236126d(R.color.function_danger_500));
            this.f157825h.setBackground(C60773o.m236128f(R.color.function_danger_500));
            this.f157838u.setEnabled(false);
            this.f157839v.setEnabled(false);
            this.f157721S = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: s */
    public void mo216579s() {
        super.mo216579s();
        if (this.f157822e != null) {
            this.f157719Q = (TextView) this.f157822e.findViewById(R.id.title_tips);
            this.f157720R = (MeetingNoEditText) this.f157822e.findViewById(R.id.meeting_number_ev);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.preview.a.e$1 */
    static /* synthetic */ class C626691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157722a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type[] r0 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.f157722a = r0
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.TENANT_IN_BLACKLIST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.f157722a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.VERSION_LOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.f157722a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.MEETING_NUMBER_INVALID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.f157722a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.PARTICIPANT_LIMIT_EXCEED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.f157722a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.MEETING_LOCKED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.f157722a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.vc.entity.response.JoinMeetingEntity$Type r1 = com.ss.android.vc.entity.response.JoinMeetingEntity.Type.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.preview.p3152a.C62668e.C626691.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: x */
    public void mo216580x() {
        super.mo216580x();
        boolean z = false;
        this.f157720R.setVisibility(0);
        this.f157825h.setVisibility(0);
        this.f157719Q.setVisibility(0);
        if (!DesktopUtil.m144301a((Context) this.f157819b)) {
            mo216690v();
        }
        this.f157720R.setMeetingNoInputListener(new MeetingNoEditText.AbstractC62775a() {
            /* class com.ss.android.vc.meeting.module.preview.p3152a.$$Lambda$e$254atJeS4pGJEdNuLLCNAztxyvw */

            @Override // com.ss.android.vc.meeting.module.preview.view.MeetingNoEditText.AbstractC62775a
            public final void onInputChanged() {
                C62668e.this.m245152G();
            }
        });
        this.f157720R.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.preview.p3152a.$$Lambda$e$I9R6uAAuH65F1tkMKPSznafRzf0 */

            public final void onFocusChange(View view, boolean z) {
                C62668e.this.m245153a((C62668e) view, (View) z);
            }
        });
        m245149D();
        if (this.f157818a.getArguments() != null) {
            String string = this.f157818a.getArguments().getString("param_meeting_no");
            if (!TextUtils.isEmpty(string)) {
                this.f157720R.setText(string);
                if (string.length() < 9) {
                    z = true;
                }
                mo216578b(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: b */
    public void mo216578b(boolean z) {
        super.mo216578b(z);
        MeetingNoEditText meetingNoEditText = this.f157720R;
        if (meetingNoEditText != null) {
            if (z) {
                meetingNoEditText.requestFocus();
            } else {
                meetingNoEditText.clearFocus();
            }
        }
    }

    C62668e(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245153a(View view, boolean z) {
        int i;
        if (!this.f157721S) {
            View view2 = this.f157825h;
            if (z) {
                i = R.color.primary_pri_500;
            } else {
                i = R.color.line_border_component;
            }
            view2.setBackground(C60773o.m236128f(i));
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.p3152a.C62656a.AbstractC62659b
    /* renamed from: a */
    public void mo216557a(JoinMeetingEntity joinMeetingEntity, String str) {
        ar.m236694a();
        switch (C626691.f157722a[joinMeetingEntity.f152600a.ordinal()]) {
            case 1:
                C60738ac.m236023a((int) R.string.View_G_BlacklistCallsMeetingsUnavailable);
                mo216528a((AbstractC62650a.AbstractC62655c) null);
                al.m250020a("join_room", str, "black_list");
                return;
            case 2:
                if (VideoChatModuleDependency.getAppUpgradeDependency().isHasNewVersion()) {
                    mo216672A();
                } else {
                    C60738ac.m236023a((int) R.string.View_G_FeatureNotSupported);
                }
                mo216528a((AbstractC62650a.AbstractC62655c) null);
                al.m250020a("join_room", str, "version_not_available");
                return;
            case 3:
                mo216577C();
                al.m250020a("join_room", str, "meeting_id_overdue");
                return;
            case 4:
                C60738ac.m236023a((int) R.string.View_M_CapacityReachedAndroid);
                mo216528a((AbstractC62650a.AbstractC62655c) null);
                al.m250020a("join_room", str, "meeting_user_full");
                return;
            case 5:
                C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
                mo216528a((AbstractC62650a.AbstractC62655c) null);
                al.m250020a("join_room", str, "meeting_locked");
                return;
            case 6:
                return;
            default:
                C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                mo216528a((AbstractC62650a.AbstractC62655c) null);
                return;
        }
    }
}
