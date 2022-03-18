package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.TodoForwardData;
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

public class ShareTodoForwardTemplateFactory {

    public static class ShareEnhancedView implements ForwardEnhancedView {
        public static final Parcelable.Creator<ShareEnhancedView> CREATOR = new Parcelable.Creator<ShareEnhancedView>() {
            /* class com.ss.android.lark.forward.template.ShareTodoForwardTemplateFactory.ShareEnhancedView.C384931 */

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
        /* renamed from: d */
        public boolean mo140746d(List<ForwardTarget> list, Bundle bundle) {
            return ShareTodoForwardTemplateFactory.m151852a(list);
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140741a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar, ForwardTemplate forwardTemplate) {
            aVar.proceed();
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
            C38364a.m151054a().mo140447i().mo140519a(textView, textView2, gifImageView, ((TodoForwardData) bundle.getSerializable("key_param_todo")).getTodoSummary());
        }
    }

    /* renamed from: a */
    private static AbstractC38405a m151850a() {
        return $$Lambda$ShareTodoForwardTemplateFactory$NYowe8XbghQJy9a6yG_pCFOILDs.INSTANCE;
    }

    /* renamed from: a */
    public static boolean m151852a(List<ForwardTarget> list) {
        if (C38364a.m151054a().mo140445g().mo140456a()) {
            return false;
        }
        for (ForwardTarget forwardTarget : list) {
            if (forwardTarget.mo140572f().isCrossTenant()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static ForwardTemplate m151849a(TodoForwardData todoForwardData) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140610a(new ForwardFeature.C38394a().mo140775a(false).mo140780e(true).mo140777b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(false).mo140846b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140892a(new ShareEnhancedView()).mo140897b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_param_todo", todoForwardData);
        aVar.mo140609a(bundle);
        return aVar.mo140617a(m151850a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151851a(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        String string = bundle.getString("key_param_addition_note", "");
        AbstractC38365a.AbstractC38380o i = C38364a.m151054a().mo140447i();
        aVar.mo140599a(i.mo140516a(), i.mo140517a(arrayList, string, ((TodoForwardData) bundle.getSerializable("key_param_todo")).getTodoGuid()));
    }
}
