package com.ss.android.lark.mm.module.reaction.panel;

import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J0\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J0\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H&R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/reaction/panel/OnItemSingleClickListener;", "Landroid/widget/AdapterView$OnItemClickListener;", "()V", "mMinClickInterval", "", "(J)V", "mLastClickTime", "onItemClick", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "onItemSingleClick", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.reaction.panel.d */
public abstract class OnItemSingleClickListener implements AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final Companion f117913c = new Companion(null);

    /* renamed from: a */
    private long f117914a;

    /* renamed from: b */
    private long f117915b;

    /* renamed from: a */
    public abstract void mo164475a(AdapterView<?> adapterView, View view, int i, long j);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/reaction/panel/OnItemSingleClickListener$Companion;", "", "()V", "LENGTH_LONG", "", "LENGTH_SHORT", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OnItemSingleClickListener() {
        this(500);
    }

    public OnItemSingleClickListener(long j) {
        this.f117915b = j;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f117914a = uptimeMillis;
        if (uptimeMillis - this.f117914a < this.f117915b) {
            Log.m165389i("OnItemSingleClickListener", "elapsedTime is short than LENGTH_SHORT");
        } else {
            mo164475a(adapterView, view, i, j);
        }
    }
}
