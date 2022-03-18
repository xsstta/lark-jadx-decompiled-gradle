package com.ss.android.lark.biz.core.api;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.image.api.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\u0018\u00002\u00020\u0001:\b56789:;<B\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010#R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010%\"\u0004\b0\u0010.R\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010%\"\u0004\b2\u0010.R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006="}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams;", "", "needLoadMonitor", "", "isThumbnail", "loadWidth", "", "loadHeight", "resourceWidth", "resourceHeight", "resourceFrames", "requestListener", "Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "fromType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "chatType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;", "page", "", "messageId", "imageKey", "isOrigin", "(ZZIIIIILcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "getChatType", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;", "getFromType", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "getImageKey", "()Ljava/lang/String;", "()Z", "getLoadHeight", "()I", "getLoadWidth", "getMessageId", "getNeedLoadMonitor", "getPage", "getRequestListener", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "getResourceFrames", "setResourceFrames", "(I)V", "getResourceHeight", "setResourceHeight", "getResourceWidth", "setResourceWidth", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "Builder", "ChatType", "ColorSpace", "ColorType", "FromType", "ImageType", "LoadType", "RequestListener", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListenerParams {

    /* renamed from: a */
    private final boolean f73841a;

    /* renamed from: b */
    private final boolean f73842b;

    /* renamed from: c */
    private final int f73843c;

    /* renamed from: d */
    private final int f73844d;

    /* renamed from: e */
    private int f73845e;

    /* renamed from: f */
    private int f73846f;

    /* renamed from: g */
    private int f73847g;

    /* renamed from: h */
    private final RequestListener f73848h;

    /* renamed from: i */
    private final Biz f73849i;

    /* renamed from: j */
    private final Scene f73850j;

    /* renamed from: k */
    private final FromType f73851k;

    /* renamed from: l */
    private final ChatType f73852l;

    /* renamed from: m */
    private final String f73853m;

    /* renamed from: n */
    private final String f73854n;

    /* renamed from: o */
    private final String f73855o;

    /* renamed from: p */
    private final boolean f73856p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J6\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "", "onException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onResourceReady", "resource", "model", "target", "dataSource", "Lcom/ss/android/lark/image/api/DataSource;", "isFirstResource", "", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.ListenerParams$b */
    public interface RequestListener {
        /* renamed from: a */
        void mo105410a(Exception exc);

        /* renamed from: a */
        void mo105411a(Object obj, Object obj2, Object obj3, DataSource dataSource, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SINGLE", "GROUP", "TOPIC", "THREAD_DETAIL", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ChatType {
        UNKNOWN(0),
        SINGLE(1),
        GROUP(2),
        TOPIC(3),
        THREAD_DETAIL(4);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private ChatType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$ColorSpace;", "", "value", "", "index", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getIndex", "()I", "getValue", "()Ljava/lang/String;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ACES", "ACESCG", "ADOBE_RGB", "BT2020", "BT709", "CIE_LAB", "CIE_XYZ", "DCI_P3", "DISPLAY_P3", "EXTENDED_SRGB", "LINEAR_EXTENDED_SRGB", "LINEAR_SRGB", "NTSC_1953", "PRO_PHOTO_RGB", "SMPTE_C", "SRGB", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ColorSpace {
        UNKNOWN("unknown", 0),
        ACES("aces", 1),
        ACESCG("acescg", 2),
        ADOBE_RGB("adobe_rgb", 3),
        BT2020("bt2020", 4),
        BT709("bt709", 5),
        CIE_LAB("cie_lab", 6),
        CIE_XYZ("cie_xyz", 7),
        DCI_P3("dci_p3", 8),
        DISPLAY_P3("display_p3", 9),
        EXTENDED_SRGB("extended_srgb", 10),
        LINEAR_EXTENDED_SRGB("linear_extended_srgb", 11),
        LINEAR_SRGB("linear_srgb", 12),
        NTSC_1953("ntsc_1953", 13),
        PRO_PHOTO_RGB("pro_photo_rgb", 14),
        SMPTE_C("smpte_c", 15),
        SRGB("srgb", 16);
        
        private final int index;
        private final String value;

        public final int getIndex() {
            return this.index;
        }

        public final String getValue() {
            return this.value;
        }

        private ColorSpace(String str, int i) {
            this.value = str;
            this.index = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$ColorType;", "", "value", "", "index", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getIndex", "()I", "getValue", "()Ljava/lang/String;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ALPHA_8", "RGB_565", "ARGB_444", "RGBA_8888", "RGB_888X", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ColorType {
        UNKNOWN("unknown", 0),
        ALPHA_8("alpha_8", 1),
        RGB_565("rgb_565", 2),
        ARGB_444("argb_444", 3),
        RGBA_8888("rgba_8888", 4),
        RGB_888X("rgb_888x", 5);
        
        private final int index;
        private final String value;

        public final int getIndex() {
            return this.index;
        }

        public final String getValue() {
            return this.value;
        }

        private ColorType(String str, int i) {
            this.value = str;
            this.index = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "IMAGE", "POST", "STICKER", "MEDIA", "AVATAR", "REATION", "CARD", "URL_PREVIEW", "COVER", "CHAT_HISTORY", "CHAT_ALBUM", "ICON", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum FromType {
        UNKNOWN(0),
        IMAGE(1),
        POST(2),
        STICKER(3),
        MEDIA(4),
        AVATAR(5),
        REATION(6),
        CARD(7),
        URL_PREVIEW(8),
        COVER(9),
        CHAT_HISTORY(10),
        CHAT_ALBUM(11),
        ICON(12);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private FromType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$ImageType;", "", "value", "", "index", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getIndex", "()I", "getValue", "()Ljava/lang/String;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "JPEG", "PNG", "WEBP", "HEIC", "GIF", "H264", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ImageType {
        UNKNOWN("unknown", 0),
        JPEG("jpeg", 1),
        PNG("png", 2),
        WEBP("webp", 3),
        HEIC("heic", 4),
        GIF("gif", 5),
        H264("h264", 5);
        
        private final int index;
        private final String value;

        public final int getIndex() {
            return this.index;
        }

        public final String getValue() {
            return this.value;
        }

        private ImageType(String str, int i) {
            this.value = str;
            this.index = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$LoadType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "NET", "DISK", "CACHE", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LoadType {
        UNKNOWN(0),
        NET(1),
        DISK(2),
        CACHE(3);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private LoadType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public final boolean mo105370a() {
        return this.f73841a;
    }

    /* renamed from: b */
    public final boolean mo105371b() {
        return this.f73842b;
    }

    /* renamed from: c */
    public final int mo105372c() {
        return this.f73843c;
    }

    /* renamed from: d */
    public final int mo105373d() {
        return this.f73844d;
    }

    /* renamed from: e */
    public final int mo105374e() {
        return this.f73845e;
    }

    /* renamed from: f */
    public final int mo105375f() {
        return this.f73846f;
    }

    /* renamed from: g */
    public final int mo105376g() {
        return this.f73847g;
    }

    /* renamed from: h */
    public final RequestListener mo105377h() {
        return this.f73848h;
    }

    /* renamed from: i */
    public final Biz mo105378i() {
        return this.f73849i;
    }

    /* renamed from: j */
    public final Scene mo105379j() {
        return this.f73850j;
    }

    /* renamed from: k */
    public final FromType mo105380k() {
        return this.f73851k;
    }

    /* renamed from: l */
    public final ChatType mo105381l() {
        return this.f73852l;
    }

    /* renamed from: m */
    public final String mo105382m() {
        return this.f73853m;
    }

    /* renamed from: n */
    public final String mo105383n() {
        return this.f73854n;
    }

    /* renamed from: o */
    public final String mo105384o() {
        return this.f73855o;
    }

    /* renamed from: p */
    public final boolean mo105385p() {
        return this.f73856p;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010J\u001a\u00020KJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\t\u0010M\u001a\u00020\u0011HÆ\u0003J\t\u0010N\u001a\u00020\u0013HÆ\u0003J\t\u0010O\u001a\u00020\u0015HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010S\u001a\u00020\u0004HÆ\u0003J\t\u0010T\u001a\u00020\u0004HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010[\u001a\u00020\u000fHÆ\u0003J±\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0004HÆ\u0001J\u0013\u0010]\u001a\u00020\u00042\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010_\u001a\u00020\u0007HÖ\u0001J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010`\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010,\"\u0004\b/\u0010.R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\u001a\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00101\"\u0004\bC\u00103R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00101\"\u0004\bE\u00103R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006a"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ListenerParams$Builder;", "", "()V", "needLoadMonitor", "", "isThumbnail", "loadWidth", "", "loadHeight", "resourceWidth", "resourceHeight", "resourceFrames", "requestListener", "Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "fromType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "chatType", "Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;", "page", "", "messageId", "imageKey", "isOrigin", "(ZZIIIIILcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "setBiz", "(Lcom/ss/android/lark/appreciablelib/Biz;)V", "getChatType", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;", "setChatType", "(Lcom/ss/android/lark/biz/core/api/ListenerParams$ChatType;)V", "getFromType", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;", "setFromType", "(Lcom/ss/android/lark/biz/core/api/ListenerParams$FromType;)V", "getImageKey", "()Ljava/lang/String;", "setImageKey", "(Ljava/lang/String;)V", "()Z", "setOrigin", "(Z)V", "setThumbnail", "getLoadHeight", "()I", "setLoadHeight", "(I)V", "getLoadWidth", "setLoadWidth", "getMessageId", "setMessageId", "getNeedLoadMonitor", "setNeedLoadMonitor", "getPage", "setPage", "getRequestListener", "()Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "setRequestListener", "(Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;)V", "getResourceFrames", "setResourceFrames", "getResourceHeight", "setResourceHeight", "getResourceWidth", "setResourceWidth", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "setScene", "(Lcom/ss/android/lark/appreciablelib/Scene;)V", "build", "Lcom/ss/android/lark/biz/core/api/ListenerParams;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.ListenerParams$a */
    public static final class Builder {

        /* renamed from: a */
        private boolean f73857a;

        /* renamed from: b */
        private boolean f73858b;

        /* renamed from: c */
        private int f73859c;

        /* renamed from: d */
        private int f73860d;

        /* renamed from: e */
        private int f73861e;

        /* renamed from: f */
        private int f73862f;

        /* renamed from: g */
        private int f73863g;

        /* renamed from: h */
        private RequestListener f73864h;

        /* renamed from: i */
        private Biz f73865i;

        /* renamed from: j */
        private Scene f73866j;

        /* renamed from: k */
        private FromType f73867k;

        /* renamed from: l */
        private ChatType f73868l;

        /* renamed from: m */
        private String f73869m;

        /* renamed from: n */
        private String f73870n;

        /* renamed from: o */
        private String f73871o;

        /* renamed from: p */
        private boolean f73872p;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder aVar = (Builder) obj;
            return this.f73857a == aVar.f73857a && this.f73858b == aVar.f73858b && this.f73859c == aVar.f73859c && this.f73860d == aVar.f73860d && this.f73861e == aVar.f73861e && this.f73862f == aVar.f73862f && this.f73863g == aVar.f73863g && Intrinsics.areEqual(this.f73864h, aVar.f73864h) && Intrinsics.areEqual(this.f73865i, aVar.f73865i) && Intrinsics.areEqual(this.f73866j, aVar.f73866j) && Intrinsics.areEqual(this.f73867k, aVar.f73867k) && Intrinsics.areEqual(this.f73868l, aVar.f73868l) && Intrinsics.areEqual(this.f73869m, aVar.f73869m) && Intrinsics.areEqual(this.f73870n, aVar.f73870n) && Intrinsics.areEqual(this.f73871o, aVar.f73871o) && this.f73872p == aVar.f73872p;
        }

        public int hashCode() {
            boolean z = this.f73857a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f73858b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (((((((((((i5 + i6) * 31) + this.f73859c) * 31) + this.f73860d) * 31) + this.f73861e) * 31) + this.f73862f) * 31) + this.f73863g) * 31;
            RequestListener bVar = this.f73864h;
            int i10 = 0;
            int hashCode = (i9 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            Biz biz = this.f73865i;
            int hashCode2 = (hashCode + (biz != null ? biz.hashCode() : 0)) * 31;
            Scene scene = this.f73866j;
            int hashCode3 = (hashCode2 + (scene != null ? scene.hashCode() : 0)) * 31;
            FromType fromType = this.f73867k;
            int hashCode4 = (hashCode3 + (fromType != null ? fromType.hashCode() : 0)) * 31;
            ChatType chatType = this.f73868l;
            int hashCode5 = (hashCode4 + (chatType != null ? chatType.hashCode() : 0)) * 31;
            String str = this.f73869m;
            int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f73870n;
            int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f73871o;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            int i11 = (hashCode7 + i10) * 31;
            boolean z3 = this.f73872p;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            return i11 + i;
        }

        public String toString() {
            return "Builder(needLoadMonitor=" + this.f73857a + ", isThumbnail=" + this.f73858b + ", loadWidth=" + this.f73859c + ", loadHeight=" + this.f73860d + ", resourceWidth=" + this.f73861e + ", resourceHeight=" + this.f73862f + ", resourceFrames=" + this.f73863g + ", requestListener=" + this.f73864h + ", biz=" + this.f73865i + ", scene=" + this.f73866j + ", fromType=" + this.f73867k + ", chatType=" + this.f73868l + ", page=" + this.f73869m + ", messageId=" + this.f73870n + ", imageKey=" + this.f73871o + ", isOrigin=" + this.f73872p + ")";
        }

        public Builder() {
            this(false, false, 0, 0, 0, 0, 0, null, Biz.Messenger, Scene.Chat, FromType.UNKNOWN, ChatType.UNKNOWN, null, null, null, false);
        }

        /* renamed from: a */
        public final ListenerParams mo105402a() {
            return new ListenerParams(this.f73857a, this.f73858b, this.f73859c, this.f73860d, this.f73861e, this.f73862f, this.f73863g, this.f73864h, this.f73865i, this.f73866j, this.f73867k, this.f73868l, this.f73869m, this.f73870n, this.f73871o, this.f73872p, null);
        }

        /* renamed from: a */
        public final Builder mo105395a(int i) {
            Builder aVar = this;
            aVar.f73859c = i;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo105403b(int i) {
            Builder aVar = this;
            aVar.f73860d = i;
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo105406c(boolean z) {
            Builder aVar = this;
            aVar.f73872p = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo105396a(Biz biz) {
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Builder aVar = this;
            aVar.f73865i = biz;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo105404b(String str) {
            Builder aVar = this;
            aVar.f73871o = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo105397a(Scene scene) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            Builder aVar = this;
            aVar.f73866j = scene;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo105405b(boolean z) {
            Builder aVar = this;
            aVar.f73858b = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo105398a(FromType fromType) {
            Intrinsics.checkParameterIsNotNull(fromType, "fromType");
            Builder aVar = this;
            aVar.f73867k = fromType;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo105399a(RequestListener bVar) {
            Builder aVar = this;
            aVar.f73864h = bVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo105400a(String str) {
            Builder aVar = this;
            aVar.f73870n = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo105401a(boolean z) {
            Builder aVar = this;
            aVar.f73857a = z;
            return aVar;
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, RequestListener bVar, Biz biz, Scene scene, FromType fromType, ChatType chatType, String str, String str2, String str3, boolean z3) {
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            Intrinsics.checkParameterIsNotNull(fromType, "fromType");
            Intrinsics.checkParameterIsNotNull(chatType, "chatType");
            this.f73857a = z;
            this.f73858b = z2;
            this.f73859c = i;
            this.f73860d = i2;
            this.f73861e = i3;
            this.f73862f = i4;
            this.f73863g = i5;
            this.f73864h = bVar;
            this.f73865i = biz;
            this.f73866j = scene;
            this.f73867k = fromType;
            this.f73868l = chatType;
            this.f73869m = str;
            this.f73870n = str2;
            this.f73871o = str3;
            this.f73872p = z3;
        }
    }

    private ListenerParams(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, RequestListener bVar, Biz biz, Scene scene, FromType fromType, ChatType chatType, String str, String str2, String str3, boolean z3) {
        this.f73841a = z;
        this.f73842b = z2;
        this.f73843c = i;
        this.f73844d = i2;
        this.f73845e = i3;
        this.f73846f = i4;
        this.f73847g = i5;
        this.f73848h = bVar;
        this.f73849i = biz;
        this.f73850j = scene;
        this.f73851k = fromType;
        this.f73852l = chatType;
        this.f73853m = str;
        this.f73854n = str2;
        this.f73855o = str3;
        this.f73856p = z3;
    }

    public /* synthetic */ ListenerParams(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, RequestListener bVar, Biz biz, Scene scene, FromType fromType, ChatType chatType, String str, String str2, String str3, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, i3, i4, i5, bVar, biz, scene, fromType, chatType, str, str2, str3, z3);
    }
}
