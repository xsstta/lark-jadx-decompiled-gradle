package com.ss.android.vc.meeting.module.meetingdialog.p3137b;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videoconference.v1.ApplyDTMFRequest;
import com.ss.android.lark.pb.videoconference.v1.ApplyDTMFResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61298f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.b.a */
public class C62190a extends AbstractView$OnAttachStateChangeListenerC61215b implements AbstractC61298f {

    /* renamed from: d */
    public String f156214d = "DialDialog";

    /* renamed from: e */
    public TextView f156215e;

    /* renamed from: f */
    public TextView f156216f;

    /* renamed from: g */
    public TextView f156217g;

    /* renamed from: h */
    public TextView f156218h;

    /* renamed from: i */
    public TextView f156219i;

    /* renamed from: j */
    public TextView f156220j;

    /* renamed from: k */
    public TextView f156221k;

    /* renamed from: l */
    public TextView f156222l;

    /* renamed from: m */
    public TextView f156223m;

    /* renamed from: n */
    public TextView f156224n;

    /* renamed from: o */
    public TextView f156225o;

    /* renamed from: p */
    public TextView f156226p;

    /* renamed from: q */
    public TextView f156227q;

    /* renamed from: r */
    public Participant f156228r;

    /* renamed from: s */
    public long f156229s = 1;

    /* renamed from: t */
    public boolean f156230t = true;

    /* renamed from: u */
    public C61388g f156231u;

    /* renamed from: v */
    private ImageView f156232v;

    /* renamed from: w */
    private TextView f156233w;

    /* renamed from: x */
    private C61303k f156234x;

    /* renamed from: y */
    private View f156235y;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    /* renamed from: n */
    private void m242848n() {
        C61303k kVar = this.f156234x;
        if (kVar != null) {
            kVar.mo212112a(this);
        }
    }

    /* renamed from: o */
    private void m242849o() {
        C61303k kVar = this.f156234x;
        if (kVar != null) {
            kVar.mo212152b(this);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m242848n();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        m242849o();
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public void mo215092k() {
        VideoChatUser userInfoInCache;
        Participant participant = this.f156228r;
        if (participant != null && this.f156233w != null && (userInfoInCache = UserInfoService.getUserInfoInCache(participant.getId(), this.f156228r.getParticipantType())) != null) {
            this.f156233w.setText(userInfoInCache.getName());
        }
    }

    /* renamed from: l */
    public void mo215113l() {
        if (this.f156228r != null && this.f156227q != null) {
            if (this.f156231u.mo212596b().containsKey(this.f156228r.getUniqueKey())) {
                this.f156227q.setText(this.f156231u.mo212596b().get(this.f156228r.getUniqueKey()));
            } else {
                this.f156227q.setText("");
            }
            this.f156227q.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.ViewTreeObserver$OnPreDrawListenerC621966 */

                public boolean onPreDraw() {
                    if (C62190a.this.f156227q.getLineCount() > 1) {
                        C62190a.this.f156227q.setTextSize(1, 20.0f);
                        C62190a.this.f156227q.setEllipsize(TextUtils.TruncateAt.START);
                        C62190a.this.f156227q.setSingleLine(true);
                        C62190a.this.f156230t = false;
                    }
                    C62190a.this.f156227q.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        }
    }

    /* renamed from: m */
    private void m242847m() {
        this.f156215e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.View$OnClickListenerC621911 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156215e.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156215e.getText().toString());
            }
        });
        this.f156216f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.View$OnClickListenerC621999 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156216f.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156216f.getText().toString());
            }
        });
        this.f156217g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass10 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156217g.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156217g.getText().toString());
            }
        });
        this.f156218h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass11 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156218h.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156218h.getText().toString());
            }
        });
        this.f156219i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass12 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156219i.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156219i.getText().toString());
            }
        });
        this.f156220j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass13 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156220j.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156220j.getText().toString());
            }
        });
        this.f156221k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass14 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156221k.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156221k.getText().toString());
            }
        });
        this.f156222l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass15 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156222l.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156222l.getText().toString());
            }
        });
        this.f156223m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.AnonymousClass16 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156223m.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156223m.getText().toString());
            }
        });
        this.f156224n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.View$OnClickListenerC621922 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156224n.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156224n.getText().toString());
            }
        });
        this.f156225o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.View$OnClickListenerC621933 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156225o.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156225o.getText().toString());
            }
        });
        this.f156226p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.View$OnClickListenerC621944 */

            public void onClick(View view) {
                C62190a aVar = C62190a.this;
                aVar.mo215111b(aVar.f156226p.getText().toString());
                C62190a aVar2 = C62190a.this;
                aVar2.mo215112c(aVar2.f156226p.getText().toString());
            }
        });
        this.f156232v.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.View$OnClickListenerC621955 */

            public void onClick(View view) {
                String str;
                if (C62190a.this.f156228r != null) {
                    Map<String, String> b = C62190a.this.f156231u.mo212596b();
                    String uniqueKey = C62190a.this.f156228r.getUniqueKey();
                    if (C62190a.this.f156227q.getText() == null) {
                        str = "";
                    } else {
                        str = C62190a.this.f156227q.getText().toString();
                    }
                    b.put(uniqueKey, str);
                    C62190a.this.f156231u.mo212598c().put(C62190a.this.f156228r.getUniqueKey(), Long.valueOf(C62190a.this.f156229s));
                }
                C62190a.this.dismiss();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.vc_layout_dtmf_dial, (ViewGroup) null);
        this.f156235y = inflate;
        m242846a(inflate);
        return this.f156235y;
    }

    /* renamed from: b */
    public void mo215111b(String str) {
        String str2;
        if (this.f156227q != null) {
            StringBuilder sb = new StringBuilder();
            if (this.f156227q.getText() == null) {
                str2 = "";
            } else {
                str2 = this.f156227q.getText().toString();
            }
            sb.append(str2);
            sb.append(str);
            String sb2 = sb.toString();
            this.f156227q.setText(sb2);
            if (this.f156230t) {
                Paint paint = new Paint();
                paint.setTextSize((float) C60773o.m236115a(30.0d));
                paint.setTypeface(Typeface.DEFAULT_BOLD);
                if (paint.measureText(sb2) > ((float) this.f156227q.getWidth())) {
                    this.f156227q.setTextSize(1, 20.0f);
                    this.f156227q.setEllipsize(TextUtils.TruncateAt.START);
                    this.f156227q.setSingleLine(true);
                    this.f156230t = false;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo215112c(String str) {
        if (this.f156228r != null) {
            SdkSender.asynSendRequestNonWrap(Command.APPLY_DTMF, new ApplyDTMFRequest.C50465a().mo174834b(this.f156234x.mo212055d()).mo174832a(this.f156228r.getId()).mo174835c(str).mo174831a(Long.valueOf(this.f156229s)), new IGetDataCallback<String>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.C621977 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i(C62190a.this.f156214d, "dialDialogDTMF. onSuccess");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165384e(C62190a.this.f156214d, "dialDialogDTMF. onError.", errorResult);
                }
            }, new SdkSender.IParser<String>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.p3137b.C62190a.C621988 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return ApplyDTMFResponse.ADAPTER.decode(bArr).toString();
                }
            });
            this.f156229s++;
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C61303k kVar = this.f156234x;
        if (kVar != null && kVar.mo212091I().mo212494b() != null && this.f156228r != null) {
            Participant a = this.f156234x.mo212091I().mo212494b().mo212589a(this.f156228r.getId(), this.f156228r.getParticipantType(), this.f156228r.getDeviceId());
            if (a == null) {
                String str = this.f156214d;
                C60700b.m235864f(str, "[onInMeetingInfoUpdate]", "participant has left..." + this.f156228r.getRtcJoinId());
                dismiss();
            }
            this.f156228r = a;
        }
    }

    /* renamed from: a */
    private void m242846a(View view) {
        this.f156215e = (TextView) view.findViewById(R.id.tv_dial_button_one);
        this.f156216f = (TextView) view.findViewById(R.id.tv_dial_button_two);
        this.f156217g = (TextView) view.findViewById(R.id.tv_dial_button_three);
        this.f156218h = (TextView) view.findViewById(R.id.tv_dial_button_four);
        this.f156219i = (TextView) view.findViewById(R.id.tv_dial_button_five);
        this.f156220j = (TextView) view.findViewById(R.id.tv_dial_button_six);
        this.f156221k = (TextView) view.findViewById(R.id.tv_dial_button_seven);
        this.f156222l = (TextView) view.findViewById(R.id.tv_dial_button_eight);
        this.f156223m = (TextView) view.findViewById(R.id.tv_dial_button_nine);
        this.f156224n = (TextView) view.findViewById(R.id.tv_dial_button_zero);
        this.f156225o = (TextView) view.findViewById(R.id.tv_dial_button_star);
        this.f156226p = (TextView) view.findViewById(R.id.tv_dial_button_sign);
        this.f156232v = (ImageView) view.findViewById(R.id.iv_icon_close_dial);
        this.f156233w = (TextView) view.findViewById(R.id.tv_dial_meeting_room_name);
        this.f156227q = (TextView) view.findViewById(R.id.tv_dtmf_number);
        m242847m();
    }

    public C62190a(Activity activity, C61303k kVar, Participant participant) {
        super(activity, kVar);
        this.f156228r = participant;
        this.f156234x = kVar;
        this.f156231u = kVar.mo212091I().mo212494b();
        mo215092k();
        mo215113l();
        if (participant == null || !this.f156231u.mo212598c().containsKey(participant.getUniqueKey())) {
            this.f156229s = 1;
        } else {
            this.f156229s = this.f156231u.mo212598c().get(participant.getUniqueKey()).longValue();
        }
    }
}
