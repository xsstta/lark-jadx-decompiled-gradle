package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Label;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.g.a.v */
public class C42145v extends C42128h<Label, MailLabelEntity> {
    public C42145v(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: b */
    public Label mo152040a(Label label, MailLabelEntity mailLabelEntity) {
        Label.ModelType modelType;
        super.mo152040a((Object) label, (Object) mailLabelEntity);
        Label.C16618a a = new Label.C16618a().mo59101a(mailLabelEntity.mo151527k()).mo59099a(Boolean.valueOf(mailLabelEntity.mo151529m())).mo59106b(mailLabelEntity.mo151528l()).mo59108c(C43761d.m173470a(mailLabelEntity.mo151523h())).mo59110d(C43761d.m173470a(mailLabelEntity.mo151515e())).mo59100a(Long.valueOf(mailLabelEntity.mo151530n())).mo59105b(Long.valueOf(mailLabelEntity.mo151531o())).mo59104b(Boolean.valueOf(mailLabelEntity.mo151532p())).mo59107c(Long.valueOf(mailLabelEntity.mo151533q())).mo59109d(Long.valueOf((long) mailLabelEntity.mo151510d())).mo59111e((Long) 0L).mo59097a(Label.EmailClientType.fromValue(mailLabelEntity.mo151538v())).mo59112e(mailLabelEntity.mo151492A()).mo59102a(mailLabelEntity.mo151493B());
        if (mailLabelEntity.mo151494a() == 2) {
            modelType = Label.ModelType.FOLDER;
        } else {
            modelType = Label.ModelType.LABEL;
        }
        return a.mo59098a(modelType).build();
    }

    /* renamed from: a */
    public MailLabelEntity mo152042b(Label label, MailLabelEntity mailLabelEntity) {
        super.mo152042b((Object) label, (Object) mailLabelEntity);
        if (mailLabelEntity == null) {
            mailLabelEntity = new MailLabelEntity();
        }
        int i = 1;
        mailLabelEntity.mo151495a(1);
        mailLabelEntity.mo151508c(label.id);
        mailLabelEntity.mo151499a(label.is_system.booleanValue());
        try {
            mailLabelEntity.mo151503b(label.bg_color);
            mailLabelEntity.mo151497a(label.font_color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailLabelEntity.mo151496a(label.created_timestamp_ms.longValue());
        mailLabelEntity.mo151502b(label.updated_timestamp_ms.longValue());
        mailLabelEntity.mo151504b(label.show_in_label_list.booleanValue());
        mailLabelEntity.mo151507c(label.user_ordered_index.longValue());
        mailLabelEntity.mo151506c(label.unread_count.intValue());
        mailLabelEntity.mo151522g(label.email_client_type.getValue());
        mailLabelEntity.mo151520f(label.parent_id);
        mailLabelEntity.mo151498a(label.node_path);
        String str = label.id;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1952196675:
                if (str.equals("OUTBOX")) {
                    c = 0;
                    break;
                }
                break;
            case -1716897790:
                if (str.equals("IMPORTANT")) {
                    c = 1;
                    break;
                }
                break;
            case -1669082995:
                if (str.equals("SCHEDULED")) {
                    c = 2;
                    break;
                }
                break;
            case -933681182:
                if (str.equals("ARCHIVED")) {
                    c = 3;
                    break;
                }
                break;
            case -61221830:
                if (str.equals("FLAGGED")) {
                    c = 4;
                    break;
                }
                break;
            case 2541464:
                if (str.equals("SENT")) {
                    c = 5;
                    break;
                }
                break;
            case 2551625:
                if (str.equals("SPAM")) {
                    c = 6;
                    break;
                }
                break;
            case 65307009:
                if (str.equals("DRAFT")) {
                    c = 7;
                    break;
                }
                break;
            case 69806694:
                if (str.equals("INBOX")) {
                    c = '\b';
                    break;
                }
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    c = '\t';
                    break;
                }
                break;
            case 78862271:
                if (str.equals("SHARE")) {
                    c = '\n';
                    break;
                }
                break;
            case 80083736:
                if (str.equals("TRASH")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_outbox_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_CustomLabels_Outbox));
                break;
            case 1:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_priority_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_SmartInbox_Important));
                break;
            case 2:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_sent_scheduled_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Scheduled));
                break;
            case 3:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_archive_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Archived));
                break;
            case 4:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_flag_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Flagged));
                break;
            case 5:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_sent_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Sent));
                break;
            case 6:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_spam_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Spam));
                break;
            case 7:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_draft_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Draft));
                break;
            case '\b':
                mailLabelEntity.mo151501b(R.drawable.ud_icon_inbox_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Inbox));
                break;
            case '\t':
                mailLabelEntity.mo151501b(R.drawable.ud_icon_inbox_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_SmartInbox_Others));
                break;
            case '\n':
                mailLabelEntity.mo151501b(R.drawable.ud_icon_share_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Share_LabelName));
                break;
            case 11:
                mailLabelEntity.mo151501b(R.drawable.ud_icon_delete_trash_outlined);
                mailLabelEntity.mo151512d(C43819s.m173684a((int) R.string.Mail_Folder_Trash));
                break;
            default:
                mailLabelEntity.mo151512d(label.name);
                mailLabelEntity.mo151501b(R.drawable.ud_icon_label_custom_outlined);
                mailLabelEntity.mo151513d(false);
                break;
        }
        if (label.model_type == Label.ModelType.FOLDER) {
            i = 2;
        }
        mailLabelEntity.mo151495a(i);
        if (label.model_type == Label.ModelType.FOLDER) {
            mailLabelEntity.mo151501b(R.drawable.ud_icon_folder_outlined);
        }
        return mailLabelEntity;
    }
}
