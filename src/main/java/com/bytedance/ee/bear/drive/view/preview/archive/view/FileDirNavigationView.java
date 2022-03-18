package com.bytedance.ee.bear.drive.view.preview.archive.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.view.preview.archive.view.FileTreeRvView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class FileDirNavigationView extends RecyclerView {

    /* renamed from: a */
    public List<FileTreeRvView.C7244a> f19377a = new ArrayList();

    /* renamed from: b */
    public AbstractC7237b f19378b;

    /* renamed from: c */
    private C7234a f19379c = new C7234a();

    /* renamed from: d */
    private RecyclerView.LayoutManager f19380d = new LinearLayoutManager(getContext(), 0, false);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileDirNavigationView$b */
    public interface AbstractC7237b {
        /* renamed from: a */
        void mo28294a(FileTreeRvView.C7244a aVar);
    }

    public List<FileTreeRvView.C7244a> getDirDataModels() {
        return this.f19377a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileDirNavigationView$a */
    public class C7234a extends RecyclerView.Adapter<C7236a> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FileDirNavigationView.this.f19377a.size();
        }

        private C7234a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileDirNavigationView$a$a */
        public class C7236a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public TextView f19384a;

            /* renamed from: b */
            public ImageView f19385b;

            C7236a(View view) {
                super(view);
                this.f19384a = (TextView) view.findViewById(R.id.tv_dir_name);
                this.f19385b = (ImageView) view.findViewById(R.id.image_next);
            }
        }

        /* renamed from: a */
        public C7236a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C7236a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_filetreervview_item_nav, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(C7236a aVar, int i) {
            final FileTreeRvView.C7244a aVar2 = FileDirNavigationView.this.f19377a.get(i);
            aVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.archive.view.FileDirNavigationView.C7234a.View$OnClickListenerC72351 */

                public void onClick(View view) {
                    if (FileDirNavigationView.this.f19378b != null) {
                        FileDirNavigationView.this.f19378b.mo28294a(aVar2);
                    }
                }
            });
            String str = aVar2.f19411b.f19414b;
            TextView textView = aVar.f19384a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            if (i == FileDirNavigationView.this.f19377a.size() - 1) {
                aVar.f19384a.setTextColor(FileDirNavigationView.this.getResources().getColor(R.color.text_caption));
                aVar.f19385b.setVisibility(8);
                aVar.itemView.setClickable(false);
            } else {
                aVar.f19384a.setTextColor(FileDirNavigationView.this.getResources().getColor(R.color.primary_pri_500));
                aVar.f19385b.setVisibility(0);
                aVar.itemView.setClickable(true);
            }
            if (i == 0) {
                aVar.f19384a.setPadding(C13749l.m55738a(16), 0, 0, 0);
            } else if (i == FileDirNavigationView.this.f19377a.size() - 1) {
                aVar.f19384a.setPadding(0, 0, C13749l.m55738a(16), 0);
            } else {
                aVar.f19384a.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* renamed from: a */
    private void m28960a() {
        setLayoutManager(this.f19380d);
        setAdapter(this.f19379c);
    }

    public void setNavigationItemClickListener(AbstractC7237b bVar) {
        this.f19378b = bVar;
    }

    /* renamed from: a */
    public int mo28285a(FileTreeRvView.C7244a aVar) {
        return this.f19377a.indexOf(aVar);
    }

    /* renamed from: c */
    private boolean m28961c(int i) {
        if (i < 0 || i >= this.f19377a.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public List<FileTreeRvView.C7244a> mo28286a(int i) {
        if (m28961c(i)) {
            return new ArrayList(this.f19377a.subList(0, i));
        }
        return new ArrayList();
    }

    /* renamed from: b */
    public FileTreeRvView.C7244a mo28288b(int i) {
        if (m28961c(i)) {
            return this.f19377a.get(i);
        }
        return null;
    }

    public FileDirNavigationView(Context context) {
        super(context);
        m28960a();
    }

    /* renamed from: a */
    public void mo28287a(List<FileTreeRvView.C7244a> list) {
        this.f19377a.clear();
        this.f19377a.addAll(list);
        this.f19379c.notifyDataSetChanged();
        scrollToPosition(this.f19379c.getItemCount() - 1);
    }

    public FileDirNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28960a();
    }

    public FileDirNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28960a();
    }
}
