package com.ss.android.lark.helpdesk.kbtopextend;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.ProgressParams;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import com.ss.android.lark.helpdesk.C38732a;
import com.ss.android.lark.helpdesk.kbtopextend.bean.Action;
import com.ss.android.lark.helpdesk.kbtopextend.bean.Confirm;
import com.ss.android.lark.helpdesk.kbtopextend.bean.ContainerResourceItem;
import com.ss.android.lark.helpdesk.kbtopextend.bean.Image_url_themed;
import com.ss.android.lark.helpdesk.kbtopextend.bean.MultiUrl;
import com.ss.android.lark.helpdesk.monitor.HelpDeskMonitor;
import com.ss.android.lark.helpdesk.p1949a.AbstractC38736a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.openbanner.ContainerTag;
import com.ss.android.lark.pb.openbanner.OpenBannerResponse;
import com.ss.android.lark.pb.openbanner.TargetType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<=B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010%\u001a\u00020\tH\u0016J\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\"\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0018\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\tH\u0016J\u0018\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\tH\u0016J8\u00105\u001a\u00020(2\u0006\u0010)\u001a\u0002062\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u00108\u001a\u00020(2\u0006\u0010)\u001a\u0002062\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u00109\u001a\u00020(J.\u0010:\u001a\u00020(2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$KbViewHolder;", "targetId", "", "kbTopExtendControl", "Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;)V", "containerTag", "", "getContainerTag", "()Ljava/lang/Integer;", "setContainerTag", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "context", "getContext", "()Ljava/lang/String;", "setContext", "(Ljava/lang/String;)V", "getKbTopExtendControl", "()Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "setKbTopExtendControl", "(Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;)V", "mResourceList", "", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse$Container$Resource;", "resourceId", "resourceType", "getTargetId", "targetType", "getTargetType", "setTargetType", "time", "", "filterData", "recycleData", "getItemCount", "getResourceList", "handleAction", "", "v", "Landroid/view/View;", "containerText", "action", "Lcom/ss/android/lark/helpdesk/kbtopextend/bean/Action;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "postData", "Lcom/larksuite/component/universe_design/button/UDButton;", "value", "recoverButtom", "resetKbTopExtendControl", "setData", "recycleDataOrigin", "Companion", "KbViewHolder", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a */
public final class KbTopExtendAdapter extends RecyclerView.Adapter<KbViewHolder> {

    /* renamed from: e */
    public static final Companion f99631e = new Companion(null);

    /* renamed from: a */
    public List<OpenBannerResponse.Container.Resource> f99632a;

    /* renamed from: b */
    public long f99633b = -1;

    /* renamed from: c */
    public String f99634c;

    /* renamed from: d */
    public String f99635d;

    /* renamed from: f */
    private String f99636f;

    /* renamed from: g */
    private Integer f99637g;

    /* renamed from: h */
    private Integer f99638h;

    /* renamed from: i */
    private final String f99639i;

    /* renamed from: j */
    private KbTopExtendControl f99640j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$Companion;", "", "()V", "TAG", "", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$KbViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "kbButton", "Lcom/larksuite/component/universe_design/button/UDButton;", "getKbButton", "()Lcom/larksuite/component/universe_design/button/UDButton;", "setKbButton", "(Lcom/larksuite/component/universe_design/button/UDButton;)V", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$b */
    public static final class KbViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private UDButton f99641a;

        /* renamed from: a */
        public final UDButton mo141967a() {
            return this.f99641a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public KbViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f99641a = (UDButton) view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J:\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J<\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/image/api/RequestListener;", "", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "p0", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p1", "p2", "Lcom/ss/android/lark/image/api/Target;", "p3", "onResourceReady", "Lcom/ss/android/lark/image/api/DataSource;", "p4", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$c */
    public static final class C38737c implements AbstractC38817h<String, Drawable> {
        C38737c() {
        }

        /* renamed from: a */
        public boolean mo53861a(Exception exc, String str, AbstractC38819j<Drawable> jVar, boolean z) {
            Log.m165383e("KbTopExtendAdapter", "image load failed " + String.valueOf(exc));
            return false;
        }

        /* renamed from: a */
        public boolean mo53862a(Drawable drawable, String str, AbstractC38819j<Drawable> jVar, DataSource dataSource, boolean z) {
            Intrinsics.checkParameterIsNotNull(dataSource, "p3");
            Log.m165389i("KbTopExtendAdapter", "image load success");
            return false;
        }
    }

    /* renamed from: a */
    public final Integer mo141953a() {
        return this.f99637g;
    }

    /* renamed from: b */
    public final Integer mo141961b() {
        return this.f99638h;
    }

    /* renamed from: d */
    public final List<OpenBannerResponse.Container.Resource> mo141964d() {
        return this.f99632a;
    }

    /* renamed from: e */
    public final String mo141965e() {
        return this.f99639i;
    }

    /* renamed from: f */
    public final KbTopExtendControl mo141966f() {
        return this.f99640j;
    }

    /* renamed from: c */
    public final void mo141963c() {
        this.f99640j = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$postData$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "openBannerResponse", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$g */
    public static final class C38744g implements IGetDataCallback<OpenBannerResponse> {

        /* renamed from: a */
        final /* synthetic */ KbTopExtendAdapter f99653a;

        /* renamed from: b */
        final /* synthetic */ UDButton f99654b;

        /* renamed from: c */
        final /* synthetic */ String f99655c;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$postData$2$onSuccess$1$4"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$g$d */
        public static final class RunnableC38748d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C38744g f99661a;

            /* renamed from: b */
            final /* synthetic */ OpenBannerResponse f99662b;

            RunnableC38748d(C38744g gVar, OpenBannerResponse openBannerResponse) {
                this.f99661a = gVar;
                this.f99662b = openBannerResponse;
            }

            public final void run() {
                this.f99661a.f99653a.mo141956a(this.f99661a.f99654b, this.f99661a.f99655c);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$postData$2$onSuccess$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$g$b */
        public static final class RunnableC38746b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C38744g f99657a;

            /* renamed from: b */
            final /* synthetic */ OpenBannerResponse f99658b;

            RunnableC38746b(C38744g gVar, OpenBannerResponse openBannerResponse) {
                this.f99657a = gVar;
                this.f99658b = openBannerResponse;
            }

            public final void run() {
                Context context = this.f99657a.f99654b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
                UDToast.show(context, KbTopExtendUtils.f99692a.mo142053a(this.f99658b.mtips_i18n));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$postData$2$onSuccess$1$3"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$g$c */
        public static final class RunnableC38747c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C38744g f99659a;

            /* renamed from: b */
            final /* synthetic */ OpenBannerResponse f99660b;

            RunnableC38747c(C38744g gVar, OpenBannerResponse openBannerResponse) {
                this.f99659a = gVar;
                this.f99660b = openBannerResponse;
            }

            public final void run() {
                Context context = this.f99659a.f99654b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
                UDToast.show(context, KbTopExtendUtils.f99692a.mo142053a(this.f99660b.mtips_i18n));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$g$a */
        public static final class RunnableC38745a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C38744g f99656a;

            RunnableC38745a(C38744g gVar) {
                this.f99656a = gVar;
            }

            public final void run() {
                Context context = this.f99656a.f99654b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
                UDToast.show(context, (int) R.string.Lark_HelpDesk_NetworkErroMobile);
                this.f99656a.f99653a.mo141956a(this.f99656a.f99654b, this.f99656a.f99655c);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC38745a(this));
        }

        /* renamed from: a */
        public void onSuccess(OpenBannerResponse openBannerResponse) {
            List<OpenBannerResponse.Container.Resource> list;
            Long l;
            Intrinsics.checkParameterIsNotNull(openBannerResponse, "openBannerResponse");
            Integer num = openBannerResponse.mcode;
            if (num == null) {
                return;
            }
            if (num.intValue() == 0) {
                OpenBannerResponse.Container container = openBannerResponse.mcontainer;
                if (container != null) {
                    list = container.mresource_list;
                } else {
                    list = null;
                }
                OpenBannerResponse.Container container2 = openBannerResponse.mcontainer;
                if (!(container2 == null || (l = container2.mtimestamp) == null)) {
                    long longValue = l.longValue();
                    KbTopExtendAdapter aVar = this.f99653a;
                    TargetType targetType = openBannerResponse.mtarget_type;
                    Intrinsics.checkExpressionValueIsNotNull(targetType, "openBannerResponse.mtarget_type");
                    int value = targetType.getValue();
                    ContainerTag containerTag = openBannerResponse.mcontainer_tag;
                    Intrinsics.checkExpressionValueIsNotNull(containerTag, "openBannerResponse.mcontainer_tag");
                    aVar.mo141960a(list, longValue, value, containerTag.getValue());
                }
                if (!TextUtils.isEmpty(KbTopExtendUtils.f99692a.mo142053a(openBannerResponse.mtips_i18n))) {
                    UICallbackExecutor.execute(new RunnableC38746b(this, openBannerResponse));
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(KbTopExtendUtils.f99692a.mo142053a(openBannerResponse.mtips_i18n))) {
                UICallbackExecutor.execute(new RunnableC38747c(this, openBannerResponse));
            }
            UICallbackExecutor.execute(new RunnableC38748d(this, openBannerResponse));
        }

        C38744g(KbTopExtendAdapter aVar, UDButton uDButton, String str) {
            this.f99653a = aVar;
            this.f99654b = uDButton;
            this.f99655c = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<OpenBannerResponse.Container.Resource> list = this.f99632a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$i */
    public static final class RunnableC38750i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KbTopExtendAdapter f99663a;

        /* renamed from: b */
        final /* synthetic */ int f99664b;

        /* renamed from: c */
        final /* synthetic */ int f99665c;

        /* renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f99666d;

        /* renamed from: e */
        final /* synthetic */ long f99667e;

        RunnableC38750i(KbTopExtendAdapter aVar, int i, int i2, CopyOnWriteArrayList copyOnWriteArrayList, long j) {
            this.f99663a = aVar;
            this.f99664b = i;
            this.f99665c = i2;
            this.f99666d = copyOnWriteArrayList;
            this.f99667e = j;
        }

        public final void run() {
            Integer num;
            this.f99663a.mo141958a(Integer.valueOf(this.f99664b));
            this.f99663a.mo141962b(Integer.valueOf(this.f99665c));
            StringBuilder sb = new StringBuilder();
            sb.append("begin render,resource size:");
            CopyOnWriteArrayList copyOnWriteArrayList = this.f99666d;
            if (copyOnWriteArrayList != null) {
                num = Integer.valueOf(copyOnWriteArrayList.size());
            } else {
                num = null;
            }
            sb.append(num.intValue());
            Log.m165389i("KbTopExtendAdapter", sb.toString());
            if (this.f99666d.size() <= 0) {
                KbTopExtendControl f = this.f99663a.mo141966f();
                if (f != null) {
                    f.mo123819d();
                }
            } else if (this.f99667e >= this.f99663a.f99633b) {
                this.f99663a.f99633b = this.f99667e;
                KbTopExtendAdapter aVar = this.f99663a;
                aVar.f99632a = aVar.mo141954a(this.f99666d);
                List<OpenBannerResponse.Container.Resource> list = this.f99663a.f99632a;
                if (list != null && list.size() == 0) {
                    KbTopExtendControl f2 = this.f99663a.mo141966f();
                    if (f2 != null) {
                        f2.mo123819d();
                    }
                } else if (this.f99663a.mo141966f() != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_load_start", this.f99663a.mo141965e(), Integer.valueOf(this.f99664b), Integer.valueOf(this.f99665c), null, null, null, null, null, 496, null);
                    this.f99663a.notifyDataSetChanged();
                    KbTopExtendControl f3 = this.f99663a.mo141966f();
                    if (f3 != null) {
                        f3.mo123818c();
                    }
                    HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_load_result", this.f99663a.mo141965e(), Integer.valueOf(this.f99664b), Integer.valueOf(this.f99665c), null, null, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "success", null, 304, null);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$onBindViewHolder$2", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "errorDrawable", "onResourceReady", "drawable", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$d */
    public static final class C38738d extends C38818i<Drawable> {

        /* renamed from: a */
        final /* synthetic */ KbViewHolder f99642a;

        /* renamed from: b */
        final /* synthetic */ String f99643b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$d$a */
        public static final class C38739a extends Lambda implements Function1<ButtonDrawableParams, Unit> {
            final /* synthetic */ C38738d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38739a(C38738d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(ButtonDrawableParams aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                aVar.mo90324b(Integer.valueOf((int) R.dimen.open_banner_text_picture_space));
                aVar.mo90320a(this.this$0.f99643b);
            }
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            super.mo49247a(drawable);
            C25717e.m92496b(this.f99642a.mo141967a(), this.f99643b);
        }

        /* renamed from: k_ */
        public void mo49248a(Drawable drawable) {
            super.mo49248a((Object) drawable);
            View view = this.f99642a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            int a = (int) C25655d.m91900a(view.getContext(), 15.0f);
            View view2 = this.f99642a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            int a2 = (int) C25655d.m91900a(view2.getContext(), 14.0f);
            if (drawable != null) {
                drawable.setBounds(new Rect(0, 0, a, a2));
            }
            this.f99642a.mo141967a().setTag(drawable);
            if (drawable != null) {
                C25717e.m92488a(this.f99642a.mo141967a(), drawable, new C38739a(this));
            }
        }

        C38738d(KbViewHolder bVar, String str) {
            this.f99642a = bVar;
            this.f99643b = str;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ProgressParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$f */
    public static final class C38743f extends Lambda implements Function1<ProgressParams, Unit> {
        final /* synthetic */ String $containerText;
        final /* synthetic */ UDButton $v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38743f(UDButton uDButton, String str) {
            super(1);
            this.$v = uDButton;
            this.$containerText = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProgressParams dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ProgressParams dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            dVar.mo90336c(UIUtils.dp2px(this.$v.getContext(), 4.0f));
            dVar.mo90338d(UIUtils.dp2px(this.$v.getContext(), 2.0f));
            Context context = this.$v.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
            dVar.mo90337c(Integer.valueOf(context.getResources().getColor(R.color.ud_B500)));
            dVar.mo90320a(this.$containerText);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke", "com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter$recoverButtom$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$h */
    public static final class C38749h extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        final /* synthetic */ String $containerText$inlined;
        final /* synthetic */ Object $iconDrawable$inlined;
        final /* synthetic */ UDButton $v$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38749h(UDButton uDButton, Object obj, String str) {
            super(1);
            this.$v$inlined = uDButton;
            this.$iconDrawable$inlined = obj;
            this.$containerText$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90320a(this.$containerText$inlined);
        }
    }

    /* renamed from: a */
    public final void mo141958a(Integer num) {
        this.f99637g = num;
    }

    /* renamed from: b */
    public final void mo141962b(Integer num) {
        this.f99638h = num;
    }

    /* renamed from: a */
    public final void mo141959a(String str) {
        this.f99636f = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a$e */
    public static final class View$OnClickListenerC38740e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KbTopExtendAdapter f99644a;

        /* renamed from: b */
        final /* synthetic */ ContainerResourceItem f99645b;

        /* renamed from: c */
        final /* synthetic */ String f99646c;

        View$OnClickListenerC38740e(KbTopExtendAdapter aVar, ContainerResourceItem containerResourceItem, String str) {
            this.f99644a = aVar;
            this.f99645b = containerResourceItem;
            this.f99646c = str;
        }

        public final void onClick(final View view) {
            Log.m165389i("KbTopExtendAdapter", "click BannerItem,resourceId:" + this.f99644a.f99634c + ",resourceType:" + this.f99644a.f99635d);
            HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_button_action_start", this.f99644a.mo141965e(), this.f99644a.mo141953a(), this.f99644a.mo141961b(), this.f99644a.f99634c, this.f99644a.f99635d, null, null, null, 448, null);
            ContainerResourceItem containerResourceItem = this.f99645b;
            Intrinsics.checkExpressionValueIsNotNull(containerResourceItem, "resourceItem");
            Confirm confirm = containerResourceItem.getConfirm();
            ContainerResourceItem containerResourceItem2 = this.f99645b;
            Intrinsics.checkExpressionValueIsNotNull(containerResourceItem2, "resourceItem");
            Action action = containerResourceItem2.getAction();
            if (confirm != null && confirm.getConfirm_action() != null) {
                String a = KbTopExtendUtils.f99692a.mo142052a(confirm.getTitle_i18n());
                String a2 = KbTopExtendUtils.f99692a.mo142052a(confirm.getContent_i18n());
                String a3 = KbTopExtendUtils.f99692a.mo142052a(confirm.getConfirm_text_i18n());
                String a4 = KbTopExtendUtils.f99692a.mo142052a(confirm.getCancel_text_i18n());
                final Action confirm_action = confirm.getConfirm_action();
                final Action cancel_action = confirm.getCancel_action();
                Intrinsics.checkExpressionValueIsNotNull(view, "v");
                Context context = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
                UDDialogBuilder eVar = new UDDialogBuilder(context);
                String str = a;
                if (!TextUtils.isEmpty(str)) {
                    eVar.title(str);
                }
                String str2 = a2;
                if (!TextUtils.isEmpty(str2)) {
                    eVar.message(str2);
                }
                String str3 = a4;
                if (!TextUtils.isEmpty(str3)) {
                    eVar.addActionButton(R.id.ud_dialog_btn_secondary, str3, new DialogInterface.OnClickListener(this) {
                        /* class com.ss.android.lark.helpdesk.kbtopextend.KbTopExtendAdapter.View$OnClickListenerC38740e.DialogInterface$OnClickListenerC387411 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC38740e f99647a;

                        {
                            this.f99647a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            KbTopExtendAdapter aVar = this.f99647a.f99644a;
                            View view = view;
                            Intrinsics.checkExpressionValueIsNotNull(view, "v");
                            aVar.mo141955a(view, this.f99647a.f99646c, cancel_action);
                            dialogInterface.cancel();
                        }
                    });
                }
                String str4 = a3;
                if (!TextUtils.isEmpty(str4)) {
                    eVar.addActionButton(R.id.ud_dialog_btn_primary, str4, new DialogInterface.OnClickListener(this) {
                        /* class com.ss.android.lark.helpdesk.kbtopextend.KbTopExtendAdapter.View$OnClickListenerC38740e.DialogInterface$OnClickListenerC387422 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC38740e f99650a;

                        {
                            this.f99650a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            KbTopExtendAdapter aVar = this.f99650a.f99644a;
                            View view = view;
                            Intrinsics.checkExpressionValueIsNotNull(view, "v");
                            aVar.mo141955a(view, this.f99650a.f99646c, confirm_action);
                            dialogInterface.cancel();
                        }
                    });
                }
                eVar.show();
            } else if (action != null) {
                KbTopExtendAdapter aVar = this.f99644a;
                Intrinsics.checkExpressionValueIsNotNull(view, "v");
                aVar.mo141955a(view, this.f99646c, action);
            }
        }
    }

    /* renamed from: a */
    public final List<OpenBannerResponse.Container.Resource> mo141954a(List<OpenBannerResponse.Container.Resource> list) {
        Action action;
        try {
            for (OpenBannerResponse.Container.Resource resource : list) {
                ContainerResourceItem containerResourceItem = (ContainerResourceItem) new Gson().fromJson(resource.mview_data, ContainerResourceItem.class);
                if (containerResourceItem == null) {
                    list.remove(resource);
                } else if (containerResourceItem.getConfirm() != null) {
                    KbTopExtendUtils dVar = KbTopExtendUtils.f99692a;
                    Confirm confirm = containerResourceItem.getConfirm();
                    if (confirm != null) {
                        action = confirm.getConfirm_action();
                    } else {
                        action = null;
                    }
                    if (dVar.mo142054a(action) && KbTopExtendUtils.f99692a.mo142054a(containerResourceItem.getAction())) {
                        list.remove(resource);
                    }
                } else if (KbTopExtendUtils.f99692a.mo142054a(containerResourceItem.getAction())) {
                    list.remove(resource);
                }
            }
            return list;
        } catch (ClassCastException e) {
            Log.m165383e("KbTopExtendAdapter", "json transform exception:" + e.getMessage());
            return list;
        }
    }

    public KbTopExtendAdapter(String str, KbTopExtendControl aVar) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        this.f99639i = str;
        this.f99640j = aVar;
    }

    /* renamed from: a */
    public final void mo141956a(UDButton uDButton, String str) {
        C25717e.m92490a(uDButton, str);
        Object tag = uDButton.getTag();
        if (tag != null) {
            C25717e.m92488a(uDButton, (Drawable) tag, new C38749h(uDButton, tag, str));
        }
        uDButton.setText(str);
    }

    /* renamed from: a */
    public KbViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kbtopitem, viewGroup, false);
        if (inflate != null) {
            return new KbViewHolder((UDButton) inflate);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.button.UDButton");
    }

    /* renamed from: a */
    public void onBindViewHolder(KbViewHolder bVar, int i) {
        String str;
        String str2;
        String str3;
        Image_url_themed image_url_themed;
        Image_url_themed image_url_themed2;
        Image_url_themed image_url_themed3;
        String dark;
        OpenBannerResponse.Container.Resource resource;
        OpenBannerResponse.Container.Resource resource2;
        OpenBannerResponse.Container.Resource resource3;
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        List<OpenBannerResponse.Container.Resource> list = this.f99632a;
        String str4 = null;
        if (list == null || (resource3 = list.get(i)) == null) {
            str = null;
        } else {
            str = resource3.mresource_id;
        }
        this.f99634c = str;
        List<OpenBannerResponse.Container.Resource> list2 = this.f99632a;
        if (list2 == null || (resource2 = list2.get(i)) == null) {
            str2 = null;
        } else {
            str2 = resource2.mresource_type;
        }
        this.f99635d = str2;
        Log.m165389i("KbTopExtendAdapter", "resourceItem info,resourceId:" + this.f99634c + ",resourceType:" + this.f99635d);
        Gson gson = new Gson();
        List<OpenBannerResponse.Container.Resource> list3 = this.f99632a;
        if (list3 == null || (resource = list3.get(i)) == null) {
            str3 = null;
        } else {
            str3 = resource.mview_data;
        }
        ContainerResourceItem containerResourceItem = (ContainerResourceItem) gson.fromJson(str3, ContainerResourceItem.class);
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.itemView.context");
        if (UDUiModeUtils.m93319a(context)) {
            if (containerResourceItem != null && (image_url_themed3 = containerResourceItem.getImage_url_themed()) != null && (dark = image_url_themed3.getDark()) != null) {
                str4 = dark;
            } else if (!(containerResourceItem == null || (image_url_themed2 = containerResourceItem.getImage_url_themed()) == null)) {
                str4 = image_url_themed2.getLight();
            }
        } else if (!(containerResourceItem == null || (image_url_themed = containerResourceItem.getImage_url_themed()) == null)) {
            str4 = image_url_themed.getLight();
        }
        KbTopExtendUtils dVar = KbTopExtendUtils.f99692a;
        Intrinsics.checkExpressionValueIsNotNull(containerResourceItem, "resourceItem");
        String a = dVar.mo142052a(containerResourceItem.getText_i18n());
        Log.m165389i("KbTopExtendAdapter", "resourceItem info,imageUrl:" + str4 + ",containerText:" + a);
        if (!TextUtils.isEmpty(str4)) {
            View view2 = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            ImageLoader.with(view2.getContext()).asDrawable().load(str4).listener(new C38737c()).into(new C38738d(bVar, a));
        } else {
            C25717e.m92496b(bVar.mo141967a(), a);
        }
        bVar.mo141967a().setOnClickListener(new View$OnClickListenerC38740e(this, containerResourceItem, a));
    }

    /* renamed from: a */
    public final void mo141955a(View view, String str, Action action) {
        String str2;
        int i;
        if (action != null) {
            MultiUrl multi_url = action.getMulti_url();
            String str3 = null;
            if (multi_url != null) {
                str2 = multi_url.getAndroid_url();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                MultiUrl multi_url2 = action.getMulti_url();
                if (multi_url2 != null) {
                    str3 = multi_url2.getAndroid_url();
                }
            } else {
                MultiUrl multi_url3 = action.getMulti_url();
                if (multi_url3 != null) {
                    str3 = multi_url3.getUrl();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("action url,length:");
            if (str3 != null) {
                i = str3.length();
            } else {
                i = 0;
            }
            sb.append(i);
            Log.m165389i("KbTopExtendAdapter", sb.toString());
            if (!TextUtils.isEmpty(str3)) {
                HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_button_jump_start", this.f99639i, this.f99637g, this.f99638h, this.f99634c, this.f99635d, null, null, null, 448, null);
                C38732a.m152977a().mo141949b(view.getContext(), str3);
                return;
            }
            Log.m165389i("KbTopExtendAdapter", "action value:" + action.getValue());
            String value = action.getValue();
            if (value == null) {
                return;
            }
            if (view != null) {
                m153002a((UDButton) view, str, value, this.f99634c, this.f99635d);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.button.UDButton");
        }
    }

    /* renamed from: a */
    public final void mo141960a(List<OpenBannerResponse.Container.Resource> list, long j, int i, int i2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
        UICallbackExecutor.execute(new RunnableC38750i(this, i, i2, copyOnWriteArrayList, j));
    }

    /* renamed from: a */
    private final void m153002a(UDButton uDButton, String str, String str2, String str3, String str4) {
        Log.m165389i("KbTopExtendAdapter", "post data begin,resourceId:" + str3 + ",resourceType:" + str4);
        C25717e.m92492a(uDButton, new C38743f(uDButton, str));
        uDButton.setEnabled(false);
        System.currentTimeMillis();
        KbTopExtendHandler cVar = KbTopExtendHandler.f99686b;
        String str5 = this.f99639i;
        Integer num = this.f99637g;
        Integer num2 = this.f99638h;
        String str6 = this.f99636f;
        AbstractC38736a a = C38732a.m152977a();
        Intrinsics.checkExpressionValueIsNotNull(a, "HelpdeskModule.getDependency()");
        cVar.mo142043a(str5, num, num2, str6, str3, str4, str2, a.mo141948b(), new C38744g(this, uDButton, str));
        uDButton.setEnabled(true);
    }
}
