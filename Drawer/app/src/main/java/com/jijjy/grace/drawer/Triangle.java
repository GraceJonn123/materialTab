package com.jijjy.grace.trial;

import android.opengl.GLES20;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/**
 * Created by grace on 7/8/16.
 */
public class Triangle {

    private FloatBuffer vertexBuffer;

    //number of coordinates per vertex in this array
    static final int COORDS_PER_VERTEX = 3;
    static float triangleCoords[] = { //in counterclockwise order:
            0.0f,  0.622008459f, 0.0f, // top
            -0.5f, -0.311004243f, 0.0f, // bottom left
            0.5f, -0.311004243f, 0.0f  // bottom right
    };

    //Set color with red, green, blue and alpha(opacity) values
    float color[] = { 0.63671875f, 0.76953125f, 0.22265625f, 1.0f };

    private final int mProgram;

    public Triangle() {
        //initialize vertex byte buffer for shape coordinates
        ByteBuffer bb = ByteBuffer.allocateDirect(
                //(number of coordinate values * 4 bytes per float)
                triangleCoords.length * 4);
        //use the device hardware's native byte order
        bb.asFloatBuffer();

        //create a floating point on buffer from the bytebuffer
        vertexBuffer = bb.asFloatBuffer();
        //add coordinates to the floatbuffer
        vertexBuffer.put(triangleCoords);
        //set the buffer to read the first coordinate
        vertexBuffer.position(0);

        int vertexShader = MyGLRenderer.loadShader(GLES20.GL_VERTEX_SHADER, vertexShaderCode);
        int fragmentShader = MyGLRenderer.loadShader(GLES20.GL_FRAGMENT_SHADER, fragmentShaderCode);

        // create empty OpenGL ES Program
        mProgram = GLES20.glCreateProgram();

        // add the vertex shader to program
        GLES20.glAttachShader(mProgram, vertexShader);

        // add the fragment shader to program
        GLES20.glAttachShader(mProgram, fragmentShader);

        // creates OpenGL ES program executables
        GLES20.glLinkProgram(mProgram);
    }

    private final String vertexShaderCode =
            "attribute vec4 vPosition;" +
                    "void main() {" +
                    "  gl_Position = vColor;" +
                    "}";

    private final String fragmentShaderCode =
            "precision mediump float;" +
                    "uniform vec4 vcolor;" +
                    "void main() {" +
                    "  gl_FragColor = vColor;" +
                    "}";


    private int mPositionHandle;
    private int mColorHandle;

    private final int vertexCount = triangleCoords.length / COORDS_PER_VERTEX;
    private final int vertexStride = COORDS_PER_VERTEX * 4; // 4 bytes per vertex


    public void draw() {
        //add program to OpenGL ES environment
        GLES20.glUseProgram(mProgram);

        //get handle to vertex shader's vposition member
        mPositionHandle = GLES20.glGetAttribLocation(mProgram, "vPosition");

        //Enable a hand to the triangle vertices
        GLES20.glEnableVertexAttribArray(mPositionHandle);

        //Prepare the triangle coordinate data
        GLES20.glVertexAttribPointer(mPositionHandle, COORDS_PER_VERTEX,
                GLES20.GL_FLOAT, false,
                vertexStride, vertexBuffer);

        //get handle to fragment shader's vColor member
        mColorHandle = GLES20.glGetUniformLocation(mProgram, "vColor");

        //set color for drawing the triangle
        GLES20.glUniform4fv(mColorHandle, 1, color, 0);

        //Draw the triangle
        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, vertexCount);

        //Disable vertex array
        GLES20.glDisableVertexAttribArray(mPositionHandle);

    }
}
