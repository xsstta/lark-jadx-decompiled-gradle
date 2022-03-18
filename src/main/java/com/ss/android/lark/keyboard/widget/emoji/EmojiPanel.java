package com.ss.android.lark.keyboard.widget.emoji;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.keyboard.widget.IPanel;
import com.ss.android.lark.keyboard.widget.emoji.EmojiOperator;
import com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment;
import com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener;
import com.ss.android.lark.keyboard.widget.emoji.v2.EmojiHitPoint;
import com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageNewFragment2;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel;", "Lcom/ss/android/lark/keyboard/widget/IPanel;", "operator", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator;", "dependency", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;", "(Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator;Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getDependency", "()Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;", "emojiDependency", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "fragment", "Lcom/ss/android/lark/keyboard/widget/emoji/base/EmojiPageBaseFragment;", "operatationListener", "Lcom/ss/android/lark/keyboard/widget/emoji/base/OnEmojiOperationListener;", "create", "", "destroy", "Landroidx/fragment/app/Fragment;", "initEmojiList", "Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2;", "resume", "rootView", "Landroid/view/View;", "context", "Landroid/content/Context;", "Companion", "EmojiPanelDependency", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.c */
public final class EmojiPanel implements IPanel {

    /* renamed from: c */
    public static final Companion f104817c = new Companion(null);

    /* renamed from: a */
    public EmojiPageBaseFragment f104818a;

    /* renamed from: b */
    public final EmojiOperator f104819b;

    /* renamed from: d */
    private final CallbackManager f104820d = new CallbackManager();

    /* renamed from: e */
    private final IEmojiDependency f104821e = new C41104c(this);

    /* renamed from: f */
    private final OnEmojiOperationListener f104822f = new C41106e(this);

    /* renamed from: g */
    private final EmojiPanelDependency f104823g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\bH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;", "", "getPanelData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency$EmojiPanelData;", "isFgEnable", "", "key", "", "showDeleteIcon", "syncReactionOrder", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "", "EmojiPanelData", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$b */
    public interface EmojiPanelDependency {
        /* renamed from: a */
        void mo147522a(IGetDataCallback<EmojiPanelData> iGetDataCallback);

        /* renamed from: a */
        void mo147523a(String str);

        /* renamed from: a */
        void mo147524a(String str, IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: a */
        boolean mo147525a();

        /* renamed from: b */
        void mo147526b(IGetDataCallback<Boolean> iGetDataCallback);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency$EmojiPanelData;", "", "recentKeys", "", "", "wholeKeys", "(Ljava/util/List;Ljava/util/List;)V", "getRecentKeys", "()Ljava/util/List;", "getWholeKeys", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$b$a */
        public static final class EmojiPanelData {

            /* renamed from: a */
            private final List<String> f104824a;

            /* renamed from: b */
            private final List<String> f104825b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmojiPanelData)) {
                    return false;
                }
                EmojiPanelData aVar = (EmojiPanelData) obj;
                return Intrinsics.areEqual(this.f104824a, aVar.f104824a) && Intrinsics.areEqual(this.f104825b, aVar.f104825b);
            }

            public int hashCode() {
                List<String> list = this.f104824a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<String> list2 = this.f104825b;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return "EmojiPanelData(recentKeys=" + this.f104824a + ", wholeKeys=" + this.f104825b + ")";
            }

            /* renamed from: a */
            public final List<String> mo148256a() {
                return this.f104824a;
            }

            /* renamed from: b */
            public final List<String> mo148257b() {
                return this.f104825b;
            }

            public EmojiPanelData(List<String> list, List<String> list2) {
                Intrinsics.checkParameterIsNotNull(list, "recentKeys");
                Intrinsics.checkParameterIsNotNull(list2, "wholeKeys");
                this.f104824a = list;
                this.f104825b = list2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$Companion;", "", "()V", "TAG", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final EmojiPanelDependency mo148255d() {
        return this.f104823g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/EmojiPanel$operatationListener$1", "Lcom/ss/android/lark/keyboard/widget/emoji/base/OnEmojiOperationListener;", "onBackSpace", "", "selectedEmoji", "reactionKey", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$e */
    public static final class C41106e implements OnEmojiOperationListener {

        /* renamed from: a */
        final /* synthetic */ EmojiPanel f104828a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener
        /* renamed from: a */
        public void mo147529a() {
            this.f104828a.f104819b.mo147520a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41106e(EmojiPanel cVar) {
            this.f104828a = cVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener
        /* renamed from: a */
        public void mo147530a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Bitmap c = EmojiMapHandler.m162995c(str);
            if (c != null) {
                this.f104828a.f104819b.mo147521a(new EmojiOperator.EmojiResult(str, new BitmapDrawable(c)));
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.widget.IPanel
    /* renamed from: a */
    public Fragment mo148235a() {
        return this.f104818a;
    }

    @Override // com.ss.android.lark.keyboard.widget.IPanelLifeCycle
    /* renamed from: b */
    public void mo148236b() {
        EmojiPageBaseFragment aVar = this.f104818a;
        if (aVar != null) {
            aVar.mo148243a(this.f104823g.mo147525a());
            aVar.mo148242a(this.f104821e);
            aVar.mo148241a(this.f104822f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment");
    }

    @Override // com.ss.android.lark.keyboard.widget.IPanelLifeCycle
    /* renamed from: c */
    public void mo148237c() {
        EmojiPanelDependency bVar = this.f104823g;
        UIGetDataCallback wrapAndAddGetDataCallback = this.f104820d.wrapAndAddGetDataCallback(new C41107f(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…\n            }\n        })");
        bVar.mo147526b(wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/EmojiPanel$emojiDependency$1", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "updateLocalOrder", "", "reactionKey", "", "updateRecentEmojiOrder", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$c */
    public static final class C41104c implements IEmojiDependency {

        /* renamed from: a */
        final /* synthetic */ EmojiPanel f104826a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41104c(EmojiPanel cVar) {
            this.f104826a = cVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency
        /* renamed from: a */
        public void mo147527a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            this.f104826a.mo148255d().mo147523a(str);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency
        /* renamed from: a */
        public void mo147528a(String str, IGetDataCallback<Integer> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f104826a.mo148255d().mo147524a(str, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/EmojiPanel$initEmojiList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency$EmojiPanelData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$d */
    public static final class C41105d implements IGetDataCallback<EmojiPanelDependency.EmojiPanelData> {

        /* renamed from: a */
        final /* synthetic */ EmojiPageNewFragment2 f104827a;

        C41105d(EmojiPageNewFragment2 cVar) {
            this.f104827a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(EmojiPanelDependency.EmojiPanelData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("EmojiPanel", "fetch Emoji Data success");
            this.f104827a.mo148271a(aVar.mo148256a(), aVar.mo148257b());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EmojiPanel", "fetch Emoji Data failed " + errorResult.getDisplayMsg());
            this.f104827a.mo148271a(new ArrayList(), new ArrayList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/EmojiPanel$resume$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.c$f */
    public static final class C41107f implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ EmojiPanel f104829a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41107f(EmojiPanel cVar) {
            this.f104829a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("EmojiPanel", "syncReactionOrder failed");
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            EmojiPageBaseFragment aVar = this.f104829a.f104818a;
            if (aVar != null) {
                this.f104829a.mo148254a((EmojiPageNewFragment2) aVar);
                Log.m165389i("EmojiPanel", "syncReactionOrder success");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageNewFragment2");
        }
    }

    /* renamed from: a */
    public final void mo148254a(EmojiPageNewFragment2 cVar) {
        EmojiPanelDependency bVar = this.f104823g;
        UIGetDataCallback wrapAndAddGetDataCallback = this.f104820d.wrapAndAddGetDataCallback(new C41105d(cVar));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…\n            }\n        })");
        bVar.mo147522a(wrapAndAddGetDataCallback);
    }

    public EmojiPanel(EmojiOperator bVar, EmojiPanelDependency bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "operator");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        this.f104819b = bVar;
        this.f104823g = bVar2;
        EmojiPageNewFragment2 cVar = new EmojiPageNewFragment2();
        mo148254a(cVar);
        EmojiHitPoint.f104831a.mo148263a();
        this.f104818a = cVar;
    }
}
