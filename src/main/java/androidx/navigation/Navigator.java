package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class Navigator<D extends NavDestination> {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    /* renamed from: androidx.navigation.Navigator$a */
    public interface AbstractC1241a {
    }

    /* renamed from: a */
    public abstract NavDestination mo6264a(D d, Bundle bundle, C1275p pVar, AbstractC1241a aVar);

    /* renamed from: a */
    public void mo6265a(Bundle bundle) {
    }

    /* renamed from: c */
    public abstract boolean mo6266c();

    /* renamed from: d */
    public abstract D mo6267d();

    /* renamed from: e */
    public Bundle mo6268e() {
        return null;
    }
}
