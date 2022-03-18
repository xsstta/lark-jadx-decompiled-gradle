package com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.C6799a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FilePathModel;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class FileSelectView extends FrameLayout {

    /* renamed from: a */
    private RecyclerView f18426a;

    /* renamed from: b */
    private RecyclerView f18427b;

    /* renamed from: c */
    private SpaceEmptyState f18428c;

    /* renamed from: d */
    private C6794h f18429d;

    /* renamed from: e */
    private C6782a f18430e;

    /* renamed from: f */
    private LinearLayoutManager f18431f;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void mo26629a() {
        this.f18429d.notifyDataSetChanged();
    }

    public int getCurrentVerticalRVFirstItemDistanceY() {
        int findFirstVisibleItemPosition = this.f18431f.findFirstVisibleItemPosition();
        View findViewByPosition = this.f18431f.findViewByPosition(findFirstVisibleItemPosition);
        return (findFirstVisibleItemPosition * findViewByPosition.getHeight()) - findViewByPosition.getTop();
    }

    public List<C6799a> getCurDirFileModelListWithoutDirectory() {
        ArrayList arrayList = new ArrayList();
        if (this.f18429d.mo26655a() != null) {
            for (C6799a aVar : this.f18429d.mo26655a()) {
                if (!aVar.mo26768c()) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public FileSelectView(Context context) {
        super(context);
        mo26630a(context);
    }

    public void setCurrentVerticalRVDistanceY(int i) {
        this.f18427b.scrollBy(0, i);
    }

    public void setHorizontalRVItemClickListener(AbstractC6785c cVar) {
        this.f18430e.mo26641a(cVar);
    }

    public void setMimeTypeManager(AbstractC7095c cVar) {
        this.f18429d.mo26658a(cVar);
    }

    public void setOnFilePickedListener(AbstractC6784b bVar) {
        this.f18429d.mo26656a(bVar);
    }

    public void setRootFilePathModelList(List<FilePathModel> list) {
        this.f18430e.mo26643a(list);
    }

    public void setVerticalRVItemClickListener(AbstractC6786d dVar) {
        this.f18429d.mo26657a(dVar);
    }

    private void setEmptyViewVisible(boolean z) {
        if (z) {
            this.f18428c.setVisibility(0);
            this.f18427b.setVisibility(4);
            return;
        }
        this.f18428c.setVisibility(4);
        this.f18427b.setVisibility(0);
    }

    /* renamed from: a */
    public void mo26630a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drivefilepicker_file_select_view, this);
        this.f18426a = (RecyclerView) findViewById(R.id.recycler_view_horizontal);
        this.f18427b = (RecyclerView) findViewById(R.id.recycler_view_vertical);
        this.f18428c = (SpaceEmptyState) findViewById(R.id.ud_empty_state_view);
        this.f18429d = new C6794h(getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f18431f = linearLayoutManager;
        this.f18427b.setLayoutManager(linearLayoutManager);
        this.f18427b.setAdapter(this.f18429d);
        this.f18430e = new C6782a(getContext());
        this.f18426a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f18426a.setAdapter(this.f18430e);
    }

    public FileSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo26630a(context);
    }

    /* renamed from: a */
    public void mo26631a(List<C6799a> list, String str) {
        C13479a.m54764b("FileSelectView", "setCurDirFileModelList  " + list);
        boolean z = false;
        if (list.size() > 0) {
            this.f18429d.mo26659a(list);
            this.f18429d.notifyDataSetChanged();
            this.f18427b.scrollToPosition(0);
        }
        this.f18430e.mo26642a(str);
        this.f18426a.scrollToPosition(this.f18430e.getItemCount() - 1);
        if (list.size() == 0) {
            z = true;
        }
        setEmptyViewVisible(z);
    }

    public FileSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26630a(context);
    }
}
