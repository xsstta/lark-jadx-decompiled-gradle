package com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.C6782a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FilePathModel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.a */
public class C6782a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public AbstractC6785c f18432a;

    /* renamed from: b */
    private List<FilePathModel> f18433b;

    /* renamed from: c */
    private Context f18434c;

    /* renamed from: d */
    private String f18435d;

    /* renamed from: e */
    private boolean f18436e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FilePathModel> list = this.f18433b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.a$a */
    public class C6783a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f18437a;

        /* renamed from: b */
        public ImageView f18438b;

        /* renamed from: d */
        private FilePathModel f18440d;

        /* renamed from: a */
        private void m26722a() {
            this.f18437a = (TextView) this.itemView.findViewById(R.id.tv_folder_name);
            this.f18438b = (ImageView) this.itemView.findViewById(R.id.image_next);
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$a$a$6Gpi8MSwM3ahKofkhDPJLzFKkYg */

                public final void onClick(View view) {
                    C6782a.C6783a.this.onItemClick(view);
                }
            });
        }

        /* renamed from: a */
        public void mo26644a(FilePathModel filePathModel) {
            this.f18440d = filePathModel;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void onItemClick(View view) {
            if (C6782a.this.f18432a != null) {
                C6782a.this.f18432a.onClicked(this.f18440d.mo26682b(), view);
            }
        }

        public C6783a(View view) {
            super(view);
            m26722a();
        }
    }

    /* renamed from: a */
    public void mo26641a(AbstractC6785c cVar) {
        this.f18432a = cVar;
    }

    public C6782a(Context context) {
        this.f18434c = context;
    }

    /* renamed from: a */
    public void mo26643a(List<FilePathModel> list) {
        this.f18435d = list.get(list.size() - 1).mo26682b();
        if (list.size() > 1) {
            this.f18436e = true;
        }
        this.f18433b = list;
    }

    /* renamed from: a */
    public void mo26642a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f18433b.get(0));
        if (this.f18436e) {
            arrayList.add(this.f18433b.get(1));
        }
        String replace = str.replace(this.f18435d, "");
        if (replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        if (!TextUtils.equals(replace, "")) {
            String[] split = replace.split("/");
            for (int i = 0; i < split.length; i++) {
                FilePathModel filePathModel = new FilePathModel();
                filePathModel.mo26681a(split[i]);
                StringBuilder sb = new StringBuilder(this.f18435d);
                for (int i2 = 0; i2 <= i; i2++) {
                    sb.append("/");
                    sb.append(split[i2]);
                }
                filePathModel.mo26683b(sb.toString());
                arrayList.add(filePathModel);
            }
        }
        this.f18433b = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new C6783a(from.inflate(R.layout.drivefilepicker_item_horizon_folder, viewGroup, false));
        }
        C13479a.m54758a("HorizontalFileListAdapter", "onCreateViewHolder: invalid view type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < 0 || i >= this.f18433b.size()) {
            C13479a.m54758a("HorizontalFileListAdapter", "onBindViewHolder: position is < 0");
            return;
        }
        FilePathModel filePathModel = this.f18433b.get(i);
        if (viewHolder instanceof C6783a) {
            C6783a aVar = (C6783a) viewHolder;
            aVar.mo26644a(filePathModel);
            aVar.f18437a.setText(filePathModel.mo26680a());
            if (i == this.f18433b.size() - 1) {
                aVar.f18437a.setTextColor(this.f18434c.getResources().getColor(R.color.text_caption));
                aVar.f18438b.setVisibility(8);
                aVar.itemView.setClickable(false);
            } else {
                aVar.f18437a.setTextColor(this.f18434c.getResources().getColor(R.color.primary_pri_500));
                aVar.f18438b.setVisibility(0);
                aVar.itemView.setClickable(true);
            }
            if (i == 0) {
                aVar.f18437a.setPadding(C13749l.m55758d(this.f18434c, 16), 0, 0, 0);
            } else if (i == this.f18433b.size() - 1) {
                aVar.f18437a.setPadding(0, 0, C13749l.m55758d(this.f18434c, 16), 0);
            } else {
                aVar.f18437a.setPadding(0, 0, 0, 0);
            }
        } else {
            C13479a.m54758a("HorizontalFileListAdapter", "onBindViewHolder: holder is invalid");
        }
    }
}
