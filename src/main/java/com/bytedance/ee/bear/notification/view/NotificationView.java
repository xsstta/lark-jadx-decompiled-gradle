package com.bytedance.ee.bear.notification.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.notification.view.C10363a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;

public class NotificationView extends UDNotice implements View.OnClickListener {

    /* renamed from: e */
    private String f27884e;

    /* renamed from: f */
    private AbstractC10361a f27885f;

    /* renamed from: g */
    private AbstractC10362b f27886g;

    /* renamed from: h */
    private C10363a.C10364a f27887h;

    /* renamed from: com.bytedance.ee.bear.notification.view.NotificationView$a */
    public interface AbstractC10361a {
        void onUserClose(String str);
    }

    /* renamed from: com.bytedance.ee.bear.notification.view.NotificationView$b */
    public interface AbstractC10362b {
        void onLinkClick(String str);
    }

    public String getNotificationId() {
        return this.f27884e;
    }

    public String getLinkUrl() {
        C10363a.C10364a aVar = this.f27887h;
        if (aVar != null) {
            return aVar.f27889b;
        }
        return "";
    }

    /* renamed from: b */
    private void m43077b() {
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_boards_colorful);
        setIconButton(R.drawable.ud_icon_close_filled);
        setIconButtonListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.notification.view.$$Lambda$NotificationView$dQT3b2UO4VTOmXfie13LWpWOou4 */

            public final void onClick(View view) {
                NotificationView.this.m43076a((NotificationView) view);
            }
        });
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo37767a() {
        C13479a.m54772d("NotificationView", "closeNotification");
        this.f27884e = null;
        setText("");
        setVisibility(8);
    }

    public void setOnCloseListener(AbstractC10361a aVar) {
        this.f27885f = aVar;
    }

    public void setOnLinkClickListener(AbstractC10362b bVar) {
        this.f27886g = bVar;
    }

    public NotificationView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m43076a(View view) {
        AbstractC10361a aVar = this.f27885f;
        if (aVar != null) {
            aVar.onUserClose(this.f27884e);
        }
    }

    public void onClick(View view) {
        AbstractC10362b bVar = this.f27886g;
        if (bVar != null) {
            bVar.onLinkClick(getLinkUrl());
        }
    }

    public void setVisibility(int i) {
        if (TextUtils.isEmpty(this.f27884e)) {
            i = 8;
        }
        super.setVisibility(i);
    }

    public NotificationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo39488a(String str, String str2) {
        C13479a.m54772d("NotificationView", "showNotification");
        this.f27884e = str;
        mo91033c();
        C10363a.C10364a a = C10363a.m43080a(str2);
        this.f27887h = a;
        setText(a.f27888a);
        if (!TextUtils.isEmpty(a.f27889b) && a.f27890c < a.f27891d) {
            mo91029a(a.f27890c, a.f27891d, this);
        }
        setVisibility(0);
    }

    public NotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43077b();
    }
}
