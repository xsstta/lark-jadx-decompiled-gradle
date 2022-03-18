package com.bytedance.ee.bear.drive.biz.versions.p339a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.drive.biz.versions.model.AbstractC6848a;
import com.bytedance.ee.bear.drive.biz.versions.model.DriveVersionHistoryRecord;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.biz.versions.a.a */
public class C6836a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private static final int f18593a = C13749l.m55738a(8);

    /* renamed from: b */
    private Context f18594b;

    /* renamed from: c */
    private List<AbstractC6848a> f18595c = new ArrayList();

    /* renamed from: d */
    private Map<String, DriveVersionHistoryRecord.UserBean> f18596d = new HashMap();

    /* renamed from: e */
    private AbstractC6838a f18597e;

    /* renamed from: f */
    private long f18598f;

    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.a.a$a */
    public interface AbstractC6838a {
        /* renamed from: a */
        void mo26878a(DriveVersionHistoryRecord.RecordBean recordBean);
    }

    /* renamed from: a */
    public long mo26895a() {
        return this.f18598f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f18595c.size();
    }

    /* renamed from: a */
    public void mo26896a(AbstractC6838a aVar) {
        this.f18597e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f18595c.get(i).mo27006a();
    }

    public C6836a(Context context) {
        this.f18594b = context;
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.a.a$b */
    public static class C6839b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f18600a;

        /* renamed from: b */
        public TextView f18601b;

        /* renamed from: c */
        public ImageView f18602c;

        /* renamed from: d */
        public TextView f18603d;

        /* renamed from: e */
        public TextView f18604e;

        /* renamed from: f */
        public TextView f18605f;

        /* renamed from: g */
        public LinearLayout f18606g;

        public C6839b(View view) {
            super(view);
            this.f18600a = (TextView) view.findViewById(R.id.user_name_tv);
            this.f18601b = (TextView) view.findViewById(R.id.operation_description_tv);
            this.f18602c = (ImageView) view.findViewById(R.id.file_type_img);
            this.f18603d = (TextView) view.findViewById(R.id.file_name_tv);
            this.f18604e = (TextView) view.findViewById(R.id.opt_date_tv);
            this.f18605f = (TextView) view.findViewById(R.id.file_tag_tv);
            this.f18606g = (LinearLayout) view.findViewById(R.id.file_info_content_ll);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m27000a(DriveVersionHistoryRecord.RecordBean recordBean, View view) {
        AbstractC6838a aVar = this.f18597e;
        if (aVar != null) {
            aVar.mo26878a(recordBean);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 0) {
            m26999a((C6839b) viewHolder, i);
        }
    }

    /* renamed from: b */
    public void mo26898b(List<DriveVersionHistoryRecord.RecordBean> list, Map<String, DriveVersionHistoryRecord.UserBean> map) {
        if (!CollectionUtils.isEmpty(list)) {
            if (map != null) {
                this.f18596d.putAll(map);
            }
            for (DriveVersionHistoryRecord.RecordBean recordBean : list) {
                this.f18595c.add(new AbstractC6848a.C6850b(recordBean));
            }
            this.f18598f = list.get(list.size() - 1).getEditTime();
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C6839b(LayoutInflater.from(this.f18594b).inflate(R.layout.drive_item_record, viewGroup, false));
        }
        View view = new View(this.f18594b);
        view.setBackgroundColor(this.f18594b.getResources().getColor(R.color.bg_base));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, f18593a));
        return new RecyclerView.ViewHolder(view) {
            /* class com.bytedance.ee.bear.drive.biz.versions.p339a.C6836a.C68371 */
        };
    }

    /* renamed from: a */
    public void mo26897a(List<DriveVersionHistoryRecord.RecordBean> list, Map<String, DriveVersionHistoryRecord.UserBean> map) {
        if (!CollectionUtils.isEmpty(list)) {
            if (map != null) {
                this.f18596d = map;
            }
            this.f18595c.clear();
            this.f18595c.add(new AbstractC6848a.C6849a());
            for (DriveVersionHistoryRecord.RecordBean recordBean : list) {
                this.f18595c.add(new AbstractC6848a.C6850b(recordBean));
            }
            this.f18598f = list.get(list.size() - 1).getEditTime();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m26999a(C6839b bVar, int i) {
        String str;
        String str2;
        String str3;
        DriveVersionHistoryRecord.RecordBean b = ((AbstractC6848a.C6850b) this.f18595c.get(i)).mo27007b();
        if (b.getType() == 2 || b.getType() == 3) {
            ViewGroup.LayoutParams layoutParams = bVar.itemView.getLayoutParams();
            layoutParams.height = this.f18594b.getResources().getDimensionPixelSize(R.dimen.drive_history_record_item_unclick_height);
            bVar.itemView.setLayoutParams(layoutParams);
            bVar.itemView.setOnClickListener(null);
            bVar.itemView.setClickable(false);
            bVar.f18606g.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams2 = bVar.itemView.getLayoutParams();
            layoutParams2.height = this.f18594b.getResources().getDimensionPixelSize(R.dimen.drive_history_record_item_normal_height);
            bVar.itemView.setLayoutParams(layoutParams2);
            bVar.f18606g.setVisibility(0);
            if (b.isDeleted()) {
                bVar.itemView.setOnClickListener(null);
                bVar.itemView.setClickable(false);
            } else {
                bVar.itemView.setOnClickListener(new View.OnClickListener(b) {
                    /* class com.bytedance.ee.bear.drive.biz.versions.p339a.$$Lambda$a$iWqJcecYSM_nFWeipGrblonlhZw */
                    public final /* synthetic */ DriveVersionHistoryRecord.RecordBean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C6836a.this.m27000a((C6836a) this.f$1, (DriveVersionHistoryRecord.RecordBean) view);
                    }
                });
                bVar.itemView.setClickable(true);
            }
        }
        int type = b.getType();
        if (type != 1) {
            if (type == 2) {
                HashMap hashMap = new HashMap();
                hashMap.put("tag", String.valueOf(b.getSourceTag()));
                if (TextUtils.isEmpty(b.getName())) {
                    str2 = "";
                } else {
                    str2 = b.getName();
                }
                hashMap.put("name", str2);
                str = C10539a.m43640a(this.f18594b, R.string.Drive_Drive_HistoryRecordRename, hashMap);
            } else if (type == 3) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("tag", String.valueOf(b.getSourceTag()));
                if (TextUtils.isEmpty(b.getSourceName())) {
                    str3 = "";
                } else {
                    str3 = b.getSourceName();
                }
                hashMap2.put("name", str3);
                str = C10539a.m43640a(this.f18594b, R.string.Drive_Drive_HistoryRecordDeleteVersion, hashMap2);
            } else if (type != 4) {
                str = "";
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("oldTag", String.valueOf(b.getSourceTag()));
                hashMap3.put("newTag", String.valueOf(b.getTag()));
                str = C10539a.m43640a(this.f18594b, R.string.Drive_Drive_HistoryRecordRevertVersion, hashMap3);
            }
        } else if (b.getTag() == 1) {
            str = C10539a.m43639a(this.f18594b, R.string.Drive_Drive_HistoryRecordUploadNewVersion, "tag", String.valueOf(b.getTag()));
        } else {
            str = C10539a.m43639a(this.f18594b, R.string.Drive_Drive_HistoryRecordUploadedTag, "tag", String.valueOf(b.getTag()));
        }
        bVar.f18601b.setText(str);
        if (b.isDeleted()) {
            bVar.f18603d.setAlpha(0.3f);
            bVar.f18603d.setPaintFlags(bVar.f18603d.getPaintFlags() | 16);
            bVar.f18605f.setVisibility(0);
        } else {
            bVar.f18603d.setAlpha(1.0f);
            bVar.f18603d.setPaintFlags(bVar.f18603d.getPaintFlags() & -17);
            bVar.f18605f.setVisibility(8);
        }
        bVar.f18603d.setText(b.getName());
        bVar.f18602c.setImageResource(C7713a.m30841a(C13672c.m55481b(b.getName())));
        DriveVersionHistoryRecord.UserBean userBean = this.f18596d.get(b.getEditUid());
        if (userBean != null) {
            bVar.f18600a.setText(userBean.getCname());
        } else {
            bVar.f18600a.setText("");
        }
        bVar.f18604e.setText(C13723a.m55654a(this.f18594b, b.getEditTime()));
    }
}
