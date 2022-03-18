package com.ss.android.lark.chat.base.view.p1603a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.base.view.a.d */
public class C32930d<T> {

    /* renamed from: a */
    AbstractC32936e f84618a;

    /* renamed from: b */
    public Context f84619b;

    /* renamed from: c */
    public List<C34029b> f84620c;

    /* renamed from: d */
    public AbstractC32935d f84621d;

    /* renamed from: e */
    public AbstractC32938g f84622e;

    /* renamed from: f */
    public View f84623f;

    /* renamed from: g */
    public int[] f84624g;

    /* renamed from: h */
    public T f84625h;

    /* renamed from: i */
    public boolean f84626i;

    /* renamed from: j */
    public boolean f84627j;

    /* renamed from: k */
    public int[] f84628k;

    /* renamed from: l */
    private AbstractC32937f f84629l;

    /* renamed from: m */
    private AbstractC32926a f84630m;

    /* renamed from: n */
    private boolean f84631n;

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$b */
    public interface AbstractC32933b {
        /* renamed from: a */
        boolean mo121590a(C34029b bVar);
    }

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$d */
    public interface AbstractC32935d {
        void onDismiss();
    }

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$e */
    public interface AbstractC32936e {
        void onMenuSelected(C34029b bVar);
    }

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$f */
    public interface AbstractC32937f {
        void onPrepareMenuList(List<C34029b> list);
    }

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$g */
    public interface AbstractC32938g {
        void onShow(PopupWindow popupWindow);
    }

    /* renamed from: b */
    public List<C34029b> mo121596b() {
        return this.f84620c;
    }

    /* renamed from: d */
    public T mo121598d() {
        return this.f84625h;
    }

    /* renamed from: e */
    public boolean mo121599e() {
        return this.f84631n;
    }

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$a */
    public static class C32932a<T> {

        /* renamed from: a */
        AbstractC32937f f84632a;

        /* renamed from: b */
        AbstractC32936e f84633b = $$Lambda$d$a$4Oc_UXrbTw5czOE7LKSpJ5GyUEE.INSTANCE;

        /* renamed from: c */
        AbstractC32926a.AbstractC32927a f84634c;

        /* renamed from: d */
        AbstractC32935d f84635d;

        /* renamed from: e */
        AbstractC32938g f84636e;

        /* renamed from: f */
        AbstractC32933b f84637f;

        /* renamed from: g */
        View f84638g;

        /* renamed from: h */
        T f84639h;

        /* renamed from: i */
        public Context f84640i;

        /* renamed from: j */
        public int[] f84641j;

        /* renamed from: k */
        public int[] f84642k;

        /* renamed from: l */
        public boolean f84643l = true;

        /* renamed from: m */
        public boolean f84644m = true;

        /* renamed from: a */
        public C32932a<T> mo121610a(int[] iArr) {
            this.f84642k = iArr;
            return this;
        }

        /* renamed from: a */
        public C32930d<T> mo121611a() {
            return new C32930d<>(this);
        }

        /* renamed from: a */
        public C32932a<T> mo121601a(View view) {
            this.f84638g = view;
            return this;
        }

        /* renamed from: b */
        public C32932a<T> mo121612b(boolean z) {
            this.f84644m = z;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121602a(AbstractC32926a.AbstractC32927a aVar) {
            this.f84634c = aVar;
            return this;
        }

        public C32932a(Context context) {
            this.f84640i = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m126821a(C34029b bVar) {
            if (bVar.f87974i != null) {
                bVar.f87974i.onSelected(bVar);
            }
        }

        /* renamed from: a */
        public C32932a<T> mo121603a(AbstractC32933b bVar) {
            this.f84637f = bVar;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121604a(AbstractC32935d dVar) {
            this.f84635d = dVar;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121605a(AbstractC32936e eVar) {
            this.f84633b = eVar;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121606a(AbstractC32937f fVar) {
            this.f84632a = fVar;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121607a(AbstractC32938g gVar) {
            this.f84636e = gVar;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121608a(T t) {
            this.f84639h = t;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121609a(boolean z) {
            this.f84643l = z;
            return this;
        }

        /* renamed from: a */
        public C32932a<T> mo121600a(int i, int i2) {
            this.f84641j = new int[]{i, i2};
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.chat.base.view.a.d$c */
    public class C32934c {
        /* renamed from: a */
        public Context mo121613a() {
            return C32930d.this.f84619b;
        }

        /* renamed from: b */
        public AbstractC32936e mo121614b() {
            return C32930d.this.f84618a;
        }

        /* renamed from: c */
        public AbstractC32935d mo121615c() {
            return C32930d.this.f84621d;
        }

        /* renamed from: d */
        public AbstractC32938g mo121616d() {
            return C32930d.this.f84622e;
        }

        /* renamed from: e */
        public List<C34029b> mo121617e() {
            return C32930d.this.f84620c;
        }

        /* renamed from: f */
        public View mo121618f() {
            return C32930d.this.f84623f;
        }

        /* renamed from: h */
        public boolean mo121620h() {
            return C32930d.this.f84626i;
        }

        /* renamed from: i */
        public boolean mo121621i() {
            return C32930d.this.f84627j;
        }

        /* renamed from: j */
        public int[] mo121622j() {
            return C32930d.this.f84628k;
        }

        /* renamed from: g */
        public int mo121619g() {
            if (C32930d.this.f84624g.length > 1) {
                return C32930d.this.f84624g[1];
            }
            return 0;
        }

        public C32934c() {
        }
    }

    /* renamed from: a */
    public C32930d mo121591a() {
        AbstractC32926a aVar = this.f84630m;
        if (aVar != null) {
            this.f84631n = aVar.mo121582a();
        }
        return this;
    }

    /* renamed from: c */
    public void mo121597c() {
        AbstractC32926a aVar = this.f84630m;
        if (aVar != null) {
            aVar.mo121586b();
            this.f84631n = false;
        }
    }

    /* renamed from: a */
    public void mo121595a(View.OnHoverListener onHoverListener) {
        AbstractC32926a aVar = this.f84630m;
        if (aVar != null) {
            aVar.mo121581a(onHoverListener);
        }
    }

    /* renamed from: a */
    private void m126811a(AbstractC32933b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f84629l.onPrepareMenuList(arrayList);
        this.f84620c = m126810a(arrayList, bVar);
    }

    private C32930d(C32932a<T> aVar) {
        this.f84619b = aVar.f84640i;
        this.f84629l = aVar.f84632a;
        this.f84618a = aVar.f84633b;
        this.f84624g = aVar.f84641j;
        this.f84621d = aVar.f84635d;
        this.f84622e = aVar.f84636e;
        this.f84623f = aVar.f84638g;
        this.f84625h = aVar.f84639h;
        this.f84626i = aVar.f84643l;
        this.f84627j = aVar.f84644m;
        this.f84628k = aVar.f84642k;
        m126811a(aVar.f84637f);
        this.f84630m = aVar.f84634c.create(new C32934c());
    }

    /* renamed from: a */
    public C32930d mo121592a(Rect rect) {
        AbstractC32926a aVar = this.f84630m;
        if (aVar != null) {
            this.f84631n = aVar.mo121583a(rect);
        }
        return this;
    }

    /* renamed from: a */
    public C32930d mo121593a(View view) {
        AbstractC32926a aVar = this.f84630m;
        if (aVar != null) {
            this.f84631n = aVar.mo121584a(view);
        }
        return this;
    }

    /* renamed from: a */
    private List<C34029b> m126810a(List<C34029b> list, AbstractC32933b bVar) {
        ArrayList arrayList = new ArrayList();
        for (C34029b bVar2 : list) {
            if (bVar == null || bVar.mo121590a(bVar2)) {
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C32930d mo121594a(boolean z, int i, int i2, int i3) {
        AbstractC32926a aVar = this.f84630m;
        if (aVar != null) {
            this.f84631n = aVar.mo121585a(z, i, i2, i3);
        }
        return this;
    }
}
