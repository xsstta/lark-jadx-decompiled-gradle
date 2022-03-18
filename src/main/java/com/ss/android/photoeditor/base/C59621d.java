package com.ss.android.photoeditor.base;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.List;

/* renamed from: com.ss.android.photoeditor.base.d */
public class C59621d {

    /* renamed from: a */
    private Matrix f147979a = new Matrix();

    /* renamed from: b */
    private List<Bitmap> f147980b;

    /* renamed from: c */
    private C59639i f147981c;

    /* renamed from: a */
    public Bitmap mo203085a() {
        return this.f147981c.mo203160a();
    }

    /* renamed from: a */
    public void mo203086a(Bitmap bitmap) {
        this.f147981c.mo203161a(bitmap);
    }

    public C59621d(List<Bitmap> list) {
        this.f147980b = list;
        this.f147981c = new C59639i(list);
    }
}
