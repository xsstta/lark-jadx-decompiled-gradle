package com.bytedance.common.profilesdk.deximage;

import com.bytedance.common.profilesdk.util.FileUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class DeximageHelper {
    static Constructor<?> sDexFileConstructor;

    private static DexFile createDexFile(byte[] bArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (sDexFileConstructor == null) {
            sDexFileConstructor = findConstructor(DexFile.class, ByteBuffer.class);
        }
        return (DexFile) sDexFileConstructor.newInstance(ByteBuffer.wrap(bArr));
    }

    public static List<DexFile> loadDexFileInMemory(String str) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        if (FileUtils.isArchiveFile(new File(str))) {
            return loadDexFileFromZip(str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(createDexFile(FileUtils.readAllBytes(new File(str))));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r6.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<dalvik.system.DexFile> loadDexFileFromZip(java.lang.String r6) throws java.io.IOException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.IllegalAccessException {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.profilesdk.deximage.DeximageHelper.loadDexFileFromZip(java.lang.String):java.util.List");
    }

    public static Constructor<?> findConstructor(Class<?> cls, Class<?> cls2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
        declaredMethod.setAccessible(true);
        Constructor<?> constructor = (Constructor) declaredMethod.invoke(cls, new Class[]{cls2});
        if (constructor != null && !constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor;
    }
}
