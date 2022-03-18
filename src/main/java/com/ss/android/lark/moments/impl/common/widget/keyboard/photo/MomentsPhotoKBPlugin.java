package com.ss.android.lark.moments.impl.common.widget.keyboard.photo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor;
import com.ss.android.lark.widget.photo_picker.statistics.PerfImageUploadMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0007H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J,\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010!\u001a\u00020\u000fH\u0016J$\u0010\"\u001a\u00020\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010%\u001a\u00020\u000fH\u0002J0\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0002J\u001c\u0010.\u001a\u00020\u000f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/MomentsPhotoKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin;", "listener", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/OnPhotoUploadListener;", "dependency", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/IMomentsPhotoDependency;", "isSingleLimit", "", "(Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/OnPhotoUploadListener;Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/IMomentsPhotoDependency;Z)V", "getListener", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/OnPhotoUploadListener;", "maxCount", "", "cameraCanRecordVideo", "handleIconClick", "", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "insertPhotoToInput", "photoPaths", "", "", "isKeepOriginPhoto", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "onCreateIcon", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onCreatePluginPanel", "onRestart", "onSelectOverflow", "onStart", "onVideoExtract", "videoInfos", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "setPanelParam", "showInvalidImageToast", "context", "Landroid/content/Context;", "overLimitCount", "strictSizeLimit", "", "strictWidthLimit", "strictHeightLimit", "uploadPhotos", "validPhotos", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b */
public final class MomentsPhotoKBPlugin extends PhotoKBPlugin {

    /* renamed from: f */
    public static final Companion f119384f = new Companion(null);

    /* renamed from: g */
    private int f119385g;

    /* renamed from: h */
    private final OnPhotoUploadListener f119386h;

    /* renamed from: i */
    private boolean f119387i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/MomentsPhotoKBPlugin$Companion;", "", "()V", "REQUEST_CODE", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r */
    public final OnPhotoUploadListener mo166338r() {
        return this.f119386h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: f */
    public boolean mo147822f() {
        return this.f119386h.mo166349d();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin, com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        m187460s();
        super.mo147303g();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin, com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        m187460s();
        super.mo147304h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/photo/MomentsPhotoKBPlugin$uploadPhotos$2", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI$IUploadCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onUpdateProgress", "total", "", "curPos", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b$d */
    public static final class C47328d implements PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback {

        /* renamed from: a */
        final /* synthetic */ MomentsPhotoKBPlugin f119393a;

        /* renamed from: b */
        final /* synthetic */ boolean f119394b;

        /* renamed from: c */
        final /* synthetic */ List f119395c;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147836a() {
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public void onUpdateProgress(long j, int i) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b$d$b */
        static final class RunnableC47330b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47328d f119397a;

            /* renamed from: b */
            final /* synthetic */ IPhotoDependency.Image f119398b;

            RunnableC47330b(C47328d dVar, IPhotoDependency.Image image) {
                this.f119397a = dVar;
                this.f119398b = image;
            }

            public final void run() {
                this.f119397a.f119393a.mo166338r().mo166344a(this.f119398b, this.f119397a.f119394b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b$d$a */
        static final class RunnableC47329a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47328d f119396a;

            RunnableC47329a(C47328d dVar) {
                this.f119396a = dVar;
            }

            public final void run() {
                OnPhotoUploadListener r = this.f119396a.f119393a.mo166338r();
                List<Photo> list = this.f119396a.f119395c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Photo photo : list) {
                    arrayList.add(photo.getPath());
                }
                r.mo166345a(arrayList);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147837a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            PerfImageUploadMonitor.f145430a.mo199315b();
            UICallbackExecutor.execute(new RunnableC47329a(this));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147838a(IPhotoDependency.Image image) {
            Intrinsics.checkParameterIsNotNull(image, "image");
            PerfImageUploadMonitor cVar = PerfImageUploadMonitor.f145430a;
            PerfImageUploadMonitor.m228143a(cVar, image.getWidth(), image.getHeight(), 0, 4, (Object) null);
            PerfImageUploadMonitor.m228145b(cVar, image.getWidth(), image.getHeight(), 0, 4, null);
            cVar.mo199309a();
            UICallbackExecutor.execute(new RunnableC47330b(this, image));
        }

        C47328d(MomentsPhotoKBPlugin bVar, boolean z, List list) {
            this.f119393a = bVar;
            this.f119394b = z;
            this.f119395c = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b$b */
    static final class RunnableC47326b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPhotoKBPlugin f119388a;

        /* renamed from: b */
        final /* synthetic */ List f119389b;

        /* renamed from: c */
        final /* synthetic */ boolean f119390c;

        RunnableC47326b(MomentsPhotoKBPlugin bVar, List list, boolean z) {
            this.f119388a = bVar;
            this.f119389b = list;
            this.f119390c = z;
        }

        public final void run() {
            this.f119388a.mo166338r().mo166346a(this.f119389b, this.f119390c);
            if (this.f119388a.mo147828q() instanceof IMomentsPhotoDependency) {
                this.f119388a.mo147824m().mo147375j();
                ((IMomentsPhotoDependency) this.f119388a.mo147828q()).mo166335a(true);
                ((IMomentsPhotoDependency) this.f119388a.mo147828q()).mo166336c();
            }
        }
    }

    /* renamed from: s */
    private final void m187460s() {
        boolean z;
        int i;
        int a = this.f119386h.mo166343a();
        LarkPhotoPickerView b = mo147815b();
        if (b != null) {
            b.setMaxCount(a);
        }
        LarkPhotoPickerView b2 = mo147815b();
        if (b2 != null) {
            if (this.f119387i) {
                i = 1;
            } else {
                i = 9;
            }
            b2.setTotalMaxCount(i);
        }
        LarkPhotoPickerView b3 = mo147815b();
        boolean z2 = false;
        if (b3 != null) {
            if (a <= 0 || this.f119386h.mo166347b()) {
                z = false;
            } else {
                z = true;
            }
            b3.setCameraBtnEnable(z);
        }
        LarkPhotoPickerView b4 = mo147815b();
        if (b4 != null) {
            if (!this.f119387i && !this.f119386h.mo166348c()) {
                z2 = true;
            }
            b4.setShowVideo(z2);
        }
        LarkPhotoPickerView b5 = mo147815b();
        if (b5 != null) {
            b5.setSingleShowSelector(true);
        }
        LarkPhotoPickerView b6 = mo147815b();
        if (b6 != null) {
            b6.setToastTotalMaxCount(true);
        }
        LarkPhotoPickerView b7 = mo147815b();
        if (b7 != null) {
            b7.setTotalHasVideo(this.f119386h.mo166347b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/moments/impl/common/widget/keyboard/photo/MomentsPhotoKBPlugin$onCreateIcon$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.b$c */
    static final class View$OnClickListenerC47327c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPhotoKBPlugin f119391a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f119392b;

        View$OnClickListenerC47327c(MomentsPhotoKBPlugin bVar, IKeyBoardPlugin.ITouchActionNotifier dVar) {
            this.f119391a = bVar;
            this.f119392b = dVar;
        }

        public final void onClick(View view) {
            PerfGalleryLoadMonitor.f145397a.mo199287a(Scene.Moments, 1);
            this.f119391a.mo147804a(this.f119392b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: b */
    public void mo147817b(IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        dVar.mo147313a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: a */
    public void mo147801a(int i) {
        LKUIToast.show(mo147824m().mo147365B(), UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerOverMaxCountTips, "max_count", String.valueOf(this.f119385g)));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin, com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = super.mo147287a(viewGroup);
        LarkPhotoPickerView b = mo147815b();
        if (b != null) {
            b.setMaxCount(this.f119385g);
        }
        LarkPhotoPickerView b2 = mo147815b();
        if (b2 != null) {
            if (this.f119387i) {
                i = 1;
            } else {
                i = 9;
            }
            b2.setTotalMaxCount(i);
        }
        LarkPhotoPickerView b3 = mo147815b();
        if (b3 != null) {
            if (this.f119387i || this.f119386h.mo166348c()) {
                z = false;
            } else {
                z = true;
            }
            b3.setShowVideo(z);
        }
        LarkPhotoPickerView b4 = mo147815b();
        if (b4 != null) {
            b4.setSingleShowSelector(true);
        }
        LarkPhotoPickerView b5 = mo147815b();
        if (b5 != null) {
            b5.setToastTotalMaxCount(true);
        }
        LarkPhotoPickerView b6 = mo147815b();
        if (b6 != null) {
            b6.setTotalHasVideo(this.f119386h.mo166347b());
        }
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin, com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View a = mo147798a(mo147824m().mo147365B());
        a.setActivated(mo147827p());
        a.setOnClickListener(new View$OnClickListenerC47327c(this, dVar));
        mo147802a(a);
        return mo147797a();
    }

    /* renamed from: c */
    public final void mo166337c(List<Photo> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "validPhotos");
        PhotoKBPlugin.IOnUploadPhotoAPI e = mo147820e();
        List<Photo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPath());
        }
        e.mo147835a(arrayList, z, new C47328d(this, z, list));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: a */
    public void mo147809a(List<IPhotoDependency.VideoInfo> list, List<Photo> list2) {
        Intrinsics.checkParameterIsNotNull(list, "videoInfos");
        Intrinsics.checkParameterIsNotNull(list2, "photos");
        if (mo147828q() instanceof IMomentsPhotoDependency) {
            ((IMomentsPhotoDependency) mo147828q()).mo166334a(list.get(0), list2.get(0));
            mo147824m().mo147375j();
            ((IMomentsPhotoDependency) mo147828q()).mo166335a(true);
            ((IMomentsPhotoDependency) mo147828q()).mo166336c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPhotoKBPlugin(OnPhotoUploadListener cVar, IMomentsPhotoDependency aVar, boolean z) {
        super(false, false, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f119386h = cVar;
        this.f119387i = z;
        this.f119385g = 9;
        if (z) {
            this.f119385g = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo147812a(java.util.List<java.lang.String> r23, boolean r24, java.util.List<com.ss.android.lark.widget.photo_picker.entity.Photo> r25) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.common.widget.keyboard.photo.MomentsPhotoKBPlugin.mo147812a(java.util.List, boolean, java.util.List):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MomentsPhotoKBPlugin(OnPhotoUploadListener cVar, IMomentsPhotoDependency aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, (i & 4) != 0 ? false : z);
    }

    /* renamed from: a */
    private final void m187459a(Context context, int i, long j, int i2, int i3) {
        mo147824m().mo147375j();
        if (mo147828q() instanceof IMomentsPhotoDependency) {
            ((IMomentsPhotoDependency) mo147828q()).mo166335a(true);
            ((IMomentsPhotoDependency) mo147828q()).mo166336c();
        }
        if (i > 0) {
            int i4 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
            if (i4 != 0 && i2 != Integer.MAX_VALUE) {
                String quantityString = UIHelper.getQuantityString(R.plurals.Moments_UploadImage_NumPhotosSizeOrResolutionOverNum_Toast, i);
                LKUIToast.loadFail(context, UIHelper.mustacheFormat(quantityString, MapsKt.mapOf(TuplesKt.to("Size", String.valueOf(j)), TuplesKt.to("Resolution", i2 + " * " + i3))));
            } else if (i4 != 0) {
                LKUIToast.loadFail(context, UIHelper.mustacheFormat(UIHelper.getQuantityString(R.plurals.Moments_UploadImage_NumPhotosSizeOverNum_Toast, i), "Num", String.valueOf(j)));
            } else if (i2 != Integer.MAX_VALUE) {
                String quantityString2 = UIHelper.getQuantityString(R.plurals.Moments_UploadImage_NumPhotosResolutionOverNum_Toast, i);
                LKUIToast.loadFail(context, UIHelper.mustacheFormat(quantityString2, "Resolution", i2 + " * " + i3));
            }
        }
    }
}
