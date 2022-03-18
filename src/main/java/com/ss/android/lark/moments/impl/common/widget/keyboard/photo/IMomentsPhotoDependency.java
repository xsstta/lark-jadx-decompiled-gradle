package com.ss.android.lark.moments.impl.common.widget.keyboard.photo;

import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u001e\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/IMomentsPhotoDependency;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "extractVideoFrame", "Lio/reactivex/Observable;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "requestInputFocus", "", "sendFile", "fileList", "Ljava/util/ArrayList;", "Ljava/io/File;", "sendImage", "photoPaths", "isKeepOriginPic", "", "sendVideo", "videoPaths", "", "setEnableClick", "enable", "updateVideo", "videoInfo", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.a */
public interface IMomentsPhotoDependency extends IPhotoDependency {
    /* renamed from: a */
    void mo166334a(IPhotoDependency.VideoInfo videoInfo, Photo photo);

    /* renamed from: a */
    void mo166335a(boolean z);

    /* renamed from: c */
    void mo166336c();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.a$a */
    public static final class C47324a {

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.a$a$a */
        public static final class C47325a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            public static final C47325a f119383a = new C47325a();

            C47325a() {
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<Map<String, IPhotoDependency.FrameInfo>> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "it");
            }
        }

        /* renamed from: a */
        public static void m187453a(IMomentsPhotoDependency aVar, IPhotoDependency.VideoInfo videoInfo, Photo photo) {
            Intrinsics.checkParameterIsNotNull(videoInfo, "videoInfo");
            Intrinsics.checkParameterIsNotNull(photo, "photo");
        }

        /* renamed from: a */
        public static void m187454a(IMomentsPhotoDependency aVar, ArrayList<File> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "fileList");
        }

        /* renamed from: a */
        public static void m187455a(IMomentsPhotoDependency aVar, ArrayList<String> arrayList, boolean z) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoPaths");
        }

        /* renamed from: a */
        public static void m187456a(IMomentsPhotoDependency aVar, List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoPaths");
        }

        /* renamed from: a */
        public static boolean m187457a(IMomentsPhotoDependency aVar) {
            return IPhotoDependency.C40977a.m162428a(aVar);
        }

        /* renamed from: b */
        public static Observable<Map<String, IPhotoDependency.FrameInfo>> m187458b(IMomentsPhotoDependency aVar, List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoInfos");
            Observable<Map<String, IPhotoDependency.FrameInfo>> create = Observable.create(C47325a.f119383a);
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create {}");
            return create;
        }
    }
}
