package p001a.p002a.p003a.p005b.p006a;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a.a.a.b.a.c */
public final class C0020c {

    /* renamed from: a */
    public static final C0020c f33a = new C0020c();

    /* renamed from: b */
    public Set<String> f34b;

    /* renamed from: a */
    public void mo23a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("installed_module_name");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Logger.println(5, "r", "Get installed module name failed.");
            this.f34b = new HashSet();
            return;
        }
        Logger.println(4, "r", "Installed module name:" + stringArrayList);
        this.f34b = new HashSet(stringArrayList);
    }
}
