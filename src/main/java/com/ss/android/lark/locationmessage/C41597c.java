package com.ss.android.lark.locationmessage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.lark.pb.basic.v1.Content;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.AbstractC29622o;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency;
import com.ss.android.lark.locationmessage.message.C41617b;
import com.ss.android.lark.locationmessage.message.C41618c;
import com.ss.android.lark.locationmessage.message.C41619e;
import com.ss.android.lark.locationmessage.p2148a.C41588a;
import com.ss.android.lark.locationmessage.p2149b.C41596g;
import com.ss.android.lark.locationmessage.ui.picklocation.LocationActivity;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.locationmessage.c */
public class C41597c {

    /* renamed from: a */
    public static volatile IMessageLocationDependency f105680a;

    /* renamed from: b */
    private final AtomicInteger f105681b = new AtomicInteger();

    /* renamed from: com.ss.android.lark.locationmessage.c$a */
    public interface AbstractC41601a {
        /* renamed from: a */
        void mo149722a(LarkLocation larkLocation);
    }

    /* renamed from: a */
    public static IMessageLocationDependency m165069a() {
        return f105680a;
    }

    /* renamed from: b */
    public IOpenMessageCellFactory mo149716b() {
        return new C41618c();
    }

    /* renamed from: a */
    public IPlusItem mo149709a(Chat chat) {
        return new C41617b(chat);
    }

    public C41597c(IMessageLocationDependency iMessageLocationDependency) {
        f105680a = iMessageLocationDependency;
    }

    /* renamed from: a */
    public LocationContent mo149710a(Content content) {
        return C41619e.m165165a(content);
    }

    /* renamed from: b */
    public void mo149717b(Activity activity, LocationInfo locationInfo) {
        C41589b.m165053b(activity, locationInfo);
    }

    /* renamed from: a */
    public void mo149711a(Activity activity, LocationInfo locationInfo) {
        C41587a.m165045a(activity, locationInfo);
    }

    /* renamed from: a */
    public void mo149715a(Context context, LocationInfo locationInfo, String str) {
        C41589b.m165052a(context, locationInfo, str);
    }

    /* renamed from: a */
    public void mo149712a(Activity activity, Integer num, POIConfig pOIConfig, AbstractC29622o oVar) {
        mo149713a(activity, num, pOIConfig, oVar, false);
    }

    /* renamed from: a */
    private Intent m165068a(Context context, POIConfig pOIConfig, AbstractC29622o oVar, boolean z) {
        Bundle bundle = new Bundle();
        String str = "location_key_unique" + this.f105681b.getAndIncrement();
        bundle.putString("location_unique_key", str);
        C41588a.m165048b(str).mo149705a(oVar);
        bundle.putSerializable("location_request_config", pOIConfig);
        Intent intent = new Intent(context, LocationActivity.class);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (DesktopUtil.m144301a(context) && !z) {
            intent.addFlags(402653184);
        }
        return intent;
    }

    /* renamed from: b */
    public void mo149718b(Activity activity, Integer num, POIConfig pOIConfig, AbstractC29622o oVar, boolean z) {
        if (DesktopUtil.m144301a((Context) activity) && !z) {
            StandAloneParam.C36572a aVar = new StandAloneParam.C36572a(m165068a(activity, pOIConfig, oVar, z));
            if (num != null) {
                aVar.mo134969c(num.intValue());
            }
            C36512a.m144041a().mo134756a(activity, aVar.mo134967a());
        } else if (num == null) {
            activity.startActivity(m165068a(activity, pOIConfig, oVar, z));
        } else {
            activity.startActivityForResult(m165068a(activity, pOIConfig, oVar, z), num.intValue());
        }
    }

    /* renamed from: a */
    public void mo149713a(final Activity activity, final Integer num, final POIConfig pOIConfig, final AbstractC29622o oVar, final boolean z) {
        C51331a aVar = new C51331a(activity);
        if (aVar.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
            mo149718b(activity, num, pOIConfig, oVar, z);
        } else {
            aVar.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.locationmessage.C41597c.C415981 */

                /* renamed from: a */
                public void accept(Boolean bool) {
                    if (bool.booleanValue()) {
                        C41597c.this.mo149718b(activity, num, pOIConfig, oVar, z);
                    } else {
                        new C25639g(activity).mo89248g(R.string.Lark_Chat_MessageLocationPermissionBanTitle).mo89238b(true).mo89249h(17).mo89250i(R.color.text_title).mo89242c(C41596g.m165066a(activity, R.string.Lark_Chat_MessageLocationPermissionBanContentAndroid)).mo89256o(R.color.text_placeholder).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_MessageLocationPermissionBanCancelButton, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.locationmessage.C41597c.C415981.DialogInterface$OnClickListenerC416002 */

                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Chat_MessageLocationPermissionBanSettingButton, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.lark.locationmessage.C41597c.C415981.DialogInterface$OnClickListenerC415991 */

                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent();
                                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.addCategory("android.intent.category.DEFAULT");
                                intent.setData(Uri.parse(String.format("package:%1$s", activity.getPackageName())));
                                intent.addFlags(1073741824);
                                intent.addFlags(8388608);
                                activity.startActivity(intent);
                            }
                        }).mo89239c();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo149714a(Activity activity, String str, String str2, double d, double d2, int i) {
        C41589b.m165053b(activity, new LocationInfo.C29595a(String.valueOf(d), String.valueOf(d2)).mo106513a(str).mo106516b(str2).mo106511a(i).mo106515a());
    }
}
