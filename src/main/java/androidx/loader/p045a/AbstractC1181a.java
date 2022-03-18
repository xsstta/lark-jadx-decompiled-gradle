package androidx.loader.p045a;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.C1198c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.a.a */
public abstract class AbstractC1181a {

    /* renamed from: androidx.loader.a.a$a */
    public interface AbstractC1182a<D> {
        /* renamed from: a */
        C1198c<D> mo6053a(int i, Bundle bundle);

        /* renamed from: a */
        void mo6054a(C1198c<D> cVar);

        /* renamed from: a */
        void mo6055a(C1198c<D> cVar, D d);
    }

    /* renamed from: a */
    public abstract <D> C1198c<D> mo6046a(int i, Bundle bundle, AbstractC1182a<D> aVar);

    /* renamed from: a */
    public abstract void mo6047a();

    /* renamed from: a */
    public abstract void mo6048a(int i);

    /* renamed from: a */
    public abstract void mo6049a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract <D> C1198c<D> mo6050b(int i);

    /* renamed from: b */
    public abstract <D> C1198c<D> mo6051b(int i, Bundle bundle, AbstractC1182a<D> aVar);

    /* renamed from: b */
    public boolean mo6052b() {
        return false;
    }

    /* renamed from: a */
    public static <T extends LifecycleOwner & ViewModelStoreOwner> AbstractC1181a m5421a(T t) {
        return new C1183b(t, t.getViewModelStore());
    }
}
