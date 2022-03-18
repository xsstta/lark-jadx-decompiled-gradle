package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.LoadOption;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.utils.C44757m;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.k */
public class C44662k extends RecyclerView.Adapter<C44665b> {

    /* renamed from: a */
    public List<LocalMediaFolder> f113176a = new ArrayList();

    /* renamed from: b */
    public AbstractC44664a f113177b;

    /* renamed from: c */
    private Context f113178c;

    /* renamed from: com.ss.android.lark.mediapicker.album.base.k$a */
    public interface AbstractC44664a {
        /* renamed from: a */
        void mo158229a(String str, List<LocalMedia> list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f113176a.size();
    }

    /* renamed from: a */
    public List<LocalMediaFolder> mo158247a() {
        if (this.f113176a == null) {
            this.f113176a = new ArrayList();
        }
        return this.f113176a;
    }

    /* renamed from: a */
    public void mo158248a(AbstractC44664a aVar) {
        this.f113177b = aVar;
    }

    /* renamed from: a */
    public void mo158250a(List<LocalMediaFolder> list) {
        this.f113176a = list;
        notifyDataSetChanged();
    }

    public C44662k(Context context) {
        this.f113178c = context;
    }

    /* renamed from: a */
    public C44665b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44665b(LayoutInflater.from(this.f113178c).inflate(R.layout.picker_album_folder_item, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mediapicker.album.base.k$b */
    public class C44665b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f113181a;

        /* renamed from: b */
        TextView f113182b;

        /* renamed from: c */
        TextView f113183c;

        public C44665b(View view) {
            super(view);
            this.f113181a = (ImageView) view.findViewById(R.id.first_image);
            this.f113182b = (TextView) view.findViewById(R.id.tv_folder_name);
            this.f113183c = (TextView) view.findViewById(R.id.image_num);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C44665b bVar, int i) {
        final LocalMediaFolder localMediaFolder = this.f113176a.get(i);
        String name = localMediaFolder.getName();
        int localMediaNum = localMediaFolder.getLocalMediaNum();
        String coverPath = localMediaFolder.getCoverPath();
        bVar.itemView.setSelected(localMediaFolder.isChecked());
        C44675a.m177227a(bVar.itemView.getContext(), coverPath, bVar.f113181a, new LoadOption.C44674a().mo158277a(true).mo158276a(LoadOption.MediaDiskCacheStrategy.ALL).mo158278a());
        bVar.f113183c.setText(C44757m.m177506a(this.f113178c, R.string.Lark_MediaPicker_ImageCount, "count", String.valueOf(localMediaNum)));
        bVar.f113182b.setText(name);
        bVar.itemView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.album.base.C44662k.C446631 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                if (C44662k.this.f113177b != null) {
                    for (LocalMediaFolder localMediaFolder : C44662k.this.f113176a) {
                        localMediaFolder.setChecked(false);
                    }
                    localMediaFolder.setChecked(true);
                    C44662k.this.notifyDataSetChanged();
                    C44662k.this.f113177b.mo158229a(localMediaFolder.getName(), localMediaFolder.getLocalMedia());
                }
            }
        });
    }
}
