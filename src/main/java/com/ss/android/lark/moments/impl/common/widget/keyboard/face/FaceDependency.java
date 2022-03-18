package com.ss.android.lark.moments.impl.common.widget.keyboard.face;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.C40966m;
import com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerSetListener;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016JH\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016JP\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0016Jb\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00042\u0010\u0010!\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\tH\u0016J\u0018\u00102\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00101\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020\f2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\fH\u0016J\u0016\u00107\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eH\u0016J\u0010\u00108\u001a\u00020\f2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u00109\u001a\u00020\f2\u0006\u0010(\u001a\u00020+H\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0004H\u0016J\u001e\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J.\u0010=\u001a\u00020\f2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u001a2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020A0\u000eH\u0016¨\u0006B"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/face/FaceDependency;", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "()V", "getCurrentUserId", "", "getLocalStickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "stickerKey", "width", "", "height", "getLocalStickerSets", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "getLocalStickers", "Lcom/ss/android/lark/chat/entity/sticker/Sticker;", "getRecentEmojiList", "getStickers", "getWholeEmojiList", "loadSticker", "context", "Landroid/content/Context;", "permanent", "", "key", "view", "Landroid/widget/ImageView;", "placeholder", "errorRes", "path", "listener", "Lcom/ss/android/lark/image/api/RequestListener;", "parseActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "preDownloadStickerSet", "registerStickerPushListener", "pushStickerSetListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerListener;", "registerStickerSetPushListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerSetListener;", "sendStickerMsg", "stickerFileInfo", "startLarkStickerManagerActivity", "activity", "Landroid/app/Activity;", "requestCode", "startSelectAddStickerActivity", "startStickerSetManagerActivity", "startStickerSetShopActivity", "statFaceSelectEvent", "faceTag", "syncReactionOrder", "unRegisterStickerPushListener", "unRegisterStickerSetPushListener", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "uploadStickers", "stickerUrls", "", "keepOrigin", "Lcom/ss/android/lark/keyboard/plugin/tool/face/UploadStickerResult;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.a.a */
public final class FaceDependency implements IFaceDependency {
    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127073a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127074a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127075a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(imageView, "view");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127076a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(str2, "path");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127077a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h<?, ?> hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(str2, "path");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127078a(IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127079a(IPushStickerListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "pushStickerSetListener");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127080a(IPushStickerSetListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "pushStickerSetListener");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127081a(C40964l lVar) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127082a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "faceTag");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127084a(List<String> list, boolean z, IGetDataCallback<C40966m> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127086b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127088b(IPushStickerListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "pushStickerSetListener");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127089b(IPushStickerSetListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "pushStickerSetListener");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: c */
    public void mo127091c() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127083a(String str, IGetDataCallback<Integer> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144703a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public List<Sticker> mo127072a() {
        return new ArrayList();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public List<Sticker> mo127085b() {
        return new ArrayList();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: d */
    public String mo127092d() {
        return MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: e */
    public List<String> mo127093e() {
        return MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144704b();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: f */
    public List<String> mo127094f() {
        return MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144706c();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: g */
    public void mo127095g() {
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144707d();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127087b(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144699a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127090b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144702a(str);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public C40964l mo127071a(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "stickerKey");
        C40964l a = new C40964l.C40965a("stickerFileInfo.key").mo147629a(i).mo147632b(i2).mo147631a();
        Intrinsics.checkExpressionValueIsNotNull(a, "StickerFileInfo.Builder(…t(height)\n        .buid()");
        return a;
    }
}
