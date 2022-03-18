package com.bytedance.ee.bear.drive.biz.upload.filepicker.command;

import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.C6773b;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.command.b */
public class C6776b extends AbstractC6775a {
    /* renamed from: a */
    public List<FileSystemObject> mo26611a(String str) throws NoSuchFileOrDirectoryException {
        if (mo26610a()) {
            C13479a.m54764b("ListCommand", String.format("Listing %s.", str));
        }
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (!file.exists()) {
            if (mo26610a()) {
                C13479a.m54764b("ListCommand", "Result: FAIL. NoSuchFileOrDirectory");
            }
            throw new NoSuchFileOrDirectoryException(str);
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                FileSystemObject a = C6773b.m26698a(file2);
                if (a != null) {
                    if (mo26610a()) {
                        C13479a.m54764b("ListCommand", String.valueOf(a));
                    }
                    arrayList.add(a);
                }
            }
        }
        if (mo26610a()) {
            C13479a.m54764b("ListCommand", "Result: OK");
        }
        return arrayList;
    }
}
