package com.ss.android.lark.chatwindow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.CommonAvatarBinder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0006J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018H\u0016R\u0014\u0010\b\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chatwindow/AvatarKeyIconFactory;", "Lcom/ss/android/lark/multitask/task/Task$IconFactory;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "chatId", "", "(Ljava/lang/String;)V", "TAG", "getTAG", "()Ljava/lang/String;", "binder", "Lcom/larksuite/component/ui/avatar/v2/CommonAvatarBinder;", "Landroid/widget/ImageView;", "Lcom/larksuite/component/ui/avatar/AvatarModel;", "createDrawableForTask", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "task", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "", "imageView", "describeContents", "", "saveArgs", "writeToParcel", "flags", "AvatarBuilder", "CREATOR", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarKeyIconFactory implements Task.IconFactory {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String TAG;
    public final CommonAvatarBinder<ImageView, AvatarModel> binder;
    private final String chatId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chatwindow/AvatarKeyIconFactory$AvatarBuilder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.AvatarKeyIconFactory$a */
    public static final class AvatarBuilder extends AvatarModel.Builder<AvatarBuilder> {
    }

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatwindow/AvatarKeyIconFactory$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/chatwindow/AvatarKeyIconFactory;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/chatwindow/AvatarKeyIconFactory;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.AvatarKeyIconFactory$b */
    public static final class CREATOR implements Parcelable.Creator<AvatarKeyIconFactory> {
        private CREATOR() {
        }

        /* renamed from: a */
        public AvatarKeyIconFactory[] newArray(int i) {
            return new AvatarKeyIconFactory[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public AvatarKeyIconFactory createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new AvatarKeyIconFactory(parcel);
        }
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final String saveArgs() {
        return this.chatId;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatwindow/AvatarKeyIconFactory$createDrawableForTask$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.AvatarKeyIconFactory$c */
    public static final class C35208c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ AvatarKeyIconFactory f90931a;

        /* renamed from: b */
        final /* synthetic */ ImageView f90932b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatwindow.AvatarKeyIconFactory$c$a */
        public static final class RunnableC35209a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35208c f90933a;

            /* renamed from: b */
            final /* synthetic */ AvatarModel f90934b;

            RunnableC35209a(C35208c cVar, AvatarModel avatarModel) {
                this.f90933a = cVar;
                this.f90934b = avatarModel;
            }

            public final void run() {
                this.f90933a.f90931a.binder.mo88915a(this.f90933a.f90932b, this.f90934b);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String tag = this.f90931a.getTAG();
            Log.m165397w(tag, "onError " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AvatarModel k = ((AvatarBuilder) ((AvatarBuilder) ((AvatarBuilder) new AvatarBuilder().mo88962a(chat.getAvatarKey())).mo88967b(chat.getEntityId())).mo88959a(AvatarModel.Size.MIDDLE)).mo88976k();
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC35209a(this, k));
        }

        C35208c(AvatarKeyIconFactory avatarKeyIconFactory, ImageView imageView) {
            this.f90931a = avatarKeyIconFactory;
            this.f90932b = imageView;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AvatarKeyIconFactory(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r2 = r2.readString()
            if (r2 != 0) goto L_0x000e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x000e:
            java.lang.String r0 = "parcel.readString()!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatwindow.AvatarKeyIconFactory.<init>(android.os.Parcel):void");
    }

    public AvatarKeyIconFactory(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.chatId = str;
        this.TAG = "AvatarKeyIconFactory";
        this.binder = new CommonAvatarBinder<>();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.chatId);
    }

    public Drawable createDrawableForTask(Context context, C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(qVar, "task");
        throw new UnsupportedOperationException();
    }

    @Override // com.ss.android.lark.multitask.task.Task.IconFactory
    public void createDrawableForTask(Context context, C48376q qVar, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(qVar, "task");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        C32821b.m126120a().mo120994a(this.chatId, new C35208c(this, imageView));
    }
}
