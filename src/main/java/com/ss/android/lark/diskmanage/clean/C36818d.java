package com.ss.android.lark.diskmanage.clean;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.clean.settings.DeleteConfig;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.diskmanage.clean.d */
public class C36818d {

    /* renamed from: a */
    List<File> f94606a = new ArrayList();

    /* renamed from: b */
    private String f94607b = "";

    /* renamed from: c */
    private String f94608c = "";

    /* renamed from: a */
    private DeleteConfig m145261a(String str) {
        try {
            DeleteConfig deleteConfig = (DeleteConfig) JSON.parseObject(new JSONObject(str).getString("delete_global_config"), DeleteConfig.class);
            if (deleteConfig.getDeleteConfig() == null && deleteConfig.getExpiredConfig() == null) {
                return null;
            }
            C36808a.AbstractC36811b b = C36808a.m145209b();
            boolean z = false;
            if (b != null) {
                z = b.mo102812a("small_disk_on", false);
            }
            if (z) {
                float a = b.mo102809a("disk_timeout_factor", 1.0f);
                deleteConfig.getExpiredConfig().setExpiredTime((long) (((float) deleteConfig.getExpiredConfig().getExpiredTime()) * a));
            }
            return deleteConfig;
        } catch (Exception e) {
            Log.m165384e("RemoteDeleteHandler", "parse DeleteConfig fail. ", e);
            return null;
        }
    }

    /* renamed from: b */
    private List<File> m145265b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("rust")) {
                    for (File file : this.f94606a) {
                        arrayList.add(new File(str.replaceFirst("rust", file.getAbsolutePath())));
                    }
                } else {
                    arrayList.add(new File(str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<File> m145262a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("internal")) {
                    arrayList.add(new File(str.replaceFirst("internal", this.f94607b)));
                } else if (str.startsWith("external")) {
                    arrayList.add(new File(str.replaceFirst("external", this.f94608c)));
                } else {
                    arrayList.add(new File(str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo135620a(Context context, String str) {
        try {
            m145264a(context, m145261a(str));
        } catch (Exception e) {
            Log.m165389i("RemoteDeleteHandler", "handleRemoteDelete error");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m145263a(long j, File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m145263a(j, file2);
                }
            } else if (file.lastModified() <= j) {
                C26311p.m95291k(file.getPath());
            }
        }
    }

    /* renamed from: a */
    private void m145264a(Context context, DeleteConfig deleteConfig) {
        Log.m165389i("RemoteDeleteHandler", "handleRemoteDelete config = " + deleteConfig);
        if (deleteConfig == null) {
            Log.m165389i("RemoteDeleteHandler", "handleRemoteDelete Expired error config is null");
            return;
        }
        String packageName = context.getPackageName();
        this.f94607b = context.getFilesDir().getParent();
        this.f94608c = Environment.getExternalStorageDirectory() + "/Android/data/" + packageName;
        File file = new File(StoragePathUtils.f94669a.mo135752r(context));
        this.f94606a = new ArrayList();
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().length() == 32) {
                    this.f94606a.add(file2);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (deleteConfig.getDeleteConfig() != null) {
            for (File file3 : m145262a(deleteConfig.getDeleteConfig().getFiles())) {
                m145263a(currentTimeMillis, file3);
            }
        }
        if (deleteConfig.getExpiredConfig() != null) {
            if (deleteConfig.getExpiredConfig().getExpiredTime() < 0) {
                Log.m165389i("RemoteDeleteHandler", "handleRemoteDelete Expired error time < 0");
                return;
            }
            List<File> a = m145262a(deleteConfig.getExpiredConfig().getFiles());
            long expiredTime = currentTimeMillis - (deleteConfig.getExpiredConfig().getExpiredTime() * 1000);
            for (File file4 : a) {
                m145263a(expiredTime, file4);
            }
        }
        if (deleteConfig.getMainRustConfig() != null) {
            for (File file5 : m145265b(deleteConfig.getMainRustConfig().getFiles())) {
                m145263a(currentTimeMillis, file5);
            }
        }
    }
}
