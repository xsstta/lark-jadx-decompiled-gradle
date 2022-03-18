package com.bytedance.ee.bear.sheet.attachment;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class AttachmentModelList implements NonProguard {
    private List<AttachmentModel> list;

    public static class AttachmentModel implements NonProguard {
        private String mimeType;
        private String name;
        private long size;
        private String token;

        public String getMimeType() {
            return this.mimeType;
        }

        public String getName() {
            return this.name;
        }

        public long getSize() {
            return this.size;
        }

        public String getToken() {
            return this.token;
        }

        public void setMimeType(String str) {
            this.mimeType = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setToken(String str) {
            this.token = str;
        }
    }

    public List<AttachmentModel> getList() {
        return this.list;
    }

    public void setList(List<AttachmentModel> list2) {
        this.list = list2;
    }
}
