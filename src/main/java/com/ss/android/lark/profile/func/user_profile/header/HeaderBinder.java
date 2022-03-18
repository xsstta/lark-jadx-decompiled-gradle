package com.ss.android.lark.profile.func.user_profile.header;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.entity.WorkStatus;
import com.ss.android.lark.profile.func.add_friend.UserAuthorityUtils;
import com.ss.android.lark.profile.func.user_profile.base.BaseProfileBinder;
import com.ss.android.lark.profile.func.user_profile.header.UserProfileAvatarLoader;
import com.ss.android.lark.profile.func.user_profile.header.cta.BaseCtaViewData;
import com.ss.android.lark.profile.func.user_profile.header.cta.ChatCtaViewData;
import com.ss.android.lark.profile.func.user_profile.header.cta.CtaAdapter;
import com.ss.android.lark.profile.func.user_profile.header.cta.LinkCtaViewData;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.drawable.TenantCertificationDrawable;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2931b.C58324b;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0016\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J \u0010$\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderBinder;", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseProfileBinder;", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "Lcom/ss/android/lark/profile/func/user_profile/header/IHeaderBinderDependency;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/header/IHeaderBinderDependency;)V", "customTagFields", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CustomImage;", "mContext", "Landroid/content/Context;", "mCtaAdapter", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter;", "mHeaderRootView", "Landroid/view/View;", "binderData", "", "view", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "convertCtaType2String", "", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "createView", "parent", "Landroid/view/ViewGroup;", "doCopyName", "copyName", "initCtaRv", "showErrorToast", "errorMeg", "showSex2", "", "updateAvatar", "avatarKey", "userId", "asResourceKeyList", "equals2", "that", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.header.a */
public final class HeaderBinder extends BaseProfileBinder<HeaderViewData, IHeaderBinderDependency> {

    /* renamed from: b */
    public static final Companion f130178b = new Companion(null);

    /* renamed from: a */
    public final Context f130179a;

    /* renamed from: c */
    private View f130180c;

    /* renamed from: d */
    private CtaAdapter f130181d;

    /* renamed from: e */
    private List<GetUserProfileResponse.CustomImage> f130182e = CollectionsKt.emptyList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderBinder$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/user_profile/header/HeaderBinder$initCtaRv$1$1", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/CtaAdapter$ItemClickListener;", "onClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "onGuideClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.a$e */
    public static final class C52609e implements CtaAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ HeaderBinder f130191a;

        @Override // com.ss.android.lark.profile.func.user_profile.header.cta.CtaAdapter.ItemClickListener
        /* renamed from: a */
        public void mo179815a() {
            ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179766g();
        }

        C52609e(HeaderBinder aVar) {
            this.f130191a = aVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.header.cta.CtaAdapter.ItemClickListener
        /* renamed from: a */
        public void mo179816a(View view, BaseCtaViewData baseCtaViewData) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(baseCtaViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ProfileHitPoint.m204724f(this.f130191a.mo179807a(baseCtaViewData));
            int a = baseCtaViewData.mo179819a();
            if (a != 1) {
                switch (a) {
                    case 10:
                        ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179767h();
                        if (UserAuthorityUtils.f129641a.mo179076a(Integer.valueOf(baseCtaViewData.mo179821c()))) {
                            UserAuthorityUtils.f129641a.mo179075a(this.f130191a.f130179a, baseCtaViewData.mo179822d());
                            return;
                        } else if (!baseCtaViewData.mo179820b()) {
                            this.f130191a.mo179810a(baseCtaViewData.mo179822d());
                            return;
                        } else {
                            ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179758a();
                            return;
                        }
                    case 11:
                        if (UserAuthorityUtils.f129641a.mo179076a(Integer.valueOf(baseCtaViewData.mo179821c()))) {
                            UserAuthorityUtils.f129641a.mo179075a(this.f130191a.f130179a, baseCtaViewData.mo179822d());
                            return;
                        } else if (!baseCtaViewData.mo179820b()) {
                            this.f130191a.mo179810a(baseCtaViewData.mo179822d());
                            return;
                        } else {
                            ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179761b();
                            return;
                        }
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        if (UserAuthorityUtils.f129641a.mo179076a(Integer.valueOf(baseCtaViewData.mo179821c()))) {
                            UserAuthorityUtils.f129641a.mo179075a(this.f130191a.f130179a, baseCtaViewData.mo179822d());
                            return;
                        } else if (!baseCtaViewData.mo179820b()) {
                            this.f130191a.mo179810a(baseCtaViewData.mo179822d());
                            return;
                        } else {
                            ProfileHitPoint.m204725g();
                            ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179763c();
                            return;
                        }
                    case 13:
                        if (UserAuthorityUtils.f129641a.mo179076a(Integer.valueOf(baseCtaViewData.mo179821c()))) {
                            UserAuthorityUtils.f129641a.mo179075a(this.f130191a.f130179a, baseCtaViewData.mo179822d());
                            return;
                        } else if (!baseCtaViewData.mo179820b()) {
                            this.f130191a.mo179810a(baseCtaViewData.mo179822d());
                            return;
                        } else {
                            ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179764e();
                            return;
                        }
                    case 14:
                        if (UserAuthorityUtils.f129641a.mo179076a(Integer.valueOf(baseCtaViewData.mo179821c()))) {
                            UserAuthorityUtils.f129641a.mo179075a(this.f130191a.f130179a, baseCtaViewData.mo179822d());
                            return;
                        } else if (!baseCtaViewData.mo179820b()) {
                            this.f130191a.mo179810a(baseCtaViewData.mo179822d());
                            return;
                        } else {
                            ((IHeaderBinderDependency) this.f130191a.mo179589a()).mo179765f();
                            return;
                        }
                    default:
                        return;
                }
            } else if (!baseCtaViewData.mo179820b()) {
                this.f130191a.mo179810a(baseCtaViewData.mo179822d());
            } else {
                LinkCtaViewData dVar = (LinkCtaViewData) baseCtaViewData;
                if (!TextUtils.isEmpty(dVar.mo179831e())) {
                    IHeaderBinderDependency cVar = (IHeaderBinderDependency) this.f130191a.mo179589a();
                    String e = dVar.mo179831e();
                    if (e == null) {
                        Intrinsics.throwNpe();
                    }
                    cVar.mo179759a(e);
                    return;
                }
                Log.m165383e("HeaderBinder", "linkCta url is empty");
            }
        }
    }

    /* renamed from: b */
    private final void m203877b() {
        View view = this.f130180c;
        if (view != null) {
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) view.findViewById(R.id.mCtaRv);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "this.mCtaRv");
            commonRecyclerView.setLayoutManager(new LinearLayoutManager(((IHeaderBinderDependency) mo179589a()).mo179591d(), 0, false));
            this.f130181d = new CtaAdapter(((IHeaderBinderDependency) mo179589a()).mo179591d(), new C52609e(this));
            CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) view.findViewById(R.id.mCtaRv);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "this.mCtaRv");
            commonRecyclerView2.setAdapter(this.f130181d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/user_profile/header/HeaderBinder$binderData$1$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.a$d */
    public static final class C52608d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ HeaderBinder f130189a;

        /* renamed from: b */
        final /* synthetic */ HeaderViewData f130190b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f130189a.mo179812b(this.f130190b.mo179792a());
        }

        C52608d(HeaderBinder aVar, HeaderViewData headerViewData) {
            this.f130189a = aVar;
            this.f130190b = headerViewData;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/user_profile/header/HeaderBinder$binderData$1$1$1", "com/ss/android/lark/profile/func/user_profile/header/HeaderBinder$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.a$b */
    public static final class View$OnClickListenerC52606b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f130183a;

        /* renamed from: b */
        final /* synthetic */ View f130184b;

        /* renamed from: c */
        final /* synthetic */ HeaderBinder f130185c;

        /* renamed from: d */
        final /* synthetic */ HeaderViewData f130186d;

        View$OnClickListenerC52606b(String str, View view, HeaderBinder aVar, HeaderViewData headerViewData) {
            this.f130183a = str;
            this.f130184b = view;
            this.f130185c = aVar;
            this.f130186d = headerViewData;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204720e();
            String str = this.f130183a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            ((IHeaderBinderDependency) this.f130185c.mo179589a()).mo179760a(str, view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/user_profile/header/HeaderBinder$binderData$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.a$c */
    public static final class C52607c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ HeaderBinder f130187a;

        /* renamed from: b */
        final /* synthetic */ HeaderViewData f130188b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ProfileHitPoint.m204722e(this.f130188b.mo179803m());
            ((IHeaderBinderDependency) this.f130187a.mo179589a()).mo179762b(this.f130188b.mo179804n());
        }

        C52607c(HeaderBinder aVar, HeaderViewData headerViewData) {
            this.f130187a = aVar;
            this.f130188b = headerViewData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/user_profile/header/HeaderBinder$updateAvatar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.a$f */
    static final class View$OnClickListenerC52610f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HeaderBinder f130192a;

        /* renamed from: b */
        final /* synthetic */ String f130193b;

        /* renamed from: c */
        final /* synthetic */ String f130194c;

        View$OnClickListenerC52610f(HeaderBinder aVar, String str, String str2) {
            this.f130192a = aVar;
            this.f130193b = str;
            this.f130194c = str2;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204720e();
            String str = this.f130193b;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            ((IHeaderBinderDependency) this.f130192a.mo179589a()).mo179760a(str, view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderBinder(IHeaderBinderDependency cVar) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(cVar, "dependency");
        this.f130179a = cVar.mo179591d();
    }

    /* renamed from: a */
    public final void mo179810a(String str) {
        LKUIToast.show(this.f130179a, str);
    }

    /* renamed from: a */
    private final List<String> m203874a(List<GetUserProfileResponse.CustomImage> list) {
        List<GetUserProfileResponse.CustomImage> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resource_key);
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m203875a(HeaderViewData headerViewData) {
        if (!WorkStatus.isInvalid(headerViewData.mo179800j()) || headerViewData.mo179798h() || headerViewData.mo179801k() || headerViewData.mo179802l()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo179807a(BaseCtaViewData baseCtaViewData) {
        switch (baseCtaViewData.mo179819a()) {
            case 10:
                if (baseCtaViewData == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.func.user_profile.header.cta.ChatCtaViewData");
                } else if (((ChatCtaViewData) baseCtaViewData).mo179832f() == R.drawable.profile_start_demission_chat_btn_bg) {
                    return "message_history";
                } else {
                    return "message";
                }
            case 11:
                return "secret_message";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "voice_call";
            case 13:
                return "video_call";
            case 14:
                return "share";
            default:
                return "other";
        }
    }

    /* renamed from: b */
    public final void mo179812b(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165383e("HeaderBinder", "Name is empty, so copy failed");
            return;
        }
        Object systemService = this.f130179a.getSystemService("clipboard");
        if (!(systemService instanceof ClipboardManager)) {
            systemService = null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager == null) {
            Log.m165383e("HeaderBinder", "cmb is empty, so copy failed");
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("", C57814c.m224352c(str)));
        UDToast.build(this.f130179a).mo91647b(R.drawable.ud_icon_yes_outlined).mo91637a(R.string.Lark_Legacy_CopiedToast).mo91655j().show();
    }

    /* renamed from: a */
    public final void mo179809a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(((IHeaderBinderDependency) mo179589a()).mo179591d()).inflate(R.layout.layout_user_profile_header, viewGroup, true);
        this.f130180c = inflate;
        if (inflate == null) {
            return;
        }
        if (DesktopUtil.m144301a(((IHeaderBinderDependency) mo179589a()).mo179591d())) {
            ((TextView) inflate.findViewById(R.id.mProfileUserName)).setTextSize(1, 20.0f);
            ((TextView) inflate.findViewById(R.id.mProfileTenantName)).setTextSize(1, 12.0f);
            return;
        }
        ((TextView) inflate.findViewById(R.id.mProfileUserName)).setTextSize(2, 30.0f);
    }

    /* renamed from: a */
    private final boolean m203876a(List<GetUserProfileResponse.CustomImage> list, List<GetUserProfileResponse.CustomImage> list2) {
        return Intrinsics.areEqual(m203874a(list), m203874a(list2));
    }

    /* renamed from: a */
    public final void mo179811a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        View view = this.f130180c;
        if (view != null) {
            UserProfileAvatarLoader.Companion aVar = UserProfileAvatarLoader.f130217a;
            Context context = this.f130179a;
            ImageView imageView = (ImageView) view.findViewById(R.id.mProfileBlurAvatar);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "this.mProfileBlurAvatar");
            ImageView imageView2 = (ImageView) view.findViewById(R.id.mProfileOriginalAvatar);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "this.mProfileOriginalAvatar");
            aVar.mo179834a(context, imageView, imageView2, str, str2);
            ((ImageView) view.findViewById(R.id.mProfileOriginalAvatar)).setOnClickListener(new View$OnClickListenerC52610f(this, str, str2));
        }
    }

    /* renamed from: a */
    public void mo179592a(View view, HeaderViewData headerViewData) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C58324b bVar;
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(headerViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (this.f130180c == null) {
            mo179809a((ViewGroup) view);
        }
        View view2 = this.f130180c;
        if (view2 != null) {
            if (this.f130181d == null) {
                m203877b();
            }
            CtaAdapter bVar2 = this.f130181d;
            if (bVar2 != null) {
                bVar2.resetAll(headerViewData.mo179796f());
            }
            String b = headerViewData.mo179793b();
            if (b != null) {
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180615e();
                UserProfileAvatarLoader.Companion aVar = UserProfileAvatarLoader.f130217a;
                Context context = this.f130179a;
                ImageView imageView = (ImageView) view2.findViewById(R.id.mProfileBlurAvatar);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "this.mProfileBlurAvatar");
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.mProfileOriginalAvatar);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "this.mProfileOriginalAvatar");
                aVar.mo179834a(context, imageView, imageView2, b, headerViewData.mo179794c());
                ((ImageView) view2.findViewById(R.id.mProfileOriginalAvatar)).setOnClickListener(new View$OnClickListenerC52606b(b, view2, this, headerViewData));
                Log.m165389i("HeaderBinder", "profile header, avatarKey is " + b + ", entityId is " + headerViewData.mo179794c());
            }
            TextView textView = (TextView) view2.findViewById(R.id.mUserDimissionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this.mUserDimissionTv");
            if (headerViewData.mo179801k()) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = (TextView) view2.findViewById(R.id.mFrozenTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this.mFrozenTv");
            if (headerViewData.mo179801k() || !headerViewData.mo179799i()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            TextView textView3 = (TextView) view2.findViewById(R.id.mProfileWorkdayLeave);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "this.mProfileWorkdayLeave");
            if (headerViewData.mo179801k() || headerViewData.mo179799i() || WorkStatus.isInvalid(headerViewData.mo179800j())) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView3.setVisibility(i3);
            TextView textView4 = (TextView) view2.findViewById(R.id.mProfileWorkdayLeave);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "this.mProfileWorkdayLeave");
            if (textView4.getVisibility() == 0) {
                TextView textView5 = (TextView) view2.findViewById(R.id.mProfileWorkdayLeave);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "this.mProfileWorkdayLeave");
                WorkStatus j = headerViewData.mo179800j();
                if (j != null) {
                    str = j.getDisplayTextWithDuration(this.f130179a);
                } else {
                    str = null;
                }
                textView5.setText(str);
            }
            ImageView imageView3 = (ImageView) view2.findViewById(R.id.mDoNotDisturbTag);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "mDoNotDisturbTag");
            if (headerViewData.mo179798h()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView3.setVisibility(i4);
            TextView textView6 = (TextView) view2.findViewById(R.id.mBlockTv);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "mBlockTv");
            if (headerViewData.mo179802l()) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            textView6.setVisibility(i5);
            boolean z = true;
            if (!TextUtils.isEmpty(headerViewData.mo179795e())) {
                SpannableStringBuilder append = new SpannableStringBuilder(headerViewData.mo179795e()).append((CharSequence) "$");
                boolean m = headerViewData.mo179803m();
                if (m) {
                    Context context2 = this.f130179a;
                    Drawable c = C57582a.m223614c(context2, R.drawable.profile_tenant_certification_icon);
                    String a = C57582a.m223604a(this.f130179a, (int) R.string.Lark_FeishuCertif_Verif);
                    Intrinsics.checkExpressionValueIsNotNull(a, "UiUtils.getString(mConte….Lark_FeishuCertif_Verif)");
                    bVar = new C58324b(new TenantCertificationDrawable(context2, c, a, C57582a.m223616d(this.f130179a, R.color.admintoken_tag_bg_verified), C57582a.m223616d(this.f130179a, R.color.static_white)));
                } else if (!m) {
                    Context context3 = this.f130179a;
                    String a2 = C57582a.m223604a(context3, (int) R.string.Lark_FeishuCertif_Unverif);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "UiUtils.getString(mConte…ark_FeishuCertif_Unverif)");
                    bVar = new C58324b(new TenantCertificationDrawable(context3, null, a2, C57582a.m223616d(this.f130179a, R.color.udtoken_tag_neutral_bg_solid), C57582a.m223616d(this.f130179a, R.color.udtoken_tag_neutral_text_solid)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                append.setSpan(bVar, append.length() - 1, append.length(), 34);
                append.setSpan(new C52607c(this, headerViewData), append.length() - 1, append.length(), 34);
                if (headerViewData.mo179805o()) {
                    TextView textView7 = (TextView) view2.findViewById(R.id.mProfileTenantName);
                    Intrinsics.checkExpressionValueIsNotNull(textView7, "this.mProfileTenantName");
                    textView7.setText(append);
                    TextView textView8 = (TextView) view2.findViewById(R.id.mProfileTenantName);
                    Intrinsics.checkExpressionValueIsNotNull(textView8, "this.mProfileTenantName");
                    textView8.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    TextView textView9 = (TextView) view2.findViewById(R.id.mProfileTenantName);
                    Intrinsics.checkExpressionValueIsNotNull(textView9, "this.mProfileTenantName");
                    textView9.setText(headerViewData.mo179795e());
                }
            }
            TextView textView10 = (TextView) view2.findViewById(R.id.mProfileTenantName);
            Intrinsics.checkExpressionValueIsNotNull(textView10, "this.mProfileTenantName");
            if (TextUtils.isEmpty(headerViewData.mo179795e())) {
                i6 = 8;
            } else {
                i6 = 0;
            }
            textView10.setVisibility(i6);
            TextView textView11 = (TextView) view2.findViewById(R.id.mProfileUserName);
            Intrinsics.checkExpressionValueIsNotNull(textView11, "this.mProfileUserName");
            textView11.setText(headerViewData.mo179792a());
            ((TextView) view2.findViewById(R.id.mProfileUserName)).setOnClickListener(new C52608d(this, headerViewData));
            int g = headerViewData.mo179797g();
            if (g == 0) {
                ImageView imageView4 = (ImageView) view2.findViewById(R.id.mProfileUserSex1);
                Intrinsics.checkExpressionValueIsNotNull(imageView4, "this.mProfileUserSex1");
                imageView4.setVisibility(8);
                ImageView imageView5 = (ImageView) view2.findViewById(R.id.mProfileUserSex2);
                Intrinsics.checkExpressionValueIsNotNull(imageView5, "this.mProfileUserSex2");
                imageView5.setVisibility(8);
            } else if (g == 1) {
                if (m203875a(headerViewData)) {
                    ImageView imageView6 = (ImageView) view2.findViewById(R.id.mProfileUserSex1);
                    Intrinsics.checkExpressionValueIsNotNull(imageView6, "this.mProfileUserSex1");
                    imageView6.setVisibility(8);
                    ImageView imageView7 = (ImageView) view2.findViewById(R.id.mProfileUserSex2);
                    Intrinsics.checkExpressionValueIsNotNull(imageView7, "this.mProfileUserSex2");
                    imageView7.setVisibility(0);
                } else {
                    ImageView imageView8 = (ImageView) view2.findViewById(R.id.mProfileUserSex1);
                    Intrinsics.checkExpressionValueIsNotNull(imageView8, "this.mProfileUserSex1");
                    imageView8.setVisibility(0);
                    ImageView imageView9 = (ImageView) view2.findViewById(R.id.mProfileUserSex2);
                    Intrinsics.checkExpressionValueIsNotNull(imageView9, "this.mProfileUserSex2");
                    imageView9.setVisibility(8);
                }
                ((ImageView) view2.findViewById(R.id.mProfileUserSex1)).setImageResource(R.drawable.profile_ic_sex_male);
                ((ImageView) view2.findViewById(R.id.mProfileUserSex2)).setImageResource(R.drawable.profile_ic_sex_male);
            } else if (g == 2) {
                if (m203875a(headerViewData)) {
                    ImageView imageView10 = (ImageView) view2.findViewById(R.id.mProfileUserSex1);
                    Intrinsics.checkExpressionValueIsNotNull(imageView10, "this.mProfileUserSex1");
                    imageView10.setVisibility(8);
                    ImageView imageView11 = (ImageView) view2.findViewById(R.id.mProfileUserSex2);
                    Intrinsics.checkExpressionValueIsNotNull(imageView11, "this.mProfileUserSex2");
                    imageView11.setVisibility(0);
                } else {
                    ImageView imageView12 = (ImageView) view2.findViewById(R.id.mProfileUserSex1);
                    Intrinsics.checkExpressionValueIsNotNull(imageView12, "this.mProfileUserSex1");
                    imageView12.setVisibility(0);
                    ImageView imageView13 = (ImageView) view2.findViewById(R.id.mProfileUserSex2);
                    Intrinsics.checkExpressionValueIsNotNull(imageView13, "this.mProfileUserSex2");
                    imageView13.setVisibility(8);
                }
                ((ImageView) view2.findViewById(R.id.mProfileUserSex1)).setImageResource(R.drawable.profile_ic_sex_female);
                ((ImageView) view2.findViewById(R.id.mProfileUserSex2)).setImageResource(R.drawable.profile_ic_sex_female);
            }
            List<GetUserProfileResponse.CustomImage> p = headerViewData.mo179806p();
            if (p != null && !p.isEmpty()) {
                z = false;
            }
            if (z) {
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.mCustomTagFields);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mCustomTagFields");
                linearLayout.setVisibility(8);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.mCustomTagFields);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mCustomTagFields");
            linearLayout2.setVisibility(0);
            if (!m203876a(this.f130182e, headerViewData.mo179806p())) {
                ((LinearLayout) view2.findViewById(R.id.mCustomTagFields)).removeAllViews();
                int i7 = 0;
                for (T t : headerViewData.mo179806p()) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.mCustomTagFields);
                    AppCompatImageView appCompatImageView = new AppCompatImageView(view2.getContext());
                    ImageLoader.with(appCompatImageView.getContext()).load(new C38824b(t.resource_key)).asDrawable().into(appCompatImageView);
                    if (i7 > 0) {
                        appCompatImageView.setPaddingRelative(C57582a.m223600a(8), 0, 0, 0);
                    }
                    linearLayout3.addView(appCompatImageView, new ViewGroup.LayoutParams(-2, -1));
                    i7 = i8;
                }
                this.f130182e = headerViewData.mo179806p();
            }
        }
    }
}
