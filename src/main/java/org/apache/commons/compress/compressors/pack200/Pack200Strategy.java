package org.apache.commons.compress.compressors.pack200;

import java.io.IOException;

public enum Pack200Strategy {
    IN_MEMORY {
        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public AbstractC69843c newStreamBridge() {
            return new C69840a();
        }
    },
    TEMP_FILE {
        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public AbstractC69843c newStreamBridge() throws IOException {
            return new C69844d();
        }
    };

    /* access modifiers changed from: package-private */
    public abstract AbstractC69843c newStreamBridge() throws IOException;
}
