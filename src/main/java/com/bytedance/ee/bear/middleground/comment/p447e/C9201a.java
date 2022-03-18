package com.bytedance.ee.bear.middleground.comment.p447e;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.AbstractC6317a;
import com.bytedance.ee.bear.imageviewer.C7842a;
import com.bytedance.ee.bear.middleground.comment.export.C9225l;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.p447e.C9201a;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.comment.e.a */
public class C9201a extends RecyclerView.Adapter<C9205d> {

    /* renamed from: a */
    public Drawable f24730a;

    /* renamed from: b */
    public int f24731b;

    /* renamed from: c */
    public C7842a f24732c = new C7842a(C5234y.m21391b());

    /* renamed from: d */
    public String f24733d;

    /* renamed from: e */
    public int f24734e;

    /* renamed from: f */
    public AbstractC9203b f24735f;

    /* renamed from: g */
    public AbstractC9202a f24736g;

    /* renamed from: h */
    public AbstractC9204c f24737h;

    /* renamed from: i */
    public LifecycleOwner f24738i;

    /* renamed from: j */
    public Map<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity, String> f24739j = new HashMap();

    /* renamed from: k */
    private C10917c f24740k = new C10917c(new C10929e());

    /* renamed from: l */
    private boolean f24741l = true;

    /* renamed from: m */
    private List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> f24742m = new ArrayList();

    /* renamed from: n */
    private C68289a f24743n = new C68289a();

    /* renamed from: com.bytedance.ee.bear.middleground.comment.e.a$a */
    public interface AbstractC9202a {
        /* renamed from: a */
        void mo34525a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.comment.e.a$b */
    public interface AbstractC9203b {
        /* renamed from: a */
        void mo34920a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.comment.e.a$c */
    public interface AbstractC9204c {
        /* renamed from: a */
        void mo34540a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity);
    }

    /* renamed from: b */
    public List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> mo34917b() {
        return this.f24742m;
    }

    /* renamed from: a */
    public void mo34914a(List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        this.f24743n.dispose();
        this.f24742m.clear();
        if (list == null || list.isEmpty()) {
            notifyDataSetChanged();
        } else {
            mo34919b(list);
        }
    }

    /* renamed from: a */
    public void mo34915a(boolean z) {
        this.f24741l = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public boolean mo34916a() {
        return this.f24741l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f24742m.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.comment.e.a$d */
    public class C9205d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f24744a;

        /* renamed from: b */
        ImageView f24745b;

        /* renamed from: c */
        String f24746c;

        /* renamed from: d */
        Runnable f24747d;

        /* renamed from: a */
        public void mo34921a() {
            Runnable runnable = this.f24747d;
            if (runnable != null) {
                C13742g.m55710c(runnable);
                this.f24747d = null;
            }
        }

        /* renamed from: a */
        public void mo34922a(ImageView imageView) {
            imageView.setImageDrawable(C9201a.this.f24730a);
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.middleground.comment.e.a$d$b */
        public class C9212b implements AbstractC6317a.AbstractC6318a {

            /* renamed from: a */
            C1177w<C9211a> f24772a;

            /* renamed from: b */
            long f24773b;

            @Override // com.bytedance.ee.bear.drive.AbstractC6317a.AbstractC6318a
            /* renamed from: a */
            public void mo25411a(String str) {
                this.f24773b = System.currentTimeMillis();
                this.f24772a.mo5926a(new C9211a(1));
            }

            public C9212b(C1177w<C9211a> wVar) {
                this.f24772a = wVar;
            }

            @Override // com.bytedance.ee.bear.drive.AbstractC6317a.AbstractC6318a
            /* renamed from: a */
            public void mo25412a(String str, String str2) {
                if (this.f24773b != 0) {
                    C9201a.this.f24732c.mo30647a("commentCardDrive", new File(str2).length(), System.currentTimeMillis() - this.f24773b);
                }
                this.f24772a.mo5926a(new C9211a(3, str2));
            }

            @Override // com.bytedance.ee.bear.drive.AbstractC6317a.AbstractC6318a
            /* renamed from: a */
            public void mo25413a(String str, String str2, int i) {
                C13479a.m54764b("CommentImageAdapter", "onDownloadFail()... key = " + str2 + ", errorCode = " + i);
                if (this.f24773b != 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f24773b;
                    C7842a aVar = C9201a.this.f24732c;
                    aVar.mo30648a("commentCardDrive", -1, currentTimeMillis, "errorCode = " + i);
                }
                this.f24772a.mo5926a(new C9211a(2));
            }
        }

        /* renamed from: a */
        public void mo34925a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
            this.itemView.setTag(commentImageEntity);
            mo34921a();
            if (C9201a.this.f24731b > 0) {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                int i = C9201a.this.f24731b;
                layoutParams.width = i;
                layoutParams.height = i;
                this.itemView.setLayoutParams(layoutParams);
            }
            m38049a(this.f24744a, C9201a.this.f24739j.get(commentImageEntity), commentImageEntity.getOriginalSrc());
        }

        /* access modifiers changed from: protected */
        /* renamed from: com.bytedance.ee.bear.middleground.comment.e.a$d$a */
        public class C9211a {

            /* renamed from: a */
            int f24769a;

            /* renamed from: b */
            String f24770b;

            public C9211a(int i) {
                this.f24769a = i;
            }

            public C9211a(int i, String str) {
                this.f24769a = i;
                this.f24770b = str;
            }
        }

        /* renamed from: a */
        private void m38048a(Drawable drawable, ImageView imageView) {
            C13479a.m54758a("CommentImageAdapter", "loadResourceFailed():");
            imageView.setImageResource(R.drawable.comment_load_image_fail);
        }

        public C9205d(final View view) {
            super(view);
            int i;
            this.f24744a = (ImageView) view.findViewById(R.id.iv_selected_comment_image);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_delete_selected_comment_image);
            this.f24745b = imageView;
            imageView.setOnClickListener(new AbstractView$OnClickListenerC11839e(C9201a.this) {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.C9201a.C9205d.C92061 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity = (CommentBean.CommentDetail.ExtraEntity.CommentImageEntity) view.getTag();
                    if (commentImageEntity != null) {
                        if (C9201a.this.f24735f != null) {
                            C9201a.this.f24735f.mo34920a(commentImageEntity);
                        }
                        C9201a.this.mo34912a(commentImageEntity);
                    }
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener(C9201a.this) {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.C9201a.C9205d.View$OnLongClickListenerC92072 */

                public boolean onLongClick(View view) {
                    CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity = (CommentBean.CommentDetail.ExtraEntity.CommentImageEntity) view.getTag();
                    if (commentImageEntity == null || C9201a.this.f24737h == null) {
                        return true;
                    }
                    C9201a.this.f24737h.mo34540a(commentImageEntity);
                    return true;
                }
            });
            view.setOnClickListener(new AbstractView$OnClickListenerC11839e(C9201a.this) {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.C9201a.C9205d.C92083 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity = (CommentBean.CommentDetail.ExtraEntity.CommentImageEntity) view.getTag();
                    if (commentImageEntity != null && C9201a.this.f24736g != null) {
                        C9201a.this.f24736g.mo34525a(commentImageEntity);
                    }
                }
            });
            ComponentCallbacks2C2115c.m9141a(this.f24744a);
            ImageView imageView2 = this.f24745b;
            if (C9201a.this.mo34916a()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
        }

        /* renamed from: a */
        private void m38049a(ImageView imageView, String str, String str2) {
            this.f24746c = str;
            if (C13681h.m55561a(str)) {
                if (((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20410a(str)) {
                    C13479a.m54772d("CommentImageAdapter", "driveDownloadForLoad: " + str);
                    mo34923a(imageView, str, str2, DownloadRequestInfo.DownloadType.IMG);
                    return;
                }
                C13479a.m54772d("CommentImageAdapter", "glideDownloadForLoad: " + str);
                mo34924a(imageView, str, str2, true, false);
            } else if (((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20411b(str)) {
                C13479a.m54772d("CommentImageAdapter", "loadLocalImageFile: " + str);
                mo34926a(new File(str), str2, imageView);
            } else if (!TextUtils.isEmpty(str)) {
                C13479a.m54772d("CommentImageAdapter", "loadLocalImageFile: " + str);
                mo34926a(new File(str), str2, imageView);
            } else {
                C13479a.m54758a("CommentImageAdapter", "Image url is empty! ");
                this.f24744a.setImageResource(R.drawable.comment_load_image_fail);
            }
        }

        /* renamed from: a */
        public void mo34926a(File file, String str, ImageView imageView) {
            if (file == null || imageView == null || !file.exists()) {
                C13479a.m54758a("CommentImageAdapter", "loadLocalImageFile(): file is null ,view = " + imageView);
                mo34924a(imageView, str, str, true, false);
                return;
            }
            ((C2124f) ComponentCallbacks2C2115c.m9141a(imageView).mo10411a(file).mo11143c((int) R.drawable.comment_load_image_fail)).mo10399a(imageView);
        }

        /* renamed from: a */
        public void mo34927a(String str, String str2, ImageView imageView) {
            if (TextUtils.equals(str, str2) || TextUtils.isEmpty(str2)) {
                m38048a(null, imageView);
            } else {
                mo34924a(imageView, str2, str2, true, false);
            }
        }

        /* renamed from: a */
        public void mo34923a(ImageView imageView, String str, String str2, DownloadRequestInfo.DownloadType downloadType) {
            boolean z;
            ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
            C1177w wVar = new C1177w();
            C13748k.m55732a(new Runnable(wVar, imageView, downloadType, str, str2) {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$d$nEScNdOh8PITGjU74BIIRExFGrQ */
                public final /* synthetic */ C1177w f$1;
                public final /* synthetic */ ImageView f$2;
                public final /* synthetic */ DownloadRequestInfo.DownloadType f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ String f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    C9201a.C9205d.this.m38050a((C9201a.C9205d) this.f$1, (C1177w) this.f$2, (ImageView) this.f$3, (DownloadRequestInfo.DownloadType) this.f$4, this.f$5);
                }
            });
            AbstractC6317a aVar = (AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class);
            if (b == null || b.mo20041b()) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo20409a(str, z, new C9212b(wVar), downloadType, C9201a.this.f24733d, C9201a.this.f24734e);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m38050a(C1177w wVar, final ImageView imageView, final DownloadRequestInfo.DownloadType downloadType, final String str, final String str2) {
            wVar.mo5923a(C9201a.this.f24738i, new AbstractC1178x<C9211a>() {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.C9201a.C9205d.C92094 */

                /* renamed from: a */
                public void onChanged(C9211a aVar) {
                    if (aVar != null) {
                        int i = aVar.f24769a;
                        if (i == 1) {
                            C9205d.this.mo34922a(imageView);
                        } else if (i != 2) {
                            if (i == 3) {
                                C9205d.this.mo34926a(new File(aVar.f24770b), str2, imageView);
                            }
                        } else if (downloadType == DownloadRequestInfo.DownloadType.IMG) {
                            C9205d.this.mo34923a(imageView, str, str2, DownloadRequestInfo.DownloadType.COVER);
                        } else {
                            C9205d.this.mo34927a(str, str2, imageView);
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo34924a(final ImageView imageView, final String str, final String str2, final boolean z, final boolean z2) {
            String str3;
            if (!C13726a.m55674a(imageView.getContext())) {
                C13479a.m54758a("CommentImageAdapter", "Activity is not active.");
                return;
            }
            ComponentCallbacks2C2126g a = ComponentCallbacks2C2115c.m9141a(imageView);
            if (z2) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ((C2124f) ((C2124f) a.mo10414a(new C9213b(str3)).mo11125a(C9201a.this.f24730a)).mo11143c(R.drawable.comment_load_image_fail)).mo10401b((AbstractC2536f) new AbstractC2536f<Drawable>() {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.C9201a.C9205d.C92105 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m38061a(ImageView imageView, String str, String str2) {
                    C9205d.this.mo34924a(imageView, str, str2, false, false);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m38063b(ImageView imageView, String str, String str2) {
                    C9205d.this.mo34924a(imageView, str, str2, false, true);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m38062a(String str, ImageView imageView, String str2) {
                    if (TextUtils.equals(str, C9205d.this.f24746c)) {
                        C13479a.m54772d("CommentImageAdapter", "onLoadFailed，retry...");
                        C13742g.m55705a(new Runnable(imageView, str, str2) {
                            /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$d$5$UaP_owoBQ9rQTIXBQNwVBN3vLVI */
                            public final /* synthetic */ ImageView f$1;
                            public final /* synthetic */ String f$2;
                            public final /* synthetic */ String f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            public final void run() {
                                C9201a.C9205d.C92105.this.m38063b(this.f$1, this.f$2, this.f$3);
                            }
                        });
                    } else {
                        C13479a.m54772d("CommentImageAdapter", "path changed, no retry...");
                    }
                    C9205d.this.f24747d = null;
                }

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
                    C13479a.m54758a("CommentImageAdapter", "onLoadFailed， error.");
                    if (!TextUtils.equals(str, C9205d.this.f24746c)) {
                        return false;
                    }
                    if (z) {
                        C9205d.this.f24747d = new Runnable(str, imageView, str2) {
                            /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$d$5$vadcU1Z9BGWcFoeSMmrj3evnRNw */
                            public final /* synthetic */ String f$1;
                            public final /* synthetic */ ImageView f$2;
                            public final /* synthetic */ String f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            public final void run() {
                                C9201a.C9205d.C92105.this.m38062a((C9201a.C9205d.C92105) this.f$1, (String) this.f$2, (ImageView) this.f$3);
                            }
                        };
                        C13742g.m55706a(C9205d.this.f24747d, 2000);
                        return true;
                    } else if (z2) {
                        C13479a.m54772d("CommentImageAdapter", "onLoadFailed retry originalUrl...");
                        C13742g.m55705a(new Runnable(imageView, str, str2) {
                            /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$d$5$whAm3gDXvL5GCel4Pyks54D6Rs */
                            public final /* synthetic */ ImageView f$1;
                            public final /* synthetic */ String f$2;
                            public final /* synthetic */ String f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            public final void run() {
                                C9201a.C9205d.C92105.this.m38061a((C9201a.C9205d.C92105) this.f$1, (ImageView) this.f$2, this.f$3);
                            }
                        });
                        return true;
                    } else {
                        C13479a.m54758a("CommentImageAdapter", "onLoadFailed. Has tried three times...");
                        return false;
                    }
                }

                /* renamed from: a */
                public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
                    C13479a.m54764b("CommentImageAdapter", "onResourceReady dataSource=" + dataSource);
                    return false;
                }
            }).mo10399a(imageView);
        }
    }

    /* renamed from: a */
    public void mo34906a(int i) {
        this.f24734e = i;
    }

    /* renamed from: b */
    public void mo34918b(int i) {
        this.f24731b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m38028b(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
        this.f24742m.remove(commentImageEntity);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f24743n.dispose();
    }

    /* renamed from: a */
    public void mo34907a(AbstractC9202a aVar) {
        this.f24736g = aVar;
    }

    public C9201a(FragmentActivity fragmentActivity) {
        this.f24738i = fragmentActivity;
        this.f24730a = new ColorDrawable(fragmentActivity.getResources().getColor(R.color.space_kit_n300));
    }

    /* renamed from: a */
    public void mo34908a(AbstractC9203b bVar) {
        this.f24735f = bVar;
    }

    /* renamed from: b */
    public void mo34919b(List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        if (list != null && !list.isEmpty()) {
            if (this.f24743n.isDisposed()) {
                this.f24743n = new C68289a();
            }
            this.f24743n.mo237937a(AbstractC68307f.m265083a((Object) list).mo237985a(C11678b.m48480d()).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$0L7ruMbswf0CeE9NNiRXjUUfUOs */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C9201a.this.m38029c((List) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(list) {
                /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$l7XsZeaneBo_m8UDkRnlxJK4aU */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9201a.this.m38027a((C9201a) this.f$1, (List) obj);
                }
            }, $$Lambda$a$lAJ06Ef5qAkHbhGdXsOZibEgH_g.INSTANCE));
        }
    }

    /* renamed from: a */
    public void mo34909a(AbstractC9204c cVar) {
        this.f24737h = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ List m38029c(List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity = (CommentBean.CommentDetail.ExtraEntity.CommentImageEntity) it.next();
            String token = commentImageEntity.getToken();
            if (!TextUtils.isEmpty(token)) {
                String d = ((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20413d(C9225l.m38236a(commentImageEntity.getToken()));
                if (!TextUtils.isEmpty(d)) {
                    C13479a.m54764b("CommentImageAdapter", "get localPath from memory cache success.");
                    this.f24739j.put(commentImageEntity, d);
                } else {
                    String f = ((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20415f(token);
                    if (!TextUtils.isEmpty(f)) {
                        C13479a.m54764b("CommentImageAdapter", "get localPath from OfflineDB success.");
                        this.f24739j.put(commentImageEntity, f);
                    }
                }
            }
            String src = commentImageEntity.getSrc();
            String d2 = ((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20413d(src);
            if (!TextUtils.isEmpty(d2)) {
                this.f24739j.put(commentImageEntity, d2);
                C13479a.m54772d("CommentImageAdapter", "Convert src[" + src + "] to path[" + d2 + "]");
            } else {
                String d3 = ((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20413d(commentImageEntity.getOriginalSrc());
                if (!TextUtils.isEmpty(d3)) {
                    this.f24739j.put(commentImageEntity, d3);
                    C13479a.m54772d("CommentImageAdapter", "Convert originalSrc[" + src + "] to path[" + d3 + "]");
                } else if (TextUtils.isEmpty(src)) {
                    this.f24739j.put(commentImageEntity, commentImageEntity.getOriginalSrc());
                    C13479a.m54772d("CommentImageAdapter", "Invalid src [" + src + "]");
                } else {
                    this.f24739j.put(commentImageEntity, src);
                    C13479a.m54772d("CommentImageAdapter", "Convert failed. Use origin src[" + src + "]");
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    public void onViewRecycled(C9205d dVar) {
        super.onViewRecycled(dVar);
        ComponentCallbacks2C2115c.m9141a(dVar.f24744a).mo10416a((View) dVar.f24744a);
        dVar.mo34921a();
    }

    /* renamed from: a */
    public void mo34912a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
        C13742g.m55705a(new Runnable(commentImageEntity) {
            /* class com.bytedance.ee.bear.middleground.comment.p447e.$$Lambda$a$ltzC4IkSybbHvxGYic8mPZrdr8E */
            public final /* synthetic */ CommentBean.CommentDetail.ExtraEntity.CommentImageEntity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9201a.this.m38028b((C9201a) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo34913a(String str) {
        this.f24733d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38027a(List list, List list2) throws Exception {
        this.f24742m.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C9205d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9205d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_selected_image_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C9205d dVar, int i) {
        if (i < this.f24742m.size()) {
            dVar.mo34925a(this.f24742m.get(i));
        }
    }
}
