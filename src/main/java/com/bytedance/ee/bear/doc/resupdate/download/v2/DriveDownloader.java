package com.bytedance.ee.bear.doc.resupdate.download.v2;

import com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c;
import com.bytedance.ee.bear.doc.resupdate.download.AbstractC5464d;

public class DriveDownloader implements AbstractC5464d {
    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5464d
    /* renamed from: a */
    public String mo21847a(String str, String str2, String str3, AbstractC5463c cVar) {
        return "";
    }

    public static class DriveDownloadException extends Exception {
        public int errorCode;

        public DriveDownloadException(int i) {
            super("rust errorcode: " + i);
            this.errorCode = i;
        }
    }
}
