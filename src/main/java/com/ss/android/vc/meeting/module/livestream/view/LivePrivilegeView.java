package com.ss.android.vc.meeting.module.livestream.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.vc.entity.InMeetingData;

public class LivePrivilegeView extends LinearLayout {

    /* renamed from: a */
    public View f155992a;

    /* renamed from: b */
    public View f155993b;

    /* renamed from: c */
    public UDCheckBox f155994c;

    /* renamed from: d */
    public UDCheckBox f155995d;

    /* renamed from: e */
    public TextView f155996e;

    /* renamed from: f */
    public TextView f155997f;

    /* renamed from: g */
    private InMeetingData.LiveMeetingData.Privilege f155998g = InMeetingData.LiveMeetingData.Privilege.EMPLOYEE;

    /* renamed from: h */
    private AbstractC62095a f155999h;

    /* renamed from: com.ss.android.vc.meeting.module.livestream.view.LivePrivilegeView$a */
    public interface AbstractC62095a {
        void onPrivilege(InMeetingData.LiveMeetingData.Privilege privilege);
    }

    public InMeetingData.LiveMeetingData.Privilege getPrivilege() {
        return this.f155998g;
    }

    public void setOnPrivilegeListener(AbstractC62095a aVar) {
        this.f155999h = aVar;
    }

    public void setPrivilege(InMeetingData.LiveMeetingData.Privilege privilege) {
        mo214850a(privilege, privilege);
    }

    public LivePrivilegeView(Context context) {
        super(context);
        m242585a(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242586a(View view) {
        if (this.f155998g != InMeetingData.LiveMeetingData.Privilege.EMPLOYEE) {
            this.f155998g = InMeetingData.LiveMeetingData.Privilege.EMPLOYEE;
            this.f155994c.setChecked(false);
            this.f155995d.setChecked(true);
            AbstractC62095a aVar = this.f155999h;
            if (aVar != null) {
                aVar.onPrivilege(InMeetingData.LiveMeetingData.Privilege.EMPLOYEE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242587b(View view) {
        if (this.f155998g != InMeetingData.LiveMeetingData.Privilege.ANONYMOUS) {
            this.f155998g = InMeetingData.LiveMeetingData.Privilege.ANONYMOUS;
            this.f155995d.setChecked(false);
            this.f155994c.setChecked(true);
            AbstractC62095a aVar = this.f155999h;
            if (aVar != null) {
                aVar.onPrivilege(InMeetingData.LiveMeetingData.Privilege.ANONYMOUS);
            }
        }
    }

    public LivePrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242585a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo214850a(InMeetingData.LiveMeetingData.Privilege privilege, InMeetingData.LiveMeetingData.Privilege privilege2) {
        boolean z;
        if (!privilege.equals(InMeetingData.LiveMeetingData.Privilege.PREVILEGE_UNKNOWN)) {
            this.f155998g = privilege;
        } else {
            this.f155998g = privilege2;
        }
        UDCheckBox uDCheckBox = this.f155994c;
        boolean z2 = true;
        if (this.f155998g == InMeetingData.LiveMeetingData.Privilege.ANONYMOUS) {
            z = true;
        } else {
            z = false;
        }
        uDCheckBox.setChecked(z);
        UDCheckBox uDCheckBox2 = this.f155995d;
        if (this.f155998g != InMeetingData.LiveMeetingData.Privilege.EMPLOYEE) {
            z2 = false;
        }
        uDCheckBox2.setChecked(z2);
    }

    /* renamed from: a */
    private void m242585a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.dialog_live_setting_item_privilege, this);
        this.f155992a = findViewById(R.id.ll_live_privilege_all);
        this.f155993b = findViewById(R.id.ll_live_privilege_internal);
        this.f155994c = (UDCheckBox) findViewById(R.id.cb_live_privilege_all);
        this.f155995d = (UDCheckBox) findViewById(R.id.cb_live_privilege_internal);
        this.f155996e = (TextView) findViewById(R.id.tv_hint_live_privilege_all);
        this.f155997f = (TextView) findViewById(R.id.tv_hint_live_privilege_internal);
        this.f155992a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.$$Lambda$LivePrivilegeView$91WvktpbT4CNx6Q1p9hKwfWfY0 */

            public final void onClick(View view) {
                LivePrivilegeView.m271287lambda$91WvktpbT4CNx6Q1p9hKwfWfY0(LivePrivilegeView.this, view);
            }
        });
        this.f155993b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.$$Lambda$LivePrivilegeView$h6sxOnDWLuF5mih0ftki2ZaO1NY */

            public final void onClick(View view) {
                LivePrivilegeView.lambda$h6sxOnDWLuF5mih0ftki2ZaO1NY(LivePrivilegeView.this, view);
            }
        });
    }

    public LivePrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242585a(context, attributeSet);
    }
}
