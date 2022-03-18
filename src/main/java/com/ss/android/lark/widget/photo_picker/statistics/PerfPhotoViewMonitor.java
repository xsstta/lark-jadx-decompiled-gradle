package com.ss.android.lark.widget.photo_picker.statistics;

import android.os.SystemClock;
import android.util.SparseArray;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\rJ,\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor;", "()V", "TAG", "", "sOpenPreviewData", "Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$OpenPreviewData;", "end", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "endSpan", "spanType", "", "getPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "photoItems", "", "itemIndex", "start", "photoItem", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "fromType", "startSpan", "ErrorReason", "FromType", "OpenPreviewData", "SpanType", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PerfPhotoViewMonitor extends BasePerfMonitor {

    /* renamed from: a */
    public static final PerfPhotoViewMonitor f145408a = new PerfPhotoViewMonitor();

    /* renamed from: c */
    private static OpenPreviewData f145409c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$ErrorReason;", "", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ErrorReason {
        public static final Companion Companion = Companion.f145410a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$ErrorReason$Companion;", "", "()V", "PIC_DECODE_FAILED", "", "PIC_FALLBACK", "PIC_LOAD_FAILED", "PIC_NOT_FOUND", "WINDOW_FAILED", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor$ErrorReason$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f145410a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$FromType;", "", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FromType {
        public static final Companion Companion = Companion.f145411a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$FromType$Companion;", "", "()V", "AVATAR", "", "MESSAGE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor$FromType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f145411a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$SpanType;", "", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SpanType {
        public static final Companion Companion = Companion.f145412a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$SpanType$Companion;", "", "()V", "LOAD_ORIGIN", "", "LOAD_THUMB", "OPEN_WINDOW", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor$SpanType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f145412a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u000e\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0013J\u0010\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0013H\u0016J*\u00101\u001a\u00020*2\u0006\u00102\u001a\u0002032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u00104\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$OpenPreviewData;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor$TimePerfData;", "()V", "appreciableKey", "", "getAppreciableKey", "()Ljava/lang/String;", "setAppreciableKey", "(Ljava/lang/String;)V", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "extraCategory", "", "", "getExtraCategory", "()Ljava/util/Map;", "extraMetric", "getExtraMetric", "fromType", "", "imageKey", "imageType", "latencyDetail", "getLatencyDetail", "mediaIsOriginType", "", "messageId", "resourceContentLength", "", "resourceFrames", "resourceHeight", "resourceWidth", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "spanCostMap", "Landroid/util/SparseArray;", "getSpanCostMap", "()Landroid/util/SparseArray;", "setSpanCostMap", "(Landroid/util/SparseArray;)V", "startTime", "end", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "endSpan", "spanType", "getEventName", "platformType", "start", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "startSpan", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor$a */
    public static class OpenPreviewData extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        public static final Companion f145413a = new Companion(null);

        /* renamed from: b */
        private String f145414b;

        /* renamed from: c */
        private SparseArray<Long> f145415c = new SparseArray<>();

        /* renamed from: d */
        private int f145416d;

        /* renamed from: e */
        private String f145417e = "";

        /* renamed from: f */
        private long f145418f;

        /* renamed from: g */
        private int f145419g;

        /* renamed from: h */
        private int f145420h;

        /* renamed from: i */
        private int f145421i;

        /* renamed from: j */
        private long f145422j;

        /* renamed from: k */
        private Biz f145423k = Biz.Messenger;

        /* renamed from: l */
        private Scene f145424l = Scene.Chat;

        /* renamed from: n */
        private String f145425n = "";

        /* renamed from: o */
        private String f145426o = "";

        /* renamed from: p */
        private boolean f145427p;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "open_imageviewer";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfPhotoViewMonitor$OpenPreviewData$Companion;", "", "()V", "EVENT_NAME", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: f */
        private final Map<String, Object> m228119f() {
            HashMap hashMap = new HashMap();
            hashMap.put("from_type", Integer.valueOf(this.f145416d));
            hashMap.put("image_type", this.f145417e);
            return hashMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Integer] */
        /* renamed from: d */
        private final Map<String, Object> m228117d() {
            HashMap hashMap = new HashMap();
            Long l = this.f145415c.get(1);
            if (l == null) {
                l = 0;
            }
            hashMap.put("openview_cost", l);
            Long l2 = this.f145415c.get(2);
            if (l2 == null) {
                l2 = 0;
            }
            hashMap.put("view_thumb_cost", l2);
            Long l3 = this.f145415c.get(3);
            Long l4 = 0;
            if (l3 != null) {
                l4 = l3;
            }
            hashMap.put("loader_origin_cost", l4 == 1 ? 1 : 0);
            return hashMap;
        }

        /* renamed from: e */
        private final Map<String, Object> m228118e() {
            HashMap hashMap = new HashMap();
            hashMap.put("resource_content_length", Long.valueOf(this.f145418f));
            hashMap.put("resource_width", Integer.valueOf(this.f145419g));
            hashMap.put("resource_height", Integer.valueOf(this.f145420h));
            hashMap.put("resource_frames", Integer.valueOf(this.f145421i));
            hashMap.put("message_id", this.f145425n);
            hashMap.put("image_key", this.f145426o);
            hashMap.put("media_is_origin_type", Boolean.valueOf(this.f145427p));
            return hashMap;
        }

        /* renamed from: c */
        public final void mo199298c(int i) {
            if (this.f145415c.get(i) == null) {
                Log.m165379d("PerfPhotoPreviewMonitor", "startSpan " + i + ":" + this.f145415c.get(i));
                this.f145415c.put(i, Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }

        /* renamed from: a */
        public final void mo199296a(ErrorResult errorResult) {
            super.mo187680c();
            if (errorResult == null) {
                AppreciableKit a = AppreciableKit.f73094h.mo103524a();
                String b = C57782ag.m224244b(this.f145414b);
                Intrinsics.checkExpressionValueIsNotNull(b, "TextUtil.nullToEmpty(appreciableKey)");
                a.mo103523c(b, m228117d(), null, m228118e(), m228119f());
                return;
            }
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(this.f145423k, this.f145424l, Event.open_imageviewer, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "PhotoPagerActivity", errorResult.getDisplayMsg(), true, null, null, m228119f()));
        }

        /* renamed from: d */
        public final void mo199299d(int i) {
            long j;
            Long l = this.f145415c.get(i);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (j >= this.f145422j) {
                Log.m165379d("PerfPhotoPreviewMonitor", "endSpan " + i + ":" + this.f145415c.get(i));
                SparseArray<Long> sparseArray = this.f145415c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l2 = this.f145415c.get(i);
                Intrinsics.checkExpressionValueIsNotNull(l2, "spanCostMap[spanType]");
                sparseArray.put(i, Long.valueOf(elapsedRealtime - l2.longValue()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo199297a(com.ss.android.lark.widget.photo_picker.entity.PhotoItem r11, com.ss.android.lark.appreciablelib.Biz r12, com.ss.android.lark.appreciablelib.Scene r13, int r14) {
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor.OpenPreviewData.mo199297a(com.ss.android.lark.widget.photo_picker.entity.PhotoItem, com.ss.android.lark.appreciablelib.Biz, com.ss.android.lark.appreciablelib.Scene, int):void");
        }
    }

    private PerfPhotoViewMonitor() {
    }

    /* renamed from: a */
    public final void mo199292a(int i) {
        OpenPreviewData aVar = f145409c;
        if (aVar != null) {
            aVar.mo199298c(i);
        }
    }

    /* renamed from: b */
    public final void mo199295b(int i) {
        OpenPreviewData aVar = f145409c;
        if (aVar != null) {
            aVar.mo199299d(i);
        }
    }

    /* renamed from: a */
    public final void mo199293a(ErrorResult errorResult) {
        OpenPreviewData aVar = f145409c;
        if (aVar != null) {
            aVar.mo199296a(errorResult);
            Log.m165379d("PerfPhotoPreviewMonitor", "end OpenPreviewData");
        }
        f145409c = null;
    }

    /* renamed from: a */
    public final PhotoItem mo199291a(List<? extends PhotoItem> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (PhotoItem) list.get(i);
    }

    /* renamed from: a */
    public final void mo199294a(PhotoItem photoItem, Biz biz, Scene scene, int i) {
        if (f145409c == null) {
            f145409c = new OpenPreviewData();
        }
        if (photoItem != null) {
            OpenPreviewData aVar = f145409c;
            if (aVar != null) {
                aVar.mo199297a(photoItem, biz, scene, i);
            }
            Log.m165379d("PerfPhotoPreviewMonitor", "start OpenPreviewData");
        }
    }
}
