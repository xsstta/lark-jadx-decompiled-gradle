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
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class FileNodeContentView extends RecyclerView {

    /* renamed from: a */
    public List<FileTreeRvView.C7244a> f19387a = new ArrayList();

    /* renamed from: b */
    public AbstractC7243b f19388b;

    /* renamed from: c */
    private C7239a f19389c = new C7239a();

    /* renamed from: d */
    private LinearLayoutManager f19390d = new LinearLayoutManager(getContext());

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView$b */
    public interface AbstractC7243b {
        /* renamed from: a */
        void mo28299a(FileTreeRvView.C7244a aVar, View view);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView$a */
    public class C7239a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FileNodeContentView.this.f19387a.size();
        }

        private C7239a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return !FileNodeContentView.this.f19387a.get(i).f19412c ? 1 : 0;
        }

        /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView$a$a */
        class C7241a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ImageView f19395a;

            /* renamed from: b */
            public TextView f19396b;

            C7241a(View view) {
                super(view);
                this.f19395a = (ImageView) view.findViewById(R.id.navigation_view_item_icon);
                this.f19396b = (TextView) view.findViewById(R.id.navigation_view_item_name);
            }
        }

        /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView$a$b */
        class C7242b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ImageView f19398a;

            /* renamed from: b */
            public TextView f19399b;

            /* renamed from: c */
            public TextView f19400c;

            C7242b(View view) {
                super(view);
                this.f19398a = (ImageView) view.findViewById(R.id.navigation_view_item_icon);
                this.f19399b = (TextView) view.findViewById(R.id.navigation_view_item_name);
                this.f19400c = (TextView) view.findViewById(R.id.navigation_view_item_size);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                return new C7241a(from.inflate(R.layout.drive_filetreervview_item_dir, viewGroup, false));
            }
            return new C7242b(from.inflate(R.layout.drive_filetreervview_item_file, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
            final FileTreeRvView.C7244a aVar = FileNodeContentView.this.f19387a.get(i);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.archive.view.FileNodeContentView.C7239a.View$OnClickListenerC72401 */

                public void onClick(View view) {
                    if (FileNodeContentView.this.f19388b != null) {
                        FileNodeContentView.this.f19388b.mo28299a(aVar, viewHolder.itemView);
                    }
                }
            });
            if (viewHolder instanceof C7241a) {
                C7241a aVar2 = (C7241a) viewHolder;
                aVar2.f19396b.setText(aVar.f19411b.f19414b);
                if (aVar.f19411b.f19415c != -1) {
                    aVar2.f19395a.setImageResource(aVar.f19411b.f19415c);
                }
            } else if (viewHolder instanceof C7242b) {
                C7242b bVar = (C7242b) viewHolder;
                String str = aVar.f19411b.f19414b;
                TextView textView = bVar.f19399b;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                bVar.f19400c.setText(C13672c.m55478a(aVar.f19411b.f19416d));
                if (aVar.f19411b.f19415c != -1) {
                    bVar.f19398a.setImageResource(aVar.f19411b.f19415c);
                }
            }
        }
    }

    /* renamed from: a */
    private void m28969a() {
        setLayoutManager(this.f19390d);
        setAdapter(this.f19389c);
    }

    public int getCurrentDistanceY() {
        int findFirstVisibleItemPosition = this.f19390d.findFirstVisibleItemPosition();
        View findViewByPosition = this.f19390d.findViewByPosition(findFirstVisibleItemPosition);
        return (findFirstVisibleItemPosition * findViewByPosition.getHeight()) - findViewByPosition.getTop();
    }

    public void setContentItemClickListener(AbstractC7243b bVar) {
        this.f19388b = bVar;
    }

    /* renamed from: a */
    public void mo28295a(List<FileTreeRvView.C7244a> list) {
        this.f19387a.clear();
        this.f19387a.addAll(list);
        this.f19389c.notifyDataSetChanged();
    }

    public FileNodeContentView(Context context) {
        super(context);
        m28969a();
    }

    public FileNodeContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28969a();
    }

    public FileNodeContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28969a();
    }
}
