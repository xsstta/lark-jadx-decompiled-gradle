package com.ss.android.appcenter.business.tab.business.popups;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonParseException;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.net.pupups.PopupsData;
import com.ss.android.appcenter.business.net.pupups.PopupsElement;
import com.ss.android.appcenter.business.net.pupups.PopupsNotification;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.popups.content.PopupsContentType;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27541f;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nJ\u0010\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/popups/BizPopupsHelper;", "", "()V", "MAX_STORAGE_IDS_SIZE", "", "SP_KEY_WORKPLACE_BIZ_POPUPS_SHOWED_IDS", "", "TAG", "anchorRef", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "bizWindowRef", "Lcom/ss/android/appcenter/business/tab/business/popups/BizPopupsWindow;", "fragmentRef", "Landroidx/fragment/app/Fragment;", "isLoading", "", "isPreloading", "isShowing", "ackBizPopupsShow", "", "nId", "dealData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/appcenter/business/net/pupups/PopupsData;", "destroy", "directShowPopups", "fgPopupsOpen", "isMarkedPopupsShowed", "markPopupsShowed", "preloadImgContent", "requestBizPopups", "fragment", "anchor", "resKey2Url", "fileKey", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.popups.a */
public final class BizPopupsHelper {

    /* renamed from: a */
    public static final BizPopupsHelper f69630a = new BizPopupsHelper();

    /* renamed from: b */
    private static WeakReference<Fragment> f69631b;

    /* renamed from: c */
    private static WeakReference<View> f69632c;

    /* renamed from: d */
    private static WeakReference<BizPopupsWindow> f69633d;

    /* renamed from: e */
    private static volatile boolean f69634e;

    /* renamed from: f */
    private static volatile boolean f69635f;

    /* renamed from: g */
    private static volatile boolean f69636g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/tab/business/popups/BizPopupsHelper$requestBizPopups$1", "Lcom/ss/android/appcenter/business/net/base/Service$ICallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/appcenter/business/net/base/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.a$c */
    public static final class C27856c implements C27714b.AbstractC27716a {
        C27856c() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.appcenter.business.tab.business.popups.a$c$a */
        static final class RunnableC27857a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PopupsData f69640a;

            RunnableC27857a(PopupsData popupsData) {
                this.f69640a = popupsData;
            }

            public final void run() {
                BizPopupsHelper aVar = BizPopupsHelper.f69630a;
                BizPopupsHelper.f69634e = false;
                BizPopupsHelper.f69630a.mo99362a(this.f69640a);
            }
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            BizPopupsHelper aVar = BizPopupsHelper.f69630a;
            BizPopupsHelper.f69634e = false;
            C28184h.m103248b("BizPopupsHelper", "get popups error:" + errorResult);
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            try {
                JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                if (jSONObject.optInt("code") == 0) {
                    if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        UICallbackExecutor.execute(new RunnableC27857a((PopupsData) C27579g.f68797a.fromJson(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), PopupsData.class)));
                        return;
                    }
                }
                BizPopupsHelper aVar = BizPopupsHelper.f69630a;
                BizPopupsHelper.f69634e = false;
                C28184h.m103248b("BizPopupsHelper", "request empty:" + sendHttpResponse.json_body);
            } catch (JsonParseException e) {
                mo98364a(new ErrorResult(e), bVar);
            } catch (JSONException e2) {
                mo98364a(new ErrorResult(e2), bVar);
            }
        }
    }

    private BizPopupsHelper() {
    }

    /* renamed from: b */
    private final boolean m101731b() {
        C27548m m = C27548m.m100547m();
        Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
        AbstractC27541f i = m.mo98225i();
        if (i != null) {
            return i.mo98187a("lark.workplace.notification");
        }
        return false;
    }

    /* renamed from: a */
    public final void mo99360a() {
        BizPopupsWindow bizPopupsWindow;
        f69636g = false;
        WeakReference<BizPopupsWindow> weakReference = f69633d;
        if (!(weakReference == null || (bizPopupsWindow = weakReference.get()) == null || !bizPopupsWindow.isShowing())) {
            bizPopupsWindow.mo99355b();
        }
        WeakReference<Fragment> weakReference2 = f69631b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference<View> weakReference3 = f69632c;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        WeakReference<BizPopupsWindow> weakReference4 = f69633d;
        if (weakReference4 != null) {
            weakReference4.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/tab/business/popups/BizPopupsHelper$ackBizPopupsShow$1", "Lcom/ss/android/appcenter/business/net/base/Service$ICallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "requestContext", "Lcom/ss/android/appcenter/business/net/base/Service$RequestContext;", "onSuccess", "response", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.a$a */
    public static final class C27854a implements C27714b.AbstractC27716a {

        /* renamed from: a */
        final /* synthetic */ String f69637a;

        C27854a(String str) {
            this.f69637a = str;
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            C28184h.m103248b("BizPopupsHelper", "ack error: nId=" + this.f69637a + ",err=" + errorResult);
        }

        @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
        /* renamed from: a */
        public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "response");
            Intrinsics.checkParameterIsNotNull(bVar, "requestContext");
            try {
                if (new JSONObject(sendHttpResponse.json_body).optInt("code") != 0) {
                    C28184h.m103248b("BizPopupsHelper", "ack error: nId=" + this.f69637a + ',' + sendHttpResponse.json_body);
                    return;
                }
                C28184h.m103250d("BizPopupsHelper", "ack success: nId=" + this.f69637a);
            } catch (JSONException e) {
                mo98364a(new ErrorResult(e), bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/appcenter/business/tab/business/popups/BizPopupsHelper$preloadImgContent$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Ljava/io/File;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onLoadStarted", "placeholder", "onResourceReady", "resource", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.popups.a$b */
    public static final class C27855b extends C38818i<File> {

        /* renamed from: a */
        final /* synthetic */ String f69638a;

        /* renamed from: b */
        final /* synthetic */ PopupsData f69639b;

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            BizPopupsHelper aVar = BizPopupsHelper.f69630a;
            BizPopupsHelper.f69635f = false;
            C28184h.m103248b("BizPopupsHelper", "preload image content failed, nId=" + this.f69638a);
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: b */
        public void mo99365b(Drawable drawable) {
            BizPopupsHelper aVar = BizPopupsHelper.f69630a;
            BizPopupsHelper.f69635f = false;
            C28184h.m103250d("BizPopupsHelper", "preload image content started, nId=" + this.f69638a);
        }

        /* renamed from: a */
        public void mo49248a(File file) {
            BizPopupsHelper aVar = BizPopupsHelper.f69630a;
            BizPopupsHelper.f69635f = false;
            C28184h.m103250d("BizPopupsHelper", "preload image content success, nId=" + this.f69638a + ",res=" + file);
            BizPopupsHelper.f69630a.mo99363a(this.f69638a, this.f69639b);
        }

        C27855b(String str, PopupsData popupsData) {
            this.f69638a = str;
            this.f69639b = popupsData;
        }
    }

    /* renamed from: b */
    private final void m101729b(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C27711a.m101348h(str, new C27854a(str));
        }
    }

    /* renamed from: c */
    private final boolean m101732c(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        List jSONArray = UserSP.getInstance().getJSONArray("workplace_biz_popups_showed_ids", String.class);
        if (jSONArray != null) {
            return jSONArray.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public final String mo99359a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String B = C27724c.m101377B();
        Intrinsics.checkExpressionValueIsNotNull(B, "resUrl");
        String format = String.format(B, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        return format;
    }

    /* renamed from: d */
    private final void m101733d(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArrayList jSONArray = UserSP.getInstance().getJSONArray("workplace_biz_popups_showed_ids", String.class);
            if (jSONArray == null) {
                jSONArray = new ArrayList();
            }
            if (!jSONArray.contains(str)) {
                if (jSONArray.size() >= 10) {
                    jSONArray = jSONArray.subList((jSONArray.size() - 10) + 1, jSONArray.size());
                }
                jSONArray.add(0, str);
                UserSP.getInstance().putJSONArray("workplace_biz_popups_showed_ids", jSONArray);
            }
        }
    }

    /* renamed from: a */
    public final void mo99362a(PopupsData popupsData) {
        String str;
        boolean z;
        if (popupsData != null) {
            C28184h.m103250d("BizPopupsHelper", "get bizPopups success: data=" + popupsData);
            PopupsNotification notification = popupsData.getNotification();
            if (notification != null) {
                str = notification.getId();
            } else {
                str = null;
            }
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C28184h.m103250d("BizPopupsHelper", "canceled by  nId empty! nId=" + str);
            } else if (m101732c(str)) {
                m101729b(str);
                C28184h.m103250d("BizPopupsHelper", "canceled by repeat showed! nId=" + str);
            } else if (popupsData.contentType() == PopupsContentType.Image) {
                m101730b(str, popupsData);
            } else {
                mo99363a(str, popupsData);
            }
        }
    }

    /* renamed from: b */
    private final void m101730b(String str, PopupsData popupsData) {
        Fragment fragment;
        Context context;
        PopupsElement contentElement;
        String imgKey;
        C28184h.m103250d("BizPopupsHelper", "preload image content, nId=" + str);
        WeakReference<Fragment> weakReference = f69631b;
        if (weakReference != null && (fragment = weakReference.get()) != null && (context = fragment.getContext()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "fragmentRef?.get()?.context ?: return");
            PopupsNotification notification = popupsData.getNotification();
            if (notification != null && (contentElement = notification.contentElement()) != null && (imgKey = contentElement.getImgKey()) != null) {
                String a = mo99359a(imgKey);
                f69635f = true;
                C27688a.m101211a(context, a, C27714b.m101357a(), new C27855b(str, popupsData));
            }
        }
    }

    /* renamed from: a */
    public final void mo99361a(Fragment fragment, View view) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        boolean z = !m101731b();
        if (f69634e || f69635f || f69636g || z) {
            C28184h.m103250d("BizPopupsHelper", "canceled by state! isLoading=" + f69634e + ",isPreloading=" + f69635f + ",isShowing=" + f69636g + ",fgClosed=" + z);
            return;
        }
        f69634e = true;
        f69631b = new WeakReference<>(fragment);
        f69632c = new WeakReference<>(view);
        C27711a.m101340c(new C27856c());
    }

    /* renamed from: a */
    public final void mo99363a(String str, PopupsData popupsData) {
        Fragment fragment;
        View view;
        WeakReference<Fragment> weakReference = f69631b;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(fragment, "fragmentRef?.get() ?: return");
            WeakReference<View> weakReference2 = f69632c;
            if (weakReference2 != null && (view = weakReference2.get()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "anchorRef?.get() ?: return");
                Context context = fragment.getContext();
                if (context != null) {
                    Intrinsics.checkExpressionValueIsNotNull(context, "fragment.context ?: return");
                    WeakReference<Fragment> weakReference3 = f69631b;
                    if (weakReference3 != null) {
                        weakReference3.clear();
                    }
                    WeakReference<View> weakReference4 = f69632c;
                    if (weakReference4 != null) {
                        weakReference4.clear();
                    }
                    Lifecycle lifecycle = fragment.getLifecycle();
                    Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
                    if (lifecycle.getCurrentState() != Lifecycle.State.RESUMED || !fragment.getUserVisibleHint()) {
                        C28184h.m103250d("BizPopupsHelper", "canceled by lifecycle not resumed! nId=" + str);
                        return;
                    }
                    BizPopupsWindow bizPopupsWindow = new BizPopupsWindow(context, lifecycle, view, popupsData);
                    f69633d = new WeakReference<>(bizPopupsWindow);
                    bizPopupsWindow.mo99354a();
                    f69636g = true;
                    m101733d(str);
                    m101729b(str);
                    C28184h.m103250d("BizPopupsHelper", "popups success showed! nId=" + str);
                }
            }
        }
    }
}
