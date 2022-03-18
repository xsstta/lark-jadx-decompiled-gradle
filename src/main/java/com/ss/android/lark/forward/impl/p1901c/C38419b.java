package com.ss.android.lark.forward.impl.p1901c;

import android.app.Activity;
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
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.impl.view.adapter.ForwardSendDialogAdapter;
import com.ss.android.lark.forward.impl.view.p1906b.AbstractC38454a;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.c.b */
public class C38419b {

    /* renamed from: com.ss.android.lark.forward.impl.c.b$a */
    public interface AbstractC38423a {
        void onCancelForward();
    }

    /* renamed from: com.ss.android.lark.forward.impl.c.b$b */
    public interface AbstractC38424b {
        void onConfirmForward(String str);
    }

    /* renamed from: a */
    public static void m151533a(final Activity activity, String str, final boolean z, int i, List<SearchBaseInfo> list, final AbstractC38424b bVar, final AbstractC38423a aVar, AbstractC38454a aVar2, String str2, String str3) {
        String str4;
        int i2;
        boolean z2;
        String str5;
        int i3;
        C25639g gVar = new C25639g(activity);
        if (C57782ag.m224241a(str)) {
            str4 = UIUtils.getString(activity, R.string.Lark_Legacy_ChatViewSendTo);
        } else {
            str4 = str;
        }
        gVar.mo89237b(str4);
        gVar.mo89252k(3);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.forward_confirm_dialog, (ViewGroup) null, false);
        inflate.setBackgroundColor(UIUtils.getColor(activity, R.color.bg_float));
        View findViewById = inflate.findViewById(R.id.single_pick_container);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.single_pick_avatar);
        TextView textView = (TextView) inflate.findViewById(R.id.single_pick_name);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.multi_pick_rv);
        final EditText editText = (EditText) inflate.findViewById(R.id.addition_text);
        View findViewById2 = inflate.findViewById(R.id.feed_thread_icon);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        editText.setVisibility(i2);
        if (list.size() == 1) {
            SearchBaseInfo searchBaseInfo = list.get(0);
            recyclerView.setVisibility(8);
            findViewById.setVisibility(0);
            AbstractC38365a.AbstractC38372g f = C38364a.m151054a().mo140444f();
            String avatarKey = searchBaseInfo.getAvatarKey();
            boolean z3 = searchBaseInfo instanceof SearchThreadInfo;
            if (z3) {
                str5 = ((SearchThreadInfo) searchBaseInfo).getChannel().getId();
            } else {
                str5 = searchBaseInfo.getId();
            }
            f.mo140505a(activity, avatarKey, str5, imageView, UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f));
            textView.setText(searchBaseInfo.getTitle());
            if (z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            findViewById2.setVisibility(i3);
        } else {
            recyclerView.setVisibility(0);
            findViewById.setVisibility(8);
            if (!DesktopUtil.m144301a((Context) activity)) {
                recyclerView.setLayoutManager(new GridLayoutManager(activity, 5));
            } else if (i == 1) {
                recyclerView.setLayoutManager(new GridLayoutManager(activity, 5));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(activity, 7));
            }
            ForwardSendDialogAdapter forwardSendDialogAdapter = new ForwardSendDialogAdapter();
            recyclerView.addItemDecoration(new RecyclerView.AbstractC1335d() {
                /* class com.ss.android.lark.forward.impl.p1901c.C38419b.C384201 */

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    super.getItemOffsets(rect, view, recyclerView, state);
                    rect.bottom = UIUtils.dp2px(activity, 10.0f);
                }
            });
            forwardSendDialogAdapter.addAll(list);
            recyclerView.setAdapter(forwardSendDialogAdapter);
        }
        gVar.mo89236b(inflate);
        gVar.mo89225a(R.id.lkui_dialog_btn_right, str2, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.forward.impl.p1901c.C38419b.DialogInterface$OnClickListenerC384223 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    KeyboardUtils.hideKeyboard(activity, editText);
                }
                AbstractC38424b bVar = bVar;
                if (bVar != null) {
                    bVar.onConfirmForward(editText.getText().toString());
                }
            }
        }).mo89225a(R.id.lkui_dialog_btn_left, str3, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.forward.impl.p1901c.C38419b.DialogInterface$OnClickListenerC384212 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    KeyboardUtils.hideKeyboard(activity, editText);
                }
                AbstractC38423a aVar = aVar;
                if (aVar != null) {
                    aVar.onCancelForward();
                }
            }
        });
        if (aVar2 != null) {
            aVar2.onSetupForwardContent(inflate);
        }
        if (!DesktopUtil.m144307b() || i != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            gVar.mo89222a(440.0f);
        }
        DialogC25637f b = gVar.mo89233b();
        if (b.getWindow() != null) {
            if (z2) {
                b.getWindow().setDimAmount(0.7f);
            } else {
                b.getWindow().setDimAmount(0.3f);
            }
        }
        C38364a.m151054a().mo140435a(b);
        b.show();
    }
}
