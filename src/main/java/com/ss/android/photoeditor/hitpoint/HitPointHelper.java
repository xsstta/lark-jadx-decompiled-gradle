package com.ss.android.photoeditor.hitpoint;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vesdk.C64034n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/photoeditor/hitpoint/HitPointHelper;", "", "()V", "Companion", "IStatisticsProvider", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.a.a */
public final class HitPointHelper {

    /* renamed from: a */
    public static boolean f147953a;

    /* renamed from: b */
    public static boolean f147954b;

    /* renamed from: c */
    public static boolean f147955c;

    /* renamed from: d */
    public static boolean f147956d;

    /* renamed from: e */
    public static boolean f147957e;

    /* renamed from: f */
    public static boolean f147958f;

    /* renamed from: g */
    public static boolean f147959g;

    /* renamed from: h */
    public static final List<Integer> f147960h = new ArrayList();

    /* renamed from: i */
    public static final List<Integer> f147961i = new ArrayList();

    /* renamed from: j */
    public static final List<Integer> f147962j = new ArrayList();

    /* renamed from: k */
    public static IStatisticsProvider f147963k;

    /* renamed from: l */
    public static final Companion f147964l = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u0005J\u0006\u0010-\u001a\u00020'J\u0006\u0010.\u001a\u00020'J\u0006\u0010/\u001a\u00020'J\u0006\u00100\u001a\u00020'J\u0012\u00101\u001a\u000202*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$Companion;", "", "()V", "colorIds", "", "", "mosaicIds", "picEditCrop", "", "getPicEditCrop", "()Z", "setPicEditCrop", "(Z)V", "picEditDraw", "getPicEditDraw", "setPicEditDraw", "picEditDrawSizeAdjust", "getPicEditDrawSizeAdjust", "setPicEditDrawSizeAdjust", "picEditMosaic", "getPicEditMosaic", "setPicEditMosaic", "picEditMosaicSizeAdjust", "getPicEditMosaicSizeAdjust", "setPicEditMosaicSizeAdjust", "picEditText", "getPicEditText", "setPicEditText", "picEditTextSize", "getPicEditTextSize", "setPicEditTextSize", "statisticsProvider", "Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;", "getStatisticsProvider", "()Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;", "setStatisticsProvider", "(Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;)V", "textColorIds", "addDrawColor", "", "colorId", "addMosaicType", ShareHitPoint.f121869d, "addTextColorId", "id", "reset", "sendPicEditEvents", "sendPicEditWithDrawClickEvent", "sendStartEditEvent", "toHitPointString", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: h */
        public final IStatisticsProvider mo203059h() {
            return HitPointHelper.f147963k;
        }

        /* renamed from: b */
        public final boolean mo203047b() {
            return HitPointHelper.f147954b;
        }

        /* renamed from: c */
        public final boolean mo203050c() {
            return HitPointHelper.f147955c;
        }

        /* renamed from: d */
        public final boolean mo203052d() {
            return HitPointHelper.f147956d;
        }

        /* renamed from: e */
        public final boolean mo203054e() {
            return HitPointHelper.f147957e;
        }

        /* renamed from: f */
        public final boolean mo203056f() {
            return HitPointHelper.f147958f;
        }

        /* renamed from: g */
        public final boolean mo203058g() {
            return HitPointHelper.f147959g;
        }

        /* renamed from: i */
        public final void mo203060i() {
            IStatisticsProvider h = mo203059h();
            if (h != null) {
                IStatisticsProvider.C59608a.m231199a(h, null, 1, null);
            }
        }

        /* renamed from: k */
        public final void mo203062k() {
            IStatisticsProvider h = mo203059h();
            if (h != null) {
                IStatisticsProvider.C59608a.m231200b(h, null, 1, null);
            }
        }

        /* renamed from: a */
        public final boolean mo203044a() {
            return HitPointHelper.f147953a;
        }

        /* renamed from: j */
        public final void mo203061j() {
            Companion aVar = this;
            aVar.mo203051d(false);
            aVar.mo203043a(false);
            aVar.mo203046b(false);
            aVar.mo203049c(false);
            HitPointHelper.f147960h.clear();
            HitPointHelper.f147961i.clear();
            HitPointHelper.f147962j.clear();
            aVar.mo203042a((IStatisticsProvider) null);
        }

        /* renamed from: l */
        public final void mo203063l() {
            Companion aVar = this;
            if (aVar.mo203059h() != null) {
                IStatisticsProvider h = aVar.mo203059h();
                if (h == null) {
                    Intrinsics.throwNpe();
                }
                String str = "y";
                if (aVar.mo203044a()) {
                    h.mo177153h(new JSONObject().put("pic_edit_draw_size_adjust", aVar.mo203054e() ? str : C64034n.f161683a));
                }
                if (aVar.mo203047b()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!aVar.mo203056f()) {
                        str = C64034n.f161683a;
                    }
                    h.mo177152g(jSONObject.put("pic_edit_mosaic_size_adjust", str));
                }
                if (aVar.mo203050c()) {
                    IStatisticsProvider.C59608a.m231201c(h, null, 1, null);
                }
                if (aVar.mo203052d()) {
                    IStatisticsProvider.C59608a.m231202d(h, null, 1, null);
                }
                if (aVar.mo203058g()) {
                    IStatisticsProvider.C59608a.m231203e(h, null, 1, null);
                }
                h.mo177148c(new JSONObject().put("color_id", aVar.m231165a(HitPointHelper.f147960h)));
                h.mo177147b(new JSONObject().put("mosaic_id", aVar.m231165a(HitPointHelper.f147961i)));
                h.mo177146a(new JSONObject().put("text_color_id", aVar.m231165a(CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(HitPointHelper.f147962j)))));
            }
        }

        /* renamed from: a */
        public final void mo203042a(IStatisticsProvider bVar) {
            HitPointHelper.f147963k = bVar;
        }

        /* renamed from: b */
        public final void mo203046b(boolean z) {
            HitPointHelper.f147954b = z;
        }

        /* renamed from: c */
        public final void mo203049c(boolean z) {
            HitPointHelper.f147955c = z;
        }

        /* renamed from: d */
        public final void mo203051d(boolean z) {
            HitPointHelper.f147956d = z;
        }

        /* renamed from: e */
        public final void mo203053e(boolean z) {
            HitPointHelper.f147957e = z;
        }

        /* renamed from: f */
        public final void mo203055f(boolean z) {
            HitPointHelper.f147958f = z;
        }

        /* renamed from: g */
        public final void mo203057g(boolean z) {
            HitPointHelper.f147959g = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo203043a(boolean z) {
            HitPointHelper.f147953a = z;
        }

        /* renamed from: a */
        public final void mo203041a(int i) {
            HitPointHelper.f147960h.add(Integer.valueOf(i));
        }

        /* renamed from: b */
        public final void mo203045b(int i) {
            HitPointHelper.f147961i.add(Integer.valueOf(i));
        }

        /* renamed from: c */
        public final void mo203048c(int i) {
            HitPointHelper.f147962j.add(Integer.valueOf(i));
        }

        /* renamed from: a */
        private final String m231165a(List<Integer> list) {
            Iterator<T> it = list.iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + it.next().intValue() + ", ";
            }
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;", "", "sendPicEditCropEvent", "", "value", "Lorg/json/JSONObject;", "sendPicEditDrawColorEvent", "sendPicEditDrawEvent", "sendPicEditMosaicEvent", "sendPicEditMosaicTypeEvent", "sendPicEditTextBoxCreateEvent", "sendPicEditTextEvent", "sendPicEditTextSizeEvent", "sendPicEditWithDrawClickEvent", "sendStartEditEvent", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.a.a$b */
    public interface IStatisticsProvider {
        /* renamed from: a */
        void mo177146a(JSONObject jSONObject);

        /* renamed from: b */
        void mo177147b(JSONObject jSONObject);

        /* renamed from: c */
        void mo177148c(JSONObject jSONObject);

        /* renamed from: d */
        void mo177149d(JSONObject jSONObject);

        /* renamed from: e */
        void mo177150e(JSONObject jSONObject);

        /* renamed from: f */
        void mo177151f(JSONObject jSONObject);

        /* renamed from: g */
        void mo177152g(JSONObject jSONObject);

        /* renamed from: h */
        void mo177153h(JSONObject jSONObject);

        /* renamed from: i */
        void mo177154i(JSONObject jSONObject);

        /* renamed from: j */
        void mo177155j(JSONObject jSONObject);

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.photoeditor.a.a$b$a */
        public static final class C59608a {
            /* renamed from: a */
            public static /* synthetic */ void m231199a(IStatisticsProvider bVar, JSONObject jSONObject, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        jSONObject = null;
                    }
                    bVar.mo177155j(jSONObject);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPicEditWithDrawClickEvent");
            }

            /* renamed from: b */
            public static /* synthetic */ void m231200b(IStatisticsProvider bVar, JSONObject jSONObject, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        jSONObject = null;
                    }
                    bVar.mo177154i(jSONObject);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStartEditEvent");
            }

            /* renamed from: c */
            public static /* synthetic */ void m231201c(IStatisticsProvider bVar, JSONObject jSONObject, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        jSONObject = null;
                    }
                    bVar.mo177151f(jSONObject);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPicEditTextEvent");
            }

            /* renamed from: d */
            public static /* synthetic */ void m231202d(IStatisticsProvider bVar, JSONObject jSONObject, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        jSONObject = null;
                    }
                    bVar.mo177150e(jSONObject);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPicEditCropEvent");
            }

            /* renamed from: e */
            public static /* synthetic */ void m231203e(IStatisticsProvider bVar, JSONObject jSONObject, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        jSONObject = null;
                    }
                    bVar.mo177149d(jSONObject);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPicEditTextSizeEvent");
            }
        }
    }
}
