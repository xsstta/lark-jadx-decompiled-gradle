package com.ss.android.lark.todo.impl.features.detail.comment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.ArrowKeyMovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.util.C3117e;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.at.TodoAtController;
import com.ss.android.lark.todo.impl.features.detail.comment.CommentImage;
import com.ss.android.lark.todo.impl.features.detail.common.TodoKeyboardUtil;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AtChatterBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001[B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160*J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010\u000eH\u0002J\u0006\u0010-\u001a\u00020(J\u0006\u0010.\u001a\u00020(J\u0012\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0010\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020(H\u0002J\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0*J\b\u00106\u001a\u0004\u0018\u000107J\u0016\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020(H\u0002J\b\u0010>\u001a\u00020(H\u0016J\b\u0010?\u001a\u00020(H\u0016J\u0010\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020EH\u0002J\u0006\u0010F\u001a\u00020 J\b\u0010G\u001a\u00020(H\u0016J\u0006\u0010H\u001a\u00020(J\b\u0010I\u001a\u00020(H\u0016J\b\u0010J\u001a\u00020(H\u0002J\b\u0010K\u001a\u00020(H\u0002J \u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u000eH\u0002J\u0010\u0010R\u001a\u00020(2\u0006\u0010S\u001a\u00020TH\u0002J\u0006\u0010U\u001a\u00020(J\f\u0010V\u001a\u00020(*\u00020\u001eH\u0002J\f\u0010W\u001a\u00020(*\u00020\u001eH\u0002J\f\u0010X\u001a\u00020(*\u00020\u001eH\u0002J\f\u0010Y\u001a\u00020(*\u00020\u001eH\u0002J\u000e\u0010Z\u001a\u0004\u0018\u00010\u000f*\u00020\u0016H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "view", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "atCommentController", "Lcom/ss/android/lark/todo/impl/features/detail/at/TodoAtController;", "atPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/at/AtKBPlugin;", "attachmentMap", "", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "getAttachmentMap", "()Ljava/util/Map;", "facePlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin;", "imageList", "", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage;", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "inputPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin;", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "lastStatus", "", "getLastStatus", "()Z", "setLastStatus", "(Z)V", "photoPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin;", "addImagesToKeyboard", "", "photos", "", "bindAtController", "chatId", "clearEditText", "clearPhotoInputArea", "commentDraftUpdate", "info", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentDraftInfo;", "commentKeyboardVisible", "visible", "foldKeyboard", "getAttachments", "getEditText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "handlePhotosFromAlbum", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "hideKeyboardContainer", "initViewAction", "initViewObserver", "insertAtTag", "atChatterBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "insertAtUser", "userInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAtUserInfo;", "isContentEmpty", "onDestroy", "onRemovePhotoFromKeyboard", "onStop", "showKeyboardContainer", "unfoldKeyboard", "updateAttachmentMap", "it", "Lcom/ss/android/lark/biz/core/api/EncryptImageData;", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photo", "updateCommentRichTextBean", "richTextShowBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "updateHasAvailableMediaContent", "addAtPlugin", "addFacePlugin", "addInputPlugin", "addPhotoPlugin", "toAttachment", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k */
public final class CommentKeyboardSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: c */
    public static final Companion f139826c = new Companion(null);

    /* renamed from: a */
    public PhotoKBPlugin f139827a;

    /* renamed from: b */
    public final View f139828b;

    /* renamed from: d */
    private KeyBoard f139829d;

    /* renamed from: e */
    private TextInputSupportPlugin f139830e;

    /* renamed from: f */
    private AtKBPlugin f139831f;

    /* renamed from: g */
    private TodoAtController f139832g;

    /* renamed from: h */
    private final Map<String, TodoAttachment> f139833h = new LinkedHashMap();

    /* renamed from: i */
    private List<CommentImage> f139834i = new ArrayList();

    /* renamed from: j */
    private boolean f139835j;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$Companion;", "", "()V", "DEFAULT_IMAGE_SIZE", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$addAtPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency;", "getAtInputResultStatus", "", "chatId", "", "isClickAtBtn", "", "isDisableAtFunction", "parseAtSelectorResult", "", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency$ChatterInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startAtSelectList", "", "requestCode", "editText", "Landroid/widget/AutoCompleteTextView;", "listener", "Landroid/preference/PreferenceManager$OnActivityResultListener;", "startAtSelector", "stopAtSelectList", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$c */
    public static final class C56518c implements IAtDependency {
        @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
        /* renamed from: a */
        public int mo127064a(String str, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            return z ? 1 : 0;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
        /* renamed from: a */
        public void mo127066a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
        /* renamed from: a */
        public void mo127067a(int i) {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
        /* renamed from: a */
        public void mo127068a(int i, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
            Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "editText");
            Intrinsics.checkParameterIsNotNull(onActivityResultListener, "listener");
        }

        C56518c() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
        /* renamed from: a */
        public List<IAtDependency.ChatterInfo> mo127065a(Intent intent) {
            return CollectionsKt.emptyList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$addInputPlugin$2", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onFilePaste", "", "rawFilePaths", "", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$e */
    public static final class C56520e extends AbstractC58541b {
        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "rawFilePaths");
        }

        C56520e() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$handlePhotosFromAlbum$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI$IUploadCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onUpdateProgress", "total", "", "curPos", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$h */
    public static final class C56527h implements PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback {
        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147836a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147837a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147838a(IPhotoDependency.Image image) {
            Intrinsics.checkParameterIsNotNull(image, "image");
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public void onUpdateProgress(long j, int i) {
        }

        C56527h() {
        }
    }

    /* renamed from: j */
    public final List<CommentImage> mo192416j() {
        return this.f139834i;
    }

    /* renamed from: a */
    public final void mo192413a(String str) {
        RichTextEmojiconEditText k = mo192417k();
        if (k != null) {
            TodoAtController aVar = this.f139832g;
            if (aVar != null) {
                FrameLayout frameLayout = (FrameLayout) this.f139828b.findViewById(R.id.todo_comment_at_container);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.todo_comment_at_container");
                aVar.mo192231a(k, frameLayout, str);
            }
            k.setDisplayUrl(true);
            k.setDisplayUrlPreview(TodoDependencyHolder.f139242a.mo191731b().mo191933f());
        }
    }

    /* renamed from: a */
    public final void mo192410a(CommentDraftInfo fVar) {
        CommentImage commentImage;
        mo192418l();
        mo192422p();
        if (fVar == null || (fVar.mo192380a() == null && fVar.mo192381b() == null)) {
            mo92107d().mo92069a(254, false);
            return;
        }
        mo92107d().mo92069a(254, true);
        mo192412a(new RichTextShowBean(fVar.mo192380a(), true, true));
        List<TodoAttachment> b = fVar.mo192381b();
        if (b != null) {
            List<TodoAttachment> list = b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                if (t.file_token != null) {
                    String str = t.file_token;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.file_token");
                    commentImage = new CommentImage(str, CommentImage.Companion.ImageInfoType.KEY);
                } else {
                    String str2 = t.name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.name");
                    commentImage = new CommentImage(str2, CommentImage.Companion.ImageInfoType.PATH);
                }
                arrayList.add(commentImage);
            }
            mo192414a(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo192414a(List<CommentImage> list) {
        RecyclerView t;
        Intrinsics.checkParameterIsNotNull(list, "photos");
        this.f139834i.addAll(list);
        while (this.f139834i.size() > 9) {
            List<CommentImage> list2 = this.f139834i;
            list2.remove(CollectionsKt.getLastIndex(list2));
        }
        TextInputSupportPlugin cVar = this.f139830e;
        if (!(cVar == null || (t = cVar.mo147268t()) == null)) {
            t.removeAllViews();
            t.setVisibility(0);
            t.setLayoutManager(new LinearLayoutManager(t.getContext(), 0, false));
            CommentImageAdapterV2 hVar = new CommentImageAdapterV2(this);
            hVar.notifyDataSetChanged();
            t.setAdapter(hVar);
        }
        mo192423q();
        PhotoKBPlugin bVar = this.f139827a;
        if (bVar != null) {
            bVar.mo147816b(9 - this.f139834i.size());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$addInputPlugin$3", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;", "onSendInterrupted", "", "onSendText", "content", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$f */
    public static final class C56521f implements OnSendTextCallback {

        /* renamed from: a */
        final /* synthetic */ CommentKeyboardSection f139839a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122054a() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$f$a */
        static final class RunnableC56522a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C56521f f139840a;

            RunnableC56522a(C56521f fVar) {
                this.f139840a = fVar;
            }

            public final void run() {
                this.f139840a.f139839a.mo192420n();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56521f(CommentKeyboardSection kVar) {
            this.f139839a = kVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122055a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            IActionDispatcher d = this.f139839a.mo92107d();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f139839a.mo192416j().iterator();
            while (it.hasNext()) {
                TodoAttachment a = this.f139839a.mo192406a((CommentImage) it.next());
                if (a != null) {
                    arrayList.add(a);
                }
            }
            d.mo92066a(131, (IActionData) new CommentSendInfo(str, richText, arrayList));
            this.f139839a.mo192422p();
            this.f139839a.mo192419m();
            ((FrameLayout) this.f139839a.f139828b.findViewById(R.id.keyboardContainer)).postDelayed(new RunnableC56522a(this), 100);
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: h */
    public void mo92111h() {
        TodoAtController aVar = this.f139832g;
        if (aVar != null) {
            aVar.mo192237d();
        }
        KeyBoard fVar = this.f139829d;
        if (fVar != null) {
            fVar.mo146838s();
        }
    }

    /* renamed from: k */
    public final RichTextEmojiconEditText mo192417k() {
        TextInputSupportPlugin cVar = this.f139830e;
        if (cVar != null) {
            return cVar.mo146904l();
        }
        return null;
    }

    /* renamed from: t */
    private final void m220263t() {
        RichTextEmojiconEditText q;
        if (!this.f139835j) {
            KeyBoard fVar = this.f139829d;
            if (fVar != null) {
                fVar.mo146829j();
            }
            TextInputSupportPlugin cVar = this.f139830e;
            if (!(cVar == null || (q = cVar.mo146904l()) == null)) {
                q.requestFocus();
            }
            this.f139835j = true;
        }
    }

    /* renamed from: u */
    private final void m220264u() {
        FrameLayout frameLayout = (FrameLayout) this.f139828b.findViewById(R.id.keyboardContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.keyboardContainer");
        frameLayout.setVisibility(0);
    }

    /* renamed from: n */
    public final void mo192420n() {
        FrameLayout frameLayout = (FrameLayout) this.f139828b.findViewById(R.id.keyboardContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.keyboardContainer");
        frameLayout.setVisibility(8);
    }

    /* renamed from: p */
    public final void mo192422p() {
        RecyclerView t;
        this.f139834i.clear();
        this.f139833h.clear();
        TextInputSupportPlugin cVar = this.f139830e;
        if (!(cVar == null || (t = cVar.mo147268t()) == null)) {
            t.removeAllViews();
        }
        mo192423q();
    }

    /* renamed from: q */
    public final void mo192423q() {
        TextInputSupportPlugin cVar = this.f139830e;
        if (cVar != null) {
            cVar.mo147261e(!this.f139834i.isEmpty());
        }
    }

    /* renamed from: r */
    public final boolean mo192424r() {
        RichText richText;
        if (this.f139834i.isEmpty()) {
            RichTextEmojiconEditText k = mo192417k();
            if (k != null) {
                richText = k.getRichText();
            } else {
                richText = null;
            }
            if (C59035h.m229210a(richText)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: i */
    public void mo92112i() {
        RichText richText;
        if (mo192424r()) {
            mo92107d().mo92064a(139);
            return;
        }
        IActionDispatcher d = mo92107d();
        RichTextEmojiconEditText k = mo192417k();
        if (k != null) {
            richText = k.getRichText();
        } else {
            richText = null;
        }
        d.mo92066a(140, (IActionData) new CommentSaveDraftInfo(richText, mo192425s()));
    }

    /* renamed from: l */
    public final void mo192418l() {
        RichTextEmojiconEditText q;
        RichTextEmojiconEditText q2;
        Editable text;
        TextInputSupportPlugin cVar = this.f139830e;
        if (!(cVar == null || (q2 = cVar.mo146904l()) == null || (text = q2.getText()) == null)) {
            text.clear();
        }
        TextInputSupportPlugin cVar2 = this.f139830e;
        if (cVar2 != null && (q = cVar2.mo146904l()) != null) {
            q.setMovementMethod(ArrowKeyMovementMethod.getInstance());
        }
    }

    /* renamed from: o */
    public final void mo192421o() {
        PhotoKBPlugin bVar;
        PhotoKBPlugin bVar2 = this.f139827a;
        if (bVar2 != null) {
            bVar2.mo147816b(9 - this.f139834i.size());
        }
        if (this.f139834i.size() == RangesKt.coerceAtLeast(8, 0) && (bVar = this.f139827a) != null) {
            bVar.mo147826o();
        }
    }

    /* renamed from: s */
    public final List<TodoAttachment> mo192425s() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f139834i.iterator();
        while (it.hasNext()) {
            TodoAttachment a = mo192406a((CommentImage) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getCommentDraftLv(), new C56528i(this));
        mo92103a(qVar.getCommentKeyboardVisible(), new C56529j(this));
        mo92103a(qVar.getCommentAtUserInfo(), new C56530k(this));
        mo92103a(qVar.getCommentInitChatId(), new C56531l(this));
        mo92103a(qVar.getCommentInsertAtTag(), new C56532m(this));
        mo92103a(qVar.getCommentShowRichText(), new C56533n(this));
    }

    /* renamed from: m */
    public final void mo192419m() {
        RichTextEmojiconEditText q;
        RichText richText;
        if (this.f139835j) {
            Object systemService = mo92106c().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f139828b.getWindowToken(), 0);
                KeyBoard fVar = this.f139829d;
                if (fVar != null) {
                    IActionDispatcher d = mo92107d();
                    boolean z = !mo192424r();
                    int f = fVar.mo146825f();
                    String r = fVar.mo146837r();
                    RichTextEmojiconEditText k = mo192417k();
                    if (k != null) {
                        richText = k.getRichText();
                    } else {
                        richText = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = this.f139834i.iterator();
                    while (it.hasNext()) {
                        TodoAttachment a = mo192406a((CommentImage) it.next());
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    d.mo92066a(132, (IActionData) new CommentKeyboardStateInfo(false, z, f, r, richText, arrayList));
                }
                TextInputSupportPlugin cVar = this.f139830e;
                if (!(cVar == null || (q = cVar.mo146904l()) == null)) {
                    q.clearFocus();
                }
                this.f139835j = false;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$3$1", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$a */
    public static final class C56517a implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ CommentKeyboardSection f139837a;

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
        }

        C56517a(CommentKeyboardSection kVar) {
            this.f139837a = kVar;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            RichText richText;
            if (z) {
                IActionDispatcher d = this.f139837a.mo92107d();
                boolean z2 = !this.f139837a.mo192424r();
                RichTextEmojiconEditText k = this.f139837a.mo192417k();
                if (k != null) {
                    richText = k.getRichText();
                } else {
                    richText = null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.f139837a.mo192416j().iterator();
                while (it.hasNext()) {
                    TodoAttachment a = this.f139837a.mo192406a((CommentImage) it.next());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                d.mo92066a(132, (IActionData) new CommentKeyboardStateInfo(z, z2, i, str, richText, arrayList));
                PhotoKBPlugin bVar = this.f139837a.f139827a;
                if (bVar != null) {
                    bVar.mo147816b(9 - this.f139837a.mo192416j().size());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u000e2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u0016J(\u0010\u0018\u001a\u00020\u000e2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0015j\b\u0012\u0004\u0012\u00020\u0005`\u00172\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0016\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0016J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016¨\u0006$"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$addPhotoPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "extractVideoFrame", "Lio/reactivex/Observable;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "isEnablePostSendVideo", "", "isVideoEnabled", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "sendFile", "fileList", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "sendImage", "photoPaths", "isKeepOriginPic", "sendVideo", "videoPaths", "", "uploadEncryptImage", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$g */
    public static final class C56523g implements IPhotoDependency {

        /* renamed from: a */
        final /* synthetic */ CommentKeyboardSection f139841a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$g$a */
        static final class C56524a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            public static final C56524a f139842a = new C56524a();

            C56524a() {
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<Map<String, IPhotoDependency.FrameInfo>> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "it");
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122040a(ArrayList<File> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "fileList");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122041a(ArrayList<String> arrayList, boolean z) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoPaths");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public boolean mo122042a() {
            return false;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoPaths");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public boolean mo122044b() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56523g(CommentKeyboardSection kVar) {
            this.f139841a = kVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<Map<String, IPhotoDependency.FrameInfo>> mo122036a(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoInfos");
            Observable<Map<String, IPhotoDependency.FrameInfo>> create = Observable.create(C56524a.f139842a);
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create {}");
            return create;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "kotlin.jvm.PlatformType", "photo", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$g$b */
        public static final class C56525b<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C56523g f139843a;

            /* renamed from: b */
            final /* synthetic */ boolean f139844b;

            /* renamed from: c */
            final /* synthetic */ AbstractC25974h f139845c;

            C56525b(C56523g gVar, boolean z, AbstractC25974h hVar) {
                this.f139843a = gVar;
                this.f139844b = z;
                this.f139845c = hVar;
            }

            /* renamed from: a */
            public final Observable<IPhotoDependency.Image> apply(final String str) {
                Intrinsics.checkParameterIsNotNull(str, "photo");
                return TodoDependencyHolder.f139242a.mo191730a().imageDependency().mo145388a(this.f139843a.f139841a.mo92106c(), str, Boolean.valueOf(this.f139844b), (Boolean) true, this.f139845c).map(new Function<T, R>(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentKeyboardSection.C56523g.C56525b.C565261 */

                    /* renamed from: a */
                    final /* synthetic */ C56525b f139846a;

                    {
                        this.f139846a = r1;
                    }

                    /* renamed from: a */
                    public final IPhotoDependency.Image apply(EncryptImageData encryptImageData) {
                        int i;
                        Intrinsics.checkParameterIsNotNull(encryptImageData, "it");
                        int[] b = C57820d.m224436b(encryptImageData.f73837a);
                        List listOf = CollectionsKt.listOf(encryptImageData.f73837a);
                        int i2 = 88;
                        if (b[0] <= 0) {
                            i = 88;
                        } else {
                            i = b[0];
                        }
                        if (b[1] > 0) {
                            i2 = b[1];
                        }
                        String str = encryptImageData.f73838b;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it.token");
                        IPhotoDependency.Image image = new IPhotoDependency.Image(listOf, i, i2, str);
                        CommentKeyboardSection kVar = this.f139846a.f139843a.f139841a;
                        String str2 = str;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "photo");
                        kVar.mo192408a(encryptImageData, image, str2);
                        return image;
                    }
                });
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122039a(C58633e.C58634a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            C58633e.C58634a c = aVar.mo198695b(9 - this.f139841a.mo192416j().size()).mo198698c(9);
            Context c2 = this.f139841a.mo92106c();
            if (c2 != null) {
                c.mo198693a((Activity) c2, 911);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122038a(C58557a.C58559a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            C58557a.C58559a j = aVar.mo198506a(9 - this.f139841a.mo192416j().size()).mo198513b(9).mo198532o(false).mo198525h(false).mo198527j(true);
            Context c = this.f139841a.mo92106c();
            if (c != null) {
                j.mo198510a((Activity) c, 233);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            CommentKeyboardSection kVar = this.f139841a;
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new CommentImage(it.next(), CommentImage.Companion.ImageInfoType.PATH));
            }
            kVar.mo192414a(arrayList);
            Observable<IPhotoDependency.Image> concatMap = Observable.fromIterable(list2).concatMap(new C56525b(this, z, hVar));
            Intrinsics.checkExpressionValueIsNotNull(concatMap, "Observable.fromIterable(…  }\n                    }");
            return concatMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentDraftInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$i */
    static final class C56528i extends Lambda implements Function1<CommentDraftInfo, Unit> {
        final /* synthetic */ CommentKeyboardSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56528i(CommentKeyboardSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommentDraftInfo fVar) {
            invoke(fVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CommentDraftInfo fVar) {
            this.this$0.mo192410a(fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$j */
    static final class C56529j extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CommentKeyboardSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56529j(CommentKeyboardSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192415a(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAtUserInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$k */
    static final class C56530k extends Lambda implements Function1<CommentAtUserInfo, Unit> {
        final /* synthetic */ CommentKeyboardSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56530k(CommentKeyboardSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommentAtUserInfo cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CommentAtUserInfo cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            this.this$0.mo192409a(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$l */
    static final class C56531l extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ CommentKeyboardSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56531l(CommentKeyboardSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            this.this$0.mo192413a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$m */
    static final class C56532m extends Lambda implements Function1<AtChatterBean, Unit> {
        final /* synthetic */ CommentKeyboardSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56532m(CommentKeyboardSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtChatterBean cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(AtChatterBean cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            this.this$0.mo192411a(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$n */
    static final class C56533n extends Lambda implements Function1<RichTextShowBean, Unit> {
        final /* synthetic */ CommentKeyboardSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56533n(CommentKeyboardSection kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RichTextShowBean tVar) {
            invoke(tVar);
            return Unit.INSTANCE;
        }

        public final void invoke(RichTextShowBean tVar) {
            CommentKeyboardSection kVar = this.this$0;
            Intrinsics.checkExpressionValueIsNotNull(tVar, "it");
            kVar.mo192412a(tVar);
        }
    }

    /* renamed from: a */
    public final void mo192415a(boolean z) {
        if (z) {
            m220264u();
            m220263t();
            return;
        }
        mo192420n();
        mo192419m();
    }

    /* renamed from: b */
    private final void m220261b(KeyBoard fVar) {
        AtKBPlugin aVar = new AtKBPlugin("", false, false, new C56518c());
        fVar.mo146806a("at", aVar);
        this.f139831f = aVar;
    }

    /* renamed from: c */
    private final void m220262c(KeyBoard fVar) {
        PhotoKBPlugin bVar = new PhotoKBPlugin(false, false, new C56523g(this));
        bVar.mo147821f(false);
        this.f139827a = bVar;
        if (bVar != null) {
            fVar.mo146806a("photo", bVar);
        }
    }

    /* renamed from: a */
    public final void mo192411a(AtChatterBean cVar) {
        TodoAtController aVar = this.f139832g;
        if (aVar != null) {
            aVar.mo192234a(cVar.mo192982a(), cVar.mo192984b(), cVar.mo192985c());
        }
    }

    /* renamed from: a */
    public final void mo192412a(RichTextShowBean tVar) {
        RichTextEmojiconEditText k = mo192417k();
        if (k != null) {
            mo92107d().mo92067a(SmEvents.EVENT_UA_ERROR, TodoKeyboardUtil.m220375a(tVar.mo193043b(), k, tVar.mo193042a(), tVar.mo193044c()));
        }
    }

    /* renamed from: a */
    private final void m220260a(KeyBoard fVar) {
        String string = UIHelper.getString(R.string.Todo_Task_AddAComment);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Todo_Task_AddAComment)");
        C56519d dVar = new C56519d(this, true, string, UIHelper.getColor(R.color.text_placeholder), new C56520e(), new C56521f(this), null, false);
        dVar.mo147248a(IOutInputSupport.InputSupportType.THREADPOSTINPUT);
        fVar.mo146804a("text", dVar);
        this.f139830e = dVar;
    }

    /* renamed from: a */
    public final TodoAttachment mo192406a(CommentImage commentImage) {
        int i = C56534l.f139848a[commentImage.mo192328b().ordinal()];
        if (i == 1) {
            return this.f139833h.get(commentImage.mo192327a());
        }
        if (i == 2) {
            return new TodoAttachment.C19641a().mo66639a(TodoAttachment.Type.IMAGE).mo66640a(commentImage.mo192327a()).mo66644d(CommentConstants.f139800a.mo192375a()).build();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final void mo192409a(CommentAtUserInfo cVar) {
        boolean z;
        RichTextEmojiconEditText k = mo192417k();
        if (k != null) {
            Editable editableText = k.getEditableText();
            Intrinsics.checkExpressionValueIsNotNull(editableText, "it.editableText");
            if (editableText.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f139833h.isEmpty()) {
                k.setSelection(cVar.mo192371d());
                k.mo146917a(cVar.mo192368a(), cVar.mo192369b(), cVar.mo192370c(), false);
                k.setSelection(k.length());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection$addInputPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin;", "getLayoutId", "", "onInitView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "rootView", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.k$d */
    public static final class C56519d extends TextInputSupportPlugin {

        /* renamed from: q */
        final /* synthetic */ CommentKeyboardSection f139838q;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
        /* renamed from: i */
        public int mo147089i() {
            return R.layout.kb_input_normal_old;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
        /* renamed from: a */
        public View mo147031a(Activity activity, View view) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            View a = super.mo147031a(activity, view);
            RichTextEmojiconEditText q = mo146904l();
            if (q != null) {
                q.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
                q.setVerticalScrollBarEnabled(true);
                mo147259c(true);
            }
            return a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56519d(CommentKeyboardSection kVar, boolean z, CharSequence charSequence, int i, AbstractC58541b bVar, OnSendTextCallback bVar2, IOnLifeCallback aVar, boolean z2) {
            super(z, charSequence, i, bVar, bVar2, aVar, z2);
            this.f139838q = kVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentKeyboardSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139828b = view;
        Context c = mo92106c();
        if (c != null) {
            this.f139832g = new TodoAtController((FragmentActivity) c, new TodoAtController.InsertAtTagListener(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentKeyboardSection.C565151 */

                /* renamed from: a */
                final /* synthetic */ CommentKeyboardSection f139836a;

                @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                /* renamed from: a */
                public void mo192121a(String str) {
                    Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                }

                @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                /* renamed from: a */
                public void mo192120a() {
                    TodoAtController.InsertAtTagListener.C56450a.m220035a(this);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139836a = r1;
                }

                @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                /* renamed from: a */
                public void mo192123a(boolean z) {
                    TodoAtController.InsertAtTagListener.C56450a.m220036a(this, z);
                }

                @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                /* renamed from: b */
                public boolean mo192124b(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "userId");
                    return TodoAtController.InsertAtTagListener.C56450a.m220037a(this, str);
                }

                @Override // com.ss.android.lark.todo.impl.features.detail.at.TodoAtController.InsertAtTagListener
                /* renamed from: a */
                public void mo192122a(String str, String str2) {
                    Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
                    Intrinsics.checkParameterIsNotNull(str2, "displayName");
                    this.f139836a.mo92107d().mo92066a(64, (IActionData) new AtChatterBean(str, str2, false, 4, null));
                }
            }, false, false, false, 24, null);
            Context c2 = mo92106c();
            if (c2 != null) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.keyboardContainer);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.keyboardContainer");
                KeyBoard fVar2 = new KeyBoard((Activity) c2, frameLayout, new IKeyBoardDependency() {
                    /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentKeyboardSection.C565162 */

                    @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                    /* renamed from: a */
                    public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
                        Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
                    }

                    @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                    /* renamed from: a */
                    public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
                    }

                    @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
                    /* renamed from: a */
                    public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "callback");
                    }
                }, null, null, false, 56, null);
                m220260a(fVar2);
                m220261b(fVar2);
                m220262c(fVar2);
                fVar2.mo146796a(new C56517a(this));
                fVar2.mo146814b(R.color.transparent);
                TransationData jVar = new TransationData();
                jVar.mo147176a("param_show_edit_cursor", false);
                fVar2.mo146799a(jVar);
                this.f139829d = fVar2;
                mo192420n();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo192407a(int i, Intent intent) {
        boolean z;
        PhotoKBPlugin bVar;
        PhotoKBPlugin.IOnUploadPhotoAPI e;
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i == 233 || i == 911) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS");
            boolean z2 = false;
            boolean booleanExtra = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
            if (i == 233) {
                z = intent.getBooleanExtra("KEY_FOR_SEND", false);
            } else if (i != 911) {
                z = false;
            } else {
                z = intent.getBooleanExtra("is_send_photo", false);
            }
            if (z) {
                ArrayList<String> arrayList = stringArrayListExtra;
                if (arrayList == null || arrayList.isEmpty()) {
                    z2 = true;
                }
                if (!z2 && (bVar = this.f139827a) != null && (e = bVar.mo147820e()) != null) {
                    e.mo147835a(stringArrayListExtra, booleanExtra, new C56527h());
                    return;
                }
                return;
            }
            intent.putExtra("KEY_FOR_SEND", false);
            PhotoKBPlugin bVar2 = this.f139827a;
            if (bVar2 != null) {
                bVar2.mo147292a(233, intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo192408a(EncryptImageData encryptImageData, IPhotoDependency.Image image, String str) {
        TodoAttachment a = new TodoAttachment.C19641a().mo66639a(TodoAttachment.Type.IMAGE).mo66640a(image.getToken()).mo66642b(String.valueOf(C3117e.m12985b(new File(encryptImageData.f73837a)))).mo66643c((String) CollectionsKt.firstOrNull((List) image.getUrls())).mo66644d(CommentConstants.f139800a.mo192375a()).build();
        Map<String, TodoAttachment> map = this.f139833h;
        Intrinsics.checkExpressionValueIsNotNull(a, "attachment");
        map.put(str, a);
    }
}
