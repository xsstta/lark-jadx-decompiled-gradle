package com.bytedance.ee.bear.drive.view.preview.archive.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.drive.view.preview.archive.view.FileDirNavigationView;
import com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.LoadingAnimView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileTreeRvView extends FrameLayout implements FileDirNavigationView.AbstractC7237b, FileNodeContentView.AbstractC7243b {

    /* renamed from: a */
    private FileDirNavigationView f19402a;

    /* renamed from: b */
    private FileNodeContentView f19403b;

    /* renamed from: c */
    private SpaceEmptyState f19404c;

    /* renamed from: d */
    private LoadingAnimView f19405d;

    /* renamed from: e */
    private AbstractC7246b f19406e;

    /* renamed from: f */
    private C7244a f19407f;

    /* renamed from: g */
    private AbstractC7245a f19408g;

    /* renamed from: h */
    private AbstractC7247c f19409h;

    public AbstractC7246b getDataProvider() {
        return this.f19406e;
    }

    /* renamed from: b */
    public void mo28301b() {
        this.f19405d.mo28899a();
    }

    /* renamed from: d */
    public boolean mo28303d() {
        if (this.f19406e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo28300a() {
        this.f19405d.mo28900a(400);
    }

    /* renamed from: c */
    public boolean mo28302c() {
        if (this.f19407f.f19410a.mo28311d()) {
            return false;
        }
        int a = this.f19402a.mo28285a(this.f19407f) - 1;
        C7244a b = this.f19402a.mo28288b(a);
        List<C7244a> a2 = this.f19402a.mo28286a(a);
        if (b == null) {
            return false;
        }
        m28975a(a2, b);
        return true;
    }

    public void setContentItemClickListener(AbstractC7245a aVar) {
        this.f19408g = aVar;
    }

    public void setNavigationItemClickListener(AbstractC7247c cVar) {
        this.f19409h = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileTreeRvView$a */
    public class C7244a {

        /* renamed from: a */
        C7249e f19410a;

        /* renamed from: b */
        C7248d f19411b;

        /* renamed from: c */
        boolean f19412c;

        C7244a() {
        }
    }

    public FileTreeRvView(Context context) {
        super(context);
        m28974a(context);
    }

    /* renamed from: a */
    private C7244a m28972a(C7249e eVar) {
        return m28973a(eVar, false);
    }

    public void setCurrentNodeP(C7249e eVar) {
        C7244a a = m28972a(eVar);
        if (a.f19412c) {
            m28975a((List<C7244a>) null, a);
        }
    }

    private void setEmptyViewVisible(boolean z) {
        if (z) {
            this.f19404c.setVisibility(0);
            this.f19403b.setVisibility(4);
            return;
        }
        this.f19404c.setVisibility(4);
        this.f19403b.setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.FileDirNavigationView.AbstractC7237b
    /* renamed from: a */
    public void mo28294a(C7244a aVar) {
        AbstractC7247c cVar = this.f19409h;
        if (cVar == null || !cVar.onNavigationItemClick(aVar.f19410a, aVar.f19411b)) {
            FileDirNavigationView fileDirNavigationView = this.f19402a;
            m28975a(fileDirNavigationView.mo28286a(fileDirNavigationView.mo28285a(aVar)), aVar);
        }
    }

    public void setDataProvider(AbstractC7246b bVar) {
        this.f19406e = bVar;
        m28975a((List<C7244a>) null, m28973a(C7249e.m28987a(), true));
        this.f19402a.setNavigationItemClickListener(this);
        this.f19403b.setContentItemClickListener(this);
    }

    /* renamed from: b */
    private List<C7244a> m28976b(C7244a aVar) {
        ArrayList arrayList = new ArrayList();
        int a = this.f19406e.mo28267a(aVar.f19410a);
        for (int i = 0; i < a; i++) {
            arrayList.add(m28972a(C7249e.m28988a(aVar.f19410a, i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m28974a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_filetreervview, this);
        this.f19402a = (FileDirNavigationView) findViewById(R.id.recycler_view_horizontal);
        this.f19403b = (FileNodeContentView) findViewById(R.id.recycler_view_vertical);
        this.f19404c = (SpaceEmptyState) findViewById(R.id.ud_empty_state_view);
        this.f19405d = (LoadingAnimView) findViewById(R.id.loading);
    }

    public FileTreeRvView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28974a(context);
    }

    /* renamed from: a */
    private C7244a m28973a(C7249e eVar, boolean z) {
        boolean z2;
        C7244a aVar = new C7244a();
        aVar.f19410a = eVar;
        if (z || this.f19406e.mo28268b(eVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.f19412c = z2;
        C7248d c = this.f19406e.mo28269c(eVar);
        if (c == null) {
            c = new C7248d();
        }
        aVar.f19411b = c;
        return aVar;
    }

    /* renamed from: b */
    private List<C7244a> m28977b(List<C7244a> list, C7244a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
            arrayList.add(aVar);
        } else {
            C7249e eVar = aVar.f19410a;
            LinkedList linkedList = new LinkedList();
            linkedList.offerLast(aVar);
            while (true) {
                eVar = eVar.mo28309b();
                if (eVar == null) {
                    break;
                }
                linkedList.offerLast(m28972a(eVar));
            }
            while (!linkedList.isEmpty()) {
                arrayList.add((C7244a) linkedList.pollLast());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m28975a(List<C7244a> list, C7244a aVar) {
        boolean z;
        this.f19407f = aVar;
        if (this.f19406e.mo28267a(aVar.f19410a) > 0) {
            z = true;
        } else {
            z = false;
        }
        setEmptyViewVisible(!z);
        this.f19402a.mo28287a(m28977b(list, aVar));
        if (z) {
            this.f19403b.mo28295a(m28976b(aVar));
            this.f19403b.scrollToPosition(0);
            int i = aVar.f19410a.f19418a;
            if (i > 0) {
                this.f19403b.scrollBy(0, i);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView.AbstractC7243b
    /* renamed from: a */
    public void mo28299a(C7244a aVar, View view) {
        AbstractC7245a aVar2 = this.f19408g;
        if ((aVar2 == null || !aVar2.onContentItemClick(aVar.f19410a, aVar.f19411b, aVar.f19412c, view)) && aVar.f19412c) {
            this.f19407f.f19410a.f19418a = this.f19403b.getCurrentDistanceY();
            m28975a(this.f19402a.getDirDataModels(), aVar);
        }
    }

    public FileTreeRvView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28974a(context);
    }
}
