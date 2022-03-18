package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.core.os.C0797c;

/* renamed from: androidx.core.content.a */
public final class C0750a {
    /* renamed from: a */
    public static Cursor m3634a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0797c cVar) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 16) {
            if (cVar != null) {
                try {
                    obj = cVar.mo4389d();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new androidx.core.os.OperationCanceledException();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
        if (cVar != null) {
            cVar.mo4387b();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
