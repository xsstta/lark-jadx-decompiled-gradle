package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.RuntimeRemoteException;
import com.huawei.hms.maps.mae;
import com.huawei.hms.maps.mcf;
import com.huawei.hms.maps.model.animation.Animation;
import com.huawei.hms.maps.model.animation.AnimationSet;
import java.util.Objects;

public class Marker {

    /* renamed from: a */
    private final mcf f58752a;

    public Marker(mcf mcf) {
        Objects.requireNonNull(mcf, "Object is null");
        this.f58752a = mcf;
    }

    /* renamed from: a */
    private void m86908a(Animation animation) {
        try {
            if (animation instanceof AnimationSet) {
                for (Animation animation2 : ((AnimationSet) animation).getAnimations()) {
                    m86908a(animation2);
                }
            }
            final Animation.AnimationListener listener = animation.getListener();
            this.f58752a.mo84185a(listener == null ? null : new mae.maa() {
                /* class com.huawei.hms.maps.model.Marker.BinderC237161 */

                @Override // com.huawei.hms.maps.mae
                /* renamed from: a */
                public final void mo83882a() {
                    Animation.AnimationListener animationListener = listener;
                    if (animationListener != null) {
                        animationListener.onAnimationStart();
                    }
                }

                @Override // com.huawei.hms.maps.mae
                /* renamed from: b */
                public final void mo83883b() {
                    Animation.AnimationListener animationListener = listener;
                    if (animationListener != null) {
                        animationListener.onAnimationEnd();
                    }
                }
            });
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.f58752a.mo84190a(((Marker) obj).f58752a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getAlpha() {
        try {
            return this.f58752a.mo84211n();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            return this.f58752a.mo84191b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLng getPosition() {
        try {
            return this.f58752a.mo84197c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getRotation() {
        try {
            return this.f58752a.mo84210m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getSnippet() {
        try {
            return this.f58752a.mo84202e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f58752a.mo84213p());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String getTitle() {
        try {
            return this.f58752a.mo84201d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.f58752a.mo84212o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f58752a.mo84208k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void hideInfoWindow() {
        try {
            this.f58752a.mo84205h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isClusterable() {
        try {
            return this.f58752a.mo84214q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isDraggable() {
        try {
            return this.f58752a.mo84203f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isFlat() {
        try {
            return this.f58752a.mo84209l();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isInfoWindowShown() {
        try {
            return this.f58752a.mo84206i();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.f58752a.mo84207j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.f58752a.mo84181a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setAlpha(float f) {
        try {
            this.f58752a.mo84192b(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setAnchor(float f, float f2) {
        try {
            this.f58752a.mo84183a(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setAnimation(Animation animation) {
        if (animation != null) {
            try {
                m86908a(animation);
                this.f58752a.mo84187a(animation);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new IllegalArgumentException("animation cannot be null.");
        }
    }

    public final void setDraggable(boolean z) {
        try {
            this.f58752a.mo84189a(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setFlat(boolean z) {
        try {
            this.f58752a.mo84200c(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            try {
                this.f58752a.mo84184a(ObjectWrapper.wrap(null));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f58752a.mo84184a(bitmapDescriptor.getObject());
        }
    }

    public final void setInfoWindowAnchor(float f, float f2) {
        try {
            this.f58752a.mo84193b(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMarkerAnchor(float f, float f2) {
        try {
            this.f58752a.mo84199c(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setPosition(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f58752a.mo84186a(latLng);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    public final void setRotation(float f) {
        try {
            this.f58752a.mo84182a(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setSnippet(String str) {
        try {
            this.f58752a.mo84195b(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTag(Object obj) {
        try {
            this.f58752a.mo84194b(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTitle(String str) {
        try {
            this.f58752a.mo84188a(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f58752a.mo84196b(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f58752a.mo84198c(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void showInfoWindow() {
        try {
            this.f58752a.mo84204g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void startAnimation() {
        try {
            this.f58752a.mo84215r();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
