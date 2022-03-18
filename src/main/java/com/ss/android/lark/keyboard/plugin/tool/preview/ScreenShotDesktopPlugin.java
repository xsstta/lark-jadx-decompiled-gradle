package com.ss.android.lark.keyboard.plugin.tool.preview;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.utils.KBHoverUtil;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.span.UrlImageSpan;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'H\u0016J\u001e\u0010(\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020\u0014H\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u00020\u0014H\u0002J\u0016\u00104\u001a\u00020\u00142\f\u00105\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\u0010\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0010H\u0016J\u0018\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020+2\u0006\u00107\u001a\u00020\fH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/ScreenShotDesktopPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;", "isSecret", "", "showHoverTips", "mDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenShotDependency;", "(ZZLcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenShotDependency;)V", "filePreviewDialog", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialog;", "mContext", "Landroid/content/Context;", "mIcon", "Landroid/view/View;", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "doInsertImageToPostInput", "", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "isPostInputMode", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onNegativeClick", "dialog", "Landroid/app/Dialog;", "onPositiveClick", "filePaths", "", "", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onVisibleChanged", "isVisible", "requestScreenShot", "scheduleInsertImageToPostInput", "paths", "setKeyBoardContext", "context", "showPreviewDialog", "path", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.f */
public class ScreenShotDesktopPlugin implements IKeyBoardPlugin, FilePreviewDialogCallback {

    /* renamed from: e */
    public static final Companion f103938e = new Companion(null);

    /* renamed from: a */
    public IKeyBoardPlugin.IKeyBoardContext f103939a;

    /* renamed from: b */
    public CommonLoadingDialog f103940b;

    /* renamed from: c */
    public Context f103941c;

    /* renamed from: d */
    public final boolean f103942d;

    /* renamed from: f */
    private View f103943f;

    /* renamed from: g */
    private FilePreviewDialog f103944g;

    /* renamed from: h */
    private final boolean f103945h;

    /* renamed from: i */
    private final IScreenShotDependency f103946i;

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/ScreenShotDesktopPlugin$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
    /* renamed from: a */
    public boolean mo122058a(Dialog dialog) {
        Intrinsics.checkParameterIsNotNull(dialog, "dialog");
        dialog.dismiss();
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
    /* renamed from: a */
    public boolean mo122059a(Dialog dialog, List<String> list) {
        Intrinsics.checkParameterIsNotNull(dialog, "dialog");
        Intrinsics.checkParameterIsNotNull(list, "filePaths");
        String str = list.get(0);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        dialog.dismiss();
        boolean a = this.f103946i.mo122124a(CollectionsKt.listOf(str));
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103939a;
        if (bVar != null) {
            bVar.mo147379v();
        }
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        View view = this.f103943f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        View view = this.f103943f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        View view = this.f103943f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/preview/ScreenShotDesktopPlugin$scheduleInsertImageToPostInput$1", "Lio/reactivex/Observer;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.f$e */
    public static final class C40898e implements AbstractC69009q<IPhotoDependency.Image> {

        /* renamed from: a */
        final /* synthetic */ ScreenShotDesktopPlugin f103951a;

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f103951a.f103939a;
            if (bVar != null) {
                bVar.mo147375j();
            }
            CommonLoadingDialog commonLoadingDialog = this.f103951a.f103940b;
            if (commonLoadingDialog != null) {
                commonLoadingDialog.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40898e(ScreenShotDesktopPlugin fVar) {
            this.f103951a = fVar;
        }

        /* renamed from: a */
        public void onNext(IPhotoDependency.Image image) {
            Intrinsics.checkParameterIsNotNull(image, "t");
            this.f103951a.mo147495a(image);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            Activity activity = null;
            if (!TextUtils.isEmpty(th.getMessage())) {
                IKeyBoardPlugin.IKeyBoardContext bVar = this.f103951a.f103939a;
                if (bVar != null) {
                    activity = bVar.mo147365B();
                }
                LKUIToast.show(activity, th.getMessage());
            } else {
                IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103951a.f103939a;
                if (bVar2 != null) {
                    activity = bVar2.mo147365B();
                }
                LKUIToast.show(activity, (int) R.string.Lark_Legacy_FailedToUploadTheImage);
            }
            IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f103951a.f103939a;
            if (bVar3 != null) {
                bVar3.mo147375j();
            }
            CommonLoadingDialog commonLoadingDialog = this.f103951a.f103940b;
            if (commonLoadingDialog != null) {
                commonLoadingDialog.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo147494a() {
        this.f103946i.mo122123a(new C40897d(this));
    }

    /* renamed from: b */
    public final boolean mo147498b() {
        IOutInputSupport.InputSupportType inputSupportType;
        IOutInputSupport z;
        IOutInputSupport z2;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103939a;
        IOutInputSupport.InputSupportType inputSupportType2 = null;
        if (bVar == null || (z2 = bVar.mo147381z()) == null) {
            inputSupportType = null;
        } else {
            inputSupportType = z2.mo146905m();
        }
        if (inputSupportType != IOutInputSupport.InputSupportType.POSTINPUT) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103939a;
            if (!(bVar2 == null || (z = bVar2.mo147381z()) == null)) {
                inputSupportType2 = z.mo146905m();
            }
            if (inputSupportType2 == IOutInputSupport.InputSupportType.THREADPOSTINPUT) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/preview/ScreenShotDesktopPlugin$requestScreenShot$1", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/IScreenshotCallBack;", "onFail", "", "errCode", "", "onSuccess", "path", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.f$d */
    public static final class C40897d implements IScreenshotCallBack {

        /* renamed from: b */
        final /* synthetic */ ScreenShotDesktopPlugin f103950b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40897d(ScreenShotDesktopPlugin fVar) {
            this.f103950b = fVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.IScreenshotCallBack
        /* renamed from: a */
        public void mo147492a(int i) {
            if (i == 1) {
                LKUIToast.show(ScreenShotDesktopPlugin.m161928a(this.f103950b), (int) R.string.Lark_Legacy_CurrentVersionNotSupport);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.IScreenshotCallBack
        /* renamed from: a */
        public void mo147493a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            if (!this.f103950b.mo147498b()) {
                ScreenShotDesktopPlugin fVar = this.f103950b;
                fVar.mo147496a(str, ScreenShotDesktopPlugin.m161928a(fVar));
                return;
            }
            this.f103950b.mo147497a(CollectionsKt.listOf(str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.f$b */
    public static final class View$OnClickListenerC40893b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ScreenShotDesktopPlugin f103947a;

        View$OnClickListenerC40893b(ScreenShotDesktopPlugin fVar) {
            this.f103947a = fVar;
        }

        public final void onClick(View view) {
            KBHoverUtil.f103302a.mo146863a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin.View$OnClickListenerC40893b.C408941 */
                final /* synthetic */ View$OnClickListenerC40893b this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    Activity activity;
                    IKeyBoardPlugin.IKeyBoardContext bVar = this.this$0.f103947a.f103939a;
                    if (bVar != null) {
                        activity = bVar.mo147365B();
                    } else {
                        activity = null;
                    }
                    C57805b.m224333d(activity, new C57805b.AbstractC57809a(this) {
                        /* class com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin.View$OnClickListenerC40893b.C408941.C408951 */

                        /* renamed from: a */
                        final /* synthetic */ C408941 f103948a;

                        {
                            this.f103948a = r1;
                        }

                        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                        public final void permissionGranted(boolean z) {
                            if (z) {
                                this.f103948a.this$0.f103947a.mo147494a();
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m161928a(ScreenShotDesktopPlugin fVar) {
        Context context = fVar.f103941c;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "pluginContainer.context");
        this.f103941c = context;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103939a = bVar;
    }

    /* renamed from: a */
    public final void mo147495a(IPhotoDependency.Image image) {
        IKeyBoardPlugin.IKeyBoardContext bVar;
        Activity B;
        IKeyBoardPlugin.IKeyBoardContext bVar2;
        IOutInputSupport z;
        EditText l;
        EditText editText;
        IOutInputSupport z2;
        List<String> urls = image.getUrls();
        if (CollectionUtils.isNotEmpty(urls) && (bVar = this.f103939a) != null && (B = bVar.mo147365B()) != null && (bVar2 = this.f103939a) != null && (z = bVar2.mo147381z()) != null && (l = z.mo146904l()) != null) {
            String str = urls.get(0);
            UrlImageSpan rVar = new UrlImageSpan(B, str, l, null, 8, null);
            IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f103939a;
            if (bVar3 == null || (z2 = bVar3.mo147381z()) == null) {
                editText = null;
            } else {
                editText = z2.mo146904l();
            }
            if (editText instanceof RichTextEmojiconEditText) {
                ((RichTextEmojiconEditText) editText).mo146912a(rVar, str, ImageUtils.m224133a(str, image.getWidth(), image.getHeight()), image.getToken(), image.getWidth(), image.getHeight(), true, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo147497a(List<String> list) {
        if (this.f103940b == null) {
            this.f103940b = new CommonLoadingDialog();
        }
        CommonLoadingDialog commonLoadingDialog = this.f103940b;
        if (commonLoadingDialog != null) {
            Context context = this.f103941c;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            commonLoadingDialog.show(context);
        }
        this.f103946i.mo122122a(list, null).observeOn(LarkRxSchedulers.mainThread()).subscribe(new C40898e(this));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f103943f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setEnabled(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.f$c */
    static final class View$OnHoverListenerC40896c implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ ScreenShotDesktopPlugin f103949a;

        View$OnHoverListenerC40896c(ScreenShotDesktopPlugin fVar) {
            this.f103949a = fVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            String string = UIUtils.getString(view.getContext(), R.string.Lark_Legacy_TakeScreenshot);
            KBHoverUtil bVar = KBHoverUtil.f103302a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (!this.f103949a.f103942d) {
                string = null;
            }
            return bVar.mo146864a(view, motionEvent, string);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        Context context = this.f103941c;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        AppCompatImageView a = C40679d.m160786a(context, R.id.toolbox_btn_screenshot, R.drawable.kb_ic_svg_screenshot);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…ble.kb_ic_svg_screenshot)");
        AppCompatImageView appCompatImageView = a;
        this.f103943f = appCompatImageView;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        appCompatImageView.setActivated(this.f103945h);
        View view = this.f103943f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setOnClickListener(new View$OnClickListenerC40893b(this));
        View view2 = this.f103943f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view2.setOnHoverListener(new View$OnHoverListenerC40896c(this));
        View view3 = this.f103943f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return view3;
    }

    /* renamed from: a */
    public final void mo147496a(String str, Context context) {
        FilePreviewDialog bVar;
        FilePreviewDialog bVar2 = new FilePreviewDialog(context, CollectionsKt.listOf(str), this);
        this.f103944g = bVar2;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        if (bVar2.isShowing() && (bVar = this.f103944g) != null) {
            bVar.dismiss();
        }
        FilePreviewDialog bVar3 = this.f103944g;
        if (bVar3 != null) {
            bVar3.show();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IKeyBoardPlugin.C40806a.m161552a(this, i, intent);
    }

    public ScreenShotDesktopPlugin(boolean z, boolean z2, IScreenShotDependency dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "mDependency");
        this.f103945h = z;
        this.f103942d = z2;
        this.f103946i = dVar;
    }
}
