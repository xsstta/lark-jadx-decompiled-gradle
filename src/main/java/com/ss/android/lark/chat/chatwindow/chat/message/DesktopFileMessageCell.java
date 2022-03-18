package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26310o;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.DesktopFileMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i;
import com.ss.android.lark.chat.chatwindow.chat.message.p1625b.AbstractC33309a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36501o;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.fileview.DesktopFileView;
import com.ss.android.lark.widget.fileview.FileView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.io.File;

public class DesktopFileMessageCell extends AbstractC33290a<FileContentVO, DesktopFileMessageViewHolder> implements AbstractC33309a {

    /* renamed from: a */
    public final AbstractC33299i f85623a;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.desktop_file_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return FileContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<DesktopFileMessageViewHolder> mo122650b() {
        return DesktopFileMessageViewHolder.class;
    }

    public class DesktopFileMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private DesktopFileMessageViewHolder f85628a;

        @Override // butterknife.Unbinder
        public void unbind() {
            DesktopFileMessageViewHolder desktopFileMessageViewHolder = this.f85628a;
            if (desktopFileMessageViewHolder != null) {
                this.f85628a = null;
                desktopFileMessageViewHolder.mFileView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public DesktopFileMessageViewHolder_ViewBinding(DesktopFileMessageViewHolder desktopFileMessageViewHolder, View view) {
            this.f85628a = desktopFileMessageViewHolder;
            desktopFileMessageViewHolder.mFileView = (DesktopFileView) Utils.findRequiredViewAsType(view, R.id.chat_file, "field 'mFileView'", DesktopFileView.class);
        }
    }

    public static class DesktopFileMessageViewHolder extends AbstractC59010e {
        @BindView(7372)
        public DesktopFileView mFileView;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.mFileView.setBackground(null);
        }
    }

    public DesktopFileMessageCell(AbstractC33342d dVar, AbstractC33299i iVar) {
        super(dVar);
        this.f85623a = iVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1625b.AbstractC33309a
    /* renamed from: a */
    public boolean mo122681a(View view, MotionEvent motionEvent) {
        DesktopFileView desktopFileView = (DesktopFileView) view.findViewById(R.id.chat_file);
        if (desktopFileView != null) {
            return desktopFileView.mo197888a(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo122680a(String str, FileContentVO dVar) {
        String p = dVar.mo121839p();
        String o = dVar.mo121838o();
        FragmentActivity g = this.f85789d.mo122543g();
        if (RomUtils.m94953h()) {
            Intent intent = new Intent("bytedance.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setFlags(402653185);
            intent.setDataAndType(C26310o.m95259a(g, new File(p)), o);
            try {
                g.startActivity(intent);
            } catch (Exception e) {
                Log.m165383e("DesktopFileMessageCell", "openFile:" + e.getMessage());
                this.f85623a.mo122770n(str);
            }
        } else {
            this.f85623a.mo122770n(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final DesktopFileMessageViewHolder desktopFileMessageViewHolder, final AbsMessageVO<FileContentVO> aVar) {
        boolean z;
        boolean z2;
        super.mo122648a((AbstractC59010e) desktopFileMessageViewHolder, (AbsMessageVO) aVar);
        desktopFileMessageViewHolder.mFileView.setTag(aVar.mo121696d());
        final FileContentVO g = aVar.mo121699g();
        boolean e = g.mo121828e();
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
        desktopFileMessageViewHolder.mFileView.mo197887a(new DesktopFileView.C58444a(e, k, z, z2, !aVar.ai(), g.mo121838o(), new FileView.FileState(g.mo121840q().getFileStateType(), UIUtils.getString(mo122719d(), g.mo121840q().getValue())), g.mo121825b(), g.mo121826c(), g.mo121841r(), aVar.mo121706n(), g.mo121839p(), g.mo121827d(), g.mo121829f()), new DesktopFileView.AbstractC58445b() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.DesktopFileMessageCell.C332631 */

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: a */
            public void mo122684a(View view) {
                DesktopFileMessageCell.this.mo122683c(desktopFileMessageViewHolder, aVar);
            }

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: d */
            public void mo122687d(View view) {
                DesktopFileMessageCell.this.mo122680a(aVar.mo121681a(), g);
            }

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: b */
            public void mo122685b(View view) {
                if (DesktopFileMessageCell.this.f85623a != null) {
                    DesktopFileMessageCell.this.f85623a.mo122767k(aVar.mo121681a());
                }
            }

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: c */
            public void mo122686c(View view) {
                if (DesktopFileMessageCell.this.f85623a != null) {
                    DesktopFileMessageCell.this.f85623a.mo122768l(aVar.mo121681a());
                }
            }

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: f */
            public void mo122689f(View view) {
                if (DesktopFileMessageCell.this.f85623a != null) {
                    DesktopFileMessageCell.this.f85623a.mo122765a(aVar.mo121681a(), g.mo121835l(), g.mo121836m());
                }
            }

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: g */
            public void mo122690g(View view) {
                if (DesktopFileMessageCell.this.f85623a != null) {
                    DesktopFileMessageCell.this.f85623a.mo122769m(aVar.mo121681a());
                }
            }

            @Override // com.ss.android.lark.widget.fileview.DesktopFileView.AbstractC58445b
            /* renamed from: e */
            public void mo122688e(View view) {
                if (g.mo121827d() == 0) {
                    LKUIToast.show(DesktopFileMessageCell.this.f85789d.mo122543g(), (int) R.string.Lark_Legacy_SavedFileToDrive);
                    return;
                }
                C29990c.m110930b().mo134520S().mo134707b(g.mo121838o());
                if (DesktopFileMessageCell.this.f85623a != null && g.mo121835l() != null && g.mo121836m() != null) {
                    DesktopFileMessageCell.this.f85623a.mo122766a(g.mo121820a(), aVar.mo121681a(), g.mo121835l(), g.mo121836m());
                }
            }
        });
        desktopFileMessageViewHolder.mFileView.setOnLongClickListener(new View.OnLongClickListener(desktopFileMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$DesktopFileMessageCell$9KDp_giwN9UpkGM1WH2E81QDklA */
            public final /* synthetic */ DesktopFileMessageCell.DesktopFileMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return DesktopFileMessageCell.lambda$9KDp_giwN9UpkGM1WH2E81QDklA(DesktopFileMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        if (aVar.ah()) {
            desktopFileMessageViewHolder.mFileView.f143912i.setVisibility(0);
        } else {
            desktopFileMessageViewHolder.mFileView.f143912i.setVisibility(8);
        }
        desktopFileMessageViewHolder.mFileView.f143904a.setCornerRadiusDP(BitmapDescriptorFactory.HUE_RED);
        desktopFileMessageViewHolder.mFileView.getLayoutParams().width = UIHelper.dp2px(360.0f);
        desktopFileMessageViewHolder.mFileView.getLayoutParams().height = UIHelper.dp2px(78.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(DesktopFileMessageViewHolder desktopFileMessageViewHolder, AbsMessageVO<FileContentVO> aVar) {
        super.mo122683c(desktopFileMessageViewHolder, aVar);
        FileContentVO g = aVar.mo121699g();
        if (g.mo121834k()) {
            LKUIToast.show(mo122719d(), (int) R.string.Lark_Legacy_FileWithdrawTip);
            return;
        }
        int i = 0;
        if (g.mo121837n() == Message.FileDeletedStatus.UNRECOVERABLE) {
            LKUIToast.show(mo122719d(), (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogOver90Days);
            AbstractC36501o s = C29990c.m110930b().mo134591s();
            String a = aVar.mo121681a();
            String l = g.mo121835l();
            if (g.mo121836m() != null) {
                i = g.mo121836m().getNumber();
            }
            s.mo134679a(a, l, i, null);
        } else if (g.mo121837n() == Message.FileDeletedStatus.RECOVERABLE) {
            LKUIToast.show(mo122719d(), (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogWithin90Days);
            AbstractC36501o s2 = C29990c.m110930b().mo134591s();
            String a2 = aVar.mo121681a();
            String l2 = g.mo121835l();
            if (g.mo121836m() != null) {
                i = g.mo121836m().getNumber();
            }
            s2.mo134679a(a2, l2, i, null);
        } else if (TextUtils.isEmpty(g.mo121839p()) || !new File(g.mo121839p()).exists()) {
            AbstractC33299i iVar = this.f85623a;
            if (iVar != null) {
                iVar.mo122768l(aVar.mo121681a());
            }
        } else {
            mo122680a(aVar.mo121681a(), aVar.mo121699g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128660a(DesktopFileMessageViewHolder desktopFileMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) desktopFileMessageViewHolder, (Object) aVar);
    }
}
