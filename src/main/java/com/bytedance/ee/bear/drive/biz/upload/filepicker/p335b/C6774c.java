package com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.config.FilePickerSettings;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.config.NavigationSortMode;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Symlink;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.SystemFile;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.b.c */
public class C6774c {
    /* renamed from: a */
    public static List<FileSystemObject> m26709a(List<FileSystemObject> list, boolean z, Context context) {
        FilePickerSettings filePickerSettings = FilePickerSettings.SETTINGS_SORT_MODE;
        FilePickerSettings filePickerSettings2 = FilePickerSettings.SETTINGS_SHOW_DIRS_FIRST;
        FilePickerSettings filePickerSettings3 = FilePickerSettings.SETTINGS_SHOW_HIDDEN;
        FilePickerSettings filePickerSettings4 = FilePickerSettings.SETTINGS_SHOW_SYSTEM;
        FilePickerSettings filePickerSettings5 = FilePickerSettings.SETTINGS_SHOW_SYMLINKS;
        for (int size = list.size() - 1; size >= 0; size--) {
            FileSystemObject fileSystemObject = list.get(size);
            if (!((Boolean) filePickerSettings3.getDefaultValue()).booleanValue() && fileSystemObject.isHidden()) {
                list.remove(size);
            } else if (!((Boolean) filePickerSettings4.getDefaultValue()).booleanValue() && (fileSystemObject instanceof SystemFile)) {
                list.remove(size);
            } else if (!((Boolean) filePickerSettings5.getDefaultValue()).booleanValue() && (fileSystemObject instanceof Symlink)) {
                list.remove(size);
            }
        }
        if (!z) {
            Collections.sort(list, new Comparator(((Boolean) filePickerSettings2.getDefaultValue()).booleanValue(), (NavigationSortMode) filePickerSettings.getDefaultValue()) {
                /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.$$Lambda$c$Db7nGAzn11MOWAGUMoMCe0qVRxc */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ NavigationSortMode f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6774c.lambda$Db7nGAzn11MOWAGUMoMCe0qVRxc(this.f$0, this.f$1, (FileSystemObject) obj, (FileSystemObject) obj2);
                }
            });
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m26708a(boolean z, NavigationSortMode navigationSortMode, FileSystemObject fileSystemObject, FileSystemObject fileSystemObject2) {
        if (z) {
            boolean g = C6773b.m26707g(fileSystemObject);
            boolean g2 = C6773b.m26707g(fileSystemObject2);
            if (g || g2) {
                if (g && g2) {
                    return C6772a.m26696a(fileSystemObject, fileSystemObject2, navigationSortMode);
                }
                if (g) {
                    return -1;
                }
                return 1;
            }
        }
        return C6772a.m26696a(fileSystemObject, fileSystemObject2, navigationSortMode);
    }
}
