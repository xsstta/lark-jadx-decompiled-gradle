package pub.devrel.easypermissions.p3533a;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

/* access modifiers changed from: package-private */
/* renamed from: pub.devrel.easypermissions.a.b */
public class C70201b extends AbstractC70202c<AppCompatActivity> {
    public C70201b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // pub.devrel.easypermissions.p3533a.AbstractC70204e
    /* renamed from: a */
    public void mo247380a(int i, String... strArr) {
        ActivityCompat.requestPermissions((Activity) mo247381a(), strArr, i);
    }
}
