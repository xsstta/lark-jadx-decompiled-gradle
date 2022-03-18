package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.dto.template.IForwardProxyExecutor;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public class MailForwardTemplateFactory {

    /* access modifiers changed from: private */
    public static class ForwardMailExecutor implements IForwardProxyExecutor {
        public static final Parcelable.Creator<ForwardMailExecutor> CREATOR = new Parcelable.Creator<ForwardMailExecutor>() {
            /* class com.ss.android.lark.forward.template.MailForwardTemplateFactory.ForwardMailExecutor.C384561 */

            /* renamed from: a */
            public ForwardMailExecutor[] newArray(int i) {
                return new ForwardMailExecutor[i];
            }

            /* renamed from: a */
            public ForwardMailExecutor createFromParcel(Parcel parcel) {
                return new ForwardMailExecutor(parcel.readString());
            }
        };

        /* renamed from: a */
        private final String f98874a;

        public int describeContents() {
            return 0;
        }

        public ForwardMailExecutor(String str) {
            this.f98874a = str;
        }

        @Override // com.ss.android.lark.forward.dto.template.IForwardProxyExecutor
        /* renamed from: a */
        public void mo140900a(Activity activity) {
            Log.m165389i("ForwardMailExecutor", "bindActivityIfNeed");
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeString(this.f98874a);
            }
        }

        @Override // com.ss.android.lark.forward.dto.template.IForwardProxyExecutor
        /* renamed from: a */
        public void mo140901a(List<ForwardTarget> list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
            Log.m165389i("ForwardMailExecutor", "onForward");
            if (aVar != null) {
                if (CollectionUtils.isNotEmpty(list)) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (ForwardTarget forwardTarget : list) {
                        if (forwardTarget != null && !TextUtils.isEmpty(forwardTarget.mo140567b())) {
                            arrayList.add(forwardTarget.mo140567b());
                        }
                    }
                    if (bundle != null) {
                        bundle.putStringArrayList(this.f98874a, arrayList);
                    }
                }
                Intent intent = new Intent();
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                aVar.mo140599a(-1, intent);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class ForwardMailEnhancedView implements ForwardEnhancedView {
        public static final Parcelable.Creator<ForwardMailEnhancedView> CREATOR = new Parcelable.Creator<ForwardMailEnhancedView>() {
            /* class com.ss.android.lark.forward.template.MailForwardTemplateFactory.ForwardMailEnhancedView.C384551 */

            /* renamed from: a */
            public ForwardMailEnhancedView[] newArray(int i) {
                return new ForwardMailEnhancedView[i];
            }

            /* renamed from: a */
            public ForwardMailEnhancedView createFromParcel(Parcel parcel) {
                if (parcel != null) {
                    return new ForwardMailEnhancedView(parcel.readInt(), parcel.readString());
                }
                Log.m165383e("MailForwardTemplateFactory", "createFromParcel");
                return null;
            }
        };

        /* renamed from: a */
        private final int f98872a;

        /* renamed from: b */
        private final String f98873b;

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
        public void mo140741a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar, ForwardTemplate forwardTemplate) {
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

        ForwardMailEnhancedView(int i, String str) {
            this.f98872a = i;
            this.f98873b = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeInt(this.f98872a);
                parcel.writeString(this.f98873b);
            }
        }

        @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
        /* renamed from: a */
        public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
            Log.m165389i("MailForwardTemplateFactory", "interceptBasicDialogDataRender");
            gifImageView.setImageResource(this.f98872a);
            gifImageView.setVisibility(0);
            textView2.setText(this.f98873b);
            textView2.setMaxLines(3);
            textView2.setTextSize(1, 14.0f);
            textView2.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m151690a(int i, String str, Bundle bundle, String str2) {
        Log.m165389i("MailForwardTemplateFactory", "getForwardMailTemplate");
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140609a(bundle);
        aVar.mo140610a(new ForwardFeature.C38394a().mo140776b(true).mo140780e(true).mo140777b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(true).mo140846b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140892a(new ForwardMailEnhancedView(i, str)).mo140897b());
        return aVar.mo140616a(new ForwardMailExecutor(str2));
    }
}
