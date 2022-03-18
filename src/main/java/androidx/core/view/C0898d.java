package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* renamed from: androidx.core.view.d */
public final class C0898d {

    /* renamed from: a */
    private Object f3428a;

    private C0898d(Object obj) {
        this.f3428a = obj;
    }

    /* renamed from: a */
    public static C0898d m4340a(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions;
        if (Build.VERSION.SDK_INT < 24 || (requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new C0898d(requestDragAndDropPermissions);
    }
}
