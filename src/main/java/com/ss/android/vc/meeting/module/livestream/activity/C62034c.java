package com.ss.android.vc.meeting.module.livestream.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.response.ba;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.livestream.activity.C62026a;
import com.ss.android.vc.meeting.module.livestream.p3134b.C62055a;
import com.ss.android.vc.meeting.module.livestream.p3134b.C62058c;
import com.ss.android.vc.meeting.module.livestream.widget.AbstractC62106a;
import com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput;
import com.ss.android.vc.meeting.module.livestream.widget.KeyboardDetectorConstraintLayout;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.aq;

/* renamed from: com.ss.android.vc.meeting.module.livestream.activity.c */
public class C62034c implements C62026a.AbstractC62029b {

    /* renamed from: a */
    public Activity f155852a;

    /* renamed from: b */
    public C62026a.AbstractC62029b.AbstractC62030a f155853b;

    /* renamed from: c */
    public View f155854c;

    /* renamed from: d */
    public CommonEditInput f155855d;

    /* renamed from: e */
    public CommonEditInput f155856e;

    /* renamed from: f */
    public AppCompatCheckBox f155857f;

    /* renamed from: g */
    private View f155858g;

    /* renamed from: h */
    private KeyboardDetectorConstraintLayout f155859h;

    /* renamed from: i */
    private TextView f155860i;

    /* renamed from: j */
    private TextView f155861j;

    /* renamed from: k */
    private TextView f155862k;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: e */
    public void mo214759e() {
        Activity activity = this.f155852a;
        if (activity instanceof LiveAuthBaseActivity) {
            ((LiveAuthBaseActivity) activity).mo214729j();
        }
    }

    /* renamed from: f */
    public void mo214760f() {
        Activity activity = this.f155852a;
        if (activity instanceof LiveAuthBaseActivity) {
            ((LiveAuthBaseActivity) activity).mo214731l();
        }
    }

    /* renamed from: b */
    public boolean mo214756b() {
        Activity activity = this.f155852a;
        if (activity == null || activity.isDestroyed() || this.f155852a.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo214757c() {
        mo214759e();
        this.f155853b.mo214749a(this.f155855d.getInputText(), this.f155856e.getInputText(), new AbstractC63598b<ba>() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.C620417 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("IRealAuthenticationView", "[goAuth2]", "<LiveAuth> error=" + eVar);
                if (C62034c.this.mo214756b()) {
                    C62034c.this.mo214760f();
                    C62034c.this.f155854c.setEnabled(true);
                    C62055a.m242444a(C62034c.this.f155852a, eVar, C62034c.this.f155853b.mo214752d());
                }
            }

            /* renamed from: a */
            public void onSuccess(ba baVar) {
                C60700b.m235851b("IRealAuthenticationView", "[goAuth]", "<LiveAuth> onSuccess");
                if (C62034c.this.mo214756b()) {
                    C62034c.this.mo214760f();
                    C62034c.this.f155854c.setEnabled(true);
                    C62034c.this.mo214761g();
                    FaceAuthActivity.m242347a(C62034c.this.f155852a, C62034c.this.f155855d.getInputText(), C62034c.this.f155856e.getInputText(), C62034c.this.f155853b.mo214750b(), C62034c.this.f155853b.mo214751c());
                }
            }
        });
    }

    /* renamed from: g */
    public void mo214761g() {
        C61303k kVar;
        String c = this.f155853b.mo214751c();
        if (!C57782ag.m224241a(c) && (kVar = (C61303k) MeetingManager.m238341a().getMeeting(c)) != null) {
            kVar.mo212165y().mo212017d();
        }
    }

    /* renamed from: a */
    public void mo214754a() {
        if (TextUtils.isEmpty(this.f155855d.getInputText()) || TextUtils.isEmpty(this.f155856e.getInputText())) {
            this.f155854c.setEnabled(false);
        } else {
            this.f155854c.setEnabled(true);
        }
    }

    /* renamed from: d */
    public void mo214758d() {
        View inflate = LayoutInflater.from(this.f155852a).inflate(R.layout.live_auth_register_dialog_content, (ViewGroup) null);
        m242403a((TextView) inflate.findViewById(R.id.lkui_dialog_content_message_tv));
        VCDialogUtils.m236164a((Context) this.f155852a, inflate, (int) R.string.View_VM_NotificationDefault, 1, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.DialogInterface$OnClickListenerC620428 */

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, (int) R.string.View_G_Agree, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.DialogInterface$OnClickListenerC620439 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C62034c.this.f155857f.setChecked(true);
            }
        }, false);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f155859h = (KeyboardDetectorConstraintLayout) this.f155852a.findViewById(R.id.login_content_frame_container);
        this.f155860i = (TextView) this.f155852a.findViewById(R.id.tv_title);
        this.f155861j = (TextView) this.f155852a.findViewById(R.id.tv_sub_title);
        this.f155862k = (TextView) this.f155852a.findViewById(R.id.tvPolicy);
        this.f155857f = (AppCompatCheckBox) this.f155852a.findViewById(R.id.checkBoxPolicy);
        View findViewById = this.f155852a.findViewById(R.id.llNextStep);
        this.f155854c = findViewById;
        findViewById.setEnabled(false);
        this.f155854c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.C620351 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C62034c.this.f155857f.isChecked()) {
                    aq.m250043a("vc_meeting_popup", "identity_verification_page", "next_step", (VideoChat) null);
                    C62034c.this.mo214757c();
                    return;
                }
                C62034c.this.mo214758d();
            }
        });
        View findViewById2 = this.f155852a.findViewById(R.id.iv_back);
        this.f155858g = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.View$OnClickListenerC620362 */

            public void onClick(View view) {
                aq.m250043a("vc_meeting_popup", "identity_verification_page", "return", (VideoChat) null);
                C62034c.this.f155852a.finish();
            }
        });
        this.f155855d = (CommonEditInput) this.f155852a.findViewById(R.id.et_username);
        this.f155856e = (CommonEditInput) this.f155852a.findViewById(R.id.et_id_code);
        this.f155855d.setInputHint(this.f155852a.getString(R.string.View_G_EnterRealName));
        this.f155856e.setInputHint(this.f155852a.getString(R.string.View_G_EnterIdNumber));
        this.f155855d.mo214859a();
        this.f155855d.setContentTypeFace(false);
        this.f155856e.setContentTypeFace(false);
        this.f155856e.setmOnInputContentListener(new AbstractC62106a.AbstractC62109c() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.C620373 */

            @Override // com.ss.android.vc.meeting.module.livestream.widget.AbstractC62106a.AbstractC62109c
            /* renamed from: a */
            public void mo214763a(String str) {
                C62034c.this.f155856e.mo214862b();
                C62034c.this.mo214754a();
            }
        });
        this.f155855d.setmOnInputContentListener(new AbstractC62106a.AbstractC62109c() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.C620384 */

            @Override // com.ss.android.vc.meeting.module.livestream.widget.AbstractC62106a.AbstractC62109c
            /* renamed from: a */
            public void mo214763a(String str) {
                C62034c.this.f155855d.mo214862b();
                C62034c.this.mo214754a();
            }
        });
        this.f155859h.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.View$OnFocusChangeListenerC620395 */

            public void onFocusChange(View view, boolean z) {
                if (z && KeyboardUtils.isSoftShowing(C62034c.this.f155852a)) {
                    KeyboardUtils.hideKeyboard(C62034c.this.f155852a);
                }
            }
        });
        this.f155857f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.C62034c.C620406 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            }
        });
        aq.m250043a("vc_meeting_popup", "identity_verification_page", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, (VideoChat) null);
    }

    /* renamed from: a */
    public void setViewDelegate(C62026a.AbstractC62029b.AbstractC62030a aVar) {
        this.f155853b = aVar;
    }

    public C62034c(Activity activity) {
        this.f155852a = activity;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.activity.C62026a.AbstractC62029b
    /* renamed from: a */
    public void mo214747a(MsgWithUrlInfo bVar) {
        C62058c.m242461a(this.f155862k, bVar);
    }

    /* renamed from: a */
    private void m242403a(TextView textView) {
        C62058c.m242461a(textView, this.f155853b.mo214748a());
    }
}
