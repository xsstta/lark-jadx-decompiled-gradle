package com.bytedance.ee.android.file.picker.lib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.android.file.picker.lib.dependency.C4044a;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerImageLoader;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerStatistics;
import com.bytedance.ee.android.file.picker.lib.dependency.Statistics;
import com.bytedance.ee.android.file.picker.lib.dto.FilePickerLaunchParams;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.bytedance.ee.android.file.picker.lib.p237c.C4041a;
import com.bytedance.ee.android.file.picker.lib.page.C4099b;
import com.bytedance.ee.android.file.picker.lib.page.FilePickerActivity;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/FilePicker;", "", "()V", "Companion", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.a */
public final class FilePicker {

    /* renamed from: a */
    public static boolean f12247a;

    /* renamed from: b */
    public static final Companion f12248b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/FilePicker$Companion;", "", "()V", "hasInit", "", "exitPicker", "", "context", "Landroid/content/Context;", "fetchReceivedFiles", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/bytedance/ee/android/file/picker/lib/media/FileEntry;", "inflateParams", "Landroid/os/Bundle;", "params", "Lcom/bytedance/ee/android/file/picker/lib/dto/FilePickerLaunchParams;", "initDependency", "logger", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerLogger;", "statistics", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerStatistics;", "imageLoader", "Lcom/bytedance/ee/android/file/picker/lib/dependency/IPickerImageLoader;", "isInit", "onRestoreState", "savedInstanceState", "onSaveInstanceState", "outState", "providePickerFragment", "Lcom/bytedance/ee/android/file/picker/lib/page/FilePickerFragment;", "startPicker", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo15807a() {
            return FilePicker.f12247a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo15804a(Bundle bundle) {
            if (bundle != null) {
                C4048c.m16852a(bundle);
                C4044a.m16835a(bundle);
                Statistics.f12298b.mo15884a(bundle);
            }
        }

        /* renamed from: b */
        public final void mo15809b(Bundle bundle) {
            if (bundle != null) {
                C4048c.m16856b(bundle);
                C4044a.m16837b(bundle);
                Statistics.f12298b.mo15888b(bundle);
            }
        }

        /* renamed from: b */
        public final C4099b mo15808b(FilePickerLaunchParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "params");
            C4099b bVar = new C4099b();
            bVar.setArguments(m16768c(aVar));
            return bVar;
        }

        /* renamed from: a */
        public final void mo15805a(FilePickerLaunchParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "params");
            Activity j = aVar.mo15840j();
            Fragment k = aVar.mo15841k();
            if (j != null) {
                Intent intent = new Intent(j, FilePickerActivity.class);
                intent.putExtras(m16768c(aVar));
                j.startActivityForResult(intent, aVar.mo15842l());
            } else if (k != null) {
                Intent intent2 = new Intent(k.getContext(), FilePickerActivity.class);
                intent2.putExtras(m16768c(aVar));
                k.startActivityForResult(intent2, aVar.mo15842l());
            }
        }

        /* renamed from: c */
        private final Bundle m16768c(FilePickerLaunchParams aVar) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("logger", C4048c.m16851a());
            bundle.putParcelable("imageLoader", C4044a.m16833a());
            bundle.putParcelable("statistics", Statistics.f12298b.mo15883a());
            bundle.putInt("action", aVar.mo15843m());
            bundle.putLong("extra.max.select.file.size", aVar.mo15820a());
            bundle.putLong("extra.max.single.select.size", aVar.mo15825b());
            bundle.putInt("extra.max.num", aVar.mo15829c());
            bundle.putString("extra.over.select.file.size.text.tips", aVar.mo15831d());
            bundle.putString("extra.over.select.single.file.size.text.tips", aVar.mo15833e());
            bundle.putString("extra.custom.title", aVar.mo15835f());
            bundle.putString("extra.custom.send.btn", aVar.mo15836g());
            bundle.putBoolean("extra.show.filter.menu", aVar.mo15837h());
            bundle.putInt("extra.file.type", aVar.mo15839i());
            return bundle;
        }

        /* renamed from: a */
        public final void mo15803a(Context context, IGetDataCallback<List<FileEntry>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            C4048c.m16858c("fetchReceivedFiles");
            new C4041a().mo15854a(context, iGetDataCallback);
        }

        /* renamed from: a */
        public final void mo15806a(IPickerLogger iPickerLogger, IPickerStatistics iPickerStatistics, IPickerImageLoader iPickerImageLoader) {
            C4048c.m16853a(iPickerLogger);
            C4044a.m16836a(iPickerImageLoader);
            Statistics.f12298b.mo15885a(iPickerStatistics);
            FilePicker.f12247a = true;
        }
    }
}
