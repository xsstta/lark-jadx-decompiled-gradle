package com.ss.android.vc.meeting.module.tab.detail.p3170b;

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

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.b */
public class C63267b extends AbstractC63524a<C63267b> {

    /* renamed from: a */
    private final Activity f159584a;

    /* renamed from: b */
    private final Context f159585b;

    /* renamed from: c */
    private TextView f159586c;

    /* renamed from: d */
    private String f159587d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219687a(R.layout.popup_window_meeting_title, -1, -2);
        mo219688a(true);
        mo219695b(true);
        mo219685a(0.5f);
    }

    /* renamed from: b */
    public void mo211397b() {
        C60700b.m235851b("MeetingTitlePopup", "[show]", "show");
        mo219697b(this.f159584a.getWindow().getDecorView(), 17, 0, 0);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        C60700b.m235851b("MeetingTitlePopup", "[dismiss]", "PopupWindow is dismissed");
        if ((this.f159585b instanceof Activity) && mo219704l() && UIUtils.isActivityRunning((Activity) this.f159585b)) {
            super.mo211398c();
        }
    }

    /* renamed from: a */
    public static C63267b m247795a(Activity activity, String str) {
        return new C63267b(activity, str);
    }

    public C63267b(Activity activity, String str) {
        this.f159585b = activity;
        this.f159584a = activity;
        this.f159587d = str;
        mo219694b((Context) activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, C63267b bVar) {
        TextView textView = (TextView) mo219693b(R.id.full_title_tv);
        this.f159586c = textView;
        textView.setMaxHeight(C60776r.m236144b() - UIHelper.dp2px((float) 320));
        this.f159586c.setText(this.f159587d);
    }
}
