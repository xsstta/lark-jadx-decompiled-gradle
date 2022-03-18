package com.ss.android.lark.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommonPopupRecycleAdapter extends RecyclerView.Adapter<C57565b> {

    /* renamed from: a */
    public AbstractC57564a f141854a;

    /* renamed from: b */
    private LayoutInflater f141855b;

    /* renamed from: c */
    private List<ListItem> f141856c = new ArrayList();

    /* renamed from: com.ss.android.lark.ui.CommonPopupRecycleAdapter$a */
    public interface AbstractC57564a {
        /* renamed from: a */
        void mo102289a(View view, int i);
    }

    /* renamed from: a */
    public static Thread m223567a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public static class ListItem implements Serializable {
        private String base64Img;
        private String iconId;
        private String id;
        private String text;

        public String getBase64Img() {
            return this.base64Img;
        }

        public String getIconId() {
            return this.iconId;
        }

        public String getId() {
            return this.id;
        }

        public String getText() {
            return this.text;
        }

        public String toString() {
            return "id:" + this.id + "," + "iconId:" + this.iconId + "," + "text:" + this.text + "," + "base64Img:" + this.base64Img + ";";
        }

        public void setBase64Img(String str) {
            this.base64Img = str;
        }

        public void setIconId(String str) {
            this.iconId = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setText(String str) {
            this.text = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f141856c.size();
    }

    /* renamed from: a */
    public void mo195425a(AbstractC57564a aVar) {
        this.f141854a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.ui.CommonPopupRecycleAdapter$b */
    public static class C57565b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f141864a;

        /* renamed from: b */
        public ImageView f141865b;

        public C57565b(View view) {
            super(view);
            this.f141864a = (TextView) view.findViewById(R.id.text);
            this.f141865b = (ImageView) view.findViewById(R.id.image);
        }
    }

    /* renamed from: a */
    public static Bitmap m223566a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            Log.m165383e("stringToBitmap", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public C57565b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C57565b(this.f141855b.inflate(R.layout.common_popup_list_item, viewGroup, false));
    }

    public CommonPopupRecycleAdapter(Context context, List<ListItem> list) {
        this.f141855b = LayoutInflater.from(context);
        if (list != null) {
            this.f141856c = list;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(final C57565b bVar, final int i) {
        Bitmap bitmap;
        final ListItem listItem = this.f141856c.get(i);
        if (listItem != null) {
            String base64Img = listItem.getBase64Img();
            if (TextUtils.isEmpty(base64Img)) {
                bitmap = null;
            } else {
                bitmap = m223566a(base64Img);
            }
            if (bitmap == null) {
                bVar.f141865b.setImageDrawable(null);
            } else {
                bVar.f141865b.setImageBitmap(bitmap);
            }
            bVar.f141864a.setText(listItem.getText());
            bVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.ui.CommonPopupRecycleAdapter.View$OnClickListenerC575611 */

                public void onClick(View view) {
                    if (CommonPopupRecycleAdapter.this.f141854a != null) {
                        CommonPopupRecycleAdapter.this.f141854a.mo102289a(view, i);
                    }
                }
            });
            m223567a(new Thread(new Runnable() {
                /* class com.ss.android.lark.ui.CommonPopupRecycleAdapter.RunnableC575622 */

                public void run() {
                    Bitmap bitmap;
                    String base64Img = listItem.getBase64Img();
                    final BitmapDrawable bitmapDrawable = null;
                    if (TextUtils.isEmpty(base64Img)) {
                        bitmap = null;
                    } else {
                        bitmap = CommonPopupRecycleAdapter.m223566a(base64Img);
                    }
                    if (bitmap != null) {
                        bitmapDrawable = new BitmapDrawable(bitmap);
                    }
                    bVar.f141865b.post(new Runnable() {
                        /* class com.ss.android.lark.ui.CommonPopupRecycleAdapter.RunnableC575622.RunnableC575631 */

                        public void run() {
                            bVar.f141865b.setImageDrawable(bitmapDrawable);
                        }
                    });
                }
            })).start();
        }
    }
}
