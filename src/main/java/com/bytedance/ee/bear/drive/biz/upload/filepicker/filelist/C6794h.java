package com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.C6794h;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.C6799a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.C6773b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p717s.C13723a;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.h */
public class C6794h extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public AbstractC6784b f18462a;

    /* renamed from: b */
    public AbstractC6786d f18463b;

    /* renamed from: c */
    public Context f18464c;

    /* renamed from: d */
    private List<C6799a> f18465d;

    /* renamed from: e */
    private AbstractC7095c f18466e;

    /* renamed from: a */
    public List<C6799a> mo26655a() {
        return this.f18465d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<C6799a> list = this.f18465d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.h$b */
    public class C6796b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f18474a;

        /* renamed from: b */
        public TextView f18475b;

        /* renamed from: d */
        private C6799a f18477d;

        /* renamed from: a */
        private void m26770a() {
            this.f18474a = (ImageView) this.itemView.findViewById(R.id.navigation_view_item_icon);
            this.f18475b = (TextView) this.itemView.findViewById(R.id.navigation_view_item_name);
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$h$b$rgHtjROJdSIQDl0treYkXiH6BoQ */

                public final void onClick(View view) {
                    C6794h.C6796b.this.onItemClick(view);
                }
            });
        }

        /* renamed from: a */
        public void mo26661a(C6799a aVar) {
            this.f18477d = aVar;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void onItemClick(View view) {
            C6794h.this.f18463b.onClicked(this.f18477d, view);
        }

        public C6796b(View view) {
            super(view);
            m26770a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.h$a */
    public class C6795a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public UDCheckBox f18467a;

        /* renamed from: b */
        public ImageView f18468b;

        /* renamed from: c */
        public TextView f18469c;

        /* renamed from: d */
        public TextView f18470d;

        /* renamed from: e */
        public TextView f18471e;

        /* renamed from: g */
        private C6799a f18473g;

        /* renamed from: a */
        private void m26767a() {
            this.f18468b = (ImageView) this.itemView.findViewById(R.id.navigation_view_item_icon);
            this.f18469c = (TextView) this.itemView.findViewById(R.id.navigation_view_item_name);
            this.f18470d = (TextView) this.itemView.findViewById(R.id.navigation_view_item_summary);
            this.f18471e = (TextView) this.itemView.findViewById(R.id.navigation_view_item_size);
            UDCheckBox uDCheckBox = (UDCheckBox) this.itemView.findViewById(R.id.selected_icon);
            this.f18467a = uDCheckBox;
            uDCheckBox.setClickable(false);
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$h$a$vDwQRWiIhwxvITuju6Ywu1gtYu0 */

                public final void onClick(View view) {
                    C6794h.C6795a.this.onItemClick(view);
                }
            });
            this.f18468b.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$h$a$nNDig_j1yexWy86MwlvjoQkbjZs */

                public final void onClick(View view) {
                    C6794h.C6795a.this.m26768a((C6794h.C6795a) view);
                }
            });
        }

        /* renamed from: a */
        public void mo26660a(C6799a aVar) {
            this.f18473g = aVar;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m26768a(View view) {
            String path = this.f18473g.mo26764a().getFileUri().getPath();
            if (path != null) {
                C13675f.m55495a(C6794h.this.f18464c, new File(path), (String) null);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void onItemClick(View view) {
            boolean z;
            if (C6794h.this.f18463b != null) {
                C6794h.this.f18463b.onClicked(this.f18473g, view);
            }
            boolean isChecked = this.f18467a.isChecked();
            if (C6794h.this.f18462a == null || C6794h.this.f18462a.onFilePicked(this.f18473g, isChecked)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f18467a.setChecked(!isChecked);
            }
        }

        public C6795a(View view) {
            super(view);
            m26767a();
        }
    }

    public C6794h(Context context) {
        this.f18464c = context;
    }

    /* renamed from: a */
    public void mo26656a(AbstractC6784b bVar) {
        this.f18462a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f18465d.get(i).mo26768c()) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private Drawable m26759a(FileSystemObject fileSystemObject) {
        try {
            String fullPath = fileSystemObject.getFullPath();
            PackageManager packageManager = this.f18464c.getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(fullPath, 1);
            if (packageArchiveInfo == null) {
                return null;
            }
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = fullPath;
            applicationInfo.publicSourceDir = fullPath;
            return packageManager.getDrawable(applicationInfo.packageName, applicationInfo.icon, applicationInfo);
        } catch (Exception e) {
            C13479a.m54761a("VerticalFileListAdapter", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo26657a(AbstractC6786d dVar) {
        this.f18463b = dVar;
    }

    /* renamed from: a */
    public void mo26658a(AbstractC7095c cVar) {
        this.f18466e = cVar;
    }

    /* renamed from: a */
    public void mo26659a(List<C6799a> list) {
        this.f18465d = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26760a(C6795a aVar, Drawable drawable) throws Exception {
        if (drawable != null) {
            aVar.f18468b.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new C6795a(from.inflate(R.layout.drivefilepicker_item_file, viewGroup, false));
        }
        if (i == 2) {
            return new C6796b(from.inflate(R.layout.drivefilepicker_item_folder, viewGroup, false));
        }
        C13479a.m54758a("VerticalFileListAdapter", "onCreateViewHolder: invalid view type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < 0 || i >= this.f18465d.size()) {
            C13479a.m54758a("VerticalFileListAdapter", "onBindViewHolder: position is < 0");
            return;
        }
        C6799a aVar = this.f18465d.get(i);
        if (viewHolder instanceof C6795a) {
            C6795a aVar2 = (C6795a) viewHolder;
            aVar2.f18468b.setImageResource(aVar.mo26769d());
            FileSystemObject a = aVar.mo26764a();
            if (this.f18466e != null) {
                String d = C6773b.m26704d(a);
                if (this.f18466e.mo27715d(d, null) || this.f18466e.mo27714c(d, null)) {
                    ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f18464c).mo10415a(a.getFullPath()).mo11153j()).mo11143c(aVar.mo26769d())).mo10399a(aVar2.f18468b);
                } else if (this.f18466e.mo27725n(d, null)) {
                    AbstractC68307f.m265083a(a).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
                        /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$h$8sQGJKifGhgSVKLbyRWr5enV5Lc */

                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return C6794h.this.m26759a((C6794h) ((FileSystemObject) obj));
                        }
                    }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$h$55HKx8JMV7jYrAyyxF_YHG8AT8w */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C6794h.m26760a(C6794h.C6795a.this, (Drawable) obj);
                        }
                    }, $$Lambda$h$ozwU9jmLMrYouKJUttjjhLyvqhQ.INSTANCE);
                }
            }
            aVar2.f18469c.setText(aVar.mo26764a().getName());
            aVar2.f18470d.setText(C13723a.m55654a(this.f18464c, aVar.mo26764a().getLastModifiedTime().getTime()));
            aVar2.f18471e.setText(C6773b.m26700a(aVar.mo26764a()));
            aVar2.f18467a.setChecked(aVar.mo26767b());
            aVar2.mo26660a(aVar);
        } else if (viewHolder instanceof C6796b) {
            C6796b bVar = (C6796b) viewHolder;
            bVar.f18474a.setImageResource(aVar.mo26769d());
            bVar.f18475b.setText(aVar.mo26764a().getName());
            bVar.mo26661a(aVar);
        } else {
            C13479a.m54758a("VerticalFileListAdapter", "onBindViewHolder: holder is invalid");
        }
    }
}
