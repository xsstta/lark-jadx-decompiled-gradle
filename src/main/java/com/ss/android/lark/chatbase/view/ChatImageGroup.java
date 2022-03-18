package com.ss.android.lark.chatbase.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.chatbase.view.ChatImageView;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.DonutProgress;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifImageView;

public class ChatImageGroup extends FrameLayout {

    /* renamed from: a */
    public ChatImageView f88922a;

    /* renamed from: b */
    public GifImageView f88923b;

    /* renamed from: c */
    private DonutProgress f88924c;

    /* renamed from: d */
    private Context f88925d;

    /* renamed from: e */
    private boolean f88926e;

    /* renamed from: f */
    private WeakReference<RecyclerView> f88927f;

    /* renamed from: g */
    private RecyclerView.OnScrollListener f88928g;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m133594c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m133595d();
    }

    /* renamed from: a */
    public void mo127156a() {
        this.f88922a.setVisibility(0);
        this.f88923b.setVisibility(8);
    }

    /* renamed from: b */
    public void mo127158b() {
        this.f88924c.setVisibility(8);
        this.f88922a.clearColorFilter();
    }

    /* renamed from: d */
    private void m133595d() {
        WeakReference<RecyclerView> weakReference;
        RecyclerView recyclerView;
        if (this.f88926e && (weakReference = this.f88927f) != null && this.f88928g != null && (recyclerView = weakReference.get()) != null) {
            recyclerView.removeOnScrollListener(this.f88928g);
            this.f88926e = false;
        }
    }

    /* renamed from: c */
    private void m133594c() {
        boolean z;
        if (!this.f88926e && this.f88922a.getVisibility() == 0) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = ((ViewGroup) parent).getParent()) {
                if (parent instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) parent;
                    this.f88927f = new WeakReference<>(recyclerView);
                    if (this.f88928g == null) {
                        this.f88928g = new RecyclerView.OnScrollListener() {
                            /* class com.ss.android.lark.chatbase.view.ChatImageGroup.C344401 */

                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                                boolean z;
                                super.onScrollStateChanged(recyclerView, i);
                                ChatImageGroup chatImageGroup = ChatImageGroup.this;
                                if (i == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                chatImageGroup.mo127157a(z);
                            }

                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                                super.onScrolled(recyclerView, i, i2);
                            }
                        };
                    }
                    recyclerView.addOnScrollListener(this.f88928g);
                    if (recyclerView.getScrollState() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mo127157a(z);
                    this.f88926e = true;
                    return;
                }
            }
        }
    }

    public ChatImageGroup(Context context) {
        super(context);
        m133592a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m133593a(Drawable drawable) {
        WeakReference<RecyclerView> weakReference;
        RecyclerView recyclerView;
        boolean z;
        if ((drawable instanceof C2468c) && (weakReference = this.f88927f) != null && (recyclerView = weakReference.get()) != null) {
            if (recyclerView.getScrollState() == 0) {
                z = true;
            } else {
                z = false;
            }
            mo127157a(z);
        }
    }

    /* renamed from: a */
    public void mo127157a(boolean z) {
        Drawable drawable = this.f88922a.getDrawable();
        if ((drawable instanceof C2468c) && this.f88922a.getVisibility() == 0) {
            C2468c cVar = (C2468c) drawable;
            if (z) {
                cVar.start();
            } else {
                cVar.stop();
            }
        }
    }

    /* renamed from: a */
    private void m133592a(Context context) {
        this.f88925d = context;
        setBackgroundColor(C52990a.m205239c(context, R.color.bg_body));
        LayoutInflater.from(getContext()).inflate(R.layout.chat_image_group, (ViewGroup) this, true);
        ChatImageView chatImageView = (ChatImageView) findViewById(R.id.chat_image);
        this.f88922a = chatImageView;
        chatImageView.setOnImageDrawableChangedListener(new ChatImageView.OnImageDrawableChangedListener() {
            /* class com.ss.android.lark.chatbase.view.$$Lambda$ChatImageGroup$QoiG_IMMvmCLHvVtvg7IJX3nJes */

            @Override // com.ss.android.lark.chatbase.view.ChatImageView.OnImageDrawableChangedListener
            public final void onImageDrawableChanged(Drawable drawable) {
                ChatImageGroup.this.m133593a((ChatImageGroup) drawable);
            }
        });
        this.f88923b = (GifImageView) findViewById(R.id.chat_sticker);
        DonutProgress donutProgress = (DonutProgress) findViewById(R.id.upload_progress);
        this.f88924c = donutProgress;
        donutProgress.setMax(100);
        mo127156a();
    }

    public synchronized void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i < 100) {
            if (this.f88924c.getVisibility() != 0) {
                this.f88924c.setVisibility(0);
            }
            this.f88922a.setColorFilter(C25653b.m91893a(UIHelper.getColor(R.color.lkui_N900), 0.3f), PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f88924c.setVisibility(8);
            this.f88922a.clearColorFilter();
        }
        this.f88924c.setProgress((float) i);
    }

    public ChatImageGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m133592a(context);
    }

    public ChatImageGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m133592a(context);
    }
}
