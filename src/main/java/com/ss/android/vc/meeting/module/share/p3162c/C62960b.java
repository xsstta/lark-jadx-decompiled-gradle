package com.ss.android.vc.meeting.module.share.p3162c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.share.ShareItemType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.statistics.event.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.vc.meeting.module.share.c.b */
public class C62960b {

    /* renamed from: com.ss.android.vc.meeting.module.share.c.b$a */
    public interface AbstractC62964a {
        /* renamed from: a */
        void mo217596a(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str);
    }

    /* renamed from: a */
    public static void m246543a(ArrayList<VideoChatShareItem> arrayList, String str, AbstractC62964a aVar) {
        if (arrayList != null && aVar != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            Iterator<VideoChatShareItem> it = arrayList.iterator();
            while (it.hasNext()) {
                VideoChatShareItem next = it.next();
                if (next != null && !C57782ag.m224241a(next.getId())) {
                    if (next.getType() == ShareItemType.GROUP || next.isSecret()) {
                        arrayList3.add(next.getId());
                    } else {
                        arrayList2.add(next.getId());
                    }
                }
            }
            aVar.mo217596a(arrayList2, arrayList3, str);
        }
    }

    /* renamed from: a */
    public static Dialog m246542a(final Context context, final ArrayList<VideoChatShareItem> arrayList, final AbstractC62964a aVar, final VideoChat videoChat) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.videochat_share_confirm_dialog, (ViewGroup) null, false);
        inflate.setBackgroundColor(C60773o.m236126d(R.color.bg_float));
        View findViewById = inflate.findViewById(R.id.single_pick_container);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.single_pick_avatar);
        TextView textView = (TextView) inflate.findViewById(R.id.single_pick_name);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.multi_pick_rv);
        final EditText editText = (EditText) inflate.findViewById(R.id.addition_text);
        if (arrayList.size() == 1) {
            VideoChatShareItem videoChatShareItem = arrayList.get(0);
            if (videoChatShareItem == null) {
                return null;
            }
            recyclerView.setVisibility(8);
            findViewById.setVisibility(0);
            C60783v.m236230a(videoChatShareItem.getImageKey(), videoChatShareItem.getId(), ParticipantType.LARK_USER, imageView, 40, 40);
            textView.setText(videoChatShareItem.getName());
        } else {
            recyclerView.setVisibility(0);
            findViewById.setVisibility(8);
            recyclerView.setLayoutManager(new GridLayoutManager(context, 5));
            C62956a aVar2 = new C62956a();
            recyclerView.addItemDecoration(new RecyclerView.AbstractC1335d() {
                /* class com.ss.android.vc.meeting.module.share.p3162c.C62960b.C629611 */

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    super.getItemOffsets(rect, view, recyclerView, state);
                    rect.bottom = UIUtils.dp2px(context, 12.0f);
                }
            });
            aVar2.addAll(arrayList);
            recyclerView.setAdapter(aVar2);
        }
        return VCDialogUtils.m236164a(context, inflate, (int) R.string.View_M_ShareMeetingToColon, 3, (int) R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.share.p3162c.C62960b.DialogInterface$OnClickListenerC629622 */

            public void onClick(DialogInterface dialogInterface, int i) {
                ap.m250029b(videoChat);
            }
        }, (int) R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.share.p3162c.C62960b.DialogInterface$OnClickListenerC629633 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C62960b.m246543a(arrayList, editText.getText().toString(), aVar);
            }
        }, true);
    }
}
