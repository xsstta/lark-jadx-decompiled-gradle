package com.bytedance.ee.larkbrand.nativeMoudule.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.C41300b;
import com.tt.miniapp.chooser.p3267a.C65830d;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.util.C67045l;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.p3255a.C65678c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.a */
public class C13175a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    ArrayList<MediaEntity> f34944a;

    /* renamed from: b */
    Context f34945b;

    /* renamed from: c */
    ArrayList<MediaEntity> f34946c = new ArrayList<>();

    /* renamed from: d */
    long f34947d;

    /* renamed from: e */
    long f34948e;

    /* renamed from: f */
    int f34949f = 0;

    /* renamed from: g */
    public AbstractC13182c f34950g = null;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.a$c */
    public interface AbstractC13182c {
        /* renamed from: a */
        void mo49278a(View view, MediaEntity mediaEntity, ArrayList<MediaEntity> arrayList);
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.a$d */
    public static class C13183d {

        /* renamed from: a */
        public static String f34967a;

        /* renamed from: b */
        public static String f34968b;
    }

    /* renamed from: b */
    public ArrayList<MediaEntity> mo49285b() {
        return this.f34946c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo49280a() {
        return (C67590h.m263066a(this.f34945b) / 3) - 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = this.f34949f;
        if (i == 1 || i == 2) {
            return this.f34944a.size() + 1;
        }
        return this.f34944a.size();
    }

    /* renamed from: a */
    public void mo49281a(AbstractC13182c cVar) {
        this.f34950g = cVar;
    }

    /* renamed from: a */
    public void mo49283a(ArrayList<MediaEntity> arrayList) {
        if (arrayList != null) {
            this.f34946c = arrayList;
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo49286b(ArrayList<MediaEntity> arrayList) {
        this.f34944a = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f34949f;
        if ((i2 == 2 || i2 == 1) && i == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static void m53847a(final Activity activity) {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.CAMERA");
        hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a.C131761 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                if (!m53856a(false)) {
                    AppBrandLogger.m52829e("MediaGridAdapter", "openLarkCamera error: ");
                }
            }

            /* renamed from: a */
            private boolean m53856a(boolean z) {
                return C41300b.m163746a(activity, z);
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppBrandLogger.m52829e("MediaGridAdapter", "openLarkCamera onDenied: " + str);
            }
        });
    }

    /* renamed from: b */
    public int mo49284b(MediaEntity mediaEntity) {
        if (this.f34946c.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < this.f34946c.size(); i++) {
            if (this.f34946c.get(i).f170268a.equals(mediaEntity.f170268a)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo49282a(MediaEntity mediaEntity) {
        int b = mo49284b(mediaEntity);
        if (b == -1) {
            this.f34946c.add(mediaEntity);
        } else {
            this.f34946c.remove(b);
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.a$a */
    public class C13179a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f34957a;

        public C13179a(View view) {
            super(view);
            this.f34957a = (TextView) view.findViewById(R.id.microapp_m_media_camer_text);
            this.itemView.setLayoutParams(new AbsListView.LayoutParams(-1, C13175a.this.mo49280a()));
            view.setOnClickListener(new View.OnClickListener(C13175a.this) {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a.C13179a.View$OnClickListenerC131801 */

                public void onClick(View view) {
                    if (C13175a.this.f34949f == 1) {
                        C13175a.m53847a((Activity) C13175a.this.f34945b);
                    } else if (C13175a.this.f34949f == 2) {
                        C13175a.m53848a((Activity) C13175a.this.f34945b, 9);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m53848a(final Activity activity, final int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.CAMERA");
        hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a.C131772 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                Uri uri;
                String str;
                Intent intent = new Intent();
                intent.setAction("android.media.action.VIDEO_CAPTURE");
                intent.addCategory("android.intent.category.DEFAULT");
                File file = new File(activity.getExternalCacheDir(), "video/" + System.currentTimeMillis() + ".3pg");
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                C13183d.f34967a = file.getAbsolutePath();
                if (Build.VERSION.SDK_INT >= 24) {
                    if (ProcessUtil.isMiniappProcess()) {
                        str = AppbrandContext.getInst().getInitParams().mo234501a(1007, "com.ss.android.uri.fileprovider");
                    } else {
                        str = activity.getApplicationContext().getPackageName() + ".brand";
                    }
                    uri = FileProvider.getUriForFile(activity, str, file);
                } else {
                    uri = Uri.fromFile(file);
                }
                intent.putExtra("output", uri);
                activity.startActivityForResult(intent, i);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C13179a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.microapp_m_camer_item_view, viewGroup, false));
        }
        if (i == 1) {
            return new C13181b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.microapp_m_media_view_item, viewGroup, false));
        }
        return null;
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.a$b */
    public class C13181b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f34961a;

        /* renamed from: b */
        public ImageView f34962b;

        /* renamed from: c */
        public View f34963c;

        /* renamed from: d */
        public TextView f34964d;

        /* renamed from: e */
        public RelativeLayout f34965e;

        public C13181b(View view) {
            super(view);
            this.f34961a = (ImageView) view.findViewById(R.id.microapp_m_media_image);
            this.f34962b = (ImageView) view.findViewById(R.id.microapp_m_check_image);
            this.f34963c = view.findViewById(R.id.microapp_m_mask_view);
            this.f34965e = (RelativeLayout) view.findViewById(R.id.microapp_m_video_info);
            this.f34964d = (TextView) view.findViewById(R.id.microapp_m_textView_size);
            this.itemView.setLayoutParams(new AbsListView.LayoutParams(-1, C13175a.this.mo49280a()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Drawable drawable;
        if (viewHolder instanceof C13179a) {
            C13179a aVar = (C13179a) viewHolder;
            int i2 = this.f34949f;
            if (i2 == 1) {
                aVar.f34957a.setText(this.f34945b.getString(R.string.microapp_m_take_picture));
            } else if (i2 == 2) {
                aVar.f34957a.setText(this.f34945b.getString(R.string.microapp_m_take_video));
            }
        } else {
            int i3 = this.f34949f;
            if (i3 == 1 || i3 == 2) {
                i--;
            }
            if (viewHolder instanceof C13181b) {
                final C13181b bVar = (C13181b) viewHolder;
                final MediaEntity mediaEntity = this.f34944a.get(i);
                if (mediaEntity.f170271d == 3) {
                    String a = C67045l.m261302a(this.f34945b, mediaEntity.f170273f);
                    if (a == null || !new File(a).exists()) {
                        C65830d.m258002a(mediaEntity.f170268a, bVar.f34961a);
                    } else {
                        HostDependManager.getInst().loadImage(this.f34945b, new C65678c(new File(a)).mo229918a().mo229920a(mo49280a(), mo49280a()).mo229922a(bVar.f34961a));
                    }
                } else {
                    HostDependManager.getInst().loadImage(this.f34945b, new C65678c(new File(mediaEntity.f170268a)).mo229918a().mo229920a(mo49280a(), mo49280a()).mo229922a(bVar.f34961a));
                }
                int i4 = 0;
                if (mediaEntity.f170271d == 3) {
                    bVar.f34965e.setVisibility(0);
                    bVar.f34964d.setText(IOUtils.getSizeByUnit((double) mediaEntity.f170272e));
                } else {
                    bVar.f34965e.setVisibility(4);
                }
                int b = mo49284b(mediaEntity);
                View view = bVar.f34963c;
                if (b < 0) {
                    i4 = 4;
                }
                view.setVisibility(i4);
                ImageView imageView = bVar.f34962b;
                if (b >= 0) {
                    drawable = ContextCompat.getDrawable(this.f34945b, R.drawable.microapp_m_btn_selected);
                } else {
                    drawable = ContextCompat.getDrawable(this.f34945b, R.drawable.microapp_m_btn_unselected);
                }
                imageView.setImageDrawable(drawable);
                bVar.f34961a.setOnClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a.View$OnClickListenerC131783 */

                    public void onClick(View view) {
                        int i;
                        Drawable drawable;
                        int b = C13175a.this.mo49284b(mediaEntity);
                        if (((long) C13175a.this.f34946c.size()) >= C13175a.this.f34947d && b < 0) {
                            HostDependManager.getInst().showToast(C13175a.this.f34945b, null, C13175a.this.f34945b.getString(R.string.microapp_m_msg_amount_limit), 0, null);
                        } else if (mediaEntity.f170272e > C13175a.this.f34948e) {
                            HostDependManager inst = HostDependManager.getInst();
                            Context context = C13175a.this.f34945b;
                            inst.showToast(context, null, C13175a.this.f34945b.getString(R.string.microapp_m_msg_size_limit) + IOUtils.fileSize(C13175a.this.f34948e), 1, null);
                        } else {
                            View view2 = bVar.f34963c;
                            if (b >= 0) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                            view2.setVisibility(i);
                            ImageView imageView = bVar.f34962b;
                            if (b >= 0) {
                                drawable = ContextCompat.getDrawable(C13175a.this.f34945b, R.drawable.microapp_m_btn_unselected);
                            } else {
                                drawable = ContextCompat.getDrawable(C13175a.this.f34945b, R.drawable.microapp_m_btn_selected);
                            }
                            imageView.setImageDrawable(drawable);
                            C13175a.this.mo49282a(mediaEntity);
                            C13175a.this.f34950g.mo49278a(view, mediaEntity, C13175a.this.f34946c);
                        }
                    }
                });
            }
        }
    }

    public C13175a(int i, ArrayList<MediaEntity> arrayList, Context context, ArrayList<MediaEntity> arrayList2, int i2, long j) {
        if (arrayList2 != null) {
            this.f34946c = arrayList2;
        }
        this.f34947d = (long) i2;
        this.f34948e = j;
        this.f34944a = arrayList;
        this.f34945b = context;
        this.f34949f = i;
    }
}
