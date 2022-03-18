package com.bytedance.ee.bear.bitable.card.view.cell.attachment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.AttachmentEntity;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4526a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.PendingUploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.UploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AbstractC4596c;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentGridView;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentMediaPickerPanel;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentMenuEnum;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.C4587a;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.api.FileType;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.fileselector.listener.OnDismissListener;
import com.bytedance.ee.bear.fileselector.listener.SimpleFileSizeCheckListener;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.a */
public class C4574a extends AbstractC4597b<List<AttachmentEntity>, List<AttachmentEntity>> implements BitableAttachmentUploadManager.FileUploadStatusListener, AbstractC4596c, AbstractC4607d {

    /* renamed from: g */
    public BitableAttachmentUploadManager f13488g;

    /* renamed from: h */
    public boolean f13489h;

    /* renamed from: i */
    public C4537a<List<AttachmentEntity>> f13490i;

    /* renamed from: j */
    private View f13491j;

    /* renamed from: k */
    private AttachmentGridView f13492k;

    /* renamed from: l */
    private View f13493l;

    /* renamed from: m */
    private ImageView f13494m;

    /* renamed from: n */
    private AttachmentMediaPickerPanel f13495n;

    /* renamed from: o */
    private AbstractC4548e f13496o;

    /* renamed from: p */
    private C4587a.AbstractC4590a f13497p;

    /* renamed from: q */
    private AbstractC7720n f13498q;

    /* renamed from: r */
    private C4771b f13499r;

    /* renamed from: s */
    private ArrayList<UploadAttachmentEntity> f13500s;

    /* renamed from: t */
    private List<AttachmentEntity> f13501t = new ArrayList();

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
    /* renamed from: a */
    public void mo18014a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, String str3) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13491j;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        super.mo17995a(z, eFieldUneditableReason);
        View a = mo17991a();
        boolean isEmpty = this.f13501t.isEmpty();
        if (a != null && z && isEmpty) {
            a.setBackgroundResource(R.drawable.bitable_card_field_attachment_bg);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
    /* renamed from: a */
    public void mo18012a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, float f) {
        if (m19009a(str, str2) && this.f13501t.contains(uploadAttachmentEntity)) {
            this.f13492k.mo18080a(this.f13501t.indexOf(uploadAttachmentEntity));
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
    /* renamed from: a */
    public void mo18013a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2, int i) {
        if (m19009a(str, str2) && uploadAttachmentEntity.getClass() == UploadAttachmentEntity.class) {
            m19007a(uploadAttachmentEntity);
        }
    }

    /* renamed from: n */
    private void m19012n() {
        C13742g.m55711d(new Runnable() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.$$Lambda$a$Jz7KDVSnyMhO9HUhz_sL8OBX5U */

            public final void run() {
                C4574a.this.m19015q();
            }
        });
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: p */
    private void m19014p() {
        if (this.f13495n == null) {
            this.f13495n = new AttachmentMediaPickerPanel(mo17991a().getContext());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        AttachmentMediaPickerPanel bVar = this.f13495n;
        if (bVar != null) {
            bVar.mo18103a();
        }
        AbstractC4548e eVar = this.f13496o;
        if (eVar != null) {
            eVar.mo17910b(mo17991a(), this);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: k */
    public void mo18016k() {
        super.mo18016k();
        this.f13488g.unregisterFileUploadStatusListener(this);
        if (this.f13498q != null) {
            this.f13588e.mo17868b(this.f13498q);
        }
    }

    /* renamed from: l */
    public boolean mo18017l() {
        C4535b f = this.f13584a.mo17748f();
        if (f.mo17789n() || f.mo17775e().mo17794c() == EViewType.FORM) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m19013o() {
        if (this.f13497p == null) {
            this.f13497p = new C4587a.AbstractC4590a() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.$$Lambda$a$NhkIyiCZRh6p13NNddwxtKMWIk */

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.C4587a.AbstractC4590a
                public final void onMenuClicked(AttachmentMenuEnum attachmentMenuEnum, AttachmentEntity attachmentEntity) {
                    C4574a.this.m19008a((C4574a) attachmentMenuEnum, (AttachmentMenuEnum) attachmentEntity);
                }
            };
        }
        if (!this.f13585b || mo18116e()) {
            this.f13492k.mo18079a(null, null);
            return;
        }
        this.f13498q = this.f13492k.mo18079a(new AttachmentMenuEnum[]{AttachmentMenuEnum.DELETE}, this.f13497p);
        this.f13588e.mo17862a(this.f13498q);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        super.mo17996h();
        m19014p();
        this.f13495n.mo18104a(new SimpleFileSelectListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.C4574a.C45751 */

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo18018a() {
                C4574a.this.mo17997i();
            }

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo18019a(List<? extends FileBean> list) {
                C13479a.m54764b("AttachmentCellViewHolder", "select media... size = " + list.size());
                C4574a.this.mo17997i();
                for (FileBean fileBean : list) {
                    C4574a.this.f13488g.uploadSelectedMedia(fileBean, C4574a.this.f13588e.mo17878k(), C4574a.this.f13490i.mo17834b().mo17705a(), C4574a.this.f13490i.mo17829a().mo17749g(), C4574a.this.f13490i.mo17834b().mo17707b(), C4574a.this.mo18017l(), C4574a.this.f13489h);
                    C4574a.this.f13588e.mo17876i().mo18683b(C13675f.m55521c(fileBean.getPath()));
                }
                C4574a.this.f13588e.mo17876i().mo18674a("upload_new_attachment", list.size());
            }
        }, new SimpleFileSizeCheckListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.C4574a.C45762 */

            @Override // com.bytedance.ee.bear.fileselector.listener.SimpleFileSizeCheckListener, com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener
            public void onFileOverSize(FileType fileType) {
                if (C4574a.this.f13588e.mo17873f() != null) {
                    Toast.showText(C4574a.this.f13588e.mo17873f(), (int) R.string.Bitable_Field_AttachmentSizeLimit);
                }
            }
        }, new OnDismissListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.$$Lambda$Jn3kJXiaYf1isGt274sHVNMdT4 */

            @Override // com.bytedance.ee.bear.fileselector.listener.OnDismissListener
            public final void onDismiss() {
                C4574a.this.mo17997i();
            }
        }, this.f13489h);
        AbstractC4548e eVar = this.f13496o;
        if (eVar != null) {
            eVar.mo17908a(mo17991a(), this);
        }
        this.f13588e.mo17876i().mo18686c("add");
    }

    /* renamed from: m */
    private void m19011m() {
        this.f13501t.clear();
        ArrayList<UploadAttachmentEntity> arrayList = this.f13500s;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f13488g.shouldDisableLandscape(false, true);
        } else {
            this.f13501t.addAll(this.f13500s);
            this.f13488g.shouldDisableLandscape(true, true);
        }
        if (this.f13490i.mo17835c() != null && !this.f13490i.mo17835c().isEmpty()) {
            this.f13501t.addAll(this.f13490i.mo17835c());
        }
        this.f13492k.setData(this.f13501t);
        m19012n();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: q */
    private /* synthetic */ void m19015q() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 8;
        if (!this.f13585b || mo18116e() || this.f13587d) {
            this.f13492k.setVisibility(0);
            this.f13493l.setVisibility(8);
            return;
        }
        boolean isEmpty = this.f13501t.isEmpty();
        View view = this.f13491j;
        if (isEmpty) {
            i = R.drawable.bitable_card_field_attachment_bg;
        } else {
            i = R.drawable.bitable_card_field_item_bg_selector;
        }
        view.setBackgroundResource(i);
        AttachmentGridView attachmentGridView = this.f13492k;
        if (!isEmpty) {
            i5 = 0;
        }
        attachmentGridView.setVisibility(i5);
        ImageView imageView = this.f13494m;
        imageView.setImageDrawable(m19010b(imageView.getContext()));
        this.f13493l.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13493l.getLayoutParams();
        if (isEmpty) {
            i2 = 0;
        } else {
            i2 = C57582a.m223600a(12);
        }
        marginLayoutParams.setMargins(i2, 0, i2, i2);
        if (isEmpty) {
            i3 = mo17991a().getResources().getDimensionPixelSize(R.dimen.bitable_cell_min_height);
        } else {
            i3 = C57582a.m223600a(36);
        }
        marginLayoutParams.height = i3;
        this.f13493l.setLayoutParams(marginLayoutParams);
        View view2 = this.f13493l;
        if (isEmpty) {
            i4 = R.drawable.bitable_card_field_attachment_add_button_bg_empty;
        } else {
            i4 = R.drawable.bitable_card_field_attachment_add_button_bg;
        }
        view2.setBackgroundResource(i4);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    private /* synthetic */ void m19006a(View view) {
        this.f13491j.requestFocus();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d
    /* renamed from: a */
    public int mo17990a(Context context) {
        if (this.f13495n != null) {
            return C57582a.m223600a(324);
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: b */
    public void mo18015b(boolean z) {
        super.mo18015b(z);
        m19012n();
        this.f13492k.mo18081a(z);
    }

    /* renamed from: a */
    private void m19007a(UploadAttachmentEntity uploadAttachmentEntity) {
        ArrayList<UploadAttachmentEntity> arrayList = this.f13500s;
        if (arrayList != null && arrayList.contains(uploadAttachmentEntity)) {
            this.f13500s.remove(uploadAttachmentEntity);
            m19011m();
        }
    }

    /* renamed from: b */
    private Drawable m19010b(Context context) {
        int i;
        if (this.f13489h) {
            i = R.drawable.ud_icon_camera_outlined;
        } else {
            i = R.drawable.ud_icon_add_outlined;
        }
        Drawable mutate = context.getDrawable(i).mutate();
        mutate.setTint(context.getResources().getColor(R.color.fill_pressed));
        Drawable mutate2 = context.getDrawable(i).mutate();
        mutate2.setTint(context.getResources().getColor(R.color.icon_n3));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, mutate);
        stateListDrawable.addState(new int[]{-16842919}, mutate2);
        return stateListDrawable;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AbstractC4596c
    /* renamed from: a */
    public PendingUploadAttachmentEntity mo18009a(String str) {
        return this.f13488g.findPendingUploadAttachmentByFileToken(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AbstractC4596c
    /* renamed from: a */
    public void mo18010a(AttachmentEntity attachmentEntity) {
        if (attachmentEntity != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SaveToLocalMenuV2());
            LocalOpenEntity localOpenEntity = null;
            if (attachmentEntity instanceof PendingUploadAttachmentEntity) {
                PendingUploadAttachmentEntity pendingUploadAttachmentEntity = (PendingUploadAttachmentEntity) attachmentEntity;
                localOpenEntity = new LocalOpenEntity("26_local", null, null, pendingUploadAttachmentEntity.getName(), null, arrayList, pendingUploadAttachmentEntity.getPhoto().getPath());
            } else if (!TextUtils.isEmpty(attachmentEntity.getAttachmentToken())) {
                PendingUploadAttachmentEntity a = mo18009a(attachmentEntity.getAttachmentToken());
                if (a != null) {
                    localOpenEntity = new LocalOpenEntity("26_local", null, null, a.getName(), null, arrayList, a.getPhoto().getPath());
                } else {
                    SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity = new SpaceThirdPartyOpenEntity("26", attachmentEntity.getAttachmentToken(), attachmentEntity.getName());
                    spaceThirdPartyOpenEntity.setApiExtra(attachmentEntity.getExtra());
                    spaceThirdPartyOpenEntity.setMountPoint(attachmentEntity.getMountPointType());
                    spaceThirdPartyOpenEntity.setMountNodeToken(attachmentEntity.getMountNodeToken());
                    spaceThirdPartyOpenEntity.setPreviewFrom("bitable_attach");
                    spaceThirdPartyOpenEntity.setBusinessId("bitable_attach");
                    spaceThirdPartyOpenEntity.setUniqueId(attachmentEntity.getAttachmentToken());
                    spaceThirdPartyOpenEntity.setMoreMenuActions(arrayList);
                    localOpenEntity = spaceThirdPartyOpenEntity;
                }
            }
            if (localOpenEntity != null) {
                this.f13588e.mo17876i().mo18673a("preview");
                if (!this.f13499r.getEnableFollow().mo5927b().booleanValue() || !(localOpenEntity instanceof SpaceThirdPartyOpenEntity)) {
                    ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21092a(this.f13588e.mo17873f(), localOpenEntity);
                    return;
                }
                C4537a<List<AttachmentEntity>> aVar = this.f13490i;
                if (aVar != null) {
                    this.f13499r.updateAttachment(new AttachmentFollowData(aVar.mo17829a().mo17749g(), this.f13501t.indexOf(attachmentEntity), this.f13490i.mo17834b().mo17707b(), (SpaceThirdPartyOpenEntity) localOpenEntity));
                    return;
                }
                return;
            }
            C13479a.m54758a("AttachmentCellViewHolder", "onAttachmentClick, openEntity is null");
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<AttachmentEntity>> aVar) {
        super.mo17993a((C4537a) aVar);
        this.f13490i = aVar;
        this.f13500s = this.f13488g.findUploadingAttachmentList(aVar.mo17834b().mo17707b(), aVar.mo17829a().mo17749g());
        if (this.f13584a instanceof C4526a) {
            this.f13489h = ((C4526a) this.f13584a).mo17718a();
        }
        m19011m();
        m19013o();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m19008a(AttachmentMenuEnum attachmentMenuEnum, AttachmentEntity attachmentEntity) {
        if (attachmentMenuEnum == AttachmentMenuEnum.DELETE) {
            this.f13588e.mo17876i().mo18673a("delete_attachment");
            this.f13588e.mo17876i().mo18686c("delete");
            if (attachmentEntity instanceof UploadAttachmentEntity) {
                UploadAttachmentEntity uploadAttachmentEntity = (UploadAttachmentEntity) attachmentEntity;
                this.f13488g.removeUploadTasks(uploadAttachmentEntity);
                m19007a(uploadAttachmentEntity);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(attachmentEntity);
            mo18111a(arrayList, "delete");
        }
    }

    /* renamed from: a */
    private boolean m19009a(String str, String str2) {
        C4537a<List<AttachmentEntity>> aVar = this.f13490i;
        if (aVar == null || !TextUtils.equals(aVar.mo17829a().mo17749g(), str) || !TextUtils.equals(this.f13490i.mo17834b().mo17707b(), str2)) {
            return false;
        }
        return true;
    }

    public C4574a(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar);
        this.f13496o = eVar;
        this.f13488g = (BitableAttachmentUploadManager) C4950k.m20474a(dVar.mo17874g(), BitableAttachmentUploadManager.class);
        this.f13499r = (C4771b) C4950k.m20474a(dVar.mo17874g(), C4771b.class);
        this.f13488g.registerFileUploadStatusListener(this);
        this.f13488g.setBitableCardDelegate(dVar);
        this.f13491j = view.findViewById(R.id.attachment_container);
        AttachmentGridView attachmentGridView = (AttachmentGridView) view.findViewById(R.id.attachment_content);
        this.f13492k = attachmentGridView;
        attachmentGridView.setAttachmentViewDelegate(this);
        View findViewById = view.findViewById(R.id.add_attachment_button_fl);
        this.f13493l = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.$$Lambda$a$vV2mlE_T8UsEZF7R9dk9Y4scsQ */

            public final void onClick(View view) {
                C4574a.this.m19006a((C4574a) view);
            }
        });
        this.f13494m = (ImageView) view.findViewById(R.id.add_attachment_button_image);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.FileUploadStatusListener
    /* renamed from: a */
    public void mo18011a(UploadAttachmentEntity uploadAttachmentEntity, String str, String str2) {
        if (m19009a(str, str2)) {
            if (this.f13500s == null) {
                this.f13500s = new ArrayList<>();
            }
            if (!this.f13500s.contains(uploadAttachmentEntity)) {
                this.f13500s.add(0, uploadAttachmentEntity);
            }
            m19011m();
            boolean z = true;
            if (uploadAttachmentEntity instanceof PendingUploadAttachmentEntity) {
                z = true ^ ((PendingUploadAttachmentEntity) uploadAttachmentEntity).isPendingUpload();
            }
            if (z) {
                this.f13588e.mo17876i().mo18686c("upload");
            }
        }
    }
}
