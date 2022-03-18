package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/PostInputSupportPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "item", "createPluginImpl", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.e */
public final class PostInputSupportPlugin implements IKeyboardCreator.IPlugin<IInputSupportPlugin> {

    /* renamed from: a */
    public final IKeyboardCreator.PluginContext f86411a;

    /* renamed from: b */
    private IInputSupportPlugin f86412b;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "post";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/PostInputSupportPlugin$createPluginImpl$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$ILifeCycleCallback;", "onResume", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.e$a */
    public static final class C33538a implements PostInputSupportPlugin.ILifeCycleCallback {

        /* renamed from: a */
        final /* synthetic */ Chat f86413a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.ILifeCycleCallback
        /* renamed from: b */
        public void mo123217b() {
            PostInputSupportPlugin.ILifeCycleCallback.C40747a.m161305a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.ILifeCycleCallback
        /* renamed from: a */
        public void mo123216a() {
            ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, this.f86413a, "post", "im_chat_post_view", (Map) null, 8, (Object) null);
        }

        C33538a(Chat chat) {
            this.f86413a = chat;
        }
    }

    /* renamed from: b */
    public IInputSupportPlugin mo122014c() {
        if (this.f86412b == null) {
            this.f86412b = m129975e();
        }
        return this.f86412b;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return !ChatKBPluginUtil.f86409a.mo123237a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/plugin/PostInputSupportPlugin$createPluginImpl$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;", "onSendInterrupted", "", "onSendPost", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "keepOrigin", "", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.e$b */
    public static final class C33539b implements OnSendPostCallback {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f86414a;

        /* renamed from: b */
        final /* synthetic */ Chat f86415b;

        /* renamed from: c */
        final /* synthetic */ Context f86416c;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public void mo123219a() {
            LKUIToast.show(this.f86416c, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", this.f86415b.getName()));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "image", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.a.e$b$a */
        static final class C33540a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C33540a f86417a = new C33540a();

            C33540a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(Image image) {
                Intrinsics.checkParameterIsNotNull(image, "image");
                List<String> urls = image.getUrls();
                Intrinsics.checkExpressionValueIsNotNull(urls, "image.urls");
                int width = image.getWidth();
                int height = image.getHeight();
                String token = image.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "image.token");
                return new IPhotoDependency.Image(urls, width, height, token);
            }
        }

        C33539b(PostInputSupportPlugin eVar, Chat chat, Context context) {
            this.f86414a = eVar;
            this.f86415b = chat;
            this.f86416c = context;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo123218a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Observable<R> map = C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Chat).map(C33540a.f86417a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …en)\n                    }");
            return map;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public void mo123220a(String str, String str2, RichText richText) {
            IKeyboardViewModel e;
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            KeyBoard b = this.f86414a.f86411a.mo122077b();
            if (b != null && (e = this.f86414a.f86411a.mo122080e()) != null) {
                e.sendPostMsg(str, str2, richText, b.mo146836q(), b.mo146837r());
            }
        }
    }

    /* renamed from: e */
    private final com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin m129975e() {
        Chat c = this.f86411a.mo122078c();
        Context requireContext = this.f86411a.mo122076a().requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
        com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin bVar = new com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin(new C33539b(this, c, requireContext));
        bVar.mo147206a(new C33538a(c));
        return bVar;
    }

    public PostInputSupportPlugin(IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f86411a = cVar;
    }
}
