package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import android.app.Dialog;
import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.ChatKBPluginUtil;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialog;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J2\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0002J&\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/TextInputSupportPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;Ljava/util/List;)V", "getCallbacks", "()Ljava/util/List;", "item", "getItem", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "setItem", "(Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;)V", "createPluginImpl", "getName", "", "getPlugin", "onSendMultiFile", "", "context", "Landroid/content/Context;", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "viewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;", "filePaths", "showFilePreviewDialog", "showPostRestrictionTip", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.i */
public class TextInputSupportPlugin implements IKeyboardCreator.IPlugin<IInputSupportPlugin> {

    /* renamed from: a */
    public final IKeyboardCreator.PluginContext f85036a;

    /* renamed from: b */
    private IInputSupportPlugin f85037b;

    /* renamed from: c */
    private final List<IKeyboardComponent.IKeyboardComponentCallbacks> f85038c;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "text";
    }

    /* renamed from: e */
    public final List<IKeyboardComponent.IKeyboardComponentCallbacks> mo122052e() {
        return this.f85038c;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return IKeyboardCreator.IPlugin.C33037a.m127748a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/TextInputSupportPlugin$createPluginImpl$2", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;", "onSendInterrupted", "", "onSendText", "content", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.i$b */
    public static final class C33032b implements OnSendTextCallback {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f85041a;

        /* renamed from: b */
        final /* synthetic */ Context f85042b;

        /* renamed from: c */
        final /* synthetic */ Chat f85043c;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122054a() {
            this.f85041a.mo122048a(this.f85042b, this.f85043c);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122055a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            KeyBoard b = this.f85041a.f85036a.mo122077b();
            if (b != null) {
                String q = b.mo146836q();
                String r = b.mo146837r();
                IKeyboardViewModel e = this.f85041a.f85036a.mo122080e();
                if (e != null) {
                    e.sendTextMsg(q, r, richText);
                }
            }
        }

        C33032b(TextInputSupportPlugin iVar, Context context, Chat chat) {
            this.f85041a = iVar;
            this.f85042b = context;
            this.f85043c = chat;
        }
    }

    /* renamed from: b */
    public IInputSupportPlugin mo122014c() {
        if (this.f85037b == null) {
            this.f85037b = m127692f();
        }
        return this.f85037b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/TextInputSupportPlugin$createPluginImpl$3", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/IOnLifeCallback;", "onResume", "", "onStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.i$c */
    public static final class C33033c implements IOnLifeCallback {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f85044a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
        /* renamed from: a */
        public void mo122056a() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f85044a.mo122052e()) {
                bVar.mo122067b();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
        /* renamed from: b */
        public void mo122057b() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f85044a.mo122052e()) {
                bVar.mo122065a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33033c(TextInputSupportPlugin iVar) {
            this.f85044a = iVar;
        }
    }

    /* renamed from: f */
    private final IInputSupportPlugin m127692f() {
        Chat c = this.f85036a.mo122078c();
        ChatChatter d = this.f85036a.mo122079d();
        Context requireContext = this.f85036a.mo122076a().requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
        return new com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin(c.isSecret(), ChatKBPluginUtil.f86409a.mo123236a(requireContext, c, d), ChatKBPluginUtil.f86409a.mo123235a(c), new C33031a(this, requireContext), new C33032b(this, requireContext, c), new C33033c(this), c.isSecret());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/TextInputSupportPlugin$showFilePreviewDialog$dialog$1", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;", "onNegativeClick", "", "dialog", "Landroid/app/Dialog;", "onPositiveClick", "filePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.i$d */
    public static final class C33034d implements FilePreviewDialogCallback {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f85045a;

        /* renamed from: b */
        final /* synthetic */ Context f85046b;

        /* renamed from: c */
        final /* synthetic */ IKeyboardCreator.PluginContext f85047c;

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
            this.f85045a.mo122049a(this.f85046b, this.f85047c.mo122077b(), this.f85047c.mo122080e(), list);
            dialog.dismiss();
            return true;
        }

        C33034d(TextInputSupportPlugin iVar, Context context, IKeyboardCreator.PluginContext cVar) {
            this.f85045a = iVar;
            this.f85046b = context;
            this.f85047c = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/TextInputSupportPlugin$createPluginImpl$1", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onFilePaste", "", "rawFilePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.i$a */
    public static final class C33031a extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f85039a;

        /* renamed from: b */
        final /* synthetic */ Context f85040b;

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "rawFilePaths");
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!new File(str).isDirectory()) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                TextInputSupportPlugin iVar = this.f85039a;
                iVar.mo122050a(this.f85040b, arrayList, iVar.f85036a);
            }
        }

        C33031a(TextInputSupportPlugin iVar, Context context) {
            this.f85039a = iVar;
            this.f85040b = context;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public TextInputSupportPlugin(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
        this.f85036a = cVar;
        this.f85038c = list;
    }

    /* renamed from: a */
    public final void mo122048a(Context context, Chat chat) {
        LKUIToast.show(context, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", chat.getName()));
    }

    /* renamed from: a */
    public final void mo122050a(Context context, List<String> list, IKeyboardCreator.PluginContext cVar) {
        Log.m165389i("ChatWindowLog", "Attempting to create RecyclerView with the files" + list);
        new FilePreviewDialog(context, list, new C33034d(this, context, cVar)).show();
    }

    /* renamed from: a */
    public final void mo122049a(Context context, KeyBoard fVar, IKeyboardViewModel bVar, List<String> list) {
        if (fVar != null) {
            String q = fVar.mo146836q();
            String r = fVar.mo146837r();
            for (String str : list) {
                String c = C26311p.m95283c(str);
                Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
                String str2 = c;
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null) || StringsKt.endsWith$default(str, ".0", false, 2, (Object) null)) {
                    if (bVar != null) {
                        bVar.sendImageMsg(CollectionsKt.listOf(str), true, q, r);
                    }
                } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "video/", false, 2, (Object) null)) {
                    File file = new File(str);
                    Photo photo = new Photo();
                    photo.setPath(file.getPath());
                    photo.setMimeType(c);
                    photo.setSize(C26311p.m95281c(file));
                    photo.setDuration(0);
                    photo.setCompressPath(ao.m224300a(context, file.getPath(), false));
                    if (bVar != null) {
                        bVar.sendMediaMsg(CollectionsKt.listOf(photo), q, r);
                    }
                } else if (bVar != null) {
                    bVar.sendFileMsg(CollectionsKt.listOf(new File(str)));
                }
            }
            fVar.mo146841v();
        }
    }
}
