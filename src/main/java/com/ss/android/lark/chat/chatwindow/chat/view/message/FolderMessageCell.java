package com.ss.android.lark.chat.chatwindow.chat.view.message;

import android.content.Context;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.FolderContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.widget.fileview.FileView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0014J\u000e\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0014J\"\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/view/message/FolderMessageCell;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "Lcom/ss/android/lark/chat/base/view/vo/message/FolderContentVO;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/message/FolderMessageCell$FolderMessageViewHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "mOnFolderClickListener", "Lcom/ss/android/lark/chat/chatwindow/chat/view/message/callbacks/OnFolderClickListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/view/message/callbacks/OnFolderClickListener;)V", "getHolderClassImpl", "Ljava/lang/Class;", "getItemClassImpl", "layoutId", "", "onBindViewHolder", "", "viewHolder", "item", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "onCellClicked", "dockerHolder", "FolderMessageViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FolderMessageCell extends AbstractC33290a<FolderContentVO, FolderMessageViewHolder> {

    /* renamed from: a */
    private final OnFolderClickListener f87359a;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.file_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return FolderContentVO.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/view/message/FolderMessageCell$FolderMessageViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "mFileView", "Lcom/ss/android/lark/widget/fileview/FileView;", "getMFileView", "()Lcom/ss/android/lark/widget/fileview/FileView;", "setMFileView", "(Lcom/ss/android/lark/widget/fileview/FileView;)V", "onBindView", "", "itemView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class FolderMessageViewHolder extends AbstractC59010e {
        @BindView(7372)
        public FileView mFileView;

        /* renamed from: a */
        public final FileView mo123949a() {
            FileView fileView = this.mFileView;
            if (fileView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileView");
            }
            return fileView;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            ButterKnife.bind(this, view);
        }
    }

    public final class FolderMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private FolderMessageViewHolder f87360a;

        @Override // butterknife.Unbinder
        public void unbind() {
            FolderMessageViewHolder folderMessageViewHolder = this.f87360a;
            if (folderMessageViewHolder != null) {
                this.f87360a = null;
                folderMessageViewHolder.mFileView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public FolderMessageViewHolder_ViewBinding(FolderMessageViewHolder folderMessageViewHolder, View view) {
            this.f87360a = folderMessageViewHolder;
            folderMessageViewHolder.mFileView = (FileView) Utils.findRequiredViewAsType(view, R.id.chat_file, "field 'mFileView'", FileView.class);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell$FolderMessageViewHolder> */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<FolderMessageViewHolder> mo122650b() {
        Class cls = new FolderMessageViewHolder().getClass();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell.FolderMessageViewHolder>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/view/message/FolderMessageCell$onBindViewHolder$1", "Lcom/ss/android/lark/widget/fileview/FileView$IFileCallback;", "onCancelProgress", "", "info", "Lcom/ss/android/lark/widget/fileview/FileView$FileInfo;", "onFileClick", "", "onUpdateState", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell$a */
    public static final class C33894a extends FileView.C58450b {

        /* renamed from: a */
        final /* synthetic */ FolderMessageCell f87361a;

        /* renamed from: b */
        final /* synthetic */ FolderMessageViewHolder f87362b;

        /* renamed from: c */
        final /* synthetic */ AbsMessageVO f87363c;

        @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
        /* renamed from: b */
        public void mo122694b(FileView.C58449a aVar) {
        }

        @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
        /* renamed from: c */
        public boolean mo122695c(FileView.C58449a aVar) {
            return false;
        }

        @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
        /* renamed from: a */
        public void mo122693a(FileView.C58449a aVar) {
            this.f87361a.mo122683c(this.f87362b, this.f87363c);
        }

        C33894a(FolderMessageCell folderMessageCell, FolderMessageViewHolder folderMessageViewHolder, AbsMessageVO aVar) {
            this.f87361a = folderMessageCell;
            this.f87362b = folderMessageViewHolder;
            this.f87363c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell$b */
    public static final class View$OnLongClickListenerC33895b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderMessageCell f87364a;

        /* renamed from: b */
        final /* synthetic */ FolderMessageViewHolder f87365b;

        /* renamed from: c */
        final /* synthetic */ AbsMessageVO f87366c;

        View$OnLongClickListenerC33895b(FolderMessageCell folderMessageCell, FolderMessageViewHolder folderMessageViewHolder, AbsMessageVO aVar) {
            this.f87364a = folderMessageCell;
            this.f87365b = folderMessageViewHolder;
            this.f87366c = aVar;
        }

        public final boolean onLongClick(View view) {
            return FolderMessageCell.m131202a(this.f87364a, this.f87365b, this.f87366c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderMessageCell(AbstractC33342d dVar, OnFolderClickListener aVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mOnFolderClickListener");
        this.f87359a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(FolderMessageViewHolder folderMessageViewHolder, AbsMessageVO<FolderContentVO> aVar) {
        if (aVar != null && !aVar.ai()) {
            int i = 0;
            ChatHitPointNew.f135660c.mo187388a(aVar.mo121692b(), "file_card", "im_chat_file_manage_view", MapsKt.mapOf(TuplesKt.to("msg_id", aVar.mo121681a()), TuplesKt.to("file_type", "folder")));
            int i2 = -1;
            if (this.f85789d.mo122558v()) {
                if (aVar instanceof ThreadMessageVO) {
                    i = ((ThreadMessageVO) aVar).mo121673S();
                }
                i2 = i;
            }
            this.f87359a.mo123355d(aVar.mo121681a(), i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(FolderMessageViewHolder folderMessageViewHolder, AbsMessageVO<FolderContentVO> aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkParameterIsNotNull(folderMessageViewHolder, "viewHolder");
        super.mo122648a((AbstractC59010e) folderMessageViewHolder, (AbsMessageVO) aVar);
        if (aVar != null) {
            folderMessageViewHolder.mo123949a().setTag(aVar.mo121696d());
            FolderContentVO g = aVar.mo121699g();
            FileState fileState = FileState.DOWNLOAD;
            boolean e = g.mo121828e();
            boolean g2 = g.mo121830g();
            boolean h = g.mo121831h();
            boolean k = g.mo121834k();
            if (g.mo121837n() == Message.FileDeletedStatus.UNRECOVERABLE) {
                z = true;
            } else {
                z = false;
            }
            if (g.mo121837n() == Message.FileDeletedStatus.RECOVERABLE) {
                z2 = true;
            } else {
                z2 = false;
            }
            FileView.C58449a aVar2 = new FileView.C58449a(e, g2, h, k, z, z2, !aVar.ai(), "", new FileView.FileState(fileState.getFileStateType(), UIUtils.getString(mo122719d(), fileState.getValue())), g.mo121825b(), g.mo121826c(), 0, true);
            FileView a = folderMessageViewHolder.mo123949a();
            if (g.mo121834k() || g.mo121837n() == Message.FileDeletedStatus.RECOVERABLE || g.mo121837n() == Message.FileDeletedStatus.UNRECOVERABLE || g.mo121830g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            a.setFileSizeVisibility(z3);
            FileView a2 = folderMessageViewHolder.mo123949a();
            if (this.f85789d.mo122559w() || !aVar.ah() || this.f85789d.mo122558v()) {
                z4 = true;
            } else {
                z4 = false;
            }
            a2.setBottomMargin(z4);
            folderMessageViewHolder.mo123949a().getFileIconView().setCornerRadiusDP(BitmapDescriptorFactory.HUE_RED);
            if (this.f85789d.mo122559w() || this.f85789d.mo122558v()) {
                folderMessageViewHolder.mo123949a().setBackgroundResource(R.drawable.file_message_cell_bg);
            }
            if (!DesktopUtil.m144301a((Context) this.f85789d.mo122543g())) {
                folderMessageViewHolder.mo123949a().mo197890a();
            }
            folderMessageViewHolder.mo123949a().mo197892a(aVar2, new C33894a(this, folderMessageViewHolder, aVar));
            folderMessageViewHolder.mo123949a().setOnLongClickListener(new View$OnLongClickListenerC33895b(this, folderMessageViewHolder, aVar));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m131202a(FolderMessageCell folderMessageCell, FolderMessageViewHolder folderMessageViewHolder, AbsMessageVO aVar) {
        return folderMessageCell.mo122755b((AbstractC59010e) folderMessageViewHolder, (Object) aVar);
    }
}
