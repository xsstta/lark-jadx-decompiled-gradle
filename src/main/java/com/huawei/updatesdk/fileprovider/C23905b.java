package com.huawei.updatesdk.fileprovider;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.fileprovider.b */
class C23905b implements AbstractC23904a {

    /* renamed from: a */
    private final String f59159a;

    /* renamed from: b */
    private final HashMap<String, File> f59160b = new HashMap<>();

    protected C23905b(String str) {
        this.f59159a = str;
    }

    @Override // com.huawei.updatesdk.fileprovider.AbstractC23904a
    /* renamed from: a */
    public Uri mo85715a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.f59160b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = entry.getValue().getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                return new Uri.Builder().scheme("content").authority(this.f59159a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException("wisedist: Failed to find configured root that contains");
        } catch (Exception unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for wisedist");
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.AbstractC23904a
    /* renamed from: a */
    public File mo85716a(Uri uri) {
        try {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f59160b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("wisedist: Unable to find configured root for");
            } else if (TextUtils.isEmpty(decode2) || decode2.contains("../") || decode2.contains("..") || decode2.contains("%00") || decode2.contains(".\\.\\") || decode2.contains("./")) {
                throw new IllegalArgumentException("wisedist: Not a standard path");
            } else {
                try {
                    File canonicalFile = new File(file, decode2).getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("wisedist: Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("wisedist: Failed to resolve canonical path for");
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("UpdateSDKFileProvider error: " + e.toString());
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.AbstractC23904a
    /* renamed from: a */
    public void mo85717a(String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f59160b.put(str, file.getCanonicalFile());
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for root");
            }
        } else {
            throw new IllegalArgumentException("wisedist Name must not be empty");
        }
    }
}
