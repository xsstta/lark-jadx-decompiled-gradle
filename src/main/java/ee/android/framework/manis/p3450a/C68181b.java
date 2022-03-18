package ee.android.framework.manis.p3450a;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.base.BinderWrapper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ee.android.framework.manis.a.b */
public class C68181b extends MatrixCursor {

    /* renamed from: a */
    public static final String[] f171416a = {"id"};

    /* renamed from: b */
    private static Map<String, C68181b> f171417b = new ConcurrentHashMap();

    /* renamed from: c */
    private Bundle f171418c;

    public Bundle getExtras() {
        return this.f171418c;
    }

    /* renamed from: a */
    public static C68181b m264832a(IBinder iBinder) {
        try {
            C68181b bVar = new C68181b(f171416a, iBinder);
            f171417b.put(iBinder.getInterfaceDescriptor(), bVar);
            return bVar;
        } catch (RemoteException e) {
            Log.m165385e("ProcessCursor", "generateCursor cursor failed.", e, true);
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m264831a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        Bundle extras = cursor.getExtras();
        extras.setClassLoader(C68181b.class.getClassLoader());
        BinderWrapper binderWrapper = (BinderWrapper) extras.getParcelable("KeyBinderWrapper");
        if (binderWrapper == null) {
            return null;
        }
        return binderWrapper.mo237091a();
    }

    public C68181b(String[] strArr, IBinder iBinder) {
        super(strArr);
        Bundle bundle = new Bundle();
        this.f171418c = bundle;
        bundle.putParcelable("KeyBinderWrapper", new BinderWrapper(iBinder));
    }
}
