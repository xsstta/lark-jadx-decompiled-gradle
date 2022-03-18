package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Objects;

public final class ImageSource {
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;

    /* access modifiers changed from: protected */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* access modifiers changed from: protected */
    public final Integer getResource() {
        return this.resource;
    }

    /* access modifiers changed from: protected */
    public final int getSHeight() {
        return this.sHeight;
    }

    /* access modifiers changed from: protected */
    public final Rect getSRegion() {
        return this.sRegion;
    }

    /* access modifiers changed from: protected */
    public final int getSWidth() {
        return this.sWidth;
    }

    /* access modifiers changed from: protected */
    public final boolean getTile() {
        return this.tile;
    }

    /* access modifiers changed from: protected */
    public final Uri getUri() {
        return this.uri;
    }

    /* access modifiers changed from: protected */
    public final boolean isCached() {
        return this.cached;
    }

    public ImageSource tilingDisabled() {
        return tiling(false);
    }

    public ImageSource tilingEnabled() {
        return tiling(true);
    }

    private void setInvariants() {
        Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    public ImageSource tiling(boolean z) {
        this.tile = z;
        return this;
    }

    public static ImageSource resource(int i) {
        return new ImageSource(i);
    }

    public ImageSource region(Rect rect) {
        this.sRegion = rect;
        setInvariants();
        return this;
    }

    private ImageSource(int i) {
        this.resource = Integer.valueOf(i);
        this.tile = true;
    }

    public static ImageSource bitmap(Bitmap bitmap2) {
        Objects.requireNonNull(bitmap2, "Bitmap must not be null");
        return new ImageSource(bitmap2, false);
    }

    public static ImageSource cachedBitmap(Bitmap bitmap2) {
        Objects.requireNonNull(bitmap2, "Bitmap must not be null");
        return new ImageSource(bitmap2, true);
    }

    public static ImageSource uri(Uri uri2) {
        Objects.requireNonNull(uri2, "Uri must not be null");
        return new ImageSource(uri2);
    }

    public static ImageSource asset(String str) {
        Objects.requireNonNull(str, "Asset name must not be null");
        return uri("file:///android_asset/" + str);
    }

    private ImageSource(Uri uri2) {
        String uri3 = uri2.toString();
        if (uri3.startsWith("file:///") && !new File(uri3.substring(7)).exists()) {
            try {
                uri2 = Uri.parse(URLDecoder.decode(uri3, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.bitmap = null;
        this.uri = uri2;
        this.resource = null;
        this.tile = true;
    }

    public static ImageSource uri(String str) {
        Objects.requireNonNull(str, "Uri must not be null");
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///" + str;
        }
        return new ImageSource(Uri.parse(str));
    }

    public ImageSource dimensions(int i, int i2) {
        if (this.bitmap == null) {
            this.sWidth = i;
            this.sHeight = i2;
        }
        setInvariants();
        return this;
    }

    private ImageSource(Bitmap bitmap2, boolean z) {
        this.bitmap = bitmap2;
        this.sWidth = bitmap2.getWidth();
        this.sHeight = bitmap2.getHeight();
        this.cached = z;
    }
}
