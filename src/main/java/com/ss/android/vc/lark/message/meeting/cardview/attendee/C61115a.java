package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.a */
public class C61115a extends AbstractC63524a<C61115a> {

    /* renamed from: a */
    private final Activity f153086a;

    /* renamed from: b */
    private final Context f153087b;

    /* renamed from: c */
    private TextView f153088c;

    /* renamed from: d */
    private String f153089d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219687a(R.layout.vc_popup_full_name, -1, -2);
        mo219688a(true);
        mo219695b(true);
        mo219685a(0.5f);
    }

    /* renamed from: b */
    public void mo211397b() {
        C60700b.m235851b("FullNamePopup", "[show]", "show");
        mo219697b(this.f153086a.getWindow().getDecorView(), 17, 0, 0);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        C60700b.m235851b("FullNamePopup", "[dismiss]", "PopupWindow is dismissed");
        if ((this.f153087b instanceof Activity) && mo219704l() && UIUtils.isActivityRunning((Activity) this.f153087b)) {
            super.mo211398c();
        }
    }

    /* renamed from: a */
    public static C61115a m237693a(Activity activity, String str) {
        return new C61115a(activity, str);
    }

    public C61115a(Activity activity, String str) {
        this.f153087b = activity;
        this.f153086a = activity;
        this.f153089d = str;
        mo219694b((Context) activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, C61115a aVar) {
        TextView textView = (TextView) mo219693b(R.id.full_name_tv);
        this.f153088c = textView;
        textView.setMaxHeight(C60776r.m236144b() - UIHelper.dp2px((float) 320));
        this.f153088c.setText(this.f153089d);
    }
}
