package com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43849u;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.a.c */
public class C42778c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static int f108939a = -1;

    /* renamed from: b */
    public TextView f108940b;

    /* renamed from: c */
    private final String f108941c = "ReceivedFileItemViewHolder";

    /* renamed from: d */
    private TextView f108942d;

    /* renamed from: e */
    private ImageView f108943e;

    public C42778c(View view) {
        super(view);
        this.f108940b = (TextView) view.findViewById(R.id.received_file_item_title);
        this.f108942d = (TextView) view.findViewById(R.id.received_file_item_info);
        this.f108943e = (ImageView) view.findViewById(R.id.received_file_item_icon);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo153592a(FileEntry fileEntry) {
        String str;
        if (fileEntry == null) {
            Log.m165383e("ReceivedFileItemViewHolder", "update invalid data");
            return;
        }
        String name = fileEntry.getName();
        this.f108940b.setText(name);
        int i = f108939a;
        if (i > 0) {
            this.f108940b.setMaxLines(i);
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42778c.RunnableC427791 */

                public void run() {
                    if (C42778c.f108939a > 0) {
                        C42778c.this.f108940b.setMaxLines(C42778c.f108939a);
                        return;
                    }
                    int height = C42778c.this.f108940b.getHeight();
                    if (height > 0) {
                        C42778c.f108939a = height / C42778c.this.f108940b.getLineHeight();
                        C42778c.this.f108940b.setMaxLines(C42778c.f108939a);
                    }
                }
            });
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(name)) {
            str = "";
        } else {
            str = C26311p.m95284d(name);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str.toUpperCase());
            sb.append(" - ");
        }
        sb.append(C26311p.m95262a(fileEntry.getSize()));
        this.f108942d.setText(sb.toString());
        if (TextUtils.isEmpty(name)) {
            name = "test.unknown";
        }
        this.f108943e.setImageResource(C41816b.m166115a().mo150111A().mo150173a(C26311p.m95283c(name), name));
    }
}
