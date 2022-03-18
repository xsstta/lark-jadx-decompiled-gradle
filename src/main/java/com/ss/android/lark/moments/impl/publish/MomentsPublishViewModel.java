package com.ss.android.lark.moments.impl.publish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.Editable;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.bytedance.lark.pb.moments.v1.CreatePostResponse;
import com.bytedance.lark.pb.moments.v1.ImageInfo;
import com.bytedance.lark.pb.moments.v1.ListCategoriesResponse;
import com.bytedance.lark.pb.moments.v1.MediaInfo;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.EncryptImageData;
import com.ss.android.lark.moments.dependency.idependency.IDriveDependency;
import com.ss.android.lark.moments.dependency.idependency.IImageDependency;
import com.ss.android.lark.moments.dependency.idependency.IMomentsDriveUploadCallback;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.publish.category.CategoryTag;
import com.ss.android.lark.moments.impl.publish.draft.ImageData;
import com.ss.android.lark.moments.impl.publish.draft.MomentsDraftData;
import com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate;
import com.ss.android.lark.moments.impl.publish.draft.VideoGridInfo;
import com.ss.android.lark.moments.impl.publish.grid.GridImageData;
import com.ss.android.lark.moments.impl.publish.grid.GridVideoData;
import com.ss.android.lark.moments.impl.publish.grid.MediaState;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.moments.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.pb.moments.ListHashtagsByUserInputResponse;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.rxjava.AbstractC57864b;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b\u0001\u0001\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010V\u001a\u00020\u0007J\t\u0010W\u001a\u00020PH\u0001J\u0010\u0010X\u001a\u00020P2\u0006\u0010Y\u001a\u00020\u0007H\u0016J\u0011\u0010Z\u001a\u00020[H@ø\u0001\u0000¢\u0006\u0002\u0010\\J\u0011\u0010]\u001a\u00020^HAø\u0001\u0000¢\u0006\u0002\u0010\\J\u001c\u0010_\u001a\u00020P2\b\u0010`\u001a\u0004\u0018\u00010\r2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002J\u0010\u0010c\u001a\u00020P2\b\u0010`\u001a\u0004\u0018\u00010\rJ\u000e\u0010d\u001a\u00020P2\u0006\u0010e\u001a\u00020!J\b\u0010f\u001a\u00020PH\u0002J(\u0010g\u001a\u00020P2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010i\u001a\u00020\u00072\b\b\u0002\u0010j\u001a\u00020\u0007H\u0002J\u000e\u0010k\u001a\u00020P2\u0006\u0010l\u001a\u00020\fJ \u0010m\u001a\u00020P2\u0006\u0010n\u001a\u00020\f2\u0006\u0010o\u001a\u00020\f2\b\u0010p\u001a\u0004\u0018\u00010qJ\u0006\u0010r\u001a\u00020PJ\u0010\u0010s\u001a\u00020P2\u0006\u0010h\u001a\u00020\rH\u0002J,\u0010t\u001a\u00020P2\b\u0010u\u001a\u0004\u0018\u00010v2\u000e\u0010w\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010x2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016JS\u0010z\u001a\u00020P2\b\u0010u\u001a\u0004\u0018\u00010v2\u000e\u0010w\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010x2\b\u0010{\u001a\u0004\u0018\u00010S2\b\u0010e\u001a\u0004\u0018\u00010!2\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018H\u0001J*\u0010|\u001a\u00020P2\u0006\u0010}\u001a\u00020v2\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010x2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u000e\u0010\u001a\u00020P2\u0006\u0010*\u001a\u00020\u0007J\u0013\u0010\u0001\u001a\u00020P2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0007\u0010\u0001\u001a\u00020PJ\u000f\u0010\u0001\u001a\u00020P2\u0006\u0010h\u001a\u00020\rJ7\u0010\u0001\u001a\u00020P2.\u0010G\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u0016j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b`\u0018J2\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020M0\u00012\b\u0010\u0001\u001a\u00030\u00012\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\r0x2\u0007\u0010\u0001\u001a\u00020\u0007H\u0016J'\u0010\u0001\u001a\u00020P2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J9\u0010\u0001\u001a\u00020P2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020M2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR(\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR*\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u001b\u0010\u001a\u001a\u00020\u001b8TX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\tR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\tR\u000e\u0010*\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\u0004\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\tR\u0013\u00100\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b1\u0010-R \u00102\u001a\b\u0012\u0004\u0012\u00020!0\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\t\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\tR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\tR\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\tR&\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00070\u000b0\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\tR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\tRB\u0010G\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u0016j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b`\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR#\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00070\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\tR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\tR(\u0010R\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010S\u0012\u0004\u0012\u00020T0\u000b0\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "Lcom/ss/android/lark/moments/impl/publish/IMomentsPublishVM;", "Lcom/ss/android/lark/moments/impl/publish/draft/IMomentsPublishDraftDelegate;", "()V", "anonymousAtError", "Landroidx/lifecycle/MutableLiveData;", "", "getAnonymousAtError", "()Landroidx/lifecycle/MutableLiveData;", "anonymousPostLoading", "Lkotlin/Pair;", "", "", "getAnonymousPostLoading", "associateShowing", "getAssociateShowing", "associationJob", "Lkotlinx/coroutines/Job;", "categoryEnableAnonymous", "getCategoryEnableAnonymous", "categoryList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Lkotlin/collections/ArrayList;", "getCategoryList", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "draftIdentity", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "getDraftIdentity", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "setDraftIdentity", "(Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;)V", "editTextHeightChanged", "getEditTextHeightChanged", "enableClick", "getEnableClick", "forceBindCategory", "fromCategoryId", "getFromCategoryId", "()Ljava/lang/String;", "hasQuota", "getHasQuota", "hashTagContent", "getHashTagContent", "identityType", "getIdentityType", "setIdentityType", "(Landroidx/lifecycle/MutableLiveData;)V", "intent", "Landroid/content/Intent;", "lastTopic", "resetIdentityDraftFail", "getResetIdentityDraftFail", "retryUploadImage", "Lcom/ss/android/lark/moments/impl/publish/grid/GridImageData;", "getRetryUploadImage", "retryUploadVideo", "Lcom/ss/android/lark/moments/impl/publish/grid/GridVideoData;", "getRetryUploadVideo", "sendResponse", "Lcom/bytedance/lark/pb/moments/v1/CreatePostResponse;", "getSendResponse", "showAssociateData", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociateData;", "getShowAssociateData", "topics", "getTopics", "()Ljava/util/ArrayList;", "setTopics", "(Ljava/util/ArrayList;)V", "uploadImageSuccess", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "getUploadImageSuccess", "uploadVideoFailToast", "", "getUploadVideoFailToast", "videoGridInfo", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "getVideoGridInfo", "checkSelectedCategory", "clearPostDraft", "getAnonymousInfo", "noQuotaLimitation", "getDraft", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostDraft", "Lcom/ss/android/lark/moments/impl/publish/draft/MomentsDraftData;", "handleCategory", "draftCategoryId", "response", "Lcom/bytedance/lark/pb/moments/v1/ListCategoriesResponse;", "handleDraftCategory", "handleIdentityDraft", "identity", "hideAssociateList", "listAssociationByUserInput", ChatTypeStateKeeper.f135670e, "needShowDialog", "hide", "onEditTextHeightChanged", "height", "onSelectionChanged", "selStart", "selEnd", "text", "Landroid/text/Editable;", "refreshAnonymousEnable", "refreshAssociateData", "saveDraft", "postRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "imageList", "", "Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "savePostDraft", "media", "sendPost", "richText", "images", "setForceBindCategory", "setIntent", "setNicknameIdentityType", "showAssociateList", "updateTopics", "uploadImage", "Lio/reactivex/Observable;", "context", "Landroid/content/Context;", "photos", "keepOrigin", "uploadVideo", "activity", "Landroid/app/Activity;", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "videoInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "coverPath", "image", "frameInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "AssociateData", "AssociationItem", "Companion", "IdentityType", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsPublishViewModel extends BaseViewModel {
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ MomentsPublishDraftDelegate $$delegate_0 = new MomentsPublishDraftDelegate();
    private final C1177w<Boolean> anonymousAtError;
    private final C1177w<Pair<Integer, String>> anonymousPostLoading = new C1177w<>();
    private final C1177w<Boolean> associateShowing;
    private Job associationJob;
    private final C1177w<Boolean> categoryEnableAnonymous;
    private final C1177w<ArrayList<CategoryTag>> categoryList = new C1177w<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47937d.INSTANCE);
    private IdentityType draftIdentity;
    private final C1177w<Integer> editTextHeightChanged;
    private final C1177w<Boolean> enableClick = new C1177w<>();
    private boolean forceBindCategory;
    private final C1177w<Boolean> hasQuota = new C1177w<>();
    private C1177w<IdentityType> identityType;
    private Intent intent;
    private String lastTopic;
    private final C1177w<Boolean> resetIdentityDraftFail;
    private final C1177w<GridImageData> retryUploadImage;
    private final C1177w<GridVideoData> retryUploadVideo;
    private final C1177w<Pair<CreatePostResponse, Boolean>> sendResponse = new C1177w<>();
    private final C1177w<AssociateData> showAssociateData;
    private ArrayList<Pair<Integer, Integer>> topics;
    private final C1177w<Pair<IPhotoDependency.Image, Boolean>> uploadImageSuccess;
    private final C1177w<Unit> uploadVideoFailToast;
    private final C1177w<Pair<VideoGridInfo, MediaState>> videoGridInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "", "(Ljava/lang/String;I)V", "NORMAL", "NICKNAME", "ANONYMOUS", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum IdentityType {
        NORMAL,
        NICKNAME,
        ANONYMOUS
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem;", "", "()V", "InputItem", "MatchItem", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem$InputItem;", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem$MatchItem;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$b */
    public static abstract class AssociationItem {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem$InputItem;", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem;", "content", "", "showState", "", "(Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getShowState", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$b$a */
        public static final class InputItem extends AssociationItem {

            /* renamed from: a */
            private final String f120684a;

            /* renamed from: b */
            private final boolean f120685b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InputItem)) {
                    return false;
                }
                InputItem aVar = (InputItem) obj;
                return Intrinsics.areEqual(this.f120684a, aVar.f120684a) && this.f120685b == aVar.f120685b;
            }

            public int hashCode() {
                String str = this.f120684a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.f120685b;
                if (z) {
                    z = true;
                }
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                return hashCode + i;
            }

            public String toString() {
                return "InputItem(content=" + this.f120684a + ", showState=" + this.f120685b + ")";
            }

            /* renamed from: a */
            public final String mo167885a() {
                return this.f120684a;
            }

            /* renamed from: b */
            public final boolean mo167886b() {
                return this.f120685b;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public InputItem(String str, boolean z) {
                super(null);
                Intrinsics.checkParameterIsNotNull(str, "content");
                this.f120684a = str;
                this.f120685b = z;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem$MatchItem;", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem;", "content", "", "participantCount", "", "(Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getParticipantCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$b$b */
        public static final class MatchItem extends AssociationItem {

            /* renamed from: a */
            private final String f120686a;

            /* renamed from: b */
            private final int f120687b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MatchItem)) {
                    return false;
                }
                MatchItem bVar = (MatchItem) obj;
                return Intrinsics.areEqual(this.f120686a, bVar.f120686a) && this.f120687b == bVar.f120687b;
            }

            public int hashCode() {
                String str = this.f120686a;
                return ((str != null ? str.hashCode() : 0) * 31) + this.f120687b;
            }

            public String toString() {
                return "MatchItem(content=" + this.f120686a + ", participantCount=" + this.f120687b + ")";
            }

            /* renamed from: a */
            public final String mo167890a() {
                return this.f120686a;
            }

            /* renamed from: b */
            public final int mo167891b() {
                return this.f120687b;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public MatchItem(String str, int i) {
                super(null);
                Intrinsics.checkParameterIsNotNull(str, "content");
                this.f120686a = str;
                this.f120687b = i;
            }
        }

        private AssociationItem() {
        }

        public /* synthetic */ AssociationItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void clearPostDraft() {
        this.$$delegate_0.mo168032a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public Object getPostDraft(Continuation<? super MomentsDraftData> cVar) {
        return this.$$delegate_0.mo168031a(cVar);
    }

    public void savePostDraft(RichText richText, List<ImageData> list, VideoGridInfo videoGridInfo2, IdentityType identityType2, ArrayList<CategoryTag> arrayList) {
        this.$$delegate_0.mo168033a(richText, list, videoGridInfo2, identityType2, arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociateData;", "", "list", "", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$AssociationItem;", "showFrequently", "", "(Ljava/util/List;Z)V", "getList", "()Ljava/util/List;", "getShowFrequently", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$a */
    public static final class AssociateData {

        /* renamed from: a */
        private final List<AssociationItem> f120682a;

        /* renamed from: b */
        private final boolean f120683b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssociateData)) {
                return false;
            }
            AssociateData aVar = (AssociateData) obj;
            return Intrinsics.areEqual(this.f120682a, aVar.f120682a) && this.f120683b == aVar.f120683b;
        }

        public int hashCode() {
            List<AssociationItem> list = this.f120682a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f120683b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            return "AssociateData(list=" + this.f120682a + ", showFrequently=" + this.f120683b + ")";
        }

        /* renamed from: a */
        public final List<AssociationItem> mo167880a() {
            return this.f120682a;
        }

        /* renamed from: b */
        public final boolean mo167881b() {
            return this.f120683b;
        }

        public AssociateData(List<AssociationItem> list, boolean z) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f120682a = list;
            this.f120683b = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AssociateData(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$Companion;", "", "()V", "LOG_TAG", "", "TAG", "imageDefaultSize", "", "mountNodePoint", "mountPoint", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Boolean> getAnonymousAtError() {
        return this.anonymousAtError;
    }

    public C1177w<Pair<Integer, String>> getAnonymousPostLoading() {
        return this.anonymousPostLoading;
    }

    public final C1177w<Boolean> getAssociateShowing() {
        return this.associateShowing;
    }

    public C1177w<Boolean> getCategoryEnableAnonymous() {
        return this.categoryEnableAnonymous;
    }

    public C1177w<ArrayList<CategoryTag>> getCategoryList() {
        return this.categoryList;
    }

    public final IdentityType getDraftIdentity() {
        return this.draftIdentity;
    }

    public final C1177w<Integer> getEditTextHeightChanged() {
        return this.editTextHeightChanged;
    }

    public C1177w<Boolean> getEnableClick() {
        return this.enableClick;
    }

    public C1177w<Boolean> getHasQuota() {
        return this.hasQuota;
    }

    public final C1177w<IdentityType> getIdentityType() {
        return this.identityType;
    }

    public final C1177w<Boolean> getResetIdentityDraftFail() {
        return this.resetIdentityDraftFail;
    }

    public final C1177w<GridImageData> getRetryUploadImage() {
        return this.retryUploadImage;
    }

    public final C1177w<GridVideoData> getRetryUploadVideo() {
        return this.retryUploadVideo;
    }

    public C1177w<Pair<CreatePostResponse, Boolean>> getSendResponse() {
        return this.sendResponse;
    }

    public final C1177w<AssociateData> getShowAssociateData() {
        return this.showAssociateData;
    }

    public final ArrayList<Pair<Integer, Integer>> getTopics() {
        return this.topics;
    }

    public final C1177w<Pair<IPhotoDependency.Image, Boolean>> getUploadImageSuccess() {
        return this.uploadImageSuccess;
    }

    public final C1177w<Unit> getUploadVideoFailToast() {
        return this.uploadVideoFailToast;
    }

    public C1177w<Pair<VideoGridInfo, MediaState>> getVideoGridInfo() {
        return this.videoGridInfo;
    }

    private final String getFromCategoryId() {
        Intent intent2 = this.intent;
        if (intent2 != null) {
            return intent2.getStringExtra("default_selected_category_id");
        }
        return null;
    }

    private final void hideAssociateList() {
        listAssociationByUserInput$default(this, null, false, true, 2, null);
    }

    public final String getHashTagContent() {
        Intent intent2 = this.intent;
        if (intent2 != null) {
            return intent2.getStringExtra("page_hash_tag_content");
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$d */
    static final class C47937d extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47937d INSTANCE = new C47937d();

        C47937d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-publish");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…Pool(\"lk-moment-publish\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$uploadVideo$2", "Lcom/ss/android/lark/moments/dependency/idependency/IMomentsDriveUploadCallback;", "onFailed", "", "onSuccess", "fileToken", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$o */
    public static final class C47951o implements IMomentsDriveUploadCallback {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishViewModel f120696a;

        /* renamed from: b */
        final /* synthetic */ String f120697b;

        /* renamed from: c */
        final /* synthetic */ IPhotoDependency.Image f120698c;

        /* renamed from: d */
        final /* synthetic */ IPhotoDependency.VideoInfo f120699d;

        /* renamed from: e */
        final /* synthetic */ IPhotoDependency.FrameInfo f120700e;

        /* renamed from: f */
        final /* synthetic */ Photo f120701f;

        @Override // com.ss.android.lark.moments.dependency.idependency.IMomentsDriveUploadCallback
        /* renamed from: a */
        public boolean mo165896a() {
            this.f120696a.getVideoGridInfo().mo5926a(TuplesKt.to(new VideoGridInfo(this.f120697b, this.f120698c, null, this.f120699d, this.f120700e, this.f120701f), MediaState.TYPE_FAIL));
            return true;
        }

        @Override // com.ss.android.lark.moments.dependency.idependency.IMomentsDriveUploadCallback
        /* renamed from: a */
        public boolean mo165897a(String str) {
            if (str == null) {
                Log.m165383e("MomentsPublishVM", "upload video fail fileToken null");
                return mo165896a();
            }
            this.f120696a.getVideoGridInfo().mo5926a(TuplesKt.to(new VideoGridInfo(this.f120697b, this.f120698c, str, this.f120699d, this.f120700e, this.f120701f), MediaState.TYPE_SUCCESS));
            return true;
        }

        C47951o(MomentsPublishViewModel momentsPublishViewModel, String str, IPhotoDependency.Image image, IPhotoDependency.VideoInfo videoInfo, IPhotoDependency.FrameInfo frameInfo, Photo photo) {
            this.f120696a = momentsPublishViewModel;
            this.f120697b = str;
            this.f120698c = image;
            this.f120699d = videoInfo;
            this.f120700e = frameInfo;
            this.f120701f = photo;
        }
    }

    public final boolean checkSelectedCategory() {
        ArrayList arrayList;
        boolean z;
        ArrayList<CategoryTag> b = getCategoryList().mo5927b();
        if (b != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : b) {
                if (t.getSelected()) {
                    arrayList2.add(t);
                }
            }
            ArrayList<CategoryTag> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (CategoryTag categoryTag : arrayList3) {
                arrayList4.add(categoryTag.getId());
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        ArrayList arrayList5 = arrayList;
        if (arrayList5 == null || arrayList5.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final void refreshAnonymousEnable() {
        AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
        if (b != null && Intrinsics.areEqual((Object) b.enabled, (Object) true) && b.scope == AnonymityPolicy.Scope.CATEGORY) {
            ArrayList<CategoryTag> b2 = getCategoryList().mo5927b();
            if (b2 != null) {
                for (T t : b2) {
                    if (t.getSelected()) {
                        getCategoryEnableAnonymous().mo5926a(t.getCategory().can_anonymous);
                        return;
                    }
                }
            }
            getCategoryEnableAnonymous().mo5926a((Boolean) false);
        }
    }

    public final void setNicknameIdentityType() {
        boolean z;
        boolean z2;
        AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
        if (b != null) {
            Boolean bool = b.enabled;
            Intrinsics.checkExpressionValueIsNotNull(bool, "policy.enabled");
            boolean z3 = false;
            if (!bool.booleanValue() || !Intrinsics.areEqual((Object) getHasQuota().mo5927b(), (Object) true)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || b.scope != AnonymityPolicy.Scope.GLOBAL) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && b.scope == AnonymityPolicy.Scope.CATEGORY && Intrinsics.areEqual((Object) getCategoryEnableAnonymous().mo5927b(), (Object) true)) {
                z3 = true;
            }
            if ((z2 || z3) && b.type == AnonymityPolicy.AnonymousType.NICKNAME) {
                this.identityType.mo5929b(IdentityType.NICKNAME);
            }
        }
    }

    public MomentsPublishViewModel() {
        C1177w<IdentityType> wVar = new C1177w<>();
        wVar.mo5929b(IdentityType.NORMAL);
        this.identityType = wVar;
        this.anonymousAtError = new C1177w<>();
        this.resetIdentityDraftFail = new C1177w<>();
        this.videoGridInfo = new C1177w<>();
        this.categoryEnableAnonymous = new C1177w<>();
        this.draftIdentity = IdentityType.NORMAL;
        this.associateShowing = new C1177w<>();
        this.showAssociateData = new C1177w<>();
        this.editTextHeightChanged = new C1177w<>();
        this.retryUploadImage = new C1177w<>();
        this.retryUploadVideo = new C1177w<>();
        this.uploadVideoFailToast = new C1177w<>();
        this.topics = new ArrayList<>();
        this.uploadImageSuccess = new C1177w<>();
    }

    public final void setForceBindCategory(boolean z) {
        this.forceBindCategory = z;
    }

    public void setIntent(Intent intent2) {
        this.intent = intent2;
    }

    public final void setDraftIdentity(IdentityType identityType2) {
        Intrinsics.checkParameterIsNotNull(identityType2, "<set-?>");
        this.draftIdentity = identityType2;
    }

    public final void setIdentityType(C1177w<IdentityType> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.identityType = wVar;
    }

    public final void setTopics(ArrayList<Pair<Integer, Integer>> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.topics = arrayList;
    }

    private final void refreshAssociateData(String str) {
        listAssociationByUserInput$default(this, str, false, false, 4, null);
    }

    public final void showAssociateList(String str) {
        Intrinsics.checkParameterIsNotNull(str, ChatTypeStateKeeper.f135670e);
        listAssociationByUserInput$default(this, str, true, false, 4, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "photoPath", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$k */
    public static final class C47945k<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Context f120688a;

        /* renamed from: b */
        final /* synthetic */ boolean f120689b;

        C47945k(Context context, boolean z) {
            this.f120688a = context;
            this.f120689b = z;
        }

        /* renamed from: a */
        public final Observable<EncryptImageData> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "photoPath");
            return IImageDependency.C47179a.m186950a(MomentsDependencyHolder.f118998b.mo165899a().imageDependency(), this.f120688a, str, this.f120689b, true, null, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/image/entity/Image;", "kotlin.jvm.PlatformType", "encryptImageData", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$l */
    public static final class C47946l<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a */
        public static final C47946l f120690a = new C47946l();

        C47946l() {
        }

        /* renamed from: a */
        public final Observable<Image> apply(final EncryptImageData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "encryptImageData");
            return Observable.create(new ObservableOnSubscribe<T>() {
                /* class com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel.C47946l.C479471 */

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter<Image> observableEmitter) {
                    int i;
                    Intrinsics.checkParameterIsNotNull(observableEmitter, "e");
                    int[] b = C57820d.m224436b(aVar.mo165892a());
                    Image image = new Image();
                    int i2 = 80;
                    if (b[0] <= 0) {
                        i = 80;
                    } else {
                        i = b[0];
                    }
                    image.setWidth(i);
                    if (b[1] > 0) {
                        i2 = b[1];
                    }
                    image.setHeight(i2);
                    image.setToken(aVar.mo165893b());
                    image.setUrls(CollectionsKt.listOf(aVar.mo165892a()));
                    observableEmitter.onNext(image);
                    observableEmitter.onComplete();
                }
            });
        }
    }

    public Object getDraft(Continuation<? super TransationData> cVar) {
        return C69388e.m266829a(getDispatcher(), new C47939f(this, null), cVar);
    }

    public final void handleDraftCategory(String str) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47940g(this, str, null), 2, null);
    }

    public final void handleIdentityDraft(IdentityType identityType2) {
        Intrinsics.checkParameterIsNotNull(identityType2, "identity");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47941h(this, identityType2, null), 2, null);
    }

    public final void onEditTextHeightChanged(int i) {
        Integer b = this.editTextHeightChanged.mo5927b();
        if (b == null || b.intValue() != i) {
            this.editTextHeightChanged.mo5926a(Integer.valueOf(i));
        }
    }

    public final void updateTopics(ArrayList<Pair<Integer, Integer>> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "topics");
        this.topics.clear();
        this.topics.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$listAssociationByUserInput$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {0, 0, 1, 1}, mo239175l = {428, 430}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "showDialog", "$this$launch", "showDialog"}, mo239178s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$i */
    public static final class C47942i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $hide;
        final /* synthetic */ boolean $needShowDialog;
        final /* synthetic */ String $topic;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47942i(MomentsPublishViewModel momentsPublishViewModel, boolean z, String str, boolean z2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
            this.$hide = z;
            this.$topic = str;
            this.$needShowDialog = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47942i iVar = new C47942i(this.this$0, this.$hide, this.$topic, this.$needShowDialog, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47942i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/moments/ListHashtagsByUserInputResponse;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$listAssociationByUserInput$1$response$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {0}, mo239175l = {431}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$i$a */
        public static final class C47943a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListHashtagsByUserInputResponse>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C47942i this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47943a(C47942i iVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C47943a aVar = new C47943a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super ListHashtagsByUserInputResponse> cVar) {
                return ((C47943a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                    String str = this.this$0.$topic;
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = aVar.mo167200c(str, this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x021f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 627
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel.C47942i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$getDraft$2", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {0}, mo239175l = {274}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$f */
    public static final class C47939f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TransationData>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47939f(MomentsPublishViewModel momentsPublishViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47939f fVar = new C47939f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super TransationData> cVar) {
            return ((C47939f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPublishViewModel momentsPublishViewModel = this.this$0;
                this.L$0 = ahVar;
                this.label = 1;
                obj = momentsPublishViewModel.getPostDraft(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((MomentsDraftData) obj).mo168021a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "it", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$m */
    public static final class C47948m<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C47948m f120692a = new C47948m();

        C47948m() {
        }

        /* renamed from: a */
        public final IPhotoDependency.Image apply(Image image) {
            Intrinsics.checkParameterIsNotNull(image, "it");
            List<String> urls = image.getUrls();
            Intrinsics.checkExpressionValueIsNotNull(urls, "it.urls");
            int width = image.getWidth();
            int height = image.getHeight();
            String token = image.getToken();
            Intrinsics.checkExpressionValueIsNotNull(token, "it.token");
            return new IPhotoDependency.Image(urls, width, height, token);
        }
    }

    public void getAnonymousInfo(boolean z) {
        if (z) {
            getHasQuota().mo5926a((Boolean) true);
        } else {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47938e(this, null), 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$getAnonymousInfo$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {0}, mo239175l = {355}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$e */
    public static final class C47938e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47938e(MomentsPublishViewModel momentsPublishViewModel, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47938e eVar = new C47938e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47938e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = MomentsPassThroughService.m188487a(aVar, null, this, 1, null);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (!booleanValue && this.this$0.getDraftIdentity() != IdentityType.NORMAL) {
                this.this$0.getResetIdentityDraftFail().mo5926a(C69089a.m265837a(true));
            }
            this.this$0.getHasQuota().mo5926a(C69089a.m265837a(booleanValue));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$handleDraftCategory$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {0, 1, 1}, mo239175l = {313, 316}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "response"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$g */
    static final class C47940g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $draftCategoryId;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47940g(MomentsPublishViewModel momentsPublishViewModel, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
            this.$draftCategoryId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47940g gVar = new C47940g(this.this$0, this.$draftCategoryId, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47940g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ListCategoriesResponse listCategoriesResponse;
            List<String> list;
            CoroutineScope ahVar;
            Integer num;
            List<String> list2;
            Object a = C69086a.m265828a();
            int i = this.label;
            Integer num2 = null;
            if (i == 0) {
                C69097g.m265891a(obj);
                ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167237a(false, (Continuation<? super ListCategoriesResponse>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2) {
                listCategoriesResponse = (ListCategoriesResponse) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                ListCategoriesResponse listCategoriesResponse2 = (ListCategoriesResponse) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("remote all category id count=");
                if (!(listCategoriesResponse == null || (list = listCategoriesResponse.category_ids) == null)) {
                    num2 = C69089a.m265839a(list.size());
                }
                sb.append(num2);
                Log.m165389i("MomentsPublishVM", sb.toString());
                this.this$0.handleCategory(this.$draftCategoryId, listCategoriesResponse2);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ListCategoriesResponse listCategoriesResponse3 = (ListCategoriesResponse) obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("local all category id count=");
            if (listCategoriesResponse3 == null || (list2 = listCategoriesResponse3.category_ids) == null) {
                num = null;
            } else {
                num = C69089a.m265839a(list2.size());
            }
            sb2.append(num);
            Log.m165389i("MomentsPublishVM", sb2.toString());
            this.this$0.handleCategory(this.$draftCategoryId, listCategoriesResponse3);
            MomentsSDKService bVar2 = MomentsSDKService.f120147a;
            this.L$0 = ahVar;
            this.L$1 = listCategoriesResponse3;
            this.label = 2;
            Object a2 = bVar2.mo167237a(true, (Continuation<? super ListCategoriesResponse>) this);
            if (a2 == a) {
                return a;
            }
            listCategoriesResponse = listCategoriesResponse3;
            obj = a2;
            ListCategoriesResponse listCategoriesResponse22 = (ListCategoriesResponse) obj;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("remote all category id count=");
            num2 = C69089a.m265839a(list.size());
            sb3.append(num2);
            Log.m165389i("MomentsPublishVM", sb3.toString());
            this.this$0.handleCategory(this.$draftCategoryId, listCategoriesResponse22);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$handleIdentityDraft$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$h */
    static final class C47941h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IdentityType $identity;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47941h(MomentsPublishViewModel momentsPublishViewModel, IdentityType identityType, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
            this.$identity = identityType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47941h hVar = new C47941h(this.this$0, this.$identity, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47941h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                if (this.$identity == IdentityType.NORMAL) {
                    return Unit.INSTANCE;
                }
                AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
                if (b != null) {
                    MomentUser d = UserGlobalConfigAndSettingsManager.f120180a.mo167303d();
                    boolean areEqual = Intrinsics.areEqual(b.enabled, C69089a.m265837a(true));
                    AnonymityPolicy.AnonymousType anonymousType = b.type;
                    if (areEqual) {
                        boolean z2 = false;
                        if (!Intrinsics.areEqual(this.this$0.getHasQuota().mo5927b(), C69089a.m265837a(false))) {
                            if (anonymousType == AnonymityPolicy.AnonymousType.NICKNAME && this.$identity == IdentityType.NICKNAME && d != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (anonymousType == AnonymityPolicy.AnonymousType.ANONYMOUS && this.$identity == IdentityType.ANONYMOUS) {
                                z2 = true;
                            }
                            if (z || z2) {
                                this.this$0.setDraftIdentity(this.$identity);
                                this.this$0.getIdentityType().mo5926a(this.$identity);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    this.this$0.getResetIdentityDraftFail().mo5926a(C69089a.m265837a(true));
                    return Unit.INSTANCE;
                }
                this.this$0.getResetIdentityDraftFail().mo5926a(C69089a.m265837a(true));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$uploadVideo$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$n */
    public static final class C47949n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Photo $photo;
        final /* synthetic */ IPhotoDependency.VideoInfo $videoInfo;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47949n(MomentsPublishViewModel momentsPublishViewModel, IPhotoDependency.VideoInfo videoInfo, Activity activity, Photo photo, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
            this.$videoInfo = videoInfo;
            this.$activity = activity;
            this.$photo = photo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47949n nVar = new C47949n(this.this$0, this.$videoInfo, this.$activity, this.$photo, cVar);
            nVar.p$ = (CoroutineScope) obj;
            return nVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47949n) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                Bitmap d = ao.m224315d(this.$videoInfo.getPath());
                if (d != null) {
                    Intrinsics.checkExpressionValueIsNotNull(d, "VideoTools.getVideoThumb…turn@launch\n            }");
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = (T) (C57881t.m224630d(this.$activity) + Math.abs(this.$videoInfo.getPath().hashCode()) + System.currentTimeMillis() + ".jpg");
                    T t = (T) C26311p.m95265a(d, objectRef.element);
                    Intrinsics.checkExpressionValueIsNotNull(t, "FileUtils.saveBitmapToFile(bitmap, coverPath)");
                    objectRef.element = t;
                    final IPhotoDependency.FrameInfo frameInfo = new IPhotoDependency.FrameInfo(objectRef.element, d.getWidth(), d.getHeight());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objectRef.element);
                    this.this$0.getVideoGridInfo().mo5926a(TuplesKt.to(new VideoGridInfo(objectRef.element, null, null, this.$videoInfo, frameInfo, this.$photo), MediaState.TYPE_UPLOADING));
                    this.this$0.uploadImage(this.$activity, arrayList, true).observeOn(AndroidSchedulers.mainThread()).subscribe(new AbstractC57864b<IPhotoDependency.Image>(this) {
                        /* class com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel.C47949n.C479501 */

                        /* renamed from: a */
                        final /* synthetic */ C47949n f120693a;

                        @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b, io.reactivex.AbstractC69009q
                        public void onComplete() {
                        }

                        @Override // io.reactivex.AbstractC69009q
                        public void onSubscribe(Disposable disposable) {
                            Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
                        }

                        /* renamed from: a */
                        public void onNext(IPhotoDependency.Image image) {
                            Intrinsics.checkParameterIsNotNull(image, "image");
                            this.f120693a.this$0.uploadVideo(this.f120693a.$videoInfo, objectRef.element, image, frameInfo, this.f120693a.$photo);
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
                        /* renamed from: a */
                        public void mo147247a(Throwable th) {
                            String str;
                            StringBuilder sb = new StringBuilder();
                            sb.append("upload video fail ");
                            if (th != null) {
                                str = th.getMessage();
                            } else {
                                str = null;
                            }
                            sb.append(str);
                            Log.m165383e("MomentsPublishVM", sb.toString());
                            this.f120693a.this$0.getVideoGridInfo().mo5926a(TuplesKt.to(new VideoGridInfo(objectRef.element, null, null, this.f120693a.$videoInfo, frameInfo, this.f120693a.$photo), MediaState.TYPE_FAIL));
                        }

                        {
                            this.f120693a = r1;
                        }
                    });
                    return Unit.INSTANCE;
                }
                Log.m165383e("MomentsPublishVM", "uploadVideo create first frame fail");
                this.this$0.getUploadVideoFailToast().mo5926a(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$sendPost$1", mo239173f = "MomentsPublishViewModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {156}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "pbRichText", "imageInfoList", "isAnonymous", "imageList", "coverImage", "media", "categoryIds"}, mo239178s = {"L$0", "L$1", "L$2", "Z$0", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel$j */
    static final class C47944j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $images;
        final /* synthetic */ RichText $richText;
        final /* synthetic */ VideoGridInfo $videoGridInfo;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47944j(MomentsPublishViewModel momentsPublishViewModel, RichText richText, List list, VideoGridInfo videoGridInfo, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsPublishViewModel;
            this.$richText = richText;
            this.$images = list;
            this.$videoGridInfo = videoGridInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47944j jVar = new C47944j(this.this$0, this.$richText, this.$images, this.$videoGridInfo, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47944j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object obj2;
            ArrayList arrayList;
            MediaInfo mediaInfo;
            ArrayList arrayList2;
            boolean z2;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                com.bytedance.lark.pb.basic.v1.RichText a2 = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144694a(this.$richText);
                List list = this.$images;
                if (list != null) {
                    List<ImageData> list2 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (ImageData imageData : list2) {
                        arrayList3.add(new ImageInfo.C18408a().mo63642b(C69089a.m265839a(imageData.getHeight())).mo63639a(C69089a.m265839a(imageData.getWidth())).mo63640a(imageData.getToken()).mo63643b(imageData.getLocalPath()).build());
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                boolean z3 = false;
                if (this.this$0.getIdentityType().mo5927b() == IdentityType.NICKNAME || this.this$0.getIdentityType().mo5927b() == IdentityType.ANONYMOUS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List<String> list3 = a2.at_ids;
                    if (list3 == null || list3.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        this.this$0.getAnonymousAtError().mo5926a(C69089a.m265837a(true));
                        return Unit.INSTANCE;
                    }
                    this.this$0.getEnableClick().mo5926a(C69089a.m265837a(false));
                    this.this$0.getAnonymousPostLoading().mo5926a(TuplesKt.to(C69089a.m265839a(0), null));
                }
                ArrayList arrayList4 = arrayList;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    z3 = true;
                }
                ArrayList arrayList5 = z3 ? null : arrayList;
                VideoGridInfo videoGridInfo = this.$videoGridInfo;
                IPhotoDependency.Image cover = videoGridInfo != null ? videoGridInfo.getCover() : null;
                VideoGridInfo videoGridInfo2 = this.$videoGridInfo;
                if (videoGridInfo2 == null || cover == null) {
                    mediaInfo = null;
                } else {
                    IPhotoDependency.FrameInfo frameInfo = videoGridInfo2.getFrameInfo();
                    IPhotoDependency.VideoInfo videoInfo = this.$videoGridInfo.getVideoInfo();
                    mediaInfo = new MediaInfo.C18456a().mo63763a(new ImageInfo.C18408a().mo63642b(C69089a.m265839a(cover.getHeight())).mo63639a(C69089a.m265839a(cover.getWidth())).mo63640a(cover.getToken()).mo63643b(this.$videoGridInfo.getCoverPath()).build()).mo63768b(C69089a.m265839a(frameInfo.getWidth())).mo63770c(C69089a.m265839a(frameInfo.getHeight())).mo63764a(C69089a.m265839a((int) (videoInfo.getDuration() / ((long) 1000)))).mo63765a(C69089a.m265840a(videoInfo.getSize())).mo63766a(this.$videoGridInfo.getFileToken()).mo63769b(videoInfo.getPath()).build();
                }
                ArrayList<CategoryTag> b = this.this$0.getCategoryList().mo5927b();
                if (b != null) {
                    ArrayList arrayList6 = new ArrayList();
                    for (T t : b) {
                        if (C69089a.m265837a(t.getSelected()).booleanValue()) {
                            arrayList6.add(t);
                        }
                    }
                    ArrayList<CategoryTag> arrayList7 = arrayList6;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                    for (CategoryTag categoryTag : arrayList7) {
                        arrayList8.add(categoryTag.getId());
                    }
                    arrayList2 = arrayList8;
                } else {
                    arrayList2 = null;
                }
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.L$2 = arrayList;
                this.Z$0 = z;
                this.L$3 = arrayList5;
                this.L$4 = cover;
                this.L$5 = mediaInfo;
                this.L$6 = arrayList2;
                this.label = 1;
                obj2 = bVar.mo167221a(a2, arrayList5, mediaInfo, arrayList2, z, this);
                if (obj2 == a) {
                    return a;
                }
            } else if (i == 1) {
                List list4 = (List) this.L$6;
                MediaInfo mediaInfo2 = (MediaInfo) this.L$5;
                IPhotoDependency.Image image = (IPhotoDependency.Image) this.L$4;
                List list5 = (List) this.L$3;
                boolean z4 = this.Z$0;
                List list6 = (List) this.L$2;
                com.bytedance.lark.pb.basic.v1.RichText richText = (com.bytedance.lark.pb.basic.v1.RichText) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                z = z4;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkResponse cVar = (SdkResponse) obj2;
            this.this$0.clearPostDraft();
            Log.m165389i("MomentsPublishVM", "clear publish draft after send");
            if (z) {
                if (cVar.mo167291a() != null) {
                    this.this$0.getAnonymousPostLoading().mo5926a(TuplesKt.to(C69089a.m265839a(1), null));
                } else {
                    ErrorResult b2 = cVar.mo167292b();
                    this.this$0.getAnonymousPostLoading().mo5926a(TuplesKt.to(C69089a.m265839a(2), b2 != null ? b2.getDisplayMsg() : null));
                }
                this.this$0.getEnableClick().mo5926a(C69089a.m265837a(true));
            }
            if (cVar.mo167291a() != null) {
                this.this$0.getSendResponse().mo5926a(TuplesKt.to(cVar.mo167291a(), C69089a.m265837a(z)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleCategory(java.lang.String r10, com.bytedance.lark.pb.moments.v1.ListCategoriesResponse r11) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel.handleCategory(java.lang.String, com.bytedance.lark.pb.moments.v1.ListCategoriesResponse):void");
    }

    public void saveDraft(RichText richText, List<ImageData> list, VideoGridInfo videoGridInfo2) {
        savePostDraft(richText, list, videoGridInfo2, this.identityType.mo5927b(), getCategoryList().mo5927b());
    }

    private final void listAssociationByUserInput(String str, boolean z, boolean z2) {
        if (!Intrinsics.areEqual(this.lastTopic, str) || z || z2) {
            this.lastTopic = str;
            Job btVar = this.associationJob;
            if (btVar != null) {
                Job.C69372a.m266400a(btVar, null, 1, null);
            }
            this.associationJob = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C47942i(this, z2, str, z, null), 3, null);
        }
    }

    public void sendPost(RichText richText, List<ImageData> list, VideoGridInfo videoGridInfo2) {
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47944j(this, richText, list, videoGridInfo2, null), 2, null);
    }

    public Observable<IPhotoDependency.Image> uploadImage(Context context, List<String> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Observable<IPhotoDependency.Image> map = Observable.fromIterable(list).flatMap(new C47945k(context, z)).flatMap(C47946l.f120690a).subscribeOn(LarkRxSchedulers.io()).map(C47948m.f120692a);
        Intrinsics.checkExpressionValueIsNotNull(map, "Observable.fromIterable(…h, it.height, it.token) }");
        return map;
    }

    public void uploadVideo(Activity activity, Photo photo, IPhotoDependency.VideoInfo videoInfo) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(photo, "photo");
        Intrinsics.checkParameterIsNotNull(videoInfo, "videoInfo");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47949n(this, videoInfo, activity, photo, null), 2, null);
    }

    public final void onSelectionChanged(int i, int i2, Editable editable) {
        if (editable == null) {
            return;
        }
        if (i2 != i) {
            hideAssociateList();
            return;
        }
        int i3 = 0;
        for (T t : this.topics) {
            i3 = Math.max(i3, ((Number) t.getFirst()).intValue());
            if (((Number) t.getFirst()).intValue() < i && ((Number) t.getSecond()).intValue() > i2 - 1) {
                if (((Number) t.getFirst()).intValue() + 1 < 0 || ((Number) t.getSecond()).intValue() >= editable.length()) {
                    Log.m165383e("MomentsPublishVM", "onSelectionChanged failed length=" + editable.length() + " range=" + ((Object) t));
                    return;
                }
                refreshAssociateData(editable.subSequence(((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue()).toString());
                return;
            }
        }
        int i4 = i - 1;
        if (i4 < 0 || i4 >= editable.length() || editable.charAt(i4) != '#' || (this.topics.size() >= 100 && i > i3)) {
            hideAssociateList();
        } else {
            refreshAssociateData("");
        }
    }

    public final void uploadVideo(IPhotoDependency.VideoInfo videoInfo, String str, IPhotoDependency.Image image, IPhotoDependency.FrameInfo frameInfo, Photo photo) {
        IDriveDependency driveDependency = MomentsDependencyHolder.f118998b.mo165899a().driveDependency();
        String path = videoInfo.getPath();
        String name = new File(videoInfo.getPath()).getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "File(videoInfo.path).name");
        driveDependency.mo144708a(path, name, "", "moments", new C47951o(this, str, image, videoInfo, frameInfo, photo));
    }

    static /* synthetic */ void listAssociationByUserInput$default(MomentsPublishViewModel momentsPublishViewModel, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        momentsPublishViewModel.listAssociationByUserInput(str, z, z2);
    }
}
