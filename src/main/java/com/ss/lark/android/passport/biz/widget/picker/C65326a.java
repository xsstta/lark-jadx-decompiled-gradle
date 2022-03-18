package com.ss.lark.android.passport.biz.widget.picker;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;

/* renamed from: com.ss.lark.android.passport.biz.widget.picker.a */
public class C65326a implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private PopupWindow f164487a;

    /* renamed from: b */
    private Context f164488b;

    /* renamed from: c */
    private Activity f164489c;

    /* renamed from: d */
    private AbstractC65328b f164490d;

    /* renamed from: e */
    private final ColorDrawable f164491e;

    /* renamed from: f */
    private boolean f164492f;

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.a$b */
    public interface AbstractC65328b {
        /* renamed from: a */
        void mo224735a();
    }

    /* renamed from: a */
    public void mo224722a() {
        PopupWindow popupWindow = this.f164487a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: b */
    public void mo224724b() {
        Activity activity;
        if (this.f164492f && (activity = this.f164489c) != null) {
            activity.getWindow().getDecorView().getOverlay().add(this.f164491e);
        }
    }

    public void onDismiss() {
        Activity activity = this.f164489c;
        if (activity != null) {
            activity.getWindow().getDecorView().getOverlay().remove(this.f164491e);
        }
        AbstractC65328b bVar = this.f164490d;
        if (bVar != null) {
            bVar.mo224735a();
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.a$a */
    public static class C65327a {

        /* renamed from: a */
        public View f164493a;

        /* renamed from: b */
        public int f164494b;

        /* renamed from: c */
        public int f164495c;

        /* renamed from: d */
        public boolean f164496d;

        /* renamed from: e */
        public boolean f164497e;

        /* renamed from: f */
        public int f164498f;

        /* renamed from: g */
        public Context f164499g;

        /* renamed from: h */
        public Activity f164500h;

        /* renamed from: i */
        public boolean f164501i;

        /* renamed from: j */
        public AbstractC65328b f164502j;

        /* renamed from: a */
        public C65326a mo224731a() {
            return new C65326a(this);
        }

        /* renamed from: a */
        public C65327a mo224726a(int i) {
            this.f164494b = i;
            return this;
        }

        /* renamed from: b */
        public C65327a mo224732b(int i) {
            this.f164495c = i;
            return this;
        }

        /* renamed from: c */
        public C65327a mo224734c(int i) {
            this.f164498f = i;
            return this;
        }

        /* renamed from: b */
        public C65327a mo224733b(boolean z) {
            this.f164497e = z;
            return this;
        }

        /* renamed from: a */
        public C65327a mo224728a(Context context) {
            this.f164499g = context;
            return this;
        }

        /* renamed from: a */
        public C65327a mo224729a(View view) {
            this.f164493a = view;
            return this;
        }

        /* renamed from: a */
        public C65327a mo224730a(boolean z) {
            this.f164496d = z;
            return this;
        }

        /* renamed from: a */
        public C65327a mo224727a(Activity activity, boolean z) {
            this.f164500h = activity;
            this.f164501i = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo224723a(AbstractC65328b bVar) {
        this.f164490d = bVar;
    }

    public C65326a(C65327a aVar) {
        this.f164488b = aVar.f164499g;
        if (aVar.f164494b == 0 || aVar.f164495c == 0) {
            aVar.f164494b = -2;
            aVar.f164495c = -2;
        }
        PopupWindow popupWindow = new PopupWindow(aVar.f164493a, aVar.f164494b, aVar.f164495c, aVar.f164496d);
        this.f164487a = popupWindow;
        popupWindow.setOutsideTouchable(aVar.f164497e);
        this.f164487a.setBackgroundDrawable(new ColorDrawable(0));
        this.f164487a.setAnimationStyle(aVar.f164498f);
        this.f164487a.update();
        this.f164490d = aVar.f164502j;
        this.f164489c = aVar.f164500h;
        this.f164492f = aVar.f164501i;
        this.f164487a.setOnDismissListener(this);
        ColorDrawable colorDrawable = new ColorDrawable(UDColorUtils.getColor(this.f164488b, R.color.bg_mask));
        this.f164491e = colorDrawable;
        View decorView = this.f164489c.getWindow().getDecorView();
        colorDrawable.setBounds(0, 0, decorView.getWidth(), decorView.getHeight());
    }

    /* renamed from: a */
    public C65326a mo224721a(View view, int i, int i2, int i3) {
        if (this.f164487a != null) {
            mo224724b();
            this.f164487a.showAtLocation(view, i, i2, i3);
        }
        return this;
    }
}
