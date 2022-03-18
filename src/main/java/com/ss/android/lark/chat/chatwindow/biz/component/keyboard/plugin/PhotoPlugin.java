package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import android.content.Context;
import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoAaKBPluginCompat;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/PhotoPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "darkStyle", "", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(ZLcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "item", "getItem", "()Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "setItem", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "createPluginImpl", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin;", "getName", "", "getPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.f */
public final class PhotoPlugin implements IKeyboardCreator.IPlugin<IKeyBoardPlugin> {

    /* renamed from: a */
    private IKeyBoardPlugin f85023a;

    /* renamed from: b */
    private final boolean f85024b;

    /* renamed from: c */
    private final IKeyboardCreator.PluginContext f85025c;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "photo";
    }

    /* renamed from: e */
    public final IKeyboardCreator.PluginContext mo122035e() {
        return this.f85025c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\r2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016H\u0016J(\u0010\u0017\u001a\u00020\r2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH\u0016J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¨\u0006#"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/PhotoPlugin$createPluginImpl$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "extractVideoFrame", "Lio/reactivex/Observable;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "isEnablePostSendVideo", "", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "sendFile", "fileList", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "sendImage", "photoPaths", "isKeepOriginPic", "sendVideo", "videoPaths", "", "uploadEncryptImage", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.f$a */
    public static final class C33029a implements IPhotoDependency {

        /* renamed from: a */
        final /* synthetic */ PhotoPlugin f85026a;

        /* renamed from: b */
        final /* synthetic */ Context f85027b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public boolean mo122042a() {
            return true;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public boolean mo122044b() {
            return IPhotoDependency.C40977a.m162428a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<Map<String, IPhotoDependency.FrameInfo>> mo122036a(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoInfos");
            Observable<Map<String, IPhotoDependency.FrameInfo>> a = C34278w.m132953a().mo126826a(list);
            Intrinsics.checkExpressionValueIsNotNull(a, "PostService.inst().extra…deoFirstFrame(videoInfos)");
            return a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "image", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.f$a$a */
        static final class C33030a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C33030a f85028a = new C33030a();

            C33030a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(Image image) {
                Intrinsics.checkParameterIsNotNull(image, "image");
                List<String> urls = image.getUrls();
                Intrinsics.checkExpressionValueIsNotNull(urls, "image.urls");
                int width = image.getWidth();
                int height = image.getHeight();
                String token = image.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "image.token");
                return new IPhotoDependency.Image(urls, width, height, token);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122038a(C58557a.C58559a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            aVar.mo198512a(this.f85027b, this.f85026a.mo122035e().mo122076a(), 233);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoPaths");
            KeyBoard b = this.f85026a.mo122035e().mo122077b();
            if (b != null) {
                List<IPhotoDependency.VideoInfo> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (T t : list2) {
                    Photo photo = new Photo();
                    photo.setPath(t.getPath());
                    photo.setMimeType(t.getMimeType());
                    photo.setSize(t.getSize());
                    photo.setDuration(t.getDuration());
                    photo.setCompressPath(t.getCompressPath());
                    arrayList.add(photo);
                }
                ArrayList arrayList2 = arrayList;
                IKeyboardViewModel e = this.f85026a.mo122035e().mo122080e();
                if (e != null) {
                    e.sendMediaMsg(arrayList2, b.mo146836q(), b.mo146837r());
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122039a(C58633e.C58634a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            aVar.mo198694a(this.f85027b, this.f85026a.mo122035e().mo122076a(), 911);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122040a(ArrayList<File> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "fileList");
            IKeyboardViewModel e = this.f85026a.mo122035e().mo122080e();
            if (e != null) {
                e.sendFileMsg(arrayList);
            }
        }

        C33029a(PhotoPlugin fVar, Context context) {
            this.f85026a = fVar;
            this.f85027b = context;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122041a(ArrayList<String> arrayList, boolean z) {
            IKeyboardViewModel e;
            Intrinsics.checkParameterIsNotNull(arrayList, "photoPaths");
            KeyBoard b = this.f85026a.mo122035e().mo122077b();
            if (b != null && (e = this.f85026a.mo122035e().mo122080e()) != null) {
                e.sendImageMsg(arrayList, z, b.mo146836q(), b.mo146837r());
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Observable<R> map = C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Chat).map(C33030a.f85028a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …ge.height, image.token) }");
            return map;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return IKeyboardCreator.IPlugin.C33037a.m127748a(this);
    }

    /* renamed from: b */
    public IKeyBoardPlugin mo122014c() {
        if (this.f85023a == null) {
            this.f85023a = m127668f();
        }
        return this.f85023a;
    }

    /* renamed from: f */
    private final PhotoKBPlugin m127668f() {
        Context requireContext = this.f85025c.mo122076a().requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
        PhotoKBPlugin bVar = new PhotoKBPlugin(this.f85024b, true, new C33029a(this, requireContext));
        KeyBoard b = this.f85025c.mo122077b();
        if (b != null) {
            bVar.mo147808a(new PhotoAaKBPluginCompat(b));
        }
        return bVar;
    }

    public PhotoPlugin(boolean z, IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f85024b = z;
        this.f85025c = cVar;
    }
}
