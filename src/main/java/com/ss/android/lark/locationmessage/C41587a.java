package com.ss.android.lark.locationmessage;

import android.app.Activity;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.locationmessage.ui.navigation.C41636b;
import com.ss.android.lark.locationmessage.ui.navigation.C41637c;
import com.ss.android.lark.locationmessage.ui.navigation.MapRouteService;
import java.util.List;

/* renamed from: com.ss.android.lark.locationmessage.a */
public class C41587a {
    /* renamed from: a */
    public static void m165045a(Activity activity, LocationInfo locationInfo) {
        C41637c b = MapRouteService.m165178a().mo149737b();
        if (b == null || !b.mo149777a()) {
            LKUIToast.show(activity, (int) R.string.Lark_Chat_MessageLocationDirectionsAndroidNoMaps);
        } else if (b.mo149780b()) {
            MapRouteService.m165178a().mo149736a(activity, b.mo149776a(0), locationInfo.getName(), locationInfo.getLatitude(), locationInfo.getLongitude());
        } else {
            List<String> c = b.mo149781c();
            c.add(activity.getString(R.string.Lark_Legacy_Cancel));
            ((C25644o) ((C25644o) ((C25644o) new C25644o(activity).mo89206a(b.mo149778a(c))).mo89210d(R.layout.location_dialog_navigate_menu_item)).mo89290y(0).mo89202a(new DialogInterface.OnClickListener(activity, locationInfo) {
                /* class com.ss.android.lark.locationmessage.$$Lambda$a$aRpKMjrx5oaNtJ9X52V_yt9AvRg */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ LocationInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41587a.lambda$aRpKMjrx5oaNtJ9X52V_yt9AvRg(C41637c.this, this.f$1, this.f$2, dialogInterface, i);
                }
            })).mo89239c();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m165046a(C41637c cVar, Activity activity, LocationInfo locationInfo, DialogInterface dialogInterface, int i) {
        C41636b a = cVar.mo149776a(i);
        if (a != null) {
            MapRouteService.m165178a().mo149736a(activity, a, locationInfo.getName(), locationInfo.getLatitude(), locationInfo.getLongitude());
        }
    }
}
