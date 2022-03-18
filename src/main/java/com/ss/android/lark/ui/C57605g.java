package com.ss.android.lark.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.lark.ui.g */
public class C57605g {

    /* renamed from: a */
    private Context f141974a;

    /* renamed from: b */
    private View f141975b;

    /* renamed from: c */
    private PopupWindow f141976c;

    /* renamed from: a */
    public PopupWindow mo195586a() {
        return this.f141976c;
    }

    /* renamed from: b */
    public boolean mo195588b() {
        return this.f141976c.isShowing();
    }

    /* renamed from: com.ss.android.lark.ui.g$a */
    public static class C57606a {

        /* renamed from: a */
        private int f141977a;

        /* renamed from: a */
        public int mo195589a() {
            for (int i = 1; i <= 256; i <<= 2) {
                if (mo195590a(i)) {
                    return i;
                }
            }
            return 1;
        }

        /* renamed from: b */
        public int mo195592b() {
            for (int i = 2; i <= 512; i <<= 2) {
                if (mo195590a(i)) {
                    return i;
                }
            }
            return SmActions.ACTION_ONTHECALL_EXIT;
        }

        public C57606a(int i) {
            this.f141977a = i;
        }

        /* renamed from: a */
        public boolean mo195590a(int i) {
            if ((i & this.f141977a) > 0) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int[] mo195591a(android.view.View r8, android.widget.PopupWindow r9) {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ui.C57605g.C57606a.mo195591a(android.view.View, android.widget.PopupWindow):int[]");
        }
    }

    public C57605g(Context context) {
        this.f141974a = context;
    }

    /* renamed from: a */
    public void mo195587a(View view, C57606a aVar, int i, int i2) {
        int[] a = aVar.mo195591a(view, this.f141976c);
        this.f141976c.showAsDropDown(view, a[0] + i, a[1] + i2);
    }

    /* renamed from: a */
    public View mo195585a(int i, int i2, int i3, Drawable drawable) {
        this.f141975b = LayoutInflater.from(this.f141974a).inflate(i, (ViewGroup) null, false);
        PopupWindow popupWindow = new PopupWindow(this.f141975b);
        this.f141976c = popupWindow;
        popupWindow.setWidth(i2);
        this.f141976c.setHeight(i3);
        this.f141976c.setBackgroundDrawable(drawable);
        this.f141976c.setOutsideTouchable(true);
        this.f141976c.setTouchable(true);
        return this.f141975b;
    }
}
