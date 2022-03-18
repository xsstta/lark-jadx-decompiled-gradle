package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.dto.template.IForwardCancelListener;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ShareFileForwardTemplateFactory {

    /* access modifiers changed from: private */
    public static class CancelListener implements IForwardCancelListener {
        public static final Parcelable.Creator<CancelListener> CREATOR = new Parcelable.Creator<CancelListener>() {
            /* class com.ss.android.lark.forward.template.ShareFileForwardTemplateFactory.CancelListener.C384891 */

            /* renamed from: a */
            public CancelListener[] newArray(int i) {
                return new CancelListener[i];
            }

            /* renamed from: a */
            public CancelListener createFromParcel(Parcel parcel) {
                return new CancelListener(parcel);
            }
        };

        /* renamed from: a */
        private ShareDataForwardData f98961a;

        public int describeContents() {
            return 0;
        }

        @Override // com.ss.android.lark.forward.dto.template.IForwardCancelListener
        /* renamed from: a */
        public void mo140899a() {
            AbstractC38365a.AbstractC38379n m = C38364a.m151054a().mo140451m();
            if (m != null) {
                m.mo140514a(this.f98961a, 3);
            }
        }

        public CancelListener(ShareDataForwardData shareDataForwardData) {
            this.f98961a = shareDataForwardData;
        }

        public CancelListener(Parcel parcel) {
            this.f98961a = (ShareDataForwardData) parcel.readSerializable();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.f98961a);
        }
    }

    /* renamed from: a */
    private static AbstractC38405a m151827a(ShareDataForwardData shareDataForwardData) {
        return new AbstractC38405a() {
            /* class com.ss.android.lark.forward.template.$$Lambda$ShareFileForwardTemplateFactory$DNmV19du04ktsOgVSI4rQpEwA */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                ShareFileForwardTemplateFactory.m151829a(ShareDataForwardData.this, list, bundle, aVar);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151831a(List list, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(C38364a.m151054a().mo140442d().mo140474a(list));
    }

    /* renamed from: a */
    public static ForwardTemplate m151826a(Context context, ShareDataForwardData shareDataForwardData) {
        CancelListener cancelListener;
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        boolean z = true;
        ForwardFeature.C38394a f = new ForwardFeature.C38394a().mo140776b(!shareDataForwardData.isSystemShare()).mo140780e(shareDataForwardData.canAddExtraInfo()).mo140781f(shareDataForwardData.isSdkShare());
        if (shareDataForwardData.isSdkShare()) {
            cancelListener = new CancelListener(shareDataForwardData);
        } else {
            cancelListener = null;
        }
        aVar.mo140610a(f.mo140773a(cancelListener).mo140777b());
        if (shareDataForwardData.isSdkShare()) {
            aVar.mo140615a(new ForwardViewDependency.C38404a().mo140891a(m151832b(context, shareDataForwardData)).mo140892a(new SdkShareForwardEnhancedView(shareDataForwardData)).mo140897b());
            aVar.mo140611a(new ForwardHitPoint.Builder().mo140796a(shareDataForwardData.getSource()).mo140798a());
        }
        if (shareDataForwardData.isIncludeExternal() || shareDataForwardData.isSystemShare() || shareDataForwardData.isSdkShare()) {
            z = false;
        }
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(z).mo140846b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(shareDataForwardData.isForceStandAlone() ? 1 : 0).mo140814b());
        if (shareDataForwardData.isSdkShare()) {
            Bundle bundle = new Bundle();
            bundle.putString(ShareHitPoint.f121868c, shareDataForwardData.getSource());
            bundle.putBoolean("sdkshare", shareDataForwardData.isSdkShare());
            aVar.mo140609a(bundle);
        }
        return aVar.mo140617a(m151827a(shareDataForwardData));
    }

    /* renamed from: b */
    private static BasicDialogContent m151832b(Context context, ShareDataForwardData shareDataForwardData) {
        BasicDialogContent.C38391a aVar = new BasicDialogContent.C38391a();
        if (shareDataForwardData == null || !shareDataForwardData.isSdkShare()) {
            return aVar.mo140732a();
        }
        String title = shareDataForwardData.getTitle();
        if (TextUtils.isEmpty(title)) {
            title = shareDataForwardData.getContent();
        }
        if (!TextUtils.isEmpty(title)) {
            aVar.mo140735b(title);
            return aVar.mo140732a();
        }
        Map<String, Long> videos = shareDataForwardData.getVideos();
        if (!CollectionUtils.isEmpty(videos)) {
            aVar.mo140730a(UIUtils.getString(context, R.string.Lark_Legacy_MediaMessageHolder));
            aVar.mo140733b(R.drawable.ic_svg_forward_video_time_icon);
            ArrayList arrayList = new ArrayList(videos.values());
            if (((Long) arrayList.get(0)).longValue() > 0) {
                aVar.mo140736c(C26311p.m95262a(((Long) arrayList.get(0)).longValue()));
            }
        }
        List<String> images = shareDataForwardData.getImages();
        if (images == null || images.size() <= 0) {
            return aVar.mo140732a();
        }
        Image image = new Image();
        image.setUrls(images);
        aVar.mo140734b(image);
        if (videos == null || videos.size() == 0) {
            aVar.mo140730a(UIUtils.getString(context, R.string.Lark_Legacy_ImageMessageHolder));
        }
        return aVar.mo140732a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151830a(AbstractC38405a.AbstractC38406a aVar, Throwable th) throws Exception {
        aVar.mo140601a(UIHelper.getString(R.string.Lark_Legacy_ShareFailed), false);
        Log.m165382e("Get chats by ids failed: " + th.getMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151828a(Bundle bundle, ShareDataForwardData shareDataForwardData, Map map) throws Exception {
        String string = bundle.getString("key_param_addition_note", "");
        for (Chat chat : map.values()) {
            shareDataForwardData.setExtraInfo(string);
            C38364a.m151054a().mo140451m().mo140515a(chat, shareDataForwardData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151829a(ShareDataForwardData shareDataForwardData, List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        Observable.create(new ObservableOnSubscribe(arrayList) {
            /* class com.ss.android.lark.forward.template.$$Lambda$ShareFileForwardTemplateFactory$kxydesfmkhx4fqpv8Sdkc0Pe7I */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                ShareFileForwardTemplateFactory.m151831a(this.f$0, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(bundle, shareDataForwardData) {
            /* class com.ss.android.lark.forward.template.$$Lambda$ShareFileForwardTemplateFactory$q5_ipDEojbqXBsjQBP06HVr_EGA */
            public final /* synthetic */ Bundle f$0;
            public final /* synthetic */ ShareDataForwardData f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShareFileForwardTemplateFactory.m151828a(this.f$0, this.f$1, (Map) obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.forward.template.$$Lambda$ShareFileForwardTemplateFactory$ZzFiGVvrC3gq3yn2Ik1tu455Mk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShareFileForwardTemplateFactory.m151830a(AbstractC38405a.AbstractC38406a.this, (Throwable) obj);
            }
        });
        aVar.mo140599a(-1, (Intent) null);
    }
}
