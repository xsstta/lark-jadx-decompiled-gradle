package com.ss.android.lark.keyboard.plugin.tool.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38826d;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoPickerParam;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoPreviewPickerParam;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.utils.C57759a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import com.ss.android.lark.widget.photo_picker.p2943a.AbstractC58562a;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58609a;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58611c;
import com.ss.android.lark.widget.photo_picker.p2951f.C58654f;
import com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LarkPhotoPickerView extends FrameLayout {

    /* renamed from: A */
    private int f104213A;

    /* renamed from: B */
    private boolean f104214B;

    /* renamed from: C */
    private final boolean f104215C;

    /* renamed from: D */
    private final ContentObserver f104216D;

    /* renamed from: a */
    public UDCheckBox f104217a;

    /* renamed from: b */
    public View f104218b;

    /* renamed from: c */
    public C40989b f104219c;

    /* renamed from: d */
    public int f104220d;

    /* renamed from: e */
    public int f104221e;

    /* renamed from: f */
    public int f104222f;

    /* renamed from: g */
    public boolean f104223g;

    /* renamed from: h */
    public boolean f104224h;

    /* renamed from: i */
    public AbstractC40987a f104225i;

    /* renamed from: j */
    public boolean f104226j;

    /* renamed from: k */
    public boolean f104227k;

    /* renamed from: l */
    public boolean f104228l;

    /* renamed from: m */
    public boolean f104229m;

    /* renamed from: n */
    public boolean f104230n;

    /* renamed from: o */
    public boolean f104231o;

    /* renamed from: p */
    Runnable f104232p;

    /* renamed from: q */
    private View f104233q;

    /* renamed from: r */
    private TextView f104234r;

    /* renamed from: s */
    private LinearLayoutManager f104235s;

    /* renamed from: t */
    private TextView f104236t;

    /* renamed from: u */
    private LinearLayout f104237u;

    /* renamed from: v */
    private ViewGroup f104238v;

    /* renamed from: w */
    private ViewGroup f104239w;

    /* renamed from: x */
    private View f104240x;

    /* renamed from: y */
    private int f104241y;

    /* renamed from: z */
    private List<Photo> f104242z;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView$a */
    public interface AbstractC40987a {

        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView$a$a */
        public interface AbstractC40988a {
            /* renamed from: a */
            void mo147723a(int i);

            /* renamed from: a */
            void mo147724a(List<Photo> list, boolean z);

            /* renamed from: b */
            void mo147725b(int i);
        }

        /* renamed from: a */
        void mo147719a();

        /* renamed from: a */
        void mo147720a(PhotoPickerParam photoPickerParam);

        /* renamed from: a */
        void mo147721a(PhotoPreviewPickerParam photoPreviewPickerParam);

        /* renamed from: b */
        AbstractC40988a mo147722b();
    }

    /* renamed from: j */
    private boolean m162437j() {
        return this.f104231o;
    }

    /* renamed from: c */
    public void mo147691c() {
        m162435h();
    }

    /* renamed from: a */
    public void mo147686a(boolean z) {
        if (new C51331a((Activity) getContext()).mo176921a("android.permission.READ_EXTERNAL_STORAGE")) {
            this.f104224h = true;
            m162433b(z);
            Log.m165389i("LarkPhotoPickerView", "load Media ok");
            return;
        }
        Log.m165389i("LarkPhotoPickerView", "load Media no permission");
    }

    /* renamed from: a */
    public boolean mo147688a(Photo photo) {
        if (this.f104215C && !m162437j()) {
            return true;
        }
        if (this.f104219c.mo198543f()) {
            if (this.f104225i != null) {
                if (photo.isVideo()) {
                    this.f104225i.mo147722b().mo147725b(R.string.Lark_Legacy_PickerJustOneVideoTip);
                } else {
                    this.f104225i.mo147722b().mo147725b(R.string.Lark_Legacy_SelectPhotosOrVideosError);
                }
            }
            return false;
        } else if (!photo.isVideo()) {
            return true;
        } else {
            AbstractC40987a aVar = this.f104225i;
            if (aVar != null) {
                aVar.mo147722b().mo147725b(R.string.Lark_Legacy_SelectPhotosOrVideosError);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView$b */
    public class C40989b extends AbstractC58562a<C40994a> {

        /* renamed from: a */
        public final List<Photo> f104257a;

        /* renamed from: b */
        public AbstractC58611c f104258b;

        /* renamed from: g */
        private Context f104260g;

        /* renamed from: h */
        private AbstractC58609a f104261h;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f104257a.size();
        }

        /* renamed from: g */
        private void m162463g() {
            Iterator<Photo> it = mo198540c().iterator();
            while (it.hasNext()) {
                if (!this.f104257a.contains(it.next())) {
                    it.remove();
                }
            }
        }

        /* renamed from: a */
        public void mo147729a(AbstractC58609a aVar) {
            this.f104261h = aVar;
        }

        /* renamed from: a */
        public void mo147730a(AbstractC58611c cVar) {
            this.f104258b = cVar;
        }

        private C40989b() {
            this.f104257a = new ArrayList();
        }

        /* renamed from: a */
        public void mo147732a(List<PhotoDirectory> list) {
            this.f144569d = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f104260g = recyclerView.getContext();
        }

        /* renamed from: a */
        public void mo147731a(PhotoDirectory photoDirectory) {
            List<Photo> photos = photoDirectory.getPhotos();
            if (photos != null) {
                this.f104257a.clear();
                this.f104257a.addAll(photos);
                m162463g();
                notifyDataSetChanged();
                LarkPhotoPickerView.this.mo147681a(mo198538b());
            }
        }

        /* renamed from: a */
        public C40994a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C40994a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kb_item_chat_tool_box_photo, viewGroup, false));
        }

        /* renamed from: a */
        public void mo147727a(int i, Photo photo) {
            boolean z;
            int i2;
            AbstractC58609a aVar = this.f104261h;
            boolean z2 = true;
            if (aVar != null) {
                int size = mo198540c().size();
                if (mo198537a(photo)) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                z = aVar.mo147717a(i, photo, size + i2);
            } else {
                z = true;
            }
            if (z) {
                mo198539b(photo);
            }
            LarkPhotoPickerView larkPhotoPickerView = LarkPhotoPickerView.this;
            if (larkPhotoPickerView.f104222f >= LarkPhotoPickerView.this.f104220d) {
                z2 = false;
            }
            larkPhotoPickerView.setCameraBtnEnable(z2);
            notifyDataSetChanged();
            LarkPhotoPickerView.this.mo147693e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView$b$a */
        public class C40994a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            ImageView f104270a;

            /* renamed from: b */
            AppCompatCheckBox f104271b = ((AppCompatCheckBox) this.itemView.findViewById(R.id.v_selected));

            /* renamed from: c */
            View f104272c = this.itemView.findViewById(R.id.v_selected_region);

            /* renamed from: d */
            View f104273d = this.itemView.findViewById(R.id.v_mask);

            /* renamed from: e */
            TextView f104274e = ((TextView) this.itemView.findViewById(R.id.tv_duration));

            C40994a(View view) {
                super(view);
                this.f104270a = (ImageView) view.findViewById(R.id.image_photo_preview);
            }
        }

        /* renamed from: a */
        public void onBindViewHolder(final C40994a aVar, int i) {
            Object obj;
            final Photo photo = this.f104257a.get(i);
            if (C57759a.m224180a(aVar.f104270a.getContext())) {
                String path = photo.getPath();
                if (photo.isVideo()) {
                    obj = new C38826d(path);
                } else {
                    obj = new File(path);
                }
                IRequestCreator centerCrop = ImageLoader.with(this.f104260g).load(obj).centerCrop();
                if (path.toLowerCase().endsWith(".gif")) {
                    centerCrop.diskCacheStrategy(DiskCacheStrategy.SOURCE).dontAnimate(false);
                }
                centerCrop.placeholder(R.drawable.kb_photo_pick_item_holder).error(R.drawable.kb_photo_pick_item_holder).listener(new AbstractC38817h() {
                    /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C40989b.C409901 */

                    @Override // com.ss.android.lark.image.api.AbstractC38817h
                    /* renamed from: a */
                    public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                        PerfGalleryLoadMonitor.f145397a.mo199288b();
                        return false;
                    }

                    @Override // com.ss.android.lark.image.api.AbstractC38817h
                    /* renamed from: a */
                    public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                        PerfGalleryLoadMonitor.f145397a.mo199286a();
                        return false;
                    }
                }).into(aVar.f104270a);
            }
            boolean a = mo198537a(photo);
            if (photo.isVideo()) {
                aVar.f104274e.setVisibility(0);
                aVar.f104274e.setText(C26279i.m95149a((int) photo.getDuration()));
            } else {
                aVar.f104274e.setVisibility(8);
            }
            aVar.f104271b.setChecked(a);
            if (a) {
                aVar.f104271b.setText(String.valueOf(LarkPhotoPickerView.this.f104219c.mo198540c().indexOf(photo) + 1));
            } else {
                aVar.f104271b.setText("");
            }
            aVar.f104270a.setSelected(a);
            aVar.f104273d.setVisibility(8);
            if (!a && LarkPhotoPickerView.this.mo147690b(photo)) {
                aVar.f104273d.setVisibility(0);
            }
            aVar.f104270a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C40989b.View$OnClickListenerC409912 */

                public void onClick(View view) {
                    int adapterPosition = aVar.getAdapterPosition();
                    if (C40989b.this.f104258b != null && adapterPosition != -1) {
                        C40989b.this.f104258b.mo147710a(view, adapterPosition, false);
                    }
                }
            });
            aVar.f104272c.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C40989b.View$OnClickListenerC409923 */

                public void onClick(View view) {
                    aVar.f104271b.performClick();
                }
            });
            aVar.f104271b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C40989b.View$OnClickListenerC409934 */

                public void onClick(View view) {
                    int adapterPosition = aVar.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C40989b.this.mo147727a(adapterPosition, photo);
                    }
                }
            });
        }
    }

    private AbstractC58609a getOnItemCheckListener() {
        return new AbstractC58609a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C409836 */

            @Override // com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58609a
            /* renamed from: a */
            public boolean mo147717a(int i, Photo photo, int i2) {
                boolean a = LarkPhotoPickerView.this.f104219c.mo198537a(photo);
                if (LarkPhotoPickerView.this.f104220d == 1) {
                    if (LarkPhotoPickerView.this.f104222f + 1 <= LarkPhotoPickerView.this.f104220d || a != 0) {
                        LarkPhotoPickerView.this.f104217a.setEnabled(true);
                        LarkPhotoPickerView.this.f104218b.setEnabled(true);
                        LarkPhotoPickerView.this.f104222f = !a;
                        LarkPhotoPickerView larkPhotoPickerView = LarkPhotoPickerView.this;
                        larkPhotoPickerView.mo147681a(larkPhotoPickerView.f104222f);
                        return true;
                    }
                    LarkPhotoPickerView.this.f104225i.mo147722b().mo147723a(LarkPhotoPickerView.this.f104220d);
                    return false;
                } else if (LarkPhotoPickerView.this.f104220d <= 0) {
                    LarkPhotoPickerView.this.f104217a.setEnabled(false);
                    LarkPhotoPickerView.this.f104217a.setChecked(false);
                    LarkPhotoPickerView.this.f104218b.setEnabled(false);
                    if (LarkPhotoPickerView.this.f104227k && photo.isVideo()) {
                        LarkPhotoPickerView.this.f104225i.mo147722b().mo147725b(R.string.Lark_Legacy_PickerJustOneVideoTip);
                    } else if (!LarkPhotoPickerView.this.f104227k || photo.isVideo()) {
                        LarkPhotoPickerView.this.f104225i.mo147722b().mo147723a(LarkPhotoPickerView.this.f104220d);
                    } else {
                        LarkPhotoPickerView.this.f104225i.mo147722b().mo147725b(R.string.Lark_Legacy_SelectPhotosOrVideosError);
                    }
                    return false;
                } else {
                    LarkPhotoPickerView.this.f104222f = i2;
                    if (LarkPhotoPickerView.this.f104219c.mo198538b() > 0 && !a && !LarkPhotoPickerView.this.mo147688a(photo)) {
                        return false;
                    }
                    if (i2 > LarkPhotoPickerView.this.f104220d) {
                        if (LarkPhotoPickerView.this.f104225i != null) {
                            LarkPhotoPickerView.this.f104225i.mo147722b().mo147723a(LarkPhotoPickerView.this.f104220d);
                        }
                        return false;
                    }
                    if (C40682g.m160850a().mo133171a("messenger.send_video.original")) {
                        LarkPhotoPickerView.this.f104217a.setEnabled(true);
                        LarkPhotoPickerView.this.f104218b.setEnabled(true);
                    } else if (a || !photo.isVideo()) {
                        LarkPhotoPickerView.this.f104217a.setEnabled(true);
                        LarkPhotoPickerView.this.f104218b.setEnabled(true);
                    } else {
                        LarkPhotoPickerView.this.f104217a.setEnabled(false);
                        LarkPhotoPickerView.this.f104217a.setChecked(false);
                        LarkPhotoPickerView.this.f104218b.setEnabled(false);
                    }
                    LarkPhotoPickerView.this.mo147681a(i2);
                    return true;
                }
            }
        };
    }

    /* renamed from: h */
    private void m162435h() {
        mo147686a(false);
    }

    /* renamed from: f */
    public void mo147694f() {
        this.f104237u.setVisibility(8);
    }

    /* renamed from: k */
    private boolean m162438k() {
        if (this.f104222f >= this.f104220d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo147692d() {
        this.f104219c.mo198535a();
        this.f104222f = 0;
        mo147681a(0);
    }

    /* renamed from: g */
    private void m162434g() {
        LayoutInflater.from(getContext()).inflate(R.layout.kb_chat_tool_box_photo_view, (ViewGroup) this, true);
        m162436i();
    }

    /* renamed from: a */
    public boolean mo147687a() {
        if (!this.f104224h) {
            m162435h();
            Log.m165389i("LarkPhotoPickerView", "startScan success");
            return true;
        }
        Log.m165389i("LarkPhotoPickerView", "startScan fail");
        return false;
    }

    /* renamed from: b */
    public void mo147689b() {
        this.f104224h = false;
        mo147692d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_photo);
        if (recyclerView != null && this.f104219c.getItemCount() > 0) {
            recyclerView.scrollToPosition(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f104216D);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().getContentResolver().unregisterContentObserver(this.f104216D);
    }

    /* renamed from: e */
    public void mo147693e() {
        int findLastVisibleItemPosition = this.f104235s.findLastVisibleItemPosition();
        if (findLastVisibleItemPosition >= 0) {
            m162429a(this.f104235s.findViewByPosition(findLastVisibleItemPosition));
            int i = findLastVisibleItemPosition - 1;
            if (i >= 0) {
                m162432b(this.f104235s.findViewByPosition(i));
            }
        }
    }

    /* renamed from: i */
    private void m162436i() {
        this.f104237u = (LinearLayout) findViewById(R.id.photo_permission_denied_layout);
        this.f104234r = (TextView) findViewById(R.id.btn_photo_send);
        this.f104233q = findViewById(R.id.layout_photo_send);
        this.f104217a = (UDCheckBox) findViewById(R.id.cb_original_photo);
        this.f104218b = findViewById(R.id.original_label);
        this.f104238v = (ViewGroup) findViewById(R.id.preview_container);
        this.f104239w = (ViewGroup) findViewById(R.id.layout_original_photo);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_photo);
        this.f104240x = findViewById(R.id.camera_btn);
        C409869 r4 = new LinearLayoutManager(getContext(), 0, false) {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C409869 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                super.onLayoutCompleted(state);
                LarkPhotoPickerView.this.mo147693e();
            }
        };
        this.f104235s = r4;
        recyclerView.setLayoutManager(r4);
        C40989b bVar = new C40989b();
        this.f104219c = bVar;
        recyclerView.setAdapter(bVar);
        this.f104219c.mo147729a(getOnItemCheckListener());
        this.f104219c.mo147730a(new AbstractC58611c() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58611c
            /* renamed from: a */
            public void mo147710a(View view, int i, boolean z) {
                if (z) {
                    i--;
                }
                List<Photo> e = LarkPhotoPickerView.this.f104219c.mo198542e();
                LarkPhotoPickerView larkPhotoPickerView = LarkPhotoPickerView.this;
                larkPhotoPickerView.mo147684a(e, i, view, larkPhotoPickerView.f104219c.mo198540c());
            }
        });
        findViewById(R.id.btn_photo_album).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AnonymousClass11 */

            public void onClick(View view) {
                new PhotoKBPluginHitPoint("view").mo147285c();
                LarkPhotoPickerView.this.f104225i.mo147720a(new PhotoPickerParam.C40996a().mo147760a(LarkPhotoPickerView.this.f104220d).mo147764b(LarkPhotoPickerView.this.f104221e).mo147769f(false).mo147762a(LarkPhotoPickerView.this.f104226j).mo147772i(!LarkPhotoPickerView.this.f104231o).mo147765b(LarkPhotoPickerView.this.f104227k).mo147771h(true).mo147770g(LarkPhotoPickerView.this.f104223g).mo147773j(true).mo147761a(new ArrayList(LarkPhotoPickerView.this.f104219c.mo198540c())).mo147766c(LarkPhotoPickerView.this.f104230n).mo147767d(LarkPhotoPickerView.this.f104228l).mo147768e(LarkPhotoPickerView.this.f104229m).mo147763a());
            }
        });
        this.f104240x.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AnonymousClass12 */

            public void onClick(View view) {
                if (LarkPhotoPickerView.this.f104225i != null) {
                    new PhotoKBPluginHitPoint("camera").mo147285c();
                    LarkPhotoPickerView.this.f104225i.mo147719a();
                }
            }
        });
        this.f104234r = (TextView) findViewById(R.id.btn_photo_send);
        this.f104233q = findViewById(R.id.layout_photo_send);
        this.f104236t = (TextView) findViewById(R.id.btn_photo_preview);
        this.f104233q.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AnonymousClass13 */

            public void onClick(View view) {
                new PhotoKBPluginHitPoint("send").mo147285c();
                LarkPhotoPickerView.this.mo147685a(new ArrayList(LarkPhotoPickerView.this.f104219c.mo198540c()), LarkPhotoPickerView.this.f104223g);
            }
        });
        this.f104217a.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AnonymousClass14 */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                LarkPhotoPickerView.this.f104223g = z;
                if (z) {
                    new PhotoKBPluginHitPoint("picture").mo147285c();
                }
            }
        });
        this.f104239w.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.View$OnClickListenerC409792 */

            public void onClick(View view) {
                if (LarkPhotoPickerView.this.f104217a.isEnabled()) {
                    LarkPhotoPickerView.this.f104217a.setChecked(!LarkPhotoPickerView.this.f104217a.isChecked());
                }
            }
        });
        ((TextView) findViewById(R.id.btn_photo_permission_denied)).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.View$OnClickListenerC409803 */

            public void onClick(View view) {
                C26323w.m95322a(LarkPhotoPickerView.this.getContext());
            }
        });
        this.f104236t.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.View$OnClickListenerC409814 */

            public void onClick(View view) {
                new PhotoKBPluginHitPoint("preview").mo147285c();
                if (LarkPhotoPickerView.this.f104219c.mo198540c().size() != 0) {
                    LarkPhotoPickerView larkPhotoPickerView = LarkPhotoPickerView.this;
                    larkPhotoPickerView.mo147683a(larkPhotoPickerView.getContext(), LarkPhotoPickerView.this.f104219c.mo198540c(), 0, LarkPhotoPickerView.this.f104219c.mo198540c());
                }
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C409825 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                LarkPhotoPickerView.this.mo147693e();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                LarkPhotoPickerView.this.mo147693e();
            }
        });
        recyclerView.onScrollStateChanged(0);
    }

    public void setEnablePostSendVideo(boolean z) {
        this.f104214B = z;
    }

    public void setPhotoPickerListener(AbstractC40987a aVar) {
        this.f104225i = aVar;
    }

    public void setShowGif(boolean z) {
        this.f104226j = z;
    }

    public void setShowVideo(boolean z) {
        this.f104227k = z;
    }

    public void setSingleShowSelector(boolean z) {
        this.f104228l = z;
    }

    public void setToastTotalMaxCount(boolean z) {
        this.f104229m = z;
    }

    public void setTotalHasVideo(boolean z) {
        this.f104230n = z;
    }

    public void setTotalMaxCount(int i) {
        this.f104221e = i;
    }

    public LarkPhotoPickerView(Context context) {
        this(context, null);
    }

    public void setIsInPostMode(boolean z) {
        this.f104231o = z;
        mo147681a(this.f104222f);
    }

    public void setCameraBtnEnable(boolean z) {
        this.f104240x.setEnabled(z);
        this.f104240x.setClickable(z);
    }

    public void setCurrentMode(int i) {
        if (i != this.f104241y) {
            this.f104224h = false;
        }
        this.f104241y = i;
        mo147681a(this.f104222f);
    }

    public void setMaxCount(int i) {
        boolean z;
        this.f104220d = i;
        UDCheckBox uDCheckBox = this.f104217a;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        uDCheckBox.setEnabled(z);
        View view = this.f104218b;
        if (i <= 0) {
            z2 = false;
        }
        view.setEnabled(z2);
        this.f104217a.setChecked(false);
    }

    /* renamed from: a */
    private void m162429a(View view) {
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.v_selected_region);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                int width = relativeLayout.getWidth();
                int width2 = view.getWidth() - width;
                int i = rect.right;
                if (i < width) {
                    relativeLayout.offsetLeftAndRight(-((int) relativeLayout.getX()));
                } else {
                    relativeLayout.offsetLeftAndRight(Math.min(width2, i - width) - ((int) relativeLayout.getX()));
                }
            }
        }
    }

    /* renamed from: b */
    private void m162432b(View view) {
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.v_selected_region);
            relativeLayout.offsetLeftAndRight(((view.getWidth() - relativeLayout.getWidth()) - ((ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams()).rightMargin) - ((int) relativeLayout.getX()));
        }
    }

    /* renamed from: a */
    private void m162431a(List<Photo> list) {
        List<Photo> list2 = this.f104219c.f104257a;
        ArrayList arrayList = new ArrayList();
        for (Photo photo : list) {
            Iterator<Photo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Photo next = it.next();
                if (photo.getId() == next.getId()) {
                    arrayList.add(next);
                    break;
                }
            }
        }
        this.f104219c.mo198535a();
        this.f104219c.mo198540c().addAll(arrayList);
        this.f104219c.notifyDataSetChanged();
        int size = list.size();
        this.f104222f = size;
        mo147681a(size);
    }

    /* renamed from: b */
    private void m162433b(boolean z) {
        boolean z2;
        if (!z) {
            mo147692d();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_GIF", this.f104226j);
        if (!this.f104227k || (m162437j() && !this.f104214B)) {
            z2 = false;
        } else {
            z2 = true;
        }
        bundle.putBoolean("SHOW_VIDEO", z2);
        C58654f.m227489a((FragmentActivity) getContext(), bundle, new C58654f.AbstractC58658c() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C409858 */

            @Override // com.ss.android.lark.widget.photo_picker.p2951f.C58654f.AbstractC58658c
            /* renamed from: a */
            public void mo39869a(List<PhotoDirectory> list) {
                Object obj;
                LarkPhotoPickerView.this.f104219c.mo147732a(list);
                if (!list.isEmpty()) {
                    PhotoDirectory photoDirectory = list.get(0);
                    LarkPhotoPickerView.this.f104219c.mo147731a(photoDirectory);
                    StringBuilder sb = new StringBuilder();
                    sb.append("getPhotoDirs dirs photos = ");
                    if (photoDirectory.getPhotos() == null) {
                        obj = "null";
                    } else {
                        obj = Integer.valueOf(photoDirectory.getPhotos().size());
                    }
                    sb.append(obj);
                    Log.m165389i("LarkPhotoPickerView", sb.toString());
                } else {
                    Log.m165389i("LarkPhotoPickerView", "getPhotoDirs dirs is Empty");
                    LarkPhotoPickerView.this.f104219c.mo147731a(new PhotoDirectory());
                }
                LarkPhotoPickerView.this.mo147694f();
                LarkPhotoPickerView.this.mo147693e();
            }
        });
    }

    /* renamed from: a */
    public void mo147681a(int i) {
        int i2;
        int i3;
        if (m162437j()) {
            i2 = R.string.Lark_Legacy_PickerSendEnsureWithCount;
        } else {
            i2 = R.string.Lark_Legacy_PickerSendWithCount;
        }
        if (m162437j()) {
            i3 = R.string.Lark_Legacy_PickerSendEnsure;
        } else {
            i3 = R.string.Lark_Legacy_PickerSend;
        }
        if (i > 0) {
            this.f104233q.setEnabled(true);
            this.f104234r.setEnabled(true);
            this.f104236t.setVisibility(0);
            this.f104238v.setVisibility(0);
            this.f104236t.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Preview, "select_count", Integer.toString(i)));
            this.f104234r.setText(UIHelper.mustacheFormat(i2, "count", Integer.toString(i)));
            return;
        }
        this.f104233q.setEnabled(false);
        this.f104236t.setVisibility(8);
        this.f104238v.setVisibility(8);
        this.f104234r.setEnabled(false);
        this.f104234r.setText(getContext().getString(i3));
    }

    /* renamed from: b */
    public boolean mo147690b(Photo photo) {
        if (m162438k()) {
            return true;
        }
        if (this.f104215C && !m162437j()) {
            return false;
        }
        if (!photo.isVideo()) {
            return this.f104219c.mo198543f();
        }
        if (this.f104219c.mo198538b() > 0) {
            return true;
        }
        return false;
    }

    public LarkPhotoPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo147685a(List<Photo> list, boolean z) {
        AbstractC40987a aVar = this.f104225i;
        if (aVar != null) {
            aVar.mo147722b().mo147724a(list, z);
        }
        if (z && this.f104217a.isEnabled()) {
            this.f104217a.setChecked(false);
        }
        if (this.f104242z != null && this.f104213A == this.f104219c.mo198541d()) {
            this.f104219c.mo198542e().clear();
            this.f104219c.mo198542e().addAll(this.f104242z);
        }
        mo147692d();
    }

    /* renamed from: a */
    private void m162430a(ArrayList<Photo> arrayList, boolean z, boolean z2) {
        if (z) {
            mo147685a(arrayList, z2);
        } else {
            m162431a(arrayList);
        }
    }

    public LarkPhotoPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104220d = 9;
        this.f104221e = -1;
        this.f104215C = C40682g.m160850a().mo133171a("messenger.im.send.choose.media");
        this.f104232p = new Runnable() {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.RunnableC409781 */

            public void run() {
                if (LarkPhotoPickerView.this.f104224h) {
                    Log.m165389i("PhotoPickerView", "refresh Picker Info");
                    LarkPhotoPickerView.this.mo147686a(true);
                }
            }
        };
        this.f104216D = new ContentObserver(null) {
            /* class com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.C409847 */

            public void onChange(boolean z) {
                UICallbackExecutor.removeCallbacks(LarkPhotoPickerView.this.f104232p);
                UICallbackExecutor.executeDelayed(LarkPhotoPickerView.this.f104232p, 3000);
            }
        };
        m162434g();
    }

    /* renamed from: a */
    public void mo147682a(int i, int i2, Intent intent) {
        if (i == 911) {
            if (i2 == -1 && intent != null) {
                ArrayList<Photo> arrayList = (ArrayList) intent.getSerializableExtra("KEY_SELECTED_MEDIA");
                boolean booleanExtra = intent.getBooleanExtra("KEY_HAS_VIDEO", false);
                boolean booleanExtra2 = intent.getBooleanExtra("is_send_photo", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
                if (booleanExtra || !CollectionUtils.isNotEmpty(this.f104219c.mo198542e())) {
                    m162430a(arrayList, booleanExtra2, booleanExtra3);
                    return;
                }
                this.f104217a.setChecked(booleanExtra3);
                if (arrayList != null) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("photo_new_old_map");
                    this.f104242z = new ArrayList(this.f104219c.mo198542e());
                    this.f104213A = this.f104219c.mo198541d();
                    if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                        List<Photo> e = this.f104219c.mo198542e();
                        for (int i3 = 0; i3 < stringArrayListExtra.size(); i3 += 2) {
                            String str = stringArrayListExtra.get(i3);
                            String str2 = stringArrayListExtra.get(i3 + 1);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= e.size()) {
                                    break;
                                } else if (str.equals(e.get(i4).getPath())) {
                                    Photo photo = new Photo(e.get(i4));
                                    photo.setPath(str2);
                                    e.set(i4, photo);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    m162430a(arrayList, booleanExtra2, booleanExtra3);
                }
            }
        } else if (i == 233) {
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_FOR_SEND", true);
            boolean booleanExtra5 = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
            this.f104217a.setChecked(booleanExtra5);
            m162430a((ArrayList) intent.getSerializableExtra("KEY_SELECTED_MEDIA"), booleanExtra4, booleanExtra5);
        }
    }

    /* renamed from: a */
    public void mo147683a(Context context, List<Photo> list, int i, List<Photo> list2) {
        this.f104225i.mo147721a(new PhotoPreviewPickerParam.C40997a().mo147786a(list).mo147784a(i).mo147787a(false).mo147791b(this.f104223g).mo147789b(this.f104220d).mo147794d(!m162437j()).mo147790b(new ArrayList(list2)).mo147793c(false).mo147788a());
    }

    /* renamed from: a */
    public void mo147684a(List<Photo> list, int i, View view, List<Photo> list2) {
        int i2;
        if (!this.f104227k) {
            i2 = 0;
        } else if (!this.f104215C || m162437j()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        this.f104225i.mo147721a(new PhotoPreviewPickerParam.C40997a().mo147785a(view).mo147786a(list).mo147784a(i).mo147787a(false).mo147791b(this.f104223g).mo147789b(this.f104220d).mo147794d(!m162437j()).mo147792c(i2).mo147790b(new ArrayList(list2)).mo147788a());
    }
}
