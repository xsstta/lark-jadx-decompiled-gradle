package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.component.universe_design.image.UDTextAvatar;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.widget.c */
public class C47148c extends UDAvatarList.AvatarAdapter<MmParticipants.MmParticipantInfo> {

    /* renamed from: a */
    private int f118851a;

    /* renamed from: b */
    private int f118852b;

    /* renamed from: b */
    public void mo165765b(int i) {
        this.f118852b = i;
    }

    @Override // com.larksuite.component.universe_design.image.UDAvatarList.AvatarAdapter
    /* renamed from: a */
    public UDAvatar mo91008a(Context context) {
        int b = this.f118852b - (mo91012b() - 1);
        UDTextAvatar uDTextAvatar = new UDTextAvatar(context);
        if (b >= 1000) {
            uDTextAvatar.setAvatarText("1k+");
        } else if (b >= 99) {
            uDTextAvatar.setAvatarText("99+");
        } else {
            uDTextAvatar.setAvatarText("+" + b);
        }
        uDTextAvatar.setTextColor(Integer.valueOf(C57582a.m223616d(context, R.color.text_caption)));
        uDTextAvatar.setAvatarBgColor(C57582a.m223616d(context, R.color.bg_filler));
        uDTextAvatar.setBorderColor(C57582a.m223616d(context, R.color.bg_body));
        uDTextAvatar.setBorderStyle(0);
        uDTextAvatar.setAvatarSize(mo91013c());
        return uDTextAvatar;
    }

    public C47148c(int i, List<MmParticipants.MmParticipantInfo> list) {
        super(i, list);
        this.f118851a = m186789b(C45851c.m181646a(), i);
    }

    @Override // com.larksuite.component.universe_design.image.UDAvatarList.AvatarAdapter
    /* renamed from: a */
    public void mo18933a(final UDAvatar uDAvatar, int i) {
        final MmParticipants.MmParticipantInfo mmParticipantInfo = (MmParticipants.MmParticipantInfo) getItem(i);
        if (mmParticipantInfo != null) {
            uDAvatar.setTag(mmParticipantInfo.getAvatarUrl());
            Context a = C45851c.m181646a();
            String avatarUrl = mmParticipantInfo.getAvatarUrl();
            int i2 = this.f118851a;
            C45853e.m181656a(a, avatarUrl, i2, i2, new C45853e.AbstractC45854a() {
                /* class com.ss.android.lark.mm.widget.C47148c.C471491 */

                @Override // com.ss.android.lark.mm.p2288b.C45853e.AbstractC45854a
                /* renamed from: a */
                public void mo161154a(Bitmap bitmap) {
                    if (bitmap != null && mmParticipantInfo.getAvatarUrl().equals(uDAvatar.getTag().toString())) {
                        uDAvatar.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private int m186789b(Context context, int i) {
        if (i == -1) {
            this.f118851a = (int) UDDimenUtils.m93311c(context, (int) R.dimen.ud_avatar_size_large);
        } else if (i == -2) {
            this.f118851a = (int) UDDimenUtils.m93311c(context, (int) R.dimen.ud_avatar_size_middle);
        } else if (i == -3) {
            this.f118851a = (int) UDDimenUtils.m93311c(context, (int) R.dimen.ud_avatar_size_small);
        } else if (i == -4) {
            this.f118851a = (int) UDDimenUtils.m93311c(context, (int) R.dimen.ud_avatar_size_mini);
        } else {
            this.f118851a = (int) UDDimenUtils.m93307a(context, (float) i);
        }
        return this.f118851a;
    }
}
