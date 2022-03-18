package pl.droidsonroids.gif;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;

/* renamed from: pl.droidsonroids.gif.f */
public abstract class AbstractC70158f {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract GifInfoHandle mo247311a() throws IOException;

    private AbstractC70158f() {
    }

    /* renamed from: pl.droidsonroids.gif.f$a */
    public static final class C70160a extends AbstractC70158f {

        /* renamed from: a */
        private final AssetManager f175276a;

        /* renamed from: b */
        private final String f175277b;

        /* access modifiers changed from: package-private */
        @Override // pl.droidsonroids.gif.AbstractC70158f
        /* renamed from: a */
        public GifInfoHandle mo247311a() throws IOException {
            return new GifInfoHandle(this.f175276a.openFd(this.f175277b));
        }

        public C70160a(AssetManager assetManager, String str) {
            super();
            this.f175276a = assetManager;
            this.f175277b = str;
        }
    }

    /* renamed from: pl.droidsonroids.gif.f$b */
    public static class C70161b extends AbstractC70158f {

        /* renamed from: a */
        private final Resources f175278a;

        /* renamed from: b */
        private final int f175279b;

        /* access modifiers changed from: package-private */
        @Override // pl.droidsonroids.gif.AbstractC70158f
        /* renamed from: a */
        public GifInfoHandle mo247311a() throws IOException {
            return new GifInfoHandle(this.f175278a.openRawResourceFd(this.f175279b));
        }

        public C70161b(Resources resources, int i) {
            super();
            this.f175278a = resources;
            this.f175279b = i;
        }
    }
}
