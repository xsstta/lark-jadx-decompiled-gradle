package com.ss.android.lark.mail.impl.message.send.state;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.send.state.b */
public class C43023b extends RecyclerView.Adapter<C43025a> {

    /* renamed from: a */
    private List<SendStatusDetail> f109518a = new ArrayList();

    /* renamed from: b */
    private boolean f109519b = C41816b.m166115a().mo150116F().mo150192b();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f109518a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.send.state.b$1 */
    public static /* synthetic */ class C430241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109520a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.entity.SendStatusDetail$SendStatus[] r0 = com.ss.android.lark.mail.impl.entity.SendStatusDetail.SendStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.send.state.C43023b.C430241.f109520a = r0
                com.ss.android.lark.mail.impl.entity.SendStatusDetail$SendStatus r1 = com.ss.android.lark.mail.impl.entity.SendStatusDetail.SendStatus.RETRY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.send.state.C43023b.C430241.f109520a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.SendStatusDetail$SendStatus r1 = com.ss.android.lark.mail.impl.entity.SendStatusDetail.SendStatus.DELIVERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.send.state.C43023b.C430241.f109520a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.entity.SendStatusDetail$SendStatus r1 = com.ss.android.lark.mail.impl.entity.SendStatusDetail.SendStatus.DEFERRED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.message.send.state.C43023b.C430241.f109520a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.entity.SendStatusDetail$SendStatus r1 = com.ss.android.lark.mail.impl.entity.SendStatusDetail.SendStatus.DELIVERING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.send.state.C43023b.C430241.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo154199a(List<SendStatusDetail> list) {
        this.f109518a.clear();
        this.f109518a.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.send.state.b$a */
    public static class C43025a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        MailDefaultAvatarView f109521a;

        /* renamed from: b */
        TextView f109522b;

        /* renamed from: c */
        TextView f109523c;

        /* renamed from: d */
        TextView f109524d;

        /* renamed from: e */
        TextView f109525e;

        public C43025a(View view) {
            super(view);
            this.f109521a = (MailDefaultAvatarView) view.findViewById(R.id.mail_send_status_avatar_iv);
            this.f109522b = (TextView) view.findViewById(R.id.mail_send_status_time_tv);
            this.f109523c = (TextView) view.findViewById(R.id.mail_send_status_name_tv);
            this.f109524d = (TextView) view.findViewById(R.id.mail_send_status_address_tv);
            this.f109525e = (TextView) view.findViewById(R.id.mail_send_status_status_tv);
        }
    }

    /* renamed from: a */
    public C43025a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43025a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_send_status_detail_item, viewGroup, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.ss.android.lark.mail.impl.message.send.state.C43023b.C43025a r5, int r6) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.send.state.C43023b.onBindViewHolder(com.ss.android.lark.mail.impl.message.send.state.b$a, int):void");
    }
}
