package com.ttnet.org.chromium.base.library_loader;

/* renamed from: com.ttnet.org.chromium.base.library_loader.-$$Lambda$LibraryPrefetcher$jGRuTrEaUFU8N4hjLT82J5H-lWQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LibraryPrefetcher$jGRuTrEaUFU8N4hjLT82J5HlWQ implements Runnable {
    public static final /* synthetic */ $$Lambda$LibraryPrefetcher$jGRuTrEaUFU8N4hjLT82J5HlWQ INSTANCE = new $$Lambda$LibraryPrefetcher$jGRuTrEaUFU8N4hjLT82J5HlWQ();

    private /* synthetic */ $$Lambda$LibraryPrefetcher$jGRuTrEaUFU8N4hjLT82J5HlWQ() {
    }

    public final void run() {
        LibraryPrefetcher.nativePeriodicallyCollectResidency();
    }
}
