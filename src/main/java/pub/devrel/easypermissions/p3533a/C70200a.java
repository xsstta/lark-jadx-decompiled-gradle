package pub.devrel.easypermissions.p3533a;

import android.app.Activity;
import androidx.core.app.ActivityCompat;

/* access modifiers changed from: package-private */
/* renamed from: pub.devrel.easypermissions.a.a */
public class C70200a extends AbstractC70204e<Activity> {
    public C70200a(Activity activity) {
        super(activity);
    }

    @Override // pub.devrel.easypermissions.p3533a.AbstractC70204e
    /* renamed from: a */
    public void mo247380a(int i, String... strArr) {
        ActivityCompat.requestPermissions((Activity) mo247381a(), strArr, i);
    }
}
