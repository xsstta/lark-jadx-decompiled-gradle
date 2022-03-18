package com.bumptech.glide.load.resource.p091b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.b.d */
public class C2404d implements AbstractC2391g<Uri, Drawable> {

    /* renamed from: a */
    private final Context f7946a;

    public C2404d(Context context) {
        this.f7946a = context.getApplicationContext();
    }

    /* renamed from: a */
    private int m10174a(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: a */
    public boolean mo10904a(Uri uri, C2390f fVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* renamed from: a */
    private int m10173a(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m10176b(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m10174a(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: b */
    private int m10176b(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: a */
    private Context m10175a(Uri uri, String str) {
        if (str.equals(this.f7946a.getPackageName())) {
            return this.f7946a;
        }
        try {
            return this.f7946a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f7946a.getPackageName())) {
                return this.f7946a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: a */
    public AbstractC2383u<Drawable> mo10903a(Uri uri, int i, int i2, C2390f fVar) {
        Context a = m10175a(uri, uri.getAuthority());
        return C2403c.m10169a(C2401a.m10162a(this.f7946a, a, m10173a(a, uri)));
    }
}
