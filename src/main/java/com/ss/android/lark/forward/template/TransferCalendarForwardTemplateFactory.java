package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.AbstractC38407b;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardTargetSource;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.ui.DialogC57586c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public class TransferCalendarForwardTemplateFactory {

    public static class TransferEnhancedView implements ForwardEnhancedView {
        public static final Parcelable.Creator<TransferEnhancedView> CREATOR = new Parcelable.Creator<TransferEnhancedView>() {
            /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.TransferEnhancedView.C384995 */

            /* renamed from: a */
            public TransferEnhancedView[] newArray(int i) {
                return new TransferEnhancedView[i];
            }

            /* renamed from: a */
            public TransferEnhancedView createFromParcel(Parcel parcel) {
                return new TransferEnhancedView(parcel);
            }
        };

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140739a(Activity activity, ConstraintLayout constraintLayout, List<ForwardTarget> list, Bundle bundle) {
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140741a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar, ForwardTemplate forwardTemplate) {
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public boolean mo140743a(List<ForwardTarget> list, Bundle bundle) {
            return true;
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
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        public TransferEnhancedView() {
        }

        public TransferEnhancedView(Parcel parcel) {
        }

        /* renamed from: b */
        private void m151868b(Activity activity, final CalendarForwardData calendarForwardData, final ForwardEnhancedView.AbstractC38392a aVar) {
            DialogC57586c a = C57811b.m224344a(activity, UIHelper.getString(R.string.Calendar_Transfer_Transfer), UIHelper.getString(R.string.Calendar_Transfer_TransferEventFromSharedCalendar), UIHelper.getString(R.string.Calendar_Common_Transfer), UIHelper.getString(R.string.Calendar_Common_Cancel), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.TransferEnhancedView.DialogInterface$OnClickListenerC384984 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    calendarForwardData.setIsQuit(false);
                    aVar.proceed();
                }
            }, null);
            a.mo195558a(1);
            a.mo195562b(14);
            a.mo195568d(UIUtils.getColor(activity, R.color.text_caption));
        }

        /* renamed from: a */
        private void m151867a(Activity activity, final CalendarForwardData calendarForwardData, final ForwardEnhancedView.AbstractC38392a aVar) {
            ArrayList arrayList = new ArrayList();
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_Transfer_TransferAndQuitEvent, "name", calendarForwardData.getLocalizedDisplayName());
            arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Calendar_Transfer_QuitEvent), new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.TransferEnhancedView.C384962 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                    calendarForwardData.setIsQuit(true);
                    aVar.proceed();
                }
            }));
            arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Calendar_Transfer_NotQuit), new C58339d.AbstractC58343b() {
                /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.TransferEnhancedView.C384973 */

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public void onMenuItemClick() {
                    calendarForwardData.setIsQuit(false);
                    aVar.proceed();
                }
            }));
            Dialog a = new C58339d.C58344c(activity, arrayList, mustacheFormat).mo197578a(true).mo197576a();
            C57810a.m224336a(activity, a);
            a.show();
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140740a(Activity activity, List<ForwardTarget> list, Bundle bundle, final ForwardEnhancedView.AbstractC38392a aVar) {
            CalendarForwardData calendarForwardData;
            if ((list == null || list.size() == 1) && (calendarForwardData = (CalendarForwardData) bundle.getSerializable("key_param_calendar_event")) != null) {
                C38364a.m151054a().mo140446h();
                if (calendarForwardData.isShareCalendarEvent()) {
                    m151868b(activity, calendarForwardData, aVar);
                } else if (C38364a.m151054a().mo140446h().mo140467d()) {
                    m151867a(activity, calendarForwardData, aVar);
                } else {
                    C25639g b = new C25639g(activity).mo89237b(UIHelper.getString(R.string.Calendar_Transfer_Transfer));
                    b.mo89242c(UIHelper.mustacheFormat((int) R.string.Calendar_Transfer_TransferExplanation, "name", calendarForwardData.getLocalizedDisplayName()) + UIHelper.mustacheFormat((int) R.string.Calendar_Transfer_ConfirmTransfer, "name", list.get(0).mo140568c())).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.TransferEnhancedView.DialogInterface$OnClickListenerC384951 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            aVar.proceed();
                        }
                    }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
                }
            }
        }
    }

    /* renamed from: a */
    private static AbstractC38405a m151864a(Context context) {
        return new AbstractC38405a(context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$TransferCalendarForwardTemplateFactory$sqb5T_plRQ6GG2ODVRIYnroMEwQ */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                TransferCalendarForwardTemplateFactory.lambda$sqb5T_plRQ6GG2ODVRIYnroMEwQ(this.f$0, list, bundle, aVar);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory$a */
    public static class C38500a implements AbstractC38407b {

        /* renamed from: a */
        public String f98982a;

        @Override // com.ss.android.lark.forward.dto.template.AbstractC38407b
        /* renamed from: a */
        public boolean mo140837a(ForwardTarget forwardTarget) {
            if (TextUtils.equals(forwardTarget.mo140567b(), this.f98982a)) {
                return true;
            }
            return false;
        }

        C38500a(CalendarForwardData calendarForwardData) {
            if (calendarForwardData != null && !TextUtils.isEmpty(calendarForwardData.getCalendarId())) {
                C38364a.m151054a().mo140446h().mo140463a(calendarForwardData.getCalendarId(), new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.C38500a.C385011 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C38500a.this.f98982a = str;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m151863a(Context context, CalendarForwardData calendarForwardData) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140610a(new ForwardFeature.C38394a().mo140776b(false).mo140775a(false).mo140780e(false).mo140777b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140847c(true).mo140845b(true).mo140843a(new C38500a(calendarForwardData)).mo140846b());
        aVar.mo140614a(new ForwardTargetSource.C38402a().mo140864a(false).mo140865b(false).mo140866b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140894a(false).mo140895b(UIHelper.getString(R.string.Calendar_Transfer_SearchOrganizer)).mo140892a(new TransferEnhancedView()).mo140897b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_param_calendar_event", calendarForwardData);
        aVar.mo140609a(bundle);
        return aVar.mo140617a(m151864a(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151865a(final Context context, List list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        if (!CollectionUtils.isEmpty(list)) {
            C38364a.m151054a().mo140446h();
            C384941 r0 = new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.forward.template.TransferCalendarForwardTemplateFactory.C384941 */

                /* renamed from: a */
                public void onSuccess(Void r3) {
                    LKUIToast.show(context, UIHelper.getString(R.string.Calendar_Transfer_TransferSuccessed));
                    aVar.mo140599a(-1, (Intent) null);
                    C38364a.m151054a().mo140446h().mo140466c();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (TemplateFactoryUtils.m151923a(errorResult)) {
                        aVar.mo140599a(-1, (Intent) null);
                    } else {
                        aVar.mo140601a(UIHelper.getString(R.string.Calendar_Transfer_TransferFailed), false);
                    }
                }
            };
            C38364a.m151054a().mo140446h().mo140462a((CalendarForwardData) bundle.getSerializable("key_param_calendar_event"), ((ForwardTarget) list.get(0)).mo140567b(), r0);
        }
    }
}
