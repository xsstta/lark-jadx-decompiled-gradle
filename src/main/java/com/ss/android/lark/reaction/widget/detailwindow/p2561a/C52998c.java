package com.ss.android.lark.reaction.widget.detailwindow.p2561a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52994a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.c */
public class C52998c {

    /* renamed from: a */
    private Context f130919a;

    /* renamed from: b */
    private C52994a.AbstractC52995a f130920b;

    /* renamed from: c */
    private int f130921c;

    /* renamed from: d */
    private IRequestCreator f130922d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.c$1 */
    public static /* synthetic */ class C529991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f130923a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo$DescriptionType[] r0 = com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo.DescriptionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52998c.C529991.f130923a = r0
                com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo$DescriptionType r1 = com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo.DescriptionType.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52998c.C529991.f130923a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo$DescriptionType r1 = com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo.DescriptionType.LEAVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52998c.C529991.f130923a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo$DescriptionType r1 = com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo.DescriptionType.MEETING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52998c.C529991.f130923a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo$DescriptionType r1 = com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo.DescriptionType.BUSINESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52998c.C529991.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo181037a(DetailUserInfo.DescriptionType descriptionType) {
        int i = C529991.f130923a[descriptionType.ordinal()];
        if (i == 2) {
            return R.drawable.user_status_leave;
        }
        if (i == 3) {
            return R.drawable.user_status_meeting;
        }
        if (i != 4) {
            return R.drawable.user_status_default;
        }
        return R.drawable.user_status_business;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m205264a(DetailUserInfo detailUserInfo, View view) {
        C52994a.AbstractC52995a aVar = this.f130920b;
        if (aVar != null) {
            aVar.click(detailUserInfo.getUserId());
        }
    }

    public C52998c(Context context, C52994a.AbstractC52995a aVar) {
        this.f130919a = context;
        this.f130920b = aVar;
        this.f130921c = C52990a.m205224a(context, 48.0f);
        this.f130922d = ImageLoader.with(context);
    }

    /* renamed from: a */
    public void mo181038a(C53000d dVar, DetailUserInfo detailUserInfo, int i) {
        dVar.f130927d.setText(detailUserInfo.getUserName());
        if (!TextUtils.isEmpty(detailUserInfo.getAvatarUrl())) {
            IRequestCreator load = this.f130922d.load(detailUserInfo.getAvatarUrl());
            int i2 = this.f130921c;
            load.override(i2, i2).into(dVar.f130925b);
        } else {
            String avatarKey = detailUserInfo.getAvatarKey();
            String userId = detailUserInfo.getUserId();
            int i3 = this.f130921c;
            IRequestCreator load2 = this.f130922d.load(AvatarImage.Builder.obtain(avatarKey, userId, i3, i3).build());
            int i4 = this.f130921c;
            load2.override(i4, i4).into(dVar.f130925b);
        }
        if (!TextUtils.isEmpty(detailUserInfo.getDescription()) || detailUserInfo.getDescType() != DetailUserInfo.DescriptionType.DEFAULT) {
            dVar.f130928e.setVisibility(0);
            dVar.f130928e.mo181157a(detailUserInfo.getDescription(), C52990a.m205235b(this.f130919a, mo181037a(detailUserInfo.getDescType())));
        } else {
            dVar.f130928e.setVisibility(8);
        }
        if (TextUtils.isEmpty(detailUserInfo.getWorkStatusDesc())) {
            dVar.f130929f.setVisibility(8);
        } else {
            dVar.f130929f.setVisibility(0);
            dVar.f130929f.setText(detailUserInfo.getWorkStatusDesc());
        }
        dVar.itemView.setOnClickListener(new View.OnClickListener(detailUserInfo) {
            /* class com.ss.android.lark.reaction.widget.detailwindow.p2561a.$$Lambda$c$Bjk0gwibnmLgULK5QstLBKfPhoE */
            public final /* synthetic */ DetailUserInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C52998c.this.m205264a(this.f$1, view);
            }
        });
    }
}
