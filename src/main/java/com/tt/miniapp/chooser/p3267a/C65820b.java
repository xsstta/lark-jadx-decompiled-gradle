package com.tt.miniapp.chooser.p3267a;

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
import androidx.core.graphics.drawable.C0774a;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.tt.miniapp.chooser.C65817a;
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

/* renamed from: com.tt.miniapp.chooser.a.b */
public class C65820b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    ArrayList<MediaEntity> f165881a;

    /* renamed from: b */
    Context f165882b;

    /* renamed from: c */
    ArrayList<MediaEntity> f165883c = new ArrayList<>();

    /* renamed from: d */
    long f165884d;

    /* renamed from: e */
    int f165885e = 0;

    /* renamed from: f */
    public AbstractC65828c f165886f = null;

    /* renamed from: com.tt.miniapp.chooser.a.b$c */
    public interface AbstractC65828c {
        /* renamed from: a */
        void mo230526a(View view, MediaEntity mediaEntity, ArrayList<MediaEntity> arrayList);
    }

    /* renamed from: b */
    public ArrayList<MediaEntity> mo230551b() {
        return this.f165883c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo230546a() {
        return (C67590h.m263066a(this.f165882b) / 3) - 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = this.f165885e;
        if (i == 1 || i == 2) {
            return this.f165881a.size() + 1;
        }
        return this.f165881a.size();
    }

    /* renamed from: a */
    public void mo230547a(AbstractC65828c cVar) {
        this.f165886f = cVar;
    }

    /* renamed from: a */
    public void mo230549a(ArrayList<MediaEntity> arrayList) {
        if (arrayList != null) {
            this.f165883c = arrayList;
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo230552b(ArrayList<MediaEntity> arrayList) {
        this.f165881a = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f165885e;
        if ((i2 == 2 || i2 == 1) && i == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public int mo230550b(MediaEntity mediaEntity) {
        if (this.f165883c.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < this.f165883c.size(); i++) {
            if (this.f165883c.get(i).f170268a.equals(mediaEntity.f170268a)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo230548a(MediaEntity mediaEntity) {
        int b = mo230550b(mediaEntity);
        if (b == -1) {
            this.f165883c.add(mediaEntity);
        } else {
            this.f165883c.remove(b);
        }
    }

    /* renamed from: a */
    public static void m257983a(final Activity activity, final int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.CAMERA");
        hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
            /* class com.tt.miniapp.chooser.p3267a.C65820b.C658211 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                Uri uri;
                String str;
                File file = new File(activity.getExternalCacheDir(), "image");
                if (file.exists() || file.mkdirs()) {
                    File file2 = new File(file, System.currentTimeMillis() + "-tmp.jpg");
                    C65817a.f165870b = file2.getAbsolutePath();
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (ProcessUtil.isMiniappProcess()) {
                            str = AppbrandContext.getInst().getInitParams().mo234501a(1007, "com.ss.android.uri.fileprovider");
                        } else {
                            str = activity.getApplicationContext().getPackageName() + ".brand";
                        }
                        uri = FileProvider.getUriForFile(activity, str, file2);
                    } else {
                        uri = Uri.fromFile(file2);
                    }
                    intent.putExtra("output", uri);
                    activity.startActivityForResult(intent, i);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m257985b(final Activity activity, final int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.CAMERA");
        hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
            /* class com.tt.miniapp.chooser.p3267a.C65820b.C658233 */

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
                C65817a.f165869a = file.getAbsolutePath();
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

    /* renamed from: com.tt.miniapp.chooser.a.b$a */
    public class C65825a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f165897a;

        public C65825a(View view) {
            super(view);
            this.f165897a = (TextView) view.findViewById(R.id.microapp_m_media_camer_text);
            this.itemView.setLayoutParams(new AbsListView.LayoutParams(-1, C65820b.this.mo230546a()));
            view.setOnClickListener(new View.OnClickListener(C65820b.this) {
                /* class com.tt.miniapp.chooser.p3267a.C65820b.C65825a.View$OnClickListenerC658261 */

                public void onClick(View view) {
                    if (C65820b.this.f165885e == 1) {
                        C65820b.m257983a((Activity) C65820b.this.f165882b, 10);
                    } else if (C65820b.this.f165885e == 2) {
                        C65820b.m257985b((Activity) C65820b.this.f165882b, 9);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m257984a(final IAppContext iAppContext, final int i) {
        final Activity currentActivity = iAppContext.getCurrentActivity();
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.CAMERA");
        hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
            /* class com.tt.miniapp.chooser.p3267a.C65820b.C658222 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                Uri uri;
                Intent intent = new Intent();
                intent.setAction("android.media.action.VIDEO_CAPTURE");
                intent.addCategory("android.intent.category.DEFAULT");
                File externalCacheDir = currentActivity.getExternalCacheDir();
                File file = new File(externalCacheDir, "video/" + System.currentTimeMillis() + ".3pg");
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                C65817a.f165869a = file.getAbsolutePath();
                if (Build.VERSION.SDK_INT >= 24) {
                    uri = FileProvider.getUriForFile(currentActivity, AppbrandContext.getInst().getInitParams().mo234501a(1007, "com.ss.android.uri.fileprovider"), file);
                } else {
                    uri = Uri.fromFile(file);
                }
                intent.putExtra("output", uri);
                AbstractC12888c i = C25529d.m91168i(iAppContext);
                if (i != null) {
                    i.startActivityForResult(intent, i);
                } else {
                    currentActivity.startActivityForResult(intent, i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C65825a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.microapp_m_camer_item_view, viewGroup, false));
        }
        if (i == 1) {
            return new C65827b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.microapp_m_media_view_item, viewGroup, false));
        }
        return null;
    }

    /* renamed from: com.tt.miniapp.chooser.a.b$b */
    public class C65827b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f165901a;

        /* renamed from: b */
        public ImageView f165902b;

        /* renamed from: c */
        public View f165903c;

        /* renamed from: d */
        public TextView f165904d;

        /* renamed from: e */
        public RelativeLayout f165905e;

        public C65827b(View view) {
            super(view);
            this.f165901a = (ImageView) view.findViewById(R.id.microapp_m_media_image);
            this.f165902b = (ImageView) view.findViewById(R.id.microapp_m_check_image);
            this.f165903c = view.findViewById(R.id.microapp_m_mask_view);
            this.f165905e = (RelativeLayout) view.findViewById(R.id.microapp_m_video_info);
            this.f165904d = (TextView) view.findViewById(R.id.microapp_m_textView_size);
            this.itemView.setLayoutParams(new AbsListView.LayoutParams(-1, C65820b.this.mo230546a()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C65825a) {
            C65825a aVar = (C65825a) viewHolder;
            int i2 = this.f165885e;
            if (i2 == 1) {
                aVar.f165897a.setText(this.f165882b.getString(R.string.microapp_m_take_picture));
            } else if (i2 == 2) {
                aVar.f165897a.setText(this.f165882b.getString(R.string.microapp_m_take_video));
            }
        } else {
            int i3 = this.f165885e;
            if (i3 == 1 || i3 == 2) {
                i--;
            }
            if (viewHolder instanceof C65827b) {
                final C65827b bVar = (C65827b) viewHolder;
                final MediaEntity mediaEntity = this.f165881a.get(i);
                if (mediaEntity.f170271d == 3) {
                    String a = C67045l.m261302a(this.f165882b, mediaEntity.f170273f);
                    if (a == null || !new File(a).exists()) {
                        C65830d.m258002a(mediaEntity.f170268a, bVar.f165901a);
                    } else {
                        HostDependManager.getInst().loadImage(this.f165882b, new C65678c(new File(a)).mo229918a().mo229920a(mo230546a(), mo230546a()).mo229922a(bVar.f165901a));
                    }
                } else {
                    HostDependManager.getInst().loadImage(this.f165882b, new C65678c(new File(mediaEntity.f170268a)).mo229918a().mo229920a(mo230546a(), mo230546a()).mo229922a(bVar.f165901a));
                }
                int i4 = 0;
                if (mediaEntity.f170271d == 3) {
                    bVar.f165905e.setVisibility(0);
                    bVar.f165904d.setText(IOUtils.getSizeByUnit((double) mediaEntity.f170272e));
                } else {
                    bVar.f165905e.setVisibility(4);
                }
                int b = mo230550b(mediaEntity);
                View view = bVar.f165903c;
                if (b < 0) {
                    i4 = 4;
                }
                view.setVisibility(i4);
                Drawable drawable = ContextCompat.getDrawable(this.f165882b, R.drawable.microapp_m_btn_selected);
                C0774a.m3766a(C0774a.m3779g(drawable), ContextCompat.getColor(this.f165882b, R.color.primary_pri_500));
                ImageView imageView = bVar.f165902b;
                if (b < 0) {
                    drawable = ContextCompat.getDrawable(this.f165882b, R.drawable.microapp_m_btn_unselected);
                }
                imageView.setImageDrawable(drawable);
                bVar.f165901a.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.chooser.p3267a.C65820b.View$OnClickListenerC658244 */

                    public void onClick(View view) {
                        int i;
                        int b = C65820b.this.mo230550b(mediaEntity);
                        if (((long) C65820b.this.f165883c.size()) < C65820b.this.f165884d || b >= 0) {
                            View view2 = bVar.f165903c;
                            if (b >= 0) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                            view2.setVisibility(i);
                            Drawable drawable = ContextCompat.getDrawable(C65820b.this.f165882b, R.drawable.microapp_m_btn_selected);
                            C0774a.m3766a(C0774a.m3779g(drawable), ContextCompat.getColor(C65820b.this.f165882b, R.color.primary_pri_500));
                            ImageView imageView = bVar.f165902b;
                            if (b >= 0) {
                                drawable = ContextCompat.getDrawable(C65820b.this.f165882b, R.drawable.microapp_m_btn_unselected);
                            }
                            imageView.setImageDrawable(drawable);
                            C65820b.this.mo230548a(mediaEntity);
                            C65820b.this.f165886f.mo230526a(view, mediaEntity, C65820b.this.f165883c);
                            return;
                        }
                        UDToast.show(C65820b.this.f165882b, C65820b.this.f165882b.getString(R.string.microapp_m_msg_amount_limit));
                    }
                });
            }
        }
    }

    public C65820b(int i, ArrayList<MediaEntity> arrayList, Context context, ArrayList<MediaEntity> arrayList2, int i2) {
        if (arrayList2 != null) {
            this.f165883c = arrayList2;
        }
        this.f165884d = (long) i2;
        this.f165881a = arrayList;
        this.f165882b = context;
        this.f165885e = i;
    }
}
