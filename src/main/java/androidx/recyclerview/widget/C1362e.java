package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
public class C1362e implements AbstractC1398p {

    /* renamed from: a */
    final AbstractC1398p f4815a;

    /* renamed from: b */
    int f4816b;

    /* renamed from: c */
    int f4817c = -1;

    /* renamed from: d */
    int f4818d = -1;

    /* renamed from: e */
    Object f4819e;

    /* renamed from: a */
    public void mo7388a() {
        int i = this.f4816b;
        if (i != 0) {
            if (i == 1) {
                this.f4815a.mo7365a(this.f4817c, this.f4818d);
            } else if (i == 2) {
                this.f4815a.mo7367b(this.f4817c, this.f4818d);
            } else if (i == 3) {
                this.f4815a.mo7366a(this.f4817c, this.f4818d, this.f4819e);
            }
            this.f4819e = null;
            this.f4816b = 0;
        }
    }

    public C1362e(AbstractC1398p pVar) {
        this.f4815a = pVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: c */
    public void mo7368c(int i, int i2) {
        mo7388a();
        this.f4815a.mo7368c(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: b */
    public void mo7367b(int i, int i2) {
        int i3;
        if (this.f4816b != 2 || (i3 = this.f4817c) < i || i3 > i + i2) {
            mo7388a();
            this.f4817c = i;
            this.f4818d = i2;
            this.f4816b = 2;
            return;
        }
        this.f4818d += i2;
        this.f4817c = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: a */
    public void mo7365a(int i, int i2) {
        int i3;
        if (this.f4816b == 1 && i >= (i3 = this.f4817c)) {
            int i4 = this.f4818d;
            if (i <= i3 + i4) {
                this.f4818d = i4 + i2;
                this.f4817c = Math.min(i, i3);
                return;
            }
        }
        mo7388a();
        this.f4817c = i;
        this.f4818d = i2;
        this.f4816b = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: a */
    public void mo7366a(int i, int i2, Object obj) {
        int i3;
        if (this.f4816b == 3) {
            int i4 = this.f4817c;
            int i5 = this.f4818d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4819e == obj) {
                this.f4817c = Math.min(i, i4);
                this.f4818d = Math.max(i5 + i4, i3) - this.f4817c;
                return;
            }
        }
        mo7388a();
        this.f4817c = i;
        this.f4818d = i2;
        this.f4819e = obj;
        this.f4816b = 3;
    }
}
