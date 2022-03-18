package com.ss.android.lark.chat.chatwindow.chat.message;

import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33300j;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.widget.fileview.FileView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class FileMessageCell extends AbstractC33290a<FileContentVO, FileMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC36505s f85629a = C29990c.m110930b().mo134520S();

    /* renamed from: b */
    private final AbstractC33300j f85630b;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.file_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return FileContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<FileMessageViewHolder> mo122650b() {
        return FileMessageViewHolder.class;
    }

    public class FileMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private FileMessageViewHolder f85635a;

        @Override // butterknife.Unbinder
        public void unbind() {
            FileMessageViewHolder fileMessageViewHolder = this.f85635a;
            if (fileMessageViewHolder != null) {
                this.f85635a = null;
                fileMessageViewHolder.mFileView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public FileMessageViewHolder_ViewBinding(FileMessageViewHolder fileMessageViewHolder, View view) {
            this.f85635a = fileMessageViewHolder;
            fileMessageViewHolder.mFileView = (FileView) Utils.findRequiredViewAsType(view, R.id.chat_file, "field 'mFileView'", FileView.class);
        }
    }

    public static class FileMessageViewHolder extends AbstractC59010e {
        @BindView(7372)
        public FileView mFileView;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            if (!DesktopUtil.m144301a(view.getContext())) {
                this.mFileView.mo197890a();
            }
        }
    }

    public FileMessageCell(AbstractC33342d dVar, AbstractC33300j jVar) {
        super(dVar);
        this.f85630b = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(FileMessageViewHolder fileMessageViewHolder, AbsMessageVO<FileContentVO> aVar) {
        if (!aVar.ai()) {
            AbstractC33300j jVar = this.f85630b;
            if (jVar != null) {
                jVar.mo122771o(aVar.mo121681a());
            }
            if (!this.f85789d.mo122559w()) {
                ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "file", ChatHitPointNew.f135660c.mo187391b("file"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final FileMessageViewHolder fileMessageViewHolder, final AbsMessageVO<FileContentVO> aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.mo122648a((AbstractC59010e) fileMessageViewHolder, (AbsMessageVO) aVar);
        if (this.f85789d.mo122559w() || this.f85789d.mo122558v()) {
            fileMessageViewHolder.mFileView.setBackgroundResource(R.drawable.file_message_cell_bg);
        }
        fileMessageViewHolder.mFileView.setTag(aVar.mo121696d());
        final FileContentVO g = aVar.mo121699g();
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
        fileMessageViewHolder.mFileView.mo197892a(new FileView.C58449a(e, g2, h, k, z, z2, !aVar.ai(), g.mo121838o(), new FileView.FileState(g.mo121840q().getFileStateType(), UIUtils.getString(mo122719d(), g.mo121840q().getValue())), g.mo121825b(), g.mo121826c(), g.mo121841r()), new FileView.C58450b() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell.C332641 */

            @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
            /* renamed from: c */
            public boolean mo122695c(FileView.C58449a aVar) {
                return false;
            }

            @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
            /* renamed from: a */
            public void mo122693a(FileView.C58449a aVar) {
                FileMessageCell.this.mo122683c(fileMessageViewHolder, aVar);
            }

            @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
            /* renamed from: b */
            public void mo122694b(FileView.C58449a aVar) {
                FileMessageCell.this.f85629a.mo134705a(g.mo121820a());
            }
        });
        FileView fileView = fileMessageViewHolder.mFileView;
        if (g.mo121834k() || g.mo121837n() == Message.FileDeletedStatus.RECOVERABLE || g.mo121837n() == Message.FileDeletedStatus.UNRECOVERABLE || g.mo121830g()) {
            z3 = false;
        } else {
            z3 = true;
        }
        fileView.setFileSizeVisibility(z3);
        fileMessageViewHolder.mFileView.setOnLongClickListener(new View.OnLongClickListener(fileMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$FileMessageCell$k4TLaPacw_xI2Umcn3_Xwg05dwI */
            public final /* synthetic */ FileMessageCell.FileMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return FileMessageCell.lambda$k4TLaPacw_xI2Umcn3_Xwg05dwI(FileMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        FileView fileView2 = fileMessageViewHolder.mFileView;
        if (this.f85789d.mo122559w() || !aVar.ah()) {
            z4 = true;
        } else {
            z4 = false;
        }
        fileView2.setBottomMargin(z4);
        fileMessageViewHolder.mFileView.getFileIconView().setCornerRadiusDP(BitmapDescriptorFactory.HUE_RED);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128679a(FileMessageViewHolder fileMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) fileMessageViewHolder, (Object) aVar);
    }
}
