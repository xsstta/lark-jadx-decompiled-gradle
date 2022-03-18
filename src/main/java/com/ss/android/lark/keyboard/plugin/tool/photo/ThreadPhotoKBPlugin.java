package com.ss.android.lark.keyboard.plugin.tool.photo;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.checker.AbsInvalidTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.DialogTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.C69294l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ4\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J \u0010\u0017\u001a\u00020\u00142\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/ThreadPhotoKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin;", "isSecret", "", "isEnableJumpToPost", "showHoverTips", "dependency", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "(ZZZLcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;)V", "getInvalidTip", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/AbsInvalidTip;", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "result", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "invalidList", "", "handleIconClick", "", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "sendPhoto", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.c */
public final class ThreadPhotoKBPlugin extends PhotoKBPlugin {

    /* renamed from: f */
    public static final Companion f104374f = new Companion(null);

    /* renamed from: g */
    private final boolean f104375g;

    /* renamed from: h */
    private final boolean f104376h;

    /* renamed from: i */
    private final boolean f104377i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/ThreadPhotoKBPlugin$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/ThreadPhotoKBPlugin$getInvalidTip$1", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/DialogTip;", "onOk", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.c$b */
    public static final class C41021b extends DialogTip {

        /* renamed from: a */
        final /* synthetic */ ThreadPhotoKBPlugin f104378a;

        /* renamed from: b */
        final /* synthetic */ List f104379b;

        /* renamed from: c */
        final /* synthetic */ List f104380c;

        /* renamed from: d */
        final /* synthetic */ boolean f104381d;

        /* renamed from: e */
        final /* synthetic */ VideoSendChecker.Result f104382e;

        @Override // com.ss.android.lark.keyboard.plugin.tool.checker.DialogTip
        /* renamed from: b */
        public void mo147427b() {
            Log.m165389i("ThreadPhotoKBPlugin", "only send image and valid video");
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f104379b) {
                if (!this.f104380c.contains(((Photo) obj).getPath())) {
                    arrayList.add(obj);
                }
            }
            this.f104378a.mo147810a(CollectionsKt.toMutableList((Collection) arrayList), (List<String>) null, this.f104381d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41021b(ThreadPhotoKBPlugin cVar, List list, List list2, boolean z, VideoSendChecker.Result result, VideoSendChecker.Result result2) {
            super(result2);
            this.f104378a = cVar;
            this.f104379b = list;
            this.f104380c = list2;
            this.f104381d = z;
            this.f104382e = result;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.c$c */
    static final class C41022c extends Lambda implements Function1<Photo, Boolean> {
        public static final C41022c INSTANCE = new C41022c();

        C41022c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Photo photo) {
            return Boolean.valueOf(invoke(photo));
        }

        public final boolean invoke(Photo photo) {
            Intrinsics.checkParameterIsNotNull(photo, "it");
            return photo.isVideo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.c$d */
    static final class C41023d extends Lambda implements Function1<Photo, String> {
        public static final C41023d INSTANCE = new C41023d();

        C41023d() {
            super(1);
        }

        public final String invoke(Photo photo) {
            Intrinsics.checkParameterIsNotNull(photo, "it");
            return photo.getPath();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: b */
    public void mo147817b(IKeyBoardPlugin.ITouchActionNotifier dVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        if (DesktopUtil.m144301a((Context) mo147824m().mo147365B())) {
            C58557a.C58559a o = new C58557a.C58559a().mo198506a(9).mo198526i(false).mo198524g(true).mo198532o(!mo147823l());
            if (DesktopUtil.m144307b() || !mo147823l()) {
                z = true;
            } else {
                z = false;
            }
            C58557a.C58559a j = o.mo198525h(z).mo198529l(true).mo198528k(false).mo198533p(true).mo198508a(new ArrayList<>()).mo198527j(true);
            IPhotoDependency q = mo147828q();
            Intrinsics.checkExpressionValueIsNotNull(j, "builder");
            q.mo122038a(j);
            return;
        }
        IOutInputSupport z2 = mo147824m().mo147381z();
        if (!this.f104376h || !(z2 instanceof TextInputSupportPlugin)) {
            dVar.mo147313a(this);
            return;
        }
        TransationData jVar = new TransationData();
        jVar.mo147176a("param_content", ((TextInputSupportPlugin) z2).mo147266r().getRichText());
        jVar.mo147176a("param_selected_plugin", "photo");
        mo147824m().mo147371a(Reflection.getOrCreateKotlinClass(PostInputSupportPlugin.class), jVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: a */
    public void mo147811a(List<Photo> list, boolean z) {
        boolean z2;
        List<Photo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            List<String> i = C69294l.m266145i(C69294l.m266140e(C69294l.m266131a(CollectionsKt.asSequence(list), (Function1) C41022c.INSTANCE), C41023d.INSTANCE));
            if (i.isEmpty()) {
                Log.m165389i("ThreadPhotoKBPlugin", "no has video, send images");
                mo147810a(list, (List<String>) null, z);
            } else if (this.f104375g) {
                new C25639g(mo147824m().mo147365B()).mo89248g(R.string.Lark_Legacy_ThreadUnSupportTip).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmInfo, (DialogInterface.OnClickListener) null).mo89239c();
            } else {
                new VideoSendChecker().mo147417a(i, mo147814b(list, z));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadPhotoKBPlugin(boolean z, boolean z2, boolean z3, IPhotoDependency iPhotoDependency) {
        super(z, z3, iPhotoDependency);
        Intrinsics.checkParameterIsNotNull(iPhotoDependency, "dependency");
        this.f104375g = z;
        this.f104376h = z2;
        this.f104377i = z3;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin
    /* renamed from: a */
    public AbsInvalidTip mo147800a(List<Photo> list, boolean z, VideoSendChecker.Result result, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(result, "result");
        Intrinsics.checkParameterIsNotNull(list2, "invalidList");
        return new C41021b(this, list, list2, z, result, result);
    }
}
