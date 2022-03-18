package com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b;

import com.bytedance.ee.bear.drive.biz.upload.filepicker.config.NavigationSortMode;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject;
import com.bytedance.ee.util.p716r.C13720a;
import com.github.p964a.p965a.C21285b;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.b.a */
public class C6772a {
    /* renamed from: a */
    private static int m26695a(char c, char c2) {
        int b = C13720a.m55635b(c);
        int b2 = C13720a.m55635b(c2);
        if (b != b2) {
            return b - b2;
        }
        if (b == 1 || b == 2) {
            return c - c2;
        }
        if (b == 3) {
            return Character.toLowerCase(c) - Character.toLowerCase(c2);
        }
        if (b != 4) {
            return c - c2;
        }
        return C21285b.m77122a(c).compareTo(C21285b.m77122a(c2));
    }

    /* renamed from: a */
    public static int m26697a(String str, String str2) {
        int i;
        if (str.length() > str2.length()) {
            i = str2.length();
        } else {
            i = str.length();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int a = m26695a(str.charAt(i2), str2.charAt(i2));
            if (a != 0) {
                return a;
            }
        }
        return str.length() - str2.length();
    }

    /* renamed from: a */
    public static int m26696a(FileSystemObject fileSystemObject, FileSystemObject fileSystemObject2, NavigationSortMode navigationSortMode) {
        if (navigationSortMode == NavigationSortMode.NAME_ASC) {
            return m26697a(fileSystemObject.getName(), fileSystemObject2.getName());
        }
        if (navigationSortMode == NavigationSortMode.NAME_DESC) {
            return m26697a(fileSystemObject.getName(), fileSystemObject2.getName()) * -1;
        }
        if (navigationSortMode == NavigationSortMode.DATE_ASC) {
            return fileSystemObject.getLastModifiedTime().compareTo(fileSystemObject2.getLastModifiedTime());
        }
        if (navigationSortMode == NavigationSortMode.DATE_DESC) {
            return fileSystemObject.getLastModifiedTime().compareTo(fileSystemObject2.getLastModifiedTime()) * -1;
        }
        if (navigationSortMode == NavigationSortMode.SIZE_ASC) {
            return Long.compare(fileSystemObject.getSize(), fileSystemObject2.getSize());
        }
        if (navigationSortMode == NavigationSortMode.SIZE_DESC) {
            return Long.compare(fileSystemObject.getSize(), fileSystemObject2.getSize()) * -1;
        }
        return fileSystemObject.compareTo(fileSystemObject2);
    }
}
