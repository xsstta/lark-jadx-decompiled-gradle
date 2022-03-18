package com.ss.android.lark.widget.wheelpicker;

/* renamed from: com.ss.android.lark.widget.wheelpicker.f */
public class C59261f implements AbstractC59265j {

    /* renamed from: a */
    private int f147214a;

    /* renamed from: b */
    private int f147215b;

    public C59261f() {
        this(0, 9);
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156880a() {
        return (this.f147215b - this.f147214a) + 1;
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156882a(Object obj) {
        try {
            return ((Integer) obj).intValue() - this.f147214a;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: b */
    public Object mo156885b(int i) {
        if (i < 0 || i >= mo156880a()) {
            return 0;
        }
        return Integer.valueOf(this.f147214a + i);
    }

    public C59261f(int i, int i2) {
        this.f147214a = i;
        this.f147215b = i2;
    }
}
