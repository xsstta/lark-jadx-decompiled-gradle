package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: androidx.core.graphics.k */
public class C0794k {
    /* renamed from: a */
    public static void m3869a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static ByteBuffer m3868a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static File m3865a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3871a(File file, InputStream inputStream) {
        Throwable th;
        IOException e;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m3869a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m3869a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    m3869a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                m3869a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m3869a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m3866a(Context context, Resources resources, int i) {
        File a = m3865a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m3870a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = m3868a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public static ByteBuffer m3867a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                    fileInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return map;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m3870a(File file, Resources resources, int i) {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = m3871a(file, inputStream);
                m3869a(inputStream);
                return a;
            } catch (Throwable th2) {
                th = th2;
                m3869a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            m3869a(inputStream);
            throw th;
        }
    }
}
