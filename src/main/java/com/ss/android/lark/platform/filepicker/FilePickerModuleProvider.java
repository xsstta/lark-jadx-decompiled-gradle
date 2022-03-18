package com.ss.android.lark.platform.filepicker;

import com.ss.android.lark.file.picker.FilePickerModule;
import com.ss.android.lark.file.picker.IFilePickerModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/platform/filepicker/FilePickerModuleProvider;", "", "()V", "Companion", "FilePickerModuleDependency", "SingletonHolder", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.l.a */
public final class FilePickerModuleProvider {

    /* renamed from: a */
    public static final Companion f128779a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/filepicker/FilePickerModuleProvider$FilePickerModuleDependency;", "Lcom/ss/android/lark/file/picker/IFilePickerModuleDependency;", "()V", "isEnable", "", "key", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.l.a$b */
    public static final class FilePickerModuleDependency implements IFilePickerModuleDependency {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/platform/filepicker/FilePickerModuleProvider$Companion;", "", "()V", "getModule", "Lcom/ss/android/lark/file/picker/FilePickerModule;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.l.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final FilePickerModule mo177952a() {
            return new FilePickerModule(SingletonHolder.f128780a.mo177953a());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/filepicker/FilePickerModuleProvider$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/platform/filepicker/FilePickerModuleProvider$FilePickerModuleDependency;", "getInstance", "()Lcom/ss/android/lark/platform/filepicker/FilePickerModuleProvider$FilePickerModuleDependency;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.l.a$c */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f128780a = new SingletonHolder();

        /* renamed from: b */
        private static final FilePickerModuleDependency f128781b = new FilePickerModuleDependency();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final FilePickerModuleDependency mo177953a() {
            return f128781b;
        }
    }
}
