package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.statistics.ImagePreviewHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/gallery/function/action/SaveStickerAction;", "Lcom/ss/android/lark/widget/photo_picker/gallery/function/action/IFuncAction;", "context", "Landroid/content/Context;", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "(Landroid/content/Context;Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "getPhotoItem", "()Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "getAction", "Ljava/lang/Runnable;", "getDesktopIconRes", "", "getPhoneMenuDesc", "isValid", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.h */
public final class SaveStickerAction implements AbstractC58768d {

    /* renamed from: a */
    private final String f145284a = "SaveStickerAction";

    /* renamed from: b */
    private final Context f145285b;

    /* renamed from: c */
    private final PhotoItem f145286c;

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return R.drawable.ud_icon_emoji_add_outlined;
    }

    /* renamed from: b */
    public final Context mo199202b() {
        return this.f145285b;
    }

    /* renamed from: f */
    public final PhotoItem mo199203f() {
        return this.f145286c;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new RunnableC58780a(this);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        return UIUtils.getString(this.f145285b, R.string.Lark_Legacy_AddStickerForChat);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.h$a */
    public static final class RunnableC58780a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SaveStickerAction f145287a;

        RunnableC58780a(SaveStickerAction hVar) {
            this.f145287a = hVar;
        }

        public final void run() {
            PhotoItem f = this.f145287a.mo199203f();
            if (f != null) {
                ImagePreviewHitPoint.f145429a.mo199304b("sticker_save", "none");
                C58612c.m227290a().mo102847a(f.getImageKey(), f.getMessageId(), new C58781a(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/widget/photo_picker/gallery/function/action/SaveStickerAction$getAction$1$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.h$a$a */
        public static final class C58781a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ RunnableC58780a f145288a;

            C58781a(RunnableC58780a aVar) {
                this.f145288a = aVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                LKUIToast.show(this.f145288a.f145287a.mo199202b(), (int) R.string.Lark_Legacy_AddStickerSuccess);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                LKUIToast.show(this.f145288a.f145287a.mo199202b(), errorResult.getDisplayMsg());
            }
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        boolean z;
        boolean z2;
        PhotoItem photoItem = this.f145286c;
        if (photoItem == null || photoItem.isVideo()) {
            return false;
        }
        PhotoItem.TranslateProperty translateProperty = photoItem.getTranslateProperty();
        if (translateProperty != null) {
            z = translateProperty.isTranslated();
        } else {
            z = false;
        }
        if (z || TextUtils.isEmpty(photoItem.getImageKey()) || TextUtils.isEmpty(photoItem.getMessageId())) {
            return false;
        }
        MessageIdentity messageIdentity = photoItem.getMessageIdentity();
        if (messageIdentity != null) {
            z2 = messageIdentity.isHideStickerSave();
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    public SaveStickerAction(Context context, PhotoItem photoItem) {
        this.f145285b = context;
        this.f145286c = photoItem;
    }
}
