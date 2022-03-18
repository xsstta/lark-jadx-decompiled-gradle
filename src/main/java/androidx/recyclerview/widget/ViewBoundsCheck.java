package androidx.recyclerview.widget;

import android.view.View;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* access modifiers changed from: package-private */
public class ViewBoundsCheck {

    /* renamed from: a */
    final AbstractC1349b f4770a;

    /* renamed from: b */
    C1348a f4771b = new C1348a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$b */
    public interface AbstractC1349b {
        /* renamed from: a */
        int mo7058a();

        /* renamed from: a */
        int mo7059a(View view);

        /* renamed from: a */
        View mo7060a(int i);

        /* renamed from: b */
        int mo7061b();

        /* renamed from: b */
        int mo7062b(View view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$a */
    public static class C1348a {

        /* renamed from: a */
        int f4772a;

        /* renamed from: b */
        int f4773b;

        /* renamed from: c */
        int f4774c;

        /* renamed from: d */
        int f4775d;

        /* renamed from: e */
        int f4776e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7338a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7339a() {
            this.f4772a = 0;
        }

        C1348a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo7342b() {
            int i = this.f4772a;
            if ((i & 7) != 0 && (i & (mo7338a(this.f4775d, this.f4773b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4772a;
            if ((i2 & SmEvents.EVENT_NE_RR) != 0 && (i2 & (mo7338a(this.f4775d, this.f4774c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4772a;
            if ((i3 & 1792) != 0 && (i3 & (mo7338a(this.f4776e, this.f4773b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4772a;
            if ((i4 & 28672) == 0 || (i4 & (mo7338a(this.f4776e, this.f4774c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7340a(int i) {
            this.f4772a = i | this.f4772a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7341a(int i, int i2, int i3, int i4) {
            this.f4773b = i;
            this.f4774c = i2;
            this.f4775d = i3;
            this.f4776e = i4;
        }
    }

    ViewBoundsCheck(AbstractC1349b bVar) {
        this.f4770a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7337a(View view, int i) {
        this.f4771b.mo7341a(this.f4770a.mo7058a(), this.f4770a.mo7061b(), this.f4770a.mo7059a(view), this.f4770a.mo7062b(view));
        if (i == 0) {
            return false;
        }
        this.f4771b.mo7339a();
        this.f4771b.mo7340a(i);
        return this.f4771b.mo7342b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo7336a(int i, int i2, int i3, int i4) {
        int i5;
        int a = this.f4770a.mo7058a();
        int b = this.f4770a.mo7061b();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a2 = this.f4770a.mo7060a(i);
            this.f4771b.mo7341a(a, b, this.f4770a.mo7059a(a2), this.f4770a.mo7062b(a2));
            if (i3 != 0) {
                this.f4771b.mo7339a();
                this.f4771b.mo7340a(i3);
                if (this.f4771b.mo7342b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f4771b.mo7339a();
                this.f4771b.mo7340a(i4);
                if (this.f4771b.mo7342b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }
}
