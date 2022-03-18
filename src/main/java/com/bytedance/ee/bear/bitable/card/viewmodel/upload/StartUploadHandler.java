package com.bytedance.ee.bear.bitable.card.viewmodel.upload;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.PendingUploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.UploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.bitable.card.viewmodel.upload.StartUploadHandler;
import com.bytedance.ee.bear.bitable.common.BitableAnalytic;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;

public class StartUploadHandler implements AbstractC7945d<StartUploadData> {

    /* renamed from: a */
    public Context f14045a;

    /* renamed from: b */
    public BitableAttachmentUploadManager f14046b;

    /* renamed from: c */
    public BitableAnalytic f14047c;

    /* renamed from: d */
    public String f14048d;

    /* renamed from: e */
    public int f14049e;

    /* renamed from: f */
    public int f14050f;

    /* renamed from: g */
    public UDDialog f14051g;

    /* renamed from: h */
    private AbstractC7947h f14052h;

    /* renamed from: i */
    private C4771b f14053i;

    /* renamed from: j */
    private final BitableAttachmentUploadManager.FileUploadStatusListener f14054j = new BitableAttachmentUploadManager.FileUploadStatusListener() {
        /* class com.bytedance.ee.bear.bitable.card.viewmodel.upload.StartUploadHandler.C47791 */

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
        /* renamed from: a */
        public void mo18011a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2) {
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
        /* renamed from: a */
        public void mo18012a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, float f) {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19778a(String str) {
            C13479a.m54772d("StartUploadHandler", "onUploadSuccess, checkRecordId");
            if (TextUtils.equals(str, StartUploadHandler.this.f14048d)) {
                StartUploadHandler.this.f14050f++;
                C13479a.m54764b("StartUploadHandler", "onUploadSuccess, uploadNum = " + StartUploadHandler.this.f14050f);
                StartUploadHandler.this.mo18669d();
                if (StartUploadHandler.this.f14050f == StartUploadHandler.this.f14049e) {
                    StartUploadHandler.this.mo18658a(0);
                    StartUploadHandler.this.f14051g.dismiss();
                    StartUploadHandler.this.f14046b.clearFileTokenToEntityMap();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19779a(String str, int i) {
            if (TextUtils.equals(str, StartUploadHandler.this.f14048d) && StartUploadHandler.this.f14045a != null) {
                C13479a.m54758a("StartUploadHandler", "onUploadFail, errCode = " + i);
                StartUploadHandler startUploadHandler = StartUploadHandler.this;
                startUploadHandler.mo18660a(startUploadHandler.f14051g);
            }
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
        /* renamed from: a */
        public void mo18013a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, int i) {
            C13479a.m54772d("StartUploadHandler", "onUploadFail, checkUploadResult");
            if (StartUploadHandler.this.mo18666a(uploadAttachmentEntity, str2)) {
                C13742g.m55705a(new Runnable(str2, i) {
                    /* class com.bytedance.ee.bear.bitable.card.viewmodel.upload.$$Lambda$StartUploadHandler$1$_2RO9DlYJyjsZQ4iMI6vni5xCIg */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        StartUploadHandler.C47791.this.m19779a(this.f$1, this.f$2);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
        /* renamed from: a */
        public void mo18014a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, String str3) {
            C13479a.m54772d("StartUploadHandler", "onUploadSuccess, checkUploadResult");
            if (StartUploadHandler.this.mo18666a(uploadAttachmentEntity, str2)) {
                StartUploadHandler.this.f14047c.mo18672a(uploadAttachmentEntity.getSize(), StartUploadHandler.this.mo18665a(), uploadAttachmentEntity.isCameraOnly());
                C13742g.m55705a(new Runnable(str2) {
                    /* class com.bytedance.ee.bear.bitable.card.viewmodel.upload.$$Lambda$StartUploadHandler$1$QJZPvY2__Ku5SX7HOpcLuBGsHu4 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        StartUploadHandler.C47791.this.m19778a(this.f$1);
                    }
                });
            }
        }
    };

    /* renamed from: k */
    private Animation f14055k;

    /* renamed from: l */
    private View f14056l;

    /* renamed from: m */
    private TextView f14057m;

    public static class StartUploadData implements NonProguard {
        public String baseToken;
        public String recordId;
        public String tableId;
        public String viewId;
    }

    /* renamed from: a */
    public boolean mo18666a(UploadAttachmentEntity uploadAttachmentEntity, String str) {
        if (!(uploadAttachmentEntity instanceof PendingUploadAttachmentEntity) || ((PendingUploadAttachmentEntity) uploadAttachmentEntity).isPendingUpload() || !TextUtils.equals(str, this.f14048d)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo18667b() {
        BitableAttachmentUploadManager aVar = this.f14046b;
        if (aVar != null) {
            aVar.unregisterFileUploadStatusListener(this.f14054j);
        }
        mo18668c();
    }

    /* renamed from: c */
    public void mo18668c() {
        View view = this.f14056l;
        if (view != null) {
            view.clearAnimation();
        }
        UDDialog uDDialog = this.f14051g;
        if (uDDialog != null && uDDialog.isShowing()) {
            this.f14051g.dismiss();
        }
        this.f14049e = 0;
        this.f14050f = 0;
    }

    /* renamed from: d */
    public void mo18669d() {
        HashMap hashMap = new HashMap();
        hashMap.put("num", String.valueOf(this.f14050f));
        hashMap.put("totalNum", String.valueOf(this.f14049e));
        this.f14057m.setText(C10539a.m43640a(this.f14045a, R.string.Bitable_Attachment_UploadPopupDesc, hashMap));
    }

    /* renamed from: a */
    public boolean mo18665a() {
        C4535b showingTable;
        C4771b bVar = this.f14053i;
        if (bVar == null || (showingTable = bVar.getShowingTable()) == null || showingTable.mo17775e() == null || showingTable.mo17775e().mo17794c() != EViewType.FORM) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19765b(DialogInterface dialogInterface) {
        mo18668c();
    }

    /* renamed from: a */
    public void mo18659a(Context context) {
        this.f14045a = context;
    }

    /* renamed from: a */
    public void mo18660a(DialogInterface dialogInterface) {
        BitableAttachmentUploadManager aVar = this.f14046b;
        if (aVar != null) {
            aVar.pauseAllUploadTasks();
        }
        mo18658a(1);
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public void mo18658a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        AbstractC7947h hVar = this.f14052h;
        if (hVar != null) {
            hVar.mo17188a(jSONObject);
        }
    }

    /* renamed from: a */
    public void mo18661a(BitableAttachmentUploadManager aVar) {
        if (this.f14046b != aVar) {
            this.f14046b = aVar;
        }
    }

    /* renamed from: a */
    private int m19763a(String str) {
        C4535b showingTable;
        C4525a h;
        C4771b bVar = this.f14053i;
        int i = 0;
        if (!(bVar == null || (showingTable = bVar.getShowingTable()) == null || (h = showingTable.mo17781h(str)) == null || h.mo17714h() == null)) {
            for (C4537a aVar : h.mo17714h()) {
                if (EFieldType.ATTACHMENT.equals(aVar.mo17829a().mo17752i())) {
                    Object c = aVar.mo17835c();
                    if (c instanceof List) {
                        i += ((List) c).size();
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo18662a(C4771b bVar) {
        this.f14053i = bVar;
    }

    /* renamed from: a */
    public void mo18664a(BitableAnalytic bitableAnalytic) {
        this.f14047c = bitableAnalytic;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19764a(DialogInterface dialogInterface, int i) {
        mo18660a(dialogInterface);
    }

    /* renamed from: a */
    public void handle(StartUploadData startUploadData, AbstractC7947h hVar) {
        this.f14052h = hVar;
        BitableAttachmentUploadManager aVar = this.f14046b;
        if (aVar == null || this.f14045a == null || startUploadData == null) {
            C13479a.m54758a("StartUploadHandler", "handle, attachmentUploadManager = " + this.f14046b + ", context = " + this.f14045a + ", data = " + startUploadData);
            return;
        }
        aVar.registerFileUploadStatusListener(this.f14054j);
        if (this.f14051g == null) {
            View inflate = LayoutInflater.from(this.f14045a).inflate(R.layout.bitable_uploading_dialog_content_layout, (ViewGroup) null);
            this.f14057m = (TextView) inflate.findViewById(R.id.loading_text);
            this.f14056l = inflate.findViewById(R.id.loading_view);
            this.f14055k = AnimationUtils.loadAnimation(this.f14045a, R.anim.uploading_anim);
            this.f14051g = ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f14045a).contentLayout(inflate)).title(R.string.Bitable_Attachment_UploadPopupTitle)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Bitable_BTModule_Cancel, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.upload.$$Lambda$StartUploadHandler$7sSZk3Q19oxb38O3raEgYEL5yZg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    StartUploadHandler.this.m19764a((StartUploadHandler) dialogInterface, (DialogInterface) i);
                }
            })).cancelOnTouchOutside(false)).autoDismiss(false)).onDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.upload.$$Lambda$StartUploadHandler$tuU05bOJDubu2Y_0TyFD2KEEE4 */

                public final void onDismiss(DialogInterface dialogInterface) {
                    StartUploadHandler.this.m19765b(dialogInterface);
                }
            })).build();
        }
        if (this.f14051g.isShowing()) {
            C13479a.m54764b("StartUploadHandler", "handle, dialog is showing, ignore");
            return;
        }
        this.f14048d = startUploadData.recordId;
        int a = m19763a(startUploadData.recordId);
        this.f14049e = this.f14046b.uploadPendingMedia(startUploadData.recordId) + a;
        C13479a.m54764b("StartUploadHandler", "handle, uploadTotalNum is " + this.f14049e);
        this.f14050f = a;
        if (this.f14049e > 0) {
            C13479a.m54764b("StartUploadHandler", "onUploadStart");
            this.f14051g.show();
            this.f14056l.startAnimation(this.f14055k);
            mo18669d();
            return;
        }
        mo18658a(0);
    }
}
