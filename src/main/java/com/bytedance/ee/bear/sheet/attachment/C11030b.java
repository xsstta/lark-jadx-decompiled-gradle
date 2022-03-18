package com.bytedance.ee.bear.sheet.attachment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.sheet.attachment.AttachmentModelList;
import com.bytedance.ee.util.io.C13675f;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.attachment.b */
public class C11030b extends RecyclerView.Adapter<View$OnClickListenerC11031a> {

    /* renamed from: a */
    public List<AttachmentModelList.AttachmentModel> f29695a = new ArrayList();

    /* renamed from: b */
    public AbstractC11032b f29696b;

    /* renamed from: com.bytedance.ee.bear.sheet.attachment.b$b */
    public interface AbstractC11032b {
        void onItemClick(AttachmentModelList.AttachmentModel attachmentModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f29695a.size();
    }

    /* renamed from: a */
    public void mo42090a(AbstractC11032b bVar) {
        this.f29696b = bVar;
    }

    /* renamed from: a */
    public void mo42091a(List<AttachmentModelList.AttachmentModel> list) {
        if (list != null) {
            this.f29695a = list;
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.attachment.b$a */
    public class View$OnClickListenerC11031a extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        ImageView f29697a;

        /* renamed from: b */
        TextView f29698b;

        /* renamed from: c */
        TextView f29699c;

        public void onClick(View view) {
            if (C11030b.this.f29696b != null) {
                C11030b.this.f29696b.onItemClick(C11030b.this.f29695a.get(getLayoutPosition()));
            }
        }

        public View$OnClickListenerC11031a(View view) {
            super(view);
            this.f29697a = (ImageView) view.findViewById(R.id.attachment_item_icon);
            this.f29698b = (TextView) view.findViewById(R.id.attachment_item_name);
            this.f29699c = (TextView) view.findViewById(R.id.attachment_item_size);
            view.setOnClickListener(this);
        }
    }

    /* renamed from: a */
    public View$OnClickListenerC11031a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC11031a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_attachment_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(View$OnClickListenerC11031a aVar, int i) {
        String str;
        int i2;
        AttachmentModelList.AttachmentModel attachmentModel = this.f29695a.get(i);
        String name = attachmentModel.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf <= 0 || (i2 = lastIndexOf + 1) >= name.length()) {
            str = C13675f.m55488a(attachmentModel.getMimeType());
        } else {
            str = name.substring(i2);
        }
        aVar.f29697a.setImageResource(C7713a.m30841a(str));
        aVar.f29698b.setText(attachmentModel.getName());
        String[] strArr = {"B", "KB", "MB", "GB"};
        long size = attachmentModel.getSize();
        int i3 = 0;
        while (size > 1024 && i3 < 3) {
            size /= 1024;
            i3++;
        }
        TextView textView = aVar.f29699c;
        textView.setText(size + strArr[i3]);
    }
}
