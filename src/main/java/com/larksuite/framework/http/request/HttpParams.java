package com.larksuite.framework.http.request;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;

public class HttpParams implements Serializable {
    public static final MediaType MEDIA_TYPE_STREAM = MediaType.parse("application/octet-stream");
    private static final long serialVersionUID = 7369819159227055048L;
    public LinkedHashMap<String, List<FileWrapper>> fileParamsMap;
    public LinkedHashMap<String, String> urlParamsMap;

    public void put(Map<String, String> map, boolean... zArr) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue(), zArr);
            }
        }
    }

    public void put(String str, String str2, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, str2, true);
        } else {
            put(str, str2, zArr[0]);
        }
    }

    public void put(String str, boolean z, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, String.valueOf(z), true);
        } else {
            put(str, String.valueOf(z), zArr[0]);
        }
    }

    public void put(String str, File file, String str2) {
        put(str, file, str2, guessMimeType(str2));
    }

    public void put(String str, File file, String str2, String str3) {
        if (str != null) {
            List<FileWrapper> list = this.fileParamsMap.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.fileParamsMap.put(str, list);
            }
            list.add(new FileWrapper(file, str2, str3));
        }
    }

    public HttpParams() {
        init();
    }

    private void init() {
        this.urlParamsMap = new LinkedHashMap<>();
        this.fileParamsMap = new LinkedHashMap<>();
    }

    public void clear() {
        this.urlParamsMap.clear();
        this.fileParamsMap.clear();
    }

    public static class FileWrapper implements Serializable {
        private static final long serialVersionUID = -2356139899636767776L;
        public String contentType;
        public File file;
        public String fileName;
        public long fileSize;

        public String toString() {
            return "FileWrapper{file=" + this.file + ", fileName=" + this.fileName + ", contentType=" + this.contentType + ", fileSize=" + this.fileSize + "}";
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.contentType = (String) objectInputStream.readObject();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.contentType.toString());
        }

        public FileWrapper(File file2, String str, String str2) {
            this.file = file2;
            this.fileName = str;
            this.contentType = str2;
            this.fileSize = file2.length();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.urlParamsMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry.getValue());
        }
        for (Map.Entry<String, List<FileWrapper>> entry2 : this.fileParamsMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(entry2.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry2.getValue());
        }
        return sb.toString();
    }

    public void remove(String str) {
        removeUrl(str);
        removeFile(str);
    }

    public void removeFile(String str) {
        this.fileParamsMap.remove(str);
    }

    public void removeUrl(String str) {
        this.urlParamsMap.remove(str);
    }

    public static String guessMimeType(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str.replace("#", ""));
        if (contentTypeFor == null) {
            return "application/octet-stream";
        }
        return contentTypeFor;
    }

    public void put(HttpParams httpParams) {
        if (httpParams != null) {
            LinkedHashMap<String, String> linkedHashMap = httpParams.urlParamsMap;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                this.urlParamsMap.putAll(httpParams.urlParamsMap);
            }
            LinkedHashMap<String, List<FileWrapper>> linkedHashMap2 = httpParams.fileParamsMap;
            if (linkedHashMap2 != null && !linkedHashMap2.isEmpty()) {
                this.fileParamsMap.putAll(httpParams.fileParamsMap);
            }
        }
    }

    public void put(String str, File file) {
        put(str, file, file.getName());
    }

    public HttpParams(String str, File file) {
        init();
        put(str, file);
    }

    public HttpParams(String str, String str2) {
        init();
        put(str, str2, true);
    }

    public void putFileParams(String str, List<File> list) {
        if (!(str == null || list == null || list.isEmpty())) {
            for (File file : list) {
                put(str, file);
            }
        }
    }

    public void putFileWrapperParams(String str, List<FileWrapper> list) {
        if (!(str == null || list == null || list.isEmpty())) {
            for (FileWrapper fileWrapper : list) {
                put(str, fileWrapper);
            }
        }
    }

    public void putUrlParams(String str, List<String> list) {
        if (!(str == null || list == null || list.isEmpty())) {
            for (String str2 : list) {
                put(str, str2, false);
            }
        }
    }

    public void put(String str, FileWrapper fileWrapper) {
        if (str != null && fileWrapper != null) {
            put(str, fileWrapper.file, fileWrapper.fileName, fileWrapper.contentType);
        }
    }

    private void put(String str, String str2, boolean z) {
        if (str != null && str2 != null) {
            this.urlParamsMap.put(str, str2);
        }
    }

    public void put(String str, char c, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, String.valueOf(c), true);
        } else {
            put(str, String.valueOf(c), zArr[0]);
        }
    }

    public void put(String str, double d, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, String.valueOf(d), true);
        } else {
            put(str, String.valueOf(d), zArr[0]);
        }
    }

    public void put(String str, float f, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, String.valueOf(f), true);
        } else {
            put(str, String.valueOf(f), zArr[0]);
        }
    }

    public void put(String str, int i, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, String.valueOf(i), true);
        } else {
            put(str, String.valueOf(i), zArr[0]);
        }
    }

    public void put(String str, long j, boolean... zArr) {
        if (zArr == null || zArr.length <= 0) {
            put(str, String.valueOf(j), true);
        } else {
            put(str, String.valueOf(j), zArr[0]);
        }
    }
}
