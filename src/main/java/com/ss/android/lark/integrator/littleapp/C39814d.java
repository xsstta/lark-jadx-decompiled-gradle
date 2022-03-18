package com.ss.android.lark.integrator.littleapp;

import android.location.Location;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.littleapp.d */
public class C39814d {

    /* renamed from: a */
    public LarkLocation f101404a;

    /* renamed from: b */
    public long f101405b;

    /* renamed from: c */
    boolean f101406c;

    /* renamed from: d */
    private AbstractC41371j.AbstractC41380i f101407d;

    /* renamed from: e */
    private float f101408e;

    /* renamed from: f */
    private LocationRequestOption f101409f;

    /* renamed from: a */
    private boolean m158055a() {
        LarkLocation larkLocation = this.f101404a;
        if (larkLocation != null && larkLocation.getAccuracy() <= this.f101408e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo144313a(boolean z) {
        if (!this.f101406c) {
            LarkLocation larkLocation = this.f101404a;
            if (larkLocation == null) {
                this.f101407d.mo143000a(C39815e.m158060a().f101411b, C39815e.m158060a().f101410a);
                C39815e.m158060a().mo144316a("first_timeout", this.f101404a, z);
                return;
            }
            C41586e.m165036a(larkLocation, this.f101409f);
            Log.m165389i("LittleAppLocationTask", "location task complete:" + this.f101404a.toString());
            if (this.f101407d != null) {
                Log.m165389i("LittleAppLocationTask", "completeTask onLocationSuccess");
                AbstractC41371j.AbstractC41380i iVar = this.f101407d;
                LarkLocation larkLocation2 = this.f101404a;
                iVar.mo142999a(larkLocation2, C39817f.m158079a(larkLocation2), this.f101404a.mo149621h());
            }
            C39815e.m158060a().mo144316a("first_callback", this.f101404a, z);
            this.f101406c = true;
        }
    }

    /* renamed from: a */
    public boolean mo144314a(LarkLocation larkLocation) {
        if (larkLocation == null) {
            Log.m165383e("LittleAppLocationTask", "location is null");
            return false;
        } else if (this.f101404a == null || larkLocation.getAccuracy() <= this.f101404a.getAccuracy() || this.f101404a.distanceTo(larkLocation) >= this.f101404a.getAccuracy()) {
            this.f101404a = larkLocation;
            if (m158055a()) {
                Log.m165389i("LittleAppLocationTask", "DesiredLocationAvailable call back success");
                mo144313a(false);
                return true;
            }
            Log.m165389i("LittleAppLocationTask", "location is not fit:" + larkLocation.getAccuracy());
            return false;
        } else {
            Log.m165389i("LittleAppLocationTask", "not need update task location");
            return false;
        }
    }

    /* renamed from: a */
    public void mo144312a(LarkLocation larkLocation, List<Location> list) {
        if (this.f101407d != null) {
            LarkLocation a = C41586e.m165036a(larkLocation, this.f101409f);
            ArrayList<Location> arrayList = new ArrayList<>();
            if (list == null || list.size() <= 0) {
                arrayList.add(a);
            } else {
                for (Location location : list) {
                    arrayList.add(C39817f.m158077a(location, this.f101409f));
                }
            }
            this.f101407d.mo143001a(arrayList, a, C39817f.m158079a(a), a.mo149621h());
            Log.m165389i("LittleAppLocationTask", "task onlocationchange list size:" + arrayList.size());
        }
    }

    public C39814d(AbstractC41371j.AbstractC41380i iVar, LocationRequestOption locationRequestOption, float f, long j) {
        this.f101407d = iVar;
        this.f101409f = locationRequestOption;
        this.f101408e = f;
        this.f101405b = j;
    }
}
