package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UrlRequest;
import java.util.concurrent.Executor;

public abstract class ExperimentalUrlRequest extends UrlRequest {

    public static abstract class Builder extends UrlRequest.Builder {
        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract Builder allowDirectExecutor();

        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract ExperimentalUrlRequest build();

        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract Builder setPriority(int i);

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Builder
        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
