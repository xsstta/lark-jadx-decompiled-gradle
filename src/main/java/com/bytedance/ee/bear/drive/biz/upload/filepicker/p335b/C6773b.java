package com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b;

import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Directory;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permissions;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.RegularFile;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Symlink;
import com.bytedance.ee.log.C13479a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.b.b */
public final class C6773b {

    /* renamed from: a */
    private static final String[] f18421a = {"tar.gz", "tar.bz2", "tar.lzma"};

    /* renamed from: b */
    private static final String[][] f18422b;

    /* renamed from: c */
    private static final Map<String, String> f18423c = new HashMap();

    /* renamed from: d */
    private static final Map<String, String> f18424d = new HashMap();

    static {
        String[][] strArr = {new String[]{"3gp", "video/3gpp"}, new String[]{"apk", "application/vnd.android.package-archive"}, new String[]{"asf", "video/x-ms-asf"}, new String[]{"avi", "video/x-msvideo"}, new String[]{"bin", "application/octet-stream"}, new String[]{"bmp", "image/bmp"}, new String[]{C60375c.f150914a, "text/plain"}, new String[]{"class", "application/octet-stream"}, new String[]{"conf", "text/plain"}, new String[]{"cpp", "text/plain"}, new String[]{"doc", "application/msword"}, new String[]{"docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"}, new String[]{"xls", "application/vnd.ms-excel"}, new String[]{"xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}, new String[]{"exe", "application/octet-stream"}, new String[]{"gif", "image/gif"}, new String[]{"gtar", "application/x-gtar"}, new String[]{"gz", "application/x-gzip"}, new String[]{C14002h.f36692e, "text/plain"}, new String[]{"htm", "text/html"}, new String[]{"html", "text/html"}, new String[]{"jar", "application/java-archive"}, new String[]{"java", "text/plain"}, new String[]{"jpeg", "image/jpeg"}, new String[]{"jpg", "image/jpeg"}, new String[]{"js", "application/x-javascript"}, new String[]{"log", "text/plain"}, new String[]{"m3u", "audio/x-mpegurl"}, new String[]{"m4a", "audio/mp4a-latm"}, new String[]{"m4b", "audio/mp4a-latm"}, new String[]{"m4p", "audio/mp4a-latm"}, new String[]{"m4u", "video/vnd.mpegurl"}, new String[]{"m4v", "video/x-m4v"}, new String[]{"mov", "video/quicktime"}, new String[]{"mp2", "audio/x-mpeg"}, new String[]{"mp3", "audio/x-mpeg"}, new String[]{"mpg4", "video/mp4"}, new String[]{"mpc", "application/vnd.mpohun.certificate"}, new String[]{"mpe", "video/mpeg"}, new String[]{"vob", "video/mpeg"}, new String[]{"mpg", "video/mpeg"}, new String[]{"mp4", "video/mp4"}, new String[]{"mpga", "audio/mpeg"}, new String[]{"mpeg", "video/mpeg"}, new String[]{"msg", "application/vnd.ms-outlook"}, new String[]{"ogg", "audio/ogg"}, new String[]{"pdf", "application/pdf"}, new String[]{"png", "image/png"}, new String[]{"pps", "application/vnd.ms-powerpoint"}, new String[]{"ppt", "application/vnd.ms-powerpoint"}, new String[]{"pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"}, new String[]{"prop", "text/plain"}, new String[]{"rc", "text/plain"}, new String[]{"rmvb", "audio/x-pn-realaudio"}, new String[]{"rtf", "application/rtf"}, new String[]{"sh", "text/plain"}, new String[]{"tar", "application/x-tar"}, new String[]{"tgz", "application/x-compressed"}, new String[]{"txt", "text/plain"}, new String[]{"wav", "audio/x-wav"}, new String[]{"wma", "audio/x-ms-wma"}, new String[]{"wmv", "audio/x-ms-wmv"}, new String[]{"wps", "application/vnd.ms-works"}, new String[]{"xml", "text/plain"}, new String[]{"z", "application/x-compress"}, new String[]{"zip", "application/x-zip-compressed"}, new String[]{"rar", "application/x-rar-compressed"}, new String[]{"ai", "application/postscript"}, new String[]{"", "*/*"}};
        f18422b = strArr;
        for (String[] strArr2 : strArr) {
            f18423c.put(strArr2[0], strArr2[1]);
            f18424d.put(strArr2[1], strArr2[0]);
        }
    }

    /* renamed from: d */
    public static String m26704d(FileSystemObject fileSystemObject) {
        return m26701a(fileSystemObject.getName());
    }

    /* renamed from: e */
    public static boolean m26705e(FileSystemObject fileSystemObject) {
        if (!(fileSystemObject instanceof Symlink) || ((Symlink) fileSystemObject).getLinkRef() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m26707g(FileSystemObject fileSystemObject) {
        if (!(fileSystemObject instanceof Directory) && !m26706f(fileSystemObject)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m26702b(FileSystemObject fileSystemObject) {
        if (fileSystemObject.getName() == null || fileSystemObject.getName().compareTo("/") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m26703c(FileSystemObject fileSystemObject) {
        if (fileSystemObject.getParent() == null || fileSystemObject.getParent().compareTo("/") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m26706f(FileSystemObject fileSystemObject) {
        if (!m26705e(fileSystemObject)) {
            return false;
        }
        return ((Symlink) fileSystemObject).getLinkRef() instanceof Directory;
    }

    /* renamed from: a */
    public static String m26700a(FileSystemObject fileSystemObject) {
        if (fileSystemObject instanceof Directory) {
            return "";
        }
        if (!m26705e(fileSystemObject)) {
            return m26699a(fileSystemObject.getSize());
        }
        if (m26706f(fileSystemObject)) {
            return "";
        }
        return m26699a(((Symlink) fileSystemObject).getLinkRef().getSize());
    }

    /* renamed from: a */
    public static FileSystemObject m26698a(File file) {
        Permissions permissions;
        try {
            if (file.isDirectory()) {
                permissions = Permissions.createDefaultFolderPermissions();
            } else {
                permissions = Permissions.createDefaultFilePermissions();
            }
            Date date = new Date(file.lastModified());
            file.getAbsolutePath();
            if (file.isDirectory()) {
                return new Directory(file.getName(), file.getParent(), permissions, date, date, date);
            }
            return new RegularFile(file.getName(), file.getParent(), permissions, file.length(), date, date, date);
        } catch (Exception e) {
            C13479a.m54759a("FileHelper", "Exception retrieving the fso", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m26699a(long j) {
        String[] strArr = {"B", "K", "M", "G"};
        double d = (double) j;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (d < 1024.0d) {
                return (((double) Math.round(d * 100.0d)) / 100.0d) + " " + str;
            }
            d /= 1024.0d;
        }
        return (((double) Math.round(d * 100.0d)) / 100.0d) + " " + strArr[3];
    }

    /* renamed from: a */
    public static String m26701a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1 || lastIndexOf == 0) {
            return null;
        }
        int length = f18421a.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            String[] strArr = f18421a;
            sb.append(strArr[i]);
            if (str.endsWith(sb.toString())) {
                return strArr[i];
            }
        }
        return str.substring(lastIndexOf + 1);
    }
}
