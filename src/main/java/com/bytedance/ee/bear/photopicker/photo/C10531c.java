package com.bytedance.ee.bear.photopicker.photo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.c */
public class C10531c extends RecyclerView.Adapter<C10534a> {

    /* renamed from: a */
    protected final FileSelectConfig f28267a;

    /* renamed from: b */
    public AbstractC10535b f28268b;

    /* renamed from: c */
    private final String f28269c = "MediaPickerUIViewAdapter";

    /* renamed from: d */
    private final Context f28270d;

    /* renamed from: e */
    private List<Photo> f28271e = new ArrayList();

    /* renamed from: f */
    private List<Photo> f28272f = new ArrayList();

    /* renamed from: g */
    private AbstractC10536c f28273g;

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.c$b */
    public interface AbstractC10535b {
        /* renamed from: a */
        void mo39896a(Photo photo, int i, View view);
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.c$c */
    public interface AbstractC10536c {
        /* renamed from: a */
        boolean mo39895a(Photo photo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.c$a */
    public static class C10534a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f28282a;

        /* renamed from: b */
        CheckBox f28283b = ((CheckBox) this.itemView.findViewById(R.id.v_selected));

        /* renamed from: c */
        View f28284c = this.itemView.findViewById(R.id.v_mask);

        /* renamed from: d */
        TextView f28285d = ((TextView) this.itemView.findViewById(R.id.tv_duration));

        /* renamed from: a */
        public ImageView mo39915a() {
            return this.f28282a;
        }

        /* renamed from: b */
        public CheckBox mo39916b() {
            return this.f28283b;
        }

        /* renamed from: c */
        public View mo39917c() {
            return this.f28284c;
        }

        C10534a(View view) {
            super(view);
            this.f28282a = (ImageView) view.findViewById(R.id.image_photo_preview);
        }
    }

    /* renamed from: a */
    public List<Photo> mo39903a() {
        return this.f28272f;
    }

    /* renamed from: b */
    public List<Photo> mo39910b() {
        return this.f28271e;
    }

    /* renamed from: a */
    public boolean mo39909a(String str) {
        if (new File(str).exists()) {
            return false;
        }
        Log.m165383e("MediaPickerUIViewAdapter", "file not exist");
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28271e.size();
    }

    /* renamed from: a */
    public void mo39906a(AbstractC10535b bVar) {
        this.f28268b = bVar;
    }

    /* renamed from: b */
    public void mo39912b(List<Photo> list) {
        this.f28272f = new ArrayList(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private static boolean m43614a(Activity activity) {
        if (activity == null) {
            return true;
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m43615a(Photo photo) {
        for (Photo photo2 : this.f28272f) {
            if (photo2.getId() == photo.getId()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo39907a(AbstractC10536c cVar) {
        this.f28273g = cVar;
    }

    /* renamed from: a */
    public void mo39908a(List<Photo> list) {
        this.f28271e = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo39905a(C10534a aVar, Photo photo) {
        AbstractC10536c cVar = this.f28273g;
        if (cVar != null) {
            m43613a(aVar, photo, cVar.mo39895a(photo));
        }
    }

    public C10531c(Context context, FileSelectConfig fileSelectConfig) {
        this.f28270d = context;
        this.f28267a = fileSelectConfig;
    }

    /* renamed from: c */
    private void m43617c(C10534a aVar, Photo photo) {
        if (m43614a((Activity) aVar.mo39915a().getContext())) {
            String path = photo.getPath();
            AbstractC2354j jVar = AbstractC2354j.f7811a;
            if (path.toLowerCase().endsWith(".gif")) {
                jVar = AbstractC2354j.f7813c;
            }
            ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f28270d).mo10415a(path).mo11143c((int) R.drawable.photo_pick_item_holder)).mo11123a(R.drawable.photo_pick_item_holder)).mo11150h()).mo10387a(0.5f).mo11129a(jVar)).mo10399a(aVar.mo39915a());
        }
    }

    /* renamed from: a */
    private boolean m43616a(List<Photo> list, FileSelectConfig fileSelectConfig) {
        String str;
        if (!fileSelectConfig.mixSelect) {
            if (list.size() > 0) {
                str = list.get(0).getMimeType();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (C10524b.m43606b(str)) {
                if (list.size() >= 1) {
                    return true;
                }
                return false;
            } else if (list.size() >= fileSelectConfig.maxSelectImageNum) {
                return true;
            } else {
                return false;
            }
        } else if (list.size() >= fileSelectConfig.maxSelectMediaNum) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39911b(final com.bytedance.ee.bear.photopicker.photo.C10531c.C10534a r8, final com.ss.android.lark.widget.photo_picker.entity.Photo r9) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.photopicker.photo.C10531c.mo39911b(com.bytedance.ee.bear.photopicker.photo.c$a, com.ss.android.lark.widget.photo_picker.entity.Photo):void");
    }

    /* renamed from: a */
    public C10534a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C10534a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C10534a aVar, int i) {
        Photo photo = this.f28271e.get(i);
        if (photo.isVideo()) {
            aVar.f28285d.setVisibility(0);
            aVar.f28285d.setText(C26279i.m95149a((int) photo.getDuration()));
        } else {
            aVar.f28285d.setVisibility(8);
        }
        mo39911b(aVar, photo);
    }

    /* renamed from: a */
    private void m43613a(C10534a aVar, Photo photo, boolean z) {
        aVar.mo39916b().setChecked(z);
        if (z) {
            aVar.mo39916b().setText(String.valueOf(this.f28272f.indexOf(photo) + 1));
            return;
        }
        aVar.mo39916b().setText("");
    }
}
