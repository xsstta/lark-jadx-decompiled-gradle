package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import java.util.Locale;

public class CreateDraft implements Parcelable {
    public static final Parcelable.Creator<CreateDraft> CREATOR = new Parcelable.Creator<CreateDraft>() {
        /* class com.ss.android.lark.mail.impl.entity.CreateDraft.C420521 */

        /* renamed from: a */
        public CreateDraft[] newArray(int i) {
            return new CreateDraft[i];
        }

        /* renamed from: a */
        public CreateDraft createFromParcel(Parcel parcel) {
            return new CreateDraft(parcel);
        }
    };

    /* renamed from: a */
    public String f106719a;

    /* renamed from: b */
    private final String f106720b;

    /* renamed from: c */
    private final String f106721c;

    /* renamed from: d */
    private final int f106722d;

    /* renamed from: e */
    private final String f106723e;

    /* renamed from: f */
    private final long f106724f;

    /* renamed from: g */
    private String f106725g;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo151070a() {
        return this.f106720b;
    }

    /* renamed from: b */
    public String mo151071b() {
        return this.f106721c;
    }

    /* renamed from: d */
    public String mo151073d() {
        return this.f106723e;
    }

    /* renamed from: e */
    public long mo151075e() {
        return this.f106724f;
    }

    /* renamed from: g */
    public String mo151077g() {
        return this.f106719a;
    }

    /* renamed from: c */
    public MailCreateDraftRequest.CreateDraftAction mo151072c() {
        return MailCreateDraftRequest.CreateDraftAction.fromValue(this.f106722d);
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.CreateDraft$2 */
    static /* synthetic */ class C420532 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106726a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.mail.impl.entity.ReplyLanguage[] r0 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.entity.CreateDraft.C420532.f106726a = r0
                com.ss.android.lark.mail.impl.entity.ReplyLanguage r1 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.US     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.entity.CreateDraft.C420532.f106726a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.ReplyLanguage r1 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.ZH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.entity.CreateDraft.C420532.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.CreateDraft$a */
    public static final class C42054a {

        /* renamed from: a */
        private String f106727a;

        /* renamed from: b */
        private String f106728b;

        /* renamed from: c */
        private int f106729c;

        /* renamed from: d */
        private String f106730d;

        /* renamed from: e */
        private long f106731e;

        /* renamed from: f */
        private String f106732f;

        /* renamed from: g */
        private String f106733g;

        /* renamed from: a */
        public CreateDraft mo151086a() {
            CreateDraft createDraft = new CreateDraft(this.f106727a, this.f106728b, this.f106729c, this.f106730d, this.f106731e, this.f106732f);
            createDraft.f106719a = this.f106733g;
            return createDraft;
        }

        /* renamed from: a */
        public C42054a mo151083a(int i) {
            this.f106729c = i;
            return this;
        }

        /* renamed from: b */
        public C42054a mo151087b(String str) {
            this.f106728b = str;
            return this;
        }

        /* renamed from: c */
        public C42054a mo151088c(String str) {
            this.f106730d = str;
            return this;
        }

        /* renamed from: d */
        public C42054a mo151089d(String str) {
            this.f106732f = str;
            return this;
        }

        /* renamed from: e */
        public C42054a mo151090e(String str) {
            this.f106733g = str;
            return this;
        }

        /* renamed from: a */
        public C42054a mo151084a(long j) {
            this.f106731e = j;
            return this;
        }

        /* renamed from: a */
        public C42054a mo151085a(String str) {
            this.f106727a = str;
            return this;
        }
    }

    /* renamed from: f */
    public Locale mo151076f() {
        Integer b = C43350d.m172098a().mo155060z().mo5927b();
        if (b == null) {
            return null;
        }
        int i = C420532.f106726a[ReplyLanguage.fromValue(b.intValue()).ordinal()];
        if (i == 1) {
            return C43785p.m173550e("en");
        }
        if (i != 2) {
            return C43785p.m173540a(this.f106725g, true);
        }
        return C43785p.m173550e("zh");
    }

    protected CreateDraft(Parcel parcel) {
        this.f106720b = parcel.readString();
        this.f106721c = parcel.readString();
        this.f106722d = parcel.readInt();
        this.f106723e = parcel.readString();
        this.f106724f = parcel.readLong();
        this.f106725g = parcel.readString();
        this.f106719a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106720b);
        parcel.writeString(this.f106721c);
        parcel.writeInt(this.f106722d);
        parcel.writeString(this.f106723e);
        parcel.writeLong(this.f106724f);
        parcel.writeString(this.f106725g);
        parcel.writeString(this.f106719a);
    }

    public CreateDraft(String str, String str2, int i, String str3, long j, String str4) {
        this.f106720b = str;
        this.f106721c = str2;
        this.f106722d = i;
        this.f106723e = str3;
        if (j == 0) {
            this.f106724f = System.currentTimeMillis();
        } else {
            this.f106724f = j;
        }
        this.f106725g = str4;
    }
}
