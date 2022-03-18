package com.bytedance.lynx.webview.glue;

import com.bytedance.lynx.webview.p839a.p841b.C19918b;
import com.bytedance.lynx.webview.util.C20044e;
import com.bytedance.lynx.webview.util.C20048g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lzma {
    public static boolean decompress(String str, String str2) {
        return decompress(new File(str), new File(str2));
    }

    public static boolean decompress(File file, File file2) {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Exception e;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                try {
                    e.printStackTrace();
                    try {
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                bufferedInputStream.close();
                bufferedOutputStream.close();
                throw th;
            }
            try {
                byte[] bArr = new byte[5];
                if (bufferedInputStream2.read(bArr, 0, 5) != 5) {
                    C20048g.m73164d("LZMA", "input .lzma is too short");
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return false;
                }
                C19918b bVar = new C19918b();
                if (!bVar.mo67465a(bArr)) {
                    C20048g.m73164d("LZMA", "Incorrect stream properties");
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    return false;
                }
                long j = 0;
                for (int i = 0; i < 8; i++) {
                    int read = bufferedInputStream2.read();
                    if (read < 0) {
                        C20048g.m73164d("LZMA", "Can't read stream size");
                        try {
                            bufferedInputStream2.close();
                            bufferedOutputStream.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        return false;
                    }
                    j |= ((long) read) << (i * 8);
                }
                if (!bVar.mo67464a(bufferedInputStream2, bufferedOutputStream, j)) {
                    C20048g.m73164d("LZMA", "Error in data stream");
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    return false;
                }
                bufferedOutputStream.flush();
                try {
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    return true;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return true;
                }
            } catch (Exception e10) {
                e = e10;
                bufferedInputStream = bufferedInputStream2;
                e.printStackTrace();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                return false;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = bufferedInputStream2;
                bufferedInputStream.close();
                bufferedOutputStream.close();
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            bufferedOutputStream = null;
            e.printStackTrace();
            bufferedInputStream.close();
            bufferedOutputStream.close();
            return false;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            bufferedInputStream.close();
            bufferedOutputStream.close();
            throw th;
        }
    }

    public static boolean decompressAndUnzip(String str, String str2) {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Exception e;
        File file = new File(str);
        String str3 = str2 + "/tmp.zip";
        File file2 = new File(str3);
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                try {
                    e.printStackTrace();
                    try {
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                bufferedInputStream.close();
                bufferedOutputStream.close();
                throw th;
            }
            try {
                byte[] bArr = new byte[5];
                if (bufferedInputStream2.read(bArr, 0, 5) != 5) {
                    C20048g.m73164d("LZMA", "input .lzma is too short");
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return false;
                }
                C19918b bVar = new C19918b();
                if (!bVar.mo67465a(bArr)) {
                    C20048g.m73164d("LZMA", "Incorrect stream properties");
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    return false;
                }
                long j = 0;
                for (int i = 0; i < 8; i++) {
                    int read = bufferedInputStream2.read();
                    if (read < 0) {
                        C20048g.m73164d("LZMA", "Can't read stream size");
                        try {
                            bufferedInputStream2.close();
                            bufferedOutputStream.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        return false;
                    }
                    j |= ((long) read) << (i * 8);
                }
                if (!bVar.mo67464a(bufferedInputStream2, bufferedOutputStream, j)) {
                    C20048g.m73164d("LZMA", "Error in data stream");
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    return false;
                }
                bufferedOutputStream.flush();
                C20044e.m73153a(str3, str2, null, null);
                file2.delete();
                try {
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    return true;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return true;
                }
            } catch (Exception e10) {
                e = e10;
                bufferedInputStream = bufferedInputStream2;
                e.printStackTrace();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                return false;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = bufferedInputStream2;
                bufferedInputStream.close();
                bufferedOutputStream.close();
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            bufferedOutputStream = null;
            e.printStackTrace();
            bufferedInputStream.close();
            bufferedOutputStream.close();
            return false;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            bufferedInputStream.close();
            bufferedOutputStream.close();
            throw th;
        }
    }
}
