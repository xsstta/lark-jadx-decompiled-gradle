package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.drive.DriveCommonConstants;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6802b;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.C6824a;
import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.UploadListStatusLayout;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13751m;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.a */
public class C6824a extends RecyclerView.Adapter<C6826b> {

    /* renamed from: a */
    public List<C6802b> f18557a;

    /* renamed from: b */
    public AbstractC6825a f18558b;

    /* renamed from: c */
    public UploadListStatusLayout.AbstractC6823a f18559c;

    /* renamed from: d */
    private Context f18560d;

    /* renamed from: e */
    private String f18561e = "";

    /* renamed from: f */
    private AbstractC7095c f18562f;

    /* renamed from: g */
    private DriveCommonConstants.DriveRustFgConfig f18563g;

    /* renamed from: h */
    private HashSet<String> f18564h = new HashSet<>();

    /* renamed from: i */
    private String f18565i;

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.a$a */
    public interface AbstractC6825a {
        void onMenuDelConfirmClick(View view, int i, C6802b bVar);
    }

    /* renamed from: a */
    public String mo26868a() {
        return this.f18561e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<C6802b> list = this.f18557a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo26869a(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.setAlpha(1.0f);
    }

    /* renamed from: a */
    public void mo26870a(UploadListStatusLayout.AbstractC6823a aVar) {
        this.f18559c = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.a$b */
    public class C6826b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        SwipeMenuLayout f18566a;

        /* renamed from: b */
        FrameLayout f18567b;

        /* renamed from: c */
        ImageView f18568c = ((ImageView) this.f18566a.findViewById(R.id.item_icon));

        /* renamed from: d */
        TextView f18569d = ((TextView) this.f18566a.findViewById(R.id.item_upload_file_name));

        /* renamed from: e */
        TextView f18570e = ((TextView) this.f18566a.findViewById(R.id.item_upload_file_status));

        /* renamed from: f */
        UploadListStatusLayout f18571f = ((UploadListStatusLayout) this.f18566a.findViewById(R.id.uploadlist_status));

        /* renamed from: g */
        ImageView f18572g;

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m26963a(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < C6824a.this.f18557a.size()) {
                C6824a.this.f18558b.onMenuDelConfirmClick(view, adapterPosition, C6824a.this.f18557a.get(adapterPosition));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6826b(View view) {
            super(view);
            C6824a.this = r3;
            SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) view;
            this.f18566a = swipeMenuLayout;
            this.f18567b = (FrameLayout) swipeMenuLayout.findViewById(R.id.item_infomation);
            ImageView imageView = (ImageView) view.findViewById(R.id.swipe_menu_delete);
            this.f18572g = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.$$Lambda$a$b$FQyTi7YHOa2aItLYB0N_UEzMamU */

                public final void onClick(View view) {
                    C6824a.C6826b.lambda$FQyTi7YHOa2aItLYB0N_UEzMamU(C6824a.C6826b.this, view);
                }
            });
            this.f18571f.f18553a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.C6824a.C6826b.C68271 */

                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    int adapterPosition = C6826b.this.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition < C6824a.this.f18557a.size()) {
                        C6824a.this.f18559c.onRetryClick(view, adapterPosition, C6824a.this.f18557a.get(adapterPosition));
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m26952b(C6802b bVar) {
        String str;
        int i;
        String e = bVar.mo26795e();
        if (TextUtils.isEmpty(e)) {
            str = "";
        } else {
            str = e.toLowerCase();
        }
        if (TextUtils.equals(this.f18565i, "wiki")) {
            i = C7713a.m30839a(C8275a.f22375h.mo32555b(), bVar.mo26789b());
        } else {
            i = C7713a.m30841a(str);
        }
        bVar.mo26786a(i);
    }

    /* renamed from: a */
    private String m26948a(C6802b bVar) {
        int d = bVar.mo26793d();
        if (d == 1) {
            return m26951b(bVar.mo26785a());
        }
        if (d == 2) {
            return this.f18560d.getResources().getString(R.string.Drive_Drive_WaitingForUpload);
        }
        if (d == 3) {
            return this.f18560d.getResources().getString(R.string.Drive_Drive_Uploading);
        }
        if (d != 4) {
            return null;
        }
        return this.f18560d.getResources().getString(R.string.Drive_Drive_UploadComplete);
    }

    /* renamed from: b */
    private String m26951b(String str) {
        int i;
        try {
            i = Integer.valueOf(str).intValue();
        } catch (Exception unused) {
            C13479a.m54758a("UpdateListTAG", "errorCode invalid format");
            i = 0;
        }
        switch (i) {
            case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                return this.f18560d.getResources().getString(R.string.Drive_Drive_LocalFileIsDeleted);
            case 90003041:
            case 90003044:
                return this.f18560d.getResources().getString(R.string.Drive_Drive_SpaceFolderIsDeleted);
            case 90003043:
                return this.f18560d.getResources().getString(R.string.CreationMobile_Drive_FailedUpload_TooLargeGeneral);
            default:
                return this.f18560d.getResources().getString(R.string.Drive_Drive_UploadInterrupt);
        }
    }

    /* renamed from: a */
    public void mo26871a(AbstractC6825a aVar) {
        this.f18558b = aVar;
    }

    /* renamed from: a */
    public void mo26873a(String str) {
        this.f18565i = str;
    }

    /* renamed from: a */
    public void mo26874a(List<C6802b> list) {
        this.f18557a = list;
    }

    /* renamed from: b */
    private void m26953b(C6802b bVar, C6826b bVar2) {
        bVar2.f18568c.setImageResource(bVar.mo26791c());
        bVar2.f18568c.setColorFilter((ColorFilter) null);
    }

    public C6824a(AbstractC7095c cVar, DriveCommonConstants.DriveRustFgConfig driveRustFgConfig) {
        this.f18562f = cVar;
        this.f18563g = driveRustFgConfig;
    }

    /* renamed from: c */
    private void m26954c(C6802b bVar, C6826b bVar2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        bVar2.f18568c.setImageResource(bVar.mo26791c());
        bVar2.f18568c.setColorFilter(colorMatrixColorFilter);
    }

    /* renamed from: a */
    public C6826b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f18560d = context;
        C6826b bVar = new C6826b(LayoutInflater.from(context).inflate(R.layout.drive_uploadlist_recycler_item, viewGroup, false));
        bVar.f18566a.setDefaultMenuWidths(this.f18560d.getResources().getDimensionPixelSize(R.dimen.drive_upload_list_swipe_menu_width));
        return bVar;
    }

    /* renamed from: a */
    private void m26949a(C6802b bVar, C6826b bVar2) {
        int d = bVar.mo26793d();
        if (d == 1) {
            m26954c(bVar, bVar2);
            bVar2.f18569d.setTextColor(this.f18560d.getResources().getColor(R.color.text_title));
            bVar2.f18570e.setTextColor(this.f18560d.getResources().getColor(R.color.function_danger_500));
            bVar2.f18571f.mo26866a(bVar.mo26793d(), bVar.mo26797g(), false);
        } else if (d == 2) {
            m26954c(bVar, bVar2);
            bVar2.f18569d.setTextColor(this.f18560d.getResources().getColor(R.color.text_title));
            bVar2.f18570e.setTextColor(this.f18560d.getResources().getColor(R.color.text_caption));
            bVar2.f18571f.mo26866a(bVar.mo26793d(), bVar.mo26797g(), false);
        } else if (d == 3) {
            m26953b(bVar, bVar2);
            bVar2.f18569d.setTextColor(this.f18560d.getResources().getColor(R.color.text_title));
            bVar2.f18570e.setTextColor(this.f18560d.getResources().getColor(R.color.text_caption));
            bVar2.f18571f.mo26866a(bVar.mo26793d(), bVar.mo26797g(), false);
        } else if (d == 4) {
            m26953b(bVar, bVar2);
            bVar2.f18569d.setTextColor(this.f18560d.getResources().getColor(R.color.text_title));
            bVar2.f18570e.setTextColor(this.f18560d.getResources().getColor(R.color.text_caption));
            C13479a.m54764b("UpdateListTAG", "delete upload finish item key = " + bVar.mo26796f() + " " + bVar.mo26793d() + " " + bVar.mo26797g());
            bVar2.f18571f.mo26866a(bVar.mo26793d(), bVar.mo26797g(), this.f18564h.add(bVar.mo26796f()));
        }
        bVar.mo26794d(bVar.mo26793d());
    }

    /* renamed from: a */
    public void onBindViewHolder(C6826b bVar, int i) {
        C6802b bVar2 = this.f18557a.get(i);
        mo26869a(bVar);
        C13751m.m55764a(bVar.f18572g, this.f18560d.getResources(), R.drawable.ud_icon_delete_trash_outlined, null, this.f18560d.getResources().getColor(R.color.static_white));
        bVar.f18569d.setText(bVar2.mo26789b());
        bVar.f18570e.setText(m26948a(bVar2));
        m26952b(bVar2);
        m26949a(bVar2, bVar);
        if (bVar2.mo26798h()) {
            bVar.f18566a.mo30346c();
        } else {
            bVar.f18566a.mo30347d();
        }
        bVar.f18566a.setOnUserSwipeMenuListener(new SwipeMenuLayout.AbstractC7740b(bVar2) {
            /* class com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.view.uploadlist.$$Lambda$a$m1k8msXoUunR1x667UsF_kjTKqk */
            public final /* synthetic */ C6802b f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.AbstractC7740b
            public final void onSwipe(SwipeMenuLayout swipeMenuLayout, boolean z) {
                C6824a.lambda$m1k8msXoUunR1x667UsF_kjTKqk(C6824a.this, this.f$1, swipeMenuLayout, z);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m26950a(C6802b bVar, SwipeMenuLayout swipeMenuLayout, boolean z) {
        if (z) {
            this.f18561e = bVar.mo26796f();
        } else {
            this.f18561e = "";
        }
    }
}
