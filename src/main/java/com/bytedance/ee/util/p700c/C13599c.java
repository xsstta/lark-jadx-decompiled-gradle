package com.bytedance.ee.util.p700c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.ee.log.C13479a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.bytedance.ee.util.c.c */
public class C13599c {

    /* renamed from: a */
    private static String f35753a = "luban_disk_cache";

    /* renamed from: b */
    private C13600a f35754b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.util.c.c$b */
    public static class C13601b {

        /* renamed from: a */
        public final C13600a f35761a;

        /* renamed from: b */
        private ByteArrayOutputStream f35762b;

        /* renamed from: a */
        private String m55212a() {
            StringBuilder sb = new StringBuilder("Luban_" + System.currentTimeMillis() + UUID.randomUUID().toString());
            if (this.f35761a.f35759e == Bitmap.CompressFormat.WEBP) {
                sb.append(".webp");
            } else {
                sb.append(".jpg");
            }
            return this.f35761a.f35758d.getAbsolutePath() + File.separator + ((Object) sb);
        }

        C13601b(C13600a aVar) {
            this.f35761a = aVar;
        }

        /* renamed from: a */
        public static int[] m55213a(String str) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = 1;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        }

        /* renamed from: b */
        private int m55214b(String str) {
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

        /* renamed from: b */
        public File mo50539b(File file) throws IOException {
            String a = m55212a();
            String absolutePath = file.getAbsolutePath();
            int b = m55214b(absolutePath);
            if (b == 0) {
                return file;
            }
            return m55210a(a, m55208a(b, BitmapFactory.decodeFile(absolutePath)), file.length());
        }

        /* renamed from: d */
        private File m55217d(File file) throws IOException {
            long j;
            int i;
            int i2;
            int i3;
            char c;
            int i4;
            char c2;
            String a = m55212a();
            String absolutePath = file.getAbsolutePath();
            long length = file.length() / 5;
            int b = m55214b(absolutePath);
            int[] a2 = m55213a(absolutePath);
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
                    return m55211a(absolutePath, a, i2, i, b, j);
                }
                if (a2[1] <= 1280) {
                    i5 = a2[1];
                }
                i2 = (a2[0] * i5) / a2[1];
                j = (long) 60;
            }
            i = i5;
            return m55211a(absolutePath, a, i2, i, b, j);
        }

        /* renamed from: e */
        private File m55218e(File file) throws IOException {
            long j;
            String a = m55212a();
            String absolutePath = file.getAbsolutePath();
            int b = m55214b(absolutePath);
            if (this.f35761a.f35755a <= 0 || ((long) this.f35761a.f35755a) >= file.length() / 1024) {
                j = file.length() / 1024;
            } else {
                j = (long) this.f35761a.f35755a;
            }
            int[] a2 = m55213a(absolutePath);
            int i = a2[0];
            int i2 = a2[1];
            if (this.f35761a.f35755a > 0 && ((float) this.f35761a.f35755a) < ((float) file.length()) / 1024.0f) {
                float sqrt = (float) Math.sqrt((double) ((((float) file.length()) / 1024.0f) / ((float) this.f35761a.f35755a)));
                i = (int) (((float) i) / sqrt);
                i2 = (int) (((float) i2) / sqrt);
            }
            if (this.f35761a.f35756b > 0) {
                i = Math.min(i, this.f35761a.f35756b);
            }
            if (this.f35761a.f35757c > 0) {
                i2 = Math.min(i2, this.f35761a.f35757c);
            }
            float min = Math.min(((float) i) / ((float) a2[0]), ((float) i2) / ((float) a2[1]));
            int i3 = (int) (((float) a2[0]) * min);
            int i4 = (int) (((float) a2[1]) * min);
            if (((float) this.f35761a.f35755a) <= ((float) file.length()) / 1024.0f || min != 1.0f) {
                return m55211a(absolutePath, a, i3, i4, b, j);
            }
            return file;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
            if (r6 < 60.0d) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
            if (r6 < 60.0d) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
            if (r6 < 100.0d) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
            if (r6 < 100.0d) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0100, code lost:
            if (r6 < 100.0d) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0120, code lost:
            if (r6 < 100.0d) goto L_0x0125;
         */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x012b  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x012f  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.io.File m55216c(java.io.File r24) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 314
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.util.p700c.C13599c.C13601b.m55216c(java.io.File):java.io.File");
        }

        /* renamed from: a */
        public File mo50538a(File file) throws IOException {
            int i = this.f35761a.f35760f;
            if (i == 1) {
                return m55217d(file);
            }
            if (i == 3) {
                return m55216c(file);
            }
            if (i != 4) {
                return file;
            }
            return m55218e(file);
        }

        /* renamed from: b */
        private static Bitmap m55215b(int i, Bitmap bitmap) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }

        /* renamed from: a */
        public static Bitmap m55208a(int i, Bitmap bitmap) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (!(createBitmap == bitmap || bitmap == null || bitmap.isRecycled())) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        /* renamed from: a */
        private Bitmap m55209a(String str, int i, int i2) {
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
        private File m55210a(String str, Bitmap bitmap, long j) throws IOException {
            Objects.requireNonNull(bitmap, "Luban Compressbitmap cannot be null");
            File file = new File(str.substring(0, str.lastIndexOf("/")));
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f35762b;
            if (byteArrayOutputStream == null) {
                this.f35762b = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight());
            } else {
                byteArrayOutputStream.reset();
            }
            int i = 100;
            bitmap.compress(this.f35761a.f35759e, 100, this.f35762b);
            while (((long) (this.f35762b.size() / 1024)) > j && i > 6) {
                this.f35762b.reset();
                i -= 6;
                bitmap.compress(this.f35761a.f35759e, i, this.f35762b);
            }
            bitmap.recycle();
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.f35762b.writeTo(fileOutputStream);
            fileOutputStream.close();
            return new File(str);
        }

        /* renamed from: a */
        private File m55211a(String str, String str2, int i, int i2, int i3, long j) throws IOException {
            Bitmap a = m55209a(str, i, i2);
            if (a != null) {
                a = m55215b(i3, a);
            }
            return m55210a(str2, a, j);
        }
    }

    /* renamed from: b */
    public static File m55203b(Context context) {
        return m55202a(context, f35753a);
    }

    /* renamed from: a */
    public C13599c mo50534a(int i) {
        this.f35754b.f35760f = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.util.c.c$a */
    public static class C13600a {

        /* renamed from: a */
        int f35755a;

        /* renamed from: b */
        int f35756b;

        /* renamed from: c */
        int f35757c;

        /* renamed from: d */
        File f35758d;

        /* renamed from: e */
        Bitmap.CompressFormat f35759e = Bitmap.CompressFormat.JPEG;

        /* renamed from: f */
        int f35760f = 3;

        C13600a(File file) {
            this.f35758d = file;
        }
    }

    private C13599c(File file) {
        this.f35754b = new C13600a(file);
    }

    /* renamed from: a */
    public static C13599c m55201a(Context context) {
        return new C13599c(m55203b(context));
    }

    /* renamed from: b */
    public C13599c mo50536b(int i) {
        this.f35754b.f35755a = i;
        return this;
    }

    /* renamed from: a */
    public File mo50535a(File file) {
        try {
            return new C13601b(this.f35754b).mo50539b(file);
        } catch (Exception e) {
            C13479a.m54761a("Luban", e);
            return file;
        }
    }

    /* renamed from: b */
    public File mo50537b(File file) {
        try {
            return new C13601b(this.f35754b).mo50538a(file);
        } catch (IOException e) {
            C13479a.m54761a("Luban", e);
            return file;
        }
    }

    /* renamed from: a */
    private static File m55202a(Context context, String str) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            File file = new File(filesDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        C13479a.m54758a("Luban", "default disk cache dir is null");
        return null;
    }
}
