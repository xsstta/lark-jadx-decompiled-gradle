package com.ss.android.lark.p1425c.p1427b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lark.pb.settings.v1.SetGuideToRateEventRequest;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.p1425c.p1428c.C30011a;
import com.ss.android.lark.p1425c.p1429d.C30015c;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.c.b.a */
public class DialogC29997a extends BaseDialog {

    /* renamed from: a */
    public Intent f74830a;

    /* renamed from: b */
    private Context f74831b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = View.inflate(this.f74831b, R.layout.app_rating_dialog, null);
        ((TextView) inflate.findViewById(R.id.appRatingMessageTv)).setText(UIHelper.mustacheFormat((int) R.string.Lark_Feed_RateEnjoyingLark));
        inflate.findViewById(R.id.appRatingPraiseBtn).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.p1425c.p1427b.DialogC29997a.View$OnClickListenerC299981 */

            public void onClick(View view) {
                C30015c.m110992a().startActivity(DialogC29997a.this.f74830a);
                DialogC29997a.this.dismiss();
                C30002b.m110947a().mo108089a(SetGuideToRateEventRequest.EventType.RATE);
                C30011a.m110968a();
            }
        });
        inflate.findViewById(R.id.appRatingCancelBtn).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.p1425c.p1427b.DialogC29997a.View$OnClickListenerC299992 */

            public void onClick(View view) {
                DialogC29997a.this.dismiss();
                C30002b.m110947a().mo108089a(SetGuideToRateEventRequest.EventType.CANCEL);
                C30011a.m110971b();
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.ss.android.lark.p1425c.p1427b.DialogC29997a.DialogInterface$OnShowListenerC300003 */

            public void onShow(DialogInterface dialogInterface) {
                C30002b.m110947a().mo108089a(SetGuideToRateEventRequest.EventType.SHOW);
                C30011a.m110969a(C30002b.m110947a().mo108093b());
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.p1425c.p1427b.DialogC29997a.DialogInterface$OnDismissListenerC300014 */

            public void onDismiss(DialogInterface dialogInterface) {
                C30002b.m110947a().mo108086a(0);
            }
        });
        setContentView(inflate);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public DialogC29997a(Context context, Intent intent) {
        super(context);
        this.f74831b = context;
        this.f74830a = intent;
    }
}
