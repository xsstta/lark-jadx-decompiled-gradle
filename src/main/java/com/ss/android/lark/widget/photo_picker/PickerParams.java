package com.ss.android.lark.widget.photo_picker;

import android.os.Bundle;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u0001:\u0002?@B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010:\u001a\u00020\u000eJ\u0010\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R%\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0018\u00010'j\n\u0012\u0004\u0012\u00020(\u0018\u0001`)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0010R\u0011\u0010.\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0010R\u0011\u00100\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\bR\u0011\u00102\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0010R\u0011\u00104\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\bR\u0011\u00106\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0010R\u0011\u00108\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0010¨\u0006A"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "(Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;)V", "actionType", "", "getActionType", "()I", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "checkedKeepOrigin", "", "getCheckedKeepOrigin", "()Z", "columnNumber", "getColumnNumber", "defaultCamera", "getDefaultCamera", "enablePreview", "getEnablePreview", "filterGif", "getFilterGif", "fromType", "getFromType", "isSecret", "maxDuration", "getMaxDuration", "maxSelectCount", "getMaxSelectCount", "mediaType", "getMediaType", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "selectedPhotos", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "Lkotlin/collections/ArrayList;", "getSelectedPhotos", "()Ljava/util/ArrayList;", "showOrigin", "getShowOrigin", "showSingleSelector", "getShowSingleSelector", "sourceType", "getSourceType", "toastTotalCount", "getToastTotalCount", "totalCount", "getTotalCount", "totalSelectedVideo", "getTotalSelectedVideo", "useLarkCamera", "getUseLarkCamera", "isCameraFront", "toBundle", "Landroid/os/Bundle;", "bundle", "useCamera", "Builder", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.g */
public final class PickerParams {

    /* renamed from: a */
    public static final Companion f144865a = new Companion(null);

    /* renamed from: b */
    private final int f144866b;

    /* renamed from: c */
    private final int f144867c;

    /* renamed from: d */
    private final int f144868d;

    /* renamed from: e */
    private final int f144869e;

    /* renamed from: f */
    private final boolean f144870f;

    /* renamed from: g */
    private final boolean f144871g;

    /* renamed from: h */
    private final boolean f144872h;

    /* renamed from: i */
    private final int f144873i;

    /* renamed from: j */
    private final int f144874j;

    /* renamed from: k */
    private final boolean f144875k;

    /* renamed from: l */
    private final boolean f144876l;

    /* renamed from: m */
    private final boolean f144877m;

    /* renamed from: n */
    private final boolean f144878n;

    /* renamed from: o */
    private final boolean f144879o;

    /* renamed from: p */
    private final int f144880p;

    /* renamed from: q */
    private final boolean f144881q;

    /* renamed from: r */
    private final int f144882r;

    /* renamed from: s */
    private final ArrayList<Photo> f144883s;

    /* renamed from: t */
    private final Biz f144884t;

    /* renamed from: u */
    private final Scene f144885u;

    /* renamed from: v */
    private final int f144886v;

    @JvmStatic
    /* renamed from: a */
    public static final PickerParams m227538a(Function1<? super Builder, Unit> function1) {
        return f144865a.mo198927a(function1);
    }

    @JvmStatic
    /* renamed from: b */
    public static final PickerParams m227539b(Bundle bundle) {
        return f144865a.mo198926a(bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010R\u001a\u00020SR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001a\u0010&\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R.\u00105\u001a\u0016\u0012\u0004\u0012\u000207\u0018\u000106j\n\u0012\u0004\u0012\u000207\u0018\u0001`8X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010\u0014R\u001a\u0010@\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010\u0014R\u001a\u0010C\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001a\u0010F\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R\u001a\u0010I\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001a\u0010L\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0012\"\u0004\bN\u0010\u0014R\u001a\u0010O\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0012\"\u0004\bQ\u0010\u0014¨\u0006T"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "", "()V", "actionType", "", "getActionType", "()I", "setActionType", "(I)V", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "setBiz", "(Lcom/ss/android/lark/appreciablelib/Biz;)V", "checkedKeepOrigin", "", "getCheckedKeepOrigin", "()Z", "setCheckedKeepOrigin", "(Z)V", "columnNumber", "getColumnNumber", "setColumnNumber", "defaultCamera", "getDefaultCamera", "setDefaultCamera", "enablePreview", "getEnablePreview", "setEnablePreview", "filterGif", "getFilterGif", "setFilterGif", "fromType", "getFromType", "setFromType", "isSecret", "setSecret", "maxDuration", "getMaxDuration", "setMaxDuration", "maxSelectCount", "getMaxSelectCount", "setMaxSelectCount", "mediaType", "getMediaType", "setMediaType", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "setScene", "(Lcom/ss/android/lark/appreciablelib/Scene;)V", "selectedPhotos", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "Lkotlin/collections/ArrayList;", "getSelectedPhotos", "()Ljava/util/ArrayList;", "setSelectedPhotos", "(Ljava/util/ArrayList;)V", "showOrigin", "getShowOrigin", "setShowOrigin", "showSingleSelector", "getShowSingleSelector", "setShowSingleSelector", "sourceType", "getSourceType", "setSourceType", "toastTotalCount", "getToastTotalCount", "setToastTotalCount", "totalCount", "getTotalCount", "setTotalCount", "totalSelectedVideo", "getTotalSelectedVideo", "setTotalSelectedVideo", "useLarkCamera", "getUseLarkCamera", "setUseLarkCamera", "build", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.g$a */
    public static final class Builder {

        /* renamed from: a */
        private int f144887a;

        /* renamed from: b */
        private int f144888b;

        /* renamed from: c */
        private int f144889c = 9;

        /* renamed from: d */
        private int f144890d = -1;

        /* renamed from: e */
        private boolean f144891e;

        /* renamed from: f */
        private boolean f144892f;

        /* renamed from: g */
        private boolean f144893g;

        /* renamed from: h */
        private int f144894h = 15000;

        /* renamed from: i */
        private int f144895i;

        /* renamed from: j */
        private boolean f144896j = true;

        /* renamed from: k */
        private boolean f144897k;

        /* renamed from: l */
        private boolean f144898l;

        /* renamed from: m */
        private boolean f144899m;

        /* renamed from: n */
        private boolean f144900n = true;

        /* renamed from: o */
        private int f144901o = 4;

        /* renamed from: p */
        private boolean f144902p;

        /* renamed from: q */
        private int f144903q;

        /* renamed from: r */
        private ArrayList<Photo> f144904r = new ArrayList<>();

        /* renamed from: s */
        private Biz f144905s;

        /* renamed from: t */
        private Scene f144906t;

        /* renamed from: u */
        private int f144907u;

        /* renamed from: a */
        public final int mo198883a() {
            return this.f144887a;
        }

        /* renamed from: b */
        public final int mo198889b() {
            return this.f144888b;
        }

        /* renamed from: c */
        public final int mo198892c() {
            return this.f144889c;
        }

        /* renamed from: d */
        public final int mo198895d() {
            return this.f144890d;
        }

        /* renamed from: h */
        public final int mo198907h() {
            return this.f144894h;
        }

        /* renamed from: i */
        public final int mo198910i() {
            return this.f144895i;
        }

        /* renamed from: j */
        public final boolean mo198913j() {
            return this.f144896j;
        }

        /* renamed from: k */
        public final boolean mo198914k() {
            return this.f144897k;
        }

        /* renamed from: l */
        public final boolean mo198915l() {
            return this.f144898l;
        }

        /* renamed from: m */
        public final boolean mo198916m() {
            return this.f144899m;
        }

        /* renamed from: n */
        public final boolean mo198917n() {
            return this.f144900n;
        }

        /* renamed from: o */
        public final int mo198918o() {
            return this.f144901o;
        }

        /* renamed from: p */
        public final boolean mo198919p() {
            return this.f144902p;
        }

        /* renamed from: q */
        public final int mo198920q() {
            return this.f144903q;
        }

        /* renamed from: r */
        public final ArrayList<Photo> mo198921r() {
            return this.f144904r;
        }

        /* renamed from: s */
        public final Biz mo198922s() {
            return this.f144905s;
        }

        /* renamed from: t */
        public final Scene mo198923t() {
            return this.f144906t;
        }

        /* renamed from: u */
        public final int mo198924u() {
            return this.f144907u;
        }

        /* renamed from: v */
        public final PickerParams mo198925v() {
            return new PickerParams(this, null);
        }

        /* renamed from: e */
        public final boolean mo198900e() {
            return this.f144891e;
        }

        /* renamed from: f */
        public final boolean mo198903f() {
            return this.f144892f;
        }

        /* renamed from: g */
        public final boolean mo198906g() {
            return this.f144893g;
        }

        /* renamed from: e */
        public final void mo198898e(int i) {
            this.f144894h = i;
        }

        /* renamed from: f */
        public final void mo198901f(int i) {
            this.f144895i = i;
        }

        /* renamed from: g */
        public final void mo198904g(int i) {
            this.f144901o = i;
        }

        /* renamed from: a */
        public final void mo198884a(int i) {
            this.f144887a = i;
        }

        /* renamed from: b */
        public final void mo198890b(int i) {
            this.f144888b = i;
        }

        /* renamed from: c */
        public final void mo198893c(int i) {
            this.f144889c = i;
        }

        /* renamed from: d */
        public final void mo198896d(int i) {
            this.f144890d = i;
        }

        /* renamed from: e */
        public final void mo198899e(boolean z) {
            this.f144897k = z;
        }

        /* renamed from: f */
        public final void mo198902f(boolean z) {
            this.f144898l = z;
        }

        /* renamed from: g */
        public final void mo198905g(boolean z) {
            this.f144899m = z;
        }

        /* renamed from: h */
        public final void mo198908h(int i) {
            this.f144903q = i;
        }

        /* renamed from: i */
        public final void mo198911i(int i) {
            this.f144907u = i;
        }

        /* renamed from: a */
        public final void mo198885a(Biz biz) {
            this.f144905s = biz;
        }

        /* renamed from: b */
        public final void mo198891b(boolean z) {
            this.f144892f = z;
        }

        /* renamed from: c */
        public final void mo198894c(boolean z) {
            this.f144893g = z;
        }

        /* renamed from: d */
        public final void mo198897d(boolean z) {
            this.f144896j = z;
        }

        /* renamed from: h */
        public final void mo198909h(boolean z) {
            this.f144900n = z;
        }

        /* renamed from: i */
        public final void mo198912i(boolean z) {
            this.f144902p = z;
        }

        /* renamed from: a */
        public final void mo198886a(Scene scene) {
            this.f144906t = scene;
        }

        /* renamed from: a */
        public final void mo198887a(ArrayList<Photo> arrayList) {
            this.f144904r = arrayList;
        }

        /* renamed from: a */
        public final void mo198888a(boolean z) {
            this.f144891e = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010+\u001a\u00020,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/PickerParams$Companion;", "", "()V", "ACTION_TYPE_AVATAR", "", "ACTION_TYPE_CONFIRM", "ACTION_TYPE_SEND", "ACTION_TYPE_UPLOAD", "CAMERA_BACK", "CAMERA_FRONT", "KEY_ACTION_TYPE", "", "KEY_BIZ", "KEY_CAMERA", "KEY_CHECKED_KEEP_ORIGIN", "KEY_COLUMN_NUMBER", "KEY_ENABLE_PREVIEW", "KEY_FILTER_GIF", "KEY_FROM_TYPE", "KEY_IS_SECRET", "KEY_MAX_DURATION", "KEY_MAX_SELECT_COUNT", "KEY_MEDIA", "KEY_SCENE", "KEY_SELECT_PHOTOS", "KEY_SHOW_ORIGIN", "KEY_SHOW_SINGLE_SELECTOR", "KEY_SOURCE", "KEY_TOAST_TOTAL_COUNT", "KEY_TOTAL_MAX_COUNT", "KEY_TOTAL_SELECTED_VIDEO", "KEY_USE_LARK_CAMERA", "MEDIA_ALL", "MEDIA_ALL_EXCLUSIVE", "MEDIA_IMAGE", "MEDIA_VIDEO", "SCENE_CHAT", "SCENE_FEED", "SCENE_MOMENTS", "SCENE_UNKNOWN", "SOURCE_ALBUM", "SOURCE_ALL", "SOURCE_CAMERA", "build", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "block", "Lkotlin/Function1;", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "", "Lkotlin/ExtensionFunctionType;", "fromBundle", "bundle", "Landroid/os/Bundle;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.g$b */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.g$b$a */
        public static final class C58663a extends Lambda implements Function1<Builder, Unit> {
            final /* synthetic */ Bundle $bundle;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C58663a(Bundle bundle) {
                super(1);
                this.$bundle = bundle;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Builder aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(Builder aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                aVar.mo198884a(this.$bundle.getInt("sourceType"));
                aVar.mo198890b(this.$bundle.getInt("mediaType"));
                aVar.mo198893c(this.$bundle.getInt("max_select_count"));
                aVar.mo198896d(this.$bundle.getInt("total_max_count"));
                aVar.mo198888a(this.$bundle.getBoolean("total_selected_video"));
                aVar.mo198891b(this.$bundle.getBoolean("show_single_selector"));
                aVar.mo198894c(this.$bundle.getBoolean("toast_total_count"));
                aVar.mo198898e(this.$bundle.getInt("maxDuration"));
                aVar.mo198901f(this.$bundle.getInt("defaultCamera"));
                aVar.mo198897d(this.$bundle.getBoolean("useLarkCamera"));
                aVar.mo198899e(this.$bundle.getBoolean("filterGif"));
                aVar.mo198902f(this.$bundle.getBoolean("showOrigin"));
                aVar.mo198905g(this.$bundle.getBoolean("keepOrigin"));
                aVar.mo198909h(this.$bundle.getBoolean("enablePreview"));
                aVar.mo198904g(this.$bundle.getInt("columnNumber"));
                aVar.mo198912i(this.$bundle.getBoolean("isSecret"));
                aVar.mo198908h(this.$bundle.getInt("actionType"));
                Serializable serializable = this.$bundle.getSerializable("selectPhotos");
                if (serializable != null) {
                    aVar.mo198887a((ArrayList) serializable);
                }
                aVar.mo198885a((Biz) this.$bundle.getSerializable("biz"));
                aVar.mo198886a((Scene) this.$bundle.getSerializable("scene"));
                aVar.mo198911i(this.$bundle.getInt("from_type", 0));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final PickerParams mo198926a(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            return mo198927a(new C58663a(bundle));
        }

        @JvmStatic
        /* renamed from: a */
        public final PickerParams mo198927a(Function1<? super Builder, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "block");
            Builder aVar = new Builder();
            function1.invoke(aVar);
            return aVar.mo198925v();
        }
    }

    /* renamed from: a */
    public final int mo198863a() {
        return this.f144866b;
    }

    /* renamed from: b */
    public final int mo198865b() {
        return this.f144867c;
    }

    /* renamed from: c */
    public final int mo198866c() {
        return this.f144868d;
    }

    /* renamed from: d */
    public final int mo198867d() {
        return this.f144869e;
    }

    /* renamed from: e */
    public final boolean mo198868e() {
        return this.f144870f;
    }

    /* renamed from: f */
    public final boolean mo198869f() {
        return this.f144871g;
    }

    /* renamed from: g */
    public final boolean mo198870g() {
        return this.f144872h;
    }

    /* renamed from: h */
    public final int mo198871h() {
        return this.f144873i;
    }

    /* renamed from: i */
    public final int mo198872i() {
        return this.f144874j;
    }

    /* renamed from: j */
    public final boolean mo198873j() {
        return this.f144875k;
    }

    /* renamed from: k */
    public final boolean mo198874k() {
        return this.f144876l;
    }

    /* renamed from: l */
    public final boolean mo198875l() {
        return this.f144877m;
    }

    /* renamed from: m */
    public final boolean mo198876m() {
        return this.f144878n;
    }

    /* renamed from: n */
    public final boolean mo198877n() {
        return this.f144879o;
    }

    /* renamed from: o */
    public final int mo198878o() {
        return this.f144880p;
    }

    /* renamed from: p */
    public final boolean mo198879p() {
        return this.f144881q;
    }

    /* renamed from: q */
    public final int mo198880q() {
        return this.f144882r;
    }

    /* renamed from: r */
    public final ArrayList<Photo> mo198881r() {
        return this.f144883s;
    }

    /* renamed from: s */
    public final boolean mo198882s() {
        if (this.f144866b >= 1) {
            return true;
        }
        return false;
    }

    private PickerParams(Builder aVar) {
        this.f144866b = aVar.mo198883a();
        this.f144867c = aVar.mo198889b();
        this.f144868d = aVar.mo198892c();
        this.f144869e = aVar.mo198895d();
        this.f144870f = aVar.mo198900e();
        this.f144871g = aVar.mo198903f();
        this.f144872h = aVar.mo198906g();
        this.f144873i = aVar.mo198907h();
        this.f144874j = aVar.mo198910i();
        this.f144875k = aVar.mo198913j();
        this.f144876l = aVar.mo198914k();
        this.f144877m = aVar.mo198915l();
        this.f144878n = aVar.mo198916m();
        this.f144879o = aVar.mo198917n();
        this.f144880p = aVar.mo198918o();
        this.f144881q = aVar.mo198919p();
        this.f144882r = aVar.mo198920q();
        this.f144883s = aVar.mo198921r();
        this.f144884t = aVar.mo198922s();
        this.f144885u = aVar.mo198923t();
        this.f144886v = aVar.mo198924u();
    }

    /* renamed from: a */
    public final Bundle mo198864a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        bundle.putInt("mediaType", this.f144867c);
        bundle.putInt("sourceType", this.f144866b);
        bundle.putInt("max_select_count", this.f144868d);
        bundle.putInt("total_max_count", this.f144869e);
        bundle.putBoolean("total_selected_video", this.f144870f);
        bundle.putBoolean("show_single_selector", this.f144871g);
        bundle.putBoolean("toast_total_count", this.f144872h);
        bundle.putInt("maxDuration", this.f144873i);
        bundle.putInt("defaultCamera", this.f144874j);
        bundle.putBoolean("useLarkCamera", this.f144875k);
        bundle.putBoolean("filterGif", this.f144876l);
        bundle.putBoolean("showOrigin", this.f144877m);
        bundle.putBoolean("keepOrigin", this.f144878n);
        bundle.putBoolean("enablePreview", this.f144879o);
        bundle.putInt("columnNumber", this.f144880p);
        bundle.putBoolean("isSecret", this.f144881q);
        bundle.putInt("actionType", this.f144882r);
        ArrayList<Photo> arrayList = this.f144883s;
        if (arrayList != null) {
            bundle.putSerializable("selectPhotos", arrayList);
        }
        bundle.putSerializable("biz", this.f144884t);
        bundle.putSerializable("scene", this.f144885u);
        bundle.putInt("from_type", this.f144886v);
        return bundle;
    }

    public /* synthetic */ PickerParams(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
