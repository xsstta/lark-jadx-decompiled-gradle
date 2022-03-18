package com.ss.android.lark.image.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.p1959b.AbstractC38820a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor;", "()V", "mShowImageCostData", "Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor$ShowImageCostData;", "end", "", "trace", "Lcom/bytedance/lark/pb/basic/v1/Trace;", "resource", "", "dataSource", "Lcom/ss/android/lark/image/api/DataSource;", "getImageType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$ImageType;", "getLoadType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$LoadType;", "onException", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "start", "params", "Lcom/ss/android/lark/biz/core/api/ListenerParams;", "Companion", "MonitorRequestListener", "ShowImageCostData", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.image.impl.f */
public final class PerfLoadPicMonitor extends BasePerfMonitor {

    /* renamed from: a */
    public static final Companion f99921a = new Companion(null);

    /* renamed from: c */
    private ShowImageCostData f99922c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J \u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0016J\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+J\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+J\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+J\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,0+J\u0010\u00100\u001a\u0002012\u0006\u0010(\u001a\u00020)H\u0016J\u000e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor$ShowImageCostData;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor$TimePerfData;", "()V", "appreciableKey", "", "colorSpace", "colorType", "imageType", "getImageType", "()Ljava/lang/String;", "setImageType", "(Ljava/lang/String;)V", "listenerParams", "Lcom/ss/android/lark/biz/core/api/ListenerParams;", "loadType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$LoadType;", "getLoadType", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$LoadType;", "setLoadType", "(Lcom/ss/android/lark/biz/core/api/ListenerParams$LoadType;)V", "resourceSize", "", "timeAfterAppStart", "timeAfterForeground", "trace", "Lcom/bytedance/lark/pb/basic/v1/Trace;", "getTrace", "()Lcom/bytedance/lark/pb/basic/v1/Trace;", "setTrace", "(Lcom/bytedance/lark/pb/basic/v1/Trace;)V", "end", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "generateData", "metrics", "Lorg/json/JSONObject;", "category", "extra", "getEventName", "platformType", "", "getExtraCategory", "", "", "getExtraMetric", "getLatencyDetail", "getSpanCost", "needReport", "", "start", "params", "Companion", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.image.impl.f$c */
    public static final class ShowImageCostData extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        public static final Companion f99925a = new Companion(null);

        /* renamed from: b */
        private String f99926b;

        /* renamed from: c */
        private ListenerParams f99927c;

        /* renamed from: d */
        private long f99928d;

        /* renamed from: e */
        private String f99929e = ListenerParams.ColorSpace.UNKNOWN.getValue();

        /* renamed from: f */
        private String f99930f = ListenerParams.ColorType.UNKNOWN.getValue();

        /* renamed from: g */
        private long f99931g;

        /* renamed from: h */
        private long f99932h;

        /* renamed from: i */
        private ListenerParams.LoadType f99933i = ListenerParams.LoadType.UNKNOWN;

        /* renamed from: j */
        private String f99934j = ListenerParams.ImageType.UNKNOWN.getValue();

        /* renamed from: k */
        private Trace f99935k;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "user_image_empty_cost";
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor$ShowImageCostData$Companion;", "", "()V", "CATEGORY_KEY_BIZ_SCENE", "", "CATEGORY_KEY_SCENE", "EVENT_NAME_IMAGE_EMPTY_COST", "EXTRA_CATEGORY_CHAT_TYPE", "EXTRA_CATEGORY_COLOR_SPACE", "EXTRA_CATEGORY_COLOR_TYPE", "EXTRA_CATEGORY_FROM_TYPE", "EXTRA_CATEGORY_IMAGE_TYPE", "EXTRA_CATEGORY_LOAD_TYPE", "EXTRA_KEY_TO_FOREGROUND", "EXTRA_KEY_TO_STARTUP", "EXTRA_METRIC_IMAGE_KEY", "EXTRA_METRIC_LOAD_HEIGHT", "EXTRA_METRIC_LOAD_WIDTH", "EXTRA_METRIC_MEDIA_IS_ORIGIN_TYPE", "EXTRA_METRIC_MESSAGE_ID", "EXTRA_METRIC_RESOURCE_CONTENT_LENGTH", "EXTRA_METRIC_RESOURCE_FRAMES", "EXTRA_METRIC_RESOURCE_HEIGHT", "EXTRA_METRIC_RESOURCE_WIDTH", "METRIC_KEY_LATENCY", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.image.impl.f$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final Map<String, Object> mo142417a() {
            HashMap hashMap = new HashMap();
            hashMap.putAll(mo142427d());
            return hashMap;
        }

        public final Map<String, Object> aE_() {
            HashMap hashMap = new HashMap();
            hashMap.put("resource_content_length", Long.valueOf(this.f99928d));
            ListenerParams listenerParams = this.f99927c;
            if (listenerParams != null) {
                hashMap.put("resource_width", Integer.valueOf(listenerParams.mo105374e()));
                hashMap.put("resource_height", Integer.valueOf(listenerParams.mo105375f()));
                hashMap.put("resource_frames", Integer.valueOf(listenerParams.mo105376g()));
                hashMap.put("load_width", Integer.valueOf(listenerParams.mo105372c()));
                hashMap.put("load_height", Integer.valueOf(listenerParams.mo105373d()));
                String n = listenerParams.mo105383n();
                if (n != null) {
                    hashMap.put("message_id", n);
                }
                String o = listenerParams.mo105384o();
                if (o != null) {
                    hashMap.put("image_key", o);
                }
                hashMap.put("media_is_origin_type", Boolean.valueOf(listenerParams.mo105385p()));
            }
            return hashMap;
        }

        /* renamed from: b */
        public final Map<String, Object> mo142425b() {
            HashMap hashMap = new HashMap();
            ListenerParams listenerParams = this.f99927c;
            if (listenerParams != null) {
                hashMap.put("from_type", Integer.valueOf(listenerParams.mo105380k().getValue()));
                hashMap.put("chat_type", Integer.valueOf(listenerParams.mo105381l().getValue()));
                hashMap.put("load_type", Integer.valueOf(this.f99933i.getValue()));
                hashMap.put("image_type", this.f99934j);
                hashMap.put("color_type", this.f99930f);
                hashMap.put("color_space", this.f99929e);
            }
            return hashMap;
        }

        /* renamed from: d */
        public final Map<String, Object> mo142427d() {
            HashMap hashMap = new HashMap();
            Trace trace = this.f99935k;
            if (trace != null) {
                for (Trace.Span span : trace.spans) {
                    if (!TextUtils.isEmpty(span.name) && span.duration_millis != null) {
                        String str = span.name;
                        Intrinsics.checkExpressionValueIsNotNull(str, "span.name");
                        Long l = span.duration_millis;
                        Intrinsics.checkExpressionValueIsNotNull(l, "span.duration_millis");
                        hashMap.put(str, l);
                        if (!CollectionUtils.isEmpty(span.attributes)) {
                            Map<String, String> map = span.attributes;
                            Intrinsics.checkExpressionValueIsNotNull(map, "span.attributes");
                            hashMap.putAll(map);
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public final void mo142418a(Trace trace) {
            this.f99935k = trace;
        }

        /* renamed from: a */
        public final void mo142420a(ListenerParams.LoadType loadType) {
            Intrinsics.checkParameterIsNotNull(loadType, "<set-?>");
            this.f99933i = loadType;
        }

        /* renamed from: a */
        public final void mo142422a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f99934j = str;
        }

        /* renamed from: a */
        public final void mo142421a(ListenerParams listenerParams) {
            Intrinsics.checkParameterIsNotNull(listenerParams, "params");
            super.aF_();
            this.f99927c = listenerParams;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AbstractC38820a a = C38792a.m153106a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ImageModule.getDependency()");
            this.f99931g = elapsedRealtime - a.mo142262b();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            AbstractC38820a a2 = C38792a.m153106a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ImageModule.getDependency()");
            this.f99932h = elapsedRealtime2 - a2.mo142264c();
            this.f99926b = AppreciableKit.f73094h.mo103524a().mo103508a(listenerParams.mo105378i(), listenerParams.mo105379j(), Event.image_load, listenerParams.mo105382m(), true);
        }

        /* renamed from: a */
        public final void mo142419a(ErrorResult errorResult) {
            Scene scene;
            super.mo187680c();
            if (errorResult == null) {
                AppreciableKit a = AppreciableKit.f73094h.mo103524a();
                String b = C57782ag.m224244b(this.f99926b);
                Intrinsics.checkExpressionValueIsNotNull(b, "TextUtil.nullToEmpty(appreciableKey)");
                a.mo103523c(b, mo142417a(), null, aE_(), mo142425b());
                StringBuilder sb = new StringBuilder();
                sb.append("end: ShowImageCostData:");
                ListenerParams listenerParams = this.f99927c;
                if (listenerParams != null) {
                    scene = listenerParams.mo105379j();
                } else {
                    scene = null;
                }
                sb.append(scene);
                Log.m165379d("PerfLoadPicMonitor", sb.toString());
                return;
            }
            ListenerParams listenerParams2 = this.f99927c;
            if (listenerParams2 != null) {
                AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(listenerParams2.mo105378i(), listenerParams2.mo105379j(), Event.image_load, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, listenerParams2.mo105382m(), errorResult.getDisplayMsg(), true, null, aE_(), mo142425b()));
            }
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "metrics");
            Intrinsics.checkParameterIsNotNull(jSONObject2, "category");
            Intrinsics.checkParameterIsNotNull(jSONObject3, "extra");
            try {
                jSONObject.put("latency", this.f142500m);
                jSONObject3.put("since_startup", this.f99931g);
                jSONObject3.put("since_latest_enter_foreground", this.f99932h);
                ListenerParams listenerParams = this.f99927c;
                if (listenerParams != null) {
                    jSONObject2.put("scene", listenerParams.mo105379j().getValue());
                    jSONObject2.put("biz_scene", listenerParams.mo105379j().getValue());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor$Companion;", "", "()V", "TAG", "", "getErrorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model", "getTrace", "Lcom/bytedance/lark/pb/basic/v1/Trace;", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.image.impl.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Trace mo142414a(Object obj) {
            Trace trace = null;
            if (obj instanceof C38824b) {
                return ((C38824b) obj).mo142322e();
            }
            return trace;
        }

        /* renamed from: a */
        public final ErrorResult mo142415a(Exception exc, Object obj) {
            ErrorResult errorResult = null;
            if (obj instanceof C38824b) {
                errorResult = ((C38824b) obj).mo142323f();
            }
            if (errorResult == null) {
                return new ErrorResult(exc);
            }
            return errorResult;
        }
    }

    /* renamed from: a */
    public final void mo142412a(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        ShowImageCostData cVar = this.f99922c;
        if (cVar != null) {
            cVar.mo142419a(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J<\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J>\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor$MonitorRequestListener;", "Lcom/ss/android/lark/image/api/RequestListener;", "", "listenerParams", "Lcom/ss/android/lark/biz/core/api/ListenerParams;", "(Lcom/ss/android/lark/biz/core/api/ListenerParams;)V", "monitor", "Lcom/ss/android/lark/image/impl/PerfLoadPicMonitor;", "onLoadFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model", "target", "Lcom/ss/android/lark/image/api/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/ss/android/lark/image/api/DataSource;", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.image.impl.f$b */
    public static final class MonitorRequestListener implements AbstractC38817h<Object, Object> {

        /* renamed from: a */
        private final PerfLoadPicMonitor f99923a;

        /* renamed from: b */
        private final ListenerParams f99924b;

        public MonitorRequestListener(ListenerParams listenerParams) {
            this.f99924b = listenerParams;
            PerfLoadPicMonitor fVar = new PerfLoadPicMonitor();
            this.f99923a = fVar;
            if (listenerParams != null) {
                fVar.mo142413a(listenerParams);
            }
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53861a(Exception exc, Object obj, AbstractC38819j<Object> jVar, boolean z) {
            ListenerParams.RequestListener h;
            this.f99923a.mo142412a(PerfLoadPicMonitor.f99921a.mo142415a(exc, obj));
            ListenerParams listenerParams = this.f99924b;
            if (listenerParams == null || (h = listenerParams.mo105377h()) == null) {
                return false;
            }
            h.mo105410a(exc);
            return false;
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53862a(Object obj, Object obj2, AbstractC38819j<Object> jVar, DataSource dataSource, boolean z) {
            ListenerParams.RequestListener h;
            Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
            this.f99923a.mo142411a(PerfLoadPicMonitor.f99921a.mo142414a(obj2), obj, dataSource);
            ListenerParams listenerParams = this.f99924b;
            if (listenerParams == null || (h = listenerParams.mo105377h()) == null) {
                return false;
            }
            h.mo105411a(obj, obj2, jVar, dataSource, z);
            return false;
        }
    }

    /* renamed from: a */
    private final ListenerParams.ImageType m153485a(Object obj) {
        Log.m165379d("PerfLoadPicMonitor", "getImageType:" + obj);
        return ListenerParams.ImageType.UNKNOWN;
    }

    /* renamed from: a */
    private final ListenerParams.LoadType m153486a(DataSource dataSource) {
        if (dataSource == null) {
            return ListenerParams.LoadType.UNKNOWN;
        }
        int i = C38895g.f99936a[dataSource.ordinal()];
        if (i == 1) {
            return ListenerParams.LoadType.DISK;
        }
        if (i == 2) {
            return ListenerParams.LoadType.NET;
        }
        if (i == 3 || i == 4 || i == 5) {
            return ListenerParams.LoadType.CACHE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final void mo142413a(ListenerParams listenerParams) {
        Intrinsics.checkParameterIsNotNull(listenerParams, "params");
        if (this.f99922c == null) {
            this.f99922c = new ShowImageCostData();
        }
        ShowImageCostData cVar = this.f99922c;
        if (cVar != null) {
            cVar.mo142421a(listenerParams);
        }
        Log.m165379d("PerfLoadPicMonitor", "start: ShowImageCostData");
    }

    /* renamed from: a */
    public final void mo142411a(Trace trace, Object obj, DataSource dataSource) {
        ShowImageCostData cVar = this.f99922c;
        boolean z = true;
        if (cVar != null) {
            cVar.mo142418a(trace);
            cVar.mo142420a(m153486a(dataSource));
            cVar.mo142422a(m153485a(obj).getValue());
            cVar.mo142419a((ErrorResult) null);
            ShowImageCostData cVar2 = cVar;
            if (cVar2.aG_()) {
                if (cVar2.mo142426b(2)) {
                    BasePerfMonitor.m224592a(cVar2);
                }
                if (cVar2.mo142426b(1)) {
                    BasePerfMonitor.m224593b(cVar2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("end: mShowImageCostData is null:");
        if (this.f99922c != null) {
            z = false;
        }
        sb.append(z);
        Log.m165379d("PerfLoadPicMonitor", sb.toString());
        this.f99922c = null;
    }
}
