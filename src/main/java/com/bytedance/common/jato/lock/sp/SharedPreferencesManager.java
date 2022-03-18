package com.bytedance.common.jato.lock.sp;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Log;
import com.bytedance.common.jato.Jato;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SharedPreferencesManager {
    private static volatile boolean isInit = false;
    private static volatile boolean isSubThreadOpt = false;
    private static volatile boolean isSubThreadRecord = false;
    private static Thread mainThread = Looper.getMainLooper().getThread();
    private static Application sApplication;
    private static LinkedHashSet<SpRecord> sCurrentLoadList = new LinkedHashSet<>();
    private static volatile boolean sNeedRecord = true;
    private static ArrayList<SpRecord> sPreloadList = new ArrayList<>();
    public static int sSeq = 1;
    private static ArrayMap<String, SharedPreferences> sSharedPrefs;
    private static ArrayMap<String, File> sSharedPrefsPaths;
    private static ArrayMap<File, SharedPreferences> sSpArrayMap;

    public static void stopRecord() {
        if (sNeedRecord) {
            sNeedRecord = false;
            if (Jato.getWorkExecutorService() != null) {
                Jato.getWorkExecutorService().execute(new Runnable() {
                    /* class com.bytedance.common.jato.lock.sp.SharedPreferencesManager.RunnableC36201 */

                    public void run() {
                        SharedPreferencesManager.savePreloadSp();
                    }
                });
            } else {
                Jato.getInnerExecutorService().execute(new Runnable() {
                    /* class com.bytedance.common.jato.lock.sp.SharedPreferencesManager.RunnableC36212 */

                    public void run() {
                        SharedPreferencesManager.savePreloadSp();
                    }
                });
            }
        }
    }

    private static void getSpCache() {
        try {
            Class<?> cls = Class.forName("android.app.ContextImpl");
            if (Build.VERSION.SDK_INT <= 23) {
                Field declaredField = cls.getDeclaredField("sSharedPrefs");
                declaredField.setAccessible(true);
                ArrayMap arrayMap = (ArrayMap) declaredField.get(null);
                if (arrayMap != null) {
                    sSharedPrefs = (ArrayMap) arrayMap.get(sApplication.getPackageName());
                }
                if (sSharedPrefs == null) {
                    sApplication.getSharedPreferences("jato_preload_sp", 0);
                    ArrayMap arrayMap2 = (ArrayMap) declaredField.get(null);
                    if (arrayMap2 != null) {
                        sSharedPrefs = (ArrayMap) arrayMap2.get(sApplication.getPackageName());
                        return;
                    }
                    return;
                }
                return;
            }
            Field declaredField2 = cls.getDeclaredField("sSharedPrefsCache");
            declaredField2.setAccessible(true);
            ArrayMap arrayMap3 = (ArrayMap) declaredField2.get(null);
            if (arrayMap3 != null) {
                sSpArrayMap = (ArrayMap) arrayMap3.get(sApplication.getPackageName());
            }
            if (sSpArrayMap == null) {
                sApplication.getSharedPreferences("jato_preload_sp", 0);
                ArrayMap arrayMap4 = (ArrayMap) declaredField2.get(null);
                if (arrayMap4 != null) {
                    sSpArrayMap = (ArrayMap) arrayMap4.get(sApplication.getPackageName());
                }
            }
            Application application = sApplication;
            Field declaredField3 = ContextWrapper.class.getDeclaredField("mBase");
            declaredField3.setAccessible(true);
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, "mSharedPrefsPaths");
            field.setAccessible(true);
            sSharedPrefsPaths = (ArrayMap) field.get((Context) declaredField3.get(application));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void loadPreloadSp() {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.lock.sp.SharedPreferencesManager.loadPreloadSp():void");
    }

    public static synchronized void savePreloadSp() {
        IOException e;
        synchronized (SharedPreferencesManager.class) {
            if (sApplication != null) {
                BufferedWriter bufferedWriter = null;
                try {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(sCurrentLoadList);
                    hashSet.addAll(sPreloadList);
                    ArrayList arrayList = new ArrayList(hashSet);
                    Collections.sort(arrayList);
                    String file = sApplication.getFilesDir().toString();
                    File file2 = new File(file + "/jato_preload_sp_list.txt");
                    if (!file2.isFile()) {
                        file2.createNewFile();
                    }
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file2));
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SpRecord spRecord = (SpRecord) it.next();
                            Log.e("xudong", "savePreloadSp:" + spRecord.toString());
                            bufferedWriter2.write(spRecord.toString() + "\n");
                        }
                        bufferedWriter2.close();
                        close(bufferedWriter2);
                    } catch (IOException e2) {
                        e = e2;
                        bufferedWriter = bufferedWriter2;
                        try {
                            e.printStackTrace();
                            close(bufferedWriter);
                        } catch (Throwable th) {
                            close(bufferedWriter);
                            throw th;
                        }
                    } catch (Throwable unused) {
                        bufferedWriter = bufferedWriter2;
                        close(bufferedWriter);
                    }
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    close(bufferedWriter);
                } catch (Throwable unused2) {
                    close(bufferedWriter);
                }
            }
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void init(Application application, boolean z, boolean z2) {
        try {
            isInit = true;
            isSubThreadRecord = z;
            isSubThreadOpt = z2;
            sApplication = application;
            if (Build.VERSION.SDK_INT >= 19) {
                getSpCache();
            }
            loadPreloadSp();
        } catch (Throwable unused) {
        }
    }
}
