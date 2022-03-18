package com.ss.android.vc.meeting.module.p3123g;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.g.a */
public class C61873a extends LarkRecyclerViewBaseAdapter<C61877b, MeetingSecuritySetting> {

    /* renamed from: a */
    public AbstractC61876a f155337a;

    /* renamed from: b */
    public int f155338b;

    /* renamed from: c */
    public boolean f155339c;

    /* renamed from: com.ss.android.vc.meeting.module.g.a$a */
    public interface AbstractC61876a {
        /* renamed from: a */
        C61303k mo214255a();

        /* renamed from: a */
        void mo214256a(MeetingSecuritySetting meetingSecuritySetting);

        /* renamed from: b */
        String mo214257b(MeetingSecuritySetting meetingSecuritySetting);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.g.a$2 */
    public static /* synthetic */ class C618752 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155343a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel[] r0 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.p3123g.C61873a.C618752.f155343a = r0
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.PUBLIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.p3123g.C61873a.C618752.f155343a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.p3123g.C61873a.C618752.f155343a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.TENANT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.p3123g.C61873a.C618752.f155343a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r1 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.ONLY_HOST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3123g.C61873a.C618752.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo214253a(int i) {
        this.f155338b = i;
    }

    public C61873a(AbstractC61876a aVar, boolean z) {
        this.f155337a = aVar;
        this.f155339c = z;
    }

    /* renamed from: a */
    private void m241693a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.g.a$b */
    public class C61877b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public UDCheckBox f155344a;

        /* renamed from: b */
        public ImageView f155345b;

        /* renamed from: c */
        public TextView f155346c;

        /* renamed from: d */
        public TextView f155347d;

        /* renamed from: e */
        public View f155348e;

        public C61877b(View view) {
            super(view);
            this.f155344a = (UDCheckBox) view.findViewById(R.id.radiobutton);
            this.f155345b = (ImageView) view.findViewById(R.id.indicator);
            this.f155346c = (TextView) view.findViewById(R.id.title);
            this.f155347d = (TextView) view.findViewById(R.id.subtitle);
            this.f155348e = view.findViewById(R.id.divide_line);
        }
    }

    /* renamed from: a */
    public C61877b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C61877b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.join_meeting_security_setting_item, viewGroup, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.ss.android.vc.meeting.module.p3123g.C61873a.C61877b r9, final int r10) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3123g.C61873a.onBindViewHolder(com.ss.android.vc.meeting.module.g.a$b, int):void");
    }
}
