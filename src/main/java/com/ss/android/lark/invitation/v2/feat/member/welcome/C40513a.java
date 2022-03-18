package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.a */
public class C40513a implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private PopupWindow f102881a;

    /* renamed from: b */
    private Context f102882b;

    /* renamed from: c */
    private Activity f102883c;

    /* renamed from: d */
    private float f102884d = 1.0f;

    /* renamed from: e */
    private AbstractC40515b f102885e;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.a$b */
    public interface AbstractC40515b {
        /* renamed from: a */
        void mo146590a();
    }

    /* renamed from: a */
    public void mo146577a() {
        PopupWindow popupWindow = this.f102881a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            Activity activity = this.f102883c;
            if (activity != null) {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                attributes.alpha = 1.0f;
                this.f102883c.getWindow().setAttributes(attributes);
            }
        }
    }

    /* renamed from: b */
    public void mo146579b() {
        float f = this.f102884d;
        if (f > BitmapDescriptorFactory.HUE_RED && f < 1.0f) {
            WindowManager.LayoutParams attributes = this.f102883c.getWindow().getAttributes();
            attributes.alpha = this.f102884d;
            this.f102883c.getWindow().setAttributes(attributes);
        }
    }

    public void onDismiss() {
        Activity activity = this.f102883c;
        if (activity != null) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            this.f102883c.getWindow().setAttributes(attributes);
        }
        AbstractC40515b bVar = this.f102885e;
        if (bVar != null) {
            bVar.mo146590a();
        }
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.a$a */
    public static class C40514a {

        /* renamed from: a */
        public View f102886a;

        /* renamed from: b */
        public int f102887b;

        /* renamed from: c */
        public int f102888c;

        /* renamed from: d */
        public boolean f102889d;

        /* renamed from: e */
        public boolean f102890e;

        /* renamed from: f */
        public int f102891f;

        /* renamed from: g */
        public Context f102892g;

        /* renamed from: h */
        public Activity f102893h;

        /* renamed from: i */
        public float f102894i;

        /* renamed from: j */
        public AbstractC40515b f102895j;

        /* renamed from: a */
        public C40513a mo146586a() {
            return new C40513a(this);
        }

        /* renamed from: a */
        public C40514a mo146581a(int i) {
            this.f102887b = i;
            return this;
        }

        /* renamed from: b */
        public C40514a mo146587b(int i) {
            this.f102888c = i;
            return this;
        }

        /* renamed from: c */
        public C40514a mo146589c(int i) {
            this.f102891f = i;
            return this;
        }

        /* renamed from: b */
        public C40514a mo146588b(boolean z) {
            this.f102890e = z;
            return this;
        }

        /* renamed from: a */
        public C40514a mo146583a(Context context) {
            this.f102892g = context;
            return this;
        }

        /* renamed from: a */
        public C40514a mo146584a(View view) {
            this.f102886a = view;
            return this;
        }

        /* renamed from: a */
        public C40514a mo146585a(boolean z) {
            this.f102889d = z;
            return this;
        }

        /* renamed from: a */
        public C40514a mo146582a(Activity activity, float f) {
            this.f102893h = activity;
            this.f102894i = f;
            return this;
        }
    }

    /* renamed from: a */
    public void mo146578a(AbstractC40515b bVar) {
        this.f102885e = bVar;
    }

    public C40513a(C40514a aVar) {
        this.f102882b = aVar.f102892g;
        if (aVar.f102887b == 0 || aVar.f102888c == 0) {
            aVar.f102887b = -2;
            aVar.f102888c = -2;
        }
        PopupWindow popupWindow = new PopupWindow(aVar.f102886a, aVar.f102887b, aVar.f102888c, aVar.f102889d);
        this.f102881a = popupWindow;
        popupWindow.setOutsideTouchable(aVar.f102890e);
        this.f102881a.setBackgroundDrawable(new ColorDrawable(0));
        this.f102881a.setAnimationStyle(aVar.f102891f);
        this.f102881a.update();
        this.f102885e = aVar.f102895j;
        this.f102884d = aVar.f102894i;
        this.f102883c = aVar.f102893h;
        this.f102881a.setOnDismissListener(this);
    }

    /* renamed from: a */
    public C40513a mo146576a(View view, int i, int i2, int i3) {
        if (this.f102881a != null) {
            mo146579b();
            this.f102881a.showAtLocation(view, i, i2, i3);
        }
        return this;
    }
}
