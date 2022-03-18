package org.apache.commons.compress.compressors.snappy;

public enum FramedSnappyDialect {
    STANDARD(true, true),
    IWORK_ARCHIVE(false, false);
    
    private final boolean checksumWithCompressedChunks;
    private final boolean streamIdentifier;

    /* access modifiers changed from: package-private */
    public boolean hasStreamIdentifier() {
        return this.streamIdentifier;
    }

    /* access modifiers changed from: package-private */
    public boolean usesChecksumWithCompressedChunks() {
        return this.checksumWithCompressedChunks;
    }

    private FramedSnappyDialect(boolean z, boolean z2) {
        this.streamIdentifier = z;
        this.checksumWithCompressedChunks = z2;
    }
}
