package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.dependency.LoadOption;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.utils.C44742a;
import com.ss.android.lark.mediapicker.utils.C44754j;
import com.ss.android.lark.mediapicker.widget.AspectRatioImageView;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.d */
public abstract class AbstractC44634d<VideoHolder extends AbstractC44638a, ImageHolder extends AbstractC44638a> extends RecyclerView.Adapter<AbstractC44638a> {

    /* renamed from: a */
    protected final MediaPickerConfig f113133a;

    /* renamed from: b */
    public AbstractC44639b f113134b;

    /* renamed from: c */
    public View.OnClickListener f113135c;

    /* renamed from: d */
    private final Context f113136d;

    /* renamed from: e */
    private List<LocalMedia> f113137e = new ArrayList();

    /* renamed from: f */
    private List<LocalMedia> f113138f = new ArrayList();

    /* renamed from: g */
    private AbstractC44640c f113139g;

    /* renamed from: com.ss.android.lark.mediapicker.album.base.d$b */
    public interface AbstractC44639b {
        /* renamed from: a */
        void mo158216a(LocalMedia localMedia, int i);
    }

    /* renamed from: com.ss.android.lark.mediapicker.album.base.d$c */
    public interface AbstractC44640c {
        /* renamed from: a */
        boolean mo158217a(LocalMedia localMedia);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo158127a(ImageHolder imageholder, LocalMedia localMedia);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo158130a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo158132b(VideoHolder videoholder, LocalMedia localMedia);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract AbstractC44638a mo158133c(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract ImageHolder mo158134d(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract VideoHolder mo158135e(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: b */
    public List<LocalMedia> mo158210b() {
        return this.f113138f;
    }

    /* renamed from: a */
    public boolean mo158209a(String str) {
        if (new File(str).exists()) {
            return false;
        }
        C44677b.m177236a("file not exist");
        return true;
    }

    /* renamed from: c */
    public List<LocalMedia> mo158212c() {
        return this.f113137e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (mo158130a()) {
            return this.f113137e.size() + 1;
        }
        return this.f113137e.size();
    }

    /* renamed from: com.ss.android.lark.mediapicker.album.base.d$a */
    public static abstract class AbstractC44638a extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public abstract ImageView mo158136a();

        /* renamed from: b */
        public abstract CheckBox mo158137b();

        /* renamed from: c */
        public abstract View mo158138c();

        public AbstractC44638a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo158205a(AbstractC44639b bVar) {
        this.f113134b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo158203a(AbstractC44638a aVar) {
        aVar.itemView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44634d.C446373 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                if (AbstractC44634d.this.f113135c != null) {
                    AbstractC44634d.this.f113135c.onClick(view);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo158211b(List<LocalMedia> list) {
        this.f113138f = new ArrayList(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private boolean m177062a(LocalMedia localMedia) {
        for (LocalMedia localMedia2 : this.f113138f) {
            if (localMedia2.getId() == localMedia.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (mo158130a()) {
            if (i == 0) {
                return 0;
            }
            i--;
        }
        if (this.f113137e.get(i).isVideo()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo158206a(AbstractC44640c cVar) {
        this.f113139g = cVar;
    }

    /* renamed from: a */
    public void mo158207a(OnSingleClickListener aVar) {
        this.f113135c = aVar;
    }

    /* renamed from: a */
    public void mo158208a(List<LocalMedia> list) {
        this.f113137e = list;
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public void mo158213c(AbstractC44638a aVar, LocalMedia localMedia) {
        AbstractC44640c cVar = this.f113139g;
        if (cVar != null) {
            m177061a(aVar, localMedia, cVar.mo158217a(localMedia));
        }
    }

    public AbstractC44634d(Context context, MediaPickerConfig mediaPickerConfig) {
        this.f113136d = context;
        this.f113133a = mediaPickerConfig;
    }

    /* renamed from: e */
    private void m177064e(AbstractC44638a aVar, LocalMedia localMedia) {
        ImageView a = aVar.mo158136a();
        if (C44742a.m177479a(a.getContext())) {
            LoadOption.C44674a aVar2 = new LoadOption.C44674a();
            aVar2.mo158280b(false);
            if (this.f113133a.f113081n && (a instanceof AspectRatioImageView)) {
                ((AspectRatioImageView) a).mo158478a(localMedia.getWidth(), localMedia.getHeight());
            }
            C44675a.m177227a(this.f113136d, localMedia.getPath(), a, aVar2.mo158278a());
        }
    }

    /* renamed from: a */
    private boolean m177063a(List<LocalMedia> list, MediaPickerConfig mediaPickerConfig) {
        String str;
        if (!mediaPickerConfig.f113070c) {
            if (list.size() > 0) {
                str = list.get(0).getMimeType();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (C44754j.m177502c(str)) {
                if (list.size() >= mediaPickerConfig.f113072e) {
                    return true;
                }
                return false;
            } else if (list.size() >= mediaPickerConfig.f113071d) {
                return true;
            } else {
                return false;
            }
        } else if (list.size() >= mediaPickerConfig.f113073f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public AbstractC44638a onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return mo158133c(from, viewGroup);
        }
        if (i == 1) {
            return mo158134d(from, viewGroup);
        }
        return mo158135e(from, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158214d(final com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a r8, final com.ss.android.lark.mediapicker.entity.LocalMedia r9) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediapicker.album.base.AbstractC44634d.mo158214d(com.ss.android.lark.mediapicker.album.base.d$a, com.ss.android.lark.mediapicker.entity.LocalMedia):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.mediapicker.album.base.d$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void onBindViewHolder(AbstractC44638a aVar, int i) {
        int i2;
        if (!mo158130a()) {
            i2 = i;
        } else if (i == 0) {
            mo158203a(aVar);
            return;
        } else {
            i2 = i - 1;
        }
        LocalMedia localMedia = this.f113137e.get(i2);
        if (getItemViewType(i) == 1) {
            mo158127a(aVar, localMedia);
        } else {
            mo158132b(aVar, localMedia);
        }
        mo158214d(aVar, localMedia);
    }

    /* renamed from: a */
    private void m177061a(AbstractC44638a aVar, LocalMedia localMedia, boolean z) {
        aVar.mo158137b().setChecked(z);
        if (z) {
            aVar.mo158137b().setText(String.valueOf(this.f113138f.indexOf(localMedia) + 1));
            return;
        }
        aVar.mo158137b().setText("");
    }
}
