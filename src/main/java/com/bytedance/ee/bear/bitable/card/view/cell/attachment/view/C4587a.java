package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.os.Build;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.AttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.PendingUploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.UploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.C4587a;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.util.p701d.C13630j;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.a */
public class C4587a extends RecyclerView.Adapter<C4591b> {

    /* renamed from: a */
    public List<AttachmentEntity> f13565a = new ArrayList();

    /* renamed from: b */
    public AbstractC4596c f13566b;

    /* renamed from: c */
    public AttachmentMenuEnum[] f13567c;

    /* renamed from: d */
    public AbstractC4590a f13568d;

    /* renamed from: e */
    private ActionMode f13569e;

    /* renamed from: f */
    private AbstractC7720n f13570f;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.a$a */
    public interface AbstractC4590a {
        void onMenuClicked(AttachmentMenuEnum attachmentMenuEnum, AttachmentEntity attachmentEntity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13565a.size();
    }

    /* renamed from: a */
    public void mo18093a() {
        ActionMode actionMode = this.f13569e;
        if (actionMode != null) {
            actionMode.finish();
            this.f13569e = null;
        }
    }

    /* renamed from: a */
    public void mo18096a(AbstractC4596c cVar) {
        this.f13566b = cVar;
    }

    /* renamed from: a */
    public void mo18097a(List<AttachmentEntity> list) {
        this.f13565a = list;
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.a$b */
    public class C4591b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public AttachmentCoverView f13576a;

        /* renamed from: c */
        private View f13578c;

        /* renamed from: d */
        private View f13579d;

        /* renamed from: a */
        public void mo18102a(AttachmentEntity attachmentEntity) {
            this.f13576a.mo18072a(attachmentEntity, C4587a.this.getItemCount() - C4587a.this.f13565a.indexOf(attachmentEntity));
            this.f13578c.setOnClickListener(new View.OnClickListener(attachmentEntity) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.$$Lambda$a$b$4WY5gGB01NlsbYyA2oPdIIJf6q4 */
                public final /* synthetic */ AttachmentEntity f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C4587a.C4591b.this.m19073b(this.f$1, view);
                }
            });
            this.f13578c.setOnLongClickListener(new View.OnLongClickListener(attachmentEntity) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.$$Lambda$a$b$sWh0i8PewfbHRRLrdZlTmGPotw */
                public final /* synthetic */ AttachmentEntity f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onLongClick(View view) {
                    return C4587a.C4591b.this.m19072a(this.f$1, view);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m19073b(AttachmentEntity attachmentEntity, View view) {
            if (C4587a.this.f13566b != null) {
                C4587a.this.f13566b.mo18010a(attachmentEntity);
            }
        }

        C4591b(View view) {
            super(view);
            this.f13578c = view;
            this.f13579d = view.findViewById(R.id.highlight_border);
            AttachmentCoverView attachmentCoverView = (AttachmentCoverView) this.f13578c.findViewById(R.id.attachment_cover_view);
            this.f13576a = attachmentCoverView;
            attachmentCoverView.setAttachmentViewDelegate(C4587a.this.f13566b);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ boolean m19072a(AttachmentEntity attachmentEntity, View view) {
            if (C4587a.this.f13567c == null || C4587a.this.f13567c.length <= 0) {
                return true;
            }
            if (!attachmentEntity.getClass().equals(AttachmentEntity.class) && !attachmentEntity.getClass().equals(PendingUploadAttachmentEntity.class)) {
                return true;
            }
            C4587a.this.mo18094a(this.f13576a, this.f13579d, attachmentEntity);
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        int hashCode;
        if (i >= 0 && i < getItemCount()) {
            AttachmentEntity attachmentEntity = this.f13565a.get(i);
            if (attachmentEntity instanceof UploadAttachmentEntity) {
                String uploadTaskKey = ((UploadAttachmentEntity) attachmentEntity).getUploadTaskKey();
                if (TextUtils.isEmpty(uploadTaskKey)) {
                    return super.getItemId(i);
                }
                hashCode = uploadTaskKey.hashCode();
            } else {
                String id = this.f13565a.get(i).getId();
                if (!TextUtils.isEmpty(id)) {
                    hashCode = id.hashCode();
                }
            }
            return (long) hashCode;
        }
        return super.getItemId(i);
    }

    /* renamed from: a */
    public C4591b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4591b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_card_attachment_rv_item, viewGroup, false));
    }

    /* renamed from: a */
    public AbstractC7720n mo18092a(AttachmentMenuEnum[] attachmentMenuEnumArr, AbstractC4590a aVar) {
        this.f13567c = attachmentMenuEnumArr;
        this.f13568d = aVar;
        if (this.f13570f == null) {
            this.f13570f = new AbstractC7720n() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.C4587a.C45881 */

                @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
                public boolean onTouchStartIntercept(MotionEvent motionEvent) {
                    C4587a.this.mo18093a();
                    return false;
                }
            };
        }
        return this.f13570f;
    }

    /* renamed from: a */
    public void onBindViewHolder(C4591b bVar, int i) {
        AttachmentEntity attachmentEntity = this.f13565a.get(i);
        bVar.mo18102a(attachmentEntity);
        if (attachmentEntity instanceof UploadAttachmentEntity) {
            bVar.f13576a.mo18071a(((UploadAttachmentEntity) attachmentEntity).getUploadProgress());
        }
    }

    /* renamed from: a */
    public void mo18094a(final View view, final View view2, final AttachmentEntity attachmentEntity) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f13569e = view.startActionMode(new ActionMode.Callback() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.C4587a.ActionMode$CallbackC45892 */

                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                public void onDestroyActionMode(ActionMode actionMode) {
                    view2.setVisibility(8);
                }

                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    C4587a.this.mo18093a();
                    if (C4587a.this.f13568d == null) {
                        return true;
                    }
                    C4587a.this.f13568d.onMenuClicked(AttachmentMenuEnum.valueOf(menuItem.getItemId()), attachmentEntity);
                    return true;
                }

                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    C13630j.m55310a(view.getContext(), 10, 50);
                    view2.setVisibility(0);
                    AttachmentMenuEnum[] attachmentMenuEnumArr = C4587a.this.f13567c;
                    for (AttachmentMenuEnum attachmentMenuEnum : attachmentMenuEnumArr) {
                        menu.add(0, attachmentMenuEnum.getId(), 0, attachmentMenuEnum.getTitleResId());
                    }
                    return true;
                }
            }, 1);
        }
    }
}
