package com.ss.android.lark.widget.wheelpicker;

import java.util.List;

/* renamed from: com.ss.android.lark.widget.wheelpicker.a */
public class C59256a<T> implements AbstractC59265j {

    /* renamed from: a */
    private List<T> f147207a;

    /* renamed from: b */
    private int f147208b;

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156880a() {
        return this.f147207a.size();
    }

    public C59256a(List<T> list) {
        this(list, 4);
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156882a(Object obj) {
        return this.f147207a.indexOf(obj);
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: b */
    public Object mo156885b(int i) {
        if (i < 0 || i >= this.f147207a.size()) {
            return "";
        }
        return this.f147207a.get(i);
    }

    public C59256a(List<T> list, int i) {
        this.f147207a = list;
        this.f147208b = i;
    }
}
