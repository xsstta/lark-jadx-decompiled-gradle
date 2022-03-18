package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.C0760e;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final PorterDuff.Mode f3141h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3142a = -1;

    /* renamed from: b */
    Object f3143b;

    /* renamed from: c */
    public byte[] f3144c;

    /* renamed from: d */
    public Parcelable f3145d;

    /* renamed from: e */
    public int f3146e;

    /* renamed from: f */
    public int f3147f;

    /* renamed from: g */
    public ColorStateList f3148g;

    /* renamed from: i */
    PorterDuff.Mode f3149i = f3141h;

    /* renamed from: j */
    public String f3150j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    /* renamed from: a */
    private static String m3748a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    /* renamed from: a */
    public Icon mo4296a(Context context) {
        Icon icon;
        switch (this.f3142a) {
            case -1:
                return (Icon) this.f3143b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f3143b);
                break;
            case 2:
                icon = Icon.createWithResource(mo4298b(), this.f3146e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f3143b, this.f3146e, this.f3147f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f3143b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m3745a((Bitmap) this.f3143b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f3143b);
                    break;
                }
            case 6:
                if (context != null) {
                    InputStream e = m3753e(context);
                    if (e != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(m3745a(BitmapFactory.decodeStream(e), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(e));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + mo4302d());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + mo4302d());
                }
        }
        ColorStateList colorStateList = this.f3148g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f3149i;
        if (mode != f3141h) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    /* renamed from: a */
    public void mo4297a(boolean z) {
        this.f3150j = this.f3149i.name();
        switch (this.f3142a) {
            case -1:
                if (!z) {
                    this.f3145d = (Parcelable) this.f3143b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3143b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3144c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3145d = (Parcelable) this.f3143b;
                return;
            case 2:
                this.f3144c = ((String) this.f3143b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3144c = (byte[]) this.f3143b;
                return;
            case 4:
            case 6:
                this.f3144c = this.f3143b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: e */
    public Icon mo4303e() {
        return mo4296a((Context) null);
    }

    public IconCompat() {
    }

    /* renamed from: b */
    public String mo4298b() {
        if (this.f3142a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3749b((Icon) this.f3143b);
        }
        if (this.f3142a == 2) {
            return ((String) this.f3143b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: c */
    public int mo4300c() {
        if (this.f3142a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3750c((Icon) this.f3143b);
        }
        if (this.f3142a == 2) {
            return this.f3146e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: d */
    public Uri mo4302d() {
        if (this.f3142a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3752d((Icon) this.f3143b);
        }
        int i = this.f3142a;
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3143b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    /* renamed from: f */
    public void mo4304f() {
        this.f3149i = PorterDuff.Mode.valueOf(this.f3150j);
        switch (this.f3142a) {
            case -1:
                Parcelable parcelable = this.f3145d;
                if (parcelable != null) {
                    this.f3143b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3145d;
                if (parcelable2 != null) {
                    this.f3143b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3144c;
                this.f3143b = bArr;
                this.f3142a = 3;
                this.f3146e = 0;
                this.f3147f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                this.f3143b = new String(this.f3144c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3143b = this.f3144c;
                return;
        }
    }

    public String toString() {
        if (this.f3142a == -1) {
            return String.valueOf(this.f3143b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m3748a(this.f3142a));
        switch (this.f3142a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3143b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3143b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(mo4298b());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(mo4300c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3146e);
                if (this.f3147f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3147f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3143b);
                break;
        }
        if (this.f3148g != null) {
            sb.append(" tint=");
            sb.append(this.f3148g);
        }
        if (this.f3149i != f3141h) {
            sb.append(" mode=");
            sb.append(this.f3149i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public int mo4295a() {
        if (this.f3142a != -1 || Build.VERSION.SDK_INT < 23) {
            return this.f3142a;
        }
        return m3743a((Icon) this.f3143b);
    }

    private IconCompat(int i) {
        this.f3142a = i;
    }

    /* renamed from: b */
    private static String m3749b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: c */
    private static int m3750c(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: d */
    private static Uri m3752d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: a */
    private static int m3743a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    /* renamed from: e */
    private InputStream m3753e(Context context) {
        Uri d = mo4302d();
        String scheme = d.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(d);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + d, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3143b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + d, e2);
                return null;
            }
        }
    }

    /* renamed from: d */
    private Drawable m3751d(Context context) {
        switch (this.f3142a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f3143b);
            case 2:
                String b = mo4298b();
                if (TextUtils.isEmpty(b)) {
                    b = context.getPackageName();
                }
                try {
                    return C0760e.m3682a(m3744a(context, b), this.f3146e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f3146e), this.f3143b), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f3143b, this.f3146e, this.f3147f));
            case 4:
                InputStream e2 = m3753e(context);
                if (e2 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(e2));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m3745a((Bitmap) this.f3143b, false));
            case 6:
                InputStream e3 = m3753e(context);
                if (e3 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(e3)));
                    }
                    return new BitmapDrawable(context.getResources(), m3745a(BitmapFactory.decodeStream(e3), false));
                }
                break;
        }
        return null;
    }

    /* renamed from: b */
    public void mo4299b(Context context) {
        if (this.f3142a == 2) {
            String str = (String) this.f3143b;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                int identifier = m3744a(context, str5).getIdentifier(str4, str3, str5);
                if (this.f3146e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + str5 + "/" + str4);
                    this.f3146e = identifier;
                }
            }
        }
    }

    /* renamed from: c */
    public Drawable mo4301c(Context context) {
        mo4299b(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return mo4296a(context).loadDrawable(context);
        }
        Drawable d = m3751d(context);
        if (!(d == null || (this.f3148g == null && this.f3149i == f3141h))) {
            d.mutate();
            C0774a.m3768a(d, this.f3148g);
            C0774a.m3771a(d, this.f3149i);
        }
        return d;
    }

    /* renamed from: a */
    public static IconCompat m3746a(Context context, int i) {
        if (context != null) {
            return m3747a(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: a */
    private static Resources m3744a(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m3745a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    public static IconCompat m3747a(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3146e = i;
            if (resources != null) {
                try {
                    iconCompat.f3143b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3143b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }
}
