package com.ss.android.lark.moments.impl.publish;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1170p;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.bytedance.lark.pb.moments.v1.CreatePostResponse;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.hashtag.HashTagKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.hashtag.IHashTagDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.IMomentsGetIdentityTypeApi;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.face.FaceDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.identity.MomentsIdentityPluginManager;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.MomentsPhotoKBPlugin;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.MomentsFeedPagerAdapter;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.publish.category.CategoryTag;
import com.ss.android.lark.moments.impl.publish.draft.ImageData;
import com.ss.android.lark.moments.impl.publish.draft.VideoGridInfo;
import com.ss.android.lark.moments.impl.publish.grid.GridImageData;
import com.ss.android.lark.moments.impl.publish.grid.GridVideoData;
import com.ss.android.lark.moments.impl.publish.hashtag.AssociationListAdapter;
import com.ss.android.lark.moments.impl.publish.hashtag.C47987c;
import com.ss.android.lark.moments.impl.publish.input.IMomentsInputPluginDelegate;
import com.ss.android.lark.moments.impl.publish.input.MomentsPublishInputSupportPlugin;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 P2\u00020\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020(H\u0002J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020&H\u0002J\u000e\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020\nJ\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020&H\u0002J\"\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\b\u0010?\u001a\u00020&H\u0016J\u0012\u0010@\u001a\u00020&2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u00020&H\u0014J\u001e\u0010D\u001a\u00020&2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020G0Fj\b\u0012\u0004\u0012\u00020G`HJ\b\u0010I\u001a\u00020&H\u0014J\b\u0010J\u001a\u00020&H\u0014J\b\u0010K\u001a\u00020&H\u0002J\u0010\u0010L\u001a\u00020&2\u0006\u00104\u001a\u00020\nH\u0002J\b\u0010M\u001a\u00020&H\u0002J\u0010\u0010N\u001a\u00020&2\u0006\u0010O\u001a\u00020;H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0011R\u000e\u0010\u001f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "associationAdapter", "Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationListAdapter;", "getAssociationAdapter", "()Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationListAdapter;", "associationAdapter$delegate", "Lkotlin/Lazy;", "currentFragment", "Landroidx/fragment/app/Fragment;", "finishByPublish", "", "forceBindCategory", "hideAnimation", "Landroid/view/animation/TranslateAnimation;", "getHideAnimation", "()Landroid/view/animation/TranslateAnimation;", "hideAnimation$delegate", "identityManager", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentityPluginManager;", "inputSupportPlugin", "Lcom/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin;", "keyBoardStopped", "mKeyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "photoKBPlugin", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/MomentsPhotoKBPlugin;", "showAnimation", "getShowAnimation", "showAnimation$delegate", "toastedDraftFail", "viewModel", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "getViewModel", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "viewModel$delegate", "finish", "", "getAtPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "getFacePlugin", "getHashTagPlugin", "getIdentityPluginManager", "getPhotoPlugin", "getPostInputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "hideAssociateRv", "hideFragment", "fragment", "initKeyBoard", "container", "Landroid/widget/FrameLayout;", "initObserve", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinishedChangeCategory", "categoryList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Lkotlin/collections/ArrayList;", "onResume", "onStop", "showAssociateRv", "showFragment", "stop", "updateAssociationDialogHeight", "contentHeight", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsPublishActivity extends BaseFragmentActivity {

    /* renamed from: g */
    public static final Companion f120643g = new Companion(null);

    /* renamed from: a */
    public boolean f120644a;

    /* renamed from: b */
    public boolean f120645b;

    /* renamed from: c */
    public KeyBoard f120646c;

    /* renamed from: d */
    public MomentsPublishInputSupportPlugin f120647d;

    /* renamed from: e */
    public MomentsIdentityPluginManager f120648e;

    /* renamed from: f */
    public MomentsPhotoKBPlugin f120649f;

    /* renamed from: h */
    private final Lazy f120650h = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentsPublishViewModel.class), new MomentsPublishActivity$$special$$inlined$viewModels$2(this), new MomentsPublishActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: i */
    private Fragment f120651i;

    /* renamed from: j */
    private final boolean f120652j = MomentsDependencyHolder.f118998b.mo165901b().mo166492d();

    /* renamed from: k */
    private boolean f120653k;

    /* renamed from: l */
    private final Lazy f120654l = LazyKt.lazy(new C47907b(this));

    /* renamed from: m */
    private final Lazy f120655m = LazyKt.lazy(C47906aa.INSTANCE);

    /* renamed from: n */
    private final Lazy f120656n = LazyKt.lazy(new C47915i(this));

    /* renamed from: o */
    private HashMap f120657o;

    /* renamed from: j */
    private final TranslateAnimation m189211j() {
        return (TranslateAnimation) this.f120655m.getValue();
    }

    /* renamed from: k */
    private final TranslateAnimation m189212k() {
        return (TranslateAnimation) this.f120656n.getValue();
    }

    /* renamed from: a */
    public Context mo167798a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final MomentsPublishViewModel mo167799a() {
        return (MomentsPublishViewModel) this.f120650h.getValue();
    }

    /* renamed from: a */
    public void mo167801a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189206a(this, context);
    }

    /* renamed from: b */
    public View mo167804b(int i) {
        if (this.f120657o == null) {
            this.f120657o = new HashMap();
        }
        View view = (View) this.f120657o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120657o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final AssociationListAdapter mo167807c() {
        return (AssociationListAdapter) this.f120654l.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189203a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo167811f() {
        return super.getResources();
    }

    /* renamed from: g */
    public AssetManager mo167812g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m189208c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189207b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189205a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishActivity$Companion;", "", "()V", "ASSOCIATION_DIALOG_MARGINS", "", "ASSOCIATION_DIALOG_MIN_HEIGHT", "KEY_DEFAULT_SELECTED_CATEGORY_ID", "", "KEY_PAGE_HASH_TAG_CONTENT", "LOG_TAG", "MAX_COUNT", "", "REQUEST_CODE_CREATE_POST", "RESULT_CODE_CREATE_POST", "RESULT_KEY_CREATE_POST_RESPONSE", "RESULT_KEY_IS_ANONYMOUS_SEND", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$initKeyBoard$draftCallback$2$1", "invoke", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishActivity$initKeyBoard$draftCallback$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$j */
    public static final class C47917j extends Lambda implements Function0<C479181> {
        final /* synthetic */ MomentsPublishActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47917j(MomentsPublishActivity momentsPublishActivity) {
            super(0);
            this.this$0 = momentsPublishActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C479181 invoke() {
            return new IKeyBoardDependency(this) {
                /* class com.ss.android.lark.moments.impl.publish.MomentsPublishActivity.C47917j.C479181 */

                /* renamed from: a */
                final /* synthetic */ C47917j f120665a;

                @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                /* renamed from: a */
                public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
                    Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120665a = r1;
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$initKeyBoard$draftCallback$2$1$resetDraft$1", mo239173f = "MomentsPublishActivity.kt", mo239174i = {0}, mo239175l = {407}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$j$1$a */
                public static final class C47919a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ IKeyBoardDependency.IResetDraftCallback $callback;
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C479181 this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C47919a(C479181 r1, IKeyBoardDependency.IResetDraftCallback bVar, Continuation cVar) {
                        super(2, cVar);
                        this.this$0 = r1;
                        this.$callback = bVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C47919a aVar = new C47919a(this.this$0, this.$callback, cVar);
                        aVar.p$ = (CoroutineScope) obj;
                        return aVar;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                        return ((C47919a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object a = C69086a.m265828a();
                        int i = this.label;
                        if (i == 0) {
                            C69097g.m265891a(obj);
                            this.L$0 = this.p$;
                            this.label = 1;
                            if (C69388e.m266829a(Dispatchers.m266324b(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                                /* class com.ss.android.lark.moments.impl.publish.MomentsPublishActivity.C47917j.C479181.C47919a.C479201 */
                                Object L$0;
                                Object L$1;
                                int label;
                                private CoroutineScope p$;
                                final /* synthetic */ C47919a this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                    C479201 r0 = 

                                    @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                                    /* renamed from: a */
                                    public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
                                        Intrinsics.checkParameterIsNotNull(bVar, "callback");
                                        C53241h.m205898b("MomentsPublishKeyBoardManager", "reset publish draft");
                                        Job unused = C69553g.m266944a(C1170p.m5399a(this.f120665a.this$0), null, null, new C47919a(this, bVar, null), 3, null);
                                    }

                                    @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                                    /* renamed from: a */
                                    public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
                                        List<ImageData> list;
                                        MomentsPublishViewModel a = this.f120665a.this$0.mo167799a();
                                        MomentsPublishInputSupportPlugin bVar = this.f120665a.this$0.f120647d;
                                        VideoGridInfo videoGridInfo = null;
                                        if (bVar != null) {
                                            list = bVar.mo168106B();
                                        } else {
                                            list = null;
                                        }
                                        MomentsPublishInputSupportPlugin bVar2 = this.f120665a.this$0.f120647d;
                                        if (bVar2 != null) {
                                            videoGridInfo = bVar2.mo168107C();
                                        }
                                        a.saveDraft(richText2, list, videoGridInfo);
                                    }
                                };
                            }
                        }

                        @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
                            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
                        }

                        @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
                            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$getIdentityPluginManager$identityDelegate$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;", "getIdentityType", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "getQuota", "", "noQuotaLimitation", "", "hasAt", "setIdentityType", ShareHitPoint.f121869d, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$e */
                        public static final class C47911e implements IMomentsKeyboardManagerDependency {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120660a;

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
                            /* renamed from: b */
                            public boolean mo166301b() {
                                MomentsPublishInputSupportPlugin bVar = this.f120660a.f120647d;
                                if (bVar == null || !bVar.mo168129v()) {
                                    return false;
                                }
                                return true;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
                            /* renamed from: a */
                            public MomentsPublishViewModel.IdentityType mo166298a() {
                                MomentsPublishViewModel.IdentityType b = this.f120660a.mo167799a().getIdentityType().mo5927b();
                                if (b != null) {
                                    return b;
                                }
                                return MomentsPublishViewModel.IdentityType.NORMAL;
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47911e(MomentsPublishActivity momentsPublishActivity) {
                                this.f120660a = momentsPublishActivity;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
                            /* renamed from: a */
                            public void mo166300a(boolean z) {
                                this.f120660a.mo167799a().getAnonymousInfo(z);
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
                            /* renamed from: a */
                            public void mo166299a(MomentsPublishViewModel.IdentityType identityType) {
                                String str;
                                boolean z;
                                MomentsPublishInputSupportPlugin bVar;
                                Intrinsics.checkParameterIsNotNull(identityType, ShareHitPoint.f121869d);
                                this.f120660a.mo167799a().getIdentityType().mo5926a(identityType);
                                if (identityType != MomentsPublishViewModel.IdentityType.NORMAL) {
                                    AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
                                    if (b == null || (str = b.tip) == null) {
                                        str = "";
                                    }
                                    if (str.length() > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && (bVar = this.f120660a.f120647d) != null) {
                                        bVar.mo168119b(str);
                                        return;
                                    }
                                    return;
                                }
                                MomentsPublishInputSupportPlugin bVar2 = this.f120660a.f120647d;
                                if (bVar2 != null) {
                                    String string = UIUtils.getString(this.f120660a, R.string.Lark_Community_SaySomething);
                                    Intrinsics.checkExpressionValueIsNotNull(string, "com.larksuite.framework.…k_Community_SaySomething)");
                                    bVar2.mo168119b(string);
                                }
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$getPhotoPlugin$onPhotoUploadListener$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/OnPhotoUploadListener;", "cameraCanRecordVideo", "", "getLeftMaxCount", "", "hasImage", "hasVideo", "onPhotoEnableToUpload", "", "orderPhotos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "onUploadError", "paths", "", "", "onUploadSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$g */
                        public static final class C47913g implements OnPhotoUploadListener {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120662a;

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: a */
                            public int mo166343a() {
                                MomentsPublishInputSupportPlugin bVar = this.f120662a.f120647d;
                                if (bVar != null) {
                                    return bVar.mo168130w();
                                }
                                return 0;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: b */
                            public boolean mo166347b() {
                                MomentsPublishInputSupportPlugin bVar = this.f120662a.f120647d;
                                if (bVar != null) {
                                    return bVar.mo168131x();
                                }
                                return false;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: c */
                            public boolean mo166348c() {
                                MomentsPublishInputSupportPlugin bVar = this.f120662a.f120647d;
                                if (bVar != null) {
                                    return bVar.mo168132y();
                                }
                                return false;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: d */
                            public boolean mo166349d() {
                                MomentsPublishInputSupportPlugin bVar = this.f120662a.f120647d;
                                if (bVar == null || bVar.mo168133z() != 0) {
                                    return false;
                                }
                                return true;
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47913g(MomentsPublishActivity momentsPublishActivity) {
                                this.f120662a = momentsPublishActivity;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: a */
                            public void mo166345a(List<String> list) {
                                Intrinsics.checkParameterIsNotNull(list, "paths");
                                MomentsPublishInputSupportPlugin bVar = this.f120662a.f120647d;
                                if (bVar != null) {
                                    bVar.mo168117a(list);
                                }
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: a */
                            public void mo166344a(IPhotoDependency.Image image, boolean z) {
                                Intrinsics.checkParameterIsNotNull(image, "image");
                                this.f120662a.mo167799a().getUploadImageSuccess().mo5929b(TuplesKt.to(image, Boolean.valueOf(z)));
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
                            /* renamed from: a */
                            public void mo166346a(List<Photo> list, boolean z) {
                                Intrinsics.checkParameterIsNotNull(list, "orderPhotos");
                                MomentsPublishInputSupportPlugin bVar = this.f120662a.f120647d;
                                if (bVar != null) {
                                    bVar.mo168118a(list, z);
                                }
                            }
                        }

                        /* renamed from: h */
                        private final void m189209h() {
                            if (!this.f120653k) {
                                KeyBoard fVar = this.f120646c;
                                if (fVar != null) {
                                    fVar.mo146839t();
                                }
                                this.f120653k = true;
                            }
                        }

                        /* renamed from: m */
                        private final MomentsIdentityPluginManager m189214m() {
                            return new MomentsIdentityPluginManager(this, new C47911e(this));
                        }

                        /* renamed from: q */
                        private final IKeyBoardPlugin m189218q() {
                            return new HashTagKBPlugin(new C47910d(this));
                        }

                        /* renamed from: b */
                        public void mo167805b() {
                            super.onStop();
                            if (!this.f120644a) {
                                m189209h();
                            }
                        }

                        @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public void finish() {
                            if (this.f120644a) {
                                super.finish();
                                return;
                            }
                            m189209h();
                            super.finish();
                        }

                        /* access modifiers changed from: protected */
                        @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public void onDestroy() {
                            super.onDestroy();
                            KeyBoard fVar = this.f120646c;
                            if (fVar != null) {
                                fVar.mo146838s();
                            }
                        }

                        /* access modifiers changed from: protected */
                        @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public void onResume() {
                            super.onResume();
                            MomentsPublishInputSupportPlugin bVar = this.f120647d;
                            if (bVar != null) {
                                bVar.mo168108D();
                            }
                            this.f120653k = false;
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/TranslateAnimation;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$aa */
                        static final class C47906aa extends Lambda implements Function0<TranslateAnimation> {
                            public static final C47906aa INSTANCE = new C47906aa();

                            C47906aa() {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final TranslateAnimation invoke() {
                                TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED);
                                translateAnimation.setDuration(200);
                                return translateAnimation;
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$getAtPlugin$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/IMomentsGetIdentityTypeApi;", "getIdentityType", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$c */
                        public static final class C47909c implements IMomentsGetIdentityTypeApi {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120658a;

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.at.IMomentsGetIdentityTypeApi
                            /* renamed from: a */
                            public MomentsPublishViewModel.IdentityType mo166275a() {
                                MomentsPublishViewModel.IdentityType b = this.f120658a.mo167799a().getIdentityType().mo5927b();
                                if (b != null) {
                                    return b;
                                }
                                return MomentsPublishViewModel.IdentityType.NORMAL;
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47909c(MomentsPublishActivity momentsPublishActivity) {
                                this.f120658a = momentsPublishActivity;
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$getPhotoPlugin$iPhotoDependency$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/IMomentsPhotoDependency;", "isEnablePostSendVideo", "", "isVideoEnabled", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "requestInputFocus", "setEnableClick", "enable", "updateVideo", "videoInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$f */
                        public static final class C47912f implements IMomentsPhotoDependency {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120661a;

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public boolean mo122042a() {
                                return true;
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: b */
                            public boolean mo122044b() {
                                return true;
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency
                            /* renamed from: c */
                            public void mo166336c() {
                                IOutInputSupport h;
                                EditText l;
                                KeyBoard fVar = this.f120661a.f120646c;
                                if (fVar != null && (h = fVar.mo146827h()) != null && (l = h.mo146904l()) != null) {
                                    l.requestFocus();
                                }
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47912f(MomentsPublishActivity momentsPublishActivity) {
                                this.f120661a = momentsPublishActivity;
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public Observable<Map<String, IPhotoDependency.FrameInfo>> mo122036a(List<IPhotoDependency.VideoInfo> list) {
                                Intrinsics.checkParameterIsNotNull(list, "videoInfos");
                                return IMomentsPhotoDependency.C47324a.m187458b(this, list);
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: b */
                            public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
                                Intrinsics.checkParameterIsNotNull(list, "videoPaths");
                                IMomentsPhotoDependency.C47324a.m187456a(this, list);
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public void mo122038a(C58557a.C58559a aVar) {
                                Intrinsics.checkParameterIsNotNull(aVar, "builder");
                                PerfGalleryLoadMonitor.f145397a.mo199287a(Scene.Moments, 2);
                                MomentsPublishInputSupportPlugin bVar = this.f120661a.f120647d;
                                if (bVar != null) {
                                    aVar.mo198506a(bVar.mo168130w()).mo198513b(9).mo198525h(!bVar.mo168132y()).mo198519d(bVar.mo168131x()).mo198527j(true).mo198532o(false).mo198522f(3).mo198510a(this.f120661a, 233);
                                }
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public void mo122039a(C58633e.C58634a aVar) {
                                int i;
                                boolean z;
                                Intrinsics.checkParameterIsNotNull(aVar, "builder");
                                MomentsPublishInputSupportPlugin bVar = this.f120661a.f120647d;
                                if (bVar != null) {
                                    i = bVar.mo168130w();
                                } else {
                                    i = 0;
                                }
                                C58633e.C58634a c = aVar.mo198695b(i).mo198698c(9);
                                MomentsPublishInputSupportPlugin bVar2 = this.f120661a.f120647d;
                                if (bVar2 != null) {
                                    z = bVar2.mo168131x();
                                } else {
                                    z = true;
                                }
                                c.mo198699c(z).mo198693a(this.f120661a, 911);
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public void mo122040a(ArrayList<File> arrayList) {
                                Intrinsics.checkParameterIsNotNull(arrayList, "fileList");
                                IMomentsPhotoDependency.C47324a.m187454a((IMomentsPhotoDependency) this, arrayList);
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency
                            /* renamed from: a */
                            public void mo166335a(boolean z) {
                                this.f120661a.mo167799a().getEnableClick().mo5929b(Boolean.valueOf(z));
                            }

                            @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency
                            /* renamed from: a */
                            public void mo166334a(IPhotoDependency.VideoInfo videoInfo, Photo photo) {
                                Intrinsics.checkParameterIsNotNull(videoInfo, "videoInfo");
                                Intrinsics.checkParameterIsNotNull(photo, "photo");
                                this.f120661a.mo167799a().uploadVideo(this.f120661a, photo, videoInfo);
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public void mo122041a(ArrayList<String> arrayList, boolean z) {
                                Intrinsics.checkParameterIsNotNull(arrayList, "photoPaths");
                                IMomentsPhotoDependency.C47324a.m187455a(this, arrayList, z);
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
                            /* renamed from: a */
                            public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
                                Intrinsics.checkParameterIsNotNull(list, "photos");
                                return this.f120661a.mo167799a().uploadImage(this.f120661a, list, z);
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$getPostInputSupportPlugin$inputDelegate$1", "Lcom/ss/android/lark/moments/impl/publish/input/IMomentsInputPluginDelegate;", "isAssociationLayoutVisible", "", "startFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$h */
                        public static final class C47914h implements IMomentsInputPluginDelegate {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120663a;

                            @Override // com.ss.android.lark.moments.impl.publish.input.IMomentsInputPluginDelegate
                            /* renamed from: a */
                            public boolean mo167816a() {
                                LinearLayout linearLayout = (LinearLayout) this.f120663a.mo167804b(R.id.llAssociate);
                                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llAssociate");
                                if (linearLayout.getVisibility() == 0) {
                                    return true;
                                }
                                return false;
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47914h(MomentsPublishActivity momentsPublishActivity) {
                                this.f120663a = momentsPublishActivity;
                            }

                            @Override // com.ss.android.lark.moments.impl.publish.input.IMomentsInputPluginDelegate
                            /* renamed from: a */
                            public void mo167815a(Fragment fragment) {
                                Intrinsics.checkParameterIsNotNull(fragment, "fragment");
                                this.f120663a.mo167802a(fragment);
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/TranslateAnimation;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$i */
                        static final class C47915i extends Lambda implements Function0<TranslateAnimation> {
                            final /* synthetic */ MomentsPublishActivity this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C47915i(MomentsPublishActivity momentsPublishActivity) {
                                super(0);
                                this.this$0 = momentsPublishActivity;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final TranslateAnimation invoke() {
                                TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f);
                                translateAnimation.setDuration(200);
                                translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC47916a(this));
                                return translateAnimation;
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$hideAnimation$2$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                            /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$i$a  reason: invalid class name */
                            public static final class animationAnimation$AnimationListenerC47916a implements Animation.AnimationListener {

                                /* renamed from: a */
                                final /* synthetic */ C47915i f120664a;

                                public void onAnimationRepeat(Animation animation) {
                                }

                                public void onAnimationStart(Animation animation) {
                                }

                                animationAnimation$AnimationListenerC47916a(C47915i iVar) {
                                    this.f120664a = iVar;
                                }

                                public void onAnimationEnd(Animation animation) {
                                    LinearLayout linearLayout = (LinearLayout) this.f120664a.this$0.mo167804b(R.id.llAssociate);
                                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llAssociate");
                                    linearLayout.setVisibility(8);
                                    KeyBoard fVar = this.f120664a.this$0.f120646c;
                                    if (fVar != null) {
                                        fVar.mo146832m();
                                    }
                                    MomentsIdentityPluginManager cVar = this.f120664a.this$0.f120648e;
                                    if (cVar != null) {
                                        cVar.mo166309c();
                                    }
                                    MomentsPublishInputSupportPlugin bVar = this.f120664a.this$0.f120647d;
                                    if (bVar != null) {
                                        bVar.mo168108D();
                                    }
                                    this.f120664a.this$0.mo167807c().mo168101a(new ArrayList());
                                }
                            }
                        }

                        /* renamed from: n */
                        private final IKeyBoardPlugin m189215n() {
                            FragmentManager supportFragmentManager = getSupportFragmentManager();
                            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
                            return new FaceKBPlugin(false, false, supportFragmentManager, new FaceDependency());
                        }

                        /* renamed from: o */
                        private final IKeyBoardPlugin m189216o() {
                            MomentsPhotoKBPlugin bVar = new MomentsPhotoKBPlugin(new C47913g(this), new C47912f(this), false, 4, null);
                            this.f120649f = bVar;
                            return bVar;
                        }

                        /* renamed from: p */
                        private final IKeyBoardPlugin m189217p() {
                            return new AtKBPlugin("", false, true, new MomentsAtDependency(this, new C47909c(this)));
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/publish/hashtag/AssociationListAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$b */
                        public static final class C47907b extends Lambda implements Function0<AssociationListAdapter> {
                            final /* synthetic */ MomentsPublishActivity this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C47907b(MomentsPublishActivity momentsPublishActivity) {
                                super(0);
                                this.this$0 = momentsPublishActivity;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final AssociationListAdapter invoke() {
                                AssociationListAdapter aVar = new AssociationListAdapter(new Function1<String, Unit>(this) {
                                    /* class com.ss.android.lark.moments.impl.publish.MomentsPublishActivity.C47907b.C479081 */
                                    final /* synthetic */ C47907b this$0;

                                    {
                                        this.this$0 = r1;
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                        invoke(str);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(String str) {
                                        Intrinsics.checkParameterIsNotNull(str, "it");
                                        MomentsPublishInputSupportPlugin bVar = this.this$0.this$0.f120647d;
                                        if (bVar != null) {
                                            bVar.mo168121c(str);
                                        }
                                        this.this$0.this$0.mo167810e();
                                    }
                                });
                                RecyclerView recyclerView = (RecyclerView) this.this$0.mo167804b(R.id.rvAssociate);
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvAssociate");
                                recyclerView.setAdapter(aVar);
                                return aVar;
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$initObserve$12", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "onKeyBoardHide", "", "onKeyBoardShow", "heightDiff", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$n */
                        public static final class C47924n implements KeyBoardObserveFrameLayout.IOnKeyBoardListener {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120669a;

                            @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
                            /* renamed from: a */
                            public void mo129626a() {
                                IOutInputSupport h;
                                EditText l;
                                KeyBoard fVar = this.f120669a.f120646c;
                                if (!(fVar == null || (h = fVar.mo146827h()) == null || (l = h.mo146904l()) == null)) {
                                    l.requestLayout();
                                }
                                Integer b = this.f120669a.mo167799a().getEditTextHeightChanged().mo5927b();
                                if (b != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(b, "viewModel.editTextHeightChanged.value ?: return");
                                    this.f120669a.mo167800a(b.intValue());
                                }
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47924n(MomentsPublishActivity momentsPublishActivity) {
                                this.f120669a = momentsPublishActivity;
                            }

                            @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
                            /* renamed from: a */
                            public void mo129627a(int i) {
                                IOutInputSupport h;
                                EditText l;
                                KeyBoard fVar = this.f120669a.f120646c;
                                if (!(fVar == null || (h = fVar.mo146827h()) == null || (l = h.mo146904l()) == null)) {
                                    l.requestLayout();
                                }
                                Integer b = this.f120669a.mo167799a().getEditTextHeightChanged().mo5927b();
                                if (b != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(b, "viewModel.editTextHeightChanged.value ?: return");
                                    this.f120669a.mo167800a(b.intValue());
                                }
                            }
                        }

                        /* renamed from: l */
                        private final IInputSupportPlugin m189213l() {
                            MomentsPublishInputSupportPlugin bVar = new MomentsPublishInputSupportPlugin(this.f120646c, new C47914h(this), this, this.f120652j);
                            this.f120647d = bVar;
                            bVar.mo168126s();
                            MomentsIdentityPluginManager m = m189214m();
                            this.f120648e = m;
                            IInputSupportAdditionPlugin a = m.mo166302a("input_addition");
                            if (a != null) {
                                bVar.mo147009a("input_addition", a);
                            }
                            IInputSupportAdditionPlugin a2 = m.mo166302a("input_pop");
                            if (a2 != null) {
                                bVar.mo147009a("input_pop", a2);
                            }
                            return bVar;
                        }

                        /* renamed from: e */
                        public final void mo167810e() {
                            LinearLayout linearLayout = (LinearLayout) mo167804b(R.id.llAssociate);
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llAssociate");
                            if (linearLayout.getVisibility() != 8) {
                                LinearLayout linearLayout2 = (LinearLayout) mo167804b(R.id.llAssociate);
                                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llAssociate");
                                if (!Intrinsics.areEqual(linearLayout2.getAnimation(), m189212k())) {
                                    ((LinearLayout) mo167804b(R.id.llAssociate)).startAnimation(m189212k());
                                }
                            }
                        }

                        @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public void onBackPressed() {
                            if (!Intrinsics.areEqual((Object) mo167799a().getEnableClick().mo5927b(), (Object) false)) {
                                Fragment fragment = this.f120651i;
                                if (fragment != null) {
                                    mo167806b(fragment);
                                    return;
                                }
                                m189209h();
                                super.onBackPressed();
                            }
                        }

                        /* renamed from: d */
                        public final void mo167809d() {
                            LinearLayout linearLayout = (LinearLayout) mo167804b(R.id.llAssociate);
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llAssociate");
                            if (linearLayout.getVisibility() != 0) {
                                LinearLayout linearLayout2 = (LinearLayout) mo167804b(R.id.llAssociate);
                                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llAssociate");
                                if (!Intrinsics.areEqual(linearLayout2.getAnimation(), m189211j())) {
                                    KeyBoard fVar = this.f120646c;
                                    if (fVar != null) {
                                        fVar.mo146831l();
                                    }
                                    MomentsIdentityPluginManager cVar = this.f120648e;
                                    if (cVar != null) {
                                        cVar.mo166307b();
                                    }
                                    LinearLayout linearLayout3 = (LinearLayout) mo167804b(R.id.llAssociate);
                                    linearLayout3.bringToFront();
                                    linearLayout3.setVisibility(0);
                                    linearLayout3.startAnimation(m189211j());
                                }
                            }
                        }

                        /* renamed from: i */
                        private final void m189210i() {
                            MomentsPublishActivity momentsPublishActivity = this;
                            mo167799a().getSendResponse().mo5923a(momentsPublishActivity, new C47921k(this));
                            mo167799a().getCategoryList().mo5923a(momentsPublishActivity, new C47929s(this));
                            mo167799a().getHasQuota().mo5923a(momentsPublishActivity, new C47930t(this));
                            mo167799a().getCategoryEnableAnonymous().mo5923a(momentsPublishActivity, new C47931u(this));
                            mo167799a().getAnonymousPostLoading().mo5923a(momentsPublishActivity, new C47932v(this));
                            mo167799a().getAnonymousAtError().mo5923a(momentsPublishActivity, new C47933w(this));
                            mo167799a().getIdentityType().mo5923a(momentsPublishActivity, new C47934x(this));
                            mo167799a().getResetIdentityDraftFail().mo5923a(momentsPublishActivity, new C47935y(this));
                            mo167799a().getShowAssociateData().mo5923a(momentsPublishActivity, new C47936z(this));
                            mo167799a().getAssociateShowing().mo5923a(momentsPublishActivity, new C47922l(this));
                            mo167799a().getEditTextHeightChanged().mo5923a(momentsPublishActivity, new C47923m(this));
                            ((SysKeyBoardObserveFrameLayout) mo167804b(R.id.keyboardDetectorView)).mo148228a(new C47924n(this));
                            mo167799a().getRetryUploadImage().mo5923a(momentsPublishActivity, new C47925o(this));
                            mo167799a().getRetryUploadVideo().mo5923a(momentsPublishActivity, new C47926p(this));
                            mo167799a().getUploadVideoFailToast().mo5923a(momentsPublishActivity, new C47927q(this));
                            mo167799a().getUploadImageSuccess().mo5923a(momentsPublishActivity, new C47928r(this));
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishActivity$getHashTagPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/hashtag/IHashTagDependency;", "onHashTagIconClick", "", "editable", "Landroid/text/Editable;", "index", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$d */
                        public static final class C47910d implements IHashTagDependency {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120659a;

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            C47910d(MomentsPublishActivity momentsPublishActivity) {
                                this.f120659a = momentsPublishActivity;
                            }

                            @Override // com.ss.android.lark.keyboard.plugin.tool.hashtag.IHashTagDependency
                            /* renamed from: a */
                            public void mo147415a(Editable editable, int i) {
                                String str;
                                Intrinsics.checkParameterIsNotNull(editable, "editable");
                                MomentsPublishInputSupportPlugin bVar = this.f120659a.f120647d;
                                if (bVar != null) {
                                    bVar.mo168105A();
                                }
                                if (C47987c.m189449b(editable, i)) {
                                    str = " #";
                                } else {
                                    str = "#";
                                }
                                if (i < 0 || i >= editable.length()) {
                                    editable.append((CharSequence) str);
                                } else {
                                    editable.insert(i, str);
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$m */
                        public static final class C47923m<T> implements AbstractC1178x<Integer> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120668a;

                            C47923m(MomentsPublishActivity momentsPublishActivity) {
                                this.f120668a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Integer num) {
                                MomentsPublishActivity momentsPublishActivity = this.f120668a;
                                Intrinsics.checkExpressionValueIsNotNull(num, "it");
                                momentsPublishActivity.mo167800a(num.intValue());
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasQuota", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$t */
                        public static final class C47930t<T> implements AbstractC1178x<Boolean> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120675a;

                            C47930t(MomentsPublishActivity momentsPublishActivity) {
                                this.f120675a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Boolean bool) {
                                if (bool != null) {
                                    boolean booleanValue = bool.booleanValue();
                                    MomentsIdentityPluginManager cVar = this.f120675a.f120648e;
                                    if (cVar != null) {
                                        cVar.mo166306a(booleanValue);
                                    }
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$x */
                        public static final class C47934x<T> implements AbstractC1178x<MomentsPublishViewModel.IdentityType> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120679a;

                            C47934x(MomentsPublishActivity momentsPublishActivity) {
                                this.f120679a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(MomentsPublishViewModel.IdentityType identityType) {
                                MomentsIdentityPluginManager cVar = this.f120679a.f120648e;
                                if (cVar != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(identityType, "it");
                                    cVar.mo166304a(identityType);
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$l */
                        public static final class C47922l<T> implements AbstractC1178x<Boolean> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120667a;

                            C47922l(MomentsPublishActivity momentsPublishActivity) {
                                this.f120667a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Boolean bool) {
                                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                                if (bool.booleanValue()) {
                                    this.f120667a.mo167809d();
                                } else {
                                    this.f120667a.mo167810e();
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "onChanged", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$q */
                        public static final class C47927q<T> implements AbstractC1178x<Unit> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120672a;

                            C47927q(MomentsPublishActivity momentsPublishActivity) {
                                this.f120672a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Unit unit) {
                                MomentsPublishActivity momentsPublishActivity = this.f120672a;
                                LKUIToast.loadFail(momentsPublishActivity, C52990a.m205228a((Context) momentsPublishActivity, (int) R.string.Lark_CommunityUnableToUploadToast));
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$r */
                        public static final class C47928r<T> implements AbstractC1178x<Pair<? extends IPhotoDependency.Image, ? extends Boolean>> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120673a;

                            C47928r(MomentsPublishActivity momentsPublishActivity) {
                                this.f120673a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Pair<IPhotoDependency.Image, Boolean> pair) {
                                MomentsPublishInputSupportPlugin bVar = this.f120673a.f120647d;
                                if (bVar != null) {
                                    bVar.mo168114a(pair.getFirst(), pair.getSecond().booleanValue());
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "enable", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$u */
                        public static final class C47931u<T> implements AbstractC1178x<Boolean> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120676a;

                            C47931u(MomentsPublishActivity momentsPublishActivity) {
                                this.f120676a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Boolean bool) {
                                MomentsIdentityPluginManager cVar = this.f120676a.f120648e;
                                if (cVar != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(bool, "enable");
                                    cVar.mo166308b(bool.booleanValue());
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$y */
                        public static final class C47935y<T> implements AbstractC1178x<Boolean> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120680a;

                            C47935y(MomentsPublishActivity momentsPublishActivity) {
                                this.f120680a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Boolean bool) {
                                if (!this.f120680a.f120645b) {
                                    this.f120680a.f120645b = true;
                                    MomentsPublishActivity momentsPublishActivity = this.f120680a;
                                    LKUIToast.show(momentsPublishActivity, C52990a.m205228a((Context) momentsPublishActivity, (int) R.string.Lark_Community_UnableShareAnonymousToast));
                                }
                            }
                        }

                        /* renamed from: b */
                        public static Resources m189207b(MomentsPublishActivity momentsPublishActivity) {
                            if (C57824f.m224469c()) {
                                DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsPublishActivity);
                            }
                            return momentsPublishActivity.mo167811f();
                        }

                        /* renamed from: c */
                        public static AssetManager m189208c(MomentsPublishActivity momentsPublishActivity) {
                            if (C57824f.m224469c()) {
                                DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsPublishActivity);
                            }
                            return momentsPublishActivity.mo167812g();
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "gridImageData", "Lcom/ss/android/lark/moments/impl/publish/grid/GridImageData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$o */
                        public static final class C47925o<T> implements AbstractC1178x<GridImageData> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120670a;

                            C47925o(MomentsPublishActivity momentsPublishActivity) {
                                this.f120670a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(GridImageData bVar) {
                                ArrayList arrayList = new ArrayList();
                                Photo photo = new Photo();
                                photo.setPath(bVar.mo168052a());
                                arrayList.add(photo);
                                MomentsPhotoKBPlugin bVar2 = this.f120670a.f120649f;
                                if (bVar2 != null) {
                                    bVar2.mo166337c(arrayList, bVar.mo168055c());
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "gridVideoData", "Lcom/ss/android/lark/moments/impl/publish/grid/GridVideoData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$p */
                        public static final class C47926p<T> implements AbstractC1178x<GridVideoData> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120671a;

                            C47926p(MomentsPublishActivity momentsPublishActivity) {
                                this.f120671a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(GridVideoData cVar) {
                                Photo photo;
                                VideoGridInfo C;
                                MomentsPublishInputSupportPlugin bVar = this.f120671a.f120647d;
                                if (bVar == null || (C = bVar.mo168107C()) == null) {
                                    photo = null;
                                } else {
                                    photo = C.getPhoto();
                                }
                                if (photo != null) {
                                    List<IPhotoDependency.VideoInfo> mutableListOf = CollectionsKt.mutableListOf(cVar.mo168057a().getVideoInfo());
                                    MomentsPhotoKBPlugin bVar2 = this.f120671a.f120649f;
                                    if (bVar2 != null) {
                                        bVar2.mo147809a(mutableListOf, CollectionsKt.mutableListOf(photo));
                                    }
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$v */
                        public static final class C47932v<T> implements AbstractC1178x<Pair<? extends Integer, ? extends String>> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120677a;

                            C47932v(MomentsPublishActivity momentsPublishActivity) {
                                this.f120677a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Pair<Integer, String> pair) {
                                int intValue = pair.getFirst().intValue();
                                if (intValue == 0) {
                                    LKUIToast.showLoading(this.f120677a, (int) R.string.Lark_Community_Sending);
                                } else if (intValue == 1) {
                                    LKUIToast.cancelLoading();
                                } else if (intValue == 2) {
                                    String second = pair.getSecond();
                                    if (second == null) {
                                        second = C52990a.m205228a((Context) this.f120677a, (int) R.string.Lark_Community_UnableToPostToast);
                                    }
                                    LKUIToast.loadFail(this.f120677a, second);
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$w */
                        public static final class C47933w<T> implements AbstractC1178x<Boolean> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120678a;

                            C47933w(MomentsPublishActivity momentsPublishActivity) {
                                this.f120678a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Boolean bool) {
                                int i;
                                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                                if (bool.booleanValue()) {
                                    MomentsPublishActivity momentsPublishActivity = this.f120678a;
                                    MomentsPublishActivity momentsPublishActivity2 = momentsPublishActivity;
                                    if (momentsPublishActivity.mo167799a().getIdentityType().mo5927b() == MomentsPublishViewModel.IdentityType.ANONYMOUS) {
                                        i = R.string.Lark_Community_UnableAnonymousMentionToast;
                                    } else {
                                        i = R.string.Lark_Community_UnableNicknameMentionToast;
                                    }
                                    LKUIToast.show(this.f120678a, C52990a.m205228a((Context) momentsPublishActivity2, i));
                                }
                            }
                        }

                        /* access modifiers changed from: protected */
                        @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
                        public void onCreate(Bundle bundle) {
                            super.onCreate(bundle);
                            setContentView(R.layout.moments_activity_post);
                            mo167799a().setIntent(getIntent());
                            m189210i();
                            FrameLayout frameLayout = (FrameLayout) mo167804b(R.id.editContainer);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "editContainer");
                            m189204a(frameLayout);
                            mo167799a().setForceBindCategory(this.f120652j);
                            MomentsHitPointNew.f119721a.mo166866c();
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/bytedance/lark/pb/moments/v1/CreatePostResponse;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$k */
                        public static final class C47921k<T> implements AbstractC1178x<Pair<? extends CreatePostResponse, ? extends Boolean>> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120666a;

                            C47921k(MomentsPublishActivity momentsPublishActivity) {
                                this.f120666a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(Pair<CreatePostResponse, Boolean> pair) {
                                MomentsFeedFragment momentsFeedFragment;
                                Intent intent = this.f120666a.getIntent();
                                intent.putExtra("result_key_create_post_response", pair.getFirst());
                                intent.putExtra("result_key_is_anonymous_send", pair.getSecond().booleanValue());
                                this.f120666a.setResult(-1, intent);
                                this.f120666a.f120644a = true;
                                MomentsPublishInputSupportPlugin bVar = this.f120666a.f120647d;
                                if (bVar != null) {
                                    bVar.mo168109E();
                                }
                                this.f120666a.finish();
                                Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                                Bundle extras = intent.getExtras();
                                if (extras != null && (momentsFeedFragment = MomentsFeedPagerAdapter.f120270c.mo167404a().get()) != null) {
                                    momentsFeedFragment.mo166890a(extras);
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$s */
                        public static final class C47929s<T> implements AbstractC1178x<ArrayList<CategoryTag>> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120674a;

                            C47929s(MomentsPublishActivity momentsPublishActivity) {
                                this.f120674a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(ArrayList<CategoryTag> arrayList) {
                                boolean z;
                                ArrayList<CategoryTag> arrayList2 = arrayList;
                                if (arrayList2 == null || arrayList2.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    MomentsPublishInputSupportPlugin bVar = this.f120674a.f120647d;
                                    if (bVar != null) {
                                        bVar.mo168110F();
                                        return;
                                    }
                                    return;
                                }
                                MomentsPublishInputSupportPlugin bVar2 = this.f120674a.f120647d;
                                if (bVar2 != null) {
                                    bVar2.mo168116a(arrayList);
                                }
                                LinearLayout linearLayout = (LinearLayout) this.f120674a.mo167804b(R.id.llAssociate);
                                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llAssociate");
                                if (linearLayout.getVisibility() == 8) {
                                    this.f120674a.mo167799a().refreshAnonymousEnable();
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociateData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishActivity$z */
                        public static final class C47936z<T> implements AbstractC1178x<MomentsPublishViewModel.AssociateData> {

                            /* renamed from: a */
                            final /* synthetic */ MomentsPublishActivity f120681a;

                            C47936z(MomentsPublishActivity momentsPublishActivity) {
                                this.f120681a = momentsPublishActivity;
                            }

                            /* renamed from: a */
                            public final void onChanged(MomentsPublishViewModel.AssociateData aVar) {
                                int i;
                                TextView textView = (TextView) this.f120681a.mo167804b(R.id.frequentTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView, "frequentTitle");
                                TextView textView2 = textView;
                                if (aVar.mo167881b()) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                textView2.setVisibility(i);
                                TextView textView3 = (TextView) this.f120681a.mo167804b(R.id.frequentTitle);
                                Intrinsics.checkExpressionValueIsNotNull(textView3, "frequentTitle");
                                textView3.setText(FakeBoldSpan.f119246a.mo166166a(R.string.Lark_Community_RecentTitle));
                                this.f120681a.mo167807c().mo168101a(aVar.mo167880a());
                            }
                        }

                        /* renamed from: a */
                        private final void m189204a(FrameLayout frameLayout) {
                            KeyBoard fVar = new KeyBoard(this, frameLayout, (IKeyBoardDependency) LazyKt.lazy(new C47917j(this)).getValue(), null, null, false, 56, null);
                            this.f120646c = fVar;
                            fVar.mo146806a("face", m189215n());
                            fVar.mo146806a("at", m189217p());
                            fVar.mo146806a("photo", m189216o());
                            fVar.mo146806a("hash_tag", m189218q());
                            fVar.mo146804a("post", m189213l());
                            fVar.mo146814b(R.color.transparent);
                            fVar.mo146842w();
                        }

                        /* renamed from: b */
                        public final void mo167806b(Fragment fragment) {
                            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
                            this.f120651i = null;
                            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.activity_enter_from_bottom, R.anim.activity_close_to_bottom).remove(fragment).commitAllowingStateLoss();
                            getSupportFragmentManager().executePendingTransactions();
                            MomentsPublishInputSupportPlugin bVar = this.f120647d;
                            if (bVar != null) {
                                bVar.mo168108D();
                            }
                        }

                        /* renamed from: a */
                        public static void m189205a(MomentsPublishActivity momentsPublishActivity) {
                            momentsPublishActivity.mo167805b();
                            if (EnterTransitionCrashOptimizer.getContext() != null) {
                                MomentsPublishActivity momentsPublishActivity2 = momentsPublishActivity;
                                if (Build.VERSION.SDK_INT >= 21) {
                                    try {
                                        momentsPublishActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void mo167800a(int i) {
                            Rect rect = new Rect();
                            Window window = getWindow();
                            Intrinsics.checkExpressionValueIsNotNull(window, "window");
                            window.getDecorView().getWindowVisibleDisplayFrame(rect);
                            MomentsPublishActivity momentsPublishActivity = this;
                            int max = Math.max(C52990a.m205224a((Context) momentsPublishActivity, 200.0f), ((rect.height() - i) - C52990a.m205224a((Context) momentsPublishActivity, 100.0f)) - DeviceUtils.getStatusHeight(momentsPublishActivity));
                            LinearLayout linearLayout = (LinearLayout) mo167804b(R.id.llAssociate);
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llAssociate");
                            linearLayout.getLayoutParams().height = max;
                            ((LinearLayout) mo167804b(R.id.llAssociate)).requestLayout();
                        }

                        /* renamed from: a */
                        public final void mo167802a(Fragment fragment) {
                            this.f120651i = fragment;
                            ((FrameLayout) mo167804b(R.id.fragmentContainer)).bringToFront();
                            FragmentTransaction customAnimations = getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.activity_enter_from_bottom, R.anim.activity_close_to_bottom);
                            FrameLayout frameLayout = (FrameLayout) mo167804b(R.id.fragmentContainer);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "fragmentContainer");
                            customAnimations.add(frameLayout.getId(), fragment, (String) null).commitAllowingStateLoss();
                            getSupportFragmentManager().executePendingTransactions();
                        }

                        /* renamed from: a */
                        public final void mo167803a(ArrayList<CategoryTag> arrayList) {
                            Intrinsics.checkParameterIsNotNull(arrayList, "categoryList");
                            MomentsPublishInputSupportPlugin bVar = this.f120647d;
                            if (bVar != null) {
                                bVar.mo168111G();
                            }
                            mo167799a().getCategoryList().mo5926a(arrayList);
                        }

                        /* renamed from: a */
                        public static void m189206a(MomentsPublishActivity momentsPublishActivity, Context context) {
                            momentsPublishActivity.mo167801a(context);
                            if (C57824f.m224469c()) {
                                DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsPublishActivity);
                            }
                        }

                        /* renamed from: a */
                        public static Context m189203a(MomentsPublishActivity momentsPublishActivity, Configuration configuration) {
                            Context a = momentsPublishActivity.mo167798a(configuration);
                            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
                            Log.m165389i("LanguageHooker", "hook createConfigurationContext");
                            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
                        }

                        /* access modifiers changed from: protected */
                        @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
                        public void onActivityResult(int i, int i2, Intent intent) {
                            KeyBoard fVar;
                            super.onActivityResult(i, i2, intent);
                            if (i == 911 || i == 233 || i == 1638) {
                                MomentsPhotoKBPlugin bVar = this.f120649f;
                                if (!(bVar == null || (fVar = this.f120646c) == null)) {
                                    fVar.mo146800a(bVar);
                                }
                                KeyBoard fVar2 = this.f120646c;
                                if (fVar2 != null) {
                                    fVar2.mo146812a(i, i2, intent);
                                }
                            } else if (i == 666) {
                                if (intent != null) {
                                    Serializable serializableExtra = intent.getSerializableExtra("SELECTED_PHOTOS");
                                    MomentsPublishInputSupportPlugin bVar2 = this.f120647d;
                                    if (bVar2 == null) {
                                        return;
                                    }
                                    if (serializableExtra != null) {
                                        bVar2.mo168120b(C69121n.m265989f(serializableExtra));
                                        return;
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                                }
                            } else if (i == 15619 && intent != null) {
                                Serializable serializableExtra2 = intent.getSerializableExtra("nickname_user");
                                if (serializableExtra2 instanceof MomentUser) {
                                    MomentsIdentityPluginManager cVar = this.f120648e;
                                    if (cVar != null) {
                                        cVar.mo166305a((MomentUser) serializableExtra2);
                                    }
                                    mo167799a().setNicknameIdentityType();
                                }
                            }
                        }
                    }
