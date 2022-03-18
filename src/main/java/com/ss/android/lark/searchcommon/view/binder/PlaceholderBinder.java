package com.ss.android.lark.searchcommon.view.binder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.view.SearchPlaceholderViewHolder;
import com.ss.android.lark.searchcommon.view.recommend.IOnClearHistoryListener;
import com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.searchcommon.view.binder.z */
public final class PlaceholderBinder {

    /* renamed from: a */
    public static final Companion f133695a = new Companion(null);

    /* renamed from: com.ss.android.lark.searchcommon.view.binder.z$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.ss.android.lark.searchcommon.view.binder.z$c */
    public static final class View$OnClickListenerC54004c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchPlaceholderViewHolder f133697a;

        /* renamed from: b */
        final /* synthetic */ IOnMoreClickListener f133698b;

        /* renamed from: c */
        final /* synthetic */ int f133699c;

        /* renamed from: d */
        private boolean f133700d;

        /* renamed from: com.ss.android.lark.searchcommon.view.binder.z$c$a */
        static final class RunnableC54005a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC54004c f133701a;

            RunnableC54005a(View$OnClickListenerC54004c cVar) {
                this.f133701a = cVar;
            }

            public final void run() {
                IOnMoreClickListener bVar = this.f133701a.f133698b;
                if (bVar != null) {
                    bVar.mo183188a(this.f133701a.f133699c);
                }
                this.f133701a.mo184883a(false);
            }
        }

        /* renamed from: a */
        public final void mo184883a(boolean z) {
            this.f133700d = z;
        }

        public void onClick(View view) {
            if (!this.f133700d) {
                this.f133700d = true;
                ImageView b = this.f133697a.mo184979b();
                if (b != null) {
                    float f = -180.0f;
                    if (b.getRotation() == -180.0f) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    b.animate().rotation(f).setDuration(200).withEndAction(new RunnableC54005a(this)).start();
                }
            }
        }

        View$OnClickListenerC54004c(SearchPlaceholderViewHolder hVar, IOnMoreClickListener bVar, int i) {
            this.f133697a = hVar;
            this.f133698b = bVar;
            this.f133699c = i;
        }
    }

    /* renamed from: com.ss.android.lark.searchcommon.view.binder.z$b */
    public static final class View$OnClickListenerC54003b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IOnClearHistoryListener f133696a;

        View$OnClickListenerC54003b(IOnClearHistoryListener aVar) {
            this.f133696a = aVar;
        }

        public final void onClick(View view) {
            IOnClearHistoryListener aVar = this.f133696a;
            if (aVar != null) {
                aVar.mo183179a();
            }
        }
    }

    /* renamed from: a */
    public final void mo184881a(int i, SearchPlaceholderInfo searchPlaceholderInfo, SearchPlaceholderViewHolder hVar, IOnClearHistoryListener aVar, IOnMoreClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(searchPlaceholderInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(hVar, "holder");
        int i2 = C53979aa.f133577a[searchPlaceholderInfo.getPlaceholderType().ordinal()];
        if (i2 == 1) {
            TextView a = hVar.mo184978a();
            if (a != null) {
                a.setText(searchPlaceholderInfo.getTitle());
            }
            ImageView b = hVar.mo184979b();
            if (b != null) {
                b.setVisibility(8);
            }
        } else if (i2 == 2) {
            TextView a2 = hVar.mo184978a();
            if (a2 != null) {
                a2.setText(searchPlaceholderInfo.getTitle());
            }
            ImageView b2 = hVar.mo184979b();
            if (b2 != null) {
                b2.setVisibility(0);
                b2.setOnClickListener(new View$OnClickListenerC54003b(aVar));
            }
        } else if (i2 == 3) {
            TextView a3 = hVar.mo184978a();
            if (a3 != null) {
                a3.setText(searchPlaceholderInfo.getTitle());
            }
            if (searchPlaceholderInfo.isHasMore()) {
                ImageView b3 = hVar.mo184979b();
                if (b3 != null) {
                    b3.setVisibility(0);
                    SearchBaseInfo attachInfo = searchPlaceholderInfo.getAttachInfo();
                    if ((attachInfo instanceof SearchCardInfo) && ((SearchCardInfo) attachInfo).getDefaultExpand()) {
                        b3.setRotation(-180.0f);
                    }
                }
                hVar.itemView.setOnClickListener(new View$OnClickListenerC54004c(hVar, bVar, i));
                return;
            }
            ImageView b4 = hVar.mo184979b();
            if (b4 != null) {
                b4.setVisibility(8);
            }
            hVar.itemView.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m209625a(PlaceholderBinder zVar, int i, SearchPlaceholderInfo searchPlaceholderInfo, SearchPlaceholderViewHolder hVar, IOnClearHistoryListener aVar, IOnMoreClickListener bVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            aVar = null;
        }
        if ((i2 & 16) != 0) {
            bVar = null;
        }
        zVar.mo184881a(i, searchPlaceholderInfo, hVar, aVar, bVar);
    }
}
