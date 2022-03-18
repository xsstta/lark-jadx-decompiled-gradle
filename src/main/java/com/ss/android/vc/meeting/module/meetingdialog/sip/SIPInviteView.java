package com.ss.android.vc.meeting.module.meetingdialog.sip;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract;
import com.ss.android.vc.statistics.event.bv;
import com.ss.android.vc.statistics.event2.InviteRoomEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SIPInviteView extends FrameLayout implements ISIPInviteContract.AbstractC62430b {

    /* renamed from: n */
    private static String f157020n;

    /* renamed from: a */
    public EditText f157021a;

    /* renamed from: b */
    public View f157022b;

    /* renamed from: c */
    private C61303k f157023c;

    /* renamed from: d */
    private C62441e f157024d;

    /* renamed from: e */
    private ISIPInviteContract.AbstractC62430b.AbstractC62431a f157025e;

    /* renamed from: f */
    private View f157026f;

    /* renamed from: g */
    private View f157027g;

    /* renamed from: h */
    private CheckBox f157028h;

    /* renamed from: i */
    private CheckBox f157029i;

    /* renamed from: j */
    private View f157030j;

    /* renamed from: k */
    private TextView f157031k;

    /* renamed from: l */
    private TextView f157032l;

    /* renamed from: m */
    private ViewGroup f157033m;

    /* renamed from: o */
    private AbstractC62436a f157034o;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView$a */
    public interface AbstractC62436a {
        /* renamed from: k */
        void mo215849k();

        /* renamed from: l */
        void mo215850l();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f157025e = null;
    }

    /* renamed from: d */
    private void m243989d() {
        m243991e();
        bv.m250220a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, this.f157023c);
    }

    /* renamed from: f */
    private void m243992f() {
        C60700b.m235851b("SIPInviteView@", "[resetInfo]", "resetInfo");
        f157020n = "";
    }

    /* renamed from: g */
    private void m243993g() {
        bv.m250220a("close", this.f157023c);
        AbstractC62436a aVar = this.f157034o;
        if (aVar != null) {
            aVar.mo215849k();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract.AbstractC62430b
    public String getUri() {
        return this.f157021a.getText().toString();
    }

    /* renamed from: i */
    private void m243995i() {
        C60700b.m235851b("SIPInviteView@", "[onCancelClicked]", "onCancelClicked");
        this.f157026f.setClickable(true);
        this.f157027g.setClickable(true);
        ISIPInviteContract.AbstractC62430b.AbstractC62431a aVar = this.f157025e;
        if (aVar != null) {
            aVar.mo215835b();
        }
    }

    /* renamed from: b */
    public void mo215841b() {
        this.f157029i.setChecked(false);
        this.f157028h.setChecked(true);
        this.f157021a.setHint(C60773o.m236119a((int) R.string.View_G_InviteRoomSystemPlaceholder));
    }

    /* renamed from: c */
    public void mo215842c() {
        this.f157028h.setChecked(false);
        this.f157029i.setChecked(true);
        this.f157021a.setHint(C60773o.m236119a((int) R.string.View_MV_AddressNumber_PleaseEnterMeetingRoomSystem));
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract.AbstractC62430b
    public ParticipantType getParticipantType() {
        if (this.f157028h.isChecked()) {
            return ParticipantType.SIP_USER;
        }
        if (this.f157029i.isChecked()) {
            return ParticipantType.RESERVED_USER_5;
        }
        return ParticipantType.UNKNOWN;
    }

    /* renamed from: h */
    private void m243994h() {
        C60700b.m235851b("SIPInviteView@", "[onCallClicked]", "onCallClicked");
        this.f157026f.setClickable(false);
        this.f157027g.setClickable(false);
        this.f157021a.clearFocus();
        ISIPInviteContract.AbstractC62430b.AbstractC62431a aVar = this.f157025e;
        if (aVar != null) {
            aVar.mo215834a();
        }
        AbstractC62436a aVar2 = this.f157034o;
        if (aVar2 != null) {
            aVar2.mo215850l();
        }
    }

    /* renamed from: a */
    public void mo215836a() {
        C60700b.m235851b("SIPInviteView@", "[onDestroy]", "onDestroy");
        KeyboardUtils.hideKeyboard(getContext());
        f157020n = this.f157021a.getText().toString();
        C62441e eVar = this.f157024d;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    /* renamed from: e */
    private void m243991e() {
        LayoutInflater.from(getContext()).inflate(R.layout.sip_invite_layout, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.invite_icon_close);
        this.f157030j = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.$$Lambda$SIPInviteView$uBA6VBpXLwGu4w_cQKU7RnFSco */

            public final void onClick(View view) {
                SIPInviteView.m271337lambda$uBA6VBpXLwGu4w_cQKU7RnFSco(SIPInviteView.this, view);
            }
        });
        this.f157026f = findViewById(R.id.checkbox_sip_container);
        this.f157027g = findViewById(R.id.checkbox_h323_container);
        this.f157028h = (CheckBox) findViewById(R.id.checkbox_sip);
        this.f157029i = (CheckBox) findViewById(R.id.checkbox_h323);
        this.f157028h.setChecked(true);
        this.f157026f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.C624321 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                SIPInviteView.this.mo215841b();
            }
        });
        this.f157027g.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.C624332 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                SIPInviteView.this.mo215842c();
            }
        });
        this.f157031k = (TextView) findViewById(R.id.invite_btn_call);
        mo215840a(false);
        this.f157031k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.$$Lambda$SIPInviteView$7exLwWU6ixhXVFduA70QjMolcpE */

            public final void onClick(View view) {
                SIPInviteView.lambda$7exLwWU6ixhXVFduA70QjMolcpE(SIPInviteView.this, view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.invite_btn_cancel);
        this.f157032l = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.$$Lambda$SIPInviteView$2pq9T0qLr1zfAKdzRazozXJWcg */

            public final void onClick(View view) {
                SIPInviteView.m271336lambda$2pq9T0qLr1zfAKdzRazozXJWcg(SIPInviteView.this, view);
            }
        });
        this.f157033m = (ViewGroup) findViewById(R.id.invite_edit_uri_container);
        this.f157021a = (EditText) findViewById(R.id.invite_edit_uri);
        this.f157022b = findViewById(R.id.invite_icon_clear_uri);
        this.f157021a.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.C624343 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                SIPInviteView.this.mo215839a(editable);
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!SIPInviteView.this.f157021a.hasFocus() || TextUtils.isEmpty(charSequence)) {
                    SIPInviteView.this.f157022b.setVisibility(8);
                } else {
                    SIPInviteView.this.f157022b.setVisibility(0);
                }
            }
        });
        this.f157021a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.$$Lambda$SIPInviteView$vpaMmA3QvNfgg6ekNA74_niZhg */

            public final void onFocusChange(View view, boolean z) {
                SIPInviteView.m271338lambda$vpaMmA3QvNfgg6ekNA74_niZhg(SIPInviteView.this, view, z);
            }
        });
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f157021a.getFilters()));
        arrayList.add(new InputFilter() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.SIPInviteView.C624354 */

            /* renamed from: a */
            Pattern f157038a = Pattern.compile("[^ -~]", 66);

            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (this.f157038a.matcher(charSequence).find()) {
                    return "";
                }
                return null;
            }
        });
        this.f157021a.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
        this.f157022b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.sip.$$Lambda$SIPInviteView$CpARx75ZNUcqLlpyPZ8wkXoT5Vo */

            public final void onClick(View view) {
                SIPInviteView.lambda$CpARx75ZNUcqLlpyPZ8wkXoT5Vo(SIPInviteView.this, view);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243986b(View view) {
        m243995i();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m243988c(View view) {
        m243994h();
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m243990d(View view) {
        m243993g();
    }

    public void setActionListener(AbstractC62436a aVar) {
        this.f157034o = aVar;
    }

    public void setViewDelegate(ISIPInviteContract.AbstractC62430b.AbstractC62431a aVar) {
        this.f157025e = aVar;
    }

    public SIPInviteView(Context context) {
        super(context);
        m243989d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243984a(View view) {
        this.f157021a.setText("");
    }

    /* renamed from: b */
    private boolean m243987b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract.AbstractC62430b
    /* renamed from: a */
    public void mo215830a(ISIPInviteContract.InviteState inviteState) {
        m243992f();
        setState(inviteState);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract.AbstractC62430b
    public void setState(ISIPInviteContract.InviteState inviteState) {
        C60700b.m235851b("SIPInviteView@", "[setState]", "state = " + inviteState);
        if (inviteState == ISIPInviteContract.InviteState.CALLING) {
            this.f157032l.setVisibility(0);
            this.f157031k.setVisibility(8);
            this.f157026f.setClickable(false);
            this.f157027g.setClickable(false);
            this.f157033m.setAlpha(0.3f);
            this.f157021a.setInputType(0);
            this.f157021a.setFocusable(false);
            return;
        }
        this.f157032l.setVisibility(8);
        this.f157031k.setVisibility(0);
        this.f157026f.setClickable(true);
        this.f157027g.setClickable(true);
        this.f157033m.setAlpha(1.0f);
        this.f157021a.setInputType(32);
        this.f157021a.setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    public void mo215838a(C61303k kVar) {
        this.f157023c = kVar;
        C62441e eVar = new C62441e(this, kVar);
        this.f157024d = eVar;
        eVar.create();
        InviteRoomEvent.f160802a.mo220223b(kVar);
    }

    /* renamed from: a */
    public void mo215839a(CharSequence charSequence) {
        mo215840a(m243987b(charSequence));
    }

    /* renamed from: a */
    public void mo215840a(boolean z) {
        C60700b.m235851b("SIPInviteView@", "[enableCall]", "enable = " + z);
        this.f157031k.setEnabled(z);
    }

    public SIPInviteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m243989d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243985a(View view, boolean z) {
        if (!z || TextUtils.isEmpty(this.f157021a.getText())) {
            this.f157022b.setVisibility(8);
        } else {
            this.f157022b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo215837a(int i, int i2) {
        C60700b.m235851b("SIPInviteView@", "[onKeyboardHeightChanged]", "height = " + i);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    public SIPInviteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243989d();
    }
}
