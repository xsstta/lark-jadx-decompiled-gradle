package com.ss.android.vc.meeting.module.share.p3162c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;

/* renamed from: com.ss.android.vc.meeting.module.share.c.a */
public class C62956a extends LarkRecyclerViewBaseAdapter<C62959b, VideoChatShareItem> {

    /* renamed from: a */
    public AbstractC62958a f158619a;

    /* renamed from: b */
    private Context f158620b;

    /* renamed from: com.ss.android.vc.meeting.module.share.c.a$a */
    public interface AbstractC62958a {
        /* renamed from: a */
        void mo217593a(VideoChatShareItem videoChatShareItem);
    }

    public C62956a() {
        setHasStableIds(true);
    }

    /* renamed from: com.ss.android.vc.meeting.module.share.c.a$b */
    public static class C62959b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LKUIRoundedImageView f158623a;

        public C62959b(View view) {
            super(view);
            this.f158623a = (LKUIRoundedImageView) view.findViewById(R.id.preview_avatar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return Long.parseLong(((VideoChatShareItem) getItem(i)).getId());
    }

    /* renamed from: a */
    public C62959b onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f158620b = viewGroup.getContext();
        return new C62959b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videochat_forward_chat_select_preview_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C62959b bVar, int i) {
        final VideoChatShareItem videoChatShareItem = (VideoChatShareItem) getItem(i);
        C60783v.m236230a(videoChatShareItem.getImageKey(), videoChatShareItem.getId(), ParticipantType.LARK_USER, bVar.f158623a, 32, 32);
        m246538a(bVar, videoChatShareItem, i);
        bVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.share.p3162c.C62956a.View$OnClickListenerC629571 */

            public void onClick(View view) {
                if (C62956a.this.f158619a != null) {
                    C62956a.this.f158619a.mo217593a(videoChatShareItem);
                }
            }
        });
    }

    /* renamed from: a */
    private void m246538a(C62959b bVar, VideoChatShareItem videoChatShareItem, int i) {
        int i2;
        int i3 = i % 5;
        int i4 = 0;
        if (i3 == 0) {
            i2 = UIUtils.dp2px(this.f158620b, 8.0f);
        } else if (i3 == 4) {
            i4 = UIUtils.dp2px(this.f158620b, 8.0f);
            i2 = 0;
        } else {
            i4 = UIUtils.dp2px(this.f158620b, 8.0f);
            i2 = UIUtils.dp2px(this.f158620b, 8.0f);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) bVar.itemView.getLayoutParams();
        layoutParams.leftMargin = i4;
        layoutParams.rightMargin = i2;
    }
}
