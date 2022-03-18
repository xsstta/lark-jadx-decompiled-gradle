package com.ss.android.vc.meeting.module.presetting;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;

/* renamed from: com.ss.android.vc.meeting.module.presetting.f */
public class C62645f extends LarkRecyclerViewBaseAdapter<C62649b, CalendarVCSettingsEntity.VCSecuritySetting> {

    /* renamed from: a */
    public AbstractC62648a f157705a;

    /* renamed from: b */
    private CalendarVCSettingsEntity.VCSecuritySetting f157706b = CalendarVCSettingsEntity.VCSecuritySetting.PUBLIC;

    /* renamed from: com.ss.android.vc.meeting.module.presetting.f$a */
    public interface AbstractC62648a {
        /* renamed from: a */
        void mo216480a(CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.presetting.f$2 */
    public static /* synthetic */ class C626472 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157709a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.response.CalendarVCSettingsEntity$VCSecuritySetting[] r0 = com.ss.android.vc.entity.response.CalendarVCSettingsEntity.VCSecuritySetting.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.presetting.C62645f.C626472.f157709a = r0
                com.ss.android.vc.entity.response.CalendarVCSettingsEntity$VCSecuritySetting r1 = com.ss.android.vc.entity.response.CalendarVCSettingsEntity.VCSecuritySetting.PUBLIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.presetting.C62645f.C626472.f157709a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.response.CalendarVCSettingsEntity$VCSecuritySetting r1 = com.ss.android.vc.entity.response.CalendarVCSettingsEntity.VCSecuritySetting.SAME_TENANT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.presetting.C62645f.C626472.f157709a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.response.CalendarVCSettingsEntity$VCSecuritySetting r1 = com.ss.android.vc.entity.response.CalendarVCSettingsEntity.VCSecuritySetting.ONLY_CALENDAR_GUEST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.presetting.C62645f.C626472.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo216486a(CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting) {
        this.f157706b = vCSecuritySetting;
        notifyDataSetChanged();
    }

    public C62645f(AbstractC62648a aVar) {
        this.f157705a = aVar;
    }

    /* renamed from: a */
    private void m245070a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.presetting.f$b */
    public class C62649b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public IconFontView f157710a;

        /* renamed from: b */
        public TextView f157711b;

        /* renamed from: c */
        public View f157712c;

        public C62649b(View view) {
            super(view);
            this.f157710a = (IconFontView) view.findViewById(R.id.indicator);
            this.f157711b = (TextView) view.findViewById(R.id.title);
            this.f157712c = view.findViewById(R.id.divide_line);
        }
    }

    /* renamed from: a */
    public C62649b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C62649b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.meeting_pre_security_setting_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C62649b bVar, int i) {
        String str;
        final CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting = (CalendarVCSettingsEntity.VCSecuritySetting) getItem(i);
        int i2 = C626472.f157709a[vCSecuritySetting.ordinal()];
        if (i2 == 1) {
            str = UIHelper.getString(R.string.View_M_JoiningPermissionsAnyone);
        } else if (i2 == 2) {
            str = UIHelper.getString(R.string.View_M_JoiningPermissionsOrganizerCompany);
        } else if (i2 != 3) {
            str = "";
        } else {
            str = UIHelper.getString(R.string.View_M_OnlyEventGuestsCanJoin);
        }
        m245070a(bVar.f157711b, str);
        CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting2 = this.f157706b;
        if (vCSecuritySetting2 == null || vCSecuritySetting2.getNumber() != vCSecuritySetting.getNumber()) {
            bVar.f157710a.setVisibility(8);
        } else {
            bVar.f157710a.setVisibility(0);
        }
        bVar.itemView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.presetting.C62645f.C626461 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C62645f.this.f157705a != null) {
                    C62645f.this.f157705a.mo216480a(vCSecuritySetting);
                }
            }
        });
        if (i == getItemCount() - 1) {
            bVar.f157712c.setVisibility(8);
        } else {
            bVar.f157712c.setVisibility(0);
        }
    }
}
