package com.bytedance.ee.bear.drive.view.preview.archive;

import com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7246b;
import com.bytedance.ee.bear.drive.view.preview.archive.view.C7248d;
import com.bytedance.ee.bear.drive.view.preview.archive.view.C7249e;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.io.C13672c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a */
public class C7222a implements AbstractC7246b {

    /* renamed from: a */
    private ArchiveTree f19357a;

    public C7222a(ArchiveTree archiveTree) {
        this.f19357a = archiveTree;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7246b
    /* renamed from: b */
    public boolean mo28268b(C7249e eVar) {
        return m28935a(this.f19357a, eVar).isDir();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7246b
    /* renamed from: c */
    public C7248d mo28269c(C7249e eVar) {
        return new C7223a(m28935a(this.f19357a, eVar));
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a$a */
    static class C7223a extends C7248d {

        /* renamed from: a */
        ArchiveTree f19358a;

        public C7223a(ArchiveTree archiveTree) {
            super(archiveTree.getName(), m28939a(archiveTree), archiveTree.getSize(), archiveTree.getPath());
            this.f19358a = archiveTree;
        }

        /* renamed from: a */
        private static int m28939a(ArchiveTree archiveTree) {
            String b = C13672c.m55481b(archiveTree.getName());
            if (archiveTree.isDir()) {
                return C7713a.m30837a(C8275a.f22370c.mo32555b());
            }
            return C7713a.m30841a(b);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7246b
    /* renamed from: a */
    public int mo28267a(C7249e eVar) {
        ArchiveTree a = m28935a(this.f19357a, eVar);
        if (a.getChildren() == null) {
            return 0;
        }
        return a.getChildren().size();
    }

    /* renamed from: a */
    private ArchiveTree m28935a(ArchiveTree archiveTree, C7249e eVar) {
        if (eVar.mo28311d()) {
            return archiveTree;
        }
        List<Integer> c = eVar.mo28310c();
        for (int i = 1; i < c.size(); i++) {
            archiveTree = archiveTree.getChildren().get(c.get(i).intValue());
        }
        return archiveTree;
    }
}
