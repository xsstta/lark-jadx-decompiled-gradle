package com.ss.android.lark.mail.impl.compose.attachment;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.utils.C43785p;
import java.util.ArrayList;
import java.util.Iterator;

public class LocalAttachment extends MailAttachment {
    public static final Parcelable.Creator<LocalAttachment> CREATOR = new Parcelable.Creator<LocalAttachment>() {
        /* class com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment.C419351 */

        /* renamed from: a */
        public LocalAttachment[] newArray(int i) {
            return new LocalAttachment[i];
        }

        /* renamed from: a */
        public LocalAttachment createFromParcel(Parcel parcel) {
            return new LocalAttachment(parcel);
        }
    };

    /* renamed from: j */
    private String f106435j;

    /* renamed from: k */
    private boolean f106436k;

    /* renamed from: l */
    private boolean f106437l;

    /* renamed from: m */
    private int f106438m;

    public LocalAttachment() {
    }

    /* renamed from: a */
    public String mo150760a() {
        return this.f106435j;
    }

    /* renamed from: c */
    public int mo150766c() {
        return this.f106438m;
    }

    /* renamed from: e */
    public boolean mo150768e() {
        return this.f106437l;
    }

    /* renamed from: b */
    public boolean mo150765b() {
        return this.f106436k;
    }

    /* renamed from: d */
    public JSONObject mo150767d() {
        Log.m165389i("Attachment", "toSharedAttachmentJSON");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileKey", (Object) this.f106788d);
            jSONObject.put("fileSize", (Object) Long.valueOf(this.f106787c));
            jSONObject.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(this.f106789e));
            jSONObject.put("largeFilePermission", (Object) Integer.valueOf(this.f106791g));
            jSONObject.put("fileName", (Object) this.f106785a);
            jSONObject.put("expireDate", (Object) Long.valueOf(this.f106792h));
            return jSONObject;
        } catch (Exception e) {
            Log.m165384e("Attachment", "toSharedAttachmentJSON", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo150764b(boolean z) {
        this.f106437l = z;
    }

    /* renamed from: a */
    public static LocalAttachment m166709a(MailAttachment mailAttachment) {
        return new LocalAttachment(mailAttachment);
    }

    /* renamed from: a */
    public void mo150761a(int i) {
        this.f106438m = i;
    }

    public LocalAttachment(Parcel parcel) {
        super(parcel);
        this.f106435j = parcel.readString();
        this.f106436k = parcel.readInt() != 1 ? false : true;
        this.f106438m = parcel.readInt();
        this.f106437l = false;
    }

    /* renamed from: a */
    public void mo150762a(String str) {
        this.f106435j = str;
    }

    private LocalAttachment(MailAttachment mailAttachment) {
        this.f106786b = "";
        this.f106787c = mailAttachment.mo151231h();
        this.f106785a = mailAttachment.mo151229f();
        this.f106788d = mailAttachment.mo151234j();
        this.f106435j = C43785p.m173536a();
        this.f106789e = mailAttachment.mo151238n();
        this.f106791g = mailAttachment.mo151235k();
        this.f106792h = mailAttachment.mo151236l();
        this.f106437l = false;
    }

    /* renamed from: a */
    public void mo150763a(boolean z) {
        this.f106436k = z;
    }

    /* renamed from: a */
    public static LocalAttachment m166708a(JSONObject jSONObject) {
        Log.m165389i("Attachment", "generateFromJson");
        if (jSONObject == null) {
            Log.m165389i("Attachment", "generateFromJson null json");
            return null;
        }
        try {
            LocalAttachment localAttachment = new LocalAttachment();
            localAttachment.f106788d = jSONObject.getString("fileKey");
            localAttachment.f106787c = jSONObject.getLong("fileSize").longValue();
            localAttachment.f106789e = jSONObject.getIntValue(ShareHitPoint.f121869d);
            localAttachment.f106791g = jSONObject.getIntValue("largeFilePermission");
            localAttachment.f106785a = jSONObject.getString("fileName");
            localAttachment.f106792h = jSONObject.getLong("expireDate").longValue();
            localAttachment.f106435j = C43785p.m173536a();
            return localAttachment;
        } catch (Exception e) {
            Log.m165384e("Attachment", "generateFromJson", e);
            return null;
        }
    }

    /* renamed from: a */
    public static ArrayList<LocalAttachment> m166710a(ArrayList<LocalAttachment> arrayList) {
        ArrayList<LocalAttachment> arrayList2 = new ArrayList<>();
        if (!CollectionUtils.isEmpty(arrayList)) {
            Iterator<LocalAttachment> it = arrayList.iterator();
            while (it.hasNext()) {
                LocalAttachment next = it.next();
                LocalAttachment localAttachment = new LocalAttachment();
                localAttachment.mo151218a(next.mo151231h());
                localAttachment.mo151222b(next.mo151229f());
                localAttachment.mo150762a(next.mo150760a());
                localAttachment.mo151223c(next.mo151238n());
                localAttachment.mo151226d(next.mo151234j());
                localAttachment.mo151220b(next.mo151235k());
                localAttachment.mo151221b(next.mo151236l());
                localAttachment.mo150761a(1);
                arrayList2.add(localAttachment);
            }
        }
        return arrayList2;
    }

    @Override // com.ss.android.lark.mail.impl.entity.MailAttachment
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f106435j);
        parcel.writeInt(this.f106436k ? 1 : 0);
        parcel.writeInt(this.f106438m);
    }
}
