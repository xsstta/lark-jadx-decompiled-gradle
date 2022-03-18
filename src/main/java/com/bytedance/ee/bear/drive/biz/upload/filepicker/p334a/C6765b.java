package com.bytedance.ee.bear.drive.biz.upload.filepicker.p334a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.StorageVolumeWrapper;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p334a.C6765b;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.C6773b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.a.b */
public class C6765b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public AbstractC6764a f18408a;

    /* renamed from: b */
    private List<StorageVolumeWrapper> f18409b = new ArrayList();

    /* renamed from: c */
    private Context f18410c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<StorageVolumeWrapper> list = this.f18409b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.a.b$a */
    public class C6766a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f18411a;

        /* renamed from: b */
        public TextView f18412b;

        /* renamed from: c */
        public TextView f18413c;

        /* renamed from: e */
        private StorageVolumeWrapper f18415e;

        /* renamed from: a */
        private void m26686a() {
            this.f18411a = (ImageView) this.itemView.findViewById(R.id.navigation_view_item_icon);
            this.f18412b = (TextView) this.itemView.findViewById(R.id.navigation_view_item_name);
            this.f18413c = (TextView) this.itemView.findViewById(R.id.tv_capacity);
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.p334a.$$Lambda$b$a$MFRhUl1oI96u_UfPMAKiXFhRuvk */

                public final void onClick(View view) {
                    C6765b.C6766a.lambda$MFRhUl1oI96u_UfPMAKiXFhRuvk(C6765b.C6766a.this, view);
                }
            });
        }

        /* renamed from: a */
        public void mo26605a(StorageVolumeWrapper storageVolumeWrapper) {
            this.f18415e = storageVolumeWrapper;
        }

        /* access modifiers changed from: public */
        private void onItemClick(View view) {
            C6765b.this.f18408a.onClicked(this.f18415e, view);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6766a(View view) {
            super(view);
            C6765b.this = r1;
            m26686a();
        }
    }

    /* renamed from: a */
    public void mo26603a(AbstractC6764a aVar) {
        this.f18408a = aVar;
    }

    /* renamed from: a */
    public void mo26604a(List<StorageVolumeWrapper> list) {
        this.f18409b = list;
    }

    public C6765b(Context context) {
        this.f18410c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new C6766a(from.inflate(R.layout.drivefilepicker_item_storage, viewGroup, false));
        }
        C13479a.m54758a("StorageListAdapter", "onCreateViewHolder: invalid view type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < 0 || i >= this.f18409b.size()) {
            C13479a.m54758a("StorageListAdapter", "onBindViewHolder: position is <0");
            return;
        }
        StorageVolumeWrapper storageVolumeWrapper = this.f18409b.get(i);
        if (viewHolder instanceof C6766a) {
            C6766a aVar = (C6766a) viewHolder;
            aVar.f18412b.setText(storageVolumeWrapper.mo26748a(this.f18410c));
            String a = C6773b.m26699a(storageVolumeWrapper.mo26749b());
            aVar.f18413c.setText(a.concat(" / ").concat(C6773b.m26699a(storageVolumeWrapper.mo26750c())));
            aVar.f18411a.setImageResource(storageVolumeWrapper.mo26747a());
            aVar.mo26605a(storageVolumeWrapper);
            return;
        }
        C13479a.m54758a("StorageListAdapter", "onBindViewHolder: holder is invalid");
    }
}
