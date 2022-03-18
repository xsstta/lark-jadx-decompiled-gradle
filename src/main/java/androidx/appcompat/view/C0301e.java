package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.view.menu.MenuC0341n;
import androidx.appcompat.view.menu.MenuItemC0328i;
import androidx.collection.SimpleArrayMap;
import androidx.core.p026a.p027a.AbstractMenuC0707a;
import androidx.core.p026a.p027a.AbstractMenuItemC0708b;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.e */
public class C0301e extends ActionMode {

    /* renamed from: a */
    final Context f881a;

    /* renamed from: b */
    final AbstractC0297b f882b;

    public void finish() {
        this.f882b.mo996c();
    }

    public View getCustomView() {
        return this.f882b.mo1002i();
    }

    public MenuInflater getMenuInflater() {
        return this.f882b.mo988a();
    }

    public CharSequence getSubtitle() {
        return this.f882b.mo1000g();
    }

    public Object getTag() {
        return this.f882b.mo1159j();
    }

    public CharSequence getTitle() {
        return this.f882b.mo999f();
    }

    public boolean getTitleOptionalHint() {
        return this.f882b.mo1160k();
    }

    public void invalidate() {
        this.f882b.mo997d();
    }

    public boolean isTitleOptional() {
        return this.f882b.mo1001h();
    }

    public Menu getMenu() {
        return new MenuC0341n(this.f881a, (AbstractMenuC0707a) this.f882b.mo993b());
    }

    public void setCustomView(View view) {
        this.f882b.mo990a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f882b.mo994b(i);
    }

    public void setTag(Object obj) {
        this.f882b.mo1158a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f882b.mo989a(i);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f882b.mo992a(z);
    }

    /* renamed from: androidx.appcompat.view.e$a */
    public static class C0302a implements AbstractC0297b.AbstractC0298a {

        /* renamed from: a */
        final ActionMode.Callback f883a;

        /* renamed from: b */
        final Context f884b;

        /* renamed from: c */
        final ArrayList<C0301e> f885c = new ArrayList<>();

        /* renamed from: d */
        final SimpleArrayMap<Menu, Menu> f886d = new SimpleArrayMap<>();

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: a */
        public void mo884a(AbstractC0297b bVar) {
            this.f883a.onDestroyActionMode(mo1180b(bVar));
        }

        /* renamed from: a */
        private Menu m1195a(Menu menu) {
            Menu menu2 = this.f886d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC0341n nVar = new MenuC0341n(this.f884b, (AbstractMenuC0707a) menu);
            this.f886d.put(menu, nVar);
            return nVar;
        }

        /* renamed from: b */
        public ActionMode mo1180b(AbstractC0297b bVar) {
            int size = this.f885c.size();
            for (int i = 0; i < size; i++) {
                C0301e eVar = this.f885c.get(i);
                if (eVar != null && eVar.f882b == bVar) {
                    return eVar;
                }
            }
            C0301e eVar2 = new C0301e(this.f884b, bVar);
            this.f885c.add(eVar2);
            return eVar2;
        }

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: b */
        public boolean mo887b(AbstractC0297b bVar, Menu menu) {
            return this.f883a.onPrepareActionMode(mo1180b(bVar), m1195a(menu));
        }

        public C0302a(Context context, ActionMode.Callback callback) {
            this.f884b = context;
            this.f883a = callback;
        }

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: a */
        public boolean mo885a(AbstractC0297b bVar, Menu menu) {
            return this.f883a.onCreateActionMode(mo1180b(bVar), m1195a(menu));
        }

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: a */
        public boolean mo886a(AbstractC0297b bVar, MenuItem menuItem) {
            return this.f883a.onActionItemClicked(mo1180b(bVar), new MenuItemC0328i(this.f884b, (AbstractMenuItemC0708b) menuItem));
        }
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f882b.mo991a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f882b.mo995b(charSequence);
    }

    public C0301e(Context context, AbstractC0297b bVar) {
        this.f881a = context;
        this.f882b = bVar;
    }
}
