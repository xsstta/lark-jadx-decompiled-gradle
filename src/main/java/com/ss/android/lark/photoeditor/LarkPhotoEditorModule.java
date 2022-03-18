package com.ss.android.lark.photoeditor;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.photoeditor.p2462a.AbstractC51426a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/photoeditor/LarkPhotoEditorModule;", "", "()V", "Companion", "components_lark-photo-editor_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.photoeditor.a */
public final class LarkPhotoEditorModule {

    /* renamed from: a */
    public static AbstractC51426a f127968a;

    /* renamed from: b */
    public static final Companion f127969b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC51426a m199349a() {
        return f127969b.mo177082b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m199350a(Context context, Fragment fragment, String str, String str2, int i, String str3, boolean z, boolean z2, String str4) {
        f127969b.mo177080a(context, fragment, str, str2, i, str3, z, z2, str4);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m199351a(AbstractC51426a aVar) {
        f127969b.mo177083b(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0016H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0007JV\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/ss/android/lark/photoeditor/LarkPhotoEditorModule$Companion;", "", "()V", "FROM_PICKER", "", "FROM_PREVIEW", "FROM_TAKE_PICTURE", "KEY_FILE_KEY", "KEY_FROM", "KEY_IMAGE_URL", "KEY_RESULT_PATH", "KEY_SHOW_FORWARD_BTN", "KEY_SHOW_SAVE_BTN", "TAG", "sDependency", "Lcom/ss/android/lark/photoeditor/dependency/IPhotoEditorDependency;", "getSDependency", "()Lcom/ss/android/lark/photoeditor/dependency/IPhotoEditorDependency;", "setSDependency", "(Lcom/ss/android/lark/photoeditor/dependency/IPhotoEditorDependency;)V", "getDependency", "getFeatureGatingMap", "", "", "setDependency", "", "dependency", "showEditor", "context", "Landroid/content/Context;", "fragment", "Landroidx/fragment/app/Fragment;", "imagePath", "resultPath", "requestCode", "", "from", "showSaveBtn", "showForwardBtn", "fileKey", "components_lark-photo-editor_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.photoeditor.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final AbstractC51426a mo177079a() {
            return LarkPhotoEditorModule.f127968a;
        }

        @JvmStatic
        /* renamed from: b */
        public final AbstractC51426a mo177082b() {
            return mo177079a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo177081a(AbstractC51426a aVar) {
            LarkPhotoEditorModule.f127968a = aVar;
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo177083b(AbstractC51426a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "dependency");
            Log.m165389i("LarkPhotoEditorModule", "set dependency! ");
            mo177081a(aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo177080a(Context context, Fragment fragment, String str, String str2, int i, String str3, boolean z, boolean z2, String str4) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            Intrinsics.checkParameterIsNotNull(str2, "resultPath");
            Intrinsics.checkParameterIsNotNull(str3, "from");
            if (mo177079a() == null) {
                Log.m165383e("LarkPhotoEditorModule", "dependency is not set!");
            } else if (context == null) {
                Log.m165383e("LarkPhotoEditorModule", "context is null");
            } else if (str == null) {
                Log.m165383e("LarkPhotoEditorModule", "imagePath is null");
            } else {
                C51428b.m199363a(context, fragment, str, str2, str3, i, z, z2, str4);
            }
        }
    }
}
