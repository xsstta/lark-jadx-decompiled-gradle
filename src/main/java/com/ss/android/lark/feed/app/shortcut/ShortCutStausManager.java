package com.ss.android.lark.feed.app.shortcut;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.view.C38004j;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;

public class ShortCutStausManager {

    /* renamed from: a */
    private ShortCutStatus f96972a = ShortCutStatus.CLOSE;

    /* renamed from: b */
    private ArrayList<AbstractC37801b> f96973b;

    /* renamed from: c */
    private int f96974c = -1;

    /* renamed from: d */
    private int f96975d;

    /* renamed from: e */
    private int f96976e;

    /* renamed from: f */
    private boolean f96977f;

    /* renamed from: g */
    private int f96978g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.shortcut.ShortCutStausManager$a */
    public static class C37800a {

        /* renamed from: a */
        static ShortCutStausManager f96979a = new ShortCutStausManager();
    }

    /* renamed from: com.ss.android.lark.feed.app.shortcut.ShortCutStausManager$b */
    public interface AbstractC37801b {
        /* renamed from: a */
        void mo138582a(ShortCutStatus shortCutStatus);
    }

    /* renamed from: a */
    public static ShortCutStausManager m148791a() {
        return C37800a.f96979a;
    }

    /* renamed from: b */
    public boolean mo138573b() {
        return this.f96977f;
    }

    /* renamed from: h */
    public int mo138581h() {
        return this.f96976e;
    }

    /* renamed from: c */
    public boolean mo138575c() {
        if (this.f96972a == ShortCutStatus.OPENDING) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo138577d() {
        if (this.f96972a == ShortCutStatus.OPEN) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo138578e() {
        if (this.f96972a == ShortCutStatus.CLOSE) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo138579f() {
        if (this.f96974c < 0) {
            mo138580g();
        }
        int i = this.f96974c;
        if (i == 0) {
            return 6;
        }
        return i;
    }

    /* renamed from: g */
    public void mo138580g() {
        int i;
        int i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) C37268c.m146766b().mo139170a().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (!DesktopUtil.m144301a(C37268c.m146766b().mo139170a())) {
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
        } else {
            i2 = UIHelper.getWindowWidth(C37268c.m146766b().mo139170a(), ContainerType.Left);
            i = displayMetrics.heightPixels;
        }
        this.f96978g = i;
        C53241h.m205898b("ShortCutStausManager", "calcColumnNum screenWidth=" + i2 + " screenHeight=" + i);
        mo138566a((Math.min(i2, i) - UIHelper.dp2px(15.0f)) / UIHelper.dp2px(C38004j.f97574b));
    }

    /* renamed from: c */
    public void mo138574c(int i) {
        this.f96975d = i;
    }

    /* renamed from: d */
    public void mo138576d(int i) {
        this.f96976e = i;
    }

    /* renamed from: a */
    public void mo138566a(int i) {
        this.f96974c = i;
    }

    /* renamed from: a */
    public void mo138570a(boolean z) {
        this.f96977f = z;
    }

    /* renamed from: b */
    public int mo138571b(int i) {
        return Math.min(i, this.f96978g) / UIHelper.dp2px(C38004j.f97574b);
    }

    /* renamed from: a */
    public void mo138568a(ShortCutStatus shortCutStatus) {
        if (shortCutStatus != this.f96972a) {
            this.f96972a = shortCutStatus;
            Iterator<AbstractC37801b> it = this.f96973b.iterator();
            while (it.hasNext()) {
                it.next().mo138582a(shortCutStatus);
            }
        }
    }

    /* renamed from: a */
    public void mo138569a(AbstractC37801b bVar) {
        if (this.f96973b == null) {
            this.f96973b = new ArrayList<>();
        }
        this.f96973b.add(bVar);
    }

    /* renamed from: b */
    public void mo138572b(AbstractC37801b bVar) {
        if (!(bVar == null || this.f96973b == null)) {
            for (int i = 0; i < this.f96973b.size(); i++) {
                if (this.f96973b.get(i) == bVar) {
                    this.f96973b.remove(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo138567a(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (!DesktopUtil.m144301a(C37268c.m146766b().mo139170a())) {
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
        } else {
            i2 = UIHelper.getWindowWidth(C37268c.m146766b().mo139170a(), ContainerType.Left);
            i = displayMetrics.heightPixels;
        }
        this.f96978g = i;
        C53241h.m205898b("ShortCutStausManager", "calcColumnNum screenWidth=" + i2 + " screenHeight=" + i);
        mo138566a((Math.min(i2, i) - UIHelper.dp2px(15.0f)) / UIHelper.dp2px(C38004j.f97574b));
    }

    public enum ShortCutStatus {
        OPEN(1),
        OPENDING(2),
        CLOSE(3);
        
        private int value;

        private ShortCutStatus(int i) {
            this.value = i;
        }
    }
}
