package com.tt.miniapp.ttapkgdecoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import okio.AbstractC69698d;
import okio.C69705k;

public class TTAPkgFile {
    private final String fileName;
    private int offset;
    private int size;

    public String getFileName() {
        return this.fileName;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        return "TTAPkgFile{fileName='" + this.fileName + '\'' + ", offset=" + this.offset + ", size=" + this.size + '}';
    }

    public void saveTo(File file, InputStream inputStream) {
        if (file.exists() && inputStream != null) {
            File file2 = new File(file, this.fileName);
            AbstractC69698d dVar = null;
            try {
                file2.getParentFile().mkdirs();
                file2.delete();
                if (file2.createNewFile()) {
                    dVar = C69705k.m267589a(C69705k.m267599b(file2));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        if (read == -1) {
                            break;
                        }
                        dVar.mo244534b(bArr, 0, read);
                    }
                    dVar.flush();
                }
                if (dVar != null) {
                    try {
                        dVar.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                if (0 != 0) {
                    dVar.close();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    dVar.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        dVar.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    public TTAPkgFile(String str, int i, int i2) {
        this.fileName = str;
        this.offset = i;
        this.size = i2;
    }
}
