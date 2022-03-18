package com.ss.android.lark.locationmessage.ui.picklocation;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.locationmessage.ui.picklocation.LocationView;
import java.util.List;

/* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.b */
public class C41665b {

    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.b$a */
    public interface AbstractC41666a extends IModel {
        /* renamed from: a */
        void mo149828a(double d, double d2);

        /* renamed from: a */
        void mo149829a(Context context, double d, double d2, LocationView.AbstractC41658a aVar);

        /* renamed from: a */
        void mo149830a(Context context, Bitmap bitmap, LocationView.AbstractC41662e eVar);

        /* renamed from: a */
        void mo149831a(Context context, POIInfo pOIInfo, AbstractC41562e.AbstractC41564b bVar);

        /* renamed from: a */
        void mo149832a(Context context, LocationView.AbstractC41659b bVar);

        /* renamed from: a */
        void mo149833a(Context context, LocationView.AbstractC41661d dVar);

        /* renamed from: a */
        void mo149834a(Context context, String str, LocationView.AbstractC41660c cVar);
    }

    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.b$b */
    public interface AbstractC41667b extends IView<AbstractC41668a> {

        /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.b$b$a */
        public interface AbstractC41668a extends IView.IViewDelegate {
            /* renamed from: a */
            List<POIInfo> mo149835a(Context context, boolean z);

            /* renamed from: a */
            void mo149836a(double d, double d2);

            /* renamed from: a */
            void mo149837a(Context context, double d, double d2, LocationView.AbstractC41658a aVar);

            /* renamed from: a */
            void mo149838a(Context context, Bitmap bitmap, LocationView.AbstractC41662e eVar);

            /* renamed from: a */
            void mo149839a(Context context, POIInfo pOIInfo, AbstractC41562e.AbstractC41564b bVar);

            /* renamed from: a */
            void mo149840a(Context context, POIInfo pOIInfo, boolean z);

            /* renamed from: a */
            void mo149841a(Context context, LocationView.AbstractC41659b bVar);

            /* renamed from: a */
            void mo149842a(Context context, LocationView.AbstractC41661d dVar);

            /* renamed from: a */
            void mo149843a(Context context, String str, LocationView.AbstractC41660c cVar);
        }

        /* renamed from: a */
        boolean mo149801a();
    }
}
