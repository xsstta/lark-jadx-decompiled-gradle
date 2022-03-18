package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.utils.FileSendUtils;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36506t;
import com.ss.android.lark.keyboard.plugin.tool.more.file.FilePlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency;
import com.ss.android.lark.statistics.drive.ChatDriveHitPoint;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/FilePlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "item", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "createPluginImpl", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/FilePlusItem;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.c */
public final class FilePlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

    /* renamed from: a */
    private IPlusItem f85011a;

    /* renamed from: b */
    private final IKeyboardCreator.PluginContext f85012b;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "plus_file";
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        return true;
    }

    /* renamed from: e */
    public final IKeyboardCreator.PluginContext mo122023e() {
        return this.f85012b;
    }

    /* renamed from: b */
    public IPlusItem mo122014c() {
        if (this.f85011a == null) {
            this.f85011a = m127646f();
        }
        return this.f85011a;
    }

    /* renamed from: f */
    private final FilePlusItem m127646f() {
        FragmentActivity requireActivity = this.f85012b.mo122076a().requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "pluginContext.host.requireActivity()");
        return new FilePlusItem(new C33027a(this, requireActivity));
    }

    public FilePlusItemPlugin(IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f85012b = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/FilePlusItemPlugin$createPluginImpl$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency;", "getContext", "Landroid/content/Context;", "launchFileChooser", "", "requestCode", "", "parseFileChooseResult", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$FileChooseResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "sendFile", "files", "", "Ljava/io/File;", "sendFileByUri", "uri", "Landroid/net/Uri;", "sendNutFile", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$NutFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.c$a */
    public static final class C33027a implements IFileDependency {

        /* renamed from: a */
        final /* synthetic */ FilePlusItemPlugin f85013a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f85014b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122026a(Uri uri) {
            Intrinsics.checkParameterIsNotNull(uri, "uri");
            IKeyboardViewModel e = this.f85013a.mo122023e().mo122080e();
            if (e != null) {
                e.sendFileMsg(uri);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122027a(List<? extends File> list) {
            Intrinsics.checkParameterIsNotNull(list, "files");
            IKeyboardViewModel e = this.f85013a.mo122023e().mo122080e();
            if (e != null) {
                e.sendFileMsg(list);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public IFileDependency.FileChooseResult mo122024a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36506t I = b.mo134510I();
            Intrinsics.checkExpressionValueIsNotNull(I, "ChatModuleInstanceHolder…cy().filePickerDependency");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(I.mo134708a());
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                return new IFileDependency.FileChooseResult(stringArrayListExtra, null);
            }
            Intrinsics.checkExpressionValueIsNotNull(clipData, "data.clipData ?: return …seResult(filePaths, null)");
            return new IFileDependency.FileChooseResult(stringArrayListExtra, IFileDependency.FileChooseResult.f104173a.mo147650a(clipData));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122025a(int i) {
            String a = FileSendUtils.f88686a.mo126927a(5368709120L);
            String b = FileSendUtils.f88686a.mo126928b(5368709120L);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36506t I = b2.mo134510I();
            FragmentActivity fragmentActivity = this.f85014b;
            Fragment a2 = this.f85013a.mo122023e().mo122076a();
            if (a2 != null) {
                I.mo134709a(fragmentActivity, (BaseFragment) a2, i, 5368709120L, 5368709120L, a, b, true);
                if (i == 2185) {
                    ChatDriveHitPoint.m213217a();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
        }

        C33027a(FilePlusItemPlugin cVar, FragmentActivity fragmentActivity) {
            this.f85013a = cVar;
            this.f85014b = fragmentActivity;
        }
    }
}
