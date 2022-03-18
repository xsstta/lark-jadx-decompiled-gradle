package com.ss.android.lark.keyboard.plugin.tool.photo;

import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoPickerParam implements Serializable {
    private final int columnCount;
    private final boolean ensureSelection;
    private final boolean fullScreen;
    private final List<Photo> imagesUri;
    private final boolean isFaceFront;
    private final boolean isKeepOrigin;
    private final boolean isSend;
    private final boolean isShown;
    private final int onlyCameraType;
    private final int photoCount;
    private final boolean previewEnabled;
    private final boolean receiveCancelEvent;
    private final boolean showCamera;
    private final boolean showGif;
    private final boolean showVideo;
    private boolean singleShowSelector;
    private final boolean standAloneWindow;
    private boolean toastTotalMaxCount;
    private boolean totalHasVideo;
    private final int totalMaxCount;
    private final int type;
    private final boolean useLarkCamera;

    public int getColumnCount() {
        return this.columnCount;
    }

    public List<Photo> getImagesUri() {
        return this.imagesUri;
    }

    public int getOnlyCameraType() {
        return this.onlyCameraType;
    }

    public int getPhotoCount() {
        return this.photoCount;
    }

    public int getTotalCount() {
        return this.totalMaxCount;
    }

    public int getType() {
        return this.type;
    }

    public boolean isEnsureSelection() {
        return this.ensureSelection;
    }

    public boolean isFaceFront() {
        return this.isFaceFront;
    }

    public boolean isFullScreen() {
        return this.fullScreen;
    }

    public boolean isKeepOrigin() {
        return this.isKeepOrigin;
    }

    public boolean isPreviewEnabled() {
        return this.previewEnabled;
    }

    public boolean isReceiveCancelEvent() {
        return this.receiveCancelEvent;
    }

    public boolean isSend() {
        return this.isSend;
    }

    public boolean isShowCamera() {
        return this.showCamera;
    }

    public boolean isShowGif() {
        return this.showGif;
    }

    public boolean isShowVideo() {
        return this.showVideo;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public boolean isSingleShowSelector() {
        return this.singleShowSelector;
    }

    public boolean isStandAloneWindow() {
        return this.standAloneWindow;
    }

    public boolean isToastTotalMaxCount() {
        return this.toastTotalMaxCount;
    }

    public boolean isTotalHasVideo() {
        return this.totalHasVideo;
    }

    public boolean isUseLarkCamera() {
        return this.useLarkCamera;
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.PhotoPickerParam$a */
    public static class C40996a {

        /* renamed from: a */
        private boolean f104279a;

        /* renamed from: b */
        private boolean f104280b;

        /* renamed from: c */
        private boolean f104281c = true;

        /* renamed from: d */
        private int f104282d = 9;

        /* renamed from: e */
        private int f104283e = -1;

        /* renamed from: f */
        private int f104284f = 4;

        /* renamed from: g */
        private boolean f104285g;

        /* renamed from: h */
        private boolean f104286h;

        /* renamed from: i */
        private boolean f104287i;

        /* renamed from: j */
        private boolean f104288j;

        /* renamed from: k */
        private boolean f104289k;

        /* renamed from: l */
        private boolean f104290l = true;

        /* renamed from: m */
        private List<Photo> f104291m = new ArrayList();

        /* renamed from: n */
        private boolean f104292n = false;

        /* renamed from: o */
        private boolean f104293o = true;

        /* renamed from: p */
        private int f104294p = 0;

        /* renamed from: q */
        private int f104295q = 1;

        /* renamed from: r */
        private boolean f104296r = false;

        /* renamed from: s */
        private boolean f104297s = true;

        /* renamed from: t */
        private boolean f104298t = true;

        /* renamed from: u */
        private boolean f104299u = false;

        /* renamed from: v */
        private boolean f104300v = false;

        /* renamed from: a */
        public PhotoPickerParam mo147763a() {
            return new PhotoPickerParam(this.f104279a, this.f104280b, this.f104281c, this.f104282d, this.f104283e, this.f104284f, this.f104285g, this.f104286h, this.f104290l, this.f104291m, this.f104292n, this.f104293o, this.f104294p, this.f104295q, this.f104296r, this.f104297s, this.f104298t, this.f104299u, this.f104300v, this.f104287i, this.f104288j, this.f104289k);
        }

        /* renamed from: a */
        public C40996a mo147760a(int i) {
            this.f104282d = i;
            return this;
        }

        /* renamed from: b */
        public C40996a mo147764b(int i) {
            this.f104283e = i;
            return this;
        }

        /* renamed from: c */
        public C40996a mo147766c(boolean z) {
            this.f104287i = z;
            return this;
        }

        /* renamed from: d */
        public C40996a mo147767d(boolean z) {
            this.f104288j = z;
            return this;
        }

        /* renamed from: e */
        public C40996a mo147768e(boolean z) {
            this.f104289k = z;
            return this;
        }

        /* renamed from: f */
        public C40996a mo147769f(boolean z) {
            this.f104290l = z;
            return this;
        }

        /* renamed from: g */
        public C40996a mo147770g(boolean z) {
            this.f104292n = z;
            return this;
        }

        /* renamed from: h */
        public C40996a mo147771h(boolean z) {
            this.f104293o = z;
            return this;
        }

        /* renamed from: i */
        public C40996a mo147772i(boolean z) {
            this.f104298t = z;
            return this;
        }

        /* renamed from: j */
        public C40996a mo147773j(boolean z) {
            this.f104299u = z;
            return this;
        }

        /* renamed from: a */
        public C40996a mo147761a(List<Photo> list) {
            this.f104291m = list;
            return this;
        }

        /* renamed from: b */
        public C40996a mo147765b(boolean z) {
            this.f104286h = z;
            return this;
        }

        /* renamed from: a */
        public C40996a mo147762a(boolean z) {
            this.f104285g = z;
            return this;
        }
    }

    private PhotoPickerParam(boolean z, boolean z2, boolean z3, int i, int i2, int i3, boolean z4, boolean z5, boolean z6, List<Photo> list, boolean z7, boolean z8, int i4, int i5, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.isFaceFront = z;
        this.useLarkCamera = z2;
        this.ensureSelection = z3;
        this.photoCount = i;
        this.totalMaxCount = i2;
        this.columnCount = i3;
        this.showGif = z4;
        this.showVideo = z5;
        this.showCamera = z6;
        this.imagesUri = list;
        this.isKeepOrigin = z7;
        this.previewEnabled = z8;
        this.onlyCameraType = i4;
        this.type = i5;
        this.fullScreen = z9;
        this.isShown = z10;
        this.isSend = z11;
        this.receiveCancelEvent = z12;
        this.standAloneWindow = z13;
        this.totalHasVideo = z14;
        this.singleShowSelector = z15;
        this.toastTotalMaxCount = z16;
    }
}
