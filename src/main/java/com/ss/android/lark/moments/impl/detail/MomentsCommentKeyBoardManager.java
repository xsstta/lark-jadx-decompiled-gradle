package com.ss.android.lark.moments.impl.detail;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.core.view.C0922v;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.bytedance.lark.pb.moments.v1.ImageInfo;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.moments.impl.common.utils.MomentsPreviewHelper;
import com.ss.android.lark.moments.impl.common.widget.ScrollerConflictPtrFrameLayout;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.IMomentsGetIdentityTypeApi;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.face.FaceDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.identity.MomentsIdentityPluginManager;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.MomentsPhotoKBPlugin;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener;
import com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\u0013\u001e\u0018\u0000 m2\u00020\u0001:\u0001mB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010/\u001a\u0002002\u0006\u0010$\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0018H\u0002J&\u00102\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u000104H\u0002J\u000e\u00107\u001a\u0002002\u0006\u00108\u001a\u00020\u0018J\u0006\u00109\u001a\u000200J\u0006\u0010:\u001a\u000200J\u0006\u0010;\u001a\u000200J\b\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020=H\u0002J\b\u0010?\u001a\u00020=H\u0002J\b\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020*H\u0002J\u0006\u0010D\u001a\u000200J\u0006\u0010E\u001a\u000200J\u000e\u0010F\u001a\u0002002\u0006\u0010G\u001a\u00020HJ\u0016\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020K2\u0006\u0010'\u001a\u00020(J\u0006\u0010L\u001a\u00020\u0018J \u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020O2\b\u0010Q\u001a\u0004\u0018\u00010RJ\u0006\u0010S\u001a\u000200J\u0006\u0010T\u001a\u000200J\u0006\u0010U\u001a\u000200J\u0010\u0010V\u001a\u0002002\u0006\u0010W\u001a\u00020OH\u0002J\u000e\u0010X\u001a\u0002002\u0006\u0010Y\u001a\u00020\u0018J\b\u0010Z\u001a\u000200H\u0002J\b\u0010[\u001a\u000200H\u0002J\u0006\u0010\\\u001a\u000200J\u0006\u0010]\u001a\u000200J\b\u0010^\u001a\u000200H\u0002J\u001e\u0010_\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010a\u001a\u00020bJ\u0006\u0010c\u001a\u000200J\u0006\u0010d\u001a\u000200J\u0006\u0010e\u001a\u000200J\u0016\u0010f\u001a\u0002002\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00070hH\u0002J\u001c\u0010i\u001a\u0002002\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\u00180kH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006n"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager;", "", "activity", "Landroid/app/Activity;", "vm", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;", "postId", "", "(Landroid/app/Activity;Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;Ljava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "commentId", "draftCallback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "getDraftCallback", "()Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "draftCallback$delegate", "Lkotlin/Lazy;", "iPhotoDependency", "com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$iPhotoDependency$1", "Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$iPhotoDependency$1;", "identityManager", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentityPluginManager;", "isReplyPost", "", "keyBoardStopped", "mKeyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "mKeyboardShow", "onPhotoUploadListener", "com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$onPhotoUploadListener$1", "Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$onPhotoUploadListener$1;", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "photoKBPlugin", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/MomentsPhotoKBPlugin;", "photoPath", "getPostId", "()Ljava/lang/String;", "ptrLayout", "Lcom/ss/android/lark/moments/impl/common/widget/ScrollerConflictPtrFrameLayout;", "sendBt", "Landroid/view/View;", "textInputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin;", "getVm", "()Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;", "addImage", "", "isKeepOriginPhoto", "appendText", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "postText", "categoryChanged", "enable", "deleteImage", "destroy", "forceDisableAnonymous", "getAtPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getFacePlugin", "getPhotoPlugin", "getTextInputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "goPreviewPhotoPage", "v", "hideKeyboardToolMenu", "hidePanelAndSysKeyboard", "identityChanged", ShareHitPoint.f121869d, "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "initKeyBoard", "container", "Landroid/widget/FrameLayout;", "isSysKeyboardShow", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onPostSuccess", "onReplyPost", "recoverKeyboardToolMenu", "refreshContentBtmMargin", "height", "refreshQuota", "hasQuota", "reportTabReplyHitPoint", "reportTabReplySendHitPoint", "requestLayout", "resetKeyboardStoppedState", "setDisableComment", "setReplyCommentMode", "userName", "digest", "", "setReplyPostMode", "showKeyboard", "stop", "updateFailState", "paths", "", "updateSuccessState", "pair", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.b */
public final class MomentsCommentKeyBoardManager {

    /* renamed from: j */
    public static final Companion f119560j = new Companion(null);

    /* renamed from: a */
    public KeyBoard f119561a;

    /* renamed from: b */
    public TextInputSupportPlugin f119562b;

    /* renamed from: c */
    public MomentsPhotoKBPlugin f119563c;

    /* renamed from: d */
    public boolean f119564d = true;

    /* renamed from: e */
    public String f119565e = "";

    /* renamed from: f */
    public PhotoItem f119566f;

    /* renamed from: g */
    public String f119567g = "";

    /* renamed from: h */
    public boolean f119568h;

    /* renamed from: i */
    public View f119569i;

    /* renamed from: k */
    private ScrollerConflictPtrFrameLayout f119570k;

    /* renamed from: l */
    private MomentsIdentityPluginManager f119571l;

    /* renamed from: m */
    private boolean f119572m;

    /* renamed from: n */
    private final Lazy f119573n = LazyKt.lazy(new C47367c(this));

    /* renamed from: o */
    private final C47385r f119574o = new C47385r(this);

    /* renamed from: p */
    private final C47380m f119575p = new C47380m(this);

    /* renamed from: q */
    private final Activity f119576q;

    /* renamed from: r */
    private final MomentsDetailViewModel f119577r;

    /* renamed from: s */
    private final String f119578s;

    /* renamed from: u */
    private final IKeyBoardDependency m187795u() {
        return (IKeyBoardDependency) this.f119573n.getValue();
    }

    /* renamed from: k */
    public final void mo166578k() {
        this.f119572m = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$Companion;", "", "()V", "INPUT_TEXT_LIMIT_LENGTH", "", "LOG_TAG", "", "maxCount", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$plugin$2", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onFilePaste", "", "rawFilePaths", "", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$j */
    public static final class C47377j extends AbstractC58541b {
        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "rawFilePaths");
        }

        C47377j() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$plugin$3", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/IOnLifeCallback;", "onResume", "", "onStop", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$k */
    public static final class C47378k implements IOnLifeCallback {
        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
        /* renamed from: a */
        public void mo122056a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
        /* renamed from: b */
        public void mo122057b() {
        }

        C47378k() {
        }
    }

    /* renamed from: r */
    public final Activity mo166585r() {
        return this.f119576q;
    }

    /* renamed from: s */
    public final MomentsDetailViewModel mo166586s() {
        return this.f119577r;
    }

    /* renamed from: t */
    public final String mo166587t() {
        return this.f119578s;
    }

    /* renamed from: a */
    public final void mo166566a(Pair<IPhotoDependency.Image, Boolean> pair) {
        TextInputSupportPlugin cVar = this.f119562b;
        View view = null;
        FrameLayout s = cVar != null ? cVar.mo147267s() : null;
        if (s != null) {
            view = s.getChildAt(0);
        }
        IPhotoDependency.Image component1 = pair.component1();
        pair.component2().booleanValue();
        if (view instanceof MomentsPublishPhotoView) {
            if (!(s.getVisibility() == 8) && component1.getUrls().contains(this.f119567g)) {
                ((MomentsPublishPhotoView) view).mo166708b();
                PhotoItem height = new PhotoItem().setPaths(component1.getUrls()).setType(2).setToken(component1.getToken()).setWidth(component1.getWidth()).setHeight(component1.getHeight());
                PhotoItem.TranslateProperty translateProperty = height.getTranslateProperty();
                Intrinsics.checkExpressionValueIsNotNull(translateProperty, "translateProperty");
                translateProperty.setTranslated(false);
                this.f119566f = height;
                TextInputSupportPlugin cVar2 = this.f119562b;
                if (cVar2 != null) {
                    cVar2.mo147256a(true, true);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo166565a(List<String> list) {
        if (!list.isEmpty()) {
            String str = list.get(0);
            TextInputSupportPlugin cVar = this.f119562b;
            View view = null;
            FrameLayout s = cVar != null ? cVar.mo147267s() : null;
            if (s != null) {
                view = s.getChildAt(0);
            }
            if (view instanceof MomentsPublishPhotoView) {
                if (!(s.getVisibility() == 8) && !(!Intrinsics.areEqual(str, this.f119567g))) {
                    ((MomentsPublishPhotoView) view).mo166707a(str);
                    LKUIToast.loadFail(this.f119576q, (int) R.string.Lark_CommunityUnableToUploadToast);
                    TextInputSupportPlugin cVar2 = this.f119562b;
                    if (cVar2 != null) {
                        cVar2.mo147256a(true, false);
                    }
                    View view2 = this.f119569i;
                    if (view2 != null) {
                        view2.setEnabled(false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo166564a(String str, boolean z) {
        TextInputSupportPlugin cVar = this.f119562b;
        FrameLayout s = cVar != null ? cVar.mo147267s() : null;
        if (s != null) {
            s.setVisibility(0);
        }
        MomentsPublishPhotoView iVar = new MomentsPublishPhotoView(this.f119576q);
        iVar.setImage(str);
        iVar.setIsKeepOriginPhoto(z);
        iVar.setActionListener(new C47366b(this, iVar));
        iVar.mo166706a();
        if (s != null) {
            s.removeAllViews();
            s.addView(iVar);
        }
        this.f119567g = str;
        TextInputSupportPlugin cVar2 = this.f119562b;
        if (cVar2 != null) {
            cVar2.mo147256a(true, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$draftCallback$2$1", "invoke", "()Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$draftCallback$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$c */
    static final class C47367c extends Lambda implements Function0<C473681> {
        final /* synthetic */ MomentsCommentKeyBoardManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47367c(MomentsCommentKeyBoardManager bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C473681 invoke() {
            return new IKeyBoardDependency(this) {
                /* class com.ss.android.lark.moments.impl.detail.MomentsCommentKeyBoardManager.C47367c.C473681 */

                /* renamed from: a */
                final /* synthetic */ C47367c f119581a;

                @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                /* renamed from: a */
                public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
                    Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f119581a = r1;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$draftCallback$2$1$resetDraft$action$1", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$DraftAction;", "onGetDraft", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.moments.impl.detail.b$c$1$a */
                public static final class C47369a implements MomentsDetailViewModel.DraftAction {

                    /* renamed from: a */
                    final /* synthetic */ C473681 f119582a;

                    /* renamed from: b */
                    final /* synthetic */ IKeyBoardDependency.IResetDraftCallback f119583b;

                    @Override // com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel.DraftAction
                    /* renamed from: a */
                    public void mo166588a(RichText richText) {
                        RichTextEmojiconEditText r;
                        Intrinsics.checkParameterIsNotNull(richText, "richText");
                        TextInputSupportPlugin cVar = this.f119582a.f119581a.this$0.f119562b;
                        if (cVar == null || (r = cVar.mo147266r()) == null || r.isEnabled()) {
                            C53241h.m205898b("MomentsCommentKeyBoardManager", "reset comment draft");
                            IKeyBoardDependency.IResetDraftCallback.C40677a.m160773a(this.f119583b, richText, null, null, null, 8, null);
                        }
                    }

                    C47369a(C473681 r1, IKeyBoardDependency.IResetDraftCallback bVar) {
                        this.f119582a = r1;
                        this.f119583b = bVar;
                    }
                }

                @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                /* renamed from: a */
                public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
                    Intrinsics.checkParameterIsNotNull(bVar, "callback");
                    this.f119581a.this$0.mo166586s().getDraft(this.f119581a.this$0.mo166587t(), new C47369a(this, bVar));
                }

                @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                /* renamed from: a */
                public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
                    if (C59035h.m229210a(richText)) {
                        C53241h.m205898b("MomentsCommentKeyBoardManager", "empty input, delete draft");
                        this.f119581a.this$0.mo166586s().deleteDraft(this.f119581a.this$0.mo166587t());
                        return;
                    }
                    C53241h.m205898b("MomentsCommentKeyBoardManager", "save comment draft");
                    this.f119581a.this$0.mo166586s().saveDraft(this.f119581a.this$0.mo166587t(), richText);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$4", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$OnClickReplyCloseBtListener;", "onClickReplyCloseBt", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$g */
    public static final class C47373g implements TextInputSupportPlugin.OnClickReplyCloseBtListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119587a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin.OnClickReplyCloseBtListener
        /* renamed from: a */
        public void mo147272a() {
            this.f119587a.mo166574g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47373g(MomentsCommentKeyBoardManager bVar) {
            this.f119587a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¨\u0006\u0016"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$iPhotoDependency$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/IMomentsPhotoDependency;", "isEnablePostSendVideo", "", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "requestInputFocus", "setEnableClick", "enable", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$m */
    public static final class C47380m implements IMomentsPhotoDependency {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119596a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public boolean mo122042a() {
            return false;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public boolean mo122044b() {
            return IMomentsPhotoDependency.C47324a.m187457a(this);
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency
        /* renamed from: c */
        public void mo166336c() {
            IOutInputSupport h;
            EditText l;
            KeyBoard fVar = this.f119596a.f119561a;
            if (fVar != null && (h = fVar.mo146827h()) != null && (l = h.mo146904l()) != null) {
                l.requestFocus();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47380m(MomentsCommentKeyBoardManager bVar) {
            this.f119596a = bVar;
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
            int i;
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            PerfGalleryLoadMonitor.f145397a.mo199287a(Scene.Moments, 2);
            if (this.f119596a.f119566f != null) {
                i = 0;
            } else {
                i = 1;
            }
            aVar.mo198506a(i).mo198513b(1).mo198525h(false).mo198527j(true).mo198532o(false).mo198522f(3).mo198510a(this.f119596a.mo166585r(), 233);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122039a(C58633e.C58634a aVar) {
            int i;
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            if (this.f119596a.f119566f != null) {
                i = 0;
            } else {
                i = 1;
            }
            aVar.mo198695b(i).mo198698c(1).mo198693a(this.f119596a.mo166585r(), 911);
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
            this.f119596a.mo166586s().getEnableClick().mo5929b(Boolean.valueOf(z));
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.IMomentsPhotoDependency
        /* renamed from: a */
        public void mo166334a(IPhotoDependency.VideoInfo videoInfo, Photo photo) {
            Intrinsics.checkParameterIsNotNull(videoInfo, "videoInfo");
            Intrinsics.checkParameterIsNotNull(photo, "photo");
            IMomentsPhotoDependency.C47324a.m187453a(this, videoInfo, photo);
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
            return this.f119596a.mo166586s().uploadImage(this.f119596a.mo166585r(), list, z);
        }
    }

    /* renamed from: j */
    public final void mo166577j() {
        MomentsIdentityPluginManager cVar = this.f119571l;
        if (cVar != null) {
            cVar.mo166303a();
        }
    }

    /* renamed from: m */
    public final void mo166580m() {
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146838s();
        }
    }

    /* renamed from: o */
    public final void mo166582o() {
        TextInputSupportPlugin cVar = this.f119562b;
        if (cVar != null) {
            cVar.mo147271w();
        }
    }

    /* renamed from: p */
    public final void mo166583p() {
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146833n();
        }
    }

    /* renamed from: q */
    public final void mo166584q() {
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146834o();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$onPhotoUploadListener$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/OnPhotoUploadListener;", "cameraCanRecordVideo", "", "getLeftMaxCount", "", "hasImage", "hasVideo", "onPhotoEnableToUpload", "", "orderPhotos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "onUploadError", "paths", "", "", "onUploadSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$r */
    public static final class C47385r implements OnPhotoUploadListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119601a;

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: a */
        public void mo166344a(IPhotoDependency.Image image, boolean z) {
            Intrinsics.checkParameterIsNotNull(image, "image");
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: b */
        public boolean mo166347b() {
            return false;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: d */
        public boolean mo166349d() {
            return false;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: a */
        public int mo166343a() {
            if (this.f119601a.f119566f == null) {
                return 1;
            }
            return 0;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: c */
        public boolean mo166348c() {
            if (this.f119601a.f119566f != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47385r(MomentsCommentKeyBoardManager bVar) {
            this.f119601a = bVar;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: a */
        public void mo166345a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "paths");
            this.f119601a.mo166565a(list);
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.photo.OnPhotoUploadListener
        /* renamed from: a */
        public void mo166346a(List<Photo> list, boolean z) {
            Intrinsics.checkParameterIsNotNull(list, "orderPhotos");
            MomentsCommentKeyBoardManager bVar = this.f119601a;
            String path = list.get(0).getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "orderPhotos[0].path");
            bVar.mo166564a(path, z);
        }
    }

    /* renamed from: e */
    public final void mo166572e() {
        TextInputSupportPlugin cVar = this.f119562b;
        if (cVar != null) {
            cVar.mo147260d(false);
        }
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146820c();
        }
    }

    /* renamed from: i */
    public final boolean mo166576i() {
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            return fVar.mo146822d();
        }
        return false;
    }

    /* renamed from: l */
    public final void mo166579l() {
        if (!this.f119572m) {
            KeyBoard fVar = this.f119561a;
            if (fVar != null) {
                fVar.mo146839t();
            }
            this.f119572m = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getAtPlugin$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/IMomentsGetIdentityTypeApi;", "getIdentityType", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$d */
    public static final class C47370d implements IMomentsGetIdentityTypeApi {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119584a;

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.at.IMomentsGetIdentityTypeApi
        /* renamed from: a */
        public MomentsPublishViewModel.IdentityType mo166275a() {
            MomentsPublishViewModel.IdentityType b = this.f119584a.mo166586s().getIdentityType().mo5927b();
            if (b != null) {
                return b;
            }
            return MomentsPublishViewModel.IdentityType.NORMAL;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47370d(MomentsCommentKeyBoardManager bVar) {
            this.f119584a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getFacePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "onClicked", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$e */
    public static final class C47371e implements IKeyBoardPlugin.IPluginClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119585a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
        /* renamed from: a */
        public void mo122033a() {
            MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, this.f119585a.mo166587t(), "input_emoji", "public_emoji_panel_select_view", (String) null, (String) null, 24, (Object) null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47371e(MomentsCommentKeyBoardManager bVar) {
            this.f119585a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getPhotoPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "onClicked", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$f */
    public static final class C47372f implements IKeyBoardPlugin.IPluginClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119586a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
        /* renamed from: a */
        public void mo122033a() {
            MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, this.f119586a.mo166587t(), "input_picture", "moments_image_send_view", (String) null, (String) null, 24, (Object) null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47372f(MomentsCommentKeyBoardManager bVar) {
            this.f119586a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$initKeyBoard$inputPlugin$1$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;", "getIdentityType", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "getQuota", "", "noQuotaLimitation", "", "hasAt", "setIdentityType", ShareHitPoint.f121869d, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$n */
    public static final class C47381n implements IMomentsKeyboardManagerDependency {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119597a;

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
        /* renamed from: a */
        public MomentsPublishViewModel.IdentityType mo166298a() {
            MomentsPublishViewModel.IdentityType b = this.f119597a.mo166586s().getIdentityType().mo5927b();
            if (b != null) {
                return b;
            }
            return MomentsPublishViewModel.IdentityType.NORMAL;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
        /* renamed from: b */
        public boolean mo166301b() {
            List<String> list;
            boolean z;
            RichTextEmojiconEditText q;
            RichText richText;
            TextInputSupportPlugin cVar = this.f119597a.f119562b;
            if (cVar == null || (q = cVar.mo146904l()) == null || (richText = q.getRichText()) == null) {
                list = null;
            } else {
                list = richText.getAtIds();
            }
            List<String> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            return !z;
        }

        C47381n(MomentsCommentKeyBoardManager bVar) {
            this.f119597a = bVar;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
        /* renamed from: a */
        public void mo166300a(boolean z) {
            this.f119597a.mo166586s().getAnonymousInfo(z);
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsKeyboardManagerDependency
        /* renamed from: a */
        public void mo166299a(MomentsPublishViewModel.IdentityType identityType) {
            String str;
            boolean z;
            TextInputSupportPlugin cVar;
            Intrinsics.checkParameterIsNotNull(identityType, ShareHitPoint.f121869d);
            this.f119597a.mo166586s().getIdentityType().mo5926a(identityType);
            if (identityType != MomentsPublishViewModel.IdentityType.NORMAL) {
                AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
                if (b == null || (str = b.tip) == null) {
                    str = "";
                }
                String str2 = str;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.f119597a.f119564d && (cVar = this.f119597a.f119562b) != null) {
                    cVar.mo147251a((CharSequence) str2);
                    return;
                }
                return;
            }
            TextInputSupportPlugin cVar2 = this.f119597a.f119562b;
            if (cVar2 != null) {
                cVar2.mo147251a((CharSequence) UIUtils.getString(this.f119597a.mo166585r(), R.string.Lark_Community_ShareYourComment));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$setReplyCommentMode$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$s */
    public static final class RunnableC47386s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119602a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f119603b;

        /* renamed from: c */
        final /* synthetic */ String f119604c;

        /* renamed from: d */
        final /* synthetic */ String f119605d;

        RunnableC47386s(MomentsCommentKeyBoardManager bVar, CharSequence charSequence, String str, String str2) {
            this.f119602a = bVar;
            this.f119603b = charSequence;
            this.f119604c = str;
            this.f119605d = str2;
        }

        public final void run() {
            IOutInputSupport h;
            EditText l;
            KeyBoard fVar = this.f119602a.f119561a;
            if (!(fVar == null || (h = fVar.mo146827h()) == null || (l = h.mo146904l()) == null)) {
                l.requestFocus();
            }
            KeyBoard fVar2 = this.f119602a.f119561a;
            if (fVar2 != null) {
                fVar2.mo146829j();
            }
        }
    }

    /* renamed from: x */
    private final IKeyBoardPlugin m187798x() {
        MomentsPhotoKBPlugin bVar = new MomentsPhotoKBPlugin(this.f119574o, this.f119575p, true);
        bVar.mo147803a(new C47372f(this));
        this.f119563c = bVar;
        return bVar;
    }

    /* renamed from: y */
    private final IKeyBoardPlugin m187799y() {
        return new AtKBPlugin("", false, true, new MomentsAtDependency(this.f119576q, new C47370d(this)));
    }

    /* renamed from: b */
    public final void mo166568b() {
        String str;
        String f = MomentsHitHelper.f119719r.mo166808f();
        String g = MomentsHitHelper.f119719r.mo166810g();
        if (this.f119564d) {
            str = "post";
        } else {
            str = Comment.f24093e;
        }
        String str2 = this.f119578s;
        MomentsHitPoint.f119720a.mo166837a(f, str, g, this.f119565e, str2);
    }

    /* renamed from: c */
    public final void mo166570c() {
        String str;
        String f = MomentsHitHelper.f119719r.mo166808f();
        String g = MomentsHitHelper.f119719r.mo166810g();
        if (this.f119564d) {
            str = "post";
        } else {
            str = Comment.f24093e;
        }
        String str2 = this.f119578s;
        MomentsHitPoint.f119720a.mo166843b(f, str, g, this.f119565e, str2);
    }

    /* renamed from: d */
    public final void mo166571d() {
        IOutInputSupport h;
        EditText l;
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146829j();
        }
        KeyBoard fVar2 = this.f119561a;
        if (fVar2 != null && (h = fVar2.mo146827h()) != null && (l = h.mo146904l()) != null) {
            l.requestFocus();
        }
    }

    /* renamed from: f */
    public final void mo166573f() {
        IOutInputSupport h;
        EditText l;
        mo166574g();
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146829j();
        }
        KeyBoard fVar2 = this.f119561a;
        if (fVar2 != null && (h = fVar2.mo146827h()) != null && (l = h.mo146904l()) != null) {
            l.requestFocus();
        }
    }

    /* renamed from: n */
    public final void mo166581n() {
        TextInputSupportPlugin cVar = this.f119562b;
        if (cVar != null) {
            cVar.mo147269u();
        }
        mo166572e();
        TextInputSupportPlugin cVar2 = this.f119562b;
        if (cVar2 != null) {
            cVar2.mo147090j();
        }
        mo166574g();
        mo166575h();
    }

    /* renamed from: w */
    private final IKeyBoardPlugin m187797w() {
        Activity activity = this.f119576q;
        if (activity != null) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "(activity as FragmentAct…y).supportFragmentManager");
            FaceKBPlugin dVar = new FaceKBPlugin(false, false, supportFragmentManager, new FaceDependency());
            dVar.mo147600a(new C47371e(this));
            return dVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo166557a() {
        RichTextEmojiconEditText r;
        RichTextEmojiconEditText r2;
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146807a("text", false);
            fVar.mo146807a("at", false);
            fVar.mo146807a("face", false);
            fVar.mo146807a("photo", false);
            fVar.mo146816b("input_addition", false);
            fVar.mo146816b("input_pop", false);
            fVar.mo146816b("post", false);
        }
        View view = this.f119569i;
        if (view != null) {
            C0922v.m4415a(view, false);
        }
        TextInputSupportPlugin cVar = this.f119562b;
        if (!(cVar == null || (r2 = cVar.mo147266r()) == null)) {
            r2.setEnabled(false);
        }
        TextInputSupportPlugin cVar2 = this.f119562b;
        if (!(cVar2 == null || (r = cVar2.mo147266r()) == null)) {
            r.setText("");
        }
        TextInputSupportPlugin cVar3 = this.f119562b;
        if (cVar3 != null) {
            String string = UIUtils.getString(this.f119576q, R.string.Lark_Moments_CommentsTurnedOff);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(activi…oments_CommentsTurnedOff)");
            cVar3.mo147252a(string, UIUtils.getColor(this.f119576q, R.color.text_disable));
        }
        mo166577j();
    }

    /* renamed from: h */
    public final void mo166575h() {
        FrameLayout frameLayout;
        IOutInputSupport h;
        EditText l;
        TextInputSupportPlugin cVar = this.f119562b;
        String str = null;
        if (cVar != null) {
            frameLayout = cVar.mo147267s();
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f119566f = null;
        this.f119567g = "";
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            str = fVar.mo146826g();
        }
        if (Intrinsics.areEqual(str, "photo")) {
            KeyBoard fVar2 = this.f119561a;
            if (fVar2 != null) {
                fVar2.mo146829j();
            }
            KeyBoard fVar3 = this.f119561a;
            if (!(fVar3 == null || (h = fVar3.mo146827h()) == null || (l = h.mo146904l()) == null)) {
                l.requestFocus();
            }
        }
        TextInputSupportPlugin cVar2 = this.f119562b;
        if (cVar2 != null) {
            cVar2.mo147256a(false, true);
        }
    }

    /* renamed from: v */
    private final IInputSupportPlugin m187796v() {
        MomentsPhotoKBPlugin bVar;
        AtKBPlugin aVar;
        FaceKBPlugin dVar;
        String string = UIUtils.getString(this.f119576q, R.string.Lark_Community_ShareYourComment);
        int color = UIHelper.getColor(R.color.text_placeholder);
        C47379l lVar = new C47379l(this);
        Intrinsics.checkExpressionValueIsNotNull(string, "hint");
        C47375i iVar = new C47375i(this, lVar, string, color, true, string, color, new C47377j(), lVar, new C47378k(), false);
        C47375i iVar2 = iVar;
        this.f119562b = iVar2;
        iVar.mo147260d(false);
        iVar.mo147248a(IOutInputSupport.InputSupportType.THREADPOSTINPUT);
        ArrayList arrayList = new ArrayList();
        KeyBoard fVar = this.f119561a;
        if (!(fVar == null || (dVar = (FaceKBPlugin) fVar.mo146819c("face")) == null)) {
            arrayList.add(dVar);
        }
        KeyBoard fVar2 = this.f119561a;
        if (!(fVar2 == null || (aVar = (AtKBPlugin) fVar2.mo146819c("at")) == null)) {
            arrayList.add(aVar);
        }
        KeyBoard fVar3 = this.f119561a;
        if (!(fVar3 == null || (bVar = (MomentsPhotoKBPlugin) fVar3.mo146819c("photo")) == null)) {
            arrayList.add(bVar);
        }
        iVar.mo147255a(arrayList);
        iVar.mo147249a(new C47373g(this));
        iVar.mo147257a(new InputFilter[]{new C47374h(this, 2000)});
        this.f119562b = iVar2;
        return iVar;
    }

    /* renamed from: g */
    public final void mo166574g() {
        TextInputSupportPlugin cVar;
        String str;
        RichText richText;
        String str2;
        Editable text;
        if (!this.f119564d) {
            boolean z = true;
            this.f119564d = true;
            String str3 = "";
            this.f119565e = str3;
            KeyBoard fVar = this.f119561a;
            if (fVar != null) {
                EditText l = fVar.mo146827h().mo146904l();
                if (l instanceof RichTextEmojiconEditText) {
                    richText = ((RichTextEmojiconEditText) l).getRichText();
                } else {
                    if (l == null || (text = l.getText()) == null || (str2 = text.toString()) == null) {
                        str2 = str3;
                    }
                    richText = C59029c.m229161b(str2);
                }
                TextInputSupportPlugin cVar2 = this.f119562b;
                if (cVar2 != null) {
                    cVar2.mo147090j();
                }
                if (!C59035h.m229210a(richText)) {
                    m187794a(richText, (String) null, (RichText) null);
                }
            }
            if (this.f119577r.getIdentityType().mo5927b() != MomentsPublishViewModel.IdentityType.NORMAL) {
                AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
                if (!(b == null || (str = b.tip) == null)) {
                    str3 = str;
                }
                String str4 = str3;
                if (str4.length() <= 0) {
                    z = false;
                }
                if (z && this.f119564d && (cVar = this.f119562b) != null) {
                    cVar.mo147251a((CharSequence) str4);
                    return;
                }
                return;
            }
            TextInputSupportPlugin cVar3 = this.f119562b;
            if (cVar3 != null) {
                cVar3.mo147251a((CharSequence) UIUtils.getString(this.f119576q, R.string.Lark_Community_ShareYourComment));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$sendCallback$1", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;", "onSendInterrupted", "", "onSendText", "content", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$l */
    public static final class C47379l implements OnSendTextCallback {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119595a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122054a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47379l(MomentsCommentKeyBoardManager bVar) {
            this.f119595a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122055a(String str, RichText richText) {
            ImageInfo imageInfo;
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            this.f119595a.mo166570c();
            PhotoItem photoItem = this.f119595a.f119566f;
            if (photoItem != null) {
                imageInfo = new ImageInfo.C18408a().mo63642b(Integer.valueOf(photoItem.getHeight())).mo63639a(Integer.valueOf(photoItem.getWidth())).mo63640a(photoItem.getToken()).mo63643b(this.f119595a.f119567g).build();
            } else {
                imageInfo = null;
            }
            this.f119595a.mo166586s().sendComment(this.f119595a.mo166587t(), richText, imageInfo, this.f119595a.f119565e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$initKeyBoard$1", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$o */
    public static final class C47382o implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119598a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47382o(MomentsCommentKeyBoardManager bVar) {
            this.f119598a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
            KeyBoard fVar = this.f119598a.f119561a;
            if (fVar == null || !fVar.mo146818b("post")) {
                this.f119598a.mo166558a(i);
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            KeyBoard fVar = this.f119598a.f119561a;
            if (fVar == null || !fVar.mo146818b("post")) {
                this.f119598a.mo166558a(i);
                if (z) {
                    this.f119598a.f119568h = true;
                    this.f119598a.mo166568b();
                } else if (this.f119598a.f119568h) {
                    MomentsHitHelper.f119719r.mo166820l();
                    this.f119598a.f119568h = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$p */
    public static final class C47383p<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119599a;

        C47383p(MomentsCommentKeyBoardManager bVar) {
            this.f119599a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f119599a.mo166557a();
        }
    }

    /* renamed from: a */
    public final void mo166567a(boolean z) {
        MomentsIdentityPluginManager cVar = this.f119571l;
        if (cVar != null) {
            cVar.mo166306a(z);
        }
    }

    /* renamed from: b */
    public final void mo166569b(boolean z) {
        MomentsIdentityPluginManager cVar = this.f119571l;
        if (cVar != null) {
            cVar.mo166308b(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$addImage$1", "Lcom/ss/android/lark/moments/impl/detail/ItemActionListener;", "onDeleteClickListener", "", "view", "Landroid/view/View;", "onPreviewClickListener", "retryUploadImage", "photoPath", "", "isKeepOriginPhoto", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$b */
    public static final class C47366b implements ItemActionListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119579a;

        /* renamed from: b */
        final /* synthetic */ MomentsPublishPhotoView f119580b;

        @Override // com.ss.android.lark.moments.impl.detail.ItemActionListener
        /* renamed from: a */
        public void mo166505a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f119579a.mo166560a(view);
        }

        @Override // com.ss.android.lark.moments.impl.detail.ItemActionListener
        /* renamed from: b */
        public void mo166507b(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f119579a.mo166575h();
        }

        C47366b(MomentsCommentKeyBoardManager bVar, MomentsPublishPhotoView iVar) {
            this.f119579a = bVar;
            this.f119580b = iVar;
        }

        @Override // com.ss.android.lark.moments.impl.detail.ItemActionListener
        /* renamed from: a */
        public void mo166506a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "photoPath");
            ArrayList arrayList = new ArrayList();
            Photo photo = new Photo();
            photo.setPath(str);
            arrayList.add(photo);
            this.f119580b.mo166706a();
            MomentsPhotoKBPlugin bVar = this.f119579a.f119563c;
            if (bVar != null) {
                bVar.mo166337c(arrayList, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$q */
    public static final class C47384q<T> implements AbstractC1178x<Pair<? extends IPhotoDependency.Image, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119600a;

        C47384q(MomentsCommentKeyBoardManager bVar) {
            this.f119600a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<IPhotoDependency.Image, Boolean> pair) {
            MomentsCommentKeyBoardManager bVar = this.f119600a;
            Intrinsics.checkExpressionValueIsNotNull(pair, "it");
            bVar.mo166566a(pair);
        }
    }

    /* renamed from: a */
    public final void mo166562a(MomentsPublishViewModel.IdentityType identityType) {
        Intrinsics.checkParameterIsNotNull(identityType, ShareHitPoint.f121869d);
        MomentsIdentityPluginManager cVar = this.f119571l;
        if (cVar != null) {
            cVar.mo166304a(identityType);
        }
    }

    /* renamed from: a */
    public final void mo166560a(View view) {
        PhotoItem photoItem = this.f119566f;
        if (photoItem != null) {
            ArrayList<PhotoItem> arrayList = new ArrayList<>();
            arrayList.add(photoItem);
            MomentsPreviewHelper.f119251a.mo166206a(this.f119576q, view, 0, arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin;", "getLayoutId", "", "onCreateSendBtn", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onInitView", "activity", "Landroid/app/Activity;", "rootView", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$i */
    public static final class C47375i extends TextInputSupportPlugin {

        /* renamed from: q */
        final /* synthetic */ MomentsCommentKeyBoardManager f119589q;

        /* renamed from: r */
        final /* synthetic */ C47379l f119590r;

        /* renamed from: s */
        final /* synthetic */ String f119591s;

        /* renamed from: t */
        final /* synthetic */ int f119592t;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
        /* renamed from: i */
        public int mo147089i() {
            return R.layout.kb_input_normal_old;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$plugin$1$$special$$inlined$onSingleClickListener$1"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.detail.b$i$a */
        public static final class C47376a extends OnSingleClickListener {

            /* renamed from: a */
            final /* synthetic */ C47375i f119593a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup f119594b;

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                RichTextEmojiconEditText r = this.f119593a.mo147266r();
                C47379l lVar = this.f119593a.f119590r;
                String a = r.mo146908a(false);
                Intrinsics.checkExpressionValueIsNotNull(a, "msgET.getStringText(false)");
                RichText richText = r.getRichText();
                Intrinsics.checkExpressionValueIsNotNull(richText, "msgET.richText");
                lVar.mo122055a(a, richText);
                KeyboardUtils.hideKeyboard(this.f119594b.getContext());
            }

            public C47376a(C47375i iVar, ViewGroup viewGroup) {
                this.f119593a = iVar;
                this.f119594b = viewGroup;
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
        /* renamed from: a */
        public View mo147033a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View a = super.mo147033a(viewGroup);
            a.setOnClickListener(new C47376a(this, viewGroup));
            this.f119589q.f119569i = a;
            return a;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
        /* renamed from: a */
        public View mo147031a(Activity activity, View view) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            View a = super.mo147031a(activity, view);
            mo147270v();
            return a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47375i(MomentsCommentKeyBoardManager bVar, C47379l lVar, String str, int i, boolean z, CharSequence charSequence, int i2, AbstractC58541b bVar2, OnSendTextCallback bVar3, IOnLifeCallback aVar, boolean z2) {
            super(z, charSequence, i2, bVar2, bVar3, aVar, z2);
            this.f119589q = bVar;
            this.f119590r = lVar;
            this.f119591s = str;
            this.f119592t = i;
        }
    }

    /* renamed from: a */
    public final void mo166558a(int i) {
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = this.f119570k;
        if (scrollerConflictPtrFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = scrollerConflictPtrFrameLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.bottomMargin != i) {
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, i);
                }
                scrollerConflictPtrFrameLayout.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager$getTextInputSupportPlugin$5", "Landroid/text/InputFilter$LengthFilter;", "filter", "", ShareHitPoint.f121868c, "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.b$h */
    public static final class C47374h extends InputFilter.LengthFilter {

        /* renamed from: a */
        final /* synthetic */ MomentsCommentKeyBoardManager f119588a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47374h(MomentsCommentKeyBoardManager bVar, int i) {
            super(i);
            this.f119588a = bVar;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(spanned, "dest");
            if (getMax() - (spanned.length() - (i4 - i3)) <= 0) {
                LKUIToast.show(this.f119588a.mo166585r(), UIHelper.mustacheFormat((int) R.string.Lark_Community_TheNumberOfWordsExceedsTheLimit, "num", String.valueOf(2000)));
            }
            return super.filter(charSequence, i, i2, spanned, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo166561a(FrameLayout frameLayout, ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout) {
        IInputSupportAdditionPlugin a;
        IInputSupportAdditionPlugin a2;
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        Intrinsics.checkParameterIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
        this.f119570k = scrollerConflictPtrFrameLayout;
        KeyBoard fVar = new KeyBoard(this.f119576q, frameLayout, m187795u(), null, null, false, 56, null);
        this.f119561a = fVar;
        if (fVar != null) {
            fVar.mo146806a("face", m187797w());
        }
        KeyBoard fVar2 = this.f119561a;
        if (fVar2 != null) {
            fVar2.mo146806a("at", m187799y());
        }
        KeyBoard fVar3 = this.f119561a;
        if (fVar3 != null) {
            fVar3.mo146806a("photo", m187798x());
        }
        KeyBoard fVar4 = this.f119561a;
        if (fVar4 != null) {
            fVar4.mo146814b(R.color.transparent);
        }
        IInputSupportPlugin v = m187796v();
        MomentsIdentityPluginManager cVar = new MomentsIdentityPluginManager(this.f119576q, new C47381n(this));
        this.f119571l = cVar;
        if (!(cVar == null || (a2 = cVar.mo166302a("input_addition")) == null)) {
            v.mo147009a("input_addition", a2);
        }
        MomentsIdentityPluginManager cVar2 = this.f119571l;
        if (!(cVar2 == null || (a = cVar2.mo166302a("input_pop")) == null)) {
            v.mo147009a("input_pop", a);
        }
        KeyBoard fVar5 = this.f119561a;
        if (fVar5 != null) {
            fVar5.mo146804a("text", v);
        }
        KeyBoard fVar6 = this.f119561a;
        if (fVar6 != null) {
            fVar6.mo146817b(false);
        }
        KeyBoard fVar7 = this.f119561a;
        if (fVar7 != null) {
            fVar7.mo146796a(new C47382o(this));
        }
        KeyBoard fVar8 = this.f119561a;
        if (fVar8 != null) {
            fVar8.mo146842w();
        }
        C1177w<Boolean> disableComment = this.f119577r.getDisableComment();
        Activity activity = this.f119576q;
        if (activity != null) {
            disableComment.mo5923a((ComponentActivity) activity, new C47383p(this));
            this.f119577r.getUploadImageSuccess().mo5923a((LifecycleOwner) this.f119576q, new C47384q(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.activity.ComponentActivity");
    }

    public MomentsCommentKeyBoardManager(Activity activity, MomentsDetailViewModel fVar, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(fVar, "vm");
        Intrinsics.checkParameterIsNotNull(str, "postId");
        this.f119576q = activity;
        this.f119577r = fVar;
        this.f119578s = str;
    }

    /* renamed from: a */
    private final void m187794a(RichText richText, String str, RichText richText2) {
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            fVar.mo146802a(richText, str, richText2, true);
            if (!TextUtils.isEmpty(str) || !C59035h.m229210a(richText2)) {
                fVar.mo146803a("post");
                return;
            }
            EditText l = fVar.mo146827h().mo146904l();
            if (l != null) {
                l.requestFocus();
            }
            fVar.mo146829j();
        }
    }

    /* renamed from: a */
    public final void mo166559a(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        if (i == 911 || i == 233 || i == 1638) {
            KeyBoard fVar = this.f119561a;
            if (fVar != null) {
                fVar.mo146812a(i, i2, intent);
            }
        } else if (i == 266) {
            KeyBoard fVar2 = this.f119561a;
            if (fVar2 != null) {
                fVar2.mo146812a(233, i2, intent);
            }
        } else if (i == 666) {
            Serializable serializableExtra = intent.getSerializableExtra("SELECTED_PHOTOS");
            if (serializableExtra == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
            } else if (C69121n.m265989f(serializableExtra).isEmpty()) {
                mo166575h();
            }
        } else if (i == 15619) {
            Serializable serializableExtra2 = intent.getSerializableExtra("nickname_user");
            AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
            if (serializableExtra2 instanceof MomentUser) {
                MomentsIdentityPluginManager cVar = this.f119571l;
                if (cVar != null) {
                    cVar.mo166305a((MomentUser) serializableExtra2);
                }
                if (b != null && Intrinsics.areEqual((Object) b.enabled, (Object) true) && b.type == AnonymityPolicy.AnonymousType.NICKNAME) {
                    if ((b.scope == AnonymityPolicy.Scope.GLOBAL || (b.scope == AnonymityPolicy.Scope.CATEGORY && Intrinsics.areEqual((Object) this.f119577r.getCategoryEnableAnonymous().mo5927b(), (Object) true))) && Intrinsics.areEqual((Object) this.f119577r.getHasQuota().mo5927b(), (Object) true)) {
                        this.f119577r.getIdentityType().mo5929b(MomentsPublishViewModel.IdentityType.NICKNAME);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo166563a(String str, String str2, CharSequence charSequence) {
        String str3;
        RichText b;
        Editable text;
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "userName");
        Intrinsics.checkParameterIsNotNull(charSequence, "digest");
        this.f119564d = false;
        this.f119565e = str;
        KeyBoard fVar = this.f119561a;
        if (fVar != null) {
            EditText l = fVar.mo146827h().mo146904l();
            if (l instanceof RichTextEmojiconEditText) {
                b = ((RichTextEmojiconEditText) l).getRichText();
            } else {
                if (l == null || (text = l.getText()) == null || (str3 = text.toString()) == null) {
                    str3 = "";
                }
                b = C59029c.m229161b(str3);
            }
            TextInputSupportPlugin cVar = this.f119562b;
            if (cVar != null) {
                cVar.mo147258b(charSequence);
            }
            TextInputSupportPlugin cVar2 = this.f119562b;
            if (cVar2 != null) {
                cVar2.mo147251a((CharSequence) (UIUtils.getString(this.f119576q, R.string.Lark_Community_Reply) + ' ' + str2));
            }
            fVar.mo146797a(new KeyBoard.ReplyInfo(str, str, charSequence, null, null, null));
            if (!C59035h.m229210a(b)) {
                m187794a(b, "", (RichText) null);
            }
            if (l != null) {
                l.postDelayed(new RunnableC47386s(this, charSequence, str2, str), 200);
            }
        }
    }
}
