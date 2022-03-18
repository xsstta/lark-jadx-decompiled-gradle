package com.bytedance.ee.bear.drive.view.preview.archive.parser;

import com.bytedance.ee.bear.drive.view.preview.archive.ArchiveTree;
import com.bytedance.ee.bear.libarchive.ArchiveEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveFolderTreeParser;", "", "archiveEntryList", "", "Lcom/bytedance/ee/bear/libarchive/ArchiveEntry;", "(Ljava/util/List;)V", "parse", "Lcom/bytedance/ee/bear/drive/view/preview/archive/ArchiveTree;", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.a */
public final class ArchiveFolderTreeParser {

    /* renamed from: a */
    public static final Companion f19359a = new Companion(null);

    /* renamed from: b */
    private final List<ArchiveEntry> f19360b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveFolderTreeParser$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ArchiveTree mo28270a() {
        boolean z;
        ArchiveTree archiveTree = new ArchiveTree();
        archiveTree.setName(".");
        archiveTree.setFileType(0);
        archiveTree.setChildren(new ArrayList());
        archiveTree.setPath("");
        for (ArchiveEntry archiveEntry : this.f19360b) {
            String path = archiveEntry.getPath();
            if (path == null) {
                path = "";
            }
            List split$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
            ArchiveTree archiveTree2 = archiveTree;
            int i = 0;
            for (Object obj : split$default) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                ArchiveTree archiveTree3 = new ArchiveTree();
                archiveTree3.setName(str);
                if (i == split$default.size() - 1) {
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = i2;
                    } else {
                        archiveTree3.setFileType(!archiveEntry.isFolder());
                        archiveTree3.setSize(archiveEntry.getSize());
                    }
                } else {
                    archiveTree3.setFileType(0);
                }
                archiveTree3.setParent(archiveTree2);
                if (archiveTree3.getFileType() == 0) {
                    StringBuilder sb = new StringBuilder();
                    ArchiveTree parent = archiveTree3.getParent();
                    Intrinsics.checkExpressionValueIsNotNull(parent, "node.parent");
                    sb.append(parent.getPath());
                    sb.append(str);
                    sb.append('/');
                    archiveTree3.setPath(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    ArchiveTree parent2 = archiveTree3.getParent();
                    Intrinsics.checkExpressionValueIsNotNull(parent2, "node.parent");
                    sb2.append(parent2.getPath());
                    sb2.append(str);
                    archiveTree3.setPath(sb2.toString());
                }
                if (!archiveTree2.getChildren().contains(archiveTree3)) {
                    archiveTree2.getChildren().add(archiveTree3);
                    archiveTree2 = archiveTree3;
                } else {
                    ArchiveTree archiveTree4 = archiveTree2.getChildren().get(archiveTree2.getChildren().indexOf(archiveTree3));
                    Intrinsics.checkExpressionValueIsNotNull(archiveTree4, "currentLevel.children[cu…l.children.indexOf(node)]");
                    archiveTree2 = archiveTree4;
                }
                i = i2;
            }
        }
        return archiveTree;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.libarchive.ArchiveEntry> */
    /* JADX WARN: Multi-variable type inference failed */
    public ArchiveFolderTreeParser(List<? extends ArchiveEntry> list) {
        Intrinsics.checkParameterIsNotNull(list, "archiveEntryList");
        this.f19360b = list;
    }
}
