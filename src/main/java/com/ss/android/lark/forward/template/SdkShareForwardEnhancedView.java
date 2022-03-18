package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import java.util.ArrayList;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public class SdkShareForwardEnhancedView implements ForwardEnhancedView {
    public static final Parcelable.Creator<SdkShareForwardEnhancedView> CREATOR = new Parcelable.Creator<SdkShareForwardEnhancedView>() {
        /* class com.ss.android.lark.forward.template.SdkShareForwardEnhancedView.C384832 */

        /* renamed from: a */
        public SdkShareForwardEnhancedView[] newArray(int i) {
            return new SdkShareForwardEnhancedView[i];
        }

        /* renamed from: a */
        public SdkShareForwardEnhancedView createFromParcel(Parcel parcel) {
            return new SdkShareForwardEnhancedView(parcel);
        }
    };

    /* renamed from: a */
    private ShareDataForwardData f98946a;

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140739a(Activity activity, ConstraintLayout constraintLayout, List<ForwardTarget> list, Bundle bundle) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140740a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public boolean mo140743a(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: b */
    public boolean mo140744b(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: c */
    public boolean mo140745c(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: d */
    public boolean mo140746d(List<ForwardTarget> list, Bundle bundle) {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public SdkShareForwardEnhancedView(ShareDataForwardData shareDataForwardData) {
        this.f98946a = shareDataForwardData;
    }

    public SdkShareForwardEnhancedView(Parcel parcel) {
        this.f98946a = (ShareDataForwardData) parcel.readSerializable();
    }

    /* renamed from: a */
    private void m151789a(final Activity activity) {
        if (activity != null) {
            LarkRxSchedulers.mainThread().scheduleDirect(new Runnable() {
                /* class com.ss.android.lark.forward.template.SdkShareForwardEnhancedView.RunnableC384843 */

                public void run() {
                    try {
                        activity.finish();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f98946a);
    }

    /* renamed from: a */
    private void m151792a(Context context, List<ForwardTarget> list) {
        ArrayList arrayList = new ArrayList();
        for (ForwardTarget forwardTarget : list) {
            arrayList.add(forwardTarget.mo140567b());
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            C38364a.m151054a().mo140442d().mo140476a(context, (String) arrayList.get(0), true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m151791a(Activity activity, List list, DialogInterface dialogInterface, int i) {
        m151789a(activity);
        if (list == null || list.size() != 1) {
            C38364a.m151054a().mo140437a(activity, "", (String) null, new Bundle());
        } else {
            m151792a(activity, list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m151790a(Activity activity, Bundle bundle, DialogInterface dialogInterface, int i) {
        if (activity != null) {
            try {
                C38364a.m151054a().mo140451m().mo140514a(this.f98946a, 1);
                C38364a.m151054a().mo140437a(activity, "", (String) null, bundle);
                activity.moveTaskToBack(true);
                activity.finish();
            } catch (Exception e) {
                Log.m165384e("SdkShareForwardEnhancedView", "moveTaskToBack error:", e);
            }
        }
    }

    /* renamed from: a */
    public Dialog mo141116a(Activity activity, ForwardTemplate forwardTemplate, Bundle bundle, List<ForwardTarget> list) {
        String str;
        if (bundle == null) {
            str = "";
        } else {
            str = bundle.getString(ShareHitPoint.f121868c, "");
        }
        boolean z = false;
        UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).title("")).cancelOnTouchOutside(false)).cancelable(false)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL)).contentLayoutRes(R.layout.sdk_share_result_layout)).addActionButton(R.id.ud_dialog_btn_primary, UIUtils.getString(activity, R.string.Lark_Legacy_StayFeishu), new DialogInterface.OnClickListener(activity, list) {
            /* class com.ss.android.lark.forward.template.$$Lambda$SdkShareForwardEnhancedView$P0u3M4A49jA8YXnU9ElC1E8lp4Q */
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SdkShareForwardEnhancedView.lambda$P0u3M4A49jA8YXnU9ElC1E8lp4Q(SdkShareForwardEnhancedView.this, this.f$1, this.f$2, dialogInterface, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, UIUtils.getString(activity, R.string.Lark_Legacy_DialogBack) + str, new DialogInterface.OnClickListener(activity, bundle) {
            /* class com.ss.android.lark.forward.template.$$Lambda$SdkShareForwardEnhancedView$292GbJFBgfmplMfzdGaIlUiBetg */
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ Bundle f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SdkShareForwardEnhancedView.lambda$292GbJFBgfmplMfzdGaIlUiBetg(SdkShareForwardEnhancedView.this, this.f$1, this.f$2, dialogInterface, i);
            }
        });
        if (DesktopUtil.m144307b() && forwardTemplate.mo140596i().mo140805a() == 0) {
            z = true;
        }
        if (z) {
            eVar.width((float) UIHelper.dp2px(420.0f));
        }
        UDDialog build = eVar.build();
        if (build.getWindow() != null) {
            if (z) {
                build.getWindow().setDimAmount(0.7f);
            } else {
                build.getWindow().setDimAmount(0.3f);
            }
        }
        C38364a.m151054a().mo140435a(build);
        build.show();
        return build;
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140741a(final Activity activity, final List<ForwardTarget> list, final Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar, final ForwardTemplate forwardTemplate) {
        forwardTemplate.mo140588b().onForward(list, bundle, new AbstractC38405a.AbstractC38406a() {
            /* class com.ss.android.lark.forward.template.SdkShareForwardEnhancedView.C384821 */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
            /* renamed from: a */
            public void mo140599a(int i, Intent intent) {
                SdkShareForwardEnhancedView.this.mo141116a(activity, forwardTemplate, bundle, list);
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
            /* renamed from: a */
            public void mo140601a(String str, boolean z) {
                Log.m165383e("SdkShareForwardEnhancedView", "forward failed message: " + str + ", isClose:" + z);
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
            /* renamed from: a */
            public void mo140600a(String str, String str2, boolean z) {
                Log.m165383e("SdkShareForwardEnhancedView", "forward failed title: " + str + ", message:" + str2 + ", isClose:" + z);
            }
        });
    }
}
