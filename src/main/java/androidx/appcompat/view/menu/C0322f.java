package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.p026a.p027a.AbstractMenuC0707a;
import androidx.core.view.AbstractC0894b;
import androidx.core.view.C0917s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0322f implements AbstractMenuC0707a {

    /* renamed from: d */
    private static final int[] f1058d = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f1059A;

    /* renamed from: a */
    CharSequence f1060a;

    /* renamed from: b */
    Drawable f1061b;

    /* renamed from: c */
    View f1062c;

    /* renamed from: e */
    private final Context f1063e;

    /* renamed from: f */
    private final Resources f1064f;

    /* renamed from: g */
    private boolean f1065g;

    /* renamed from: h */
    private boolean f1066h;

    /* renamed from: i */
    private AbstractC0323a f1067i;

    /* renamed from: j */
    private ArrayList<C0326h> f1068j;

    /* renamed from: k */
    private ArrayList<C0326h> f1069k;

    /* renamed from: l */
    private boolean f1070l;

    /* renamed from: m */
    private ArrayList<C0326h> f1071m;

    /* renamed from: n */
    private ArrayList<C0326h> f1072n;

    /* renamed from: o */
    private boolean f1073o;

    /* renamed from: p */
    private int f1074p;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f1075q;

    /* renamed from: r */
    private boolean f1076r;

    /* renamed from: s */
    private boolean f1077s;

    /* renamed from: t */
    private boolean f1078t;

    /* renamed from: u */
    private boolean f1079u;

    /* renamed from: v */
    private boolean f1080v;

    /* renamed from: w */
    private ArrayList<C0326h> f1081w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<AbstractC0337l>> f1082x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0326h f1083y;

    /* renamed from: z */
    private boolean f1084z = false;

    /* renamed from: androidx.appcompat.view.menu.f$a */
    public interface AbstractC0323a {
        /* renamed from: a */
        void mo836a(C0322f fVar);

        /* renamed from: a */
        boolean mo839a(C0322f fVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.f$b */
    public interface AbstractC0324b {
        /* renamed from: a */
        boolean mo1266a(C0326h hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo1387a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: q */
    public C0322f mo1445q() {
        return this;
    }

    /* renamed from: d */
    public boolean mo1424d() {
        return this.f1066h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Resources mo1426e() {
        return this.f1064f;
    }

    /* renamed from: f */
    public Context mo1428f() {
        return this.f1063e;
    }

    /* renamed from: n */
    public CharSequence mo1440n() {
        return this.f1060a;
    }

    /* renamed from: o */
    public Drawable mo1441o() {
        return this.f1061b;
    }

    /* renamed from: p */
    public View mo1442p() {
        return this.f1062c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo1446r() {
        return this.f1079u;
    }

    /* renamed from: s */
    public C0326h mo1449s() {
        return this.f1083y;
    }

    /* renamed from: a */
    public void mo1392a(AbstractC0337l lVar) {
        mo1393a(lVar, this.f1063e);
    }

    /* renamed from: a */
    public void mo1393a(AbstractC0337l lVar, Context context) {
        this.f1082x.add(new WeakReference<>(lVar));
        lVar.mo1345a(context, this);
        this.f1073o = true;
    }

    /* renamed from: a */
    public void mo1388a(Bundle bundle) {
        m1327e(bundle);
    }

    /* renamed from: a */
    public void mo1390a(AbstractC0323a aVar) {
        this.f1067i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1389a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1068j.size();
        mo1432h();
        for (int i = 0; i < size; i++) {
            C0326h hVar = this.f1068j.get(i);
            if (hVar.getGroupId() == groupId && hVar.mo1477g() && hVar.isCheckable()) {
                hVar.mo1468b(hVar == menuItem);
            }
        }
        mo1434i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1398a(C0322f fVar, MenuItem menuItem) {
        AbstractC0323a aVar = this.f1067i;
        return aVar != null && aVar.mo839a(fVar, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1394a(List<C0326h> list, int i, KeyEvent keyEvent) {
        boolean c = mo1417c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1068j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0326h hVar = this.f1068j.get(i2);
                if (hVar.hasSubMenu()) {
                    ((C0322f) hVar.getSubMenu()).mo1394a(list, i, keyEvent);
                }
                char alphabeticShortcut = c ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if (((modifiers & 69647) == ((c ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c && alphabeticShortcut == '\b' && i == 67)) && hVar.isEnabled())) {
                    list.add(hVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0326h mo1386a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0326h> arrayList = this.f1081w;
        arrayList.clear();
        mo1394a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean c2 = mo1417c();
        for (int i2 = 0; i2 < size; i2++) {
            C0326h hVar = arrayList.get(i2);
            if (c2) {
                c = hVar.getAlphabeticShortcut();
            } else {
                c = hVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (c2 && c == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo1396a(MenuItem menuItem, int i) {
        return mo1397a(menuItem, (AbstractC0337l) null, i);
    }

    /* renamed from: a */
    public boolean mo1397a(MenuItem menuItem, AbstractC0337l lVar, int i) {
        C0326h hVar = (C0326h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean b = hVar.mo1469b();
        AbstractC0894b a = hVar.mo1284a();
        boolean z = a != null && a.mo1580c();
        if (hVar.mo1501n()) {
            b |= hVar.expandActionView();
            if (b) {
                mo1395a(true);
            }
        } else if (hVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo1395a(false);
            }
            if (!hVar.hasSubMenu()) {
                hVar.mo1465a(new SubMenuC0346q(mo1428f(), this, hVar));
            }
            SubMenuC0346q qVar = (SubMenuC0346q) hVar.getSubMenu();
            if (z) {
                a.mo1578a(qVar);
            }
            b |= m1325a(qVar, lVar);
            if (!b) {
                mo1395a(true);
            }
        } else if ((i & 1) == 0) {
            mo1395a(true);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo1395a(boolean z) {
        if (!this.f1080v) {
            this.f1080v = true;
            Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0337l> next = it.next();
                AbstractC0337l lVar = next.get();
                if (lVar == null) {
                    this.f1082x.remove(next);
                } else {
                    lVar.mo1241a(this, z);
                }
            }
            this.f1080v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1391a(C0326h hVar) {
        this.f1070l = true;
        mo1412b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0322f mo1385a(CharSequence charSequence) {
        m1323a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0322f mo1384a(View view) {
        m1323a(0, null, 0, null, view);
        return this;
    }

    public void close() {
        mo1395a(true);
    }

    /* renamed from: g */
    public void mo1430g() {
        AbstractC0323a aVar = this.f1067i;
        if (aVar != null) {
            aVar.mo836a(this);
        }
    }

    /* renamed from: l */
    public ArrayList<C0326h> mo1438l() {
        mo1437k();
        return this.f1071m;
    }

    /* renamed from: m */
    public ArrayList<C0326h> mo1439m() {
        mo1437k();
        return this.f1072n;
    }

    public int size() {
        return this.f1068j.size();
    }

    /* renamed from: b */
    public boolean mo1413b() {
        return this.f1084z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1417c() {
        return this.f1065g;
    }

    public void clearHeader() {
        this.f1061b = null;
        this.f1060a = null;
        this.f1062c = null;
        mo1412b(false);
    }

    /* renamed from: h */
    public void mo1432h() {
        if (!this.f1076r) {
            this.f1076r = true;
            this.f1077s = false;
            this.f1078t = false;
        }
    }

    /* renamed from: i */
    public void mo1434i() {
        this.f1076r = false;
        if (this.f1077s) {
            this.f1077s = false;
            mo1412b(this.f1078t);
        }
    }

    public void clear() {
        C0326h hVar = this.f1083y;
        if (hVar != null) {
            mo1425d(hVar);
        }
        this.f1068j.clear();
        mo1412b(true);
    }

    public boolean hasVisibleItems() {
        if (this.f1059A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1068j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public ArrayList<C0326h> mo1436j() {
        if (!this.f1070l) {
            return this.f1069k;
        }
        this.f1069k.clear();
        int size = this.f1068j.size();
        for (int i = 0; i < size; i++) {
            C0326h hVar = this.f1068j.get(i);
            if (hVar.isVisible()) {
                this.f1069k.add(hVar);
            }
        }
        this.f1070l = false;
        this.f1073o = true;
        return this.f1069k;
    }

    /* renamed from: k */
    public void mo1437k() {
        ArrayList<C0326h> j = mo1436j();
        if (this.f1073o) {
            Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<AbstractC0337l> next = it.next();
                AbstractC0337l lVar = next.get();
                if (lVar == null) {
                    this.f1082x.remove(next);
                } else {
                    z |= lVar.mo1247b();
                }
            }
            if (z) {
                this.f1071m.clear();
                this.f1072n.clear();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C0326h hVar = j.get(i);
                    if (hVar.mo1497j()) {
                        this.f1071m.add(hVar);
                    } else {
                        this.f1072n.add(hVar);
                    }
                }
            } else {
                this.f1071m.clear();
                this.f1072n.clear();
                this.f1072n.addAll(mo1436j());
            }
            this.f1073o = false;
        }
    }

    /* renamed from: a */
    public C0322f mo1382a(int i) {
        this.f1074p = i;
        return this;
    }

    /* renamed from: b */
    public void mo1409b(Bundle bundle) {
        m1330f(bundle);
    }

    /* renamed from: c */
    public void mo1416c(boolean z) {
        this.f1059A = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1084z = z;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1410b(C0326h hVar) {
        this.f1073o = true;
        mo1412b(true);
    }

    /* renamed from: c */
    public int mo1414c(int i) {
        return mo1380a(i, 0);
    }

    public void setQwertyMode(boolean z) {
        this.f1065g = z;
        mo1412b(false);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo1381a(0, 0, 0, this.f1064f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1064f.getString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0322f mo1422d(int i) {
        m1323a(i, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0322f mo1427e(int i) {
        m1323a(0, null, i, null, null);
        return this;
    }

    public MenuItem getItem(int i) {
        return this.f1068j.get(i);
    }

    public void removeItem(int i) {
        m1324a(mo1408b(i), true);
    }

    /* renamed from: e */
    private void m1328e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1064f.getConfiguration().keyboard == 1 || !C0917s.m4408c(ViewConfiguration.get(this.f1063e), this.f1063e)) {
            z2 = false;
        }
        this.f1066h = z2;
    }

    /* renamed from: f */
    private static int m1329f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1058d;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: b */
    public int mo1408b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1068j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m1326d(boolean z) {
        if (!this.f1082x.isEmpty()) {
            mo1432h();
            Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0337l> next = it.next();
                AbstractC0337l lVar = next.get();
                if (lVar == null) {
                    this.f1082x.remove(next);
                } else {
                    lVar.mo1243a(z);
                }
            }
            mo1434i();
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo1381a(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1411b(AbstractC0337l lVar) {
        Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0337l> next = it.next();
            AbstractC0337l lVar2 = next.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.f1082x.remove(next);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1418c(C0326h hVar) {
        boolean z = false;
        if (this.f1082x.isEmpty()) {
            return false;
        }
        mo1432h();
        Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0337l> next = it.next();
            AbstractC0337l lVar = next.get();
            if (lVar == null) {
                this.f1082x.remove(next);
            } else {
                z = lVar.mo1350a(this, hVar);
                if (z) {
                    break;
                }
            }
        }
        mo1434i();
        if (z) {
            this.f1083y = hVar;
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0326h hVar = this.f1068j.get(i2);
            if (hVar.getItemId() == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int c = mo1414c(i);
        if (c >= 0) {
            int size = this.f1068j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1068j.get(c).getGroupId() != i) {
                    mo1412b(true);
                } else {
                    m1324a(c, false);
                    i2 = i3;
                }
            }
            mo1412b(true);
        }
    }

    public C0322f(Context context) {
        this.f1063e = context;
        this.f1064f = context.getResources();
        this.f1068j = new ArrayList<>();
        this.f1069k = new ArrayList<>();
        this.f1070l = true;
        this.f1071m = new ArrayList<>();
        this.f1072n = new ArrayList<>();
        this.f1073o = true;
        m1328e(true);
    }

    /* renamed from: e */
    private void m1327e(Bundle bundle) {
        Parcelable c_;
        if (!this.f1082x.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0337l> next = it.next();
                AbstractC0337l lVar = next.get();
                if (lVar == null) {
                    this.f1082x.remove(next);
                } else {
                    int c = lVar.mo1353c();
                    if (c > 0 && (c_ = lVar.c_()) != null) {
                        sparseArray.put(c, c_);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: f */
    private void m1330f(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1082x.isEmpty()) {
            Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0337l> next = it.next();
                AbstractC0337l lVar = next.get();
                if (lVar == null) {
                    this.f1082x.remove(next);
                } else {
                    int c = lVar.mo1353c();
                    if (c > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(c)) != null) {
                        lVar.mo1237a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1412b(boolean z) {
        if (!this.f1076r) {
            if (z) {
                this.f1070l = true;
                this.f1073o = true;
            }
            m1326d(z);
            return;
        }
        this.f1077s = true;
        if (z) {
            this.f1078t = true;
        }
    }

    /* renamed from: c */
    public void mo1415c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0346q) item.getSubMenu()).mo1415c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1387a(), sparseArray);
        }
    }

    /* renamed from: d */
    public void mo1423d(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1387a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC0346q) item.getSubMenu()).mo1423d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: d */
    public boolean mo1425d(C0326h hVar) {
        boolean z = false;
        if (!this.f1082x.isEmpty() && this.f1083y == hVar) {
            mo1432h();
            Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0337l> next = it.next();
                AbstractC0337l lVar = next.get();
                if (lVar == null) {
                    this.f1082x.remove(next);
                } else {
                    z = lVar.mo1352b(this, hVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1434i();
            if (z) {
                this.f1083y = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0322f mo1383a(Drawable drawable) {
        m1323a(0, null, 0, drawable, null);
        return this;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (mo1386a(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1396a(findItem(i), i2);
    }

    /* renamed from: a */
    private static int m1321a(ArrayList<C0326h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1470c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1068j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0326h hVar = this.f1068j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1068j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0326h hVar = this.f1068j.get(i2);
            if (hVar.getGroupId() == i && hVar.mo1471c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1412b(true);
        }
    }

    /* renamed from: a */
    private void m1324a(int i, boolean z) {
        if (i >= 0 && i < this.f1068j.size()) {
            this.f1068j.remove(i);
            if (z) {
                mo1412b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m1325a(SubMenuC0346q qVar, AbstractC0337l lVar) {
        boolean z = false;
        if (this.f1082x.isEmpty()) {
            return false;
        }
        if (lVar != null) {
            z = lVar.mo1244a(qVar);
        }
        Iterator<WeakReference<AbstractC0337l>> it = this.f1082x.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0337l> next = it.next();
            AbstractC0337l lVar2 = next.get();
            if (lVar2 == null) {
                this.f1082x.remove(next);
            } else if (!z) {
                z = lVar2.mo1244a(qVar);
            }
        }
        return z;
    }

    /* renamed from: a */
    public int mo1380a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1068j.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0326h a = mo1386a(i, keyEvent);
        if (a != null) {
            z = mo1396a(a, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo1395a(true);
        }
        return z;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1068j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0326h hVar = this.f1068j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.mo1466a(z2);
                hVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1381a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1381a(i, i2, i3, this.f1064f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1064f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0326h hVar = (C0326h) mo1381a(i, i2, i3, charSequence);
        SubMenuC0346q qVar = new SubMenuC0346q(this.f1063e, this, hVar);
        hVar.mo1465a(qVar);
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1381a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m1329f(i3);
        C0326h a = m1322a(i, i2, i3, f, charSequence, this.f1074p);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1075q;
        if (contextMenuInfo != null) {
            a.mo1464a(contextMenuInfo);
        }
        ArrayList<C0326h> arrayList = this.f1068j;
        arrayList.add(m1321a(arrayList, f), a);
        mo1412b(true);
        return a;
    }

    /* renamed from: a */
    private void m1323a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources e = mo1426e();
        if (view != null) {
            this.f1062c = view;
            this.f1060a = null;
            this.f1061b = null;
        } else {
            if (i > 0) {
                this.f1060a = e.getText(i);
            } else if (charSequence != null) {
                this.f1060a = charSequence;
            }
            if (i2 > 0) {
                this.f1061b = ContextCompat.getDrawable(mo1428f(), i2);
            } else if (drawable != null) {
                this.f1061b = drawable;
            }
            this.f1062c = null;
        }
        mo1412b(false);
    }

    /* renamed from: a */
    private C0326h m1322a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0326h(this, i, i2, i3, i4, charSequence, i5);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.f1063e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }
}
