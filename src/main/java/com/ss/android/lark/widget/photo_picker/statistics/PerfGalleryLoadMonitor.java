package com.ss.android.lark.widget.photo_picker.statistics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfGalleryLoadMonitor;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor;", "()V", "TAG", "", "sGalleryLoadData", "Lcom/ss/android/lark/widget/photo_picker/statistics/PerfGalleryLoadMonitor$GalleryLoadData;", "end", "", "error", "start", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "fromType", "", "FromType", "GalleryLoadData", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PerfGalleryLoadMonitor extends BasePerfMonitor {

    /* renamed from: a */
    public static final PerfGalleryLoadMonitor f145397a = new PerfGalleryLoadMonitor();

    /* renamed from: c */
    private static GalleryLoadData f145398c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfGalleryLoadMonitor$FromType;", "", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FromType {
        public static final Companion Companion = Companion.f145399a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfGalleryLoadMonitor$FromType$Companion;", "", "()V", "GALLERY", "", "KEYBOARD", GrsBaseInfo.CountryCodeSource.UNKNOWN, "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor$FromType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f145399a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0010\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfGalleryLoadMonitor$GalleryLoadData;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor$TimePerfData;", "()V", "galleryLoadFromType", "", "galleryLoadKey", "", "galleryLoadScene", "Lcom/ss/android/lark/appreciablelib/Scene;", "end", "", "error", "getEventName", "platformType", "start", "scene", "fromType", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor$a */
    public static class GalleryLoadData extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        public static final Companion f145400a = new Companion(null);

        /* renamed from: b */
        private String f145401b = "";

        /* renamed from: c */
        private Scene f145402c = Scene.Chat;

        /* renamed from: d */
        private int f145403d = 2;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "gallery_load";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfGalleryLoadMonitor$GalleryLoadData$Companion;", "", "()V", "DATA_LOAD_COST", "", "EVENT_NAME", "FROM_TYPE", "GALLERY_LOAD_ERROR_CODE", "", "GALLERY_LOAD_PAGE", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: c */
        public void mo187680c() {
            super.mo187680c();
            AppreciableKit.f73094h.mo103524a().mo103521b(this.f145401b, "data_load_cost");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), this.f145401b, null, null, null, MapsKt.mapOf(TuplesKt.to("from_type", Integer.valueOf(this.f145403d))), 14, null);
            this.f145401b = "";
        }

        /* renamed from: d */
        public final void mo199290d() {
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Core, this.f145402c, Event.gallery_load, ErrorType.Unknown, ErrorLevel.Exception, 5678, null, null, null, false, null, null, null, 7616, null));
        }

        /* renamed from: a */
        public final void mo199289a(Scene scene, int i) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            super.aF_();
            this.f145402c = scene;
            this.f145403d = i;
            this.f145401b = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.Core, this.f145402c, Event.gallery_load, "PhotoPickerActivity", false, 16, (Object) null);
            AppreciableKit.f73094h.mo103524a().mo103517a(this.f145401b, "data_load_cost");
        }
    }

    private PerfGalleryLoadMonitor() {
    }

    /* renamed from: a */
    public final void mo199286a() {
        GalleryLoadData aVar = f145398c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo187680c();
            }
            f145398c = null;
        }
    }

    /* renamed from: b */
    public final void mo199288b() {
        GalleryLoadData aVar = f145398c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo199290d();
            }
            f145398c = null;
        }
    }

    /* renamed from: a */
    public final void mo199287a(Scene scene, int i) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        GalleryLoadData aVar = f145398c;
        if (aVar == null) {
            aVar = new GalleryLoadData();
        }
        f145398c = aVar;
        if (aVar != null) {
            aVar.mo199289a(scene, i);
        }
    }
}
