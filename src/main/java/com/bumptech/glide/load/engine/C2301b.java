package com.bumptech.glide.load.engine;

/* renamed from: com.bumptech.glide.load.engine.b */
final class C2301b extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    C2301b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
