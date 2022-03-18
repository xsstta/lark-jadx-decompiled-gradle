package p001a.p002a.p003a.p005b.p006a;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: a.a.a.b.a.a */
public class C0011a {
    /* renamed from: a */
    public static Bundle m23a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.println(5, "AssetLoadManager", "The context or moduleName is null.");
            return new Bundle();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C0021d.m31a(context));
            sb.append(File.separator);
            sb.append("dynamic_modules");
            sb.append(File.separator);
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                Bundle a = m22a(context, file, str);
                if (a.getInt("local_asset_module_version") > 0) {
                    Logger.println(4, "AssetLoadManager", "Successfully get module info from decompressed asset path.");
                    return a;
                }
            }
            Bundle b = m25b(context, str);
            if (b.getInt("local_asset_module_version") > 0) {
                Logger.println(4, "AssetLoadManager", "Successfully get module info from asset.");
                return b;
            }
        } catch (Exception e) {
            Logger.println(4, "AssetLoadManager", "getDataModuleInfo failed.", e);
        }
        return new Bundle();
    }

    /* renamed from: c */
    public static int m26c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.println(6, "AssetLoadManager", "Invalid context or moduleName.");
            return 0;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("com.huawei.hms.feature.dynamic.descriptors.");
            sb.append(str);
            sb.append(".AssetModuleDescriptor");
            return context.getClassLoader().loadClass(sb.toString()).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.println(5, "AssetLoadManager", "Cannot get the class of module descriptor for " + str);
            return 0;
        } catch (Exception e) {
            Logger.m85282w("AssetLoadManager", "Get local asset module info failed.", e);
            return 0;
        }
    }

    /* renamed from: b */
    public static Bundle m25b(Context context, String str) {
        try {
            AssetManager assets = context.getAssets();
            StringBuilder sb = new StringBuilder();
            sb.append("dynamic_modules");
            sb.append(File.separator);
            sb.append(str);
            String[] list = assets.list(sb.toString());
            if (list == null || list.length == 0) {
                Logger.println(5, "AssetLoadManager", "No module apk in asset path.");
                return new Bundle();
            }
            String str2 = list[0];
            int c = m26c(context, str);
            String a = m24a(context, str, c, str2);
            if (TextUtils.isEmpty(a) || !new File(a).exists()) {
                Logger.println(5, "AssetLoadManager", "Decompress module from assets failed.");
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            bundle.putString("module_path", a);
            bundle.putInt("local_asset_module_version", c);
            Logger.println(4, "AssetLoadManager", "Get dynamic module info from asset success: ModuleName:" + str + ", ModuleVersion:" + c + ", ModulePath:" + a);
            return bundle;
        } catch (Exception e) {
            Logger.println(4, "AssetLoadManager", "getModuleFromAsset failed.", e);
            return new Bundle();
        }
    }

    /* renamed from: a */
    public static Bundle m22a(Context context, File file, String str) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            Logger.println(5, "AssetLoadManager", "No version in module path.");
            return new Bundle();
        }
        int i = 0;
        for (String str2 : list) {
            if (Integer.parseInt(str2) > i) {
                i = Integer.parseInt(str2);
            }
        }
        if (i == 0) {
            Logger.println(5, "AssetLoadManager", "Cannot get module version path.");
            return new Bundle();
        }
        C0021d.m34a(i, file.getAbsolutePath(), list, "AssetLoadManager");
        if (m26c(context, str) > i) {
            Logger.println(4, "AssetLoadManager", "There is a higher loader version in assets.");
            return new Bundle();
        }
        File file2 = new File(file.getAbsolutePath() + File.separator + i + File.separator + str + ".apk");
        if (!file2.exists()) {
            Logger.println(5, "AssetLoadManager", "Cannot find module apk in asset decompressed path.");
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        bundle.putString("module_name", str);
        bundle.putString("module_path", file2.getAbsolutePath());
        bundle.putInt("local_asset_module_version", i);
        Logger.println(4, "AssetLoadManager", "Get module info from decompressed asset path success: ModuleName:" + str + ", ModuleVersion:" + i + ", ModulePath:" + file2.getAbsolutePath());
        return bundle;
    }

    /* renamed from: a */
    public static String m24a(Context context, String str, int i, String str2) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        Exception e;
        FileOutputStream fileOutputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(context.getAssets().open("dynamic_modules" + File.separator + str + File.separator + str2));
            try {
                String str3 = C0021d.m31a(context) + File.separator + "dynamic_modules" + File.separator + str + File.separator + i;
                if (new File(str3).exists() || new File(str3).mkdirs()) {
                    String str4 = str3 + File.separator + str + ".apk";
                    fileOutputStream = new FileOutputStream(new File(str4));
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr, 0, 4096);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Decompress module:");
                                sb.append(str);
                                sb.append(" from assets success.");
                                Logger.println(4, "AssetLoadManager", sb.toString());
                                C0021d.m38a(bufferedInputStream);
                                C0021d.m38a(fileOutputStream);
                                return str4;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cannot find module:");
                            sb2.append(str);
                            sb2.append(" in assets.");
                            Logger.m85282w("AssetLoadManager", sb2.toString(), e);
                            C0021d.m38a(bufferedInputStream);
                            C0021d.m38a(fileOutputStream);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream;
                            C0021d.m38a(bufferedInputStream);
                            C0021d.m38a(fileOutputStream2);
                            throw th;
                        }
                    }
                } else {
                    Logger.println(5, "AssetLoadManager", "mkdirs local loaderPath failed.");
                    C0021d.m38a(bufferedInputStream);
                    C0021d.m38a((Closeable) null);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("Cannot find module:");
                sb22.append(str);
                sb22.append(" in assets.");
                Logger.m85282w("AssetLoadManager", sb22.toString(), e);
                C0021d.m38a(bufferedInputStream);
                C0021d.m38a(fileOutputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                C0021d.m38a(bufferedInputStream);
                C0021d.m38a(fileOutputStream2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
            bufferedInputStream = null;
            StringBuilder sb222 = new StringBuilder();
            sb222.append("Cannot find module:");
            sb222.append(str);
            sb222.append(" in assets.");
            Logger.m85282w("AssetLoadManager", sb222.toString(), e);
            C0021d.m38a(bufferedInputStream);
            C0021d.m38a(fileOutputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            C0021d.m38a(bufferedInputStream);
            C0021d.m38a(fileOutputStream2);
            throw th;
        }
    }
}
