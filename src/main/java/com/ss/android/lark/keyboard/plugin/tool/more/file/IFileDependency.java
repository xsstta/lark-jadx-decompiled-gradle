package com.ss.android.lark.keyboard.plugin.tool.more.file;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0015\u0016J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency;", "", "getContext", "Landroid/content/Context;", "launchFileChooser", "", "requestCode", "", "parseFileChooseResult", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$FileChooseResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "sendFile", "files", "", "Ljava/io/File;", "sendFileByUri", "uri", "Landroid/net/Uri;", "sendNutFile", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$NutFileInfo;", "FileChooseResult", "NutFileInfo", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.b.b */
public interface IFileDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$FileChooseResult;", "", "paths", "", "", "uri", "Landroid/net/Uri;", "(Ljava/util/List;Ljava/util/List;)V", "getPaths", "()Ljava/util/List;", "getUri", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.b.b$a */
    public static final class FileChooseResult {

        /* renamed from: a */
        public static final Companion f104173a = new Companion(null);

        /* renamed from: b */
        private final List<String> f104174b;

        /* renamed from: c */
        private final List<Uri> f104175c;

        public FileChooseResult() {
            this(null, null, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileChooseResult)) {
                return false;
            }
            FileChooseResult aVar = (FileChooseResult) obj;
            return Intrinsics.areEqual(this.f104174b, aVar.f104174b) && Intrinsics.areEqual(this.f104175c, aVar.f104175c);
        }

        public int hashCode() {
            List<String> list = this.f104174b;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<Uri> list2 = this.f104175c;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "FileChooseResult(paths=" + this.f104174b + ", uri=" + this.f104175c + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$FileChooseResult$Companion;", "", "()V", "getUriList", "", "Landroid/net/Uri;", "clipData", "Landroid/content/ClipData;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.b.b$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final List<Uri> mo147650a(ClipData clipData) {
                Intrinsics.checkParameterIsNotNull(clipData, "clipData");
                ArrayList arrayList = new ArrayList();
                int itemCount = clipData.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    ClipData.Item itemAt = clipData.getItemAt(i);
                    Intrinsics.checkExpressionValueIsNotNull(itemAt, "clipData.getItemAt(i)");
                    Uri uri = itemAt.getUri();
                    Intrinsics.checkExpressionValueIsNotNull(uri, "clipData.getItemAt(i).uri");
                    arrayList.add(uri);
                }
                return arrayList;
            }
        }

        /* renamed from: a */
        public final List<String> mo147645a() {
            return this.f104174b;
        }

        /* renamed from: b */
        public final List<Uri> mo147646b() {
            return this.f104175c;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
        /* JADX WARN: Multi-variable type inference failed */
        public FileChooseResult(List<String> list, List<? extends Uri> list2) {
            this.f104174b = list;
            this.f104175c = list2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FileChooseResult(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
        }
    }

    /* renamed from: a */
    FileChooseResult mo122024a(Intent intent);

    /* renamed from: a */
    void mo122025a(int i);

    /* renamed from: a */
    void mo122026a(Uri uri);

    /* renamed from: a */
    void mo122027a(List<? extends File> list);
}
