package p001a.p002a.p003a.p005b.p006a;

import android.os.IBinder;
import com.huawei.hms.feature.dynamic.IDynamicLoader;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: a.a.a.b.a.o */
public class C0027o extends HashMap<String, IDynamicLoader> {

    /* renamed from: a */
    public final /* synthetic */ String f45a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f46b;

    public C0027o(String str, IBinder iBinder) {
        this.f45a = str;
        this.f46b = iBinder;
        put(str, IDynamicLoader.Stub.asInterface(iBinder));
    }
}
