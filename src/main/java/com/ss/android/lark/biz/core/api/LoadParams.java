package com.ss.android.lark.biz.core.api;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.transform.CropTransformation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LoadParams {

    /* renamed from: a */
    private int f73873a = -1;

    /* renamed from: b */
    private int f73874b = -1;

    /* renamed from: c */
    private boolean f73875c;

    /* renamed from: d */
    private String f73876d;

    /* renamed from: e */
    private Drawable f73877e;

    /* renamed from: f */
    private Drawable f73878f;

    /* renamed from: g */
    private ImageView.ScaleType f73879g = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: h */
    private ImageView.ScaleType f73880h = ImageView.ScaleType.CENTER;

    /* renamed from: i */
    private CropTransformation f73881i;

    /* renamed from: j */
    private DiskCacheStrategy f73882j = DiskCacheStrategy.ALL;

    /* renamed from: k */
    private String f73883k = "c5_";

    /* renamed from: l */
    private boolean f73884l;

    /* renamed from: m */
    private boolean f73885m;

    /* renamed from: n */
    private boolean f73886n = true;

    /* renamed from: o */
    private boolean f73887o;

    /* renamed from: p */
    private String f73888p;

    /* renamed from: q */
    private ListenerParams f73889q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CropType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    /* renamed from: a */
    public int mo105412a() {
        return this.f73873a;
    }

    /* renamed from: b */
    public int mo105421b() {
        return this.f73874b;
    }

    /* renamed from: c */
    public Drawable mo105426c() {
        return this.f73877e;
    }

    /* renamed from: d */
    public Drawable mo105428d() {
        return this.f73878f;
    }

    /* renamed from: e */
    public ImageView.ScaleType mo105430e() {
        return this.f73879g;
    }

    /* renamed from: f */
    public ImageView.ScaleType mo105432f() {
        return this.f73880h;
    }

    /* renamed from: g */
    public CropTransformation mo105433g() {
        return this.f73881i;
    }

    /* renamed from: h */
    public boolean mo105434h() {
        return this.f73887o;
    }

    /* renamed from: i */
    public DiskCacheStrategy mo105435i() {
        return this.f73882j;
    }

    /* renamed from: j */
    public boolean mo105436j() {
        return this.f73885m;
    }

    /* renamed from: k */
    public boolean mo105437k() {
        return this.f73886n;
    }

    /* renamed from: l */
    public ListenerParams mo105438l() {
        return this.f73889q;
    }

    /* renamed from: a */
    public LoadParams mo105413a(int i) {
        this.f73873a = i;
        return this;
    }

    /* renamed from: b */
    public LoadParams mo105422b(int i) {
        this.f73874b = i;
        return this;
    }

    /* renamed from: c */
    public LoadParams mo105427c(boolean z) {
        this.f73884l = z;
        return this;
    }

    /* renamed from: d */
    public LoadParams mo105429d(boolean z) {
        this.f73885m = z;
        return this;
    }

    /* renamed from: e */
    public LoadParams mo105431e(boolean z) {
        this.f73886n = z;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105414a(Drawable drawable) {
        this.f73877e = drawable;
        return this;
    }

    /* renamed from: b */
    public LoadParams mo105423b(Drawable drawable) {
        this.f73878f = drawable;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105415a(ImageView.ScaleType scaleType) {
        this.f73879g = scaleType;
        return this;
    }

    /* renamed from: b */
    public LoadParams mo105424b(String str) {
        this.f73888p = str;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105416a(ListenerParams listenerParams) {
        this.f73889q = listenerParams;
        return this;
    }

    /* renamed from: b */
    public LoadParams mo105425b(boolean z) {
        this.f73887o = z;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105417a(DiskCacheStrategy diskCacheStrategy) {
        this.f73882j = diskCacheStrategy;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105418a(CropTransformation cropTransformation) {
        this.f73881i = cropTransformation;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105419a(String str) {
        this.f73876d = str;
        return this;
    }

    /* renamed from: a */
    public LoadParams mo105420a(boolean z) {
        this.f73875c = z;
        return this;
    }
}
