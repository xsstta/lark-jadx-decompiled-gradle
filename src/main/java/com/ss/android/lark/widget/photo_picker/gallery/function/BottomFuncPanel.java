package com.ss.android.lark.widget.photo_picker.gallery.function;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d;
import com.ss.android.lark.widget.photo_picker.p2951f.C58662k;
import java.util.List;

public class BottomFuncPanel extends FrameLayout {

    /* renamed from: a */
    private C58749a f145208a;
    @BindView(6190)
    RecyclerView mFuncRV;

    public int getItemSize() {
        C58749a aVar = this.f145208a;
        if (aVar == null) {
            return -1;
        }
        return aVar.getItemCount();
    }

    public class BottomFuncHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private BottomFuncHolder f145209a;

        @Override // butterknife.Unbinder
        public void unbind() {
            BottomFuncHolder bottomFuncHolder = this.f145209a;
            if (bottomFuncHolder != null) {
                this.f145209a = null;
                bottomFuncHolder.mIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public BottomFuncHolder_ViewBinding(BottomFuncHolder bottomFuncHolder, View view) {
            this.f145209a = bottomFuncHolder;
            bottomFuncHolder.mIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.icon, "field 'mIcon'", ImageView.class);
        }
    }

    /* renamed from: a */
    private void m227931a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.gallary_func_panel, this));
    }

    /* access modifiers changed from: package-private */
    public static class BottomFuncHolder extends RecyclerView.ViewHolder {
        @BindView(6210)
        ImageView mIcon;

        BottomFuncHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.BottomFuncPanel$a */
    public class C58749a extends LarkRecyclerViewBaseAdapter<BottomFuncHolder, AbstractC58768d> {
        public C58749a() {
        }

        /* renamed from: a */
        public BottomFuncHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new BottomFuncHolder(LayoutInflater.from(BottomFuncPanel.this.getContext()).inflate(R.layout.item_gallary_panel, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(BottomFuncHolder bottomFuncHolder, int i) {
            final AbstractC58768d dVar = (AbstractC58768d) getItem(i);
            bottomFuncHolder.mIcon.setImageResource(dVar.mo199179d());
            bottomFuncHolder.mIcon.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.function.BottomFuncPanel.C58749a.View$OnClickListenerC587501 */

                public void onClick(View view) {
                    dVar.mo199177a().run();
                }
            });
        }
    }

    public BottomFuncPanel(Context context) {
        super(context);
        m227931a();
    }

    /* renamed from: a */
    public void mo199164a(MotionEvent motionEvent) {
        ImageView imageView;
        for (int i = 0; i < this.mFuncRV.getChildCount(); i++) {
            View childAt = this.mFuncRV.getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() != 0 || (imageView = (ImageView) childAt.findViewById(R.id.icon)) == null)) {
                imageView.setHovered(C58662k.m227537a(childAt, motionEvent));
            }
        }
    }

    /* renamed from: a */
    public void mo199165a(List<AbstractC58768d> list) {
        this.mFuncRV.setLayoutManager(new GridLayoutManager(getContext(), Math.max(list.size(), 1), 1, false));
        if (this.f145208a == null) {
            C58749a aVar = new C58749a();
            this.f145208a = aVar;
            this.mFuncRV.setAdapter(aVar);
        }
        this.f145208a.resetAll(list);
    }

    public BottomFuncPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m227931a();
    }

    public BottomFuncPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m227931a();
    }
}
