package com.ss.android.lark.mine.impl.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.mine.dto.C45423a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.status.UserStatusTextView;

/* renamed from: com.ss.android.lark.mine.impl.status.b */
public class C45803b extends LarkRecyclerViewBaseAdapter<C45804a, ChatterDescription> {

    /* renamed from: a */
    private Context f115580a;

    /* renamed from: b */
    private AbstractC45807b f115581b;

    /* renamed from: c */
    private AbstractC45808c f115582c;

    /* renamed from: d */
    private LayoutInflater f115583d;

    /* renamed from: e */
    private boolean f115584e = false;

    /* renamed from: com.ss.android.lark.mine.impl.status.b$b */
    public interface AbstractC45807b {
        /* renamed from: a */
        void mo161042a(String str, ChatterDescription.Type type);
    }

    /* renamed from: com.ss.android.lark.mine.impl.status.b$c */
    public interface AbstractC45808c {
        /* renamed from: a */
        void mo161043a(ChatterDescription chatterDescription);
    }

    /* renamed from: a */
    public boolean mo161036a() {
        return this.f115584e;
    }

    /* renamed from: a */
    public void mo161034a(C45423a aVar) {
        addAll(aVar.mo160294b());
        this.f115584e = aVar.mo160293a();
    }

    /* renamed from: com.ss.android.lark.mine.impl.status.b$a */
    public static class C45804a extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public void mo161037a(ChatterDescription chatterDescription) {
            UserStatusTextView userStatusTextView = (UserStatusTextView) this.itemView.findViewById(R.id.tv_desc);
            userStatusTextView.setUrlTextColor(UIHelper.getColor(R.color.lkui_B500));
            userStatusTextView.setPhoneTextColor(UIHelper.getColor(R.color.lkui_B500));
            userStatusTextView.setNeedToRecognize(false);
            userStatusTextView.mo198364a(chatterDescription.description);
        }

        public C45804a(Context context, View view) {
            super(view);
        }

        /* renamed from: a */
        public void mo161038a(final AbstractC45807b bVar, final ChatterDescription chatterDescription) {
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mine.impl.status.C45803b.C45804a.View$OnClickListenerC458051 */

                public void onClick(View view) {
                    bVar.mo161042a(chatterDescription.description, chatterDescription.type);
                }
            });
        }

        /* renamed from: a */
        public void mo161039a(final AbstractC45808c cVar, final ChatterDescription chatterDescription) {
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_delete);
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mine.impl.status.C45803b.C45804a.View$OnClickListenerC458062 */

                public void onClick(View view) {
                    cVar.mo161043a(chatterDescription);
                }
            });
            ak.m95026a(imageView, UIHelper.dp2px(8.0f));
        }
    }

    /* renamed from: a */
    public C45804a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C45804a(this.f115580a, this.f115583d.inflate(R.layout.item_mine_status_history, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C45804a aVar, int i) {
        ChatterDescription chatterDescription = (ChatterDescription) getItem(i);
        aVar.mo161038a(this.f115581b, chatterDescription);
        aVar.mo161039a(this.f115582c, chatterDescription);
        aVar.mo161037a(chatterDescription);
    }

    public C45803b(Context context, AbstractC45807b bVar, AbstractC45808c cVar) {
        this.f115580a = context;
        this.f115581b = bVar;
        this.f115582c = cVar;
        this.f115583d = LayoutInflater.from(context);
    }
}
