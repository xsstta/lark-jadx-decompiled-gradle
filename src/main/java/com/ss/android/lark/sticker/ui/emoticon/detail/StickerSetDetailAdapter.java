package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow;
import java.util.ArrayList;
import java.util.List;

public class StickerSetDetailAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public EmojiPreviewPopWindow f136121a;

    /* renamed from: b */
    public AbstractC55123a f136122b;

    /* renamed from: c */
    public SparseArray<Boolean> f136123c = new SparseArray<>();

    /* renamed from: d */
    public Handler f136124d = new Handler() {
        /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter.HandlerC551181 */

        public void handleMessage(Message message) {
            int i = message.getData().getInt("key_sticker_index");
            StickerSetDetailAdapter.this.f136123c.put(i, true);
            StickerSetDetailAdapter.this.mo188044a((View) message.obj, i);
        }
    };

    /* renamed from: e */
    private Context f136125e;

    /* renamed from: f */
    private List<Sticker> f136126f = new ArrayList();

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter$a */
    interface AbstractC55123a {
        /* renamed from: a */
        void mo188052a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f136126f.size();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f136137a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f136137a;
            if (viewHolder != null) {
                this.f136137a = null;
                viewHolder.mIvPic = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f136137a = viewHolder;
            viewHolder.mIvPic = (ImageView) Utils.findRequiredViewAsType(view, R.id.sticker_iv_item_view_sticker_pic, "field 'mIvPic'", ImageView.class);
        }
    }

    /* renamed from: a */
    public void mo188046a(AbstractC55123a aVar) {
        this.f136122b = aVar;
    }

    /* renamed from: a */
    private Sticker m213937a(int i) {
        return this.f136126f.get(i);
    }

    /* renamed from: b */
    private int m213938b(int i) {
        int i2 = i % 4;
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 3) {
            return 2;
        }
        return 1;
    }

    public StickerSetDetailAdapter(Context context) {
        this.f136125e = context;
        EmojiPreviewPopWindow emojiPreviewPopWindow = new EmojiPreviewPopWindow(context, true);
        this.f136121a = emojiPreviewPopWindow;
        emojiPreviewPopWindow.mo199780a(new EmojiPreviewPopWindow.AbstractC58928a() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter.C551192 */

            @Override // com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow.AbstractC58928a
            public void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
                if (StickerSetDetailAdapter.this.f136122b != null) {
                    StickerSetDetailAdapter.this.f136122b.mo188052a(context, z, i, i2, str, imageView, i3, i4);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo188047a(List<Sticker> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f136126f.clear();
            this.f136126f.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(7500)
        ImageView mIvPic;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_set_item_view_detail, viewGroup, false));
    }

    /* renamed from: a */
    public void mo188044a(View view, int i) {
        Sticker a = m213937a(i);
        if (a != null) {
            EmojiPreviewPopWindow.C58929b bVar = new EmojiPreviewPopWindow.C58929b(view, a.getOriginImageKey());
            bVar.mo199785b(a.getDesc());
            bVar.mo199782a(m213938b(i));
            this.f136121a.mo199781a(bVar);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        int i2;
        Sticker a = m213937a(i);
        if (a != null) {
            int i3 = 80;
            if (DesktopUtil.m144301a(this.f136125e)) {
                i2 = DesktopUtil.m144293a(80);
            } else {
                i2 = 80;
            }
            if (DesktopUtil.m144301a(this.f136125e)) {
                i3 = DesktopUtil.m144293a(80);
            }
            C55004f a2 = C55004f.m213654a();
            Context context = this.f136125e;
            a2.mo187830a(context, true, UIUtils.dp2px(context, (float) i2), UIUtils.dp2px(this.f136125e, (float) i3), a.getThumbnailImageKey(), viewHolder.mIvPic, R.drawable.sticker_ic_icon_sticker_item_default, R.drawable.sticker_ic_icon_sticker_item_default, a.getStickerSetId());
            viewHolder.mIvPic.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter.View$OnTouchListenerC551203 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        StickerSetDetailAdapter.this.f136123c.put(i, false);
                        Message message = new Message();
                        message.what = 1;
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_sticker_index", i);
                        message.setData(bundle);
                        message.obj = viewHolder.mIvPic;
                        StickerSetDetailAdapter.this.f136124d.sendMessageDelayed(message, 500);
                        return true;
                    } else if (action != 1 && action != 3) {
                        return false;
                    } else {
                        StickerSetDetailAdapter.this.f136124d.removeMessages(1);
                        if (!StickerSetDetailAdapter.this.f136123c.get(i).booleanValue()) {
                            return false;
                        }
                        StickerSetDetailAdapter.this.f136121a.dismiss();
                        StickerSetDetailAdapter.this.f136123c.put(i, false);
                        return true;
                    }
                }
            });
            if (DesktopUtil.m144301a(this.f136125e)) {
                viewHolder.mIvPic.setOnHoverListener(new View.OnHoverListener() {
                    /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter.View$OnHoverListenerC551214 */

                    public boolean onHover(final View view, MotionEvent motionEvent) {
                        int action = motionEvent.getAction();
                        if (action == 9) {
                            StickerSetDetailAdapter.this.f136123c.put(i, true);
                            UICallbackExecutor.executeDelayed(new Runnable() {
                                /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter.View$OnHoverListenerC551214.RunnableC551221 */

                                public void run() {
                                    if (StickerSetDetailAdapter.this.f136123c.get(i).booleanValue()) {
                                        StickerSetDetailAdapter.this.mo188044a(view, i);
                                    }
                                }
                            }, 500);
                        } else if (action == 10 && StickerSetDetailAdapter.this.f136123c.get(i).booleanValue()) {
                            StickerSetDetailAdapter.this.f136121a.dismiss();
                            StickerSetDetailAdapter.this.f136123c.put(i, false);
                        }
                        return false;
                    }
                });
            }
        }
    }
}
