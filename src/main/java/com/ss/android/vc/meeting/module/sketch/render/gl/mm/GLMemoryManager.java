package com.ss.android.vc.meeting.module.sketch.render.gl.mm;

import android.opengl.GLES20;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sketch.render.gl.util.GLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class GLMemoryManager {
    private int[] mBufferHandles = new int[2];
    private int mIndexArchivePosition;
    private IntBuffer mIndexBuffer;
    private int mIndexCurrentPosition;
    private WriteMode mMode = WriteMode.WRITE_DYNAMIC;
    private int mVertexArchivePosition;
    private FloatBuffer mVertexBuffer;
    private int mVertexCurrentPosition;

    public enum WriteMode {
        WRITE_ARCHIVE,
        WRITE_DYNAMIC
    }

    public void flush() {
        flushVertex();
        flushIndex();
    }

    public void resetMemory() {
        this.mVertexArchivePosition = 0;
        this.mIndexArchivePosition = 0;
        this.mVertexBuffer.position(0);
        this.mIndexBuffer.position(0);
    }

    public void destroy() {
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
        int[] iArr = this.mBufferHandles;
        GLES20.glDeleteBuffers(iArr.length, iArr, 0);
    }

    public int indexCount() {
        int i;
        int position;
        if (this.mMode == WriteMode.WRITE_ARCHIVE) {
            i = this.mIndexArchivePosition / 4;
            position = this.mIndexBuffer.position();
        } else {
            i = this.mIndexCurrentPosition / 4;
            position = this.mIndexBuffer.position();
        }
        return i + position;
    }

    public void resetBuffer() {
        this.mVertexCurrentPosition = this.mVertexArchivePosition;
        this.mIndexCurrentPosition = this.mIndexArchivePosition;
        this.mVertexBuffer.position(0);
        this.mIndexBuffer.position(0);
    }

    public int vertexCount() {
        if (this.mMode == WriteMode.WRITE_ARCHIVE) {
            return ((this.mVertexArchivePosition / 4) + this.mVertexBuffer.position()) / 15;
        }
        return ((this.mVertexCurrentPosition / 4) + this.mVertexBuffer.position()) / 15;
    }

    private void flushIndex() {
        if (this.mIndexBuffer.position() >= 1) {
            if (GLUtils.debugGL()) {
                C60700b.m235851b("[Sketch] [GLMemoryManager]", "[flushIndex]", "[mode]" + this.mMode + "  [buffer pos]" + this.mIndexBuffer.position());
            }
            int position = this.mIndexBuffer.position() * 4;
            this.mIndexBuffer.position(0);
            if (this.mMode == WriteMode.WRITE_ARCHIVE) {
                GLES20.glBufferSubData(34963, this.mIndexArchivePosition, position, this.mIndexBuffer);
                this.mIndexArchivePosition += position;
            } else {
                GLES20.glBufferSubData(34963, this.mIndexCurrentPosition, position, this.mIndexBuffer);
                this.mIndexCurrentPosition += position;
            }
            this.mIndexBuffer.position(0);
            GLUtils.checkError();
        }
    }

    private void flushVertex() {
        if (this.mVertexBuffer.position() >= 1) {
            if (GLUtils.debugGL()) {
                C60700b.m235851b("[Sketch] [GLMemoryManager]", "[flushVertex]", "[mode]" + this.mMode + "  [buffer pos]" + this.mVertexBuffer.position());
            }
            int position = this.mVertexBuffer.position() * 4;
            this.mVertexBuffer.position(0);
            if (this.mMode == WriteMode.WRITE_ARCHIVE) {
                GLES20.glBufferSubData(34962, this.mVertexArchivePosition, position, this.mVertexBuffer);
                this.mVertexArchivePosition += position;
            } else {
                GLES20.glBufferSubData(34962, this.mVertexCurrentPosition, position, this.mVertexBuffer);
                this.mVertexCurrentPosition += position;
            }
            this.mVertexBuffer.position(0);
            GLUtils.checkError();
        }
    }

    public void create() {
        int[] iArr = this.mBufferHandles;
        GLES20.glGenBuffers(iArr.length, iArr, 0);
        GLUtils.checkError();
        GLES20.glBindBuffer(34962, this.mBufferHandles[0]);
        GLUtils.checkError();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.mVertexBuffer = asFloatBuffer;
        asFloatBuffer.position(0);
        GLES20.glBufferData(34962, 62914560, null, 35048);
        GLUtils.checkError();
        GLES20.glBindBuffer(34963, this.mBufferHandles[1]);
        GLUtils.checkError();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(1048576);
        allocateDirect2.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect2.asIntBuffer();
        this.mIndexBuffer = asIntBuffer;
        asIntBuffer.position(0);
        GLES20.glBufferData(34963, 4194304, null, 35048);
        GLUtils.checkError();
    }

    public void setWriteMode(WriteMode writeMode) {
        this.mMode = writeMode;
    }

    public void putIndexData(int i) {
        if (this.mIndexBuffer.position() == this.mIndexBuffer.capacity()) {
            flushIndex();
        }
        this.mIndexBuffer.put(i);
    }

    public void putVertexData(float f) {
        if (this.mVertexBuffer.position() == this.mVertexBuffer.capacity()) {
            flushVertex();
        }
        this.mVertexBuffer.put(f);
    }

    public void putIndexData(int[] iArr) {
        if (this.mIndexBuffer.position() + iArr.length > this.mIndexBuffer.capacity()) {
            flushIndex();
        }
        this.mIndexBuffer.put(iArr);
    }

    public void putVertexData(float[] fArr) {
        if (this.mVertexBuffer.position() + fArr.length > this.mVertexBuffer.capacity()) {
            flushVertex();
        }
        this.mVertexBuffer.put(fArr);
    }
}
