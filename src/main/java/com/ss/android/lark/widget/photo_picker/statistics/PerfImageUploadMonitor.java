package com.ss.android.lark.widget.photo_picker.statistics;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.widget.photo_picker.statistics.c */
public final class PerfImageUploadMonitor extends BasePerfMonitor {

    /* renamed from: a */
    public static final PerfImageUploadMonitor f145430a = new PerfImageUploadMonitor();

    /* renamed from: c */
    private static ImageUploadData f145431c;

    /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.c$a */
    public static class ImageUploadData extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        public static final Companion f145432a = new Companion(null);

        /* renamed from: b */
        private String f145433b = "";

        /* renamed from: c */
        private Biz f145434c = Biz.Messenger;

        /* renamed from: d */
        private Scene f145435d = Scene.Chat;

        /* renamed from: e */
        private boolean f145436e = true;

        /* renamed from: f */
        private int f145437f = 5;

        /* renamed from: g */
        private boolean f145438g = true;

        /* renamed from: h */
        private String f145439h = ImageUtils.ImageType.TYPE_PNG.getValue();

        /* renamed from: i */
        private int f145440i = -1;

        /* renamed from: j */
        private int f145441j;

        /* renamed from: k */
        private int f145442k;

        /* renamed from: l */
        private int f145443l = -1;

        /* renamed from: n */
        private int f145444n;

        /* renamed from: o */
        private int f145445o;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "gallery_load";
        }

        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.c$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: d */
        public final void mo199322d() {
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(this.f145434c, this.f145435d, Event.image_upload, ErrorType.Unknown, ErrorLevel.Exception, 5678, null, null, null, false, null, null, null, 7616, null));
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: c */
        public void mo187680c() {
            super.mo187680c();
            AppreciableKit.f73094h.mo103524a().mo103521b(this.f145433b, "data_load_cost");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), this.f145433b, null, null, MapsKt.mapOf(TuplesKt.to("resource_content_length", Integer.valueOf(this.f145440i)), TuplesKt.to("resource_width", Integer.valueOf(this.f145441j)), TuplesKt.to("resource_height", Integer.valueOf(this.f145442k)), TuplesKt.to("upload_content_length", Integer.valueOf(this.f145443l)), TuplesKt.to("upload_width", Integer.valueOf(this.f145444n)), TuplesKt.to("upload_height", Integer.valueOf(this.f145445o))), MapsKt.mapOf(TuplesKt.to("from_type", Integer.valueOf(this.f145437f)), TuplesKt.to("is_encrypt", Boolean.valueOf(this.f145436e)), TuplesKt.to("media_is_origin_type", Boolean.valueOf(this.f145438g))), 6, null);
            this.f145433b = "";
        }

        /* renamed from: a */
        public final void mo199318a(int i, int i2, int i3) {
            this.f145440i = i;
            this.f145441j = i2;
            this.f145442k = i3;
        }

        /* renamed from: b */
        public final void mo199321b(int i, int i2, int i3) {
            this.f145443l = i;
            this.f145444n = i2;
            this.f145445o = i3;
        }

        /* renamed from: a */
        public final void mo199320a(boolean z, boolean z2, ImageUtils.ImageType imageType) {
            Intrinsics.checkParameterIsNotNull(imageType, "imageType");
            this.f145436e = z;
            this.f145438g = z2;
            this.f145439h = imageType.getValue();
        }

        /* renamed from: a */
        public final void mo199319a(Biz biz, Scene scene, int i) {
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            super.aF_();
            this.f145434c = biz;
            this.f145435d = scene;
            this.f145437f = i;
            this.f145433b = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), this.f145434c, this.f145435d, Event.image_upload, "PhotoPickerActivity", false, 16, (Object) null);
            AppreciableKit.f73094h.mo103524a().mo103517a(this.f145433b, "data_load_cost");
        }
    }

    /* renamed from: a */
    public final void mo199310a(int i, int i2) {
        m228143a(this, i, i2, 0, 4, (Object) null);
    }

    /* renamed from: a */
    public final void mo199313a(boolean z, boolean z2) {
        m228144a(this, z, z2, (ImageUtils.ImageType) null, 4, (Object) null);
    }

    /* renamed from: b */
    public final void mo199316b(int i, int i2) {
        m228145b(this, i, i2, 0, 4, null);
    }

    private PerfImageUploadMonitor() {
    }

    /* renamed from: b */
    public final void mo199315b() {
        ImageUploadData aVar = f145431c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo199322d();
            }
            f145431c = null;
        }
    }

    /* renamed from: a */
    public final void mo199309a() {
        ImageUploadData aVar = f145431c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo187680c();
            }
            f145431c = null;
        }
    }

    /* renamed from: a */
    public final void mo199311a(int i, int i2, int i3) {
        ImageUploadData aVar = f145431c;
        if (aVar != null) {
            aVar.mo199318a(i3, i, i2);
        }
    }

    /* renamed from: b */
    public final void mo199317b(int i, int i2, int i3) {
        ImageUploadData aVar = f145431c;
        if (aVar != null) {
            aVar.mo199321b(i3, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo199312a(Biz biz, Scene scene, int i) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        ImageUploadData aVar = f145431c;
        if (aVar == null) {
            aVar = new ImageUploadData();
        }
        f145431c = aVar;
        if (aVar != null) {
            aVar.mo199319a(biz, scene, i);
        }
    }

    /* renamed from: a */
    public final void mo199314a(boolean z, boolean z2, ImageUtils.ImageType imageType) {
        Intrinsics.checkParameterIsNotNull(imageType, "imageType");
        ImageUploadData aVar = f145431c;
        if (aVar != null) {
            aVar.mo199320a(z, z2, imageType);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m228143a(PerfImageUploadMonitor cVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        cVar.mo199311a(i, i2, i3);
    }

    /* renamed from: b */
    public static /* synthetic */ void m228145b(PerfImageUploadMonitor cVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        cVar.mo199317b(i, i2, i3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m228144a(PerfImageUploadMonitor cVar, boolean z, boolean z2, ImageUtils.ImageType imageType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            imageType = ImageUtils.ImageType.TYPE_PNG;
        }
        cVar.mo199314a(z, z2, imageType);
    }
}
