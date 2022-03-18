package com.ss.android.lark.keyboard.dependency;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0005H&J\u001e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0003H&J(\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH&J\u001a\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0005H&¨\u0006\""}, d2 = {"Lcom/ss/android/lark/keyboard/dependency/IKeyboardDependency;", "", "checkToShow", "", "key", "", "completeGuide", "", "getDocFromContent", "content", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/doc/entity/DocResult;", "getDocInlineBlueIcon", "", "docType", "Lcom/ss/android/lark/doc/entity/DocType;", "getFileUploadAuthorizatedDenyCode", "getUploadAuthorizationTip", "getUrlInlineFromContent", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "isFeatureGatingEnable", "featureName", "isKeyboardEnableEnterSend", "loadImage", "url", "view", "Landroid/widget/ImageView;", "width", "height", "onAuthorizatedDeny", "context", "Landroid/content/Context;", "action", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.a.a */
public interface IKeyboardDependency {
    /* renamed from: a */
    int mo133166a(DocType docType);

    /* renamed from: a */
    void mo133167a(Context context, String str);

    /* renamed from: a */
    void mo133168a(String str, ImageView imageView, int i, int i2);

    /* renamed from: a */
    void mo133169a(String str, IGetDataCallback<DocResult> iGetDataCallback);

    /* renamed from: a */
    boolean mo133170a();

    /* renamed from: a */
    boolean mo133171a(String str);

    /* renamed from: b */
    int mo133172b();

    /* renamed from: b */
    void mo133173b(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback);

    /* renamed from: b */
    boolean mo133174b(String str);

    /* renamed from: c */
    String mo133175c();

    /* renamed from: c */
    void mo133176c(String str);
}
