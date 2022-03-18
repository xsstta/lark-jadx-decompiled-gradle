package com.ss.android.lark.image.impl.p1964d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.p3456d.C68279a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.image.impl.d.c */
public class C38886c {

    /* renamed from: a */
    public final C38885b f99901a;

    /* renamed from: b */
    private ByteArrayOutputStream f99902b;

    /* renamed from: a */
    private String m153464a() {
        StringBuilder sb = new StringBuilder("Luban_" + System.currentTimeMillis() + UUID.randomUUID().toString());
        if (this.f99901a.f99899e == Bitmap.CompressFormat.WEBP) {
            sb.append(".webp");
        } else if (this.f99901a.f99899e == Bitmap.CompressFormat.PNG) {
            sb.append(".png");
        } else {
            sb.append(".jpg");
        }
        return this.f99901a.f99898d.getAbsolutePath() + File.separator + ((Object) sb);
    }

    C38886c(C38885b bVar) {
        this.f99901a = bVar;
    }

    /* renamed from: b */
    private int m153466b(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private File m153468c(File file) throws IOException {
        long j;
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        char c2;
        String a = m153464a();
        String absolutePath = file.getAbsolutePath();
        long length = file.length() / 5;
        int b = m153466b(absolutePath);
        int[] a2 = m153465a(absolutePath);
        int i5 = 1280;
        if (a2[0] <= a2[1]) {
            double d = ((double) a2[0]) / ((double) a2[1]);
            if (d <= 1.0d && d > 0.5625d) {
                if (a2[0] <= 1280) {
                    i5 = a2[0];
                }
                length = (long) 60;
                i5 = (a2[1] * i5) / a2[0];
                i4 = i5;
            } else if (d <= 0.5625d) {
                if (a2[1] > 720) {
                    c2 = 0;
                    i5 = 720;
                } else {
                    i5 = a2[1];
                    c2 = 0;
                }
                i4 = (a2[c2] * i5) / a2[1];
            } else {
                i4 = 0;
                length = 0;
                i5 = 0;
            }
            i2 = i4;
            j = length;
        } else {
            double d2 = ((double) a2[1]) / ((double) a2[0]);
            if (d2 > 1.0d || d2 <= 0.5625d) {
                if (d2 <= 0.5625d) {
                    if (a2[0] > 720) {
                        c = 1;
                        i3 = 720;
                    } else {
                        i3 = a2[0];
                        c = 1;
                    }
                    i = (a2[c] * i3) / a2[0];
                    j = length;
                    i2 = i3;
                } else {
                    j = 0;
                    i2 = 0;
                    i = 0;
                }
                return m153463a(absolutePath, a, i2, i, b, j);
            }
            if (a2[1] <= 1280) {
                i5 = a2[1];
            }
            i2 = (a2[0] * i5) / a2[1];
            j = (long) 60;
        }
        i = i5;
        return m153463a(absolutePath, a, i2, i, b, j);
    }

    /* renamed from: d */
    private File m153469d(File file) throws IOException {
        long j;
        String a = m153464a();
        String absolutePath = file.getAbsolutePath();
        int b = m153466b(absolutePath);
        if (this.f99901a.f99895a <= 0 || ((long) this.f99901a.f99895a) >= file.length() / 1024) {
            j = file.length() / 1024;
        } else {
            j = (long) this.f99901a.f99895a;
        }
        int[] a2 = m153465a(absolutePath);
        int i = a2[0];
        int i2 = a2[1];
        if (this.f99901a.f99895a > 0 && ((float) this.f99901a.f99895a) < ((float) file.length()) / 1024.0f) {
            float sqrt = (float) Math.sqrt((double) ((((float) file.length()) / 1024.0f) / ((float) this.f99901a.f99895a)));
            i = (int) (((float) i) / sqrt);
            i2 = (int) (((float) i2) / sqrt);
        }
        if (this.f99901a.f99896b > 0) {
            i = Math.min(i, this.f99901a.f99896b);
        }
        if (this.f99901a.f99897c > 0) {
            i2 = Math.min(i2, this.f99901a.f99897c);
        }
        float min = Math.min(((float) i) / ((float) a2[0]), ((float) i2) / ((float) a2[1]));
        int i3 = (int) (((float) a2[0]) * min);
        int i4 = (int) (((float) a2[1]) * min);
        if (((float) this.f99901a.f99895a) <= ((float) file.length()) / 1024.0f || min != 1.0f) {
            return m153463a(absolutePath, a, i3, i4, b, j);
        }
        return file;
    }

    /* renamed from: a */
    public static int[] m153465a(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r6 < 60.0d) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r6 < 60.0d) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r6 < 100.0d) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (r6 < 100.0d) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
        if (r6 < 100.0d) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File m153467b(java.io.File r25) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.image.impl.p1964d.C38886c.m153467b(java.io.File):java.io.File");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Observable<File> mo142403a(final File file) {
        return Observable.fromCallable(new Callable<File>() {
            /* class com.ss.android.lark.image.impl.p1964d.C38886c.CallableC388871 */

            /* renamed from: a */
            public File call() throws Exception {
                C38886c cVar = C38886c.this;
                return cVar.mo142404a(cVar.f99901a.f99900f, file);
            }
        }).subscribeOn(C68279a.m265021a()).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: a */
    private static Bitmap m153460a(int i, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public File mo142404a(int i, File file) throws IOException {
        if (i == 1) {
            return m153468c(file);
        }
        if (i == 3) {
            return m153467b(file);
        }
        if (i != 4) {
            return file;
        }
        return m153469d(file);
    }

    /* renamed from: a */
    private Bitmap m153461a(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        while (true) {
            if (i4 / i3 > i2 || i5 / i3 > i) {
                i3 *= 2;
            } else {
                options.inSampleSize = i3;
                options.inJustDecodeBounds = false;
                return BitmapFactory.decodeFile(str, options);
            }
        }
    }

    /* renamed from: a */
    private File m153462a(String str, Bitmap bitmap, long j) throws IOException {
        C38888d.m153473a(bitmap, "Luban Compressbitmap cannot be null");
        File file = new File(str.substring(0, str.lastIndexOf("/")));
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f99902b;
        if (byteArrayOutputStream == null) {
            this.f99902b = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight());
        } else {
            byteArrayOutputStream.reset();
        }
        int i = 100;
        bitmap.compress(this.f99901a.f99899e, 100, this.f99902b);
        while (((long) (this.f99902b.size() / 1024)) > j && i > 6) {
            this.f99902b.reset();
            i -= 6;
            bitmap.compress(this.f99901a.f99899e, i, this.f99902b);
        }
        bitmap.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        this.f99902b.writeTo(fileOutputStream);
        fileOutputStream.close();
        return new File(str);
    }

    /* renamed from: a */
    private File m153463a(String str, String str2, int i, int i2, int i3, long j) throws IOException {
        Bitmap a = m153461a(str, i, i2);
        if (a != null) {
            a = m153460a(i3, a);
        }
        return m153462a(str2, a, j);
    }
}
