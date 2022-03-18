package com.ss.android.lark.chatbase.keyboard;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.chat.service.impl.C34146aa;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.C40966m;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerSetListener;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.widget.photo_picker.C58557a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001GB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016JH\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0016JP\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\tH\u0016Jb\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\t2\u0010\u0010&\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010'H\u0016J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00112\u0006\u0010-\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u000eH\u0016J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u000eH\u0016J\u0010\u00108\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0016J\u0010\u00109\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0016J\u0010\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\tH\u0016J\b\u0010<\u001a\u00020\u0011H\u0016J\u0016\u0010<\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013H\u0016J\u0010\u0010=\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010>\u001a\u00020\u00112\u0006\u0010-\u001a\u000200H\u0016J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\tH\u0016J\u001e\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016J.\u0010B\u001a\u00020\u00112\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010D2\u0006\u0010E\u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020F0\u0013H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/ss/android/lark/chatbase/keyboard/FaceKBPluginDependency;", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "facePluginDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;", "(Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;)V", "mStickerService", "Lcom/ss/android/lark/dependency/IStickerDependency;", "kotlin.jvm.PlatformType", "getCurrentUserId", "", "getLocalStickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "stickerKey", "width", "", "height", "getLocalStickerSets", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "getLocalStickers", "Lcom/ss/android/lark/chat/entity/sticker/Sticker;", "getRecentEmojiList", "getStickers", "getWholeEmojiList", "loadSticker", "context", "Landroid/content/Context;", "permanent", "", "key", "view", "Landroid/widget/ImageView;", "placeholder", "errorRes", "path", "listener", "Lcom/ss/android/lark/image/api/RequestListener;", "parseActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "preDownloadStickerSet", "registerStickerPushListener", "pushStickerSetListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerListener;", "registerStickerSetPushListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerSetListener;", "sendStickerMsg", "stickerFileInfo", "startLarkStickerManagerActivity", "activity", "Landroid/app/Activity;", "requestCode", "startSelectAddStickerActivity", "startStickerSetManagerActivity", "startStickerSetShopActivity", "statFaceSelectEvent", "faceTag", "syncReactionOrder", "unRegisterStickerPushListener", "unRegisterStickerSetPushListener", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "uploadStickers", "stickerUrls", "", "keepOrigin", "Lcom/ss/android/lark/keyboard/plugin/tool/face/UploadStickerResult;", "ISendStickerMsgCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatbase.a.b */
public final class FaceKBPluginDependency implements IFaceDependency {

    /* renamed from: a */
    private final IStickerDependency f88877a;

    /* renamed from: b */
    private final FacePluginDependency f88878b;

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127084a(List<String> list, boolean z, IGetDataCallback<C40966m> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f88877a.mo134386a(list, z, new C34415a(iGetDataCallback));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127080a(IPushStickerSetListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "pushStickerSetListener");
        this.f88877a.mo134383a(iVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127079a(IPushStickerListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "pushStickerSetListener");
        this.f88877a.mo134382a(hVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127082a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "faceTag");
        ChatHitPoint.f135648a.mo187352a(str);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127083a(String str, IGetDataCallback<Integer> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C34146aa.m132620b().mo121408a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: c */
    public void mo127091c() {
        this.f88877a.mo134392c();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: g */
    public void mo127095g() {
        C35234b.m137579e().mo121399a();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public List<Sticker> mo127072a() {
        IStickerDependency iStickerDependency = this.f88877a;
        Intrinsics.checkExpressionValueIsNotNull(iStickerDependency, "mStickerService");
        List<Sticker> a = iStickerDependency.mo134375a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mStickerService.localStickers");
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public List<Sticker> mo127085b() {
        IStickerDependency iStickerDependency = this.f88877a;
        Intrinsics.checkExpressionValueIsNotNull(iStickerDependency, "mStickerService");
        List<Sticker> b = iStickerDependency.mo134388b();
        Intrinsics.checkExpressionValueIsNotNull(b, "mStickerService.stickers");
        return b;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: d */
    public String mo127092d() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        String a = N.mo134394a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…().loginDependency.userId");
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: e */
    public List<String> mo127093e() {
        C35234b e = C35234b.m137579e();
        Intrinsics.checkExpressionValueIsNotNull(e, "ReactionOrderService.inst()");
        List<String> d = e.mo121404d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ReactionOrderService.inst().allRecentReactionList");
        return d;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: f */
    public List<String> mo127094f() {
        C35234b e = C35234b.m137579e();
        Intrinsics.checkExpressionValueIsNotNull(e, "ReactionOrderService.inst()");
        List<String> c = e.mo121403c();
        Intrinsics.checkExpressionValueIsNotNull(c, "ReactionOrderService.inst().wholeReactionList");
        return c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatbase/keyboard/FaceKBPluginDependency$uploadStickers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dependency/IStickerDependency$UploadStickersResult;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "uploadStickersResult", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatbase.a.b$a */
    public static final class C34415a implements IGetDataCallback<IStickerDependency.C36449a> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f88879a;

        C34415a(IGetDataCallback iGetDataCallback) {
            this.f88879a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(IStickerDependency.C36449a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "uploadStickersResult");
            this.f88879a.onSuccess(new C40966m(aVar.mo134393a()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            if (errorResult.getErrorCode() == 1) {
                errorResult = new ErrorResult(1, errorResult.getErrorMsg());
            }
            this.f88879a.onError(errorResult);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127081a(C40964l lVar) {
        FacePluginDependency fVar = this.f88878b;
        if (fVar != null) {
            fVar.mo122021a(lVar);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127078a(IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f88877a.mo134381a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127087b(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C35234b.m137579e().mo121400a(iGetDataCallback);
    }

    public FaceKBPluginDependency(FacePluginDependency fVar) {
        this.f88878b = fVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f88877a = b.mo134502A();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127086b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134502A().mo134389b(activity);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127073a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134502A().mo134376a(activity);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127088b(IPushStickerListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "pushStickerSetListener");
        this.f88877a.mo134390b(hVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127089b(IPushStickerSetListener iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "pushStickerSetListener");
        this.f88877a.mo134391b(iVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: b */
    public void mo127090b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C35234b.m137579e().mo121401a(str);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127074a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C58557a.C58559a o = C58557a.m227127a().mo198526i(false).mo198524g(true).mo198525h(false).mo198531n(false).mo198532o(false);
        FacePluginDependency fVar = this.f88878b;
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        o.mo198512a(context, fVar.mo122020a(), i);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public C40964l mo127071a(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "stickerKey");
        IStickerDependency.StickerFileInfo b = this.f88877a.mo134387b(str);
        C40964l a = new C40964l.C40965a(b.key).mo147630a(b.url).mo147633b(b.filePath).mo147629a(i).mo147632b(i2).mo147631a();
        Intrinsics.checkExpressionValueIsNotNull(a, "com.ss.android.lark.keyb…)\n                .buid()");
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127075a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        this.f88877a.mo134378a(context, z, i, i2, str, imageView, i3, i4);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127076a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(str2, "path");
        this.f88877a.mo134379a(context, z, i, i2, str, imageView, i3, i4, str2);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.face.IFaceDependency
    /* renamed from: a */
    public void mo127077a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h<?, ?> hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(str2, "path");
        this.f88877a.mo134380a(context, z, i, i2, str, imageView, i3, i4, str2, hVar);
    }
}
