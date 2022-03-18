package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f3065a = new ArrayList<>();

    /* renamed from: b */
    private final Context f3066b;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    @Override // java.lang.Iterable
    public Iterator<Intent> iterator() {
        return this.f3065a.iterator();
    }

    /* renamed from: a */
    public void mo4232a() {
        mo4233a((Bundle) null);
    }

    /* renamed from: a */
    public static TaskStackBuilder m3572a(Context context) {
        return new TaskStackBuilder(context);
    }

    private TaskStackBuilder(Context context) {
        this.f3066b = context;
    }

    /* renamed from: a */
    public TaskStackBuilder mo4231a(Intent intent) {
        this.f3065a.add(intent);
        return this;
    }

    /* renamed from: b */
    public TaskStackBuilder mo4234b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3066b.getPackageManager());
        }
        if (component != null) {
            mo4230a(component);
        }
        mo4231a(intent);
        return this;
    }

    /* renamed from: a */
    public TaskStackBuilder mo4229a(Activity activity) {
        Intent intent;
        if (activity instanceof SupportParentable) {
            intent = ((SupportParentable) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C0739f.m3598a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f3066b.getPackageManager());
            }
            mo4230a(component);
            mo4231a(intent);
        }
        return this;
    }

    /* renamed from: a */
    public TaskStackBuilder mo4230a(ComponentName componentName) {
        int size = this.f3065a.size();
        try {
            Intent a = C0739f.m3599a(this.f3066b, componentName);
            while (a != null) {
                this.f3065a.add(size, a);
                a = C0739f.m3599a(this.f3066b, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public void mo4233a(Bundle bundle) {
        if (!this.f3065a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f3065a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!ContextCompat.startActivities(this.f3066b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3066b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
