package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public class ShareCalendarForwardTemplateFactory {

    public static class ShareEnhancedView implements ForwardEnhancedView {
        public static final Parcelable.Creator<ShareEnhancedView> CREATOR = new Parcelable.Creator<ShareEnhancedView>() {
            /* class com.ss.android.lark.forward.template.ShareCalendarForwardTemplateFactory.ShareEnhancedView.C384882 */

            /* renamed from: a */
            public ShareEnhancedView[] newArray(int i) {
                return new ShareEnhancedView[i];
            }

            /* renamed from: a */
            public ShareEnhancedView createFromParcel(Parcel parcel) {
                return new ShareEnhancedView(parcel);
            }
        };

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
        public boolean mo140743a(List<ForwardTarget> list, Bundle bundle) {
            return false;
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: b */
        public boolean mo140744b(List<ForwardTarget> list, Bundle bundle) {
            return true;
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

        public ShareEnhancedView() {
        }

        public ShareEnhancedView(Parcel parcel) {
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140741a(Activity activity, List<ForwardTarget> list, Bundle bundle, final ForwardEnhancedView.AbstractC38392a aVar, ForwardTemplate forwardTemplate) {
            new C25639g(activity).mo89248g(R.string.Lark_Legacy_ShareToExternal).mo89254m(R.string.Lark_Legacy_ShareToExternalHint).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ExternalAlertSure, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.forward.template.ShareCalendarForwardTemplateFactory.ShareEnhancedView.DialogInterface$OnClickListenerC384871 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    aVar.proceed();
                }
            }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_ExternalAlertCancel, (DialogInterface.OnClickListener) null).mo89239c();
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
            C38364a.m151054a().mo140446h().mo140461a(textView, textView2, gifImageView, C38364a.m151054a().mo140446h().mo140459a((CalendarForwardData) bundle.getSerializable("key_param_calendar_event")));
        }
    }

    /* renamed from: b */
    private static AbstractC38405a m151815b(Context context, CalendarForwardData calendarForwardData) {
        return $$Lambda$ShareCalendarForwardTemplateFactory$UI7FyBeV8qMUehGgVqgQgDMOMc.INSTANCE;
    }

    /* renamed from: a */
    public static ForwardTemplate m151813a(Context context, CalendarForwardData calendarForwardData) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        Message message = new Message();
        message.setMessageContent(C38364a.m151054a().mo140446h().mo140459a(calendarForwardData));
        message.setType(Message.Type.SHARE_CALENDAR_EVENT);
        aVar.mo140610a(new ForwardFeature.C38394a().mo140775a(false).mo140779d(false).mo140780e(false).mo140777b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(C38364a.m151054a().mo140446h().mo140464a(message)).mo140846b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140892a(new ShareEnhancedView()).mo140897b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_param_calendar_event", calendarForwardData);
        aVar.mo140609a(bundle);
        return aVar.mo140617a(m151815b(context, calendarForwardData));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151814a(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        AbstractC38365a.AbstractC38367b h = C38364a.m151054a().mo140446h();
        aVar.mo140599a(h.mo140465b(), h.mo140458a(arrayList, false));
    }
}
