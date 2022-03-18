package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.AbstractC0339m;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class AbstractC0317b implements AbstractC0337l {

    /* renamed from: a */
    protected Context f1027a;

    /* renamed from: b */
    protected Context f1028b;

    /* renamed from: c */
    public C0322f f1029c;

    /* renamed from: d */
    protected LayoutInflater f1030d;

    /* renamed from: e */
    protected LayoutInflater f1031e;

    /* renamed from: f */
    public AbstractC0339m f1032f;

    /* renamed from: g */
    private AbstractC0337l.AbstractC0338a f1033g;

    /* renamed from: h */
    private int f1034h;

    /* renamed from: i */
    private int f1035i;

    /* renamed from: j */
    private int f1036j;

    /* renamed from: a */
    public abstract void mo1347a(C0326h hVar, AbstractC0339m.AbstractC0340a aVar);

    /* renamed from: a */
    public boolean mo1348a(int i, C0326h hVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1350a(C0322f fVar, C0326h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1247b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1352b(C0322f fVar, C0326h hVar) {
        return false;
    }

    /* renamed from: a */
    public AbstractC0337l.AbstractC0338a mo1342a() {
        return this.f1033g;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: c */
    public int mo1353c() {
        return this.f1036j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1349a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1244a(androidx.appcompat.view.menu.SubMenuC0346q r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.l$a r0 = r1.f1033g
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.f r2 = r1.f1029c
        L_0x0009:
            boolean r2 = r0.mo883a(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.AbstractC0317b.mo1244a(androidx.appcompat.view.menu.q):boolean");
    }

    /* renamed from: a */
    public void mo1344a(int i) {
        this.f1036j = i;
    }

    /* renamed from: b */
    public AbstractC0339m.AbstractC0340a mo1351b(ViewGroup viewGroup) {
        return (AbstractC0339m.AbstractC0340a) this.f1030d.inflate(this.f1035i, viewGroup, false);
    }

    /* renamed from: a */
    public AbstractC0339m mo1343a(ViewGroup viewGroup) {
        if (this.f1032f == null) {
            AbstractC0339m mVar = (AbstractC0339m) this.f1030d.inflate(this.f1034h, viewGroup, false);
            this.f1032f = mVar;
            mVar.mo1265a(this.f1029c);
            mo1243a(true);
        }
        return this.f1032f;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
        this.f1033g = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1243a(boolean z) {
        C0326h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f1032f;
        if (viewGroup != null) {
            C0322f fVar = this.f1029c;
            int i = 0;
            if (fVar != null) {
                fVar.mo1437k();
                ArrayList<C0326h> j = this.f1029c.mo1436j();
                int size = j.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0326h hVar2 = j.get(i3);
                    if (mo1348a(i2, hVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof AbstractC0339m.AbstractC0340a) {
                            hVar = ((AbstractC0339m.AbstractC0340a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a = mo1341a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo1346a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1349a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1345a(Context context, C0322f fVar) {
        this.f1028b = context;
        this.f1031e = LayoutInflater.from(context);
        this.f1029c = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1346a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1032f).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
        AbstractC0337l.AbstractC0338a aVar = this.f1033g;
        if (aVar != null) {
            aVar.mo882a(fVar, z);
        }
    }

    public AbstractC0317b(Context context, int i, int i2) {
        this.f1027a = context;
        this.f1030d = LayoutInflater.from(context);
        this.f1034h = i;
        this.f1035i = i2;
    }

    /* renamed from: a */
    public View mo1341a(C0326h hVar, View view, ViewGroup viewGroup) {
        AbstractC0339m.AbstractC0340a aVar;
        if (view instanceof AbstractC0339m.AbstractC0340a) {
            aVar = (AbstractC0339m.AbstractC0340a) view;
        } else {
            aVar = mo1351b(viewGroup);
        }
        mo1347a(hVar, aVar);
        return (View) aVar;
    }
}
