package com.ss.texturerender;

import android.opengl.GLES20;
import android.util.Log;
import com.ss.texturerender.Texture;
import java.util.ArrayList;
import java.util.Iterator;

public class TextureFactory implements Texture.OnTextureReturnListener {
    private ArrayList<ITexture> mTextures = new ArrayList<>();

    public void release() {
        synchronized (this.mTextures) {
            Iterator<ITexture> it = this.mTextures.iterator();
            while (it.hasNext()) {
                ((Texture) it.next()).release();
                it.remove();
            }
        }
    }

    private static int loadTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            if (iArr[0] != 0) {
                GLES20.glBindTexture(i, iArr[0]);
                GLES20.glTexParameteri(i, 10242, 33071);
                GLES20.glTexParameteri(i, 10243, 33071);
                GLES20.glTexParameteri(i, 10241, 9729);
                GLES20.glTexParameteri(i, 10240, 9729);
            }
            return iArr[0];
        }
        throw new RuntimeException("Error gen texture.");
    }

    @Override // com.ss.texturerender.Texture.OnTextureReturnListener
    public void onTextureReturn(ITexture iTexture) {
        synchronized (this.mTextures) {
            this.mTextures.add(iTexture);
            Log.d("TextureFactory", "add texture = " + iTexture + "size = " + this.mTextures.size());
        }
    }

    public ITexture createTexture(int i) {
        ITexture iTexture;
        synchronized (this.mTextures) {
            if (this.mTextures.size() > 0) {
                Iterator<ITexture> it = this.mTextures.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    iTexture = it.next();
                    if (iTexture.getTexTarget() == i) {
                        it.remove();
                        Log.d("TextureFactory", "reuse texture:" + iTexture + " texTarget:" + iTexture.getTexTarget());
                        break;
                    }
                }
            }
            iTexture = null;
            if (iTexture == null) {
                int loadTexture = loadTexture(i);
                iTexture = new Texture(loadTexture, i, this);
                Log.i("TextureFactory", "new Texture = " + iTexture + "id = " + loadTexture);
            }
        }
        iTexture.addRef();
        return iTexture;
    }
}
