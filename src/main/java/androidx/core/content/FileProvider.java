package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static HashMap<String, AbstractC0748a> sCache = new HashMap<>();
    private AbstractC0748a mStrategy;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$a */
    public interface AbstractC0748a {
        /* renamed from: a */
        Uri mo4266a(File file);

        /* renamed from: a */
        File mo4267a(Uri uri);
    }

    public boolean onCreate() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.FileProvider$b */
    public static class C0749b implements AbstractC0748a {

        /* renamed from: a */
        private final String f3105a;

        /* renamed from: b */
        private final HashMap<String, File> f3106b = new HashMap<>();

        C0749b(String str) {
            this.f3105a = str;
        }

        @Override // androidx.core.content.FileProvider.AbstractC0748a
        /* renamed from: a */
        public File mo4267a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f3106b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        @Override // androidx.core.content.FileProvider.AbstractC0748a
        /* renamed from: a */
        public Uri mo4266a(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f3106b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f3105a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(str, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4268a(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f3106b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File a = this.mStrategy.mo4267a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.mStrategy.mo4267a(uri), modeToMode(str));
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static AbstractC0748a getPathStrategy(Context context, String str) {
        AbstractC0748a aVar;
        synchronized (sCache) {
            aVar = sCache.get(str);
            if (aVar == null) {
                try {
                    aVar = parsePathStrategy(context, str);
                    sCache.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.mStrategy = getPathStrategy(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    private static AbstractC0748a parsePathStrategy(Context context, String str) throws IOException, XmlPullParserException {
        C0749b bVar = new C0749b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, SmActions.ACTION_ONTHECALL_EXIT);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = DEVICE_ROOT;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file != null) {
                            bVar.mo4268a(attributeValue, buildPath(file, attributeValue2));
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).mo4266a(file);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.mStrategy.mo4267a(uri).delete() ? 1 : 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = this.mStrategy.mo4267a(uri);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }
}
