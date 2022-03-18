package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.os.MemoryFile;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bytedance.common.utility.io.IOUtils;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.manis.b */
public class C54258b {
    /* renamed from: a */
    private static int m210666a(InputStream inputStream) throws IOException {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= inputStream.read() << (i2 * 8);
        }
        return i;
    }

    /* renamed from: a */
    public static final FileDescriptor m210668a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]).invoke(memoryFile, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m210672b(byte[] bArr) {
        Throwable th;
        FileOutputStream fileOutputStream;
        try {
            File createTempFile = File.createTempFile("rpc_", ".parcel");
            fileOutputStream = new FileOutputStream(createTempFile);
            try {
                m210671a(fileOutputStream, bArr.length);
                fileOutputStream.write(bArr);
                String absolutePath = createTempFile.getAbsolutePath();
                IOUtils.close(fileOutputStream);
                return absolutePath;
            } catch (Throwable th2) {
                th = th2;
                try {
                    Log.m165384e("ParcelUtils", "create temp fd failed", th);
                    return null;
                } finally {
                    IOUtils.close(fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            Log.m165384e("ParcelUtils", "create temp fd failed", th);
            return null;
        }
    }

    /* renamed from: a */
    private static FileDescriptor m210669a(byte[] bArr) {
        try {
            MemoryFile memoryFile = new MemoryFile(null, bArr.length + 4);
            OutputStream outputStream = memoryFile.getOutputStream();
            m210671a(outputStream, bArr.length);
            outputStream.write(bArr);
            return m210668a(memoryFile);
        } catch (Throwable th) {
            Log.m165384e("ParcelUtils", "create mem fd failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public static Parcel m210667a(Parcel parcel) {
        Throwable th;
        int readInt = parcel.readInt();
        if (2 == readInt) {
            FileInputStream fileInputStream = new FileInputStream(((ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel)).getFileDescriptor());
            try {
                int a = m210666a(fileInputStream);
                byte[] bArr = new byte[a];
                fileInputStream.read(bArr);
                fileInputStream.close();
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, a);
                obtain.setDataPosition(0);
                return obtain;
            } catch (IOException e) {
                Log.m165384e("ParcelUtils", "read parcel failed!", e);
            } finally {
                IOUtils.close(fileInputStream);
            }
        } else if (3 == readInt) {
            String readString = parcel.readString();
            if (readString == null || !readString.contains("rpc_") || !readString.endsWith(".parcel")) {
                return parcel;
            }
            FileInputStream fileInputStream2 = null;
            try {
                FileInputStream fileInputStream3 = new FileInputStream(new File(readString));
                try {
                    int a2 = m210666a(fileInputStream3);
                    byte[] bArr2 = new byte[a2];
                    fileInputStream3.read(bArr2);
                    fileInputStream3.close();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.unmarshall(bArr2, 0, a2);
                    obtain2.setDataPosition(0);
                    if (readString != null && readString.contains("rpc_") && readString.endsWith(".parcel")) {
                        IOUtils.deleteFile(readString);
                    }
                    IOUtils.close(fileInputStream3);
                    return obtain2;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream3;
                    try {
                        Log.m165384e("ParcelUtils", "read temp file failed!", th);
                        return parcel;
                    } finally {
                        if (readString != null && readString.contains("rpc_") && readString.endsWith(".parcel")) {
                            IOUtils.deleteFile(readString);
                        }
                        IOUtils.close(fileInputStream2);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                Log.m165384e("ParcelUtils", "read temp file failed!", th);
                return parcel;
            }
        } else {
            Parcel obtain3 = Parcel.obtain();
            int readInt2 = parcel.readInt();
            byte[] bArr3 = new byte[readInt2];
            parcel.readByteArray(bArr3);
            obtain3.unmarshall(bArr3, 0, readInt2);
            obtain3.setDataPosition(0);
            return obtain3;
        }
    }

    /* renamed from: b */
    private static void m210673b(Parcel parcel, Parcel parcel2) {
        byte[] marshall = parcel.marshall();
        parcel2.writeInt(1);
        parcel2.writeInt(marshall.length);
        parcel2.writeByteArray(marshall);
    }

    /* renamed from: a */
    public static void m210670a(Parcel parcel, Parcel parcel2) {
        byte[] marshall = parcel.marshall();
        if (parcel.dataSize() < 102400) {
            m210673b(parcel, parcel2);
            return;
        }
        try {
            FileDescriptor a = m210669a(marshall);
            if (a != null) {
                parcel2.writeInt(2);
                ParcelFileDescriptor.dup(a).writeToParcel(parcel2, 1);
                return;
            }
            String b = m210672b(marshall);
            if (!TextUtils.isEmpty(b)) {
                parcel2.writeInt(3);
                parcel2.writeString(b);
                return;
            }
            m210673b(parcel, parcel2);
        } catch (Throwable th) {
            Log.m165384e("ParcelUtils", "write parcel failed!", th);
        }
    }

    /* renamed from: a */
    private static void m210671a(OutputStream outputStream, int i) throws IOException {
        for (int i2 = 0; i2 < 4; i2++) {
            outputStream.write((byte) ((i >> (i2 * 8)) & 255));
        }
    }
}
