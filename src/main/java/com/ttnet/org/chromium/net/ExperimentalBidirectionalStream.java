package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.BidirectionalStream;

public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    public static abstract class Builder extends BidirectionalStream.Builder {
        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder
        public abstract ExperimentalBidirectionalStream build();

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder
        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z);

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setPriority(int i);

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }
    }
}
