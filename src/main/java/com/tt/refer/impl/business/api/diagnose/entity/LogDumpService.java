package com.tt.refer.impl.business.api.diagnose.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.util.C67064v;
import com.tt.miniapp.util.C67067x;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;

public class LogDumpService extends DumpService {
    public static final Parcelable.Creator<LogDumpService> CREATOR = new Parcelable.Creator<LogDumpService>() {
        /* class com.tt.refer.impl.business.api.diagnose.entity.LogDumpService.C678911 */

        /* renamed from: a */
        public LogDumpService[] newArray(int i) {
            return new LogDumpService[i];
        }

        /* renamed from: a */
        public LogDumpService createFromParcel(Parcel parcel) {
            return new LogDumpService(parcel);
        }
    };

    /* renamed from: b */
    private DumpConfig f170990b;

    /* renamed from: c */
    private List<DumpConfig> f170991c;

    /* renamed from: d */
    private String f170992d;

    @Override // com.tt.refer.impl.business.api.diagnose.entity.DumpService
    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo235540b() {
        return this.f170992d;
    }

    protected LogDumpService(Parcel parcel) {
        super(parcel);
        this.f170991c = new ArrayList();
        this.f170990b = (DumpConfig) parcel.readParcelable(DumpConfig.class.getClassLoader());
        this.f170991c = parcel.createTypedArrayList(DumpConfig.CREATOR);
        this.f170992d = parcel.readString();
    }

    /* renamed from: a */
    public String mo235539a(Headers headers) {
        StringBuilder sb = new StringBuilder(" headers");
        sb.append("{");
        if (headers != null && headers.size() > 0) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                sb.append("key:");
                sb.append(name);
                sb.append("value:");
                sb.append(value);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public LogDumpService(DumpConfig dumpConfig) {
        ArrayList arrayList = new ArrayList();
        this.f170991c = arrayList;
        if (dumpConfig != null) {
            this.f170990b = dumpConfig;
            arrayList.add(dumpConfig);
            mo235529a(dumpConfig.mo235516a());
        }
        this.f170992d = C67067x.m261376a(16);
    }

    @Override // com.tt.refer.impl.business.api.diagnose.entity.DumpService
    /* renamed from: a */
    public void mo235527a(C67894c cVar) {
        String b = mo235540b();
        String a = mo235538a("DumpRequest" + " url:" + cVar.mo235552a() + " method:" + cVar.mo235553b() + mo235539a(cVar.mo235554c()) + " body:" + cVar.mo235555d(), b);
        StringBuilder sb = new StringBuilder();
        sb.append("requestId:");
        sb.append(cVar.mo235556e());
        sb.append(a);
        AppBrandLogger.m52830i("LogDumpService", sb.toString());
    }

    @Override // com.tt.refer.impl.business.api.diagnose.entity.DumpService
    /* renamed from: a */
    public void mo235528a(C67895d dVar) {
        String b = mo235540b();
        AppBrandLogger.m52830i("LogDumpService", mo235538a("DumpResponse" + " url:" + dVar.mo235557a() + " code:" + dVar.mo235558b() + mo235539a(dVar.mo235559c()) + " body:" + dVar.mo235560d(), b));
    }

    @Override // com.tt.refer.impl.business.api.diagnose.entity.DumpService
    /* renamed from: a */
    public boolean mo235530a(DumpConfig dumpConfig) {
        DumpConfig dumpConfig2 = this.f170990b;
        if (dumpConfig2 == null || dumpConfig == null || !TextUtils.equals(dumpConfig2.mo235516a(), dumpConfig.mo235516a())) {
            return false;
        }
        this.f170991c.add(dumpConfig);
        return true;
    }

    /* renamed from: a */
    public String mo235538a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return C67064v.m261367a(str2, str);
        } catch (Exception e) {
            AppBrandLogger.m52829e("LogDumpService", " encry fail", e);
            return "";
        }
    }

    @Override // com.tt.refer.impl.business.api.diagnose.entity.DumpService
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f170990b, i);
        parcel.writeTypedList(this.f170991c);
        parcel.writeString(this.f170992d);
    }
}
