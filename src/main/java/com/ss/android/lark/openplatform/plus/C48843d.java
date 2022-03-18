package com.ss.android.lark.openplatform.plus;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.facebook.soloader.SoLoader;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.ttve.utils.C60275a;
import java.util.List;

/* renamed from: com.ss.android.lark.openplatform.plus.d */
public class C48843d {
    /* renamed from: a */
    private View m192455a(final Context context, List<String> list, View view, boolean z) {
        C53241h.m205898b("GADGET_SENG_MSG", "getPreviewView more avatar url:" + list);
        View inflate = LayoutInflater.from(context).inflate(R.layout.open_platform_card_preview_dialog, (ViewGroup) null);
        inflate.findViewById(R.id.single_chat_wrapper).setVisibility(8);
        final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        recyclerView.setVisibility(0);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 5));
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.openplatform.plus.C48843d.ViewTreeObserver$OnGlobalLayoutListenerC488485 */

            public void onGlobalLayout() {
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = recyclerView.getMeasuredWidth();
                C53241h.m205898b("GADGET_SENG_MSG", "recyclerview width is:" + measuredWidth);
                final int a = ((int) ((((float) measuredWidth) - (C60275a.m234185a(context, 40.0f) * 5.0f)) / 5.0f)) / 4;
                recyclerView.addItemDecoration(new RecyclerView.AbstractC1335d() {
                    /* class com.ss.android.lark.openplatform.plus.C48843d.ViewTreeObserver$OnGlobalLayoutListenerC488485.C488491 */

                    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                        rect.left = a * (recyclerView.getChildAdapterPosition(view) % 5);
                    }
                });
                ((C48840b) recyclerView.getAdapter()).notifyDataSetChanged();
            }
        });
        recyclerView.setAdapter(new C48840b(context, list));
        ((FrameLayout) inflate.findViewById(R.id.card_container)).addView(view);
        EditText editText = (EditText) inflate.findViewById(R.id.card_leave_message_et);
        if (z) {
            editText.setVisibility(0);
        }
        return inflate;
    }

    /* renamed from: a */
    private View m192454a(Context context, String str, String str2, View view, boolean z) {
        C53241h.m205898b("GADGET_SENG_MSG", "getPreviewView one avatar key:" + str2 + " name:" + str);
        View inflate = LayoutInflater.from(context).inflate(R.layout.open_platform_card_preview_dialog, (ViewGroup) null);
        inflate.findViewById(R.id.single_chat_wrapper).setVisibility(0);
        inflate.findViewById(R.id.recycler).setVisibility(8);
        ComponentCallbacks2C2115c.m9151c(context).mo10415a(str2).mo10399a((ImageView) inflate.findViewById(R.id.avatar_iv));
        ((TextView) inflate.findViewById(R.id.name_tv)).setText(str);
        ((FrameLayout) inflate.findViewById(R.id.card_container)).addView(view);
        EditText editText = (EditText) inflate.findViewById(R.id.card_leave_message_et);
        if (z) {
            editText.setVisibility(0);
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo170635a(Context context, List<String> list, CardContent cardContent, final boolean z, final OpenPlatformModule.AbstractC48792b bVar) {
        View view;
        C53241h.m205898b("GADGET_SENG_MSG", "previewCard by chatAvatarUrls:" + list);
        long currentTimeMillis = System.currentTimeMillis();
        SoLoader.init(context, false);
        C53241h.m205898b("GADGET_SENG_MSG", "yoga初始化耗时:" + (System.currentTimeMillis() - currentTimeMillis));
        try {
            view = OpenPlatformModule.m192198d().getCardView(context, cardContent);
        } catch (Exception unused) {
            C53241h.m205898b("GADGET_SENG_MSG", "get CardView exception");
            view = null;
        }
        if (view == null) {
            C53241h.m205898b("GADGET_SENG_MSG", "cardView is null");
            bVar.onResult(true, false, null);
            return;
        }
        final View a = m192455a(context, list, view, z);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).contentLayout(a)).addActionButton(R.id.ud_dialog_btn_secondary, context.getResources().getString(R.string.Lark_Legacy_PlusCancel), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.openplatform.plus.C48843d.DialogInterface$OnClickListenerC488474 */

            public void onClick(DialogInterface dialogInterface, int i) {
                bVar.onResult(false, true, null);
                dialogInterface.dismiss();
            }
        })).addActionButton(R.id.ud_dialog_btn_primary, context.getResources().getString(R.string.Lark_Legacy_PlusSend), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.openplatform.plus.C48843d.DialogInterface$OnClickListenerC488463 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String str;
                if (z) {
                    str = ((EditText) a.findViewById(R.id.card_leave_message_et)).getText().toString();
                } else {
                    str = null;
                }
                bVar.onResult(false, false, str);
            }
        })).cancelable(false)).width(0.86f)).show();
    }

    /* renamed from: a */
    public void mo170634a(Context context, String str, String str2, CardContent cardContent, final boolean z, final OpenPlatformModule.AbstractC48792b bVar) {
        View view;
        C53241h.m205898b("GADGET_SENG_MSG", "previewCard by chatId");
        long currentTimeMillis = System.currentTimeMillis();
        SoLoader.init(context, false);
        C53241h.m205898b("GADGET_SENG_MSG", "yoga init duration:" + (System.currentTimeMillis() - currentTimeMillis));
        try {
            view = OpenPlatformModule.m192198d().getCardView(context, cardContent);
        } catch (Exception unused) {
            C53241h.m205898b("GADGET_SENG_MSG", "get CardView exception");
            view = null;
        }
        if (view == null) {
            C53241h.m205898b("GADGET_SENG_MSG", "cardView is null");
            bVar.onResult(true, false, null);
            return;
        }
        final View a = m192454a(context, str, str2, view, z);
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).contentLayout(a)).addActionButton(R.id.ud_dialog_btn_secondary, context.getResources().getString(R.string.Lark_Legacy_PlusCancel), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.openplatform.plus.C48843d.DialogInterface$OnClickListenerC488452 */

            public void onClick(DialogInterface dialogInterface, int i) {
                bVar.onResult(false, true, null);
                dialogInterface.dismiss();
            }
        })).addActionButton(R.id.ud_dialog_btn_primary, context.getResources().getString(R.string.Lark_Legacy_PlusSend), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.openplatform.plus.C48843d.DialogInterface$OnClickListenerC488441 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String str;
                if (z) {
                    str = ((EditText) a.findViewById(R.id.card_leave_message_et)).getText().toString();
                } else {
                    str = null;
                }
                bVar.onResult(false, false, str);
            }
        })).cancelable(false)).width(0.86f)).show();
    }
}
