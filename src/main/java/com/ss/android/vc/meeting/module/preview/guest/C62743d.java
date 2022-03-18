package com.ss.android.vc.meeting.module.preview.guest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p034e.p035a.C0978a;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.C62725g;
import com.ss.android.vc.meeting.module.preview.guest.C62733a;
import com.ss.android.vc.meeting.module.preview.view.MeetingNoEditText;
import com.ss.android.vc.net.request.C63602e;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.preview.guest.d */
public class C62743d extends AbstractC62715f<C62733a.AbstractC62736b.AbstractC62737a> implements C62733a.AbstractC62736b {

    /* renamed from: Q */
    protected View f157880Q;

    /* renamed from: R */
    protected TextView f157881R;

    /* renamed from: S */
    protected EditText f157882S;

    /* renamed from: T */
    protected View f157883T;

    /* renamed from: U */
    protected TextView f157884U;

    /* renamed from: V */
    protected MeetingNoEditText f157885V;

    /* renamed from: W */
    private final BroadcastReceiver f157886W = new BroadcastReceiver() {
        /* class com.ss.android.vc.meeting.module.preview.guest.C62743d.C627441 */

        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals("action.broadcast.dismiss.guest.preview", intent.getAction())) {
                C60700b.m235851b("MeetingPreviewGuestView", "[onReceive]", "mBroadCastReceiver received: DISMISS_PREVIEW");
                C62743d.this.f157811O.run();
            } else if (TextUtils.equals("action.broadcast.guest.end.loading", intent.getAction())) {
                C60700b.m235851b("MeetingPreviewGuestView", "[onReceive2]", "mBroadCastReceiver received: END_LOADING");
                C62743d.this.mo216537j();
            }
        }
    };

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: o */
    public void mo216542o() {
        super.mo216542o();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m245532G() {
        mo216675a(this.f157882S);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m245533H() {
        mo216675a((EditText) this.f157885V);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: z */
    public boolean mo216693z() {
        return !mo216692y();
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62736b
    /* renamed from: a */
    public String mo216724a() {
        MeetingNoEditText meetingNoEditText = this.f157885V;
        if (meetingNoEditText == null) {
            return null;
        }
        return meetingNoEditText.getMeetingNo();
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62736b
    /* renamed from: b */
    public String mo216725b() {
        EditText editText = this.f157882S;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: x */
    public void mo216580x() {
        super.mo216580x();
        m245530E();
        if (GuestJoinMeetingUtil.m245479a()) {
            m245529D();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.broadcast.dismiss.guest.preview");
        intentFilter.addAction("action.broadcast.guest.end.loading");
        C0978a.m4782a(ar.m236694a()).mo4991a(this.f157886W, intentFilter);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C0978a.m4782a(ar.m236694a()).mo4990a(this.f157886W);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: j */
    public void mo216537j() {
        super.mo216537j();
        EditText editText = this.f157882S;
        if (editText != null) {
            editText.setFocusable(true);
            this.f157882S.setFocusableInTouchMode(true);
        }
        MeetingNoEditText meetingNoEditText = this.f157885V;
        if (meetingNoEditText != null) {
            meetingNoEditText.setFocusable(true);
            this.f157885V.setFocusableInTouchMode(true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: k */
    public void mo216538k() {
        super.mo216538k();
        EditText editText = this.f157882S;
        if (editText != null) {
            editText.setFocusable(false);
            this.f157882S.setFocusableInTouchMode(false);
        }
        MeetingNoEditText meetingNoEditText = this.f157885V;
        if (meetingNoEditText != null) {
            meetingNoEditText.setFocusable(false);
            this.f157885V.setFocusableInTouchMode(false);
        }
    }

    /* renamed from: D */
    private void m245529D() {
        EditText editText = this.f157882S;
        if (editText != null) {
            editText.setVisibility(0);
            this.f157882S.addTextChangedListener(new TextWatcher() {
                /* class com.ss.android.vc.meeting.module.preview.guest.C62743d.C627452 */

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void afterTextChanged(Editable editable) {
                    C62743d.this.m245534I();
                }
            });
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f157838u.getLayoutParams();
            layoutParams.width = -2;
            this.f157838u.setMinWidth(UIHelper.dp2px(104.0f));
            this.f157838u.setLayoutParams(layoutParams);
            m245531F();
        }
    }

    /* renamed from: F */
    private void m245531F() {
        this.f157881R.setVisibility(0);
        this.f157880Q.setVisibility(0);
        $$Lambda$d$221Trc_jd9f0vPjtY6Gvv6SKAd4 r0 = new C62725g.C62727a.AbstractC62728a() {
            /* class com.ss.android.vc.meeting.module.preview.guest.$$Lambda$d$221Trc_jd9f0vPjtY6Gvv6SKAd4 */

            @Override // com.ss.android.vc.meeting.module.preview.C62725g.C62727a.AbstractC62728a
            public final void onJump(String str) {
                C62743d.this.m245536c((C62743d) str);
            }
        };
        String a = C60773o.m236119a((int) R.string.View_N_UserAgreeTo);
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://www.feishu.cn/zh_cn/privacy");
        arrayList.add("https://www.feishu.cn/terms");
        C62725g.m245471a(this.f157881R, a, arrayList, r0);
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.C62733a.AbstractC62736b
    public void bU_() {
        MeetingNoEditText meetingNoEditText = this.f157885V;
        if (meetingNoEditText != null) {
            if (TextUtils.isEmpty(meetingNoEditText.getText()) || this.f157803G) {
                this.f157885V.postDelayed(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.preview.guest.$$Lambda$d$DRUvmIBR3B4oFGuZPrrYJgqCko */

                    public final void run() {
                        C62743d.this.m245533H();
                    }
                }, 500);
                return;
            }
            EditText editText = this.f157882S;
            if (editText != null) {
                if (TextUtils.isEmpty(editText.getText()) || this.f157803G) {
                    this.f157882S.postDelayed(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.preview.guest.$$Lambda$d$CHi3E2cV8o4ZB92548PruvqsPdw */

                        public final void run() {
                            C62743d.this.m245532G();
                        }
                    }, 500);
                }
            }
        }
    }

    /* renamed from: E */
    private void m245530E() {
        if (!DesktopUtil.m144301a((Context) this.f157819b)) {
            mo216690v();
        }
        boolean z = false;
        this.f157884U.setVisibility(0);
        this.f157885V.setVisibility(0);
        this.f157825h.setVisibility(0);
        this.f157885V.setMeetingNoInputListener(new MeetingNoEditText.AbstractC62775a() {
            /* class com.ss.android.vc.meeting.module.preview.guest.$$Lambda$d$AlMEH_WwnU18TBYA1bjw5zWibMk */

            @Override // com.ss.android.vc.meeting.module.preview.view.MeetingNoEditText.AbstractC62775a
            public final void onInputChanged() {
                C62743d.this.m245534I();
            }
        });
        m245534I();
        if (this.f157818a.getArguments() != null) {
            String string = this.f157818a.getArguments().getString("param_meeting_no");
            if (!TextUtils.isEmpty(string)) {
                this.f157885V.setText(string);
                if (string.length() < 9) {
                    z = true;
                }
                mo216578b(z);
            }
        }
    }

    /* renamed from: C */
    public void m245534I() {
        if (this.f157885V != null && this.f157882S != null) {
            if (GuestJoinMeetingUtil.m245479a()) {
                if (!this.f157885V.mo216782a() || TextUtils.isEmpty(this.f157882S.getText())) {
                    this.f157838u.setEnabled(false);
                    this.f157839v.setEnabled(false);
                    return;
                }
                this.f157838u.setEnabled(true);
                this.f157839v.setEnabled(true);
            } else if (this.f157885V.mo216782a()) {
                this.f157838u.setEnabled(true);
                this.f157839v.setEnabled(true);
            } else {
                this.f157838u.setEnabled(false);
                this.f157839v.setEnabled(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: s */
    public void mo216579s() {
        super.mo216579s();
        if (this.f157822e != null) {
            this.f157880Q = this.f157822e.findViewById(R.id.policy_divider);
            this.f157881R = (TextView) this.f157822e.findViewById(R.id.preview_policy);
            this.f157882S = (EditText) this.f157822e.findViewById(R.id.input_guest_name);
            this.f157883T = this.f157822e.findViewById(R.id.camera_off);
            this.f157884U = (TextView) this.f157822e.findViewById(R.id.title_tips);
            this.f157885V = (MeetingNoEditText) this.f157822e.findViewById(R.id.meeting_number_ev);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: a */
    public void mo216678a(C63602e eVar) {
        m245535b(eVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: c */
    public boolean mo216628c(boolean z) {
        if (!GuestJoinMeetingUtil.f157864b || !mo216688t() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m245535b(C63602e eVar) {
        if (eVar.f160600c) {
            return;
        }
        if (C60785x.m236238b()) {
            C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
        } else {
            C60738ac.m236023a((int) R.string.View_G_NoConnection);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m245536c(String str) {
        try {
            this.f157818a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: b */
    public void mo216578b(boolean z) {
        super.mo216578b(z);
        MeetingNoEditText meetingNoEditText = this.f157885V;
        if (meetingNoEditText != null && !z) {
            meetingNoEditText.clearFocus();
            EditText editText = this.f157882S;
            if (editText != null) {
                editText.clearFocus();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: f */
    public void mo216685f(boolean z) {
        super.mo216685f(z);
        if (C60776r.m236157o() || (this.f157819b != null && this.f157819b.getResources().getConfiguration().orientation == 2 && this.f157819b.getRequestedOrientation() == 1)) {
            C61237h.m238223a().mo210544g(180);
        } else {
            C61237h.m238223a().mo210544g(-1);
        }
        if (!C60788y.m236247a(this.f157819b) || mo216532e()) {
            this.f157883T.setVisibility(8);
        } else {
            this.f157883T.setVisibility(0);
        }
    }

    C62743d(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }
}
