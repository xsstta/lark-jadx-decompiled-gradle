package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0257a;
import androidx.appcompat.view.menu.AbstractC0337l;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.view.menu.g */
class DialogInterface$OnClickListenerC0325g implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, AbstractC0337l.AbstractC0338a {

    /* renamed from: a */
    C0319d f1085a;

    /* renamed from: b */
    private C0322f f1086b;

    /* renamed from: c */
    private DialogInterfaceC0257a f1087c;

    /* renamed from: d */
    private AbstractC0337l.AbstractC0338a f1088d;

    /* renamed from: a */
    public void mo1456a() {
        DialogInterfaceC0257a aVar = this.f1087c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public DialogInterface$OnClickListenerC0325g(C0322f fVar) {
        this.f1086b = fVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
    /* renamed from: a */
    public boolean mo883a(C0322f fVar) {
        AbstractC0337l.AbstractC0338a aVar = this.f1088d;
        if (aVar != null) {
            return aVar.mo883a(fVar);
        }
        return false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1085a.mo1241a(this.f1086b, true);
    }

    /* renamed from: a */
    public void mo1457a(IBinder iBinder) {
        C0322f fVar = this.f1086b;
        DialogInterfaceC0257a.C0258a aVar = new DialogInterfaceC0257a.C0258a(fVar.mo1428f());
        C0319d dVar = new C0319d(aVar.mo916a(), (int) R.layout.abc_list_menu_item_layout);
        this.f1085a = dVar;
        dVar.mo1242a(this);
        this.f1086b.mo1392a(this.f1085a);
        aVar.mo922a(this.f1085a.mo1362d(), this);
        View p = fVar.mo1442p();
        if (p != null) {
            aVar.mo920a(p);
        } else {
            aVar.mo919a(fVar.mo1441o()).mo923a(fVar.mo1440n());
        }
        aVar.mo918a(this);
        DialogInterfaceC0257a b = aVar.mo929b();
        this.f1087c = b;
        b.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1087c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1087c.show();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
    /* renamed from: a */
    public void mo882a(C0322f fVar, boolean z) {
        if (z || fVar == this.f1086b) {
            mo1456a();
        }
        AbstractC0337l.AbstractC0338a aVar = this.f1088d;
        if (aVar != null) {
            aVar.mo882a(fVar, z);
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1086b.mo1396a((C0326h) this.f1085a.mo1362d().getItem(i), 0);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1087c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1087c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1086b.mo1395a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1086b.performShortcut(i, keyEvent, 0);
    }
}
