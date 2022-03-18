package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.album.base.C44662k;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.utils.C44749f;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.f */
public class View$OnClickListenerC44650f extends PopupWindow implements View.OnClickListener {

    /* renamed from: a */
    public boolean f113164a;

    /* renamed from: b */
    private Context f113165b;

    /* renamed from: c */
    private View f113166c;

    /* renamed from: d */
    private RecyclerView f113167d;

    /* renamed from: e */
    private C44662k f113168e;

    /* renamed from: f */
    private Animation f113169f;

    /* renamed from: g */
    private Animation f113170g;

    /* renamed from: h */
    private LinearLayout f113171h;

    /* renamed from: b */
    public void mo158233b() {
        new Handler().post(new Runnable() {
            /* class com.ss.android.lark.mediapicker.album.base.View$OnClickListenerC44650f.RunnableC446522 */

            public void run() {
                View$OnClickListenerC44650f.super.dismiss();
            }
        });
    }

    public void dismiss() {
        if (!this.f113164a) {
            this.f113164a = true;
            this.f113167d.startAnimation(this.f113170g);
            dismiss();
            this.f113170g.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.lark.mediapicker.album.base.View$OnClickListenerC44650f.animationAnimation$AnimationListenerC446511 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    View$OnClickListenerC44650f.this.f113164a = false;
                    if (Build.VERSION.SDK_INT <= 16) {
                        View$OnClickListenerC44650f.this.mo158233b();
                    } else {
                        View$OnClickListenerC44650f.super.dismiss();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo158230a() {
        this.f113171h = (LinearLayout) this.f113166c.findViewById(R.id.id_ll_root);
        this.f113168e = new C44662k(this.f113165b);
        RecyclerView recyclerView = (RecyclerView) this.f113166c.findViewById(R.id.folder_list);
        this.f113167d = recyclerView;
        recyclerView.getLayoutParams().height = (int) (((double) C44749f.m177490b(this.f113165b)) * 0.5d);
        this.f113167d.setLayoutManager(new LinearLayoutManager(this.f113165b));
        this.f113167d.setAdapter(this.f113168e);
        this.f113171h.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo158231a(C44662k.AbstractC44664a aVar) {
        this.f113168e.mo158248a(aVar);
    }

    /* renamed from: a */
    public void mo158232a(List<LocalMediaFolder> list) {
        this.f113168e.mo158250a(list);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.id_ll_root) {
            dismiss();
        }
    }

    public void showAsDropDown(View view) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                setHeight(view.getResources().getDisplayMetrics().heightPixels - rect.bottom);
            }
            super.showAsDropDown(view);
            this.f113164a = false;
            this.f113167d.startAnimation(this.f113169f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public View$OnClickListenerC44650f(Context context) {
        this.f113165b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.picker_album_folders, (ViewGroup) null);
        this.f113166c = inflate;
        setContentView(inflate);
        setWidth(C44749f.m177489a(context));
        setHeight(C44749f.m177490b(context));
        setAnimationStyle(R.style.picker_WindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        setBackgroundDrawable(new ColorDrawable(Color.argb((int) SmActions.ACTION_CALLING_ENTRY, 0, 0, 0)));
        this.f113169f = AnimationUtils.loadAnimation(context, R.anim.picker_media_album_show);
        this.f113170g = AnimationUtils.loadAnimation(context, R.anim.picker_media_album_dismiss);
        mo158230a();
    }

    /* renamed from: b */
    public void mo158234b(List<LocalMedia> list) {
        try {
            List<LocalMediaFolder> a = this.f113168e.mo158247a();
            for (LocalMediaFolder localMediaFolder : a) {
                localMediaFolder.setCheckedNum(0);
            }
            if (list.size() > 0) {
                for (LocalMediaFolder localMediaFolder2 : a) {
                    int i = 0;
                    for (LocalMedia localMedia : localMediaFolder2.getLocalMedia()) {
                        String path = localMedia.getPath();
                        for (LocalMedia localMedia2 : list) {
                            if (path.equals(localMedia2.getPath())) {
                                i++;
                                localMediaFolder2.setCheckedNum(i);
                            }
                        }
                    }
                }
            }
            this.f113168e.mo158250a(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
