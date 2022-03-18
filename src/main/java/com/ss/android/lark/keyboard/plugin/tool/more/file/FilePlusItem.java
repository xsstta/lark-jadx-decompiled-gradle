package com.ss.android.lark.keyboard.plugin.tool.more.file;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPluginHitPoint;
import com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/file/FilePlusItem;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "fileDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency;", "(Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency;)V", "host", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "getIconId", "", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "launchFileChooser", "", "onActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "requestCode", "onClick", "view", "Landroid/view/View;", "onReplyModeChanged", "replyMode", "sendFileClickHitPoint", "setPlusHotPlugin", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.b.a */
public final class FilePlusItem implements IPlusItem {

    /* renamed from: b */
    public static final Companion f104169b = new Companion(null);

    /* renamed from: a */
    public final IFileDependency f104170a;

    /* renamed from: c */
    private ISupportForItem f104171c;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.kb_ic_svg_attachment;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return null;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/file/FilePlusItem$Companion;", "", "()V", "REQUEST_CODE", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        String string = UIHelper.getString(R.string.Lark_Legacy_FileLabel);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_FileLabel)");
        return string;
    }

    /* renamed from: g */
    private final void m162300g() {
        ISupportForItem cVar = this.f104171c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        C57805b.m224333d(cVar.mo124328b(), new C40969b(this));
    }

    /* renamed from: f */
    private final void m162299f() {
        ISupportForItem cVar = this.f104171c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        IKeyBoardPlugin.IKeyBoardContext a = C40673a.m160697a(cVar);
        if (a != null) {
            KeyboardHitPointNew.m160872a(C40683h.m160854d(a.mo147372b()), KeyboardHitPointExtraParams.Click.LOCAL_FILE.plus(KeyboardHitPointExtraParams.Target.IM_MSG_SEND_CONFIRM_VIEW).plus(C40673a.m160698a(a.mo147381z().mo146903h())));
        }
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "host");
        this.f104171c = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
        IPlusItem.C33976a.m131689a(this, z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.b.a$b */
    public static final class C40969b implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ FilePlusItem f104172a;

        C40969b(FilePlusItem aVar) {
            this.f104172a = aVar;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                this.f104172a.f104170a.mo122025a(2185);
            }
        }
    }

    public FilePlusItem(IFileDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "fileDependency");
        this.f104170a = bVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m162300g();
        ISupportForItem cVar = this.f104171c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        cVar.mo124326a();
        new PlusKBPluginHitPoint("local_file").mo147285c();
        m162299f();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i != 2185) {
            return false;
        }
        IFileDependency.FileChooseResult a = this.f104170a.mo122024a(intent);
        List<String> a2 = a.mo147645a();
        List<Uri> b = a.mo147646b();
        if (b != null) {
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                this.f104170a.mo122026a((Uri) it.next());
            }
            return true;
        } else if (a2 == null || !a2.isEmpty()) {
            return false;
        } else {
            List<String> list = a2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new File((String) it2.next()));
            }
            this.f104170a.mo122027a(arrayList);
            return true;
        }
    }
}
