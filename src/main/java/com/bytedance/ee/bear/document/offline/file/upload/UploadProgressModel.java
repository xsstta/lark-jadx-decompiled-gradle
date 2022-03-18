package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.util.io.NonProguard;

public class UploadProgressModel implements NonProguard {
    private Body body;
    private String operation = "updateProgress";

    public static class Body implements NonProguard {
        private float progress;
        private String uuid;

        public float getProgress() {
            return this.progress;
        }

        public String getUuid() {
            return this.uuid;
        }

        public void setProgress(float f) {
            this.progress = f;
        }

        public void setUuid(String str) {
            this.uuid = str;
        }

        public Body(float f, String str) {
            this.progress = f;
            this.uuid = str;
        }
    }

    public Body getBody() {
        return this.body;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setBody(Body body2) {
        this.body = body2;
    }

    public void setOperation(String str) {
        this.operation = str;
    }

    public UploadProgressModel(float f, String str) {
        this.body = new Body(f, str);
    }
}
