package pub.devrel.easypermissions.p3533a;

import android.app.Activity;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/* renamed from: pub.devrel.easypermissions.a.e */
public abstract class AbstractC70204e<T> {

    /* renamed from: a */
    private T f175344a;

    /* renamed from: a */
    public abstract void mo247380a(int i, String... strArr);

    /* renamed from: a */
    public T mo247381a() {
        return this.f175344a;
    }

    public AbstractC70204e(T t) {
        this.f175344a = t;
    }

    /* renamed from: a */
    public static AbstractC70204e<? extends Activity> m269033a(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return new C70203d(activity);
        }
        if (activity instanceof AppCompatActivity) {
            return new C70201b((AppCompatActivity) activity);
        }
        return new C70200a(activity);
    }

    /* renamed from: a */
    public static AbstractC70204e<Fragment> m269034a(Fragment fragment) {
        if (Build.VERSION.SDK_INT < 23) {
            return new C70203d(fragment);
        }
        return new C70205f(fragment);
    }
}
